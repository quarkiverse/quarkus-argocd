package io.quarkiverse.argocd.v1beta1.argocdspec.repo.sidecarcontainers.securitycontext;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({ "localhostProfile", "type" })
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
public class SeccompProfile implements io.fabric8.kubernetes.api.builder.Editable<SeccompProfileBuilder>,
        io.fabric8.kubernetes.api.model.KubernetesResource {

    @java.lang.Override
    public SeccompProfileBuilder edit() {
        return new SeccompProfileBuilder(this);
    }

    /**
     * localhostProfile indicates a profile defined in a file on the node should be used. The profile must be preconfigured on
     * the node to work. Must be a descending path, relative to the kubelet's configured seccomp profile location. Must be set
     * if type is "Localhost". Must NOT be set for any other type.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("localhostProfile")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("localhostProfile indicates a profile defined in a file on the node should be used. The profile must be preconfigured on the node to work. Must be a descending path, relative to the kubelet's configured seccomp profile location. Must be set if type is \"Localhost\". Must NOT be set for any other type.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String localhostProfile;

    public String getLocalhostProfile() {
        return localhostProfile;
    }

    public void setLocalhostProfile(String localhostProfile) {
        this.localhostProfile = localhostProfile;
    }

    /**
     * type indicates which kind of seccomp profile will be applied. Valid options are:
     * Localhost - a profile defined in a file on the node should be used. RuntimeDefault - the container runtime default
     * profile should be used. Unconfined - no profile should be applied.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("type")
    @io.fabric8.generator.annotation.Required()
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("type indicates which kind of seccomp profile will be applied. Valid options are: \n Localhost - a profile defined in a file on the node should be used. RuntimeDefault - the container runtime default profile should be used. Unconfined - no profile should be applied.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String type;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
