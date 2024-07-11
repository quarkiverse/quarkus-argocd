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
public class StripeEventSource  {

    private SecretKeySelector apiKey;
    private Boolean createWebhook;
    private List<String> eventFilter;
    private Map<String, String> metadata;
    private WebhookContext webhook;

    /**
    * Get apiKey
    * @return apiKey
    **/
    @JsonProperty("apiKey")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public SecretKeySelector getApiKey() {
        return apiKey;
    }

    /**
     * Set apiKey
     **/
    public void setApiKey(SecretKeySelector apiKey) {
        this.apiKey = apiKey;
    }

    public StripeEventSource apiKey(SecretKeySelector apiKey) {
        this.apiKey = apiKey;
        return this;
    }

    /**
    * Get createWebhook
    * @return createWebhook
    **/
    @JsonProperty("createWebhook")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public Boolean getCreateWebhook() {
        return createWebhook;
    }

    /**
     * Set createWebhook
     **/
    public void setCreateWebhook(Boolean createWebhook) {
        this.createWebhook = createWebhook;
    }

    public StripeEventSource createWebhook(Boolean createWebhook) {
        this.createWebhook = createWebhook;
        return this;
    }

    /**
    * Get eventFilter
    * @return eventFilter
    **/
    @JsonProperty("eventFilter")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public List<String> getEventFilter() {
        return eventFilter;
    }

    /**
     * Set eventFilter
     **/
    public void setEventFilter(List<String> eventFilter) {
        this.eventFilter = eventFilter;
    }

    public StripeEventSource eventFilter(List<String> eventFilter) {
        this.eventFilter = eventFilter;
        return this;
    }
    public StripeEventSource addEventFilterItem(String eventFilterItem) {
        if (this.eventFilter == null){
            eventFilter = new ArrayList<>();
        }
        this.eventFilter.add(eventFilterItem);
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

    public StripeEventSource metadata(Map<String, String> metadata) {
        this.metadata = metadata;
        return this;
    }
    public StripeEventSource putMetadataItem(String key, String metadataItem) {
           if (this.metadata == null){
                metadata = new HashMap<>();
            }
        this.metadata.put(key, metadataItem);
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

    public StripeEventSource webhook(WebhookContext webhook) {
        this.webhook = webhook;
        return this;
    }

    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class StripeEventSource {\n");

        sb.append("    apiKey: ").append(toIndentedString(apiKey)).append("\n");
        sb.append("    createWebhook: ").append(toIndentedString(createWebhook)).append("\n");
        sb.append("    eventFilter: ").append(toIndentedString(eventFilter)).append("\n");
        sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
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
    public static class StripeEventSourceQueryParam  {

        @jakarta.ws.rs.QueryParam("apiKey")
        private SecretKeySelector apiKey;
        @jakarta.ws.rs.QueryParam("createWebhook")
        private Boolean createWebhook;
        @jakarta.ws.rs.QueryParam("eventFilter")
        private List<String> eventFilter = null;
        @jakarta.ws.rs.QueryParam("metadata")
        private Map<String, String> metadata = null;
        @jakarta.ws.rs.QueryParam("webhook")
        private WebhookContext webhook;

        /**
        * Get apiKey
        * @return apiKey
        **/
        @JsonProperty("apiKey")
        public SecretKeySelector getApiKey() {
            return apiKey;
        }

        /**
         * Set apiKey
         **/
        public void setApiKey(SecretKeySelector apiKey) {
            this.apiKey = apiKey;
        }

        public StripeEventSourceQueryParam apiKey(SecretKeySelector apiKey) {
            this.apiKey = apiKey;
            return this;
        }

        /**
        * Get createWebhook
        * @return createWebhook
        **/
        @JsonProperty("createWebhook")
        public Boolean getCreateWebhook() {
            return createWebhook;
        }

        /**
         * Set createWebhook
         **/
        public void setCreateWebhook(Boolean createWebhook) {
            this.createWebhook = createWebhook;
        }

        public StripeEventSourceQueryParam createWebhook(Boolean createWebhook) {
            this.createWebhook = createWebhook;
            return this;
        }

        /**
        * Get eventFilter
        * @return eventFilter
        **/
        @JsonProperty("eventFilter")
        public List<String> getEventFilter() {
            return eventFilter;
        }

        /**
         * Set eventFilter
         **/
        public void setEventFilter(List<String> eventFilter) {
            this.eventFilter = eventFilter;
        }

        public StripeEventSourceQueryParam eventFilter(List<String> eventFilter) {
            this.eventFilter = eventFilter;
            return this;
        }
        public StripeEventSourceQueryParam addEventFilterItem(String eventFilterItem) {
            this.eventFilter.add(eventFilterItem);
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

        public StripeEventSourceQueryParam metadata(Map<String, String> metadata) {
            this.metadata = metadata;
            return this;
        }
        public StripeEventSourceQueryParam putMetadataItem(String key, String metadataItem) {
            this.metadata.put(key, metadataItem);
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

        public StripeEventSourceQueryParam webhook(WebhookContext webhook) {
            this.webhook = webhook;
            return this;
        }

        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class StripeEventSourceQueryParam {\n");

            sb.append("    apiKey: ").append(toIndentedString(apiKey)).append("\n");
            sb.append("    createWebhook: ").append(toIndentedString(createWebhook)).append("\n");
            sb.append("    eventFilter: ").append(toIndentedString(eventFilter)).append("\n");
            sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
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
