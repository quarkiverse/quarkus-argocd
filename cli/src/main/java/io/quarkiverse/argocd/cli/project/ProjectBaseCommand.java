package io.quarkiverse.argocd.cli.project;

import java.util.concurrent.Callable;

import jakarta.inject.Inject;

import io.fabric8.kubernetes.client.KubernetesClient;
import picocli.CommandLine.Model.CommandSpec;
import picocli.CommandLine.Option;
import picocli.CommandLine.Spec;

public abstract class ProjectBaseCommand implements Callable<Integer> {

    @Inject
    KubernetesClient kubernetesClient;

    @Spec
    protected CommandSpec spec;

    @Option(order = 1, names = { "-h", "--help" }, usageHelp = true, description = "Display this help message.")
    public boolean help;

    @Option(order = 2, names = { "--dry-run" }, description = "Show actions that would be taken.")
    boolean dryRun = false;

}
