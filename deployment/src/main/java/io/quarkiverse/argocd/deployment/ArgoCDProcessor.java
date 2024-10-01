package io.quarkiverse.argocd.deployment;

import java.nio.charset.StandardCharsets;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Optional;

import org.jboss.logging.Logger;

import io.dekorate.utils.Git;
import io.quarkiverse.argocd.deployment.utils.Serialization;
import io.quarkiverse.argocd.spi.ArgoCDApplicationListBuildItem;
import io.quarkiverse.argocd.spi.ArgoCDOutputDirBuildItem;
import io.quarkiverse.argocd.v1alpha1.Application;
import io.quarkiverse.argocd.v1alpha1.ApplicationBuilder;
import io.quarkiverse.argocd.v1alpha1.ApplicationList;
import io.quarkiverse.argocd.v1alpha1.ApplicationListBuilder;
import io.quarkiverse.helm.spi.CustomHelmOutputDirBuildItem;
import io.quarkus.deployment.IsTest;
import io.quarkus.deployment.annotations.BuildProducer;
import io.quarkus.deployment.annotations.BuildStep;
import io.quarkus.deployment.builditem.ApplicationInfoBuildItem;
import io.quarkus.deployment.builditem.FeatureBuildItem;
import io.quarkus.deployment.builditem.GeneratedFileSystemResourceBuildItem;
import io.quarkus.deployment.pkg.builditem.OutputTargetBuildItem;
import io.quarkus.kubernetes.spi.KubernetesDeploymentTargetBuildItem;

class ArgoCDProcessor {

    private static final String FEATURE = "argocd";
    private static final String DOT_GIT = ".git";
    private static final Logger log = Logger.getLogger(ArgoCDProcessor.class);

    private static final String ARGOCD_NAMESPACE_KUBE = "argocd";
    private static final String ARGOCD_NAMESPACE_OPERNSHIFT = "openshift-gitops";

    @BuildStep
    FeatureBuildItem feature() {
        return new FeatureBuildItem(FEATURE);
    }

    @BuildStep
    public void populateScmInfo(OutputTargetBuildItem outputTarget,
            BuildProducer<ScmInfoBuildItem> scmInfoProducer) {
        Optional<Path> scmRoot = getScmRoot(outputTarget);
        Optional<ScmInfoBuildItem> scmInfo = scmRoot.flatMap(ScmInfoBuildItem::fromPath);
        scmInfo.filter(s -> !s.getRemote().isEmpty()).ifPresent(s -> scmInfoProducer.produce(s));
    }

    @BuildStep
    public void customOutputDir(OutputTargetBuildItem outputTarget,
            BuildProducer<ArgoCDOutputDirBuildItem.Effective> outputDirProducer) {
        getScmRoot(outputTarget)
                .ifPresent(p -> outputDirProducer.produce(new ArgoCDOutputDirBuildItem.Effective(p.resolve(".argocd"))));
    }

    @BuildStep
    public void build(ArgoCDConfiguration config,
            ApplicationInfoBuildItem applicationInfo,
            List<FeatureBuildItem> features,
            List<KubernetesDeploymentTargetBuildItem> deploymentTargets,
            ScmInfoBuildItem scmInfo,
            Optional<CustomHelmOutputDirBuildItem> customHelmOutputDir,
            BuildProducer<ArgoCDApplicationListBuildItem> applicationListProducer) {

        if (scmInfo == null) {
            log.warn("No SCM information found. Skipping argocd deployment generation.");
            return;
        }

        Optional<KubernetesDeploymentTargetBuildItem> deploymentTarget = deploymentTargets.stream().sorted().findFirst();
        boolean targetsOpenShift = deploymentTarget.filter(t -> t.getName().equals("openshift")).isPresent();

        String namespace = config.namespace.or(() -> config.project)
                .orElse(targetsOpenShift ? ARGOCD_NAMESPACE_OPERNSHIFT : ARGOCD_NAMESPACE_KUBE);
        Path helmOutputDir = customHelmOutputDir.map(CustomHelmOutputDirBuildItem::getOutputDir).orElse(Paths.get(".helm"));

        // @formatter:off
        Application deploy = new ApplicationBuilder()
                .withNewMetadata()
                  .withName(applicationInfo.getName() + "-deploy")
                  .withNamespace(namespace)
                .endMetadata()
                .withNewSpec()
                  .withProject(config.project.orElse("default"))
                  .withNewDestination()
                    .withServer(config.server)
                    .withNamespace(namespace)
                  .endDestination()
                  .withNewSource()
                    .withPath(helmOutputDir.resolve("kubernetes").resolve(applicationInfo.getName()).toString()) //TODO: Get target deployment target.
                    .withRepoURL(scmInfo.getDefaultRemoteUrl())
                    .withTargetRevision(config.targetRevision)
                    .withNewHelm()
                      .withValueFiles("values.yaml")
                    .endHelm()
                  .endSource()
                  .withNewSyncPolicy()
                    .withNewAutomated()
                      .withPrune(true)
                      .withSelfHeal(true)
                    .endAutomated()
                    .addToSyncOptions("CreateNamespace=true", "RespectIgnoreDifferences=true", "ApplyOutOfSyncOnly=true")
                    .withNewRetry()
                      .withNewBackoff()
                        .withDuration("5s")
                        .withFactor(2L)
                        .withMaxDuration("10m")
                      .endBackoff()
                    .endRetry()
                  .endSyncPolicy()
                .endSpec()
                .build();
        // @formatter:on
        ApplicationList applicationList = new ApplicationListBuilder()
                .withItems(List.of(deploy))
                .build();

        applicationListProducer.produce(new ArgoCDApplicationListBuildItem(applicationList));
    }

    @BuildStep(onlyIfNot = IsTest.class)
    public void generateApplicationFileSystemResources(ArgoCDApplicationListBuildItem applicationList,
            ApplicationInfoBuildItem applicationInfo,
            OutputTargetBuildItem outputTarget,
            Optional<ArgoCDOutputDirBuildItem.Effective> outputDir,
            BuildProducer<GeneratedFileSystemResourceBuildItem> generatedResourceProducer) {

        outputDir.ifPresent(dir -> {
            Path argocdRoot = dir.getOutputDir();
            Path applicationDeployPath = argocdRoot.resolve(applicationInfo.getName() + "-deploy.yaml");

            var str = Serialization.asYaml(applicationList);
            generatedResourceProducer.produce(
                    new GeneratedFileSystemResourceBuildItem(applicationDeployPath.toAbsolutePath().toString(),
                            str.getBytes(StandardCharsets.UTF_8)));
        });
    }

    /**
     * @return the SCM root directory of the project
     */
    private static Optional<Path> getScmRoot(OutputTargetBuildItem outputTarget) {
        Path dir = outputTarget.getOutputDirectory();
        while (dir != null && !dir.resolve(DOT_GIT).toFile().exists()) {
            dir = dir.getParent();
        }
        return Optional.ofNullable(dir).filter(p -> p.resolve(DOT_GIT).toFile().exists());
    }

    private static Optional<String> getScmUrl(Path path) {
        try {
            return Git.getSafeRemoteUrl(path, Git.ORIGIN);
        } catch (Exception e) {
            return Optional.empty();
        }
    }

    private static Optional<String> getScmBranch(Path path) {
        try {
            return Git.getBranch(path);
        } catch (Exception e) {
            return Optional.empty();
        }
    }
}
