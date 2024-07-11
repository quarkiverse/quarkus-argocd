package io.quarkiverse.argocd.workflow.v1alpha1;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
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
  * NodeStatus contains status information about an individual node in the workflow
 **/
public class NodeStatus  {

    /**
      * NodeStatus contains status information about an individual node in the workflow
     **/
    private String boundaryID;
    /**
      * NodeStatus contains status information about an individual node in the workflow
     **/
    private List<String> children;
    /**
      * NodeStatus contains status information about an individual node in the workflow
     **/
    private Boolean daemoned;
    /**
      * NodeStatus contains status information about an individual node in the workflow
     **/
    private String displayName;
    /**
      * NodeStatus contains status information about an individual node in the workflow
     **/
    private Integer estimatedDuration;
    /**
      * NodeStatus contains status information about an individual node in the workflow
     **/
    private OffsetDateTime finishedAt;
    /**
      * NodeStatus contains status information about an individual node in the workflow
     **/
    private String hostNodeName;
    /**
      * NodeStatus contains status information about an individual node in the workflow
     **/
    private String id;
    /**
      * NodeStatus contains status information about an individual node in the workflow
     **/
    private Inputs inputs;
    /**
      * NodeStatus contains status information about an individual node in the workflow
     **/
    private MemoizationStatus memoizationStatus;
    /**
      * NodeStatus contains status information about an individual node in the workflow
     **/
    private String message;
    /**
      * NodeStatus contains status information about an individual node in the workflow
     **/
    private String name;
    /**
      * NodeStatus contains status information about an individual node in the workflow
     **/
    private NodeFlag nodeFlag;
    /**
      * NodeStatus contains status information about an individual node in the workflow
     **/
    private List<String> outboundNodes;
    /**
      * NodeStatus contains status information about an individual node in the workflow
     **/
    private Outputs outputs;
    /**
      * NodeStatus contains status information about an individual node in the workflow
     **/
    private String phase;
    /**
      * NodeStatus contains status information about an individual node in the workflow
     **/
    private String podIP;
    /**
      * NodeStatus contains status information about an individual node in the workflow
     **/
    private String progress;
    /**
      * NodeStatus contains status information about an individual node in the workflow
     **/
    private Map<String, Long> resourcesDuration;
    /**
      * NodeStatus contains status information about an individual node in the workflow
     **/
    private OffsetDateTime startedAt;
    /**
      * NodeStatus contains status information about an individual node in the workflow
     **/
    private NodeSynchronizationStatus synchronizationStatus;
    /**
      * NodeStatus contains status information about an individual node in the workflow
     **/
    private String templateName;
    /**
      * NodeStatus contains status information about an individual node in the workflow
     **/
    private TemplateRef templateRef;
    /**
      * NodeStatus contains status information about an individual node in the workflow
     **/
    private String templateScope;
    /**
      * NodeStatus contains status information about an individual node in the workflow
     **/
    private String type;

    /**
    * BoundaryID indicates the node ID of the associated template root node in which this node belongs to
    * @return boundaryID
    **/
    @JsonProperty("boundaryID")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public String getBoundaryID() {
        return boundaryID;
    }

    /**
     * Set boundaryID
     **/
    public void setBoundaryID(String boundaryID) {
        this.boundaryID = boundaryID;
    }

    public NodeStatus boundaryID(String boundaryID) {
        this.boundaryID = boundaryID;
        return this;
    }

    /**
    * Children is a list of child node IDs
    * @return children
    **/
    @JsonProperty("children")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public List<String> getChildren() {
        return children;
    }

    /**
     * Set children
     **/
    public void setChildren(List<String> children) {
        this.children = children;
    }

    public NodeStatus children(List<String> children) {
        this.children = children;
        return this;
    }
    public NodeStatus addChildrenItem(String childrenItem) {
        if (this.children == null){
            children = new ArrayList<>();
        }
        this.children.add(childrenItem);
        return this;
    }

    /**
    * Daemoned tracks whether or not this node was daemoned and need to be terminated
    * @return daemoned
    **/
    @JsonProperty("daemoned")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public Boolean getDaemoned() {
        return daemoned;
    }

    /**
     * Set daemoned
     **/
    public void setDaemoned(Boolean daemoned) {
        this.daemoned = daemoned;
    }

    public NodeStatus daemoned(Boolean daemoned) {
        this.daemoned = daemoned;
        return this;
    }

