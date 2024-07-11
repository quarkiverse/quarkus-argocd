package io.quarkiverse.argocd.v1beta1.argocdspec.repo.volumes;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({ "defaultMode", "items", "optional", "secretName" })
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
public class Secret implements io.fabric8.kubernetes.api.builder.Editable<SecretBuilder>,
        io.fabric8.kubernetes.api.model.KubernetesResource {

    @java.lang.Override
    public SecretBuilder edit() {
        return new SecretBuilder(this);
    }

    /**
     * defaultMode is Optional: mode bits used to set permissions on created files by default. Must be an octal value between
     * 0000 and 0777 or a decimal value between 0 and 511. YAML accepts both octal and decimal values, JSON requires decimal
     * values for mode bits. Defaults to 0644. Directories within the path are not affected by this setting. This might be in
     * conflict with other options that affect the file mode, like fsGroup, and the result can be other mode bits set.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("defaultMode")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("defaultMode is Optional: mode bits used to set permissions on created files by default. Must be an octal value between 0000 and 0777 or a decimal value between 0 and 511. YAML accepts both octal and decimal values, JSON requires decimal values for mode bits. Defaults to 0644. Directories within the path are not affected by this setting. This might be in conflict with other options that affect the file mode, like fsGroup, and the result can be other mode bits set.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Integer defaultMode;

    public Integer getDefaultMode() {
        return defaultMode;
    }

    public void setDefaultMode(Integer defaultMode) {
        this.defaultMode = defaultMode;
    }

    /**
     * items If unspecified, each key-value pair in the Data field of the referenced Secret will be projected into the volume as
     * a file whose name is the key and content is the value. If specified, the listed keys will be projected into the specified
     * paths, and unlisted keys will not be present. If a key is specified which is not present in the Secret, the volume setup
     * will error unless it is marked optional. Paths must be relative and may not contain the '..' path or start with '..'.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("items")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("items If unspecified, each key-value pair in the Data field of the referenced Secret will be projected into the volume as a file whose name is the key and content is the value. If specified, the listed keys will be projected into the specified paths, and unlisted keys will not be present. If a key is specified which is not present in the Secret, the volume setup will error unless it is marked optional. Paths must be relative and may not contain the '..' path or start with '..'.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private java.util.List<io.quarkiverse.argocd.v1beta1.argocdspec.repo.volumes.secret.Items> items;

    public java.util.List<io.quarkiverse.argocd.v1beta1.argocdspec.repo.volumes.secret.Items> getItems() {
        return items;
    }

    public void setItems(java.util.List<io.quarkiverse.argocd.v1beta1.argocdspec.repo.volumes.secret.Items> items) {
        this.items = items;
    }

    /**
     * optional field specify whether the Secret or its keys must be defined
     */
    @com.fasterxml.jackson.annotation.JsonProperty("optional")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("optional field specify whether the Secret or its keys must be defined")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Boolean optional;

    public Boolean getOptional() {
        return optional;
    }

    public void setOptional(Boolean optional) {
        this.optional = optional;
    }

    /**
     * secretName is the name of the secret in the pod's namespace to use. More info:
     * https://kubernetes.io/docs/concepts/storage/volumes#secret
     */
    @com.fasterxml.jackson.annotation.JsonProperty("secretName")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("secretName is the name of the secret in the pod's namespace to use. More info: https://kubernetes.io/docs/concepts/storage/volumes#secret")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String secretName;

    public String getSecretName() {
        return secretName;
    }

    public void setSecretName(String secretName) {
        this.secretName = secretName;
    }
}
