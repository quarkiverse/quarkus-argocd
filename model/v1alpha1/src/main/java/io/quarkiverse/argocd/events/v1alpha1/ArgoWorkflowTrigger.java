package io.quarkiverse.argocd.events.v1alpha1;

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
public class ArgoWorkflowTrigger  {

    private List<String> args;
    private String operation;
    private List<TriggerParameter> parameters;
    private ArtifactLocation source;

    /**
    * Get args
    * @return args
    **/
    @JsonProperty("args")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public List<String> getArgs() {
        return args;
    }

    /**
     * Set args
     **/
    public void setArgs(List<String> args) {
        this.args = args;
    }

    public ArgoWorkflowTrigger args(List<String> args) {
        this.args = args;
        return this;
    }
    public ArgoWorkflowTrigger addArgsItem(String argsItem) {
        if (this.args == null){
            args = new ArrayList<>();
        }
        this.args.add(argsItem);
        return this;
    }

    /**
    * Get operation
    * @return operation
    **/
    @JsonProperty("operation")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public String getOperation() {
        return operation;
    }

    /**
     * Set operation
     **/
    public void setOperation(String operation) {
        this.operation = operation;
    }

    public ArgoWorkflowTrigger operation(String operation) {
        this.operation = operation;
        return this;
    }

    /**
    * Get parameters
    * @return parameters
    **/
    @JsonProperty("parameters")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public List<TriggerParameter> getParameters() {
        return parameters;
    }

    /**
     * Set parameters
     **/
    public void setParameters(List<TriggerParameter> parameters) {
        this.parameters = parameters;
    }

    public ArgoWorkflowTrigger parameters(List<TriggerParameter> parameters) {
        this.parameters = parameters;
        return this;
    }
    public ArgoWorkflowTrigger addParametersItem(TriggerParameter parametersItem) {
        if (this.parameters == null){
            parameters = new ArrayList<>();
        }
        this.parameters.add(parametersItem);
        return this;
    }

    /**
    * Get source
    * @return source
    **/
    @JsonProperty("source")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public ArtifactLocation getSource() {
        return source;
    }

    /**
     * Set source
     **/
    public void setSource(ArtifactLocation source) {
        this.source = source;
    }

    public ArgoWorkflowTrigger source(ArtifactLocation source) {
        this.source = source;
        return this;
    }

    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ArgoWorkflowTrigger {\n");

        sb.append("    args: ").append(toIndentedString(args)).append("\n");
        sb.append("    operation: ").append(toIndentedString(operation)).append("\n");
        sb.append("    parameters: ").append(toIndentedString(parameters)).append("\n");
        sb.append("    source: ").append(toIndentedString(source)).append("\n");
        
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
    public static class ArgoWorkflowTriggerQueryParam  {

        @jakarta.ws.rs.QueryParam("args")
        private List<String> args = null;
        @jakarta.ws.rs.QueryParam("operation")
        private String operation;
        @jakarta.ws.rs.QueryParam("parameters")
        private List<TriggerParameter> parameters = null;
        @jakarta.ws.rs.QueryParam("source")
        private ArtifactLocation source;

        /**
        * Get args
        * @return args
        **/
        @JsonProperty("args")
        public List<String> getArgs() {
            return args;
        }

        /**
         * Set args
         **/
        public void setArgs(List<String> args) {
            this.args = args;
        }

        public ArgoWorkflowTriggerQueryParam args(List<String> args) {
            this.args = args;
            return this;
        }
        public ArgoWorkflowTriggerQueryParam addArgsItem(String argsItem) {
            this.args.add(argsItem);
            return this;
        }

        /**
        * Get operation
        * @return operation
        **/
        @JsonProperty("operation")
        public String getOperation() {
            return operation;
        }

        /**
         * Set operation
         **/
        public void setOperation(String operation) {
            this.operation = operation;
        }

        public ArgoWorkflowTriggerQueryParam operation(String operation) {
            this.operation = operation;
            return this;
        }

        /**
        * Get parameters
        * @return parameters
        **/
        @JsonProperty("parameters")
        public List<TriggerParameter> getParameters() {
            return parameters;
        }

        /**
         * Set parameters
         **/
        public void setParameters(List<TriggerParameter> parameters) {
            this.parameters = parameters;
        }

        public ArgoWorkflowTriggerQueryParam parameters(List<TriggerParameter> parameters) {
            this.parameters = parameters;
            return this;
        }
        public ArgoWorkflowTriggerQueryParam addParametersItem(TriggerParameter parametersItem) {
            this.parameters.add(parametersItem);
            return this;
        }

        /**
        * Get source
        * @return source
        **/
        @JsonProperty("source")
        public ArtifactLocation getSource() {
            return source;
        }

        /**
         * Set source
         **/
        public void setSource(ArtifactLocation source) {
            this.source = source;
        }

        public ArgoWorkflowTriggerQueryParam source(ArtifactLocation source) {
            this.source = source;
            return this;
        }

        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class ArgoWorkflowTriggerQueryParam {\n");

            sb.append("    args: ").append(toIndentedString(args)).append("\n");
            sb.append("    operation: ").append(toIndentedString(operation)).append("\n");
            sb.append("    parameters: ").append(toIndentedString(parameters)).append("\n");
            sb.append("    source: ").append(toIndentedString(source)).append("\n");
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
