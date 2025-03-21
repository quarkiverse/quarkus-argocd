package io.quarkiverse.argocd.deployment;

import java.util.Optional;

import io.quarkus.runtime.annotations.ConfigRoot;
import io.smallrye.config.ConfigMapping;
import io.smallrye.config.WithDefault;

@ConfigRoot
@ConfigMapping(prefix = "quarkus.argocd")
public interface ArgoCDConfiguration {

    /**
     * The target/destination namespace where the resources of the runtime should be installed from the Helm chart, kustomize,
     * etc
     */
    Optional<String> destinationNamespace();

    /**
     * The target revision of the repository fetched by ArgoCd from the url
     * Defaults to HEAD.
     */
    @WithDefault("HEAD")
    String targetRevision();

    /**
     * AppProject custom resource configuration
     */
    AppProject appProject();

    interface AppProject {
        /**
         * The Kubernetes API Server URL.
         */
        @WithDefault("https://kubernetes.default.svc")
        String server();

        /**
         * The name of the ArgoCD AppProject CR.
         * A AppProject CR exists by default with full permissions -
         * https://argo-cd.readthedocs.io/en/stable/user-guide/projects/#the-default-project
         * and is named "default"
         */
        Optional<String> name();

        /**
         * The AppProject CR namespace.
         * This namespace refers to the Argocd control plane namespace. The value is either 'argocd' or 'openshift-gitops' and
         * is
         * calculated by the extension
         * according to the DeploymentTarget platform: kubernetes or openshift.
         *
         * Remark: It is then not needed for a user to define it
         */
        Optional<String> namespace();
    }

    /**
     * Application custom resource configuration
     */
    Application application();

    interface Application {
        /**
         * The namespace.
         * The ApplicationCR should be installed under the Argocd control plan namespace like the AppProject CR
         *
         * Remark: It is nevertheless possible to install it in another namespace if "Application in any namespaces is enabled:
         * https://argo-cd.readthedocs.io/en/stable/operator-manual/app-any-namespace/"
         */
        Optional<String> namespace();
    }

}
