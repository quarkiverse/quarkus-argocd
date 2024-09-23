package io.quarkiverse.argocd.cli.handlers;

import java.nio.file.Path;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

import io.quarkiverse.argocd.spi.ArgoCDOutputDirBuildItem;
import io.quarkus.builder.BuildResult;

public class GetOutputDirectoryHandler implements BiConsumer<Object, BuildResult> {

    @Override
    public void accept(Object context, BuildResult buildResult) {
        ArgoCDOutputDirBuildItem.Effective outputDirBuildItem = buildResult.consume(ArgoCDOutputDirBuildItem.Effective.class);
        Consumer<Path> consumer = (Consumer<Path>) context;
        consumer.accept(outputDirBuildItem.getOutputDir());
    }
}
