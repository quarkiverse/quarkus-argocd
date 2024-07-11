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
public class TriggerParameterSource  {

    private String contextKey;
    private String contextTemplate;
    private String dataKey;
    private String dataTemplate;
    private String dependencyName;
    private Boolean useRawData;
    private String value;

    /**
    * ContextKey is the JSONPath of the event's (JSON decoded) context key ContextKey is a series of keys separated by a dot. A key may contain wildcard characters '*' and '?'. To access an array value use the index as the key. The dot and wildcard characters can be escaped with '\\\\'. See https://github.com/tidwall/gjson#path-syntax for more information on how to use this.
    * @return contextKey
    **/
    @JsonProperty("contextKey")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public String getContextKey() {
        return contextKey;
    }

    /**
     * Set contextKey
     **/
    public void setContextKey(String contextKey) {
        this.contextKey = contextKey;
    }

    public TriggerParameterSource contextKey(String contextKey) {
        this.contextKey = contextKey;
        return this;
    }

    /**
    * Get contextTemplate
    * @return contextTemplate
    **/
    @JsonProperty("contextTemplate")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public String getContextTemplate() {
        return contextTemplate;
    }

    /**
     * Set contextTemplate
     **/
    public void setContextTemplate(String contextTemplate) {
        this.contextTemplate = contextTemplate;
    }

    public TriggerParameterSource contextTemplate(String contextTemplate) {
        this.contextTemplate = contextTemplate;
        return this;
    }

    /**
    * DataKey is the JSONPath of the event's (JSON decoded) data key DataKey is a series of keys separated by a dot. A key may contain wildcard characters '*' and '?'. To access an array value use the index as the key. The dot and wildcard characters can be escaped with '\\\\'. See https://github.com/tidwall/gjson#path-syntax for more information on how to use this.
    * @return dataKey
    **/
    @JsonProperty("dataKey")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public String getDataKey() {
        return dataKey;
    }

    /**
     * Set dataKey
     **/
    public void setDataKey(String dataKey) {
        this.dataKey = dataKey;
    }

    public TriggerParameterSource dataKey(String dataKey) {
        this.dataKey = dataKey;
        return this;
    }

    /**
    * Get dataTemplate
    * @return dataTemplate
    **/
    @JsonProperty("dataTemplate")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public String getDataTemplate() {
        return dataTemplate;
    }

    /**
     * Set dataTemplate
     **/
    public void setDataTemplate(String dataTemplate) {
        this.dataTemplate = dataTemplate;
    }

    public TriggerParameterSource dataTemplate(String dataTemplate) {
        this.dataTemplate = dataTemplate;
        return this;
    }

    /**
    * DependencyName refers to the name of the dependency. The event which is stored for this dependency is used as payload for the parameterization. Make sure to refer to one of the dependencies you have defined under Dependencies list.
    * @return dependencyName
    **/
    @JsonProperty("dependencyName")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public String getDependencyName() {
        return dependencyName;
    }

    /**
     * Set dependencyName
     **/
    public void setDependencyName(String dependencyName) {
        this.dependencyName = dependencyName;
    }

    public TriggerParameterSource dependencyName(String dependencyName) {
        this.dependencyName = dependencyName;
        return this;
    }

    /**
    * Get useRawData
    * @return useRawData
    **/
    @JsonProperty("useRawData")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public Boolean getUseRawData() {
        return useRawData;
    }

    /**
     * Set useRawData
     **/
    public void setUseRawData(Boolean useRawData) {
        this.useRawData = useRawData;
    }

    public TriggerParameterSource useRawData(Boolean useRawData) {
        this.useRawData = useRawData;
        return this;
    }

    /**
    * Value is the default literal value to use for this parameter source This is only used if the DataKey is invalid. If the DataKey is invalid and this is not defined, this param source will produce an error.
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

    public TriggerParameterSource value(String value) {
        this.value = value;
        return this;
    }

    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TriggerParameterSource {\n");

        sb.append("    contextKey: ").append(toIndentedString(contextKey)).append("\n");
        sb.append("    contextTemplate: ").append(toIndentedString(contextTemplate)).append("\n");
        sb.append("    dataKey: ").append(toIndentedString(dataKey)).append("\n");
        sb.append("    dataTemplate: ").append(toIndentedString(dataTemplate)).append("\n");
        sb.append("    dependencyName: ").append(toIndentedString(dependencyName)).append("\n");
        sb.append("    useRawData: ").append(toIndentedString(useRawData)).append("\n");
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
    public static class TriggerParameterSourceQueryParam  {

        @jakarta.ws.rs.QueryParam("contextKey")
        private String contextKey;
        @jakarta.ws.rs.QueryParam("contextTemplate")
        private String contextTemplate;
        @jakarta.ws.rs.QueryParam("dataKey")
        private String dataKey;
        @jakarta.ws.rs.QueryParam("dataTemplate")
        private String dataTemplate;
        @jakarta.ws.rs.QueryParam("dependencyName")
        private String dependencyName;
        @jakarta.ws.rs.QueryParam("useRawData")
        private Boolean useRawData;
        @jakarta.ws.rs.QueryParam("value")
        private String value;

        /**
        * ContextKey is the JSONPath of the event's (JSON decoded) context key ContextKey is a series of keys separated by a dot. A key may contain wildcard characters '*' and '?'. To access an array value use the index as the key. The dot and wildcard characters can be escaped with '\\\\'. See https://github.com/tidwall/gjson#path-syntax for more information on how to use this.
        * @return contextKey
        **/
        @JsonProperty("contextKey")
        public String getContextKey() {
            return contextKey;
        }

