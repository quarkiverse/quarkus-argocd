package io.quarkiverse.argocd.deployment;

import java.nio.charset.StandardCharsets;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import io.dekorate.utils.Git;
import io.quarkiverse.argocd.deployment.utils.Serialization;
import io.quarkiverse.argocd.spi.CustomArgoCDOutputDirBuildItem;
import io.quarkiverse.argocd.v1alpha1.Application;
import io.quarkiverse.argocd.v1alpha1.ApplicationBuilder;
import io.quarkiverse.argocd.v1alpha1.ApplicationList;
import io.quarkiverse.argocd.v1alpha1.ApplicationListBuilder;
import io.quarkus.deployment.IsTest;
import io.quarkus.deployment.annotations.BuildProducer;
import io.quarkus.deployment.annotations.BuildStep;
import io.quarkus.deployment.builditem.ApplicationInfoBuildItem;
import io.quarkus.deployment.builditem.FeatureBuildItem;
import io.quarkus.deployment.builditem.GeneratedFileSystemResourceBuildItem;
import io.quarkus.deployment.pkg.builditem.OutputTargetBuildItem;
import io.quarkus.logging.Log;

class ArgoCDProcessor {

    private static final String FEATURE = "argocd";
    private static final String DOT_GIT = ".git";

    @BuildStep
    FeatureBuildItem feature() {
        return new FeatureBuildItem(FEATURE);
    }

    @BuildStep(onlyIfNot = IsTest.class)
    public void populateScmInfo(OutputTargetBuildItem outputTarget,
            BuildProducer<ScmInfoBuildItem> scmInfoProducer) {
        Optional<Path> scmRoot = getScmRoot(outputTarget);
        Optional<ScmInfoBuildItem> scmInfo = scmRoot.flatMap(ScmInfoBuildItem::fromPath);
        scmInfo.filter(s -> !s.getRemote().isEmpty()).ifPresent(s -> scmInfoProducer.produce(s));
    }

    @BuildStep(onlyIfNot = IsTest.class)
    public void build(ApplicationInfoBuildItem applicationInfo,
            List<FeatureBuildItem> features,
            OutputTargetBuildItem outputTarget,
            ScmInfoBuildItem scmInfo,
            Optional<CustomArgoCDOutputDirBuildItem> customOutputDir,
            BuildProducer<GeneratedFileSystemResourceBuildItem> generatedResourceProducer) {

        if (scmInfo == null) {
            Log.warn("No SCM information found. Skipping argocd deployment generation.");
            return;
        }

        Path argocdRoot = customOutputDir.map(CustomArgoCDOutputDirBuildItem::getOutputDir)
                .orElse(outputTarget.getOutputDirectory().resolve("argocd"));
        Path applicationDeployPath = argocdRoot.resolve(applicationInfo.getName() + "-deploy.yaml");

        List<Application> generatedApplications = new ArrayList<>();

        Application deploy = new ApplicationBuilder()
                .withNewMetadata()
                .withName(applicationInfo.getName() + "-deploy")
                .withNamespace("iocanel")
                .endMetadata()
                .withNewSpec()
                .withProject("default")
                .withNewDestination()
                .withServer("https://kubernetes.default.svc")
                .withNamespace("iocanel")
                .endDestination()
                .withNewSource()
                .withPath(".helm/kubernetes/" + applicationInfo.getName()) //TODO: Get target deployment target.
                .withRepoURL(scmInfo.getDefaultRemoteUrl())
                .withTargetRevision("HEAD") //We prefer head as it doesn't change on each commit as is the case with sha.
                .withNewHelm()
                .withValueFiles("values.yaml") //TODO: Get target deployment target.
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

        generatedApplications.add(deploy);

        ApplicationList applicationList = new ApplicationListBuilder()
                .withItems(generatedApplications)
                .build();

        var str = Serialization.asYaml(applicationList);
        generatedResourceProducer.produce(
                new GeneratedFileSystemResourceBuildItem(applicationDeployPath.toAbsolutePath().toString(),
                        str.getBytes(StandardCharsets.UTF_8)));
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
