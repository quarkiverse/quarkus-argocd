package io.quarkiverse.argocd.v1beta1.argocdspec.repo.sidecarcontainers.securitycontext;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({ "add", "drop" })
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
public class Capabilities implements io.fabric8.kubernetes.api.builder.Editable<CapabilitiesBuilder>,
        io.fabric8.kubernetes.api.model.KubernetesResource {

    @java.lang.Override
    public CapabilitiesBuilder edit() {
        return new CapabilitiesBuilder(this);
    }

    /**
     * Added capabilities
     */
    @com.fasterxml.jackson.annotation.JsonProperty("add")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Added capabilities")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private java.util.List<String> add;

    public java.util.List<String> getAdd() {
        return add;
    }

    public void setAdd(java.util.List<String> add) {
        this.add = add;
    }

    /**
     * Removed capabilities
     */
    @com.fasterxml.jackson.annotation.JsonProperty("drop")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Removed capabilities")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private java.util.List<String> drop;

    public java.util.List<String> getDrop() {
        return drop;
    }

    public void setDrop(java.util.List<String> drop) {
        this.drop = drop;
    }
}
