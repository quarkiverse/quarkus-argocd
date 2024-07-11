package io.quarkiverse.argocd.workflow.v1alpha1;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.Type;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
/**
  * Arguments to a template
 **/
public class Arguments  {

    /**
      * Arguments to a template
     **/
    private List<Artifact> artifacts;
    /**
      * Arguments to a template
     **/
    private List<Parameter> parameters;

    /**
    * Artifacts is the list of artifacts to pass to the template or workflow
    * @return artifacts
    **/
    @JsonProperty("artifacts")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public List<Artifact> getArtifacts() {
        return artifacts;
    }

    /**
     * Set artifacts
     **/
    public void setArtifacts(List<Artifact> artifacts) {
        this.artifacts = artifacts;
    }

    public Arguments artifacts(List<Artifact> artifacts) {
        this.artifacts = artifacts;
        return this;
    }
    public Arguments addArtifactsItem(Artifact artifactsItem) {
        if (this.artifacts == null){
            artifacts = new ArrayList<>();
        }
        this.artifacts.add(artifactsItem);
        return this;
    }

    /**
    * Parameters is the list of parameters to pass to the template or workflow
    * @return parameters
    **/
    @JsonProperty("parameters")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public List<Parameter> getParameters() {
        return parameters;
    }

    /**
     * Set parameters
     **/
    public void setParameters(List<Parameter> parameters) {
        this.parameters = parameters;
    }

    public Arguments parameters(List<Parameter> parameters) {
        this.parameters = parameters;
        return this;
    }
    public Arguments addParametersItem(Parameter parametersItem) {
        if (this.parameters == null){
            parameters = new ArrayList<>();
        }
        this.parameters.add(parametersItem);
        return this;
    }

    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Arguments {\n");

        sb.append("    artifacts: ").append(toIndentedString(artifacts)).append("\n");
        sb.append("    parameters: ").append(toIndentedString(parameters)).append("\n");
        
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
      * Arguments to a template
     **/
    public static class ArgumentsQueryParam  {

        /**
          * Arguments to a template
         **/
        @jakarta.ws.rs.QueryParam("artifacts")
        private List<Artifact> artifacts = null;
        /**
          * Arguments to a template
         **/
        @jakarta.ws.rs.QueryParam("parameters")
        private List<Parameter> parameters = null;

        /**
        * Artifacts is the list of artifacts to pass to the template or workflow
        * @return artifacts
        **/
        @JsonProperty("artifacts")
        public List<Artifact> getArtifacts() {
            return artifacts;
        }

        /**
         * Set artifacts
         **/
        public void setArtifacts(List<Artifact> artifacts) {
            this.artifacts = artifacts;
        }

        public ArgumentsQueryParam artifacts(List<Artifact> artifacts) {
            this.artifacts = artifacts;
            return this;
        }
        public ArgumentsQueryParam addArtifactsItem(Artifact artifactsItem) {
            this.artifacts.add(artifactsItem);
            return this;
        }

        /**
        * Parameters is the list of parameters to pass to the template or workflow
        * @return parameters
        **/
        @JsonProperty("parameters")
        public List<Parameter> getParameters() {
            return parameters;
        }

        /**
         * Set parameters
         **/
        public void setParameters(List<Parameter> parameters) {
            this.parameters = parameters;
        }

        public ArgumentsQueryParam parameters(List<Parameter> parameters) {
            this.parameters = parameters;
            return this;
        }
        public ArgumentsQueryParam addParametersItem(Parameter parametersItem) {
            this.parameters.add(parametersItem);
            return this;
        }

        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class ArgumentsQueryParam {\n");

            sb.append("    artifacts: ").append(toIndentedString(artifacts)).append("\n");
            sb.append("    parameters: ").append(toIndentedString(parameters)).append("\n");
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
