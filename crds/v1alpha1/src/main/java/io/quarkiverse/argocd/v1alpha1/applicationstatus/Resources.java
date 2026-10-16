package io.quarkiverse.argocd.v1alpha1.applicationstatus;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({ "group", "health", "hook", "kind", "name", "namespace",
        "requiresDeletionConfirmation", "requiresPruning", "status", "syncWave", "version" })
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
public class Resources implements io.fabric8.kubernetes.api.builder.Editable<ResourcesBuilder>,
        io.fabric8.kubernetes.api.model.KubernetesResource {

    @java.lang.Override
    public ResourcesBuilder edit() {
        return new ResourcesBuilder(this);
    }

    /**
     * Group represents the API group of the resource (e.g., "apps" for Deployments).
     */
    @com.fasterxml.jackson.annotation.JsonProperty("group")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Group represents the API group of the resource (e.g., \"apps\" for Deployments).")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String group;

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    /**
     * Health indicates the health status of the resource (e.g., Healthy, Degraded, Progressing).
     */
    @com.fasterxml.jackson.annotation.JsonProperty("health")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Health indicates the health status of the resource (e.g., Healthy, Degraded, Progressing).")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.quarkiverse.argocd.v1alpha1.applicationstatus.resources.Health health;

    public io.quarkiverse.argocd.v1alpha1.applicationstatus.resources.Health getHealth() {
        return health;
    }

    public void setHealth(io.quarkiverse.argocd.v1alpha1.applicationstatus.resources.Health health) {
        this.health = health;
    }

    /**
     * Hook is true if the resource is used as a lifecycle hook in an Argo CD application.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("hook")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Hook is true if the resource is used as a lifecycle hook in an Argo CD application.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Boolean hook;

    public Boolean getHook() {
        return hook;
    }

    public void setHook(Boolean hook) {
        this.hook = hook;
    }

    /**
     * Kind specifies the type of the resource (e.g., "Deployment", "Service").
     */
    @com.fasterxml.jackson.annotation.JsonProperty("kind")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Kind specifies the type of the resource (e.g., \"Deployment\", \"Service\").")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String kind;

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    /**
     * Name is the unique name of the resource within the namespace.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Name is the unique name of the resource within the namespace.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    /**
     * Namespace defines the Kubernetes namespace where the resource is located.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("namespace")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Namespace defines the Kubernetes namespace where the resource is located.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String namespace;

    public String getNamespace() {
        return namespace;
    }

    public void setNamespace(String namespace) {
        this.namespace = namespace;
    }

    /**
     * RequiresDeletionConfirmation is true if the resource requires explicit user confirmation before deletion.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("requiresDeletionConfirmation")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("RequiresDeletionConfirmation is true if the resource requires explicit user confirmation before deletion.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Boolean requiresDeletionConfirmation;

    public Boolean getRequiresDeletionConfirmation() {
        return requiresDeletionConfirmation;
    }

    public void setRequiresDeletionConfirmation(Boolean requiresDeletionConfirmation) {
        this.requiresDeletionConfirmation = requiresDeletionConfirmation;
    }

    /**
     * RequiresPruning is true if the resource needs to be pruned (deleted) as part of synchronization.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("requiresPruning")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("RequiresPruning is true if the resource needs to be pruned (deleted) as part of synchronization.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Boolean requiresPruning;

    public Boolean getRequiresPruning() {
        return requiresPruning;
    }

    public void setRequiresPruning(Boolean requiresPruning) {
        this.requiresPruning = requiresPruning;
    }

    /**
     * Status represents the synchronization state of the resource (e.g., Synced, OutOfSync).
     */
    @com.fasterxml.jackson.annotation.JsonProperty("status")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Status represents the synchronization state of the resource (e.g., Synced, OutOfSync).")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String status;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * SyncWave determines the order in which resources are applied during a sync operation.
     * Lower values are applied first.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("syncWave")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("SyncWave determines the order in which resources are applied during a sync operation.\nLower values are applied first.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Long syncWave;

    public Long getSyncWave() {
        return syncWave;
    }

    public void setSyncWave(Long syncWave) {
        this.syncWave = syncWave;
    }

    /**
     * Version indicates the API version of the resource (e.g., "v1", "v1beta1").
     */
    @com.fasterxml.jackson.annotation.JsonProperty("version")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Version indicates the API version of the resource (e.g., \"v1\", \"v1beta1\").")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String version;

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }
}
