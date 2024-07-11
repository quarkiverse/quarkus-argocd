package io.quarkiverse.argocd.events.v1alpha1;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;

import io.fabric8.kubernetes.api.model.SecretKeySelector;
import io.quarkiverse.argocd.v1alpha1.model.EventSourceFilter;
import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.Type;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
/**
  * SFTPEventSource describes an event-source for sftp related events.
 **/
public class SFTPEventSource  {

    /**
      * SFTPEventSource describes an event-source for sftp related events.
     **/
    private SecretKeySelector address;
    /**
      * SFTPEventSource describes an event-source for sftp related events.
     **/
    private String eventType;
    /**
      * SFTPEventSource describes an event-source for sftp related events.
     **/
    private EventSourceFilter filter;
    /**
      * SFTPEventSource describes an event-source for sftp related events.
     **/
    private Map<String, String> metadata;
    /**
      * SFTPEventSource describes an event-source for sftp related events.
     **/
    private SecretKeySelector password;
    /**
      * SFTPEventSource describes an event-source for sftp related events.
     **/
    private String pollIntervalDuration;
    /**
      * SFTPEventSource describes an event-source for sftp related events.
     **/
    private SecretKeySelector sshKeySecret;
    /**
      * SFTPEventSource describes an event-source for sftp related events.
     **/
    private SecretKeySelector username;
    /**
      * SFTPEventSource describes an event-source for sftp related events.
     **/
    private WatchPathConfig watchPathConfig;

    /**
    * Get address
    * @return address
    **/
    @JsonProperty("address")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public SecretKeySelector getAddress() {
        return address;
    }

    /**
     * Set address
     **/
    public void setAddress(SecretKeySelector address) {
        this.address = address;
    }

    public SFTPEventSource address(SecretKeySelector address) {
        this.address = address;
        return this;
    }

    /**
    * Get eventType
    * @return eventType
    **/
    @JsonProperty("eventType")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public String getEventType() {
        return eventType;
    }

    /**
     * Set eventType
     **/
    public void setEventType(String eventType) {
        this.eventType = eventType;
    }

