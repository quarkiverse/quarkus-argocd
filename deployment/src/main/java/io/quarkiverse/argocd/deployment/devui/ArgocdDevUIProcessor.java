package io.quarkiverse.argocd.deployment.devui;

import java.util.Optional;

import org.jboss.logging.Logger;

import io.quarkiverse.argocd.deployment.devservices.ArgocdDevServiceInfoBuildItem;
import io.quarkus.deployment.IsDevelopment;
import io.quarkus.deployment.annotations.BuildProducer;
import io.quarkus.deployment.annotations.BuildStep;
import io.quarkus.devui.spi.page.CardPageBuildItem;
import io.quarkus.devui.spi.page.ExternalPageBuilder;
import io.quarkus.devui.spi.page.Page;

public class ArgocdDevUIProcessor {

    private static final Logger LOG = Logger.getLogger(ArgocdDevUIProcessor.class);

    @BuildStep(onlyIf = IsDevelopment.class)
    void createCard(Optional<ArgocdDevServiceInfoBuildItem> info, BuildProducer<CardPageBuildItem> cardPage) {

        info.ifPresent(i -> {
            CardPageBuildItem card = new CardPageBuildItem();
            LOG.debug("Creating card page");

            String url = String.format("https://%s:%s", i.host(), i.hostPort());
            LOG.debug("Creating an external link page for: argocd UI");
            card.addPage(Page.externalPageBuilder("Argocd Dashboard")
                    .doNotEmbed()
                    .icon("font-awesome-solid:code-branch")
                    .url(url));

            LOG.debug("Creating an external link page for: argocd project & version");
            final ExternalPageBuilder versionPage = Page.externalPageBuilder("Argocd project")
                    .icon("font-awesome-solid:tag")
                    .url("https://argo-cd.readthedocs.io/en/stable/")
                    .doNotEmbed()
                    .staticLabel("2.13.2");

            LOG.debug("Add version page");
            card.addPage(versionPage);
            LOG.debug("Set custom car with js");
            card.setCustomCard("qwc-argocd-card.js");
            LOG.debug("Produce ...");
            cardPage.produce(card);

        });
    }
}
