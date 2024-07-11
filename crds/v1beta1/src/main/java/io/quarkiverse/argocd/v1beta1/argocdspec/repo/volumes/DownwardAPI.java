package io.quarkiverse.argocd.v1beta1.argocdspec.repo.volumes;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({ "defaultMode", "items" })
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
     * Optional: mode bits to use on created files by default. Must be a Optional: mode bits used to set permissions on created
     * files by default. Must be an octal value between 0000 and 0777 or a decimal value between 0 and 511. YAML accepts both
     * octal and decimal values, JSON requires decimal values for mode bits. Defaults to 0644. Directories within the path are
     * not affected by this setting. This might be in conflict with other options that affect the file mode, like fsGroup, and
     * the result can be other mode bits set.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("defaultMode")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Optional: mode bits to use on created files by default. Must be a Optional: mode bits used to set permissions on created files by default. Must be an octal value between 0000 and 0777 or a decimal value between 0 and 511. YAML accepts both octal and decimal values, JSON requires decimal values for mode bits. Defaults to 0644. Directories within the path are not affected by this setting. This might be in conflict with other options that affect the file mode, like fsGroup, and the result can be other mode bits set.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Integer defaultMode;

    public Integer getDefaultMode() {
        return defaultMode;
    }

    public void setDefaultMode(Integer defaultMode) {
        this.defaultMode = defaultMode;
    }

    /**
     * Items is a list of downward API volume file
     */
    @com.fasterxml.jackson.annotation.JsonProperty("items")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Items is a list of downward API volume file")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private java.util.List<io.quarkiverse.argocd.v1beta1.argocdspec.repo.volumes.downwardapi.Items> items;

    public java.util.List<io.quarkiverse.argocd.v1beta1.argocdspec.repo.volumes.downwardapi.Items> getItems() {
        return items;
    }

    public void setItems(java.util.List<io.quarkiverse.argocd.v1beta1.argocdspec.repo.volumes.downwardapi.Items> items) {
        this.items = items;
    }
}
