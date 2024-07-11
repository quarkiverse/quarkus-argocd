package io.quarkiverse.argocd.v1alpha1.applicationstatus.operationstate.syncresult;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({ "chart", "directory", "helm", "kustomize", "path", "plugin", "ref",
        "repoURL", "targetRevision" })
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
public class Sources implements io.fabric8.kubernetes.api.builder.Editable<SourcesBuilder>,
        io.fabric8.kubernetes.api.model.KubernetesResource {

    @java.lang.Override
    public SourcesBuilder edit() {
        return new SourcesBuilder(this);
    }

    /**
     * Chart is a Helm chart name, and must be specified for applications sourced from a Helm repo.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("chart")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Chart is a Helm chart name, and must be specified for applications sourced from a Helm repo.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String chart;

    public String getChart() {
        return chart;
    }

    public void setChart(String chart) {
        this.chart = chart;
    }

    /**
     * Directory holds path/directory specific options
     */
    @com.fasterxml.jackson.annotation.JsonProperty("directory")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Directory holds path/directory specific options")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.quarkiverse.argocd.v1alpha1.applicationstatus.operationstate.syncresult.sources.Directory directory;

    public io.quarkiverse.argocd.v1alpha1.applicationstatus.operationstate.syncresult.sources.Directory getDirectory() {
        return directory;
    }

    public void setDirectory(
            io.quarkiverse.argocd.v1alpha1.applicationstatus.operationstate.syncresult.sources.Directory directory) {
        this.directory = directory;
    }

    /**
     * Helm holds helm specific options
     */
    @com.fasterxml.jackson.annotation.JsonProperty("helm")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Helm holds helm specific options")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.quarkiverse.argocd.v1alpha1.applicationstatus.operationstate.syncresult.sources.Helm helm;

    public io.quarkiverse.argocd.v1alpha1.applicationstatus.operationstate.syncresult.sources.Helm getHelm() {
        return helm;
    }

    public void setHelm(io.quarkiverse.argocd.v1alpha1.applicationstatus.operationstate.syncresult.sources.Helm helm) {
        this.helm = helm;
    }

    /**
     * Kustomize holds kustomize specific options
     */
    @com.fasterxml.jackson.annotation.JsonProperty("kustomize")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Kustomize holds kustomize specific options")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.quarkiverse.argocd.v1alpha1.applicationstatus.operationstate.syncresult.sources.Kustomize kustomize;

    public io.quarkiverse.argocd.v1alpha1.applicationstatus.operationstate.syncresult.sources.Kustomize getKustomize() {
        return kustomize;
    }

    public void setKustomize(
            io.quarkiverse.argocd.v1alpha1.applicationstatus.operationstate.syncresult.sources.Kustomize kustomize) {
        this.kustomize = kustomize;
    }

    /**
     * Path is a directory path within the Git repository, and is only valid for applications sourced from Git.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("path")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Path is a directory path within the Git repository, and is only valid for applications sourced from Git.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String path;

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    /**
     * Plugin holds config management plugin specific options
     */
    @com.fasterxml.jackson.annotation.JsonProperty("plugin")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Plugin holds config management plugin specific options")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.quarkiverse.argocd.v1alpha1.applicationstatus.operationstate.syncresult.sources.Plugin plugin;

    public io.quarkiverse.argocd.v1alpha1.applicationstatus.operationstate.syncresult.sources.Plugin getPlugin() {
        return plugin;
    }

    public void setPlugin(io.quarkiverse.argocd.v1alpha1.applicationstatus.operationstate.syncresult.sources.Plugin plugin) {
        this.plugin = plugin;
    }

    /**
     * Ref is reference to another source within sources field. This field will not be used if used with a `source` tag.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("ref")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Ref is reference to another source within sources field. This field will not be used if used with a `source` tag.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String ref;

    public String getRef() {
        return ref;
    }

    public void setRef(String ref) {
        this.ref = ref;
    }

    /**
     * RepoURL is the URL to the repository (Git or Helm) that contains the application manifests
     */
    @com.fasterxml.jackson.annotation.JsonProperty("repoURL")
    @io.fabric8.generator.annotation.Required()
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("RepoURL is the URL to the repository (Git or Helm) that contains the application manifests")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String repoURL;

    public String getRepoURL() {
        return repoURL;
    }

    public void setRepoURL(String repoURL) {
        this.repoURL = repoURL;
    }

    /**
     * TargetRevision defines the revision of the source to sync the application to. In case of Git, this can be commit, tag, or
     * branch. If omitted, will equal to HEAD. In case of Helm, this is a semver tag for the Chart's version.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("targetRevision")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("TargetRevision defines the revision of the source to sync the application to. In case of Git, this can be commit, tag, or branch. If omitted, will equal to HEAD. In case of Helm, this is a semver tag for the Chart's version.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String targetRevision;

    public String getTargetRevision() {
        return targetRevision;
    }

    public void setTargetRevision(String targetRevision) {
        this.targetRevision = targetRevision;
    }
}
