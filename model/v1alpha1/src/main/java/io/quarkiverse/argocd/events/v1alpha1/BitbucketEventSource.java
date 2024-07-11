package io.quarkiverse.argocd.events.v1alpha1;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.Type;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class BitbucketEventSource  {

    private BitbucketAuth auth;
    private Boolean deleteHookOnFinish;
    private List<String> events;
    private EventSourceFilter filter;
    private Map<String, String> metadata;
    private String owner;
    private String projectKey;
    private List<BitbucketRepository> repositories;
    private String repositorySlug;
    private WebhookContext webhook;

    /**
    * Get auth
    * @return auth
    **/
    @JsonProperty("auth")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public BitbucketAuth getAuth() {
        return auth;
    }

    /**
     * Set auth
     **/
    public void setAuth(BitbucketAuth auth) {
        this.auth = auth;
    }

    public BitbucketEventSource auth(BitbucketAuth auth) {
        this.auth = auth;
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

    public BitbucketEventSource deleteHookOnFinish(Boolean deleteHookOnFinish) {
        this.deleteHookOnFinish = deleteHookOnFinish;
        return this;
    }

    /**
    * Events this webhook is subscribed to.
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

    public BitbucketEventSource events(List<String> events) {
        this.events = events;
        return this;
    }
    public BitbucketEventSource addEventsItem(String eventsItem) {
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

    public BitbucketEventSource filter(EventSourceFilter filter) {
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

    public BitbucketEventSource metadata(Map<String, String> metadata) {
        this.metadata = metadata;
        return this;
    }
    public BitbucketEventSource putMetadataItem(String key, String metadataItem) {
           if (this.metadata == null){
                metadata = new HashMap<>();
            }
        this.metadata.put(key, metadataItem);
        return this;
    }

    /**
    * Get owner
    * @return owner
    **/
    @JsonProperty("owner")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public String getOwner() {
        return owner;
    }

    /**
     * Set owner
     **/
    public void setOwner(String owner) {
        this.owner = owner;
    }

    public BitbucketEventSource owner(String owner) {
        this.owner = owner;
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

    public BitbucketEventSource projectKey(String projectKey) {
        this.projectKey = projectKey;
        return this;
    }

    /**
    * Get repositories
    * @return repositories
    **/
    @JsonProperty("repositories")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public List<BitbucketRepository> getRepositories() {
        return repositories;
    }

    /**
     * Set repositories
     **/
    public void setRepositories(List<BitbucketRepository> repositories) {
        this.repositories = repositories;
    }

    public BitbucketEventSource repositories(List<BitbucketRepository> repositories) {
        this.repositories = repositories;
        return this;
    }
    public BitbucketEventSource addRepositoriesItem(BitbucketRepository repositoriesItem) {
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

    public BitbucketEventSource repositorySlug(String repositorySlug) {
        this.repositorySlug = repositorySlug;
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

    public BitbucketEventSource webhook(WebhookContext webhook) {
        this.webhook = webhook;
        return this;
    }

    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BitbucketEventSource {\n");

        sb.append("    auth: ").append(toIndentedString(auth)).append("\n");
        sb.append("    deleteHookOnFinish: ").append(toIndentedString(deleteHookOnFinish)).append("\n");
        sb.append("    events: ").append(toIndentedString(events)).append("\n");
        sb.append("    filter: ").append(toIndentedString(filter)).append("\n");
        sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
        sb.append("    owner: ").append(toIndentedString(owner)).append("\n");
        sb.append("    projectKey: ").append(toIndentedString(projectKey)).append("\n");
        sb.append("    repositories: ").append(toIndentedString(repositories)).append("\n");
        sb.append("    repositorySlug: ").append(toIndentedString(repositorySlug)).append("\n");
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
    public static class BitbucketEventSourceQueryParam  {

        @jakarta.ws.rs.QueryParam("auth")
        private BitbucketAuth auth;
        @jakarta.ws.rs.QueryParam("deleteHookOnFinish")
        private Boolean deleteHookOnFinish;
        @jakarta.ws.rs.QueryParam("events")
        private List<String> events = null;
        @jakarta.ws.rs.QueryParam("filter")
        private EventSourceFilter filter;
        @jakarta.ws.rs.QueryParam("metadata")
        private Map<String, String> metadata = null;
        @jakarta.ws.rs.QueryParam("owner")
        private String owner;
        @jakarta.ws.rs.QueryParam("projectKey")
        private String projectKey;
        @jakarta.ws.rs.QueryParam("repositories")
        private List<BitbucketRepository> repositories = null;
        @jakarta.ws.rs.QueryParam("repositorySlug")
        private String repositorySlug;
        @jakarta.ws.rs.QueryParam("webhook")
        private WebhookContext webhook;

        /**
        * Get auth
        * @return auth
        **/
        @JsonProperty("auth")
        public BitbucketAuth getAuth() {
            return auth;
        }

        /**
         * Set auth
         **/
        public void setAuth(BitbucketAuth auth) {
            this.auth = auth;
        }

        public BitbucketEventSourceQueryParam auth(BitbucketAuth auth) {
            this.auth = auth;
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

        public BitbucketEventSourceQueryParam deleteHookOnFinish(Boolean deleteHookOnFinish) {
            this.deleteHookOnFinish = deleteHookOnFinish;
            return this;
        }

        /**
        * Events this webhook is subscribed to.
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

        public BitbucketEventSourceQueryParam events(List<String> events) {
            this.events = events;
            return this;
        }
        public BitbucketEventSourceQueryParam addEventsItem(String eventsItem) {
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

        public BitbucketEventSourceQueryParam filter(EventSourceFilter filter) {
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

        public BitbucketEventSourceQueryParam metadata(Map<String, String> metadata) {
            this.metadata = metadata;
            return this;
        }
        public BitbucketEventSourceQueryParam putMetadataItem(String key, String metadataItem) {
            this.metadata.put(key, metadataItem);
            return this;
        }

        /**
        * Get owner
        * @return owner
        **/
        @JsonProperty("owner")
        public String getOwner() {
            return owner;
        }

        /**
         * Set owner
         **/
        public void setOwner(String owner) {
            this.owner = owner;
        }

        public BitbucketEventSourceQueryParam owner(String owner) {
            this.owner = owner;
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

        public BitbucketEventSourceQueryParam projectKey(String projectKey) {
            this.projectKey = projectKey;
            return this;
        }

        /**
        * Get repositories
        * @return repositories
        **/
        @JsonProperty("repositories")
        public List<BitbucketRepository> getRepositories() {
            return repositories;
        }

        /**
         * Set repositories
         **/
        public void setRepositories(List<BitbucketRepository> repositories) {
            this.repositories = repositories;
        }

        public BitbucketEventSourceQueryParam repositories(List<BitbucketRepository> repositories) {
            this.repositories = repositories;
            return this;
        }
        public BitbucketEventSourceQueryParam addRepositoriesItem(BitbucketRepository repositoriesItem) {
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

        public BitbucketEventSourceQueryParam repositorySlug(String repositorySlug) {
            this.repositorySlug = repositorySlug;
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

        public BitbucketEventSourceQueryParam webhook(WebhookContext webhook) {
            this.webhook = webhook;
            return this;
        }

        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class BitbucketEventSourceQueryParam {\n");

            sb.append("    auth: ").append(toIndentedString(auth)).append("\n");
            sb.append("    deleteHookOnFinish: ").append(toIndentedString(deleteHookOnFinish)).append("\n");
            sb.append("    events: ").append(toIndentedString(events)).append("\n");
            sb.append("    filter: ").append(toIndentedString(filter)).append("\n");
            sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
            sb.append("    owner: ").append(toIndentedString(owner)).append("\n");
            sb.append("    projectKey: ").append(toIndentedString(projectKey)).append("\n");
            sb.append("    repositories: ").append(toIndentedString(repositories)).append("\n");
            sb.append("    repositorySlug: ").append(toIndentedString(repositorySlug)).append("\n");
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
