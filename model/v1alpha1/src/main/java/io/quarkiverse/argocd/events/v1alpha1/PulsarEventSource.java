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
public class PulsarEventSource  {

    private Map<String, String> authAthenzParams;
    private SecretKeySelector authAthenzSecret;
    private SecretKeySelector authTokenSecret;
    private Backoff connectionBackoff;
    private EventSourceFilter filter;
    private Boolean jsonBody;
    private Map<String, String> metadata;
    private TLSConfig tls;
    private Boolean tlsAllowInsecureConnection;
    private SecretKeySelector tlsTrustCertsSecret;
    private Boolean tlsValidateHostname;
    private List<String> topics;
    private String type;
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

    public PulsarEventSource authAthenzParams(Map<String, String> authAthenzParams) {
        this.authAthenzParams = authAthenzParams;
        return this;
    }
    public PulsarEventSource putAuthAthenzParamsItem(String key, String authAthenzParamsItem) {
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

    public PulsarEventSource authAthenzSecret(SecretKeySelector authAthenzSecret) {
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

    public PulsarEventSource authTokenSecret(SecretKeySelector authTokenSecret) {
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

    public PulsarEventSource connectionBackoff(Backoff connectionBackoff) {
        this.connectionBackoff = connectionBackoff;
        return this;
    }

    /**
    * Get filter
    * @return filter
    **/
    @JsonProperty("filter")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public EventSourceFilter getFilter() {
        return filter;
    }

    /**
     * Set filter
     **/
    public void setFilter(EventSourceFilter filter) {
        this.filter = filter;
    }

    public PulsarEventSource filter(EventSourceFilter filter) {
        this.filter = filter;
        return this;
    }

    /**
    * Get jsonBody
    * @return jsonBody
    **/
    @JsonProperty("jsonBody")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public Boolean getJsonBody() {
        return jsonBody;
    }

    /**
     * Set jsonBody
     **/
    public void setJsonBody(Boolean jsonBody) {
        this.jsonBody = jsonBody;
    }

    public PulsarEventSource jsonBody(Boolean jsonBody) {
        this.jsonBody = jsonBody;
        return this;
    }

    /**
    * Get metadata
    * @return metadata
    **/
    @JsonProperty("metadata")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public Map<String, String> getMetadata() {
        return metadata;
    }

    /**
     * Set metadata
     **/
    public void setMetadata(Map<String, String> metadata) {
        this.metadata = metadata;
    }

    public PulsarEventSource metadata(Map<String, String> metadata) {
        this.metadata = metadata;
        return this;
    }
    public PulsarEventSource putMetadataItem(String key, String metadataItem) {
           if (this.metadata == null){
                metadata = new HashMap<>();
            }
        this.metadata.put(key, metadataItem);
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

    public PulsarEventSource tls(TLSConfig tls) {
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

    public PulsarEventSource tlsAllowInsecureConnection(Boolean tlsAllowInsecureConnection) {
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

    public PulsarEventSource tlsTrustCertsSecret(SecretKeySelector tlsTrustCertsSecret) {
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

    public PulsarEventSource tlsValidateHostname(Boolean tlsValidateHostname) {
        this.tlsValidateHostname = tlsValidateHostname;
        return this;
    }

    /**
    * Get topics
    * @return topics
    **/
    @JsonProperty("topics")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public List<String> getTopics() {
        return topics;
    }

    /**
     * Set topics
     **/
    public void setTopics(List<String> topics) {
        this.topics = topics;
    }

    public PulsarEventSource topics(List<String> topics) {
        this.topics = topics;
        return this;
    }
    public PulsarEventSource addTopicsItem(String topicsItem) {
        if (this.topics == null){
            topics = new ArrayList<>();
        }
        this.topics.add(topicsItem);
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

    public PulsarEventSource type(String type) {
        this.type = type;
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

    public PulsarEventSource url(String url) {
        this.url = url;
        return this;
    }

    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PulsarEventSource {\n");

        sb.append("    authAthenzParams: ").append(toIndentedString(authAthenzParams)).append("\n");
        sb.append("    authAthenzSecret: ").append(toIndentedString(authAthenzSecret)).append("\n");
        sb.append("    authTokenSecret: ").append(toIndentedString(authTokenSecret)).append("\n");
        sb.append("    connectionBackoff: ").append(toIndentedString(connectionBackoff)).append("\n");
        sb.append("    filter: ").append(toIndentedString(filter)).append("\n");
        sb.append("    jsonBody: ").append(toIndentedString(jsonBody)).append("\n");
        sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
        sb.append("    tls: ").append(toIndentedString(tls)).append("\n");
        sb.append("    tlsAllowInsecureConnection: ").append(toIndentedString(tlsAllowInsecureConnection)).append("\n");
        sb.append("    tlsTrustCertsSecret: ").append(toIndentedString(tlsTrustCertsSecret)).append("\n");
        sb.append("    tlsValidateHostname: ").append(toIndentedString(tlsValidateHostname)).append("\n");
        sb.append("    topics: ").append(toIndentedString(topics)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
    public static class PulsarEventSourceQueryParam  {

        @jakarta.ws.rs.QueryParam("authAthenzParams")
        private Map<String, String> authAthenzParams = null;
        @jakarta.ws.rs.QueryParam("authAthenzSecret")
        private SecretKeySelector authAthenzSecret;
        @jakarta.ws.rs.QueryParam("authTokenSecret")
        private SecretKeySelector authTokenSecret;
        @jakarta.ws.rs.QueryParam("connectionBackoff")
        private Backoff connectionBackoff;
        @jakarta.ws.rs.QueryParam("filter")
        private EventSourceFilter filter;
        @jakarta.ws.rs.QueryParam("jsonBody")
        private Boolean jsonBody;
        @jakarta.ws.rs.QueryParam("metadata")
        private Map<String, String> metadata = null;
        @jakarta.ws.rs.QueryParam("tls")
        private TLSConfig tls;
        @jakarta.ws.rs.QueryParam("tlsAllowInsecureConnection")
        private Boolean tlsAllowInsecureConnection;
        @jakarta.ws.rs.QueryParam("tlsTrustCertsSecret")
        private SecretKeySelector tlsTrustCertsSecret;
        @jakarta.ws.rs.QueryParam("tlsValidateHostname")
        private Boolean tlsValidateHostname;
        @jakarta.ws.rs.QueryParam("topics")
        private List<String> topics = null;
        @jakarta.ws.rs.QueryParam("type")
        private String type;
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

        public PulsarEventSourceQueryParam authAthenzParams(Map<String, String> authAthenzParams) {
            this.authAthenzParams = authAthenzParams;
            return this;
        }
        public PulsarEventSourceQueryParam putAuthAthenzParamsItem(String key, String authAthenzParamsItem) {
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

        public PulsarEventSourceQueryParam authAthenzSecret(SecretKeySelector authAthenzSecret) {
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

        public PulsarEventSourceQueryParam authTokenSecret(SecretKeySelector authTokenSecret) {
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

        public PulsarEventSourceQueryParam connectionBackoff(Backoff connectionBackoff) {
            this.connectionBackoff = connectionBackoff;
            return this;
        }

        /**
        * Get filter
        * @return filter
        **/
        @JsonProperty("filter")
        public EventSourceFilter getFilter() {
            return filter;
        }

        /**
         * Set filter
         **/
        public void setFilter(EventSourceFilter filter) {
            this.filter = filter;
        }

        public PulsarEventSourceQueryParam filter(EventSourceFilter filter) {
            this.filter = filter;
            return this;
        }

        /**
        * Get jsonBody
        * @return jsonBody
        **/
        @JsonProperty("jsonBody")
        public Boolean getJsonBody() {
            return jsonBody;
        }

        /**
         * Set jsonBody
         **/
        public void setJsonBody(Boolean jsonBody) {
            this.jsonBody = jsonBody;
        }

        public PulsarEventSourceQueryParam jsonBody(Boolean jsonBody) {
            this.jsonBody = jsonBody;
            return this;
        }

        /**
        * Get metadata
        * @return metadata
        **/
        @JsonProperty("metadata")
        public Map<String, String> getMetadata() {
            return metadata;
        }

        /**
         * Set metadata
         **/
        public void setMetadata(Map<String, String> metadata) {
            this.metadata = metadata;
        }

        public PulsarEventSourceQueryParam metadata(Map<String, String> metadata) {
            this.metadata = metadata;
            return this;
        }
        public PulsarEventSourceQueryParam putMetadataItem(String key, String metadataItem) {
            this.metadata.put(key, metadataItem);
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

        public PulsarEventSourceQueryParam tls(TLSConfig tls) {
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

        public PulsarEventSourceQueryParam tlsAllowInsecureConnection(Boolean tlsAllowInsecureConnection) {
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

        public PulsarEventSourceQueryParam tlsTrustCertsSecret(SecretKeySelector tlsTrustCertsSecret) {
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

        public PulsarEventSourceQueryParam tlsValidateHostname(Boolean tlsValidateHostname) {
            this.tlsValidateHostname = tlsValidateHostname;
            return this;
        }

        /**
        * Get topics
        * @return topics
        **/
        @JsonProperty("topics")
        public List<String> getTopics() {
            return topics;
        }

        /**
         * Set topics
         **/
        public void setTopics(List<String> topics) {
            this.topics = topics;
        }

        public PulsarEventSourceQueryParam topics(List<String> topics) {
            this.topics = topics;
            return this;
        }
        public PulsarEventSourceQueryParam addTopicsItem(String topicsItem) {
            this.topics.add(topicsItem);
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

        public PulsarEventSourceQueryParam type(String type) {
            this.type = type;
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

        public PulsarEventSourceQueryParam url(String url) {
            this.url = url;
            return this;
        }

        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class PulsarEventSourceQueryParam {\n");

            sb.append("    authAthenzParams: ").append(toIndentedString(authAthenzParams)).append("\n");
            sb.append("    authAthenzSecret: ").append(toIndentedString(authAthenzSecret)).append("\n");
            sb.append("    authTokenSecret: ").append(toIndentedString(authTokenSecret)).append("\n");
            sb.append("    connectionBackoff: ").append(toIndentedString(connectionBackoff)).append("\n");
            sb.append("    filter: ").append(toIndentedString(filter)).append("\n");
            sb.append("    jsonBody: ").append(toIndentedString(jsonBody)).append("\n");
            sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
            sb.append("    tls: ").append(toIndentedString(tls)).append("\n");
            sb.append("    tlsAllowInsecureConnection: ").append(toIndentedString(tlsAllowInsecureConnection)).append("\n");
            sb.append("    tlsTrustCertsSecret: ").append(toIndentedString(tlsTrustCertsSecret)).append("\n");
            sb.append("    tlsValidateHostname: ").append(toIndentedString(tlsValidateHostname)).append("\n");
            sb.append("    topics: ").append(toIndentedString(topics)).append("\n");
            sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
