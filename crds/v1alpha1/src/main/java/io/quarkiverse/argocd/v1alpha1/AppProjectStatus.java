package io.quarkiverse.argocd.v1alpha1;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({ "jwtTokensByRole" })
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
public class AppProjectStatus implements io.fabric8.kubernetes.api.builder.Editable<AppProjectStatusBuilder>,
        io.fabric8.kubernetes.api.model.KubernetesResource {

    @java.lang.Override
    public AppProjectStatusBuilder edit() {
        return new AppProjectStatusBuilder(this);
    }

    /**
     * JWTTokensByRole contains a list of JWT tokens issued for a given role
     */
    @com.fasterxml.jackson.annotation.JsonProperty("jwtTokensByRole")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("JWTTokensByRole contains a list of JWT tokens issued for a given role")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private java.util.Map<java.lang.String, io.quarkiverse.argocd.v1alpha1.appprojectstatus.JwtTokensByRole> jwtTokensByRole;

    public java.util.Map<java.lang.String, io.quarkiverse.argocd.v1alpha1.appprojectstatus.JwtTokensByRole> getJwtTokensByRole() {
        return jwtTokensByRole;
    }

    public void setJwtTokensByRole(
            java.util.Map<java.lang.String, io.quarkiverse.argocd.v1alpha1.appprojectstatus.JwtTokensByRole> jwtTokensByRole) {
        this.jwtTokensByRole = jwtTokensByRole;
    }
}
