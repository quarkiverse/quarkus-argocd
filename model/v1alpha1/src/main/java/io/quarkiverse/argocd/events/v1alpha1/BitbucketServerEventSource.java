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
public class BitbucketServerEventSource  {

    private SecretKeySelector accessToken;
    private String bitbucketserverBaseURL;
    private Boolean deleteHookOnFinish;
    private List<String> events;
    private EventSourceFilter filter;
    private Map<String, String> metadata;
    private String projectKey;
    private List<BitbucketServerRepository> repositories;
    private String repositorySlug;
    private TLSConfig tls;
    private WebhookContext webhook;
    private SecretKeySelector webhookSecret;

    /**
    * Get accessToken
    * @return accessToken
    **/
    @JsonProperty("accessToken")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public SecretKeySelector getAccessToken() {
        return accessToken;
    }

    /**
     * Set accessToken
     **/
    public void setAccessToken(SecretKeySelector accessToken) {
        this.accessToken = accessToken;
    }

    public BitbucketServerEventSource accessToken(SecretKeySelector accessToken) {
        this.accessToken = accessToken;
        return this;
    }

    /**
    * Get bitbucketserverBaseURL
    * @return bitbucketserverBaseURL
    **/
    @JsonProperty("bitbucketserverBaseURL")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public String getBitbucketserverBaseURL() {
        return bitbucketserverBaseURL;
    }

    /**
     * Set bitbucketserverBaseURL
     **/
    public void setBitbucketserverBaseURL(String bitbucketserverBaseURL) {
        this.bitbucketserverBaseURL = bitbucketserverBaseURL;
    }

    public BitbucketServerEventSource bitbucketserverBaseURL(String bitbucketserverBaseURL) {
        this.bitbucketserverBaseURL = bitbucketserverBaseURL;
        return this;
    }

    /**
    * Get deleteHookOnFinish
    * @return deleteHookOnFinish
    **/
    @JsonProperty("deleteHookOnFinish")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public Boolean getDeleteHookOnFinish() {
        return deleteHookOnFinish;
    }

    /**
     * Set deleteHookOnFinish
     **/
    public void setDeleteHookOnFinish(Boolean deleteHookOnFinish) {
        this.deleteHookOnFinish = deleteHookOnFinish;
    }

