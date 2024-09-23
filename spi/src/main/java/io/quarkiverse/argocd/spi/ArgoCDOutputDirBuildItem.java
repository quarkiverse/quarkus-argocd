package io.quarkiverse.argocd.spi;

import java.nio.file.Path;

import io.quarkus.builder.item.SimpleBuildItem;

public interface ArgoCDOutputDirBuildItem {

    Path getOutputDir();

    public static final class Selected extends SimpleBuildItem {

        private final Path outputDir;

        public Selected(Path outputDir) {
            this.outputDir = outputDir;
        }

        public Path getOutputDir() {
            return outputDir;
        }
    }

    public static final class Effective extends SimpleBuildItem {

        private final Path outputDir;

        public Effective(Path outputDir) {
            this.outputDir = outputDir;
        }

        public Path getOutputDir() {
            return outputDir;
        }
    }
}
