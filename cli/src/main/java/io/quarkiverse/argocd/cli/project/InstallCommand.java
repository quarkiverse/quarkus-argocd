package io.quarkiverse.argocd.cli.project;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import io.fabric8.kubernetes.client.KubernetesClient;
import io.fabric8.kubernetes.client.KubernetesClientBuilder;
import io.quarkiverse.argocd.cli.utils.Git;
import io.quarkiverse.argocd.v1alpha1.AppProject;
import io.quarkiverse.argocd.v1alpha1.Application;
import io.quarkiverse.argocd.v1alpha1.ArgoCDResourceList;
import io.quarkus.devtools.utils.Prompt;
import picocli.CommandLine.Command;

@Command(name = "install", sortOptions = false, mixinStandardHelpOptions = false, header = "Install ArgoCD Application.", headerHeading = "%n", commandListHeading = "%nCommands:%n", synopsisHeading = "%nUsage: ", optionListHeading = "%nOptions:%n")
public class InstallCommand extends GenerationBaseCommand {

    Optional<String> generationPath = Optional.of(".argocd");

    @Override
    void process(ArgoCDResourceList<?> resourceList) {
        List<ProjectListItem> projectItems = new ArrayList<>();
        List<ApplicationListItem> applicationItems = new ArrayList<>();

        //First pass check that all repositories are valid
        for (AppProject project : resourceList.getAppProjectList().getItems()) {
            for (String repoURL : project.getSpec().getSourceRepos()) {
                if (shouldAbort(repoURL)) {
                    return;
                }
            }
        }

        for (Application application : resourceList.getApplicationList().getItems()) {
            String repoURL = application.getSpec().getSource().getRepoURL();
            if (shouldAbort(repoURL)) {
                return;
            }
        }

        KubernetesClient kubernetesClient = new KubernetesClientBuilder().build();
        for (AppProject project : resourceList.getAppProjectList().getItems()) {
            String projectName = project.getMetadata().getName();
            AppProject installedProject = kubernetesClient.resources(AppProject.class).resource(project).createOrReplace();

            for (Application application : resourceList.getApplicationList().getItems()) {
                if (!projectName.equals(application.getSpec().getProject())) {
                    continue;
                }
                Application installedApplication = kubernetesClient.resources(Application.class).resource(application)
                        .createOrReplace();
                applicationItems.add(ApplicationListItem.from(installedApplication));
            }
            projectItems.add(new ProjectListItem(projectName, applicationItems));
        }

        System.out.println("Installed ArgoCD projects:");
        ProjectListTable table = new ProjectListTable(projectItems);
        System.out.println(table.getContent());
    }

    private static boolean shouldAbort(String repoURL) {
        if (!Git.checkIfRepoExists(repoURL) && !Prompt.yesOrNo(false,
                "Remote repository: " + repoURL + " does not exist. Do you still want to proceed (y/N)?")) {
            return true;
        }
        if (Git.hasUncommittedChanges() && !Prompt.yesOrNo(false,
                "Remote git repository has uncommitted changes. Do you still want to proceed (y/N)?")) {
            return true;
        }
        if (Git.hasUnpushedChanges(repoURL)
                && !Prompt.yesOrNo(false, "Remote git repository has unpushed changes. Do you still want to proceed (y/N)?")) {
            return true;
        }
        return false;
    }
}
