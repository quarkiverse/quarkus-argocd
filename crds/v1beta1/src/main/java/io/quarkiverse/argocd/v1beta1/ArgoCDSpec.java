package io.quarkiverse.argocd.v1beta1;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({ "applicationInstanceLabelKey", "applicationSet", "banner",
        "configManagementPlugins", "controller", "defaultClusterScopedRoleDisabled", "disableAdmin", "extraConfig",
        "gaAnonymizeUsers", "gaTrackingID", "grafana", "ha", "helpChatText", "helpChatURL", "image", "import",
        "initialRepositories", "initialSSHKnownHosts", "kustomizeBuildOptions", "kustomizeVersions", "monitoring",
        "nodePlacement", "notifications", "oidcConfig", "prometheus", "rbac", "redis", "repo", "repositoryCredentials",
        "resourceActions", "resourceExclusions", "resourceHealthChecks", "resourceIgnoreDifferences", "resourceInclusions",
        "resourceTrackingMethod", "server", "sourceNamespaces", "sso", "statusBadgeEnabled", "tls", "usersAnonymousEnabled",
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
public class ArgoCDSpec implements io.fabric8.kubernetes.api.builder.Editable<ArgoCDSpecBuilder>,
        io.fabric8.kubernetes.api.model.KubernetesResource {

    @java.lang.Override
    public ArgoCDSpecBuilder edit() {
        return new ArgoCDSpecBuilder(this);
    }

    /**
     * ApplicationInstanceLabelKey is the key name where Argo CD injects the app name as a tracking label.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("applicationInstanceLabelKey")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("ApplicationInstanceLabelKey is the key name where Argo CD injects the app name as a tracking label.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String applicationInstanceLabelKey;

    public String getApplicationInstanceLabelKey() {
        return applicationInstanceLabelKey;
    }

    public void setApplicationInstanceLabelKey(String applicationInstanceLabelKey) {
        this.applicationInstanceLabelKey = applicationInstanceLabelKey;
    }

    /**
     * ArgoCDApplicationSet defines whether the Argo CD ApplicationSet controller should be installed.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("applicationSet")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("ArgoCDApplicationSet defines whether the Argo CD ApplicationSet controller should be installed.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.quarkiverse.argocd.v1beta1.argocdspec.ApplicationSet applicationSet;

    public io.quarkiverse.argocd.v1beta1.argocdspec.ApplicationSet getApplicationSet() {
        return applicationSet;
    }

    public void setApplicationSet(io.quarkiverse.argocd.v1beta1.argocdspec.ApplicationSet applicationSet) {
        this.applicationSet = applicationSet;
    }

    /**
     * Banner defines an additional banner to be displayed in Argo CD UI
     */
    @com.fasterxml.jackson.annotation.JsonProperty("banner")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Banner defines an additional banner to be displayed in Argo CD UI")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.quarkiverse.argocd.v1beta1.argocdspec.Banner banner;

    public io.quarkiverse.argocd.v1beta1.argocdspec.Banner getBanner() {
        return banner;
    }

    public void setBanner(io.quarkiverse.argocd.v1beta1.argocdspec.Banner banner) {
        this.banner = banner;
    }

    /**
     * ConfigManagementPlugins is used to specify additional config management plugins.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("configManagementPlugins")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("ConfigManagementPlugins is used to specify additional config management plugins.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String configManagementPlugins;

    public String getConfigManagementPlugins() {
        return configManagementPlugins;
    }

    public void setConfigManagementPlugins(String configManagementPlugins) {
        this.configManagementPlugins = configManagementPlugins;
    }

    /**
     * Controller defines the Application Controller options for ArgoCD.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("controller")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Controller defines the Application Controller options for ArgoCD.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.quarkiverse.argocd.v1beta1.argocdspec.Controller controller;

    public io.quarkiverse.argocd.v1beta1.argocdspec.Controller getController() {
        return controller;
    }

    public void setController(io.quarkiverse.argocd.v1beta1.argocdspec.Controller controller) {
        this.controller = controller;
    }

    /**
     * DefaultClusterScopedRoleDisabled will disable creation of default ClusterRoles for a cluster scoped instance.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("defaultClusterScopedRoleDisabled")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("DefaultClusterScopedRoleDisabled will disable creation of default ClusterRoles for a cluster scoped instance.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Boolean defaultClusterScopedRoleDisabled;

    public Boolean getDefaultClusterScopedRoleDisabled() {
        return defaultClusterScopedRoleDisabled;
    }

    public void setDefaultClusterScopedRoleDisabled(Boolean defaultClusterScopedRoleDisabled) {
        this.defaultClusterScopedRoleDisabled = defaultClusterScopedRoleDisabled;
    }

    /**
     * DisableAdmin will disable the admin user.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("disableAdmin")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("DisableAdmin will disable the admin user.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Boolean disableAdmin;

    public Boolean getDisableAdmin() {
        return disableAdmin;
    }

    public void setDisableAdmin(Boolean disableAdmin) {
        this.disableAdmin = disableAdmin;
    }

    /**
     * ExtraConfig can be used to add fields to Argo CD configmap that are not supported by Argo CD CRD.
     * Note: ExtraConfig takes precedence over Argo CD CRD. For example, A user sets `argocd.Spec.DisableAdmin` = true and also
     * `a.Spec.ExtraConfig["admin.enabled"]` = true. In this case, operator updates Argo CD Configmap as follows ->
     * argocd-cm.Data["admin.enabled"] = true.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("extraConfig")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("ExtraConfig can be used to add fields to Argo CD configmap that are not supported by Argo CD CRD. \n Note: ExtraConfig takes precedence over Argo CD CRD. For example, A user sets `argocd.Spec.DisableAdmin` = true and also `a.Spec.ExtraConfig[\"admin.enabled\"]` = true. In this case, operator updates Argo CD Configmap as follows -> argocd-cm.Data[\"admin.enabled\"] = true.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private java.util.Map<java.lang.String, String> extraConfig;

    public java.util.Map<java.lang.String, String> getExtraConfig() {
        return extraConfig;
    }

    public void setExtraConfig(java.util.Map<java.lang.String, String> extraConfig) {
        this.extraConfig = extraConfig;
    }

    /**
     * GAAnonymizeUsers toggles user IDs being hashed before sending to google analytics.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("gaAnonymizeUsers")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("GAAnonymizeUsers toggles user IDs being hashed before sending to google analytics.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Boolean gaAnonymizeUsers;

    public Boolean getGaAnonymizeUsers() {
        return gaAnonymizeUsers;
    }

    public void setGaAnonymizeUsers(Boolean gaAnonymizeUsers) {
        this.gaAnonymizeUsers = gaAnonymizeUsers;
    }

    /**
     * GATrackingID is the google analytics tracking ID to use.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("gaTrackingID")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("GATrackingID is the google analytics tracking ID to use.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String gaTrackingID;

    public String getGaTrackingID() {
        return gaTrackingID;
    }

    public void setGaTrackingID(String gaTrackingID) {
        this.gaTrackingID = gaTrackingID;
    }

    /**
     * Deprecated: Grafana defines the Grafana server options for ArgoCD.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("grafana")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Deprecated: Grafana defines the Grafana server options for ArgoCD.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.quarkiverse.argocd.v1beta1.argocdspec.Grafana grafana;

    public io.quarkiverse.argocd.v1beta1.argocdspec.Grafana getGrafana() {
        return grafana;
    }

    public void setGrafana(io.quarkiverse.argocd.v1beta1.argocdspec.Grafana grafana) {
        this.grafana = grafana;
    }

    /**
     * HA options for High Availability support for the Redis component.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("ha")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("HA options for High Availability support for the Redis component.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.quarkiverse.argocd.v1beta1.argocdspec.Ha ha;

    public io.quarkiverse.argocd.v1beta1.argocdspec.Ha getHa() {
        return ha;
    }

    public void setHa(io.quarkiverse.argocd.v1beta1.argocdspec.Ha ha) {
        this.ha = ha;
    }

    /**
     * HelpChatText is the text for getting chat help, defaults to "Chat now!"
     */
    @com.fasterxml.jackson.annotation.JsonProperty("helpChatText")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("HelpChatText is the text for getting chat help, defaults to \"Chat now!\"")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String helpChatText;

    public String getHelpChatText() {
        return helpChatText;
    }

    public void setHelpChatText(String helpChatText) {
        this.helpChatText = helpChatText;
    }

    /**
     * HelpChatURL is the URL for getting chat help, this will typically be your Slack channel for support.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("helpChatURL")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("HelpChatURL is the URL for getting chat help, this will typically be your Slack channel for support.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String helpChatURL;

    public String getHelpChatURL() {
        return helpChatURL;
    }

    public void setHelpChatURL(String helpChatURL) {
        this.helpChatURL = helpChatURL;
    }

    /**
     * Image is the ArgoCD container image for all ArgoCD components.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("image")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Image is the ArgoCD container image for all ArgoCD components.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String image;

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    /**
     * Import is the import/restore options for ArgoCD.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("import")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Import is the import/restore options for ArgoCD.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.quarkiverse.argocd.v1beta1.argocdspec.Import _import;

    public io.quarkiverse.argocd.v1beta1.argocdspec.Import get_import() {
        return _import;
    }

    public void set_import(io.quarkiverse.argocd.v1beta1.argocdspec.Import _import) {
        this._import = _import;
    }

    /**
     * InitialRepositories to configure Argo CD with upon creation of the cluster.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("initialRepositories")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("InitialRepositories to configure Argo CD with upon creation of the cluster.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String initialRepositories;

    public String getInitialRepositories() {
        return initialRepositories;
    }

    public void setInitialRepositories(String initialRepositories) {
        this.initialRepositories = initialRepositories;
    }

    /**
     * InitialSSHKnownHosts defines the SSH known hosts data upon creation of the cluster for connecting Git repositories via
     * SSH.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("initialSSHKnownHosts")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("InitialSSHKnownHosts defines the SSH known hosts data upon creation of the cluster for connecting Git repositories via SSH.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.quarkiverse.argocd.v1beta1.argocdspec.InitialSSHKnownHosts initialSSHKnownHosts;

    public io.quarkiverse.argocd.v1beta1.argocdspec.InitialSSHKnownHosts getInitialSSHKnownHosts() {
        return initialSSHKnownHosts;
    }

    public void setInitialSSHKnownHosts(io.quarkiverse.argocd.v1beta1.argocdspec.InitialSSHKnownHosts initialSSHKnownHosts) {
        this.initialSSHKnownHosts = initialSSHKnownHosts;
    }

    /**
     * KustomizeBuildOptions is used to specify build options/parameters to use with `kustomize build`.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("kustomizeBuildOptions")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("KustomizeBuildOptions is used to specify build options/parameters to use with `kustomize build`.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String kustomizeBuildOptions;

    public String getKustomizeBuildOptions() {
        return kustomizeBuildOptions;
    }

    public void setKustomizeBuildOptions(String kustomizeBuildOptions) {
        this.kustomizeBuildOptions = kustomizeBuildOptions;
    }

    /**
     * KustomizeVersions is a listing of configured versions of Kustomize to be made available within ArgoCD.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("kustomizeVersions")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("KustomizeVersions is a listing of configured versions of Kustomize to be made available within ArgoCD.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private java.util.List<io.quarkiverse.argocd.v1beta1.argocdspec.KustomizeVersions> kustomizeVersions;

    public java.util.List<io.quarkiverse.argocd.v1beta1.argocdspec.KustomizeVersions> getKustomizeVersions() {
        return kustomizeVersions;
    }

    public void setKustomizeVersions(
            java.util.List<io.quarkiverse.argocd.v1beta1.argocdspec.KustomizeVersions> kustomizeVersions) {
        this.kustomizeVersions = kustomizeVersions;
    }

    /**
     * Monitoring defines whether workload status monitoring configuration for this instance.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("monitoring")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Monitoring defines whether workload status monitoring configuration for this instance.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.quarkiverse.argocd.v1beta1.argocdspec.Monitoring monitoring;

    public io.quarkiverse.argocd.v1beta1.argocdspec.Monitoring getMonitoring() {
        return monitoring;
    }

    public void setMonitoring(io.quarkiverse.argocd.v1beta1.argocdspec.Monitoring monitoring) {
        this.monitoring = monitoring;
    }

    /**
     * NodePlacement defines NodeSelectors and Taints for Argo CD workloads
     */
    @com.fasterxml.jackson.annotation.JsonProperty("nodePlacement")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("NodePlacement defines NodeSelectors and Taints for Argo CD workloads")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.quarkiverse.argocd.v1beta1.argocdspec.NodePlacement nodePlacement;

    public io.quarkiverse.argocd.v1beta1.argocdspec.NodePlacement getNodePlacement() {
        return nodePlacement;
    }

    public void setNodePlacement(io.quarkiverse.argocd.v1beta1.argocdspec.NodePlacement nodePlacement) {
        this.nodePlacement = nodePlacement;
    }

    /**
     * Notifications defines whether the Argo CD Notifications controller should be installed.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("notifications")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Notifications defines whether the Argo CD Notifications controller should be installed.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.quarkiverse.argocd.v1beta1.argocdspec.Notifications notifications;

    public io.quarkiverse.argocd.v1beta1.argocdspec.Notifications getNotifications() {
        return notifications;
    }

    public void setNotifications(io.quarkiverse.argocd.v1beta1.argocdspec.Notifications notifications) {
        this.notifications = notifications;
    }

    /**
     * OIDCConfig is the OIDC configuration as an alternative to dex.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("oidcConfig")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("OIDCConfig is the OIDC configuration as an alternative to dex.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String oidcConfig;

    public String getOidcConfig() {
        return oidcConfig;
    }

    public void setOidcConfig(String oidcConfig) {
        this.oidcConfig = oidcConfig;
    }

    /**
     * Prometheus defines the Prometheus server options for ArgoCD.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("prometheus")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Prometheus defines the Prometheus server options for ArgoCD.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.quarkiverse.argocd.v1beta1.argocdspec.Prometheus prometheus;

    public io.quarkiverse.argocd.v1beta1.argocdspec.Prometheus getPrometheus() {
        return prometheus;
    }

    public void setPrometheus(io.quarkiverse.argocd.v1beta1.argocdspec.Prometheus prometheus) {
        this.prometheus = prometheus;
    }

    /**
     * RBAC defines the RBAC configuration for Argo CD.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("rbac")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("RBAC defines the RBAC configuration for Argo CD.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.quarkiverse.argocd.v1beta1.argocdspec.Rbac rbac;

    public io.quarkiverse.argocd.v1beta1.argocdspec.Rbac getRbac() {
        return rbac;
    }

    public void setRbac(io.quarkiverse.argocd.v1beta1.argocdspec.Rbac rbac) {
        this.rbac = rbac;
    }

    /**
     * Redis defines the Redis server options for ArgoCD.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("redis")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Redis defines the Redis server options for ArgoCD.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.quarkiverse.argocd.v1beta1.argocdspec.Redis redis;

    public io.quarkiverse.argocd.v1beta1.argocdspec.Redis getRedis() {
        return redis;
    }

    public void setRedis(io.quarkiverse.argocd.v1beta1.argocdspec.Redis redis) {
        this.redis = redis;
    }

    /**
     * Repo defines the repo server options for Argo CD.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("repo")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Repo defines the repo server options for Argo CD.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.quarkiverse.argocd.v1beta1.argocdspec.Repo repo;

    public io.quarkiverse.argocd.v1beta1.argocdspec.Repo getRepo() {
        return repo;
    }

    public void setRepo(io.quarkiverse.argocd.v1beta1.argocdspec.Repo repo) {
        this.repo = repo;
    }

    /**
     * RepositoryCredentials are the Git pull credentials to configure Argo CD with upon creation of the cluster.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("repositoryCredentials")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("RepositoryCredentials are the Git pull credentials to configure Argo CD with upon creation of the cluster.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String repositoryCredentials;

    public String getRepositoryCredentials() {
        return repositoryCredentials;
    }

    public void setRepositoryCredentials(String repositoryCredentials) {
        this.repositoryCredentials = repositoryCredentials;
    }

    /**
     * ResourceActions customizes resource action behavior.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("resourceActions")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("ResourceActions customizes resource action behavior.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private java.util.List<io.quarkiverse.argocd.v1beta1.argocdspec.ResourceActions> resourceActions;

    public java.util.List<io.quarkiverse.argocd.v1beta1.argocdspec.ResourceActions> getResourceActions() {
        return resourceActions;
    }

    public void setResourceActions(java.util.List<io.quarkiverse.argocd.v1beta1.argocdspec.ResourceActions> resourceActions) {
        this.resourceActions = resourceActions;
    }

    /**
     * ResourceExclusions is used to completely ignore entire classes of resource group/kinds.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("resourceExclusions")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("ResourceExclusions is used to completely ignore entire classes of resource group/kinds.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String resourceExclusions;

    public String getResourceExclusions() {
        return resourceExclusions;
    }

    public void setResourceExclusions(String resourceExclusions) {
        this.resourceExclusions = resourceExclusions;
    }

    /**
     * ResourceHealthChecks customizes resource health check behavior.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("resourceHealthChecks")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("ResourceHealthChecks customizes resource health check behavior.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private java.util.List<io.quarkiverse.argocd.v1beta1.argocdspec.ResourceHealthChecks> resourceHealthChecks;

    public java.util.List<io.quarkiverse.argocd.v1beta1.argocdspec.ResourceHealthChecks> getResourceHealthChecks() {
        return resourceHealthChecks;
    }

    public void setResourceHealthChecks(
            java.util.List<io.quarkiverse.argocd.v1beta1.argocdspec.ResourceHealthChecks> resourceHealthChecks) {
        this.resourceHealthChecks = resourceHealthChecks;
    }

    /**
     * ResourceIgnoreDifferences customizes resource ignore difference behavior.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("resourceIgnoreDifferences")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("ResourceIgnoreDifferences customizes resource ignore difference behavior.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.quarkiverse.argocd.v1beta1.argocdspec.ResourceIgnoreDifferences resourceIgnoreDifferences;

    public io.quarkiverse.argocd.v1beta1.argocdspec.ResourceIgnoreDifferences getResourceIgnoreDifferences() {
        return resourceIgnoreDifferences;
    }

    public void setResourceIgnoreDifferences(
            io.quarkiverse.argocd.v1beta1.argocdspec.ResourceIgnoreDifferences resourceIgnoreDifferences) {
        this.resourceIgnoreDifferences = resourceIgnoreDifferences;
    }

    /**
     * ResourceInclusions is used to only include specific group/kinds in the reconciliation process.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("resourceInclusions")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("ResourceInclusions is used to only include specific group/kinds in the reconciliation process.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String resourceInclusions;

    public String getResourceInclusions() {
        return resourceInclusions;
    }

    public void setResourceInclusions(String resourceInclusions) {
        this.resourceInclusions = resourceInclusions;
    }

    /**
     * ResourceTrackingMethod defines how Argo CD should track resources that it manages
     */
    @com.fasterxml.jackson.annotation.JsonProperty("resourceTrackingMethod")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("ResourceTrackingMethod defines how Argo CD should track resources that it manages")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String resourceTrackingMethod;

    public String getResourceTrackingMethod() {
        return resourceTrackingMethod;
    }

    public void setResourceTrackingMethod(String resourceTrackingMethod) {
        this.resourceTrackingMethod = resourceTrackingMethod;
    }

    /**
     * Server defines the options for the ArgoCD Server component.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("server")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Server defines the options for the ArgoCD Server component.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.quarkiverse.argocd.v1beta1.argocdspec.Server server;

    public io.quarkiverse.argocd.v1beta1.argocdspec.Server getServer() {
        return server;
    }

    public void setServer(io.quarkiverse.argocd.v1beta1.argocdspec.Server server) {
        this.server = server;
    }

    /**
     * SourceNamespaces defines the namespaces application resources are allowed to be created in
     */
    @com.fasterxml.jackson.annotation.JsonProperty("sourceNamespaces")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("SourceNamespaces defines the namespaces application resources are allowed to be created in")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private java.util.List<String> sourceNamespaces;

    public java.util.List<String> getSourceNamespaces() {
        return sourceNamespaces;
    }

    public void setSourceNamespaces(java.util.List<String> sourceNamespaces) {
        this.sourceNamespaces = sourceNamespaces;
    }

    /**
     * SSO defines the Single Sign-on configuration for Argo CD
     */
    @com.fasterxml.jackson.annotation.JsonProperty("sso")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("SSO defines the Single Sign-on configuration for Argo CD")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.quarkiverse.argocd.v1beta1.argocdspec.Sso sso;

    public io.quarkiverse.argocd.v1beta1.argocdspec.Sso getSso() {
        return sso;
    }

    public void setSso(io.quarkiverse.argocd.v1beta1.argocdspec.Sso sso) {
        this.sso = sso;
    }

    /**
     * StatusBadgeEnabled toggles application status badge feature.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("statusBadgeEnabled")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("StatusBadgeEnabled toggles application status badge feature.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Boolean statusBadgeEnabled;

    public Boolean getStatusBadgeEnabled() {
        return statusBadgeEnabled;
    }

    public void setStatusBadgeEnabled(Boolean statusBadgeEnabled) {
        this.statusBadgeEnabled = statusBadgeEnabled;
    }

    /**
     * TLS defines the TLS options for ArgoCD.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("tls")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("TLS defines the TLS options for ArgoCD.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.quarkiverse.argocd.v1beta1.argocdspec.Tls tls;

    public io.quarkiverse.argocd.v1beta1.argocdspec.Tls getTls() {
        return tls;
    }

    public void setTls(io.quarkiverse.argocd.v1beta1.argocdspec.Tls tls) {
        this.tls = tls;
    }

    /**
     * UsersAnonymousEnabled toggles anonymous user access. The anonymous users get default role permissions specified
     * argocd-rbac-cm.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("usersAnonymousEnabled")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("UsersAnonymousEnabled toggles anonymous user access. The anonymous users get default role permissions specified argocd-rbac-cm.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Boolean usersAnonymousEnabled;

    public Boolean getUsersAnonymousEnabled() {
        return usersAnonymousEnabled;
    }

    public void setUsersAnonymousEnabled(Boolean usersAnonymousEnabled) {
        this.usersAnonymousEnabled = usersAnonymousEnabled;
    }

    /**
     * Version is the tag to use with the ArgoCD container image for all ArgoCD components.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("version")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Version is the tag to use with the ArgoCD container image for all ArgoCD components.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String version;

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }
}
