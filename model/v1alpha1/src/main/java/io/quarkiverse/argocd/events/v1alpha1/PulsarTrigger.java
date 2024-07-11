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
  * PulsarTrigger refers to the specification of the Pulsar trigger.
 **/
public class PulsarTrigger  {

    /**
      * PulsarTrigger refers to the specification of the Pulsar trigger.
     **/
    private Map<String, String> authAthenzParams;
    /**
      * PulsarTrigger refers to the specification of the Pulsar trigger.
     **/
    private SecretKeySelector authAthenzSecret;
    /**
      * PulsarTrigger refers to the specification of the Pulsar trigger.
     **/
    private SecretKeySelector authTokenSecret;
    /**
      * PulsarTrigger refers to the specification of the Pulsar trigger.
     **/
    private Backoff connectionBackoff;
    /**
      * PulsarTrigger refers to the specification of the Pulsar trigger.
     **/
    private List<TriggerParameter> parameters;
    /**
      * PulsarTrigger refers to the specification of the Pulsar trigger.
     **/
    private List<TriggerParameter> payload;
    /**
      * PulsarTrigger refers to the specification of the Pulsar trigger.
     **/
    private TLSConfig tls;
    /**
      * PulsarTrigger refers to the specification of the Pulsar trigger.
     **/
    private Boolean tlsAllowInsecureConnection;
    /**
      * PulsarTrigger refers to the specification of the Pulsar trigger.
     **/
    private SecretKeySelector tlsTrustCertsSecret;
    /**
      * PulsarTrigger refers to the specification of the Pulsar trigger.
     **/
    private Boolean tlsValidateHostname;
    /**
      * PulsarTrigger refers to the specification of the Pulsar trigger.
     **/
    private String topic;
    /**
      * PulsarTrigger refers to the specification of the Pulsar trigger.
     **/
    private String url;

    /**
    * Get authAthenzParams
    * @return authAthenzParams
    **/
    @JsonProperty("authAthenzParams")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public Map<String, String> getAuthAthenzParams() {
        return authAthenzParams;
    }

    /**
     * Set authAthenzParams
     **/
    public void setAuthAthenzParams(Map<String, String> authAthenzParams) {
        this.authAthenzParams = authAthenzParams;
    }

    public PulsarTrigger authAthenzParams(Map<String, String> authAthenzParams) {
        this.authAthenzParams = authAthenzParams;
        return this;
    }
    public PulsarTrigger putAuthAthenzParamsItem(String key, String authAthenzParamsItem) {
           if (this.authAthenzParams == null){
                authAthenzParams = new HashMap<>();
            }
        this.authAthenzParams.put(key, authAthenzParamsItem);
        return this;
    }

    /**
    * Get authAthenzSecret
    * @return authAthenzSecret
    **/
    @JsonProperty("authAthenzSecret")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public SecretKeySelector getAuthAthenzSecret() {
        return authAthenzSecret;
    }

    /**
     * Set authAthenzSecret
     **/
    public void setAuthAthenzSecret(SecretKeySelector authAthenzSecret) {
        this.authAthenzSecret = authAthenzSecret;
    }

    public PulsarTrigger authAthenzSecret(SecretKeySelector authAthenzSecret) {
        this.authAthenzSecret = authAthenzSecret;
        return this;
    }

    /**
    * Get authTokenSecret
    * @return authTokenSecret
    **/
    @JsonProperty("authTokenSecret")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public SecretKeySelector getAuthTokenSecret() {
        return authTokenSecret;
    }

    /**
     * Set authTokenSecret
     **/
    public void setAuthTokenSecret(SecretKeySelector authTokenSecret) {
        this.authTokenSecret = authTokenSecret;
    }

    public PulsarTrigger authTokenSecret(SecretKeySelector authTokenSecret) {
        this.authTokenSecret = authTokenSecret;
        return this;
    }

