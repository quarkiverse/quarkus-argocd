package io.quarkiverse.argocd.it;

import io.quarkiverse.argocd.v1alpha1.AppProject;
import io.quarkiverse.argocd.v1alpha1.AppProjectBuilder;
import io.quarkiverse.argocd.v1alpha1.Application;
import io.quarkiverse.argocd.v1alpha1.ApplicationBuilder;

public class ArgocdResourceGenerator {

    public static AppProject populateProject(ArgoConfigurator argoConfigurator) {
        // @formatter:off
        var projectBuilder = new AppProjectBuilder()
          .withNewMetadata()
            .withName(argoConfigurator.getProjectName())
            .withNamespace(argoConfigurator.getProjectNamespace())
          .endMetadata()
          .withNewSpec()
            .addNewDestination()
              .withNamespace(argoConfigurator.getDestinationNamespace())
              .withServer(argoConfigurator.getDestinationKubeServer())
            .endDestination()
          .withSourceRepos(argoConfigurator.getGitUrl())
          .endSpec();

        if (argoConfigurator.getSourceNamespaces() != null) {
            projectBuilder.editOrNewSpec().withSourceNamespaces(argoConfigurator.getSourceNamespaces()).endSpec();
        }

        // @formatter:on
        return projectBuilder.build();
    }

    public static Application populateApplication(ArgoConfigurator argoConfigurator) {
        // @formatter:off
        Application application = new ApplicationBuilder()
                .withNewMetadata()
                  .withName(argoConfigurator.getApplicationName())
                  .withNamespace(argoConfigurator.getApplicationNamespace())
                .endMetadata()
                .withNewSpec()
                  .withProject(argoConfigurator.getProjectName())
                  .withNewDestination()
                    .withServer(argoConfigurator.getDestinationKubeServer())
                    .withNamespace(argoConfigurator.getApplicationNamespace())
                  .endDestination()
                  .withNewSource()
                    .withPath(argoConfigurator.getHelmPath())
                    .withRepoURL(argoConfigurator.getHelmUrl())
                    .withTargetRevision(argoConfigurator.getGitRevision())
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
