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
/**
  * PubSubEventSource refers to event-source for GCP PubSub related events.
 **/
public class PubSubEventSource  {

    /**
      * PubSubEventSource refers to event-source for GCP PubSub related events.
     **/
    private SecretKeySelector credentialSecret;
    /**
      * PubSubEventSource refers to event-source for GCP PubSub related events.
     **/
    private Boolean deleteSubscriptionOnFinish;
    /**
      * PubSubEventSource refers to event-source for GCP PubSub related events.
     **/
    private EventSourceFilter filter;
    /**
      * PubSubEventSource refers to event-source for GCP PubSub related events.
     **/
    private Boolean jsonBody;
    /**
      * PubSubEventSource refers to event-source for GCP PubSub related events.
     **/
    private Map<String, String> metadata;
    /**
      * PubSubEventSource refers to event-source for GCP PubSub related events.
     **/
    private String projectID;
    /**
      * PubSubEventSource refers to event-source for GCP PubSub related events.
     **/
    private String subscriptionID;
    /**
      * PubSubEventSource refers to event-source for GCP PubSub related events.
     **/
    private String topic;
    /**
      * PubSubEventSource refers to event-source for GCP PubSub related events.
     **/
    private String topicProjectID;

    /**
    * Get credentialSecret
    * @return credentialSecret
    **/
    @JsonProperty("credentialSecret")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public SecretKeySelector getCredentialSecret() {
        return credentialSecret;
    }

    /**
     * Set credentialSecret
     **/
    public void setCredentialSecret(SecretKeySelector credentialSecret) {
        this.credentialSecret = credentialSecret;
    }

    public PubSubEventSource credentialSecret(SecretKeySelector credentialSecret) {
        this.credentialSecret = credentialSecret;
        return this;
    }

    /**
    * Get deleteSubscriptionOnFinish
    * @return deleteSubscriptionOnFinish
    **/
    @JsonProperty("deleteSubscriptionOnFinish")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public Boolean getDeleteSubscriptionOnFinish() {
        return deleteSubscriptionOnFinish;
    }

    /**
     * Set deleteSubscriptionOnFinish
     **/
    public void setDeleteSubscriptionOnFinish(Boolean deleteSubscriptionOnFinish) {
        this.deleteSubscriptionOnFinish = deleteSubscriptionOnFinish;
    }

