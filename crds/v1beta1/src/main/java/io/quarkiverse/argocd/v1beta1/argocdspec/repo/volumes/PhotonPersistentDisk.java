package io.quarkiverse.argocd.v1beta1.argocdspec.repo.volumes;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({ "fsType", "pdID" })
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
public class PhotonPersistentDisk implements io.fabric8.kubernetes.api.builder.Editable<PhotonPersistentDiskBuilder>,
        io.fabric8.kubernetes.api.model.KubernetesResource {

    @java.lang.Override
    public PhotonPersistentDiskBuilder edit() {
        return new PhotonPersistentDiskBuilder(this);
    }

    /**
     * fsType is the filesystem type to mount. Must be a filesystem type supported by the host operating system. Ex. "ext4",
     * "xfs", "ntfs". Implicitly inferred to be "ext4" if unspecified.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("fsType")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("fsType is the filesystem type to mount. Must be a filesystem type supported by the host operating system. Ex. \"ext4\", \"xfs\", \"ntfs\". Implicitly inferred to be \"ext4\" if unspecified.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String fsType;

    public String getFsType() {
        return fsType;
    }

    public void setFsType(String fsType) {
        this.fsType = fsType;
    }

    /**
     * pdID is the ID that identifies Photon Controller persistent disk
     */
    @com.fasterxml.jackson.annotation.JsonProperty("pdID")
    @io.fabric8.generator.annotation.Required()
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("pdID is the ID that identifies Photon Controller persistent disk")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String pdID;

    public String getPdID() {
        return pdID;
    }

    public void setPdID(String pdID) {
        this.pdID = pdID;
    }
}
