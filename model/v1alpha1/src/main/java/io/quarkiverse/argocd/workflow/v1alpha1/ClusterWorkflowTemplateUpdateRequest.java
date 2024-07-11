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
public class ClusterWorkflowTemplateUpdateRequest  {

    private String name;
    private ClusterWorkflowTemplate template;

    /**
    * DEPRECATED: This field is ignored.
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

    public ClusterWorkflowTemplateUpdateRequest name(String name) {
        this.name = name;
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

    public ClusterWorkflowTemplateUpdateRequest template(ClusterWorkflowTemplate template) {
        this.template = template;
        return this;
    }

    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ClusterWorkflowTemplateUpdateRequest {\n");

        sb.append("    name: ").append(toIndentedString(name)).append("\n");
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
    public static class ClusterWorkflowTemplateUpdateRequestQueryParam  {

        @jakarta.ws.rs.QueryParam("name")
        private String name;
        @jakarta.ws.rs.QueryParam("template")
        private ClusterWorkflowTemplate template;

        /**
        * DEPRECATED: This field is ignored.
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

        public ClusterWorkflowTemplateUpdateRequestQueryParam name(String name) {
            this.name = name;
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

        public ClusterWorkflowTemplateUpdateRequestQueryParam template(ClusterWorkflowTemplate template) {
            this.template = template;
            return this;
        }

        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class ClusterWorkflowTemplateUpdateRequestQueryParam {\n");

            sb.append("    name: ").append(toIndentedString(name)).append("\n");
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
