package io.quarkiverse.argocd.v1beta1.argocdspec.controller;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({ "claims", "limits", "requests" })
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
public class Resources implements io.fabric8.kubernetes.api.builder.Editable<ResourcesBuilder>,
        io.fabric8.kubernetes.api.model.KubernetesResource {

    @java.lang.Override
    public ResourcesBuilder edit() {
        return new ResourcesBuilder(this);
    }

    /**
     * Claims lists the names of resources, defined in spec.resourceClaims, that are used by this container.
     * This is an alpha field and requires enabling the DynamicResourceAllocation feature gate.
     * This field is immutable. It can only be set for containers.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("claims")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Claims lists the names of resources, defined in spec.resourceClaims, that are used by this container. \n This is an alpha field and requires enabling the DynamicResourceAllocation feature gate. \n This field is immutable. It can only be set for containers.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private java.util.List<io.quarkiverse.argocd.v1beta1.argocdspec.controller.resources.Claims> claims;

    public java.util.List<io.quarkiverse.argocd.v1beta1.argocdspec.controller.resources.Claims> getClaims() {
        return claims;
    }

    public void setClaims(java.util.List<io.quarkiverse.argocd.v1beta1.argocdspec.controller.resources.Claims> claims) {
        this.claims = claims;
    }

    /**
     * Limits describes the maximum amount of compute resources allowed. More info:
     * https://kubernetes.io/docs/concepts/configuration/manage-resources-containers/
     */
    @com.fasterxml.jackson.annotation.JsonProperty("limits")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Limits describes the maximum amount of compute resources allowed. More info: https://kubernetes.io/docs/concepts/configuration/manage-resources-containers/")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private java.util.Map<java.lang.String, io.fabric8.kubernetes.api.model.IntOrString> limits;

    public java.util.Map<java.lang.String, io.fabric8.kubernetes.api.model.IntOrString> getLimits() {
        return limits;
    }

    public void setLimits(java.util.Map<java.lang.String, io.fabric8.kubernetes.api.model.IntOrString> limits) {
        this.limits = limits;
    }

    /**
     * Requests describes the minimum amount of compute resources required. If Requests is omitted for a container, it defaults
     * to Limits if that is explicitly specified, otherwise to an implementation-defined value. Requests cannot exceed Limits.
     * More info: https://kubernetes.io/docs/concepts/configuration/manage-resources-containers/
     */
    @com.fasterxml.jackson.annotation.JsonProperty("requests")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Requests describes the minimum amount of compute resources required. If Requests is omitted for a container, it defaults to Limits if that is explicitly specified, otherwise to an implementation-defined value. Requests cannot exceed Limits. More info: https://kubernetes.io/docs/concepts/configuration/manage-resources-containers/")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private java.util.Map<java.lang.String, io.fabric8.kubernetes.api.model.IntOrString> requests;

    public java.util.Map<java.lang.String, io.fabric8.kubernetes.api.model.IntOrString> getRequests() {
        return requests;
    }

    public void setRequests(java.util.Map<java.lang.String, io.fabric8.kubernetes.api.model.IntOrString> requests) {
        this.requests = requests;
    }
}
