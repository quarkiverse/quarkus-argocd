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
public class ExprFilter  {

    private String expr;
    private List<PayloadField> fields;

    /**
    * Expr refers to the expression that determines the outcome of the filter.
    * @return expr
    **/
    @JsonProperty("expr")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public String getExpr() {
        return expr;
    }

    /**
     * Set expr
     **/
    public void setExpr(String expr) {
        this.expr = expr;
    }

    public ExprFilter expr(String expr) {
        this.expr = expr;
        return this;
    }

    /**
    * Fields refers to set of keys that refer to the paths within event payload.
    * @return fields
    **/
    @JsonProperty("fields")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public List<PayloadField> getFields() {
        return fields;
    }

    /**
     * Set fields
     **/
    public void setFields(List<PayloadField> fields) {
        this.fields = fields;
    }

    public ExprFilter fields(List<PayloadField> fields) {
        this.fields = fields;
        return this;
    }
    public ExprFilter addFieldsItem(PayloadField fieldsItem) {
        if (this.fields == null){
            fields = new ArrayList<>();
        }
        this.fields.add(fieldsItem);
        return this;
    }

    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ExprFilter {\n");

        sb.append("    expr: ").append(toIndentedString(expr)).append("\n");
        sb.append("    fields: ").append(toIndentedString(fields)).append("\n");
        
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
    public static class ExprFilterQueryParam  {

        @jakarta.ws.rs.QueryParam("expr")
        private String expr;
        @jakarta.ws.rs.QueryParam("fields")
        private List<PayloadField> fields = null;

        /**
        * Expr refers to the expression that determines the outcome of the filter.
        * @return expr
        **/
        @JsonProperty("expr")
        public String getExpr() {
            return expr;
        }

        /**
         * Set expr
         **/
        public void setExpr(String expr) {
            this.expr = expr;
        }

        public ExprFilterQueryParam expr(String expr) {
            this.expr = expr;
            return this;
        }

        /**
        * Fields refers to set of keys that refer to the paths within event payload.
        * @return fields
        **/
        @JsonProperty("fields")
        public List<PayloadField> getFields() {
            return fields;
        }

        /**
         * Set fields
         **/
        public void setFields(List<PayloadField> fields) {
            this.fields = fields;
        }

        public ExprFilterQueryParam fields(List<PayloadField> fields) {
            this.fields = fields;
            return this;
        }
        public ExprFilterQueryParam addFieldsItem(PayloadField fieldsItem) {
            this.fields.add(fieldsItem);
            return this;
        }

        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class ExprFilterQueryParam {\n");

            sb.append("    expr: ").append(toIndentedString(expr)).append("\n");
            sb.append("    fields: ").append(toIndentedString(fields)).append("\n");
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
