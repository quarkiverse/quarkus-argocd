package io.quarkiverse.argocd.cli.application;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import io.fabric8.kubernetes.client.KubernetesClient;
import io.fabric8.kubernetes.client.KubernetesClientBuilder;
import io.quarkiverse.argocd.cli.utils.Git;
import io.quarkiverse.argocd.v1alpha1.Application;
import io.quarkiverse.argocd.v1alpha1.ArgoCDResourceList;
import io.quarkus.devtools.utils.Prompt;
import picocli.CommandLine.Command;

@Command(name = "install", sortOptions = false, mixinStandardHelpOptions = false, header = "Install ArgoCD Application.", headerHeading = "%n", commandListHeading = "%nCommands:%n", synopsisHeading = "%nUsage: ", optionListHeading = "%nOptions:%n")
public class InstallCommand extends GenerationBaseCommand {

    Optional<String> generationPath = Optional.of(".argocd");

    @Override
    void process(ArgoCDResourceList<?> resourceList) {
        ApplicationListTable table = new ApplicationListTable();
        List<ApplicationListItem> items = new ArrayList<>();

        for (Application application : resourceList.getApplicationList().getItems()) {
            String repoURL = application.getSpec().getSource().getRepoURL();
            if (!Git.checkIfRepoExists(repoURL) && !Prompt.yesOrNo(false,
                    "Remote repository: " + repoURL + " does not exist. Do you still want to proceed (y/N)?")) {
                return;
            }
            if (Git.hasUncommittedChanges() && !Prompt.yesOrNo(false,
                    "Remote git repository has uncommitted chagnes. Do you still want to proceed (y/N)?")) {
                return;
            }
            if (Git.hasUnpushedChanges(repoURL) && !Prompt.yesOrNo(false,
                    "Remote git repository has unpushed chagnes. Do you still want to proceed (y/N)?")) {
                return;
            }

            KubernetesClient kubernetesClient = new KubernetesClientBuilder().build();
            Application installed = kubernetesClient.resources(Application.class).resource(application)
                    .createOrReplace();
            items.add(ApplicationListItem.from(installed));
        }
        System.out.println("Installed ArgoCD applications:");
        System.out.println(table.getContent(items));
    }
}
