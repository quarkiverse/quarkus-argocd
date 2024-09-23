package io.quarkiverse.argocd.cli;

import java.util.concurrent.Callable;

import io.quarkus.picocli.runtime.annotations.TopCommand;
import picocli.CommandLine;
import picocli.CommandLine.Command;
import picocli.CommandLine.Model.CommandSpec;
import picocli.CommandLine.Option;
import picocli.CommandLine.Spec;

@TopCommand
@Command(name = "argocd", sortOptions = false, mixinStandardHelpOptions = false, header = "ArgoCD CLI", subcommands = {
        ApplicationCommand.class })
public class ArgoCommand implements Callable<Integer> {

    @Spec
    protected CommandSpec spec;

    @Option(names = { "-h", "--help" }, usageHelp = true, description = "Display this help message.")
    public boolean help;

    @Override
    public Integer call() {
        CommandLine applicationCommand = spec.subcommands().get("application");
        return applicationCommand.execute();
    }
}
