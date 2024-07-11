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
  * Inputs are the mechanism for passing parameters, artifacts, volumes from one template to another
 **/
public class Inputs  {

    /**
      * Inputs are the mechanism for passing parameters, artifacts, volumes from one template to another
     **/
    private List<Artifact> artifacts;
    /**
      * Inputs are the mechanism for passing parameters, artifacts, volumes from one template to another
     **/
    private List<Parameter> parameters;

    /**
    * Artifact are a list of artifacts passed as inputs
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

    public Inputs artifacts(List<Artifact> artifacts) {
        this.artifacts = artifacts;
        return this;
    }
    public Inputs addArtifactsItem(Artifact artifactsItem) {
        if (this.artifacts == null){
            artifacts = new ArrayList<>();
        }
        this.artifacts.add(artifactsItem);
        return this;
    }

    /**
    * Parameters are a list of parameters passed as inputs
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

    public Inputs parameters(List<Parameter> parameters) {
        this.parameters = parameters;
        return this;
    }
    public Inputs addParametersItem(Parameter parametersItem) {
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
        sb.append("class Inputs {\n");

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
      * Inputs are the mechanism for passing parameters, artifacts, volumes from one template to another
     **/
    public static class InputsQueryParam  {

        /**
          * Inputs are the mechanism for passing parameters, artifacts, volumes from one template to another
         **/
        @jakarta.ws.rs.QueryParam("artifacts")
        private List<Artifact> artifacts = null;
        /**
          * Inputs are the mechanism for passing parameters, artifacts, volumes from one template to another
         **/
        @jakarta.ws.rs.QueryParam("parameters")
        private List<Parameter> parameters = null;

        /**
        * Artifact are a list of artifacts passed as inputs
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

        public InputsQueryParam artifacts(List<Artifact> artifacts) {
            this.artifacts = artifacts;
            return this;
        }
        public InputsQueryParam addArtifactsItem(Artifact artifactsItem) {
            this.artifacts.add(artifactsItem);
            return this;
        }

        /**
        * Parameters are a list of parameters passed as inputs
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

        public InputsQueryParam parameters(List<Parameter> parameters) {
            this.parameters = parameters;
            return this;
        }
        public InputsQueryParam addParametersItem(Parameter parametersItem) {
            this.parameters.add(parametersItem);
            return this;
        }

        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class InputsQueryParam {\n");

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
