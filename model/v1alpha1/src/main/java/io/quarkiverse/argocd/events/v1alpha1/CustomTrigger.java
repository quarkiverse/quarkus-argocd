package io.quarkiverse.argocd.events.v1alpha1;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.fabric8.kubernetes.api.model.SecretKeySelector;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.Type;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
/**
  * CustomTrigger refers to the specification of the custom trigger.
 **/
public class CustomTrigger  {

    /**
      * CustomTrigger refers to the specification of the custom trigger.
     **/
    private SecretKeySelector certSecret;
    /**
      * CustomTrigger refers to the specification of the custom trigger.
     **/
    private List<TriggerParameter> parameters;
    /**
      * CustomTrigger refers to the specification of the custom trigger.
     **/
    private List<TriggerParameter> payload;
    /**
      * CustomTrigger refers to the specification of the custom trigger.
     **/
    private Boolean secure;
    /**
      * CustomTrigger refers to the specification of the custom trigger.
     **/
    private String serverNameOverride;
    /**
      * CustomTrigger refers to the specification of the custom trigger.
     **/
    private String serverURL;
    /**
      * CustomTrigger refers to the specification of the custom trigger.
     **/
    private Map<String, String> spec;

    /**
    * Get certSecret
    * @return certSecret
    **/
    @JsonProperty("certSecret")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public SecretKeySelector getCertSecret() {
        return certSecret;
    }

    /**
     * Set certSecret
     **/
    public void setCertSecret(SecretKeySelector certSecret) {
        this.certSecret = certSecret;
    }

    public CustomTrigger certSecret(SecretKeySelector certSecret) {
        this.certSecret = certSecret;
        return this;
    }

    /**
    * Parameters is the list of parameters that is applied to resolved custom trigger trigger object.
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

    public CustomTrigger parameters(List<TriggerParameter> parameters) {
        this.parameters = parameters;
        return this;
    }
    public CustomTrigger addParametersItem(TriggerParameter parametersItem) {
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

    public CustomTrigger payload(List<TriggerParameter> payload) {
        this.payload = payload;
        return this;
    }
    public CustomTrigger addPayloadItem(TriggerParameter payloadItem) {
        if (this.payload == null){
            payload = new ArrayList<>();
        }
        this.payload.add(payloadItem);
        return this;
    }

    /**
    * Get secure
    * @return secure
    **/
    @JsonProperty("secure")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public Boolean getSecure() {
        return secure;
    }

    /**
     * Set secure
     **/
    public void setSecure(Boolean secure) {
        this.secure = secure;
    }

    public CustomTrigger secure(Boolean secure) {
        this.secure = secure;
        return this;
    }

    /**
    * ServerNameOverride for the secure connection between sensor and custom trigger gRPC server.
    * @return serverNameOverride
    **/
    @JsonProperty("serverNameOverride")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public String getServerNameOverride() {
        return serverNameOverride;
    }

    /**
     * Set serverNameOverride
     **/
    public void setServerNameOverride(String serverNameOverride) {
        this.serverNameOverride = serverNameOverride;
    }

    public CustomTrigger serverNameOverride(String serverNameOverride) {
        this.serverNameOverride = serverNameOverride;
        return this;
    }

    /**
    * Get serverURL
    * @return serverURL
    **/
    @JsonProperty("serverURL")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public String getServerURL() {
        return serverURL;
    }

    /**
     * Set serverURL
     **/
    public void setServerURL(String serverURL) {
        this.serverURL = serverURL;
    }

    public CustomTrigger serverURL(String serverURL) {
        this.serverURL = serverURL;
        return this;
    }

    /**
    * Spec is the custom trigger resource specification that custom trigger gRPC server knows how to interpret.
    * @return spec
    **/
    @JsonProperty("spec")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public Map<String, String> getSpec() {
        return spec;
    }

    /**
     * Set spec
     **/
    public void setSpec(Map<String, String> spec) {
        this.spec = spec;
    }

