package io.quarkiverse.argocd.v1beta1.argocdspec.sso;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({ "config", "env", "groups", "image", "openShiftOAuth", "resources",
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
public class Dex
        implements io.fabric8.kubernetes.api.builder.Editable<DexBuilder>, io.fabric8.kubernetes.api.model.KubernetesResource {

    @java.lang.Override
    public DexBuilder edit() {
        return new DexBuilder(this);
    }

    /**
     * Config is the dex connector configuration.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("config")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Config is the dex connector configuration.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String config;

    public String getConfig() {
        return config;
    }

    public void setConfig(String config) {
        this.config = config;
    }

    /**
     * Env lets you specify environment variables for Dex.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("env")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Env lets you specify environment variables for Dex.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private java.util.List<io.quarkiverse.argocd.v1beta1.argocdspec.sso.dex.Env> env;

    public java.util.List<io.quarkiverse.argocd.v1beta1.argocdspec.sso.dex.Env> getEnv() {
        return env;
    }

    public void setEnv(java.util.List<io.quarkiverse.argocd.v1beta1.argocdspec.sso.dex.Env> env) {
        this.env = env;
    }

    /**
     * Optional list of required groups a user must be a member of
     */
    @com.fasterxml.jackson.annotation.JsonProperty("groups")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Optional list of required groups a user must be a member of")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private java.util.List<String> groups;

    public java.util.List<String> getGroups() {
        return groups;
    }

    public void setGroups(java.util.List<String> groups) {
        this.groups = groups;
    }

    /**
     * Image is the Dex container image.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("image")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Image is the Dex container image.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String image;

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    /**
     * OpenShiftOAuth enables OpenShift OAuth authentication for the Dex server.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("openShiftOAuth")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("OpenShiftOAuth enables OpenShift OAuth authentication for the Dex server.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Boolean openShiftOAuth;

    public Boolean getOpenShiftOAuth() {
        return openShiftOAuth;
    }

    public void setOpenShiftOAuth(Boolean openShiftOAuth) {
        this.openShiftOAuth = openShiftOAuth;
    }

    /**
     * Resources defines the Compute Resources required by the container for Dex.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("resources")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Resources defines the Compute Resources required by the container for Dex.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.quarkiverse.argocd.v1beta1.argocdspec.sso.dex.Resources resources;

    public io.quarkiverse.argocd.v1beta1.argocdspec.sso.dex.Resources getResources() {
        return resources;
    }

    public void setResources(io.quarkiverse.argocd.v1beta1.argocdspec.sso.dex.Resources resources) {
        this.resources = resources;
    }

    /**
     * Version is the Dex container image tag.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("version")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Version is the Dex container image tag.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String version;

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }
}
