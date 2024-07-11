package io.quarkiverse.argocd.workflow.v1alpha1;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.Type;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class WorkflowRetryRequest  {

    private String name;
    private String namespace;
    private String nodeFieldSelector;
    private List<String> parameters;
    private Boolean restartSuccessful;

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

    public WorkflowRetryRequest name(String name) {
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

    public WorkflowRetryRequest namespace(String namespace) {
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

    public WorkflowRetryRequest nodeFieldSelector(String nodeFieldSelector) {
        this.nodeFieldSelector = nodeFieldSelector;
        return this;
    }

    /**
    * Get parameters
    * @return parameters
    **/
    @JsonProperty("parameters")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public List<String> getParameters() {
        return parameters;
    }

    /**
     * Set parameters
     **/
    public void setParameters(List<String> parameters) {
        this.parameters = parameters;
    }

    public WorkflowRetryRequest parameters(List<String> parameters) {
        this.parameters = parameters;
        return this;
    }
    public WorkflowRetryRequest addParametersItem(String parametersItem) {
        if (this.parameters == null){
            parameters = new ArrayList<>();
        }
        this.parameters.add(parametersItem);
        return this;
    }

    /**
    * Get restartSuccessful
    * @return restartSuccessful
    **/
    @JsonProperty("restartSuccessful")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public Boolean getRestartSuccessful() {
        return restartSuccessful;
    }

    /**
     * Set restartSuccessful
     **/
    public void setRestartSuccessful(Boolean restartSuccessful) {
        this.restartSuccessful = restartSuccessful;
    }

    public WorkflowRetryRequest restartSuccessful(Boolean restartSuccessful) {
        this.restartSuccessful = restartSuccessful;
        return this;
    }

    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class WorkflowRetryRequest {\n");

        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    namespace: ").append(toIndentedString(namespace)).append("\n");
        sb.append("    nodeFieldSelector: ").append(toIndentedString(nodeFieldSelector)).append("\n");
        sb.append("    parameters: ").append(toIndentedString(parameters)).append("\n");
        sb.append("    restartSuccessful: ").append(toIndentedString(restartSuccessful)).append("\n");
        
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
    public static class WorkflowRetryRequestQueryParam  {

        @jakarta.ws.rs.QueryParam("name")
        private String name;
        @jakarta.ws.rs.QueryParam("namespace")
        private String namespace;
        @jakarta.ws.rs.QueryParam("nodeFieldSelector")
        private String nodeFieldSelector;
        @jakarta.ws.rs.QueryParam("parameters")
        private List<String> parameters = null;
        @jakarta.ws.rs.QueryParam("restartSuccessful")
        private Boolean restartSuccessful;

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

        public WorkflowRetryRequestQueryParam name(String name) {
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

        public WorkflowRetryRequestQueryParam namespace(String namespace) {
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

        public WorkflowRetryRequestQueryParam nodeFieldSelector(String nodeFieldSelector) {
            this.nodeFieldSelector = nodeFieldSelector;
            return this;
        }

        /**
        * Get parameters
        * @return parameters
        **/
        @JsonProperty("parameters")
        public List<String> getParameters() {
            return parameters;
        }

        /**
         * Set parameters
         **/
        public void setParameters(List<String> parameters) {
            this.parameters = parameters;
        }

        public WorkflowRetryRequestQueryParam parameters(List<String> parameters) {
            this.parameters = parameters;
            return this;
        }
        public WorkflowRetryRequestQueryParam addParametersItem(String parametersItem) {
            this.parameters.add(parametersItem);
            return this;
        }

        /**
        * Get restartSuccessful
        * @return restartSuccessful
        **/
        @JsonProperty("restartSuccessful")
        public Boolean getRestartSuccessful() {
            return restartSuccessful;
        }

        /**
         * Set restartSuccessful
         **/
        public void setRestartSuccessful(Boolean restartSuccessful) {
            this.restartSuccessful = restartSuccessful;
        }

        public WorkflowRetryRequestQueryParam restartSuccessful(Boolean restartSuccessful) {
            this.restartSuccessful = restartSuccessful;
            return this;
        }

        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class WorkflowRetryRequestQueryParam {\n");

            sb.append("    name: ").append(toIndentedString(name)).append("\n");
            sb.append("    namespace: ").append(toIndentedString(namespace)).append("\n");
            sb.append("    nodeFieldSelector: ").append(toIndentedString(nodeFieldSelector)).append("\n");
            sb.append("    parameters: ").append(toIndentedString(parameters)).append("\n");
            sb.append("    restartSuccessful: ").append(toIndentedString(restartSuccessful)).append("\n");
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