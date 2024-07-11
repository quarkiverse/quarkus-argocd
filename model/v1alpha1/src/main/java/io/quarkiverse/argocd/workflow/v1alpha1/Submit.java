package io.quarkiverse.argocd.workflow.v1alpha1;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.fabric8.kubernetes.api.model.ObjectMeta;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.Type;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Submit  {

    private Arguments arguments;
    private ObjectMeta metadata;
    private WorkflowTemplateRef workflowTemplateRef;

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

    public Submit arguments(Arguments arguments) {
        this.arguments = arguments;
        return this;
    }

    /**
    * Get metadata
    * @return metadata
    **/
    @JsonProperty("metadata")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public ObjectMeta getMetadata() {
        return metadata;
    }

    /**
     * Set metadata
     **/
    public void setMetadata(ObjectMeta metadata) {
        this.metadata = metadata;
    }

    public Submit metadata(ObjectMeta metadata) {
        this.metadata = metadata;
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

    public Submit workflowTemplateRef(WorkflowTemplateRef workflowTemplateRef) {
        this.workflowTemplateRef = workflowTemplateRef;
        return this;
    }

    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Submit {\n");

        sb.append("    arguments: ").append(toIndentedString(arguments)).append("\n");
        sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
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
    public static class SubmitQueryParam  {

        @jakarta.ws.rs.QueryParam("arguments")
        private Arguments arguments;
        @jakarta.ws.rs.QueryParam("metadata")
        private ObjectMeta metadata;
        @jakarta.ws.rs.QueryParam("workflowTemplateRef")
        private WorkflowTemplateRef workflowTemplateRef;

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

        public SubmitQueryParam arguments(Arguments arguments) {
            this.arguments = arguments;
            return this;
        }

        /**
        * Get metadata
        * @return metadata
        **/
        @JsonProperty("metadata")
        public ObjectMeta getMetadata() {
            return metadata;
        }

        /**
         * Set metadata
         **/
        public void setMetadata(ObjectMeta metadata) {
            this.metadata = metadata;
        }

        public SubmitQueryParam metadata(ObjectMeta metadata) {
            this.metadata = metadata;
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

        public SubmitQueryParam workflowTemplateRef(WorkflowTemplateRef workflowTemplateRef) {
            this.workflowTemplateRef = workflowTemplateRef;
            return this;
        }

        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class SubmitQueryParam {\n");

            sb.append("    arguments: ").append(toIndentedString(arguments)).append("\n");
            sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
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
