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
  * ContainerSetRetryStrategy provides controls on how to retry a container set
 **/
public class ContainerSetRetryStrategy  {

    /**
      * ContainerSetRetryStrategy provides controls on how to retry a container set
     **/
    private String duration;
    /**
      * ContainerSetRetryStrategy provides controls on how to retry a container set
     **/
    private String retries;

    /**
    * Duration is the time between each retry, examples values are \"300ms\", \"1s\" or \"5m\". Valid time units are \"ns\", \"us\" (or \"µs\"), \"ms\", \"s\", \"m\", \"h\".
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

    public ContainerSetRetryStrategy duration(String duration) {
        this.duration = duration;
        return this;
    }

    /**
    * Get retries
    * @return retries
    **/
    @JsonProperty("retries")
    public String getRetries() {
        return retries;
    }

    /**
     * Set retries
     **/
    public void setRetries(String retries) {
        this.retries = retries;
    }

    public ContainerSetRetryStrategy retries(String retries) {
        this.retries = retries;
        return this;
    }

    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ContainerSetRetryStrategy {\n");

        sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
        sb.append("    retries: ").append(toIndentedString(retries)).append("\n");
        
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
      * ContainerSetRetryStrategy provides controls on how to retry a container set
     **/
    public static class ContainerSetRetryStrategyQueryParam  {

        /**
          * ContainerSetRetryStrategy provides controls on how to retry a container set
         **/
        @jakarta.ws.rs.QueryParam("duration")
        private String duration;
        /**
          * ContainerSetRetryStrategy provides controls on how to retry a container set
         **/
        @jakarta.ws.rs.QueryParam("retries")
        private String retries;

        /**
        * Duration is the time between each retry, examples values are \"300ms\", \"1s\" or \"5m\". Valid time units are \"ns\", \"us\" (or \"µs\"), \"ms\", \"s\", \"m\", \"h\".
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

        public ContainerSetRetryStrategyQueryParam duration(String duration) {
            this.duration = duration;
            return this;
        }

        /**
        * Get retries
        * @return retries
        **/
        @JsonProperty("retries")
        public String getRetries() {
            return retries;
        }

        /**
         * Set retries
         **/
        public void setRetries(String retries) {
            this.retries = retries;
        }

        public ContainerSetRetryStrategyQueryParam retries(String retries) {
            this.retries = retries;
            return this;
        }

        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class ContainerSetRetryStrategyQueryParam {\n");

            sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
            sb.append("    retries: ").append(toIndentedString(retries)).append("\n");
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