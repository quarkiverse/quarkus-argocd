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
public class NodeResult  {

    private String message;
    private Outputs outputs;
    private String phase;
    private String progress;

    /**
    * Get message
    * @return message
    **/
    @JsonProperty("message")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public String getMessage() {
        return message;
    }

    /**
     * Set message
     **/
    public void setMessage(String message) {
        this.message = message;
    }

    public NodeResult message(String message) {
        this.message = message;
        return this;
    }

    /**
    * Get outputs
    * @return outputs
    **/
    @JsonProperty("outputs")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public Outputs getOutputs() {
        return outputs;
    }

    /**
     * Set outputs
     **/
    public void setOutputs(Outputs outputs) {
        this.outputs = outputs;
    }

    public NodeResult outputs(Outputs outputs) {
        this.outputs = outputs;
        return this;
    }

    /**
    * Get phase
    * @return phase
    **/
    @JsonProperty("phase")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public String getPhase() {
        return phase;
    }

    /**
     * Set phase
     **/
    public void setPhase(String phase) {
        this.phase = phase;
    }

    public NodeResult phase(String phase) {
        this.phase = phase;
        return this;
    }

    /**
    * Get progress
    * @return progress
    **/
    @JsonProperty("progress")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public String getProgress() {
        return progress;
    }

    /**
     * Set progress
     **/
    public void setProgress(String progress) {
        this.progress = progress;
    }

    public NodeResult progress(String progress) {
        this.progress = progress;
        return this;
    }

    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class NodeResult {\n");

        sb.append("    message: ").append(toIndentedString(message)).append("\n");
        sb.append("    outputs: ").append(toIndentedString(outputs)).append("\n");
        sb.append("    phase: ").append(toIndentedString(phase)).append("\n");
        sb.append("    progress: ").append(toIndentedString(progress)).append("\n");
        
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
    public static class NodeResultQueryParam  {

        @jakarta.ws.rs.QueryParam("message")
        private String message;
        @jakarta.ws.rs.QueryParam("outputs")
        private Outputs outputs;
        @jakarta.ws.rs.QueryParam("phase")
        private String phase;
        @jakarta.ws.rs.QueryParam("progress")
        private String progress;

        /**
        * Get message
        * @return message
        **/
        @JsonProperty("message")
        public String getMessage() {
            return message;
        }

        /**
         * Set message
         **/
        public void setMessage(String message) {
            this.message = message;
        }

        public NodeResultQueryParam message(String message) {
            this.message = message;
            return this;
        }

        /**
        * Get outputs
        * @return outputs
        **/
        @JsonProperty("outputs")
        public Outputs getOutputs() {
            return outputs;
        }

        /**
         * Set outputs
         **/
        public void setOutputs(Outputs outputs) {
            this.outputs = outputs;
        }

        public NodeResultQueryParam outputs(Outputs outputs) {
            this.outputs = outputs;
            return this;
        }

        /**
        * Get phase
        * @return phase
        **/
        @JsonProperty("phase")
        public String getPhase() {
            return phase;
        }

        /**
         * Set phase
         **/
        public void setPhase(String phase) {
            this.phase = phase;
        }

        public NodeResultQueryParam phase(String phase) {
            this.phase = phase;
            return this;
        }

        /**
        * Get progress
        * @return progress
        **/
        @JsonProperty("progress")
        public String getProgress() {
            return progress;
        }

        /**
         * Set progress
         **/
        public void setProgress(String progress) {
            this.progress = progress;
        }

        public NodeResultQueryParam progress(String progress) {
            this.progress = progress;
            return this;
        }

        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class NodeResultQueryParam {\n");

            sb.append("    message: ").append(toIndentedString(message)).append("\n");
            sb.append("    outputs: ").append(toIndentedString(outputs)).append("\n");
            sb.append("    phase: ").append(toIndentedString(phase)).append("\n");
            sb.append("    progress: ").append(toIndentedString(progress)).append("\n");
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
