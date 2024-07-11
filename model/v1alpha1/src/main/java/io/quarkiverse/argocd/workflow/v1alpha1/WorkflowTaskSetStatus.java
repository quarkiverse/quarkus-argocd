package io.quarkiverse.argocd.workflow.v1alpha1;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.Type;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class WorkflowTaskSetStatus  {

    private Map<String, NodeResult> nodes;

    /**
    * Get nodes
    * @return nodes
    **/
    @JsonProperty("nodes")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public Map<String, NodeResult> getNodes() {
        return nodes;
    }

    /**
     * Set nodes
     **/
    public void setNodes(Map<String, NodeResult> nodes) {
        this.nodes = nodes;
    }

    public WorkflowTaskSetStatus nodes(Map<String, NodeResult> nodes) {
        this.nodes = nodes;
        return this;
    }
    public WorkflowTaskSetStatus putNodesItem(String key, NodeResult nodesItem) {
           if (this.nodes == null){
                nodes = new HashMap<>();
            }
        this.nodes.put(key, nodesItem);
        return this;
    }

    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class WorkflowTaskSetStatus {\n");

        sb.append("    nodes: ").append(toIndentedString(nodes)).append("\n");
        
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
    public static class WorkflowTaskSetStatusQueryParam  {

        @jakarta.ws.rs.QueryParam("nodes")
        private Map<String, NodeResult> nodes = null;

        /**
        * Get nodes
        * @return nodes
        **/
        @JsonProperty("nodes")
        public Map<String, NodeResult> getNodes() {
            return nodes;
        }

        /**
         * Set nodes
         **/
        public void setNodes(Map<String, NodeResult> nodes) {
            this.nodes = nodes;
        }

        public WorkflowTaskSetStatusQueryParam nodes(Map<String, NodeResult> nodes) {
            this.nodes = nodes;
            return this;
        }
        public WorkflowTaskSetStatusQueryParam putNodesItem(String key, NodeResult nodesItem) {
            this.nodes.put(key, nodesItem);
            return this;
        }

        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class WorkflowTaskSetStatusQueryParam {\n");

            sb.append("    nodes: ").append(toIndentedString(nodes)).append("\n");
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
