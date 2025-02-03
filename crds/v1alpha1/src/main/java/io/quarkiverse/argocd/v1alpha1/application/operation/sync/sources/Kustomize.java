package io.quarkiverse.argocd.v1alpha1.application.operation.sync.sources;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({ "commonAnnotations", "commonAnnotationsEnvsubst", "commonLabels",
        "components", "forceCommonAnnotations", "forceCommonLabels", "images", "labelWithoutSelector", "namePrefix",
        "nameSuffix", "namespace", "patches", "replicas", "version" })
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
public class Kustomize implements io.fabric8.kubernetes.api.builder.Editable<KustomizeBuilder>,
        io.fabric8.kubernetes.api.model.KubernetesResource {

    @java.lang.Override
    public KustomizeBuilder edit() {
        return new KustomizeBuilder(this);
    }

    /**
     * CommonAnnotations is a list of additional annotations to add to rendered manifests
     */
    @com.fasterxml.jackson.annotation.JsonProperty("commonAnnotations")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("CommonAnnotations is a list of additional annotations to add to rendered manifests")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private java.util.Map<java.lang.String, String> commonAnnotations;

    public java.util.Map<java.lang.String, String> getCommonAnnotations() {
        return commonAnnotations;
    }

    public void setCommonAnnotations(java.util.Map<java.lang.String, String> commonAnnotations) {
        this.commonAnnotations = commonAnnotations;
    }

    /**
     * CommonAnnotationsEnvsubst specifies whether to apply env variables substitution for annotation values
     */
    @com.fasterxml.jackson.annotation.JsonProperty("commonAnnotationsEnvsubst")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("CommonAnnotationsEnvsubst specifies whether to apply env variables substitution for annotation values")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Boolean commonAnnotationsEnvsubst;

    public Boolean getCommonAnnotationsEnvsubst() {
        return commonAnnotationsEnvsubst;
    }

    public void setCommonAnnotationsEnvsubst(Boolean commonAnnotationsEnvsubst) {
        this.commonAnnotationsEnvsubst = commonAnnotationsEnvsubst;
    }

    /**
     * CommonLabels is a list of additional labels to add to rendered manifests
     */
    @com.fasterxml.jackson.annotation.JsonProperty("commonLabels")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("CommonLabels is a list of additional labels to add to rendered manifests")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private java.util.Map<java.lang.String, String> commonLabels;

    public java.util.Map<java.lang.String, String> getCommonLabels() {
        return commonLabels;
    }

    public void setCommonLabels(java.util.Map<java.lang.String, String> commonLabels) {
        this.commonLabels = commonLabels;
    }

    /**
     * Components specifies a list of kustomize components to add to the kustomization before building
     */
    @com.fasterxml.jackson.annotation.JsonProperty("components")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Components specifies a list of kustomize components to add to the kustomization before building")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private java.util.List<String> components;

    public java.util.List<String> getComponents() {
        return components;
    }

    public void setComponents(java.util.List<String> components) {
        this.components = components;
    }

    /**
     * ForceCommonAnnotations specifies whether to force applying common annotations to resources for Kustomize apps
     */
    @com.fasterxml.jackson.annotation.JsonProperty("forceCommonAnnotations")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("ForceCommonAnnotations specifies whether to force applying common annotations to resources for Kustomize apps")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Boolean forceCommonAnnotations;

    public Boolean getForceCommonAnnotations() {
        return forceCommonAnnotations;
    }

    public void setForceCommonAnnotations(Boolean forceCommonAnnotations) {
        this.forceCommonAnnotations = forceCommonAnnotations;
    }

    /**
     * ForceCommonLabels specifies whether to force applying common labels to resources for Kustomize apps
     */
    @com.fasterxml.jackson.annotation.JsonProperty("forceCommonLabels")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("ForceCommonLabels specifies whether to force applying common labels to resources for Kustomize apps")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Boolean forceCommonLabels;

    public Boolean getForceCommonLabels() {
        return forceCommonLabels;
    }

    public void setForceCommonLabels(Boolean forceCommonLabels) {
        this.forceCommonLabels = forceCommonLabels;
    }

    /**
     * Images is a list of Kustomize image override specifications
     */
    @com.fasterxml.jackson.annotation.JsonProperty("images")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Images is a list of Kustomize image override specifications")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private java.util.List<String> images;

    public java.util.List<String> getImages() {
        return images;
    }

    public void setImages(java.util.List<String> images) {
        this.images = images;
    }

    /**
     * LabelWithoutSelector specifies whether to apply common labels to resource selectors or not
     */
    @com.fasterxml.jackson.annotation.JsonProperty("labelWithoutSelector")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("LabelWithoutSelector specifies whether to apply common labels to resource selectors or not")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Boolean labelWithoutSelector;

    public Boolean getLabelWithoutSelector() {
        return labelWithoutSelector;
    }

    public void setLabelWithoutSelector(Boolean labelWithoutSelector) {
        this.labelWithoutSelector = labelWithoutSelector;
    }

    /**
     * NamePrefix is a prefix appended to resources for Kustomize apps
     */
    @com.fasterxml.jackson.annotation.JsonProperty("namePrefix")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("NamePrefix is a prefix appended to resources for Kustomize apps")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String namePrefix;

    public String getNamePrefix() {
        return namePrefix;
    }

    public void setNamePrefix(String namePrefix) {
        this.namePrefix = namePrefix;
    }

    /**
     * NameSuffix is a suffix appended to resources for Kustomize apps
     */
    @com.fasterxml.jackson.annotation.JsonProperty("nameSuffix")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("NameSuffix is a suffix appended to resources for Kustomize apps")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String nameSuffix;

    public String getNameSuffix() {
        return nameSuffix;
    }

    public void setNameSuffix(String nameSuffix) {
        this.nameSuffix = nameSuffix;
    }

    /**
     * Namespace sets the namespace that Kustomize adds to all resources
     */
    @com.fasterxml.jackson.annotation.JsonProperty("namespace")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Namespace sets the namespace that Kustomize adds to all resources")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String namespace;

    public String getNamespace() {
        return namespace;
    }

    public void setNamespace(String namespace) {
        this.namespace = namespace;
    }

    /**
     * Patches is a list of Kustomize patches
     */
    @com.fasterxml.jackson.annotation.JsonProperty("patches")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Patches is a list of Kustomize patches")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private java.util.List<io.quarkiverse.argocd.v1alpha1.application.operation.sync.sources.kustomize.Patches> patches;

    public java.util.List<io.quarkiverse.argocd.v1alpha1.application.operation.sync.sources.kustomize.Patches> getPatches() {
        return patches;
    }

    public void setPatches(
            java.util.List<io.quarkiverse.argocd.v1alpha1.application.operation.sync.sources.kustomize.Patches> patches) {
        this.patches = patches;
    }

    /**
     * Replicas is a list of Kustomize Replicas override specifications
     */
    @com.fasterxml.jackson.annotation.JsonProperty("replicas")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Replicas is a list of Kustomize Replicas override specifications")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private java.util.List<io.quarkiverse.argocd.v1alpha1.application.operation.sync.sources.kustomize.Replicas> replicas;

    public java.util.List<io.quarkiverse.argocd.v1alpha1.application.operation.sync.sources.kustomize.Replicas> getReplicas() {
        return replicas;
    }

    public void setReplicas(
            java.util.List<io.quarkiverse.argocd.v1alpha1.application.operation.sync.sources.kustomize.Replicas> replicas) {
        this.replicas = replicas;
    }

    /**
     * Version controls which version of Kustomize to use for rendering manifests
     */
    @com.fasterxml.jackson.annotation.JsonProperty("version")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Version controls which version of Kustomize to use for rendering manifests")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String version;

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }
}
