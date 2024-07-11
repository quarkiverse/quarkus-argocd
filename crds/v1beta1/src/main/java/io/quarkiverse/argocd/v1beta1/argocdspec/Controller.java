package io.quarkiverse.argocd.v1beta1.argocdspec;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({ "appSync", "enabled", "env", "logFormat", "logLevel", "parallelismLimit",
        "processors", "resources", "sharding" })
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
public class Controller implements io.fabric8.kubernetes.api.builder.Editable<ControllerBuilder>,
        io.fabric8.kubernetes.api.model.KubernetesResource {

    @java.lang.Override
    public ControllerBuilder edit() {
        return new ControllerBuilder(this);
    }

    /**
     * AppSync is used to control the sync frequency, by default the ArgoCD controller polls Git every 3m.
     * Set this to a duration, e.g. 10m or 600s to control the synchronisation frequency.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("appSync")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("AppSync is used to control the sync frequency, by default the ArgoCD controller polls Git every 3m. \n Set this to a duration, e.g. 10m or 600s to control the synchronisation frequency.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String appSync;

    public String getAppSync() {
        return appSync;
    }

    public void setAppSync(String appSync) {
        this.appSync = appSync;
    }

    /**
     * Enabled is the flag to enable the Application Controller during ArgoCD installation. (optional, default `true`)
     */
    @com.fasterxml.jackson.annotation.JsonProperty("enabled")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Enabled is the flag to enable the Application Controller during ArgoCD installation. (optional, default `true`)")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Boolean enabled;

    public Boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    /**
     * Env lets you specify environment for application controller pods
     */
    @com.fasterxml.jackson.annotation.JsonProperty("env")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Env lets you specify environment for application controller pods")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private java.util.List<io.quarkiverse.argocd.v1beta1.argocdspec.controller.Env> env;

    public java.util.List<io.quarkiverse.argocd.v1beta1.argocdspec.controller.Env> getEnv() {
        return env;
    }

    public void setEnv(java.util.List<io.quarkiverse.argocd.v1beta1.argocdspec.controller.Env> env) {
        this.env = env;
    }

    /**
     * LogFormat refers to the log format used by the Application Controller component. Defaults to ArgoCDDefaultLogFormat if
     * not configured. Valid options are text or json.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("logFormat")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("LogFormat refers to the log format used by the Application Controller component. Defaults to ArgoCDDefaultLogFormat if not configured. Valid options are text or json.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String logFormat;

    public String getLogFormat() {
        return logFormat;
    }

    public void setLogFormat(String logFormat) {
        this.logFormat = logFormat;
    }

    /**
     * LogLevel refers to the log level used by the Application Controller component. Defaults to ArgoCDDefaultLogLevel if not
     * configured. Valid options are debug, info, error, and warn.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("logLevel")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("LogLevel refers to the log level used by the Application Controller component. Defaults to ArgoCDDefaultLogLevel if not configured. Valid options are debug, info, error, and warn.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String logLevel;

    public String getLogLevel() {
        return logLevel;
    }

    public void setLogLevel(String logLevel) {
        this.logLevel = logLevel;
    }

    /**
     * ParallelismLimit defines the limit for parallel kubectl operations
     */
    @com.fasterxml.jackson.annotation.JsonProperty("parallelismLimit")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("ParallelismLimit defines the limit for parallel kubectl operations")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Integer parallelismLimit;

    public Integer getParallelismLimit() {
        return parallelismLimit;
    }

    public void setParallelismLimit(Integer parallelismLimit) {
        this.parallelismLimit = parallelismLimit;
    }

    /**
     * Processors contains the options for the Application Controller processors.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("processors")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Processors contains the options for the Application Controller processors.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.quarkiverse.argocd.v1beta1.argocdspec.controller.Processors processors;

    public io.quarkiverse.argocd.v1beta1.argocdspec.controller.Processors getProcessors() {
        return processors;
    }

    public void setProcessors(io.quarkiverse.argocd.v1beta1.argocdspec.controller.Processors processors) {
        this.processors = processors;
    }

    /**
     * Resources defines the Compute Resources required by the container for the Application Controller.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("resources")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Resources defines the Compute Resources required by the container for the Application Controller.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.quarkiverse.argocd.v1beta1.argocdspec.controller.Resources resources;

    public io.quarkiverse.argocd.v1beta1.argocdspec.controller.Resources getResources() {
        return resources;
    }

    public void setResources(io.quarkiverse.argocd.v1beta1.argocdspec.controller.Resources resources) {
        this.resources = resources;
    }

    /**
     * Sharding contains the options for the Application Controller sharding configuration.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("sharding")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Sharding contains the options for the Application Controller sharding configuration.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.quarkiverse.argocd.v1beta1.argocdspec.controller.Sharding sharding;

    public io.quarkiverse.argocd.v1beta1.argocdspec.controller.Sharding getSharding() {
        return sharding;
    }

    public void setSharding(io.quarkiverse.argocd.v1beta1.argocdspec.controller.Sharding sharding) {
        this.sharding = sharding;
    }
}
