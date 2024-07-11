package io.quarkiverse.argocd.v1beta1.argocdspec.repo.volumes;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({ "monitors", "path", "readOnly", "secretFile", "secretRef", "user" })
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
public class Cephfs implements io.fabric8.kubernetes.api.builder.Editable<CephfsBuilder>,
        io.fabric8.kubernetes.api.model.KubernetesResource {

    @java.lang.Override
    public CephfsBuilder edit() {
        return new CephfsBuilder(this);
    }

    /**
     * monitors is Required: Monitors is a collection of Ceph monitors More info:
     * https://examples.k8s.io/volumes/cephfs/README.md#how-to-use-it
     */
    @com.fasterxml.jackson.annotation.JsonProperty("monitors")
    @io.fabric8.generator.annotation.Required()
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("monitors is Required: Monitors is a collection of Ceph monitors More info: https://examples.k8s.io/volumes/cephfs/README.md#how-to-use-it")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private java.util.List<String> monitors;

    public java.util.List<String> getMonitors() {
        return monitors;
    }

    public void setMonitors(java.util.List<String> monitors) {
        this.monitors = monitors;
    }

    /**
     * path is Optional: Used as the mounted root, rather than the full Ceph tree, default is /
     */
    @com.fasterxml.jackson.annotation.JsonProperty("path")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("path is Optional: Used as the mounted root, rather than the full Ceph tree, default is /")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String path;

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    /**
     * readOnly is Optional: Defaults to false (read/write). ReadOnly here will force the ReadOnly setting in VolumeMounts. More
     * info: https://examples.k8s.io/volumes/cephfs/README.md#how-to-use-it
     */
    @com.fasterxml.jackson.annotation.JsonProperty("readOnly")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("readOnly is Optional: Defaults to false (read/write). ReadOnly here will force the ReadOnly setting in VolumeMounts. More info: https://examples.k8s.io/volumes/cephfs/README.md#how-to-use-it")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Boolean readOnly;

    public Boolean getReadOnly() {
        return readOnly;
    }

    public void setReadOnly(Boolean readOnly) {
        this.readOnly = readOnly;
    }

    /**
     * secretFile is Optional: SecretFile is the path to key ring for User, default is /etc/ceph/user.secret More info:
     * https://examples.k8s.io/volumes/cephfs/README.md#how-to-use-it
     */
    @com.fasterxml.jackson.annotation.JsonProperty("secretFile")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("secretFile is Optional: SecretFile is the path to key ring for User, default is /etc/ceph/user.secret More info: https://examples.k8s.io/volumes/cephfs/README.md#how-to-use-it")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String secretFile;

    public String getSecretFile() {
        return secretFile;
    }

    public void setSecretFile(String secretFile) {
        this.secretFile = secretFile;
    }

    /**
     * secretRef is Optional: SecretRef is reference to the authentication secret for User, default is empty. More info:
     * https://examples.k8s.io/volumes/cephfs/README.md#how-to-use-it
     */
    @com.fasterxml.jackson.annotation.JsonProperty("secretRef")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("secretRef is Optional: SecretRef is reference to the authentication secret for User, default is empty. More info: https://examples.k8s.io/volumes/cephfs/README.md#how-to-use-it")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.quarkiverse.argocd.v1beta1.argocdspec.repo.volumes.cephfs.SecretRef secretRef;

    public io.quarkiverse.argocd.v1beta1.argocdspec.repo.volumes.cephfs.SecretRef getSecretRef() {
        return secretRef;
    }

    public void setSecretRef(io.quarkiverse.argocd.v1beta1.argocdspec.repo.volumes.cephfs.SecretRef secretRef) {
        this.secretRef = secretRef;
    }

    /**
     * user is optional: User is the rados user name, default is admin More info:
     * https://examples.k8s.io/volumes/cephfs/README.md#how-to-use-it
     */
    @com.fasterxml.jackson.annotation.JsonProperty("user")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("user is optional: User is the rados user name, default is admin More info: https://examples.k8s.io/volumes/cephfs/README.md#how-to-use-it")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String user;

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }
}
