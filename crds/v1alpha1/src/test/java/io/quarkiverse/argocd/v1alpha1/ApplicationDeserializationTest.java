package io.quarkiverse.argocd.v1alpha1;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.time.Instant;

import org.junit.jupiter.api.Test;

import io.fabric8.kubernetes.client.utils.Serialization;

class ApplicationDeserializationTest {

    @Test
    void shouldDeserializeFieldsIntroducedInArgoCD214() {
        String json = """
                {
                  "apiVersion": "argoproj.io/v1alpha1",
                  "kind": "Application",
                  "metadata": { "name": "demo", "namespace": "argocd" },
                  "status": {
                    "health": {
                      "status": "Healthy",
                      "lastTransitionTime": "2025-02-17T18:05:43Z"
                    },
                    "sourceHydrator": {
                      "lastSuccessfulOperation": { "drySHA": "abc123", "hydratedSHA": "def456" }
                    }
                  }
                }
                """;

        Application application = Serialization.unmarshal(json, Application.class);

        assertEquals(Instant.parse("2025-02-17T18:05:43Z"),
                application.getStatus().getHealth().getLastTransitionTime().toInstant());
        assertNotNull(application.getStatus().getSourceHydrator());
        assertEquals("abc123", application.getStatus().getSourceHydrator().getLastSuccessfulOperation().getDrySHA());
    }
}
