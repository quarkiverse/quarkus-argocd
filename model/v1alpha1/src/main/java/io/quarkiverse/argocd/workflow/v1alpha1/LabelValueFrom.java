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
public class LabelValueFrom  {

    private String expression;

    /**
    * Get expression
    * @return expression
    **/
    @JsonProperty("expression")
    public String getExpression() {
        return expression;
    }

    /**
     * Set expression
     **/
    public void setExpression(String expression) {
        this.expression = expression;
    }

    public LabelValueFrom expression(String expression) {
        this.expression = expression;
        return this;
    }

    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class LabelValueFrom {\n");

        sb.append("    expression: ").append(toIndentedString(expression)).append("\n");
        
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
    public static class LabelValueFromQueryParam  {

        @jakarta.ws.rs.QueryParam("expression")
        private String expression;

        /**
        * Get expression
        * @return expression
        **/
        @JsonProperty("expression")
        public String getExpression() {
            return expression;
        }

        /**
         * Set expression
         **/
        public void setExpression(String expression) {
            this.expression = expression;
        }

        public LabelValueFromQueryParam expression(String expression) {
            this.expression = expression;
            return this;
        }

        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class LabelValueFromQueryParam {\n");

            sb.append("    expression: ").append(toIndentedString(expression)).append("\n");
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