package io.quarkiverse.argocd.deployment;

import java.nio.charset.StandardCharsets;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Optional;

import org.jboss.logging.Logger;

import io.dekorate.utils.Git;
import io.fabric8.kubernetes.api.model.HasMetadata;
import io.quarkiverse.argocd.deployment.utils.Serialization;
import io.quarkiverse.argocd.spi.ArgoCDOutputDirBuildItem;
import io.quarkiverse.argocd.spi.ArgoCDResourceListBuildItem;
import io.quarkiverse.argocd.v1alpha1.AppProject;
import io.quarkiverse.argocd.v1alpha1.AppProjectBuilder;
import io.quarkiverse.argocd.v1alpha1.Application;
import io.quarkiverse.argocd.v1alpha1.ApplicationBuilder;
import io.quarkiverse.argocd.v1alpha1.ArgoCDResourceList;
import io.quarkiverse.helm.spi.CustomHelmOutputDirBuildItem;
import io.quarkus.deployment.IsTest;
import io.quarkus.deployment.annotations.BuildProducer;
import io.quarkus.deployment.annotations.BuildStep;
import io.quarkus.deployment.builditem.ApplicationInfoBuildItem;
import io.quarkus.deployment.builditem.FeatureBuildItem;
import io.quarkus.deployment.builditem.GeneratedFileSystemResourceBuildItem;
import io.quarkus.deployment.pkg.builditem.OutputTargetBuildItem;

class ArgoCDProcessor {

    private static final String FEATURE = "argocd";
    private static final String DOT_GIT = ".git";
    private static final Logger log = Logger.getLogger(ArgoCDProcessor.class);

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
        getScmRoot(outputTarget).ifPresentOrElse(
                p -> outputDirProducer.produce(new ArgoCDOutputDirBuildItem.Effective(p.resolve(".argocd"))),
                () -> outputDirProducer
                        .produce(new ArgoCDOutputDirBuildItem.Effective(outputTarget.getOutputDirectory().resolve("argocd"))));
    }

    @BuildStep
    public void build(ArgoCDConfiguration config,
            ApplicationInfoBuildItem applicationInfo,
            List<FeatureBuildItem> features,
            ScmInfoBuildItem scmInfo,
            Optional<CustomHelmOutputDirBuildItem> customHelmOutputDir,
            BuildProducer<ArgoCDResourceListBuildItem> resourceListProducer) {

        if (scmInfo == null) {
            log.warn("No SCM information found. Skipping argocd deployment generation.");
            return;
        }

        String namespace = config.namespace.or(() -> config.project).orElse(null);
        String applicationNamespace = config.applicationNamespace.or(() -> config.namespace).orElse(null);

        Path helmOutputDir = customHelmOutputDir.map(CustomHelmOutputDirBuildItem::getOutputDir).orElse(Paths.get(".helm"));

        // @formatter:off
        AppProject project = new AppProjectBuilder()
          .withNewMetadata()
            .withName(applicationInfo.getName())
            .withNamespace(namespace)
          .endMetadata()
          .withNewSpec()
            .addNewDestination()
              .withNamespace(applicationNamespace)
              .withServer(config.server)
            .endDestination()
          .withSourceRepos(scmInfo.getDefaultRemoteUrl())
          .endSpec()
          .build();
        // @formatter:on

        // @formatter:off
        Application deploy = new ApplicationBuilder()
                .withNewMetadata()
                  .withName(applicationInfo.getName())
                  .withNamespace(namespace)
                .endMetadata()
                .withNewSpec()
                  .withProject(config.project.orElse(applicationInfo.getName()))
                  .withNewDestination()
                    .withServer(config.server)
                    .withNamespace(applicationNamespace)
                  .endDestination()
                  .withNewSource()
                    .withPath(helmOutputDir.resolve("kubernetes").resolve(applicationInfo.getName()).toString()) //TODO: Get target deployment target.
                    .withRepoURL(scmInfo.getDefaultRemoteUrl())
                    .withTargetRevision(config.targetRevision)
                    .withNewHelm()
                      .withValueFiles("values.yaml")
                     .endApplicationspecHelm()
                    .endApplicationspecSource()
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
                      .endSyncpolicyBackoff()
                   .endSyncpolicyRetry()
                  .endSyncPolicy()
                .endSpec()
                .build();
        // @formatter:on

        ArgoCDResourceList<HasMetadata> resourceList = new ArgoCDResourceList<>();
        resourceList.setItems(List.of(project, deploy));
        resourceListProducer.produce(new ArgoCDResourceListBuildItem(resourceList));
    }

    @BuildStep(onlyIfNot = IsTest.class)
    public void generateApplicationFileSystemResources(ArgoCDResourceListBuildItem resourceList,
            OutputTargetBuildItem outputTarget,
            Optional<ArgoCDOutputDirBuildItem.Effective> outputDir,
            BuildProducer<GeneratedFileSystemResourceBuildItem> generatedResourceProducer) {

        if (resourceList == null || resourceList.getResourceList() == null) {
            return;
        }

        outputDir.ifPresent(dir -> {
            Path argocdRoot = dir.getOutputDir();

            for (HasMetadata item : resourceList.getResourceList().getItems()) {
                String kind = item.getKind().toLowerCase();
                String name = item.getMetadata().getName();
                Path path = argocdRoot.resolve(kind + "-" + name + ".yaml");
                var str = Serialization.asYaml(item);
                generatedResourceProducer.produce(new GeneratedFileSystemResourceBuildItem(path.toAbsolutePath().toString(),
                        str.getBytes(StandardCharsets.UTF_8)));
            }
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
