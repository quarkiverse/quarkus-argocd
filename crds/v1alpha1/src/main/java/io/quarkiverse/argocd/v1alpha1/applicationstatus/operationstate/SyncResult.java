package io.quarkiverse.argocd.v1alpha1.applicationstatus.operationstate;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({ "managedNamespaceMetadata", "resources", "revision", "revisions",
        "source", "sources" })
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
public class SyncResult implements io.fabric8.kubernetes.api.builder.Editable<SyncResultBuilder>,
        io.fabric8.kubernetes.api.model.KubernetesResource {

    @java.lang.Override
    public SyncResultBuilder edit() {
        return new SyncResultBuilder(this);
    }

    /**
     * ManagedNamespaceMetadata contains the current sync state of managed namespace metadata
     */
    @com.fasterxml.jackson.annotation.JsonProperty("managedNamespaceMetadata")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("ManagedNamespaceMetadata contains the current sync state of managed namespace metadata")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.quarkiverse.argocd.v1alpha1.applicationstatus.operationstate.syncresult.ManagedNamespaceMetadata managedNamespaceMetadata;

    public io.quarkiverse.argocd.v1alpha1.applicationstatus.operationstate.syncresult.ManagedNamespaceMetadata getManagedNamespaceMetadata() {
        return managedNamespaceMetadata;
    }

    public void setManagedNamespaceMetadata(
            io.quarkiverse.argocd.v1alpha1.applicationstatus.operationstate.syncresult.ManagedNamespaceMetadata managedNamespaceMetadata) {
        this.managedNamespaceMetadata = managedNamespaceMetadata;
    }

    /**
     * Resources contains a list of sync result items for each individual resource in a sync operation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("resources")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Resources contains a list of sync result items for each individual resource in a sync operation")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private java.util.List<io.quarkiverse.argocd.v1alpha1.applicationstatus.operationstate.syncresult.Resources> resources;

    public java.util.List<io.quarkiverse.argocd.v1alpha1.applicationstatus.operationstate.syncresult.Resources> getResources() {
        return resources;
    }

    public void setResources(
            java.util.List<io.quarkiverse.argocd.v1alpha1.applicationstatus.operationstate.syncresult.Resources> resources) {
        this.resources = resources;
    }

    /**
     * Revision holds the revision this sync operation was performed to
     */
    @com.fasterxml.jackson.annotation.JsonProperty("revision")
    @io.fabric8.generator.annotation.Required()
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Revision holds the revision this sync operation was performed to")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String revision;

    public String getRevision() {
        return revision;
    }

    public void setRevision(String revision) {
        this.revision = revision;
    }

    /**
     * Revisions holds the revision this sync operation was performed for respective indexed source in sources field
     */
    @com.fasterxml.jackson.annotation.JsonProperty("revisions")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Revisions holds the revision this sync operation was performed for respective indexed source in sources field")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private java.util.List<String> revisions;

    public java.util.List<String> getRevisions() {
        return revisions;
    }

    public void setRevisions(java.util.List<String> revisions) {
        this.revisions = revisions;
    }

    /**
     * Source records the application source information of the sync, used for comparing auto-sync
     */
    @com.fasterxml.jackson.annotation.JsonProperty("source")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Source records the application source information of the sync, used for comparing auto-sync")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.quarkiverse.argocd.v1alpha1.applicationstatus.operationstate.syncresult.Source source;

    public io.quarkiverse.argocd.v1alpha1.applicationstatus.operationstate.syncresult.Source getSource() {
        return source;
    }

    public void setSource(io.quarkiverse.argocd.v1alpha1.applicationstatus.operationstate.syncresult.Source source) {
        this.source = source;
    }

    /**
     * Source records the application source information of the sync, used for comparing auto-sync
     */
    @com.fasterxml.jackson.annotation.JsonProperty("sources")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Source records the application source information of the sync, used for comparing auto-sync")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private java.util.List<io.quarkiverse.argocd.v1alpha1.applicationstatus.operationstate.syncresult.Sources> sources;

    public java.util.List<io.quarkiverse.argocd.v1alpha1.applicationstatus.operationstate.syncresult.Sources> getSources() {
        return sources;
    }

    public void setSources(
            java.util.List<io.quarkiverse.argocd.v1alpha1.applicationstatus.operationstate.syncresult.Sources> sources) {
        this.sources = sources;
    }
}
