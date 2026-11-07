package io.quarkiverse.argocd.deployment.devservices;

import io.quarkus.runtime.annotations.ConfigPhase;
import io.quarkus.runtime.annotations.ConfigRoot;
import io.smallrye.config.ConfigMapping;
import io.smallrye.config.WithDefault;

@ConfigMapping(prefix = "quarkus.argocd.devservices")
@ConfigRoot(phase = ConfigPhase.BUILD_TIME)
public interface ArgocdDevServiceConfig {

    /**
     * Enable the ArgoCD DevService.
     */
    @WithDefault("true")
    boolean enabled();

    /**
     * Enable the debugging level.
     */
    @WithDefault("false")
    boolean debugEnabled();

    /**
     * If logs should be shown from the Argocd container.
     */
    @WithDefault("false")
    boolean showLogs();

    /**
     * The version of Argocd to be installed from the GitHub repository
     * It can be: "latest" or a tagged release expressed as such: "v3.5.5"
     */
    @WithDefault("v3.5.5")
    String version();

    /**
     * The Argocd control plane namespace where AppProject or Application CR are deployed
     * The default namespace is: argocd
     */
    @WithDefault("argocd")
    String controlPlaneNamespace();

    /**
     * Time to wait till a resource is ready: pod, etc
     * The default value is: 180 seconds
     */
    @WithDefault("180")
    long timeOut();

    /**
     * The cluster type to be used: kind or k3s
     * The default value is: kind
     */
    @WithDefault("kind")
    String clusterType();

    /**
     * The hostname of the Argo CD UI link of the Dev UI. It must resolve to the local host
     */
    @WithDefault("argocd.localtest.me")
    String hostName();

    /**
     * The host port to be used on the host machine
     */
    @WithDefault("8443")
    String hostPort();

    /**
     * Enable to forward the Argo CD server port to the host port
     */
    @WithDefault("true")
    boolean portForwardEnabled();
}