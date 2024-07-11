package io.quarkiverse.argocd.v1beta1.argocdspec;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({ "ca", "initialCerts" })
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
public class Tls
        implements io.fabric8.kubernetes.api.builder.Editable<TlsBuilder>, io.fabric8.kubernetes.api.model.KubernetesResource {

    @java.lang.Override
    public TlsBuilder edit() {
        return new TlsBuilder(this);
    }

    /**
     * CA defines the CA options.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("ca")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("CA defines the CA options.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.quarkiverse.argocd.v1beta1.argocdspec.tls.Ca ca;

    public io.quarkiverse.argocd.v1beta1.argocdspec.tls.Ca getCa() {
        return ca;
    }

    public void setCa(io.quarkiverse.argocd.v1beta1.argocdspec.tls.Ca ca) {
        this.ca = ca;
    }

    /**
     * InitialCerts defines custom TLS certificates upon creation of the cluster for connecting Git repositories via HTTPS.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("initialCerts")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("InitialCerts defines custom TLS certificates upon creation of the cluster for connecting Git repositories via HTTPS.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private java.util.Map<java.lang.String, String> initialCerts;

    public java.util.Map<java.lang.String, String> getInitialCerts() {
        return initialCerts;
    }

    public void setInitialCerts(java.util.Map<java.lang.String, String> initialCerts) {
        this.initialCerts = initialCerts;
    }
}
