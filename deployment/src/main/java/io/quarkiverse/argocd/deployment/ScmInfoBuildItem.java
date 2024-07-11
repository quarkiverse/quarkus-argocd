package io.quarkiverse.argocd.deployment;

import java.nio.file.Path;
import java.util.Map;
import java.util.Optional;

import io.dekorate.utils.Git;
import io.quarkus.builder.item.SimpleBuildItem;

public final class ScmInfoBuildItem extends SimpleBuildItem {

    private final Path root;
    private final String branch;
    private final String commit;
    private final Map<String, String> remote;

    public ScmInfoBuildItem(Path root, Map<String, String> remote, String branch, String commit) {
        this.root = root;
        this.branch = branch;
        this.commit = commit;

        if (remote == null || remote.isEmpty()) {
            throw new IllegalArgumentException("remote cannot be blank");
        }
        this.remote = remote;
    }

    public Map<String, String> getRemote() {
        return remote;
    }

    public Path getRoot() {
        return root;
    }

    public String getBranch() {
        return branch;
    }

    public String getCommit() {
        return commit;
    }

    public String getDefaultRemote() {
        return remote.containsKey("origin") ? "origin" : remote.keySet().iterator().next();
    }

    public String getDefaultRemoteUrl() {
        return Git.getRemoteUrl(root, getDefaultRemote(), true).orElseThrow();
    }

    public static Optional<ScmInfoBuildItem> fromPath(Path path) {
        Optional<ScmInfoBuildItem> scmInfo = Optional.empty();
        if (path == null) {
            return scmInfo;
        }
        try {
            Map<String, String> remotes = Git.getRemotes(path);
            if (remotes.isEmpty()) {
                return Optional.empty();
            }
            String branch = Git.getBranch(path).orElse(null);
            String sha = Git.getCommitSHA(path).orElse(null);
            scmInfo = Optional.of(new ScmInfoBuildItem(path, remotes, branch, sha));
            return scmInfo;
        } catch (Exception e) {
            return Optional.empty();
        }
    }
}
