package io.quarkiverse.argocd.v1beta1.argocdspec.sso.dex.env;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({ "configMapKeyRef", "fieldRef", "resourceFieldRef", "secretKeyRef" })
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
public class ValueFrom implements io.fabric8.kubernetes.api.builder.Editable<ValueFromBuilder>,
        io.fabric8.kubernetes.api.model.KubernetesResource {

    @java.lang.Override
    public ValueFromBuilder edit() {
        return new ValueFromBuilder(this);
    }

    /**
     * Selects a key of a ConfigMap.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("configMapKeyRef")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Selects a key of a ConfigMap.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.quarkiverse.argocd.v1beta1.argocdspec.sso.dex.env.valuefrom.ConfigMapKeyRef configMapKeyRef;

    public io.quarkiverse.argocd.v1beta1.argocdspec.sso.dex.env.valuefrom.ConfigMapKeyRef getConfigMapKeyRef() {
        return configMapKeyRef;
    }

    public void setConfigMapKeyRef(
            io.quarkiverse.argocd.v1beta1.argocdspec.sso.dex.env.valuefrom.ConfigMapKeyRef configMapKeyRef) {
        this.configMapKeyRef = configMapKeyRef;
    }

    /**
     * Selects a field of the pod: supports metadata.name, metadata.namespace, `metadata.labels['<KEY>']`,
     * `metadata.annotations['<KEY>']`, spec.nodeName, spec.serviceAccountName, status.hostIP, status.podIP, status.podIPs.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("fieldRef")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Selects a field of the pod: supports metadata.name, metadata.namespace, `metadata.labels['<KEY>']`, `metadata.annotations['<KEY>']`, spec.nodeName, spec.serviceAccountName, status.hostIP, status.podIP, status.podIPs.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.quarkiverse.argocd.v1beta1.argocdspec.sso.dex.env.valuefrom.FieldRef fieldRef;

    public io.quarkiverse.argocd.v1beta1.argocdspec.sso.dex.env.valuefrom.FieldRef getFieldRef() {
        return fieldRef;
    }

    public void setFieldRef(io.quarkiverse.argocd.v1beta1.argocdspec.sso.dex.env.valuefrom.FieldRef fieldRef) {
        this.fieldRef = fieldRef;
    }

    /**
     * Selects a resource of the container: only resources limits and requests (limits.cpu, limits.memory,
     * limits.ephemeral-storage, requests.cpu, requests.memory and requests.ephemeral-storage) are currently supported.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("resourceFieldRef")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Selects a resource of the container: only resources limits and requests (limits.cpu, limits.memory, limits.ephemeral-storage, requests.cpu, requests.memory and requests.ephemeral-storage) are currently supported.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.quarkiverse.argocd.v1beta1.argocdspec.sso.dex.env.valuefrom.ResourceFieldRef resourceFieldRef;

    public io.quarkiverse.argocd.v1beta1.argocdspec.sso.dex.env.valuefrom.ResourceFieldRef getResourceFieldRef() {
        return resourceFieldRef;
    }

    public void setResourceFieldRef(
            io.quarkiverse.argocd.v1beta1.argocdspec.sso.dex.env.valuefrom.ResourceFieldRef resourceFieldRef) {
        this.resourceFieldRef = resourceFieldRef;
    }

    /**
     * Selects a key of a secret in the pod's namespace
     */
    @com.fasterxml.jackson.annotation.JsonProperty("secretKeyRef")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Selects a key of a secret in the pod's namespace")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.quarkiverse.argocd.v1beta1.argocdspec.sso.dex.env.valuefrom.SecretKeyRef secretKeyRef;

    public io.quarkiverse.argocd.v1beta1.argocdspec.sso.dex.env.valuefrom.SecretKeyRef getSecretKeyRef() {
        return secretKeyRef;
    }

    public void setSecretKeyRef(io.quarkiverse.argocd.v1beta1.argocdspec.sso.dex.env.valuefrom.SecretKeyRef secretKeyRef) {
        this.secretKeyRef = secretKeyRef;
    }
}
