package io.quarkiverse.argocd.v1alpha1.applicationstatus.resources;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({ "lastTransitionTime", "message", "status" })
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
public class Health implements io.fabric8.kubernetes.api.builder.Editable<HealthBuilder>,
        io.fabric8.kubernetes.api.model.KubernetesResource {

    @java.lang.Override
    public HealthBuilder edit() {
        return new HealthBuilder(this);
    }

    /**
     * LastTransitionTime is the time the HealthStatus was set or updated
     *
     * Deprecated: this field is not used and will be removed in a future release.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("lastTransitionTime")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("LastTransitionTime is the time the HealthStatus was set or updated\n\nDeprecated: this field is not used and will be removed in a future release.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private java.time.ZonedDateTime lastTransitionTime;

    @com.fasterxml.jackson.annotation.JsonFormat(shape = com.fasterxml.jackson.annotation.JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ssXXX")
    public java.time.ZonedDateTime getLastTransitionTime() {
        return lastTransitionTime;
    }

    @com.fasterxml.jackson.annotation.JsonFormat(shape = com.fasterxml.jackson.annotation.JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ssXXX")
    public void setLastTransitionTime(java.time.ZonedDateTime lastTransitionTime) {
        this.lastTransitionTime = lastTransitionTime;
    }

    /**
     * Message is a human-readable informational message describing the health status
     */
    @com.fasterxml.jackson.annotation.JsonProperty("message")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Message is a human-readable informational message describing the health status")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String message;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * Status holds the status code of the resource
     */
    @com.fasterxml.jackson.annotation.JsonProperty("status")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Status holds the status code of the resource")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String status;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
