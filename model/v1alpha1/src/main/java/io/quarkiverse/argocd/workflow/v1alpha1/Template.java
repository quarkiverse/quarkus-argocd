package io.quarkiverse.argocd.workflow.v1alpha1;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;

import io.fabric8.kubernetes.api.model.Affinity;
import io.fabric8.kubernetes.api.model.Container;
import io.fabric8.kubernetes.api.model.HostAlias;
import io.fabric8.kubernetes.api.model.PodSecurityContext;
import io.fabric8.kubernetes.api.model.Toleration;
import io.fabric8.kubernetes.api.model.Volume;

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
  * Template is a reusable and composable unit of execution in a workflow
 **/
public class Template  {

    /**
      * Template is a reusable and composable unit of execution in a workflow
     **/
    private String activeDeadlineSeconds;
    /**
      * Template is a reusable and composable unit of execution in a workflow
     **/
    private Affinity affinity;
    /**
      * Template is a reusable and composable unit of execution in a workflow
     **/
    private ArtifactLocation archiveLocation;
    /**
      * Template is a reusable and composable unit of execution in a workflow
     **/
    private Boolean automountServiceAccountToken;
    /**
      * Template is a reusable and composable unit of execution in a workflow
     **/
    private Container container;
    /**
      * Template is a reusable and composable unit of execution in a workflow
     **/
    private ContainerSetTemplate containerSet;
    /**
      * Template is a reusable and composable unit of execution in a workflow
     **/
    private Boolean daemon;
    /**
      * Template is a reusable and composable unit of execution in a workflow
     **/
    private DAGTemplate dag;
    /**
      * Template is a reusable and composable unit of execution in a workflow
     **/
    private Data data;
    /**
      * Template is a reusable and composable unit of execution in a workflow
     **/
    private ExecutorConfig executor;
    /**
      * Template is a reusable and composable unit of execution in a workflow
     **/
    private Boolean failFast;
    /**
      * Template is a reusable and composable unit of execution in a workflow
     **/
    private List<HostAlias> hostAliases;
    /**
      * Template is a reusable and composable unit of execution in a workflow
     **/
    private HTTP http;
    /**
      * Template is a reusable and composable unit of execution in a workflow
     **/
    private List<UserContainer> initContainers;
    /**
      * Template is a reusable and composable unit of execution in a workflow
     **/
    private Inputs inputs;
    /**
      * Template is a reusable and composable unit of execution in a workflow
     **/
    private Memoize memoize;
    /**
      * Template is a reusable and composable unit of execution in a workflow
     **/
    private Metadata metadata;
    /**
      * Template is a reusable and composable unit of execution in a workflow
     **/
    private Metrics metrics;
    /**
      * Template is a reusable and composable unit of execution in a workflow
     **/
    private String name;
    /**
      * Template is a reusable and composable unit of execution in a workflow
     **/
    private Map<String, String> nodeSelector;
    /**
      * Template is a reusable and composable unit of execution in a workflow
     **/
    private Outputs outputs;
    /**
      * Template is a reusable and composable unit of execution in a workflow
     **/
    private Integer parallelism;
    /**
      * Template is a reusable and composable unit of execution in a workflow
     **/
    private Object plugin;
    /**
      * Template is a reusable and composable unit of execution in a workflow
     **/
    private String podSpecPatch;
    /**
      * Template is a reusable and composable unit of execution in a workflow
     **/
    private Integer priority;
    /**
      * Template is a reusable and composable unit of execution in a workflow
     **/
    private String priorityClassName;
    /**
      * Template is a reusable and composable unit of execution in a workflow
     **/
    private ResourceTemplate resource;
    /**
      * Template is a reusable and composable unit of execution in a workflow
     **/
    private RetryStrategy retryStrategy;
    /**
      * Template is a reusable and composable unit of execution in a workflow
     **/
    private String schedulerName;
    /**
      * Template is a reusable and composable unit of execution in a workflow
     **/
    private ScriptTemplate script;
    /**
      * Template is a reusable and composable unit of execution in a workflow
     **/
    private PodSecurityContext securityContext;
    /**
      * Template is a reusable and composable unit of execution in a workflow
     **/
    private String serviceAccountName;
    /**
      * Template is a reusable and composable unit of execution in a workflow
     **/
    private List<UserContainer> sidecars;
    /**
      * Template is a reusable and composable unit of execution in a workflow
     **/
    private List<List<WorkflowStep>> steps;
    /**
      * Template is a reusable and composable unit of execution in a workflow
     **/
    private SuspendTemplate suspend;
    /**
      * Template is a reusable and composable unit of execution in a workflow
     **/
    private Synchronization synchronization;
    /**
      * Template is a reusable and composable unit of execution in a workflow
     **/
    private String timeout;
    /**
      * Template is a reusable and composable unit of execution in a workflow
     **/
    private List<Toleration> tolerations;
    /**
      * Template is a reusable and composable unit of execution in a workflow
     **/
    private List<Volume> volumes;

    /**
    * Get activeDeadlineSeconds
    * @return activeDeadlineSeconds
    **/
    @JsonProperty("activeDeadlineSeconds")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public String getActiveDeadlineSeconds() {
        return activeDeadlineSeconds;
    }

    /**
     * Set activeDeadlineSeconds
     **/
    public void setActiveDeadlineSeconds(String activeDeadlineSeconds) {
        this.activeDeadlineSeconds = activeDeadlineSeconds;
    }

