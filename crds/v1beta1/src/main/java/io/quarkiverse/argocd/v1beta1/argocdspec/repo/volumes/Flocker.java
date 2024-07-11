package io.quarkiverse.argocd.v1beta1.argocdspec.repo.volumes;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({ "datasetName", "datasetUUID" })
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
public class Flocker implements io.fabric8.kubernetes.api.builder.Editable<FlockerBuilder>,
        io.fabric8.kubernetes.api.model.KubernetesResource {

    @java.lang.Override
    public FlockerBuilder edit() {
        return new FlockerBuilder(this);
    }

    /**
     * datasetName is Name of the dataset stored as metadata -> name on the dataset for Flocker should be considered as
     * deprecated
     */
    @com.fasterxml.jackson.annotation.JsonProperty("datasetName")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("datasetName is Name of the dataset stored as metadata -> name on the dataset for Flocker should be considered as deprecated")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String datasetName;

    public String getDatasetName() {
        return datasetName;
    }

    public void setDatasetName(String datasetName) {
        this.datasetName = datasetName;
    }

    /**
     * datasetUUID is the UUID of the dataset. This is unique identifier of a Flocker dataset
     */
    @com.fasterxml.jackson.annotation.JsonProperty("datasetUUID")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("datasetUUID is the UUID of the dataset. This is unique identifier of a Flocker dataset")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String datasetUUID;

    public String getDatasetUUID() {
        return datasetUUID;
    }

    public void setDatasetUUID(String datasetUUID) {
        this.datasetUUID = datasetUUID;
    }
}
