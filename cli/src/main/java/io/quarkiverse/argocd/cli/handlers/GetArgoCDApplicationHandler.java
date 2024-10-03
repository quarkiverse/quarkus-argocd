package io.quarkiverse.argocd.cli.handlers;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

import io.quarkiverse.argocd.spi.ArgoCDResourceListBuildItem;
import io.quarkiverse.argocd.v1alpha1.ArgoCDResourceList;
import io.quarkus.builder.BuildResult;

public class GetArgoCDApplicationHandler implements BiConsumer<Object, BuildResult> {

    @Override
    public void accept(Object context, BuildResult buildResult) {
        ArgoCDResourceListBuildItem resourceListBuildItem = buildResult.consume(ArgoCDResourceListBuildItem.class);
        Consumer<ArgoCDResourceList> consumer = (Consumer<ArgoCDResourceList>) context;
        consumer.accept(resourceListBuildItem.getResourceList());
    }
}
