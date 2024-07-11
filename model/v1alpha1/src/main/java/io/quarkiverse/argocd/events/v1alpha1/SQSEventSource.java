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
public class SQSEventSource  {

    private SecretKeySelector accessKey;
    private Boolean dlq;
    private String endpoint;
    private EventSourceFilter filter;
    private Boolean jsonBody;
    private Map<String, String> metadata;
    private String queue;
    private String queueAccountId;
    private String region;
    private String roleARN;
    private SecretKeySelector secretKey;
    private SecretKeySelector sessionToken;
    private String waitTimeSeconds;

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

    public SQSEventSource accessKey(SecretKeySelector accessKey) {
        this.accessKey = accessKey;
        return this;
    }

    /**
    * Get dlq
    * @return dlq
    **/
    @JsonProperty("dlq")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public Boolean getDlq() {
        return dlq;
    }

    /**
     * Set dlq
     **/
    public void setDlq(Boolean dlq) {
        this.dlq = dlq;
    }

    public SQSEventSource dlq(Boolean dlq) {
        this.dlq = dlq;
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

    public SQSEventSource endpoint(String endpoint) {
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

    public SQSEventSource filter(EventSourceFilter filter) {
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

    public SQSEventSource jsonBody(Boolean jsonBody) {
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

    public SQSEventSource metadata(Map<String, String> metadata) {
        this.metadata = metadata;
        return this;
    }
    public SQSEventSource putMetadataItem(String key, String metadataItem) {
           if (this.metadata == null){
                metadata = new HashMap<>();
            }
        this.metadata.put(key, metadataItem);
        return this;
    }

    /**
    * Get queue
    * @return queue
    **/
    @JsonProperty("queue")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public String getQueue() {
        return queue;
    }

    /**
     * Set queue
     **/
    public void setQueue(String queue) {
        this.queue = queue;
    }

    public SQSEventSource queue(String queue) {
        this.queue = queue;
        return this;
    }

    /**
    * Get queueAccountId
    * @return queueAccountId
    **/
    @JsonProperty("queueAccountId")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public String getQueueAccountId() {
        return queueAccountId;
    }

    /**
     * Set queueAccountId
     **/
    public void setQueueAccountId(String queueAccountId) {
        this.queueAccountId = queueAccountId;
    }

    public SQSEventSource queueAccountId(String queueAccountId) {
        this.queueAccountId = queueAccountId;
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

    public SQSEventSource region(String region) {
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

    public SQSEventSource roleARN(String roleARN) {
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

    public SQSEventSource secretKey(SecretKeySelector secretKey) {
        this.secretKey = secretKey;
        return this;
    }

    /**
    * Get sessionToken
    * @return sessionToken
    **/
    @JsonProperty("sessionToken")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public SecretKeySelector getSessionToken() {
        return sessionToken;
    }

    /**
     * Set sessionToken
     **/
    public void setSessionToken(SecretKeySelector sessionToken) {
        this.sessionToken = sessionToken;
    }

    public SQSEventSource sessionToken(SecretKeySelector sessionToken) {
        this.sessionToken = sessionToken;
        return this;
    }

    /**
    * WaitTimeSeconds is The duration (in seconds) for which the call waits for a message to arrive in the queue before returning.
    * @return waitTimeSeconds
    **/
    @JsonProperty("waitTimeSeconds")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public String getWaitTimeSeconds() {
        return waitTimeSeconds;
    }

    /**
     * Set waitTimeSeconds
     **/
    public void setWaitTimeSeconds(String waitTimeSeconds) {
        this.waitTimeSeconds = waitTimeSeconds;
    }

    public SQSEventSource waitTimeSeconds(String waitTimeSeconds) {
        this.waitTimeSeconds = waitTimeSeconds;
        return this;
    }

    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SQSEventSource {\n");

        sb.append("    accessKey: ").append(toIndentedString(accessKey)).append("\n");
        sb.append("    dlq: ").append(toIndentedString(dlq)).append("\n");
        sb.append("    endpoint: ").append(toIndentedString(endpoint)).append("\n");
        sb.append("    filter: ").append(toIndentedString(filter)).append("\n");
        sb.append("    jsonBody: ").append(toIndentedString(jsonBody)).append("\n");
        sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
        sb.append("    queue: ").append(toIndentedString(queue)).append("\n");
        sb.append("    queueAccountId: ").append(toIndentedString(queueAccountId)).append("\n");
        sb.append("    region: ").append(toIndentedString(region)).append("\n");
        sb.append("    roleARN: ").append(toIndentedString(roleARN)).append("\n");
        sb.append("    secretKey: ").append(toIndentedString(secretKey)).append("\n");
        sb.append("    sessionToken: ").append(toIndentedString(sessionToken)).append("\n");
        sb.append("    waitTimeSeconds: ").append(toIndentedString(waitTimeSeconds)).append("\n");
        
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
    public static class SQSEventSourceQueryParam  {

        @jakarta.ws.rs.QueryParam("accessKey")
        private SecretKeySelector accessKey;
        @jakarta.ws.rs.QueryParam("dlq")
        private Boolean dlq;
        @jakarta.ws.rs.QueryParam("endpoint")
        private String endpoint;
        @jakarta.ws.rs.QueryParam("filter")
        private EventSourceFilter filter;
        @jakarta.ws.rs.QueryParam("jsonBody")
        private Boolean jsonBody;
        @jakarta.ws.rs.QueryParam("metadata")
        private Map<String, String> metadata = null;
        @jakarta.ws.rs.QueryParam("queue")
        private String queue;
        @jakarta.ws.rs.QueryParam("queueAccountId")
        private String queueAccountId;
        @jakarta.ws.rs.QueryParam("region")
        private String region;
        @jakarta.ws.rs.QueryParam("roleARN")
        private String roleARN;
        @jakarta.ws.rs.QueryParam("secretKey")
        private SecretKeySelector secretKey;
        @jakarta.ws.rs.QueryParam("sessionToken")
        private SecretKeySelector sessionToken;
        @jakarta.ws.rs.QueryParam("waitTimeSeconds")
        private String waitTimeSeconds;

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

        public SQSEventSourceQueryParam accessKey(SecretKeySelector accessKey) {
            this.accessKey = accessKey;
            return this;
        }

        /**
        * Get dlq
        * @return dlq
        **/
        @JsonProperty("dlq")
        public Boolean getDlq() {
            return dlq;
        }

        /**
         * Set dlq
         **/
        public void setDlq(Boolean dlq) {
            this.dlq = dlq;
        }

        public SQSEventSourceQueryParam dlq(Boolean dlq) {
            this.dlq = dlq;
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

        public SQSEventSourceQueryParam endpoint(String endpoint) {
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

        public SQSEventSourceQueryParam filter(EventSourceFilter filter) {
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

        public SQSEventSourceQueryParam jsonBody(Boolean jsonBody) {
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

        public SQSEventSourceQueryParam metadata(Map<String, String> metadata) {
            this.metadata = metadata;
            return this;
        }
        public SQSEventSourceQueryParam putMetadataItem(String key, String metadataItem) {
            this.metadata.put(key, metadataItem);
            return this;
        }

        /**
        * Get queue
        * @return queue
        **/
        @JsonProperty("queue")
        public String getQueue() {
            return queue;
        }

        /**
         * Set queue
         **/
        public void setQueue(String queue) {
            this.queue = queue;
        }

        public SQSEventSourceQueryParam queue(String queue) {
            this.queue = queue;
            return this;
        }

        /**
        * Get queueAccountId
        * @return queueAccountId
        **/
        @JsonProperty("queueAccountId")
        public String getQueueAccountId() {
            return queueAccountId;
        }

        /**
         * Set queueAccountId
         **/
        public void setQueueAccountId(String queueAccountId) {
            this.queueAccountId = queueAccountId;
        }

        public SQSEventSourceQueryParam queueAccountId(String queueAccountId) {
            this.queueAccountId = queueAccountId;
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

        public SQSEventSourceQueryParam region(String region) {
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

        public SQSEventSourceQueryParam roleARN(String roleARN) {
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

        public SQSEventSourceQueryParam secretKey(SecretKeySelector secretKey) {
            this.secretKey = secretKey;
            return this;
        }

        /**
        * Get sessionToken
        * @return sessionToken
        **/
        @JsonProperty("sessionToken")
        public SecretKeySelector getSessionToken() {
            return sessionToken;
        }

        /**
         * Set sessionToken
         **/
        public void setSessionToken(SecretKeySelector sessionToken) {
            this.sessionToken = sessionToken;
        }

        public SQSEventSourceQueryParam sessionToken(SecretKeySelector sessionToken) {
            this.sessionToken = sessionToken;
            return this;
        }

        /**
        * WaitTimeSeconds is The duration (in seconds) for which the call waits for a message to arrive in the queue before returning.
        * @return waitTimeSeconds
        **/
        @JsonProperty("waitTimeSeconds")
        public String getWaitTimeSeconds() {
            return waitTimeSeconds;
        }

        /**
         * Set waitTimeSeconds
         **/
        public void setWaitTimeSeconds(String waitTimeSeconds) {
            this.waitTimeSeconds = waitTimeSeconds;
        }

        public SQSEventSourceQueryParam waitTimeSeconds(String waitTimeSeconds) {
            this.waitTimeSeconds = waitTimeSeconds;
            return this;
        }

        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class SQSEventSourceQueryParam {\n");

            sb.append("    accessKey: ").append(toIndentedString(accessKey)).append("\n");
            sb.append("    dlq: ").append(toIndentedString(dlq)).append("\n");
            sb.append("    endpoint: ").append(toIndentedString(endpoint)).append("\n");
            sb.append("    filter: ").append(toIndentedString(filter)).append("\n");
            sb.append("    jsonBody: ").append(toIndentedString(jsonBody)).append("\n");
            sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
            sb.append("    queue: ").append(toIndentedString(queue)).append("\n");
            sb.append("    queueAccountId: ").append(toIndentedString(queueAccountId)).append("\n");
            sb.append("    region: ").append(toIndentedString(region)).append("\n");
            sb.append("    roleARN: ").append(toIndentedString(roleARN)).append("\n");
            sb.append("    secretKey: ").append(toIndentedString(secretKey)).append("\n");
            sb.append("    sessionToken: ").append(toIndentedString(sessionToken)).append("\n");
            sb.append("    waitTimeSeconds: ").append(toIndentedString(waitTimeSeconds)).append("\n");
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
