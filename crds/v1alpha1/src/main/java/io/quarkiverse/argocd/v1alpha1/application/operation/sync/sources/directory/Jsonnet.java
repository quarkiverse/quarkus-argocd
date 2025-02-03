package io.quarkiverse.argocd.v1alpha1.application.operation.sync.sources.directory;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({ "extVars", "libs", "tlas" })
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
public class Jsonnet implements io.fabric8.kubernetes.api.builder.Editable<JsonnetBuilder>,
        io.fabric8.kubernetes.api.model.KubernetesResource {

    @java.lang.Override
    public JsonnetBuilder edit() {
        return new JsonnetBuilder(this);
    }

    /**
     * ExtVars is a list of Jsonnet External Variables
     */
    @com.fasterxml.jackson.annotation.JsonProperty("extVars")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("ExtVars is a list of Jsonnet External Variables")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private java.util.List<io.quarkiverse.argocd.v1alpha1.application.operation.sync.sources.directory.jsonnet.ExtVars> extVars;

    public java.util.List<io.quarkiverse.argocd.v1alpha1.application.operation.sync.sources.directory.jsonnet.ExtVars> getExtVars() {
        return extVars;
    }

    public void setExtVars(
            java.util.List<io.quarkiverse.argocd.v1alpha1.application.operation.sync.sources.directory.jsonnet.ExtVars> extVars) {
        this.extVars = extVars;
    }

    /**
     * Additional library search dirs
     */
    @com.fasterxml.jackson.annotation.JsonProperty("libs")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Additional library search dirs")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private java.util.List<String> libs;

    public java.util.List<String> getLibs() {
        return libs;
    }

    public void setLibs(java.util.List<String> libs) {
        this.libs = libs;
    }

    /**
     * TLAS is a list of Jsonnet Top-level Arguments
     */
    @com.fasterxml.jackson.annotation.JsonProperty("tlas")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("TLAS is a list of Jsonnet Top-level Arguments")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private java.util.List<io.quarkiverse.argocd.v1alpha1.application.operation.sync.sources.directory.jsonnet.Tlas> tlas;

    public java.util.List<io.quarkiverse.argocd.v1alpha1.application.operation.sync.sources.directory.jsonnet.Tlas> getTlas() {
        return tlas;
    }

    public void setTlas(
            java.util.List<io.quarkiverse.argocd.v1alpha1.application.operation.sync.sources.directory.jsonnet.Tlas> tlas) {
        this.tlas = tlas;
    }
}