    public Template activeDeadlineSeconds(String activeDeadlineSeconds) {
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

    public Template affinity(Affinity affinity) {
        this.affinity = affinity;
        return this;
    }

    /**
    * Get archiveLocation
    * @return archiveLocation
    **/
    @JsonProperty("archiveLocation")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public ArtifactLocation getArchiveLocation() {
        return archiveLocation;
    }

    /**
     * Set archiveLocation
     **/
    public void setArchiveLocation(ArtifactLocation archiveLocation) {
        this.archiveLocation = archiveLocation;
    }

    public Template archiveLocation(ArtifactLocation archiveLocation) {
        this.archiveLocation = archiveLocation;
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

    public Template automountServiceAccountToken(Boolean automountServiceAccountToken) {
        this.automountServiceAccountToken = automountServiceAccountToken;
        return this;
    }

    /**
    * Get container
    * @return container
    **/
    @JsonProperty("container")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public Container getContainer() {
        return container;
    }

    /**
     * Set container
     **/
    public void setContainer(Container container) {
        this.container = container;
    }

    public Template container(Container container) {
        this.container = container;
        return this;
    }

    /**
    * Get containerSet
    * @return containerSet
    **/
    @JsonProperty("containerSet")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public ContainerSetTemplate getContainerSet() {
        return containerSet;
    }

    /**
     * Set containerSet
     **/
    public void setContainerSet(ContainerSetTemplate containerSet) {
        this.containerSet = containerSet;
    }

    public Template containerSet(ContainerSetTemplate containerSet) {
        this.containerSet = containerSet;
        return this;
    }

    /**
    * Daemon will allow a workflow to proceed to the next step so long as the container reaches readiness
    * @return daemon
    **/
    @JsonProperty("daemon")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public Boolean getDaemon() {
        return daemon;
    }

    /**
     * Set daemon
     **/
    public void setDaemon(Boolean daemon) {
        this.daemon = daemon;
    }

    public Template daemon(Boolean daemon) {
        this.daemon = daemon;
        return this;
    }

    /**
    * Get dag
    * @return dag
    **/
    @JsonProperty("dag")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public DAGTemplate getDag() {
        return dag;
    }

    /**
     * Set dag
     **/
    public void setDag(DAGTemplate dag) {
        this.dag = dag;
    }

    public Template dag(DAGTemplate dag) {
        this.dag = dag;
        return this;
    }

    /**
    * Get data
    * @return data
    **/
    @JsonProperty("data")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public Data getData() {
        return data;
    }

    /**
     * Set data
     **/
    public void setData(Data data) {
        this.data = data;
    }

    public Template data(Data data) {
        this.data = data;
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

    public Template executor(ExecutorConfig executor) {
        this.executor = executor;
        return this;
    }

    /**
    * FailFast, if specified, will fail this template if any of its child pods has failed. This is useful for when this template is expanded with `withItems`, etc.
    * @return failFast
    **/
    @JsonProperty("failFast")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public Boolean getFailFast() {
        return failFast;
    }

    /**
     * Set failFast
     **/
    public void setFailFast(Boolean failFast) {
        this.failFast = failFast;
    }

    public Template failFast(Boolean failFast) {
        this.failFast = failFast;
        return this;
    }

    /**
    * HostAliases is an optional list of hosts and IPs that will be injected into the pod spec
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

    public Template hostAliases(List<HostAlias> hostAliases) {
        this.hostAliases = hostAliases;
        return this;
    }
    public Template addHostAliasesItem(HostAlias hostAliasesItem) {
        if (this.hostAliases == null){
            hostAliases = new ArrayList<>();
        }
        this.hostAliases.add(hostAliasesItem);
        return this;
    }

    /**
    * Get http
    * @return http
    **/
    @JsonProperty("http")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public HTTP getHttp() {
        return http;
    }

    /**
     * Set http
     **/
    public void setHttp(HTTP http) {
        this.http = http;
    }

    public Template http(HTTP http) {
        this.http = http;
        return this;
    }

    /**
    * InitContainers is a list of containers which run before the main container.
    * @return initContainers
    **/
    @JsonProperty("initContainers")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public List<UserContainer> getInitContainers() {
        return initContainers;
    }

    /**
     * Set initContainers
     **/
    public void setInitContainers(List<UserContainer> initContainers) {
        this.initContainers = initContainers;
    }

    public Template initContainers(List<UserContainer> initContainers) {
        this.initContainers = initContainers;
        return this;
    }
    public Template addInitContainersItem(UserContainer initContainersItem) {
        if (this.initContainers == null){
            initContainers = new ArrayList<>();
        }
        this.initContainers.add(initContainersItem);
        return this;
    }

    /**
    * Get inputs
    * @return inputs
    **/
    @JsonProperty("inputs")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public Inputs getInputs() {
        return inputs;
    }

    /**
     * Set inputs
     **/
    public void setInputs(Inputs inputs) {
        this.inputs = inputs;
    }

    public Template inputs(Inputs inputs) {
        this.inputs = inputs;
        return this;
    }

    /**
    * Get memoize
    * @return memoize
    **/
    @JsonProperty("memoize")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public Memoize getMemoize() {
        return memoize;
    }

    /**
     * Set memoize
     **/
    public void setMemoize(Memoize memoize) {
        this.memoize = memoize;
    }

    public Template memoize(Memoize memoize) {
        this.memoize = memoize;
        return this;
    }

    /**
    * Get metadata
    * @return metadata
    **/
    @JsonProperty("metadata")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public Metadata getMetadata() {
        return metadata;
    }

    /**
     * Set metadata
     **/
    public void setMetadata(Metadata metadata) {
        this.metadata = metadata;
    }

    public Template metadata(Metadata metadata) {
        this.metadata = metadata;
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

    public Template metrics(Metrics metrics) {
        this.metrics = metrics;
        return this;
    }

    /**
    * Name is the name of the template
    * @return name
    **/
    @JsonProperty("name")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public String getName() {
        return name;
    }

    /**
     * Set name
     **/
    public void setName(String name) {
        this.name = name;
    }

    public Template name(String name) {
        this.name = name;
        return this;
    }

    /**
    * NodeSelector is a selector to schedule this step of the workflow to be run on the selected node(s). Overrides the selector set at the workflow level.
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

    public Template nodeSelector(Map<String, String> nodeSelector) {
        this.nodeSelector = nodeSelector;
        return this;
    }
    public Template putNodeSelectorItem(String key, String nodeSelectorItem) {
           if (this.nodeSelector == null){
                nodeSelector = new HashMap<>();
            }
        this.nodeSelector.put(key, nodeSelectorItem);
        return this;
    }

    /**
    * Get outputs
    * @return outputs
    **/
    @JsonProperty("outputs")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public Outputs getOutputs() {
        return outputs;
    }

    /**
     * Set outputs
     **/
    public void setOutputs(Outputs outputs) {
        this.outputs = outputs;
    }

    public Template outputs(Outputs outputs) {
        this.outputs = outputs;
        return this;
    }

    /**
    * Parallelism limits the max total parallel pods that can execute at the same time within the boundaries of this template invocation. If additional steps/dag templates are invoked, the pods created by those templates will not be counted towards this total.
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

    public Template parallelism(Integer parallelism) {
        this.parallelism = parallelism;
        return this;
    }

    /**
    * Plugin is an Object with exactly one key
    * @return plugin
    **/
    @JsonProperty("plugin")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public Object getPlugin() {
        return plugin;
    }

    /**
     * Set plugin
     **/
    public void setPlugin(Object plugin) {
        this.plugin = plugin;
    }

    public Template plugin(Object plugin) {
        this.plugin = plugin;
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

    public Template podSpecPatch(String podSpecPatch) {
        this.podSpecPatch = podSpecPatch;
        return this;
    }

    /**
    * Priority to apply to workflow pods.
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

    public Template priority(Integer priority) {
        this.priority = priority;
        return this;
    }

    /**
    * PriorityClassName to apply to workflow pods.
    * @return priorityClassName
    **/
    @JsonProperty("priorityClassName")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public String getPriorityClassName() {
        return priorityClassName;
    }

    /**
     * Set priorityClassName
     **/
    public void setPriorityClassName(String priorityClassName) {
        this.priorityClassName = priorityClassName;
    }

    public Template priorityClassName(String priorityClassName) {
        this.priorityClassName = priorityClassName;
        return this;
    }

    /**
    * Get resource
    * @return resource
    **/
    @JsonProperty("resource")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public ResourceTemplate getResource() {
        return resource;
    }

    /**
     * Set resource
     **/
    public void setResource(ResourceTemplate resource) {
        this.resource = resource;
    }

    public Template resource(ResourceTemplate resource) {
        this.resource = resource;
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

    public Template retryStrategy(RetryStrategy retryStrategy) {
        this.retryStrategy = retryStrategy;
        return this;
    }

    /**
    * If specified, the pod will be dispatched by specified scheduler. Or it will be dispatched by workflow scope scheduler if specified. If neither specified, the pod will be dispatched by default scheduler.
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

    public Template schedulerName(String schedulerName) {
        this.schedulerName = schedulerName;
        return this;
    }

    /**
    * Get script
    * @return script
    **/
    @JsonProperty("script")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public ScriptTemplate getScript() {
        return script;
    }

    /**
     * Set script
     **/
    public void setScript(ScriptTemplate script) {
        this.script = script;
    }

    public Template script(ScriptTemplate script) {
        this.script = script;
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

    public Template securityContext(PodSecurityContext securityContext) {
        this.securityContext = securityContext;
        return this;
    }

    /**
    * ServiceAccountName to apply to workflow pods
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

    public Template serviceAccountName(String serviceAccountName) {
        this.serviceAccountName = serviceAccountName;
        return this;
    }

    /**
    * Sidecars is a list of containers which run alongside the main container Sidecars are automatically killed when the main container completes
    * @return sidecars
    **/
    @JsonProperty("sidecars")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public List<UserContainer> getSidecars() {
        return sidecars;
    }

    /**
     * Set sidecars
     **/
    public void setSidecars(List<UserContainer> sidecars) {
        this.sidecars = sidecars;
    }

    public Template sidecars(List<UserContainer> sidecars) {
        this.sidecars = sidecars;
        return this;
    }
    public Template addSidecarsItem(UserContainer sidecarsItem) {
        if (this.sidecars == null){
            sidecars = new ArrayList<>();
        }
        this.sidecars.add(sidecarsItem);
        return this;
    }

    /**
    * Steps define a series of sequential/parallel workflow steps
    * @return steps
    **/
    @JsonProperty("steps")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public List<List<WorkflowStep>> getSteps() {
        return steps;
    }

    /**
     * Set steps
     **/
    public void setSteps(List<List<WorkflowStep>> steps) {
        this.steps = steps;
    }

    public Template steps(List<List<WorkflowStep>> steps) {
        this.steps = steps;
        return this;
    }
    public Template addStepsItem(List<WorkflowStep> stepsItem) {
        if (this.steps == null){
            steps = new ArrayList<>();
        }
        this.steps.add(stepsItem);
        return this;
    }

    /**
    * Get suspend
    * @return suspend
    **/
    @JsonProperty("suspend")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public SuspendTemplate getSuspend() {
        return suspend;
    }

    /**
     * Set suspend
     **/
    public void setSuspend(SuspendTemplate suspend) {
        this.suspend = suspend;
    }

    public Template suspend(SuspendTemplate suspend) {
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

    public Template synchronization(Synchronization synchronization) {
        this.synchronization = synchronization;
        return this;
    }

    /**
    * Timeout allows to set the total node execution timeout duration counting from the node's start time. This duration also includes time in which the node spends in Pending state. This duration may not be applied to Step or DAG templates.
    * @return timeout
    **/
    @JsonProperty("timeout")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public String getTimeout() {
        return timeout;
    }

    /**
     * Set timeout
     **/
    public void setTimeout(String timeout) {
        this.timeout = timeout;
    }

    public Template timeout(String timeout) {
        this.timeout = timeout;
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

    public Template tolerations(List<Toleration> tolerations) {
        this.tolerations = tolerations;
        return this;
    }
    public Template addTolerationsItem(Toleration tolerationsItem) {
        if (this.tolerations == null){
            tolerations = new ArrayList<>();
        }
        this.tolerations.add(tolerationsItem);
        return this;
    }

    /**
    * Volumes is a list of volumes that can be mounted by containers in a template.
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

    public Template volumes(List<Volume> volumes) {
        this.volumes = volumes;
        return this;
    }
    public Template addVolumesItem(Volume volumesItem) {
        if (this.volumes == null){
            volumes = new ArrayList<>();
        }
        this.volumes.add(volumesItem);
        return this;
    }

    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Template {\n");

        sb.append("    activeDeadlineSeconds: ").append(toIndentedString(activeDeadlineSeconds)).append("\n");
        sb.append("    affinity: ").append(toIndentedString(affinity)).append("\n");
        sb.append("    archiveLocation: ").append(toIndentedString(archiveLocation)).append("\n");
        sb.append("    automountServiceAccountToken: ").append(toIndentedString(automountServiceAccountToken)).append("\n");
        sb.append("    container: ").append(toIndentedString(container)).append("\n");
        sb.append("    containerSet: ").append(toIndentedString(containerSet)).append("\n");
        sb.append("    daemon: ").append(toIndentedString(daemon)).append("\n");
        sb.append("    dag: ").append(toIndentedString(dag)).append("\n");
        sb.append("    data: ").append(toIndentedString(data)).append("\n");
        sb.append("    executor: ").append(toIndentedString(executor)).append("\n");
        sb.append("    failFast: ").append(toIndentedString(failFast)).append("\n");
        sb.append("    hostAliases: ").append(toIndentedString(hostAliases)).append("\n");
        sb.append("    http: ").append(toIndentedString(http)).append("\n");
        sb.append("    initContainers: ").append(toIndentedString(initContainers)).append("\n");
        sb.append("    inputs: ").append(toIndentedString(inputs)).append("\n");
        sb.append("    memoize: ").append(toIndentedString(memoize)).append("\n");
        sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
        sb.append("    metrics: ").append(toIndentedString(metrics)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    nodeSelector: ").append(toIndentedString(nodeSelector)).append("\n");
        sb.append("    outputs: ").append(toIndentedString(outputs)).append("\n");
        sb.append("    parallelism: ").append(toIndentedString(parallelism)).append("\n");
        sb.append("    plugin: ").append(toIndentedString(plugin)).append("\n");
        sb.append("    podSpecPatch: ").append(toIndentedString(podSpecPatch)).append("\n");
        sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
        sb.append("    priorityClassName: ").append(toIndentedString(priorityClassName)).append("\n");
        sb.append("    resource: ").append(toIndentedString(resource)).append("\n");
        sb.append("    retryStrategy: ").append(toIndentedString(retryStrategy)).append("\n");
        sb.append("    schedulerName: ").append(toIndentedString(schedulerName)).append("\n");
        sb.append("    script: ").append(toIndentedString(script)).append("\n");
        sb.append("    securityContext: ").append(toIndentedString(securityContext)).append("\n");
        sb.append("    serviceAccountName: ").append(toIndentedString(serviceAccountName)).append("\n");
        sb.append("    sidecars: ").append(toIndentedString(sidecars)).append("\n");
        sb.append("    steps: ").append(toIndentedString(steps)).append("\n");
        sb.append("    suspend: ").append(toIndentedString(suspend)).append("\n");
        sb.append("    synchronization: ").append(toIndentedString(synchronization)).append("\n");
        sb.append("    timeout: ").append(toIndentedString(timeout)).append("\n");
        sb.append("    tolerations: ").append(toIndentedString(tolerations)).append("\n");
        sb.append("    volumes: ").append(toIndentedString(volumes)).append("\n");
        
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
      * Template is a reusable and composable unit of execution in a workflow
     **/
    public static class TemplateQueryParam  {

        /**
          * Template is a reusable and composable unit of execution in a workflow
         **/
        @jakarta.ws.rs.QueryParam("activeDeadlineSeconds")
        private String activeDeadlineSeconds;
        /**
          * Template is a reusable and composable unit of execution in a workflow
         **/
        @jakarta.ws.rs.QueryParam("affinity")
        private Affinity affinity;
        /**
          * Template is a reusable and composable unit of execution in a workflow
         **/
        @jakarta.ws.rs.QueryParam("archiveLocation")
        private ArtifactLocation archiveLocation;
        /**
          * Template is a reusable and composable unit of execution in a workflow
         **/
        @jakarta.ws.rs.QueryParam("automountServiceAccountToken")
        private Boolean automountServiceAccountToken;
        /**
          * Template is a reusable and composable unit of execution in a workflow
         **/
        @jakarta.ws.rs.QueryParam("container")
        private Container container;
        /**
          * Template is a reusable and composable unit of execution in a workflow
         **/
        @jakarta.ws.rs.QueryParam("containerSet")
        private ContainerSetTemplate containerSet;
        /**
          * Template is a reusable and composable unit of execution in a workflow
         **/
        @jakarta.ws.rs.QueryParam("daemon")
        private Boolean daemon;
        /**
          * Template is a reusable and composable unit of execution in a workflow
         **/
        @jakarta.ws.rs.QueryParam("dag")
        private DAGTemplate dag;
        /**
          * Template is a reusable and composable unit of execution in a workflow
         **/
        @jakarta.ws.rs.QueryParam("data")
        private Data data;
        /**
          * Template is a reusable and composable unit of execution in a workflow
         **/
        @jakarta.ws.rs.QueryParam("executor")
        private ExecutorConfig executor;
        /**
          * Template is a reusable and composable unit of execution in a workflow
         **/
        @jakarta.ws.rs.QueryParam("failFast")
        private Boolean failFast;
        /**
          * Template is a reusable and composable unit of execution in a workflow
         **/
        @jakarta.ws.rs.QueryParam("hostAliases")
        private List<HostAlias> hostAliases = null;
        /**
          * Template is a reusable and composable unit of execution in a workflow
         **/
        @jakarta.ws.rs.QueryParam("http")
        private HTTP http;
        /**
          * Template is a reusable and composable unit of execution in a workflow
         **/
        @jakarta.ws.rs.QueryParam("initContainers")
        private List<UserContainer> initContainers = null;
        /**
          * Template is a reusable and composable unit of execution in a workflow
         **/
        @jakarta.ws.rs.QueryParam("inputs")
        private Inputs inputs;
        /**
          * Template is a reusable and composable unit of execution in a workflow
         **/
        @jakarta.ws.rs.QueryParam("memoize")
        private Memoize memoize;
        /**
          * Template is a reusable and composable unit of execution in a workflow
         **/
        @jakarta.ws.rs.QueryParam("metadata")
        private Metadata metadata;
        /**
          * Template is a reusable and composable unit of execution in a workflow
         **/
        @jakarta.ws.rs.QueryParam("metrics")
        private Metrics metrics;
        /**
          * Template is a reusable and composable unit of execution in a workflow
         **/
        @jakarta.ws.rs.QueryParam("name")
        private String name;
        /**
          * Template is a reusable and composable unit of execution in a workflow
         **/
        @jakarta.ws.rs.QueryParam("nodeSelector")
        private Map<String, String> nodeSelector = null;
        /**
          * Template is a reusable and composable unit of execution in a workflow
         **/
        @jakarta.ws.rs.QueryParam("outputs")
        private Outputs outputs;
        /**
          * Template is a reusable and composable unit of execution in a workflow
         **/
        @jakarta.ws.rs.QueryParam("parallelism")
        private Integer parallelism;
        /**
          * Template is a reusable and composable unit of execution in a workflow
         **/
        @jakarta.ws.rs.QueryParam("plugin")
        private Object plugin;
        /**
          * Template is a reusable and composable unit of execution in a workflow
         **/
        @jakarta.ws.rs.QueryParam("podSpecPatch")
        private String podSpecPatch;
        /**
          * Template is a reusable and composable unit of execution in a workflow
         **/
        @jakarta.ws.rs.QueryParam("priority")
        private Integer priority;
        /**
          * Template is a reusable and composable unit of execution in a workflow
         **/
        @jakarta.ws.rs.QueryParam("priorityClassName")
        private String priorityClassName;
        /**
          * Template is a reusable and composable unit of execution in a workflow
         **/
        @jakarta.ws.rs.QueryParam("resource")
        private ResourceTemplate resource;
        /**
          * Template is a reusable and composable unit of execution in a workflow
         **/
        @jakarta.ws.rs.QueryParam("retryStrategy")
        private RetryStrategy retryStrategy;
        /**
          * Template is a reusable and composable unit of execution in a workflow
         **/
        @jakarta.ws.rs.QueryParam("schedulerName")
        private String schedulerName;
        /**
          * Template is a reusable and composable unit of execution in a workflow
         **/
        @jakarta.ws.rs.QueryParam("script")
        private ScriptTemplate script;
        /**
          * Template is a reusable and composable unit of execution in a workflow
         **/
        @jakarta.ws.rs.QueryParam("securityContext")
        private PodSecurityContext securityContext;
        /**
          * Template is a reusable and composable unit of execution in a workflow
         **/
        @jakarta.ws.rs.QueryParam("serviceAccountName")
        private String serviceAccountName;
        /**
          * Template is a reusable and composable unit of execution in a workflow
         **/
        @jakarta.ws.rs.QueryParam("sidecars")
        private List<UserContainer> sidecars = null;
        /**
          * Template is a reusable and composable unit of execution in a workflow
         **/
        @jakarta.ws.rs.QueryParam("steps")
        private List<List<WorkflowStep>> steps = null;
        /**
          * Template is a reusable and composable unit of execution in a workflow
         **/
        @jakarta.ws.rs.QueryParam("suspend")
        private SuspendTemplate suspend;
        /**
          * Template is a reusable and composable unit of execution in a workflow
         **/
        @jakarta.ws.rs.QueryParam("synchronization")
        private Synchronization synchronization;
        /**
          * Template is a reusable and composable unit of execution in a workflow
         **/
        @jakarta.ws.rs.QueryParam("timeout")
        private String timeout;
        /**
          * Template is a reusable and composable unit of execution in a workflow
         **/
        @jakarta.ws.rs.QueryParam("tolerations")
        private List<Toleration> tolerations = null;
        /**
          * Template is a reusable and composable unit of execution in a workflow
         **/
        @jakarta.ws.rs.QueryParam("volumes")
        private List<Volume> volumes = null;

        /**
        * Get activeDeadlineSeconds
        * @return activeDeadlineSeconds
        **/
        @JsonProperty("activeDeadlineSeconds")
        public String getActiveDeadlineSeconds() {
            return activeDeadlineSeconds;
        }

        /**
         * Set activeDeadlineSeconds
         **/
        public void setActiveDeadlineSeconds(String activeDeadlineSeconds) {
            this.activeDeadlineSeconds = activeDeadlineSeconds;
        }

        public TemplateQueryParam activeDeadlineSeconds(String activeDeadlineSeconds) {
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

        public TemplateQueryParam affinity(Affinity affinity) {
            this.affinity = affinity;
            return this;
        }

        /**
        * Get archiveLocation
        * @return archiveLocation
        **/
        @JsonProperty("archiveLocation")
        public ArtifactLocation getArchiveLocation() {
            return archiveLocation;
        }

        /**
         * Set archiveLocation
         **/
        public void setArchiveLocation(ArtifactLocation archiveLocation) {
            this.archiveLocation = archiveLocation;
        }

        public TemplateQueryParam archiveLocation(ArtifactLocation archiveLocation) {
            this.archiveLocation = archiveLocation;
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

        public TemplateQueryParam automountServiceAccountToken(Boolean automountServiceAccountToken) {
            this.automountServiceAccountToken = automountServiceAccountToken;
            return this;
        }

        /**
        * Get container
        * @return container
        **/
        @JsonProperty("container")
        public Container getContainer() {
            return container;
        }

        /**
         * Set container
         **/
        public void setContainer(Container container) {
            this.container = container;
        }

        public TemplateQueryParam container(Container container) {
            this.container = container;
            return this;
        }

        /**
        * Get containerSet
        * @return containerSet
        **/
        @JsonProperty("containerSet")
        public ContainerSetTemplate getContainerSet() {
            return containerSet;
        }

        /**
         * Set containerSet
         **/
        public void setContainerSet(ContainerSetTemplate containerSet) {
            this.containerSet = containerSet;
        }

        public TemplateQueryParam containerSet(ContainerSetTemplate containerSet) {
            this.containerSet = containerSet;
            return this;
        }

        /**
        * Daemon will allow a workflow to proceed to the next step so long as the container reaches readiness
        * @return daemon
        **/
        @JsonProperty("daemon")
        public Boolean getDaemon() {
            return daemon;
        }

        /**
         * Set daemon
         **/
        public void setDaemon(Boolean daemon) {
            this.daemon = daemon;
        }

        public TemplateQueryParam daemon(Boolean daemon) {
            this.daemon = daemon;
            return this;
        }

        /**
        * Get dag
        * @return dag
        **/
        @JsonProperty("dag")
        public DAGTemplate getDag() {
            return dag;
        }

        /**
         * Set dag
         **/
        public void setDag(DAGTemplate dag) {
            this.dag = dag;
        }

        public TemplateQueryParam dag(DAGTemplate dag) {
            this.dag = dag;
            return this;
        }

        /**
        * Get data
        * @return data
        **/
        @JsonProperty("data")
        public Data getData() {
            return data;
        }

        /**
         * Set data
         **/
        public void setData(Data data) {
            this.data = data;
        }

        public TemplateQueryParam data(Data data) {
            this.data = data;
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

        public TemplateQueryParam executor(ExecutorConfig executor) {
            this.executor = executor;
            return this;
        }

        /**
        * FailFast, if specified, will fail this template if any of its child pods has failed. This is useful for when this template is expanded with `withItems`, etc.
        * @return failFast
        **/
        @JsonProperty("failFast")
        public Boolean getFailFast() {
            return failFast;
        }

        /**
         * Set failFast
         **/
        public void setFailFast(Boolean failFast) {
            this.failFast = failFast;
        }

        public TemplateQueryParam failFast(Boolean failFast) {
            this.failFast = failFast;
            return this;
        }

        /**
        * HostAliases is an optional list of hosts and IPs that will be injected into the pod spec
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

        public TemplateQueryParam hostAliases(List<HostAlias> hostAliases) {
            this.hostAliases = hostAliases;
            return this;
        }
        public TemplateQueryParam addHostAliasesItem(HostAlias hostAliasesItem) {
            this.hostAliases.add(hostAliasesItem);
            return this;
        }

        /**
        * Get http
        * @return http
        **/
        @JsonProperty("http")
        public HTTP getHttp() {
            return http;
        }

        /**
         * Set http
         **/
        public void setHttp(HTTP http) {
            this.http = http;
        }

        public TemplateQueryParam http(HTTP http) {
            this.http = http;
            return this;
        }

        /**
        * InitContainers is a list of containers which run before the main container.
        * @return initContainers
        **/
        @JsonProperty("initContainers")
        public List<UserContainer> getInitContainers() {
            return initContainers;
        }

        /**
         * Set initContainers
         **/
        public void setInitContainers(List<UserContainer> initContainers) {
            this.initContainers = initContainers;
        }

        public TemplateQueryParam initContainers(List<UserContainer> initContainers) {
            this.initContainers = initContainers;
            return this;
        }
        public TemplateQueryParam addInitContainersItem(UserContainer initContainersItem) {
            this.initContainers.add(initContainersItem);
            return this;
        }

        /**
        * Get inputs
        * @return inputs
        **/
        @JsonProperty("inputs")
        public Inputs getInputs() {
            return inputs;
        }

        /**
         * Set inputs
         **/
        public void setInputs(Inputs inputs) {
            this.inputs = inputs;
        }

        public TemplateQueryParam inputs(Inputs inputs) {
            this.inputs = inputs;
            return this;
        }

        /**
        * Get memoize
        * @return memoize
        **/
        @JsonProperty("memoize")
        public Memoize getMemoize() {
            return memoize;
        }

        /**
         * Set memoize
         **/
        public void setMemoize(Memoize memoize) {
            this.memoize = memoize;
        }

        public TemplateQueryParam memoize(Memoize memoize) {
            this.memoize = memoize;
            return this;
        }

        /**
        * Get metadata
        * @return metadata
        **/
        @JsonProperty("metadata")
        public Metadata getMetadata() {
            return metadata;
        }

        /**
         * Set metadata
         **/
        public void setMetadata(Metadata metadata) {
            this.metadata = metadata;
        }

        public TemplateQueryParam metadata(Metadata metadata) {
            this.metadata = metadata;
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

        public TemplateQueryParam metrics(Metrics metrics) {
            this.metrics = metrics;
            return this;
        }

        /**
        * Name is the name of the template
        * @return name
        **/
        @JsonProperty("name")
        public String getName() {
            return name;
        }

        /**
         * Set name
         **/
        public void setName(String name) {
            this.name = name;
        }

        public TemplateQueryParam name(String name) {
            this.name = name;
            return this;
        }

        /**
        * NodeSelector is a selector to schedule this step of the workflow to be run on the selected node(s). Overrides the selector set at the workflow level.
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

        public TemplateQueryParam nodeSelector(Map<String, String> nodeSelector) {
            this.nodeSelector = nodeSelector;
            return this;
        }
        public TemplateQueryParam putNodeSelectorItem(String key, String nodeSelectorItem) {
            this.nodeSelector.put(key, nodeSelectorItem);
            return this;
        }

        /**
        * Get outputs
        * @return outputs
        **/
        @JsonProperty("outputs")
        public Outputs getOutputs() {
            return outputs;
        }

        /**
         * Set outputs
         **/
        public void setOutputs(Outputs outputs) {
            this.outputs = outputs;
        }

        public TemplateQueryParam outputs(Outputs outputs) {
            this.outputs = outputs;
            return this;
        }

        /**
        * Parallelism limits the max total parallel pods that can execute at the same time within the boundaries of this template invocation. If additional steps/dag templates are invoked, the pods created by those templates will not be counted towards this total.
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

        public TemplateQueryParam parallelism(Integer parallelism) {
            this.parallelism = parallelism;
            return this;
        }

        /**
        * Plugin is an Object with exactly one key
        * @return plugin
        **/
        @JsonProperty("plugin")
        public Object getPlugin() {
            return plugin;
        }

        /**
         * Set plugin
         **/
        public void setPlugin(Object plugin) {
            this.plugin = plugin;
        }

        public TemplateQueryParam plugin(Object plugin) {
            this.plugin = plugin;
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

        public TemplateQueryParam podSpecPatch(String podSpecPatch) {
            this.podSpecPatch = podSpecPatch;
            return this;
        }

        /**
        * Priority to apply to workflow pods.
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

        public TemplateQueryParam priority(Integer priority) {
            this.priority = priority;
            return this;
        }

        /**
        * PriorityClassName to apply to workflow pods.
        * @return priorityClassName
        **/
        @JsonProperty("priorityClassName")
        public String getPriorityClassName() {
            return priorityClassName;
        }

        /**
         * Set priorityClassName
         **/
        public void setPriorityClassName(String priorityClassName) {
            this.priorityClassName = priorityClassName;
        }

        public TemplateQueryParam priorityClassName(String priorityClassName) {
            this.priorityClassName = priorityClassName;
            return this;
        }

        /**
        * Get resource
        * @return resource
        **/
        @JsonProperty("resource")
        public ResourceTemplate getResource() {
            return resource;
        }

        /**
         * Set resource
         **/
        public void setResource(ResourceTemplate resource) {
            this.resource = resource;
        }

        public TemplateQueryParam resource(ResourceTemplate resource) {
            this.resource = resource;
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

        public TemplateQueryParam retryStrategy(RetryStrategy retryStrategy) {
            this.retryStrategy = retryStrategy;
            return this;
        }

        /**
        * If specified, the pod will be dispatched by specified scheduler. Or it will be dispatched by workflow scope scheduler if specified. If neither specified, the pod will be dispatched by default scheduler.
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

        public TemplateQueryParam schedulerName(String schedulerName) {
            this.schedulerName = schedulerName;
            return this;
        }

        /**
        * Get script
        * @return script
        **/
        @JsonProperty("script")
        public ScriptTemplate getScript() {
            return script;
        }

        /**
         * Set script
         **/
        public void setScript(ScriptTemplate script) {
            this.script = script;
        }

        public TemplateQueryParam script(ScriptTemplate script) {
            this.script = script;
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

        public TemplateQueryParam securityContext(PodSecurityContext securityContext) {
            this.securityContext = securityContext;
            return this;
        }

        /**
        * ServiceAccountName to apply to workflow pods
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

        public TemplateQueryParam serviceAccountName(String serviceAccountName) {
            this.serviceAccountName = serviceAccountName;
            return this;
        }

        /**
        * Sidecars is a list of containers which run alongside the main container Sidecars are automatically killed when the main container completes
        * @return sidecars
        **/
        @JsonProperty("sidecars")
        public List<UserContainer> getSidecars() {
            return sidecars;
        }

        /**
         * Set sidecars
         **/
        public void setSidecars(List<UserContainer> sidecars) {
            this.sidecars = sidecars;
        }

        public TemplateQueryParam sidecars(List<UserContainer> sidecars) {
            this.sidecars = sidecars;
            return this;
        }
        public TemplateQueryParam addSidecarsItem(UserContainer sidecarsItem) {
            this.sidecars.add(sidecarsItem);
            return this;
        }

        /**
        * Steps define a series of sequential/parallel workflow steps
        * @return steps
        **/
        @JsonProperty("steps")
        public List<List<WorkflowStep>> getSteps() {
            return steps;
        }

        /**
         * Set steps
         **/
        public void setSteps(List<List<WorkflowStep>> steps) {
            this.steps = steps;
        }

        public TemplateQueryParam steps(List<List<WorkflowStep>> steps) {
            this.steps = steps;
            return this;
        }
        public TemplateQueryParam addStepsItem(List<WorkflowStep> stepsItem) {
            this.steps.add(stepsItem);
            return this;
        }

        /**
        * Get suspend
        * @return suspend
        **/
        @JsonProperty("suspend")
        public SuspendTemplate getSuspend() {
            return suspend;
        }

        /**
         * Set suspend
         **/
        public void setSuspend(SuspendTemplate suspend) {
            this.suspend = suspend;
        }

        public TemplateQueryParam suspend(SuspendTemplate suspend) {
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

        public TemplateQueryParam synchronization(Synchronization synchronization) {
            this.synchronization = synchronization;
            return this;
        }

        /**
        * Timeout allows to set the total node execution timeout duration counting from the node's start time. This duration also includes time in which the node spends in Pending state. This duration may not be applied to Step or DAG templates.
        * @return timeout
        **/
        @JsonProperty("timeout")
        public String getTimeout() {
            return timeout;
        }

        /**
         * Set timeout
         **/
        public void setTimeout(String timeout) {
            this.timeout = timeout;
        }

        public TemplateQueryParam timeout(String timeout) {
            this.timeout = timeout;
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

        public TemplateQueryParam tolerations(List<Toleration> tolerations) {
            this.tolerations = tolerations;
            return this;
        }
        public TemplateQueryParam addTolerationsItem(Toleration tolerationsItem) {
            this.tolerations.add(tolerationsItem);
            return this;
        }

        /**
        * Volumes is a list of volumes that can be mounted by containers in a template.
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

        public TemplateQueryParam volumes(List<Volume> volumes) {
            this.volumes = volumes;
            return this;
        }
        public TemplateQueryParam addVolumesItem(Volume volumesItem) {
            this.volumes.add(volumesItem);
            return this;
        }

        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class TemplateQueryParam {\n");

            sb.append("    activeDeadlineSeconds: ").append(toIndentedString(activeDeadlineSeconds)).append("\n");
            sb.append("    affinity: ").append(toIndentedString(affinity)).append("\n");
            sb.append("    archiveLocation: ").append(toIndentedString(archiveLocation)).append("\n");
            sb.append("    automountServiceAccountToken: ").append(toIndentedString(automountServiceAccountToken)).append("\n");
            sb.append("    container: ").append(toIndentedString(container)).append("\n");
            sb.append("    containerSet: ").append(toIndentedString(containerSet)).append("\n");
            sb.append("    daemon: ").append(toIndentedString(daemon)).append("\n");
            sb.append("    dag: ").append(toIndentedString(dag)).append("\n");
            sb.append("    data: ").append(toIndentedString(data)).append("\n");
            sb.append("    executor: ").append(toIndentedString(executor)).append("\n");
            sb.append("    failFast: ").append(toIndentedString(failFast)).append("\n");
            sb.append("    hostAliases: ").append(toIndentedString(hostAliases)).append("\n");
            sb.append("    http: ").append(toIndentedString(http)).append("\n");
            sb.append("    initContainers: ").append(toIndentedString(initContainers)).append("\n");
            sb.append("    inputs: ").append(toIndentedString(inputs)).append("\n");
            sb.append("    memoize: ").append(toIndentedString(memoize)).append("\n");
            sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
            sb.append("    metrics: ").append(toIndentedString(metrics)).append("\n");
            sb.append("    name: ").append(toIndentedString(name)).append("\n");
            sb.append("    nodeSelector: ").append(toIndentedString(nodeSelector)).append("\n");
            sb.append("    outputs: ").append(toIndentedString(outputs)).append("\n");
            sb.append("    parallelism: ").append(toIndentedString(parallelism)).append("\n");
            sb.append("    plugin: ").append(toIndentedString(plugin)).append("\n");
            sb.append("    podSpecPatch: ").append(toIndentedString(podSpecPatch)).append("\n");
            sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
            sb.append("    priorityClassName: ").append(toIndentedString(priorityClassName)).append("\n");
            sb.append("    resource: ").append(toIndentedString(resource)).append("\n");
            sb.append("    retryStrategy: ").append(toIndentedString(retryStrategy)).append("\n");
            sb.append("    schedulerName: ").append(toIndentedString(schedulerName)).append("\n");
            sb.append("    script: ").append(toIndentedString(script)).append("\n");
            sb.append("    securityContext: ").append(toIndentedString(securityContext)).append("\n");
            sb.append("    serviceAccountName: ").append(toIndentedString(serviceAccountName)).append("\n");
            sb.append("    sidecars: ").append(toIndentedString(sidecars)).append("\n");
            sb.append("    steps: ").append(toIndentedString(steps)).append("\n");
            sb.append("    suspend: ").append(toIndentedString(suspend)).append("\n");
            sb.append("    synchronization: ").append(toIndentedString(synchronization)).append("\n");
            sb.append("    timeout: ").append(toIndentedString(timeout)).append("\n");
            sb.append("    tolerations: ").append(toIndentedString(tolerations)).append("\n");
            sb.append("    volumes: ").append(toIndentedString(volumes)).append("\n");
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
