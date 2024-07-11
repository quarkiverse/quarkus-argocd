package io.quarkiverse.argocd.v1beta1.argocdspec.repo.volumes;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({ "fsType", "storagePolicyID", "storagePolicyName", "volumePath" })
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
public class VsphereVolume implements io.fabric8.kubernetes.api.builder.Editable<VsphereVolumeBuilder>,
        io.fabric8.kubernetes.api.model.KubernetesResource {

    @java.lang.Override
    public VsphereVolumeBuilder edit() {
        return new VsphereVolumeBuilder(this);
    }

    /**
     * fsType is filesystem type to mount. Must be a filesystem type supported by the host operating system. Ex. "ext4", "xfs",
     * "ntfs". Implicitly inferred to be "ext4" if unspecified.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("fsType")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("fsType is filesystem type to mount. Must be a filesystem type supported by the host operating system. Ex. \"ext4\", \"xfs\", \"ntfs\". Implicitly inferred to be \"ext4\" if unspecified.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String fsType;

    public String getFsType() {
        return fsType;
    }

    public void setFsType(String fsType) {
        this.fsType = fsType;
    }

    /**
     * storagePolicyID is the storage Policy Based Management (SPBM) profile ID associated with the StoragePolicyName.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("storagePolicyID")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("storagePolicyID is the storage Policy Based Management (SPBM) profile ID associated with the StoragePolicyName.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String storagePolicyID;

    public String getStoragePolicyID() {
        return storagePolicyID;
    }

    public void setStoragePolicyID(String storagePolicyID) {
        this.storagePolicyID = storagePolicyID;
    }

    /**
     * storagePolicyName is the storage Policy Based Management (SPBM) profile name.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("storagePolicyName")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("storagePolicyName is the storage Policy Based Management (SPBM) profile name.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String storagePolicyName;

    public String getStoragePolicyName() {
        return storagePolicyName;
    }

    public void setStoragePolicyName(String storagePolicyName) {
        this.storagePolicyName = storagePolicyName;
    }

    /**
     * volumePath is the path that identifies vSphere volume vmdk
     */
    @com.fasterxml.jackson.annotation.JsonProperty("volumePath")
    @io.fabric8.generator.annotation.Required()
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("volumePath is the path that identifies vSphere volume vmdk")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String volumePath;

    public String getVolumePath() {
        return volumePath;
    }

    public void setVolumePath(String volumePath) {
        this.volumePath = volumePath;
    }
}
