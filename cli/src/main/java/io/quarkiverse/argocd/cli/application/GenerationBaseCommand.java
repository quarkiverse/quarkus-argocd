package io.quarkiverse.argocd.cli.application;

import java.util.Optional;
import java.util.Properties;
import java.util.concurrent.Callable;

import picocli.CommandLine.Option;

public abstract class GenerationBaseCommand extends ApplicationBaseCommand implements Callable<Integer> {

    @Option(names = { "-n", "--namespace" }, description = "The target namespace")
    Optional<String> namespace = Optional.empty();

    @Option(names = { "-p", "--project" }, description = "The target project")
    Optional<String> project = Optional.empty();

    public Properties getBuildSystemProperties() {
        Properties buildSystemProperties = new Properties();
        namespace.ifPresent(v -> buildSystemProperties.setProperty("quarkus.argocd.namespace", v));
        project.ifPresent(v -> buildSystemProperties.setProperty("quarkus.argocd.project", v));
        return buildSystemProperties;
    }
}
