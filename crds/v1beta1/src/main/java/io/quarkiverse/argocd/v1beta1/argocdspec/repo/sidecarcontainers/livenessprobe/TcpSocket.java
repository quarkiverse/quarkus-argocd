package io.quarkiverse.argocd.v1beta1.argocdspec.repo.sidecarcontainers.livenessprobe;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({ "host", "port" })
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
public class TcpSocket implements io.fabric8.kubernetes.api.builder.Editable<TcpSocketBuilder>,
        io.fabric8.kubernetes.api.model.KubernetesResource {

    @java.lang.Override
    public TcpSocketBuilder edit() {
        return new TcpSocketBuilder(this);
    }

    /**
     * Optional: Host name to connect to, defaults to the pod IP.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("host")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Optional: Host name to connect to, defaults to the pod IP.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String host;

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    /**
     * Number or name of the port to access on the container. Number must be in the range 1 to 65535. Name must be an
     * IANA_SVC_NAME.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("port")
    @io.fabric8.generator.annotation.Required()
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Number or name of the port to access on the container. Number must be in the range 1 to 65535. Name must be an IANA_SVC_NAME.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.fabric8.kubernetes.api.model.IntOrString port;

    public io.fabric8.kubernetes.api.model.IntOrString getPort() {
        return port;
    }

    public void setPort(io.fabric8.kubernetes.api.model.IntOrString port) {
        this.port = port;
    }
}
