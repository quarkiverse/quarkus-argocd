package io.quarkiverse.argocd.v1beta1.argocdspec;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({ "enabled", "host", "image", "ingress", "resources", "route", "size",
        "version" })
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
public class Grafana implements io.fabric8.kubernetes.api.builder.Editable<GrafanaBuilder>,
        io.fabric8.kubernetes.api.model.KubernetesResource {

    @java.lang.Override
    public GrafanaBuilder edit() {
        return new GrafanaBuilder(this);
    }

    /**
     * Enabled will toggle Grafana support globally for ArgoCD.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("enabled")
    @io.fabric8.generator.annotation.Required()
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Enabled will toggle Grafana support globally for ArgoCD.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Boolean enabled;

    public Boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    /**
     * Host is the hostname to use for Ingress/Route resources.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("host")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Host is the hostname to use for Ingress/Route resources.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String host;

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    /**
     * Image is the Grafana container image.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("image")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Image is the Grafana container image.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String image;

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    /**
     * Ingress defines the desired state for an Ingress for the Grafana component.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("ingress")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Ingress defines the desired state for an Ingress for the Grafana component.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.quarkiverse.argocd.v1beta1.argocdspec.grafana.Ingress ingress;

    public io.quarkiverse.argocd.v1beta1.argocdspec.grafana.Ingress getIngress() {
        return ingress;
    }

    public void setIngress(io.quarkiverse.argocd.v1beta1.argocdspec.grafana.Ingress ingress) {
        this.ingress = ingress;
    }

    /**
     * Resources defines the Compute Resources required by the container for Grafana.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("resources")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Resources defines the Compute Resources required by the container for Grafana.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.quarkiverse.argocd.v1beta1.argocdspec.grafana.Resources resources;

    public io.quarkiverse.argocd.v1beta1.argocdspec.grafana.Resources getResources() {
        return resources;
    }

    public void setResources(io.quarkiverse.argocd.v1beta1.argocdspec.grafana.Resources resources) {
        this.resources = resources;
    }

    /**
     * Route defines the desired state for an OpenShift Route for the Grafana component.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("route")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Route defines the desired state for an OpenShift Route for the Grafana component.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.quarkiverse.argocd.v1beta1.argocdspec.grafana.Route route;

    public io.quarkiverse.argocd.v1beta1.argocdspec.grafana.Route getRoute() {
        return route;
    }

    public void setRoute(io.quarkiverse.argocd.v1beta1.argocdspec.grafana.Route route) {
        this.route = route;
    }

    /**
     * Size is the replica count for the Grafana Deployment.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("size")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Size is the replica count for the Grafana Deployment.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Integer size;

    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    /**
     * Version is the Grafana container image tag.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("version")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Version is the Grafana container image tag.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String version;

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }
}