    /**
    * Get connectionBackoff
    * @return connectionBackoff
    **/
    @JsonProperty("connectionBackoff")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public Backoff getConnectionBackoff() {
        return connectionBackoff;
    }

    /**
     * Set connectionBackoff
     **/
    public void setConnectionBackoff(Backoff connectionBackoff) {
        this.connectionBackoff = connectionBackoff;
    }

    public PulsarTrigger connectionBackoff(Backoff connectionBackoff) {
        this.connectionBackoff = connectionBackoff;
        return this;
    }

    /**
    * Parameters is the list of parameters that is applied to resolved Kafka trigger object.
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

    public PulsarTrigger parameters(List<TriggerParameter> parameters) {
        this.parameters = parameters;
        return this;
    }
    public PulsarTrigger addParametersItem(TriggerParameter parametersItem) {
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

    public PulsarTrigger payload(List<TriggerParameter> payload) {
        this.payload = payload;
        return this;
    }
    public PulsarTrigger addPayloadItem(TriggerParameter payloadItem) {
        if (this.payload == null){
            payload = new ArrayList<>();
        }
        this.payload.add(payloadItem);
        return this;
    }

    /**
    * Get tls
    * @return tls
    **/
    @JsonProperty("tls")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public TLSConfig getTls() {
        return tls;
    }

    /**
     * Set tls
     **/
    public void setTls(TLSConfig tls) {
        this.tls = tls;
    }

    public PulsarTrigger tls(TLSConfig tls) {
        this.tls = tls;
        return this;
    }

    /**
    * Get tlsAllowInsecureConnection
    * @return tlsAllowInsecureConnection
    **/
    @JsonProperty("tlsAllowInsecureConnection")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public Boolean getTlsAllowInsecureConnection() {
        return tlsAllowInsecureConnection;
    }

    /**
     * Set tlsAllowInsecureConnection
     **/
    public void setTlsAllowInsecureConnection(Boolean tlsAllowInsecureConnection) {
        this.tlsAllowInsecureConnection = tlsAllowInsecureConnection;
    }

    public PulsarTrigger tlsAllowInsecureConnection(Boolean tlsAllowInsecureConnection) {
        this.tlsAllowInsecureConnection = tlsAllowInsecureConnection;
        return this;
    }

    /**
    * Get tlsTrustCertsSecret
    * @return tlsTrustCertsSecret
    **/
    @JsonProperty("tlsTrustCertsSecret")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public SecretKeySelector getTlsTrustCertsSecret() {
        return tlsTrustCertsSecret;
    }

    /**
     * Set tlsTrustCertsSecret
     **/
    public void setTlsTrustCertsSecret(SecretKeySelector tlsTrustCertsSecret) {
        this.tlsTrustCertsSecret = tlsTrustCertsSecret;
    }

    public PulsarTrigger tlsTrustCertsSecret(SecretKeySelector tlsTrustCertsSecret) {
        this.tlsTrustCertsSecret = tlsTrustCertsSecret;
        return this;
    }

    /**
    * Get tlsValidateHostname
    * @return tlsValidateHostname
    **/
    @JsonProperty("tlsValidateHostname")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public Boolean getTlsValidateHostname() {
        return tlsValidateHostname;
    }

    /**
     * Set tlsValidateHostname
     **/
    public void setTlsValidateHostname(Boolean tlsValidateHostname) {
        this.tlsValidateHostname = tlsValidateHostname;
    }

    public PulsarTrigger tlsValidateHostname(Boolean tlsValidateHostname) {
        this.tlsValidateHostname = tlsValidateHostname;
        return this;
    }

    /**
    * Get topic
    * @return topic
    **/
    @JsonProperty("topic")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public String getTopic() {
        return topic;
    }

    /**
     * Set topic
     **/
    public void setTopic(String topic) {
        this.topic = topic;
    }

    public PulsarTrigger topic(String topic) {
        this.topic = topic;
        return this;
    }