        /**
         * Set contextKey
         **/
        public void setContextKey(String contextKey) {
            this.contextKey = contextKey;
        }

        public TriggerParameterSourceQueryParam contextKey(String contextKey) {
            this.contextKey = contextKey;
            return this;
        }

        /**
        * Get contextTemplate
        * @return contextTemplate
        **/
        @JsonProperty("contextTemplate")
        public String getContextTemplate() {
            return contextTemplate;
        }

        /**
         * Set contextTemplate
         **/
        public void setContextTemplate(String contextTemplate) {
            this.contextTemplate = contextTemplate;
        }

        public TriggerParameterSourceQueryParam contextTemplate(String contextTemplate) {
            this.contextTemplate = contextTemplate;
            return this;
        }

        /**
        * DataKey is the JSONPath of the event's (JSON decoded) data key DataKey is a series of keys separated by a dot. A key may contain wildcard characters '*' and '?'. To access an array value use the index as the key. The dot and wildcard characters can be escaped with '\\\\'. See https://github.com/tidwall/gjson#path-syntax for more information on how to use this.
        * @return dataKey
        **/
        @JsonProperty("dataKey")
        public String getDataKey() {
            return dataKey;
        }

        /**
         * Set dataKey
         **/
        public void setDataKey(String dataKey) {
            this.dataKey = dataKey;
        }

        public TriggerParameterSourceQueryParam dataKey(String dataKey) {
            this.dataKey = dataKey;
            return this;
        }

        /**
        * Get dataTemplate
        * @return dataTemplate
        **/
        @JsonProperty("dataTemplate")
        public String getDataTemplate() {
            return dataTemplate;
        }

        /**
         * Set dataTemplate
         **/
        public void setDataTemplate(String dataTemplate) {
            this.dataTemplate = dataTemplate;
        }

        public TriggerParameterSourceQueryParam dataTemplate(String dataTemplate) {
            this.dataTemplate = dataTemplate;
            return this;
        }

        /**
        * DependencyName refers to the name of the dependency. The event which is stored for this dependency is used as payload for the parameterization. Make sure to refer to one of the dependencies you have defined under Dependencies list.
        * @return dependencyName
        **/
        @JsonProperty("dependencyName")
        public String getDependencyName() {
            return dependencyName;
        }

        /**
         * Set dependencyName
         **/
        public void setDependencyName(String dependencyName) {
            this.dependencyName = dependencyName;
        }

        public TriggerParameterSourceQueryParam dependencyName(String dependencyName) {
            this.dependencyName = dependencyName;
            return this;
        }

        /**
        * Get useRawData
        * @return useRawData
        **/
        @JsonProperty("useRawData")
        public Boolean getUseRawData() {
            return useRawData;
        }

        /**
         * Set useRawData
         **/
        public void setUseRawData(Boolean useRawData) {
            this.useRawData = useRawData;
        }

        public TriggerParameterSourceQueryParam useRawData(Boolean useRawData) {
            this.useRawData = useRawData;
            return this;
        }

        /**
        * Value is the default literal value to use for this parameter source This is only used if the DataKey is invalid. If the DataKey is invalid and this is not defined, this param source will produce an error.
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

        public TriggerParameterSourceQueryParam value(String value) {
            this.value = value;
            return this;
        }

        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class TriggerParameterSourceQueryParam {\n");

            sb.append("    contextKey: ").append(toIndentedString(contextKey)).append("\n");
            sb.append("    contextTemplate: ").append(toIndentedString(contextTemplate)).append("\n");
            sb.append("    dataKey: ").append(toIndentedString(dataKey)).append("\n");
            sb.append("    dataTemplate: ").append(toIndentedString(dataTemplate)).append("\n");
            sb.append("    dependencyName: ").append(toIndentedString(dependencyName)).append("\n");
            sb.append("    useRawData: ").append(toIndentedString(useRawData)).append("\n");
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
