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
  * WorkflowTemplateRef is a reference to a WorkflowTemplate resource.
 **/
public class WorkflowTemplateRef  {

    /**
      * WorkflowTemplateRef is a reference to a WorkflowTemplate resource.
     **/
    private Boolean clusterScope;
    /**
      * WorkflowTemplateRef is a reference to a WorkflowTemplate resource.
     **/
    private String name;

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

    public WorkflowTemplateRef clusterScope(Boolean clusterScope) {
        this.clusterScope = clusterScope;
        return this;
    }

    /**
    * Name is the resource name of the workflow template.
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

    public WorkflowTemplateRef name(String name) {
        this.name = name;
        return this;
    }

    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class WorkflowTemplateRef {\n");

        sb.append("    clusterScope: ").append(toIndentedString(clusterScope)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        
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
      * WorkflowTemplateRef is a reference to a WorkflowTemplate resource.
     **/
    public static class WorkflowTemplateRefQueryParam  {

        /**
          * WorkflowTemplateRef is a reference to a WorkflowTemplate resource.
         **/
        @jakarta.ws.rs.QueryParam("clusterScope")
        private Boolean clusterScope;
        /**
          * WorkflowTemplateRef is a reference to a WorkflowTemplate resource.
         **/
        @jakarta.ws.rs.QueryParam("name")
        private String name;

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

        public WorkflowTemplateRefQueryParam clusterScope(Boolean clusterScope) {
            this.clusterScope = clusterScope;
            return this;
        }

        /**
        * Name is the resource name of the workflow template.
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

        public WorkflowTemplateRefQueryParam name(String name) {
            this.name = name;
            return this;
        }

        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class WorkflowTemplateRefQueryParam {\n");

            sb.append("    clusterScope: ").append(toIndentedString(clusterScope)).append("\n");
            sb.append("    name: ").append(toIndentedString(name)).append("\n");
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