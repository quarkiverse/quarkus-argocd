package io.quarkiverse.argocd.it;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ArgoConfigurator {
    @Builder.Default
    private String projectName = "default";

    @Builder.Default
    private String projectNamespace = "argocd";

    @Builder.Default
    private String destinationKubeServer = "https://kubernetes.default.svc";
    private String destinationNamespace;

    private String sourceNamespaces;

    private String gitUrl;

    @Builder.Default
    private String gitRevision = "main";

    private String applicationName;
    private String applicationNamespace;

    @Builder.Default
    private String helmUrl = "https://github.com/argoproj/argocd-example-apps.git";
    @Builder.Default
    private String helmPath = "helm-guestbook";
}
