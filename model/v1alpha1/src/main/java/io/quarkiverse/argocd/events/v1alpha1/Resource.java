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
  * Resource represent arbitrary structured data.
 **/
public class Resource  {

    /**
      * Resource represent arbitrary structured data.
     **/
    private byte[] value;

    /**
    * Get value
    * @return value
    **/
    @JsonProperty("value")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public byte[] getValue() {
        return value;
    }

    /**
     * Set value
     **/
    public void setValue(byte[] value) {
        this.value = value;
    }

    public Resource value(byte[] value) {
        this.value = value;
        return this;
    }

    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Resource {\n");

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
      * Resource represent arbitrary structured data.
     **/
    public static class ResourceQueryParam  {

        /**
          * Resource represent arbitrary structured data.
         **/
        @jakarta.ws.rs.QueryParam("value")
        private byte[] value;

        /**
        * Get value
        * @return value
        **/
        @JsonProperty("value")
        public byte[] getValue() {
            return value;
        }

        /**
         * Set value
         **/
        public void setValue(byte[] value) {
            this.value = value;
        }

        public ResourceQueryParam value(byte[] value) {
            this.value = value;
            return this;
        }

        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class ResourceQueryParam {\n");

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
