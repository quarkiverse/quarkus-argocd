package io.quarkiverse.argocd.deployment;

import java.util.Optional;

import io.quarkus.runtime.annotations.ConfigItem;
import io.quarkus.runtime.annotations.ConfigRoot;

@ConfigRoot(name = "argocd")
public class ArgoCDConfiguration {

    /**
     * The Kubernetes API Server URL.
     */
    @ConfigItem(defaultValue = "https://kubernetes.default.svc")
    String server;

    /**
     * The ArgoCDD project.
     */
    @ConfigItem
    Optional<String> project;

    /**
     * The target namespace.
     */
    @ConfigItem
    Optional<String> namespace;

    /**
     * The target revision.
     * Defaults to HEAD.
     */
    @ConfigItem(defaultValue = "HEAD")
    String targetRevision;

}
