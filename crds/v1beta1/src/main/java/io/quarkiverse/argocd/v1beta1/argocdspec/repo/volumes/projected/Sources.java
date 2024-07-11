package io.quarkiverse.argocd.v1beta1.argocdspec.repo.volumes.projected;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({ "configMap", "downwardAPI", "secret", "serviceAccountToken" })
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
     * configMap information about the configMap data to project
     */
    @com.fasterxml.jackson.annotation.JsonProperty("configMap")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("configMap information about the configMap data to project")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.quarkiverse.argocd.v1beta1.argocdspec.repo.volumes.projected.sources.ConfigMap configMap;

    public io.quarkiverse.argocd.v1beta1.argocdspec.repo.volumes.projected.sources.ConfigMap getConfigMap() {
        return configMap;
    }

    public void setConfigMap(io.quarkiverse.argocd.v1beta1.argocdspec.repo.volumes.projected.sources.ConfigMap configMap) {
        this.configMap = configMap;
    }

    /**
     * downwardAPI information about the downwardAPI data to project
     */
    @com.fasterxml.jackson.annotation.JsonProperty("downwardAPI")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("downwardAPI information about the downwardAPI data to project")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.quarkiverse.argocd.v1beta1.argocdspec.repo.volumes.projected.sources.DownwardAPI downwardAPI;

    public io.quarkiverse.argocd.v1beta1.argocdspec.repo.volumes.projected.sources.DownwardAPI getDownwardAPI() {
        return downwardAPI;
    }

    public void setDownwardAPI(
            io.quarkiverse.argocd.v1beta1.argocdspec.repo.volumes.projected.sources.DownwardAPI downwardAPI) {
        this.downwardAPI = downwardAPI;
    }

    /**
     * secret information about the secret data to project
     */
    @com.fasterxml.jackson.annotation.JsonProperty("secret")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("secret information about the secret data to project")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.quarkiverse.argocd.v1beta1.argocdspec.repo.volumes.projected.sources.Secret secret;

    public io.quarkiverse.argocd.v1beta1.argocdspec.repo.volumes.projected.sources.Secret getSecret() {
        return secret;
    }

    public void setSecret(io.quarkiverse.argocd.v1beta1.argocdspec.repo.volumes.projected.sources.Secret secret) {
        this.secret = secret;
    }

    /**
     * serviceAccountToken is information about the serviceAccountToken data to project
     */
    @com.fasterxml.jackson.annotation.JsonProperty("serviceAccountToken")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("serviceAccountToken is information about the serviceAccountToken data to project")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.quarkiverse.argocd.v1beta1.argocdspec.repo.volumes.projected.sources.ServiceAccountToken serviceAccountToken;

    public io.quarkiverse.argocd.v1beta1.argocdspec.repo.volumes.projected.sources.ServiceAccountToken getServiceAccountToken() {
        return serviceAccountToken;
    }

    public void setServiceAccountToken(
            io.quarkiverse.argocd.v1beta1.argocdspec.repo.volumes.projected.sources.ServiceAccountToken serviceAccountToken) {
        this.serviceAccountToken = serviceAccountToken;
    }
}
