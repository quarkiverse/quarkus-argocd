package io.quarkiverse.argocd.v1alpha1.application;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({ "info", "initiatedBy", "retry", "sync" })
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
public class Operation implements io.fabric8.kubernetes.api.builder.Editable<OperationBuilder>,
        io.fabric8.kubernetes.api.model.KubernetesResource {

    @java.lang.Override
    public OperationBuilder edit() {
        return new OperationBuilder(this);
    }

    /**
     * Info is a list of informational items for this operation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("info")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Info is a list of informational items for this operation")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private java.util.List<io.quarkiverse.argocd.v1alpha1.application.operation.Info> info;

    public java.util.List<io.quarkiverse.argocd.v1alpha1.application.operation.Info> getInfo() {
        return info;
    }

    public void setInfo(java.util.List<io.quarkiverse.argocd.v1alpha1.application.operation.Info> info) {
        this.info = info;
    }

    /**
     * InitiatedBy contains information about who initiated the operations
     */
    @com.fasterxml.jackson.annotation.JsonProperty("initiatedBy")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("InitiatedBy contains information about who initiated the operations")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.quarkiverse.argocd.v1alpha1.application.operation.InitiatedBy initiatedBy;

    public io.quarkiverse.argocd.v1alpha1.application.operation.InitiatedBy getInitiatedBy() {
        return initiatedBy;
    }

    public void setInitiatedBy(io.quarkiverse.argocd.v1alpha1.application.operation.InitiatedBy initiatedBy) {
        this.initiatedBy = initiatedBy;
    }

    /**
     * Retry controls the strategy to apply if a sync fails
     */
    @com.fasterxml.jackson.annotation.JsonProperty("retry")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Retry controls the strategy to apply if a sync fails")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.quarkiverse.argocd.v1alpha1.application.operation.Retry retry;

    public io.quarkiverse.argocd.v1alpha1.application.operation.Retry getRetry() {
        return retry;
    }

    public void setRetry(io.quarkiverse.argocd.v1alpha1.application.operation.Retry retry) {
        this.retry = retry;
    }

    /**
     * Sync contains parameters for the operation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("sync")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Sync contains parameters for the operation")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.quarkiverse.argocd.v1alpha1.application.operation.Sync sync;

    public io.quarkiverse.argocd.v1alpha1.application.operation.Sync getSync() {
        return sync;
    }

    public void setSync(io.quarkiverse.argocd.v1alpha1.application.operation.Sync sync) {
        this.sync = sync;
    }
}
