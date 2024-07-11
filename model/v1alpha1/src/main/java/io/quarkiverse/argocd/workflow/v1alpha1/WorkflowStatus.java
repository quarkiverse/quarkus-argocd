package io.quarkiverse.argocd.workflow.v1alpha1;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;

import io.fabric8.kubernetes.api.model.Volume;

import java.time.OffsetDateTime;
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
  * WorkflowStatus contains overall status information about a workflow
 **/
public class WorkflowStatus  {

    /**
      * WorkflowStatus contains overall status information about a workflow
     **/
    private ArtGCStatus artifactGCStatus;
    /**
      * WorkflowStatus contains overall status information about a workflow
     **/
    private ArtifactRepositoryRefStatus artifactRepositoryRef;
    /**
      * WorkflowStatus contains overall status information about a workflow
     **/
    private String compressedNodes;
    /**
      * WorkflowStatus contains overall status information about a workflow
     **/
    private List<Condition> conditions;
    /**
      * WorkflowStatus contains overall status information about a workflow
     **/
    private Integer estimatedDuration;
    /**
      * WorkflowStatus contains overall status information about a workflow
     **/
    private OffsetDateTime finishedAt;
    /**
      * WorkflowStatus contains overall status information about a workflow
     **/
    private String message;
    /**
      * WorkflowStatus contains overall status information about a workflow
     **/
    private Map<String, NodeStatus> nodes;
    /**
      * WorkflowStatus contains overall status information about a workflow
     **/
    private String offloadNodeStatusVersion;
    /**
      * WorkflowStatus contains overall status information about a workflow
     **/
    private Outputs outputs;
    /**
      * WorkflowStatus contains overall status information about a workflow
     **/
    private List<Volume> persistentVolumeClaims;
    /**
      * WorkflowStatus contains overall status information about a workflow
     **/
    private String phase;
    /**
      * WorkflowStatus contains overall status information about a workflow
     **/
    private String progress;
    /**
      * WorkflowStatus contains overall status information about a workflow
     **/
    private Map<String, Long> resourcesDuration;
    /**
      * WorkflowStatus contains overall status information about a workflow
     **/
    private OffsetDateTime startedAt;
    /**
      * WorkflowStatus contains overall status information about a workflow
     **/
    private Map<String, Template> storedTemplates;
    /**
      * WorkflowStatus contains overall status information about a workflow
     **/
    private WorkflowSpec storedWorkflowTemplateSpec;
    /**
      * WorkflowStatus contains overall status information about a workflow
     **/
    private SynchronizationStatus synchronization;
    /**
      * WorkflowStatus contains overall status information about a workflow
     **/
    private Map<String, Boolean> taskResultsCompletionStatus;

    /**
    * Get artifactGCStatus
    * @return artifactGCStatus
    **/
    @JsonProperty("artifactGCStatus")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public ArtGCStatus getArtifactGCStatus() {
        return artifactGCStatus;
    }

    /**
     * Set artifactGCStatus
     **/
    public void setArtifactGCStatus(ArtGCStatus artifactGCStatus) {
        this.artifactGCStatus = artifactGCStatus;
    }

    public WorkflowStatus artifactGCStatus(ArtGCStatus artifactGCStatus) {
        this.artifactGCStatus = artifactGCStatus;
        return this;
    }

    /**
    * Get artifactRepositoryRef
    * @return artifactRepositoryRef
    **/
    @JsonProperty("artifactRepositoryRef")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public ArtifactRepositoryRefStatus getArtifactRepositoryRef() {
        return artifactRepositoryRef;
    }

    /**
     * Set artifactRepositoryRef
     **/
    public void setArtifactRepositoryRef(ArtifactRepositoryRefStatus artifactRepositoryRef) {
        this.artifactRepositoryRef = artifactRepositoryRef;
    }

    public WorkflowStatus artifactRepositoryRef(ArtifactRepositoryRefStatus artifactRepositoryRef) {
        this.artifactRepositoryRef = artifactRepositoryRef;
        return this;
    }

    /**
    * Compressed and base64 decoded Nodes map
    * @return compressedNodes
    **/
    @JsonProperty("compressedNodes")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public String getCompressedNodes() {
        return compressedNodes;
    }

    /**
     * Set compressedNodes
     **/
    public void setCompressedNodes(String compressedNodes) {
        this.compressedNodes = compressedNodes;
    }

