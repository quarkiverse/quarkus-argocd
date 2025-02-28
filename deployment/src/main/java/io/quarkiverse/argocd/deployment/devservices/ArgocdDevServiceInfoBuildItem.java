package io.quarkiverse.argocd.deployment.devservices;

import io.quarkus.builder.item.SimpleBuildItem;

/**
 * A build item that represents the information required to connect to an Argocd dev service.
 */
public final class ArgocdDevServiceInfoBuildItem extends SimpleBuildItem {

    private final String hostName;
    private final int hostPort;

    private final String adminUsername;
    private final String adminPassword;

    public ArgocdDevServiceInfoBuildItem(String hostName, int hostPort, String adminUsername, String adminPassword) {
        this.hostName = hostName;
        this.hostPort = hostPort;
        this.adminUsername = adminUsername;
        this.adminPassword = adminPassword;
    }

    public int hostPort() {
        return hostPort;
    }

    public String host() {
        return hostName;
    }

    public String adminUsername() {
        return adminUsername;
    }

    public String adminPassword() {
        return adminPassword;
    }
}
