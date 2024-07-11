package io.quarkiverse.argocd.v1beta1.argocdspec.repo.volumes.ephemeral.volumeclaimtemplate.spec.selector;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({ "key", "operator", "values" })
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
public class MatchExpressions implements io.fabric8.kubernetes.api.builder.Editable<MatchExpressionsBuilder>,
        io.fabric8.kubernetes.api.model.KubernetesResource {

    @java.lang.Override
    public MatchExpressionsBuilder edit() {
        return new MatchExpressionsBuilder(this);
    }

    /**
     * key is the label key that the selector applies to.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("key")
    @io.fabric8.generator.annotation.Required()
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("key is the label key that the selector applies to.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String key;

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    /**
     * operator represents a key's relationship to a set of values. Valid operators are In, NotIn, Exists and DoesNotExist.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("operator")
    @io.fabric8.generator.annotation.Required()
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("operator represents a key's relationship to a set of values. Valid operators are In, NotIn, Exists and DoesNotExist.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String operator;

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    /**
     * values is an array of string values. If the operator is In or NotIn, the values array must be non-empty. If the operator
     * is Exists or DoesNotExist, the values array must be empty. This array is replaced during a strategic merge patch.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("values")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("values is an array of string values. If the operator is In or NotIn, the values array must be non-empty. If the operator is Exists or DoesNotExist, the values array must be empty. This array is replaced during a strategic merge patch.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private java.util.List<String> values;

    public java.util.List<String> getValues() {
        return values;
    }

    public void setValues(java.util.List<String> values) {
        this.values = values;
    }
}
