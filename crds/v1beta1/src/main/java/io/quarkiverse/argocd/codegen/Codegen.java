package io.quarkiverse.argocd.codegen;

import io.sundr.transform.annotations.AnnotationSelector;
import io.sundr.transform.annotations.TemplateTransformation;
import io.sundr.transform.annotations.TemplateTransformations;

@TemplateTransformations(annotations = @AnnotationSelector(io.fabric8.kubernetes.model.annotation.Group.class), value = {
        @TemplateTransformation("/resource-list.vm"),
        @TemplateTransformation(value = "/service.vm", outputPath = "META-INF/services/io.fabric8.kubernetes.api.model.KubernetesResource", gather = true),
        @TemplateTransformation(value = "/dsl.vm", outputPath = "io.quarkiverse.argocd/argocds/v1beta1/Dsl.java", gather = true),
        @TemplateTransformation(value = "/client.vm", outputPath = "io.quarkiverse.argocd/argocds/v1beta1/Client.java", gather = true)
})
public class Codegen {
}
