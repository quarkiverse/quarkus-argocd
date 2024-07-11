package io.quarkiverse.argocd.workflow.v1alpha1;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;

import io.fabric8.kubernetes.api.model.CreateOptions;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.Type;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class WorkflowCreateRequest  {

    private CreateOptions createOptions;
    private String instanceID;
    private String namespace;
    private Boolean serverDryRun;
    private Workflow workflow;

    /**
    * Get createOptions
    * @return createOptions
    **/
    @JsonProperty("createOptions")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public CreateOptions getCreateOptions() {
        return createOptions;
    }

    /**
     * Set createOptions
     **/
    public void setCreateOptions(CreateOptions createOptions) {
        this.createOptions = createOptions;
    }

    public WorkflowCreateRequest createOptions(CreateOptions createOptions) {
        this.createOptions = createOptions;
        return this;
    }

    /**
    * This field is no longer used.
    * @return instanceID
    **/
    @JsonProperty("instanceID")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public String getInstanceID() {
        return instanceID;
    }

    /**
     * Set instanceID
     **/
    public void setInstanceID(String instanceID) {
        this.instanceID = instanceID;
    }

    public WorkflowCreateRequest instanceID(String instanceID) {
        this.instanceID = instanceID;
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

    public WorkflowCreateRequest namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    /**
    * Get serverDryRun
    * @return serverDryRun
    **/
    @JsonProperty("serverDryRun")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public Boolean getServerDryRun() {
        return serverDryRun;
    }

    /**
     * Set serverDryRun
     **/
    public void setServerDryRun(Boolean serverDryRun) {
        this.serverDryRun = serverDryRun;
    }

    public WorkflowCreateRequest serverDryRun(Boolean serverDryRun) {
        this.serverDryRun = serverDryRun;
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

    public WorkflowCreateRequest workflow(Workflow workflow) {
        this.workflow = workflow;
        return this;
    }

    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class WorkflowCreateRequest {\n");

        sb.append("    createOptions: ").append(toIndentedString(createOptions)).append("\n");
        sb.append("    instanceID: ").append(toIndentedString(instanceID)).append("\n");
        sb.append("    namespace: ").append(toIndentedString(namespace)).append("\n");
        sb.append("    serverDryRun: ").append(toIndentedString(serverDryRun)).append("\n");
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
    public static class WorkflowCreateRequestQueryParam  {

        @jakarta.ws.rs.QueryParam("createOptions")
        private CreateOptions createOptions;
        @jakarta.ws.rs.QueryParam("instanceID")
        private String instanceID;
        @jakarta.ws.rs.QueryParam("namespace")
        private String namespace;
        @jakarta.ws.rs.QueryParam("serverDryRun")
        private Boolean serverDryRun;
        @jakarta.ws.rs.QueryParam("workflow")
        private Workflow workflow;

        /**
        * Get createOptions
        * @return createOptions
        **/
        @JsonProperty("createOptions")
        public CreateOptions getCreateOptions() {
            return createOptions;
        }

        /**
         * Set createOptions
         **/
        public void setCreateOptions(CreateOptions createOptions) {
            this.createOptions = createOptions;
        }

        public WorkflowCreateRequestQueryParam createOptions(CreateOptions createOptions) {
            this.createOptions = createOptions;
            return this;
        }

        /**
        * This field is no longer used.
        * @return instanceID
        **/
        @JsonProperty("instanceID")
        public String getInstanceID() {
            return instanceID;
        }

        /**
         * Set instanceID
         **/
        public void setInstanceID(String instanceID) {
            this.instanceID = instanceID;
        }

        public WorkflowCreateRequestQueryParam instanceID(String instanceID) {
            this.instanceID = instanceID;
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

        public WorkflowCreateRequestQueryParam namespace(String namespace) {
            this.namespace = namespace;
            return this;
        }

        /**
        * Get serverDryRun
        * @return serverDryRun
        **/
        @JsonProperty("serverDryRun")
        public Boolean getServerDryRun() {
            return serverDryRun;
        }

        /**
         * Set serverDryRun
         **/
        public void setServerDryRun(Boolean serverDryRun) {
            this.serverDryRun = serverDryRun;
        }

        public WorkflowCreateRequestQueryParam serverDryRun(Boolean serverDryRun) {
            this.serverDryRun = serverDryRun;
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

        public WorkflowCreateRequestQueryParam workflow(Workflow workflow) {
            this.workflow = workflow;
            return this;
        }

        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class WorkflowCreateRequestQueryParam {\n");

            sb.append("    createOptions: ").append(toIndentedString(createOptions)).append("\n");
            sb.append("    instanceID: ").append(toIndentedString(instanceID)).append("\n");
            sb.append("    namespace: ").append(toIndentedString(namespace)).append("\n");
            sb.append("    serverDryRun: ").append(toIndentedString(serverDryRun)).append("\n");
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
