package io.quarkiverse.argocd.v1beta1.argocdspec.repo.volumes.projected.sources;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({ "audience", "expirationSeconds", "path" })
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
public class ServiceAccountToken implements io.fabric8.kubernetes.api.builder.Editable<ServiceAccountTokenBuilder>,
        io.fabric8.kubernetes.api.model.KubernetesResource {

    @java.lang.Override
    public ServiceAccountTokenBuilder edit() {
        return new ServiceAccountTokenBuilder(this);
    }

    /**
     * audience is the intended audience of the token. A recipient of a token must identify itself with an identifier specified
     * in the audience of the token, and otherwise should reject the token. The audience defaults to the identifier of the
     * apiserver.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("audience")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("audience is the intended audience of the token. A recipient of a token must identify itself with an identifier specified in the audience of the token, and otherwise should reject the token. The audience defaults to the identifier of the apiserver.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String audience;

    public String getAudience() {
        return audience;
    }

    public void setAudience(String audience) {
        this.audience = audience;
    }

    /**
     * expirationSeconds is the requested duration of validity of the service account token. As the token approaches expiration,
     * the kubelet volume plugin will proactively rotate the service account token. The kubelet will start trying to rotate the
     * token if the token is older than 80 percent of its time to live or if the token is older than 24 hours.Defaults to 1 hour
     * and must be at least 10 minutes.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("expirationSeconds")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("expirationSeconds is the requested duration of validity of the service account token. As the token approaches expiration, the kubelet volume plugin will proactively rotate the service account token. The kubelet will start trying to rotate the token if the token is older than 80 percent of its time to live or if the token is older than 24 hours.Defaults to 1 hour and must be at least 10 minutes.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Long expirationSeconds;

    public Long getExpirationSeconds() {
        return expirationSeconds;
    }

    public void setExpirationSeconds(Long expirationSeconds) {
        this.expirationSeconds = expirationSeconds;
    }

    /**
     * path is the path relative to the mount point of the file to project the token into.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("path")
    @io.fabric8.generator.annotation.Required()
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("path is the path relative to the mount point of the file to project the token into.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String path;

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }
}
