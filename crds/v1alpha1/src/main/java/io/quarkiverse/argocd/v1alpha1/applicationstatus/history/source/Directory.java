package io.quarkiverse.argocd.v1alpha1.applicationstatus.history.source;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({ "exclude", "include", "jsonnet", "recurse" })
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
public class Directory implements io.fabric8.kubernetes.api.builder.Editable<DirectoryBuilder>,
        io.fabric8.kubernetes.api.model.KubernetesResource {

    @java.lang.Override
    public DirectoryBuilder edit() {
        return new DirectoryBuilder(this);
    }

    /**
     * Exclude contains a glob pattern to match paths against that should be explicitly excluded from being used during manifest
     * generation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("exclude")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Exclude contains a glob pattern to match paths against that should be explicitly excluded from being used during manifest generation")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String exclude;

    public String getExclude() {
        return exclude;
    }

    public void setExclude(String exclude) {
        this.exclude = exclude;
    }

    /**
     * Include contains a glob pattern to match paths against that should be explicitly included during manifest generation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("include")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Include contains a glob pattern to match paths against that should be explicitly included during manifest generation")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String include;

    public String getInclude() {
        return include;
    }

    public void setInclude(String include) {
        this.include = include;
    }

    /**
     * Jsonnet holds options specific to Jsonnet
     */
    @com.fasterxml.jackson.annotation.JsonProperty("jsonnet")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Jsonnet holds options specific to Jsonnet")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.quarkiverse.argocd.v1alpha1.applicationstatus.history.source.directory.Jsonnet jsonnet;

    public io.quarkiverse.argocd.v1alpha1.applicationstatus.history.source.directory.Jsonnet getJsonnet() {
        return jsonnet;
    }

    public void setJsonnet(io.quarkiverse.argocd.v1alpha1.applicationstatus.history.source.directory.Jsonnet jsonnet) {
        this.jsonnet = jsonnet;
    }

    /**
     * Recurse specifies whether to scan a directory recursively for manifests
     */
    @com.fasterxml.jackson.annotation.JsonProperty("recurse")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Recurse specifies whether to scan a directory recursively for manifests")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Boolean recurse;

    public Boolean getRecurse() {
        return recurse;
    }

    public void setRecurse(Boolean recurse) {
        this.recurse = recurse;
    }
}
