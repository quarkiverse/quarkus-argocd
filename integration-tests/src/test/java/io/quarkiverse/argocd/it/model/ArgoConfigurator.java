package io.quarkiverse.argocd.it.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Builder(toBuilder = true)
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ArgoConfigurator {
    private AppProjectConfig appProjectConfig;
    private ApplicationConfig applicationConfig;
}
