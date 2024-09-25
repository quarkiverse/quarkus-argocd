package io.quarkiverse.argocd.cli.application;

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

import io.quarkiverse.argocd.cli.handlers.GetArgoCDApplicationHandler;
import io.quarkiverse.argocd.cli.utils.Git;
import io.quarkiverse.argocd.spi.ArgoCDApplicationListBuildItem;
import io.quarkiverse.argocd.v1alpha1.ApplicationList;
import io.quarkus.bootstrap.BootstrapException;
import io.quarkus.bootstrap.app.AugmentAction;
import io.quarkus.bootstrap.app.CuratedApplication;
import io.quarkus.bootstrap.app.QuarkusBootstrap;
import io.quarkus.devtools.project.BuildTool;
import io.quarkus.devtools.project.QuarkusProjectHelper;
import picocli.CommandLine.ExitCode;
import picocli.CommandLine.Option;

public abstract class GenerationBaseCommand extends ApplicationBaseCommand implements Callable<Integer> {

    @Option(names = { "-n", "--namespace" }, description = "The target namespace")
    Optional<String> namespace = Optional.empty();

    @Option(names = { "-p", "--project" }, description = "The target project")
    Optional<String> project = Optional.empty();

    public Properties getBuildSystemProperties() {
        Properties buildSystemProperties = new Properties();
        namespace.ifPresent(v -> buildSystemProperties.setProperty("quarkus.argocd.namespace", v));
        project.ifPresent(v -> buildSystemProperties.setProperty("quarkus.argocd.project", v));
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

        Path targetDirecotry = projectRoot.resolve(buildTool.getBuildDirectory());
        QuarkusBootstrap quarkusBootstrap = QuarkusBootstrap.builder()
                .setMode(QuarkusBootstrap.Mode.PROD)
                .setBuildSystemProperties(getBuildSystemProperties())
                .setApplicationRoot(getWorkingDirectory())
                .setProjectRoot(getWorkingDirectory())
                .setTargetDirectory(targetDirecotry)
                .setLocalProjectDiscovery(true)
                .setIsolateDeployment(false)
                .setBaseClassLoader(ClassLoader.getSystemClassLoader())
                .build();

        List<String> resultBuildItemFQCNs = new ArrayList<>();
        resultBuildItemFQCNs.add(ArgoCDApplicationListBuildItem.class.getName());

        // Checking
        try (CuratedApplication curatedApplication = quarkusBootstrap.bootstrap()) {
            AugmentAction action = curatedApplication.createAugmentor();

            action.performCustomBuild(GetArgoCDApplicationHandler.class.getName(), new Consumer<ApplicationList>() {
                @Override
                public void accept(ApplicationList applicationList) {
                    if (applicationList.getItems().isEmpty()) {
                        System.out.println("Can't generate ArgoCD custom resources.");
                        return;
                    }

                    process(applicationList);

                }
            }, resultBuildItemFQCNs.toArray(new String[resultBuildItemFQCNs.size()]));

        } catch (BootstrapException e) {
            throw new RuntimeException(e);
        }
        return ExitCode.OK;
    }

    abstract void process(ApplicationList applicationList);

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
}
