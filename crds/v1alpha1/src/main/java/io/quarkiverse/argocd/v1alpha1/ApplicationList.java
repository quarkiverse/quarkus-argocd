package io.quarkiverse.argocd.v1alpha1;

import io.fabric8.kubernetes.api.model.DefaultKubernetesResourceList;
import io.sundr.builder.annotations.Buildable;

@Buildable(editableEnabled = false, validationEnabled = false, generateBuilderPackage = false, builderPackage = "io.fabric8.kubernetes.api.builder")
public class ApplicationList extends DefaultKubernetesResourceList<Application> {
}