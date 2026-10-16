package io.quarkiverse.argocd.v1alpha1.appprojectspec;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({ "andOperator", "applications", "clusters", "description", "duration",
        "kind", "manualSync", "namespaces", "schedule", "syncOverrun", "timeZone" })
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
public class SyncWindows implements io.fabric8.kubernetes.api.builder.Editable<SyncWindowsBuilder>,
        io.fabric8.kubernetes.api.model.KubernetesResource {

    @java.lang.Override
    public SyncWindowsBuilder edit() {
        return new SyncWindowsBuilder(this);
    }

    /**
     * UseAndOperator use AND operator for matching applications, namespaces and clusters instead of the default OR operator
     */
    @com.fasterxml.jackson.annotation.JsonProperty("andOperator")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("UseAndOperator use AND operator for matching applications, namespaces and clusters instead of the default OR operator")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Boolean andOperator;

    public Boolean getAndOperator() {
        return andOperator;
    }

    public void setAndOperator(Boolean andOperator) {
        this.andOperator = andOperator;
    }

    /**
     * Applications contains a list of applications that the window will apply to
     */
    @com.fasterxml.jackson.annotation.JsonProperty("applications")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Applications contains a list of applications that the window will apply to")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private java.util.List<String> applications;

    public java.util.List<String> getApplications() {
        return applications;
    }

    public void setApplications(java.util.List<String> applications) {
        this.applications = applications;
    }

    /**
     * Clusters contains a list of clusters that the window will apply to
     */
    @com.fasterxml.jackson.annotation.JsonProperty("clusters")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Clusters contains a list of clusters that the window will apply to")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private java.util.List<String> clusters;

    public java.util.List<String> getClusters() {
        return clusters;
    }

    public void setClusters(java.util.List<String> clusters) {
        this.clusters = clusters;
    }

    /**
     * Description of the sync that will be applied to the schedule, can be used to add any information such as a ticket number
     * for example
     */
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Description of the sync that will be applied to the schedule, can be used to add any information such as a ticket number for example")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String description;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * Duration is the amount of time the sync window will be open
     */
    @com.fasterxml.jackson.annotation.JsonProperty("duration")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Duration is the amount of time the sync window will be open")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String duration;

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    /**
     * Kind defines if the window allows or blocks syncs
     */
    @com.fasterxml.jackson.annotation.JsonProperty("kind")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Kind defines if the window allows or blocks syncs")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String kind;

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    /**
     * ManualSync enables manual syncs when they would otherwise be blocked
     */
    @com.fasterxml.jackson.annotation.JsonProperty("manualSync")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("ManualSync enables manual syncs when they would otherwise be blocked")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Boolean manualSync;

    public Boolean getManualSync() {
        return manualSync;
    }

    public void setManualSync(Boolean manualSync) {
        this.manualSync = manualSync;
    }

    /**
     * Namespaces contains a list of namespaces that the window will apply to
     */
    @com.fasterxml.jackson.annotation.JsonProperty("namespaces")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Namespaces contains a list of namespaces that the window will apply to")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private java.util.List<String> namespaces;

    public java.util.List<String> getNamespaces() {
        return namespaces;
    }

    public void setNamespaces(java.util.List<String> namespaces) {
        this.namespaces = namespaces;
    }

    /**
     * Schedule is the time the window will begin, specified in cron format
     */
    @com.fasterxml.jackson.annotation.JsonProperty("schedule")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Schedule is the time the window will begin, specified in cron format")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String schedule;

    public String getSchedule() {
        return schedule;
    }

    public void setSchedule(String schedule) {
        this.schedule = schedule;
    }

    /**
     * SyncOverrun allows ongoing syncs to continue in two scenarios:
     * For deny windows: allows syncs that started before the deny window became active to continue running
     * For allow windows: allows syncs that started during the allow window to continue after the window ends
     */
    @com.fasterxml.jackson.annotation.JsonProperty("syncOverrun")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("SyncOverrun allows ongoing syncs to continue in two scenarios:\nFor deny windows: allows syncs that started before the deny window became active to continue running\nFor allow windows: allows syncs that started during the allow window to continue after the window ends")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Boolean syncOverrun;

    public Boolean getSyncOverrun() {
        return syncOverrun;
    }

    public void setSyncOverrun(Boolean syncOverrun) {
        this.syncOverrun = syncOverrun;
    }

    /**
     * TimeZone of the sync that will be applied to the schedule
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeZone")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("TimeZone of the sync that will be applied to the schedule")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String timeZone;

    public String getTimeZone() {
        return timeZone;
    }

    public void setTimeZone(String timeZone) {
        this.timeZone = timeZone;
    }
}
