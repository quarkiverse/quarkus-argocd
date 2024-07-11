package io.quarkiverse.argocd.v1beta1.argocdspec.repo.volumes.ephemeral.volumeclaimtemplate.spec;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({ "matchExpressions", "matchLabels" })
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
public class Selector implements io.fabric8.kubernetes.api.builder.Editable<SelectorBuilder>,
        io.fabric8.kubernetes.api.model.KubernetesResource {

    @java.lang.Override
    public SelectorBuilder edit() {
        return new SelectorBuilder(this);
    }

    /**
     * matchExpressions is a list of label selector requirements. The requirements are ANDed.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("matchExpressions")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("matchExpressions is a list of label selector requirements. The requirements are ANDed.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private java.util.List<io.quarkiverse.argocd.v1beta1.argocdspec.repo.volumes.ephemeral.volumeclaimtemplate.spec.selector.MatchExpressions> matchExpressions;

    public java.util.List<io.quarkiverse.argocd.v1beta1.argocdspec.repo.volumes.ephemeral.volumeclaimtemplate.spec.selector.MatchExpressions> getMatchExpressions() {
        return matchExpressions;
    }

    public void setMatchExpressions(
            java.util.List<io.quarkiverse.argocd.v1beta1.argocdspec.repo.volumes.ephemeral.volumeclaimtemplate.spec.selector.MatchExpressions> matchExpressions) {
        this.matchExpressions = matchExpressions;
    }

    /**
     * matchLabels is a map of {key,value} pairs. A single {key,value} in the matchLabels map is equivalent to an element of
     * matchExpressions, whose key field is "key", the operator is "In", and the values array contains only "value". The
     * requirements are ANDed.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("matchLabels")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("matchLabels is a map of {key,value} pairs. A single {key,value} in the matchLabels map is equivalent to an element of matchExpressions, whose key field is \"key\", the operator is \"In\", and the values array contains only \"value\". The requirements are ANDed.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private java.util.Map<java.lang.String, String> matchLabels;

    public java.util.Map<java.lang.String, String> getMatchLabels() {
        return matchLabels;
    }

    public void setMatchLabels(java.util.Map<java.lang.String, String> matchLabels) {
        this.matchLabels = matchLabels;
    }
}
