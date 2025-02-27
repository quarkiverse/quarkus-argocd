package io.quarkiverse.argocd.v1alpha1.application.operation.sync;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({ "apply", "hook" })
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
public class SyncStrategy implements io.fabric8.kubernetes.api.builder.Editable<SyncStrategyBuilder>,
        io.fabric8.kubernetes.api.model.KubernetesResource {

    @java.lang.Override
    public SyncStrategyBuilder edit() {
        return new SyncStrategyBuilder(this);
    }

    /**
     * Apply will perform a `kubectl apply` to perform the sync.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("apply")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Apply will perform a `kubectl apply` to perform the sync.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.quarkiverse.argocd.v1alpha1.application.operation.sync.syncstrategy.Apply apply;

    public io.quarkiverse.argocd.v1alpha1.application.operation.sync.syncstrategy.Apply getApply() {
        return apply;
    }

    public void setApply(io.quarkiverse.argocd.v1alpha1.application.operation.sync.syncstrategy.Apply apply) {
        this.apply = apply;
    }

    /**
     * Hook will submit any referenced resources to perform the sync. This is the default strategy
     */
    @com.fasterxml.jackson.annotation.JsonProperty("hook")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Hook will submit any referenced resources to perform the sync. This is the default strategy")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.quarkiverse.argocd.v1alpha1.application.operation.sync.syncstrategy.Hook hook;

    public io.quarkiverse.argocd.v1alpha1.application.operation.sync.syncstrategy.Hook getHook() {
        return hook;
    }

    public void setHook(io.quarkiverse.argocd.v1alpha1.application.operation.sync.syncstrategy.Hook hook) {
        this.hook = hook;
    }
}
