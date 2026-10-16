package io.quarkiverse.argocd.v1alpha1.applicationspec.source;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({ "apiVersions", "fileParameters", "ignoreMissingValueFiles", "kubeVersion",
        "namespace", "parameters", "passCredentials", "releaseName", "skipCrds", "skipSchemaValidation", "skipTests",
        "valueFiles", "values", "valuesObject", "version" })
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@lombok.ToString()
@lombok.EqualsAndHashCode()
@io.sundr.builder.annotations.Buildable(editableEnabled = false, validationEnabled = false, generateBuilderPackage = false, builderPackage = "io.fabric8.kubernetes.api.builder", refs = {
        @io.sundr.builder.annotations.BuildableReference(io.fabric8.kubernetes.api.model.ObjectMeta.class),
        @io.sundr.builder.annotations.BuildableReference(io.fabric8.kubernetes.api.model.ObjectReference.class),
        @io.sundr.builder.annotations.BuildableReference(io.fabric8.kubernetes.api.model.LabelSelector.class),
        @io.sundr.builder.annotations.BuildableReference(io.fabric8.kubernetes.api.model.Container.class),
        @io.sundr.builder.annotations.BuildableReference(io.fabric8.kubernetes.api.model.EnvVar.class),
        @io.sundr.builder.annotations.BuildableReference(io.fabric8.kubernetes.api.model.ContainerPort.class),
        @io.sundr.builder.annotations.BuildableReference(io.fabric8.kubernetes.api.model.Volume.class),
        @io.sundr.builder.annotations.BuildableReference(io.fabric8.kubernetes.api.model.VolumeMount.class)
})
public class Helm
        implements io.fabric8.kubernetes.api.builder.Editable<HelmBuilder>, io.fabric8.kubernetes.api.model.KubernetesResource {

    @java.lang.Override
    public HelmBuilder edit() {
        return new HelmBuilder(this);
    }

    /**
     * APIVersions specifies the Kubernetes resource API versions to pass to Helm when templating manifests. By default,
     * Argo CD uses the API versions of the target cluster. The format is [group/]version/kind.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("apiVersions")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("APIVersions specifies the Kubernetes resource API versions to pass to Helm when templating manifests. By default,\nArgo CD uses the API versions of the target cluster. The format is [group/]version/kind.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private java.util.List<String> apiVersions;

    public java.util.List<String> getApiVersions() {
        return apiVersions;
    }

    public void setApiVersions(java.util.List<String> apiVersions) {
        this.apiVersions = apiVersions;
    }

    /**
     * FileParameters are file parameters to the helm template
     */
    @com.fasterxml.jackson.annotation.JsonProperty("fileParameters")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("FileParameters are file parameters to the helm template")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private java.util.List<io.quarkiverse.argocd.v1alpha1.applicationspec.source.helm.FileParameters> fileParameters;

    public java.util.List<io.quarkiverse.argocd.v1alpha1.applicationspec.source.helm.FileParameters> getFileParameters() {
        return fileParameters;
    }

    public void setFileParameters(
            java.util.List<io.quarkiverse.argocd.v1alpha1.applicationspec.source.helm.FileParameters> fileParameters) {
        this.fileParameters = fileParameters;
    }

    /**
     * IgnoreMissingValueFiles prevents helm template from failing when valueFiles do not exist locally by not appending them to
     * helm template --values
     */
    @com.fasterxml.jackson.annotation.JsonProperty("ignoreMissingValueFiles")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("IgnoreMissingValueFiles prevents helm template from failing when valueFiles do not exist locally by not appending them to helm template --values")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Boolean ignoreMissingValueFiles;

    public Boolean getIgnoreMissingValueFiles() {
        return ignoreMissingValueFiles;
    }

    public void setIgnoreMissingValueFiles(Boolean ignoreMissingValueFiles) {
        this.ignoreMissingValueFiles = ignoreMissingValueFiles;
    }

    /**
     * KubeVersion specifies the Kubernetes API version to pass to Helm when templating manifests. By default, Argo CD
     * uses the Kubernetes version of the target cluster.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("kubeVersion")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("KubeVersion specifies the Kubernetes API version to pass to Helm when templating manifests. By default, Argo CD\nuses the Kubernetes version of the target cluster.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String kubeVersion;

    public String getKubeVersion() {
        return kubeVersion;
    }

    public void setKubeVersion(String kubeVersion) {
        this.kubeVersion = kubeVersion;
    }

    /**
     * Namespace is an optional namespace to template with. If left empty, defaults to the app's destination namespace.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("namespace")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Namespace is an optional namespace to template with. If left empty, defaults to the app's destination namespace.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String namespace;

    public String getNamespace() {
        return namespace;
    }

    public void setNamespace(String namespace) {
        this.namespace = namespace;
    }

    /**
     * Parameters is a list of Helm parameters which are passed to the helm template command upon manifest generation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("parameters")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Parameters is a list of Helm parameters which are passed to the helm template command upon manifest generation")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private java.util.List<io.quarkiverse.argocd.v1alpha1.applicationspec.source.helm.Parameters> parameters;

    public java.util.List<io.quarkiverse.argocd.v1alpha1.applicationspec.source.helm.Parameters> getParameters() {
        return parameters;
    }

    public void setParameters(
            java.util.List<io.quarkiverse.argocd.v1alpha1.applicationspec.source.helm.Parameters> parameters) {
        this.parameters = parameters;
    }

    /**
     * PassCredentials pass credentials to all domains (Helm's --pass-credentials)
     */
    @com.fasterxml.jackson.annotation.JsonProperty("passCredentials")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("PassCredentials pass credentials to all domains (Helm's --pass-credentials)")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Boolean passCredentials;

    public Boolean getPassCredentials() {
        return passCredentials;
    }

    public void setPassCredentials(Boolean passCredentials) {
        this.passCredentials = passCredentials;
    }

    /**
     * ReleaseName is the Helm release name to use. If omitted it will use the application name
     */
    @com.fasterxml.jackson.annotation.JsonProperty("releaseName")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("ReleaseName is the Helm release name to use. If omitted it will use the application name")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String releaseName;

    public String getReleaseName() {
        return releaseName;
    }

    public void setReleaseName(String releaseName) {
        this.releaseName = releaseName;
    }

    /**
     * SkipCrds skips custom resource definition installation step (Helm's --skip-crds)
     */
    @com.fasterxml.jackson.annotation.JsonProperty("skipCrds")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("SkipCrds skips custom resource definition installation step (Helm's --skip-crds)")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Boolean skipCrds;

    public Boolean getSkipCrds() {
        return skipCrds;
    }

    public void setSkipCrds(Boolean skipCrds) {
        this.skipCrds = skipCrds;
    }

    /**
     * SkipSchemaValidation skips JSON schema validation (Helm's --skip-schema-validation)
     */
    @com.fasterxml.jackson.annotation.JsonProperty("skipSchemaValidation")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("SkipSchemaValidation skips JSON schema validation (Helm's --skip-schema-validation)")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Boolean skipSchemaValidation;

    public Boolean getSkipSchemaValidation() {
        return skipSchemaValidation;
    }

    public void setSkipSchemaValidation(Boolean skipSchemaValidation) {
        this.skipSchemaValidation = skipSchemaValidation;
    }

    /**
     * SkipTests skips test manifest installation step (Helm's --skip-tests).
     */
    @com.fasterxml.jackson.annotation.JsonProperty("skipTests")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("SkipTests skips test manifest installation step (Helm's --skip-tests).")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Boolean skipTests;

    public Boolean getSkipTests() {
        return skipTests;
    }

    public void setSkipTests(Boolean skipTests) {
        this.skipTests = skipTests;
    }

    /**
     * ValuesFiles is a list of Helm value files to use when generating a template
     */
    @com.fasterxml.jackson.annotation.JsonProperty("valueFiles")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("ValuesFiles is a list of Helm value files to use when generating a template")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private java.util.List<String> valueFiles;

    public java.util.List<String> getValueFiles() {
        return valueFiles;
    }

    public void setValueFiles(java.util.List<String> valueFiles) {
        this.valueFiles = valueFiles;
    }

    /**
     * Values specifies Helm values to be passed to helm template, typically defined as a block. ValuesObject takes precedence
     * over Values, so use one or the other.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("values")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Values specifies Helm values to be passed to helm template, typically defined as a block. ValuesObject takes precedence over Values, so use one or the other.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String values;

    public String getValues() {
        return values;
    }

    public void setValues(String values) {
        this.values = values;
    }

    /**
     * ValuesObject specifies Helm values to be passed to helm template, defined as a map. This takes precedence over Values.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("valuesObject")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("ValuesObject specifies Helm values to be passed to helm template, defined as a map. This takes precedence over Values.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.quarkiverse.argocd.v1alpha1.applicationspec.source.helm.ValuesObject valuesObject;

    public io.quarkiverse.argocd.v1alpha1.applicationspec.source.helm.ValuesObject getValuesObject() {
        return valuesObject;
    }

    public void setValuesObject(io.quarkiverse.argocd.v1alpha1.applicationspec.source.helm.ValuesObject valuesObject) {
        this.valuesObject = valuesObject;
    }

    /**
     * Version is the Helm version to use for templating ("3")
     */
    @com.fasterxml.jackson.annotation.JsonProperty("version")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Version is the Helm version to use for templating (\"3\")")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String version;

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }
}
