package io.quarkiverse.argocd.cli.project;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;

public class ProjectListTable {

    private static final String PROJECT = "Project";
    private static final String APPLICATION = "Application";
    private static final String REPO = "Repo";
    private static final String SYNC_STATUS = "Sync Status";
    private static final String HEALTH_STATUS = "Health Status";

    private static final String NEWLINE = "\n";
    private static final String TAB = "\t"; // Indentation character for the details

    private List<ProjectListItem> projects;
    private String indent = "";
    private boolean showHeader = true;

    public ProjectListTable() {
    }

    public ProjectListTable(Collection<ProjectListItem> projects) {
        this.projects = new ArrayList<>(projects);
    }

    public ProjectListTable(List<ProjectListItem> projects, String indent, boolean showHeader) {
        this.projects = projects;
        this.indent = indent;
        this.showHeader = showHeader;
    }

    public List<ProjectListItem> getProjects() {
        return projects;
    }

    public void setProjects(List<ProjectListItem> projects) {
        this.projects = projects;
    }

    public String getIndent() {
        return indent;
    }

    public void setIndent(String indent) {
        this.indent = indent;
    }

    public boolean isShowHeader() {
        return showHeader;
    }

    public void setShowHeader(boolean showHeader) {
        this.showHeader = showHeader;
    }

    public String getContent() {
        String format = getFormat(projects);
        StringBuilder sb = new StringBuilder();
        if (showHeader) {
            sb.append(indent);
            sb.append(getHeader(format));
            sb.append(NEWLINE);
        }
        sb.append(getBody(format));
        return sb.toString();
    }

    private String getHeader(String format) {
        return String.format(format, getLabels());
    }

    private String getBody(String format) {
        StringBuilder sb = new StringBuilder();
        for (ProjectListItem project : projects) {
            boolean first = true;
            for (ApplicationListItem application : project.getApplications()) {
                List<String> fields = new ArrayList<>();
                if (first) {
                    fields.add(project.getProjectName());
                    first = false;
                } else {
                    fields.add("");
                }
                for (String field : application.getFields()) {
                    fields.add(field);
                }
                sb.append(indent);
                sb.append(String.format(format, fields.toArray()));
                sb.append(NEWLINE);
            }
        }
        return sb.toString();
    }

    private static String[] getLabels() {
        return new String[] { PROJECT, APPLICATION, REPO, SYNC_STATUS, HEALTH_STATUS };
    }

    private static String getFormat(Collection<ProjectListItem> items) {
        StringBuilder sb = new StringBuilder();

        int maxProjectNameLength = Stream.concat(Stream.of(PROJECT),
                items.stream().map(ProjectListItem::getProjectName))
                .filter(Objects::nonNull)
                .map(String::length)
                .max(Comparator.naturalOrder())
                .orElse(0);
        sb.append(" %-" + maxProjectNameLength + "s ");
        sb.append("\t");

        int maxAppNameLength = Stream.concat(Stream.of(APPLICATION),
                items.stream().flatMap(p -> p.getApplications().stream())
                        .map(ApplicationListItem::getName))
                .filter(Objects::nonNull)
                .map(String::length)
                .max(Comparator.naturalOrder())
                .orElse(0);
        sb.append(" %-" + maxAppNameLength + "s ");
        sb.append("\t");

        int maxRepoLength = Stream.concat(Stream.of(REPO),
                items.stream().flatMap(p -> p.getApplications().stream())
                        .map(ApplicationListItem::getRepo))
                .filter(Objects::nonNull)
                .map(String::length)
                .max(Comparator.naturalOrder())
                .orElse(0);
        sb.append(" %-" + maxRepoLength + "s ");
        sb.append("\t");

        int maxSyncStatusLength = Stream.concat(Stream.of(SYNC_STATUS),
                items.stream().flatMap(p -> p.getApplications().stream())
                        .map(ApplicationListItem::getSyncStatus))
                .filter(Objects::nonNull)
                .map(String::length)
                .max(Comparator.naturalOrder())
                .orElse(0);
        sb.append(" %-" + maxSyncStatusLength + "s ");
        sb.append("\t");

        int maxHealthStatusLength = Stream.concat(Stream.of(HEALTH_STATUS),
                items.stream().flatMap(p -> p.getApplications().stream())
                        .map(ApplicationListItem::getHealthStatus))
                .filter(Objects::nonNull)
                .map(String::length)
                .max(Comparator.naturalOrder())
                .orElse(0);
        sb.append(" %-" + maxHealthStatusLength + "s ");
        sb.append("\t");
        return sb.toString();
    }

}
