package io.quarkiverse.argocd.cli.project;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import io.fabric8.kubernetes.client.KubernetesClient;
import io.fabric8.kubernetes.client.KubernetesClientBuilder;
import io.quarkiverse.argocd.v1alpha1.AppProject;
import io.quarkiverse.argocd.v1alpha1.Application;
import io.quarkiverse.argocd.v1alpha1.ArgoCDResourceList;
import picocli.CommandLine.Command;

@Command(name = "uninstall", sortOptions = false, mixinStandardHelpOptions = false, header = "Uninstall ArgoCD Application.", headerHeading = "%n", commandListHeading = "%nCommands:%n", synopsisHeading = "%nUsage: ", optionListHeading = "%nOptions:%n")
public class UninstallCommand extends GenerationBaseCommand {

    Optional<String> generationPath = Optional.of(".argocd");

    @Override
    void process(ArgoCDResourceList<?> resourceList) {
        if (resourceList.getItems().isEmpty()) {
            System.out.println("No ArgoCD Application detected.");
            return;
        }

        List<ProjectListItem> projectItems = new ArrayList<>();
        KubernetesClient kubernetesClient = new KubernetesClientBuilder().build();

        for (AppProject project : resourceList.getAppProjectList().getItems()) {
            String projectName = project.getMetadata().getName();
            List<ApplicationListItem> applicationItems = new ArrayList<>();

            for (Application application : resourceList.getApplicationList().getItems()) {
                if (!projectName.equals(application.getSpec().getProject())) {
                    continue;
                }
                kubernetesClient.resources(Application.class)
                        .inNamespace(application.getMetadata().getNamespace())
                        .withName(application.getMetadata().getName())
                        .delete();

                applicationItems.add(ApplicationListItem.from(application));
            }

            kubernetesClient.resources(AppProject.class)
                    .inNamespace(project.getMetadata().getNamespace())
                    .withName(project.getMetadata().getName())
                    .delete();

            projectItems.add(new ProjectListItem(projectName, applicationItems));
        }

        System.out.println("Uninstalled ArgoCD applications:");
        ProjectListTable table = new ProjectListTable(projectItems);
        System.out.println(table.getContent());
    }
}
