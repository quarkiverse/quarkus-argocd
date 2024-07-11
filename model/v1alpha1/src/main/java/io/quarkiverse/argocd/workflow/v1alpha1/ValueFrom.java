package io.quarkiverse.argocd.workflow.v1alpha1;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.fabric8.kubernetes.api.model.ConfigMapKeySelector;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.Type;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
/**
  * ValueFrom describes a location in which to obtain the value to a parameter
 **/
public class ValueFrom  {

    /**
      * ValueFrom describes a location in which to obtain the value to a parameter
     **/
    private ConfigMapKeySelector configMapKeyRef;
    /**
      * ValueFrom describes a location in which to obtain the value to a parameter
     **/
    private String _default;
    /**
      * ValueFrom describes a location in which to obtain the value to a parameter
     **/
    private String event;
    /**
      * ValueFrom describes a location in which to obtain the value to a parameter
     **/
    private String expression;
    /**
      * ValueFrom describes a location in which to obtain the value to a parameter
     **/
    private String jqFilter;
    /**
      * ValueFrom describes a location in which to obtain the value to a parameter
     **/
    private String jsonPath;
    /**
      * ValueFrom describes a location in which to obtain the value to a parameter
     **/
    private String parameter;
    /**
      * ValueFrom describes a location in which to obtain the value to a parameter
     **/
    private String path;
    /**
      * ValueFrom describes a location in which to obtain the value to a parameter
     **/
    private Object supplied;

    /**
    * Get configMapKeyRef
    * @return configMapKeyRef
    **/
    @JsonProperty("configMapKeyRef")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public ConfigMapKeySelector getConfigMapKeyRef() {
        return configMapKeyRef;
    }

    /**
     * Set configMapKeyRef
     **/
    public void setConfigMapKeyRef(ConfigMapKeySelector configMapKeyRef) {
        this.configMapKeyRef = configMapKeyRef;
    }

    public ValueFrom configMapKeyRef(ConfigMapKeySelector configMapKeyRef) {
        this.configMapKeyRef = configMapKeyRef;
        return this;
    }

    /**
    * Default specifies a value to be used if retrieving the value from the specified source fails
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

    public ValueFrom _default(String _default) {
        this._default = _default;
        return this;
    }

    /**
    * Selector (https://github.com/expr-lang/expr) that is evaluated against the event to get the value of the parameter. E.g. `payload.message`
    * @return event
    **/
    @JsonProperty("event")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public String getEvent() {
        return event;
    }

    /**
     * Set event
     **/
    public void setEvent(String event) {
        this.event = event;
    }

    public ValueFrom event(String event) {
        this.event = event;
        return this;
    }

    /**
    * Expression, if defined, is evaluated to specify the value for the parameter
    * @return expression
    **/
    @JsonProperty("expression")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public String getExpression() {
        return expression;
    }

    /**
     * Set expression
     **/
    public void setExpression(String expression) {
        this.expression = expression;
    }

    public ValueFrom expression(String expression) {
        this.expression = expression;
        return this;
    }

    /**
    * JQFilter expression against the resource object in resource templates
    * @return jqFilter
    **/
    @JsonProperty("jqFilter")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public String getJqFilter() {
        return jqFilter;
    }

    /**
     * Set jqFilter
     **/
    public void setJqFilter(String jqFilter) {
        this.jqFilter = jqFilter;
    }

    public ValueFrom jqFilter(String jqFilter) {
        this.jqFilter = jqFilter;
        return this;
    }

    /**
    * JSONPath of a resource to retrieve an output parameter value from in resource templates
    * @return jsonPath
    **/
    @JsonProperty("jsonPath")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public String getJsonPath() {
        return jsonPath;
    }

    /**
     * Set jsonPath
     **/
    public void setJsonPath(String jsonPath) {
        this.jsonPath = jsonPath;
    }

    public ValueFrom jsonPath(String jsonPath) {
        this.jsonPath = jsonPath;
        return this;
    }

