package io.quarkiverse.argocd.workflow.v1alpha1;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;

import io.fabric8.kubernetes.api.model.Affinity;
import io.fabric8.kubernetes.api.model.HostAlias;
import io.fabric8.kubernetes.api.model.LocalObjectReference;
import io.fabric8.kubernetes.api.model.PersistentVolumeClaim;
import io.fabric8.kubernetes.api.model.PodDNSConfig;
import io.fabric8.kubernetes.api.model.PodSecurityContext;
import io.fabric8.kubernetes.api.model.Toleration;
import io.fabric8.kubernetes.api.model.Volume;
import io.fabric8.kubernetes.api.model.policy.v1.PodDisruptionBudgetSpec;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.Type;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
/**
  * WorkflowSpec is the specification of a Workflow.
 **/
public class WorkflowSpec  {

    /**
      * WorkflowSpec is the specification of a Workflow.
     **/
    private Integer activeDeadlineSeconds;
    /**
      * WorkflowSpec is the specification of a Workflow.
     **/
    private Affinity affinity;
    /**
      * WorkflowSpec is the specification of a Workflow.
     **/
    private Boolean archiveLogs;
    /**
      * WorkflowSpec is the specification of a Workflow.
     **/
    private Arguments arguments;
    /**
      * WorkflowSpec is the specification of a Workflow.
     **/
    private WorkflowLevelArtifactGC artifactGC;
    /**
      * WorkflowSpec is the specification of a Workflow.
     **/
    private ArtifactRepositoryRef artifactRepositoryRef;
    /**
      * WorkflowSpec is the specification of a Workflow.
     **/
    private Boolean automountServiceAccountToken;
    /**
      * WorkflowSpec is the specification of a Workflow.
     **/
    private PodDNSConfig dnsConfig;
    /**
      * WorkflowSpec is the specification of a Workflow.
     **/
    private String dnsPolicy;
    /**
      * WorkflowSpec is the specification of a Workflow.
     **/
    private String entrypoint;
    /**
      * WorkflowSpec is the specification of a Workflow.
     **/
    private ExecutorConfig executor;
    /**
      * WorkflowSpec is the specification of a Workflow.
     **/
    private Map<String, LifecycleHook> hooks;
    /**
      * WorkflowSpec is the specification of a Workflow.
     **/
    private List<HostAlias> hostAliases;
    /**
      * WorkflowSpec is the specification of a Workflow.
     **/
    private Boolean hostNetwork;
    /**
      * WorkflowSpec is the specification of a Workflow.
     **/
    private List<LocalObjectReference> imagePullSecrets;
    /**
      * WorkflowSpec is the specification of a Workflow.
     **/
    private Metrics metrics;
    /**
      * WorkflowSpec is the specification of a Workflow.
     **/
    private Map<String, String> nodeSelector;
    /**
      * WorkflowSpec is the specification of a Workflow.
     **/
    private String onExit;
    /**
      * WorkflowSpec is the specification of a Workflow.
     **/
    private Integer parallelism;
    /**
      * WorkflowSpec is the specification of a Workflow.
     **/
    private PodDisruptionBudgetSpec podDisruptionBudget;
    /**
      * WorkflowSpec is the specification of a Workflow.
     **/
    private PodGC podGC;
    /**
      * WorkflowSpec is the specification of a Workflow.
     **/
    private Metadata podMetadata;
    /**
      * WorkflowSpec is the specification of a Workflow.
     **/
    private Integer podPriority;
    /**
      * WorkflowSpec is the specification of a Workflow.
     **/
    private String podPriorityClassName;
    /**
      * WorkflowSpec is the specification of a Workflow.
     **/
    private String podSpecPatch;
    /**
      * WorkflowSpec is the specification of a Workflow.
     **/
    private Integer priority;
    /**
      * WorkflowSpec is the specification of a Workflow.
     **/
    private RetryStrategy retryStrategy;
    /**
      * WorkflowSpec is the specification of a Workflow.
     **/
    private String schedulerName;
    /**
      * WorkflowSpec is the specification of a Workflow.
     **/
    private PodSecurityContext securityContext;
    /**
      * WorkflowSpec is the specification of a Workflow.
     **/
    private String serviceAccountName;
    /**
      * WorkflowSpec is the specification of a Workflow.
     **/
    private String shutdown;
    /**
      * WorkflowSpec is the specification of a Workflow.
     **/
    private Boolean suspend;
    /**
      * WorkflowSpec is the specification of a Workflow.
     **/
    private Synchronization synchronization;
    /**
      * WorkflowSpec is the specification of a Workflow.
     **/
    private Template templateDefaults;
    /**
      * WorkflowSpec is the specification of a Workflow.
     **/
    private List<Template> templates;
    /**
      * WorkflowSpec is the specification of a Workflow.
     **/
    private List<Toleration> tolerations;
    /**
      * WorkflowSpec is the specification of a Workflow.
     **/
    private TTLStrategy ttlStrategy;
    /**
      * WorkflowSpec is the specification of a Workflow.
     **/
    private VolumeClaimGC volumeClaimGC;
    /**
      * WorkflowSpec is the specification of a Workflow.
     **/
    private List<PersistentVolumeClaim> volumeClaimTemplates;
    /**
      * WorkflowSpec is the specification of a Workflow.
     **/
    private List<Volume> volumes;
    /**
      * WorkflowSpec is the specification of a Workflow.
     **/
    private WorkflowMetadata workflowMetadata;
    /**
      * WorkflowSpec is the specification of a Workflow.
     **/
    private WorkflowTemplateRef workflowTemplateRef;

    /**
    * Optional duration in seconds relative to the workflow start time which the workflow is allowed to run before the controller terminates the io.argoproj.workflow.v1alpha1. A value of zero is used to terminate a Running workflow
    * @return activeDeadlineSeconds
    **/
    @JsonProperty("activeDeadlineSeconds")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public Integer getActiveDeadlineSeconds() {
        return activeDeadlineSeconds;
    }

    /**
     * Set activeDeadlineSeconds
     **/
    public void setActiveDeadlineSeconds(Integer activeDeadlineSeconds) {
        this.activeDeadlineSeconds = activeDeadlineSeconds;
    }

    public WorkflowSpec activeDeadlineSeconds(Integer activeDeadlineSeconds) {
        this.activeDeadlineSeconds = activeDeadlineSeconds;
        return this;
    }

    /**
    * Get affinity
    * @return affinity
    **/
    @JsonProperty("affinity")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public Affinity getAffinity() {
        return affinity;
    }

    /**
     * Set affinity
     **/
    public void setAffinity(Affinity affinity) {
        this.affinity = affinity;
    }

    public WorkflowSpec affinity(Affinity affinity) {
        this.affinity = affinity;
        return this;
    }

    /**
    * ArchiveLogs indicates if the container logs should be archived
    * @return archiveLogs
    **/
    @JsonProperty("archiveLogs")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public Boolean getArchiveLogs() {
        return archiveLogs;
    }

    /**
     * Set archiveLogs
     **/
    public void setArchiveLogs(Boolean archiveLogs) {
        this.archiveLogs = archiveLogs;
    }

    public WorkflowSpec archiveLogs(Boolean archiveLogs) {
        this.archiveLogs = archiveLogs;
        return this;
    }

    /**
    * Get arguments
    * @return arguments
    **/
    @JsonProperty("arguments")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public Arguments getArguments() {
        return arguments;
    }

    /**
     * Set arguments
     **/
    public void setArguments(Arguments arguments) {
        this.arguments = arguments;
    }

    public WorkflowSpec arguments(Arguments arguments) {
        this.arguments = arguments;
        return this;
    }

    /**
    * Get artifactGC
    * @return artifactGC
    **/
    @JsonProperty("artifactGC")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public WorkflowLevelArtifactGC getArtifactGC() {
        return artifactGC;
    }

    /**
     * Set artifactGC
     **/
    public void setArtifactGC(WorkflowLevelArtifactGC artifactGC) {
        this.artifactGC = artifactGC;
    }

    public WorkflowSpec artifactGC(WorkflowLevelArtifactGC artifactGC) {
        this.artifactGC = artifactGC;
        return this;
    }

    /**
    * Get artifactRepositoryRef
    * @return artifactRepositoryRef
    **/
    @JsonProperty("artifactRepositoryRef")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public ArtifactRepositoryRef getArtifactRepositoryRef() {
        return artifactRepositoryRef;
    }

    /**
     * Set artifactRepositoryRef
     **/
    public void setArtifactRepositoryRef(ArtifactRepositoryRef artifactRepositoryRef) {
        this.artifactRepositoryRef = artifactRepositoryRef;
    }

    public WorkflowSpec artifactRepositoryRef(ArtifactRepositoryRef artifactRepositoryRef) {
        this.artifactRepositoryRef = artifactRepositoryRef;
        return this;
    }

