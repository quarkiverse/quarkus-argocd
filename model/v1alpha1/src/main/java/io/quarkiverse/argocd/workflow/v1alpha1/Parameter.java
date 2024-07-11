package io.quarkiverse.argocd.workflow.v1alpha1;

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
/**
  * Parameter indicate a passed string parameter to a service template with an optional default value
 **/
public class Parameter  {

    /**
      * Parameter indicate a passed string parameter to a service template with an optional default value
     **/
    private String _default;
    /**
      * Parameter indicate a passed string parameter to a service template with an optional default value
     **/
    private String description;
    /**
      * Parameter indicate a passed string parameter to a service template with an optional default value
     **/
    private List<String> _enum;
    /**
      * Parameter indicate a passed string parameter to a service template with an optional default value
     **/
    private String globalName;
    /**
      * Parameter indicate a passed string parameter to a service template with an optional default value
     **/
    private String name;
    /**
      * Parameter indicate a passed string parameter to a service template with an optional default value
     **/
    private String value;
    /**
      * Parameter indicate a passed string parameter to a service template with an optional default value
     **/
    private ValueFrom valueFrom;

    /**
    * Default is the default value to use for an input parameter if a value was not supplied
    * @return _default
    **/
    @JsonProperty("default")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public String getDefault() {
        return _default;
    }

    /**
     * Set _default
     **/
    public void setDefault(String _default) {
        this._default = _default;
    }

    public Parameter _default(String _default) {
        this._default = _default;
        return this;
    }

    /**
    * Description is the parameter description
    * @return description
    **/
    @JsonProperty("description")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public String getDescription() {
        return description;
    }

    /**
     * Set description
     **/
    public void setDescription(String description) {
        this.description = description;
    }

    public Parameter description(String description) {
        this.description = description;
        return this;
    }

    /**
    * Enum holds a list of string values to choose from, for the actual value of the parameter
    * @return _enum
    **/
    @JsonProperty("enum")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public List<String> getEnum() {
        return _enum;
    }

    /**
     * Set _enum
     **/
    public void setEnum(List<String> _enum) {
        this._enum = _enum;
    }

    public Parameter _enum(List<String> _enum) {
        this._enum = _enum;
        return this;
    }
    public Parameter addEnumItem(String _enumItem) {
        if (this._enum == null){
            _enum = new ArrayList<>();
        }
        this._enum.add(_enumItem);
        return this;
    }

    /**
    * GlobalName exports an output parameter to the global scope, making it available as '{{io.argoproj.workflow.v1alpha1.outputs.parameters.XXXX}} and in workflow.status.outputs.parameters
    * @return globalName
    **/
    @JsonProperty("globalName")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public String getGlobalName() {
        return globalName;
    }

    /**
     * Set globalName
     **/
    public void setGlobalName(String globalName) {
        this.globalName = globalName;
    }

    public Parameter globalName(String globalName) {
        this.globalName = globalName;
        return this;
    }

    /**
    * Name is the parameter name
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

    public Parameter name(String name) {
        this.name = name;
        return this;
    }

    /**
    * Value is the literal value to use for the parameter. If specified in the context of an input parameter, the value takes precedence over any passed values
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

    public Parameter value(String value) {
        this.value = value;
        return this;
    }

    /**
    * Get valueFrom
    * @return valueFrom
    **/
    @JsonProperty("valueFrom")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public ValueFrom getValueFrom() {
        return valueFrom;
    }

    /**
     * Set valueFrom
     **/
    public void setValueFrom(ValueFrom valueFrom) {
        this.valueFrom = valueFrom;
    }

