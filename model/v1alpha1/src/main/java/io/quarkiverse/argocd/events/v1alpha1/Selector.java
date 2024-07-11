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
/**
  * Selector represents conditional operation to select K8s objects.
 **/
public class Selector  {

    /**
      * Selector represents conditional operation to select K8s objects.
     **/
    private String key;
    /**
      * Selector represents conditional operation to select K8s objects.
     **/
    private String operation;
    /**
      * Selector represents conditional operation to select K8s objects.
     **/
    private String value;

    /**
    * Get key
    * @return key
    **/
    @JsonProperty("key")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public String getKey() {
        return key;
    }

    /**
     * Set key
     **/
    public void setKey(String key) {
        this.key = key;
    }

    public Selector key(String key) {
        this.key = key;
        return this;
    }

    /**
    * Get operation
    * @return operation
    **/
    @JsonProperty("operation")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public String getOperation() {
        return operation;
    }

    /**
     * Set operation
     **/
    public void setOperation(String operation) {
        this.operation = operation;
    }

    public Selector operation(String operation) {
        this.operation = operation;
        return this;
    }

    /**
    * Get value
    * @return value
    **/
    @JsonProperty("value")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public String getValue() {
        return value;
    }

    /**
     * Set value
     **/
    public void setValue(String value) {
        this.value = value;
    }

    public Selector value(String value) {
        this.value = value;
        return this;
    }

    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Selector {\n");

        sb.append("    key: ").append(toIndentedString(key)).append("\n");
        sb.append("    operation: ").append(toIndentedString(operation)).append("\n");
        sb.append("    value: ").append(toIndentedString(value)).append("\n");
        
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
      * Selector represents conditional operation to select K8s objects.
     **/
    public static class SelectorQueryParam  {

        /**
          * Selector represents conditional operation to select K8s objects.
         **/
        @jakarta.ws.rs.QueryParam("key")
        private String key;
        /**
          * Selector represents conditional operation to select K8s objects.
         **/
        @jakarta.ws.rs.QueryParam("operation")
        private String operation;
        /**
          * Selector represents conditional operation to select K8s objects.
         **/
        @jakarta.ws.rs.QueryParam("value")
        private String value;

        /**
        * Get key
        * @return key
        **/
        @JsonProperty("key")
        public String getKey() {
            return key;
        }

        /**
         * Set key
         **/
        public void setKey(String key) {
            this.key = key;
        }

        public SelectorQueryParam key(String key) {
            this.key = key;
            return this;
        }

        /**
        * Get operation
        * @return operation
        **/
        @JsonProperty("operation")
        public String getOperation() {
            return operation;
        }

        /**
         * Set operation
         **/
        public void setOperation(String operation) {
            this.operation = operation;
        }

        public SelectorQueryParam operation(String operation) {
            this.operation = operation;
            return this;
        }

        /**
        * Get value
        * @return value
        **/
        @JsonProperty("value")
        public String getValue() {
            return value;
        }

        /**
         * Set value
         **/
        public void setValue(String value) {
            this.value = value;
        }

        public SelectorQueryParam value(String value) {
            this.value = value;
            return this;
        }

        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class SelectorQueryParam {\n");

            sb.append("    key: ").append(toIndentedString(key)).append("\n");
            sb.append("    operation: ").append(toIndentedString(operation)).append("\n");
            sb.append("    value: ").append(toIndentedString(value)).append("\n");
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
