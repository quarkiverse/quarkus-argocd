package io.quarkiverse.argocd.v1alpha1.applicationstatus.operationstate.operation.sync.syncstrategy;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({ "force" })
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
public class Hook
        implements io.fabric8.kubernetes.api.builder.Editable<HookBuilder>, io.fabric8.kubernetes.api.model.KubernetesResource {

    @java.lang.Override
    public HookBuilder edit() {
        return new HookBuilder(this);
    }

    /**
     * Force indicates whether or not to supply the --force flag to `kubectl apply`. The --force flag deletes and re-create the
     * resource, when PATCH encounters conflict and has retried for 5 times.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("force")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Force indicates whether or not to supply the --force flag to `kubectl apply`. The --force flag deletes and re-create the resource, when PATCH encounters conflict and has retried for 5 times.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Boolean force;

    public Boolean getForce() {
        return force;
    }

    public void setForce(Boolean force) {
        this.force = force;
    }
}
