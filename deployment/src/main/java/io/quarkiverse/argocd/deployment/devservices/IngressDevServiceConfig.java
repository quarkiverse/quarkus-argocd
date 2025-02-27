package io.quarkiverse.argocd.deployment.devservices;

import io.quarkus.runtime.annotations.ConfigPhase;
import io.quarkus.runtime.annotations.ConfigRoot;
import io.smallrye.config.ConfigMapping;
import io.smallrye.config.WithDefault;

@ConfigMapping(prefix = "quarkus.ingress.devservices")
@ConfigRoot(phase = ConfigPhase.BUILD_TIME)
public interface IngressDevServiceConfig {
    /**
     * The version of the Ingress controller to be installed from the GitHub repository
     * If not specified, it will use the resources published on main branch
     * The version to be used should be specified using the tagged release: v1.12.0, etc
     */
    @WithDefault("latest")
    String version();
}
