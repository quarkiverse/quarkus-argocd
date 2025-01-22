package io.quarkiverse.argocd.deployment.utils;

import static io.dekorate.utils.Git.*;

import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Optional;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.function.Predicate;

import io.dekorate.utils.Strings;

public class Git {

    public static Optional<String> getRemoteUrl(Path path, String remote, boolean httpsPreferred) {
        try {
            Optional<String> url = Files.lines(getConfig(path)).map(String::trim)
                    .filter(inRemote(remote, new AtomicBoolean()))
                    .filter(l -> l.startsWith(URL) && l.contains(EQUALS))
                    .map(s -> s.split(EQUALS)[1].trim())
                    .findAny();
            return httpsPreferred ? url.map(Git::sanitizeRemoteUrl) : url;
        } catch (Exception e) {
            return Optional.empty();
        }
    }

    /**
     * Generate an HTTPS url of an SCM according to: https://git-scm.com/docs/git-clone#_git_urls
     * <p>
     * The method handles different protocols of an SCM repository:
     * HTTP : http[s]://<GIT_SERVER>[:<PORT>]/path/project[.git]
     * HTTP with Basic Auth : http[s]://<username>:<password>@<GIT_SERVER>[:<PORT>]/path/project[.git]
     * Git : git@<GIT_SERVER>:<REPOSITORY_ORG>/path/project[.git]
     *
     * @param remoteUrl the String of the url of the scm.
     * @return The String of the url converted.
     */
    public static String sanitizeRemoteUrl(String remoteUrl) {
        if (remoteUrl == null || remoteUrl.isEmpty()) {
            throw new IllegalArgumentException("The remote URL cannot be null or empty.");
        }

        String normalizedUrl = null;

        if (remoteUrl.startsWith("http://") || remoteUrl.startsWith("https://")) {
            // Handle HTTP(S) and HTTP(S) with Basic Auth
            normalizedUrl = remoteUrl.replaceAll("https?://[\\w%:]*@", "https://");
        } else if (remoteUrl.startsWith("git@")) {
            // Handle Git URL (SSH)
            normalizedUrl = remoteUrl.replaceFirst("git@([\\w.-]+):", "https://$1/");
        } else {
            throw new IllegalArgumentException("Unsupported URL format: " + remoteUrl);
        }

        // Ensure the URL ends with .git
        if (!normalizedUrl.endsWith(".git")) {
            normalizedUrl += ".git";
        }

        return normalizedUrl;
    }

    public static Optional<String> getBranch(Path path) {
        try {
            return Files.lines(getHead(path)).map(String::trim)
                    .filter(l -> l.startsWith(REF) && l.contains(SLASH))
                    .map(s -> s.substring(s.lastIndexOf(SLASH) + 1).trim())
                    .findAny();
        } catch (Exception e) {
            return Optional.empty();
        }
    }

    /**
     * Get the git branch.
     *
     * @param path the path to the git config.
     * @return The an {@link Optional} String with the branch.
     */
    public static Optional<String> getCommitSHA(Path path) {
        try {
            return Files.lines(getHead(path)).map(String::trim)
                    .filter(l -> l.startsWith(REF) && l.contains(COLN))
                    .map(s -> s.substring(s.lastIndexOf(COLN) + 1).trim())
                    .map(ref -> path.resolve(DOT_GIT).resolve(ref))
                    .filter(ref -> ref.toFile().exists())
                    .map(Strings::read)
                    .map(String::trim)
                    .findAny();
        } catch (Exception e) {
            return Optional.empty();
        }
    }

    /**
     * Create a predicate function that tracks if the a line is defined in the specified remote section.
     *
     * @param remote The target remote.
     * @param state An atomic boolean which holds the predicate state.
     * @return The predicate.
     */
    public static Predicate<String> inRemote(String remote, AtomicBoolean state) {
        return l -> {
            if (l.startsWith(OB) && l.contains(REMOTE) && l.contains(remote) && l.endsWith(CB)) {
                state.set(true);
            } else if (l.startsWith(OB) && l.endsWith(CB)) {
                state.set(false);
            }
            return state.get();
        };
    }

}
