package io.quarkiverse.argocd.it;

import static io.quarkiverse.argocd.it.ArgocdResourceGenerator.populateApplication;
import static io.quarkiverse.argocd.it.ArgocdResourceGenerator.populateProject;

import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import java.util.concurrent.TimeUnit;

import org.eclipse.microprofile.config.ConfigProvider;
import org.jboss.logging.Logger;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import io.fabric8.kubernetes.api.model.ConfigMapBuilder;
import io.fabric8.kubernetes.api.model.NamespaceBuilder;
import io.fabric8.kubernetes.api.model.ObjectMeta;
import io.fabric8.kubernetes.api.model.Pod;
import io.fabric8.kubernetes.client.Config;
import io.fabric8.kubernetes.client.KubernetesClient;
import io.fabric8.kubernetes.client.KubernetesClientBuilder;
import io.fabric8.kubernetes.client.utils.KubernetesSerialization;
import io.quarkiverse.argocd.v1alpha1.AppProject;
import io.quarkiverse.argocd.v1alpha1.Application;
import io.quarkus.test.junit.QuarkusTest;

@QuarkusTest
public class ArgocdExtensionDevModeIT {

    private static final Logger LOG = Logger.getLogger(ArgocdExtensionDevModeIT.class);
    private static KubernetesClient client;
    private static String ARGOCD_NAMESPACE;
    private static final String ARGOCD_CONFIGMAP_PARAMS_NAME = "argocd-cmd-params-cm";
    private static final String ARGOCD_SERVER_NAME = "argocd-server";
    private static final String ARGOCD_APP_CONTROLLER_NAME = "argocd-application-controller";
    private static final long TIMEOUT = 180;

    @BeforeAll
    public static void setup() {
        var objectMapper = new ObjectMapper();
        objectMapper.addMixIn(ObjectMeta.class, ObjectMetaMixin.class);

        var kubernetesSerialization = new KubernetesSerialization(objectMapper, true);
        client = new KubernetesClientBuilder()
                .withConfig(Config.fromKubeconfig(
                        ConfigProvider.getConfig().getValue("quarkus.argocd.devservices.kube-config", String.class)))
                .withKubernetesSerialization(kubernetesSerialization)
                .build();

        ARGOCD_NAMESPACE = ConfigProvider.getConfig().getValue("quarkus.argocd.devservices.controller-namespace", String.class);
    }

    protected static void waitTillPodByLabelReady(String key, String value) {
        client.resources(Pod.class)
                .inNamespace(ARGOCD_NAMESPACE)
                .withLabel(key, value)
                .waitUntilReady(TIMEOUT, TimeUnit.SECONDS);
        LOG.infof("Pod: %s ready in %s", value, ARGOCD_NAMESPACE);
    }

    protected static void waitTillPodReady(String name) {
        client.resources(Pod.class)
                .inNamespace(ARGOCD_NAMESPACE)
                .withName(name)
                .waitUntilReady(TIMEOUT, TimeUnit.SECONDS);
        LOG.infof("Pod: %s ready in %s", name, ARGOCD_NAMESPACE);
    }

    /*
     * Use the Default Argocd AppProject
     * Populate an Argocd Application and deploy it under: argocd control's plane
     */
    @Test
    @Order(1)
    public void testCaseOne() throws NoSuchAlgorithmException, KeyManagementException, JsonProcessingException {
        ArgoConfigurator argoConfigurator = new ArgoConfigurator();
        argoConfigurator.setDestinationNamespace("argocd");
        argoConfigurator.setApplicationName("test-1");
        argoConfigurator.setApplicationNamespace("argocd");
        argoConfigurator.setGitRevision("master");

        LOG.info(">>> Running the test case - 1");

        client.resource(populateApplication(argoConfigurator))
                .inNamespace(ARGOCD_NAMESPACE)
                .create();

        LOG.info("Checking when Argocd Application will be Healthy");
        try {
            client.resources(Application.class)
                    .inNamespace(ARGOCD_NAMESPACE)
                    .withName(argoConfigurator.getApplicationName())
                    .waitUntilCondition(a -> a != null &&
                            a.getStatus() != null &&
                            a.getStatus().getHealth() != null &&
                            a.getStatus().getHealth().getStatus() != null &&
                            a.getStatus().getHealth().getStatus().equals("Healthy"), TIMEOUT, TimeUnit.SECONDS);
        } catch (Exception e) {
            LOG.error(client.getKubernetesSerialization()
                    .asYaml(client.genericKubernetesResources("argoproj.io/v1alpha1", "Application")
                            .inNamespace(ARGOCD_NAMESPACE).withName(argoConfigurator.getApplicationName()).get()));
        }
        LOG.infof("Argocd Application: %s healthy", argoConfigurator.getApplicationName());

        LOG.info("Checking now when Argocd Application will be synced");
        try {
            client.resources(Application.class)
                    .inNamespace(ARGOCD_NAMESPACE)
                    .withName(argoConfigurator.getApplicationName())
                    .waitUntilCondition(a -> a != null &&
                            a.getStatus() != null &&
                            a.getStatus().getSync() != null &&
                            a.getStatus().getSync().getStatus() != null &&
                            a.getStatus().getSync().getStatus().equals("Synced"), TIMEOUT, TimeUnit.SECONDS);
        } catch (Exception e) {
            LOG.error(client.getKubernetesSerialization()
                    .asYaml(client.genericKubernetesResources("argoproj.io/v1alpha1", "Application")
                            .inNamespace(ARGOCD_NAMESPACE).withName(argoConfigurator.getApplicationName()).get()));
        }
        LOG.infof("Argocd Application: %s synced", argoConfigurator.getApplicationName());

        Application app = client.resources(Application.class)
                .inNamespace(ARGOCD_NAMESPACE)
                .withName(argoConfigurator.getApplicationName()).get();
        LOG.warn(client.getKubernetesSerialization().asYaml(app));
    }