    public PubSubEventSource deleteSubscriptionOnFinish(Boolean deleteSubscriptionOnFinish) {
        this.deleteSubscriptionOnFinish = deleteSubscriptionOnFinish;
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

    public PubSubEventSource filter(EventSourceFilter filter) {
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

    public PubSubEventSource jsonBody(Boolean jsonBody) {
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

    public PubSubEventSource metadata(Map<String, String> metadata) {
        this.metadata = metadata;
        return this;
    }
    public PubSubEventSource putMetadataItem(String key, String metadataItem) {
           if (this.metadata == null){
                metadata = new HashMap<>();
            }
        this.metadata.put(key, metadataItem);
        return this;
    }

    /**
    * Get projectID
    * @return projectID
    **/
    @JsonProperty("projectID")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public String getProjectID() {
        return projectID;
    }

    /**
     * Set projectID
     **/
    public void setProjectID(String projectID) {
        this.projectID = projectID;
    }

    public PubSubEventSource projectID(String projectID) {
        this.projectID = projectID;
        return this;
    }

    /**
    * Get subscriptionID
    * @return subscriptionID
    **/
    @JsonProperty("subscriptionID")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public String getSubscriptionID() {
        return subscriptionID;
    }

    /**
     * Set subscriptionID
     **/
    public void setSubscriptionID(String subscriptionID) {
        this.subscriptionID = subscriptionID;
    }

    public PubSubEventSource subscriptionID(String subscriptionID) {
        this.subscriptionID = subscriptionID;
        return this;
    }

    /**
    * Get topic
    * @return topic
    **/
    @JsonProperty("topic")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public String getTopic() {
        return topic;
    }

    /**
     * Set topic
     **/
    public void setTopic(String topic) {
        this.topic = topic;
    }

    public PubSubEventSource topic(String topic) {
        this.topic = topic;
        return this;
    }

    /**
    * Get topicProjectID
    * @return topicProjectID
    **/
    @JsonProperty("topicProjectID")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public String getTopicProjectID() {
        return topicProjectID;
    }

    /**
     * Set topicProjectID
     **/
    public void setTopicProjectID(String topicProjectID) {
        this.topicProjectID = topicProjectID;
    }

    public PubSubEventSource topicProjectID(String topicProjectID) {
        this.topicProjectID = topicProjectID;
        return this;
    }

    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PubSubEventSource {\n");

        sb.append("    credentialSecret: ").append(toIndentedString(credentialSecret)).append("\n");
        sb.append("    deleteSubscriptionOnFinish: ").append(toIndentedString(deleteSubscriptionOnFinish)).append("\n");
        sb.append("    filter: ").append(toIndentedString(filter)).append("\n");
        sb.append("    jsonBody: ").append(toIndentedString(jsonBody)).append("\n");
        sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
        sb.append("    projectID: ").append(toIndentedString(projectID)).append("\n");
        sb.append("    subscriptionID: ").append(toIndentedString(subscriptionID)).append("\n");
        sb.append("    topic: ").append(toIndentedString(topic)).append("\n");
        sb.append("    topicProjectID: ").append(toIndentedString(topicProjectID)).append("\n");
        
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
      * PubSubEventSource refers to event-source for GCP PubSub related events.
     **/
    public static class PubSubEventSourceQueryParam  {

        /**
          * PubSubEventSource refers to event-source for GCP PubSub related events.
         **/
        @jakarta.ws.rs.QueryParam("credentialSecret")
        private SecretKeySelector credentialSecret;
        /**
          * PubSubEventSource refers to event-source for GCP PubSub related events.
         **/
        @jakarta.ws.rs.QueryParam("deleteSubscriptionOnFinish")
        private Boolean deleteSubscriptionOnFinish;
        /**
          * PubSubEventSource refers to event-source for GCP PubSub related events.
         **/
        @jakarta.ws.rs.QueryParam("filter")
        private EventSourceFilter filter;
        /**
          * PubSubEventSource refers to event-source for GCP PubSub related events.
         **/
        @jakarta.ws.rs.QueryParam("jsonBody")
        private Boolean jsonBody;
        /**
          * PubSubEventSource refers to event-source for GCP PubSub related events.
         **/
        @jakarta.ws.rs.QueryParam("metadata")
        private Map<String, String> metadata = null;
        /**
          * PubSubEventSource refers to event-source for GCP PubSub related events.
         **/
        @jakarta.ws.rs.QueryParam("projectID")
        private String projectID;
        /**
          * PubSubEventSource refers to event-source for GCP PubSub related events.
         **/
        @jakarta.ws.rs.QueryParam("subscriptionID")
        private String subscriptionID;
        /**
          * PubSubEventSource refers to event-source for GCP PubSub related events.
         **/
        @jakarta.ws.rs.QueryParam("topic")
        private String topic;
        /**
          * PubSubEventSource refers to event-source for GCP PubSub related events.
         **/
        @jakarta.ws.rs.QueryParam("topicProjectID")
        private String topicProjectID;

        /**
        * Get credentialSecret
        * @return credentialSecret
        **/
        @JsonProperty("credentialSecret")
        public SecretKeySelector getCredentialSecret() {
            return credentialSecret;
        }

        /**
         * Set credentialSecret
         **/
        public void setCredentialSecret(SecretKeySelector credentialSecret) {
            this.credentialSecret = credentialSecret;
        }

        public PubSubEventSourceQueryParam credentialSecret(SecretKeySelector credentialSecret) {
            this.credentialSecret = credentialSecret;
            return this;
        }

        /**
        * Get deleteSubscriptionOnFinish
        * @return deleteSubscriptionOnFinish
        **/
        @JsonProperty("deleteSubscriptionOnFinish")
        public Boolean getDeleteSubscriptionOnFinish() {
            return deleteSubscriptionOnFinish;
        }

        /**
         * Set deleteSubscriptionOnFinish
         **/
        public void setDeleteSubscriptionOnFinish(Boolean deleteSubscriptionOnFinish) {
            this.deleteSubscriptionOnFinish = deleteSubscriptionOnFinish;
        }

        public PubSubEventSourceQueryParam deleteSubscriptionOnFinish(Boolean deleteSubscriptionOnFinish) {
            this.deleteSubscriptionOnFinish = deleteSubscriptionOnFinish;
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

        public PubSubEventSourceQueryParam filter(EventSourceFilter filter) {
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

        public PubSubEventSourceQueryParam jsonBody(Boolean jsonBody) {
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

        public PubSubEventSourceQueryParam metadata(Map<String, String> metadata) {
            this.metadata = metadata;
            return this;
        }
        public PubSubEventSourceQueryParam putMetadataItem(String key, String metadataItem) {
            this.metadata.put(key, metadataItem);
            return this;
        }

        /**
        * Get projectID
        * @return projectID
        **/
        @JsonProperty("projectID")
        public String getProjectID() {
            return projectID;
        }

        /**
         * Set projectID
         **/
        public void setProjectID(String projectID) {
            this.projectID = projectID;
        }

        public PubSubEventSourceQueryParam projectID(String projectID) {
            this.projectID = projectID;
            return this;
        }

        /**
        * Get subscriptionID
        * @return subscriptionID
        **/
        @JsonProperty("subscriptionID")
        public String getSubscriptionID() {
            return subscriptionID;
        }

        /**
         * Set subscriptionID
         **/
        public void setSubscriptionID(String subscriptionID) {
            this.subscriptionID = subscriptionID;
        }

        public PubSubEventSourceQueryParam subscriptionID(String subscriptionID) {
            this.subscriptionID = subscriptionID;
            return this;
        }

        /**
        * Get topic
        * @return topic
        **/
        @JsonProperty("topic")
        public String getTopic() {
            return topic;
        }

        /**
         * Set topic
         **/
        public void setTopic(String topic) {
            this.topic = topic;
        }

        public PubSubEventSourceQueryParam topic(String topic) {
            this.topic = topic;
            return this;
        }

        /**
        * Get topicProjectID
        * @return topicProjectID
        **/
        @JsonProperty("topicProjectID")
        public String getTopicProjectID() {
            return topicProjectID;
        }

        /**
         * Set topicProjectID
         **/
        public void setTopicProjectID(String topicProjectID) {
            this.topicProjectID = topicProjectID;
        }

        public PubSubEventSourceQueryParam topicProjectID(String topicProjectID) {
            this.topicProjectID = topicProjectID;
            return this;
        }

        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class PubSubEventSourceQueryParam {\n");

            sb.append("    credentialSecret: ").append(toIndentedString(credentialSecret)).append("\n");
            sb.append("    deleteSubscriptionOnFinish: ").append(toIndentedString(deleteSubscriptionOnFinish)).append("\n");
            sb.append("    filter: ").append(toIndentedString(filter)).append("\n");
            sb.append("    jsonBody: ").append(toIndentedString(jsonBody)).append("\n");
            sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
            sb.append("    projectID: ").append(toIndentedString(projectID)).append("\n");
            sb.append("    subscriptionID: ").append(toIndentedString(subscriptionID)).append("\n");
            sb.append("    topic: ").append(toIndentedString(topic)).append("\n");
            sb.append("    topicProjectID: ").append(toIndentedString(topicProjectID)).append("\n");
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
