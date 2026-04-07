package io.quarkiverse.argocd.it;

import io.quarkiverse.argocd.it.model.ArgoConfigurator;
import io.quarkiverse.argocd.v1alpha1.AppProject;
import io.quarkiverse.argocd.v1alpha1.AppProjectBuilder;
import io.quarkiverse.argocd.v1alpha1.Application;
import io.quarkiverse.argocd.v1alpha1.ApplicationBuilder;

public class ArgocdResourceGenerator {

    public static AppProject populateProject(ArgoConfigurator config) {
        // @formatter:off
        var projectBuilder = new AppProjectBuilder()
          .withNewMetadata()
            .withName(config.getAppProjectConfig().getName())
            .withNamespace(config.getAppProjectConfig().getNamespace())
          .endMetadata()
          .withNewSpec()
            .addNewDestination()
              .withNamespace(config.getAppProjectConfig().getDestinationNamespace())
              .withServer(config.getAppProjectConfig().getDestinationKubeServer())
            .endDestination()
            .withSourceRepos(config.getAppProjectConfig().getGitUrl())
          .endSpec();

        if (config.getAppProjectConfig().getSourceNamespaces() != null) {
            projectBuilder.editOrNewSpec().withSourceNamespaces(config.getAppProjectConfig().getSourceNamespaces()).endSpec();
        }

        // @formatter:on
        return projectBuilder.build();
    }

    public static Application populateApplication(ArgoConfigurator config) {
        // @formatter:off
        Application application = new ApplicationBuilder()
                .withNewMetadata()
                  .withName(config.getApplicationConfig().getName())
                  .withNamespace(config.getApplicationConfig().getNamespace())
                .endMetadata()
                .withNewSpec()
                  .withProject(config.getApplicationConfig().getAppProjectName())
                  .withNewDestination()
                    .withServer(config.getApplicationConfig().getDestinationKubeServer())
                    .withNamespace(config.getApplicationConfig().getDestinationNamespace())
                  .endDestination()
                  .withNewSource()
                    .withPath(config.getApplicationConfig().getHelmPath())
                    .withRepoURL(config.getApplicationConfig().getHelmUrl())
                    .withTargetRevision(config.getApplicationConfig().getGitRevision())
                    .withNewHelm()
                      .withValueFiles("values.yaml")
                      //.endHelm()
                      .endApplicationspecHelm()
                  //.endSource()
                  .endApplicationspecSource()
                  .withNewSyncPolicy()
                    .withNewAutomated()
                      .withPrune(true)
                      .withSelfHeal(true)
                    .endAutomated()
                    .addToSyncOptions("CreateNamespace=true", "RespectIgnoreDifferences=true", "ApplyOutOfSyncOnly=true")
                    .withNewRetry()
                      .withNewBackoff()
                        .withDuration("5s")
                        .withFactor(2L)
                        .withMaxDuration("10m")
                      //.endBackoff()
                      .endSyncpolicyBackoff()
                    //.endRetry()
                    .endSyncpolicyRetry()
                  .endSyncPolicy()
                .endSpec()
                .build();
        // @formatter:on
        return application;
    }
}
