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
public class AzureQueueStorageEventSource  {

    private SecretKeySelector connectionString;
    private Boolean decodeMessage;
    private Boolean dlq;
    private EventSourceFilter filter;
    private Boolean jsonBody;
    private Map<String, String> metadata;
    private String queueName;
    private String storageAccountName;
    private Integer waitTimeInSeconds;

    /**
    * Get connectionString
    * @return connectionString
    **/
    @JsonProperty("connectionString")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public SecretKeySelector getConnectionString() {
        return connectionString;
    }

    /**
     * Set connectionString
     **/
    public void setConnectionString(SecretKeySelector connectionString) {
        this.connectionString = connectionString;
    }

    public AzureQueueStorageEventSource connectionString(SecretKeySelector connectionString) {
        this.connectionString = connectionString;
        return this;
    }

    /**
    * Get decodeMessage
    * @return decodeMessage
    **/
    @JsonProperty("decodeMessage")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public Boolean getDecodeMessage() {
        return decodeMessage;
    }

    /**
     * Set decodeMessage
     **/
    public void setDecodeMessage(Boolean decodeMessage) {
        this.decodeMessage = decodeMessage;
    }

    public AzureQueueStorageEventSource decodeMessage(Boolean decodeMessage) {
        this.decodeMessage = decodeMessage;
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

    public AzureQueueStorageEventSource dlq(Boolean dlq) {
        this.dlq = dlq;
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

    public AzureQueueStorageEventSource filter(EventSourceFilter filter) {
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

    public AzureQueueStorageEventSource jsonBody(Boolean jsonBody) {
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

    public AzureQueueStorageEventSource metadata(Map<String, String> metadata) {
        this.metadata = metadata;
        return this;
    }
    public AzureQueueStorageEventSource putMetadataItem(String key, String metadataItem) {
           if (this.metadata == null){
                metadata = new HashMap<>();
            }
        this.metadata.put(key, metadataItem);
        return this;
    }

    /**
    * Get queueName
    * @return queueName
    **/
    @JsonProperty("queueName")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public String getQueueName() {
        return queueName;
    }

    /**
     * Set queueName
     **/
    public void setQueueName(String queueName) {
        this.queueName = queueName;
    }

    public AzureQueueStorageEventSource queueName(String queueName) {
        this.queueName = queueName;
        return this;
    }

    /**
    * Get storageAccountName
    * @return storageAccountName
    **/
    @JsonProperty("storageAccountName")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public String getStorageAccountName() {
        return storageAccountName;
    }

    /**
     * Set storageAccountName
     **/
    public void setStorageAccountName(String storageAccountName) {
        this.storageAccountName = storageAccountName;
    }

    public AzureQueueStorageEventSource storageAccountName(String storageAccountName) {
        this.storageAccountName = storageAccountName;
        return this;
    }

    /**
    * Get waitTimeInSeconds
    * @return waitTimeInSeconds
    **/
    @JsonProperty("waitTimeInSeconds")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public Integer getWaitTimeInSeconds() {
        return waitTimeInSeconds;
    }

    /**
     * Set waitTimeInSeconds
     **/
    public void setWaitTimeInSeconds(Integer waitTimeInSeconds) {
        this.waitTimeInSeconds = waitTimeInSeconds;
    }

    public AzureQueueStorageEventSource waitTimeInSeconds(Integer waitTimeInSeconds) {
        this.waitTimeInSeconds = waitTimeInSeconds;
        return this;
    }

    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AzureQueueStorageEventSource {\n");

        sb.append("    connectionString: ").append(toIndentedString(connectionString)).append("\n");
        sb.append("    decodeMessage: ").append(toIndentedString(decodeMessage)).append("\n");
        sb.append("    dlq: ").append(toIndentedString(dlq)).append("\n");
        sb.append("    filter: ").append(toIndentedString(filter)).append("\n");
        sb.append("    jsonBody: ").append(toIndentedString(jsonBody)).append("\n");
        sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
        sb.append("    queueName: ").append(toIndentedString(queueName)).append("\n");
        sb.append("    storageAccountName: ").append(toIndentedString(storageAccountName)).append("\n");
        sb.append("    waitTimeInSeconds: ").append(toIndentedString(waitTimeInSeconds)).append("\n");
        
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
    public static class AzureQueueStorageEventSourceQueryParam  {

        @jakarta.ws.rs.QueryParam("connectionString")
        private SecretKeySelector connectionString;
        @jakarta.ws.rs.QueryParam("decodeMessage")
        private Boolean decodeMessage;
        @jakarta.ws.rs.QueryParam("dlq")
        private Boolean dlq;
        @jakarta.ws.rs.QueryParam("filter")
        private EventSourceFilter filter;
        @jakarta.ws.rs.QueryParam("jsonBody")
        private Boolean jsonBody;
        @jakarta.ws.rs.QueryParam("metadata")
        private Map<String, String> metadata = null;
        @jakarta.ws.rs.QueryParam("queueName")
        private String queueName;
        @jakarta.ws.rs.QueryParam("storageAccountName")
        private String storageAccountName;
        @jakarta.ws.rs.QueryParam("waitTimeInSeconds")
        private Integer waitTimeInSeconds;

        /**
        * Get connectionString
        * @return connectionString
        **/
        @JsonProperty("connectionString")
        public SecretKeySelector getConnectionString() {
            return connectionString;
        }

        /**
         * Set connectionString
         **/
        public void setConnectionString(SecretKeySelector connectionString) {
            this.connectionString = connectionString;
        }

        public AzureQueueStorageEventSourceQueryParam connectionString(SecretKeySelector connectionString) {
            this.connectionString = connectionString;
            return this;
        }

        /**
        * Get decodeMessage
        * @return decodeMessage
        **/
        @JsonProperty("decodeMessage")
        public Boolean getDecodeMessage() {
            return decodeMessage;
        }

        /**
         * Set decodeMessage
         **/
        public void setDecodeMessage(Boolean decodeMessage) {
            this.decodeMessage = decodeMessage;
        }

        public AzureQueueStorageEventSourceQueryParam decodeMessage(Boolean decodeMessage) {
            this.decodeMessage = decodeMessage;
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

        public AzureQueueStorageEventSourceQueryParam dlq(Boolean dlq) {
            this.dlq = dlq;
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

        public AzureQueueStorageEventSourceQueryParam filter(EventSourceFilter filter) {
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

        public AzureQueueStorageEventSourceQueryParam jsonBody(Boolean jsonBody) {
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

        public AzureQueueStorageEventSourceQueryParam metadata(Map<String, String> metadata) {
            this.metadata = metadata;
            return this;
        }
        public AzureQueueStorageEventSourceQueryParam putMetadataItem(String key, String metadataItem) {
            this.metadata.put(key, metadataItem);
            return this;
        }

        /**
        * Get queueName
        * @return queueName
        **/
        @JsonProperty("queueName")
        public String getQueueName() {
            return queueName;
        }

        /**
         * Set queueName
         **/
        public void setQueueName(String queueName) {
            this.queueName = queueName;
        }

        public AzureQueueStorageEventSourceQueryParam queueName(String queueName) {
            this.queueName = queueName;
            return this;
        }

        /**
        * Get storageAccountName
        * @return storageAccountName
        **/
        @JsonProperty("storageAccountName")
        public String getStorageAccountName() {
            return storageAccountName;
        }

        /**
         * Set storageAccountName
         **/
        public void setStorageAccountName(String storageAccountName) {
            this.storageAccountName = storageAccountName;
        }

        public AzureQueueStorageEventSourceQueryParam storageAccountName(String storageAccountName) {
            this.storageAccountName = storageAccountName;
            return this;
        }

        /**
        * Get waitTimeInSeconds
        * @return waitTimeInSeconds
        **/
        @JsonProperty("waitTimeInSeconds")
        public Integer getWaitTimeInSeconds() {
            return waitTimeInSeconds;
        }

        /**
         * Set waitTimeInSeconds
         **/
        public void setWaitTimeInSeconds(Integer waitTimeInSeconds) {
            this.waitTimeInSeconds = waitTimeInSeconds;
        }

        public AzureQueueStorageEventSourceQueryParam waitTimeInSeconds(Integer waitTimeInSeconds) {
            this.waitTimeInSeconds = waitTimeInSeconds;
            return this;
        }

        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class AzureQueueStorageEventSourceQueryParam {\n");

            sb.append("    connectionString: ").append(toIndentedString(connectionString)).append("\n");
            sb.append("    decodeMessage: ").append(toIndentedString(decodeMessage)).append("\n");
            sb.append("    dlq: ").append(toIndentedString(dlq)).append("\n");
            sb.append("    filter: ").append(toIndentedString(filter)).append("\n");
            sb.append("    jsonBody: ").append(toIndentedString(jsonBody)).append("\n");
            sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
            sb.append("    queueName: ").append(toIndentedString(queueName)).append("\n");
            sb.append("    storageAccountName: ").append(toIndentedString(storageAccountName)).append("\n");
            sb.append("    waitTimeInSeconds: ").append(toIndentedString(waitTimeInSeconds)).append("\n");
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
