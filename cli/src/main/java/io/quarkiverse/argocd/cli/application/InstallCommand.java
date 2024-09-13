package io.quarkiverse.argocd.cli.application;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.Callable;
import java.util.function.Consumer;

import io.fabric8.kubernetes.client.KubernetesClient;
import io.fabric8.kubernetes.client.KubernetesClientBuilder;
import io.quarkiverse.argocd.cli.handlers.GetArgoCDApplicationHandler;
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

@Command(name = "install", sortOptions = false, mixinStandardHelpOptions = false, header = "Install ArgoCD Application.", headerHeading = "%n", commandListHeading = "%nCommands:%n", synopsisHeading = "%nUsage: ", optionListHeading = "%nOptions:%n")
public class InstallCommand implements Callable<Integer> {

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

                    ApplicationListTable table = new ApplicationListTable();
                    List<ApplicationListItem> items = new ArrayList<>();
                    KubernetesClient kubernetesClient = new KubernetesClientBuilder().build();

                    for (Application application : applicationList.getItems()) {
                        Application installed = kubernetesClient.resources(Application.class).resource(application)
                                .createOrReplace();
                        items.add(ApplicationListItem.from(installed));
                    }
                    System.out.println("Installed ArgoCD applications:");
                    System.out.println(table.getContent(items));
                }
            }, resultBuildItemFQCNs.toArray(new String[resultBuildItemFQCNs.size()]));

        } catch (BootstrapException e) {
            throw new RuntimeException(e);
        }
        return ExitCode.OK;
    }

    private void writeStringSafe(Path p, String content) {
        try {
            Files.writeString(p, content);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private Path getWorkingDirectory() {
        return Paths.get(System.getProperty("user.dir"));
    }
}
