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
public class WorkflowLintRequest  {

    private String namespace;
    private Workflow workflow;

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

    public WorkflowLintRequest namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    /**
    * Get workflow
    * @return workflow
    **/
    @JsonProperty("workflow")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public Workflow getWorkflow() {
        return workflow;
    }

    /**
     * Set workflow
     **/
    public void setWorkflow(Workflow workflow) {
        this.workflow = workflow;
    }

    public WorkflowLintRequest workflow(Workflow workflow) {
        this.workflow = workflow;
        return this;
    }

    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class WorkflowLintRequest {\n");

        sb.append("    namespace: ").append(toIndentedString(namespace)).append("\n");
        sb.append("    workflow: ").append(toIndentedString(workflow)).append("\n");
        
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
    public static class WorkflowLintRequestQueryParam  {

        @jakarta.ws.rs.QueryParam("namespace")
        private String namespace;
        @jakarta.ws.rs.QueryParam("workflow")
        private Workflow workflow;

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

        public WorkflowLintRequestQueryParam namespace(String namespace) {
            this.namespace = namespace;
            return this;
        }

        /**
        * Get workflow
        * @return workflow
        **/
        @JsonProperty("workflow")
        public Workflow getWorkflow() {
            return workflow;
        }

        /**
         * Set workflow
         **/
        public void setWorkflow(Workflow workflow) {
            this.workflow = workflow;
        }

        public WorkflowLintRequestQueryParam workflow(Workflow workflow) {
            this.workflow = workflow;
            return this;
        }

        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class WorkflowLintRequestQueryParam {\n");

            sb.append("    namespace: ").append(toIndentedString(namespace)).append("\n");
            sb.append("    workflow: ").append(toIndentedString(workflow)).append("\n");
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
