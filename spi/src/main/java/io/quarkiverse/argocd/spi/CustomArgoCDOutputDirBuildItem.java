package io.quarkiverse.argocd.spi;

import java.nio.file.Path;

import io.quarkus.builder.item.SimpleBuildItem;

public final class CustomArgoCDOutputDirBuildItem extends SimpleBuildItem {

    private final Path outputDir;

    public CustomArgoCDOutputDirBuildItem(Path outputDir) {
        this.outputDir = outputDir;
    }

    public Path getOutputDir() {
        return outputDir;
    }
}
