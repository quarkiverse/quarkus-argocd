package io.quarkiverse.argocd.v1beta1.argocdspec.grafana;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({ "annotations", "enabled", "ingressClassName", "path", "tls" })
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
public class Ingress implements io.fabric8.kubernetes.api.builder.Editable<IngressBuilder>,
        io.fabric8.kubernetes.api.model.KubernetesResource {

    @java.lang.Override
    public IngressBuilder edit() {
        return new IngressBuilder(this);
    }

    /**
     * Annotations is the map of annotations to apply to the Ingress.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("annotations")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Annotations is the map of annotations to apply to the Ingress.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private java.util.Map<java.lang.String, String> annotations;

    public java.util.Map<java.lang.String, String> getAnnotations() {
        return annotations;
    }

    public void setAnnotations(java.util.Map<java.lang.String, String> annotations) {
        this.annotations = annotations;
    }

    /**
     * Enabled will toggle the creation of the Ingress.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("enabled")
    @io.fabric8.generator.annotation.Required()
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Enabled will toggle the creation of the Ingress.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Boolean enabled;

    public Boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    /**
     * IngressClassName for the Ingress resource.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("ingressClassName")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("IngressClassName for the Ingress resource.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String ingressClassName;

    public String getIngressClassName() {
        return ingressClassName;
    }

    public void setIngressClassName(String ingressClassName) {
        this.ingressClassName = ingressClassName;
    }

    /**
     * Path used for the Ingress resource.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("path")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Path used for the Ingress resource.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String path;

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    /**
     * TLS configuration. Currently the Ingress only supports a single TLS port, 443. If multiple members of this list specify
     * different hosts, they will be multiplexed on the same port according to the hostname specified through the SNI TLS
     * extension, if the ingress controller fulfilling the ingress supports SNI.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("tls")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("TLS configuration. Currently the Ingress only supports a single TLS port, 443. If multiple members of this list specify different hosts, they will be multiplexed on the same port according to the hostname specified through the SNI TLS extension, if the ingress controller fulfilling the ingress supports SNI.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private java.util.List<io.quarkiverse.argocd.v1beta1.argocdspec.grafana.ingress.Tls> tls;

    public java.util.List<io.quarkiverse.argocd.v1beta1.argocdspec.grafana.ingress.Tls> getTls() {
        return tls;
    }

    public void setTls(java.util.List<io.quarkiverse.argocd.v1beta1.argocdspec.grafana.ingress.Tls> tls) {
        this.tls = tls;
    }
}
