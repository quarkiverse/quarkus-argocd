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
public class SlackEventSource  {

    private EventSourceFilter filter;
    private Map<String, String> metadata;
    private SecretKeySelector signingSecret;
    private SecretKeySelector token;
    private WebhookContext webhook;

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

    public SlackEventSource filter(EventSourceFilter filter) {
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

    public SlackEventSource metadata(Map<String, String> metadata) {
        this.metadata = metadata;
        return this;
    }
    public SlackEventSource putMetadataItem(String key, String metadataItem) {
           if (this.metadata == null){
                metadata = new HashMap<>();
            }
        this.metadata.put(key, metadataItem);
        return this;
    }

    /**
    * Get signingSecret
    * @return signingSecret
    **/
    @JsonProperty("signingSecret")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public SecretKeySelector getSigningSecret() {
        return signingSecret;
    }

    /**
     * Set signingSecret
     **/
    public void setSigningSecret(SecretKeySelector signingSecret) {
        this.signingSecret = signingSecret;
    }

    public SlackEventSource signingSecret(SecretKeySelector signingSecret) {
        this.signingSecret = signingSecret;
        return this;
    }

    /**
    * Get token
    * @return token
    **/
    @JsonProperty("token")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public SecretKeySelector getToken() {
        return token;
    }

    /**
     * Set token
     **/
    public void setToken(SecretKeySelector token) {
        this.token = token;
    }

    public SlackEventSource token(SecretKeySelector token) {
        this.token = token;
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

    public SlackEventSource webhook(WebhookContext webhook) {
        this.webhook = webhook;
        return this;
    }

    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SlackEventSource {\n");

        sb.append("    filter: ").append(toIndentedString(filter)).append("\n");
        sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
        sb.append("    signingSecret: ").append(toIndentedString(signingSecret)).append("\n");
        sb.append("    token: ").append(toIndentedString(token)).append("\n");
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
    public static class SlackEventSourceQueryParam  {

        @jakarta.ws.rs.QueryParam("filter")
        private EventSourceFilter filter;
        @jakarta.ws.rs.QueryParam("metadata")
        private Map<String, String> metadata = null;
        @jakarta.ws.rs.QueryParam("signingSecret")
        private SecretKeySelector signingSecret;
        @jakarta.ws.rs.QueryParam("token")
        private SecretKeySelector token;
        @jakarta.ws.rs.QueryParam("webhook")
        private WebhookContext webhook;

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

        public SlackEventSourceQueryParam filter(EventSourceFilter filter) {
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

        public SlackEventSourceQueryParam metadata(Map<String, String> metadata) {
            this.metadata = metadata;
            return this;
        }
        public SlackEventSourceQueryParam putMetadataItem(String key, String metadataItem) {
            this.metadata.put(key, metadataItem);
            return this;
        }

        /**
        * Get signingSecret
        * @return signingSecret
        **/
        @JsonProperty("signingSecret")
        public SecretKeySelector getSigningSecret() {
            return signingSecret;
        }

        /**
         * Set signingSecret
         **/
        public void setSigningSecret(SecretKeySelector signingSecret) {
            this.signingSecret = signingSecret;
        }

        public SlackEventSourceQueryParam signingSecret(SecretKeySelector signingSecret) {
            this.signingSecret = signingSecret;
            return this;
        }

        /**
        * Get token
        * @return token
        **/
        @JsonProperty("token")
        public SecretKeySelector getToken() {
            return token;
        }

        /**
         * Set token
         **/
        public void setToken(SecretKeySelector token) {
            this.token = token;
        }

        public SlackEventSourceQueryParam token(SecretKeySelector token) {
            this.token = token;
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

        public SlackEventSourceQueryParam webhook(WebhookContext webhook) {
            this.webhook = webhook;
            return this;
        }

        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class SlackEventSourceQueryParam {\n");

            sb.append("    filter: ").append(toIndentedString(filter)).append("\n");
            sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
            sb.append("    signingSecret: ").append(toIndentedString(signingSecret)).append("\n");
            sb.append("    token: ").append(toIndentedString(token)).append("\n");
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
