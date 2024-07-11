package io.quarkiverse.argocd.v1beta1.argocdspec.applicationset.webhookserver.ingress;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({ "hosts", "secretName" })
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
     * hosts is a list of hosts included in the TLS certificate. The values in this list must match the name/s used in the
     * tlsSecret. Defaults to the wildcard host setting for the loadbalancer controller fulfilling this Ingress, if left
     * unspecified.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("hosts")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("hosts is a list of hosts included in the TLS certificate. The values in this list must match the name/s used in the tlsSecret. Defaults to the wildcard host setting for the loadbalancer controller fulfilling this Ingress, if left unspecified.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private java.util.List<String> hosts;

    public java.util.List<String> getHosts() {
        return hosts;
    }

    public void setHosts(java.util.List<String> hosts) {
        this.hosts = hosts;
    }

    /**
     * secretName is the name of the secret used to terminate TLS traffic on port 443. Field is left optional to allow TLS
     * routing based on SNI hostname alone. If the SNI host in a listener conflicts with the "Host" header field used by an
     * IngressRule, the SNI host is used for termination and value of the "Host" header is used for routing.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("secretName")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("secretName is the name of the secret used to terminate TLS traffic on port 443. Field is left optional to allow TLS routing based on SNI hostname alone. If the SNI host in a listener conflicts with the \"Host\" header field used by an IngressRule, the SNI host is used for termination and value of the \"Host\" header is used for routing.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String secretName;

    public String getSecretName() {
        return secretName;
    }

    public void setSecretName(String secretName) {
        this.secretName = secretName;
    }
}
