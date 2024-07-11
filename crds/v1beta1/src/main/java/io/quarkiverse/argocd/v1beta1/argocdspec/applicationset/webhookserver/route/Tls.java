package io.quarkiverse.argocd.v1beta1.argocdspec.applicationset.webhookserver.route;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({ "caCertificate", "certificate", "destinationCACertificate",
        "insecureEdgeTerminationPolicy", "key", "termination" })
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
     * caCertificate provides the cert authority certificate contents
     */
    @com.fasterxml.jackson.annotation.JsonProperty("caCertificate")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("caCertificate provides the cert authority certificate contents")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String caCertificate;

    public String getCaCertificate() {
        return caCertificate;
    }

    public void setCaCertificate(String caCertificate) {
        this.caCertificate = caCertificate;
    }

    /**
     * certificate provides certificate contents
     */
    @com.fasterxml.jackson.annotation.JsonProperty("certificate")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("certificate provides certificate contents")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String certificate;

    public String getCertificate() {
        return certificate;
    }

    public void setCertificate(String certificate) {
        this.certificate = certificate;
    }

    /**
     * destinationCACertificate provides the contents of the ca certificate of the final destination. When using reencrypt
     * termination this file should be provided in order to have routers use it for health checks on the secure connection. If
     * this field is not specified, the router may provide its own destination CA and perform hostname validation using the
     * short service name (service.namespace.svc), which allows infrastructure generated certificates to automatically verify.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("destinationCACertificate")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("destinationCACertificate provides the contents of the ca certificate of the final destination.  When using reencrypt termination this file should be provided in order to have routers use it for health checks on the secure connection. If this field is not specified, the router may provide its own destination CA and perform hostname validation using the short service name (service.namespace.svc), which allows infrastructure generated certificates to automatically verify.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String destinationCACertificate;

    public String getDestinationCACertificate() {
        return destinationCACertificate;
    }

    public void setDestinationCACertificate(String destinationCACertificate) {
        this.destinationCACertificate = destinationCACertificate;
    }

    /**
     * insecureEdgeTerminationPolicy indicates the desired behavior for insecure connections to a route. While each router may
     * make its own decisions on which ports to expose, this is normally port 80.
     * Allow - traffic is sent to the server on the insecure port (default) * Disable - no traffic is allowed on the insecure
     * port. * Redirect - clients are redirected to the secure port.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("insecureEdgeTerminationPolicy")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("insecureEdgeTerminationPolicy indicates the desired behavior for insecure connections to a route. While each router may make its own decisions on which ports to expose, this is normally port 80. \n * Allow - traffic is sent to the server on the insecure port (default) * Disable - no traffic is allowed on the insecure port. * Redirect - clients are redirected to the secure port.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String insecureEdgeTerminationPolicy;

    public String getInsecureEdgeTerminationPolicy() {
        return insecureEdgeTerminationPolicy;
    }

    public void setInsecureEdgeTerminationPolicy(String insecureEdgeTerminationPolicy) {
        this.insecureEdgeTerminationPolicy = insecureEdgeTerminationPolicy;
    }

    /**
     * key provides key file contents
     */
    @com.fasterxml.jackson.annotation.JsonProperty("key")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("key provides key file contents")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String key;

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    /**
     * termination indicates termination type.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("termination")
    @io.fabric8.generator.annotation.Required()
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("termination indicates termination type.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String termination;

    public String getTermination() {
        return termination;
    }

    public void setTermination(String termination) {
        this.termination = termination;
    }
}
