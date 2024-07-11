package io.quarkiverse.argocd.v1beta1.argocdspec.resourceignoredifferences.resourceidentifiers;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({ "jqPathExpressions", "jsonPointers", "managedFieldsManagers" })
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
public class Customization implements io.fabric8.kubernetes.api.builder.Editable<CustomizationBuilder>,
        io.fabric8.kubernetes.api.model.KubernetesResource {

    @java.lang.Override
    public CustomizationBuilder edit() {
        return new CustomizationBuilder(this);
    }

    @com.fasterxml.jackson.annotation.JsonProperty("jqPathExpressions")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private java.util.List<String> jqPathExpressions;

    public java.util.List<String> getJqPathExpressions() {
        return jqPathExpressions;
    }

    public void setJqPathExpressions(java.util.List<String> jqPathExpressions) {
        this.jqPathExpressions = jqPathExpressions;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("jsonPointers")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private java.util.List<String> jsonPointers;

    public java.util.List<String> getJsonPointers() {
        return jsonPointers;
    }

    public void setJsonPointers(java.util.List<String> jsonPointers) {
        this.jsonPointers = jsonPointers;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("managedFieldsManagers")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private java.util.List<String> managedFieldsManagers;

    public java.util.List<String> getManagedFieldsManagers() {
        return managedFieldsManagers;
    }

    public void setManagedFieldsManagers(java.util.List<String> managedFieldsManagers) {
        this.managedFieldsManagers = managedFieldsManagers;
    }
}
