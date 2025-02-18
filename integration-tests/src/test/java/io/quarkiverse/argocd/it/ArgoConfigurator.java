package io.quarkiverse.argocd.it;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Builder.Default;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ArgoConfigurator {
    @Default
    private String projectName = "default";

    @Default
    private String projectNamespace = "argocd";

    @Default
    private String destinationKubeServer = "https://kubernetes.default.svc";
    private String destinationNamespace;

    private String sourceNamespaces;

    private String gitUrl;

    @Default
    private String gitRevision = "main";

    private String applicationName;
    private String applicationNamespace;

    @Default
    private String helmUrl = "https://github.com/argoproj/argocd-example-apps.git";
    @Default
    private String helmPath = "helm-guestbook";
}
