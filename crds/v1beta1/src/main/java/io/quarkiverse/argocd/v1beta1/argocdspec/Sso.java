package io.quarkiverse.argocd.v1beta1.argocdspec;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({ "dex", "keycloak", "provider" })
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
public class Sso
        implements io.fabric8.kubernetes.api.builder.Editable<SsoBuilder>, io.fabric8.kubernetes.api.model.KubernetesResource {

    @java.lang.Override
    public SsoBuilder edit() {
        return new SsoBuilder(this);
    }

    /**
     * Dex contains the configuration for Argo CD dex authentication
     */
    @com.fasterxml.jackson.annotation.JsonProperty("dex")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Dex contains the configuration for Argo CD dex authentication")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.quarkiverse.argocd.v1beta1.argocdspec.sso.Dex dex;

    public io.quarkiverse.argocd.v1beta1.argocdspec.sso.Dex getDex() {
        return dex;
    }

    public void setDex(io.quarkiverse.argocd.v1beta1.argocdspec.sso.Dex dex) {
        this.dex = dex;
    }

    /**
     * Keycloak contains the configuration for Argo CD keycloak authentication
     */
    @com.fasterxml.jackson.annotation.JsonProperty("keycloak")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Keycloak contains the configuration for Argo CD keycloak authentication")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.quarkiverse.argocd.v1beta1.argocdspec.sso.Keycloak keycloak;

    public io.quarkiverse.argocd.v1beta1.argocdspec.sso.Keycloak getKeycloak() {
        return keycloak;
    }

    public void setKeycloak(io.quarkiverse.argocd.v1beta1.argocdspec.sso.Keycloak keycloak) {
        this.keycloak = keycloak;
    }

    /**
     * Provider installs and configures the given SSO Provider with Argo CD.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("provider")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Provider installs and configures the given SSO Provider with Argo CD.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String provider;

    public String getProvider() {
        return provider;
    }

    public void setProvider(String provider) {
        this.provider = provider;
    }
}