    /**
    * AutomountServiceAccountToken indicates whether a service account token should be automatically mounted in pods. ServiceAccountName of ExecutorConfig must be specified if this value is false.
    * @return automountServiceAccountToken
    **/
    @JsonProperty("automountServiceAccountToken")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public Boolean getAutomountServiceAccountToken() {
        return automountServiceAccountToken;
    }

    /**
     * Set automountServiceAccountToken
     **/
    public void setAutomountServiceAccountToken(Boolean automountServiceAccountToken) {
        this.automountServiceAccountToken = automountServiceAccountToken;
    }

    public WorkflowSpec automountServiceAccountToken(Boolean automountServiceAccountToken) {
        this.automountServiceAccountToken = automountServiceAccountToken;
        return this;
    }

    /**
    * Get dnsConfig
    * @return dnsConfig
    **/
    @JsonProperty("dnsConfig")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public PodDNSConfig getDnsConfig() {
        return dnsConfig;
    }

    /**
     * Set dnsConfig
     **/
    public void setDnsConfig(PodDNSConfig dnsConfig) {
        this.dnsConfig = dnsConfig;
    }

    public WorkflowSpec dnsConfig(PodDNSConfig dnsConfig) {
        this.dnsConfig = dnsConfig;
        return this;
    }

    /**
    * Set DNS policy for workflow pods. Defaults to \"ClusterFirst\". Valid values are 'ClusterFirstWithHostNet', 'ClusterFirst', 'Default' or 'None'. DNS parameters given in DNSConfig will be merged with the policy selected with DNSPolicy. To have DNS options set along with hostNetwork, you have to specify DNS policy explicitly to 'ClusterFirstWithHostNet'.
    * @return dnsPolicy
    **/
    @JsonProperty("dnsPolicy")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public String getDnsPolicy() {
        return dnsPolicy;
    }

    /**
     * Set dnsPolicy
     **/
    public void setDnsPolicy(String dnsPolicy) {
        this.dnsPolicy = dnsPolicy;
    }

    public WorkflowSpec dnsPolicy(String dnsPolicy) {
        this.dnsPolicy = dnsPolicy;
        return this;
    }

    /**
    * Entrypoint is a template reference to the starting point of the io.argoproj.workflow.v1alpha1.
    * @return entrypoint
    **/
    @JsonProperty("entrypoint")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public String getEntrypoint() {
        return entrypoint;
    }

    /**
     * Set entrypoint
     **/
    public void setEntrypoint(String entrypoint) {
        this.entrypoint = entrypoint;
    }

    public WorkflowSpec entrypoint(String entrypoint) {
        this.entrypoint = entrypoint;
        return this;
    }

    /**
    * Get executor
    * @return executor
    **/
    @JsonProperty("executor")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public ExecutorConfig getExecutor() {
        return executor;
    }

    /**
     * Set executor
     **/
    public void setExecutor(ExecutorConfig executor) {
        this.executor = executor;
    }

    public WorkflowSpec executor(ExecutorConfig executor) {
        this.executor = executor;
        return this;
    }

    /**
    * Hooks holds the lifecycle hook which is invoked at lifecycle of step, irrespective of the success, failure, or error status of the primary step
    * @return hooks
    **/
    @JsonProperty("hooks")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public Map<String, LifecycleHook> getHooks() {
        return hooks;
    }

    /**
     * Set hooks
     **/
    public void setHooks(Map<String, LifecycleHook> hooks) {
        this.hooks = hooks;
    }

    public WorkflowSpec hooks(Map<String, LifecycleHook> hooks) {
        this.hooks = hooks;
        return this;
    }
    public WorkflowSpec putHooksItem(String key, LifecycleHook hooksItem) {
           if (this.hooks == null){
                hooks = new HashMap<>();
            }
        this.hooks.put(key, hooksItem);
        return this;
    }

    /**
    * Get hostAliases
    * @return hostAliases
    **/
    @JsonProperty("hostAliases")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public List<HostAlias> getHostAliases() {
        return hostAliases;
    }

    /**
     * Set hostAliases
     **/
    public void setHostAliases(List<HostAlias> hostAliases) {
        this.hostAliases = hostAliases;
    }

    public WorkflowSpec hostAliases(List<HostAlias> hostAliases) {
        this.hostAliases = hostAliases;
        return this;
    }
    public WorkflowSpec addHostAliasesItem(HostAlias hostAliasesItem) {
        if (this.hostAliases == null){
            hostAliases = new ArrayList<>();
        }
        this.hostAliases.add(hostAliasesItem);
        return this;
    }

    /**
    * Host networking requested for this workflow pod. Default to false.
    * @return hostNetwork
    **/
    @JsonProperty("hostNetwork")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public Boolean getHostNetwork() {
        return hostNetwork;
    }

    /**
     * Set hostNetwork
     **/
    public void setHostNetwork(Boolean hostNetwork) {
        this.hostNetwork = hostNetwork;
    }

    public WorkflowSpec hostNetwork(Boolean hostNetwork) {
        this.hostNetwork = hostNetwork;
        return this;
    }

    /**
    * ImagePullSecrets is a list of references to secrets in the same namespace to use for pulling any images in pods that reference this ServiceAccount. ImagePullSecrets are distinct from Secrets because Secrets can be mounted in the pod, but ImagePullSecrets are only accessed by the kubelet. More info: https://kubernetes.io/docs/concepts/containers/images/#specifying-imagepullsecrets-on-a-pod
    * @return imagePullSecrets
    **/
    @JsonProperty("imagePullSecrets")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public List<LocalObjectReference> getImagePullSecrets() {
        return imagePullSecrets;
    }

    /**
     * Set imagePullSecrets
     **/
    public void setImagePullSecrets(List<LocalObjectReference> imagePullSecrets) {
        this.imagePullSecrets = imagePullSecrets;
    }

    public WorkflowSpec imagePullSecrets(List<LocalObjectReference> imagePullSecrets) {
        this.imagePullSecrets = imagePullSecrets;
        return this;
    }
    public WorkflowSpec addImagePullSecretsItem(LocalObjectReference imagePullSecretsItem) {
        if (this.imagePullSecrets == null){
            imagePullSecrets = new ArrayList<>();
        }
        this.imagePullSecrets.add(imagePullSecretsItem);
        return this;
    }

    /**
    * Get metrics
    * @return metrics
    **/
    @JsonProperty("metrics")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public Metrics getMetrics() {
        return metrics;
    }

    /**
     * Set metrics
     **/
    public void setMetrics(Metrics metrics) {
        this.metrics = metrics;
    }

    public WorkflowSpec metrics(Metrics metrics) {
        this.metrics = metrics;
        return this;
    }

    /**
    * NodeSelector is a selector which will result in all pods of the workflow to be scheduled on the selected node(s). This is able to be overridden by a nodeSelector specified in the template.
    * @return nodeSelector
    **/
    @JsonProperty("nodeSelector")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public Map<String, String> getNodeSelector() {
        return nodeSelector;
    }

    /**
     * Set nodeSelector
     **/
    public void setNodeSelector(Map<String, String> nodeSelector) {
        this.nodeSelector = nodeSelector;
    }

    public WorkflowSpec nodeSelector(Map<String, String> nodeSelector) {
        this.nodeSelector = nodeSelector;
        return this;
    }
    public WorkflowSpec putNodeSelectorItem(String key, String nodeSelectorItem) {
           if (this.nodeSelector == null){
                nodeSelector = new HashMap<>();
            }
        this.nodeSelector.put(key, nodeSelectorItem);
        return this;
    }

    /**
    * OnExit is a template reference which is invoked at the end of the workflow, irrespective of the success, failure, or error of the primary io.argoproj.workflow.v1alpha1.
    * @return onExit
    **/
    @JsonProperty("onExit")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public String getOnExit() {
        return onExit;
    }

    /**
     * Set onExit
     **/
    public void setOnExit(String onExit) {
        this.onExit = onExit;
    }

    public WorkflowSpec onExit(String onExit) {
        this.onExit = onExit;
        return this;
    }

    /**
    * Parallelism limits the max total parallel pods that can execute at the same time in a workflow
    * @return parallelism
    **/
    @JsonProperty("parallelism")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public Integer getParallelism() {
        return parallelism;
    }

    /**
     * Set parallelism
     **/
    public void setParallelism(Integer parallelism) {
        this.parallelism = parallelism;
    }

    public WorkflowSpec parallelism(Integer parallelism) {
        this.parallelism = parallelism;
        return this;
    }

    /**
    * Get podDisruptionBudget
    * @return podDisruptionBudget
    **/
    @JsonProperty("podDisruptionBudget")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public PodDisruptionBudgetSpec getPodDisruptionBudget() {
        return podDisruptionBudget;
    }

    /**
     * Set podDisruptionBudget
     **/
    public void setPodDisruptionBudget(PodDisruptionBudgetSpec podDisruptionBudget) {
        this.podDisruptionBudget = podDisruptionBudget;
    }

