package io.quarkiverse.argocd.spi;

import io.quarkiverse.argocd.v1alpha1.ApplicationList;
import io.quarkus.builder.item.SimpleBuildItem;

public final class ArgoCDApplicationListBuildItem extends SimpleBuildItem {

    private final ApplicationList applicationList;

    public ArgoCDApplicationListBuildItem(ApplicationList applicationList) {
        this.applicationList = applicationList;
    }

    public ApplicationList getApplicationList() {
        return applicationList;
    }
}
