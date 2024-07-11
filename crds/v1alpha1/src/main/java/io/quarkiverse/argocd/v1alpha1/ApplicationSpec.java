package io.quarkiverse.argocd.v1alpha1;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({ "destination", "ignoreDifferences", "info", "project",
        "revisionHistoryLimit", "source", "sources", "syncPolicy" })
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
public class ApplicationSpec implements io.fabric8.kubernetes.api.builder.Editable<ApplicationSpecBuilder>,
        io.fabric8.kubernetes.api.model.KubernetesResource {

    @java.lang.Override
    public ApplicationSpecBuilder edit() {
        return new ApplicationSpecBuilder(this);
    }

    /**
     * Destination is a reference to the target Kubernetes server and namespace
     */
    @com.fasterxml.jackson.annotation.JsonProperty("destination")
    @io.fabric8.generator.annotation.Required()
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Destination is a reference to the target Kubernetes server and namespace")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.quarkiverse.argocd.v1alpha1.applicationspec.Destination destination;

    public io.quarkiverse.argocd.v1alpha1.applicationspec.Destination getDestination() {
        return destination;
    }

    public void setDestination(io.quarkiverse.argocd.v1alpha1.applicationspec.Destination destination) {
        this.destination = destination;
    }

    /**
     * IgnoreDifferences is a list of resources and their fields which should be ignored during comparison
     */
    @com.fasterxml.jackson.annotation.JsonProperty("ignoreDifferences")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("IgnoreDifferences is a list of resources and their fields which should be ignored during comparison")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private java.util.List<io.quarkiverse.argocd.v1alpha1.applicationspec.IgnoreDifferences> ignoreDifferences;

    public java.util.List<io.quarkiverse.argocd.v1alpha1.applicationspec.IgnoreDifferences> getIgnoreDifferences() {
        return ignoreDifferences;
    }

    public void setIgnoreDifferences(
            java.util.List<io.quarkiverse.argocd.v1alpha1.applicationspec.IgnoreDifferences> ignoreDifferences) {
        this.ignoreDifferences = ignoreDifferences;
    }

    /**
     * Info contains a list of information (URLs, email addresses, and plain text) that relates to the application
     */
    @com.fasterxml.jackson.annotation.JsonProperty("info")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Info contains a list of information (URLs, email addresses, and plain text) that relates to the application")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private java.util.List<io.quarkiverse.argocd.v1alpha1.applicationspec.Info> info;

    public java.util.List<io.quarkiverse.argocd.v1alpha1.applicationspec.Info> getInfo() {
        return info;
    }

    public void setInfo(java.util.List<io.quarkiverse.argocd.v1alpha1.applicationspec.Info> info) {
        this.info = info;
    }

    /**
     * Project is a reference to the project this application belongs to. The empty string means that application belongs to the
     * 'default' project.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("project")
    @io.fabric8.generator.annotation.Required()
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Project is a reference to the project this application belongs to. The empty string means that application belongs to the 'default' project.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String project;

    public String getProject() {
        return project;
    }

    public void setProject(String project) {
        this.project = project;
    }

    /**
     * RevisionHistoryLimit limits the number of items kept in the application's revision history, which is used for
     * informational purposes as well as for rollbacks to previous versions. This should only be changed in exceptional
     * circumstances. Setting to zero will store no history. This will reduce storage used. Increasing will increase the space
     * used to store the history, so we do not recommend increasing it. Default is 10.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("revisionHistoryLimit")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("RevisionHistoryLimit limits the number of items kept in the application's revision history, which is used for informational purposes as well as for rollbacks to previous versions. This should only be changed in exceptional circumstances. Setting to zero will store no history. This will reduce storage used. Increasing will increase the space used to store the history, so we do not recommend increasing it. Default is 10.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Long revisionHistoryLimit;

    public Long getRevisionHistoryLimit() {
        return revisionHistoryLimit;
    }

    public void setRevisionHistoryLimit(Long revisionHistoryLimit) {
        this.revisionHistoryLimit = revisionHistoryLimit;
    }

    /**
     * Source is a reference to the location of the application's manifests or chart
     */
    @com.fasterxml.jackson.annotation.JsonProperty("source")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Source is a reference to the location of the application's manifests or chart")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.quarkiverse.argocd.v1alpha1.applicationspec.Source source;

    public io.quarkiverse.argocd.v1alpha1.applicationspec.Source getSource() {
        return source;
    }

    public void setSource(io.quarkiverse.argocd.v1alpha1.applicationspec.Source source) {
        this.source = source;
    }

    /**
     * Sources is a reference to the location of the application's manifests or chart
     */
    @com.fasterxml.jackson.annotation.JsonProperty("sources")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Sources is a reference to the location of the application's manifests or chart")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private java.util.List<io.quarkiverse.argocd.v1alpha1.applicationspec.Sources> sources;

    public java.util.List<io.quarkiverse.argocd.v1alpha1.applicationspec.Sources> getSources() {
        return sources;
    }

    public void setSources(java.util.List<io.quarkiverse.argocd.v1alpha1.applicationspec.Sources> sources) {
        this.sources = sources;
    }

    /**
     * SyncPolicy controls when and how a sync will be performed
     */
    @com.fasterxml.jackson.annotation.JsonProperty("syncPolicy")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("SyncPolicy controls when and how a sync will be performed")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.quarkiverse.argocd.v1alpha1.applicationspec.SyncPolicy syncPolicy;

    public io.quarkiverse.argocd.v1alpha1.applicationspec.SyncPolicy getSyncPolicy() {
        return syncPolicy;
    }

    public void setSyncPolicy(io.quarkiverse.argocd.v1alpha1.applicationspec.SyncPolicy syncPolicy) {
        this.syncPolicy = syncPolicy;
    }
}