    public WorkflowSpec podDisruptionBudget(PodDisruptionBudgetSpec podDisruptionBudget) {
        this.podDisruptionBudget = podDisruptionBudget;
        return this;
    }

    /**
    * Get podGC
    * @return podGC
    **/
    @JsonProperty("podGC")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public PodGC getPodGC() {
        return podGC;
    }

    /**
     * Set podGC
     **/
    public void setPodGC(PodGC podGC) {
        this.podGC = podGC;
    }

    public WorkflowSpec podGC(PodGC podGC) {
        this.podGC = podGC;
        return this;
    }

    /**
    * Get podMetadata
    * @return podMetadata
    **/
    @JsonProperty("podMetadata")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public Metadata getPodMetadata() {
        return podMetadata;
    }

    /**
     * Set podMetadata
     **/
    public void setPodMetadata(Metadata podMetadata) {
        this.podMetadata = podMetadata;
    }

    public WorkflowSpec podMetadata(Metadata podMetadata) {
        this.podMetadata = podMetadata;
        return this;
    }

    /**
    * Priority to apply to workflow pods. DEPRECATED: Use PodPriorityClassName instead.
    * @return podPriority
    **/
    @JsonProperty("podPriority")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public Integer getPodPriority() {
        return podPriority;
    }

    /**
     * Set podPriority
     **/
    public void setPodPriority(Integer podPriority) {
        this.podPriority = podPriority;
    }

    public WorkflowSpec podPriority(Integer podPriority) {
        this.podPriority = podPriority;
        return this;
    }

    /**
    * PriorityClassName to apply to workflow pods.
    * @return podPriorityClassName
    **/
    @JsonProperty("podPriorityClassName")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public String getPodPriorityClassName() {
        return podPriorityClassName;
    }

    /**
     * Set podPriorityClassName
     **/
    public void setPodPriorityClassName(String podPriorityClassName) {
        this.podPriorityClassName = podPriorityClassName;
    }

    public WorkflowSpec podPriorityClassName(String podPriorityClassName) {
        this.podPriorityClassName = podPriorityClassName;
        return this;
    }

    /**
    * PodSpecPatch holds strategic merge patch to apply against the pod spec. Allows parameterization of container fields which are not strings (e.g. resource limits).
    * @return podSpecPatch
    **/
    @JsonProperty("podSpecPatch")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public String getPodSpecPatch() {
        return podSpecPatch;
    }

    /**
     * Set podSpecPatch
     **/
    public void setPodSpecPatch(String podSpecPatch) {
        this.podSpecPatch = podSpecPatch;
    }

    public WorkflowSpec podSpecPatch(String podSpecPatch) {
        this.podSpecPatch = podSpecPatch;
        return this;
    }

    /**
    * Priority is used if controller is configured to process limited number of workflows in parallel. Workflows with higher priority are processed first.
    * @return priority
    **/
    @JsonProperty("priority")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public Integer getPriority() {
        return priority;
    }

    /**
     * Set priority
     **/
    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    public WorkflowSpec priority(Integer priority) {
        this.priority = priority;
        return this;
    }

    /**
    * Get retryStrategy
    * @return retryStrategy
    **/
    @JsonProperty("retryStrategy")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public RetryStrategy getRetryStrategy() {
        return retryStrategy;
    }

    /**
     * Set retryStrategy
     **/
    public void setRetryStrategy(RetryStrategy retryStrategy) {
        this.retryStrategy = retryStrategy;
    }

    public WorkflowSpec retryStrategy(RetryStrategy retryStrategy) {
        this.retryStrategy = retryStrategy;
        return this;
    }

    /**
    * Set scheduler name for all pods. Will be overridden if container/script template's scheduler name is set. Default scheduler will be used if neither specified.
    * @return schedulerName
    **/
    @JsonProperty("schedulerName")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public String getSchedulerName() {
        return schedulerName;
    }

    /**
     * Set schedulerName
     **/
    public void setSchedulerName(String schedulerName) {
        this.schedulerName = schedulerName;
    }

    public WorkflowSpec schedulerName(String schedulerName) {
        this.schedulerName = schedulerName;
        return this;
    }

    /**
    * Get securityContext
    * @return securityContext
    **/
    @JsonProperty("securityContext")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public PodSecurityContext getSecurityContext() {
        return securityContext;
    }

    /**
     * Set securityContext
     **/
    public void setSecurityContext(PodSecurityContext securityContext) {
        this.securityContext = securityContext;
    }

    public WorkflowSpec securityContext(PodSecurityContext securityContext) {
        this.securityContext = securityContext;
        return this;
    }

    /**
    * ServiceAccountName is the name of the ServiceAccount to run all pods of the workflow as.
    * @return serviceAccountName
    **/
    @JsonProperty("serviceAccountName")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public String getServiceAccountName() {
        return serviceAccountName;
    }

    /**
     * Set serviceAccountName
     **/
    public void setServiceAccountName(String serviceAccountName) {
        this.serviceAccountName = serviceAccountName;
    }

    public WorkflowSpec serviceAccountName(String serviceAccountName) {
        this.serviceAccountName = serviceAccountName;
        return this;
    }

    /**
    * Shutdown will shutdown the workflow according to its ShutdownStrategy
    * @return shutdown
    **/
    @JsonProperty("shutdown")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public String getShutdown() {
        return shutdown;
    }

    /**
     * Set shutdown
     **/
    public void setShutdown(String shutdown) {
        this.shutdown = shutdown;
    }

    public WorkflowSpec shutdown(String shutdown) {
        this.shutdown = shutdown;
        return this;
    }

    /**
    * Suspend will suspend the workflow and prevent execution of any future steps in the workflow
    * @return suspend
    **/
    @JsonProperty("suspend")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public Boolean getSuspend() {
        return suspend;
    }

    /**
     * Set suspend
     **/
    public void setSuspend(Boolean suspend) {
        this.suspend = suspend;
    }

    public WorkflowSpec suspend(Boolean suspend) {
        this.suspend = suspend;
        return this;
    }

    /**
    * Get synchronization
    * @return synchronization
    **/
    @JsonProperty("synchronization")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public Synchronization getSynchronization() {
        return synchronization;
    }

    /**
     * Set synchronization
     **/
    public void setSynchronization(Synchronization synchronization) {
        this.synchronization = synchronization;
    }

    public WorkflowSpec synchronization(Synchronization synchronization) {
        this.synchronization = synchronization;
        return this;
    }

    /**
    * Get templateDefaults
    * @return templateDefaults
    **/
    @JsonProperty("templateDefaults")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public Template getTemplateDefaults() {
        return templateDefaults;
    }

    /**
     * Set templateDefaults
     **/
    public void setTemplateDefaults(Template templateDefaults) {
        this.templateDefaults = templateDefaults;
    }

    public WorkflowSpec templateDefaults(Template templateDefaults) {
        this.templateDefaults = templateDefaults;
        return this;
    }

    /**
    * Templates is a list of workflow templates used in a workflow
    * @return templates
    **/
    @JsonProperty("templates")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public List<Template> getTemplates() {
        return templates;
    }

    /**
     * Set templates
     **/
    public void setTemplates(List<Template> templates) {
        this.templates = templates;
    }

    public WorkflowSpec templates(List<Template> templates) {
        this.templates = templates;
        return this;
    }
    public WorkflowSpec addTemplatesItem(Template templatesItem) {
        if (this.templates == null){
            templates = new ArrayList<>();
        }
        this.templates.add(templatesItem);
        return this;
    }

    /**
    * Tolerations to apply to workflow pods.
    * @return tolerations
    **/
    @JsonProperty("tolerations")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public List<Toleration> getTolerations() {
        return tolerations;
    }

    /**
     * Set tolerations
     **/
    public void setTolerations(List<Toleration> tolerations) {
        this.tolerations = tolerations;
    }

    public WorkflowSpec tolerations(List<Toleration> tolerations) {
        this.tolerations = tolerations;
        return this;
    }
    public WorkflowSpec addTolerationsItem(Toleration tolerationsItem) {
        if (this.tolerations == null){
            tolerations = new ArrayList<>();
        }
        this.tolerations.add(tolerationsItem);
        return this;
    }

    /**
    * Get ttlStrategy
    * @return ttlStrategy
    **/
    @JsonProperty("ttlStrategy")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public TTLStrategy getTtlStrategy() {
        return ttlStrategy;
    }

    /**
     * Set ttlStrategy
     **/
    public void setTtlStrategy(TTLStrategy ttlStrategy) {
        this.ttlStrategy = ttlStrategy;
    }

    public WorkflowSpec ttlStrategy(TTLStrategy ttlStrategy) {
        this.ttlStrategy = ttlStrategy;
        return this;
    }

