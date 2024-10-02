package io.quarkiverse.argocd.v1alpha1;

import io.fabric8.kubernetes.api.model.DefaultKubernetesResourceList;
import io.fabric8.kubernetes.api.model.HasMetadata;

public class ArgoCDResourceList<T extends HasMetadata> extends DefaultKubernetesResourceList<T> {

    public ApplicationList getApplicationList() {
        var builder = new ApplicationListBuilder();
        for (HasMetadata i : getItems()) {
            if (i instanceof Application a) {
                builder.addToItems(a);
            }
        }
        return builder.build();
    }

    public AppProjectList getAppProjectList() {
        var builder = new AppProjectListBuilder();
        for (HasMetadata i : getItems()) {
            if (i instanceof AppProject p) {
                builder.addToItems(p);
            }
        }
        return builder.build();
    }
}
