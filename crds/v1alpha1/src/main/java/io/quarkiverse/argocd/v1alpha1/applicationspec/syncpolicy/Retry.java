package io.quarkiverse.argocd.v1alpha1.applicationspec.syncpolicy;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({ "backoff", "limit" })
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
public class Retry implements io.fabric8.kubernetes.api.builder.Editable<RetryBuilder>,
        io.fabric8.kubernetes.api.model.KubernetesResource {

    @java.lang.Override
    public RetryBuilder edit() {
        return new RetryBuilder(this);
    }

    /**
     * Backoff controls how to backoff on subsequent retries of failed syncs
     */
    @com.fasterxml.jackson.annotation.JsonProperty("backoff")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Backoff controls how to backoff on subsequent retries of failed syncs")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.quarkiverse.argocd.v1alpha1.applicationspec.syncpolicy.retry.Backoff backoff;

    public io.quarkiverse.argocd.v1alpha1.applicationspec.syncpolicy.retry.Backoff getBackoff() {
        return backoff;
    }

    public void setBackoff(io.quarkiverse.argocd.v1alpha1.applicationspec.syncpolicy.retry.Backoff backoff) {
        this.backoff = backoff;
    }

    /**
     * Limit is the maximum number of attempts for retrying a failed sync. If set to 0, no retries will be performed.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("limit")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Limit is the maximum number of attempts for retrying a failed sync. If set to 0, no retries will be performed.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Long limit;

    public Long getLimit() {
        return limit;
    }

    public void setLimit(Long limit) {
        this.limit = limit;
    }
}
