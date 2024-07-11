package io.quarkiverse.argocd.v1beta1.argocdspec.repo.initcontainers.lifecycle;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({ "exec", "httpGet", "tcpSocket" })
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
public class PostStart implements io.fabric8.kubernetes.api.builder.Editable<PostStartBuilder>,
        io.fabric8.kubernetes.api.model.KubernetesResource {

    @java.lang.Override
    public PostStartBuilder edit() {
        return new PostStartBuilder(this);
    }

    /**
     * Exec specifies the action to take.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("exec")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Exec specifies the action to take.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.quarkiverse.argocd.v1beta1.argocdspec.repo.initcontainers.lifecycle.poststart.Exec exec;

    public io.quarkiverse.argocd.v1beta1.argocdspec.repo.initcontainers.lifecycle.poststart.Exec getExec() {
        return exec;
    }

    public void setExec(io.quarkiverse.argocd.v1beta1.argocdspec.repo.initcontainers.lifecycle.poststart.Exec exec) {
        this.exec = exec;
    }

    /**
     * HTTPGet specifies the http request to perform.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("httpGet")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("HTTPGet specifies the http request to perform.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.quarkiverse.argocd.v1beta1.argocdspec.repo.initcontainers.lifecycle.poststart.HttpGet httpGet;

    public io.quarkiverse.argocd.v1beta1.argocdspec.repo.initcontainers.lifecycle.poststart.HttpGet getHttpGet() {
        return httpGet;
    }

    public void setHttpGet(io.quarkiverse.argocd.v1beta1.argocdspec.repo.initcontainers.lifecycle.poststart.HttpGet httpGet) {
        this.httpGet = httpGet;
    }

    /**
     * Deprecated. TCPSocket is NOT supported as a LifecycleHandler and kept for the backward compatibility. There are no
     * validation of this field and lifecycle hooks will fail in runtime when tcp handler is specified.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("tcpSocket")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Deprecated. TCPSocket is NOT supported as a LifecycleHandler and kept for the backward compatibility. There are no validation of this field and lifecycle hooks will fail in runtime when tcp handler is specified.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.quarkiverse.argocd.v1beta1.argocdspec.repo.initcontainers.lifecycle.poststart.TcpSocket tcpSocket;

    public io.quarkiverse.argocd.v1beta1.argocdspec.repo.initcontainers.lifecycle.poststart.TcpSocket getTcpSocket() {
        return tcpSocket;
    }

    public void setTcpSocket(
            io.quarkiverse.argocd.v1beta1.argocdspec.repo.initcontainers.lifecycle.poststart.TcpSocket tcpSocket) {
        this.tcpSocket = tcpSocket;
    }
}
