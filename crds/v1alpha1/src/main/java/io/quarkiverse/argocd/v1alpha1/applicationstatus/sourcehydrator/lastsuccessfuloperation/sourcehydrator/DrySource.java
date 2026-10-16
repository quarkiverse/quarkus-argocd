package io.quarkiverse.argocd.v1alpha1.applicationstatus.sourcehydrator.lastsuccessfuloperation.sourcehydrator;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({ "directory", "helm", "kustomize", "path", "plugin", "repoURL",
        "targetRevision" })
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
public class DrySource implements io.fabric8.kubernetes.api.builder.Editable<DrySourceBuilder>,
        io.fabric8.kubernetes.api.model.KubernetesResource {

    @java.lang.Override
    public DrySourceBuilder edit() {
        return new DrySourceBuilder(this);
    }

    /**
     * Directory specifies path/directory specific options
     */
    @com.fasterxml.jackson.annotation.JsonProperty("directory")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Directory specifies path/directory specific options")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.quarkiverse.argocd.v1alpha1.applicationstatus.sourcehydrator.lastsuccessfuloperation.sourcehydrator.drysource.Directory directory;

    public io.quarkiverse.argocd.v1alpha1.applicationstatus.sourcehydrator.lastsuccessfuloperation.sourcehydrator.drysource.Directory getDirectory() {
        return directory;
    }

    public void setDirectory(
            io.quarkiverse.argocd.v1alpha1.applicationstatus.sourcehydrator.lastsuccessfuloperation.sourcehydrator.drysource.Directory directory) {
        this.directory = directory;
    }

    /**
     * Helm specifies helm specific options
     */
    @com.fasterxml.jackson.annotation.JsonProperty("helm")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Helm specifies helm specific options")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.quarkiverse.argocd.v1alpha1.applicationstatus.sourcehydrator.lastsuccessfuloperation.sourcehydrator.drysource.Helm helm;

    public io.quarkiverse.argocd.v1alpha1.applicationstatus.sourcehydrator.lastsuccessfuloperation.sourcehydrator.drysource.Helm getHelm() {
        return helm;
    }

    public void setHelm(
            io.quarkiverse.argocd.v1alpha1.applicationstatus.sourcehydrator.lastsuccessfuloperation.sourcehydrator.drysource.Helm helm) {
        this.helm = helm;
    }

    /**
     * Kustomize specifies kustomize specific options
     */
    @com.fasterxml.jackson.annotation.JsonProperty("kustomize")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Kustomize specifies kustomize specific options")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.quarkiverse.argocd.v1alpha1.applicationstatus.sourcehydrator.lastsuccessfuloperation.sourcehydrator.drysource.Kustomize kustomize;

    public io.quarkiverse.argocd.v1alpha1.applicationstatus.sourcehydrator.lastsuccessfuloperation.sourcehydrator.drysource.Kustomize getKustomize() {
        return kustomize;
    }

    public void setKustomize(
            io.quarkiverse.argocd.v1alpha1.applicationstatus.sourcehydrator.lastsuccessfuloperation.sourcehydrator.drysource.Kustomize kustomize) {
        this.kustomize = kustomize;
    }

    /**
     * Path is a directory path within the Git repository where the manifests are located
     */
    @com.fasterxml.jackson.annotation.JsonProperty("path")
    @io.fabric8.generator.annotation.Required()
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Path is a directory path within the Git repository where the manifests are located")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String path;

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    /**
     * Plugin specifies config management plugin specific options
     */
    @com.fasterxml.jackson.annotation.JsonProperty("plugin")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Plugin specifies config management plugin specific options")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.quarkiverse.argocd.v1alpha1.applicationstatus.sourcehydrator.lastsuccessfuloperation.sourcehydrator.drysource.Plugin plugin;

    public io.quarkiverse.argocd.v1alpha1.applicationstatus.sourcehydrator.lastsuccessfuloperation.sourcehydrator.drysource.Plugin getPlugin() {
        return plugin;
    }

    public void setPlugin(
            io.quarkiverse.argocd.v1alpha1.applicationstatus.sourcehydrator.lastsuccessfuloperation.sourcehydrator.drysource.Plugin plugin) {
        this.plugin = plugin;
    }

    /**
     * RepoURL is the URL to the git repository that contains the application manifests
     */
    @com.fasterxml.jackson.annotation.JsonProperty("repoURL")
    @io.fabric8.generator.annotation.Required()
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("RepoURL is the URL to the git repository that contains the application manifests")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String repoURL;

    public String getRepoURL() {
        return repoURL;
    }

    public void setRepoURL(String repoURL) {
        this.repoURL = repoURL;
    }

    /**
     * TargetRevision defines the revision of the source to hydrate
     */
    @com.fasterxml.jackson.annotation.JsonProperty("targetRevision")
    @io.fabric8.generator.annotation.Required()
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("TargetRevision defines the revision of the source to hydrate")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String targetRevision;

    public String getTargetRevision() {
        return targetRevision;
    }

    public void setTargetRevision(String targetRevision) {
        this.targetRevision = targetRevision;
    }
}
