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
public class StandardK8STrigger  {

    private Boolean liveObject;
    private String operation;
    private List<TriggerParameter> parameters;
    private String patchStrategy;
    private ArtifactLocation source;

    /**
    * Get liveObject
    * @return liveObject
    **/
    @JsonProperty("liveObject")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public Boolean getLiveObject() {
        return liveObject;
    }

    /**
     * Set liveObject
     **/
    public void setLiveObject(Boolean liveObject) {
        this.liveObject = liveObject;
    }

    public StandardK8STrigger liveObject(Boolean liveObject) {
        this.liveObject = liveObject;
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

    public StandardK8STrigger operation(String operation) {
        this.operation = operation;
        return this;
    }

    /**
    * Parameters is the list of parameters that is applied to resolved K8s trigger object.
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

    public StandardK8STrigger parameters(List<TriggerParameter> parameters) {
        this.parameters = parameters;
        return this;
    }
    public StandardK8STrigger addParametersItem(TriggerParameter parametersItem) {
        if (this.parameters == null){
            parameters = new ArrayList<>();
        }
        this.parameters.add(parametersItem);
        return this;
    }

    /**
    * Get patchStrategy
    * @return patchStrategy
    **/
    @JsonProperty("patchStrategy")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public String getPatchStrategy() {
        return patchStrategy;
    }

    /**
     * Set patchStrategy
     **/
    public void setPatchStrategy(String patchStrategy) {
        this.patchStrategy = patchStrategy;
    }

    public StandardK8STrigger patchStrategy(String patchStrategy) {
        this.patchStrategy = patchStrategy;
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

    public StandardK8STrigger source(ArtifactLocation source) {
        this.source = source;
        return this;
    }

    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class StandardK8STrigger {\n");

        sb.append("    liveObject: ").append(toIndentedString(liveObject)).append("\n");
        sb.append("    operation: ").append(toIndentedString(operation)).append("\n");
        sb.append("    parameters: ").append(toIndentedString(parameters)).append("\n");
        sb.append("    patchStrategy: ").append(toIndentedString(patchStrategy)).append("\n");
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
    public static class StandardK8STriggerQueryParam  {

        @jakarta.ws.rs.QueryParam("liveObject")
        private Boolean liveObject;
        @jakarta.ws.rs.QueryParam("operation")
        private String operation;
        @jakarta.ws.rs.QueryParam("parameters")
        private List<TriggerParameter> parameters = null;
        @jakarta.ws.rs.QueryParam("patchStrategy")
        private String patchStrategy;
        @jakarta.ws.rs.QueryParam("source")
        private ArtifactLocation source;

        /**
        * Get liveObject
        * @return liveObject
        **/
        @JsonProperty("liveObject")
        public Boolean getLiveObject() {
            return liveObject;
        }

        /**
         * Set liveObject
         **/
        public void setLiveObject(Boolean liveObject) {
            this.liveObject = liveObject;
        }

        public StandardK8STriggerQueryParam liveObject(Boolean liveObject) {
            this.liveObject = liveObject;
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

        public StandardK8STriggerQueryParam operation(String operation) {
            this.operation = operation;
            return this;
        }

        /**
        * Parameters is the list of parameters that is applied to resolved K8s trigger object.
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

        public StandardK8STriggerQueryParam parameters(List<TriggerParameter> parameters) {
            this.parameters = parameters;
            return this;
        }
        public StandardK8STriggerQueryParam addParametersItem(TriggerParameter parametersItem) {
            this.parameters.add(parametersItem);
            return this;
        }

        /**
        * Get patchStrategy
        * @return patchStrategy
        **/
        @JsonProperty("patchStrategy")
        public String getPatchStrategy() {
            return patchStrategy;
        }

        /**
         * Set patchStrategy
         **/
        public void setPatchStrategy(String patchStrategy) {
            this.patchStrategy = patchStrategy;
        }

        public StandardK8STriggerQueryParam patchStrategy(String patchStrategy) {
            this.patchStrategy = patchStrategy;
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

        public StandardK8STriggerQueryParam source(ArtifactLocation source) {
            this.source = source;
            return this;
        }

        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class StandardK8STriggerQueryParam {\n");

            sb.append("    liveObject: ").append(toIndentedString(liveObject)).append("\n");
            sb.append("    operation: ").append(toIndentedString(operation)).append("\n");
            sb.append("    parameters: ").append(toIndentedString(parameters)).append("\n");
            sb.append("    patchStrategy: ").append(toIndentedString(patchStrategy)).append("\n");
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
