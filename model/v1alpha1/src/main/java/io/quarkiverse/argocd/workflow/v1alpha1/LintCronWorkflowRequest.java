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
public class LintCronWorkflowRequest  {

    private CronWorkflow cronWorkflow;
    private String namespace;

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

    public LintCronWorkflowRequest cronWorkflow(CronWorkflow cronWorkflow) {
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

    public LintCronWorkflowRequest namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class LintCronWorkflowRequest {\n");

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
    public static class LintCronWorkflowRequestQueryParam  {

        @jakarta.ws.rs.QueryParam("cronWorkflow")
        private CronWorkflow cronWorkflow;
        @jakarta.ws.rs.QueryParam("namespace")
        private String namespace;

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

        public LintCronWorkflowRequestQueryParam cronWorkflow(CronWorkflow cronWorkflow) {
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

        public LintCronWorkflowRequestQueryParam namespace(String namespace) {
            this.namespace = namespace;
            return this;
        }

        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class LintCronWorkflowRequestQueryParam {\n");

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
