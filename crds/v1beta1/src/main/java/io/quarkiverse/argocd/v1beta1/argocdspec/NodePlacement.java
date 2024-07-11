package io.quarkiverse.argocd.v1beta1.argocdspec;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({ "nodeSelector", "tolerations" })
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
public class NodePlacement implements io.fabric8.kubernetes.api.builder.Editable<NodePlacementBuilder>,
        io.fabric8.kubernetes.api.model.KubernetesResource {

    @java.lang.Override
    public NodePlacementBuilder edit() {
        return new NodePlacementBuilder(this);
    }

    /**
     * NodeSelector is a field of PodSpec, it is a map of key value pairs used for node selection
     */
    @com.fasterxml.jackson.annotation.JsonProperty("nodeSelector")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("NodeSelector is a field of PodSpec, it is a map of key value pairs used for node selection")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private java.util.Map<java.lang.String, String> nodeSelector;

    public java.util.Map<java.lang.String, String> getNodeSelector() {
        return nodeSelector;
    }

    public void setNodeSelector(java.util.Map<java.lang.String, String> nodeSelector) {
        this.nodeSelector = nodeSelector;
    }

    /**
     * Tolerations allow the pods to schedule onto nodes with matching taints
     */
    @com.fasterxml.jackson.annotation.JsonProperty("tolerations")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Tolerations allow the pods to schedule onto nodes with matching taints")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private java.util.List<io.quarkiverse.argocd.v1beta1.argocdspec.nodeplacement.Tolerations> tolerations;

    public java.util.List<io.quarkiverse.argocd.v1beta1.argocdspec.nodeplacement.Tolerations> getTolerations() {
        return tolerations;
    }

    public void setTolerations(java.util.List<io.quarkiverse.argocd.v1beta1.argocdspec.nodeplacement.Tolerations> tolerations) {
        this.tolerations = tolerations;
    }
}