    public BitbucketServerEventSource deleteHookOnFinish(Boolean deleteHookOnFinish) {
        this.deleteHookOnFinish = deleteHookOnFinish;
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

    public BitbucketServerEventSource events(List<String> events) {
        this.events = events;
        return this;
    }
    public BitbucketServerEventSource addEventsItem(String eventsItem) {
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
    public EventSourceFilter getFilter() {
        return filter;
    }

    /**
     * Set filter
     **/
    public void setFilter(EventSourceFilter filter) {
        this.filter = filter;
    }

    public BitbucketServerEventSource filter(EventSourceFilter filter) {
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

    public BitbucketServerEventSource metadata(Map<String, String> metadata) {
        this.metadata = metadata;
        return this;
    }
    public BitbucketServerEventSource putMetadataItem(String key, String metadataItem) {
           if (this.metadata == null){
                metadata = new HashMap<>();
            }
        this.metadata.put(key, metadataItem);
        return this;
    }

    /**
    * Get projectKey
    * @return projectKey
    **/
    @JsonProperty("projectKey")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public String getProjectKey() {
        return projectKey;
    }

    /**
     * Set projectKey
     **/
    public void setProjectKey(String projectKey) {
        this.projectKey = projectKey;
    }

    public BitbucketServerEventSource projectKey(String projectKey) {
        this.projectKey = projectKey;
        return this;
    }

    /**
    * Get repositories
    * @return repositories
    **/
    @JsonProperty("repositories")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public List<BitbucketServerRepository> getRepositories() {
        return repositories;
    }

    /**
     * Set repositories
     **/
    public void setRepositories(List<BitbucketServerRepository> repositories) {
        this.repositories = repositories;
    }

    public BitbucketServerEventSource repositories(List<BitbucketServerRepository> repositories) {
        this.repositories = repositories;
        return this;
    }
    public BitbucketServerEventSource addRepositoriesItem(BitbucketServerRepository repositoriesItem) {
        if (this.repositories == null){
            repositories = new ArrayList<>();
        }
        this.repositories.add(repositoriesItem);
        return this;
    }

    /**
    * Get repositorySlug
    * @return repositorySlug
    **/
    @JsonProperty("repositorySlug")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public String getRepositorySlug() {
        return repositorySlug;
    }

    /**
     * Set repositorySlug
     **/
    public void setRepositorySlug(String repositorySlug) {
        this.repositorySlug = repositorySlug;
    }

    public BitbucketServerEventSource repositorySlug(String repositorySlug) {
        this.repositorySlug = repositorySlug;
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

    public BitbucketServerEventSource tls(TLSConfig tls) {
        this.tls = tls;
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

    public BitbucketServerEventSource webhook(WebhookContext webhook) {
        this.webhook = webhook;
        return this;
    }

    /**
    * Get webhookSecret
    * @return webhookSecret
    **/
    @JsonProperty("webhookSecret")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public SecretKeySelector getWebhookSecret() {
        return webhookSecret;
    }

    /**
     * Set webhookSecret
     **/
    public void setWebhookSecret(SecretKeySelector webhookSecret) {
        this.webhookSecret = webhookSecret;
    }

    public BitbucketServerEventSource webhookSecret(SecretKeySelector webhookSecret) {
        this.webhookSecret = webhookSecret;
        return this;
    }

    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BitbucketServerEventSource {\n");

        sb.append("    accessToken: ").append(toIndentedString(accessToken)).append("\n");
        sb.append("    bitbucketserverBaseURL: ").append(toIndentedString(bitbucketserverBaseURL)).append("\n");
        sb.append("    deleteHookOnFinish: ").append(toIndentedString(deleteHookOnFinish)).append("\n");
        sb.append("    events: ").append(toIndentedString(events)).append("\n");
        sb.append("    filter: ").append(toIndentedString(filter)).append("\n");
        sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
        sb.append("    projectKey: ").append(toIndentedString(projectKey)).append("\n");
        sb.append("    repositories: ").append(toIndentedString(repositories)).append("\n");
        sb.append("    repositorySlug: ").append(toIndentedString(repositorySlug)).append("\n");
        sb.append("    tls: ").append(toIndentedString(tls)).append("\n");
        sb.append("    webhook: ").append(toIndentedString(webhook)).append("\n");
        sb.append("    webhookSecret: ").append(toIndentedString(webhookSecret)).append("\n");
        
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
    public static class BitbucketServerEventSourceQueryParam  {

        @jakarta.ws.rs.QueryParam("accessToken")
        private SecretKeySelector accessToken;
        @jakarta.ws.rs.QueryParam("bitbucketserverBaseURL")
        private String bitbucketserverBaseURL;
        @jakarta.ws.rs.QueryParam("deleteHookOnFinish")
        private Boolean deleteHookOnFinish;
        @jakarta.ws.rs.QueryParam("events")
        private List<String> events = null;
        @jakarta.ws.rs.QueryParam("filter")
        private EventSourceFilter filter;
        @jakarta.ws.rs.QueryParam("metadata")
        private Map<String, String> metadata = null;
        @jakarta.ws.rs.QueryParam("projectKey")
        private String projectKey;
        @jakarta.ws.rs.QueryParam("repositories")
        private List<BitbucketServerRepository> repositories = null;
        @jakarta.ws.rs.QueryParam("repositorySlug")
        private String repositorySlug;
        @jakarta.ws.rs.QueryParam("tls")
        private TLSConfig tls;
        @jakarta.ws.rs.QueryParam("webhook")
        private WebhookContext webhook;
        @jakarta.ws.rs.QueryParam("webhookSecret")
        private SecretKeySelector webhookSecret;

        /**
        * Get accessToken
        * @return accessToken
        **/
        @JsonProperty("accessToken")
        public SecretKeySelector getAccessToken() {
            return accessToken;
        }

        /**
         * Set accessToken
         **/
        public void setAccessToken(SecretKeySelector accessToken) {
            this.accessToken = accessToken;
        }

        public BitbucketServerEventSourceQueryParam accessToken(SecretKeySelector accessToken) {
            this.accessToken = accessToken;
            return this;
        }

        /**
        * Get bitbucketserverBaseURL
        * @return bitbucketserverBaseURL
        **/
        @JsonProperty("bitbucketserverBaseURL")
        public String getBitbucketserverBaseURL() {
            return bitbucketserverBaseURL;
        }

        /**
         * Set bitbucketserverBaseURL
         **/
        public void setBitbucketserverBaseURL(String bitbucketserverBaseURL) {
            this.bitbucketserverBaseURL = bitbucketserverBaseURL;
        }

        public BitbucketServerEventSourceQueryParam bitbucketserverBaseURL(String bitbucketserverBaseURL) {
            this.bitbucketserverBaseURL = bitbucketserverBaseURL;
            return this;
        }

        /**
        * Get deleteHookOnFinish
        * @return deleteHookOnFinish
        **/
        @JsonProperty("deleteHookOnFinish")
        public Boolean getDeleteHookOnFinish() {
            return deleteHookOnFinish;
        }

        /**
         * Set deleteHookOnFinish
         **/
        public void setDeleteHookOnFinish(Boolean deleteHookOnFinish) {
            this.deleteHookOnFinish = deleteHookOnFinish;
        }

        public BitbucketServerEventSourceQueryParam deleteHookOnFinish(Boolean deleteHookOnFinish) {
            this.deleteHookOnFinish = deleteHookOnFinish;
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

        public BitbucketServerEventSourceQueryParam events(List<String> events) {
            this.events = events;
            return this;
        }
        public BitbucketServerEventSourceQueryParam addEventsItem(String eventsItem) {
            this.events.add(eventsItem);
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

        public BitbucketServerEventSourceQueryParam filter(EventSourceFilter filter) {
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

        public BitbucketServerEventSourceQueryParam metadata(Map<String, String> metadata) {
            this.metadata = metadata;
            return this;
        }
        public BitbucketServerEventSourceQueryParam putMetadataItem(String key, String metadataItem) {
            this.metadata.put(key, metadataItem);
            return this;
        }

        /**
        * Get projectKey
        * @return projectKey
        **/
        @JsonProperty("projectKey")
        public String getProjectKey() {
            return projectKey;
        }

        /**
         * Set projectKey
         **/
        public void setProjectKey(String projectKey) {
            this.projectKey = projectKey;
        }

        public BitbucketServerEventSourceQueryParam projectKey(String projectKey) {
            this.projectKey = projectKey;
            return this;
        }

        /**
        * Get repositories
        * @return repositories
        **/
        @JsonProperty("repositories")
        public List<BitbucketServerRepository> getRepositories() {
            return repositories;
        }

        /**
         * Set repositories
         **/
        public void setRepositories(List<BitbucketServerRepository> repositories) {
            this.repositories = repositories;
        }

        public BitbucketServerEventSourceQueryParam repositories(List<BitbucketServerRepository> repositories) {
            this.repositories = repositories;
            return this;
        }
        public BitbucketServerEventSourceQueryParam addRepositoriesItem(BitbucketServerRepository repositoriesItem) {
            this.repositories.add(repositoriesItem);
            return this;
        }

        /**
        * Get repositorySlug
        * @return repositorySlug
        **/
        @JsonProperty("repositorySlug")
        public String getRepositorySlug() {
            return repositorySlug;
        }

        /**
         * Set repositorySlug
         **/
        public void setRepositorySlug(String repositorySlug) {
            this.repositorySlug = repositorySlug;
        }

        public BitbucketServerEventSourceQueryParam repositorySlug(String repositorySlug) {
            this.repositorySlug = repositorySlug;
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

        public BitbucketServerEventSourceQueryParam tls(TLSConfig tls) {
            this.tls = tls;
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

        public BitbucketServerEventSourceQueryParam webhook(WebhookContext webhook) {
            this.webhook = webhook;
            return this;
        }

        /**
        * Get webhookSecret
        * @return webhookSecret
        **/
        @JsonProperty("webhookSecret")
        public SecretKeySelector getWebhookSecret() {
            return webhookSecret;
        }

        /**
         * Set webhookSecret
         **/
        public void setWebhookSecret(SecretKeySelector webhookSecret) {
            this.webhookSecret = webhookSecret;
        }

        public BitbucketServerEventSourceQueryParam webhookSecret(SecretKeySelector webhookSecret) {
            this.webhookSecret = webhookSecret;
            return this;
        }

        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class BitbucketServerEventSourceQueryParam {\n");

            sb.append("    accessToken: ").append(toIndentedString(accessToken)).append("\n");
            sb.append("    bitbucketserverBaseURL: ").append(toIndentedString(bitbucketserverBaseURL)).append("\n");
            sb.append("    deleteHookOnFinish: ").append(toIndentedString(deleteHookOnFinish)).append("\n");
            sb.append("    events: ").append(toIndentedString(events)).append("\n");
            sb.append("    filter: ").append(toIndentedString(filter)).append("\n");
            sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
            sb.append("    projectKey: ").append(toIndentedString(projectKey)).append("\n");
            sb.append("    repositories: ").append(toIndentedString(repositories)).append("\n");
            sb.append("    repositorySlug: ").append(toIndentedString(repositorySlug)).append("\n");
            sb.append("    tls: ").append(toIndentedString(tls)).append("\n");
            sb.append("    webhook: ").append(toIndentedString(webhook)).append("\n");
            sb.append("    webhookSecret: ").append(toIndentedString(webhookSecret)).append("\n");
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
