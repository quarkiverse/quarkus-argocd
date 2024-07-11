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
public class WorkflowResubmitRequest  {

    private Boolean memoized;
    private String name;
    private String namespace;
    private List<String> parameters;

    /**
    * Get memoized
    * @return memoized
    **/
    @JsonProperty("memoized")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public Boolean getMemoized() {
        return memoized;
    }

    /**
     * Set memoized
     **/
    public void setMemoized(Boolean memoized) {
        this.memoized = memoized;
    }

    public WorkflowResubmitRequest memoized(Boolean memoized) {
        this.memoized = memoized;
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

    public WorkflowResubmitRequest name(String name) {
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

    public WorkflowResubmitRequest namespace(String namespace) {
        this.namespace = namespace;
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

    public WorkflowResubmitRequest parameters(List<String> parameters) {
        this.parameters = parameters;
        return this;
    }
    public WorkflowResubmitRequest addParametersItem(String parametersItem) {
        if (this.parameters == null){
            parameters = new ArrayList<>();
        }
        this.parameters.add(parametersItem);
        return this;
    }

    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class WorkflowResubmitRequest {\n");

        sb.append("    memoized: ").append(toIndentedString(memoized)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    namespace: ").append(toIndentedString(namespace)).append("\n");
        sb.append("    parameters: ").append(toIndentedString(parameters)).append("\n");
        
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
    public static class WorkflowResubmitRequestQueryParam  {

        @jakarta.ws.rs.QueryParam("memoized")
        private Boolean memoized;
        @jakarta.ws.rs.QueryParam("name")
        private String name;
        @jakarta.ws.rs.QueryParam("namespace")
        private String namespace;
        @jakarta.ws.rs.QueryParam("parameters")
        private List<String> parameters = null;

        /**
        * Get memoized
        * @return memoized
        **/
        @JsonProperty("memoized")
        public Boolean getMemoized() {
            return memoized;
        }

        /**
         * Set memoized
         **/
        public void setMemoized(Boolean memoized) {
            this.memoized = memoized;
        }

        public WorkflowResubmitRequestQueryParam memoized(Boolean memoized) {
            this.memoized = memoized;
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

        public WorkflowResubmitRequestQueryParam name(String name) {
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

        public WorkflowResubmitRequestQueryParam namespace(String namespace) {
            this.namespace = namespace;
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

        public WorkflowResubmitRequestQueryParam parameters(List<String> parameters) {
            this.parameters = parameters;
            return this;
        }
        public WorkflowResubmitRequestQueryParam addParametersItem(String parametersItem) {
            this.parameters.add(parametersItem);
            return this;
        }

        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class WorkflowResubmitRequestQueryParam {\n");

            sb.append("    memoized: ").append(toIndentedString(memoized)).append("\n");
            sb.append("    name: ").append(toIndentedString(name)).append("\n");
            sb.append("    namespace: ").append(toIndentedString(namespace)).append("\n");
            sb.append("    parameters: ").append(toIndentedString(parameters)).append("\n");
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