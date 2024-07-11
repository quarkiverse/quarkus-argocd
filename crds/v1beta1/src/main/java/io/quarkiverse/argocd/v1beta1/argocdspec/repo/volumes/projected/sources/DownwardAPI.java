package io.quarkiverse.argocd.v1beta1.argocdspec.repo.volumes.projected.sources;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({ "items" })
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
public class DownwardAPI implements io.fabric8.kubernetes.api.builder.Editable<DownwardAPIBuilder>,
        io.fabric8.kubernetes.api.model.KubernetesResource {

    @java.lang.Override
    public DownwardAPIBuilder edit() {
        return new DownwardAPIBuilder(this);
    }

    /**
     * Items is a list of DownwardAPIVolume file
     */
    @com.fasterxml.jackson.annotation.JsonProperty("items")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Items is a list of DownwardAPIVolume file")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private java.util.List<io.quarkiverse.argocd.v1beta1.argocdspec.repo.volumes.projected.sources.downwardapi.Items> items;

    public java.util.List<io.quarkiverse.argocd.v1beta1.argocdspec.repo.volumes.projected.sources.downwardapi.Items> getItems() {
        return items;
    }

    public void setItems(
            java.util.List<io.quarkiverse.argocd.v1beta1.argocdspec.repo.volumes.projected.sources.downwardapi.Items> items) {
        this.items = items;
    }
}
