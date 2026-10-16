package io.quarkiverse.argocd.v1alpha1.applicationstatus;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({ "currentOperation", "lastComparedDryRevision",
        "lastSuccessfulOperation" })
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
public class SourceHydrator implements io.fabric8.kubernetes.api.builder.Editable<SourceHydratorBuilder>,
        io.fabric8.kubernetes.api.model.KubernetesResource {

    @java.lang.Override
    public SourceHydratorBuilder edit() {
        return new SourceHydratorBuilder(this);
    }

    /**
     * CurrentOperation holds the status of the hydrate operation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("currentOperation")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("CurrentOperation holds the status of the hydrate operation")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.quarkiverse.argocd.v1alpha1.applicationstatus.sourcehydrator.CurrentOperation currentOperation;

    public io.quarkiverse.argocd.v1alpha1.applicationstatus.sourcehydrator.CurrentOperation getCurrentOperation() {
        return currentOperation;
    }

    public void setCurrentOperation(
            io.quarkiverse.argocd.v1alpha1.applicationstatus.sourcehydrator.CurrentOperation currentOperation) {
        this.currentOperation = currentOperation;
    }

    /**
     * LastComparedDryRevision holds the resolved revision from the most recent dry source comparison.
     * This is updated on every evaluation, even when hydration is skipped due to no changes.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("lastComparedDryRevision")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("LastComparedDryRevision holds the resolved revision from the most recent dry source comparison.\nThis is updated on every evaluation, even when hydration is skipped due to no changes.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String lastComparedDryRevision;

    public String getLastComparedDryRevision() {
        return lastComparedDryRevision;
    }

    public void setLastComparedDryRevision(String lastComparedDryRevision) {
        this.lastComparedDryRevision = lastComparedDryRevision;
    }

    /**
     * LastSuccessfulOperation holds info about the most recent successful hydration
     */
    @com.fasterxml.jackson.annotation.JsonProperty("lastSuccessfulOperation")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("LastSuccessfulOperation holds info about the most recent successful hydration")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.quarkiverse.argocd.v1alpha1.applicationstatus.sourcehydrator.LastSuccessfulOperation lastSuccessfulOperation;

    public io.quarkiverse.argocd.v1alpha1.applicationstatus.sourcehydrator.LastSuccessfulOperation getLastSuccessfulOperation() {
        return lastSuccessfulOperation;
    }

    public void setLastSuccessfulOperation(
            io.quarkiverse.argocd.v1alpha1.applicationstatus.sourcehydrator.LastSuccessfulOperation lastSuccessfulOperation) {
        this.lastSuccessfulOperation = lastSuccessfulOperation;
    }
}