    /*
     * Use a new AppProject deployed under: argocd control's plane
     * Populate an Argocd Application using the new AppProject and
     * deploy it under: argocd control's plane
     */
    @Test
    @Order(2)
    public void testCaseTwo() {

        ArgoConfigurator config = new ArgoConfigurator();
        config.setProjectName("test-2");
        config.setGitUrl("https://github.com/argoproj/argocd-example-apps.git");
        config.setDestinationNamespace("argocd");

        config.setApplicationName("test-2");
        config.setApplicationNamespace("argocd");

        config.setGitRevision("master");

        LOG.info(">>> Running the test case - 2");

        client.resource(populateProject(config))
                .inNamespace(ARGOCD_NAMESPACE)
                .create();

        client.resource(populateApplication(config))
                .inNamespace(ARGOCD_NAMESPACE)
                .create();

        LOG.info("Checking when Argocd Application will be Healthy");
        try {
            client.resources(Application.class)
                    .inNamespace(ARGOCD_NAMESPACE)
                    .withName(config.getApplicationName())
                    .waitUntilCondition(a -> a != null &&
                            a.getStatus() != null &&
                            a.getStatus().getHealth() != null &&
                            a.getStatus().getHealth().getStatus() != null &&
                            a.getStatus().getHealth().getStatus().equals("Healthy"), TIMEOUT, TimeUnit.SECONDS);
        } catch (Exception e) {
            LOG.error(client.getKubernetesSerialization()
                    .asYaml(client.genericKubernetesResources("argoproj.io/v1alpha1", "Application")
                            .inNamespace(ARGOCD_NAMESPACE).withName(config.getApplicationName()).get()));
        }
        LOG.infof("Argocd Application: %s healthy", config.getApplicationName());

        LOG.info("Checking now when Argocd Application will be synced");
        try {
            client.resources(Application.class)
                    .inNamespace(ARGOCD_NAMESPACE)
                    .withName(config.getApplicationName())
                    .waitUntilCondition(a -> a != null &&
                            a.getStatus() != null &&
                            a.getStatus().getSync() != null &&
                            a.getStatus().getSync().getStatus() != null &&
                            a.getStatus().getSync().getStatus().equals("Synced"), TIMEOUT, TimeUnit.SECONDS);
        } catch (Exception e) {
            LOG.error(client.getKubernetesSerialization()
                    .asYaml(client.genericKubernetesResources("argoproj.io/v1alpha1", "Application")
                            .inNamespace(ARGOCD_NAMESPACE).withName(config.getApplicationName()).get()));
        }
        LOG.infof("Argocd Application: %s synced", config.getApplicationName());

        Application app = client.resources(Application.class)
                .inNamespace(ARGOCD_NAMESPACE)
                .withName(config.getApplicationName()).get();
        LOG.warn(client.getKubernetesSerialization().asYaml(app));

        AppProject appProject = client.resources(AppProject.class)
                .inNamespace(ARGOCD_NAMESPACE)
                .withName(config.getApplicationName()).get();
        LOG.warn(client.getKubernetesSerialization().asYaml(appProject));
    }

