package io.quarkiverse.argocd.deployment;

import java.nio.charset.StandardCharsets;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

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
import io.quarkus.kubernetes.deployment.DeploymentTargetEntry;
import io.quarkus.kubernetes.deployment.EnabledKubernetesDeploymentTargetsBuildItem;

public class ArgoCDProcessor {

    public static final String FEATURE = "argocd";
    private static final String DOT_GIT = ".git";
    private static final Logger log = Logger.getLogger(ArgoCDProcessor.class);

    private static final String ARGOCD_CONTROL_PLANE_NAMESPACE_KUBE = "argocd";
    private static final String ARGOCD_CONTROL_PLANE_NAMESPACE_OPENSHIFT = "openshift-gitops";

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
            EnabledKubernetesDeploymentTargetsBuildItem enabledDeploymentTargets,
            ScmInfoBuildItem scmInfo,
            Optional<CustomHelmOutputDirBuildItem> customHelmOutputDir,
            BuildProducer<ArgoCDResourceListBuildItem> resourceListProducer) {

        if (scmInfo == null) {
            log.warn("No SCM information found. Skipping argocd deployment generation.");
            return;
        }

        /**
         *
         * The EnabledKubernetesDeploymentTargetsBuildItem returns a list of DeploymentTargetEntry objects which have been
         * created/produced. they include the target platform: kubernetes, openshift, etc.
         * We will then control here which one has been enabled in order to set properly the argocd control plane namespace
         * For openshift, this is openshift-gitops and for kubernetes installation: argocd
         *
         */
        List<DeploymentTargetEntry> entries = enabledDeploymentTargets.getEntriesSortedByPriority();
        entries.stream().forEach(e -> log.debugf("Deployment target name: %s, strategy: %s", e.getName(),
                e.getPriority(), e.getDeployStrategy().name()));

        List<DeploymentTargetEntry> openshiftDeploymentTargets = entries.stream().filter(d -> d.getName().equals("openshift"))
                .collect(Collectors.toList());
        boolean targetsOpenShift = false;
        if (!openshiftDeploymentTargets.isEmpty()) {
            targetsOpenShift = true;
        }

        /**
         * Until now Argocd 2.x can only process an AppProject CR created under its control plane's namespace
         * and by consequence it cannot be created under the namespace of the user or namespace where the Application CR will be
         * deployed !
         */
        String controlPlaneNamespace = targetsOpenShift ? ARGOCD_CONTROL_PLANE_NAMESPACE_OPENSHIFT
                : ARGOCD_CONTROL_PLANE_NAMESPACE_KUBE;

        /**
         * The Application CR namespace is by default the same as the Argocd control plane namespace. See the property:
         * controlPlaneNamespace
         * If the user configure Argocd to support "Applications in any Namespace", then it can be overridden.
         */
        String applicationCustomResourceNamespace = config.application().namespace().orElse(controlPlaneNamespace);

        Path helmOutputDir = customHelmOutputDir.map(CustomHelmOutputDirBuildItem::getOutputDir).orElse(Paths.get(".helm"));

        AppProject appProject = null;
        // If the user specifies as AppProject name "default", then we don't generate the CR as it already exists on the cluster
        if (Optional.ofNullable(config.appProject())
                .flatMap(ArgoCDConfiguration.AppProject::name)
                .filter(name -> name.equals("default"))
                .isPresent()) {
            log.warn("The AppProject CR is not generated as the user selected to use the default !");
        } else {
            AppProjectBuilder builder = new AppProjectBuilder();
            // @formatter:off
            builder.withNewMetadata()
                .withName(config.appProject().name().orElse(applicationInfo.getName()))
                .withNamespace(controlPlaneNamespace)
              .endMetadata()
              .withNewSpec()
                .addNewDestination()
                  .withNamespace(config.destinationNamespace().orElse(null))
                  .withServer(config.server())
                .endDestination()
                .withSourceRepos(scmInfo.getDefaultRemoteUrl())
              .endSpec();

            if (config.application().namespace().isPresent()) {
                builder.editOrNewSpec()
                    .withSourceNamespaces(config.application().namespace().get())
                    .endSpec();
            }
            // @formatter:on
            appProject = builder.build();
        }

        // @formatter:off
        Application deploy = new ApplicationBuilder()
                .withNewMetadata()
                  .withName(applicationInfo.getName())
                  .withNamespace(applicationCustomResourceNamespace)
                .endMetadata()
                .withNewSpec()
                  .withProject(config.appProject().name().orElse(applicationInfo.getName()))
                  .withNewDestination()
                    .withServer(config.server())
                    .withNamespace(config.destinationNamespace().orElse(null))
                  .endDestination()
                  .withNewSource()
                    .withPath(helmOutputDir.resolve("kubernetes").resolve(applicationInfo.getName()).toString()) //TODO: Get target deployment target.
                    .withRepoURL(scmInfo.getDefaultRemoteUrl())
                    .withTargetRevision(config.targetRevision())
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
        if (appProject != null) {
            resourceList.setItems(List.of(appProject, deploy));
        } else {
            resourceList.setItems(List.of(deploy));
        }
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
