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
public class ConditionsResetCriteria  {

    private ConditionsResetByTime byTime;

    /**
    * Get byTime
    * @return byTime
    **/
    @JsonProperty("byTime")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public ConditionsResetByTime getByTime() {
        return byTime;
    }

    /**
     * Set byTime
     **/
    public void setByTime(ConditionsResetByTime byTime) {
        this.byTime = byTime;
    }

    public ConditionsResetCriteria byTime(ConditionsResetByTime byTime) {
        this.byTime = byTime;
        return this;
    }

    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ConditionsResetCriteria {\n");

        sb.append("    byTime: ").append(toIndentedString(byTime)).append("\n");
        
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
    public static class ConditionsResetCriteriaQueryParam  {

        @jakarta.ws.rs.QueryParam("byTime")
        private ConditionsResetByTime byTime;

        /**
        * Get byTime
        * @return byTime
        **/
        @JsonProperty("byTime")
        public ConditionsResetByTime getByTime() {
            return byTime;
        }

        /**
         * Set byTime
         **/
        public void setByTime(ConditionsResetByTime byTime) {
            this.byTime = byTime;
        }

        public ConditionsResetCriteriaQueryParam byTime(ConditionsResetByTime byTime) {
            this.byTime = byTime;
            return this;
        }

        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class ConditionsResetCriteriaQueryParam {\n");

            sb.append("    byTime: ").append(toIndentedString(byTime)).append("\n");
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
