package io.quarkiverse.argocd.cli.application;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;

import io.quarkiverse.argocd.cli.handlers.GetArgoCDApplicationHandler;
import io.quarkiverse.argocd.deployment.utils.Serialization;
import io.quarkiverse.argocd.spi.ArgoCDApplicationListBuildItem;
import io.quarkiverse.argocd.v1alpha1.Application;
import io.quarkiverse.argocd.v1alpha1.ApplicationList;
import io.quarkus.bootstrap.BootstrapException;
import io.quarkus.bootstrap.app.AugmentAction;
import io.quarkus.bootstrap.app.CuratedApplication;
import io.quarkus.bootstrap.app.QuarkusBootstrap;
import io.quarkus.devtools.project.BuildTool;
import io.quarkus.devtools.project.QuarkusProjectHelper;
import picocli.CommandLine.Command;
import picocli.CommandLine.ExitCode;
import picocli.CommandLine.Parameters;

@Command(name = "generate", sortOptions = false, mixinStandardHelpOptions = false, header = "Generate ArgoCD Application.", headerHeading = "%n", commandListHeading = "%nCommands:%n", synopsisHeading = "%nUsage: ", optionListHeading = "%nOptions:%n")
public class GenerateCommand extends GenerationBaseCommand {

    @Parameters(arity = "0..1", paramLabel = "GENERATION_PATH", description = " The path to generate the ArgoCD Application")
    Optional<String> generationPath = Optional.of(".argocd");

    public Integer call() {
        Path projectRoot = getWorkingDirectory();
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
                        System.out.println("No ArgoCD Application generated.");
                        return;
                    }
                    Path outputDir = generationPath.map(Paths::get).orElse(Paths.get(".argocd"));
                    if (outputDir.toFile().exists() && !outputDir.toFile().isDirectory()) {
                        System.err.println("Output directory is not a directory: " + outputDir);
                        return;
                    }
                    if (!outputDir.toFile().exists() && !outputDir.toFile().mkdirs()) {
                        System.err.println("Failed to create output directory: " + outputDir);
                        return;
                    }

                    System.out.println("ArgoCD Applications generated:");
                    for (Application application : applicationList.getItems()) {
                        String content = Serialization.asYaml(application);
                        Path p = outputDir.resolve(application.getMetadata().getName() + ".yaml");
                        writeStringSafe(p, content);
                        System.out.println(application.getMetadata().getName());
                    }
                }
            }, resultBuildItemFQCNs.toArray(new String[resultBuildItemFQCNs.size()]));

        } catch (BootstrapException e) {
            throw new RuntimeException(e);
        }
        return ExitCode.OK;
    }

    @Override
    public void process(ApplicationList applicationList) {
        Path outputDir = generationPath.map(Paths::get).orElse(Paths.get(".argocd"));
        if (outputDir.toFile().exists() && !outputDir.toFile().isDirectory()) {
            System.err.println("Output directory is not a directory: " + outputDir);
            return;
        }
        if (!outputDir.toFile().exists() && !outputDir.toFile().mkdirs()) {
            System.err.println("Failed to create output directory: " + outputDir);
            return;
        }

        System.out.println("ArgoCD Applications generated:");
        for (Application application : applicationList.getItems()) {
            String content = Serialization.asYaml(application);
            Path p = outputDir.resolve(application.getMetadata().getName() + ".yaml");
            writeStringSafe(p, content);
            System.out.println(application.getMetadata().getName());
        }

    }

}
