package io.quarkiverse.argocd.runtime;

import io.quarkus.runtime.annotations.ConfigPhase;
import io.quarkus.runtime.annotations.ConfigRoot;
import io.smallrye.config.ConfigMapping;

/**
 * ArgoCD runtime configuration
 */
@ConfigMapping(prefix = "quarkus.argocd")
@ConfigRoot(phase = ConfigPhase.RUN_TIME)
public interface ArgoCDRuntimeConfig {
}
