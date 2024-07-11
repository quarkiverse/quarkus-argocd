package io.quarkiverse.argocd.events.v1alpha1;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.Type;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
/**
  * Status is a common structure which can be used for Status field.
 **/
public class Status  {

    /**
      * Status is a common structure which can be used for Status field.
     **/
    private List<Condition> conditions;

    /**
    * Get conditions
    * @return conditions
    **/
    @JsonProperty("conditions")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public List<Condition> getConditions() {
        return conditions;
    }

    /**
     * Set conditions
     **/
    public void setConditions(List<Condition> conditions) {
        this.conditions = conditions;
    }

    public Status conditions(List<Condition> conditions) {
        this.conditions = conditions;
        return this;
    }
    public Status addConditionsItem(Condition conditionsItem) {
        if (this.conditions == null){
            conditions = new ArrayList<>();
        }
        this.conditions.add(conditionsItem);
        return this;
    }

    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Status {\n");

        sb.append("    conditions: ").append(toIndentedString(conditions)).append("\n");
        
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
      * Status is a common structure which can be used for Status field.
     **/
    public static class StatusQueryParam  {

        /**
          * Status is a common structure which can be used for Status field.
         **/
        @jakarta.ws.rs.QueryParam("conditions")
        private List<Condition> conditions = null;

        /**
        * Get conditions
        * @return conditions
        **/
        @JsonProperty("conditions")
        public List<Condition> getConditions() {
            return conditions;
        }

        /**
         * Set conditions
         **/
        public void setConditions(List<Condition> conditions) {
            this.conditions = conditions;
        }

        public StatusQueryParam conditions(List<Condition> conditions) {
            this.conditions = conditions;
            return this;
        }
        public StatusQueryParam addConditionsItem(Condition conditionsItem) {
            this.conditions.add(conditionsItem);
            return this;
        }

        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class StatusQueryParam {\n");

            sb.append("    conditions: ").append(toIndentedString(conditions)).append("\n");
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
