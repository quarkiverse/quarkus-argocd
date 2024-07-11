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
  * PayloadField binds a value at path within the event payload against a name.
 **/
public class PayloadField  {

    /**
      * PayloadField binds a value at path within the event payload against a name.
     **/
    private String name;
    /**
      * PayloadField binds a value at path within the event payload against a name.
     **/
    private String path;

    /**
    * Name acts as key that holds the value at the path.
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

    public PayloadField name(String name) {
        this.name = name;
        return this;
    }

    /**
    * Path is the JSONPath of the event's (JSON decoded) data key Path is a series of keys separated by a dot. A key may contain wildcard characters '*' and '?'. To access an array value use the index as the key. The dot and wildcard characters can be escaped with '\\\\'. See https://github.com/tidwall/gjson#path-syntax for more information on how to use this.
    * @return path
    **/
    @JsonProperty("path")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public String getPath() {
        return path;
    }

    /**
     * Set path
     **/
    public void setPath(String path) {
        this.path = path;
    }

    public PayloadField path(String path) {
        this.path = path;
        return this;
    }

    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PayloadField {\n");

        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    path: ").append(toIndentedString(path)).append("\n");
        
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
      * PayloadField binds a value at path within the event payload against a name.
     **/
    public static class PayloadFieldQueryParam  {

        /**
          * PayloadField binds a value at path within the event payload against a name.
         **/
        @jakarta.ws.rs.QueryParam("name")
        private String name;
        /**
          * PayloadField binds a value at path within the event payload against a name.
         **/
        @jakarta.ws.rs.QueryParam("path")
        private String path;

        /**
        * Name acts as key that holds the value at the path.
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

        public PayloadFieldQueryParam name(String name) {
            this.name = name;
            return this;
        }

        /**
        * Path is the JSONPath of the event's (JSON decoded) data key Path is a series of keys separated by a dot. A key may contain wildcard characters '*' and '?'. To access an array value use the index as the key. The dot and wildcard characters can be escaped with '\\\\'. See https://github.com/tidwall/gjson#path-syntax for more information on how to use this.
        * @return path
        **/
        @JsonProperty("path")
        public String getPath() {
            return path;
        }

        /**
         * Set path
         **/
        public void setPath(String path) {
            this.path = path;
        }

        public PayloadFieldQueryParam path(String path) {
            this.path = path;
            return this;
        }

        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class PayloadFieldQueryParam {\n");

            sb.append("    name: ").append(toIndentedString(name)).append("\n");
            sb.append("    path: ").append(toIndentedString(path)).append("\n");
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
