package io.quarkiverse.argocd.cli.application;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import io.fabric8.kubernetes.client.KubernetesClient;
import io.fabric8.kubernetes.client.KubernetesClientBuilder;
import io.quarkiverse.argocd.v1alpha1.Application;
import io.quarkiverse.argocd.v1alpha1.ApplicationList;
import picocli.CommandLine.Command;

@Command(name = "uninstall", sortOptions = false, mixinStandardHelpOptions = false, header = "Uninstall ArgoCD Application.", headerHeading = "%n", commandListHeading = "%nCommands:%n", synopsisHeading = "%nUsage: ", optionListHeading = "%nOptions:%n")
public class UninstallCommand extends GenerationBaseCommand {

    Optional<String> generationPath = Optional.of(".argocd");

    @Override
    void process(ApplicationList applicationList) {
        if (applicationList.getItems().isEmpty()) {
            System.out.println("No ArgoCD Application detected.");
            return;
        }

        ApplicationListTable table = new ApplicationListTable();
        List<ApplicationListItem> items = new ArrayList<>();
        KubernetesClient kubernetesClient = new KubernetesClientBuilder().build();

        for (Application application : applicationList.getItems()) {
            kubernetesClient.resources(Application.class)
                    .inNamespace(application.getMetadata().getNamespace())
                    .withName(application.getMetadata().getName())
                    .delete();
            items.add(ApplicationListItem.from(application));
        }
        System.out.println("Uninstalled ArgoCD applications:");
        System.out.println(table.getContent(items));
    }
}
