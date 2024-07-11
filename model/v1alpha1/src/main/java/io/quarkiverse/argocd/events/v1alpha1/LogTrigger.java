package io.quarkiverse.argocd.events.v1alpha1;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.Type;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class LogTrigger  {

    private String intervalSeconds;

    /**
    * Get intervalSeconds
    * @return intervalSeconds
    **/
    @JsonProperty("intervalSeconds")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public String getIntervalSeconds() {
        return intervalSeconds;
    }

    /**
     * Set intervalSeconds
     **/
    public void setIntervalSeconds(String intervalSeconds) {
        this.intervalSeconds = intervalSeconds;
    }

    public LogTrigger intervalSeconds(String intervalSeconds) {
        this.intervalSeconds = intervalSeconds;
        return this;
    }

    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class LogTrigger {\n");

        sb.append("    intervalSeconds: ").append(toIndentedString(intervalSeconds)).append("\n");
        
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
    public static class LogTriggerQueryParam  {

        @jakarta.ws.rs.QueryParam("intervalSeconds")
        private String intervalSeconds;

        /**
        * Get intervalSeconds
        * @return intervalSeconds
        **/
        @JsonProperty("intervalSeconds")
        public String getIntervalSeconds() {
            return intervalSeconds;
        }

        /**
         * Set intervalSeconds
         **/
        public void setIntervalSeconds(String intervalSeconds) {
            this.intervalSeconds = intervalSeconds;
        }

        public LogTriggerQueryParam intervalSeconds(String intervalSeconds) {
            this.intervalSeconds = intervalSeconds;
            return this;
        }

        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class LogTriggerQueryParam {\n");

            sb.append("    intervalSeconds: ").append(toIndentedString(intervalSeconds)).append("\n");
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
