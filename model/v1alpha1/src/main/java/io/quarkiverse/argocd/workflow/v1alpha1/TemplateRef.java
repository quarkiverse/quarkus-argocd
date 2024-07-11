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
/**
  * TemplateRef is a reference of template resource.
 **/
public class TemplateRef  {

    /**
      * TemplateRef is a reference of template resource.
     **/
    private Boolean clusterScope;
    /**
      * TemplateRef is a reference of template resource.
     **/
    private String name;
    /**
      * TemplateRef is a reference of template resource.
     **/
    private String template;

    /**
    * ClusterScope indicates the referred template is cluster scoped (i.e. a ClusterWorkflowTemplate).
    * @return clusterScope
    **/
    @JsonProperty("clusterScope")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public Boolean getClusterScope() {
        return clusterScope;
    }

    /**
     * Set clusterScope
     **/
    public void setClusterScope(Boolean clusterScope) {
        this.clusterScope = clusterScope;
    }

    public TemplateRef clusterScope(Boolean clusterScope) {
        this.clusterScope = clusterScope;
        return this;
    }

    /**
    * Name is the resource name of the template.
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

    public TemplateRef name(String name) {
        this.name = name;
        return this;
    }

    /**
    * Template is the name of referred template in the resource.
    * @return template
    **/
    @JsonProperty("template")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public String getTemplate() {
        return template;
    }

    /**
     * Set template
     **/
    public void setTemplate(String template) {
        this.template = template;
    }

    public TemplateRef template(String template) {
        this.template = template;
        return this;
    }

    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TemplateRef {\n");

        sb.append("    clusterScope: ").append(toIndentedString(clusterScope)).append("\n");
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
    /**
      * TemplateRef is a reference of template resource.
     **/
    public static class TemplateRefQueryParam  {

        /**
          * TemplateRef is a reference of template resource.
         **/
        @jakarta.ws.rs.QueryParam("clusterScope")
        private Boolean clusterScope;
        /**
          * TemplateRef is a reference of template resource.
         **/
        @jakarta.ws.rs.QueryParam("name")
        private String name;
        /**
          * TemplateRef is a reference of template resource.
         **/
        @jakarta.ws.rs.QueryParam("template")
        private String template;

        /**
        * ClusterScope indicates the referred template is cluster scoped (i.e. a ClusterWorkflowTemplate).
        * @return clusterScope
        **/
        @JsonProperty("clusterScope")
        public Boolean getClusterScope() {
            return clusterScope;
        }

        /**
         * Set clusterScope
         **/
        public void setClusterScope(Boolean clusterScope) {
            this.clusterScope = clusterScope;
        }

        public TemplateRefQueryParam clusterScope(Boolean clusterScope) {
            this.clusterScope = clusterScope;
            return this;
        }

        /**
        * Name is the resource name of the template.
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

        public TemplateRefQueryParam name(String name) {
            this.name = name;
            return this;
        }

        /**
        * Template is the name of referred template in the resource.
        * @return template
        **/
        @JsonProperty("template")
        public String getTemplate() {
            return template;
        }

        /**
         * Set template
         **/
        public void setTemplate(String template) {
            this.template = template;
        }

        public TemplateRefQueryParam template(String template) {
            this.template = template;
            return this;
        }

        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class TemplateRefQueryParam {\n");

            sb.append("    clusterScope: ").append(toIndentedString(clusterScope)).append("\n");
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