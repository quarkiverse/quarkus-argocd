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
public class CreateCronWorkflowRequest  {

    private CreateOptions createOptions;
    private CronWorkflow cronWorkflow;
    private String namespace;

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

    public CreateCronWorkflowRequest createOptions(CreateOptions createOptions) {
        this.createOptions = createOptions;
        return this;
    }

    /**
    * Get cronWorkflow
    * @return cronWorkflow
    **/
    @JsonProperty("cronWorkflow")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public CronWorkflow getCronWorkflow() {
        return cronWorkflow;
    }

    /**
     * Set cronWorkflow
     **/
    public void setCronWorkflow(CronWorkflow cronWorkflow) {
        this.cronWorkflow = cronWorkflow;
    }

    public CreateCronWorkflowRequest cronWorkflow(CronWorkflow cronWorkflow) {
        this.cronWorkflow = cronWorkflow;
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

    public CreateCronWorkflowRequest namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateCronWorkflowRequest {\n");

        sb.append("    createOptions: ").append(toIndentedString(createOptions)).append("\n");
        sb.append("    cronWorkflow: ").append(toIndentedString(cronWorkflow)).append("\n");
        sb.append("    namespace: ").append(toIndentedString(namespace)).append("\n");
        
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
    public static class CreateCronWorkflowRequestQueryParam  {

        @jakarta.ws.rs.QueryParam("createOptions")
        private CreateOptions createOptions;
        @jakarta.ws.rs.QueryParam("cronWorkflow")
        private CronWorkflow cronWorkflow;
        @jakarta.ws.rs.QueryParam("namespace")
        private String namespace;

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

        public CreateCronWorkflowRequestQueryParam createOptions(CreateOptions createOptions) {
            this.createOptions = createOptions;
            return this;
        }

        /**
        * Get cronWorkflow
        * @return cronWorkflow
        **/
        @JsonProperty("cronWorkflow")
        public CronWorkflow getCronWorkflow() {
            return cronWorkflow;
        }

        /**
         * Set cronWorkflow
         **/
        public void setCronWorkflow(CronWorkflow cronWorkflow) {
            this.cronWorkflow = cronWorkflow;
        }

        public CreateCronWorkflowRequestQueryParam cronWorkflow(CronWorkflow cronWorkflow) {
            this.cronWorkflow = cronWorkflow;
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

        public CreateCronWorkflowRequestQueryParam namespace(String namespace) {
            this.namespace = namespace;
            return this;
        }

        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class CreateCronWorkflowRequestQueryParam {\n");

            sb.append("    createOptions: ").append(toIndentedString(createOptions)).append("\n");
            sb.append("    cronWorkflow: ").append(toIndentedString(cronWorkflow)).append("\n");
            sb.append("    namespace: ").append(toIndentedString(namespace)).append("\n");
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
