package io.quarkiverse.argocd.cli.application;

import java.util.List;

import io.fabric8.kubernetes.api.model.KubernetesResourceList;
import io.quarkiverse.argocd.v1alpha1.Application;
import picocli.CommandLine.Command;
import picocli.CommandLine.ExitCode;
import picocli.CommandLine.Unmatched;

@Command(name = "list", sortOptions = false, mixinStandardHelpOptions = false, header = "ArgoCD Application List")
public class ListCommand extends ApplicationBaseCommand {

    @Unmatched
    List<String> unmatched;

    @Override
    public Integer call() throws Exception {
        KubernetesResourceList<Application> applicationList = kubernetesClient.resources(Application.class).list();

        List<ApplicationListItem> applicationListItems = applicationList.getItems().stream().map(ApplicationListItem::from)
                .toList();
        ApplicationListTable table = new ApplicationListTable(applicationListItems);
        System.out.println(table.getContent());

        return ExitCode.OK;
    }
}