    public CustomTrigger spec(Map<String, String> spec) {
        this.spec = spec;
        return this;
    }
    public CustomTrigger putSpecItem(String key, String specItem) {
           if (this.spec == null){
                spec = new HashMap<>();
            }
        this.spec.put(key, specItem);
        return this;
    }

    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CustomTrigger {\n");

        sb.append("    certSecret: ").append(toIndentedString(certSecret)).append("\n");
        sb.append("    parameters: ").append(toIndentedString(parameters)).append("\n");
        sb.append("    payload: ").append(toIndentedString(payload)).append("\n");
        sb.append("    secure: ").append(toIndentedString(secure)).append("\n");
        sb.append("    serverNameOverride: ").append(toIndentedString(serverNameOverride)).append("\n");
        sb.append("    serverURL: ").append(toIndentedString(serverURL)).append("\n");
        sb.append("    spec: ").append(toIndentedString(spec)).append("\n");
        
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
      * CustomTrigger refers to the specification of the custom trigger.
     **/
    public static class CustomTriggerQueryParam  {

        /**
          * CustomTrigger refers to the specification of the custom trigger.
         **/
        @jakarta.ws.rs.QueryParam("certSecret")
        private SecretKeySelector certSecret;
        /**
          * CustomTrigger refers to the specification of the custom trigger.
         **/
        @jakarta.ws.rs.QueryParam("parameters")
        private List<TriggerParameter> parameters = null;
        /**
          * CustomTrigger refers to the specification of the custom trigger.
         **/
        @jakarta.ws.rs.QueryParam("payload")
        private List<TriggerParameter> payload = null;
        /**
          * CustomTrigger refers to the specification of the custom trigger.
         **/
        @jakarta.ws.rs.QueryParam("secure")
        private Boolean secure;
        /**
          * CustomTrigger refers to the specification of the custom trigger.
         **/
        @jakarta.ws.rs.QueryParam("serverNameOverride")
        private String serverNameOverride;
        /**
          * CustomTrigger refers to the specification of the custom trigger.
         **/
        @jakarta.ws.rs.QueryParam("serverURL")
        private String serverURL;
        /**
          * CustomTrigger refers to the specification of the custom trigger.
         **/
        @jakarta.ws.rs.QueryParam("spec")
        private Map<String, String> spec = null;

        /**
        * Get certSecret
        * @return certSecret
        **/
        @JsonProperty("certSecret")
        public SecretKeySelector getCertSecret() {
            return certSecret;
        }

        /**
         * Set certSecret
         **/
        public void setCertSecret(SecretKeySelector certSecret) {
            this.certSecret = certSecret;
        }

        public CustomTriggerQueryParam certSecret(SecretKeySelector certSecret) {
            this.certSecret = certSecret;
            return this;
        }

        /**
        * Parameters is the list of parameters that is applied to resolved custom trigger trigger object.
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

        public CustomTriggerQueryParam parameters(List<TriggerParameter> parameters) {
            this.parameters = parameters;
            return this;
        }
        public CustomTriggerQueryParam addParametersItem(TriggerParameter parametersItem) {
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

        public CustomTriggerQueryParam payload(List<TriggerParameter> payload) {
            this.payload = payload;
            return this;
        }
        public CustomTriggerQueryParam addPayloadItem(TriggerParameter payloadItem) {
            this.payload.add(payloadItem);
            return this;
        }

        /**
        * Get secure
        * @return secure
        **/
        @JsonProperty("secure")
        public Boolean getSecure() {
            return secure;
        }

        /**
         * Set secure
         **/
        public void setSecure(Boolean secure) {
            this.secure = secure;
        }

        public CustomTriggerQueryParam secure(Boolean secure) {
            this.secure = secure;
            return this;
        }

        /**
        * ServerNameOverride for the secure connection between sensor and custom trigger gRPC server.
        * @return serverNameOverride
        **/
        @JsonProperty("serverNameOverride")
        public String getServerNameOverride() {
            return serverNameOverride;
        }

        /**
         * Set serverNameOverride
         **/
        public void setServerNameOverride(String serverNameOverride) {
            this.serverNameOverride = serverNameOverride;
        }

        public CustomTriggerQueryParam serverNameOverride(String serverNameOverride) {
            this.serverNameOverride = serverNameOverride;
            return this;
        }

        /**
        * Get serverURL
        * @return serverURL
        **/
        @JsonProperty("serverURL")
        public String getServerURL() {
            return serverURL;
        }

        /**
         * Set serverURL
         **/
        public void setServerURL(String serverURL) {
            this.serverURL = serverURL;
        }

        public CustomTriggerQueryParam serverURL(String serverURL) {
            this.serverURL = serverURL;
            return this;
        }

        /**
        * Spec is the custom trigger resource specification that custom trigger gRPC server knows how to interpret.
        * @return spec
        **/
        @JsonProperty("spec")
        public Map<String, String> getSpec() {
            return spec;
        }

        /**
         * Set spec
         **/
        public void setSpec(Map<String, String> spec) {
            this.spec = spec;
        }

        public CustomTriggerQueryParam spec(Map<String, String> spec) {
            this.spec = spec;
            return this;
        }
        public CustomTriggerQueryParam putSpecItem(String key, String specItem) {
            this.spec.put(key, specItem);
            return this;
        }

        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class CustomTriggerQueryParam {\n");

            sb.append("    certSecret: ").append(toIndentedString(certSecret)).append("\n");
            sb.append("    parameters: ").append(toIndentedString(parameters)).append("\n");
            sb.append("    payload: ").append(toIndentedString(payload)).append("\n");
            sb.append("    secure: ").append(toIndentedString(secure)).append("\n");
            sb.append("    serverNameOverride: ").append(toIndentedString(serverNameOverride)).append("\n");
            sb.append("    serverURL: ").append(toIndentedString(serverURL)).append("\n");
            sb.append("    spec: ").append(toIndentedString(spec)).append("\n");
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
