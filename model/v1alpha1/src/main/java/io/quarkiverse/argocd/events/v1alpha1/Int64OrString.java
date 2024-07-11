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
public class Int64OrString  {

    private String int64Val;
    private String strVal;
    private String type;

    /**
    * Get int64Val
    * @return int64Val
    **/
    @JsonProperty("int64Val")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public String getInt64Val() {
        return int64Val;
    }

    /**
     * Set int64Val
     **/
    public void setInt64Val(String int64Val) {
        this.int64Val = int64Val;
    }

    public Int64OrString int64Val(String int64Val) {
        this.int64Val = int64Val;
        return this;
    }

    /**
    * Get strVal
    * @return strVal
    **/
    @JsonProperty("strVal")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public String getStrVal() {
        return strVal;
    }

    /**
     * Set strVal
     **/
    public void setStrVal(String strVal) {
        this.strVal = strVal;
    }

    public Int64OrString strVal(String strVal) {
        this.strVal = strVal;
        return this;
    }

    /**
    * Get type
    * @return type
    **/
    @JsonProperty("type")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public String getType() {
        return type;
    }

    /**
     * Set type
     **/
    public void setType(String type) {
        this.type = type;
    }

    public Int64OrString type(String type) {
        this.type = type;
        return this;
    }

    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Int64OrString {\n");

        sb.append("    int64Val: ").append(toIndentedString(int64Val)).append("\n");
        sb.append("    strVal: ").append(toIndentedString(strVal)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        
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
    public static class Int64OrStringQueryParam  {

        @jakarta.ws.rs.QueryParam("int64Val")
        private String int64Val;
        @jakarta.ws.rs.QueryParam("strVal")
        private String strVal;
        @jakarta.ws.rs.QueryParam("type")
        private String type;

        /**
        * Get int64Val
        * @return int64Val
        **/
        @JsonProperty("int64Val")
        public String getInt64Val() {
            return int64Val;
        }

        /**
         * Set int64Val
         **/
        public void setInt64Val(String int64Val) {
            this.int64Val = int64Val;
        }

        public Int64OrStringQueryParam int64Val(String int64Val) {
            this.int64Val = int64Val;
            return this;
        }

        /**
        * Get strVal
        * @return strVal
        **/
        @JsonProperty("strVal")
        public String getStrVal() {
            return strVal;
        }

        /**
         * Set strVal
         **/
        public void setStrVal(String strVal) {
            this.strVal = strVal;
        }

        public Int64OrStringQueryParam strVal(String strVal) {
            this.strVal = strVal;
            return this;
        }

        /**
        * Get type
        * @return type
        **/
        @JsonProperty("type")
        public String getType() {
            return type;
        }

        /**
         * Set type
         **/
        public void setType(String type) {
            this.type = type;
        }

        public Int64OrStringQueryParam type(String type) {
            this.type = type;
            return this;
        }

        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class Int64OrStringQueryParam {\n");

            sb.append("    int64Val: ").append(toIndentedString(int64Val)).append("\n");
            sb.append("    strVal: ").append(toIndentedString(strVal)).append("\n");
            sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
