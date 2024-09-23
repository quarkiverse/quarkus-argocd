package io.quarkiverse.argocd.cli;

import java.util.concurrent.Callable;

import io.quarkiverse.argocd.cli.application.GenerateCommand;
import io.quarkiverse.argocd.cli.application.InstallCommand;
import io.quarkiverse.argocd.cli.application.ListCommand;
import io.quarkiverse.argocd.cli.application.UninstallCommand;
import picocli.CommandLine;
import picocli.CommandLine.Command;
import picocli.CommandLine.Model.CommandSpec;
import picocli.CommandLine.Option;
import picocli.CommandLine.Spec;

@Command(name = "application", sortOptions = false, mixinStandardHelpOptions = false, header = "ArgoCD Application", subcommands = {
        ListCommand.class, InstallCommand.class, UninstallCommand.class, GenerateCommand.class })
public class ApplicationCommand implements Callable<Integer> {

    @Spec
    protected CommandSpec spec;

    @Option(names = { "-h", "--help" }, usageHelp = true, description = "Display this help message.")
    public boolean help;

    @Override
    public Integer call() {
        CommandLine schemaCommand = spec.subcommands().get("list");
        return schemaCommand.execute();
    }
}
