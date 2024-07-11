package io.quarkiverse.argocd.events.v1alpha1;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.fabric8.kubernetes.api.model.SecretKeySelector;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.Type;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
/**
  * OpenWhiskTrigger refers to the specification of the OpenWhisk trigger.
 **/
public class OpenWhiskTrigger  {

    /**
      * OpenWhiskTrigger refers to the specification of the OpenWhisk trigger.
     **/
    private String actionName;
    /**
      * OpenWhiskTrigger refers to the specification of the OpenWhisk trigger.
     **/
    private SecretKeySelector authToken;
    /**
      * OpenWhiskTrigger refers to the specification of the OpenWhisk trigger.
     **/
    private String host;
    /**
      * OpenWhiskTrigger refers to the specification of the OpenWhisk trigger.
     **/
    private String namespace;
    /**
      * OpenWhiskTrigger refers to the specification of the OpenWhisk trigger.
     **/
    private List<TriggerParameter> parameters;
    /**
      * OpenWhiskTrigger refers to the specification of the OpenWhisk trigger.
     **/
    private List<TriggerParameter> payload;
    /**
      * OpenWhiskTrigger refers to the specification of the OpenWhisk trigger.
     **/
    private String version;

    /**
    * Name of the action/function.
    * @return actionName
    **/
    @JsonProperty("actionName")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public String getActionName() {
        return actionName;
    }

    /**
     * Set actionName
     **/
    public void setActionName(String actionName) {
        this.actionName = actionName;
    }

    public OpenWhiskTrigger actionName(String actionName) {
        this.actionName = actionName;
        return this;
    }

    /**
    * Get authToken
    * @return authToken
    **/
    @JsonProperty("authToken")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public SecretKeySelector getAuthToken() {
        return authToken;
    }

    /**
     * Set authToken
     **/
    public void setAuthToken(SecretKeySelector authToken) {
        this.authToken = authToken;
    }

    public OpenWhiskTrigger authToken(SecretKeySelector authToken) {
        this.authToken = authToken;
        return this;
    }

    /**
    * Host URL of the OpenWhisk.
    * @return host
    **/
    @JsonProperty("host")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public String getHost() {
        return host;
    }

    /**
     * Set host
     **/
    public void setHost(String host) {
        this.host = host;
    }

    public OpenWhiskTrigger host(String host) {
        this.host = host;
        return this;
    }

    /**
    * Namespace for the action. Defaults to \"_\". +optional.
    * @return namespace
    **/
    @JsonProperty("namespace")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public String getNamespace() {
        return namespace;
    }

    /**
     * Set namespace
     **/
    public void setNamespace(String namespace) {
        this.namespace = namespace;
    }

    public OpenWhiskTrigger namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    /**
    * Get parameters
    * @return parameters
    **/
    @JsonProperty("parameters")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public List<TriggerParameter> getParameters() {
        return parameters;
    }

    /**
     * Set parameters
     **/
    public void setParameters(List<TriggerParameter> parameters) {
        this.parameters = parameters;
    }

    public OpenWhiskTrigger parameters(List<TriggerParameter> parameters) {
        this.parameters = parameters;
        return this;
    }
    public OpenWhiskTrigger addParametersItem(TriggerParameter parametersItem) {
        if (this.parameters == null){
            parameters = new ArrayList<>();
        }
        this.parameters.add(parametersItem);
        return this;
    }

    /**
    * Payload is the list of key-value extracted from an event payload to construct the request payload.
    * @return payload
    **/
    @JsonProperty("payload")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public List<TriggerParameter> getPayload() {
        return payload;
    }

    /**
     * Set payload
     **/
    public void setPayload(List<TriggerParameter> payload) {
        this.payload = payload;
    }

    public OpenWhiskTrigger payload(List<TriggerParameter> payload) {
        this.payload = payload;
        return this;
    }
    public OpenWhiskTrigger addPayloadItem(TriggerParameter payloadItem) {
        if (this.payload == null){
            payload = new ArrayList<>();
        }
        this.payload.add(payloadItem);
        return this;
    }

    /**
    * Get version
    * @return version
    **/
    @JsonProperty("version")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public String getVersion() {
        return version;
    }

    /**
     * Set version
     **/
    public void setVersion(String version) {
        this.version = version;
    }

