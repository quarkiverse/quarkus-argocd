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
public class KafkaEventSource  {

    private String config;
    private Backoff connectionBackoff;
    private KafkaConsumerGroup consumerGroup;
    private EventSourceFilter filter;
    private Boolean jsonBody;
    private String limitEventsPerSecond;
    private Map<String, String> metadata;
    private String partition;
    private SASLConfig sasl;
    private TLSConfig tls;
    private String topic;
    private String url;
    private String version;

    /**
    * Yaml format Sarama config for Kafka connection. It follows the struct of sarama.Config. See https://github.com/IBM/sarama/blob/main/config.go e.g.  consumer:   fetch:     min: 1 net:   MaxOpenRequests: 5  +optional
    * @return config
    **/
    @JsonProperty("config")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public String getConfig() {
        return config;
    }

    /**
     * Set config
     **/
    public void setConfig(String config) {
        this.config = config;
    }

    public KafkaEventSource config(String config) {
        this.config = config;
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

    public KafkaEventSource connectionBackoff(Backoff connectionBackoff) {
        this.connectionBackoff = connectionBackoff;
        return this;
    }

    /**
    * Get consumerGroup
    * @return consumerGroup
    **/
    @JsonProperty("consumerGroup")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public KafkaConsumerGroup getConsumerGroup() {
        return consumerGroup;
    }

    /**
     * Set consumerGroup
     **/
    public void setConsumerGroup(KafkaConsumerGroup consumerGroup) {
        this.consumerGroup = consumerGroup;
    }

    public KafkaEventSource consumerGroup(KafkaConsumerGroup consumerGroup) {
        this.consumerGroup = consumerGroup;
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

    public KafkaEventSource filter(EventSourceFilter filter) {
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

    public KafkaEventSource jsonBody(Boolean jsonBody) {
        this.jsonBody = jsonBody;
        return this;
    }

    /**
    * Get limitEventsPerSecond
    * @return limitEventsPerSecond
    **/
    @JsonProperty("limitEventsPerSecond")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public String getLimitEventsPerSecond() {
        return limitEventsPerSecond;
    }

    /**
     * Set limitEventsPerSecond
     **/
    public void setLimitEventsPerSecond(String limitEventsPerSecond) {
        this.limitEventsPerSecond = limitEventsPerSecond;
    }

    public KafkaEventSource limitEventsPerSecond(String limitEventsPerSecond) {
        this.limitEventsPerSecond = limitEventsPerSecond;
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

    public KafkaEventSource metadata(Map<String, String> metadata) {
        this.metadata = metadata;
        return this;
    }
    public KafkaEventSource putMetadataItem(String key, String metadataItem) {
           if (this.metadata == null){
                metadata = new HashMap<>();
            }
        this.metadata.put(key, metadataItem);
        return this;
    }

    /**
    * Get partition
    * @return partition
    **/
    @JsonProperty("partition")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public String getPartition() {
        return partition;
    }

    /**
     * Set partition
     **/
    public void setPartition(String partition) {
        this.partition = partition;
    }

    public KafkaEventSource partition(String partition) {
        this.partition = partition;
        return this;
    }

    /**
    * Get sasl
    * @return sasl
    **/
    @JsonProperty("sasl")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public SASLConfig getSasl() {
        return sasl;
    }

    /**
     * Set sasl
     **/
    public void setSasl(SASLConfig sasl) {
        this.sasl = sasl;
    }

    public KafkaEventSource sasl(SASLConfig sasl) {
        this.sasl = sasl;
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

    public KafkaEventSource tls(TLSConfig tls) {
        this.tls = tls;
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

    public KafkaEventSource topic(String topic) {
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

    public KafkaEventSource url(String url) {
        this.url = url;
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

    public KafkaEventSource version(String version) {
        this.version = version;
        return this;
    }

    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class KafkaEventSource {\n");

        sb.append("    config: ").append(toIndentedString(config)).append("\n");
        sb.append("    connectionBackoff: ").append(toIndentedString(connectionBackoff)).append("\n");
        sb.append("    consumerGroup: ").append(toIndentedString(consumerGroup)).append("\n");
        sb.append("    filter: ").append(toIndentedString(filter)).append("\n");
        sb.append("    jsonBody: ").append(toIndentedString(jsonBody)).append("\n");
        sb.append("    limitEventsPerSecond: ").append(toIndentedString(limitEventsPerSecond)).append("\n");
        sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
        sb.append("    partition: ").append(toIndentedString(partition)).append("\n");
        sb.append("    sasl: ").append(toIndentedString(sasl)).append("\n");
        sb.append("    tls: ").append(toIndentedString(tls)).append("\n");
        sb.append("    topic: ").append(toIndentedString(topic)).append("\n");
        sb.append("    url: ").append(toIndentedString(url)).append("\n");
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
    public static class KafkaEventSourceQueryParam  {

        @jakarta.ws.rs.QueryParam("config")
        private String config;
        @jakarta.ws.rs.QueryParam("connectionBackoff")
        private Backoff connectionBackoff;
        @jakarta.ws.rs.QueryParam("consumerGroup")
        private KafkaConsumerGroup consumerGroup;
        @jakarta.ws.rs.QueryParam("filter")
        private EventSourceFilter filter;
        @jakarta.ws.rs.QueryParam("jsonBody")
        private Boolean jsonBody;
        @jakarta.ws.rs.QueryParam("limitEventsPerSecond")
        private String limitEventsPerSecond;
        @jakarta.ws.rs.QueryParam("metadata")
        private Map<String, String> metadata = null;
        @jakarta.ws.rs.QueryParam("partition")
        private String partition;
        @jakarta.ws.rs.QueryParam("sasl")
        private SASLConfig sasl;
        @jakarta.ws.rs.QueryParam("tls")
        private TLSConfig tls;
        @jakarta.ws.rs.QueryParam("topic")
        private String topic;
        @jakarta.ws.rs.QueryParam("url")
        private String url;
        @jakarta.ws.rs.QueryParam("version")
        private String version;

        /**
        * Yaml format Sarama config for Kafka connection. It follows the struct of sarama.Config. See https://github.com/IBM/sarama/blob/main/config.go e.g.  consumer:   fetch:     min: 1 net:   MaxOpenRequests: 5  +optional
        * @return config
        **/
        @JsonProperty("config")
        public String getConfig() {
            return config;
        }

        /**
         * Set config
         **/
        public void setConfig(String config) {
            this.config = config;
        }

        public KafkaEventSourceQueryParam config(String config) {
            this.config = config;
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

        public KafkaEventSourceQueryParam connectionBackoff(Backoff connectionBackoff) {
            this.connectionBackoff = connectionBackoff;
            return this;
        }

        /**
        * Get consumerGroup
        * @return consumerGroup
        **/
        @JsonProperty("consumerGroup")
        public KafkaConsumerGroup getConsumerGroup() {
            return consumerGroup;
        }

        /**
         * Set consumerGroup
         **/
        public void setConsumerGroup(KafkaConsumerGroup consumerGroup) {
            this.consumerGroup = consumerGroup;
        }

        public KafkaEventSourceQueryParam consumerGroup(KafkaConsumerGroup consumerGroup) {
            this.consumerGroup = consumerGroup;
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

        public KafkaEventSourceQueryParam filter(EventSourceFilter filter) {
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

        public KafkaEventSourceQueryParam jsonBody(Boolean jsonBody) {
            this.jsonBody = jsonBody;
            return this;
        }

        /**
        * Get limitEventsPerSecond
        * @return limitEventsPerSecond
        **/
        @JsonProperty("limitEventsPerSecond")
        public String getLimitEventsPerSecond() {
            return limitEventsPerSecond;
        }

        /**
         * Set limitEventsPerSecond
         **/
        public void setLimitEventsPerSecond(String limitEventsPerSecond) {
            this.limitEventsPerSecond = limitEventsPerSecond;
        }

        public KafkaEventSourceQueryParam limitEventsPerSecond(String limitEventsPerSecond) {
            this.limitEventsPerSecond = limitEventsPerSecond;
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

        public KafkaEventSourceQueryParam metadata(Map<String, String> metadata) {
            this.metadata = metadata;
            return this;
        }
        public KafkaEventSourceQueryParam putMetadataItem(String key, String metadataItem) {
            this.metadata.put(key, metadataItem);
            return this;
        }

        /**
        * Get partition
        * @return partition
        **/
        @JsonProperty("partition")
        public String getPartition() {
            return partition;
        }

        /**
         * Set partition
         **/
        public void setPartition(String partition) {
            this.partition = partition;
        }

        public KafkaEventSourceQueryParam partition(String partition) {
            this.partition = partition;
            return this;
        }

        /**
        * Get sasl
        * @return sasl
        **/
        @JsonProperty("sasl")
        public SASLConfig getSasl() {
            return sasl;
        }

        /**
         * Set sasl
         **/
        public void setSasl(SASLConfig sasl) {
            this.sasl = sasl;
        }

        public KafkaEventSourceQueryParam sasl(SASLConfig sasl) {
            this.sasl = sasl;
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

        public KafkaEventSourceQueryParam tls(TLSConfig tls) {
            this.tls = tls;
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

        public KafkaEventSourceQueryParam topic(String topic) {
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

        public KafkaEventSourceQueryParam url(String url) {
            this.url = url;
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

        public KafkaEventSourceQueryParam version(String version) {
            this.version = version;
            return this;
        }

        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class KafkaEventSourceQueryParam {\n");

            sb.append("    config: ").append(toIndentedString(config)).append("\n");
            sb.append("    connectionBackoff: ").append(toIndentedString(connectionBackoff)).append("\n");
            sb.append("    consumerGroup: ").append(toIndentedString(consumerGroup)).append("\n");
            sb.append("    filter: ").append(toIndentedString(filter)).append("\n");
            sb.append("    jsonBody: ").append(toIndentedString(jsonBody)).append("\n");
            sb.append("    limitEventsPerSecond: ").append(toIndentedString(limitEventsPerSecond)).append("\n");
            sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
            sb.append("    partition: ").append(toIndentedString(partition)).append("\n");
            sb.append("    sasl: ").append(toIndentedString(sasl)).append("\n");
            sb.append("    tls: ").append(toIndentedString(tls)).append("\n");
            sb.append("    topic: ").append(toIndentedString(topic)).append("\n");
            sb.append("    url: ").append(toIndentedString(url)).append("\n");
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
