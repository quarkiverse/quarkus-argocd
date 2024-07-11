package io.quarkiverse.argocd.v1beta1.argocdspec.repo.volumes.ephemeral;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({ "metadata", "spec" })
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
public class VolumeClaimTemplate implements io.fabric8.kubernetes.api.builder.Editable<VolumeClaimTemplateBuilder>,
        io.fabric8.kubernetes.api.model.KubernetesResource {

    @java.lang.Override
    public VolumeClaimTemplateBuilder edit() {
        return new VolumeClaimTemplateBuilder(this);
    }

    /**
     * May contain labels and annotations that will be copied into the PVC when creating it. No other fields are allowed and
     * will be rejected during validation.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("metadata")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("May contain labels and annotations that will be copied into the PVC when creating it. No other fields are allowed and will be rejected during validation.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.quarkiverse.argocd.v1beta1.argocdspec.repo.volumes.ephemeral.volumeclaimtemplate.Metadata metadata;

    public io.quarkiverse.argocd.v1beta1.argocdspec.repo.volumes.ephemeral.volumeclaimtemplate.Metadata getMetadata() {
        return metadata;
    }

    public void setMetadata(
            io.quarkiverse.argocd.v1beta1.argocdspec.repo.volumes.ephemeral.volumeclaimtemplate.Metadata metadata) {
        this.metadata = metadata;
    }

    /**
     * The specification for the PersistentVolumeClaim. The entire content is copied unchanged into the PVC that gets created
     * from this template. The same fields as in a PersistentVolumeClaim are also valid here.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("spec")
    @io.fabric8.generator.annotation.Required()
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("The specification for the PersistentVolumeClaim. The entire content is copied unchanged into the PVC that gets created from this template. The same fields as in a PersistentVolumeClaim are also valid here.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.quarkiverse.argocd.v1beta1.argocdspec.repo.volumes.ephemeral.volumeclaimtemplate.Spec spec;

    public io.quarkiverse.argocd.v1beta1.argocdspec.repo.volumes.ephemeral.volumeclaimtemplate.Spec getSpec() {
        return spec;
    }

    public void setSpec(io.quarkiverse.argocd.v1beta1.argocdspec.repo.volumes.ephemeral.volumeclaimtemplate.Spec spec) {
        this.spec = spec;
    }
}
