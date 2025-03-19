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
import io.quarkiverse.argocd.it.model.AppProjectConfig;
import io.quarkiverse.argocd.it.model.ApplicationConfig;
import io.quarkiverse.argocd.it.model.ArgoConfigurator;
import io.quarkiverse.argocd.v1alpha1.AppProject;
import io.quarkiverse.argocd.v1alpha1.Application;
import io.quarkus.test.junit.QuarkusTest;

@QuarkusTest
public class ArgocdExtensionDevModeIT {

    private static final Logger LOG = Logger.getLogger(ArgocdExtensionDevModeIT.class);
    private static KubernetesClient client;
    private static String ARGOCD_CONTROL_PLANE_NAMESPACE;
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

        /*
         * Define the Argocd control namespace where the AppProject and Application CR will be deployed as they are controlled
         * by ArgoCD.
         */
        ARGOCD_CONTROL_PLANE_NAMESPACE = "argocd";
    }

    protected static void waitTillPodByLabelReady(String key, String value) {
        client.resources(Pod.class)
                .inNamespace(ARGOCD_CONTROL_PLANE_NAMESPACE)
                .withLabel(key, value)
                .waitUntilReady(TIMEOUT, TimeUnit.SECONDS);
        LOG.infof("Pod: %s ready in %s", value, ARGOCD_CONTROL_PLANE_NAMESPACE);
    }

    protected static void waitTillPodReady(String name) {
        client.resources(Pod.class)
                .inNamespace(ARGOCD_CONTROL_PLANE_NAMESPACE)
                .withName(name)
                .waitUntilReady(TIMEOUT, TimeUnit.SECONDS);
        LOG.infof("Pod: %s ready in %s", name, ARGOCD_CONTROL_PLANE_NAMESPACE);
    }

    /*
     * Create the Default Argocd AppProject under the argocd control's plane with full permissions
     * Populate an Argocd Application and deploy it under: argocd control's plane
     */
    @Test
    @Order(1)
    public void testCaseOne() throws NoSuchAlgorithmException, KeyManagementException, JsonProcessingException {
        //AppProject appProject = new AppProject("default",ARGOCD_CONTROL_PLANE_NAMESPACE,"*","*","*",null);

        AppProjectConfig appProjectConfig = new AppProjectConfig();
        ApplicationConfig applicationConfig = new ApplicationConfig();

        // AppProject config
        appProjectConfig.setName("default");
        appProjectConfig.setNamespace(ARGOCD_CONTROL_PLANE_NAMESPACE);

        //  Permits deployments from any source repo, to any cluster, and all resource Kinds.
        appProjectConfig.setDestinationNamespace("*");
        appProjectConfig.setDestinationKubeServer("*");
        appProjectConfig.setGitUrl("*");

        // Application config
        applicationConfig.setName("test-1");
        applicationConfig.setNamespace(ARGOCD_CONTROL_PLANE_NAMESPACE);

        applicationConfig.setAppProjectName("default");
        applicationConfig.setDestinationNamespace(ARGOCD_CONTROL_PLANE_NAMESPACE);
        applicationConfig.setDestinationKubeServer("https://kubernetes.default.svc");

        applicationConfig.setGitRevision("master");
        applicationConfig.setHelmUrl("https://github.com/argoproj/argocd-example-apps.git");
        applicationConfig.setHelmPath("helm-guestbook");

        ArgoConfigurator config = new ArgoConfigurator().toBuilder().appProjectConfig(appProjectConfig)
                .applicationConfig(applicationConfig).build();

        LOG.info(">>> Running the test case - 1");

        /*
         * As a "default" AppProject already exists, then we don't have to create it
         * client.resource(populateProject(config))
         * .inNamespace(ARGOCD_CONTROL_PLANE_NAMESPACE)
         * .create();
         */

        client.resource(populateApplication(config))
                .inNamespace(ARGOCD_CONTROL_PLANE_NAMESPACE)
                .create();

        LOG.info("Checking when Argocd Application will be Healthy");
        try {
            client.resources(Application.class)
                    .inNamespace(ARGOCD_CONTROL_PLANE_NAMESPACE)
                    .withName(config.getApplicationConfig().getName())
                    .waitUntilCondition(a -> a != null &&
                            a.getStatus() != null &&
                            a.getStatus().getHealth() != null &&
                            a.getStatus().getHealth().getStatus() != null &&
                            a.getStatus().getHealth().getStatus().equals("Healthy"), TIMEOUT, TimeUnit.SECONDS);
        } catch (Exception e) {
            LOG.error(client.getKubernetesSerialization()
                    .asYaml(client.genericKubernetesResources("argoproj.io/v1alpha1", "Application")
                            .inNamespace(ARGOCD_CONTROL_PLANE_NAMESPACE).withName(config.getApplicationConfig().getName())
                            .get()));
        }
        LOG.infof("Argocd Application: %s healthy", config.getApplicationConfig().getName());

        LOG.info("Checking now when Argocd Application will be synced");
        try {
            client.resources(Application.class)
                    .inNamespace(ARGOCD_CONTROL_PLANE_NAMESPACE)
                    .withName(config.getApplicationConfig().getName())
                    .waitUntilCondition(a -> a != null &&
                            a.getStatus() != null &&
                            a.getStatus().getSync() != null &&
                            a.getStatus().getSync().getStatus() != null &&
                            a.getStatus().getSync().getStatus().equals("Synced"), TIMEOUT, TimeUnit.SECONDS);
        } catch (Exception e) {
            LOG.error(client.getKubernetesSerialization()
                    .asYaml(client.genericKubernetesResources("argoproj.io/v1alpha1", "Application")
                            .inNamespace(ARGOCD_CONTROL_PLANE_NAMESPACE).withName(config.getApplicationConfig().getName())
                            .get()));
        }
        LOG.infof("Argocd Application: %s synced", config.getApplicationConfig().getName());

        Application app = client.resources(Application.class)
                .inNamespace(ARGOCD_CONTROL_PLANE_NAMESPACE)
                .withName(config.getApplicationConfig().getName()).get();
        LOG.warn(client.getKubernetesSerialization().asYaml(app));
    }

    /*
     * Use a new AppProject deployed under: argocd control's plane
     * where we permit the deployments from a well-defined source repo, to the internal kube cluster.
     *
     * Populate an Argocd Application using the new AppProject and
     * deploy it under: argocd control's plane
     */
    @Test
    @Order(2)
    public void testCaseTwo() {
        AppProjectConfig appProjectConfig = new AppProjectConfig();
        ApplicationConfig applicationConfig = new ApplicationConfig();

        // AppProject config
        appProjectConfig.setName("test-2");
        appProjectConfig.setNamespace(ARGOCD_CONTROL_PLANE_NAMESPACE);
        // Permissions
        appProjectConfig.setDestinationKubeServer("https://kubernetes.default.svc");
        appProjectConfig.setDestinationNamespace(ARGOCD_CONTROL_PLANE_NAMESPACE);
        appProjectConfig.setGitUrl("https://github.com/argoproj/argocd-example-apps.git");

        // Application config
        applicationConfig.setName("test-2");
        applicationConfig.setNamespace(ARGOCD_CONTROL_PLANE_NAMESPACE);

        applicationConfig.setAppProjectName("default");
        applicationConfig.setDestinationNamespace(ARGOCD_CONTROL_PLANE_NAMESPACE);
        applicationConfig.setDestinationKubeServer("https://kubernetes.default.svc");

        applicationConfig.setGitRevision("master");
        applicationConfig.setHelmUrl("https://github.com/argoproj/argocd-example-apps.git");
        applicationConfig.setHelmPath("helm-guestbook");

        ArgoConfigurator config = new ArgoConfigurator().toBuilder().appProjectConfig(appProjectConfig)
                .applicationConfig(applicationConfig).build();
        LOG.info(">>> Running the test case - 2");

        client.resource(populateProject(config))
                .inNamespace(ARGOCD_CONTROL_PLANE_NAMESPACE)
                .create();

        client.resource(populateApplication(config))
                .inNamespace(ARGOCD_CONTROL_PLANE_NAMESPACE)
                .create();

        LOG.info("Checking when Argocd Application will be Healthy");
        try {
            client.resources(Application.class)
                    .inNamespace(ARGOCD_CONTROL_PLANE_NAMESPACE)
                    .withName(applicationConfig.getName())
                    .waitUntilCondition(a -> a != null &&
                            a.getStatus() != null &&
                            a.getStatus().getHealth() != null &&
                            a.getStatus().getHealth().getStatus() != null &&
                            a.getStatus().getHealth().getStatus().equals("Healthy"), TIMEOUT, TimeUnit.SECONDS);
        } catch (Exception e) {
            LOG.error(client.getKubernetesSerialization()
                    .asYaml(client.genericKubernetesResources("argoproj.io/v1alpha1", "Application")
                            .inNamespace(ARGOCD_CONTROL_PLANE_NAMESPACE).withName(applicationConfig.getName())
                            .get()));
        }
        LOG.infof("Argocd Application: %s healthy", applicationConfig.getName());

        LOG.info("Checking now when Argocd Application will be synced");
        try {
            client.resources(Application.class)
                    .inNamespace(ARGOCD_CONTROL_PLANE_NAMESPACE)
                    .withName(applicationConfig.getName())
                    .waitUntilCondition(a -> a != null &&
                            a.getStatus() != null &&
                            a.getStatus().getSync() != null &&
                            a.getStatus().getSync().getStatus() != null &&
                            a.getStatus().getSync().getStatus().equals("Synced"), TIMEOUT, TimeUnit.SECONDS);
        } catch (Exception e) {
            LOG.error(client.getKubernetesSerialization()
                    .asYaml(client.genericKubernetesResources("argoproj.io/v1alpha1", "Application")
                            .inNamespace(ARGOCD_CONTROL_PLANE_NAMESPACE).withName(applicationConfig.getName())
                            .get()));
        }
        LOG.infof("Argocd Application: %s synced", applicationConfig.getName());

        Application app = client.resources(Application.class)
                .inNamespace(ARGOCD_CONTROL_PLANE_NAMESPACE)
                .withName(applicationConfig.getName()).get();
        LOG.warn(client.getKubernetesSerialization().asYaml(app));

        AppProject appProject = client.resources(AppProject.class)
                .inNamespace(ARGOCD_CONTROL_PLANE_NAMESPACE)
                .withName(applicationConfig.getName()).get();
        LOG.warn(client.getKubernetesSerialization().asYaml(appProject));
    }

    /*
     * Use a new AppProject deployed under: argocd control's plane: test-3
     * Populate an Argocd Application using the AppProject test-3 and
     * deploy it under its own namespace: test-3
     *
     * That requires to enable the "App in any namespaces" as documented:
     * https://argo-cd.readthedocs.io/en/stable/operator-manual/app-any-namespace/
     */
    @Test
    @Order(3)
    public void testCaseThree() {
        String ARGO_APPLICATION_NAMESPACE = "test3";

        AppProjectConfig appProjectConfig = new AppProjectConfig();
        ApplicationConfig applicationConfig = new ApplicationConfig();

        // AppProject config
        appProjectConfig.setName("test-3");
        appProjectConfig.setNamespace(ARGOCD_CONTROL_PLANE_NAMESPACE);
        appProjectConfig.setDestinationNamespace(ARGO_APPLICATION_NAMESPACE);
        appProjectConfig.setDestinationKubeServer("https://kubernetes.default.svc");
        appProjectConfig.setGitUrl("https://github.com/argoproj/argocd-example-apps.git");
        // The following property is needed otherwise we got as error
        // message: application 'test-3' in namespace 'test3' is not permitted to use project 'test-3'
        appProjectConfig.setSourceNamespaces(ARGO_APPLICATION_NAMESPACE);

        // Application config
        applicationConfig.setName("test-3");
        applicationConfig.setNamespace(ARGO_APPLICATION_NAMESPACE);

        applicationConfig.setAppProjectName("test-3");
        applicationConfig.setDestinationNamespace(ARGO_APPLICATION_NAMESPACE);
        applicationConfig.setDestinationKubeServer("https://kubernetes.default.svc");

        applicationConfig.setGitRevision("master");
        applicationConfig.setHelmUrl("https://github.com/argoproj/argocd-example-apps.git");
        applicationConfig.setHelmPath("helm-guestbook");

        ArgoConfigurator config = new ArgoConfigurator().toBuilder().appProjectConfig(appProjectConfig)
                .applicationConfig(applicationConfig).build();
        LOG.info(">>> Running the test case - 3");

        LOG.info("Patching the Argocd ConfigMap to add the test3 namespace to the property: application.setNamespaces");
        client.configMaps().inNamespace(ARGOCD_CONTROL_PLANE_NAMESPACE).withName(ARGOCD_CONFIGMAP_PARAMS_NAME)
                .edit(cm -> new ConfigMapBuilder(cm)
                        .addToData("application.namespaces", ARGO_APPLICATION_NAMESPACE)
                        .build());

        LOG.info("Creating the test3 namespace");
        client.namespaces()
                .resource(new NamespaceBuilder().withNewMetadata().withName(ARGO_APPLICATION_NAMESPACE).endMetadata().build())
                .create();

        LOG.info("Rolling the ArgoCD server & Application Controller");
        client.apps().deployments().inNamespace(ARGOCD_CONTROL_PLANE_NAMESPACE).withName(ARGOCD_SERVER_NAME)
                .rolling().restart();
        client.apps().statefulSets().inNamespace(ARGOCD_CONTROL_PLANE_NAMESPACE).withName(ARGOCD_APP_CONTROLLER_NAME)
                .rolling().restart();

        waitTillPodByLabelReady("app.kubernetes.io/name", ARGOCD_SERVER_NAME);
        waitTillPodReady(ARGOCD_APP_CONTROLLER_NAME + "-0");

        LOG.info("Deploy the AppProject");
        client.resource(populateProject(config))
                .inNamespace(ARGOCD_CONTROL_PLANE_NAMESPACE)
                .create();

        LOG.info("Deploy the Application");
        client.resource(populateApplication(config))
                .inNamespace(ARGO_APPLICATION_NAMESPACE)
                .create();

        LOG.info("Checking when Argocd Application will be Healthy");
        try {
            client.resources(Application.class)
                    .inNamespace(ARGO_APPLICATION_NAMESPACE)
                    .withName(applicationConfig.getName())
                    .waitUntilCondition(a -> a != null &&
                            a.getStatus() != null &&
                            a.getStatus().getHealth() != null &&
                            a.getStatus().getHealth().getStatus() != null &&
                            a.getStatus().getHealth().getStatus().equals("Healthy"), TIMEOUT, TimeUnit.SECONDS);
        } catch (Exception e) {
            LOG.error(client.getKubernetesSerialization()
                    .asYaml(client.genericKubernetesResources("argoproj.io/v1alpha1", "Application")
                            .inNamespace(ARGO_APPLICATION_NAMESPACE).withName(applicationConfig.getName()).get()));
        }
        LOG.infof("Argocd Application: %s healthy", applicationConfig.getName());

        LOG.info("Checking now when Argocd Application will be synced");
        try {
            client.resources(Application.class)
                    .inNamespace(ARGO_APPLICATION_NAMESPACE)
                    .withName(applicationConfig.getName())
                    .waitUntilCondition(a -> a != null &&
                            a.getStatus() != null &&
                            a.getStatus().getSync() != null &&
                            a.getStatus().getSync().getStatus() != null &&
                            a.getStatus().getSync().getStatus().equals("Synced"), TIMEOUT, TimeUnit.SECONDS);
        } catch (Exception e) {
            LOG.error(client.getKubernetesSerialization()
                    .asYaml(client.genericKubernetesResources("argoproj.io/v1alpha1", "Application")
                            .inNamespace(ARGO_APPLICATION_NAMESPACE).withName(applicationConfig.getName()).get()));
        }
        LOG.infof("Argocd Application: %s synced", applicationConfig.getName());

        Application app = client.resources(Application.class)
                .inNamespace(ARGO_APPLICATION_NAMESPACE)
                .withName(applicationConfig.getName()).get();
        LOG.warn(client.getKubernetesSerialization().asYaml(app));

        AppProject appProject = client.resources(AppProject.class)
                .inNamespace(ARGOCD_CONTROL_PLANE_NAMESPACE)
                .withName(applicationConfig.getName()).get();
        LOG.warn(client.getKubernetesSerialization().asYaml(appProject));
    }
}
