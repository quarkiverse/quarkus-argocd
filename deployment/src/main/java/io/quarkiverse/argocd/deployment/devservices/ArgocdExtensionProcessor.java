package io.quarkiverse.argocd.deployment.devservices;

import static io.quarkiverse.argocd.deployment.devservices.Utils.*;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.io.Closeable;
import java.util.*;
import java.util.stream.Collectors;

import org.jboss.logging.Logger;
import org.testcontainers.containers.GenericContainer;

import io.fabric8.kubernetes.api.model.*;
import io.fabric8.kubernetes.api.model.apps.Deployment;
import io.fabric8.kubernetes.api.model.networking.v1.Ingress;
import io.fabric8.kubernetes.api.model.networking.v1.IngressBuilder;
import io.fabric8.kubernetes.client.KubernetesClient;
import io.fabric8.kubernetes.client.KubernetesClientBuilder;
import io.fabric8.kubernetes.client.LocalPortForward;
import io.fabric8.kubernetes.client.internal.KubeConfigUtils;
import io.quarkiverse.argocd.deployment.ArgoCDProcessor;
import io.quarkus.deployment.IsNormal;
import io.quarkus.deployment.annotations.BuildProducer;
import io.quarkus.deployment.annotations.BuildStep;
import io.quarkus.deployment.annotations.BuildSteps;
import io.quarkus.deployment.builditem.DevServicesResultBuildItem;
import io.quarkus.deployment.dev.devservices.DevServicesConfig;
import io.quarkus.devservices.common.ContainerShutdownCloseable;
import io.quarkus.kubernetes.client.spi.KubernetesDevServiceInfoBuildItem;
import io.quarkus.kubernetes.client.spi.KubernetesDevServiceRequestBuildItem;

@BuildSteps(onlyIfNot = IsNormal.class, onlyIf = { DevServicesConfig.Enabled.class })
public class ArgocdExtensionProcessor {
    private static final Logger LOG = Logger.getLogger(ArgocdExtensionProcessor.class);

    private static final String ARGOCD_DEX_SERVER_NAME = "argocd-dex-server";
    private static final String ARGOCD_NOTIFICATION_CONTROLLER_NAME = "argocd-notifications-controller";
    private static final String ARGOCD_APP_CONTROLLER_NAME = "argocd-application-controller";
    private static final String ARGOCD_APPLICATIONSET_CONTROLLER_NAME = "argocd-applicationset-controller";
    private static final String ARGOCD_SERVER_NAME = "argocd-server";
    private static final String ARGOCD_REDIS_NAME = "argocd-redis";
    private static final String ARGOCD_REPO_SERVER_NAME = "argocd-repo-server";
    private static final String ARGOCD_CMD_PARAMS_CM = "argocd-cmd-params-cm";

    private static final String ARGOCD_INITIAL_ADMIN_SECRET_NAME = "argocd-initial-admin-secret";

    static volatile DevServicesResultBuildItem.RunningDevService devService;

    @BuildStep(onlyIfNot = IsNormal.class, onlyIf = { DevServicesConfig.Enabled.class })
    void requestKube(ArgocdDevServiceConfig config,
            BuildProducer<KubernetesDevServiceRequestBuildItem> kubeDevServiceRequest) {
        if (config.enabled()) {
            kubeDevServiceRequest.produce(
                    // Specify the type of the kind test container to launch and enable its launch
                    new KubernetesDevServiceRequestBuildItem(config.clusterType()));
        }
    }

