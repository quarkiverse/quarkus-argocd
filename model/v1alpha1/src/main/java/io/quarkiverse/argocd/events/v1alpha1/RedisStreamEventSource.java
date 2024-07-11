package io.quarkiverse.argocd.events.v1alpha1;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.quarkiverse.argocd.v1alpha1.model.EventSourceFilter;
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
public class RedisStreamEventSource  {

    private String consumerGroup;
    private Integer db;
    private EventSourceFilter filter;
    private String hostAddress;
    private Integer maxMsgCountPerRead;
    private Map<String, String> metadata;
    private SecretKeySelector password;
    private List<String> streams;
    private TLSConfig tls;
    private String username;

    /**
    * Get consumerGroup
    * @return consumerGroup
    **/
    @JsonProperty("consumerGroup")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public String getConsumerGroup() {
        return consumerGroup;
    }

    /**
     * Set consumerGroup
     **/
    public void setConsumerGroup(String consumerGroup) {
        this.consumerGroup = consumerGroup;
    }

    public RedisStreamEventSource consumerGroup(String consumerGroup) {
        this.consumerGroup = consumerGroup;
        return this;
    }

    /**
    * Get db
    * @return db
    **/
    @JsonProperty("db")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public Integer getDb() {
        return db;
    }

    /**
     * Set db
     **/
    public void setDb(Integer db) {
        this.db = db;
    }

