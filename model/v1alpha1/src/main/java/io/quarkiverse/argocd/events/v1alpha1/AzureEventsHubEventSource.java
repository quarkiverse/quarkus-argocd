package io.quarkiverse.argocd.events.v1alpha1;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.quarkiverse.argocd.v1alpha1.model.EventSourceFilter;
import io.fabric8.kubernetes.api.model.SecretKeySelector;
import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.Type;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class AzureEventsHubEventSource  {

    private EventSourceFilter filter;
    private String fqdn;
    private String hubName;
    private Map<String, String> metadata;
    private SecretKeySelector sharedAccessKey;
    private SecretKeySelector sharedAccessKeyName;

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

    public AzureEventsHubEventSource filter(EventSourceFilter filter) {
        this.filter = filter;
        return this;
    }

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

    public AzureEventsHubEventSource fqdn(String fqdn) {
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

    public AzureEventsHubEventSource hubName(String hubName) {
        this.hubName = hubName;
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

    public AzureEventsHubEventSource metadata(Map<String, String> metadata) {
        this.metadata = metadata;
        return this;
    }
    public AzureEventsHubEventSource putMetadataItem(String key, String metadataItem) {
           if (this.metadata == null){
                metadata = new HashMap<>();
            }
        this.metadata.put(key, metadataItem);
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

    public AzureEventsHubEventSource sharedAccessKey(SecretKeySelector sharedAccessKey) {
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

    public AzureEventsHubEventSource sharedAccessKeyName(SecretKeySelector sharedAccessKeyName) {
        this.sharedAccessKeyName = sharedAccessKeyName;
        return this;
    }

    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AzureEventsHubEventSource {\n");

        sb.append("    filter: ").append(toIndentedString(filter)).append("\n");
        sb.append("    fqdn: ").append(toIndentedString(fqdn)).append("\n");
        sb.append("    hubName: ").append(toIndentedString(hubName)).append("\n");
        sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
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
    public static class AzureEventsHubEventSourceQueryParam  {

        @jakarta.ws.rs.QueryParam("filter")
        private EventSourceFilter filter;
        @jakarta.ws.rs.QueryParam("fqdn")
        private String fqdn;
        @jakarta.ws.rs.QueryParam("hubName")
        private String hubName;
        @jakarta.ws.rs.QueryParam("metadata")
        private Map<String, String> metadata = null;
        @jakarta.ws.rs.QueryParam("sharedAccessKey")
        private SecretKeySelector sharedAccessKey;
        @jakarta.ws.rs.QueryParam("sharedAccessKeyName")
        private SecretKeySelector sharedAccessKeyName;

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

        public AzureEventsHubEventSourceQueryParam filter(EventSourceFilter filter) {
            this.filter = filter;
            return this;
        }

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

        public AzureEventsHubEventSourceQueryParam fqdn(String fqdn) {
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

        public AzureEventsHubEventSourceQueryParam hubName(String hubName) {
            this.hubName = hubName;
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

        public AzureEventsHubEventSourceQueryParam metadata(Map<String, String> metadata) {
            this.metadata = metadata;
            return this;
        }
        public AzureEventsHubEventSourceQueryParam putMetadataItem(String key, String metadataItem) {
            this.metadata.put(key, metadataItem);
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

        public AzureEventsHubEventSourceQueryParam sharedAccessKey(SecretKeySelector sharedAccessKey) {
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

        public AzureEventsHubEventSourceQueryParam sharedAccessKeyName(SecretKeySelector sharedAccessKeyName) {
            this.sharedAccessKeyName = sharedAccessKeyName;
            return this;
        }

        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class AzureEventsHubEventSourceQueryParam {\n");

            sb.append("    filter: ").append(toIndentedString(filter)).append("\n");
            sb.append("    fqdn: ").append(toIndentedString(fqdn)).append("\n");
            sb.append("    hubName: ").append(toIndentedString(hubName)).append("\n");
            sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
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
