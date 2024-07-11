package io.quarkiverse.argocd.v1beta1.argocdspec;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({ "excludedefaulthosts", "keys" })
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
public class InitialSSHKnownHosts implements io.fabric8.kubernetes.api.builder.Editable<InitialSSHKnownHostsBuilder>,
        io.fabric8.kubernetes.api.model.KubernetesResource {

    @java.lang.Override
    public InitialSSHKnownHostsBuilder edit() {
        return new InitialSSHKnownHostsBuilder(this);
    }

    /**
     * ExcludeDefaultHosts describes whether you would like to include the default list of SSH Known Hosts provided by ArgoCD.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("excludedefaulthosts")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("ExcludeDefaultHosts describes whether you would like to include the default list of SSH Known Hosts provided by ArgoCD.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Boolean excludedefaulthosts;

    public Boolean getExcludedefaulthosts() {
        return excludedefaulthosts;
    }

    public void setExcludedefaulthosts(Boolean excludedefaulthosts) {
        this.excludedefaulthosts = excludedefaulthosts;
    }

    /**
     * Keys describes a custom set of SSH Known Hosts that you would like to have included in your ArgoCD server.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("keys")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Keys describes a custom set of SSH Known Hosts that you would like to have included in your ArgoCD server.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String keys;

    public String getKeys() {
        return keys;
    }

    public void setKeys(String keys) {
        this.keys = keys;
    }
}
