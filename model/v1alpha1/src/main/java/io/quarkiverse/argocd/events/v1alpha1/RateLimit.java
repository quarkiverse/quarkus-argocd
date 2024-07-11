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
public class RateLimit  {

    private Integer requestsPerUnit;
    private String unit;

    /**
    * Get requestsPerUnit
    * @return requestsPerUnit
    **/
    @JsonProperty("requestsPerUnit")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public Integer getRequestsPerUnit() {
        return requestsPerUnit;
    }

    /**
     * Set requestsPerUnit
     **/
    public void setRequestsPerUnit(Integer requestsPerUnit) {
        this.requestsPerUnit = requestsPerUnit;
    }

    public RateLimit requestsPerUnit(Integer requestsPerUnit) {
        this.requestsPerUnit = requestsPerUnit;
        return this;
    }

    /**
    * Get unit
    * @return unit
    **/
    @JsonProperty("unit")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public String getUnit() {
        return unit;
    }

    /**
     * Set unit
     **/
    public void setUnit(String unit) {
        this.unit = unit;
    }

    public RateLimit unit(String unit) {
        this.unit = unit;
        return this;
    }

    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RateLimit {\n");

        sb.append("    requestsPerUnit: ").append(toIndentedString(requestsPerUnit)).append("\n");
        sb.append("    unit: ").append(toIndentedString(unit)).append("\n");
        
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
    public static class RateLimitQueryParam  {

        @jakarta.ws.rs.QueryParam("requestsPerUnit")
        private Integer requestsPerUnit;
        @jakarta.ws.rs.QueryParam("unit")
        private String unit;

        /**
        * Get requestsPerUnit
        * @return requestsPerUnit
        **/
        @JsonProperty("requestsPerUnit")
        public Integer getRequestsPerUnit() {
            return requestsPerUnit;
        }

        /**
         * Set requestsPerUnit
         **/
        public void setRequestsPerUnit(Integer requestsPerUnit) {
            this.requestsPerUnit = requestsPerUnit;
        }

        public RateLimitQueryParam requestsPerUnit(Integer requestsPerUnit) {
            this.requestsPerUnit = requestsPerUnit;
            return this;
        }

        /**
        * Get unit
        * @return unit
        **/
        @JsonProperty("unit")
        public String getUnit() {
            return unit;
        }

        /**
         * Set unit
         **/
        public void setUnit(String unit) {
            this.unit = unit;
        }

        public RateLimitQueryParam unit(String unit) {
            this.unit = unit;
            return this;
        }

        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class RateLimitQueryParam {\n");

            sb.append("    requestsPerUnit: ").append(toIndentedString(requestsPerUnit)).append("\n");
            sb.append("    unit: ").append(toIndentedString(unit)).append("\n");
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
