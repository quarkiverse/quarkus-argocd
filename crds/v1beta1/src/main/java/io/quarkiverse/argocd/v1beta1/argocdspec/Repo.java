package io.quarkiverse.argocd.v1beta1.argocdspec;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({ "autotls", "enabled", "env", "execTimeout", "extraRepoCommandArgs",
        "image", "initContainers", "logFormat", "logLevel", "mountsatoken", "remote", "replicas", "resources", "serviceaccount",
        "sidecarContainers", "verifytls", "version", "volumeMounts", "volumes" })
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
public class Repo
        implements io.fabric8.kubernetes.api.builder.Editable<RepoBuilder>, io.fabric8.kubernetes.api.model.KubernetesResource {

    @java.lang.Override
    public RepoBuilder edit() {
        return new RepoBuilder(this);
    }

    /**
     * AutoTLS specifies the method to use for automatic TLS configuration for the repo server The value specified here can
     * currently be: - openshift - Use the OpenShift service CA to request TLS config
     */
    @com.fasterxml.jackson.annotation.JsonProperty("autotls")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("AutoTLS specifies the method to use for automatic TLS configuration for the repo server The value specified here can currently be: - openshift - Use the OpenShift service CA to request TLS config")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String autotls;

    public String getAutotls() {
        return autotls;
    }

    public void setAutotls(String autotls) {
        this.autotls = autotls;
    }

    /**
     * Enabled is the flag to enable Repo Server during ArgoCD installation. (optional, default `true`)
     */
    @com.fasterxml.jackson.annotation.JsonProperty("enabled")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Enabled is the flag to enable Repo Server during ArgoCD installation. (optional, default `true`)")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Boolean enabled;

    public Boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    /**
     * Env lets you specify environment for repo server pods
     */
    @com.fasterxml.jackson.annotation.JsonProperty("env")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Env lets you specify environment for repo server pods")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private java.util.List<io.quarkiverse.argocd.v1beta1.argocdspec.repo.Env> env;

    public java.util.List<io.quarkiverse.argocd.v1beta1.argocdspec.repo.Env> getEnv() {
        return env;
    }

    public void setEnv(java.util.List<io.quarkiverse.argocd.v1beta1.argocdspec.repo.Env> env) {
        this.env = env;
    }

    /**
     * ExecTimeout specifies the timeout in seconds for tool execution
     */
    @com.fasterxml.jackson.annotation.JsonProperty("execTimeout")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("ExecTimeout specifies the timeout in seconds for tool execution")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Long execTimeout;

    public Long getExecTimeout() {
        return execTimeout;
    }

    public void setExecTimeout(Long execTimeout) {
        this.execTimeout = execTimeout;
    }

    /**
     * Extra Command arguments allows users to pass command line arguments to repo server workload. They get added to default
     * command line arguments provided by the operator. Please note that the command line arguments provided as part of
     * ExtraRepoCommandArgs will not overwrite the default command line arguments.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("extraRepoCommandArgs")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Extra Command arguments allows users to pass command line arguments to repo server workload. They get added to default command line arguments provided by the operator. Please note that the command line arguments provided as part of ExtraRepoCommandArgs will not overwrite the default command line arguments.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private java.util.List<String> extraRepoCommandArgs;

    public java.util.List<String> getExtraRepoCommandArgs() {
        return extraRepoCommandArgs;
    }

    public void setExtraRepoCommandArgs(java.util.List<String> extraRepoCommandArgs) {
        this.extraRepoCommandArgs = extraRepoCommandArgs;
    }

    /**
     * Image is the ArgoCD Repo Server container image.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("image")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Image is the ArgoCD Repo Server container image.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String image;

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    /**
     * InitContainers defines the list of initialization containers for the repo server deployment
     */
    @com.fasterxml.jackson.annotation.JsonProperty("initContainers")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("InitContainers defines the list of initialization containers for the repo server deployment")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private java.util.List<io.quarkiverse.argocd.v1beta1.argocdspec.repo.InitContainers> initContainers;

    public java.util.List<io.quarkiverse.argocd.v1beta1.argocdspec.repo.InitContainers> getInitContainers() {
        return initContainers;
    }

    public void setInitContainers(java.util.List<io.quarkiverse.argocd.v1beta1.argocdspec.repo.InitContainers> initContainers) {
        this.initContainers = initContainers;
    }

    /**
     * LogFormat describes the log format that should be used by the Repo Server. Defaults to ArgoCDDefaultLogFormat if not
     * configured. Valid options are text or json.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("logFormat")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("LogFormat describes the log format that should be used by the Repo Server. Defaults to ArgoCDDefaultLogFormat if not configured. Valid options are text or json.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String logFormat;

    public String getLogFormat() {
        return logFormat;
    }

    public void setLogFormat(String logFormat) {
        this.logFormat = logFormat;
    }

    /**
     * LogLevel describes the log level that should be used by the Repo Server. Defaults to ArgoCDDefaultLogLevel if not set.
     * Valid options are debug, info, error, and warn.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("logLevel")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("LogLevel describes the log level that should be used by the Repo Server. Defaults to ArgoCDDefaultLogLevel if not set.  Valid options are debug, info, error, and warn.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String logLevel;

    public String getLogLevel() {
        return logLevel;
    }

    public void setLogLevel(String logLevel) {
        this.logLevel = logLevel;
    }

    /**
     * MountSAToken describes whether you would like to have the Repo server mount the service account token
     */
    @com.fasterxml.jackson.annotation.JsonProperty("mountsatoken")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("MountSAToken describes whether you would like to have the Repo server mount the service account token")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Boolean mountsatoken;

    public Boolean getMountsatoken() {
        return mountsatoken;
    }

    public void setMountsatoken(Boolean mountsatoken) {
        this.mountsatoken = mountsatoken;
    }

    /**
     * Remote specifies the remote URL of the Repo Server container. (optional, by default, a local instance managed by the
     * operator is used.)
     */
    @com.fasterxml.jackson.annotation.JsonProperty("remote")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Remote specifies the remote URL of the Repo Server container. (optional, by default, a local instance managed by the operator is used.)")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String remote;

    public String getRemote() {
        return remote;
    }

    public void setRemote(String remote) {
        this.remote = remote;
    }

    /**
     * Replicas defines the number of replicas for argocd-repo-server. Value should be greater than or equal to 0. Default is
     * nil.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("replicas")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Replicas defines the number of replicas for argocd-repo-server. Value should be greater than or equal to 0. Default is nil.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Integer replicas;

    public Integer getReplicas() {
        return replicas;
    }

    public void setReplicas(Integer replicas) {
        this.replicas = replicas;
    }

    /**
     * Resources defines the Compute Resources required by the container for Redis.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("resources")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Resources defines the Compute Resources required by the container for Redis.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.quarkiverse.argocd.v1beta1.argocdspec.repo.Resources resources;

    public io.quarkiverse.argocd.v1beta1.argocdspec.repo.Resources getResources() {
        return resources;
    }

    public void setResources(io.quarkiverse.argocd.v1beta1.argocdspec.repo.Resources resources) {
        this.resources = resources;
    }

    /**
     * ServiceAccount defines the ServiceAccount user that you would like the Repo server to use
     */
    @com.fasterxml.jackson.annotation.JsonProperty("serviceaccount")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("ServiceAccount defines the ServiceAccount user that you would like the Repo server to use")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String serviceaccount;

    public String getServiceaccount() {
        return serviceaccount;
    }

    public void setServiceaccount(String serviceaccount) {
        this.serviceaccount = serviceaccount;
    }

    /**
     * SidecarContainers defines the list of sidecar containers for the repo server deployment
     */
    @com.fasterxml.jackson.annotation.JsonProperty("sidecarContainers")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("SidecarContainers defines the list of sidecar containers for the repo server deployment")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private java.util.List<io.quarkiverse.argocd.v1beta1.argocdspec.repo.SidecarContainers> sidecarContainers;

    public java.util.List<io.quarkiverse.argocd.v1beta1.argocdspec.repo.SidecarContainers> getSidecarContainers() {
        return sidecarContainers;
    }

    public void setSidecarContainers(
            java.util.List<io.quarkiverse.argocd.v1beta1.argocdspec.repo.SidecarContainers> sidecarContainers) {
        this.sidecarContainers = sidecarContainers;
    }

    /**
     * VerifyTLS defines whether repo server API should be accessed using strict TLS validation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("verifytls")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("VerifyTLS defines whether repo server API should be accessed using strict TLS validation")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Boolean verifytls;

    public Boolean getVerifytls() {
        return verifytls;
    }

    public void setVerifytls(Boolean verifytls) {
        this.verifytls = verifytls;
    }

    /**
     * Version is the ArgoCD Repo Server container image tag.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("version")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Version is the ArgoCD Repo Server container image tag.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String version;

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    /**
     * VolumeMounts adds volumeMounts to the repo server container
     */
    @com.fasterxml.jackson.annotation.JsonProperty("volumeMounts")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("VolumeMounts adds volumeMounts to the repo server container")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private java.util.List<io.quarkiverse.argocd.v1beta1.argocdspec.repo.VolumeMounts> volumeMounts;

    public java.util.List<io.quarkiverse.argocd.v1beta1.argocdspec.repo.VolumeMounts> getVolumeMounts() {
        return volumeMounts;
    }

    public void setVolumeMounts(java.util.List<io.quarkiverse.argocd.v1beta1.argocdspec.repo.VolumeMounts> volumeMounts) {
        this.volumeMounts = volumeMounts;
    }

    /**
     * Volumes adds volumes to the repo server deployment
     */
    @com.fasterxml.jackson.annotation.JsonProperty("volumes")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Volumes adds volumes to the repo server deployment")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private java.util.List<io.quarkiverse.argocd.v1beta1.argocdspec.repo.Volumes> volumes;

    public java.util.List<io.quarkiverse.argocd.v1beta1.argocdspec.repo.Volumes> getVolumes() {
        return volumes;
    }

    public void setVolumes(java.util.List<io.quarkiverse.argocd.v1beta1.argocdspec.repo.Volumes> volumes) {
        this.volumes = volumes;
    }
}
