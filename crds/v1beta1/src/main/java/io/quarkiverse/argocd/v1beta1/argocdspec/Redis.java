package io.quarkiverse.argocd.v1beta1.argocdspec;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({ "autotls", "disableTLSVerification", "enabled", "image", "remote",
        "resources", "version" })
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
public class Redis implements io.fabric8.kubernetes.api.builder.Editable<RedisBuilder>,
        io.fabric8.kubernetes.api.model.KubernetesResource {

    @java.lang.Override
    public RedisBuilder edit() {
        return new RedisBuilder(this);
    }

    /**
     * AutoTLS specifies the method to use for automatic TLS configuration for the redis server The value specified here can
     * currently be: - openshift - Use the OpenShift service CA to request TLS config
     */
    @com.fasterxml.jackson.annotation.JsonProperty("autotls")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("AutoTLS specifies the method to use for automatic TLS configuration for the redis server The value specified here can currently be: - openshift - Use the OpenShift service CA to request TLS config")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String autotls;

    public String getAutotls() {
        return autotls;
    }

    public void setAutotls(String autotls) {
        this.autotls = autotls;
    }

    /**
     * DisableTLSVerification defines whether redis server API should be accessed using strict TLS validation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("disableTLSVerification")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("DisableTLSVerification defines whether redis server API should be accessed using strict TLS validation")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Boolean disableTLSVerification;

    public Boolean getDisableTLSVerification() {
        return disableTLSVerification;
    }

    public void setDisableTLSVerification(Boolean disableTLSVerification) {
        this.disableTLSVerification = disableTLSVerification;
    }

    /**
     * Enabled is the flag to enable Redis during ArgoCD installation. (optional, default `true`)
     */
    @com.fasterxml.jackson.annotation.JsonProperty("enabled")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Enabled is the flag to enable Redis during ArgoCD installation. (optional, default `true`)")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Boolean enabled;

    public Boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    /**
     * Image is the Redis container image.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("image")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Image is the Redis container image.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String image;

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    /**
     * Remote specifies the remote URL of the Redis container. (optional, by default, a local instance managed by the operator
     * is used.)
     */
    @com.fasterxml.jackson.annotation.JsonProperty("remote")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Remote specifies the remote URL of the Redis container. (optional, by default, a local instance managed by the operator is used.)")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String remote;

    public String getRemote() {
        return remote;
    }

    public void setRemote(String remote) {
        this.remote = remote;
    }

    /**
     * Resources defines the Compute Resources required by the container for Redis.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("resources")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Resources defines the Compute Resources required by the container for Redis.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.quarkiverse.argocd.v1beta1.argocdspec.redis.Resources resources;

    public io.quarkiverse.argocd.v1beta1.argocdspec.redis.Resources getResources() {
        return resources;
    }

    public void setResources(io.quarkiverse.argocd.v1beta1.argocdspec.redis.Resources resources) {
        this.resources = resources;
    }

    /**
     * Version is the Redis container image tag.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("version")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Version is the Redis container image tag.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String version;

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }
}
