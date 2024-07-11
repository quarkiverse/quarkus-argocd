package io.quarkiverse.argocd.v1beta1.argocdspec.server.autoscale;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({ "maxReplicas", "minReplicas", "scaleTargetRef",
        "targetCPUUtilizationPercentage" })
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
public class Hpa
        implements io.fabric8.kubernetes.api.builder.Editable<HpaBuilder>, io.fabric8.kubernetes.api.model.KubernetesResource {

    @java.lang.Override
    public HpaBuilder edit() {
        return new HpaBuilder(this);
    }

    /**
     * maxReplicas is the upper limit for the number of pods that can be set by the autoscaler; cannot be smaller than
     * MinReplicas.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("maxReplicas")
    @io.fabric8.generator.annotation.Required()
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("maxReplicas is the upper limit for the number of pods that can be set by the autoscaler; cannot be smaller than MinReplicas.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Integer maxReplicas;

    public Integer getMaxReplicas() {
        return maxReplicas;
    }

    public void setMaxReplicas(Integer maxReplicas) {
        this.maxReplicas = maxReplicas;
    }

    /**
     * minReplicas is the lower limit for the number of replicas to which the autoscaler can scale down. It defaults to 1 pod.
     * minReplicas is allowed to be 0 if the alpha feature gate HPAScaleToZero is enabled and at least one Object or External
     * metric is configured. Scaling is active as long as at least one metric value is available.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("minReplicas")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("minReplicas is the lower limit for the number of replicas to which the autoscaler can scale down.  It defaults to 1 pod.  minReplicas is allowed to be 0 if the alpha feature gate HPAScaleToZero is enabled and at least one Object or External metric is configured.  Scaling is active as long as at least one metric value is available.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Integer minReplicas;

    public Integer getMinReplicas() {
        return minReplicas;
    }

    public void setMinReplicas(Integer minReplicas) {
        this.minReplicas = minReplicas;
    }

    /**
     * reference to scaled resource; horizontal pod autoscaler will learn the current resource consumption and will set the
     * desired number of pods by using its Scale subresource.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("scaleTargetRef")
    @io.fabric8.generator.annotation.Required()
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("reference to scaled resource; horizontal pod autoscaler will learn the current resource consumption and will set the desired number of pods by using its Scale subresource.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.quarkiverse.argocd.v1beta1.argocdspec.server.autoscale.hpa.ScaleTargetRef scaleTargetRef;

    public io.quarkiverse.argocd.v1beta1.argocdspec.server.autoscale.hpa.ScaleTargetRef getScaleTargetRef() {
        return scaleTargetRef;
    }

    public void setScaleTargetRef(io.quarkiverse.argocd.v1beta1.argocdspec.server.autoscale.hpa.ScaleTargetRef scaleTargetRef) {
        this.scaleTargetRef = scaleTargetRef;
    }

    /**
     * targetCPUUtilizationPercentage is the target average CPU utilization (represented as a percentage of requested CPU) over
     * all the pods; if not specified the default autoscaling policy will be used.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("targetCPUUtilizationPercentage")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("targetCPUUtilizationPercentage is the target average CPU utilization (represented as a percentage of requested CPU) over all the pods; if not specified the default autoscaling policy will be used.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Integer targetCPUUtilizationPercentage;

    public Integer getTargetCPUUtilizationPercentage() {
        return targetCPUUtilizationPercentage;
    }

    public void setTargetCPUUtilizationPercentage(Integer targetCPUUtilizationPercentage) {
        this.targetCPUUtilizationPercentage = targetCPUUtilizationPercentage;
    }
}
