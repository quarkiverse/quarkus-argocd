package io.quarkiverse.argocd.cli.application;

import io.quarkiverse.argocd.v1alpha1.Application;

public class ApplicationListItem {

    private String name;
    private String repo;
    private String syncStatus;
    private String healthStatus;

    public static ApplicationListItem from(Application application) {
        return new ApplicationListItem(application.getMetadata().getName(),
                application.getSpec().getSource().getRepoURL(),
                application.getStatus() != null && application.getStatus().getSync() != null
                        ? application.getStatus().getSync().getStatus()
                        : "",
                application.getStatus() != null && application.getStatus().getHealth() != null
                        ? application.getStatus().getHealth().getStatus()
                        : "");
    }

    public ApplicationListItem(String name, String repo, String syncStatus, String healthStatus) {
        this.name = name;
        this.repo = repo;
        this.syncStatus = syncStatus;
        this.healthStatus = healthStatus;
    }

    public String getName() {
        return name;
    }

    public String getRepo() {
        return repo;
    }

    public String getSyncStatus() {
        return syncStatus;
    }

    public String getHealthStatus() {
        return healthStatus;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRepo(String repo) {
        this.repo = repo;
    }

    public void setSyncStatus(String syncStatus) {
        this.syncStatus = syncStatus;
    }

    public void setHealthStatus(String healthStatus) {
        this.healthStatus = healthStatus;
    }

    public String[] getFields() {
        return new String[] { name, repo, syncStatus, healthStatus };
    }
}