    /**
    * Get volumeClaimGC
    * @return volumeClaimGC
    **/
    @JsonProperty("volumeClaimGC")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public VolumeClaimGC getVolumeClaimGC() {
        return volumeClaimGC;
    }

    /**
     * Set volumeClaimGC
     **/
    public void setVolumeClaimGC(VolumeClaimGC volumeClaimGC) {
        this.volumeClaimGC = volumeClaimGC;
    }

    public WorkflowSpec volumeClaimGC(VolumeClaimGC volumeClaimGC) {
        this.volumeClaimGC = volumeClaimGC;
        return this;
    }

    /**
    * VolumeClaimTemplates is a list of claims that containers are allowed to reference. The Workflow controller will create the claims at the beginning of the workflow and delete the claims upon completion of the workflow
    * @return volumeClaimTemplates
    **/
    @JsonProperty("volumeClaimTemplates")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public List<PersistentVolumeClaim> getVolumeClaimTemplates() {
        return volumeClaimTemplates;
    }

    /**
     * Set volumeClaimTemplates
     **/
    public void setVolumeClaimTemplates(List<PersistentVolumeClaim> volumeClaimTemplates) {
        this.volumeClaimTemplates = volumeClaimTemplates;
    }

    public WorkflowSpec volumeClaimTemplates(List<PersistentVolumeClaim> volumeClaimTemplates) {
        this.volumeClaimTemplates = volumeClaimTemplates;
        return this;
    }
    public WorkflowSpec addVolumeClaimTemplatesItem(PersistentVolumeClaim volumeClaimTemplatesItem) {
        if (this.volumeClaimTemplates == null){
            volumeClaimTemplates = new ArrayList<>();
        }
        this.volumeClaimTemplates.add(volumeClaimTemplatesItem);
        return this;
    }

    /**
    * Volumes is a list of volumes that can be mounted by containers in a io.argoproj.workflow.v1alpha1.
    * @return volumes
    **/
    @JsonProperty("volumes")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public List<Volume> getVolumes() {
        return volumes;
    }

    /**
     * Set volumes
     **/
    public void setVolumes(List<Volume> volumes) {
        this.volumes = volumes;
    }

    public WorkflowSpec volumes(List<Volume> volumes) {
        this.volumes = volumes;
        return this;
    }
    public WorkflowSpec addVolumesItem(Volume volumesItem) {
        if (this.volumes == null){
            volumes = new ArrayList<>();
        }
        this.volumes.add(volumesItem);
        return this;
    }

    /**
    * Get workflowMetadata
    * @return workflowMetadata
    **/
    @JsonProperty("workflowMetadata")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public WorkflowMetadata getWorkflowMetadata() {
        return workflowMetadata;
    }

    /**
     * Set workflowMetadata
     **/
    public void setWorkflowMetadata(WorkflowMetadata workflowMetadata) {
        this.workflowMetadata = workflowMetadata;
    }

    public WorkflowSpec workflowMetadata(WorkflowMetadata workflowMetadata) {
        this.workflowMetadata = workflowMetadata;
        return this;
    }

    /**
    * Get workflowTemplateRef
    * @return workflowTemplateRef
    **/
    @JsonProperty("workflowTemplateRef")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public WorkflowTemplateRef getWorkflowTemplateRef() {
        return workflowTemplateRef;
    }

    /**
     * Set workflowTemplateRef
     **/
    public void setWorkflowTemplateRef(WorkflowTemplateRef workflowTemplateRef) {
        this.workflowTemplateRef = workflowTemplateRef;
    }

