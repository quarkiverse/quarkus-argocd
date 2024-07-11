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
  * ContinueOn defines if a workflow should continue even if a task or step fails/errors. It can be specified if the workflow should continue when the pod errors, fails or both.
 **/
public class ContinueOn  {

    /**
      * ContinueOn defines if a workflow should continue even if a task or step fails/errors. It can be specified if the workflow should continue when the pod errors, fails or both.
     **/
    private Boolean error;
    /**
      * ContinueOn defines if a workflow should continue even if a task or step fails/errors. It can be specified if the workflow should continue when the pod errors, fails or both.
     **/
    private Boolean failed;

    /**
    * Get error
    * @return error
    **/
    @JsonProperty("error")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public Boolean getError() {
        return error;
    }

    /**
     * Set error
     **/
    public void setError(Boolean error) {
        this.error = error;
    }

    public ContinueOn error(Boolean error) {
        this.error = error;
        return this;
    }

    /**
    * Get failed
    * @return failed
    **/
    @JsonProperty("failed")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public Boolean getFailed() {
        return failed;
    }

    /**
     * Set failed
     **/
    public void setFailed(Boolean failed) {
        this.failed = failed;
    }

    public ContinueOn failed(Boolean failed) {
        this.failed = failed;
        return this;
    }

    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ContinueOn {\n");

        sb.append("    error: ").append(toIndentedString(error)).append("\n");
        sb.append("    failed: ").append(toIndentedString(failed)).append("\n");
        
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
      * ContinueOn defines if a workflow should continue even if a task or step fails/errors. It can be specified if the workflow should continue when the pod errors, fails or both.
     **/
    public static class ContinueOnQueryParam  {

        /**
          * ContinueOn defines if a workflow should continue even if a task or step fails/errors. It can be specified if the workflow should continue when the pod errors, fails or both.
         **/
        @jakarta.ws.rs.QueryParam("error")
        private Boolean error;
        /**
          * ContinueOn defines if a workflow should continue even if a task or step fails/errors. It can be specified if the workflow should continue when the pod errors, fails or both.
         **/
        @jakarta.ws.rs.QueryParam("failed")
        private Boolean failed;

        /**
        * Get error
        * @return error
        **/
        @JsonProperty("error")
        public Boolean getError() {
            return error;
        }

        /**
         * Set error
         **/
        public void setError(Boolean error) {
            this.error = error;
        }

        public ContinueOnQueryParam error(Boolean error) {
            this.error = error;
            return this;
        }

        /**
        * Get failed
        * @return failed
        **/
        @JsonProperty("failed")
        public Boolean getFailed() {
            return failed;
        }

        /**
         * Set failed
         **/
        public void setFailed(Boolean failed) {
            this.failed = failed;
        }

        public ContinueOnQueryParam failed(Boolean failed) {
            this.failed = failed;
            return this;
        }

        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class ContinueOnQueryParam {\n");

            sb.append("    error: ").append(toIndentedString(error)).append("\n");
            sb.append("    failed: ").append(toIndentedString(failed)).append("\n");
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