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
     * It can be: "latest" or a tagged release expressed as such: "v2.13.2"
     */
    @WithDefault("v2.13.2")
    String version();

    /**
     * The Argocd controllers namespace where: Application, ApplicationSet, etc. are deployed and running
     * The default namespace is: argocd
     */
    @WithDefault("argocd")
    String controllerNamespace();

    /**
     * Time to wait till a resource is ready: pod, etc
     * The default value is: 180 seconds
     */
    @WithDefault("180")
    long timeOut();

    /**
     * The cluster type to be used: kind or k3
     * The default value is: kind
     */
    @WithDefault("kind")
    String clusterType();

    /**
     * The hostname of the argocd ingress route
     */
    @WithDefault("argocd.localtest.me")
    String hostName();

    /**
     * The host port to be used on the host machine
     */
    @WithDefault("8443")
    String hostPort();

    /**
     * Ingress configuration
     */
    Ingress ingress();

    interface Ingress {
        /**
         * The version of the Ingress controller to be installed from the GitHub repository
         * If not specified, it will use the resources published on main branch
         * The version to be used should be specified using the tagged release: v1.12.0, etc
         */
        @WithDefault("latest")
        String version();

        /**
         * Enable to forward the ingress traffic from the container to the local host
         */
        @WithDefault("true")
        boolean portForwardEnabled();
    }
}