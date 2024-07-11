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
public class TriggerParameter  {

    private String dest;
    private String operation;
    private TriggerParameterSource src;

    /**
    * Dest is the JSONPath of a resource key. A path is a series of keys separated by a dot. The colon character can be escaped with '.' The -1 key can be used to append a value to an existing array. See https://github.com/tidwall/sjson#path-syntax for more information about how this is used.
    * @return dest
    **/
    @JsonProperty("dest")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public String getDest() {
        return dest;
    }

    /**
     * Set dest
     **/
    public void setDest(String dest) {
        this.dest = dest;
    }

    public TriggerParameter dest(String dest) {
        this.dest = dest;
        return this;
    }

    /**
    * Operation is what to do with the existing value at Dest, whether to 'prepend', 'overwrite', or 'append' it.
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

    public TriggerParameter operation(String operation) {
        this.operation = operation;
        return this;
    }

    /**
    * Get src
    * @return src
    **/
    @JsonProperty("src")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public TriggerParameterSource getSrc() {
        return src;
    }

    /**
     * Set src
     **/
    public void setSrc(TriggerParameterSource src) {
        this.src = src;
    }

    public TriggerParameter src(TriggerParameterSource src) {
        this.src = src;
        return this;
    }

    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TriggerParameter {\n");

        sb.append("    dest: ").append(toIndentedString(dest)).append("\n");
        sb.append("    operation: ").append(toIndentedString(operation)).append("\n");
        sb.append("    src: ").append(toIndentedString(src)).append("\n");
        
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
    public static class TriggerParameterQueryParam  {

        @jakarta.ws.rs.QueryParam("dest")
        private String dest;
        @jakarta.ws.rs.QueryParam("operation")
        private String operation;
        @jakarta.ws.rs.QueryParam("src")
        private TriggerParameterSource src;

        /**
        * Dest is the JSONPath of a resource key. A path is a series of keys separated by a dot. The colon character can be escaped with '.' The -1 key can be used to append a value to an existing array. See https://github.com/tidwall/sjson#path-syntax for more information about how this is used.
        * @return dest
        **/
        @JsonProperty("dest")
        public String getDest() {
            return dest;
        }

        /**
         * Set dest
         **/
        public void setDest(String dest) {
            this.dest = dest;
        }

        public TriggerParameterQueryParam dest(String dest) {
            this.dest = dest;
            return this;
        }

        /**
        * Operation is what to do with the existing value at Dest, whether to 'prepend', 'overwrite', or 'append' it.
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

        public TriggerParameterQueryParam operation(String operation) {
            this.operation = operation;
            return this;
        }

        /**
        * Get src
        * @return src
        **/
        @JsonProperty("src")
        public TriggerParameterSource getSrc() {
            return src;
        }

        /**
         * Set src
         **/
        public void setSrc(TriggerParameterSource src) {
            this.src = src;
        }

        public TriggerParameterQueryParam src(TriggerParameterSource src) {
            this.src = src;
            return this;
        }

        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class TriggerParameterQueryParam {\n");

            sb.append("    dest: ").append(toIndentedString(dest)).append("\n");
            sb.append("    operation: ").append(toIndentedString(operation)).append("\n");
            sb.append("    src: ").append(toIndentedString(src)).append("\n");
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
