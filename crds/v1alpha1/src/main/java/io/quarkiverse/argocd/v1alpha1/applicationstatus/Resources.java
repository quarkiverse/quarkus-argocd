package io.quarkiverse.argocd.v1alpha1.applicationstatus;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({ "group", "health", "hook", "kind", "name", "namespace", "requiresPruning",
        "status", "syncWave", "version" })
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

    @com.fasterxml.jackson.annotation.JsonProperty("group")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String group;

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    /**
     * HealthStatus contains information about the currently observed health state of an application or resource
     */
    @com.fasterxml.jackson.annotation.JsonProperty("health")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("HealthStatus contains information about the currently observed health state of an application or resource")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.quarkiverse.argocd.v1alpha1.applicationstatus.resources.Health health;

    public io.quarkiverse.argocd.v1alpha1.applicationstatus.resources.Health getHealth() {
        return health;
    }

    public void setHealth(io.quarkiverse.argocd.v1alpha1.applicationstatus.resources.Health health) {
        this.health = health;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("hook")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Boolean hook;

    public Boolean getHook() {
        return hook;
    }

    public void setHook(Boolean hook) {
        this.hook = hook;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("kind")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String kind;

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("name")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("namespace")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String namespace;

    public String getNamespace() {
        return namespace;
    }

    public void setNamespace(String namespace) {
        this.namespace = namespace;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("requiresPruning")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Boolean requiresPruning;

    public Boolean getRequiresPruning() {
        return requiresPruning;
    }

    public void setRequiresPruning(Boolean requiresPruning) {
        this.requiresPruning = requiresPruning;
    }

    /**
     * SyncStatusCode is a type which represents possible comparison results
     */
    @com.fasterxml.jackson.annotation.JsonProperty("status")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("SyncStatusCode is a type which represents possible comparison results")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String status;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("syncWave")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Long syncWave;

    public Long getSyncWave() {
        return syncWave;
    }

    public void setSyncWave(Long syncWave) {
        this.syncWave = syncWave;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("version")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String version;

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }
}
