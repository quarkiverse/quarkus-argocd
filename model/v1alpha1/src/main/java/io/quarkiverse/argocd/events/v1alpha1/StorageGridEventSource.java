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
public class StorageGridEventSource  {

    private String apiURL;
    private SecretKeySelector authToken;
    private String bucket;
    private List<String> events;
    private StorageGridFilter filter;
    private Map<String, String> metadata;
    private String region;
    private String topicArn;
    private WebhookContext webhook;

    /**
    * APIURL is the url of the storagegrid api.
    * @return apiURL
    **/
    @JsonProperty("apiURL")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public String getApiURL() {
        return apiURL;
    }

    /**
     * Set apiURL
     **/
    public void setApiURL(String apiURL) {
        this.apiURL = apiURL;
    }

    public StorageGridEventSource apiURL(String apiURL) {
        this.apiURL = apiURL;
        return this;
    }

    /**
    * Get authToken
    * @return authToken
    **/
    @JsonProperty("authToken")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public SecretKeySelector getAuthToken() {
        return authToken;
    }

    /**
     * Set authToken
     **/
    public void setAuthToken(SecretKeySelector authToken) {
        this.authToken = authToken;
    }

    public StorageGridEventSource authToken(SecretKeySelector authToken) {
        this.authToken = authToken;
        return this;
    }

    /**
    * Name of the bucket to register notifications for.
    * @return bucket
    **/
    @JsonProperty("bucket")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public String getBucket() {
        return bucket;
    }

    /**
     * Set bucket
     **/
    public void setBucket(String bucket) {
        this.bucket = bucket;
    }

    public StorageGridEventSource bucket(String bucket) {
        this.bucket = bucket;
        return this;
    }

    /**
    * Get events
    * @return events
    **/
    @JsonProperty("events")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public List<String> getEvents() {
        return events;
    }

    /**
     * Set events
     **/
    public void setEvents(List<String> events) {
        this.events = events;
    }

    public StorageGridEventSource events(List<String> events) {
        this.events = events;
        return this;
    }
    public StorageGridEventSource addEventsItem(String eventsItem) {
        if (this.events == null){
            events = new ArrayList<>();
        }
        this.events.add(eventsItem);
        return this;
    }

    /**
    * Get filter
    * @return filter
    **/
    @JsonProperty("filter")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public StorageGridFilter getFilter() {
        return filter;
    }

    /**
     * Set filter
     **/
    public void setFilter(StorageGridFilter filter) {
        this.filter = filter;
    }