    /**
    * DisplayName is a human readable representation of the node. Unique within a template boundary
    * @return displayName
    **/
    @JsonProperty("displayName")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public String getDisplayName() {
        return displayName;
    }

    /**
     * Set displayName
     **/
    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public NodeStatus displayName(String displayName) {
        this.displayName = displayName;
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

    public NodeStatus estimatedDuration(Integer estimatedDuration) {
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

    public NodeStatus finishedAt(OffsetDateTime finishedAt) {
        this.finishedAt = finishedAt;
        return this;
    }

    /**
    * HostNodeName name of the Kubernetes node on which the Pod is running, if applicable
    * @return hostNodeName
    **/
    @JsonProperty("hostNodeName")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public String getHostNodeName() {
        return hostNodeName;
    }

    /**
     * Set hostNodeName
     **/
    public void setHostNodeName(String hostNodeName) {
        this.hostNodeName = hostNodeName;
    }

    public NodeStatus hostNodeName(String hostNodeName) {
        this.hostNodeName = hostNodeName;
        return this;
    }

    /**
    * ID is a unique identifier of a node within the worklow It is implemented as a hash of the node name, which makes the ID deterministic
    * @return id
    **/
    @JsonProperty("id")
    public String getId() {
        return id;
    }

    /**
     * Set id
     **/
    public void setId(String id) {
        this.id = id;
    }

    public NodeStatus id(String id) {
        this.id = id;
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

    public NodeStatus inputs(Inputs inputs) {
        this.inputs = inputs;
        return this;
    }

    /**
    * Get memoizationStatus
    * @return memoizationStatus
    **/
    @JsonProperty("memoizationStatus")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public MemoizationStatus getMemoizationStatus() {
        return memoizationStatus;
    }

    /**
     * Set memoizationStatus
     **/
    public void setMemoizationStatus(MemoizationStatus memoizationStatus) {
        this.memoizationStatus = memoizationStatus;
    }

    public NodeStatus memoizationStatus(MemoizationStatus memoizationStatus) {
        this.memoizationStatus = memoizationStatus;
        return this;
    }

    /**
    * A human readable message indicating details about why the node is in this condition.
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

    public NodeStatus message(String message) {
        this.message = message;
        return this;
    }

    /**
    * Name is unique name in the node tree used to generate the node ID
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

    public NodeStatus name(String name) {
        this.name = name;
        return this;
    }

    /**
    * Get nodeFlag
    * @return nodeFlag
    **/
    @JsonProperty("nodeFlag")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public NodeFlag getNodeFlag() {
        return nodeFlag;
    }

    /**
     * Set nodeFlag
     **/
    public void setNodeFlag(NodeFlag nodeFlag) {
        this.nodeFlag = nodeFlag;
    }

    public NodeStatus nodeFlag(NodeFlag nodeFlag) {
        this.nodeFlag = nodeFlag;
        return this;
    }

    /**
    * OutboundNodes tracks the node IDs which are considered \"outbound\" nodes to a template invocation. For every invocation of a template, there are nodes which we considered as \"outbound\". Essentially, these are last nodes in the execution sequence to run, before the template is considered completed. These nodes are then connected as parents to a following step.  In the case of single pod steps (i.e. container, script, resource templates), this list will be nil since the pod itself is already considered the \"outbound\" node. In the case of DAGs, outbound nodes are the \"target\" tasks (tasks with no children). In the case of steps, outbound nodes are all the containers involved in the last step group. NOTE: since templates are composable, the list of outbound nodes are carried upwards when a DAG/steps template invokes another DAG/steps template. In other words, the outbound nodes of a template, will be a superset of the outbound nodes of its last children.
    * @return outboundNodes
    **/
    @JsonProperty("outboundNodes")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public List<String> getOutboundNodes() {
        return outboundNodes;
    }

    /**
     * Set outboundNodes
     **/
    public void setOutboundNodes(List<String> outboundNodes) {
        this.outboundNodes = outboundNodes;
    }

    public NodeStatus outboundNodes(List<String> outboundNodes) {
        this.outboundNodes = outboundNodes;
        return this;
    }
    public NodeStatus addOutboundNodesItem(String outboundNodesItem) {
        if (this.outboundNodes == null){
            outboundNodes = new ArrayList<>();
        }
        this.outboundNodes.add(outboundNodesItem);
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

    public NodeStatus outputs(Outputs outputs) {
        this.outputs = outputs;
        return this;
    }

    /**
    * Phase a simple, high-level summary of where the node is in its lifecycle. Can be used as a state machine. Will be one of these values \"Pending\", \"Running\" before the node is completed, or \"Succeeded\", \"Skipped\", \"Failed\", \"Error\", or \"Omitted\" as a final state.
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

    public NodeStatus phase(String phase) {
        this.phase = phase;
        return this;
    }

    /**
    * PodIP captures the IP of the pod for daemoned steps
    * @return podIP
    **/
    @JsonProperty("podIP")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public String getPodIP() {
        return podIP;
    }

    /**
     * Set podIP
     **/
    public void setPodIP(String podIP) {
        this.podIP = podIP;
    }

    public NodeStatus podIP(String podIP) {
        this.podIP = podIP;
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

    public NodeStatus progress(String progress) {
        this.progress = progress;
        return this;
    }

    /**
    * ResourcesDuration is indicative, but not accurate, resource duration. This is populated when the nodes completes.
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

    public NodeStatus resourcesDuration(Map<String, Long> resourcesDuration) {
        this.resourcesDuration = resourcesDuration;
        return this;
    }
    public NodeStatus putResourcesDurationItem(String key, Long resourcesDurationItem) {
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

    public NodeStatus startedAt(OffsetDateTime startedAt) {
        this.startedAt = startedAt;
        return this;
    }

    /**
    * Get synchronizationStatus
    * @return synchronizationStatus
    **/
    @JsonProperty("synchronizationStatus")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public NodeSynchronizationStatus getSynchronizationStatus() {
        return synchronizationStatus;
    }

    /**
     * Set synchronizationStatus
     **/
    public void setSynchronizationStatus(NodeSynchronizationStatus synchronizationStatus) {
        this.synchronizationStatus = synchronizationStatus;
    }

    public NodeStatus synchronizationStatus(NodeSynchronizationStatus synchronizationStatus) {
        this.synchronizationStatus = synchronizationStatus;
        return this;
    }

    /**
    * TemplateName is the template name which this node corresponds to. Not applicable to virtual nodes (e.g. Retry, StepGroup)
    * @return templateName
    **/
    @JsonProperty("templateName")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public String getTemplateName() {
        return templateName;
    }

    /**
     * Set templateName
     **/
    public void setTemplateName(String templateName) {
        this.templateName = templateName;
    }

    public NodeStatus templateName(String templateName) {
        this.templateName = templateName;
        return this;
    }

    /**
    * Get templateRef
    * @return templateRef
    **/
    @JsonProperty("templateRef")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public TemplateRef getTemplateRef() {
        return templateRef;
    }

    /**
     * Set templateRef
     **/
    public void setTemplateRef(TemplateRef templateRef) {
        this.templateRef = templateRef;
    }

    public NodeStatus templateRef(TemplateRef templateRef) {
        this.templateRef = templateRef;
        return this;
    }

    /**
    * TemplateScope is the template scope in which the template of this node was retrieved.
    * @return templateScope
    **/
    @JsonProperty("templateScope")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public String getTemplateScope() {
        return templateScope;
    }

    /**
     * Set templateScope
     **/
    public void setTemplateScope(String templateScope) {
        this.templateScope = templateScope;
    }

    public NodeStatus templateScope(String templateScope) {
        this.templateScope = templateScope;
        return this;
    }

    /**
    * Type indicates type of node
    * @return type
    **/
    @JsonProperty("type")
    public String getType() {
        return type;
    }

    /**
     * Set type
     **/
    public void setType(String type) {
        this.type = type;
    }

    public NodeStatus type(String type) {
        this.type = type;
        return this;
    }

    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class NodeStatus {\n");

        sb.append("    boundaryID: ").append(toIndentedString(boundaryID)).append("\n");
        sb.append("    children: ").append(toIndentedString(children)).append("\n");
        sb.append("    daemoned: ").append(toIndentedString(daemoned)).append("\n");
        sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
        sb.append("    estimatedDuration: ").append(toIndentedString(estimatedDuration)).append("\n");
        sb.append("    finishedAt: ").append(toIndentedString(finishedAt)).append("\n");
        sb.append("    hostNodeName: ").append(toIndentedString(hostNodeName)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    inputs: ").append(toIndentedString(inputs)).append("\n");
        sb.append("    memoizationStatus: ").append(toIndentedString(memoizationStatus)).append("\n");
        sb.append("    message: ").append(toIndentedString(message)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    nodeFlag: ").append(toIndentedString(nodeFlag)).append("\n");
        sb.append("    outboundNodes: ").append(toIndentedString(outboundNodes)).append("\n");
        sb.append("    outputs: ").append(toIndentedString(outputs)).append("\n");
        sb.append("    phase: ").append(toIndentedString(phase)).append("\n");
        sb.append("    podIP: ").append(toIndentedString(podIP)).append("\n");
        sb.append("    progress: ").append(toIndentedString(progress)).append("\n");
        sb.append("    resourcesDuration: ").append(toIndentedString(resourcesDuration)).append("\n");
        sb.append("    startedAt: ").append(toIndentedString(startedAt)).append("\n");
        sb.append("    synchronizationStatus: ").append(toIndentedString(synchronizationStatus)).append("\n");
        sb.append("    templateName: ").append(toIndentedString(templateName)).append("\n");
        sb.append("    templateRef: ").append(toIndentedString(templateRef)).append("\n");
        sb.append("    templateScope: ").append(toIndentedString(templateScope)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        
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
      * NodeStatus contains status information about an individual node in the workflow
     **/
    public static class NodeStatusQueryParam  {

        /**
          * NodeStatus contains status information about an individual node in the workflow
         **/
        @jakarta.ws.rs.QueryParam("boundaryID")
        private String boundaryID;
        /**
          * NodeStatus contains status information about an individual node in the workflow
         **/
        @jakarta.ws.rs.QueryParam("children")
        private List<String> children = null;
        /**
          * NodeStatus contains status information about an individual node in the workflow
         **/
        @jakarta.ws.rs.QueryParam("daemoned")
        private Boolean daemoned;
        /**
          * NodeStatus contains status information about an individual node in the workflow
         **/
        @jakarta.ws.rs.QueryParam("displayName")
        private String displayName;
        /**
          * NodeStatus contains status information about an individual node in the workflow
         **/
        @jakarta.ws.rs.QueryParam("estimatedDuration")
        private Integer estimatedDuration;
        /**
          * NodeStatus contains status information about an individual node in the workflow
         **/
        @jakarta.ws.rs.QueryParam("finishedAt")
        private OffsetDateTime finishedAt;
        /**
          * NodeStatus contains status information about an individual node in the workflow
         **/
        @jakarta.ws.rs.QueryParam("hostNodeName")
        private String hostNodeName;
        /**
          * NodeStatus contains status information about an individual node in the workflow
         **/
        @jakarta.ws.rs.QueryParam("id")
        private String id;
        /**
          * NodeStatus contains status information about an individual node in the workflow
         **/
        @jakarta.ws.rs.QueryParam("inputs")
        private Inputs inputs;
        /**
          * NodeStatus contains status information about an individual node in the workflow
         **/
        @jakarta.ws.rs.QueryParam("memoizationStatus")
        private MemoizationStatus memoizationStatus;
        /**
          * NodeStatus contains status information about an individual node in the workflow
         **/
        @jakarta.ws.rs.QueryParam("message")
        private String message;
        /**
          * NodeStatus contains status information about an individual node in the workflow
         **/
        @jakarta.ws.rs.QueryParam("name")
        private String name;
        /**
          * NodeStatus contains status information about an individual node in the workflow
         **/
        @jakarta.ws.rs.QueryParam("nodeFlag")
        private NodeFlag nodeFlag;
        /**
          * NodeStatus contains status information about an individual node in the workflow
         **/
        @jakarta.ws.rs.QueryParam("outboundNodes")
        private List<String> outboundNodes = null;
        /**
          * NodeStatus contains status information about an individual node in the workflow
         **/
        @jakarta.ws.rs.QueryParam("outputs")
        private Outputs outputs;
        /**
          * NodeStatus contains status information about an individual node in the workflow
         **/
        @jakarta.ws.rs.QueryParam("phase")
        private String phase;
        /**
          * NodeStatus contains status information about an individual node in the workflow
         **/
        @jakarta.ws.rs.QueryParam("podIP")
        private String podIP;
        /**
          * NodeStatus contains status information about an individual node in the workflow
         **/
        @jakarta.ws.rs.QueryParam("progress")
        private String progress;
        /**
          * NodeStatus contains status information about an individual node in the workflow
         **/
        @jakarta.ws.rs.QueryParam("resourcesDuration")
        private Map<String, Long> resourcesDuration = null;
        /**
          * NodeStatus contains status information about an individual node in the workflow
         **/
        @jakarta.ws.rs.QueryParam("startedAt")
        private OffsetDateTime startedAt;
        /**
          * NodeStatus contains status information about an individual node in the workflow
         **/
        @jakarta.ws.rs.QueryParam("synchronizationStatus")
        private NodeSynchronizationStatus synchronizationStatus;
        /**
          * NodeStatus contains status information about an individual node in the workflow
         **/
        @jakarta.ws.rs.QueryParam("templateName")
        private String templateName;
        /**
          * NodeStatus contains status information about an individual node in the workflow
         **/
        @jakarta.ws.rs.QueryParam("templateRef")
        private TemplateRef templateRef;
        /**
          * NodeStatus contains status information about an individual node in the workflow
         **/
        @jakarta.ws.rs.QueryParam("templateScope")
        private String templateScope;
        /**
          * NodeStatus contains status information about an individual node in the workflow
         **/
        @jakarta.ws.rs.QueryParam("type")
        private String type;

        /**
        * BoundaryID indicates the node ID of the associated template root node in which this node belongs to
        * @return boundaryID
        **/
        @JsonProperty("boundaryID")
        public String getBoundaryID() {
            return boundaryID;
        }

        /**
         * Set boundaryID
         **/
        public void setBoundaryID(String boundaryID) {
            this.boundaryID = boundaryID;
        }

        public NodeStatusQueryParam boundaryID(String boundaryID) {
            this.boundaryID = boundaryID;
            return this;
        }

        /**
        * Children is a list of child node IDs
        * @return children
        **/
        @JsonProperty("children")
        public List<String> getChildren() {
            return children;
        }

        /**
         * Set children
         **/
        public void setChildren(List<String> children) {
            this.children = children;
        }

        public NodeStatusQueryParam children(List<String> children) {
            this.children = children;
            return this;
        }
        public NodeStatusQueryParam addChildrenItem(String childrenItem) {
            this.children.add(childrenItem);
            return this;
        }

        /**
        * Daemoned tracks whether or not this node was daemoned and need to be terminated
        * @return daemoned
        **/
        @JsonProperty("daemoned")
        public Boolean getDaemoned() {
            return daemoned;
        }

        /**
         * Set daemoned
         **/
        public void setDaemoned(Boolean daemoned) {
            this.daemoned = daemoned;
        }

        public NodeStatusQueryParam daemoned(Boolean daemoned) {
            this.daemoned = daemoned;
            return this;
        }

        /**
        * DisplayName is a human readable representation of the node. Unique within a template boundary
        * @return displayName
        **/
        @JsonProperty("displayName")
        public String getDisplayName() {
            return displayName;
        }

        /**
         * Set displayName
         **/
        public void setDisplayName(String displayName) {
            this.displayName = displayName;
        }

        public NodeStatusQueryParam displayName(String displayName) {
            this.displayName = displayName;
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

        public NodeStatusQueryParam estimatedDuration(Integer estimatedDuration) {
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

        public NodeStatusQueryParam finishedAt(OffsetDateTime finishedAt) {
            this.finishedAt = finishedAt;
            return this;
        }

        /**
        * HostNodeName name of the Kubernetes node on which the Pod is running, if applicable
        * @return hostNodeName
        **/
        @JsonProperty("hostNodeName")
        public String getHostNodeName() {
            return hostNodeName;
        }

        /**
         * Set hostNodeName
         **/
        public void setHostNodeName(String hostNodeName) {
            this.hostNodeName = hostNodeName;
        }

        public NodeStatusQueryParam hostNodeName(String hostNodeName) {
            this.hostNodeName = hostNodeName;
            return this;
        }

        /**
        * ID is a unique identifier of a node within the worklow It is implemented as a hash of the node name, which makes the ID deterministic
        * @return id
        **/
        @JsonProperty("id")
        public String getId() {
            return id;
        }

        /**
         * Set id
         **/
        public void setId(String id) {
            this.id = id;
        }

        public NodeStatusQueryParam id(String id) {
            this.id = id;
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

        public NodeStatusQueryParam inputs(Inputs inputs) {
            this.inputs = inputs;
            return this;
        }

        /**
        * Get memoizationStatus
        * @return memoizationStatus
        **/
        @JsonProperty("memoizationStatus")
        public MemoizationStatus getMemoizationStatus() {
            return memoizationStatus;
        }

        /**
         * Set memoizationStatus
         **/
        public void setMemoizationStatus(MemoizationStatus memoizationStatus) {
            this.memoizationStatus = memoizationStatus;
        }

        public NodeStatusQueryParam memoizationStatus(MemoizationStatus memoizationStatus) {
            this.memoizationStatus = memoizationStatus;
            return this;
        }

        /**
        * A human readable message indicating details about why the node is in this condition.
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

        public NodeStatusQueryParam message(String message) {
            this.message = message;
            return this;
        }

        /**
        * Name is unique name in the node tree used to generate the node ID
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

        public NodeStatusQueryParam name(String name) {
            this.name = name;
            return this;
        }

        /**
        * Get nodeFlag
        * @return nodeFlag
        **/
        @JsonProperty("nodeFlag")
        public NodeFlag getNodeFlag() {
            return nodeFlag;
        }

        /**
         * Set nodeFlag
         **/
        public void setNodeFlag(NodeFlag nodeFlag) {
            this.nodeFlag = nodeFlag;
        }

        public NodeStatusQueryParam nodeFlag(NodeFlag nodeFlag) {
            this.nodeFlag = nodeFlag;
            return this;
        }

        /**
        * OutboundNodes tracks the node IDs which are considered \"outbound\" nodes to a template invocation. For every invocation of a template, there are nodes which we considered as \"outbound\". Essentially, these are last nodes in the execution sequence to run, before the template is considered completed. These nodes are then connected as parents to a following step.  In the case of single pod steps (i.e. container, script, resource templates), this list will be nil since the pod itself is already considered the \"outbound\" node. In the case of DAGs, outbound nodes are the \"target\" tasks (tasks with no children). In the case of steps, outbound nodes are all the containers involved in the last step group. NOTE: since templates are composable, the list of outbound nodes are carried upwards when a DAG/steps template invokes another DAG/steps template. In other words, the outbound nodes of a template, will be a superset of the outbound nodes of its last children.
        * @return outboundNodes
        **/
        @JsonProperty("outboundNodes")
        public List<String> getOutboundNodes() {
            return outboundNodes;
        }

        /**
         * Set outboundNodes
         **/
        public void setOutboundNodes(List<String> outboundNodes) {
            this.outboundNodes = outboundNodes;
        }

        public NodeStatusQueryParam outboundNodes(List<String> outboundNodes) {
            this.outboundNodes = outboundNodes;
            return this;
        }
        public NodeStatusQueryParam addOutboundNodesItem(String outboundNodesItem) {
            this.outboundNodes.add(outboundNodesItem);
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

        public NodeStatusQueryParam outputs(Outputs outputs) {
            this.outputs = outputs;
            return this;
        }

        /**
        * Phase a simple, high-level summary of where the node is in its lifecycle. Can be used as a state machine. Will be one of these values \"Pending\", \"Running\" before the node is completed, or \"Succeeded\", \"Skipped\", \"Failed\", \"Error\", or \"Omitted\" as a final state.
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

        public NodeStatusQueryParam phase(String phase) {
            this.phase = phase;
            return this;
        }

        /**
        * PodIP captures the IP of the pod for daemoned steps
        * @return podIP
        **/
        @JsonProperty("podIP")
        public String getPodIP() {
            return podIP;
        }

        /**
         * Set podIP
         **/
        public void setPodIP(String podIP) {
            this.podIP = podIP;
        }

        public NodeStatusQueryParam podIP(String podIP) {
            this.podIP = podIP;
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

        public NodeStatusQueryParam progress(String progress) {
            this.progress = progress;
            return this;
        }

        /**
        * ResourcesDuration is indicative, but not accurate, resource duration. This is populated when the nodes completes.
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

        public NodeStatusQueryParam resourcesDuration(Map<String, Long> resourcesDuration) {
            this.resourcesDuration = resourcesDuration;
            return this;
        }
        public NodeStatusQueryParam putResourcesDurationItem(String key, Long resourcesDurationItem) {
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

        public NodeStatusQueryParam startedAt(OffsetDateTime startedAt) {
            this.startedAt = startedAt;
            return this;
        }

        /**
        * Get synchronizationStatus
        * @return synchronizationStatus
        **/
        @JsonProperty("synchronizationStatus")
        public NodeSynchronizationStatus getSynchronizationStatus() {
            return synchronizationStatus;
        }

        /**
         * Set synchronizationStatus
         **/
        public void setSynchronizationStatus(NodeSynchronizationStatus synchronizationStatus) {
            this.synchronizationStatus = synchronizationStatus;
        }

        public NodeStatusQueryParam synchronizationStatus(NodeSynchronizationStatus synchronizationStatus) {
            this.synchronizationStatus = synchronizationStatus;
            return this;
        }

        /**
        * TemplateName is the template name which this node corresponds to. Not applicable to virtual nodes (e.g. Retry, StepGroup)
        * @return templateName
        **/
        @JsonProperty("templateName")
        public String getTemplateName() {
            return templateName;
        }

        /**
         * Set templateName
         **/
        public void setTemplateName(String templateName) {
            this.templateName = templateName;
        }

        public NodeStatusQueryParam templateName(String templateName) {
            this.templateName = templateName;
            return this;
        }

        /**
        * Get templateRef
        * @return templateRef
        **/
        @JsonProperty("templateRef")
        public TemplateRef getTemplateRef() {
            return templateRef;
        }

        /**
         * Set templateRef
         **/
        public void setTemplateRef(TemplateRef templateRef) {
            this.templateRef = templateRef;
        }

        public NodeStatusQueryParam templateRef(TemplateRef templateRef) {
            this.templateRef = templateRef;
            return this;
        }

        /**
        * TemplateScope is the template scope in which the template of this node was retrieved.
        * @return templateScope
        **/
        @JsonProperty("templateScope")
        public String getTemplateScope() {
            return templateScope;
        }

        /**
         * Set templateScope
         **/
        public void setTemplateScope(String templateScope) {
            this.templateScope = templateScope;
        }

        public NodeStatusQueryParam templateScope(String templateScope) {
            this.templateScope = templateScope;
            return this;
        }

        /**
        * Type indicates type of node
        * @return type
        **/
        @JsonProperty("type")
        public String getType() {
            return type;
        }

        /**
         * Set type
         **/
        public void setType(String type) {
            this.type = type;
        }

        public NodeStatusQueryParam type(String type) {
            this.type = type;
            return this;
        }

        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class NodeStatusQueryParam {\n");

            sb.append("    boundaryID: ").append(toIndentedString(boundaryID)).append("\n");
            sb.append("    children: ").append(toIndentedString(children)).append("\n");
            sb.append("    daemoned: ").append(toIndentedString(daemoned)).append("\n");
            sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
            sb.append("    estimatedDuration: ").append(toIndentedString(estimatedDuration)).append("\n");
            sb.append("    finishedAt: ").append(toIndentedString(finishedAt)).append("\n");
            sb.append("    hostNodeName: ").append(toIndentedString(hostNodeName)).append("\n");
            sb.append("    id: ").append(toIndentedString(id)).append("\n");
            sb.append("    inputs: ").append(toIndentedString(inputs)).append("\n");
            sb.append("    memoizationStatus: ").append(toIndentedString(memoizationStatus)).append("\n");
            sb.append("    message: ").append(toIndentedString(message)).append("\n");
            sb.append("    name: ").append(toIndentedString(name)).append("\n");
            sb.append("    nodeFlag: ").append(toIndentedString(nodeFlag)).append("\n");
            sb.append("    outboundNodes: ").append(toIndentedString(outboundNodes)).append("\n");
            sb.append("    outputs: ").append(toIndentedString(outputs)).append("\n");
            sb.append("    phase: ").append(toIndentedString(phase)).append("\n");
            sb.append("    podIP: ").append(toIndentedString(podIP)).append("\n");
            sb.append("    progress: ").append(toIndentedString(progress)).append("\n");
            sb.append("    resourcesDuration: ").append(toIndentedString(resourcesDuration)).append("\n");
            sb.append("    startedAt: ").append(toIndentedString(startedAt)).append("\n");
            sb.append("    synchronizationStatus: ").append(toIndentedString(synchronizationStatus)).append("\n");
            sb.append("    templateName: ").append(toIndentedString(templateName)).append("\n");
            sb.append("    templateRef: ").append(toIndentedString(templateRef)).append("\n");
            sb.append("    templateScope: ").append(toIndentedString(templateScope)).append("\n");
            sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