    public WorkflowStatus compressedNodes(String compressedNodes) {
        this.compressedNodes = compressedNodes;
        return this;
    }

    /**
    * Conditions is a list of conditions the Workflow may have
    * @return conditions
    **/
    @JsonProperty("conditions")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public List<Condition> getConditions() {
        return conditions;
    }

    /**
     * Set conditions
     **/
    public void setConditions(List<Condition> conditions) {
        this.conditions = conditions;
    }

    public WorkflowStatus conditions(List<Condition> conditions) {
        this.conditions = conditions;
        return this;
    }
    public WorkflowStatus addConditionsItem(Condition conditionsItem) {
        if (this.conditions == null){
            conditions = new ArrayList<>();
        }
        this.conditions.add(conditionsItem);
        return this;
    }

    /**
    * EstimatedDuration in seconds.
    * @return estimatedDuration
    **/
    @JsonProperty("estimatedDuration")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public Integer getEstimatedDuration() {
        return estimatedDuration;
    }

    /**
     * Set estimatedDuration
     **/
    public void setEstimatedDuration(Integer estimatedDuration) {
        this.estimatedDuration = estimatedDuration;
    }

    public WorkflowStatus estimatedDuration(Integer estimatedDuration) {
        this.estimatedDuration = estimatedDuration;
        return this;
    }

    /**
    * Time is a wrapper around time.Time which supports correct marshaling to YAML and JSON.  Wrappers are provided for many of the factory methods that the time package offers.
    * @return finishedAt
    **/
    @JsonProperty("finishedAt")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public OffsetDateTime getFinishedAt() {
        return finishedAt;
    }

    /**
     * Set finishedAt
     **/
    public void setFinishedAt(OffsetDateTime finishedAt) {
        this.finishedAt = finishedAt;
    }

    public WorkflowStatus finishedAt(OffsetDateTime finishedAt) {
        this.finishedAt = finishedAt;
        return this;
    }

    /**
    * A human readable message indicating details about why the workflow is in this condition.
    * @return message
    **/
    @JsonProperty("message")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public String getMessage() {
        return message;
    }

    /**
     * Set message
     **/
    public void setMessage(String message) {
        this.message = message;
    }

    public WorkflowStatus message(String message) {
        this.message = message;
        return this;
    }

    /**
    * Nodes is a mapping between a node ID and the node's status.
    * @return nodes
    **/
    @JsonProperty("nodes")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public Map<String, NodeStatus> getNodes() {
        return nodes;
    }

    /**
     * Set nodes
     **/
    public void setNodes(Map<String, NodeStatus> nodes) {
        this.nodes = nodes;
    }

    public WorkflowStatus nodes(Map<String, NodeStatus> nodes) {
        this.nodes = nodes;
        return this;
    }
    public WorkflowStatus putNodesItem(String key, NodeStatus nodesItem) {
           if (this.nodes == null){
                nodes = new HashMap<>();
            }
        this.nodes.put(key, nodesItem);
        return this;
    }

    /**
    * Whether on not node status has been offloaded to a database. If exists, then Nodes and CompressedNodes will be empty. This will actually be populated with a hash of the offloaded data.
    * @return offloadNodeStatusVersion
    **/
    @JsonProperty("offloadNodeStatusVersion")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public String getOffloadNodeStatusVersion() {
        return offloadNodeStatusVersion;
    }

    /**
     * Set offloadNodeStatusVersion
     **/
    public void setOffloadNodeStatusVersion(String offloadNodeStatusVersion) {
        this.offloadNodeStatusVersion = offloadNodeStatusVersion;
    }