    public StorageGridEventSource filter(StorageGridFilter filter) {
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

    public StorageGridEventSource metadata(Map<String, String> metadata) {
        this.metadata = metadata;
        return this;
    }
    public StorageGridEventSource putMetadataItem(String key, String metadataItem) {
           if (this.metadata == null){
                metadata = new HashMap<>();
            }
        this.metadata.put(key, metadataItem);
        return this;
    }

    /**
    * Get region
    * @return region
    **/
    @JsonProperty("region")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public String getRegion() {
        return region;
    }

    /**
     * Set region
     **/
    public void setRegion(String region) {
        this.region = region;
    }

    public StorageGridEventSource region(String region) {
        this.region = region;
        return this;
    }

    /**
    * Get topicArn
    * @return topicArn
    **/
    @JsonProperty("topicArn")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public String getTopicArn() {
        return topicArn;
    }

    /**
     * Set topicArn
     **/
    public void setTopicArn(String topicArn) {
        this.topicArn = topicArn;
    }

    public StorageGridEventSource topicArn(String topicArn) {
        this.topicArn = topicArn;
        return this;
    }

    /**
    * Get webhook
    * @return webhook
    **/
    @JsonProperty("webhook")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public WebhookContext getWebhook() {
        return webhook;
    }

    /**
     * Set webhook
     **/
    public void setWebhook(WebhookContext webhook) {
        this.webhook = webhook;
    }

    public StorageGridEventSource webhook(WebhookContext webhook) {
        this.webhook = webhook;
        return this;
    }

    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class StorageGridEventSource {\n");

        sb.append("    apiURL: ").append(toIndentedString(apiURL)).append("\n");
        sb.append("    authToken: ").append(toIndentedString(authToken)).append("\n");
        sb.append("    bucket: ").append(toIndentedString(bucket)).append("\n");
        sb.append("    events: ").append(toIndentedString(events)).append("\n");
        sb.append("    filter: ").append(toIndentedString(filter)).append("\n");
        sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
        sb.append("    region: ").append(toIndentedString(region)).append("\n");
        sb.append("    topicArn: ").append(toIndentedString(topicArn)).append("\n");
        sb.append("    webhook: ").append(toIndentedString(webhook)).append("\n");
        
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
    public static class StorageGridEventSourceQueryParam  {

        @jakarta.ws.rs.QueryParam("apiURL")
        private String apiURL;
        @jakarta.ws.rs.QueryParam("authToken")
        private SecretKeySelector authToken;
        @jakarta.ws.rs.QueryParam("bucket")
        private String bucket;
        @jakarta.ws.rs.QueryParam("events")
        private List<String> events = null;
        @jakarta.ws.rs.QueryParam("filter")
        private StorageGridFilter filter;
        @jakarta.ws.rs.QueryParam("metadata")
        private Map<String, String> metadata = null;
        @jakarta.ws.rs.QueryParam("region")
        private String region;
        @jakarta.ws.rs.QueryParam("topicArn")
        private String topicArn;
        @jakarta.ws.rs.QueryParam("webhook")
        private WebhookContext webhook;

        /**
        * APIURL is the url of the storagegrid api.
        * @return apiURL
        **/
        @JsonProperty("apiURL")
        public String getApiURL() {
            return apiURL;
        }

        /**
         * Set apiURL
         **/
        public void setApiURL(String apiURL) {
            this.apiURL = apiURL;
        }

        public StorageGridEventSourceQueryParam apiURL(String apiURL) {
            this.apiURL = apiURL;
            return this;
        }

        /**
        * Get authToken
        * @return authToken
        **/
        @JsonProperty("authToken")
        public SecretKeySelector getAuthToken() {
            return authToken;
        }

        /**
         * Set authToken
         **/
        public void setAuthToken(SecretKeySelector authToken) {
            this.authToken = authToken;
        }

        public StorageGridEventSourceQueryParam authToken(SecretKeySelector authToken) {
            this.authToken = authToken;
            return this;
        }

        /**
        * Name of the bucket to register notifications for.
        * @return bucket
        **/
        @JsonProperty("bucket")
        public String getBucket() {
            return bucket;
        }

        /**
         * Set bucket
         **/
        public void setBucket(String bucket) {
            this.bucket = bucket;
        }

        public StorageGridEventSourceQueryParam bucket(String bucket) {
            this.bucket = bucket;
            return this;
        }

        /**
        * Get events
        * @return events
        **/
        @JsonProperty("events")
        public List<String> getEvents() {
            return events;
        }

        /**
         * Set events
         **/
        public void setEvents(List<String> events) {
            this.events = events;
        }

        public StorageGridEventSourceQueryParam events(List<String> events) {
            this.events = events;
            return this;
        }
        public StorageGridEventSourceQueryParam addEventsItem(String eventsItem) {
            this.events.add(eventsItem);
            return this;
        }

        /**
        * Get filter
        * @return filter
        **/
        @JsonProperty("filter")
        public StorageGridFilter getFilter() {
            return filter;
        }

        /**
         * Set filter
         **/
        public void setFilter(StorageGridFilter filter) {
            this.filter = filter;
        }

        public StorageGridEventSourceQueryParam filter(StorageGridFilter filter) {
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

        public StorageGridEventSourceQueryParam metadata(Map<String, String> metadata) {
            this.metadata = metadata;
            return this;
        }
        public StorageGridEventSourceQueryParam putMetadataItem(String key, String metadataItem) {
            this.metadata.put(key, metadataItem);
            return this;
        }

        /**
        * Get region
        * @return region
        **/
        @JsonProperty("region")
        public String getRegion() {
            return region;
        }

        /**
         * Set region
         **/
        public void setRegion(String region) {
            this.region = region;
        }

        public StorageGridEventSourceQueryParam region(String region) {
            this.region = region;
            return this;
        }

        /**
        * Get topicArn
        * @return topicArn
        **/
        @JsonProperty("topicArn")
        public String getTopicArn() {
            return topicArn;
        }

        /**
         * Set topicArn
         **/
        public void setTopicArn(String topicArn) {
            this.topicArn = topicArn;
        }

        public StorageGridEventSourceQueryParam topicArn(String topicArn) {
            this.topicArn = topicArn;
            return this;
        }

        /**
        * Get webhook
        * @return webhook
        **/
        @JsonProperty("webhook")
        public WebhookContext getWebhook() {
            return webhook;
        }

        /**
         * Set webhook
         **/
        public void setWebhook(WebhookContext webhook) {
            this.webhook = webhook;
        }

        public StorageGridEventSourceQueryParam webhook(WebhookContext webhook) {
            this.webhook = webhook;
            return this;
        }

        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class StorageGridEventSourceQueryParam {\n");

            sb.append("    apiURL: ").append(toIndentedString(apiURL)).append("\n");
            sb.append("    authToken: ").append(toIndentedString(authToken)).append("\n");
            sb.append("    bucket: ").append(toIndentedString(bucket)).append("\n");
            sb.append("    events: ").append(toIndentedString(events)).append("\n");
            sb.append("    filter: ").append(toIndentedString(filter)).append("\n");
            sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
            sb.append("    region: ").append(toIndentedString(region)).append("\n");
            sb.append("    topicArn: ").append(toIndentedString(topicArn)).append("\n");
            sb.append("    webhook: ").append(toIndentedString(webhook)).append("\n");
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
