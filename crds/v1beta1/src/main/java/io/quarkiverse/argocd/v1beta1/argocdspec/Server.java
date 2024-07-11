package io.quarkiverse.argocd.v1beta1.argocdspec;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({ "autoscale", "enabled", "env", "extraCommandArgs", "grpc", "host",
        "ingress", "insecure", "logFormat", "logLevel", "replicas", "resources", "route", "service" })
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
public class Server implements io.fabric8.kubernetes.api.builder.Editable<ServerBuilder>,
        io.fabric8.kubernetes.api.model.KubernetesResource {

    @java.lang.Override
    public ServerBuilder edit() {
        return new ServerBuilder(this);
    }

    /**
     * Autoscale defines the autoscale options for the Argo CD Server component.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("autoscale")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Autoscale defines the autoscale options for the Argo CD Server component.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.quarkiverse.argocd.v1beta1.argocdspec.server.Autoscale autoscale;

    public io.quarkiverse.argocd.v1beta1.argocdspec.server.Autoscale getAutoscale() {
        return autoscale;
    }

    public void setAutoscale(io.quarkiverse.argocd.v1beta1.argocdspec.server.Autoscale autoscale) {
        this.autoscale = autoscale;
    }

    /**
     * Enabled is the flag to enable ArgoCD Server during ArgoCD installation. (optional, default `true`)
     */
    @com.fasterxml.jackson.annotation.JsonProperty("enabled")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Enabled is the flag to enable ArgoCD Server during ArgoCD installation. (optional, default `true`)")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Boolean enabled;

    public Boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    /**
     * Env lets you specify environment for API server pods
     */
    @com.fasterxml.jackson.annotation.JsonProperty("env")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Env lets you specify environment for API server pods")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private java.util.List<io.quarkiverse.argocd.v1beta1.argocdspec.server.Env> env;

    public java.util.List<io.quarkiverse.argocd.v1beta1.argocdspec.server.Env> getEnv() {
        return env;
    }

    public void setEnv(java.util.List<io.quarkiverse.argocd.v1beta1.argocdspec.server.Env> env) {
        this.env = env;
    }

    /**
     * Extra Command arguments that would append to the Argo CD server command. ExtraCommandArgs will not be added, if one of
     * these commands is already part of the server command with same or different value.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("extraCommandArgs")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Extra Command arguments that would append to the Argo CD server command. ExtraCommandArgs will not be added, if one of these commands is already part of the server command with same or different value.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private java.util.List<String> extraCommandArgs;

    public java.util.List<String> getExtraCommandArgs() {
        return extraCommandArgs;
    }

    public void setExtraCommandArgs(java.util.List<String> extraCommandArgs) {
        this.extraCommandArgs = extraCommandArgs;
    }

    /**
     * GRPC defines the state for the Argo CD Server GRPC options.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("grpc")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("GRPC defines the state for the Argo CD Server GRPC options.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.quarkiverse.argocd.v1beta1.argocdspec.server.Grpc grpc;

    public io.quarkiverse.argocd.v1beta1.argocdspec.server.Grpc getGrpc() {
        return grpc;
    }

    public void setGrpc(io.quarkiverse.argocd.v1beta1.argocdspec.server.Grpc grpc) {
        this.grpc = grpc;
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
     * Ingress defines the desired state for an Ingress for the Argo CD Server component.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("ingress")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Ingress defines the desired state for an Ingress for the Argo CD Server component.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.quarkiverse.argocd.v1beta1.argocdspec.server.Ingress ingress;

    public io.quarkiverse.argocd.v1beta1.argocdspec.server.Ingress getIngress() {
        return ingress;
    }

    public void setIngress(io.quarkiverse.argocd.v1beta1.argocdspec.server.Ingress ingress) {
        this.ingress = ingress;
    }

    /**
     * Insecure toggles the insecure flag.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("insecure")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Insecure toggles the insecure flag.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Boolean insecure;

    public Boolean getInsecure() {
        return insecure;
    }

    public void setInsecure(Boolean insecure) {
        this.insecure = insecure;
    }

    /**
     * LogFormat refers to the log level to be used by the ArgoCD Server component. Defaults to ArgoCDDefaultLogFormat if not
     * configured. Valid options are text or json.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("logFormat")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("LogFormat refers to the log level to be used by the ArgoCD Server component. Defaults to ArgoCDDefaultLogFormat if not configured. Valid options are text or json.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String logFormat;

    public String getLogFormat() {
        return logFormat;
    }

    public void setLogFormat(String logFormat) {
        this.logFormat = logFormat;
    }

    /**
     * LogLevel refers to the log level to be used by the ArgoCD Server component. Defaults to ArgoCDDefaultLogLevel if not set.
     * Valid options are debug, info, error, and warn.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("logLevel")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("LogLevel refers to the log level to be used by the ArgoCD Server component. Defaults to ArgoCDDefaultLogLevel if not set.  Valid options are debug, info, error, and warn.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String logLevel;

    public String getLogLevel() {
        return logLevel;
    }

    public void setLogLevel(String logLevel) {
        this.logLevel = logLevel;
    }

    /**
     * Replicas defines the number of replicas for argocd-server. Default is nil. Value should be greater than or equal to 0.
     * Value will be ignored if Autoscaler is enabled.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("replicas")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Replicas defines the number of replicas for argocd-server. Default is nil. Value should be greater than or equal to 0. Value will be ignored if Autoscaler is enabled.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Integer replicas;

    public Integer getReplicas() {
        return replicas;
    }

    public void setReplicas(Integer replicas) {
        this.replicas = replicas;
    }

    /**
     * Resources defines the Compute Resources required by the container for the Argo CD server component.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("resources")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Resources defines the Compute Resources required by the container for the Argo CD server component.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.quarkiverse.argocd.v1beta1.argocdspec.server.Resources resources;

    public io.quarkiverse.argocd.v1beta1.argocdspec.server.Resources getResources() {
        return resources;
    }

    public void setResources(io.quarkiverse.argocd.v1beta1.argocdspec.server.Resources resources) {
        this.resources = resources;
    }

    /**
     * Route defines the desired state for an OpenShift Route for the Argo CD Server component.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("route")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Route defines the desired state for an OpenShift Route for the Argo CD Server component.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.quarkiverse.argocd.v1beta1.argocdspec.server.Route route;

    public io.quarkiverse.argocd.v1beta1.argocdspec.server.Route getRoute() {
        return route;
    }

    public void setRoute(io.quarkiverse.argocd.v1beta1.argocdspec.server.Route route) {
        this.route = route;
    }

    /**
     * Service defines the options for the Service backing the ArgoCD Server component.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("service")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Service defines the options for the Service backing the ArgoCD Server component.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.quarkiverse.argocd.v1beta1.argocdspec.server.Service service;

    public io.quarkiverse.argocd.v1beta1.argocdspec.server.Service getService() {
        return service;
    }

    public void setService(io.quarkiverse.argocd.v1beta1.argocdspec.server.Service service) {
        this.service = service;
    }
}
