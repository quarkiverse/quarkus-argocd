package io.quarkiverse.argocd.events.v1alpha1;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.fabric8.kubernetes.api.model.SecretKeySelector;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.Type;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class AzureServiceBusTrigger  {

    private SecretKeySelector connectionString;
    private List<TriggerParameter> parameters;
    private List<TriggerParameter> payload;
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

    public AzureServiceBusTrigger connectionString(SecretKeySelector connectionString) {
        this.connectionString = connectionString;
        return this;
    }

    /**
    * Get parameters
    * @return parameters
    **/
    @JsonProperty("parameters")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public List<TriggerParameter> getParameters() {
        return parameters;
    }

    /**
     * Set parameters
     **/
    public void setParameters(List<TriggerParameter> parameters) {
        this.parameters = parameters;
    }

    public AzureServiceBusTrigger parameters(List<TriggerParameter> parameters) {
        this.parameters = parameters;
        return this;
    }
    public AzureServiceBusTrigger addParametersItem(TriggerParameter parametersItem) {
        if (this.parameters == null){
            parameters = new ArrayList<>();
        }
        this.parameters.add(parametersItem);
        return this;
    }

    /**
    * Payload is the list of key-value extracted from an event payload to construct the request payload.
    * @return payload
    **/
    @JsonProperty("payload")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public List<TriggerParameter> getPayload() {
        return payload;
    }

    /**
     * Set payload
     **/
    public void setPayload(List<TriggerParameter> payload) {
        this.payload = payload;
    }

    public AzureServiceBusTrigger payload(List<TriggerParameter> payload) {
        this.payload = payload;
        return this;
    }
    public AzureServiceBusTrigger addPayloadItem(TriggerParameter payloadItem) {
        if (this.payload == null){
            payload = new ArrayList<>();
        }
        this.payload.add(payloadItem);
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

    public AzureServiceBusTrigger queueName(String queueName) {
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

    public AzureServiceBusTrigger subscriptionName(String subscriptionName) {
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

    public AzureServiceBusTrigger tls(TLSConfig tls) {
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

    public AzureServiceBusTrigger topicName(String topicName) {
        this.topicName = topicName;
        return this;
    }

    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AzureServiceBusTrigger {\n");

        sb.append("    connectionString: ").append(toIndentedString(connectionString)).append("\n");
        sb.append("    parameters: ").append(toIndentedString(parameters)).append("\n");
        sb.append("    payload: ").append(toIndentedString(payload)).append("\n");
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
    public static class AzureServiceBusTriggerQueryParam  {

        @jakarta.ws.rs.QueryParam("connectionString")
        private SecretKeySelector connectionString;
        @jakarta.ws.rs.QueryParam("parameters")
        private List<TriggerParameter> parameters = null;
        @jakarta.ws.rs.QueryParam("payload")
        private List<TriggerParameter> payload = null;
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

        public AzureServiceBusTriggerQueryParam connectionString(SecretKeySelector connectionString) {
            this.connectionString = connectionString;
            return this;
        }

        /**
        * Get parameters
        * @return parameters
        **/
        @JsonProperty("parameters")
        public List<TriggerParameter> getParameters() {
            return parameters;
        }

        /**
         * Set parameters
         **/
        public void setParameters(List<TriggerParameter> parameters) {
            this.parameters = parameters;
        }

        public AzureServiceBusTriggerQueryParam parameters(List<TriggerParameter> parameters) {
            this.parameters = parameters;
            return this;
        }
        public AzureServiceBusTriggerQueryParam addParametersItem(TriggerParameter parametersItem) {
            this.parameters.add(parametersItem);
            return this;
        }

        /**
        * Payload is the list of key-value extracted from an event payload to construct the request payload.
        * @return payload
        **/
        @JsonProperty("payload")
        public List<TriggerParameter> getPayload() {
            return payload;
        }

        /**
         * Set payload
         **/
        public void setPayload(List<TriggerParameter> payload) {
            this.payload = payload;
        }

        public AzureServiceBusTriggerQueryParam payload(List<TriggerParameter> payload) {
            this.payload = payload;
            return this;
        }
        public AzureServiceBusTriggerQueryParam addPayloadItem(TriggerParameter payloadItem) {
            this.payload.add(payloadItem);
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

        public AzureServiceBusTriggerQueryParam queueName(String queueName) {
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

        public AzureServiceBusTriggerQueryParam subscriptionName(String subscriptionName) {
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

        public AzureServiceBusTriggerQueryParam tls(TLSConfig tls) {
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

        public AzureServiceBusTriggerQueryParam topicName(String topicName) {
            this.topicName = topicName;
            return this;
        }

        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class AzureServiceBusTriggerQueryParam {\n");

            sb.append("    connectionString: ").append(toIndentedString(connectionString)).append("\n");
            sb.append("    parameters: ").append(toIndentedString(parameters)).append("\n");
            sb.append("    payload: ").append(toIndentedString(payload)).append("\n");
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
