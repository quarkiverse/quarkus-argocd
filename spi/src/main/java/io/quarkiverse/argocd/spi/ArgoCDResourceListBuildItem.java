package io.quarkiverse.argocd.spi;

import io.fabric8.kubernetes.api.model.HasMetadata;
import io.quarkiverse.argocd.v1alpha1.Application;
import io.quarkiverse.argocd.v1alpha1.ApplicationList;
import io.quarkiverse.argocd.v1alpha1.ApplicationListBuilder;
import io.quarkiverse.argocd.v1alpha1.ArgoCDResourceList;
import io.quarkus.builder.item.SimpleBuildItem;

public final class ArgoCDResourceListBuildItem extends SimpleBuildItem {

    private final ArgoCDResourceList<?> resourceList;

    public ArgoCDResourceListBuildItem(ArgoCDResourceList<?> resourceList) {
        this.resourceList = resourceList;
    }

    public ArgoCDResourceList<?> getResourceList() {
        return resourceList;
    }

    public ApplicationList getApplicationList() {
        var builder = new ApplicationListBuilder();
        for (HasMetadata i : resourceList.getItems()) {
            if (i instanceof Application a) {
                builder.addToItems(a);
            }
        }
        return builder.build();
    }
}
