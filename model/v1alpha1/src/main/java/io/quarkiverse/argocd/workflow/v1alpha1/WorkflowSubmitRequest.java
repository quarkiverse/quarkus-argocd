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
public class WorkflowSubmitRequest  {

    private String namespace;
    private String resourceKind;
    private String resourceName;
    private SubmitOpts submitOptions;

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

    public WorkflowSubmitRequest namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    /**
    * Get resourceKind
    * @return resourceKind
    **/
    @JsonProperty("resourceKind")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public String getResourceKind() {
        return resourceKind;
    }

    /**
     * Set resourceKind
     **/
    public void setResourceKind(String resourceKind) {
        this.resourceKind = resourceKind;
    }

    public WorkflowSubmitRequest resourceKind(String resourceKind) {
        this.resourceKind = resourceKind;
        return this;
    }

    /**
    * Get resourceName
    * @return resourceName
    **/
    @JsonProperty("resourceName")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public String getResourceName() {
        return resourceName;
    }

    /**
     * Set resourceName
     **/
    public void setResourceName(String resourceName) {
        this.resourceName = resourceName;
    }

    public WorkflowSubmitRequest resourceName(String resourceName) {
        this.resourceName = resourceName;
        return this;
    }

    /**
    * Get submitOptions
    * @return submitOptions
    **/
    @JsonProperty("submitOptions")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public SubmitOpts getSubmitOptions() {
        return submitOptions;
    }

    /**
     * Set submitOptions
     **/
    public void setSubmitOptions(SubmitOpts submitOptions) {
        this.submitOptions = submitOptions;
    }

    public WorkflowSubmitRequest submitOptions(SubmitOpts submitOptions) {
        this.submitOptions = submitOptions;
        return this;
    }

    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class WorkflowSubmitRequest {\n");

        sb.append("    namespace: ").append(toIndentedString(namespace)).append("\n");
        sb.append("    resourceKind: ").append(toIndentedString(resourceKind)).append("\n");
        sb.append("    resourceName: ").append(toIndentedString(resourceName)).append("\n");
        sb.append("    submitOptions: ").append(toIndentedString(submitOptions)).append("\n");
        
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
    public static class WorkflowSubmitRequestQueryParam  {

        @jakarta.ws.rs.QueryParam("namespace")
        private String namespace;
        @jakarta.ws.rs.QueryParam("resourceKind")
        private String resourceKind;
        @jakarta.ws.rs.QueryParam("resourceName")
        private String resourceName;
        @jakarta.ws.rs.QueryParam("submitOptions")
        private SubmitOpts submitOptions;

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

        public WorkflowSubmitRequestQueryParam namespace(String namespace) {
            this.namespace = namespace;
            return this;
        }

        /**
        * Get resourceKind
        * @return resourceKind
        **/
        @JsonProperty("resourceKind")
        public String getResourceKind() {
            return resourceKind;
        }

        /**
         * Set resourceKind
         **/
        public void setResourceKind(String resourceKind) {
            this.resourceKind = resourceKind;
        }

        public WorkflowSubmitRequestQueryParam resourceKind(String resourceKind) {
            this.resourceKind = resourceKind;
            return this;
        }

        /**
        * Get resourceName
        * @return resourceName
        **/
        @JsonProperty("resourceName")
        public String getResourceName() {
            return resourceName;
        }

        /**
         * Set resourceName
         **/
        public void setResourceName(String resourceName) {
            this.resourceName = resourceName;
        }

        public WorkflowSubmitRequestQueryParam resourceName(String resourceName) {
            this.resourceName = resourceName;
            return this;
        }

        /**
        * Get submitOptions
        * @return submitOptions
        **/
        @JsonProperty("submitOptions")
        public SubmitOpts getSubmitOptions() {
            return submitOptions;
        }

        /**
         * Set submitOptions
         **/
        public void setSubmitOptions(SubmitOpts submitOptions) {
            this.submitOptions = submitOptions;
        }

        public WorkflowSubmitRequestQueryParam submitOptions(SubmitOpts submitOptions) {
            this.submitOptions = submitOptions;
            return this;
        }

        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class WorkflowSubmitRequestQueryParam {\n");

            sb.append("    namespace: ").append(toIndentedString(namespace)).append("\n");
            sb.append("    resourceKind: ").append(toIndentedString(resourceKind)).append("\n");
            sb.append("    resourceName: ").append(toIndentedString(resourceName)).append("\n");
            sb.append("    submitOptions: ").append(toIndentedString(submitOptions)).append("\n");
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
