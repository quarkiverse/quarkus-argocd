package io.quarkiverse.argocd.cli.project;

import java.util.List;

import io.fabric8.kubernetes.api.model.KubernetesResourceList;
import io.quarkiverse.argocd.v1alpha1.AppProject;
import io.quarkiverse.argocd.v1alpha1.Application;
import picocli.CommandLine.Command;
import picocli.CommandLine.ExitCode;
import picocli.CommandLine.Unmatched;

@Command(name = "list", sortOptions = false, mixinStandardHelpOptions = false, header = "ArgoCD Application List")
public class ListCommand extends ProjectBaseCommand {

    @Unmatched
    List<String> unmatched;

    @Override
    public Integer call() throws Exception {
        KubernetesResourceList<AppProject> projectList = kubernetesClient.resources(AppProject.class).list();
        KubernetesResourceList<Application> applicationList = kubernetesClient.resources(Application.class).list();

        List<ProjectListItem> projectListItems = projectList.getItems().stream()
                .map(project -> ProjectListItem.from(project, applicationList.getItems())).toList();

        ProjectListTable table = new ProjectListTable(projectListItems);
        System.out.println(table.getContent());

        return ExitCode.OK;
    }

}
