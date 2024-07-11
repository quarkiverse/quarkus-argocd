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
public class RedisEventSource  {

    private List<String> channels;
    private Integer db;
    private EventSourceFilter filter;
    private String hostAddress;
    private Boolean jsonBody;
    private Map<String, String> metadata;
    private String namespace;
    private SecretKeySelector password;
    private TLSConfig tls;
    private String username;

    /**
    * Get channels
    * @return channels
    **/
    @JsonProperty("channels")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public List<String> getChannels() {
        return channels;
    }

    /**
     * Set channels
     **/
    public void setChannels(List<String> channels) {
        this.channels = channels;
    }

    public RedisEventSource channels(List<String> channels) {
        this.channels = channels;
        return this;
    }
    public RedisEventSource addChannelsItem(String channelsItem) {
        if (this.channels == null){
            channels = new ArrayList<>();
        }
        this.channels.add(channelsItem);
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

    public RedisEventSource db(Integer db) {
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

    public RedisEventSource filter(EventSourceFilter filter) {
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

    public RedisEventSource hostAddress(String hostAddress) {
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

    public RedisEventSource jsonBody(Boolean jsonBody) {
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

    public RedisEventSource metadata(Map<String, String> metadata) {
        this.metadata = metadata;
        return this;
    }
    public RedisEventSource putMetadataItem(String key, String metadataItem) {
           if (this.metadata == null){
                metadata = new HashMap<>();
            }
        this.metadata.put(key, metadataItem);
        return this;
    }

    /**
    * Get namespace
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

    public RedisEventSource namespace(String namespace) {
        this.namespace = namespace;
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

    public RedisEventSource password(SecretKeySelector password) {
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

    public RedisEventSource tls(TLSConfig tls) {
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

    public RedisEventSource username(String username) {
        this.username = username;
        return this;
    }

    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RedisEventSource {\n");

        sb.append("    channels: ").append(toIndentedString(channels)).append("\n");
        sb.append("    db: ").append(toIndentedString(db)).append("\n");
        sb.append("    filter: ").append(toIndentedString(filter)).append("\n");
        sb.append("    hostAddress: ").append(toIndentedString(hostAddress)).append("\n");
        sb.append("    jsonBody: ").append(toIndentedString(jsonBody)).append("\n");
        sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
        sb.append("    namespace: ").append(toIndentedString(namespace)).append("\n");
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
    public static class RedisEventSourceQueryParam  {

        @jakarta.ws.rs.QueryParam("channels")
        private List<String> channels = null;
        @jakarta.ws.rs.QueryParam("db")
        private Integer db;
        @jakarta.ws.rs.QueryParam("filter")
        private EventSourceFilter filter;
        @jakarta.ws.rs.QueryParam("hostAddress")
        private String hostAddress;
        @jakarta.ws.rs.QueryParam("jsonBody")
        private Boolean jsonBody;
        @jakarta.ws.rs.QueryParam("metadata")
        private Map<String, String> metadata = null;
        @jakarta.ws.rs.QueryParam("namespace")
        private String namespace;
        @jakarta.ws.rs.QueryParam("password")
        private SecretKeySelector password;
        @jakarta.ws.rs.QueryParam("tls")
        private TLSConfig tls;
        @jakarta.ws.rs.QueryParam("username")
        private String username;

        /**
        * Get channels
        * @return channels
        **/
        @JsonProperty("channels")
        public List<String> getChannels() {
            return channels;
        }

        /**
         * Set channels
         **/
        public void setChannels(List<String> channels) {
            this.channels = channels;
        }

        public RedisEventSourceQueryParam channels(List<String> channels) {
            this.channels = channels;
            return this;
        }
        public RedisEventSourceQueryParam addChannelsItem(String channelsItem) {
            this.channels.add(channelsItem);
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

        public RedisEventSourceQueryParam db(Integer db) {
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

        public RedisEventSourceQueryParam filter(EventSourceFilter filter) {
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

        public RedisEventSourceQueryParam hostAddress(String hostAddress) {
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

        public RedisEventSourceQueryParam jsonBody(Boolean jsonBody) {
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

        public RedisEventSourceQueryParam metadata(Map<String, String> metadata) {
            this.metadata = metadata;
            return this;
        }
        public RedisEventSourceQueryParam putMetadataItem(String key, String metadataItem) {
            this.metadata.put(key, metadataItem);
            return this;
        }

        /**
        * Get namespace
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

        public RedisEventSourceQueryParam namespace(String namespace) {
            this.namespace = namespace;
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

        public RedisEventSourceQueryParam password(SecretKeySelector password) {
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

        public RedisEventSourceQueryParam tls(TLSConfig tls) {
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

        public RedisEventSourceQueryParam username(String username) {
            this.username = username;
            return this;
        }

        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class RedisEventSourceQueryParam {\n");

            sb.append("    channels: ").append(toIndentedString(channels)).append("\n");
            sb.append("    db: ").append(toIndentedString(db)).append("\n");
            sb.append("    filter: ").append(toIndentedString(filter)).append("\n");
            sb.append("    hostAddress: ").append(toIndentedString(hostAddress)).append("\n");
            sb.append("    jsonBody: ").append(toIndentedString(jsonBody)).append("\n");
            sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
            sb.append("    namespace: ").append(toIndentedString(namespace)).append("\n");
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
