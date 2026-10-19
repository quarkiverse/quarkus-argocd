package io.quarkiverse.argocd.deployment.devservices;

import java.io.InputStream;
import java.net.URL;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;

import org.jboss.logging.Logger;

import io.fabric8.kubernetes.api.model.Pod;
import io.fabric8.kubernetes.client.KubernetesClient;
import io.fabric8.kubernetes.client.KubernetesClientTimeoutException;

public class Utils {
    private static final Logger LOG = Logger.getLogger(Utils.class);
    private static ArgocdDevServiceConfig config;
    private static KubernetesClient client;

    protected static InputStream fetchArgocdResourcesFromURL(String version) {
        InputStream resourceAsStream = null;
        try {
            if ("latest".equals(version)) {
                resourceAsStream = new URL(
                        "https://raw.githubusercontent.com/argoproj/argo-cd/refs/heads/master/manifests/install.yaml")
                        .openStream();
            } else {
                resourceAsStream = new URL(
                        "https://raw.githubusercontent.com/argoproj/argo-cd/refs/tags/" + version + "/manifests/install.yaml")
                        .openStream();
            }
        } catch (Exception e) {
            LOG.error("The resources cannot be fetched from the argocd repository URL !");
            LOG.error(e);
        }
        return resourceAsStream;
    }

    protected static void waitTillPodIsReady(String name) {
        client.resources(Pod.class)
                .withName(name)
                .waitUntilReady(config.timeOut(), TimeUnit.SECONDS);
        LOG.infof("Pod: %s ready", name);
    }

    protected static void waitTillPodSelectedByLabelsIsReady(Map<String, String> labels, String ns) {
        try {
            client.resources(Pod.class)
                    .inNamespace(ns)
                    .withLabels(labels)
                    .waitUntilReady(config.timeOut(), TimeUnit.SECONDS);
        } catch (KubernetesClientTimeoutException e) {
            logPodsStatus(ns);
            throw e;
        }
        LOG.infof("Pod selected with labels: %s is ready", labels);
    }

    protected static void waitTillArgocdPodIsReady(String name) {
        client.resources(Pod.class)
                .inNamespace(config.controlPlaneNamespace())
                .withName(name)
                .waitUntilReady(config.timeOut(), TimeUnit.SECONDS);
        LOG.infof("Pod: %s ready in %s", name, config.controlPlaneNamespace());
    }

    protected static void waitTillArgocdPodSelectedByLabelIsReady(String key, String value) {
        try {
            client.resources(Pod.class)
                    .inNamespace(config.controlPlaneNamespace())
                    .withLabel(key, value)
                    .waitUntilReady(config.timeOut(), TimeUnit.SECONDS);
        } catch (KubernetesClientTimeoutException e) {
            logPodsStatus(config.controlPlaneNamespace());
            throw e;
        }
        LOG.infof("Pod: %s ready in %s", value, config.controlPlaneNamespace());
    }

    /**
     * Log the status of the pods of a namespace, and the reason why their containers are waiting, to troubleshoot a timeout
     */
    private static void logPodsStatus(String ns) {
        client.resources(Pod.class).inNamespace(ns).list().getItems().forEach(p -> {
            String waiting = p.getStatus().getInitContainerStatuses().stream()
                    .filter(c -> c.getState() != null && c.getState().getWaiting() != null)
                    .map(c -> c.getName() + ": " + c.getState().getWaiting().getReason())
                    .collect(Collectors.joining(", "));
            String containersWaiting = p.getStatus().getContainerStatuses().stream()
                    .filter(c -> c.getState() != null && c.getState().getWaiting() != null)
                    .map(c -> c.getName() + ": " + c.getState().getWaiting().getReason())
                    .collect(Collectors.joining(", "));
            LOG.errorf("Pod: %s, phase: %s, waiting init containers: [%s], waiting containers: [%s]",
                    p.getMetadata().getName(), p.getStatus().getPhase(), waiting, containersWaiting);
        });
    }

    public static void setKubernetesClient(KubernetesClient client) {
        Utils.client = client;
    }

    public static void setConfig(ArgocdDevServiceConfig devservices) {
        Utils.config = devservices;
    }
}
