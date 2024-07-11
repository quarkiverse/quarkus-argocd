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
public class CatchupConfiguration  {

    private Boolean enabled;
    private String maxDuration;

    /**
    * Get enabled
    * @return enabled
    **/
    @JsonProperty("enabled")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public Boolean getEnabled() {
        return enabled;
    }

    /**
     * Set enabled
     **/
    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    public CatchupConfiguration enabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    /**
    * Get maxDuration
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

    public CatchupConfiguration maxDuration(String maxDuration) {
        this.maxDuration = maxDuration;
        return this;
    }

    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CatchupConfiguration {\n");

        sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
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
    public static class CatchupConfigurationQueryParam  {

        @jakarta.ws.rs.QueryParam("enabled")
        private Boolean enabled;
        @jakarta.ws.rs.QueryParam("maxDuration")
        private String maxDuration;

        /**
        * Get enabled
        * @return enabled
        **/
        @JsonProperty("enabled")
        public Boolean getEnabled() {
            return enabled;
        }

        /**
         * Set enabled
         **/
        public void setEnabled(Boolean enabled) {
            this.enabled = enabled;
        }

        public CatchupConfigurationQueryParam enabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }

        /**
        * Get maxDuration
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

        public CatchupConfigurationQueryParam maxDuration(String maxDuration) {
            this.maxDuration = maxDuration;
            return this;
        }

        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class CatchupConfigurationQueryParam {\n");

            sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
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
