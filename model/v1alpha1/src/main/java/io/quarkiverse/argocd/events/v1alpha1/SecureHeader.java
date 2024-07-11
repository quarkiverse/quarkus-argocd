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
public class SecureHeader  {

    private String name;
    private ValueFromSource valueFrom;

    /**
    * Get name
    * @return name
    **/
    @JsonProperty("name")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public String getName() {
        return name;
    }

    /**
     * Set name
     **/
    public void setName(String name) {
        this.name = name;
    }

    public SecureHeader name(String name) {
        this.name = name;
        return this;
    }

    /**
    * Get valueFrom
    * @return valueFrom
    **/
    @JsonProperty("valueFrom")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public ValueFromSource getValueFrom() {
        return valueFrom;
    }

    /**
     * Set valueFrom
     **/
    public void setValueFrom(ValueFromSource valueFrom) {
        this.valueFrom = valueFrom;
    }

    public SecureHeader valueFrom(ValueFromSource valueFrom) {
        this.valueFrom = valueFrom;
        return this;
    }

    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SecureHeader {\n");

        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    valueFrom: ").append(toIndentedString(valueFrom)).append("\n");
        
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
    public static class SecureHeaderQueryParam  {

        @jakarta.ws.rs.QueryParam("name")
        private String name;
        @jakarta.ws.rs.QueryParam("valueFrom")
        private ValueFromSource valueFrom;

        /**
        * Get name
        * @return name
        **/
        @JsonProperty("name")
        public String getName() {
            return name;
        }

        /**
         * Set name
         **/
        public void setName(String name) {
            this.name = name;
        }

        public SecureHeaderQueryParam name(String name) {
            this.name = name;
            return this;
        }

        /**
        * Get valueFrom
        * @return valueFrom
        **/
        @JsonProperty("valueFrom")
        public ValueFromSource getValueFrom() {
            return valueFrom;
        }

        /**
         * Set valueFrom
         **/
        public void setValueFrom(ValueFromSource valueFrom) {
            this.valueFrom = valueFrom;
        }

        public SecureHeaderQueryParam valueFrom(ValueFromSource valueFrom) {
            this.valueFrom = valueFrom;
            return this;
        }

        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class SecureHeaderQueryParam {\n");

            sb.append("    name: ").append(toIndentedString(name)).append("\n");
            sb.append("    valueFrom: ").append(toIndentedString(valueFrom)).append("\n");
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