    public WorkflowSpec workflowTemplateRef(WorkflowTemplateRef workflowTemplateRef) {
        this.workflowTemplateRef = workflowTemplateRef;
        return this;
    }

    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class WorkflowSpec {\n");

        sb.append("    activeDeadlineSeconds: ").append(toIndentedString(activeDeadlineSeconds)).append("\n");
        sb.append("    affinity: ").append(toIndentedString(affinity)).append("\n");
        sb.append("    archiveLogs: ").append(toIndentedString(archiveLogs)).append("\n");
        sb.append("    arguments: ").append(toIndentedString(arguments)).append("\n");
        sb.append("    artifactGC: ").append(toIndentedString(artifactGC)).append("\n");
        sb.append("    artifactRepositoryRef: ").append(toIndentedString(artifactRepositoryRef)).append("\n");
        sb.append("    automountServiceAccountToken: ").append(toIndentedString(automountServiceAccountToken)).append("\n");
        sb.append("    dnsConfig: ").append(toIndentedString(dnsConfig)).append("\n");
        sb.append("    dnsPolicy: ").append(toIndentedString(dnsPolicy)).append("\n");
        sb.append("    entrypoint: ").append(toIndentedString(entrypoint)).append("\n");
        sb.append("    executor: ").append(toIndentedString(executor)).append("\n");
        sb.append("    hooks: ").append(toIndentedString(hooks)).append("\n");
        sb.append("    hostAliases: ").append(toIndentedString(hostAliases)).append("\n");
        sb.append("    hostNetwork: ").append(toIndentedString(hostNetwork)).append("\n");
        sb.append("    imagePullSecrets: ").append(toIndentedString(imagePullSecrets)).append("\n");
        sb.append("    metrics: ").append(toIndentedString(metrics)).append("\n");
        sb.append("    nodeSelector: ").append(toIndentedString(nodeSelector)).append("\n");
        sb.append("    onExit: ").append(toIndentedString(onExit)).append("\n");
        sb.append("    parallelism: ").append(toIndentedString(parallelism)).append("\n");
        sb.append("    podDisruptionBudget: ").append(toIndentedString(podDisruptionBudget)).append("\n");
        sb.append("    podGC: ").append(toIndentedString(podGC)).append("\n");
        sb.append("    podMetadata: ").append(toIndentedString(podMetadata)).append("\n");
        sb.append("    podPriority: ").append(toIndentedString(podPriority)).append("\n");
        sb.append("    podPriorityClassName: ").append(toIndentedString(podPriorityClassName)).append("\n");
        sb.append("    podSpecPatch: ").append(toIndentedString(podSpecPatch)).append("\n");
        sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
        sb.append("    retryStrategy: ").append(toIndentedString(retryStrategy)).append("\n");
        sb.append("    schedulerName: ").append(toIndentedString(schedulerName)).append("\n");
        sb.append("    securityContext: ").append(toIndentedString(securityContext)).append("\n");
        sb.append("    serviceAccountName: ").append(toIndentedString(serviceAccountName)).append("\n");
        sb.append("    shutdown: ").append(toIndentedString(shutdown)).append("\n");
        sb.append("    suspend: ").append(toIndentedString(suspend)).append("\n");
        sb.append("    synchronization: ").append(toIndentedString(synchronization)).append("\n");
        sb.append("    templateDefaults: ").append(toIndentedString(templateDefaults)).append("\n");
        sb.append("    templates: ").append(toIndentedString(templates)).append("\n");
        sb.append("    tolerations: ").append(toIndentedString(tolerations)).append("\n");
        sb.append("    ttlStrategy: ").append(toIndentedString(ttlStrategy)).append("\n");
        sb.append("    volumeClaimGC: ").append(toIndentedString(volumeClaimGC)).append("\n");
        sb.append("    volumeClaimTemplates: ").append(toIndentedString(volumeClaimTemplates)).append("\n");
        sb.append("    volumes: ").append(toIndentedString(volumes)).append("\n");
        sb.append("    workflowMetadata: ").append(toIndentedString(workflowMetadata)).append("\n");
        sb.append("    workflowTemplateRef: ").append(toIndentedString(workflowTemplateRef)).append("\n");
        
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
     */
    private static String toIndentedString(Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    /**
      * WorkflowSpec is the specification of a Workflow.
     **/
    public static class WorkflowSpecQueryParam  {

        /**
          * WorkflowSpec is the specification of a Workflow.
         **/
        @jakarta.ws.rs.QueryParam("activeDeadlineSeconds")
        private Integer activeDeadlineSeconds;
        /**
          * WorkflowSpec is the specification of a Workflow.
         **/
        @jakarta.ws.rs.QueryParam("affinity")
        private Affinity affinity;
        /**
          * WorkflowSpec is the specification of a Workflow.
         **/
        @jakarta.ws.rs.QueryParam("archiveLogs")
        private Boolean archiveLogs;
        /**
          * WorkflowSpec is the specification of a Workflow.
         **/
        @jakarta.ws.rs.QueryParam("arguments")
        private Arguments arguments;
        /**
          * WorkflowSpec is the specification of a Workflow.
         **/
        @jakarta.ws.rs.QueryParam("artifactGC")
        private WorkflowLevelArtifactGC artifactGC;
        /**
          * WorkflowSpec is the specification of a Workflow.
         **/
        @jakarta.ws.rs.QueryParam("artifactRepositoryRef")
        private ArtifactRepositoryRef artifactRepositoryRef;
        /**
          * WorkflowSpec is the specification of a Workflow.
         **/
        @jakarta.ws.rs.QueryParam("automountServiceAccountToken")
        private Boolean automountServiceAccountToken;
        /**
          * WorkflowSpec is the specification of a Workflow.
         **/
        @jakarta.ws.rs.QueryParam("dnsConfig")
        private PodDNSConfig dnsConfig;
        /**
          * WorkflowSpec is the specification of a Workflow.
         **/
        @jakarta.ws.rs.QueryParam("dnsPolicy")
        private String dnsPolicy;
        /**
          * WorkflowSpec is the specification of a Workflow.
         **/
        @jakarta.ws.rs.QueryParam("entrypoint")
        private String entrypoint;
        /**
          * WorkflowSpec is the specification of a Workflow.
         **/
        @jakarta.ws.rs.QueryParam("executor")
        private ExecutorConfig executor;
        /**
          * WorkflowSpec is the specification of a Workflow.
         **/
        @jakarta.ws.rs.QueryParam("hooks")
        private Map<String, LifecycleHook> hooks = null;
        /**
          * WorkflowSpec is the specification of a Workflow.
         **/
        @jakarta.ws.rs.QueryParam("hostAliases")
        private List<HostAlias> hostAliases = null;
        /**
          * WorkflowSpec is the specification of a Workflow.
         **/
        @jakarta.ws.rs.QueryParam("hostNetwork")
        private Boolean hostNetwork;
        /**
          * WorkflowSpec is the specification of a Workflow.
         **/
        @jakarta.ws.rs.QueryParam("imagePullSecrets")
        private List<LocalObjectReference> imagePullSecrets = null;
        /**
          * WorkflowSpec is the specification of a Workflow.
         **/
        @jakarta.ws.rs.QueryParam("metrics")
        private Metrics metrics;
        /**
          * WorkflowSpec is the specification of a Workflow.
         **/
        @jakarta.ws.rs.QueryParam("nodeSelector")
        private Map<String, String> nodeSelector = null;
        /**
          * WorkflowSpec is the specification of a Workflow.
         **/
        @jakarta.ws.rs.QueryParam("onExit")
        private String onExit;
        /**
          * WorkflowSpec is the specification of a Workflow.
         **/
        @jakarta.ws.rs.QueryParam("parallelism")
        private Integer parallelism;
        /**
          * WorkflowSpec is the specification of a Workflow.
         **/
        @jakarta.ws.rs.QueryParam("podDisruptionBudget")
        private PodDisruptionBudgetSpec podDisruptionBudget;
        /**
          * WorkflowSpec is the specification of a Workflow.
         **/
        @jakarta.ws.rs.QueryParam("podGC")
        private PodGC podGC;
        /**
          * WorkflowSpec is the specification of a Workflow.
         **/
        @jakarta.ws.rs.QueryParam("podMetadata")
        private Metadata podMetadata;
        /**
          * WorkflowSpec is the specification of a Workflow.
         **/
        @jakarta.ws.rs.QueryParam("podPriority")
        private Integer podPriority;
        /**
          * WorkflowSpec is the specification of a Workflow.
         **/
        @jakarta.ws.rs.QueryParam("podPriorityClassName")
        private String podPriorityClassName;
        /**
          * WorkflowSpec is the specification of a Workflow.
         **/
        @jakarta.ws.rs.QueryParam("podSpecPatch")
        private String podSpecPatch;
        /**
          * WorkflowSpec is the specification of a Workflow.
         **/
        @jakarta.ws.rs.QueryParam("priority")
        private Integer priority;
        /**
          * WorkflowSpec is the specification of a Workflow.
         **/
        @jakarta.ws.rs.QueryParam("retryStrategy")
        private RetryStrategy retryStrategy;
        /**
          * WorkflowSpec is the specification of a Workflow.
         **/
        @jakarta.ws.rs.QueryParam("schedulerName")
        private String schedulerName;
        /**
          * WorkflowSpec is the specification of a Workflow.
         **/
        @jakarta.ws.rs.QueryParam("securityContext")
        private PodSecurityContext securityContext;
        /**
          * WorkflowSpec is the specification of a Workflow.
         **/
        @jakarta.ws.rs.QueryParam("serviceAccountName")
        private String serviceAccountName;
        /**
          * WorkflowSpec is the specification of a Workflow.
         **/
        @jakarta.ws.rs.QueryParam("shutdown")
        private String shutdown;
        /**
          * WorkflowSpec is the specification of a Workflow.
         **/
        @jakarta.ws.rs.QueryParam("suspend")
        private Boolean suspend;
        /**
          * WorkflowSpec is the specification of a Workflow.
         **/
        @jakarta.ws.rs.QueryParam("synchronization")
        private Synchronization synchronization;
        /**
          * WorkflowSpec is the specification of a Workflow.
         **/
        @jakarta.ws.rs.QueryParam("templateDefaults")
        private Template templateDefaults;
        /**
          * WorkflowSpec is the specification of a Workflow.
         **/
        @jakarta.ws.rs.QueryParam("templates")
        private List<Template> templates = null;
        /**
          * WorkflowSpec is the specification of a Workflow.
         **/
        @jakarta.ws.rs.QueryParam("tolerations")
        private List<Toleration> tolerations = null;
        /**
          * WorkflowSpec is the specification of a Workflow.
         **/
        @jakarta.ws.rs.QueryParam("ttlStrategy")
        private TTLStrategy ttlStrategy;
        /**
          * WorkflowSpec is the specification of a Workflow.
         **/
        @jakarta.ws.rs.QueryParam("volumeClaimGC")
        private VolumeClaimGC volumeClaimGC;
        /**
          * WorkflowSpec is the specification of a Workflow.
         **/
        @jakarta.ws.rs.QueryParam("volumeClaimTemplates")
        private List<PersistentVolumeClaim> volumeClaimTemplates = null;
        /**
          * WorkflowSpec is the specification of a Workflow.
         **/
        @jakarta.ws.rs.QueryParam("volumes")
        private List<Volume> volumes = null;
        /**
          * WorkflowSpec is the specification of a Workflow.
         **/
        @jakarta.ws.rs.QueryParam("workflowMetadata")
        private WorkflowMetadata workflowMetadata;
        /**
          * WorkflowSpec is the specification of a Workflow.
         **/
        @jakarta.ws.rs.QueryParam("workflowTemplateRef")
        private WorkflowTemplateRef workflowTemplateRef;

        /**
        * Optional duration in seconds relative to the workflow start time which the workflow is allowed to run before the controller terminates the io.argoproj.workflow.v1alpha1. A value of zero is used to terminate a Running workflow
        * @return activeDeadlineSeconds
        **/
        @JsonProperty("activeDeadlineSeconds")
        public Integer getActiveDeadlineSeconds() {
            return activeDeadlineSeconds;
        }

        /**
         * Set activeDeadlineSeconds
         **/
        public void setActiveDeadlineSeconds(Integer activeDeadlineSeconds) {
            this.activeDeadlineSeconds = activeDeadlineSeconds;
        }

        public WorkflowSpecQueryParam activeDeadlineSeconds(Integer activeDeadlineSeconds) {
            this.activeDeadlineSeconds = activeDeadlineSeconds;
            return this;
        }

        /**
        * Get affinity
        * @return affinity
        **/
        @JsonProperty("affinity")
        public Affinity getAffinity() {
            return affinity;
        }

        /**
         * Set affinity
         **/
        public void setAffinity(Affinity affinity) {
            this.affinity = affinity;
        }

        public WorkflowSpecQueryParam affinity(Affinity affinity) {
            this.affinity = affinity;
            return this;
        }

        /**
        * ArchiveLogs indicates if the container logs should be archived
        * @return archiveLogs
        **/
        @JsonProperty("archiveLogs")
        public Boolean getArchiveLogs() {
            return archiveLogs;
        }

        /**
         * Set archiveLogs
         **/
        public void setArchiveLogs(Boolean archiveLogs) {
            this.archiveLogs = archiveLogs;
        }

        public WorkflowSpecQueryParam archiveLogs(Boolean archiveLogs) {
            this.archiveLogs = archiveLogs;
            return this;
        }

        /**
        * Get arguments
        * @return arguments
        **/
        @JsonProperty("arguments")
        public Arguments getArguments() {
            return arguments;
        }

        /**
         * Set arguments
         **/
        public void setArguments(Arguments arguments) {
            this.arguments = arguments;
        }

        public WorkflowSpecQueryParam arguments(Arguments arguments) {
            this.arguments = arguments;
            return this;
        }

        /**
        * Get artifactGC
        * @return artifactGC
        **/
        @JsonProperty("artifactGC")
        public WorkflowLevelArtifactGC getArtifactGC() {
            return artifactGC;
        }

        /**
         * Set artifactGC
         **/
        public void setArtifactGC(WorkflowLevelArtifactGC artifactGC) {
            this.artifactGC = artifactGC;
        }

        public WorkflowSpecQueryParam artifactGC(WorkflowLevelArtifactGC artifactGC) {
            this.artifactGC = artifactGC;
            return this;
        }

        /**
        * Get artifactRepositoryRef
        * @return artifactRepositoryRef
        **/
        @JsonProperty("artifactRepositoryRef")
        public ArtifactRepositoryRef getArtifactRepositoryRef() {
            return artifactRepositoryRef;
        }

        /**
         * Set artifactRepositoryRef
         **/
        public void setArtifactRepositoryRef(ArtifactRepositoryRef artifactRepositoryRef) {
            this.artifactRepositoryRef = artifactRepositoryRef;
        }

        public WorkflowSpecQueryParam artifactRepositoryRef(ArtifactRepositoryRef artifactRepositoryRef) {
            this.artifactRepositoryRef = artifactRepositoryRef;
            return this;
        }

        /**
        * AutomountServiceAccountToken indicates whether a service account token should be automatically mounted in pods. ServiceAccountName of ExecutorConfig must be specified if this value is false.
        * @return automountServiceAccountToken
        **/
        @JsonProperty("automountServiceAccountToken")
        public Boolean getAutomountServiceAccountToken() {
            return automountServiceAccountToken;
        }

        /**
         * Set automountServiceAccountToken
         **/
        public void setAutomountServiceAccountToken(Boolean automountServiceAccountToken) {
            this.automountServiceAccountToken = automountServiceAccountToken;
        }

        public WorkflowSpecQueryParam automountServiceAccountToken(Boolean automountServiceAccountToken) {
            this.automountServiceAccountToken = automountServiceAccountToken;
            return this;
        }

        /**
        * Get dnsConfig
        * @return dnsConfig
        **/
        @JsonProperty("dnsConfig")
        public PodDNSConfig getDnsConfig() {
            return dnsConfig;
        }

        /**
         * Set dnsConfig
         **/
        public void setDnsConfig(PodDNSConfig dnsConfig) {
            this.dnsConfig = dnsConfig;
        }

        public WorkflowSpecQueryParam dnsConfig(PodDNSConfig dnsConfig) {
            this.dnsConfig = dnsConfig;
            return this;
        }

        /**
        * Set DNS policy for workflow pods. Defaults to \"ClusterFirst\". Valid values are 'ClusterFirstWithHostNet', 'ClusterFirst', 'Default' or 'None'. DNS parameters given in DNSConfig will be merged with the policy selected with DNSPolicy. To have DNS options set along with hostNetwork, you have to specify DNS policy explicitly to 'ClusterFirstWithHostNet'.
        * @return dnsPolicy
        **/
        @JsonProperty("dnsPolicy")
        public String getDnsPolicy() {
            return dnsPolicy;
        }

        /**
         * Set dnsPolicy
         **/
        public void setDnsPolicy(String dnsPolicy) {
            this.dnsPolicy = dnsPolicy;
        }

        public WorkflowSpecQueryParam dnsPolicy(String dnsPolicy) {
            this.dnsPolicy = dnsPolicy;
            return this;
        }

        /**
        * Entrypoint is a template reference to the starting point of the io.argoproj.workflow.v1alpha1.
        * @return entrypoint
        **/
        @JsonProperty("entrypoint")
        public String getEntrypoint() {
            return entrypoint;
        }

        /**
         * Set entrypoint
         **/
        public void setEntrypoint(String entrypoint) {
            this.entrypoint = entrypoint;
        }

        public WorkflowSpecQueryParam entrypoint(String entrypoint) {
            this.entrypoint = entrypoint;
            return this;
        }

        /**
        * Get executor
        * @return executor
        **/
        @JsonProperty("executor")
        public ExecutorConfig getExecutor() {
            return executor;
        }

        /**
         * Set executor
         **/
        public void setExecutor(ExecutorConfig executor) {
            this.executor = executor;
        }

        public WorkflowSpecQueryParam executor(ExecutorConfig executor) {
            this.executor = executor;
            return this;
        }

        /**
        * Hooks holds the lifecycle hook which is invoked at lifecycle of step, irrespective of the success, failure, or error status of the primary step
        * @return hooks
        **/
        @JsonProperty("hooks")
        public Map<String, LifecycleHook> getHooks() {
            return hooks;
        }

        /**
         * Set hooks
         **/
        public void setHooks(Map<String, LifecycleHook> hooks) {
            this.hooks = hooks;
        }

        public WorkflowSpecQueryParam hooks(Map<String, LifecycleHook> hooks) {
            this.hooks = hooks;
            return this;
        }
        public WorkflowSpecQueryParam putHooksItem(String key, LifecycleHook hooksItem) {
            this.hooks.put(key, hooksItem);
            return this;
        }

        /**
        * Get hostAliases
        * @return hostAliases
        **/
        @JsonProperty("hostAliases")
        public List<HostAlias> getHostAliases() {
            return hostAliases;
        }

        /**
         * Set hostAliases
         **/
        public void setHostAliases(List<HostAlias> hostAliases) {
            this.hostAliases = hostAliases;
        }

        public WorkflowSpecQueryParam hostAliases(List<HostAlias> hostAliases) {
            this.hostAliases = hostAliases;
            return this;
        }
        public WorkflowSpecQueryParam addHostAliasesItem(HostAlias hostAliasesItem) {
            this.hostAliases.add(hostAliasesItem);
            return this;
        }

        /**
        * Host networking requested for this workflow pod. Default to false.
        * @return hostNetwork
        **/
        @JsonProperty("hostNetwork")
        public Boolean getHostNetwork() {
            return hostNetwork;
        }

        /**
         * Set hostNetwork
         **/
        public void setHostNetwork(Boolean hostNetwork) {
            this.hostNetwork = hostNetwork;
        }

        public WorkflowSpecQueryParam hostNetwork(Boolean hostNetwork) {
            this.hostNetwork = hostNetwork;
            return this;
        }

        /**
        * ImagePullSecrets is a list of references to secrets in the same namespace to use for pulling any images in pods that reference this ServiceAccount. ImagePullSecrets are distinct from Secrets because Secrets can be mounted in the pod, but ImagePullSecrets are only accessed by the kubelet. More info: https://kubernetes.io/docs/concepts/containers/images/#specifying-imagepullsecrets-on-a-pod
        * @return imagePullSecrets
        **/
        @JsonProperty("imagePullSecrets")
        public List<LocalObjectReference> getImagePullSecrets() {
            return imagePullSecrets;
        }

        /**
         * Set imagePullSecrets
         **/
        public void setImagePullSecrets(List<LocalObjectReference> imagePullSecrets) {
            this.imagePullSecrets = imagePullSecrets;
        }

        public WorkflowSpecQueryParam imagePullSecrets(List<LocalObjectReference> imagePullSecrets) {
            this.imagePullSecrets = imagePullSecrets;
            return this;
        }
        public WorkflowSpecQueryParam addImagePullSecretsItem(LocalObjectReference imagePullSecretsItem) {
            this.imagePullSecrets.add(imagePullSecretsItem);
            return this;
        }

        /**
        * Get metrics
        * @return metrics
        **/
        @JsonProperty("metrics")
        public Metrics getMetrics() {
            return metrics;
        }

        /**
         * Set metrics
         **/
        public void setMetrics(Metrics metrics) {
            this.metrics = metrics;
        }

        public WorkflowSpecQueryParam metrics(Metrics metrics) {
            this.metrics = metrics;
            return this;
        }

        /**
        * NodeSelector is a selector which will result in all pods of the workflow to be scheduled on the selected node(s). This is able to be overridden by a nodeSelector specified in the template.
        * @return nodeSelector
        **/
        @JsonProperty("nodeSelector")
        public Map<String, String> getNodeSelector() {
            return nodeSelector;
        }

        /**
         * Set nodeSelector
         **/
        public void setNodeSelector(Map<String, String> nodeSelector) {
            this.nodeSelector = nodeSelector;
        }

        public WorkflowSpecQueryParam nodeSelector(Map<String, String> nodeSelector) {
            this.nodeSelector = nodeSelector;
            return this;
        }
        public WorkflowSpecQueryParam putNodeSelectorItem(String key, String nodeSelectorItem) {
            this.nodeSelector.put(key, nodeSelectorItem);
            return this;
        }

        /**
        * OnExit is a template reference which is invoked at the end of the workflow, irrespective of the success, failure, or error of the primary io.argoproj.workflow.v1alpha1.
        * @return onExit
        **/
        @JsonProperty("onExit")
        public String getOnExit() {
            return onExit;
        }

        /**
         * Set onExit
         **/
        public void setOnExit(String onExit) {
            this.onExit = onExit;
        }

        public WorkflowSpecQueryParam onExit(String onExit) {
            this.onExit = onExit;
            return this;
        }

        /**
        * Parallelism limits the max total parallel pods that can execute at the same time in a workflow
        * @return parallelism
        **/
        @JsonProperty("parallelism")
        public Integer getParallelism() {
            return parallelism;
        }

        /**
         * Set parallelism
         **/
        public void setParallelism(Integer parallelism) {
            this.parallelism = parallelism;
        }

        public WorkflowSpecQueryParam parallelism(Integer parallelism) {
            this.parallelism = parallelism;
            return this;
        }

        /**
        * Get podDisruptionBudget
        * @return podDisruptionBudget
        **/
        @JsonProperty("podDisruptionBudget")
        public PodDisruptionBudgetSpec getPodDisruptionBudget() {
            return podDisruptionBudget;
        }

        /**
         * Set podDisruptionBudget
         **/
        public void setPodDisruptionBudget(PodDisruptionBudgetSpec podDisruptionBudget) {
            this.podDisruptionBudget = podDisruptionBudget;
        }

        public WorkflowSpecQueryParam podDisruptionBudget(PodDisruptionBudgetSpec podDisruptionBudget) {
            this.podDisruptionBudget = podDisruptionBudget;
            return this;
        }

        /**
        * Get podGC
        * @return podGC
        **/
        @JsonProperty("podGC")
        public PodGC getPodGC() {
            return podGC;
        }

        /**
         * Set podGC
         **/
        public void setPodGC(PodGC podGC) {
            this.podGC = podGC;
        }

        public WorkflowSpecQueryParam podGC(PodGC podGC) {
            this.podGC = podGC;
            return this;
        }

        /**
        * Get podMetadata
        * @return podMetadata
        **/
        @JsonProperty("podMetadata")
        public Metadata getPodMetadata() {
            return podMetadata;
        }

        /**
         * Set podMetadata
         **/
        public void setPodMetadata(Metadata podMetadata) {
            this.podMetadata = podMetadata;
        }

        public WorkflowSpecQueryParam podMetadata(Metadata podMetadata) {
            this.podMetadata = podMetadata;
            return this;
        }

        /**
        * Priority to apply to workflow pods. DEPRECATED: Use PodPriorityClassName instead.
        * @return podPriority
        **/
        @JsonProperty("podPriority")
        public Integer getPodPriority() {
            return podPriority;
        }

        /**
         * Set podPriority
         **/
        public void setPodPriority(Integer podPriority) {
            this.podPriority = podPriority;
        }

        public WorkflowSpecQueryParam podPriority(Integer podPriority) {
            this.podPriority = podPriority;
            return this;
        }

        /**
        * PriorityClassName to apply to workflow pods.
        * @return podPriorityClassName
        **/
        @JsonProperty("podPriorityClassName")
        public String getPodPriorityClassName() {
            return podPriorityClassName;
        }

        /**
         * Set podPriorityClassName
         **/
        public void setPodPriorityClassName(String podPriorityClassName) {
            this.podPriorityClassName = podPriorityClassName;
        }

        public WorkflowSpecQueryParam podPriorityClassName(String podPriorityClassName) {
            this.podPriorityClassName = podPriorityClassName;
            return this;
        }

        /**
        * PodSpecPatch holds strategic merge patch to apply against the pod spec. Allows parameterization of container fields which are not strings (e.g. resource limits).
        * @return podSpecPatch
        **/
        @JsonProperty("podSpecPatch")
        public String getPodSpecPatch() {
            return podSpecPatch;
        }

        /**
         * Set podSpecPatch
         **/
        public void setPodSpecPatch(String podSpecPatch) {
            this.podSpecPatch = podSpecPatch;
        }

        public WorkflowSpecQueryParam podSpecPatch(String podSpecPatch) {
            this.podSpecPatch = podSpecPatch;
            return this;
        }

        /**
        * Priority is used if controller is configured to process limited number of workflows in parallel. Workflows with higher priority are processed first.
        * @return priority
        **/
        @JsonProperty("priority")
        public Integer getPriority() {
            return priority;
        }

        /**
         * Set priority
         **/
        public void setPriority(Integer priority) {
            this.priority = priority;
        }

        public WorkflowSpecQueryParam priority(Integer priority) {
            this.priority = priority;
            return this;
        }

        /**
        * Get retryStrategy
        * @return retryStrategy
        **/
        @JsonProperty("retryStrategy")
        public RetryStrategy getRetryStrategy() {
            return retryStrategy;
        }

        /**
         * Set retryStrategy
         **/
        public void setRetryStrategy(RetryStrategy retryStrategy) {
            this.retryStrategy = retryStrategy;
        }

        public WorkflowSpecQueryParam retryStrategy(RetryStrategy retryStrategy) {
            this.retryStrategy = retryStrategy;
            return this;
        }

        /**
        * Set scheduler name for all pods. Will be overridden if container/script template's scheduler name is set. Default scheduler will be used if neither specified.
        * @return schedulerName
        **/
        @JsonProperty("schedulerName")
        public String getSchedulerName() {
            return schedulerName;
        }

        /**
         * Set schedulerName
         **/
        public void setSchedulerName(String schedulerName) {
            this.schedulerName = schedulerName;
        }

        public WorkflowSpecQueryParam schedulerName(String schedulerName) {
            this.schedulerName = schedulerName;
            return this;
        }

        /**
        * Get securityContext
        * @return securityContext
        **/
        @JsonProperty("securityContext")
        public PodSecurityContext getSecurityContext() {
            return securityContext;
        }

        /**
         * Set securityContext
         **/
        public void setSecurityContext(PodSecurityContext securityContext) {
            this.securityContext = securityContext;
        }

        public WorkflowSpecQueryParam securityContext(PodSecurityContext securityContext) {
            this.securityContext = securityContext;
            return this;
        }

        /**
        * ServiceAccountName is the name of the ServiceAccount to run all pods of the workflow as.
        * @return serviceAccountName
        **/
        @JsonProperty("serviceAccountName")
        public String getServiceAccountName() {
            return serviceAccountName;
        }

        /**
         * Set serviceAccountName
         **/
        public void setServiceAccountName(String serviceAccountName) {
            this.serviceAccountName = serviceAccountName;
        }

        public WorkflowSpecQueryParam serviceAccountName(String serviceAccountName) {
            this.serviceAccountName = serviceAccountName;
            return this;
        }

        /**
        * Shutdown will shutdown the workflow according to its ShutdownStrategy
        * @return shutdown
        **/
        @JsonProperty("shutdown")
        public String getShutdown() {
            return shutdown;
        }

        /**
         * Set shutdown
         **/
        public void setShutdown(String shutdown) {
            this.shutdown = shutdown;
        }

        public WorkflowSpecQueryParam shutdown(String shutdown) {
            this.shutdown = shutdown;
            return this;
        }

        /**
        * Suspend will suspend the workflow and prevent execution of any future steps in the workflow
        * @return suspend
        **/
        @JsonProperty("suspend")
        public Boolean getSuspend() {
            return suspend;
        }

        /**
         * Set suspend
         **/
        public void setSuspend(Boolean suspend) {
            this.suspend = suspend;
        }

        public WorkflowSpecQueryParam suspend(Boolean suspend) {
            this.suspend = suspend;
            return this;
        }

        /**
        * Get synchronization
        * @return synchronization
        **/
        @JsonProperty("synchronization")
        public Synchronization getSynchronization() {
            return synchronization;
        }

        /**
         * Set synchronization
         **/
        public void setSynchronization(Synchronization synchronization) {
            this.synchronization = synchronization;
        }

        public WorkflowSpecQueryParam synchronization(Synchronization synchronization) {
            this.synchronization = synchronization;
            return this;
        }

        /**
        * Get templateDefaults
        * @return templateDefaults
        **/
        @JsonProperty("templateDefaults")
        public Template getTemplateDefaults() {
            return templateDefaults;
        }

        /**
         * Set templateDefaults
         **/
        public void setTemplateDefaults(Template templateDefaults) {
            this.templateDefaults = templateDefaults;
        }

        public WorkflowSpecQueryParam templateDefaults(Template templateDefaults) {
            this.templateDefaults = templateDefaults;
            return this;
        }

        /**
        * Templates is a list of workflow templates used in a workflow
        * @return templates
        **/
        @JsonProperty("templates")
        public List<Template> getTemplates() {
            return templates;
        }

        /**
         * Set templates
         **/
        public void setTemplates(List<Template> templates) {
            this.templates = templates;
        }

        public WorkflowSpecQueryParam templates(List<Template> templates) {
            this.templates = templates;
            return this;
        }
        public WorkflowSpecQueryParam addTemplatesItem(Template templatesItem) {
            this.templates.add(templatesItem);
            return this;
        }

        /**
        * Tolerations to apply to workflow pods.
        * @return tolerations
        **/
        @JsonProperty("tolerations")
        public List<Toleration> getTolerations() {
            return tolerations;
        }

        /**
         * Set tolerations
         **/
        public void setTolerations(List<Toleration> tolerations) {
            this.tolerations = tolerations;
        }

        public WorkflowSpecQueryParam tolerations(List<Toleration> tolerations) {
            this.tolerations = tolerations;
            return this;
        }
        public WorkflowSpecQueryParam addTolerationsItem(Toleration tolerationsItem) {
            this.tolerations.add(tolerationsItem);
            return this;
        }

        /**
        * Get ttlStrategy
        * @return ttlStrategy
        **/
        @JsonProperty("ttlStrategy")
        public TTLStrategy getTtlStrategy() {
            return ttlStrategy;
        }

        /**
         * Set ttlStrategy
         **/
        public void setTtlStrategy(TTLStrategy ttlStrategy) {
            this.ttlStrategy = ttlStrategy;
        }

        public WorkflowSpecQueryParam ttlStrategy(TTLStrategy ttlStrategy) {
            this.ttlStrategy = ttlStrategy;
            return this;
        }

        /**
        * Get volumeClaimGC
        * @return volumeClaimGC
        **/
        @JsonProperty("volumeClaimGC")
        public VolumeClaimGC getVolumeClaimGC() {
            return volumeClaimGC;
        }

        /**
         * Set volumeClaimGC
         **/
        public void setVolumeClaimGC(VolumeClaimGC volumeClaimGC) {
            this.volumeClaimGC = volumeClaimGC;
        }

        public WorkflowSpecQueryParam volumeClaimGC(VolumeClaimGC volumeClaimGC) {
            this.volumeClaimGC = volumeClaimGC;
            return this;
        }

        /**
        * VolumeClaimTemplates is a list of claims that containers are allowed to reference. The Workflow controller will create the claims at the beginning of the workflow and delete the claims upon completion of the workflow
        * @return volumeClaimTemplates
        **/
        @JsonProperty("volumeClaimTemplates")
        public List<PersistentVolumeClaim> getVolumeClaimTemplates() {
            return volumeClaimTemplates;
        }

        /**
         * Set volumeClaimTemplates
         **/
        public void setVolumeClaimTemplates(List<PersistentVolumeClaim> volumeClaimTemplates) {
            this.volumeClaimTemplates = volumeClaimTemplates;
        }

        public WorkflowSpecQueryParam volumeClaimTemplates(List<PersistentVolumeClaim> volumeClaimTemplates) {
            this.volumeClaimTemplates = volumeClaimTemplates;
            return this;
        }
        public WorkflowSpecQueryParam addVolumeClaimTemplatesItem(PersistentVolumeClaim volumeClaimTemplatesItem) {
            this.volumeClaimTemplates.add(volumeClaimTemplatesItem);
            return this;
        }

        /**
        * Volumes is a list of volumes that can be mounted by containers in a io.argoproj.workflow.v1alpha1.
        * @return volumes
        **/
        @JsonProperty("volumes")
        public List<Volume> getVolumes() {
            return volumes;
        }

        /**
         * Set volumes
         **/
        public void setVolumes(List<Volume> volumes) {
            this.volumes = volumes;
        }

        public WorkflowSpecQueryParam volumes(List<Volume> volumes) {
            this.volumes = volumes;
            return this;
        }
        public WorkflowSpecQueryParam addVolumesItem(Volume volumesItem) {
            this.volumes.add(volumesItem);
            return this;
        }

        /**
        * Get workflowMetadata
        * @return workflowMetadata
        **/
        @JsonProperty("workflowMetadata")
        public WorkflowMetadata getWorkflowMetadata() {
            return workflowMetadata;
        }

        /**
         * Set workflowMetadata
         **/
        public void setWorkflowMetadata(WorkflowMetadata workflowMetadata) {
            this.workflowMetadata = workflowMetadata;
        }

        public WorkflowSpecQueryParam workflowMetadata(WorkflowMetadata workflowMetadata) {
            this.workflowMetadata = workflowMetadata;
            return this;
        }

        /**
        * Get workflowTemplateRef
        * @return workflowTemplateRef
        **/
        @JsonProperty("workflowTemplateRef")
        public WorkflowTemplateRef getWorkflowTemplateRef() {
            return workflowTemplateRef;
        }

        /**
         * Set workflowTemplateRef
         **/
        public void setWorkflowTemplateRef(WorkflowTemplateRef workflowTemplateRef) {
            this.workflowTemplateRef = workflowTemplateRef;
        }

        public WorkflowSpecQueryParam workflowTemplateRef(WorkflowTemplateRef workflowTemplateRef) {
            this.workflowTemplateRef = workflowTemplateRef;
            return this;
        }

        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class WorkflowSpecQueryParam {\n");

            sb.append("    activeDeadlineSeconds: ").append(toIndentedString(activeDeadlineSeconds)).append("\n");
            sb.append("    affinity: ").append(toIndentedString(affinity)).append("\n");
            sb.append("    archiveLogs: ").append(toIndentedString(archiveLogs)).append("\n");
            sb.append("    arguments: ").append(toIndentedString(arguments)).append("\n");
            sb.append("    artifactGC: ").append(toIndentedString(artifactGC)).append("\n");
            sb.append("    artifactRepositoryRef: ").append(toIndentedString(artifactRepositoryRef)).append("\n");
            sb.append("    automountServiceAccountToken: ").append(toIndentedString(automountServiceAccountToken)).append("\n");
            sb.append("    dnsConfig: ").append(toIndentedString(dnsConfig)).append("\n");
            sb.append("    dnsPolicy: ").append(toIndentedString(dnsPolicy)).append("\n");
            sb.append("    entrypoint: ").append(toIndentedString(entrypoint)).append("\n");
            sb.append("    executor: ").append(toIndentedString(executor)).append("\n");
            sb.append("    hooks: ").append(toIndentedString(hooks)).append("\n");
            sb.append("    hostAliases: ").append(toIndentedString(hostAliases)).append("\n");
            sb.append("    hostNetwork: ").append(toIndentedString(hostNetwork)).append("\n");
            sb.append("    imagePullSecrets: ").append(toIndentedString(imagePullSecrets)).append("\n");
            sb.append("    metrics: ").append(toIndentedString(metrics)).append("\n");
            sb.append("    nodeSelector: ").append(toIndentedString(nodeSelector)).append("\n");
            sb.append("    onExit: ").append(toIndentedString(onExit)).append("\n");
            sb.append("    parallelism: ").append(toIndentedString(parallelism)).append("\n");
            sb.append("    podDisruptionBudget: ").append(toIndentedString(podDisruptionBudget)).append("\n");
            sb.append("    podGC: ").append(toIndentedString(podGC)).append("\n");
            sb.append("    podMetadata: ").append(toIndentedString(podMetadata)).append("\n");
            sb.append("    podPriority: ").append(toIndentedString(podPriority)).append("\n");
            sb.append("    podPriorityClassName: ").append(toIndentedString(podPriorityClassName)).append("\n");
            sb.append("    podSpecPatch: ").append(toIndentedString(podSpecPatch)).append("\n");
            sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
            sb.append("    retryStrategy: ").append(toIndentedString(retryStrategy)).append("\n");
            sb.append("    schedulerName: ").append(toIndentedString(schedulerName)).append("\n");
            sb.append("    securityContext: ").append(toIndentedString(securityContext)).append("\n");
            sb.append("    serviceAccountName: ").append(toIndentedString(serviceAccountName)).append("\n");
            sb.append("    shutdown: ").append(toIndentedString(shutdown)).append("\n");
            sb.append("    suspend: ").append(toIndentedString(suspend)).append("\n");
            sb.append("    synchronization: ").append(toIndentedString(synchronization)).append("\n");
            sb.append("    templateDefaults: ").append(toIndentedString(templateDefaults)).append("\n");
            sb.append("    templates: ").append(toIndentedString(templates)).append("\n");
            sb.append("    tolerations: ").append(toIndentedString(tolerations)).append("\n");
            sb.append("    ttlStrategy: ").append(toIndentedString(ttlStrategy)).append("\n");
            sb.append("    volumeClaimGC: ").append(toIndentedString(volumeClaimGC)).append("\n");
            sb.append("    volumeClaimTemplates: ").append(toIndentedString(volumeClaimTemplates)).append("\n");
            sb.append("    volumes: ").append(toIndentedString(volumes)).append("\n");
            sb.append("    workflowMetadata: ").append(toIndentedString(workflowMetadata)).append("\n");
            sb.append("    workflowTemplateRef: ").append(toIndentedString(workflowTemplateRef)).append("\n");
            sb.append("}");
            return sb.toString();
        }

        /**
         * Convert the given object to string with each line indented by 4 spaces
         * (except the first line).
         */
        private static String toIndentedString(Object o) {
            if (o == null) {
                return "null";
            }
            return o.toString().replace("\n", "\n    ");
        }
    }
}
