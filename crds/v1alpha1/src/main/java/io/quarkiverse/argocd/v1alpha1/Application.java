package io.quarkiverse.argocd.v1alpha1;

@io.fabric8.kubernetes.model.annotation.Version(value = "v1alpha1", storage = true, served = true)
@io.fabric8.kubernetes.model.annotation.Group("argoproj.io")
@io.fabric8.kubernetes.model.annotation.Singular("application")
@io.fabric8.kubernetes.model.annotation.Plural("applications")
@lombok.ToString()
@lombok.EqualsAndHashCode(callSuper = true)
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
public class Application extends
        io.fabric8.kubernetes.client.CustomResource<io.quarkiverse.argocd.v1alpha1.ApplicationSpec, io.quarkiverse.argocd.v1alpha1.ApplicationStatus>
        implements io.fabric8.kubernetes.api.model.Namespaced, io.fabric8.kubernetes.api.builder.Editable<ApplicationBuilder> {

    @java.lang.Override
    public ApplicationBuilder edit() {
        return new ApplicationBuilder(this);
    }
}
