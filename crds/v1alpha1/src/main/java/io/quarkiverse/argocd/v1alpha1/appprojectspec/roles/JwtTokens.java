package io.quarkiverse.argocd.v1alpha1.appprojectspec.roles;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({ "exp", "iat", "id" })
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
public class JwtTokens implements io.fabric8.kubernetes.api.builder.Editable<JwtTokensBuilder>,
        io.fabric8.kubernetes.api.model.KubernetesResource {

    @java.lang.Override
    public JwtTokensBuilder edit() {
        return new JwtTokensBuilder(this);
    }

    @com.fasterxml.jackson.annotation.JsonProperty("exp")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Long exp;

    public Long getExp() {
        return exp;
    }

    public void setExp(Long exp) {
        this.exp = exp;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("iat")
    @io.fabric8.generator.annotation.Required()
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Long iat;

    public Long getIat() {
        return iat;
    }

    public void setIat(Long iat) {
        this.iat = iat;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("id")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
