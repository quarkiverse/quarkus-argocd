package io.quarkiverse.argocd.v1beta1.argocdspec.server;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({ "annotations", "enabled", "labels", "path", "tls", "wildcardPolicy" })
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
public class Route implements io.fabric8.kubernetes.api.builder.Editable<RouteBuilder>,
        io.fabric8.kubernetes.api.model.KubernetesResource {

    @java.lang.Override
    public RouteBuilder edit() {
        return new RouteBuilder(this);
    }

    /**
     * Annotations is the map of annotations to use for the Route resource.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("annotations")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Annotations is the map of annotations to use for the Route resource.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private java.util.Map<java.lang.String, String> annotations;

    public java.util.Map<java.lang.String, String> getAnnotations() {
        return annotations;
    }

    public void setAnnotations(java.util.Map<java.lang.String, String> annotations) {
        this.annotations = annotations;
    }

    /**
     * Enabled will toggle the creation of the OpenShift Route.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("enabled")
    @io.fabric8.generator.annotation.Required()
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Enabled will toggle the creation of the OpenShift Route.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Boolean enabled;

    public Boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    /**
     * Labels is the map of labels to use for the Route resource
     */
    @com.fasterxml.jackson.annotation.JsonProperty("labels")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Labels is the map of labels to use for the Route resource")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private java.util.Map<java.lang.String, String> labels;

    public java.util.Map<java.lang.String, String> getLabels() {
        return labels;
    }

    public void setLabels(java.util.Map<java.lang.String, String> labels) {
        this.labels = labels;
    }

    /**
     * Path the router watches for, to route traffic for to the service.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("path")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Path the router watches for, to route traffic for to the service.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String path;

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    /**
     * TLS provides the ability to configure certificates and termination for the Route.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("tls")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("TLS provides the ability to configure certificates and termination for the Route.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.quarkiverse.argocd.v1beta1.argocdspec.server.route.Tls tls;

    public io.quarkiverse.argocd.v1beta1.argocdspec.server.route.Tls getTls() {
        return tls;
    }

    public void setTls(io.quarkiverse.argocd.v1beta1.argocdspec.server.route.Tls tls) {
        this.tls = tls;
    }

    /**
     * WildcardPolicy if any for the route. Currently only 'Subdomain' or 'None' is allowed.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("wildcardPolicy")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("WildcardPolicy if any for the route. Currently only 'Subdomain' or 'None' is allowed.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String wildcardPolicy;

    public String getWildcardPolicy() {
        return wildcardPolicy;
    }

    public void setWildcardPolicy(String wildcardPolicy) {
        this.wildcardPolicy = wildcardPolicy;
    }
}
