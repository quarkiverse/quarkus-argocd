package io.quarkiverse.argocd.v1alpha1.applicationstatus.sourcehydrator;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({ "drySHA", "hydratedSHA", "sourceHydrator" })
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
public class LastSuccessfulOperation implements io.fabric8.kubernetes.api.builder.Editable<LastSuccessfulOperationBuilder>,
        io.fabric8.kubernetes.api.model.KubernetesResource {

    @java.lang.Override
    public LastSuccessfulOperationBuilder edit() {
        return new LastSuccessfulOperationBuilder(this);
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
     * SourceHydrator holds the hydrator config used for the hydrate operation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("sourceHydrator")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("SourceHydrator holds the hydrator config used for the hydrate operation")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.quarkiverse.argocd.v1alpha1.applicationstatus.sourcehydrator.lastsuccessfuloperation.SourceHydrator sourceHydrator;

    public io.quarkiverse.argocd.v1alpha1.applicationstatus.sourcehydrator.lastsuccessfuloperation.SourceHydrator getSourceHydrator() {
        return sourceHydrator;
    }

    public void setSourceHydrator(
            io.quarkiverse.argocd.v1alpha1.applicationstatus.sourcehydrator.lastsuccessfuloperation.SourceHydrator sourceHydrator) {
        this.sourceHydrator = sourceHydrator;
    }
}
