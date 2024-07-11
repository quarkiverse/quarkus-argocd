package io.quarkiverse.argocd.v1beta1.argocdspec;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({ "defaultPolicy", "policy", "policyMatcherMode", "scopes" })
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
public class Rbac
        implements io.fabric8.kubernetes.api.builder.Editable<RbacBuilder>, io.fabric8.kubernetes.api.model.KubernetesResource {

    @java.lang.Override
    public RbacBuilder edit() {
        return new RbacBuilder(this);
    }

    /**
     * DefaultPolicy is the name of the default role which Argo CD will falls back to, when authorizing API requests (optional).
     * If omitted or empty, users may be still be able to login, but will see no apps, projects, etc...
     */
    @com.fasterxml.jackson.annotation.JsonProperty("defaultPolicy")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("DefaultPolicy is the name of the default role which Argo CD will falls back to, when authorizing API requests (optional). If omitted or empty, users may be still be able to login, but will see no apps, projects, etc...")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String defaultPolicy;

    public String getDefaultPolicy() {
        return defaultPolicy;
    }

    public void setDefaultPolicy(String defaultPolicy) {
        this.defaultPolicy = defaultPolicy;
    }

    /**
     * Policy is CSV containing user-defined RBAC policies and role definitions. Policy rules are in the form: p, subject,
     * resource, action, object, effect Role definitions and bindings are in the form: g, subject, inherited-subject See
     * https://github.com/argoproj/argo-cd/blob/master/docs/operator-manual/rbac.md for additional information.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("policy")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Policy is CSV containing user-defined RBAC policies and role definitions. Policy rules are in the form:   p, subject, resource, action, object, effect Role definitions and bindings are in the form:   g, subject, inherited-subject See https://github.com/argoproj/argo-cd/blob/master/docs/operator-manual/rbac.md for additional information.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String policy;

    public String getPolicy() {
        return policy;
    }

    public void setPolicy(String policy) {
        this.policy = policy;
    }

    /**
     * PolicyMatcherMode configures the matchers function mode for casbin. There are two options for this, 'glob' for glob
     * matcher or 'regex' for regex matcher.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("policyMatcherMode")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("PolicyMatcherMode configures the matchers function mode for casbin. There are two options for this, 'glob' for glob matcher or 'regex' for regex matcher.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String policyMatcherMode;

    public String getPolicyMatcherMode() {
        return policyMatcherMode;
    }

    public void setPolicyMatcherMode(String policyMatcherMode) {
        this.policyMatcherMode = policyMatcherMode;
    }

    /**
     * Scopes controls which OIDC scopes to examine during rbac enforcement (in addition to `sub` scope). If omitted, defaults
     * to: '[groups]'.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("scopes")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Scopes controls which OIDC scopes to examine during rbac enforcement (in addition to `sub` scope). If omitted, defaults to: '[groups]'.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String scopes;

    public String getScopes() {
        return scopes;
    }

    public void setScopes(String scopes) {
        this.scopes = scopes;
    }
}
