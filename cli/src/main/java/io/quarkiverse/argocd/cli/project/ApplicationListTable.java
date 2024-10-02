package io.quarkiverse.argocd.cli.project;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;

import io.quarkiverse.argocd.v1alpha1.ApplicationList;

public class ApplicationListTable {

    private static final String INSTALLED = " ";
    private static final String NAME = "Name";
    private static final String REPO = "REPO";
    private static final String SYNC_STATUS = "Sync Status";
    private static final String HEALTH_STATUS = "Health Status";

    private static final String NEWLINE = "\n";

    private String indent = "";
    private boolean showHeader = true;
    private List<ApplicationListItem> items;

    public ApplicationListTable(ApplicationList applicationList) {
        this(applicationList.getItems().stream().map(ApplicationListItem::from).toList());
    }

    public ApplicationListTable(Collection<ApplicationListItem> items) {
        this(new ArrayList<>(items), "", true);
    }

    public ApplicationListTable(List<ApplicationListItem> items, String indent, boolean showHeader) {
        this.items = items;
        this.indent = indent;
        this.showHeader = showHeader;
    }

    public ApplicationListTable() {
    }

    private void setItems(List<ApplicationListItem> items) {
        this.items = items;
    }

    private void setIndent(String indent) {
        this.indent = indent;
    }

    private void setShowHeader(boolean showHeader) {
        this.showHeader = showHeader;
    }

    public String getContent() {
        String format = getFormat(items);
        StringBuilder sb = new StringBuilder();
        if (showHeader) {
            sb.append(indent);
            sb.append(getHeader(format, items));
            sb.append(NEWLINE);
        }
        sb.append(getBody(format, items, indent));
        return sb.toString();
    }

    // Utils
    private static String[] getLabels() {
        return new String[] { NAME, REPO, SYNC_STATUS, HEALTH_STATUS };
    }

    private static String getHeader(String format, Collection<ApplicationListItem> items) {
        return String.format(format, getLabels());
    }

    private static String getBody(String format, Collection<ApplicationListItem> items, String indent) {
        StringBuilder sb = new StringBuilder();
        for (ApplicationListItem item : items) {
            sb.append(indent);
            sb.append(String.format(format, item.getFields()));
            sb.append(NEWLINE);
        }
        return sb.toString();
    }

    private static String getFormat(Collection<ApplicationListItem> items) {
        StringBuilder sb = new StringBuilder();
        int maxNameLength = Stream.concat(Stream.of(NAME),
                items.stream().map(ApplicationListItem::getName))
                .filter(Objects::nonNull)
                .map(String::length)
                .max(Comparator.naturalOrder())
                .orElse(0);
        sb.append(" %-" + maxNameLength + "s ");
        sb.append("\t");

        int maxRepoLength = Stream.concat(Stream.of(REPO),
                items.stream().map(ApplicationListItem::getRepo))
                .filter(Objects::nonNull)
                .map(String::length)
                .max(Comparator.naturalOrder())
                .orElse(0);
        sb.append(" %-" + maxRepoLength + "s ");
        sb.append("\t");

        int maxSyncStatusLength = Stream.concat(Stream.of(SYNC_STATUS),
                items.stream().map(ApplicationListItem::getSyncStatus))
                .filter(Objects::nonNull)
                .map(String::length)
                .max(Comparator.naturalOrder())
                .orElse(0);
        sb.append(" %-" + maxSyncStatusLength + "s ");
        sb.append("\t");

        int maxHealthStatusLength = Stream.concat(Stream.of(HEALTH_STATUS),
                items.stream().map(ApplicationListItem::getHealthStatus))
                .filter(Objects::nonNull)
                .map(String::length)
                .max(Comparator.naturalOrder())
                .orElse(0);
        sb.append(" %-" + maxHealthStatusLength + "s ");
        sb.append("\t");
        return sb.toString();
    }
}
