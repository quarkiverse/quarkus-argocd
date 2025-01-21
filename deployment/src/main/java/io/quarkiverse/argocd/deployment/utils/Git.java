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

    public static String sanitizeRemoteUrl(String remoteUrl) {
        final int atSign = remoteUrl.indexOf('@');
        if (atSign > 0) {
            remoteUrl = remoteUrl.substring(atSign + 1);
            remoteUrl = "https://" + remoteUrl;
        }
        if (!remoteUrl.endsWith(".git")) {
            remoteUrl += ".git";
        }
        return remoteUrl;
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
     * @reuturn The predicate.
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
