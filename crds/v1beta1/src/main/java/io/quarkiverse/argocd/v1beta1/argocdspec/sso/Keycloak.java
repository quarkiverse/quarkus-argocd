package io.quarkiverse.argocd.v1beta1.argocdspec.sso;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({ "host", "image", "resources", "rootCA", "verifyTLS", "version" })
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
public class Keycloak implements io.fabric8.kubernetes.api.builder.Editable<KeycloakBuilder>,
        io.fabric8.kubernetes.api.model.KubernetesResource {

    @java.lang.Override
    public KeycloakBuilder edit() {
        return new KeycloakBuilder(this);
    }

    /**
     * Host is the hostname to use for Ingress/Route resources.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("host")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Host is the hostname to use for Ingress/Route resources.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String host;

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    /**
     * Image is the Keycloak container image.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("image")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Image is the Keycloak container image.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String image;

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    /**
     * Resources defines the Compute Resources required by the container for Keycloak.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("resources")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Resources defines the Compute Resources required by the container for Keycloak.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.quarkiverse.argocd.v1beta1.argocdspec.sso.keycloak.Resources resources;

    public io.quarkiverse.argocd.v1beta1.argocdspec.sso.keycloak.Resources getResources() {
        return resources;
    }

    public void setResources(io.quarkiverse.argocd.v1beta1.argocdspec.sso.keycloak.Resources resources) {
        this.resources = resources;
    }

    /**
     * Custom root CA certificate for communicating with the Keycloak OIDC provider
     */
    @com.fasterxml.jackson.annotation.JsonProperty("rootCA")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Custom root CA certificate for communicating with the Keycloak OIDC provider")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String rootCA;

    public String getRootCA() {
        return rootCA;
    }

    public void setRootCA(String rootCA) {
        this.rootCA = rootCA;
    }

    /**
     * VerifyTLS set to false disables strict TLS validation.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("verifyTLS")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("VerifyTLS set to false disables strict TLS validation.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Boolean verifyTLS;

    public Boolean getVerifyTLS() {
        return verifyTLS;
    }

    public void setVerifyTLS(Boolean verifyTLS) {
        this.verifyTLS = verifyTLS;
    }

    /**
     * Version is the Keycloak container image tag.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("version")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Version is the Keycloak container image tag.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String version;

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }
}
