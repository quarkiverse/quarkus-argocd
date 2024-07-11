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
public class SNSEventSource  {

    private SecretKeySelector accessKey;
    private String endpoint;
    private EventSourceFilter filter;
    private Map<String, String> metadata;
    private String region;
    private String roleARN;
    private SecretKeySelector secretKey;
    private String topicArn;
    private Boolean validateSignature;
    private WebhookContext webhook;

    /**
    * Get accessKey
    * @return accessKey
    **/
    @JsonProperty("accessKey")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public SecretKeySelector getAccessKey() {
        return accessKey;
    }

    /**
     * Set accessKey
     **/
    public void setAccessKey(SecretKeySelector accessKey) {
        this.accessKey = accessKey;
    }

    public SNSEventSource accessKey(SecretKeySelector accessKey) {
        this.accessKey = accessKey;
        return this;
    }

    /**
    * Get endpoint
    * @return endpoint
    **/
    @JsonProperty("endpoint")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public String getEndpoint() {
        return endpoint;
    }

    /**
     * Set endpoint
     **/
    public void setEndpoint(String endpoint) {
        this.endpoint = endpoint;
    }

    public SNSEventSource endpoint(String endpoint) {
        this.endpoint = endpoint;
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

    public SNSEventSource filter(EventSourceFilter filter) {
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

    public SNSEventSource metadata(Map<String, String> metadata) {
        this.metadata = metadata;
        return this;
    }
    public SNSEventSource putMetadataItem(String key, String metadataItem) {
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

    public SNSEventSource region(String region) {
        this.region = region;
        return this;
    }

    /**
    * Get roleARN
    * @return roleARN
    **/
    @JsonProperty("roleARN")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public String getRoleARN() {
        return roleARN;
    }

    /**
     * Set roleARN
     **/
    public void setRoleARN(String roleARN) {
        this.roleARN = roleARN;
    }

    public SNSEventSource roleARN(String roleARN) {
        this.roleARN = roleARN;
        return this;
    }

    /**
    * Get secretKey
    * @return secretKey
    **/
    @JsonProperty("secretKey")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public SecretKeySelector getSecretKey() {
        return secretKey;
    }

    /**
     * Set secretKey
     **/
    public void setSecretKey(SecretKeySelector secretKey) {
        this.secretKey = secretKey;
    }

    public SNSEventSource secretKey(SecretKeySelector secretKey) {
        this.secretKey = secretKey;
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

    public SNSEventSource topicArn(String topicArn) {
        this.topicArn = topicArn;
        return this;
    }

    /**
    * Get validateSignature
    * @return validateSignature
    **/
    @JsonProperty("validateSignature")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public Boolean getValidateSignature() {
        return validateSignature;
    }

    /**
     * Set validateSignature
     **/
    public void setValidateSignature(Boolean validateSignature) {
        this.validateSignature = validateSignature;
    }

    public SNSEventSource validateSignature(Boolean validateSignature) {
        this.validateSignature = validateSignature;
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

    public SNSEventSource webhook(WebhookContext webhook) {
        this.webhook = webhook;
        return this;
    }

    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SNSEventSource {\n");

        sb.append("    accessKey: ").append(toIndentedString(accessKey)).append("\n");
        sb.append("    endpoint: ").append(toIndentedString(endpoint)).append("\n");
        sb.append("    filter: ").append(toIndentedString(filter)).append("\n");
        sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
        sb.append("    region: ").append(toIndentedString(region)).append("\n");
        sb.append("    roleARN: ").append(toIndentedString(roleARN)).append("\n");
        sb.append("    secretKey: ").append(toIndentedString(secretKey)).append("\n");
        sb.append("    topicArn: ").append(toIndentedString(topicArn)).append("\n");
        sb.append("    validateSignature: ").append(toIndentedString(validateSignature)).append("\n");
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
    public static class SNSEventSourceQueryParam  {

        @jakarta.ws.rs.QueryParam("accessKey")
        private SecretKeySelector accessKey;
        @jakarta.ws.rs.QueryParam("endpoint")
        private String endpoint;
        @jakarta.ws.rs.QueryParam("filter")
        private EventSourceFilter filter;
        @jakarta.ws.rs.QueryParam("metadata")
        private Map<String, String> metadata = null;
        @jakarta.ws.rs.QueryParam("region")
        private String region;
        @jakarta.ws.rs.QueryParam("roleARN")
        private String roleARN;
        @jakarta.ws.rs.QueryParam("secretKey")
        private SecretKeySelector secretKey;
        @jakarta.ws.rs.QueryParam("topicArn")
        private String topicArn;
        @jakarta.ws.rs.QueryParam("validateSignature")
        private Boolean validateSignature;
        @jakarta.ws.rs.QueryParam("webhook")
        private WebhookContext webhook;

        /**
        * Get accessKey
        * @return accessKey
        **/
        @JsonProperty("accessKey")
        public SecretKeySelector getAccessKey() {
            return accessKey;
        }

        /**
         * Set accessKey
         **/
        public void setAccessKey(SecretKeySelector accessKey) {
            this.accessKey = accessKey;
        }

        public SNSEventSourceQueryParam accessKey(SecretKeySelector accessKey) {
            this.accessKey = accessKey;
            return this;
        }

        /**
        * Get endpoint
        * @return endpoint
        **/
        @JsonProperty("endpoint")
        public String getEndpoint() {
            return endpoint;
        }

        /**
         * Set endpoint
         **/
        public void setEndpoint(String endpoint) {
            this.endpoint = endpoint;
        }

        public SNSEventSourceQueryParam endpoint(String endpoint) {
            this.endpoint = endpoint;
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

        public SNSEventSourceQueryParam filter(EventSourceFilter filter) {
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

        public SNSEventSourceQueryParam metadata(Map<String, String> metadata) {
            this.metadata = metadata;
            return this;
        }
        public SNSEventSourceQueryParam putMetadataItem(String key, String metadataItem) {
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

        public SNSEventSourceQueryParam region(String region) {
            this.region = region;
            return this;
        }

        /**
        * Get roleARN
        * @return roleARN
        **/
        @JsonProperty("roleARN")
        public String getRoleARN() {
            return roleARN;
        }

        /**
         * Set roleARN
         **/
        public void setRoleARN(String roleARN) {
            this.roleARN = roleARN;
        }

        public SNSEventSourceQueryParam roleARN(String roleARN) {
            this.roleARN = roleARN;
            return this;
        }

        /**
        * Get secretKey
        * @return secretKey
        **/
        @JsonProperty("secretKey")
        public SecretKeySelector getSecretKey() {
            return secretKey;
        }

        /**
         * Set secretKey
         **/
        public void setSecretKey(SecretKeySelector secretKey) {
            this.secretKey = secretKey;
        }

        public SNSEventSourceQueryParam secretKey(SecretKeySelector secretKey) {
            this.secretKey = secretKey;
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

        public SNSEventSourceQueryParam topicArn(String topicArn) {
            this.topicArn = topicArn;
            return this;
        }

        /**
        * Get validateSignature
        * @return validateSignature
        **/
        @JsonProperty("validateSignature")
        public Boolean getValidateSignature() {
            return validateSignature;
        }

        /**
         * Set validateSignature
         **/
        public void setValidateSignature(Boolean validateSignature) {
            this.validateSignature = validateSignature;
        }

        public SNSEventSourceQueryParam validateSignature(Boolean validateSignature) {
            this.validateSignature = validateSignature;
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

        public SNSEventSourceQueryParam webhook(WebhookContext webhook) {
            this.webhook = webhook;
            return this;
        }

        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class SNSEventSourceQueryParam {\n");

            sb.append("    accessKey: ").append(toIndentedString(accessKey)).append("\n");
            sb.append("    endpoint: ").append(toIndentedString(endpoint)).append("\n");
            sb.append("    filter: ").append(toIndentedString(filter)).append("\n");
            sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
            sb.append("    region: ").append(toIndentedString(region)).append("\n");
            sb.append("    roleARN: ").append(toIndentedString(roleARN)).append("\n");
            sb.append("    secretKey: ").append(toIndentedString(secretKey)).append("\n");
            sb.append("    topicArn: ").append(toIndentedString(topicArn)).append("\n");
            sb.append("    validateSignature: ").append(toIndentedString(validateSignature)).append("\n");
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
