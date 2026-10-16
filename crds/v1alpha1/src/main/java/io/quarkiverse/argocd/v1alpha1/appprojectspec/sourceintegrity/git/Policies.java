package io.quarkiverse.argocd.v1alpha1.appprojectspec.sourceintegrity.git;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({ "gpg", "repos" })
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
public class Policies implements io.fabric8.kubernetes.api.builder.Editable<PoliciesBuilder>,
        io.fabric8.kubernetes.api.model.KubernetesResource {

    @java.lang.Override
    public PoliciesBuilder edit() {
        return new PoliciesBuilder(this);
    }

    /**
     * Verify GPG commit/tag signatures
     */
    @com.fasterxml.jackson.annotation.JsonProperty("gpg")
    @io.fabric8.generator.annotation.Required()
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Verify GPG commit/tag signatures")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.quarkiverse.argocd.v1alpha1.appprojectspec.sourceintegrity.git.policies.Gpg gpg;

    public io.quarkiverse.argocd.v1alpha1.appprojectspec.sourceintegrity.git.policies.Gpg getGpg() {
        return gpg;
    }

    public void setGpg(io.quarkiverse.argocd.v1alpha1.appprojectspec.sourceintegrity.git.policies.Gpg gpg) {
        this.gpg = gpg;
    }

    /**
     * List of repository criteria restricting repositories the policy will apply to
     */
    @com.fasterxml.jackson.annotation.JsonProperty("repos")
    @io.fabric8.generator.annotation.Required()
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("List of repository criteria restricting repositories the policy will apply to")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private java.util.List<io.quarkiverse.argocd.v1alpha1.appprojectspec.sourceintegrity.git.policies.Repos> repos;

    public java.util.List<io.quarkiverse.argocd.v1alpha1.appprojectspec.sourceintegrity.git.policies.Repos> getRepos() {
        return repos;
    }

    public void setRepos(
            java.util.List<io.quarkiverse.argocd.v1alpha1.appprojectspec.sourceintegrity.git.policies.Repos> repos) {
        this.repos = repos;
    }
}