    public WorkflowStatus offloadNodeStatusVersion(String offloadNodeStatusVersion) {
        this.offloadNodeStatusVersion = offloadNodeStatusVersion;
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

    public WorkflowStatus outputs(Outputs outputs) {
        this.outputs = outputs;
        return this;
    }

    /**
    * PersistentVolumeClaims tracks all PVCs that were created as part of the io.argoproj.workflow.v1alpha1. The contents of this list are drained at the end of the workflow.
    * @return persistentVolumeClaims
    **/
    @JsonProperty("persistentVolumeClaims")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public List<Volume> getPersistentVolumeClaims() {
        return persistentVolumeClaims;
    }

    /**
     * Set persistentVolumeClaims
     **/
    public void setPersistentVolumeClaims(List<Volume> persistentVolumeClaims) {
        this.persistentVolumeClaims = persistentVolumeClaims;
    }

    public WorkflowStatus persistentVolumeClaims(List<Volume> persistentVolumeClaims) {
        this.persistentVolumeClaims = persistentVolumeClaims;
        return this;
    }
    public WorkflowStatus addPersistentVolumeClaimsItem(Volume persistentVolumeClaimsItem) {
        if (this.persistentVolumeClaims == null){
            persistentVolumeClaims = new ArrayList<>();
        }
        this.persistentVolumeClaims.add(persistentVolumeClaimsItem);
        return this;
    }

    /**
    * Phase a simple, high-level summary of where the workflow is in its lifecycle. Will be \"\" (Unknown), \"Pending\", or \"Running\" before the workflow is completed, and \"Succeeded\", \"Failed\" or \"Error\" once the workflow has completed.
    * @return phase
    **/
    @JsonProperty("phase")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public String getPhase() {
        return phase;
    }

    /**
     * Set phase
     **/
    public void setPhase(String phase) {
        this.phase = phase;
    }

    public WorkflowStatus phase(String phase) {
        this.phase = phase;
        return this;
    }

    /**
    * Progress to completion
    * @return progress
    **/
    @JsonProperty("progress")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public String getProgress() {
        return progress;
    }

    /**
     * Set progress
     **/
    public void setProgress(String progress) {
        this.progress = progress;
    }

    public WorkflowStatus progress(String progress) {
        this.progress = progress;
        return this;
    }

    /**
    * ResourcesDuration is the total for the workflow
    * @return resourcesDuration
    **/
    @JsonProperty("resourcesDuration")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public Map<String, Long> getResourcesDuration() {
        return resourcesDuration;
    }

    /**
     * Set resourcesDuration
     **/
    public void setResourcesDuration(Map<String, Long> resourcesDuration) {
        this.resourcesDuration = resourcesDuration;
    }

    public WorkflowStatus resourcesDuration(Map<String, Long> resourcesDuration) {
        this.resourcesDuration = resourcesDuration;
        return this;
    }
    public WorkflowStatus putResourcesDurationItem(String key, Long resourcesDurationItem) {
           if (this.resourcesDuration == null){
                resourcesDuration = new HashMap<>();
            }
        this.resourcesDuration.put(key, resourcesDurationItem);
        return this;
    }

    /**
    * Time is a wrapper around time.Time which supports correct marshaling to YAML and JSON.  Wrappers are provided for many of the factory methods that the time package offers.
    * @return startedAt
    **/
    @JsonProperty("startedAt")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public OffsetDateTime getStartedAt() {
        return startedAt;
    }

    /**
     * Set startedAt
     **/
    public void setStartedAt(OffsetDateTime startedAt) {
        this.startedAt = startedAt;
    }

    public WorkflowStatus startedAt(OffsetDateTime startedAt) {
        this.startedAt = startedAt;
        return this;
    }

    /**
    * StoredTemplates is a mapping between a template ref and the node's status.
    * @return storedTemplates
    **/
    @JsonProperty("storedTemplates")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public Map<String, Template> getStoredTemplates() {
        return storedTemplates;
    }

    /**
     * Set storedTemplates
     **/
    public void setStoredTemplates(Map<String, Template> storedTemplates) {
        this.storedTemplates = storedTemplates;
    }

    public WorkflowStatus storedTemplates(Map<String, Template> storedTemplates) {
        this.storedTemplates = storedTemplates;
        return this;
    }
    public WorkflowStatus putStoredTemplatesItem(String key, Template storedTemplatesItem) {
           if (this.storedTemplates == null){
                storedTemplates = new HashMap<>();
            }
        this.storedTemplates.put(key, storedTemplatesItem);
        return this;
    }

    /**
    * Get storedWorkflowTemplateSpec
    * @return storedWorkflowTemplateSpec
    **/
    @JsonProperty("storedWorkflowTemplateSpec")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public WorkflowSpec getStoredWorkflowTemplateSpec() {
        return storedWorkflowTemplateSpec;
    }

    /**
     * Set storedWorkflowTemplateSpec
     **/
    public void setStoredWorkflowTemplateSpec(WorkflowSpec storedWorkflowTemplateSpec) {
        this.storedWorkflowTemplateSpec = storedWorkflowTemplateSpec;
    }

    public WorkflowStatus storedWorkflowTemplateSpec(WorkflowSpec storedWorkflowTemplateSpec) {
        this.storedWorkflowTemplateSpec = storedWorkflowTemplateSpec;
        return this;
    }

    /**
    * Get synchronization
    * @return synchronization
    **/
    @JsonProperty("synchronization")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public SynchronizationStatus getSynchronization() {
        return synchronization;
    }

    /**
     * Set synchronization
     **/
    public void setSynchronization(SynchronizationStatus synchronization) {
        this.synchronization = synchronization;
    }

    public WorkflowStatus synchronization(SynchronizationStatus synchronization) {
        this.synchronization = synchronization;
        return this;
    }

    /**
    * TaskResultsCompletionStatus tracks task result completion status (mapped by node ID). Used to prevent premature archiving and garbage collection.
    * @return taskResultsCompletionStatus
    **/
    @JsonProperty("taskResultsCompletionStatus")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public Map<String, Boolean> getTaskResultsCompletionStatus() {
        return taskResultsCompletionStatus;
    }

    /**
     * Set taskResultsCompletionStatus
     **/
    public void setTaskResultsCompletionStatus(Map<String, Boolean> taskResultsCompletionStatus) {
        this.taskResultsCompletionStatus = taskResultsCompletionStatus;
    }

    public WorkflowStatus taskResultsCompletionStatus(Map<String, Boolean> taskResultsCompletionStatus) {
        this.taskResultsCompletionStatus = taskResultsCompletionStatus;
        return this;
    }
    public WorkflowStatus putTaskResultsCompletionStatusItem(String key, Boolean taskResultsCompletionStatusItem) {
           if (this.taskResultsCompletionStatus == null){
                taskResultsCompletionStatus = new HashMap<>();
            }
        this.taskResultsCompletionStatus.put(key, taskResultsCompletionStatusItem);
        return this;
    }

    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class WorkflowStatus {\n");

        sb.append("    artifactGCStatus: ").append(toIndentedString(artifactGCStatus)).append("\n");
        sb.append("    artifactRepositoryRef: ").append(toIndentedString(artifactRepositoryRef)).append("\n");
        sb.append("    compressedNodes: ").append(toIndentedString(compressedNodes)).append("\n");
        sb.append("    conditions: ").append(toIndentedString(conditions)).append("\n");
        sb.append("    estimatedDuration: ").append(toIndentedString(estimatedDuration)).append("\n");
        sb.append("    finishedAt: ").append(toIndentedString(finishedAt)).append("\n");
        sb.append("    message: ").append(toIndentedString(message)).append("\n");
        sb.append("    nodes: ").append(toIndentedString(nodes)).append("\n");
        sb.append("    offloadNodeStatusVersion: ").append(toIndentedString(offloadNodeStatusVersion)).append("\n");
        sb.append("    outputs: ").append(toIndentedString(outputs)).append("\n");
        sb.append("    persistentVolumeClaims: ").append(toIndentedString(persistentVolumeClaims)).append("\n");
        sb.append("    phase: ").append(toIndentedString(phase)).append("\n");
        sb.append("    progress: ").append(toIndentedString(progress)).append("\n");
        sb.append("    resourcesDuration: ").append(toIndentedString(resourcesDuration)).append("\n");
        sb.append("    startedAt: ").append(toIndentedString(startedAt)).append("\n");
        sb.append("    storedTemplates: ").append(toIndentedString(storedTemplates)).append("\n");
        sb.append("    storedWorkflowTemplateSpec: ").append(toIndentedString(storedWorkflowTemplateSpec)).append("\n");
        sb.append("    synchronization: ").append(toIndentedString(synchronization)).append("\n");
        sb.append("    taskResultsCompletionStatus: ").append(toIndentedString(taskResultsCompletionStatus)).append("\n");
        
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
      * WorkflowStatus contains overall status information about a workflow
     **/
    public static class WorkflowStatusQueryParam  {

        /**
          * WorkflowStatus contains overall status information about a workflow
         **/
        @jakarta.ws.rs.QueryParam("artifactGCStatus")
        private ArtGCStatus artifactGCStatus;
        /**
          * WorkflowStatus contains overall status information about a workflow
         **/
        @jakarta.ws.rs.QueryParam("artifactRepositoryRef")
        private ArtifactRepositoryRefStatus artifactRepositoryRef;
        /**
          * WorkflowStatus contains overall status information about a workflow
         **/
        @jakarta.ws.rs.QueryParam("compressedNodes")
        private String compressedNodes;
        /**
          * WorkflowStatus contains overall status information about a workflow
         **/
        @jakarta.ws.rs.QueryParam("conditions")
        private List<Condition> conditions = null;
        /**
          * WorkflowStatus contains overall status information about a workflow
         **/
        @jakarta.ws.rs.QueryParam("estimatedDuration")
        private Integer estimatedDuration;
        /**
          * WorkflowStatus contains overall status information about a workflow
         **/
        @jakarta.ws.rs.QueryParam("finishedAt")
        private OffsetDateTime finishedAt;
        /**
          * WorkflowStatus contains overall status information about a workflow
         **/
        @jakarta.ws.rs.QueryParam("message")
        private String message;
        /**
          * WorkflowStatus contains overall status information about a workflow
         **/
        @jakarta.ws.rs.QueryParam("nodes")
        private Map<String, NodeStatus> nodes = null;
        /**
          * WorkflowStatus contains overall status information about a workflow
         **/
        @jakarta.ws.rs.QueryParam("offloadNodeStatusVersion")
        private String offloadNodeStatusVersion;
        /**
          * WorkflowStatus contains overall status information about a workflow
         **/
        @jakarta.ws.rs.QueryParam("outputs")
        private Outputs outputs;
        /**
          * WorkflowStatus contains overall status information about a workflow
         **/
        @jakarta.ws.rs.QueryParam("persistentVolumeClaims")
        private List<Volume> persistentVolumeClaims = null;
        /**
          * WorkflowStatus contains overall status information about a workflow
         **/
        @jakarta.ws.rs.QueryParam("phase")
        private String phase;
        /**
          * WorkflowStatus contains overall status information about a workflow
         **/
        @jakarta.ws.rs.QueryParam("progress")
        private String progress;
        /**
          * WorkflowStatus contains overall status information about a workflow
         **/
        @jakarta.ws.rs.QueryParam("resourcesDuration")
        private Map<String, Long> resourcesDuration = null;
        /**
          * WorkflowStatus contains overall status information about a workflow
         **/
        @jakarta.ws.rs.QueryParam("startedAt")
        private OffsetDateTime startedAt;
        /**
          * WorkflowStatus contains overall status information about a workflow
         **/
        @jakarta.ws.rs.QueryParam("storedTemplates")
        private Map<String, Template> storedTemplates = null;
        /**
          * WorkflowStatus contains overall status information about a workflow
         **/
        @jakarta.ws.rs.QueryParam("storedWorkflowTemplateSpec")
        private WorkflowSpec storedWorkflowTemplateSpec;
        /**
          * WorkflowStatus contains overall status information about a workflow
         **/
        @jakarta.ws.rs.QueryParam("synchronization")
        private SynchronizationStatus synchronization;
        /**
          * WorkflowStatus contains overall status information about a workflow
         **/
        @jakarta.ws.rs.QueryParam("taskResultsCompletionStatus")
        private Map<String, Boolean> taskResultsCompletionStatus = null;

        /**
        * Get artifactGCStatus
        * @return artifactGCStatus
        **/
        @JsonProperty("artifactGCStatus")
        public ArtGCStatus getArtifactGCStatus() {
            return artifactGCStatus;
        }

        /**
         * Set artifactGCStatus
         **/
        public void setArtifactGCStatus(ArtGCStatus artifactGCStatus) {
            this.artifactGCStatus = artifactGCStatus;
        }

        public WorkflowStatusQueryParam artifactGCStatus(ArtGCStatus artifactGCStatus) {
            this.artifactGCStatus = artifactGCStatus;
            return this;
        }

        /**
        * Get artifactRepositoryRef
        * @return artifactRepositoryRef
        **/
        @JsonProperty("artifactRepositoryRef")
        public ArtifactRepositoryRefStatus getArtifactRepositoryRef() {
            return artifactRepositoryRef;
        }

        /**
         * Set artifactRepositoryRef
         **/
        public void setArtifactRepositoryRef(ArtifactRepositoryRefStatus artifactRepositoryRef) {
            this.artifactRepositoryRef = artifactRepositoryRef;
        }

        public WorkflowStatusQueryParam artifactRepositoryRef(ArtifactRepositoryRefStatus artifactRepositoryRef) {
            this.artifactRepositoryRef = artifactRepositoryRef;
            return this;
        }

        /**
        * Compressed and base64 decoded Nodes map
        * @return compressedNodes
        **/
        @JsonProperty("compressedNodes")
        public String getCompressedNodes() {
            return compressedNodes;
        }

        /**
         * Set compressedNodes
         **/
        public void setCompressedNodes(String compressedNodes) {
            this.compressedNodes = compressedNodes;
        }

        public WorkflowStatusQueryParam compressedNodes(String compressedNodes) {
            this.compressedNodes = compressedNodes;
            return this;
        }

        /**
        * Conditions is a list of conditions the Workflow may have
        * @return conditions
        **/
        @JsonProperty("conditions")
        public List<Condition> getConditions() {
            return conditions;
        }

        /**
         * Set conditions
         **/
        public void setConditions(List<Condition> conditions) {
            this.conditions = conditions;
        }

        public WorkflowStatusQueryParam conditions(List<Condition> conditions) {
            this.conditions = conditions;
            return this;
        }
        public WorkflowStatusQueryParam addConditionsItem(Condition conditionsItem) {
            this.conditions.add(conditionsItem);
            return this;
        }

        /**
        * EstimatedDuration in seconds.
        * @return estimatedDuration
        **/
        @JsonProperty("estimatedDuration")
        public Integer getEstimatedDuration() {
            return estimatedDuration;
        }

        /**
         * Set estimatedDuration
         **/
        public void setEstimatedDuration(Integer estimatedDuration) {
            this.estimatedDuration = estimatedDuration;
        }

        public WorkflowStatusQueryParam estimatedDuration(Integer estimatedDuration) {
            this.estimatedDuration = estimatedDuration;
            return this;
        }

        /**
        * Time is a wrapper around time.Time which supports correct marshaling to YAML and JSON.  Wrappers are provided for many of the factory methods that the time package offers.
        * @return finishedAt
        **/
        @JsonProperty("finishedAt")
        public OffsetDateTime getFinishedAt() {
            return finishedAt;
        }

        /**
         * Set finishedAt
         **/
        public void setFinishedAt(OffsetDateTime finishedAt) {
            this.finishedAt = finishedAt;
        }

        public WorkflowStatusQueryParam finishedAt(OffsetDateTime finishedAt) {
            this.finishedAt = finishedAt;
            return this;
        }

        /**
        * A human readable message indicating details about why the workflow is in this condition.
        * @return message
        **/
        @JsonProperty("message")
        public String getMessage() {
            return message;
        }

        /**
         * Set message
         **/
        public void setMessage(String message) {
            this.message = message;
        }

        public WorkflowStatusQueryParam message(String message) {
            this.message = message;
            return this;
        }

        /**
        * Nodes is a mapping between a node ID and the node's status.
        * @return nodes
        **/
        @JsonProperty("nodes")
        public Map<String, NodeStatus> getNodes() {
            return nodes;
        }

        /**
         * Set nodes
         **/
        public void setNodes(Map<String, NodeStatus> nodes) {
            this.nodes = nodes;
        }

        public WorkflowStatusQueryParam nodes(Map<String, NodeStatus> nodes) {
            this.nodes = nodes;
            return this;
        }
        public WorkflowStatusQueryParam putNodesItem(String key, NodeStatus nodesItem) {
            this.nodes.put(key, nodesItem);
            return this;
        }

        /**
        * Whether on not node status has been offloaded to a database. If exists, then Nodes and CompressedNodes will be empty. This will actually be populated with a hash of the offloaded data.
        * @return offloadNodeStatusVersion
        **/
        @JsonProperty("offloadNodeStatusVersion")
        public String getOffloadNodeStatusVersion() {
            return offloadNodeStatusVersion;
        }

        /**
         * Set offloadNodeStatusVersion
         **/
        public void setOffloadNodeStatusVersion(String offloadNodeStatusVersion) {
            this.offloadNodeStatusVersion = offloadNodeStatusVersion;
        }

        public WorkflowStatusQueryParam offloadNodeStatusVersion(String offloadNodeStatusVersion) {
            this.offloadNodeStatusVersion = offloadNodeStatusVersion;
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

        public WorkflowStatusQueryParam outputs(Outputs outputs) {
            this.outputs = outputs;
            return this;
        }

        /**
        * PersistentVolumeClaims tracks all PVCs that were created as part of the io.argoproj.workflow.v1alpha1. The contents of this list are drained at the end of the workflow.
        * @return persistentVolumeClaims
        **/
        @JsonProperty("persistentVolumeClaims")
        public List<Volume> getPersistentVolumeClaims() {
            return persistentVolumeClaims;
        }

        /**
         * Set persistentVolumeClaims
         **/
        public void setPersistentVolumeClaims(List<Volume> persistentVolumeClaims) {
            this.persistentVolumeClaims = persistentVolumeClaims;
        }

        public WorkflowStatusQueryParam persistentVolumeClaims(List<Volume> persistentVolumeClaims) {
            this.persistentVolumeClaims = persistentVolumeClaims;
            return this;
        }
        public WorkflowStatusQueryParam addPersistentVolumeClaimsItem(Volume persistentVolumeClaimsItem) {
            this.persistentVolumeClaims.add(persistentVolumeClaimsItem);
            return this;
        }

        /**
        * Phase a simple, high-level summary of where the workflow is in its lifecycle. Will be \"\" (Unknown), \"Pending\", or \"Running\" before the workflow is completed, and \"Succeeded\", \"Failed\" or \"Error\" once the workflow has completed.
        * @return phase
        **/
        @JsonProperty("phase")
        public String getPhase() {
            return phase;
        }

        /**
         * Set phase
         **/
        public void setPhase(String phase) {
            this.phase = phase;
        }

        public WorkflowStatusQueryParam phase(String phase) {
            this.phase = phase;
            return this;
        }

        /**
        * Progress to completion
        * @return progress
        **/
        @JsonProperty("progress")
        public String getProgress() {
            return progress;
        }

        /**
         * Set progress
         **/
        public void setProgress(String progress) {
            this.progress = progress;
        }

        public WorkflowStatusQueryParam progress(String progress) {
            this.progress = progress;
            return this;
        }

        /**
        * ResourcesDuration is the total for the workflow
        * @return resourcesDuration
        **/
        @JsonProperty("resourcesDuration")
        public Map<String, Long> getResourcesDuration() {
            return resourcesDuration;
        }

        /**
         * Set resourcesDuration
         **/
        public void setResourcesDuration(Map<String, Long> resourcesDuration) {
            this.resourcesDuration = resourcesDuration;
        }

        public WorkflowStatusQueryParam resourcesDuration(Map<String, Long> resourcesDuration) {
            this.resourcesDuration = resourcesDuration;
            return this;
        }
        public WorkflowStatusQueryParam putResourcesDurationItem(String key, Long resourcesDurationItem) {
            this.resourcesDuration.put(key, resourcesDurationItem);
            return this;
        }

        /**
        * Time is a wrapper around time.Time which supports correct marshaling to YAML and JSON.  Wrappers are provided for many of the factory methods that the time package offers.
        * @return startedAt
        **/
        @JsonProperty("startedAt")
        public OffsetDateTime getStartedAt() {
            return startedAt;
        }

        /**
         * Set startedAt
         **/
        public void setStartedAt(OffsetDateTime startedAt) {
            this.startedAt = startedAt;
        }

        public WorkflowStatusQueryParam startedAt(OffsetDateTime startedAt) {
            this.startedAt = startedAt;
            return this;
        }

        /**
        * StoredTemplates is a mapping between a template ref and the node's status.
        * @return storedTemplates
        **/
        @JsonProperty("storedTemplates")
        public Map<String, Template> getStoredTemplates() {
            return storedTemplates;
        }

        /**
         * Set storedTemplates
         **/
        public void setStoredTemplates(Map<String, Template> storedTemplates) {
            this.storedTemplates = storedTemplates;
        }

        public WorkflowStatusQueryParam storedTemplates(Map<String, Template> storedTemplates) {
            this.storedTemplates = storedTemplates;
            return this;
        }
        public WorkflowStatusQueryParam putStoredTemplatesItem(String key, Template storedTemplatesItem) {
            this.storedTemplates.put(key, storedTemplatesItem);
            return this;
        }

        /**
        * Get storedWorkflowTemplateSpec
        * @return storedWorkflowTemplateSpec
        **/
        @JsonProperty("storedWorkflowTemplateSpec")
        public WorkflowSpec getStoredWorkflowTemplateSpec() {
            return storedWorkflowTemplateSpec;
        }

        /**
         * Set storedWorkflowTemplateSpec
         **/
        public void setStoredWorkflowTemplateSpec(WorkflowSpec storedWorkflowTemplateSpec) {
            this.storedWorkflowTemplateSpec = storedWorkflowTemplateSpec;
        }

        public WorkflowStatusQueryParam storedWorkflowTemplateSpec(WorkflowSpec storedWorkflowTemplateSpec) {
            this.storedWorkflowTemplateSpec = storedWorkflowTemplateSpec;
            return this;
        }

        /**
        * Get synchronization
        * @return synchronization
        **/
        @JsonProperty("synchronization")
        public SynchronizationStatus getSynchronization() {
            return synchronization;
        }

        /**
         * Set synchronization
         **/
        public void setSynchronization(SynchronizationStatus synchronization) {
            this.synchronization = synchronization;
        }

        public WorkflowStatusQueryParam synchronization(SynchronizationStatus synchronization) {
            this.synchronization = synchronization;
            return this;
        }

        /**
        * TaskResultsCompletionStatus tracks task result completion status (mapped by node ID). Used to prevent premature archiving and garbage collection.
        * @return taskResultsCompletionStatus
        **/
        @JsonProperty("taskResultsCompletionStatus")
        public Map<String, Boolean> getTaskResultsCompletionStatus() {
            return taskResultsCompletionStatus;
        }

        /**
         * Set taskResultsCompletionStatus
         **/
        public void setTaskResultsCompletionStatus(Map<String, Boolean> taskResultsCompletionStatus) {
            this.taskResultsCompletionStatus = taskResultsCompletionStatus;
        }

        public WorkflowStatusQueryParam taskResultsCompletionStatus(Map<String, Boolean> taskResultsCompletionStatus) {
            this.taskResultsCompletionStatus = taskResultsCompletionStatus;
            return this;
        }
        public WorkflowStatusQueryParam putTaskResultsCompletionStatusItem(String key, Boolean taskResultsCompletionStatusItem) {
            this.taskResultsCompletionStatus.put(key, taskResultsCompletionStatusItem);
            return this;
        }

        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class WorkflowStatusQueryParam {\n");

            sb.append("    artifactGCStatus: ").append(toIndentedString(artifactGCStatus)).append("\n");
            sb.append("    artifactRepositoryRef: ").append(toIndentedString(artifactRepositoryRef)).append("\n");
            sb.append("    compressedNodes: ").append(toIndentedString(compressedNodes)).append("\n");
            sb.append("    conditions: ").append(toIndentedString(conditions)).append("\n");
            sb.append("    estimatedDuration: ").append(toIndentedString(estimatedDuration)).append("\n");
            sb.append("    finishedAt: ").append(toIndentedString(finishedAt)).append("\n");
            sb.append("    message: ").append(toIndentedString(message)).append("\n");
            sb.append("    nodes: ").append(toIndentedString(nodes)).append("\n");
            sb.append("    offloadNodeStatusVersion: ").append(toIndentedString(offloadNodeStatusVersion)).append("\n");
            sb.append("    outputs: ").append(toIndentedString(outputs)).append("\n");
            sb.append("    persistentVolumeClaims: ").append(toIndentedString(persistentVolumeClaims)).append("\n");
            sb.append("    phase: ").append(toIndentedString(phase)).append("\n");
            sb.append("    progress: ").append(toIndentedString(progress)).append("\n");
            sb.append("    resourcesDuration: ").append(toIndentedString(resourcesDuration)).append("\n");
            sb.append("    startedAt: ").append(toIndentedString(startedAt)).append("\n");
            sb.append("    storedTemplates: ").append(toIndentedString(storedTemplates)).append("\n");
            sb.append("    storedWorkflowTemplateSpec: ").append(toIndentedString(storedWorkflowTemplateSpec)).append("\n");
            sb.append("    synchronization: ").append(toIndentedString(synchronization)).append("\n");
            sb.append("    taskResultsCompletionStatus: ").append(toIndentedString(taskResultsCompletionStatus)).append("\n");
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
