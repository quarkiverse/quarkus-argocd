package io.quarkiverse.argocd.deployment;

import java.util.Optional;

import io.quarkus.runtime.annotations.ConfigRoot;
import io.smallrye.config.ConfigMapping;
import io.smallrye.config.WithDefault;

@ConfigRoot
@ConfigMapping(prefix = "quarkus.argocd")
public interface ArgoCDConfiguration {

    /**
     * The Kubernetes API Server URL.
     */
    @WithDefault("https://kubernetes.default.svc")
    String server();

    /**
     * The ArgoCDD project.
     */
    Optional<String> project();

    /**
     * The target namespace.
     */
    Optional<String> namespace();

    /**
     * The target revision.
     * Defaults to HEAD.
     */
    @WithDefault("HEAD")
    String targetRevision();

    /**
     *
     * The namespace that the actual application deployment will be created in.
     */
    Optional<String> applicationNamespace();

}
