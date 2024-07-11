package io.quarkiverse.argocd.v1beta1.argocdspec.repo.sidecarcontainers.livenessprobe;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({ "host", "httpHeaders", "path", "port", "scheme" })
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
public class HttpGet implements io.fabric8.kubernetes.api.builder.Editable<HttpGetBuilder>,
        io.fabric8.kubernetes.api.model.KubernetesResource {

    @java.lang.Override
    public HttpGetBuilder edit() {
        return new HttpGetBuilder(this);
    }

    /**
     * Host name to connect to, defaults to the pod IP. You probably want to set "Host" in httpHeaders instead.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("host")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Host name to connect to, defaults to the pod IP. You probably want to set \"Host\" in httpHeaders instead.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String host;

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    /**
     * Custom headers to set in the request. HTTP allows repeated headers.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("httpHeaders")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Custom headers to set in the request. HTTP allows repeated headers.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private java.util.List<io.quarkiverse.argocd.v1beta1.argocdspec.repo.sidecarcontainers.livenessprobe.httpget.HttpHeaders> httpHeaders;

    public java.util.List<io.quarkiverse.argocd.v1beta1.argocdspec.repo.sidecarcontainers.livenessprobe.httpget.HttpHeaders> getHttpHeaders() {
        return httpHeaders;
    }

    public void setHttpHeaders(
            java.util.List<io.quarkiverse.argocd.v1beta1.argocdspec.repo.sidecarcontainers.livenessprobe.httpget.HttpHeaders> httpHeaders) {
        this.httpHeaders = httpHeaders;
    }

    /**
     * Path to access on the HTTP server.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("path")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Path to access on the HTTP server.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String path;

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    /**
     * Name or number of the port to access on the container. Number must be in the range 1 to 65535. Name must be an
     * IANA_SVC_NAME.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("port")
    @io.fabric8.generator.annotation.Required()
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Name or number of the port to access on the container. Number must be in the range 1 to 65535. Name must be an IANA_SVC_NAME.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.fabric8.kubernetes.api.model.IntOrString port;

    public io.fabric8.kubernetes.api.model.IntOrString getPort() {
        return port;
    }

    public void setPort(io.fabric8.kubernetes.api.model.IntOrString port) {
        this.port = port;
    }

    /**
     * Scheme to use for connecting to the host. Defaults to HTTP.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("scheme")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Scheme to use for connecting to the host. Defaults to HTTP.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String scheme;

    public String getScheme() {
        return scheme;
    }

    public void setScheme(String scheme) {
        this.scheme = scheme;
    }
}
