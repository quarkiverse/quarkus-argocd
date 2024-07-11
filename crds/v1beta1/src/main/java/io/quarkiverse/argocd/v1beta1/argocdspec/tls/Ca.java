package io.quarkiverse.argocd.v1beta1.argocdspec.tls;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({ "configMapName", "secretName" })
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
public class Ca
        implements io.fabric8.kubernetes.api.builder.Editable<CaBuilder>, io.fabric8.kubernetes.api.model.KubernetesResource {

    @java.lang.Override
    public CaBuilder edit() {
        return new CaBuilder(this);
    }

    /**
     * ConfigMapName is the name of the ConfigMap containing the CA Certificate.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("configMapName")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("ConfigMapName is the name of the ConfigMap containing the CA Certificate.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String configMapName;

    public String getConfigMapName() {
        return configMapName;
    }

    public void setConfigMapName(String configMapName) {
        this.configMapName = configMapName;
    }

    /**
     * SecretName is the name of the Secret containing the CA Certificate and Key.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("secretName")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("SecretName is the name of the Secret containing the CA Certificate and Key.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String secretName;

    public String getSecretName() {
        return secretName;
    }

    public void setSecretName(String secretName) {
        this.secretName = secretName;
    }
}
