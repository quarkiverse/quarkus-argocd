package io.quarkiverse.argocd.v1beta1.argocdspec.repo.volumes;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({ "cachingMode", "diskName", "diskURI", "fsType", "kind", "readOnly" })
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
public class AzureDisk implements io.fabric8.kubernetes.api.builder.Editable<AzureDiskBuilder>,
        io.fabric8.kubernetes.api.model.KubernetesResource {

    @java.lang.Override
    public AzureDiskBuilder edit() {
        return new AzureDiskBuilder(this);
    }

    /**
     * cachingMode is the Host Caching mode: None, Read Only, Read Write.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("cachingMode")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("cachingMode is the Host Caching mode: None, Read Only, Read Write.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String cachingMode;

    public String getCachingMode() {
        return cachingMode;
    }

    public void setCachingMode(String cachingMode) {
        this.cachingMode = cachingMode;
    }

    /**
     * diskName is the Name of the data disk in the blob storage
     */
    @com.fasterxml.jackson.annotation.JsonProperty("diskName")
    @io.fabric8.generator.annotation.Required()
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("diskName is the Name of the data disk in the blob storage")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String diskName;

    public String getDiskName() {
        return diskName;
    }

    public void setDiskName(String diskName) {
        this.diskName = diskName;
    }

    /**
     * diskURI is the URI of data disk in the blob storage
     */
    @com.fasterxml.jackson.annotation.JsonProperty("diskURI")
    @io.fabric8.generator.annotation.Required()
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("diskURI is the URI of data disk in the blob storage")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String diskURI;

    public String getDiskURI() {
        return diskURI;
    }

    public void setDiskURI(String diskURI) {
        this.diskURI = diskURI;
    }

    /**
     * fsType is Filesystem type to mount. Must be a filesystem type supported by the host operating system. Ex. "ext4", "xfs",
     * "ntfs". Implicitly inferred to be "ext4" if unspecified.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("fsType")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("fsType is Filesystem type to mount. Must be a filesystem type supported by the host operating system. Ex. \"ext4\", \"xfs\", \"ntfs\". Implicitly inferred to be \"ext4\" if unspecified.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String fsType;

    public String getFsType() {
        return fsType;
    }

    public void setFsType(String fsType) {
        this.fsType = fsType;
    }

    /**
     * kind expected values are Shared: multiple blob disks per storage account Dedicated: single blob disk per storage account
     * Managed: azure managed data disk (only in managed availability set). defaults to shared
     */
    @com.fasterxml.jackson.annotation.JsonProperty("kind")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("kind expected values are Shared: multiple blob disks per storage account  Dedicated: single blob disk per storage account  Managed: azure managed data disk (only in managed availability set). defaults to shared")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String kind;

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    /**
     * readOnly Defaults to false (read/write). ReadOnly here will force the ReadOnly setting in VolumeMounts.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("readOnly")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("readOnly Defaults to false (read/write). ReadOnly here will force the ReadOnly setting in VolumeMounts.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Boolean readOnly;

    public Boolean getReadOnly() {
        return readOnly;
    }

    public void setReadOnly(Boolean readOnly) {
        this.readOnly = readOnly;
    }
}
