package io.quarkiverse.argocd.v1beta1.argocdspec.controller;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({ "clustersPerShard", "dynamicScalingEnabled", "enabled", "maxShards",
        "minShards", "replicas" })
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
public class Sharding implements io.fabric8.kubernetes.api.builder.Editable<ShardingBuilder>,
        io.fabric8.kubernetes.api.model.KubernetesResource {

    @java.lang.Override
    public ShardingBuilder edit() {
        return new ShardingBuilder(this);
    }

    /**
     * ClustersPerShard defines the maximum number of clusters managed by each argocd shard
     */
    @com.fasterxml.jackson.annotation.JsonProperty("clustersPerShard")
    @io.fabric8.generator.annotation.Min(1.0)
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("ClustersPerShard defines the maximum number of clusters managed by each argocd shard")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Integer clustersPerShard;

    public Integer getClustersPerShard() {
        return clustersPerShard;
    }

    public void setClustersPerShard(Integer clustersPerShard) {
        this.clustersPerShard = clustersPerShard;
    }

    /**
     * DynamicScalingEnabled defines whether dynamic scaling should be enabled for Application Controller component
     */
    @com.fasterxml.jackson.annotation.JsonProperty("dynamicScalingEnabled")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("DynamicScalingEnabled defines whether dynamic scaling should be enabled for Application Controller component")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Boolean dynamicScalingEnabled;

    public Boolean getDynamicScalingEnabled() {
        return dynamicScalingEnabled;
    }

    public void setDynamicScalingEnabled(Boolean dynamicScalingEnabled) {
        this.dynamicScalingEnabled = dynamicScalingEnabled;
    }

    /**
     * Enabled defines whether sharding should be enabled on the Application Controller component.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("enabled")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Enabled defines whether sharding should be enabled on the Application Controller component.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Boolean enabled;

    public Boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    /**
     * MaxShards defines the maximum number of shards at any given point
     */
    @com.fasterxml.jackson.annotation.JsonProperty("maxShards")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("MaxShards defines the maximum number of shards at any given point")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Integer maxShards;

    public Integer getMaxShards() {
        return maxShards;
    }

    public void setMaxShards(Integer maxShards) {
        this.maxShards = maxShards;
    }

    /**
     * MinShards defines the minimum number of shards at any given point
     */
    @com.fasterxml.jackson.annotation.JsonProperty("minShards")
    @io.fabric8.generator.annotation.Min(1.0)
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("MinShards defines the minimum number of shards at any given point")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Integer minShards;

    public Integer getMinShards() {
        return minShards;
    }

    public void setMinShards(Integer minShards) {
        this.minShards = minShards;
    }

    /**
     * Replicas defines the number of replicas to run in the Application controller shard.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("replicas")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Replicas defines the number of replicas to run in the Application controller shard.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Integer replicas;

    public Integer getReplicas() {
        return replicas;
    }

    public void setReplicas(Integer replicas) {
        this.replicas = replicas;
    }
}
