package io.quarkiverse.argocd.v1alpha1.applicationspec;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({ "drySource", "hydrateTo", "syncSource" })
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
     * DrySource specifies where the dry "don't repeat yourself" manifest source lives.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("drySource")
    @io.fabric8.generator.annotation.Required()
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("DrySource specifies where the dry \"don't repeat yourself\" manifest source lives.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.quarkiverse.argocd.v1alpha1.applicationspec.sourcehydrator.DrySource drySource;

    public io.quarkiverse.argocd.v1alpha1.applicationspec.sourcehydrator.DrySource getDrySource() {
        return drySource;
    }

    public void setDrySource(io.quarkiverse.argocd.v1alpha1.applicationspec.sourcehydrator.DrySource drySource) {
        this.drySource = drySource;
    }

    /**
     * HydrateTo specifies an optional "staging" location to push hydrated manifests to. An external system would then
     * have to move manifests to the SyncSource, e.g. by pull request.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("hydrateTo")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("HydrateTo specifies an optional \"staging\" location to push hydrated manifests to. An external system would then\nhave to move manifests to the SyncSource, e.g. by pull request.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.quarkiverse.argocd.v1alpha1.applicationspec.sourcehydrator.HydrateTo hydrateTo;

    public io.quarkiverse.argocd.v1alpha1.applicationspec.sourcehydrator.HydrateTo getHydrateTo() {
        return hydrateTo;
    }

    public void setHydrateTo(io.quarkiverse.argocd.v1alpha1.applicationspec.sourcehydrator.HydrateTo hydrateTo) {
        this.hydrateTo = hydrateTo;
    }

    /**
     * SyncSource specifies where to sync hydrated manifests from.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("syncSource")
    @io.fabric8.generator.annotation.Required()
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("SyncSource specifies where to sync hydrated manifests from.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.quarkiverse.argocd.v1alpha1.applicationspec.sourcehydrator.SyncSource syncSource;

    public io.quarkiverse.argocd.v1alpha1.applicationspec.sourcehydrator.SyncSource getSyncSource() {
        return syncSource;
    }

    public void setSyncSource(io.quarkiverse.argocd.v1alpha1.applicationspec.sourcehydrator.SyncSource syncSource) {
        this.syncSource = syncSource;
    }
}
