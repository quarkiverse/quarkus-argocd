package io.quarkiverse.argocd.v1alpha1.applicationstatus.sync;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({ "destination", "ignoreDifferences", "source", "sources" })
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
public class ComparedTo implements io.fabric8.kubernetes.api.builder.Editable<ComparedToBuilder>,
        io.fabric8.kubernetes.api.model.KubernetesResource {

    @java.lang.Override
    public ComparedToBuilder edit() {
        return new ComparedToBuilder(this);
    }

    /**
     * Destination is a reference to the application's destination used for comparison
     */
    @com.fasterxml.jackson.annotation.JsonProperty("destination")
    @io.fabric8.generator.annotation.Required()
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Destination is a reference to the application's destination used for comparison")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.quarkiverse.argocd.v1alpha1.applicationstatus.sync.comparedto.Destination destination;

    public io.quarkiverse.argocd.v1alpha1.applicationstatus.sync.comparedto.Destination getDestination() {
        return destination;
    }

    public void setDestination(io.quarkiverse.argocd.v1alpha1.applicationstatus.sync.comparedto.Destination destination) {
        this.destination = destination;
    }

    /**
     * IgnoreDifferences is a reference to the application's ignored differences used for comparison
     */
    @com.fasterxml.jackson.annotation.JsonProperty("ignoreDifferences")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("IgnoreDifferences is a reference to the application's ignored differences used for comparison")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private java.util.List<io.quarkiverse.argocd.v1alpha1.applicationstatus.sync.comparedto.IgnoreDifferences> ignoreDifferences;

    public java.util.List<io.quarkiverse.argocd.v1alpha1.applicationstatus.sync.comparedto.IgnoreDifferences> getIgnoreDifferences() {
        return ignoreDifferences;
    }

    public void setIgnoreDifferences(
            java.util.List<io.quarkiverse.argocd.v1alpha1.applicationstatus.sync.comparedto.IgnoreDifferences> ignoreDifferences) {
        this.ignoreDifferences = ignoreDifferences;
    }

    /**
     * Source is a reference to the application's source used for comparison
     */
    @com.fasterxml.jackson.annotation.JsonProperty("source")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Source is a reference to the application's source used for comparison")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.quarkiverse.argocd.v1alpha1.applicationstatus.sync.comparedto.Source source;

    public io.quarkiverse.argocd.v1alpha1.applicationstatus.sync.comparedto.Source getSource() {
        return source;
    }

    public void setSource(io.quarkiverse.argocd.v1alpha1.applicationstatus.sync.comparedto.Source source) {
        this.source = source;
    }

    /**
     * Sources is a reference to the application's multiple sources used for comparison
     */
    @com.fasterxml.jackson.annotation.JsonProperty("sources")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Sources is a reference to the application's multiple sources used for comparison")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private java.util.List<io.quarkiverse.argocd.v1alpha1.applicationstatus.sync.comparedto.Sources> sources;

    public java.util.List<io.quarkiverse.argocd.v1alpha1.applicationstatus.sync.comparedto.Sources> getSources() {
        return sources;
    }

    public void setSources(java.util.List<io.quarkiverse.argocd.v1alpha1.applicationstatus.sync.comparedto.Sources> sources) {
        this.sources = sources;
    }
}
