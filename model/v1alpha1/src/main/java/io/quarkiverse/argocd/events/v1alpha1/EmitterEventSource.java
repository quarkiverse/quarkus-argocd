package io.quarkiverse.argocd.events.v1alpha1;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.fabric8.kubernetes.api.model.SecretKeySelector;
import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.Type;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class EmitterEventSource  {

    private String broker;
    private String channelKey;
    private String channelName;
    private Backoff connectionBackoff;
    private EventSourceFilter filter;
    private Boolean jsonBody;
    private Map<String, String> metadata;
    private SecretKeySelector password;
    private TLSConfig tls;
    private SecretKeySelector username;

    /**
    * Broker URI to connect to.
    * @return broker
    **/
    @JsonProperty("broker")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public String getBroker() {
        return broker;
    }

    /**
     * Set broker
     **/
    public void setBroker(String broker) {
        this.broker = broker;
    }

    public EmitterEventSource broker(String broker) {
        this.broker = broker;
        return this;
    }

    /**
    * Get channelKey
    * @return channelKey
    **/
    @JsonProperty("channelKey")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public String getChannelKey() {
        return channelKey;
    }

    /**
     * Set channelKey
     **/
    public void setChannelKey(String channelKey) {
        this.channelKey = channelKey;
    }

    public EmitterEventSource channelKey(String channelKey) {
        this.channelKey = channelKey;
        return this;
    }

    /**
    * Get channelName
    * @return channelName
    **/
    @JsonProperty("channelName")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public String getChannelName() {
        return channelName;
    }

    /**
     * Set channelName
     **/
    public void setChannelName(String channelName) {
        this.channelName = channelName;
    }

    public EmitterEventSource channelName(String channelName) {
        this.channelName = channelName;
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

    public EmitterEventSource connectionBackoff(Backoff connectionBackoff) {
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

    public EmitterEventSource filter(EventSourceFilter filter) {
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

    public EmitterEventSource jsonBody(Boolean jsonBody) {
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

    public EmitterEventSource metadata(Map<String, String> metadata) {
        this.metadata = metadata;
        return this;
    }
    public EmitterEventSource putMetadataItem(String key, String metadataItem) {
           if (this.metadata == null){
                metadata = new HashMap<>();
            }
        this.metadata.put(key, metadataItem);
        return this;
    }

    /**
    * Get password
    * @return password
    **/
    @JsonProperty("password")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public SecretKeySelector getPassword() {
        return password;
    }

    /**
     * Set password
     **/
    public void setPassword(SecretKeySelector password) {
        this.password = password;
    }

    public EmitterEventSource password(SecretKeySelector password) {
        this.password = password;
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

    public EmitterEventSource tls(TLSConfig tls) {
        this.tls = tls;
        return this;
    }

    /**
    * Get username
    * @return username
    **/
    @JsonProperty("username")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public SecretKeySelector getUsername() {
        return username;
    }

    /**
     * Set username
     **/
    public void setUsername(SecretKeySelector username) {
        this.username = username;
    }

    public EmitterEventSource username(SecretKeySelector username) {
        this.username = username;
        return this;
    }

    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class EmitterEventSource {\n");

        sb.append("    broker: ").append(toIndentedString(broker)).append("\n");
        sb.append("    channelKey: ").append(toIndentedString(channelKey)).append("\n");
        sb.append("    channelName: ").append(toIndentedString(channelName)).append("\n");
        sb.append("    connectionBackoff: ").append(toIndentedString(connectionBackoff)).append("\n");
        sb.append("    filter: ").append(toIndentedString(filter)).append("\n");
        sb.append("    jsonBody: ").append(toIndentedString(jsonBody)).append("\n");
        sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
        sb.append("    password: ").append(toIndentedString(password)).append("\n");
        sb.append("    tls: ").append(toIndentedString(tls)).append("\n");
        sb.append("    username: ").append(toIndentedString(username)).append("\n");
        
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
    public static class EmitterEventSourceQueryParam  {

        @jakarta.ws.rs.QueryParam("broker")
        private String broker;
        @jakarta.ws.rs.QueryParam("channelKey")
        private String channelKey;
        @jakarta.ws.rs.QueryParam("channelName")
        private String channelName;
        @jakarta.ws.rs.QueryParam("connectionBackoff")
        private Backoff connectionBackoff;
        @jakarta.ws.rs.QueryParam("filter")
        private EventSourceFilter filter;
        @jakarta.ws.rs.QueryParam("jsonBody")
        private Boolean jsonBody;
        @jakarta.ws.rs.QueryParam("metadata")
        private Map<String, String> metadata = null;
        @jakarta.ws.rs.QueryParam("password")
        private SecretKeySelector password;
        @jakarta.ws.rs.QueryParam("tls")
        private TLSConfig tls;
        @jakarta.ws.rs.QueryParam("username")
        private SecretKeySelector username;

        /**
        * Broker URI to connect to.
        * @return broker
        **/
        @JsonProperty("broker")
        public String getBroker() {
            return broker;
        }

        /**
         * Set broker
         **/
        public void setBroker(String broker) {
            this.broker = broker;
        }

        public EmitterEventSourceQueryParam broker(String broker) {
            this.broker = broker;
            return this;
        }

        /**
        * Get channelKey
        * @return channelKey
        **/
        @JsonProperty("channelKey")
        public String getChannelKey() {
            return channelKey;
        }

        /**
         * Set channelKey
         **/
        public void setChannelKey(String channelKey) {
            this.channelKey = channelKey;
        }

        public EmitterEventSourceQueryParam channelKey(String channelKey) {
            this.channelKey = channelKey;
            return this;
        }

        /**
        * Get channelName
        * @return channelName
        **/
        @JsonProperty("channelName")
        public String getChannelName() {
            return channelName;
        }

        /**
         * Set channelName
         **/
        public void setChannelName(String channelName) {
            this.channelName = channelName;
        }

        public EmitterEventSourceQueryParam channelName(String channelName) {
            this.channelName = channelName;
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

        public EmitterEventSourceQueryParam connectionBackoff(Backoff connectionBackoff) {
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

        public EmitterEventSourceQueryParam filter(EventSourceFilter filter) {
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

        public EmitterEventSourceQueryParam jsonBody(Boolean jsonBody) {
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

        public EmitterEventSourceQueryParam metadata(Map<String, String> metadata) {
            this.metadata = metadata;
            return this;
        }
        public EmitterEventSourceQueryParam putMetadataItem(String key, String metadataItem) {
            this.metadata.put(key, metadataItem);
            return this;
        }

        /**
        * Get password
        * @return password
        **/
        @JsonProperty("password")
        public SecretKeySelector getPassword() {
            return password;
        }

        /**
         * Set password
         **/
        public void setPassword(SecretKeySelector password) {
            this.password = password;
        }

        public EmitterEventSourceQueryParam password(SecretKeySelector password) {
            this.password = password;
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

        public EmitterEventSourceQueryParam tls(TLSConfig tls) {
            this.tls = tls;
            return this;
        }

        /**
        * Get username
        * @return username
        **/
        @JsonProperty("username")
        public SecretKeySelector getUsername() {
            return username;
        }

        /**
         * Set username
         **/
        public void setUsername(SecretKeySelector username) {
            this.username = username;
        }

        public EmitterEventSourceQueryParam username(SecretKeySelector username) {
            this.username = username;
            return this;
        }

        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class EmitterEventSourceQueryParam {\n");

            sb.append("    broker: ").append(toIndentedString(broker)).append("\n");
            sb.append("    channelKey: ").append(toIndentedString(channelKey)).append("\n");
            sb.append("    channelName: ").append(toIndentedString(channelName)).append("\n");
            sb.append("    connectionBackoff: ").append(toIndentedString(connectionBackoff)).append("\n");
            sb.append("    filter: ").append(toIndentedString(filter)).append("\n");
            sb.append("    jsonBody: ").append(toIndentedString(jsonBody)).append("\n");
            sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
            sb.append("    password: ").append(toIndentedString(password)).append("\n");
            sb.append("    tls: ").append(toIndentedString(tls)).append("\n");
            sb.append("    username: ").append(toIndentedString(username)).append("\n");
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