    public OpenWhiskTrigger version(String version) {
        this.version = version;
        return this;
    }

    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OpenWhiskTrigger {\n");

        sb.append("    actionName: ").append(toIndentedString(actionName)).append("\n");
        sb.append("    authToken: ").append(toIndentedString(authToken)).append("\n");
        sb.append("    host: ").append(toIndentedString(host)).append("\n");
        sb.append("    namespace: ").append(toIndentedString(namespace)).append("\n");
        sb.append("    parameters: ").append(toIndentedString(parameters)).append("\n");
        sb.append("    payload: ").append(toIndentedString(payload)).append("\n");
        sb.append("    version: ").append(toIndentedString(version)).append("\n");
        
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
      * OpenWhiskTrigger refers to the specification of the OpenWhisk trigger.
     **/
    public static class OpenWhiskTriggerQueryParam  {

        /**
          * OpenWhiskTrigger refers to the specification of the OpenWhisk trigger.
         **/
        @jakarta.ws.rs.QueryParam("actionName")
        private String actionName;
        /**
          * OpenWhiskTrigger refers to the specification of the OpenWhisk trigger.
         **/
        @jakarta.ws.rs.QueryParam("authToken")
        private SecretKeySelector authToken;
        /**
          * OpenWhiskTrigger refers to the specification of the OpenWhisk trigger.
         **/
        @jakarta.ws.rs.QueryParam("host")
        private String host;
        /**
          * OpenWhiskTrigger refers to the specification of the OpenWhisk trigger.
         **/
        @jakarta.ws.rs.QueryParam("namespace")
        private String namespace;
        /**
          * OpenWhiskTrigger refers to the specification of the OpenWhisk trigger.
         **/
        @jakarta.ws.rs.QueryParam("parameters")
        private List<TriggerParameter> parameters = null;
        /**
          * OpenWhiskTrigger refers to the specification of the OpenWhisk trigger.
         **/
        @jakarta.ws.rs.QueryParam("payload")
        private List<TriggerParameter> payload = null;
        /**
          * OpenWhiskTrigger refers to the specification of the OpenWhisk trigger.
         **/
        @jakarta.ws.rs.QueryParam("version")
        private String version;

        /**
        * Name of the action/function.
        * @return actionName
        **/
        @JsonProperty("actionName")
        public String getActionName() {
            return actionName;
        }

        /**
         * Set actionName
         **/
        public void setActionName(String actionName) {
            this.actionName = actionName;
        }

        public OpenWhiskTriggerQueryParam actionName(String actionName) {
            this.actionName = actionName;
            return this;
        }

        /**
        * Get authToken
        * @return authToken
        **/
        @JsonProperty("authToken")
        public SecretKeySelector getAuthToken() {
            return authToken;
        }

        /**
         * Set authToken
         **/
        public void setAuthToken(SecretKeySelector authToken) {
            this.authToken = authToken;
        }

        public OpenWhiskTriggerQueryParam authToken(SecretKeySelector authToken) {
            this.authToken = authToken;
            return this;
        }

        /**
        * Host URL of the OpenWhisk.
        * @return host
        **/
        @JsonProperty("host")
        public String getHost() {
            return host;
        }

        /**
         * Set host
         **/
        public void setHost(String host) {
            this.host = host;
        }

        public OpenWhiskTriggerQueryParam host(String host) {
            this.host = host;
            return this;
        }

        /**
        * Namespace for the action. Defaults to \"_\". +optional.
        * @return namespace
        **/
        @JsonProperty("namespace")
        public String getNamespace() {
            return namespace;
        }

        /**
         * Set namespace
         **/
        public void setNamespace(String namespace) {
            this.namespace = namespace;
        }

        public OpenWhiskTriggerQueryParam namespace(String namespace) {
            this.namespace = namespace;
            return this;
        }

        /**
        * Get parameters
        * @return parameters
        **/
        @JsonProperty("parameters")
        public List<TriggerParameter> getParameters() {
            return parameters;
        }

        /**
         * Set parameters
         **/
        public void setParameters(List<TriggerParameter> parameters) {
            this.parameters = parameters;
        }

        public OpenWhiskTriggerQueryParam parameters(List<TriggerParameter> parameters) {
            this.parameters = parameters;
            return this;
        }
        public OpenWhiskTriggerQueryParam addParametersItem(TriggerParameter parametersItem) {
            this.parameters.add(parametersItem);
            return this;
        }

        /**
        * Payload is the list of key-value extracted from an event payload to construct the request payload.
        * @return payload
        **/
        @JsonProperty("payload")
        public List<TriggerParameter> getPayload() {
            return payload;
        }

        /**
         * Set payload
         **/
        public void setPayload(List<TriggerParameter> payload) {
            this.payload = payload;
        }

        public OpenWhiskTriggerQueryParam payload(List<TriggerParameter> payload) {
            this.payload = payload;
            return this;
        }
        public OpenWhiskTriggerQueryParam addPayloadItem(TriggerParameter payloadItem) {
            this.payload.add(payloadItem);
            return this;
        }

        /**
        * Get version
        * @return version
        **/
        @JsonProperty("version")
        public String getVersion() {
            return version;
        }

        /**
         * Set version
         **/
        public void setVersion(String version) {
            this.version = version;
        }

        public OpenWhiskTriggerQueryParam version(String version) {
            this.version = version;
            return this;
        }

        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class OpenWhiskTriggerQueryParam {\n");

            sb.append("    actionName: ").append(toIndentedString(actionName)).append("\n");
            sb.append("    authToken: ").append(toIndentedString(authToken)).append("\n");
            sb.append("    host: ").append(toIndentedString(host)).append("\n");
            sb.append("    namespace: ").append(toIndentedString(namespace)).append("\n");
            sb.append("    parameters: ").append(toIndentedString(parameters)).append("\n");
            sb.append("    payload: ").append(toIndentedString(payload)).append("\n");
            sb.append("    version: ").append(toIndentedString(version)).append("\n");
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
