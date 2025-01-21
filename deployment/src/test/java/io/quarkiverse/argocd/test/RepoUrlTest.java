package io.quarkiverse.argocd.test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import io.quarkiverse.argocd.deployment.utils.Git;

public class RepoUrlTest {

    @Test
    public void httpsRepository() {
        String url = "https://github.com/quarkiverse/quarkus-argocd";
        String sanitizedRemoteUrl = Git.sanitizeRemoteUrl(url);
        Assertions.assertEquals(url + ".git", sanitizedRemoteUrl);
    }

    @Test
    public void httpsRepositoryWithSuffixGit() {
        String url = "https://github.com/quarkiverse/quarkus-argocd.git";
        String sanitizedRemoteUrl = Git.sanitizeRemoteUrl(url);
        Assertions.assertEquals(url, sanitizedRemoteUrl);
    }

    @Test
    public void httpsTokenRepository() {
        String url = "https://aToken@github.com/quarkiverse/quarkus-argocd.git";
        String sanitizedRemoteUrl = Git.sanitizeRemoteUrl(url);
        Assertions.assertEquals("https://github.com/quarkiverse/quarkus-argocd.git", sanitizedRemoteUrl);
    }

    @Test
    public void httpsTokenRepositoryAndPort() {
        String url = "https://ed10339ed28bb9c3dc7b9d61ffdfc6cd63f6500b@gitea.cnoe.localtest.me:8443/quarkus/my-quarkus-hello.git";
        String sanitizedRemoteUrl = Git.sanitizeRemoteUrl(url);
        Assertions.assertEquals("https://gitea.cnoe.localtest.me:8443/quarkus/my-quarkus-hello.git", sanitizedRemoteUrl);
    }
}
