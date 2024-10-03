package io.quarkiverse.argocd.cli.project;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import io.quarkiverse.argocd.deployment.utils.Serialization;
import io.quarkiverse.argocd.v1alpha1.AppProject;
import io.quarkiverse.argocd.v1alpha1.Application;
import io.quarkiverse.argocd.v1alpha1.ArgoCDResourceList;
import picocli.CommandLine.Command;
import picocli.CommandLine.Parameters;

@Command(name = "generate", sortOptions = false, mixinStandardHelpOptions = false, header = "Generate ArgoCD Application.", headerHeading = "%n", commandListHeading = "%nCommands:%n", synopsisHeading = "%nUsage: ", optionListHeading = "%nOptions:%n")
public class GenerateCommand extends GenerationBaseCommand {

    @Parameters(arity = "0..1", paramLabel = "GENERATION_PATH", description = " The path to generate the ArgoCD Application")
    Optional<String> generationPath = Optional.of(".argocd");

    @Override
    public void process(ArgoCDResourceList<?> resourceList) {
        Path outputDir = generationPath.map(Paths::get).orElse(Paths.get(".argocd"));
        if (outputDir.toFile().exists() && !outputDir.toFile().isDirectory()) {
            System.err.println("Output directory is not a directory: " + outputDir);
            return;
        }
        if (!outputDir.toFile().exists() && !outputDir.toFile().mkdirs()) {
            System.err.println("Failed to create output directory: " + outputDir);
            return;
        }

        System.out.println("ArgoCD Resources generated:");
        List<ProjectListItem> projectItems = new ArrayList<>();

        for (AppProject project : resourceList.getAppProjectList().getItems()) {

            List<ApplicationListItem> applicationItems = new ArrayList<>();
            String projectName = project.getMetadata().getName();
            String projectContent = Serialization.asYaml(project);
            Path projectPath = outputDir.resolve("project-" + project.getMetadata().getName() + ".yaml");
            writeStringSafe(projectPath, projectContent);

            List<Application> projectApplications = resourceList.getApplicationList().getItems().stream()
                    .filter(a -> projectName.equals(a.getSpec().getProject())).toList();
            if (projectApplications.isEmpty()) {
                continue;
            }
            for (Application application : projectApplications) {
                String applicationContent = Serialization.asYaml(application);
                Path applicationPath = outputDir.resolve("application-" + application.getMetadata().getName() + ".yaml");
                writeStringSafe(applicationPath, applicationContent);
                applicationItems.add(ApplicationListItem.from(application));
            }
            projectItems.add(new ProjectListItem(projectName, applicationItems));
        }
        ProjectListTable table = new ProjectListTable(projectItems);
        System.out.println(table.getContent());
    }
}
