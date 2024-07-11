package io.quarkiverse.argocd.v1beta1.argocdspec;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({ "all", "resourceIdentifiers" })
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
public class ResourceIgnoreDifferences implements io.fabric8.kubernetes.api.builder.Editable<ResourceIgnoreDifferencesBuilder>,
        io.fabric8.kubernetes.api.model.KubernetesResource {

    @java.lang.Override
    public ResourceIgnoreDifferencesBuilder edit() {
        return new ResourceIgnoreDifferencesBuilder(this);
    }

    @com.fasterxml.jackson.annotation.JsonProperty("all")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.quarkiverse.argocd.v1beta1.argocdspec.resourceignoredifferences.All all;

    public io.quarkiverse.argocd.v1beta1.argocdspec.resourceignoredifferences.All getAll() {
        return all;
    }

    public void setAll(io.quarkiverse.argocd.v1beta1.argocdspec.resourceignoredifferences.All all) {
        this.all = all;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("resourceIdentifiers")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private java.util.List<io.quarkiverse.argocd.v1beta1.argocdspec.resourceignoredifferences.ResourceIdentifiers> resourceIdentifiers;

    public java.util.List<io.quarkiverse.argocd.v1beta1.argocdspec.resourceignoredifferences.ResourceIdentifiers> getResourceIdentifiers() {
        return resourceIdentifiers;
    }

    public void setResourceIdentifiers(
            java.util.List<io.quarkiverse.argocd.v1beta1.argocdspec.resourceignoredifferences.ResourceIdentifiers> resourceIdentifiers) {
        this.resourceIdentifiers = resourceIdentifiers;
    }
}
