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
public class ClusterWorkflowTemplateLintRequest  {

    private CreateOptions createOptions;
    private ClusterWorkflowTemplate template;

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

    public ClusterWorkflowTemplateLintRequest createOptions(CreateOptions createOptions) {
        this.createOptions = createOptions;
        return this;
    }

    /**
    * Get template
    * @return template
    **/
    @JsonProperty("template")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public ClusterWorkflowTemplate getTemplate() {
        return template;
    }

    /**
     * Set template
     **/
    public void setTemplate(ClusterWorkflowTemplate template) {
        this.template = template;
    }

    public ClusterWorkflowTemplateLintRequest template(ClusterWorkflowTemplate template) {
        this.template = template;
        return this;
    }

    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ClusterWorkflowTemplateLintRequest {\n");

        sb.append("    createOptions: ").append(toIndentedString(createOptions)).append("\n");
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
    public static class ClusterWorkflowTemplateLintRequestQueryParam  {

        @jakarta.ws.rs.QueryParam("createOptions")
        private CreateOptions createOptions;
        @jakarta.ws.rs.QueryParam("template")
        private ClusterWorkflowTemplate template;

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

        public ClusterWorkflowTemplateLintRequestQueryParam createOptions(CreateOptions createOptions) {
            this.createOptions = createOptions;
            return this;
        }

        /**
        * Get template
        * @return template
        **/
        @JsonProperty("template")
        public ClusterWorkflowTemplate getTemplate() {
            return template;
        }

        /**
         * Set template
         **/
        public void setTemplate(ClusterWorkflowTemplate template) {
            this.template = template;
        }

        public ClusterWorkflowTemplateLintRequestQueryParam template(ClusterWorkflowTemplate template) {
            this.template = template;
            return this;
        }

        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class ClusterWorkflowTemplateLintRequestQueryParam {\n");

            sb.append("    createOptions: ").append(toIndentedString(createOptions)).append("\n");
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
