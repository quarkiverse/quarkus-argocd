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
  * MetricLabel is a single label for a prometheus metric
 **/
public class MetricLabel  {

    /**
      * MetricLabel is a single label for a prometheus metric
     **/
    private String key;
    /**
      * MetricLabel is a single label for a prometheus metric
     **/
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

    public MetricLabel key(String key) {
        this.key = key;
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

    public MetricLabel value(String value) {
        this.value = value;
        return this;
    }

    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class MetricLabel {\n");

        sb.append("    key: ").append(toIndentedString(key)).append("\n");
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
      * MetricLabel is a single label for a prometheus metric
     **/
    public static class MetricLabelQueryParam  {

        /**
          * MetricLabel is a single label for a prometheus metric
         **/
        @jakarta.ws.rs.QueryParam("key")
        private String key;
        /**
          * MetricLabel is a single label for a prometheus metric
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

        public MetricLabelQueryParam key(String key) {
            this.key = key;
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

        public MetricLabelQueryParam value(String value) {
            this.value = value;
            return this;
        }

        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class MetricLabelQueryParam {\n");

            sb.append("    key: ").append(toIndentedString(key)).append("\n");
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