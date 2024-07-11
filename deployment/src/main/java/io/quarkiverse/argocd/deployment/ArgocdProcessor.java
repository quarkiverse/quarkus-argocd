package io.quarkiverse.argocd.deployment;

import java.nio.charset.StandardCharsets;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.yaml.YAMLFactory;
import com.fasterxml.jackson.dataformat.yaml.YAMLGenerator;
import com.fasterxml.jackson.dataformat.yaml.YAMLMapper;
import com.fasterxml.jackson.datatype.jdk8.Jdk8Module;

import io.dekorate.utils.Git;
import io.quarkiverse.argocd.v1alpha1.Application;
import io.quarkiverse.argocd.v1alpha1.ApplicationBuilder;
import io.quarkus.deployment.Feature;
import io.quarkus.deployment.IsTest;
import io.quarkus.deployment.annotations.BuildProducer;
import io.quarkus.deployment.annotations.BuildStep;
import io.quarkus.deployment.builditem.ApplicationInfoBuildItem;
import io.quarkus.deployment.builditem.FeatureBuildItem;
import io.quarkus.deployment.builditem.GeneratedFileSystemResourceBuildItem;
import io.quarkus.deployment.pkg.builditem.OutputTargetBuildItem;
import io.quarkus.logging.Log;

class ArgocdProcessor {

    private static final String FEATURE = "argocd";
    private static final String DOT_GIT = ".git";

    private static YAMLFactory YAML_FACTORY = new YAMLFactory().disable(YAMLGenerator.Feature.WRITE_DOC_START_MARKER)
            .enable(YAMLGenerator.Feature.MINIMIZE_QUOTES);
    private static final ObjectMapper YAML_MAPPER = new YAMLMapper(YAML_FACTORY).registerModule(new Jdk8Module())
            .setSerializationInclusion(Include.NON_EMPTY);
    private static final JavaType APPLICATION_LIST = YAML_MAPPER.getTypeFactory().constructCollectionType(List.class,
            Application.class);

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
            BuildProducer<GeneratedFileSystemResourceBuildItem> generatedResourceProducer) {

        if (scmInfo == null) {
            Log.warn("No SCM information found. Skipping ArgoCD deployment generation.");
            return;
        }

        Path argoCdRoot = scmInfo.getRoot().resolve(".argocd");
        Path applicationDeployPath = argoCdRoot.resolve(applicationInfo.getName() + "-deploy.yaml");

        List<Application> applicationList = new ArrayList<>();

        Application deploy = new ApplicationBuilder()
                .withNewMetadata()
                .withName(applicationInfo.getName() + "-deploy")
                .withNamespace("default")
                .endMetadata()
                .withNewSpec()
                .withProject("default")
                .withNewDestination()
                .withServer("https://kubernetes.default.svc")
                .withNamespace("default")
                .endDestination()
                .withNewSource()
                .withPath(".helm") //TODO: get that from the build items
                .withRepoURL(scmInfo.getDefaultRemoteUrl())
                .withTargetRevision("HEAD") //We prefer head as it doesn't change on each commit as is the case with sha.
                .withNewHelm()
                .withValueFiles(".helm/kubernetes/" + applicationInfo.getName() + "/values.yaml") //TODO: Get target deployment target.
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

        applicationList.add(deploy);

        try {
            var str = YAML_MAPPER.writeValueAsString(applicationList);
            generatedResourceProducer.produce(
                    new GeneratedFileSystemResourceBuildItem(applicationDeployPath.toAbsolutePath().toString(),
                            str.getBytes(StandardCharsets.UTF_8)));
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
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
