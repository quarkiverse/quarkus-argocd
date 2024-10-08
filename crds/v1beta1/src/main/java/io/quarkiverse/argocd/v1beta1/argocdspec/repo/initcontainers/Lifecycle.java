package io.quarkiverse.argocd.v1beta1.argocdspec.repo.initcontainers;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({ "postStart", "preStop" })
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
public class Lifecycle implements io.fabric8.kubernetes.api.builder.Editable<LifecycleBuilder>,
        io.fabric8.kubernetes.api.model.KubernetesResource {

    @java.lang.Override
    public LifecycleBuilder edit() {
        return new LifecycleBuilder(this);
    }

    /**
     * PostStart is called immediately after a container is created. If the handler fails, the container is terminated and
     * restarted according to its restart policy. Other management of the container blocks until the hook completes. More info:
     * https://kubernetes.io/docs/concepts/containers/container-lifecycle-hooks/#container-hooks
     */
    @com.fasterxml.jackson.annotation.JsonProperty("postStart")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("PostStart is called immediately after a container is created. If the handler fails, the container is terminated and restarted according to its restart policy. Other management of the container blocks until the hook completes. More info: https://kubernetes.io/docs/concepts/containers/container-lifecycle-hooks/#container-hooks")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.quarkiverse.argocd.v1beta1.argocdspec.repo.initcontainers.lifecycle.PostStart postStart;

    public io.quarkiverse.argocd.v1beta1.argocdspec.repo.initcontainers.lifecycle.PostStart getPostStart() {
        return postStart;
    }

    public void setPostStart(io.quarkiverse.argocd.v1beta1.argocdspec.repo.initcontainers.lifecycle.PostStart postStart) {
        this.postStart = postStart;
    }

    /**
     * PreStop is called immediately before a container is terminated due to an API request or management event such as
     * liveness/startup probe failure, preemption, resource contention, etc. The handler is not called if the container crashes
     * or exits. The Pod's termination grace period countdown begins before the PreStop hook is executed. Regardless of the
     * outcome of the handler, the container will eventually terminate within the Pod's termination grace period (unless delayed
     * by finalizers). Other management of the container blocks until the hook completes or until the termination grace period
     * is reached. More info: https://kubernetes.io/docs/concepts/containers/container-lifecycle-hooks/#container-hooks
     */
    @com.fasterxml.jackson.annotation.JsonProperty("preStop")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("PreStop is called immediately before a container is terminated due to an API request or management event such as liveness/startup probe failure, preemption, resource contention, etc. The handler is not called if the container crashes or exits. The Pod's termination grace period countdown begins before the PreStop hook is executed. Regardless of the outcome of the handler, the container will eventually terminate within the Pod's termination grace period (unless delayed by finalizers). Other management of the container blocks until the hook completes or until the termination grace period is reached. More info: https://kubernetes.io/docs/concepts/containers/container-lifecycle-hooks/#container-hooks")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.quarkiverse.argocd.v1beta1.argocdspec.repo.initcontainers.lifecycle.PreStop preStop;

    public io.quarkiverse.argocd.v1beta1.argocdspec.repo.initcontainers.lifecycle.PreStop getPreStop() {
        return preStop;
    }

    public void setPreStop(io.quarkiverse.argocd.v1beta1.argocdspec.repo.initcontainers.lifecycle.PreStop preStop) {
        this.preStop = preStop;
    }
}
