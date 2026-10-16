package io.quarkiverse.argocd.v1alpha1.applicationstatus.sourcehydrator;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({ "drySHA", "finishedAt", "hydratedSHA", "message", "phase",
        "sourceHydrator", "startedAt" })
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
public class CurrentOperation implements io.fabric8.kubernetes.api.builder.Editable<CurrentOperationBuilder>,
        io.fabric8.kubernetes.api.model.KubernetesResource {

    @java.lang.Override
    public CurrentOperationBuilder edit() {
        return new CurrentOperationBuilder(this);
    }

    /**
     * DrySHA holds the resolved revision (sha) of the dry source as of the most recent reconciliation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("drySHA")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("DrySHA holds the resolved revision (sha) of the dry source as of the most recent reconciliation")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String drySHA;

    public String getDrySHA() {
        return drySHA;
    }

    public void setDrySHA(String drySHA) {
        this.drySHA = drySHA;
    }

    /**
     * FinishedAt indicates when the hydrate operation finished
     */
    @com.fasterxml.jackson.annotation.JsonProperty("finishedAt")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("FinishedAt indicates when the hydrate operation finished")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private java.time.ZonedDateTime finishedAt;

    @com.fasterxml.jackson.annotation.JsonFormat(shape = com.fasterxml.jackson.annotation.JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ssXXX")
    public java.time.ZonedDateTime getFinishedAt() {
        return finishedAt;
    }

    @com.fasterxml.jackson.annotation.JsonFormat(shape = com.fasterxml.jackson.annotation.JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ssXXX")
    public void setFinishedAt(java.time.ZonedDateTime finishedAt) {
        this.finishedAt = finishedAt;
    }

    /**
     * HydratedSHA holds the resolved revision (sha) of the hydrated source as of the most recent reconciliation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("hydratedSHA")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("HydratedSHA holds the resolved revision (sha) of the hydrated source as of the most recent reconciliation")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String hydratedSHA;

    public String getHydratedSHA() {
        return hydratedSHA;
    }

    public void setHydratedSHA(String hydratedSHA) {
        this.hydratedSHA = hydratedSHA;
    }

    /**
     * Message contains a message describing the current status of the hydrate operation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("message")
    @io.fabric8.generator.annotation.Required()
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Message contains a message describing the current status of the hydrate operation")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String message;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public enum Phase {

        @com.fasterxml.jackson.annotation.JsonProperty("Hydrating")
        HYDRATING("Hydrating"),
        @com.fasterxml.jackson.annotation.JsonProperty("Failed")
        FAILED("Failed"),
        @com.fasterxml.jackson.annotation.JsonProperty("Hydrated")
        HYDRATED("Hydrated");

        java.lang.String value;

        Phase(java.lang.String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue()
        public java.lang.String getValue() {
            return value;
        }
    }

    /**
     * Phase indicates the status of the hydrate operation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("phase")
    @io.fabric8.generator.annotation.Required()
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Phase indicates the status of the hydrate operation")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Phase phase;

    public Phase getPhase() {
        return phase;
    }

    public void setPhase(Phase phase) {
        this.phase = phase;
    }

    /**
     * SourceHydrator holds the hydrator config used for the hydrate operation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("sourceHydrator")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("SourceHydrator holds the hydrator config used for the hydrate operation")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.quarkiverse.argocd.v1alpha1.applicationstatus.sourcehydrator.currentoperation.SourceHydrator sourceHydrator;

    public io.quarkiverse.argocd.v1alpha1.applicationstatus.sourcehydrator.currentoperation.SourceHydrator getSourceHydrator() {
        return sourceHydrator;
    }

    public void setSourceHydrator(
            io.quarkiverse.argocd.v1alpha1.applicationstatus.sourcehydrator.currentoperation.SourceHydrator sourceHydrator) {
        this.sourceHydrator = sourceHydrator;
    }

    /**
     * StartedAt indicates when the hydrate operation started
     */
    @com.fasterxml.jackson.annotation.JsonProperty("startedAt")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("StartedAt indicates when the hydrate operation started")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private java.time.ZonedDateTime startedAt;

    @com.fasterxml.jackson.annotation.JsonFormat(shape = com.fasterxml.jackson.annotation.JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ssXXX")
    public java.time.ZonedDateTime getStartedAt() {
        return startedAt;
    }

    @com.fasterxml.jackson.annotation.JsonFormat(shape = com.fasterxml.jackson.annotation.JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ssXXX")
    public void setStartedAt(java.time.ZonedDateTime startedAt) {
        this.startedAt = startedAt;
    }
}
