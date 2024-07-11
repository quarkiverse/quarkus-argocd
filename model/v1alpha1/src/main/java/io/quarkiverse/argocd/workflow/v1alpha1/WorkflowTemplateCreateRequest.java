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
public class WorkflowTemplateCreateRequest  {

    private CreateOptions createOptions;
    private String namespace;
    private WorkflowTemplate template;

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

    public WorkflowTemplateCreateRequest createOptions(CreateOptions createOptions) {
        this.createOptions = createOptions;
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

    public WorkflowTemplateCreateRequest namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    /**
    * Get template
    * @return template
    **/
    @JsonProperty("template")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public WorkflowTemplate getTemplate() {
        return template;
    }

    /**
     * Set template
     **/
    public void setTemplate(WorkflowTemplate template) {
        this.template = template;
    }

    public WorkflowTemplateCreateRequest template(WorkflowTemplate template) {
        this.template = template;
        return this;
    }

    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class WorkflowTemplateCreateRequest {\n");

        sb.append("    createOptions: ").append(toIndentedString(createOptions)).append("\n");
        sb.append("    namespace: ").append(toIndentedString(namespace)).append("\n");
        sb.append("    template: ").append(toIndentedString(template)).append("\n");
        
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
    public static class WorkflowTemplateCreateRequestQueryParam  {

        @jakarta.ws.rs.QueryParam("createOptions")
        private CreateOptions createOptions;
        @jakarta.ws.rs.QueryParam("namespace")
        private String namespace;
        @jakarta.ws.rs.QueryParam("template")
        private WorkflowTemplate template;

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

        public WorkflowTemplateCreateRequestQueryParam createOptions(CreateOptions createOptions) {
            this.createOptions = createOptions;
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

        public WorkflowTemplateCreateRequestQueryParam namespace(String namespace) {
            this.namespace = namespace;
            return this;
        }

        /**
        * Get template
        * @return template
        **/
        @JsonProperty("template")
        public WorkflowTemplate getTemplate() {
            return template;
        }

        /**
         * Set template
         **/
        public void setTemplate(WorkflowTemplate template) {
            this.template = template;
        }

        public WorkflowTemplateCreateRequestQueryParam template(WorkflowTemplate template) {
            this.template = template;
            return this;
        }

        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class WorkflowTemplateCreateRequestQueryParam {\n");

            sb.append("    createOptions: ").append(toIndentedString(createOptions)).append("\n");
            sb.append("    namespace: ").append(toIndentedString(namespace)).append("\n");
            sb.append("    template: ").append(toIndentedString(template)).append("\n");
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
