package io.quarkiverse.argocd.v1beta1.argocdspec.server;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({ "host", "ingress" })
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
public class Grpc
        implements io.fabric8.kubernetes.api.builder.Editable<GrpcBuilder>, io.fabric8.kubernetes.api.model.KubernetesResource {

    @java.lang.Override
    public GrpcBuilder edit() {
        return new GrpcBuilder(this);
    }

    /**
     * Host is the hostname to use for Ingress/Route resources.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("host")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Host is the hostname to use for Ingress/Route resources.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String host;

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    /**
     * Ingress defines the desired state for the Argo CD Server GRPC Ingress.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("ingress")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Ingress defines the desired state for the Argo CD Server GRPC Ingress.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.quarkiverse.argocd.v1beta1.argocdspec.server.grpc.Ingress ingress;

    public io.quarkiverse.argocd.v1beta1.argocdspec.server.grpc.Ingress getIngress() {
        return ingress;
    }

    public void setIngress(io.quarkiverse.argocd.v1beta1.argocdspec.server.grpc.Ingress ingress) {
        this.ingress = ingress;
    }
}
