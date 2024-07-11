package io.quarkiverse.argocd.v1beta1.argocdspec.repo.initcontainers;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({ "mountPath", "mountPropagation", "name", "readOnly", "subPath",
        "subPathExpr" })
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
public class VolumeMounts implements io.fabric8.kubernetes.api.builder.Editable<VolumeMountsBuilder>,
        io.fabric8.kubernetes.api.model.KubernetesResource {

    @java.lang.Override
    public VolumeMountsBuilder edit() {
        return new VolumeMountsBuilder(this);
    }

    /**
     * Path within the container at which the volume should be mounted. Must not contain ':'.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("mountPath")
    @io.fabric8.generator.annotation.Required()
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Path within the container at which the volume should be mounted.  Must not contain ':'.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String mountPath;

    public String getMountPath() {
        return mountPath;
    }

    public void setMountPath(String mountPath) {
        this.mountPath = mountPath;
    }

    /**
     * mountPropagation determines how mounts are propagated from the host to container and the other way around. When not set,
     * MountPropagationNone is used. This field is beta in 1.10.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("mountPropagation")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("mountPropagation determines how mounts are propagated from the host to container and the other way around. When not set, MountPropagationNone is used. This field is beta in 1.10.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String mountPropagation;

    public String getMountPropagation() {
        return mountPropagation;
    }

    public void setMountPropagation(String mountPropagation) {
        this.mountPropagation = mountPropagation;
    }

    /**
     * This must match the Name of a Volume.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    @io.fabric8.generator.annotation.Required()
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("This must match the Name of a Volume.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    /**
     * Mounted read-only if true, read-write otherwise (false or unspecified). Defaults to false.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("readOnly")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Mounted read-only if true, read-write otherwise (false or unspecified). Defaults to false.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Boolean readOnly;

    public Boolean getReadOnly() {
        return readOnly;
    }

    public void setReadOnly(Boolean readOnly) {
        this.readOnly = readOnly;
    }

    /**
     * Path within the volume from which the container's volume should be mounted. Defaults to "" (volume's root).
     */
    @com.fasterxml.jackson.annotation.JsonProperty("subPath")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Path within the volume from which the container's volume should be mounted. Defaults to \"\" (volume's root).")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String subPath;

    public String getSubPath() {
        return subPath;
    }

    public void setSubPath(String subPath) {
        this.subPath = subPath;
    }

    /**
     * Expanded path within the volume from which the container's volume should be mounted. Behaves similarly to SubPath but
     * environment variable references $(VAR_NAME) are expanded using the container's environment. Defaults to "" (volume's
     * root). SubPathExpr and SubPath are mutually exclusive.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("subPathExpr")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Expanded path within the volume from which the container's volume should be mounted. Behaves similarly to SubPath but environment variable references $(VAR_NAME) are expanded using the container's environment. Defaults to \"\" (volume's root). SubPathExpr and SubPath are mutually exclusive.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String subPathExpr;

    public String getSubPathExpr() {
        return subPathExpr;
    }

    public void setSubPathExpr(String subPathExpr) {
        this.subPathExpr = subPathExpr;
    }
}
