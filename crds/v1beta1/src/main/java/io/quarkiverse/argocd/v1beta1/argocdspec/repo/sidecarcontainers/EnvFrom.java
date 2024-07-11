package io.quarkiverse.argocd.v1beta1.argocdspec.repo.sidecarcontainers;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({ "configMapRef", "prefix", "secretRef" })
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
public class EnvFrom implements io.fabric8.kubernetes.api.builder.Editable<EnvFromBuilder>,
        io.fabric8.kubernetes.api.model.KubernetesResource {

    @java.lang.Override
    public EnvFromBuilder edit() {
        return new EnvFromBuilder(this);
    }

    /**
     * The ConfigMap to select from
     */
    @com.fasterxml.jackson.annotation.JsonProperty("configMapRef")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("The ConfigMap to select from")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.quarkiverse.argocd.v1beta1.argocdspec.repo.sidecarcontainers.envfrom.ConfigMapRef configMapRef;

    public io.quarkiverse.argocd.v1beta1.argocdspec.repo.sidecarcontainers.envfrom.ConfigMapRef getConfigMapRef() {
        return configMapRef;
    }

    public void setConfigMapRef(
            io.quarkiverse.argocd.v1beta1.argocdspec.repo.sidecarcontainers.envfrom.ConfigMapRef configMapRef) {
        this.configMapRef = configMapRef;
    }

    /**
     * An optional identifier to prepend to each key in the ConfigMap. Must be a C_IDENTIFIER.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("prefix")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("An optional identifier to prepend to each key in the ConfigMap. Must be a C_IDENTIFIER.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String prefix;

    public String getPrefix() {
        return prefix;
    }

    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }

    /**
     * The Secret to select from
     */
    @com.fasterxml.jackson.annotation.JsonProperty("secretRef")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("The Secret to select from")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.quarkiverse.argocd.v1beta1.argocdspec.repo.sidecarcontainers.envfrom.SecretRef secretRef;

    public io.quarkiverse.argocd.v1beta1.argocdspec.repo.sidecarcontainers.envfrom.SecretRef getSecretRef() {
        return secretRef;
    }

    public void setSecretRef(io.quarkiverse.argocd.v1beta1.argocdspec.repo.sidecarcontainers.envfrom.SecretRef secretRef) {
        this.secretRef = secretRef;
    }
}
