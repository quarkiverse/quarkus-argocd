package io.quarkiverse.argocd.it.model;

import lombok.*;

@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ApplicationConfig {
    private String name;
    private String namespace;
    private String appProjectName;
    private String gitUrl;
    private String gitRevision;
    private String destinationKubeServer;
    private String destinationNamespace;
    private String helmUrl;
    private String helmPath;
}