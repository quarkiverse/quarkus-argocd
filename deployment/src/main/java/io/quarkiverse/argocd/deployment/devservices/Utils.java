package io.quarkiverse.argocd.deployment.devservices;

import java.io.InputStream;
import java.net.URL;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.jboss.logging.Logger;

import io.fabric8.kubernetes.api.model.Pod;
import io.fabric8.kubernetes.client.KubernetesClient;

public class Utils {
    private static final Logger LOG = Logger.getLogger(Utils.class);
    private static ArgocdDevServiceConfig config;
    private static KubernetesClient client;

    protected static InputStream fetchArgocdResourcesFromURL(String version) {
        InputStream resourceAsStream = null;
        try {
            if (version == "latest") {
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

    protected static InputStream fetchIngressResourcesFromURL(String version) {
        InputStream resourceAsStream = null;
        try {
            if (version == "latest") {
                resourceAsStream = new URL(
                        "https://raw.githubusercontent.com/kubernetes/ingress-nginx/refs/heads/main/deploy/static/provider/kind/deploy.yaml")
                        .openStream();
            } else {
                resourceAsStream = new URL(
                        "https://raw.githubusercontent.com/kubernetes/ingress-nginx/refs/tags/controller-" + version
                                + "/deploy/static/provider/kind/deploy.yaml")
                        .openStream();
            }
        } catch (Exception e) {
            LOG.error("The resources cannot be fetched from the ingress nginx repository URL !");
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
        client.resources(Pod.class)
                .inNamespace(ns)
                .withLabels(labels)
                .waitUntilReady(config.timeOut(), TimeUnit.SECONDS);
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
        client.resources(Pod.class)
                .inNamespace(config.controlPlaneNamespace())
                .withLabel(key, value)
                .waitUntilReady(config.timeOut(), TimeUnit.SECONDS);
        LOG.infof("Pod: %s ready in %s", value, config.controlPlaneNamespace());
    }

    public static void setKubernetesClient(KubernetesClient client) {
        Utils.client = client;
    }

    public static void setConfig(ArgocdDevServiceConfig devservices) {
        Utils.config = devservices;
    }
}
