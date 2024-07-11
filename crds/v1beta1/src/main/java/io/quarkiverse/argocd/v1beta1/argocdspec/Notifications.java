package io.quarkiverse.argocd.v1beta1.argocdspec;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({ "enabled", "env", "image", "logLevel", "replicas", "resources",
        "version" })
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
public class Notifications implements io.fabric8.kubernetes.api.builder.Editable<NotificationsBuilder>,
        io.fabric8.kubernetes.api.model.KubernetesResource {

    @java.lang.Override
    public NotificationsBuilder edit() {
        return new NotificationsBuilder(this);
    }

    /**
     * Enabled defines whether argocd-notifications controller should be deployed or not
     */
    @com.fasterxml.jackson.annotation.JsonProperty("enabled")
    @io.fabric8.generator.annotation.Required()
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Enabled defines whether argocd-notifications controller should be deployed or not")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Boolean enabled;

    public Boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    /**
     * Env let you specify environment variables for Notifications pods
     */
    @com.fasterxml.jackson.annotation.JsonProperty("env")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Env let you specify environment variables for Notifications pods")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private java.util.List<io.quarkiverse.argocd.v1beta1.argocdspec.notifications.Env> env;

    public java.util.List<io.quarkiverse.argocd.v1beta1.argocdspec.notifications.Env> getEnv() {
        return env;
    }

    public void setEnv(java.util.List<io.quarkiverse.argocd.v1beta1.argocdspec.notifications.Env> env) {
        this.env = env;
    }

    /**
     * Image is the Argo CD Notifications image (optional)
     */
    @com.fasterxml.jackson.annotation.JsonProperty("image")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Image is the Argo CD Notifications image (optional)")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String image;

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    /**
     * LogLevel describes the log level that should be used by the argocd-notifications. Defaults to ArgoCDDefaultLogLevel if
     * not set. Valid options are debug,info, error, and warn.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("logLevel")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("LogLevel describes the log level that should be used by the argocd-notifications. Defaults to ArgoCDDefaultLogLevel if not set.  Valid options are debug,info, error, and warn.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String logLevel;

    public String getLogLevel() {
        return logLevel;
    }

    public void setLogLevel(String logLevel) {
        this.logLevel = logLevel;
    }

    /**
     * Replicas defines the number of replicas to run for notifications-controller
     */
    @com.fasterxml.jackson.annotation.JsonProperty("replicas")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Replicas defines the number of replicas to run for notifications-controller")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Integer replicas;

    public Integer getReplicas() {
        return replicas;
    }

    public void setReplicas(Integer replicas) {
        this.replicas = replicas;
    }

    /**
     * Resources defines the Compute Resources required by the container for Argo CD Notifications.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("resources")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Resources defines the Compute Resources required by the container for Argo CD Notifications.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.quarkiverse.argocd.v1beta1.argocdspec.notifications.Resources resources;

    public io.quarkiverse.argocd.v1beta1.argocdspec.notifications.Resources getResources() {
        return resources;
    }

    public void setResources(io.quarkiverse.argocd.v1beta1.argocdspec.notifications.Resources resources) {
        this.resources = resources;
    }

    /**
     * Version is the Argo CD Notifications image tag. (optional)
     */
    @com.fasterxml.jackson.annotation.JsonProperty("version")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Version is the Argo CD Notifications image tag. (optional)")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String version;

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }
}
