package io.quarkiverse.argocd.cli.application;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Optional;

import io.quarkiverse.argocd.deployment.utils.Serialization;
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

        System.out.println("ArgoCD Applications generated:");
        for (Application application : resourceList.getApplicationList().getItems()) {
            String content = Serialization.asYaml(application);
            Path p = outputDir.resolve(application.getMetadata().getName() + ".yaml");
            writeStringSafe(p, content);
            System.out.println(application.getMetadata().getName());
        }

    }

}