    public SFTPEventSource eventType(String eventType) {
        this.eventType = eventType;
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

    public SFTPEventSource filter(EventSourceFilter filter) {
        this.filter = filter;
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

    public SFTPEventSource metadata(Map<String, String> metadata) {
        this.metadata = metadata;
        return this;
    }
    public SFTPEventSource putMetadataItem(String key, String metadataItem) {
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

    public SFTPEventSource password(SecretKeySelector password) {
        this.password = password;
        return this;
    }

    /**
    * Get pollIntervalDuration
    * @return pollIntervalDuration
    **/
    @JsonProperty("pollIntervalDuration")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public String getPollIntervalDuration() {
        return pollIntervalDuration;
    }

    /**
     * Set pollIntervalDuration
     **/
    public void setPollIntervalDuration(String pollIntervalDuration) {
        this.pollIntervalDuration = pollIntervalDuration;
    }

    public SFTPEventSource pollIntervalDuration(String pollIntervalDuration) {
        this.pollIntervalDuration = pollIntervalDuration;
        return this;
    }

    /**
    * Get sshKeySecret
    * @return sshKeySecret
    **/
    @JsonProperty("sshKeySecret")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public SecretKeySelector getSshKeySecret() {
        return sshKeySecret;
    }

    /**
     * Set sshKeySecret
     **/
    public void setSshKeySecret(SecretKeySelector sshKeySecret) {
        this.sshKeySecret = sshKeySecret;
    }

    public SFTPEventSource sshKeySecret(SecretKeySelector sshKeySecret) {
        this.sshKeySecret = sshKeySecret;
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

    public SFTPEventSource username(SecretKeySelector username) {
        this.username = username;
        return this;
    }

    /**
    * Get watchPathConfig
    * @return watchPathConfig
    **/
    @JsonProperty("watchPathConfig")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public WatchPathConfig getWatchPathConfig() {
        return watchPathConfig;
    }

    /**
     * Set watchPathConfig
     **/
    public void setWatchPathConfig(WatchPathConfig watchPathConfig) {
        this.watchPathConfig = watchPathConfig;
    }

    public SFTPEventSource watchPathConfig(WatchPathConfig watchPathConfig) {
        this.watchPathConfig = watchPathConfig;
        return this;
    }

    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SFTPEventSource {\n");

        sb.append("    address: ").append(toIndentedString(address)).append("\n");
        sb.append("    eventType: ").append(toIndentedString(eventType)).append("\n");
        sb.append("    filter: ").append(toIndentedString(filter)).append("\n");
        sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
        sb.append("    password: ").append(toIndentedString(password)).append("\n");
        sb.append("    pollIntervalDuration: ").append(toIndentedString(pollIntervalDuration)).append("\n");
        sb.append("    sshKeySecret: ").append(toIndentedString(sshKeySecret)).append("\n");
        sb.append("    username: ").append(toIndentedString(username)).append("\n");
        sb.append("    watchPathConfig: ").append(toIndentedString(watchPathConfig)).append("\n");
        
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
      * SFTPEventSource describes an event-source for sftp related events.
     **/
    public static class SFTPEventSourceQueryParam  {

        /**
          * SFTPEventSource describes an event-source for sftp related events.
         **/
        @jakarta.ws.rs.QueryParam("address")
        private SecretKeySelector address;
        /**
          * SFTPEventSource describes an event-source for sftp related events.
         **/
        @jakarta.ws.rs.QueryParam("eventType")
        private String eventType;
        /**
          * SFTPEventSource describes an event-source for sftp related events.
         **/
        @jakarta.ws.rs.QueryParam("filter")
        private EventSourceFilter filter;
        /**
          * SFTPEventSource describes an event-source for sftp related events.
         **/
        @jakarta.ws.rs.QueryParam("metadata")
        private Map<String, String> metadata = null;
        /**
          * SFTPEventSource describes an event-source for sftp related events.
         **/
        @jakarta.ws.rs.QueryParam("password")
        private SecretKeySelector password;
        /**
          * SFTPEventSource describes an event-source for sftp related events.
         **/
        @jakarta.ws.rs.QueryParam("pollIntervalDuration")
        private String pollIntervalDuration;
        /**
          * SFTPEventSource describes an event-source for sftp related events.
         **/
        @jakarta.ws.rs.QueryParam("sshKeySecret")
        private SecretKeySelector sshKeySecret;
        /**
          * SFTPEventSource describes an event-source for sftp related events.
         **/
        @jakarta.ws.rs.QueryParam("username")
        private SecretKeySelector username;
        /**
          * SFTPEventSource describes an event-source for sftp related events.
         **/
        @jakarta.ws.rs.QueryParam("watchPathConfig")
        private WatchPathConfig watchPathConfig;

        /**
        * Get address
        * @return address
        **/
        @JsonProperty("address")
        public SecretKeySelector getAddress() {
            return address;
        }

        /**
         * Set address
         **/
        public void setAddress(SecretKeySelector address) {
            this.address = address;
        }

        public SFTPEventSourceQueryParam address(SecretKeySelector address) {
            this.address = address;
            return this;
        }

        /**
        * Get eventType
        * @return eventType
        **/
        @JsonProperty("eventType")
        public String getEventType() {
            return eventType;
        }

        /**
         * Set eventType
         **/
        public void setEventType(String eventType) {
            this.eventType = eventType;
        }

        public SFTPEventSourceQueryParam eventType(String eventType) {
            this.eventType = eventType;
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

        public SFTPEventSourceQueryParam filter(EventSourceFilter filter) {
            this.filter = filter;
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

        public SFTPEventSourceQueryParam metadata(Map<String, String> metadata) {
            this.metadata = metadata;
            return this;
        }
        public SFTPEventSourceQueryParam putMetadataItem(String key, String metadataItem) {
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

        public SFTPEventSourceQueryParam password(SecretKeySelector password) {
            this.password = password;
            return this;
        }

        /**
        * Get pollIntervalDuration
        * @return pollIntervalDuration
        **/
        @JsonProperty("pollIntervalDuration")
        public String getPollIntervalDuration() {
            return pollIntervalDuration;
        }

        /**
         * Set pollIntervalDuration
         **/
        public void setPollIntervalDuration(String pollIntervalDuration) {
            this.pollIntervalDuration = pollIntervalDuration;
        }

        public SFTPEventSourceQueryParam pollIntervalDuration(String pollIntervalDuration) {
            this.pollIntervalDuration = pollIntervalDuration;
            return this;
        }

        /**
        * Get sshKeySecret
        * @return sshKeySecret
        **/
        @JsonProperty("sshKeySecret")
        public SecretKeySelector getSshKeySecret() {
            return sshKeySecret;
        }

        /**
         * Set sshKeySecret
         **/
        public void setSshKeySecret(SecretKeySelector sshKeySecret) {
            this.sshKeySecret = sshKeySecret;
        }

        public SFTPEventSourceQueryParam sshKeySecret(SecretKeySelector sshKeySecret) {
            this.sshKeySecret = sshKeySecret;
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

        public SFTPEventSourceQueryParam username(SecretKeySelector username) {
            this.username = username;
            return this;
        }

        /**
        * Get watchPathConfig
        * @return watchPathConfig
        **/
        @JsonProperty("watchPathConfig")
        public WatchPathConfig getWatchPathConfig() {
            return watchPathConfig;
        }

        /**
         * Set watchPathConfig
         **/
        public void setWatchPathConfig(WatchPathConfig watchPathConfig) {
            this.watchPathConfig = watchPathConfig;
        }

        public SFTPEventSourceQueryParam watchPathConfig(WatchPathConfig watchPathConfig) {
            this.watchPathConfig = watchPathConfig;
            return this;
        }

        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class SFTPEventSourceQueryParam {\n");

            sb.append("    address: ").append(toIndentedString(address)).append("\n");
            sb.append("    eventType: ").append(toIndentedString(eventType)).append("\n");
            sb.append("    filter: ").append(toIndentedString(filter)).append("\n");
            sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
            sb.append("    password: ").append(toIndentedString(password)).append("\n");
            sb.append("    pollIntervalDuration: ").append(toIndentedString(pollIntervalDuration)).append("\n");
            sb.append("    sshKeySecret: ").append(toIndentedString(sshKeySecret)).append("\n");
            sb.append("    username: ").append(toIndentedString(username)).append("\n");
            sb.append("    watchPathConfig: ").append(toIndentedString(watchPathConfig)).append("\n");
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
