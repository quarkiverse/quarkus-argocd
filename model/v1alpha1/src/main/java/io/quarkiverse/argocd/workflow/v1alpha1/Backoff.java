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
  * Backoff is a backoff strategy to use within retryStrategy
 **/
public class Backoff  {

    /**
      * Backoff is a backoff strategy to use within retryStrategy
     **/
    private String duration;
    /**
      * Backoff is a backoff strategy to use within retryStrategy
     **/
    private String factor;
    /**
      * Backoff is a backoff strategy to use within retryStrategy
     **/
    private String maxDuration;

    /**
    * Duration is the amount to back off. Default unit is seconds, but could also be a duration (e.g. \"2m\", \"1h\")
    * @return duration
    **/
    @JsonProperty("duration")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public String getDuration() {
        return duration;
    }

    /**
     * Set duration
     **/
    public void setDuration(String duration) {
        this.duration = duration;
    }

    public Backoff duration(String duration) {
        this.duration = duration;
        return this;
    }

    /**
    * Get factor
    * @return factor
    **/
    @JsonProperty("factor")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public String getFactor() {
        return factor;
    }

    /**
     * Set factor
     **/
    public void setFactor(String factor) {
        this.factor = factor;
    }

    public Backoff factor(String factor) {
        this.factor = factor;
        return this;
    }

    /**
    * MaxDuration is the maximum amount of time allowed for a workflow in the backoff strategy. It is important to note that if the workflow template includes activeDeadlineSeconds, the pod's deadline is initially set with activeDeadlineSeconds. However, when the workflow fails, the pod's deadline is then overridden by maxDuration. This ensures that the workflow does not exceed the specified maximum duration when retries are involved.
    * @return maxDuration
    **/
    @JsonProperty("maxDuration")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public String getMaxDuration() {
        return maxDuration;
    }

    /**
     * Set maxDuration
     **/
    public void setMaxDuration(String maxDuration) {
        this.maxDuration = maxDuration;
    }

    public Backoff maxDuration(String maxDuration) {
        this.maxDuration = maxDuration;
        return this;
    }

    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Backoff {\n");

        sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
        sb.append("    factor: ").append(toIndentedString(factor)).append("\n");
        sb.append("    maxDuration: ").append(toIndentedString(maxDuration)).append("\n");
        
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
      * Backoff is a backoff strategy to use within retryStrategy
     **/
    public static class BackoffQueryParam  {

        /**
          * Backoff is a backoff strategy to use within retryStrategy
         **/
        @jakarta.ws.rs.QueryParam("duration")
        private String duration;
        /**
          * Backoff is a backoff strategy to use within retryStrategy
         **/
        @jakarta.ws.rs.QueryParam("factor")
        private String factor;
        /**
          * Backoff is a backoff strategy to use within retryStrategy
         **/
        @jakarta.ws.rs.QueryParam("maxDuration")
        private String maxDuration;

        /**
        * Duration is the amount to back off. Default unit is seconds, but could also be a duration (e.g. \"2m\", \"1h\")
        * @return duration
        **/
        @JsonProperty("duration")
        public String getDuration() {
            return duration;
        }

        /**
         * Set duration
         **/
        public void setDuration(String duration) {
            this.duration = duration;
        }

        public BackoffQueryParam duration(String duration) {
            this.duration = duration;
            return this;
        }

        /**
        * Get factor
        * @return factor
        **/
        @JsonProperty("factor")
        public String getFactor() {
            return factor;
        }

        /**
         * Set factor
         **/
        public void setFactor(String factor) {
            this.factor = factor;
        }

        public BackoffQueryParam factor(String factor) {
            this.factor = factor;
            return this;
        }

        /**
        * MaxDuration is the maximum amount of time allowed for a workflow in the backoff strategy. It is important to note that if the workflow template includes activeDeadlineSeconds, the pod's deadline is initially set with activeDeadlineSeconds. However, when the workflow fails, the pod's deadline is then overridden by maxDuration. This ensures that the workflow does not exceed the specified maximum duration when retries are involved.
        * @return maxDuration
        **/
        @JsonProperty("maxDuration")
        public String getMaxDuration() {
            return maxDuration;
        }

        /**
         * Set maxDuration
         **/
        public void setMaxDuration(String maxDuration) {
            this.maxDuration = maxDuration;
        }

        public BackoffQueryParam maxDuration(String maxDuration) {
            this.maxDuration = maxDuration;
            return this;
        }

        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class BackoffQueryParam {\n");

            sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
            sb.append("    factor: ").append(toIndentedString(factor)).append("\n");
            sb.append("    maxDuration: ").append(toIndentedString(maxDuration)).append("\n");
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