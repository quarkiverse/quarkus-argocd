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
  * Outputs hold parameters, artifacts, and results from a step
 **/
public class Outputs  {

    /**
      * Outputs hold parameters, artifacts, and results from a step
     **/
    private List<Artifact> artifacts;
    /**
      * Outputs hold parameters, artifacts, and results from a step
     **/
    private String exitCode;
    /**
      * Outputs hold parameters, artifacts, and results from a step
     **/
    private List<Parameter> parameters;
    /**
      * Outputs hold parameters, artifacts, and results from a step
     **/
    private String result;

    /**
    * Artifacts holds the list of output artifacts produced by a step
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

    public Outputs artifacts(List<Artifact> artifacts) {
        this.artifacts = artifacts;
        return this;
    }
    public Outputs addArtifactsItem(Artifact artifactsItem) {
        if (this.artifacts == null){
            artifacts = new ArrayList<>();
        }
        this.artifacts.add(artifactsItem);
        return this;
    }

    /**
    * ExitCode holds the exit code of a script template
    * @return exitCode
    **/
    @JsonProperty("exitCode")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public String getExitCode() {
        return exitCode;
    }

    /**
     * Set exitCode
     **/
    public void setExitCode(String exitCode) {
        this.exitCode = exitCode;
    }

    public Outputs exitCode(String exitCode) {
        this.exitCode = exitCode;
        return this;
    }

    /**
    * Parameters holds the list of output parameters produced by a step
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

    public Outputs parameters(List<Parameter> parameters) {
        this.parameters = parameters;
        return this;
    }
    public Outputs addParametersItem(Parameter parametersItem) {
        if (this.parameters == null){
            parameters = new ArrayList<>();
        }
        this.parameters.add(parametersItem);
        return this;
    }

    /**
    * Result holds the result (stdout) of a script template
    * @return result
    **/
    @JsonProperty("result")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public String getResult() {
        return result;
    }

    /**
     * Set result
     **/
    public void setResult(String result) {
        this.result = result;
    }

    public Outputs result(String result) {
        this.result = result;
        return this;
    }

    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Outputs {\n");

        sb.append("    artifacts: ").append(toIndentedString(artifacts)).append("\n");
        sb.append("    exitCode: ").append(toIndentedString(exitCode)).append("\n");
        sb.append("    parameters: ").append(toIndentedString(parameters)).append("\n");
        sb.append("    result: ").append(toIndentedString(result)).append("\n");
        
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
      * Outputs hold parameters, artifacts, and results from a step
     **/
    public static class OutputsQueryParam  {

        /**
          * Outputs hold parameters, artifacts, and results from a step
         **/
        @jakarta.ws.rs.QueryParam("artifacts")
        private List<Artifact> artifacts = null;
        /**
          * Outputs hold parameters, artifacts, and results from a step
         **/
        @jakarta.ws.rs.QueryParam("exitCode")
        private String exitCode;
        /**
          * Outputs hold parameters, artifacts, and results from a step
         **/
        @jakarta.ws.rs.QueryParam("parameters")
        private List<Parameter> parameters = null;
        /**
          * Outputs hold parameters, artifacts, and results from a step
         **/
        @jakarta.ws.rs.QueryParam("result")
        private String result;

        /**
        * Artifacts holds the list of output artifacts produced by a step
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

        public OutputsQueryParam artifacts(List<Artifact> artifacts) {
            this.artifacts = artifacts;
            return this;
        }
        public OutputsQueryParam addArtifactsItem(Artifact artifactsItem) {
            this.artifacts.add(artifactsItem);
            return this;
        }

        /**
        * ExitCode holds the exit code of a script template
        * @return exitCode
        **/
        @JsonProperty("exitCode")
        public String getExitCode() {
            return exitCode;
        }

        /**
         * Set exitCode
         **/
        public void setExitCode(String exitCode) {
            this.exitCode = exitCode;
        }

        public OutputsQueryParam exitCode(String exitCode) {
            this.exitCode = exitCode;
            return this;
        }

        /**
        * Parameters holds the list of output parameters produced by a step
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

        public OutputsQueryParam parameters(List<Parameter> parameters) {
            this.parameters = parameters;
            return this;
        }
        public OutputsQueryParam addParametersItem(Parameter parametersItem) {
            this.parameters.add(parametersItem);
            return this;
        }

        /**
        * Result holds the result (stdout) of a script template
        * @return result
        **/
        @JsonProperty("result")
        public String getResult() {
            return result;
        }

        /**
         * Set result
         **/
        public void setResult(String result) {
            this.result = result;
        }

        public OutputsQueryParam result(String result) {
            this.result = result;
            return this;
        }

        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class OutputsQueryParam {\n");

            sb.append("    artifacts: ").append(toIndentedString(artifacts)).append("\n");
            sb.append("    exitCode: ").append(toIndentedString(exitCode)).append("\n");
            sb.append("    parameters: ").append(toIndentedString(parameters)).append("\n");
            sb.append("    result: ").append(toIndentedString(result)).append("\n");
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