    public RedisStreamEventSource db(Integer db) {
        this.db = db;
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

    public RedisStreamEventSource filter(EventSourceFilter filter) {
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

    public RedisStreamEventSource hostAddress(String hostAddress) {
        this.hostAddress = hostAddress;
        return this;
    }

    /**
    * Get maxMsgCountPerRead
    * @return maxMsgCountPerRead
    **/
    @JsonProperty("maxMsgCountPerRead")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public Integer getMaxMsgCountPerRead() {
        return maxMsgCountPerRead;
    }

    /**
     * Set maxMsgCountPerRead
     **/
    public void setMaxMsgCountPerRead(Integer maxMsgCountPerRead) {
        this.maxMsgCountPerRead = maxMsgCountPerRead;
    }

    public RedisStreamEventSource maxMsgCountPerRead(Integer maxMsgCountPerRead) {
        this.maxMsgCountPerRead = maxMsgCountPerRead;
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

    public RedisStreamEventSource metadata(Map<String, String> metadata) {
        this.metadata = metadata;
        return this;
    }
    public RedisStreamEventSource putMetadataItem(String key, String metadataItem) {
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

    public RedisStreamEventSource password(SecretKeySelector password) {
        this.password = password;
        return this;
    }

    /**
    * Streams to look for entries. XREADGROUP is used on all streams using a single consumer group.
    * @return streams
    **/
    @JsonProperty("streams")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public List<String> getStreams() {
        return streams;
    }

    /**
     * Set streams
     **/
    public void setStreams(List<String> streams) {
        this.streams = streams;
    }

    public RedisStreamEventSource streams(List<String> streams) {
        this.streams = streams;
        return this;
    }
    public RedisStreamEventSource addStreamsItem(String streamsItem) {
        if (this.streams == null){
            streams = new ArrayList<>();
        }
        this.streams.add(streamsItem);
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

    public RedisStreamEventSource tls(TLSConfig tls) {
        this.tls = tls;
        return this;
    }

    /**
    * Get username
    * @return username
    **/
    @JsonProperty("username")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public String getUsername() {
        return username;
    }

    /**
     * Set username
     **/
    public void setUsername(String username) {
        this.username = username;
    }

    public RedisStreamEventSource username(String username) {
        this.username = username;
        return this;
    }

    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RedisStreamEventSource {\n");

        sb.append("    consumerGroup: ").append(toIndentedString(consumerGroup)).append("\n");
        sb.append("    db: ").append(toIndentedString(db)).append("\n");
        sb.append("    filter: ").append(toIndentedString(filter)).append("\n");
        sb.append("    hostAddress: ").append(toIndentedString(hostAddress)).append("\n");
        sb.append("    maxMsgCountPerRead: ").append(toIndentedString(maxMsgCountPerRead)).append("\n");
        sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
        sb.append("    password: ").append(toIndentedString(password)).append("\n");
        sb.append("    streams: ").append(toIndentedString(streams)).append("\n");
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
    public static class RedisStreamEventSourceQueryParam  {

        @jakarta.ws.rs.QueryParam("consumerGroup")
        private String consumerGroup;
        @jakarta.ws.rs.QueryParam("db")
        private Integer db;
        @jakarta.ws.rs.QueryParam("filter")
        private EventSourceFilter filter;
        @jakarta.ws.rs.QueryParam("hostAddress")
        private String hostAddress;
        @jakarta.ws.rs.QueryParam("maxMsgCountPerRead")
        private Integer maxMsgCountPerRead;
        @jakarta.ws.rs.QueryParam("metadata")
        private Map<String, String> metadata = null;
        @jakarta.ws.rs.QueryParam("password")
        private SecretKeySelector password;
        @jakarta.ws.rs.QueryParam("streams")
        private List<String> streams = null;
        @jakarta.ws.rs.QueryParam("tls")
        private TLSConfig tls;
        @jakarta.ws.rs.QueryParam("username")
        private String username;

        /**
        * Get consumerGroup
        * @return consumerGroup
        **/
        @JsonProperty("consumerGroup")
        public String getConsumerGroup() {
            return consumerGroup;
        }

        /**
         * Set consumerGroup
         **/
        public void setConsumerGroup(String consumerGroup) {
            this.consumerGroup = consumerGroup;
        }

        public RedisStreamEventSourceQueryParam consumerGroup(String consumerGroup) {
            this.consumerGroup = consumerGroup;
            return this;
        }

        /**
        * Get db
        * @return db
        **/
        @JsonProperty("db")
        public Integer getDb() {
            return db;
        }

        /**
         * Set db
         **/
        public void setDb(Integer db) {
            this.db = db;
        }

        public RedisStreamEventSourceQueryParam db(Integer db) {
            this.db = db;
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

        public RedisStreamEventSourceQueryParam filter(EventSourceFilter filter) {
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

        public RedisStreamEventSourceQueryParam hostAddress(String hostAddress) {
            this.hostAddress = hostAddress;
            return this;
        }

        /**
        * Get maxMsgCountPerRead
        * @return maxMsgCountPerRead
        **/
        @JsonProperty("maxMsgCountPerRead")
        public Integer getMaxMsgCountPerRead() {
            return maxMsgCountPerRead;
        }

        /**
         * Set maxMsgCountPerRead
         **/
        public void setMaxMsgCountPerRead(Integer maxMsgCountPerRead) {
            this.maxMsgCountPerRead = maxMsgCountPerRead;
        }

        public RedisStreamEventSourceQueryParam maxMsgCountPerRead(Integer maxMsgCountPerRead) {
            this.maxMsgCountPerRead = maxMsgCountPerRead;
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

        public RedisStreamEventSourceQueryParam metadata(Map<String, String> metadata) {
            this.metadata = metadata;
            return this;
        }
        public RedisStreamEventSourceQueryParam putMetadataItem(String key, String metadataItem) {
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

        public RedisStreamEventSourceQueryParam password(SecretKeySelector password) {
            this.password = password;
            return this;
        }

        /**
        * Streams to look for entries. XREADGROUP is used on all streams using a single consumer group.
        * @return streams
        **/
        @JsonProperty("streams")
        public List<String> getStreams() {
            return streams;
        }

        /**
         * Set streams
         **/
        public void setStreams(List<String> streams) {
            this.streams = streams;
        }

        public RedisStreamEventSourceQueryParam streams(List<String> streams) {
            this.streams = streams;
            return this;
        }
        public RedisStreamEventSourceQueryParam addStreamsItem(String streamsItem) {
            this.streams.add(streamsItem);
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

        public RedisStreamEventSourceQueryParam tls(TLSConfig tls) {
            this.tls = tls;
            return this;
        }

        /**
        * Get username
        * @return username
        **/
        @JsonProperty("username")
        public String getUsername() {
            return username;
        }

        /**
         * Set username
         **/
        public void setUsername(String username) {
            this.username = username;
        }

        public RedisStreamEventSourceQueryParam username(String username) {
            this.username = username;
            return this;
        }

        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class RedisStreamEventSourceQueryParam {\n");

            sb.append("    consumerGroup: ").append(toIndentedString(consumerGroup)).append("\n");
            sb.append("    db: ").append(toIndentedString(db)).append("\n");
            sb.append("    filter: ").append(toIndentedString(filter)).append("\n");
            sb.append("    hostAddress: ").append(toIndentedString(hostAddress)).append("\n");
            sb.append("    maxMsgCountPerRead: ").append(toIndentedString(maxMsgCountPerRead)).append("\n");
            sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
            sb.append("    password: ").append(toIndentedString(password)).append("\n");
            sb.append("    streams: ").append(toIndentedString(streams)).append("\n");
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
