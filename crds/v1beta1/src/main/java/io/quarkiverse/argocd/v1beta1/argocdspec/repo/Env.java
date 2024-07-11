package io.quarkiverse.argocd.v1beta1.argocdspec.repo;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({ "name", "value", "valueFrom" })
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
public class Env
        implements io.fabric8.kubernetes.api.builder.Editable<EnvBuilder>, io.fabric8.kubernetes.api.model.KubernetesResource {

    @java.lang.Override
    public EnvBuilder edit() {
        return new EnvBuilder(this);
    }

    /**
     * Name of the environment variable. Must be a C_IDENTIFIER.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    @io.fabric8.generator.annotation.Required()
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Name of the environment variable. Must be a C_IDENTIFIER.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    /**
     * Variable references $(VAR_NAME) are expanded using the previously defined environment variables in the container and any
     * service environment variables. If a variable cannot be resolved, the reference in the input string will be unchanged.
     * Double $$ are reduced to a single $, which allows for escaping the $(VAR_NAME) syntax: i.e. "$$(VAR_NAME)" will produce
     * the string literal "$(VAR_NAME)". Escaped references will never be expanded, regardless of whether the variable exists or
     * not. Defaults to "".
     */
    @com.fasterxml.jackson.annotation.JsonProperty("value")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Variable references $(VAR_NAME) are expanded using the previously defined environment variables in the container and any service environment variables. If a variable cannot be resolved, the reference in the input string will be unchanged. Double $$ are reduced to a single $, which allows for escaping the $(VAR_NAME) syntax: i.e. \"$$(VAR_NAME)\" will produce the string literal \"$(VAR_NAME)\". Escaped references will never be expanded, regardless of whether the variable exists or not. Defaults to \"\".")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String value;

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    /**
     * Source for the environment variable's value. Cannot be used if value is not empty.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("valueFrom")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Source for the environment variable's value. Cannot be used if value is not empty.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.quarkiverse.argocd.v1beta1.argocdspec.repo.env.ValueFrom valueFrom;

    public io.quarkiverse.argocd.v1beta1.argocdspec.repo.env.ValueFrom getValueFrom() {
        return valueFrom;
    }

    public void setValueFrom(io.quarkiverse.argocd.v1beta1.argocdspec.repo.env.ValueFrom valueFrom) {
        this.valueFrom = valueFrom;
    }
}
