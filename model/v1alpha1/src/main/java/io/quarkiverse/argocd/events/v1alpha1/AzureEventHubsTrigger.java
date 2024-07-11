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
public class AzureEventHubsTrigger  {

    private String fqdn;
    private String hubName;
    private List<TriggerParameter> parameters;
    private List<TriggerParameter> payload;
    private SecretKeySelector sharedAccessKey;
    private SecretKeySelector sharedAccessKeyName;

    /**
    * Get fqdn
    * @return fqdn
    **/
    @JsonProperty("fqdn")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public String getFqdn() {
        return fqdn;
    }

    /**
     * Set fqdn
     **/
    public void setFqdn(String fqdn) {
        this.fqdn = fqdn;
    }

    public AzureEventHubsTrigger fqdn(String fqdn) {
        this.fqdn = fqdn;
        return this;
    }

    /**
    * Get hubName
    * @return hubName
    **/
    @JsonProperty("hubName")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public String getHubName() {
        return hubName;
    }

    /**
     * Set hubName
     **/
    public void setHubName(String hubName) {
        this.hubName = hubName;
    }

    public AzureEventHubsTrigger hubName(String hubName) {
        this.hubName = hubName;
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

    public AzureEventHubsTrigger parameters(List<TriggerParameter> parameters) {
        this.parameters = parameters;
        return this;
    }
    public AzureEventHubsTrigger addParametersItem(TriggerParameter parametersItem) {
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

    public AzureEventHubsTrigger payload(List<TriggerParameter> payload) {
        this.payload = payload;
        return this;
    }
    public AzureEventHubsTrigger addPayloadItem(TriggerParameter payloadItem) {
        if (this.payload == null){
            payload = new ArrayList<>();
        }
        this.payload.add(payloadItem);
        return this;
    }

    /**
    * Get sharedAccessKey
    * @return sharedAccessKey
    **/
    @JsonProperty("sharedAccessKey")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public SecretKeySelector getSharedAccessKey() {
        return sharedAccessKey;
    }

    /**
     * Set sharedAccessKey
     **/
    public void setSharedAccessKey(SecretKeySelector sharedAccessKey) {
        this.sharedAccessKey = sharedAccessKey;
    }

    public AzureEventHubsTrigger sharedAccessKey(SecretKeySelector sharedAccessKey) {
        this.sharedAccessKey = sharedAccessKey;
        return this;
    }

    /**
    * Get sharedAccessKeyName
    * @return sharedAccessKeyName
    **/
    @JsonProperty("sharedAccessKeyName")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public SecretKeySelector getSharedAccessKeyName() {
        return sharedAccessKeyName;
    }

    /**
     * Set sharedAccessKeyName
     **/
    public void setSharedAccessKeyName(SecretKeySelector sharedAccessKeyName) {
        this.sharedAccessKeyName = sharedAccessKeyName;
    }

    public AzureEventHubsTrigger sharedAccessKeyName(SecretKeySelector sharedAccessKeyName) {
        this.sharedAccessKeyName = sharedAccessKeyName;
        return this;
    }

    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AzureEventHubsTrigger {\n");

        sb.append("    fqdn: ").append(toIndentedString(fqdn)).append("\n");
        sb.append("    hubName: ").append(toIndentedString(hubName)).append("\n");
        sb.append("    parameters: ").append(toIndentedString(parameters)).append("\n");
        sb.append("    payload: ").append(toIndentedString(payload)).append("\n");
        sb.append("    sharedAccessKey: ").append(toIndentedString(sharedAccessKey)).append("\n");
        sb.append("    sharedAccessKeyName: ").append(toIndentedString(sharedAccessKeyName)).append("\n");
        
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
    public static class AzureEventHubsTriggerQueryParam  {

        @jakarta.ws.rs.QueryParam("fqdn")
        private String fqdn;
        @jakarta.ws.rs.QueryParam("hubName")
        private String hubName;
        @jakarta.ws.rs.QueryParam("parameters")
        private List<TriggerParameter> parameters = null;
        @jakarta.ws.rs.QueryParam("payload")
        private List<TriggerParameter> payload = null;
        @jakarta.ws.rs.QueryParam("sharedAccessKey")
        private SecretKeySelector sharedAccessKey;
        @jakarta.ws.rs.QueryParam("sharedAccessKeyName")
        private SecretKeySelector sharedAccessKeyName;

        /**
        * Get fqdn
        * @return fqdn
        **/
        @JsonProperty("fqdn")
        public String getFqdn() {
            return fqdn;
        }

        /**
         * Set fqdn
         **/
        public void setFqdn(String fqdn) {
            this.fqdn = fqdn;
        }

        public AzureEventHubsTriggerQueryParam fqdn(String fqdn) {
            this.fqdn = fqdn;
            return this;
        }

        /**
        * Get hubName
        * @return hubName
        **/
        @JsonProperty("hubName")
        public String getHubName() {
            return hubName;
        }

        /**
         * Set hubName
         **/
        public void setHubName(String hubName) {
            this.hubName = hubName;
        }

        public AzureEventHubsTriggerQueryParam hubName(String hubName) {
            this.hubName = hubName;
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

        public AzureEventHubsTriggerQueryParam parameters(List<TriggerParameter> parameters) {
            this.parameters = parameters;
            return this;
        }
        public AzureEventHubsTriggerQueryParam addParametersItem(TriggerParameter parametersItem) {
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

        public AzureEventHubsTriggerQueryParam payload(List<TriggerParameter> payload) {
            this.payload = payload;
            return this;
        }
        public AzureEventHubsTriggerQueryParam addPayloadItem(TriggerParameter payloadItem) {
            this.payload.add(payloadItem);
            return this;
        }

        /**
        * Get sharedAccessKey
        * @return sharedAccessKey
        **/
        @JsonProperty("sharedAccessKey")
        public SecretKeySelector getSharedAccessKey() {
            return sharedAccessKey;
        }

        /**
         * Set sharedAccessKey
         **/
        public void setSharedAccessKey(SecretKeySelector sharedAccessKey) {
            this.sharedAccessKey = sharedAccessKey;
        }

        public AzureEventHubsTriggerQueryParam sharedAccessKey(SecretKeySelector sharedAccessKey) {
            this.sharedAccessKey = sharedAccessKey;
            return this;
        }

        /**
        * Get sharedAccessKeyName
        * @return sharedAccessKeyName
        **/
        @JsonProperty("sharedAccessKeyName")
        public SecretKeySelector getSharedAccessKeyName() {
            return sharedAccessKeyName;
        }

        /**
         * Set sharedAccessKeyName
         **/
        public void setSharedAccessKeyName(SecretKeySelector sharedAccessKeyName) {
            this.sharedAccessKeyName = sharedAccessKeyName;
        }

        public AzureEventHubsTriggerQueryParam sharedAccessKeyName(SecretKeySelector sharedAccessKeyName) {
            this.sharedAccessKeyName = sharedAccessKeyName;
            return this;
        }

        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class AzureEventHubsTriggerQueryParam {\n");

            sb.append("    fqdn: ").append(toIndentedString(fqdn)).append("\n");
            sb.append("    hubName: ").append(toIndentedString(hubName)).append("\n");
            sb.append("    parameters: ").append(toIndentedString(parameters)).append("\n");
            sb.append("    payload: ").append(toIndentedString(payload)).append("\n");
            sb.append("    sharedAccessKey: ").append(toIndentedString(sharedAccessKey)).append("\n");
            sb.append("    sharedAccessKeyName: ").append(toIndentedString(sharedAccessKeyName)).append("\n");
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