    /**
    * Get url
    * @return url
    **/
    @JsonProperty("url")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public String getUrl() {
        return url;
    }

    /**
     * Set url
     **/
    public void setUrl(String url) {
        this.url = url;
    }

    public PulsarTrigger url(String url) {
        this.url = url;
        return this;
    }

    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PulsarTrigger {\n");

        sb.append("    authAthenzParams: ").append(toIndentedString(authAthenzParams)).append("\n");
        sb.append("    authAthenzSecret: ").append(toIndentedString(authAthenzSecret)).append("\n");
        sb.append("    authTokenSecret: ").append(toIndentedString(authTokenSecret)).append("\n");
        sb.append("    connectionBackoff: ").append(toIndentedString(connectionBackoff)).append("\n");
        sb.append("    parameters: ").append(toIndentedString(parameters)).append("\n");
        sb.append("    payload: ").append(toIndentedString(payload)).append("\n");
        sb.append("    tls: ").append(toIndentedString(tls)).append("\n");
        sb.append("    tlsAllowInsecureConnection: ").append(toIndentedString(tlsAllowInsecureConnection)).append("\n");
        sb.append("    tlsTrustCertsSecret: ").append(toIndentedString(tlsTrustCertsSecret)).append("\n");
        sb.append("    tlsValidateHostname: ").append(toIndentedString(tlsValidateHostname)).append("\n");
        sb.append("    topic: ").append(toIndentedString(topic)).append("\n");
        sb.append("    url: ").append(toIndentedString(url)).append("\n");
        
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
      * PulsarTrigger refers to the specification of the Pulsar trigger.
     **/
    public static class PulsarTriggerQueryParam  {

        /**
          * PulsarTrigger refers to the specification of the Pulsar trigger.
         **/
        @jakarta.ws.rs.QueryParam("authAthenzParams")
        private Map<String, String> authAthenzParams = null;
        /**
          * PulsarTrigger refers to the specification of the Pulsar trigger.
         **/
        @jakarta.ws.rs.QueryParam("authAthenzSecret")
        private SecretKeySelector authAthenzSecret;
        /**
          * PulsarTrigger refers to the specification of the Pulsar trigger.
         **/
        @jakarta.ws.rs.QueryParam("authTokenSecret")
        private SecretKeySelector authTokenSecret;
        /**
          * PulsarTrigger refers to the specification of the Pulsar trigger.
         **/
        @jakarta.ws.rs.QueryParam("connectionBackoff")
        private Backoff connectionBackoff;
        /**
          * PulsarTrigger refers to the specification of the Pulsar trigger.
         **/
        @jakarta.ws.rs.QueryParam("parameters")
        private List<TriggerParameter> parameters = null;
        /**
          * PulsarTrigger refers to the specification of the Pulsar trigger.
         **/
        @jakarta.ws.rs.QueryParam("payload")
        private List<TriggerParameter> payload = null;
        /**
          * PulsarTrigger refers to the specification of the Pulsar trigger.
         **/
        @jakarta.ws.rs.QueryParam("tls")
        private TLSConfig tls;
        /**
          * PulsarTrigger refers to the specification of the Pulsar trigger.
         **/
        @jakarta.ws.rs.QueryParam("tlsAllowInsecureConnection")
        private Boolean tlsAllowInsecureConnection;
        /**
          * PulsarTrigger refers to the specification of the Pulsar trigger.
         **/
        @jakarta.ws.rs.QueryParam("tlsTrustCertsSecret")
        private SecretKeySelector tlsTrustCertsSecret;
        /**
          * PulsarTrigger refers to the specification of the Pulsar trigger.
         **/
        @jakarta.ws.rs.QueryParam("tlsValidateHostname")
        private Boolean tlsValidateHostname;
        /**
          * PulsarTrigger refers to the specification of the Pulsar trigger.
         **/
        @jakarta.ws.rs.QueryParam("topic")
        private String topic;
        /**
          * PulsarTrigger refers to the specification of the Pulsar trigger.
         **/
        @jakarta.ws.rs.QueryParam("url")
        private String url;

        /**
        * Get authAthenzParams
        * @return authAthenzParams
        **/
        @JsonProperty("authAthenzParams")
        public Map<String, String> getAuthAthenzParams() {
            return authAthenzParams;
        }

        /**
         * Set authAthenzParams
         **/
        public void setAuthAthenzParams(Map<String, String> authAthenzParams) {
            this.authAthenzParams = authAthenzParams;
        }

        public PulsarTriggerQueryParam authAthenzParams(Map<String, String> authAthenzParams) {
            this.authAthenzParams = authAthenzParams;
            return this;
        }
        public PulsarTriggerQueryParam putAuthAthenzParamsItem(String key, String authAthenzParamsItem) {
            this.authAthenzParams.put(key, authAthenzParamsItem);
            return this;
        }

        /**
        * Get authAthenzSecret
        * @return authAthenzSecret
        **/
        @JsonProperty("authAthenzSecret")
        public SecretKeySelector getAuthAthenzSecret() {
            return authAthenzSecret;
        }

        /**
         * Set authAthenzSecret
         **/
        public void setAuthAthenzSecret(SecretKeySelector authAthenzSecret) {
            this.authAthenzSecret = authAthenzSecret;
        }

        public PulsarTriggerQueryParam authAthenzSecret(SecretKeySelector authAthenzSecret) {
            this.authAthenzSecret = authAthenzSecret;
            return this;
        }

        /**
        * Get authTokenSecret
        * @return authTokenSecret
        **/
        @JsonProperty("authTokenSecret")
        public SecretKeySelector getAuthTokenSecret() {
            return authTokenSecret;
        }

        /**
         * Set authTokenSecret
         **/
        public void setAuthTokenSecret(SecretKeySelector authTokenSecret) {
            this.authTokenSecret = authTokenSecret;
        }

        public PulsarTriggerQueryParam authTokenSecret(SecretKeySelector authTokenSecret) {
            this.authTokenSecret = authTokenSecret;
            return this;
        }

        /**
        * Get connectionBackoff
        * @return connectionBackoff
        **/
        @JsonProperty("connectionBackoff")
        public Backoff getConnectionBackoff() {
            return connectionBackoff;
        }

        /**
         * Set connectionBackoff
         **/
        public void setConnectionBackoff(Backoff connectionBackoff) {
            this.connectionBackoff = connectionBackoff;
        }

        public PulsarTriggerQueryParam connectionBackoff(Backoff connectionBackoff) {
            this.connectionBackoff = connectionBackoff;
            return this;
        }

        /**
        * Parameters is the list of parameters that is applied to resolved Kafka trigger object.
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

        public PulsarTriggerQueryParam parameters(List<TriggerParameter> parameters) {
            this.parameters = parameters;
            return this;
        }
        public PulsarTriggerQueryParam addParametersItem(TriggerParameter parametersItem) {
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

        public PulsarTriggerQueryParam payload(List<TriggerParameter> payload) {
            this.payload = payload;
            return this;
        }
        public PulsarTriggerQueryParam addPayloadItem(TriggerParameter payloadItem) {
            this.payload.add(payloadItem);
            return this;
        }

        /**
        * Get tls
        * @return tls
        **/
        @JsonProperty("tls")
        public TLSConfig getTls() {
            return tls;
        }

        /**
         * Set tls
         **/
        public void setTls(TLSConfig tls) {
            this.tls = tls;
        }

        public PulsarTriggerQueryParam tls(TLSConfig tls) {
            this.tls = tls;
            return this;
        }

        /**
        * Get tlsAllowInsecureConnection
        * @return tlsAllowInsecureConnection
        **/
        @JsonProperty("tlsAllowInsecureConnection")
        public Boolean getTlsAllowInsecureConnection() {
            return tlsAllowInsecureConnection;
        }

        /**
         * Set tlsAllowInsecureConnection
         **/
        public void setTlsAllowInsecureConnection(Boolean tlsAllowInsecureConnection) {
            this.tlsAllowInsecureConnection = tlsAllowInsecureConnection;
        }

        public PulsarTriggerQueryParam tlsAllowInsecureConnection(Boolean tlsAllowInsecureConnection) {
            this.tlsAllowInsecureConnection = tlsAllowInsecureConnection;
            return this;
        }

        /**
        * Get tlsTrustCertsSecret
        * @return tlsTrustCertsSecret
        **/
        @JsonProperty("tlsTrustCertsSecret")
        public SecretKeySelector getTlsTrustCertsSecret() {
            return tlsTrustCertsSecret;
        }

        /**
         * Set tlsTrustCertsSecret
         **/
        public void setTlsTrustCertsSecret(SecretKeySelector tlsTrustCertsSecret) {
            this.tlsTrustCertsSecret = tlsTrustCertsSecret;
        }

        public PulsarTriggerQueryParam tlsTrustCertsSecret(SecretKeySelector tlsTrustCertsSecret) {
            this.tlsTrustCertsSecret = tlsTrustCertsSecret;
            return this;
        }

        /**
        * Get tlsValidateHostname
        * @return tlsValidateHostname
        **/
        @JsonProperty("tlsValidateHostname")
        public Boolean getTlsValidateHostname() {
            return tlsValidateHostname;
        }

        /**
         * Set tlsValidateHostname
         **/
        public void setTlsValidateHostname(Boolean tlsValidateHostname) {
            this.tlsValidateHostname = tlsValidateHostname;
        }

        public PulsarTriggerQueryParam tlsValidateHostname(Boolean tlsValidateHostname) {
            this.tlsValidateHostname = tlsValidateHostname;
            return this;
        }

        /**
        * Get topic
        * @return topic
        **/
        @JsonProperty("topic")
        public String getTopic() {
            return topic;
        }

        /**
         * Set topic
         **/
        public void setTopic(String topic) {
            this.topic = topic;
        }

        public PulsarTriggerQueryParam topic(String topic) {
            this.topic = topic;
            return this;
        }

        /**
        * Get url
        * @return url
        **/
        @JsonProperty("url")
        public String getUrl() {
            return url;
        }

        /**
         * Set url
         **/
        public void setUrl(String url) {
            this.url = url;
        }

        public PulsarTriggerQueryParam url(String url) {
            this.url = url;
            return this;
        }

        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class PulsarTriggerQueryParam {\n");

            sb.append("    authAthenzParams: ").append(toIndentedString(authAthenzParams)).append("\n");
            sb.append("    authAthenzSecret: ").append(toIndentedString(authAthenzSecret)).append("\n");
            sb.append("    authTokenSecret: ").append(toIndentedString(authTokenSecret)).append("\n");
            sb.append("    connectionBackoff: ").append(toIndentedString(connectionBackoff)).append("\n");
            sb.append("    parameters: ").append(toIndentedString(parameters)).append("\n");
            sb.append("    payload: ").append(toIndentedString(payload)).append("\n");
            sb.append("    tls: ").append(toIndentedString(tls)).append("\n");
            sb.append("    tlsAllowInsecureConnection: ").append(toIndentedString(tlsAllowInsecureConnection)).append("\n");
            sb.append("    tlsTrustCertsSecret: ").append(toIndentedString(tlsTrustCertsSecret)).append("\n");
            sb.append("    tlsValidateHostname: ").append(toIndentedString(tlsValidateHostname)).append("\n");
            sb.append("    topic: ").append(toIndentedString(topic)).append("\n");
            sb.append("    url: ").append(toIndentedString(url)).append("\n");
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