    @BuildStep
    public void deployArgocd(
            ArgocdDevServiceConfig argoConfig,
            Optional<KubernetesDevServiceInfoBuildItem> kubeServiceInfo,
            BuildProducer<DevServicesResultBuildItem> devServicesResultBuildItem,
            BuildProducer<ArgocdDevServiceInfoBuildItem> argocdDevServiceInfoBuildItemBuildProducer) {

        if (devService != null) {
            // only produce DevServicesResultBuildItem when the dev service first starts.
            throw new RuntimeException("Dev services already started");
        }

        if (!argoConfig.enabled() && !kubeServiceInfo.isPresent()) {
            // Argocd Dev Service not enabled and Kubernetes test container has not been created ...
            throw new RuntimeException(
                    "Dev services is not enabled for Argo CD and Kubernetes test container has not been created ...");
        }

        // Convert the kube config yaml to its Java Class
        Config kubeConfig = KubeConfigUtils.parseConfigFromString(kubeServiceInfo.get().getKubeConfig());

        if (argoConfig.debugEnabled()) {
            LOG.info(">>> Cluster container name : " + kubeServiceInfo.get().getContainerId());
            kubeConfig.getClusters().stream().forEach(c -> {
                LOG.debugf(">>> Cluster name: %s", c.getName());
                LOG.debugf(">>> API URL: %s", c.getCluster().getServer());
            });
            kubeConfig.getUsers().stream().forEach(u -> LOG.debugf(">>> User key: %s", u.getUser().getClientKeyData()));
            kubeConfig.getContexts().stream().forEach(ctx -> LOG.debugf(">>> Context : %s", ctx.getContext().getUser()));
        }

        // Create the Kubernetes client using the Kube YAML Config
        KubernetesClient client = new KubernetesClientBuilder()
                .withConfig(io.fabric8.kubernetes.client.Config.fromKubeconfig(kubeServiceInfo.get().getKubeConfig()))
                .build();

        // Pass the configuration parameters to the utility class
        Utils.setConfig(argoConfig);
        Utils.setKubernetesClient(client);

        // TODO: To be removed when the issue https://github.com/dajudge/kindcontainer/issues/363 is fixed and released in 1.4.9
        // Patch the node created to add the ingress label
        // ingress-ready: "true"
        LOG.info("Patching the node's label to add: ingress-ready: true");
        client.nodes().withName("kind").edit(
                n -> new NodeBuilder(n).editMetadata().addToLabels("ingress-ready", "true").endMetadata().build());

        // Install the ingress controller
        List<HasMetadata> items = client.load(Utils.fetchIngressResourcesFromURL(argoConfig.ingress().version())).items();
        LOG.info("Deploying the ingress controller resources ...");
        for (HasMetadata item : items) {
            var res = client.resource(item).create();
            assertNotNull(res);
        }

        waitTillPodSelectedByLabelsIsReady(
                Map.of(
                        "app.kubernetes.io/name", "ingress-nginx",
                        "app.kubernetes.io/component", "controller"),
                "ingress-nginx");

        var ARGOCD_CONTROLLER_NAMESPACE = argoConfig.controllerNamespace();
        // Install the Argocd resources from the YAML manifest file
        items = client.load(Utils.fetchArgocdResourcesFromURL(argoConfig.version())).items();

        LOG.infof("Creating the argocd controller namespace: %s", ARGOCD_CONTROLLER_NAMESPACE);
        // @formatter:off
        client.namespaces()
            .resource(new NamespaceBuilder()
                .withNewMetadata()
                  .withName(ARGOCD_CONTROLLER_NAMESPACE)
                .endMetadata()
                .build())
            .create();
        // @formatter:on

        // Deploy the different resources: Service, CRD, Deployment, ConfigMap
        // EXCEPT: Notification & Dex server as non needed
        List<HasMetadata> filteredItems = items.stream()
                .filter(r -> !(r instanceof Deployment &&
                        (ARGOCD_DEX_SERVER_NAME.equals(r.getMetadata().getName())
                                || ARGOCD_NOTIFICATION_CONTROLLER_NAME.equals(r.getMetadata().getName()))))
                .collect(Collectors.toList());

        LOG.info("Deploying the argocd resources ...");
        for (HasMetadata item : filteredItems) {
            var res = client.resource(item).inNamespace(ARGOCD_CONTROLLER_NAMESPACE);
            res.create();
            assertNotNull(res);
        }

        // Patch the Argocd ConfigMap Command parameters
        // The parameter: insecure.server=true will run the Argocd server without TLS
        client.resources(ConfigMap.class)
                .inNamespace(ARGOCD_CONTROLLER_NAMESPACE)
                .withName(ARGOCD_CMD_PARAMS_CM)
                .edit(cm -> new ConfigMapBuilder(cm).addToData("insecure.server", "true").build());

        // Waiting till the pods are ready/running ...
        waitTillArgocdPodSelectedByLabelIsReady("app.kubernetes.io/name", ARGOCD_REDIS_NAME);
        waitTillArgocdPodSelectedByLabelIsReady("app.kubernetes.io/name", ARGOCD_REPO_SERVER_NAME);
        waitTillArgocdPodSelectedByLabelIsReady("app.kubernetes.io/name", ARGOCD_SERVER_NAME);
        waitTillArgocdPodSelectedByLabelIsReady("app.kubernetes.io/name", ARGOCD_APPLICATIONSET_CONTROLLER_NAME);
        waitTillArgocdPodIsReady(ARGOCD_APP_CONTROLLER_NAME + "-0");

        // Create the Argocd ingress route
        LOG.info("Creating the ingress route for the argocd server ...");
        Ingress argocdIngressRoute = new IngressBuilder()
        // @formatter:off
                .withNewMetadata()
                  .withName("argocd")
                  .withNamespace(ARGOCD_CONTROLLER_NAMESPACE)
                .endMetadata()
                .withNewSpec()
                  .addNewRule()
                    .withHost(argoConfig.hostName())
                    .withNewHttp()
                      .addNewPath()
                        .withPath("/")
                        .withPathType("Prefix") // This field is mandatory
                        .withNewBackend()
                          .withNewService()
                            .withName(ARGOCD_SERVER_NAME)
                            .withNewPort().withName("https").endPort()
                          .endService()
                        .endBackend()
                      .endPath()
                    .endHttp()
                  .endRule()
                .endSpec()
                .build();
                // @formatter:on
        client.resource(argocdIngressRoute).create();

        if (argoConfig.ingress().portForwardEnabled()) {
            // Port-forward the traffic from host port to pod's container's port
            Pod argocdServerPod = client.pods()
                    .inNamespace(ARGOCD_CONTROLLER_NAMESPACE)
                    .withLabel("app.kubernetes.io/name", ARGOCD_SERVER_NAME)
                    .list().getItems().get(0);

            LOG.info("Launch Port Forward ...");
            LocalPortForward portForward = client.pods()
                    .resource(argocdServerPod)
                    .portForward(8080, Integer.parseInt(argoConfig.hostPort()));
            LOG.infof("Port forwarded to the host port: %d", portForward.getLocalPort());
        }

        if (argoConfig.debugEnabled()) {
            // List the pods running under the Argocd controller namespace
            client.resources(Pod.class)
                    .inNamespace(ARGOCD_CONTROLLER_NAMESPACE)
                    .list().getItems().stream().forEach(p -> {
                        LOG.infof("Pod : %, status: %s", p.getMetadata().getName(),
                                p.getStatus().getConditions().get(0).getStatus());
                    });
        }

        // Get the argocd admin secret
        var argocd_admin_password = client.resources(Secret.class)
                .inNamespace(ARGOCD_CONTROLLER_NAMESPACE).withName(ARGOCD_INITIAL_ADMIN_SECRET_NAME)
                .get().getData().get("password");
        LOG.infof("Argocd admin password : %s", new String(Base64.getDecoder().decode(argocd_admin_password)));

        // TODO: To be reviewed in order to pass argocd parameters for the service consuming the extension
        Map<String, String> configOverrides = Map.of(
                "quarkus.argocd.devservices.controller-namespace", ARGOCD_CONTROLLER_NAMESPACE,
                "quarkus.argocd.devservices.admin-password", new String(Base64.getDecoder().decode(argocd_admin_password)),
                "quarkus.argocd.devservices.kube-config", kubeServiceInfo.get().getKubeConfig());

        argocdDevServiceInfoBuildItemBuildProducer.produce(
                new ArgocdDevServiceInfoBuildItem(
                        argoConfig.hostName(),
                        Integer.parseInt(argoConfig.hostPort()),
                        "admin",
                        argocd_admin_password));

        devServicesResultBuildItem.produce(new DevServicesResultBuildItem.RunningDevService(
                ArgoCDProcessor.FEATURE,
                kubeServiceInfo.get().getContainerId(),
                new ContainerShutdownCloseable(new DummyContainer(), ArgoCDProcessor.FEATURE),
                configOverrides).toBuildItem());
    }

    private class DummyContainer extends GenericContainer<DummyContainer> implements Closeable {
        private static final Logger LOG = Logger.getLogger(DummyContainer.class);

        @Override
        public void close() {
            LOG.info("Closing the argocd container ...");
        }
    }
}
