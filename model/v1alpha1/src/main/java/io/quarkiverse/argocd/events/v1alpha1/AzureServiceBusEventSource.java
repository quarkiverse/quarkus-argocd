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
public class AzureServiceBusEventSource  {

    private SecretKeySelector connectionString;
    private EventSourceFilter filter;
    private String fullyQualifiedNamespace;
    private Boolean jsonBody;
    private Map<String, String> metadata;
    private String queueName;
    private String subscriptionName;
    private TLSConfig tls;
    private String topicName;

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

    public AzureServiceBusEventSource connectionString(SecretKeySelector connectionString) {
        this.connectionString = connectionString;
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

    public AzureServiceBusEventSource filter(EventSourceFilter filter) {
        this.filter = filter;
        return this;
    }

    /**
    * Get fullyQualifiedNamespace
    * @return fullyQualifiedNamespace
    **/
    @JsonProperty("fullyQualifiedNamespace")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public String getFullyQualifiedNamespace() {
        return fullyQualifiedNamespace;
    }

    /**
     * Set fullyQualifiedNamespace
     **/
    public void setFullyQualifiedNamespace(String fullyQualifiedNamespace) {
        this.fullyQualifiedNamespace = fullyQualifiedNamespace;
    }

    public AzureServiceBusEventSource fullyQualifiedNamespace(String fullyQualifiedNamespace) {
        this.fullyQualifiedNamespace = fullyQualifiedNamespace;
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

    public AzureServiceBusEventSource jsonBody(Boolean jsonBody) {
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

    public AzureServiceBusEventSource metadata(Map<String, String> metadata) {
        this.metadata = metadata;
        return this;
    }
    public AzureServiceBusEventSource putMetadataItem(String key, String metadataItem) {
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

    public AzureServiceBusEventSource queueName(String queueName) {
        this.queueName = queueName;
        return this;
    }

    /**
    * Get subscriptionName
    * @return subscriptionName
    **/
    @JsonProperty("subscriptionName")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public String getSubscriptionName() {
        return subscriptionName;
    }

    /**
     * Set subscriptionName
     **/
    public void setSubscriptionName(String subscriptionName) {
        this.subscriptionName = subscriptionName;
    }

    public AzureServiceBusEventSource subscriptionName(String subscriptionName) {
        this.subscriptionName = subscriptionName;
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

    public AzureServiceBusEventSource tls(TLSConfig tls) {
        this.tls = tls;
        return this;
    }

    /**
    * Get topicName
    * @return topicName
    **/
    @JsonProperty("topicName")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public String getTopicName() {
        return topicName;
    }

    /**
     * Set topicName
     **/
    public void setTopicName(String topicName) {
        this.topicName = topicName;
    }

    public AzureServiceBusEventSource topicName(String topicName) {
        this.topicName = topicName;
        return this;
    }

    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AzureServiceBusEventSource {\n");

        sb.append("    connectionString: ").append(toIndentedString(connectionString)).append("\n");
        sb.append("    filter: ").append(toIndentedString(filter)).append("\n");
        sb.append("    fullyQualifiedNamespace: ").append(toIndentedString(fullyQualifiedNamespace)).append("\n");
        sb.append("    jsonBody: ").append(toIndentedString(jsonBody)).append("\n");
        sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
        sb.append("    queueName: ").append(toIndentedString(queueName)).append("\n");
        sb.append("    subscriptionName: ").append(toIndentedString(subscriptionName)).append("\n");
        sb.append("    tls: ").append(toIndentedString(tls)).append("\n");
        sb.append("    topicName: ").append(toIndentedString(topicName)).append("\n");
        
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
    public static class AzureServiceBusEventSourceQueryParam  {

        @jakarta.ws.rs.QueryParam("connectionString")
        private SecretKeySelector connectionString;
        @jakarta.ws.rs.QueryParam("filter")
        private EventSourceFilter filter;
        @jakarta.ws.rs.QueryParam("fullyQualifiedNamespace")
        private String fullyQualifiedNamespace;
        @jakarta.ws.rs.QueryParam("jsonBody")
        private Boolean jsonBody;
        @jakarta.ws.rs.QueryParam("metadata")
        private Map<String, String> metadata = null;
        @jakarta.ws.rs.QueryParam("queueName")
        private String queueName;
        @jakarta.ws.rs.QueryParam("subscriptionName")
        private String subscriptionName;
        @jakarta.ws.rs.QueryParam("tls")
        private TLSConfig tls;
        @jakarta.ws.rs.QueryParam("topicName")
        private String topicName;

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

        public AzureServiceBusEventSourceQueryParam connectionString(SecretKeySelector connectionString) {
            this.connectionString = connectionString;
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

        public AzureServiceBusEventSourceQueryParam filter(EventSourceFilter filter) {
            this.filter = filter;
            return this;
        }

        /**
        * Get fullyQualifiedNamespace
        * @return fullyQualifiedNamespace
        **/
        @JsonProperty("fullyQualifiedNamespace")
        public String getFullyQualifiedNamespace() {
            return fullyQualifiedNamespace;
        }

        /**
         * Set fullyQualifiedNamespace
         **/
        public void setFullyQualifiedNamespace(String fullyQualifiedNamespace) {
            this.fullyQualifiedNamespace = fullyQualifiedNamespace;
        }

        public AzureServiceBusEventSourceQueryParam fullyQualifiedNamespace(String fullyQualifiedNamespace) {
            this.fullyQualifiedNamespace = fullyQualifiedNamespace;
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

        public AzureServiceBusEventSourceQueryParam jsonBody(Boolean jsonBody) {
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

        public AzureServiceBusEventSourceQueryParam metadata(Map<String, String> metadata) {
            this.metadata = metadata;
            return this;
        }
        public AzureServiceBusEventSourceQueryParam putMetadataItem(String key, String metadataItem) {
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

        public AzureServiceBusEventSourceQueryParam queueName(String queueName) {
            this.queueName = queueName;
            return this;
        }

        /**
        * Get subscriptionName
        * @return subscriptionName
        **/
        @JsonProperty("subscriptionName")
        public String getSubscriptionName() {
            return subscriptionName;
        }

        /**
         * Set subscriptionName
         **/
        public void setSubscriptionName(String subscriptionName) {
            this.subscriptionName = subscriptionName;
        }

        public AzureServiceBusEventSourceQueryParam subscriptionName(String subscriptionName) {
            this.subscriptionName = subscriptionName;
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

        public AzureServiceBusEventSourceQueryParam tls(TLSConfig tls) {
            this.tls = tls;
            return this;
        }

        /**
        * Get topicName
        * @return topicName
        **/
        @JsonProperty("topicName")
        public String getTopicName() {
            return topicName;
        }

        /**
         * Set topicName
         **/
        public void setTopicName(String topicName) {
            this.topicName = topicName;
        }

        public AzureServiceBusEventSourceQueryParam topicName(String topicName) {
            this.topicName = topicName;
            return this;
        }

        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class AzureServiceBusEventSourceQueryParam {\n");

            sb.append("    connectionString: ").append(toIndentedString(connectionString)).append("\n");
            sb.append("    filter: ").append(toIndentedString(filter)).append("\n");
            sb.append("    fullyQualifiedNamespace: ").append(toIndentedString(fullyQualifiedNamespace)).append("\n");
            sb.append("    jsonBody: ").append(toIndentedString(jsonBody)).append("\n");
            sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
            sb.append("    queueName: ").append(toIndentedString(queueName)).append("\n");
            sb.append("    subscriptionName: ").append(toIndentedString(subscriptionName)).append("\n");
            sb.append("    tls: ").append(toIndentedString(tls)).append("\n");
            sb.append("    topicName: ").append(toIndentedString(topicName)).append("\n");
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
