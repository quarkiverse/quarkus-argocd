package io.quarkiverse.argocd.cli.handlers;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

import io.quarkiverse.argocd.spi.ArgoCDApplicationListBuildItem;
import io.quarkiverse.argocd.v1alpha1.ApplicationList;
import io.quarkus.builder.BuildResult;

public class GetArgoCDApplicationHandler implements BiConsumer<Object, BuildResult> {

    @Override
    public void accept(Object context, BuildResult buildResult) {
        ArgoCDApplicationListBuildItem applicationListBuildItem = buildResult.consume(ArgoCDApplicationListBuildItem.class);
        Consumer<ApplicationList> consumer = (Consumer<ApplicationList>) context;
        consumer.accept(applicationListBuildItem.getApplicationList());
    }
}
