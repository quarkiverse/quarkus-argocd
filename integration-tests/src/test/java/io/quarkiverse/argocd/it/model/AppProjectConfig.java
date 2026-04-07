package io.quarkiverse.argocd.it.model;

import lombok.*;

@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class AppProjectConfig {
    private String name;
    private String namespace;
    private String sourceNamespaces;
    private String destinationNamespace;

    // Should be the same as application's field
    private String gitUrl;

    // Should be the same as application's field
    private String destinationKubeServer;
}
