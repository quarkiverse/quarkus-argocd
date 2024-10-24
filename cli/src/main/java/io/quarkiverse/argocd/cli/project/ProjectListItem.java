package io.quarkiverse.argocd.cli.project;

import java.util.List;

import io.quarkiverse.argocd.v1alpha1.AppProject;
import io.quarkiverse.argocd.v1alpha1.Application;

public class ProjectListItem {

    private String projectName;
    private List<ApplicationListItem> applications;

    public ProjectListItem(String projectName, List<ApplicationListItem> applications) {
        this.projectName = projectName;
        this.applications = filterApplicationsByProject(projectName, applications);
    }

    public String getProjectName() {
        return projectName;
    }

    public List<ApplicationListItem> getApplications() {
        return applications;
    }

    public static ProjectListItem from(AppProject project, List<Application> applications) {
        List<ApplicationListItem> appItems = applications.stream().map(ApplicationListItem::from).toList();
        return new ProjectListItem(project.getMetadata().getName(), appItems);
    }

    private static List<ApplicationListItem> filterApplicationsByProject(String projectName,
            List<ApplicationListItem> applications) {
        return applications.stream().filter(a -> projectName.equals(a.getProject())).toList();
    }
}
