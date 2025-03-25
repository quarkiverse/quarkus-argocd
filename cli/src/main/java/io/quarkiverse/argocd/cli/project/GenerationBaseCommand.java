package io.quarkiverse.argocd.cli.project;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Properties;
import java.util.concurrent.Callable;
import java.util.function.Consumer;

import io.dekorate.utils.Strings;
import io.quarkiverse.argocd.cli.handlers.GetArgoCDApplicationHandler;
import io.quarkiverse.argocd.cli.utils.Git;
import io.quarkiverse.argocd.spi.ArgoCDResourceListBuildItem;
import io.quarkiverse.argocd.v1alpha1.ArgoCDResourceList;
import io.quarkus.bootstrap.BootstrapException;
import io.quarkus.bootstrap.app.AugmentAction;
import io.quarkus.bootstrap.app.CuratedApplication;
import io.quarkus.bootstrap.app.QuarkusBootstrap;
import io.quarkus.devtools.project.BuildTool;
import io.quarkus.devtools.project.QuarkusProjectHelper;
import io.quarkus.maven.dependency.ArtifactDependency;
import picocli.CommandLine.ExitCode;
import picocli.CommandLine.Option;

public abstract class GenerationBaseCommand extends ProjectBaseCommand implements Callable<Integer> {

    private static final ArtifactDependency QUARKUS_ARGOCD = new ArtifactDependency("io.quarkiverse.argocd", "quarkus-argocd",
            null, "jar", GenerationBaseCommand.getVersion());

    @Option(names = {
            "--server" }, description = "The Kubernetes API Server URL. Default value is: https://kubernetes.default.svc")
    Optional<String> kubernetesApiUrl = Optional.empty();

    @Option(names = {
            "--appproject-namespace" }, description = "The Argo CD control plane namespace where the AppProject Custom Resource will be installed. This namespace property is optional and is calculated according to the target platform: kubernetes or OpenShift")
    Optional<String> appProjectNamespace = Optional.empty();

    @Option(names = {
            "--application-namespace" }, description = "The namespace where the Application Custom Resource will be installed. This namespace property should be the same as the AppProject except if Argo CD is configured to support: applications in any namespace")
    Optional<String> applicationNamespace = Optional.empty();

    @Option(names = {
            "--destination-namespace" }, description = "The target/destination namespace where the resources of the runtime should be installed from the Helm chart, kustomize, etc.")
    Optional<String> destinationNamespace = Optional.empty();

    @Option(names = { "-p", "--project-name" }, description = "The project name")
    Optional<String> project = Optional.empty();

    public Properties getBuildSystemProperties() {
        Properties buildSystemProperties = new Properties();
        kubernetesApiUrl.ifPresent(v -> buildSystemProperties.put("quarkus.argocd.server", v));
        destinationNamespace.ifPresent(v -> buildSystemProperties.setProperty("quarkus.argocd.destination-namespace", v));
        appProjectNamespace.ifPresent(v -> buildSystemProperties.setProperty("quarkus.argocd.app-project.namespace", v));
        applicationNamespace.ifPresent(v -> buildSystemProperties.setProperty("quarkus.argocd.application.namespace", v));
        project.ifPresent(v -> buildSystemProperties.setProperty("quarkus.argocd.app-project.name", v));
        return buildSystemProperties;
    }

    public Integer call() {
        Path projectRoot = getWorkingDirectory();

        Optional<Path> scmRoot = Git.getScmRoot();
        if (scmRoot.isEmpty()) {
            System.out.println("Unable to determine the SCM root for the project at " + projectRoot + ". Aborting.");
            return ExitCode.USAGE;
        }

        Map<String, String> remotes = Git.getRemotes(scmRoot.get());
        if (remotes.isEmpty()) {
            System.out.println("Unable to determine the SCM remotes for the project at " + projectRoot + ". Aborting.");
            return ExitCode.USAGE;
        }

        BuildTool buildTool = QuarkusProjectHelper.detectExistingBuildTool(projectRoot);
        if (buildTool == null) {
            System.out.println("Unable to determine the build tool used for the project at " + projectRoot);
            return ExitCode.USAGE;
        }

        Path targetDirectory = projectRoot.resolve(buildTool.getBuildDirectory());
        QuarkusBootstrap quarkusBootstrap = QuarkusBootstrap.builder()
                .setMode(QuarkusBootstrap.Mode.PROD)
                .setBuildSystemProperties(getBuildSystemProperties())
                .setApplicationRoot(getWorkingDirectory())
                .setProjectRoot(getWorkingDirectory())
                .setTargetDirectory(targetDirectory)
                .setIsolateDeployment(false)
                .setRebuild(true)
                .setLocalProjectDiscovery(true)
                .setBaseClassLoader(ClassLoader.getSystemClassLoader())
                .setForcedDependencies(List.of(QUARKUS_ARGOCD))
                .setDependencyInfoProvider(null)
                .build();

        List<String> resultBuildItemFQCNs = new ArrayList<>();
        resultBuildItemFQCNs.add(ArgoCDResourceListBuildItem.class.getName());

        // Checking
        try (CuratedApplication curatedApplication = quarkusBootstrap.bootstrap()) {
            AugmentAction action = curatedApplication.createAugmentor();

            action.performCustomBuild(GetArgoCDApplicationHandler.class.getName(), new Consumer<ArgoCDResourceList<?>>() {
                @Override
                public void accept(ArgoCDResourceList<?> resourceList) {
                    if (resourceList.getItems().isEmpty()) {
                        System.out.println("Can't generate ArgoCD custom resources.");
                        return;
                    }

                    process(resourceList);

                }
            }, resultBuildItemFQCNs.toArray(new String[resultBuildItemFQCNs.size()]));

        } catch (BootstrapException e) {
            throw new RuntimeException(e);
        }
        return ExitCode.OK;
    }

    abstract void process(ArgoCDResourceList<?> resourceList);

    protected void writeStringSafe(Path p, String content) {
        try {
            Files.writeString(p, content);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    protected Path getWorkingDirectory() {
        return Paths.get(System.getProperty("user.dir"));
    }

    private static String getVersion() {
        return Strings.read(GenerationBaseCommand.class.getClassLoader().getResourceAsStream("version"));
    }
}
