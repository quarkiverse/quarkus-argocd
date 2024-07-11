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
public class ConditionsResetByTime  {

    private String cron;
    private String timezone;

    /**
    * Get cron
    * @return cron
    **/
    @JsonProperty("cron")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public String getCron() {
        return cron;
    }

    /**
     * Set cron
     **/
    public void setCron(String cron) {
        this.cron = cron;
    }

    public ConditionsResetByTime cron(String cron) {
        this.cron = cron;
        return this;
    }

    /**
    * Get timezone
    * @return timezone
    **/
    @JsonProperty("timezone")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public String getTimezone() {
        return timezone;
    }

    /**
     * Set timezone
     **/
    public void setTimezone(String timezone) {
        this.timezone = timezone;
    }

    public ConditionsResetByTime timezone(String timezone) {
        this.timezone = timezone;
        return this;
    }

    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ConditionsResetByTime {\n");

        sb.append("    cron: ").append(toIndentedString(cron)).append("\n");
        sb.append("    timezone: ").append(toIndentedString(timezone)).append("\n");
        
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
    public static class ConditionsResetByTimeQueryParam  {

        @jakarta.ws.rs.QueryParam("cron")
        private String cron;
        @jakarta.ws.rs.QueryParam("timezone")
        private String timezone;

        /**
        * Get cron
        * @return cron
        **/
        @JsonProperty("cron")
        public String getCron() {
            return cron;
        }

        /**
         * Set cron
         **/
        public void setCron(String cron) {
            this.cron = cron;
        }

        public ConditionsResetByTimeQueryParam cron(String cron) {
            this.cron = cron;
            return this;
        }

        /**
        * Get timezone
        * @return timezone
        **/
        @JsonProperty("timezone")
        public String getTimezone() {
            return timezone;
        }

        /**
         * Set timezone
         **/
        public void setTimezone(String timezone) {
            this.timezone = timezone;
        }

        public ConditionsResetByTimeQueryParam timezone(String timezone) {
            this.timezone = timezone;
            return this;
        }

        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class ConditionsResetByTimeQueryParam {\n");

            sb.append("    cron: ").append(toIndentedString(cron)).append("\n");
            sb.append("    timezone: ").append(toIndentedString(timezone)).append("\n");
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
