package io.quarkiverse.argocd.workflow.v1alpha1;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.Type;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class WorkflowSetRequest  {

    private String message;
    private String name;
    private String namespace;
    private String nodeFieldSelector;
    private String outputParameters;
    private String phase;

    /**
    * Get message
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

    public WorkflowSetRequest message(String message) {
        this.message = message;
        return this;
    }

    /**
    * Get name
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

    public WorkflowSetRequest name(String name) {
        this.name = name;
        return this;
    }

    /**
    * Get namespace
    * @return namespace
    **/
    @JsonProperty("namespace")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public String getNamespace() {
        return namespace;
    }

    /**
     * Set namespace
     **/
    public void setNamespace(String namespace) {
        this.namespace = namespace;
    }

    public WorkflowSetRequest namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    /**
    * Get nodeFieldSelector
    * @return nodeFieldSelector
    **/
    @JsonProperty("nodeFieldSelector")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public String getNodeFieldSelector() {
        return nodeFieldSelector;
    }

    /**
     * Set nodeFieldSelector
     **/
    public void setNodeFieldSelector(String nodeFieldSelector) {
        this.nodeFieldSelector = nodeFieldSelector;
    }

    public WorkflowSetRequest nodeFieldSelector(String nodeFieldSelector) {
        this.nodeFieldSelector = nodeFieldSelector;
        return this;
    }

    /**
    * Get outputParameters
    * @return outputParameters
    **/
    @JsonProperty("outputParameters")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public String getOutputParameters() {
        return outputParameters;
    }

    /**
     * Set outputParameters
     **/
    public void setOutputParameters(String outputParameters) {
        this.outputParameters = outputParameters;
    }

    public WorkflowSetRequest outputParameters(String outputParameters) {
        this.outputParameters = outputParameters;
        return this;
    }

    /**
    * Get phase
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

    public WorkflowSetRequest phase(String phase) {
        this.phase = phase;
        return this;
    }

    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class WorkflowSetRequest {\n");

        sb.append("    message: ").append(toIndentedString(message)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    namespace: ").append(toIndentedString(namespace)).append("\n");
        sb.append("    nodeFieldSelector: ").append(toIndentedString(nodeFieldSelector)).append("\n");
        sb.append("    outputParameters: ").append(toIndentedString(outputParameters)).append("\n");
        sb.append("    phase: ").append(toIndentedString(phase)).append("\n");
        
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
    public static class WorkflowSetRequestQueryParam  {

        @jakarta.ws.rs.QueryParam("message")
        private String message;
        @jakarta.ws.rs.QueryParam("name")
        private String name;
        @jakarta.ws.rs.QueryParam("namespace")
        private String namespace;
        @jakarta.ws.rs.QueryParam("nodeFieldSelector")
        private String nodeFieldSelector;
        @jakarta.ws.rs.QueryParam("outputParameters")
        private String outputParameters;
        @jakarta.ws.rs.QueryParam("phase")
        private String phase;

        /**
        * Get message
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

        public WorkflowSetRequestQueryParam message(String message) {
            this.message = message;
            return this;
        }

        /**
        * Get name
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

        public WorkflowSetRequestQueryParam name(String name) {
            this.name = name;
            return this;
        }

        /**
        * Get namespace
        * @return namespace
        **/
        @JsonProperty("namespace")
        public String getNamespace() {
            return namespace;
        }

        /**
         * Set namespace
         **/
        public void setNamespace(String namespace) {
            this.namespace = namespace;
        }

        public WorkflowSetRequestQueryParam namespace(String namespace) {
            this.namespace = namespace;
            return this;
        }

        /**
        * Get nodeFieldSelector
        * @return nodeFieldSelector
        **/
        @JsonProperty("nodeFieldSelector")
        public String getNodeFieldSelector() {
            return nodeFieldSelector;
        }

        /**
         * Set nodeFieldSelector
         **/
        public void setNodeFieldSelector(String nodeFieldSelector) {
            this.nodeFieldSelector = nodeFieldSelector;
        }

        public WorkflowSetRequestQueryParam nodeFieldSelector(String nodeFieldSelector) {
            this.nodeFieldSelector = nodeFieldSelector;
            return this;
        }

        /**
        * Get outputParameters
        * @return outputParameters
        **/
        @JsonProperty("outputParameters")
        public String getOutputParameters() {
            return outputParameters;
        }

        /**
         * Set outputParameters
         **/
        public void setOutputParameters(String outputParameters) {
            this.outputParameters = outputParameters;
        }

        public WorkflowSetRequestQueryParam outputParameters(String outputParameters) {
            this.outputParameters = outputParameters;
            return this;
        }

        /**
        * Get phase
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

        public WorkflowSetRequestQueryParam phase(String phase) {
            this.phase = phase;
            return this;
        }

        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class WorkflowSetRequestQueryParam {\n");

            sb.append("    message: ").append(toIndentedString(message)).append("\n");
            sb.append("    name: ").append(toIndentedString(name)).append("\n");
            sb.append("    namespace: ").append(toIndentedString(namespace)).append("\n");
            sb.append("    nodeFieldSelector: ").append(toIndentedString(nodeFieldSelector)).append("\n");
            sb.append("    outputParameters: ").append(toIndentedString(outputParameters)).append("\n");
            sb.append("    phase: ").append(toIndentedString(phase)).append("\n");
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