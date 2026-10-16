package io.quarkiverse.argocd.v1alpha1.applicationstatus.sourcehydrator.lastsuccessfuloperation.sourcehydrator;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({ "path", "repoURL", "targetBranch" })
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
public class SyncSource implements io.fabric8.kubernetes.api.builder.Editable<SyncSourceBuilder>,
        io.fabric8.kubernetes.api.model.KubernetesResource {

    @java.lang.Override
    public SyncSourceBuilder edit() {
        return new SyncSourceBuilder(this);
    }

    /**
     * Path is a directory path within the git repository where hydrated manifests should be committed to and synced
     * from. The Path should never point to the root of the repo. If hydrateTo is set, this is just the path from which
     * hydrated manifests will be synced.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("path")
    @io.fabric8.generator.annotation.Required()
    @io.fabric8.generator.annotation.Pattern("^.{2,}|[^./]$")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Path is a directory path within the git repository where hydrated manifests should be committed to and synced\nfrom. The Path should never point to the root of the repo. If hydrateTo is set, this is just the path from which\nhydrated manifests will be synced.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String path;

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    /**
     * RepoURL is the URL to the git repository that contains the hydrated manifests. If not set, defaults to
     * the DrySource.RepoURL.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("repoURL")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("RepoURL is the URL to the git repository that contains the hydrated manifests. If not set, defaults to\nthe DrySource.RepoURL.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String repoURL;

    public String getRepoURL() {
        return repoURL;
    }

    public void setRepoURL(String repoURL) {
        this.repoURL = repoURL;
    }

    /**
     * TargetBranch is the branch from which hydrated manifests will be synced.
     * If HydrateTo is not set, this is also the branch to which hydrated manifests are committed.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("targetBranch")
    @io.fabric8.generator.annotation.Required()
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("TargetBranch is the branch from which hydrated manifests will be synced.\nIf HydrateTo is not set, this is also the branch to which hydrated manifests are committed.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String targetBranch;

    public String getTargetBranch() {
        return targetBranch;
    }

    public void setTargetBranch(String targetBranch) {
        this.targetBranch = targetBranch;
    }
}
