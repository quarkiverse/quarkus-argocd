package io.quarkiverse.argocd.v1beta1.argocdspec;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({ "enabled", "env", "extraCommandArgs", "image", "logLevel", "resources",
        "scmProviders", "scmRootCAConfigMap", "sourceNamespaces", "version", "webhookServer" })
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
public class ApplicationSet implements io.fabric8.kubernetes.api.builder.Editable<ApplicationSetBuilder>,
        io.fabric8.kubernetes.api.model.KubernetesResource {

    @java.lang.Override
    public ApplicationSetBuilder edit() {
        return new ApplicationSetBuilder(this);
    }

    /**
     * Enabled is the flag to enable the Application Set Controller during ArgoCD installation. (optional, default `true`)
     */
    @com.fasterxml.jackson.annotation.JsonProperty("enabled")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Enabled is the flag to enable the Application Set Controller during ArgoCD installation. (optional, default `true`)")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Boolean enabled;

    public Boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    /**
     * Env lets you specify environment for applicationSet controller pods
     */
    @com.fasterxml.jackson.annotation.JsonProperty("env")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Env lets you specify environment for applicationSet controller pods")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private java.util.List<io.quarkiverse.argocd.v1beta1.argocdspec.applicationset.Env> env;

    public java.util.List<io.quarkiverse.argocd.v1beta1.argocdspec.applicationset.Env> getEnv() {
        return env;
    }

    public void setEnv(java.util.List<io.quarkiverse.argocd.v1beta1.argocdspec.applicationset.Env> env) {
        this.env = env;
    }

    /**
     * ExtraCommandArgs allows users to pass command line arguments to ApplicationSet controller. They get added to default
     * command line arguments provided by the operator. Please note that the command line arguments provided as part of
     * ExtraCommandArgs will not overwrite the default command line arguments.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("extraCommandArgs")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("ExtraCommandArgs allows users to pass command line arguments to ApplicationSet controller. They get added to default command line arguments provided by the operator. Please note that the command line arguments provided as part of ExtraCommandArgs will not overwrite the default command line arguments.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private java.util.List<String> extraCommandArgs;

    public java.util.List<String> getExtraCommandArgs() {
        return extraCommandArgs;
    }

    public void setExtraCommandArgs(java.util.List<String> extraCommandArgs) {
        this.extraCommandArgs = extraCommandArgs;
    }

    /**
     * Image is the Argo CD ApplicationSet image (optional)
     */
    @com.fasterxml.jackson.annotation.JsonProperty("image")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Image is the Argo CD ApplicationSet image (optional)")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String image;

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    /**
     * LogLevel describes the log level that should be used by the ApplicationSet controller. Defaults to ArgoCDDefaultLogLevel
     * if not set. Valid options are debug,info, error, and warn.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("logLevel")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("LogLevel describes the log level that should be used by the ApplicationSet controller. Defaults to ArgoCDDefaultLogLevel if not set.  Valid options are debug,info, error, and warn.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String logLevel;

    public String getLogLevel() {
        return logLevel;
    }

    public void setLogLevel(String logLevel) {
        this.logLevel = logLevel;
    }

    /**
     * Resources defines the Compute Resources required by the container for ApplicationSet.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("resources")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Resources defines the Compute Resources required by the container for ApplicationSet.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.quarkiverse.argocd.v1beta1.argocdspec.applicationset.Resources resources;

    public io.quarkiverse.argocd.v1beta1.argocdspec.applicationset.Resources getResources() {
        return resources;
    }

    public void setResources(io.quarkiverse.argocd.v1beta1.argocdspec.applicationset.Resources resources) {
        this.resources = resources;
    }

    /**
     * SCMProviders defines the list of allowed custom SCM provider API URLs
     */
    @com.fasterxml.jackson.annotation.JsonProperty("scmProviders")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("SCMProviders defines the list of allowed custom SCM provider API URLs")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private java.util.List<String> scmProviders;

    public java.util.List<String> getScmProviders() {
        return scmProviders;
    }

    public void setScmProviders(java.util.List<String> scmProviders) {
        this.scmProviders = scmProviders;
    }

    /**
     * SCMRootCAConfigMap is the name of the config map that stores the Gitlab SCM Provider's TLS certificate which will be
     * mounted on the ApplicationSet Controller (optional).
     */
    @com.fasterxml.jackson.annotation.JsonProperty("scmRootCAConfigMap")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("SCMRootCAConfigMap is the name of the config map that stores the Gitlab SCM Provider's TLS certificate which will be mounted on the ApplicationSet Controller (optional).")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String scmRootCAConfigMap;

    public String getScmRootCAConfigMap() {
        return scmRootCAConfigMap;
    }

    public void setScmRootCAConfigMap(String scmRootCAConfigMap) {
        this.scmRootCAConfigMap = scmRootCAConfigMap;
    }

    /**
     * SourceNamespaces defines the namespaces applicationset resources are allowed to be created in
     */
    @com.fasterxml.jackson.annotation.JsonProperty("sourceNamespaces")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("SourceNamespaces defines the namespaces applicationset resources are allowed to be created in")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private java.util.List<String> sourceNamespaces;

    public java.util.List<String> getSourceNamespaces() {
        return sourceNamespaces;
    }

    public void setSourceNamespaces(java.util.List<String> sourceNamespaces) {
        this.sourceNamespaces = sourceNamespaces;
    }

    /**
     * Version is the Argo CD ApplicationSet image tag. (optional)
     */
    @com.fasterxml.jackson.annotation.JsonProperty("version")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Version is the Argo CD ApplicationSet image tag. (optional)")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String version;

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    /**
     * WebhookServerSpec defines the options for the ApplicationSet Webhook Server component.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("webhookServer")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("WebhookServerSpec defines the options for the ApplicationSet Webhook Server component.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.quarkiverse.argocd.v1beta1.argocdspec.applicationset.WebhookServer webhookServer;

    public io.quarkiverse.argocd.v1beta1.argocdspec.applicationset.WebhookServer getWebhookServer() {
        return webhookServer;
    }

    public void setWebhookServer(io.quarkiverse.argocd.v1beta1.argocdspec.applicationset.WebhookServer webhookServer) {
        this.webhookServer = webhookServer;
    }
}
