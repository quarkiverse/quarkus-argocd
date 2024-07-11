package io.quarkiverse.argocd.v1beta1;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({ "applicationController", "applicationSetController", "host",
        "notificationsController", "phase", "redis", "redisTLSChecksum", "repo", "repoTLSChecksum", "server", "sso" })
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@lombok.ToString()
@lombok.EqualsAndHashCode()
@io.sundr.builder.annotations.Buildable(editableEnabled = false, validationEnabled = false, generateBuilderPackage = false, builderPackage = "io.fabric8.kubernetes.api.builder", refs = {
        @io.sundr.builder.annotations.BuildableReference(io.fabric8.kubernetes.api.model.ObjectMeta.class),
        @io.sundr.builder.annotations.BuildableReference(io.fabric8.kubernetes.api.model.ObjectReference.class),
        @io.sundr.builder.annotations.BuildableReference(io.fabric8.kubernetes.api.model.LabelSelector.class),
        @io.sundr.builder.annotations.BuildableReference(io.fabric8.kubernetes.api.model.Container.class),
        @io.sundr.builder.annotations.BuildableReference(io.fabric8.kubernetes.api.model.EnvVar.class),
        @io.sundr.builder.annotations.BuildableReference(io.fabric8.kubernetes.api.model.ContainerPort.class),
        @io.sundr.builder.annotations.BuildableReference(io.fabric8.kubernetes.api.model.Volume.class),
        @io.sundr.builder.annotations.BuildableReference(io.fabric8.kubernetes.api.model.VolumeMount.class)
})
public class ArgoCDStatus implements io.fabric8.kubernetes.api.builder.Editable<ArgoCDStatusBuilder>,
        io.fabric8.kubernetes.api.model.KubernetesResource {

    @java.lang.Override
    public ArgoCDStatusBuilder edit() {
        return new ArgoCDStatusBuilder(this);
    }

    /**
     * ApplicationController is a simple, high-level summary of where the Argo CD application controller component is in its
     * lifecycle. There are four possible ApplicationController values: Pending: The Argo CD application controller component
     * has been accepted by the Kubernetes system, but one or more of the required resources have not been created. Running: All
     * of the required Pods for the Argo CD application controller component are in a Ready state. Failed: At least one of the
     * Argo CD application controller component Pods had a failure. Unknown: The state of the Argo CD application controller
     * component could not be obtained.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("applicationController")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("ApplicationController is a simple, high-level summary of where the Argo CD application controller component is in its lifecycle. There are four possible ApplicationController values: Pending: The Argo CD application controller component has been accepted by the Kubernetes system, but one or more of the required resources have not been created. Running: All of the required Pods for the Argo CD application controller component are in a Ready state. Failed: At least one of the  Argo CD application controller component Pods had a failure. Unknown: The state of the Argo CD application controller component could not be obtained.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String applicationController;

    public String getApplicationController() {
        return applicationController;
    }

    public void setApplicationController(String applicationController) {
        this.applicationController = applicationController;
    }

    /**
     * ApplicationSetController is a simple, high-level summary of where the Argo CD applicationSet controller component is in
     * its lifecycle. There are four possible ApplicationSetController values: Pending: The Argo CD applicationSet controller
     * component has been accepted by the Kubernetes system, but one or more of the required resources have not been created.
     * Running: All of the required Pods for the Argo CD applicationSet controller component are in a Ready state. Failed: At
     * least one of the Argo CD applicationSet controller component Pods had a failure. Unknown: The state of the Argo CD
     * applicationSet controller component could not be obtained.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("applicationSetController")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("ApplicationSetController is a simple, high-level summary of where the Argo CD applicationSet controller component is in its lifecycle. There are four possible ApplicationSetController values: Pending: The Argo CD applicationSet controller component has been accepted by the Kubernetes system, but one or more of the required resources have not been created. Running: All of the required Pods for the Argo CD applicationSet controller component are in a Ready state. Failed: At least one of the  Argo CD applicationSet controller component Pods had a failure. Unknown: The state of the Argo CD applicationSet controller component could not be obtained.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String applicationSetController;

    public String getApplicationSetController() {
        return applicationSetController;
    }

    public void setApplicationSetController(String applicationSetController) {
        this.applicationSetController = applicationSetController;
    }

    /**
     * Host is the hostname of the Ingress.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("host")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Host is the hostname of the Ingress.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String host;

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    /**
     * NotificationsController is a simple, high-level summary of where the Argo CD notifications controller component is in its
     * lifecycle. There are four possible NotificationsController values: Pending: The Argo CD notifications controller
     * component has been accepted by the Kubernetes system, but one or more of the required resources have not been created.
     * Running: All of the required Pods for the Argo CD notifications controller component are in a Ready state. Failed: At
     * least one of the Argo CD notifications controller component Pods had a failure. Unknown: The state of the Argo CD
     * notifications controller component could not be obtained.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("notificationsController")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("NotificationsController is a simple, high-level summary of where the Argo CD notifications controller component is in its lifecycle. There are four possible NotificationsController values: Pending: The Argo CD notifications controller component has been accepted by the Kubernetes system, but one or more of the required resources have not been created. Running: All of the required Pods for the Argo CD notifications controller component are in a Ready state. Failed: At least one of the  Argo CD notifications controller component Pods had a failure. Unknown: The state of the Argo CD notifications controller component could not be obtained.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String notificationsController;

    public String getNotificationsController() {
        return notificationsController;
    }

    public void setNotificationsController(String notificationsController) {
        this.notificationsController = notificationsController;
    }

    /**
     * Phase is a simple, high-level summary of where the ArgoCD is in its lifecycle. There are four possible phase values:
     * Pending: The ArgoCD has been accepted by the Kubernetes system, but one or more of the required resources have not been
     * created. Available: All of the resources for the ArgoCD are ready. Failed: At least one resource has experienced a
     * failure. Unknown: The state of the ArgoCD phase could not be obtained.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("phase")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Phase is a simple, high-level summary of where the ArgoCD is in its lifecycle. There are four possible phase values: Pending: The ArgoCD has been accepted by the Kubernetes system, but one or more of the required resources have not been created. Available: All of the resources for the ArgoCD are ready. Failed: At least one resource has experienced a failure. Unknown: The state of the ArgoCD phase could not be obtained.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String phase;

    public String getPhase() {
        return phase;
    }

    public void setPhase(String phase) {
        this.phase = phase;
    }

    /**
     * Redis is a simple, high-level summary of where the Argo CD Redis component is in its lifecycle. There are four possible
     * redis values: Pending: The Argo CD Redis component has been accepted by the Kubernetes system, but one or more of the
     * required resources have not been created. Running: All of the required Pods for the Argo CD Redis component are in a
     * Ready state. Failed: At least one of the Argo CD Redis component Pods had a failure. Unknown: The state of the Argo CD
     * Redis component could not be obtained.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("redis")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Redis is a simple, high-level summary of where the Argo CD Redis component is in its lifecycle. There are four possible redis values: Pending: The Argo CD Redis component has been accepted by the Kubernetes system, but one or more of the required resources have not been created. Running: All of the required Pods for the Argo CD Redis component are in a Ready state. Failed: At least one of the  Argo CD Redis component Pods had a failure. Unknown: The state of the Argo CD Redis component could not be obtained.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String redis;

    public String getRedis() {
        return redis;
    }

    public void setRedis(String redis) {
        this.redis = redis;
    }

    /**
     * RedisTLSChecksum contains the SHA256 checksum of the latest known state of tls.crt and tls.key in the
     * argocd-operator-redis-tls secret.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("redisTLSChecksum")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("RedisTLSChecksum contains the SHA256 checksum of the latest known state of tls.crt and tls.key in the argocd-operator-redis-tls secret.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String redisTLSChecksum;

    public String getRedisTLSChecksum() {
        return redisTLSChecksum;
    }

    public void setRedisTLSChecksum(String redisTLSChecksum) {
        this.redisTLSChecksum = redisTLSChecksum;
    }

    /**
     * Repo is a simple, high-level summary of where the Argo CD Repo component is in its lifecycle. There are four possible
     * repo values: Pending: The Argo CD Repo component has been accepted by the Kubernetes system, but one or more of the
     * required resources have not been created. Running: All of the required Pods for the Argo CD Repo component are in a Ready
     * state. Failed: At least one of the Argo CD Repo component Pods had a failure. Unknown: The state of the Argo CD Repo
     * component could not be obtained.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("repo")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Repo is a simple, high-level summary of where the Argo CD Repo component is in its lifecycle. There are four possible repo values: Pending: The Argo CD Repo component has been accepted by the Kubernetes system, but one or more of the required resources have not been created. Running: All of the required Pods for the Argo CD Repo component are in a Ready state. Failed: At least one of the  Argo CD Repo component Pods had a failure. Unknown: The state of the Argo CD Repo component could not be obtained.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String repo;

    public String getRepo() {
        return repo;
    }

    public void setRepo(String repo) {
        this.repo = repo;
    }

    /**
     * RepoTLSChecksum contains the SHA256 checksum of the latest known state of tls.crt and tls.key in the
     * argocd-repo-server-tls secret.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("repoTLSChecksum")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("RepoTLSChecksum contains the SHA256 checksum of the latest known state of tls.crt and tls.key in the argocd-repo-server-tls secret.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String repoTLSChecksum;

    public String getRepoTLSChecksum() {
        return repoTLSChecksum;
    }

    public void setRepoTLSChecksum(String repoTLSChecksum) {
        this.repoTLSChecksum = repoTLSChecksum;
    }

    /**
     * Server is a simple, high-level summary of where the Argo CD server component is in its lifecycle. There are four possible
     * server values: Pending: The Argo CD server component has been accepted by the Kubernetes system, but one or more of the
     * required resources have not been created. Running: All of the required Pods for the Argo CD server component are in a
     * Ready state. Failed: At least one of the Argo CD server component Pods had a failure. Unknown: The state of the Argo CD
     * server component could not be obtained.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("server")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Server is a simple, high-level summary of where the Argo CD server component is in its lifecycle. There are four possible server values: Pending: The Argo CD server component has been accepted by the Kubernetes system, but one or more of the required resources have not been created. Running: All of the required Pods for the Argo CD server component are in a Ready state. Failed: At least one of the  Argo CD server component Pods had a failure. Unknown: The state of the Argo CD server component could not be obtained.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String server;

    public String getServer() {
        return server;
    }

    public void setServer(String server) {
        this.server = server;
    }

    /**
     * SSO is a simple, high-level summary of where the Argo CD SSO(Dex/Keycloak) component is in its lifecycle. There are four
     * possible sso values: Pending: The Argo CD SSO component has been accepted by the Kubernetes system, but one or more of
     * the required resources have not been created. Running: All of the required Pods for the Argo CD SSO component are in a
     * Ready state. Failed: At least one of the Argo CD SSO component Pods had a failure. Unknown: The state of the Argo CD SSO
     * component could not be obtained.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("sso")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("SSO is a simple, high-level summary of where the Argo CD SSO(Dex/Keycloak) component is in its lifecycle. There are four possible sso values: Pending: The Argo CD SSO component has been accepted by the Kubernetes system, but one or more of the required resources have not been created. Running: All of the required Pods for the Argo CD SSO component are in a Ready state. Failed: At least one of the  Argo CD SSO component Pods had a failure. Unknown: The state of the Argo CD SSO component could not be obtained.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String sso;

    public String getSso() {
        return sso;
    }

    public void setSso(String sso) {
        this.sso = sso;
    }
}