    /**
    * Parameter reference to a step or dag task in which to retrieve an output parameter value from (e.g. '{{steps.mystep.outputs.myparam}}')
    * @return parameter
    **/
    @JsonProperty("parameter")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public String getParameter() {
        return parameter;
    }

    /**
     * Set parameter
     **/
    public void setParameter(String parameter) {
        this.parameter = parameter;
    }

    public ValueFrom parameter(String parameter) {
        this.parameter = parameter;
        return this;
    }

    /**
    * Path in the container to retrieve an output parameter value from in container templates
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

    public ValueFrom path(String path) {
        this.path = path;
        return this;
    }

    /**
    * SuppliedValueFrom is a placeholder for a value to be filled in directly, either through the CLI, API, etc.
    * @return supplied
    **/
    @JsonProperty("supplied")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public Object getSupplied() {
        return supplied;
    }

    /**
     * Set supplied
     **/
    public void setSupplied(Object supplied) {
        this.supplied = supplied;
    }

    public ValueFrom supplied(Object supplied) {
        this.supplied = supplied;
        return this;
    }

    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ValueFrom {\n");

        sb.append("    configMapKeyRef: ").append(toIndentedString(configMapKeyRef)).append("\n");
        sb.append("    _default: ").append(toIndentedString(_default)).append("\n");
        sb.append("    event: ").append(toIndentedString(event)).append("\n");
        sb.append("    expression: ").append(toIndentedString(expression)).append("\n");
        sb.append("    jqFilter: ").append(toIndentedString(jqFilter)).append("\n");
        sb.append("    jsonPath: ").append(toIndentedString(jsonPath)).append("\n");
        sb.append("    parameter: ").append(toIndentedString(parameter)).append("\n");
        sb.append("    path: ").append(toIndentedString(path)).append("\n");
        sb.append("    supplied: ").append(toIndentedString(supplied)).append("\n");
        
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
      * ValueFrom describes a location in which to obtain the value to a parameter
     **/
    public static class ValueFromQueryParam  {

        /**
          * ValueFrom describes a location in which to obtain the value to a parameter
         **/
        @jakarta.ws.rs.QueryParam("configMapKeyRef")
        private ConfigMapKeySelector configMapKeyRef;
        /**
          * ValueFrom describes a location in which to obtain the value to a parameter
         **/
        @jakarta.ws.rs.QueryParam("_default")
        private String _default;
        /**
          * ValueFrom describes a location in which to obtain the value to a parameter
         **/
        @jakarta.ws.rs.QueryParam("event")
        private String event;
        /**
          * ValueFrom describes a location in which to obtain the value to a parameter
         **/
        @jakarta.ws.rs.QueryParam("expression")
        private String expression;
        /**
          * ValueFrom describes a location in which to obtain the value to a parameter
         **/
        @jakarta.ws.rs.QueryParam("jqFilter")
        private String jqFilter;
        /**
          * ValueFrom describes a location in which to obtain the value to a parameter
         **/
        @jakarta.ws.rs.QueryParam("jsonPath")
        private String jsonPath;
        /**
          * ValueFrom describes a location in which to obtain the value to a parameter
         **/
        @jakarta.ws.rs.QueryParam("parameter")
        private String parameter;
        /**
          * ValueFrom describes a location in which to obtain the value to a parameter
         **/
        @jakarta.ws.rs.QueryParam("path")
        private String path;
        /**
          * ValueFrom describes a location in which to obtain the value to a parameter
         **/
        @jakarta.ws.rs.QueryParam("supplied")
        private Object supplied;

        /**
        * Get configMapKeyRef
        * @return configMapKeyRef
        **/
        @JsonProperty("configMapKeyRef")
        public ConfigMapKeySelector getConfigMapKeyRef() {
            return configMapKeyRef;
        }

        /**
         * Set configMapKeyRef
         **/
        public void setConfigMapKeyRef(ConfigMapKeySelector configMapKeyRef) {
            this.configMapKeyRef = configMapKeyRef;
        }

        public ValueFromQueryParam configMapKeyRef(ConfigMapKeySelector configMapKeyRef) {
            this.configMapKeyRef = configMapKeyRef;
            return this;
        }

        /**
        * Default specifies a value to be used if retrieving the value from the specified source fails
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

        public ValueFromQueryParam _default(String _default) {
            this._default = _default;
            return this;
        }

        /**
        * Selector (https://github.com/expr-lang/expr) that is evaluated against the event to get the value of the parameter. E.g. `payload.message`
        * @return event
        **/
        @JsonProperty("event")
        public String getEvent() {
            return event;
        }

        /**
         * Set event
         **/
        public void setEvent(String event) {
            this.event = event;
        }

        public ValueFromQueryParam event(String event) {
            this.event = event;
            return this;
        }

        /**
        * Expression, if defined, is evaluated to specify the value for the parameter
        * @return expression
        **/
        @JsonProperty("expression")
        public String getExpression() {
            return expression;
        }

        /**
         * Set expression
         **/
        public void setExpression(String expression) {
            this.expression = expression;
        }

        public ValueFromQueryParam expression(String expression) {
            this.expression = expression;
            return this;
        }

        /**
        * JQFilter expression against the resource object in resource templates
        * @return jqFilter
        **/
        @JsonProperty("jqFilter")
        public String getJqFilter() {
            return jqFilter;
        }

        /**
         * Set jqFilter
         **/
        public void setJqFilter(String jqFilter) {
            this.jqFilter = jqFilter;
        }

        public ValueFromQueryParam jqFilter(String jqFilter) {
            this.jqFilter = jqFilter;
            return this;
        }

        /**
        * JSONPath of a resource to retrieve an output parameter value from in resource templates
        * @return jsonPath
        **/
        @JsonProperty("jsonPath")
        public String getJsonPath() {
            return jsonPath;
        }

        /**
         * Set jsonPath
         **/
        public void setJsonPath(String jsonPath) {
            this.jsonPath = jsonPath;
        }

        public ValueFromQueryParam jsonPath(String jsonPath) {
            this.jsonPath = jsonPath;
            return this;
        }

        /**
        * Parameter reference to a step or dag task in which to retrieve an output parameter value from (e.g. '{{steps.mystep.outputs.myparam}}')
        * @return parameter
        **/
        @JsonProperty("parameter")
        public String getParameter() {
            return parameter;
        }

        /**
         * Set parameter
         **/
        public void setParameter(String parameter) {
            this.parameter = parameter;
        }

        public ValueFromQueryParam parameter(String parameter) {
            this.parameter = parameter;
            return this;
        }

        /**
        * Path in the container to retrieve an output parameter value from in container templates
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

        public ValueFromQueryParam path(String path) {
            this.path = path;
            return this;
        }

        /**
        * SuppliedValueFrom is a placeholder for a value to be filled in directly, either through the CLI, API, etc.
        * @return supplied
        **/
        @JsonProperty("supplied")
        public Object getSupplied() {
            return supplied;
        }

        /**
         * Set supplied
         **/
        public void setSupplied(Object supplied) {
            this.supplied = supplied;
        }

        public ValueFromQueryParam supplied(Object supplied) {
            this.supplied = supplied;
            return this;
        }

        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class ValueFromQueryParam {\n");

            sb.append("    configMapKeyRef: ").append(toIndentedString(configMapKeyRef)).append("\n");
            sb.append("    _default: ").append(toIndentedString(_default)).append("\n");
            sb.append("    event: ").append(toIndentedString(event)).append("\n");
            sb.append("    expression: ").append(toIndentedString(expression)).append("\n");
            sb.append("    jqFilter: ").append(toIndentedString(jqFilter)).append("\n");
            sb.append("    jsonPath: ").append(toIndentedString(jsonPath)).append("\n");
            sb.append("    parameter: ").append(toIndentedString(parameter)).append("\n");
            sb.append("    path: ").append(toIndentedString(path)).append("\n");
            sb.append("    supplied: ").append(toIndentedString(supplied)).append("\n");
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