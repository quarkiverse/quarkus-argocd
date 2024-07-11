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
  * HTTPBodySource contains the source of the HTTP body.
 **/
public class HTTPBodySource  {

    /**
      * HTTPBodySource contains the source of the HTTP body.
     **/
    private byte[] bytes;

    /**
    * Get bytes
    * @return bytes
    **/
    @JsonProperty("bytes")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public byte[] getBytes() {
        return bytes;
    }

    /**
     * Set bytes
     **/
    public void setBytes(byte[] bytes) {
        this.bytes = bytes;
    }

    public HTTPBodySource bytes(byte[] bytes) {
        this.bytes = bytes;
        return this;
    }

    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class HTTPBodySource {\n");

        sb.append("    bytes: ").append(toIndentedString(bytes)).append("\n");
        
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
      * HTTPBodySource contains the source of the HTTP body.
     **/
    public static class HTTPBodySourceQueryParam  {

        /**
          * HTTPBodySource contains the source of the HTTP body.
         **/
        @jakarta.ws.rs.QueryParam("bytes")
        private byte[] bytes;

        /**
        * Get bytes
        * @return bytes
        **/
        @JsonProperty("bytes")
        public byte[] getBytes() {
            return bytes;
        }

        /**
         * Set bytes
         **/
        public void setBytes(byte[] bytes) {
            this.bytes = bytes;
        }

        public HTTPBodySourceQueryParam bytes(byte[] bytes) {
            this.bytes = bytes;
            return this;
        }

        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class HTTPBodySourceQueryParam {\n");

            sb.append("    bytes: ").append(toIndentedString(bytes)).append("\n");
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