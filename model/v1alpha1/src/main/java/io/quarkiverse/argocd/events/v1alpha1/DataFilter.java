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
public class DataFilter  {

    private String comparator;
    private String path;
    private String template;
    private String type;
    private List<String> value;

    /**
    * Comparator compares the event data with a user given value. Can be \">=\", \">\", \"=\", \"!=\", \"<\", or \"<=\". Is optional, and if left blank treated as equality \"=\".
    * @return comparator
    **/
    @JsonProperty("comparator")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public String getComparator() {
        return comparator;
    }

    /**
     * Set comparator
     **/
    public void setComparator(String comparator) {
        this.comparator = comparator;
    }

    public DataFilter comparator(String comparator) {
        this.comparator = comparator;
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

    public DataFilter path(String path) {
        this.path = path;
        return this;
    }

    /**
    * Get template
    * @return template
    **/
    @JsonProperty("template")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public String getTemplate() {
        return template;
    }

    /**
     * Set template
     **/
    public void setTemplate(String template) {
        this.template = template;
    }

    public DataFilter template(String template) {
        this.template = template;
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

    public DataFilter type(String type) {
        this.type = type;
        return this;
    }

    /**
    * Get value
    * @return value
    **/
    @JsonProperty("value")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public List<String> getValue() {
        return value;
    }

    /**
     * Set value
     **/
    public void setValue(List<String> value) {
        this.value = value;
    }

    public DataFilter value(List<String> value) {
        this.value = value;
        return this;
    }
    public DataFilter addValueItem(String valueItem) {
        if (this.value == null){
            value = new ArrayList<>();
        }
        this.value.add(valueItem);
        return this;
    }

    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DataFilter {\n");

        sb.append("    comparator: ").append(toIndentedString(comparator)).append("\n");
        sb.append("    path: ").append(toIndentedString(path)).append("\n");
        sb.append("    template: ").append(toIndentedString(template)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
    public static class DataFilterQueryParam  {

        @jakarta.ws.rs.QueryParam("comparator")
        private String comparator;
        @jakarta.ws.rs.QueryParam("path")
        private String path;
        @jakarta.ws.rs.QueryParam("template")
        private String template;
        @jakarta.ws.rs.QueryParam("type")
        private String type;
        @jakarta.ws.rs.QueryParam("value")
        private List<String> value = null;

        /**
        * Comparator compares the event data with a user given value. Can be \">=\", \">\", \"=\", \"!=\", \"<\", or \"<=\". Is optional, and if left blank treated as equality \"=\".
        * @return comparator
        **/
        @JsonProperty("comparator")
        public String getComparator() {
            return comparator;
        }

        /**
         * Set comparator
         **/
        public void setComparator(String comparator) {
            this.comparator = comparator;
        }

        public DataFilterQueryParam comparator(String comparator) {
            this.comparator = comparator;
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

        public DataFilterQueryParam path(String path) {
            this.path = path;
            return this;
        }

        /**
        * Get template
        * @return template
        **/
        @JsonProperty("template")
        public String getTemplate() {
            return template;
        }

        /**
         * Set template
         **/
        public void setTemplate(String template) {
            this.template = template;
        }

        public DataFilterQueryParam template(String template) {
            this.template = template;
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

        public DataFilterQueryParam type(String type) {
            this.type = type;
            return this;
        }

        /**
        * Get value
        * @return value
        **/
        @JsonProperty("value")
        public List<String> getValue() {
            return value;
        }

        /**
         * Set value
         **/
        public void setValue(List<String> value) {
            this.value = value;
        }

        public DataFilterQueryParam value(List<String> value) {
            this.value = value;
            return this;
        }
        public DataFilterQueryParam addValueItem(String valueItem) {
            this.value.add(valueItem);
            return this;
        }

        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class DataFilterQueryParam {\n");

            sb.append("    comparator: ").append(toIndentedString(comparator)).append("\n");
            sb.append("    path: ").append(toIndentedString(path)).append("\n");
            sb.append("    template: ").append(toIndentedString(template)).append("\n");
            sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