    public Parameter valueFrom(ValueFrom valueFrom) {
        this.valueFrom = valueFrom;
        return this;
    }

    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Parameter {\n");

        sb.append("    _default: ").append(toIndentedString(_default)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    _enum: ").append(toIndentedString(_enum)).append("\n");
        sb.append("    globalName: ").append(toIndentedString(globalName)).append("\n");
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
    /**
      * Parameter indicate a passed string parameter to a service template with an optional default value
     **/
    public static class ParameterQueryParam  {

        /**
          * Parameter indicate a passed string parameter to a service template with an optional default value
         **/
        @jakarta.ws.rs.QueryParam("_default")
        private String _default;
        /**
          * Parameter indicate a passed string parameter to a service template with an optional default value
         **/
        @jakarta.ws.rs.QueryParam("description")
        private String description;
        /**
          * Parameter indicate a passed string parameter to a service template with an optional default value
         **/
        @jakarta.ws.rs.QueryParam("_enum")
        private List<String> _enum = null;
        /**
          * Parameter indicate a passed string parameter to a service template with an optional default value
         **/
        @jakarta.ws.rs.QueryParam("globalName")
        private String globalName;
        /**
          * Parameter indicate a passed string parameter to a service template with an optional default value
         **/
        @jakarta.ws.rs.QueryParam("name")
        private String name;
        /**
          * Parameter indicate a passed string parameter to a service template with an optional default value
         **/
        @jakarta.ws.rs.QueryParam("value")
        private String value;
        /**
          * Parameter indicate a passed string parameter to a service template with an optional default value
         **/
        @jakarta.ws.rs.QueryParam("valueFrom")
        private ValueFrom valueFrom;

        /**
        * Default is the default value to use for an input parameter if a value was not supplied
        * @return _default
        **/
        @JsonProperty("default")
        public String getDefault() {
            return _default;
        }

        /**
         * Set _default
         **/
        public void setDefault(String _default) {
            this._default = _default;
        }

        public ParameterQueryParam _default(String _default) {
            this._default = _default;
            return this;
        }

        /**
        * Description is the parameter description
        * @return description
        **/
        @JsonProperty("description")
        public String getDescription() {
            return description;
        }

        /**
         * Set description
         **/
        public void setDescription(String description) {
            this.description = description;
        }

        public ParameterQueryParam description(String description) {
            this.description = description;
            return this;
        }

        /**
        * Enum holds a list of string values to choose from, for the actual value of the parameter
        * @return _enum
        **/
        @JsonProperty("enum")
        public List<String> getEnum() {
            return _enum;
        }

        /**
         * Set _enum
         **/
        public void setEnum(List<String> _enum) {
            this._enum = _enum;
        }

        public ParameterQueryParam _enum(List<String> _enum) {
            this._enum = _enum;
            return this;
        }
        public ParameterQueryParam addEnumItem(String _enumItem) {
            this._enum.add(_enumItem);
            return this;
        }

        /**
        * GlobalName exports an output parameter to the global scope, making it available as '{{io.argoproj.workflow.v1alpha1.outputs.parameters.XXXX}} and in workflow.status.outputs.parameters
        * @return globalName
        **/
        @JsonProperty("globalName")
        public String getGlobalName() {
            return globalName;
        }

        /**
         * Set globalName
         **/
        public void setGlobalName(String globalName) {
            this.globalName = globalName;
        }

        public ParameterQueryParam globalName(String globalName) {
            this.globalName = globalName;
            return this;
        }

        /**
        * Name is the parameter name
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

        public ParameterQueryParam name(String name) {
            this.name = name;
            return this;
        }

        /**
        * Value is the literal value to use for the parameter. If specified in the context of an input parameter, the value takes precedence over any passed values
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

        public ParameterQueryParam value(String value) {
            this.value = value;
            return this;
        }

        /**
        * Get valueFrom
        * @return valueFrom
        **/
        @JsonProperty("valueFrom")
        public ValueFrom getValueFrom() {
            return valueFrom;
        }

        /**
         * Set valueFrom
         **/
        public void setValueFrom(ValueFrom valueFrom) {
            this.valueFrom = valueFrom;
        }

        public ParameterQueryParam valueFrom(ValueFrom valueFrom) {
            this.valueFrom = valueFrom;
            return this;
        }

        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class ParameterQueryParam {\n");

            sb.append("    _default: ").append(toIndentedString(_default)).append("\n");
            sb.append("    description: ").append(toIndentedString(description)).append("\n");
            sb.append("    _enum: ").append(toIndentedString(_enum)).append("\n");
            sb.append("    globalName: ").append(toIndentedString(globalName)).append("\n");
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
