package io.quarkiverse.argocd.v1beta1.argocdspec;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({ "enabled", "redisProxyImage", "redisProxyVersion", "resources" })
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
public class Ha
        implements io.fabric8.kubernetes.api.builder.Editable<HaBuilder>, io.fabric8.kubernetes.api.model.KubernetesResource {

    @java.lang.Override
    public HaBuilder edit() {
        return new HaBuilder(this);
    }

    /**
     * Enabled will toggle HA support globally for Argo CD.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("enabled")
    @io.fabric8.generator.annotation.Required()
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Enabled will toggle HA support globally for Argo CD.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Boolean enabled;

    public Boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    /**
     * RedisProxyImage is the Redis HAProxy container image.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("redisProxyImage")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("RedisProxyImage is the Redis HAProxy container image.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String redisProxyImage;

    public String getRedisProxyImage() {
        return redisProxyImage;
    }

    public void setRedisProxyImage(String redisProxyImage) {
        this.redisProxyImage = redisProxyImage;
    }

    /**
     * RedisProxyVersion is the Redis HAProxy container image tag.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("redisProxyVersion")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("RedisProxyVersion is the Redis HAProxy container image tag.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String redisProxyVersion;

    public String getRedisProxyVersion() {
        return redisProxyVersion;
    }

    public void setRedisProxyVersion(String redisProxyVersion) {
        this.redisProxyVersion = redisProxyVersion;
    }

    /**
     * Resources defines the Compute Resources required by the container for HA.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("resources")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Resources defines the Compute Resources required by the container for HA.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.quarkiverse.argocd.v1beta1.argocdspec.ha.Resources resources;

    public io.quarkiverse.argocd.v1beta1.argocdspec.ha.Resources getResources() {
        return resources;
    }

    public void setResources(io.quarkiverse.argocd.v1beta1.argocdspec.ha.Resources resources) {
        this.resources = resources;
    }
}
