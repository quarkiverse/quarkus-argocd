package io.quarkiverse.argocd.events.v1alpha1;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.Type;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class NSQEventSource  {

    private String channel;
    private Backoff connectionBackoff;
    private EventSourceFilter filter;
    private String hostAddress;
    private Boolean jsonBody;
    private Map<String, String> metadata;
    private TLSConfig tls;
    private String topic;

    /**
    * Get channel
    * @return channel
    **/
    @JsonProperty("channel")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public String getChannel() {
        return channel;
    }

    /**
     * Set channel
     **/
    public void setChannel(String channel) {
        this.channel = channel;
    }

    public NSQEventSource channel(String channel) {
        this.channel = channel;
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

    public NSQEventSource connectionBackoff(Backoff connectionBackoff) {
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

    public NSQEventSource filter(EventSourceFilter filter) {
        this.filter = filter;
        return this;
    }

    /**
    * Get hostAddress
    * @return hostAddress
    **/
    @JsonProperty("hostAddress")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public String getHostAddress() {
        return hostAddress;
    }

    /**
     * Set hostAddress
     **/
    public void setHostAddress(String hostAddress) {
        this.hostAddress = hostAddress;
    }

    public NSQEventSource hostAddress(String hostAddress) {
        this.hostAddress = hostAddress;
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

    public NSQEventSource jsonBody(Boolean jsonBody) {
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

    public NSQEventSource metadata(Map<String, String> metadata) {
        this.metadata = metadata;
        return this;
    }
    public NSQEventSource putMetadataItem(String key, String metadataItem) {
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

    public NSQEventSource tls(TLSConfig tls) {
        this.tls = tls;
        return this;
    }

    /**
    * Topic to subscribe to.
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

    public NSQEventSource topic(String topic) {
        this.topic = topic;
        return this;
    }

    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class NSQEventSource {\n");

        sb.append("    channel: ").append(toIndentedString(channel)).append("\n");
        sb.append("    connectionBackoff: ").append(toIndentedString(connectionBackoff)).append("\n");
        sb.append("    filter: ").append(toIndentedString(filter)).append("\n");
        sb.append("    hostAddress: ").append(toIndentedString(hostAddress)).append("\n");
        sb.append("    jsonBody: ").append(toIndentedString(jsonBody)).append("\n");
        sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
        sb.append("    tls: ").append(toIndentedString(tls)).append("\n");
        sb.append("    topic: ").append(toIndentedString(topic)).append("\n");
        
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
    public static class NSQEventSourceQueryParam  {

        @jakarta.ws.rs.QueryParam("channel")
        private String channel;
        @jakarta.ws.rs.QueryParam("connectionBackoff")
        private Backoff connectionBackoff;
        @jakarta.ws.rs.QueryParam("filter")
        private EventSourceFilter filter;
        @jakarta.ws.rs.QueryParam("hostAddress")
        private String hostAddress;
        @jakarta.ws.rs.QueryParam("jsonBody")
        private Boolean jsonBody;
        @jakarta.ws.rs.QueryParam("metadata")
        private Map<String, String> metadata = null;
        @jakarta.ws.rs.QueryParam("tls")
        private TLSConfig tls;
        @jakarta.ws.rs.QueryParam("topic")
        private String topic;

        /**
        * Get channel
        * @return channel
        **/
        @JsonProperty("channel")
        public String getChannel() {
            return channel;
        }

        /**
         * Set channel
         **/
        public void setChannel(String channel) {
            this.channel = channel;
        }

        public NSQEventSourceQueryParam channel(String channel) {
            this.channel = channel;
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

        public NSQEventSourceQueryParam connectionBackoff(Backoff connectionBackoff) {
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

        public NSQEventSourceQueryParam filter(EventSourceFilter filter) {
            this.filter = filter;
            return this;
        }

        /**
        * Get hostAddress
        * @return hostAddress
        **/
        @JsonProperty("hostAddress")
        public String getHostAddress() {
            return hostAddress;
        }

        /**
         * Set hostAddress
         **/
        public void setHostAddress(String hostAddress) {
            this.hostAddress = hostAddress;
        }

        public NSQEventSourceQueryParam hostAddress(String hostAddress) {
            this.hostAddress = hostAddress;
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

        public NSQEventSourceQueryParam jsonBody(Boolean jsonBody) {
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

        public NSQEventSourceQueryParam metadata(Map<String, String> metadata) {
            this.metadata = metadata;
            return this;
        }
        public NSQEventSourceQueryParam putMetadataItem(String key, String metadataItem) {
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

        public NSQEventSourceQueryParam tls(TLSConfig tls) {
            this.tls = tls;
            return this;
        }

        /**
        * Topic to subscribe to.
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

        public NSQEventSourceQueryParam topic(String topic) {
            this.topic = topic;
            return this;
        }

        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class NSQEventSourceQueryParam {\n");

            sb.append("    channel: ").append(toIndentedString(channel)).append("\n");
            sb.append("    connectionBackoff: ").append(toIndentedString(connectionBackoff)).append("\n");
            sb.append("    filter: ").append(toIndentedString(filter)).append("\n");
            sb.append("    hostAddress: ").append(toIndentedString(hostAddress)).append("\n");
            sb.append("    jsonBody: ").append(toIndentedString(jsonBody)).append("\n");
            sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
            sb.append("    tls: ").append(toIndentedString(tls)).append("\n");
            sb.append("    topic: ").append(toIndentedString(topic)).append("\n");
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
