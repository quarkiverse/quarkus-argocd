package io.quarkiverse.argocd.workflow.v1alpha1;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.quarkiverse.argocd.v1alpha1.model.HTTPHeaderSource;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.Type;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class HTTPHeader  {

    private String name;
    private String value;
    private HTTPHeaderSource valueFrom;

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

    public HTTPHeader name(String name) {
        this.name = name;
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

    public HTTPHeader value(String value) {
        this.value = value;
        return this;
    }

    /**
    * Get valueFrom
    * @return valueFrom
    **/
    @JsonProperty("valueFrom")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public HTTPHeaderSource getValueFrom() {
        return valueFrom;
    }

    /**
     * Set valueFrom
     **/
    public void setValueFrom(HTTPHeaderSource valueFrom) {
        this.valueFrom = valueFrom;
    }

    public HTTPHeader valueFrom(HTTPHeaderSource valueFrom) {
        this.valueFrom = valueFrom;
        return this;
    }

    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class HTTPHeader {\n");

        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    value: ").append(toIndentedString(value)).append("\n");
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
    public static class HTTPHeaderQueryParam  {

        @jakarta.ws.rs.QueryParam("name")
        private String name;
        @jakarta.ws.rs.QueryParam("value")
        private String value;
        @jakarta.ws.rs.QueryParam("valueFrom")
        private HTTPHeaderSource valueFrom;

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

        public HTTPHeaderQueryParam name(String name) {
            this.name = name;
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

        public HTTPHeaderQueryParam value(String value) {
            this.value = value;
            return this;
        }

        /**
        * Get valueFrom
        * @return valueFrom
        **/
        @JsonProperty("valueFrom")
        public HTTPHeaderSource getValueFrom() {
            return valueFrom;
        }

        /**
         * Set valueFrom
         **/
        public void setValueFrom(HTTPHeaderSource valueFrom) {
            this.valueFrom = valueFrom;
        }

        public HTTPHeaderQueryParam valueFrom(HTTPHeaderSource valueFrom) {
            this.valueFrom = valueFrom;
            return this;
        }

        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class HTTPHeaderQueryParam {\n");

            sb.append("    name: ").append(toIndentedString(name)).append("\n");
            sb.append("    value: ").append(toIndentedString(value)).append("\n");
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