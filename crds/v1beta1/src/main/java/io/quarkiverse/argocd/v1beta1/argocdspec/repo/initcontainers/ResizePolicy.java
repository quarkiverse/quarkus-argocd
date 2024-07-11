package io.quarkiverse.argocd.v1beta1.argocdspec.repo.initcontainers;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({ "resourceName", "restartPolicy" })
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
public class ResizePolicy implements io.fabric8.kubernetes.api.builder.Editable<ResizePolicyBuilder>,
        io.fabric8.kubernetes.api.model.KubernetesResource {

    @java.lang.Override
    public ResizePolicyBuilder edit() {
        return new ResizePolicyBuilder(this);
    }

    /**
     * Name of the resource to which this resource resize policy applies. Supported values: cpu, memory.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("resourceName")
    @io.fabric8.generator.annotation.Required()
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Name of the resource to which this resource resize policy applies. Supported values: cpu, memory.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String resourceName;

    public String getResourceName() {
        return resourceName;
    }

    public void setResourceName(String resourceName) {
        this.resourceName = resourceName;
    }

    /**
     * Restart policy to apply when specified resource is resized. If not specified, it defaults to NotRequired.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("restartPolicy")
    @io.fabric8.generator.annotation.Required()
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Restart policy to apply when specified resource is resized. If not specified, it defaults to NotRequired.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String restartPolicy;

    public String getRestartPolicy() {
        return restartPolicy;
    }

    public void setRestartPolicy(String restartPolicy) {
        this.restartPolicy = restartPolicy;
    }
}
