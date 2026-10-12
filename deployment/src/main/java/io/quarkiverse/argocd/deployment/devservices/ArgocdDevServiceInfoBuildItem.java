package io.quarkiverse.argocd.deployment.devservices;

import io.quarkus.builder.item.SimpleBuildItem;

/**
 * A build item that represents the information required to connect to an Argocd dev service.
 */
public final class ArgocdDevServiceInfoBuildItem extends SimpleBuildItem {

    private final String hostName;
    private final int hostPort;
    private final boolean portForwardEnabled;
    private final String version;

    private final String adminUsername;
    private final String adminPassword;

    public ArgocdDevServiceInfoBuildItem(String hostName, int hostPort, boolean portForwardEnabled, String version,
            String adminUsername, String adminPassword) {
        this.hostName = hostName;
        this.hostPort = hostPort;
        this.portForwardEnabled = portForwardEnabled;
        this.version = version;
        this.adminUsername = adminUsername;
        this.adminPassword = adminPassword;
    }

    public int hostPort() {
        return hostPort;
    }

    public String host() {
        return hostName;
    }

    public boolean portForwardEnabled() {
        return portForwardEnabled;
    }

    public String version() {
        return version;
    }

    public String adminUsername() {
        return adminUsername;
    }

    public String adminPassword() {
        return adminPassword;
    }
}
