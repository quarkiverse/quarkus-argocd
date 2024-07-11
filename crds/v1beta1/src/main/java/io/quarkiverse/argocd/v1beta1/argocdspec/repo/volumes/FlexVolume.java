package io.quarkiverse.argocd.v1beta1.argocdspec.repo.volumes;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({ "driver", "fsType", "options", "readOnly", "secretRef" })
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
public class FlexVolume implements io.fabric8.kubernetes.api.builder.Editable<FlexVolumeBuilder>,
        io.fabric8.kubernetes.api.model.KubernetesResource {

    @java.lang.Override
    public FlexVolumeBuilder edit() {
        return new FlexVolumeBuilder(this);
    }

    /**
     * driver is the name of the driver to use for this volume.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("driver")
    @io.fabric8.generator.annotation.Required()
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("driver is the name of the driver to use for this volume.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String driver;

    public String getDriver() {
        return driver;
    }

    public void setDriver(String driver) {
        this.driver = driver;
    }

    /**
     * fsType is the filesystem type to mount. Must be a filesystem type supported by the host operating system. Ex. "ext4",
     * "xfs", "ntfs". The default filesystem depends on FlexVolume script.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("fsType")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("fsType is the filesystem type to mount. Must be a filesystem type supported by the host operating system. Ex. \"ext4\", \"xfs\", \"ntfs\". The default filesystem depends on FlexVolume script.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String fsType;

    public String getFsType() {
        return fsType;
    }

    public void setFsType(String fsType) {
        this.fsType = fsType;
    }

    /**
     * options is Optional: this field holds extra command options if any.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("options")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("options is Optional: this field holds extra command options if any.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private java.util.Map<java.lang.String, String> options;

    public java.util.Map<java.lang.String, String> getOptions() {
        return options;
    }

    public void setOptions(java.util.Map<java.lang.String, String> options) {
        this.options = options;
    }

    /**
     * readOnly is Optional: defaults to false (read/write). ReadOnly here will force the ReadOnly setting in VolumeMounts.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("readOnly")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("readOnly is Optional: defaults to false (read/write). ReadOnly here will force the ReadOnly setting in VolumeMounts.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Boolean readOnly;

    public Boolean getReadOnly() {
        return readOnly;
    }

    public void setReadOnly(Boolean readOnly) {
        this.readOnly = readOnly;
    }

    /**
     * secretRef is Optional: secretRef is reference to the secret object containing sensitive information to pass to the plugin
     * scripts. This may be empty if no secret object is specified. If the secret object contains more than one secret, all
     * secrets are passed to the plugin scripts.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("secretRef")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("secretRef is Optional: secretRef is reference to the secret object containing sensitive information to pass to the plugin scripts. This may be empty if no secret object is specified. If the secret object contains more than one secret, all secrets are passed to the plugin scripts.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.quarkiverse.argocd.v1beta1.argocdspec.repo.volumes.flexvolume.SecretRef secretRef;

    public io.quarkiverse.argocd.v1beta1.argocdspec.repo.volumes.flexvolume.SecretRef getSecretRef() {
        return secretRef;
    }

    public void setSecretRef(io.quarkiverse.argocd.v1beta1.argocdspec.repo.volumes.flexvolume.SecretRef secretRef) {
        this.secretRef = secretRef;
    }
}
