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
  * v3.6 and after: StopStrategy defines if the CronWorkflow should stop scheduling based on a condition
 **/
public class StopStrategy  {

    /**
      * v3.6 and after: StopStrategy defines if the CronWorkflow should stop scheduling based on a condition
     **/
    private String condition;

    /**
    * v3.6 and after: Condition is an expression that stops scheduling workflows when true. Use the variables `failed` or `succeeded` to access the number of failed or successful child workflows.
    * @return condition
    **/
    @JsonProperty("condition")
    public String getCondition() {
        return condition;
    }

    /**
     * Set condition
     **/
    public void setCondition(String condition) {
        this.condition = condition;
    }

    public StopStrategy condition(String condition) {
        this.condition = condition;
        return this;
    }

    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class StopStrategy {\n");

        sb.append("    condition: ").append(toIndentedString(condition)).append("\n");
        
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
      * v3.6 and after: StopStrategy defines if the CronWorkflow should stop scheduling based on a condition
     **/
    public static class StopStrategyQueryParam  {

        /**
          * v3.6 and after: StopStrategy defines if the CronWorkflow should stop scheduling based on a condition
         **/
        @jakarta.ws.rs.QueryParam("condition")
        private String condition;

        /**
        * v3.6 and after: Condition is an expression that stops scheduling workflows when true. Use the variables `failed` or `succeeded` to access the number of failed or successful child workflows.
        * @return condition
        **/
        @JsonProperty("condition")
        public String getCondition() {
            return condition;
        }

        /**
         * Set condition
         **/
        public void setCondition(String condition) {
            this.condition = condition;
        }

        public StopStrategyQueryParam condition(String condition) {
            this.condition = condition;
            return this;
        }

        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class StopStrategyQueryParam {\n");

            sb.append("    condition: ").append(toIndentedString(condition)).append("\n");
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