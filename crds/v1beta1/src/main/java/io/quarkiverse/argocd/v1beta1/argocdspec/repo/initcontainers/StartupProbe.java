package io.quarkiverse.argocd.v1beta1.argocdspec.repo.initcontainers;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({ "exec", "failureThreshold", "grpc", "httpGet", "initialDelaySeconds",
        "periodSeconds", "successThreshold", "tcpSocket", "terminationGracePeriodSeconds", "timeoutSeconds" })
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
public class StartupProbe implements io.fabric8.kubernetes.api.builder.Editable<StartupProbeBuilder>,
        io.fabric8.kubernetes.api.model.KubernetesResource {

    @java.lang.Override
    public StartupProbeBuilder edit() {
        return new StartupProbeBuilder(this);
    }

    /**
     * Exec specifies the action to take.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("exec")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Exec specifies the action to take.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.quarkiverse.argocd.v1beta1.argocdspec.repo.initcontainers.startupprobe.Exec exec;

    public io.quarkiverse.argocd.v1beta1.argocdspec.repo.initcontainers.startupprobe.Exec getExec() {
        return exec;
    }

    public void setExec(io.quarkiverse.argocd.v1beta1.argocdspec.repo.initcontainers.startupprobe.Exec exec) {
        this.exec = exec;
    }

    /**
     * Minimum consecutive failures for the probe to be considered failed after having succeeded. Defaults to 3. Minimum value
     * is 1.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("failureThreshold")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Minimum consecutive failures for the probe to be considered failed after having succeeded. Defaults to 3. Minimum value is 1.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Integer failureThreshold;

    public Integer getFailureThreshold() {
        return failureThreshold;
    }

    public void setFailureThreshold(Integer failureThreshold) {
        this.failureThreshold = failureThreshold;
    }

    /**
     * GRPC specifies an action involving a GRPC port.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("grpc")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("GRPC specifies an action involving a GRPC port.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.quarkiverse.argocd.v1beta1.argocdspec.repo.initcontainers.startupprobe.Grpc grpc;

    public io.quarkiverse.argocd.v1beta1.argocdspec.repo.initcontainers.startupprobe.Grpc getGrpc() {
        return grpc;
    }

    public void setGrpc(io.quarkiverse.argocd.v1beta1.argocdspec.repo.initcontainers.startupprobe.Grpc grpc) {
        this.grpc = grpc;
    }

    /**
     * HTTPGet specifies the http request to perform.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("httpGet")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("HTTPGet specifies the http request to perform.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.quarkiverse.argocd.v1beta1.argocdspec.repo.initcontainers.startupprobe.HttpGet httpGet;

    public io.quarkiverse.argocd.v1beta1.argocdspec.repo.initcontainers.startupprobe.HttpGet getHttpGet() {
        return httpGet;
    }

    public void setHttpGet(io.quarkiverse.argocd.v1beta1.argocdspec.repo.initcontainers.startupprobe.HttpGet httpGet) {
        this.httpGet = httpGet;
    }

    /**
     * Number of seconds after the container has started before liveness probes are initiated. More info:
     * https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle#container-probes
     */
    @com.fasterxml.jackson.annotation.JsonProperty("initialDelaySeconds")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Number of seconds after the container has started before liveness probes are initiated. More info: https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle#container-probes")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Integer initialDelaySeconds;

    public Integer getInitialDelaySeconds() {
        return initialDelaySeconds;
    }

    public void setInitialDelaySeconds(Integer initialDelaySeconds) {
        this.initialDelaySeconds = initialDelaySeconds;
    }

    /**
     * How often (in seconds) to perform the probe. Default to 10 seconds. Minimum value is 1.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("periodSeconds")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("How often (in seconds) to perform the probe. Default to 10 seconds. Minimum value is 1.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Integer periodSeconds;

    public Integer getPeriodSeconds() {
        return periodSeconds;
    }

    public void setPeriodSeconds(Integer periodSeconds) {
        this.periodSeconds = periodSeconds;
    }

    /**
     * Minimum consecutive successes for the probe to be considered successful after having failed. Defaults to 1. Must be 1 for
     * liveness and startup. Minimum value is 1.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("successThreshold")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Minimum consecutive successes for the probe to be considered successful after having failed. Defaults to 1. Must be 1 for liveness and startup. Minimum value is 1.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Integer successThreshold;

    public Integer getSuccessThreshold() {
        return successThreshold;
    }

    public void setSuccessThreshold(Integer successThreshold) {
        this.successThreshold = successThreshold;
    }

    /**
     * TCPSocket specifies an action involving a TCP port.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("tcpSocket")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("TCPSocket specifies an action involving a TCP port.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.quarkiverse.argocd.v1beta1.argocdspec.repo.initcontainers.startupprobe.TcpSocket tcpSocket;

    public io.quarkiverse.argocd.v1beta1.argocdspec.repo.initcontainers.startupprobe.TcpSocket getTcpSocket() {
        return tcpSocket;
    }

    public void setTcpSocket(io.quarkiverse.argocd.v1beta1.argocdspec.repo.initcontainers.startupprobe.TcpSocket tcpSocket) {
        this.tcpSocket = tcpSocket;
    }

    /**
     * Optional duration in seconds the pod needs to terminate gracefully upon probe failure. The grace period is the duration
     * in seconds after the processes running in the pod are sent a termination signal and the time when the processes are
     * forcibly halted with a kill signal. Set this value longer than the expected cleanup time for your process. If this value
     * is nil, the pod's terminationGracePeriodSeconds will be used. Otherwise, this value overrides the value provided by the
     * pod spec. Value must be non-negative integer. The value zero indicates stop immediately via the kill signal (no
     * opportunity to shut down). This is a beta field and requires enabling ProbeTerminationGracePeriod feature gate. Minimum
     * value is 1. spec.terminationGracePeriodSeconds is used if unset.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("terminationGracePeriodSeconds")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Optional duration in seconds the pod needs to terminate gracefully upon probe failure. The grace period is the duration in seconds after the processes running in the pod are sent a termination signal and the time when the processes are forcibly halted with a kill signal. Set this value longer than the expected cleanup time for your process. If this value is nil, the pod's terminationGracePeriodSeconds will be used. Otherwise, this value overrides the value provided by the pod spec. Value must be non-negative integer. The value zero indicates stop immediately via the kill signal (no opportunity to shut down). This is a beta field and requires enabling ProbeTerminationGracePeriod feature gate. Minimum value is 1. spec.terminationGracePeriodSeconds is used if unset.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Long terminationGracePeriodSeconds;

    public Long getTerminationGracePeriodSeconds() {
        return terminationGracePeriodSeconds;
    }

    public void setTerminationGracePeriodSeconds(Long terminationGracePeriodSeconds) {
        this.terminationGracePeriodSeconds = terminationGracePeriodSeconds;
    }

    /**
     * Number of seconds after which the probe times out. Defaults to 1 second. Minimum value is 1. More info:
     * https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle#container-probes
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeoutSeconds")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Number of seconds after which the probe times out. Defaults to 1 second. Minimum value is 1. More info: https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle#container-probes")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Integer timeoutSeconds;

    public Integer getTimeoutSeconds() {
        return timeoutSeconds;
    }

    public void setTimeoutSeconds(Integer timeoutSeconds) {
        this.timeoutSeconds = timeoutSeconds;
    }
}