    /*
     * Use a new AppProject deployed under: argocd control's plane
     * Populate an Argocd Application using the new AppProject and
     * deploy it under its own namespace
     * That requires to enable the "App in any namespaces" as documented:
     * https://argo-cd.readthedocs.io/en/stable/operator-manual/app-any-namespace/
     */
    @Test
    @Order(3)
    public void testCaseThree() {
        String ARGO_APPLICATION_NAMESPACE = "test3";

        ArgoConfigurator config = new ArgoConfigurator();
        config.setProjectName("test-3");
        config.setGitUrl("https://github.com/argoproj/argocd-example-apps.git");
        config.setDestinationNamespace(ARGO_APPLICATION_NAMESPACE);
        // The following property is needed otherwise we got as error
        // message: application 'test-3' in namespace 'test3' is not permitted to use project 'test-3'
        config.setSourceNamespaces(ARGO_APPLICATION_NAMESPACE);

        config.setApplicationName("test-3");
        config.setApplicationNamespace(ARGO_APPLICATION_NAMESPACE);

        config.setGitRevision("master");

        LOG.info(">>> Running the test case - 3");

        LOG.info("Patching the Argocd ConfigMap to add the test3 namespace to the property: application.namespaces");
        client.configMaps().inNamespace(ARGOCD_NAMESPACE).withName(ARGOCD_CONFIGMAP_PARAMS_NAME)
                .edit(cm -> new ConfigMapBuilder(cm)
                        .addToData("application.namespaces", ARGO_APPLICATION_NAMESPACE)
                        .build());

        LOG.info("Creating the test3 namespace");
        client.namespaces()
                .resource(new NamespaceBuilder().withNewMetadata().withName(ARGO_APPLICATION_NAMESPACE).endMetadata().build())
                .create();

        LOG.info("Rolling the ArgoCD server & Application Controller");
        client.apps().deployments().inNamespace(ARGOCD_NAMESPACE).withName(ARGOCD_SERVER_NAME)
                .rolling().restart();
        client.apps().statefulSets().inNamespace(ARGOCD_NAMESPACE).withName(ARGOCD_APP_CONTROLLER_NAME)
                .rolling().restart();

        waitTillPodByLabelReady("app.kubernetes.io/name", ARGOCD_SERVER_NAME);
        waitTillPodReady(ARGOCD_APP_CONTROLLER_NAME + "-0");

        LOG.info("Deploy the AppProject");
        client.resource(populateProject(config))
                .inNamespace(ARGOCD_NAMESPACE)
                .create();

        LOG.info("Deploy the Application");
        client.resource(populateApplication(config))
                .inNamespace(ARGO_APPLICATION_NAMESPACE)
                .create();

        LOG.info("Checking when Argocd Application will be Healthy");
        try {
            client.resources(Application.class)
                    .inNamespace(ARGO_APPLICATION_NAMESPACE)
                    .withName(config.getApplicationName())
                    .waitUntilCondition(a -> a != null &&
                            a.getStatus() != null &&
                            a.getStatus().getHealth() != null &&
                            a.getStatus().getHealth().getStatus() != null &&
                            a.getStatus().getHealth().getStatus().equals("Healthy"), TIMEOUT, TimeUnit.SECONDS);
        } catch (Exception e) {
            LOG.error(client.getKubernetesSerialization()
                    .asYaml(client.genericKubernetesResources("argoproj.io/v1alpha1", "Application")
                            .inNamespace(ARGO_APPLICATION_NAMESPACE).withName(config.getApplicationName()).get()));
        }
        LOG.infof("Argocd Application: %s healthy", config.getApplicationName());

        LOG.info("Checking now when Argocd Application will be synced");
        try {
            client.resources(Application.class)
                    .inNamespace(ARGO_APPLICATION_NAMESPACE)
                    .withName(config.getApplicationName())
                    .waitUntilCondition(a -> a != null &&
                            a.getStatus() != null &&
                            a.getStatus().getSync() != null &&
                            a.getStatus().getSync().getStatus() != null &&
                            a.getStatus().getSync().getStatus().equals("Synced"), TIMEOUT, TimeUnit.SECONDS);
        } catch (Exception e) {
            LOG.error(client.getKubernetesSerialization()
                    .asYaml(client.genericKubernetesResources("argoproj.io/v1alpha1", "Application")
                            .inNamespace(ARGO_APPLICATION_NAMESPACE).withName(config.getApplicationName()).get()));
        }
        LOG.infof("Argocd Application: %s synced", config.getApplicationName());

        Application app = client.resources(Application.class)
                .inNamespace(ARGO_APPLICATION_NAMESPACE)
                .withName(config.getApplicationName()).get();
        LOG.warn(client.getKubernetesSerialization().asYaml(app));

        AppProject appProject = client.resources(AppProject.class)
                .inNamespace(ARGO_APPLICATION_NAMESPACE)
                .withName(config.getApplicationName()).get();
        LOG.warn(client.getKubernetesSerialization().asYaml(appProject));
    }
}
