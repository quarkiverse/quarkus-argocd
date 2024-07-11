package io.quarkiverse.argocd.events.v1alpha1;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.quarkiverse.argocd.v1alpha1.model.EventSourceFilter;
import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.Type;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
/**
  * FileEventSource describes an event-source for file related events.
 **/
public class FileEventSource  {

    /**
      * FileEventSource describes an event-source for file related events.
     **/
    private String eventType;
    /**
      * FileEventSource describes an event-source for file related events.
     **/
    private EventSourceFilter filter;
    /**
      * FileEventSource describes an event-source for file related events.
     **/
    private Map<String, String> metadata;
    /**
      * FileEventSource describes an event-source for file related events.
     **/
    private Boolean polling;
    /**
      * FileEventSource describes an event-source for file related events.
     **/
    private WatchPathConfig watchPathConfig;

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

    public FileEventSource eventType(String eventType) {
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

    public FileEventSource filter(EventSourceFilter filter) {
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

    public FileEventSource metadata(Map<String, String> metadata) {
        this.metadata = metadata;
        return this;
    }
    public FileEventSource putMetadataItem(String key, String metadataItem) {
           if (this.metadata == null){
                metadata = new HashMap<>();
            }
        this.metadata.put(key, metadataItem);
        return this;
    }

    /**
    * Get polling
    * @return polling
    **/
    @JsonProperty("polling")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public Boolean getPolling() {
        return polling;
    }

    /**
     * Set polling
     **/
    public void setPolling(Boolean polling) {
        this.polling = polling;
    }

    public FileEventSource polling(Boolean polling) {
        this.polling = polling;
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

    public FileEventSource watchPathConfig(WatchPathConfig watchPathConfig) {
        this.watchPathConfig = watchPathConfig;
        return this;
    }

    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class FileEventSource {\n");

        sb.append("    eventType: ").append(toIndentedString(eventType)).append("\n");
        sb.append("    filter: ").append(toIndentedString(filter)).append("\n");
        sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
        sb.append("    polling: ").append(toIndentedString(polling)).append("\n");
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
      * FileEventSource describes an event-source for file related events.
     **/
    public static class FileEventSourceQueryParam  {

        /**
          * FileEventSource describes an event-source for file related events.
         **/
        @jakarta.ws.rs.QueryParam("eventType")
        private String eventType;
        /**
          * FileEventSource describes an event-source for file related events.
         **/
        @jakarta.ws.rs.QueryParam("filter")
        private EventSourceFilter filter;
        /**
          * FileEventSource describes an event-source for file related events.
         **/
        @jakarta.ws.rs.QueryParam("metadata")
        private Map<String, String> metadata = null;
        /**
          * FileEventSource describes an event-source for file related events.
         **/
        @jakarta.ws.rs.QueryParam("polling")
        private Boolean polling;
        /**
          * FileEventSource describes an event-source for file related events.
         **/
        @jakarta.ws.rs.QueryParam("watchPathConfig")
        private WatchPathConfig watchPathConfig;

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

        public FileEventSourceQueryParam eventType(String eventType) {
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

        public FileEventSourceQueryParam filter(EventSourceFilter filter) {
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

        public FileEventSourceQueryParam metadata(Map<String, String> metadata) {
            this.metadata = metadata;
            return this;
        }
        public FileEventSourceQueryParam putMetadataItem(String key, String metadataItem) {
            this.metadata.put(key, metadataItem);
            return this;
        }

        /**
        * Get polling
        * @return polling
        **/
        @JsonProperty("polling")
        public Boolean getPolling() {
            return polling;
        }

        /**
         * Set polling
         **/
        public void setPolling(Boolean polling) {
            this.polling = polling;
        }

        public FileEventSourceQueryParam polling(Boolean polling) {
            this.polling = polling;
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

        public FileEventSourceQueryParam watchPathConfig(WatchPathConfig watchPathConfig) {
            this.watchPathConfig = watchPathConfig;
            return this;
        }

        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class FileEventSourceQueryParam {\n");

            sb.append("    eventType: ").append(toIndentedString(eventType)).append("\n");
            sb.append("    filter: ").append(toIndentedString(filter)).append("\n");
            sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
            sb.append("    polling: ").append(toIndentedString(polling)).append("\n");
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
