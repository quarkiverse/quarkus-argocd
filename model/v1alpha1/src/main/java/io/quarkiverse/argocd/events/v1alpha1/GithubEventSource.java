package io.quarkiverse.argocd.events.v1alpha1;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.quarkiverse.argocd.v1alpha1.model.EventSourceFilter;
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
public class GithubEventSource  {

    private Boolean active;
    private SecretKeySelector apiToken;
    private String contentType;
    private Boolean deleteHookOnFinish;
    private List<String> events;
    private EventSourceFilter filter;
    private GithubAppCreds githubApp;
    private String githubBaseURL;
    private String githubUploadURL;
    private String id;
    private Boolean insecure;
    private Map<String, String> metadata;
    private List<String> organizations;
    private String owner;
    private List<OwnedRepositories> repositories;
    private String repository;
    private WebhookContext webhook;
    private SecretKeySelector webhookSecret;

    /**
    * Get active
    * @return active
    **/
    @JsonProperty("active")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public Boolean getActive() {
        return active;
    }

    /**
     * Set active
     **/
    public void setActive(Boolean active) {
        this.active = active;
    }

    public GithubEventSource active(Boolean active) {
        this.active = active;
        return this;
    }

    /**
    * Get apiToken
    * @return apiToken
    **/
    @JsonProperty("apiToken")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public SecretKeySelector getApiToken() {
        return apiToken;
    }

    /**
     * Set apiToken
     **/
    public void setApiToken(SecretKeySelector apiToken) {
        this.apiToken = apiToken;
    }

    public GithubEventSource apiToken(SecretKeySelector apiToken) {
        this.apiToken = apiToken;
        return this;
    }

    /**
    * Get contentType
    * @return contentType
    **/
    @JsonProperty("contentType")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public String getContentType() {
        return contentType;
    }

    /**
     * Set contentType
     **/
    public void setContentType(String contentType) {
        this.contentType = contentType;
    }

    public GithubEventSource contentType(String contentType) {
        this.contentType = contentType;
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

    public GithubEventSource deleteHookOnFinish(Boolean deleteHookOnFinish) {
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

    public GithubEventSource events(List<String> events) {
        this.events = events;
        return this;
    }
    public GithubEventSource addEventsItem(String eventsItem) {
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

    public GithubEventSource filter(EventSourceFilter filter) {
        this.filter = filter;
        return this;
    }

    /**
    * Get githubApp
    * @return githubApp
    **/
    @JsonProperty("githubApp")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public GithubAppCreds getGithubApp() {
        return githubApp;
    }

    /**
     * Set githubApp
     **/
    public void setGithubApp(GithubAppCreds githubApp) {
        this.githubApp = githubApp;
    }

    public GithubEventSource githubApp(GithubAppCreds githubApp) {
        this.githubApp = githubApp;
        return this;
    }

    /**
    * Get githubBaseURL
    * @return githubBaseURL
    **/
    @JsonProperty("githubBaseURL")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public String getGithubBaseURL() {
        return githubBaseURL;
    }

    /**
     * Set githubBaseURL
     **/
    public void setGithubBaseURL(String githubBaseURL) {
        this.githubBaseURL = githubBaseURL;
    }

    public GithubEventSource githubBaseURL(String githubBaseURL) {
        this.githubBaseURL = githubBaseURL;
        return this;
    }

    /**
    * Get githubUploadURL
    * @return githubUploadURL
    **/
    @JsonProperty("githubUploadURL")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public String getGithubUploadURL() {
        return githubUploadURL;
    }

    /**
     * Set githubUploadURL
     **/
    public void setGithubUploadURL(String githubUploadURL) {
        this.githubUploadURL = githubUploadURL;
    }

    public GithubEventSource githubUploadURL(String githubUploadURL) {
        this.githubUploadURL = githubUploadURL;
        return this;
    }

    /**
    * Get id
    * @return id
    **/
    @JsonProperty("id")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public String getId() {
        return id;
    }

    /**
     * Set id
     **/
    public void setId(String id) {
        this.id = id;
    }

    public GithubEventSource id(String id) {
        this.id = id;
        return this;
    }

    /**
    * Get insecure
    * @return insecure
    **/
    @JsonProperty("insecure")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public Boolean getInsecure() {
        return insecure;
    }

    /**
     * Set insecure
     **/
    public void setInsecure(Boolean insecure) {
        this.insecure = insecure;
    }

    public GithubEventSource insecure(Boolean insecure) {
        this.insecure = insecure;
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

    public GithubEventSource metadata(Map<String, String> metadata) {
        this.metadata = metadata;
        return this;
    }
    public GithubEventSource putMetadataItem(String key, String metadataItem) {
           if (this.metadata == null){
                metadata = new HashMap<>();
            }
        this.metadata.put(key, metadataItem);
        return this;
    }

    /**
    * Organizations holds the names of organizations (used for organization level webhooks). Not required if Repositories is set.
    * @return organizations
    **/
    @JsonProperty("organizations")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public List<String> getOrganizations() {
        return organizations;
    }

    /**
     * Set organizations
     **/
    public void setOrganizations(List<String> organizations) {
        this.organizations = organizations;
    }

    public GithubEventSource organizations(List<String> organizations) {
        this.organizations = organizations;
        return this;
    }
    public GithubEventSource addOrganizationsItem(String organizationsItem) {
        if (this.organizations == null){
            organizations = new ArrayList<>();
        }
        this.organizations.add(organizationsItem);
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

    public GithubEventSource owner(String owner) {
        this.owner = owner;
        return this;
    }

    /**
    * Repositories holds the information of repositories, which uses repo owner as the key, and list of repo names as the value. Not required if Organizations is set.
    * @return repositories
    **/
    @JsonProperty("repositories")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public List<OwnedRepositories> getRepositories() {
        return repositories;
    }

    /**
     * Set repositories
     **/
    public void setRepositories(List<OwnedRepositories> repositories) {
        this.repositories = repositories;
    }

    public GithubEventSource repositories(List<OwnedRepositories> repositories) {
        this.repositories = repositories;
        return this;
    }
    public GithubEventSource addRepositoriesItem(OwnedRepositories repositoriesItem) {
        if (this.repositories == null){
            repositories = new ArrayList<>();
        }
        this.repositories.add(repositoriesItem);
        return this;
    }

    /**
    * Get repository
    * @return repository
    **/
    @JsonProperty("repository")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public String getRepository() {
        return repository;
    }

    /**
     * Set repository
     **/
    public void setRepository(String repository) {
        this.repository = repository;
    }

    public GithubEventSource repository(String repository) {
        this.repository = repository;
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

    public GithubEventSource webhook(WebhookContext webhook) {
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

    public GithubEventSource webhookSecret(SecretKeySelector webhookSecret) {
        this.webhookSecret = webhookSecret;
        return this;
    }

    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GithubEventSource {\n");

        sb.append("    active: ").append(toIndentedString(active)).append("\n");
        sb.append("    apiToken: ").append(toIndentedString(apiToken)).append("\n");
        sb.append("    contentType: ").append(toIndentedString(contentType)).append("\n");
        sb.append("    deleteHookOnFinish: ").append(toIndentedString(deleteHookOnFinish)).append("\n");
        sb.append("    events: ").append(toIndentedString(events)).append("\n");
        sb.append("    filter: ").append(toIndentedString(filter)).append("\n");
        sb.append("    githubApp: ").append(toIndentedString(githubApp)).append("\n");
        sb.append("    githubBaseURL: ").append(toIndentedString(githubBaseURL)).append("\n");
        sb.append("    githubUploadURL: ").append(toIndentedString(githubUploadURL)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    insecure: ").append(toIndentedString(insecure)).append("\n");
        sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
        sb.append("    organizations: ").append(toIndentedString(organizations)).append("\n");
        sb.append("    owner: ").append(toIndentedString(owner)).append("\n");
        sb.append("    repositories: ").append(toIndentedString(repositories)).append("\n");
        sb.append("    repository: ").append(toIndentedString(repository)).append("\n");
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
    public static class GithubEventSourceQueryParam  {

        @jakarta.ws.rs.QueryParam("active")
        private Boolean active;
        @jakarta.ws.rs.QueryParam("apiToken")
        private SecretKeySelector apiToken;
        @jakarta.ws.rs.QueryParam("contentType")
        private String contentType;
        @jakarta.ws.rs.QueryParam("deleteHookOnFinish")
        private Boolean deleteHookOnFinish;
        @jakarta.ws.rs.QueryParam("events")
        private List<String> events = null;
        @jakarta.ws.rs.QueryParam("filter")
        private EventSourceFilter filter;
        @jakarta.ws.rs.QueryParam("githubApp")
        private GithubAppCreds githubApp;
        @jakarta.ws.rs.QueryParam("githubBaseURL")
        private String githubBaseURL;
        @jakarta.ws.rs.QueryParam("githubUploadURL")
        private String githubUploadURL;
        @jakarta.ws.rs.QueryParam("id")
        private String id;
        @jakarta.ws.rs.QueryParam("insecure")
        private Boolean insecure;
        @jakarta.ws.rs.QueryParam("metadata")
        private Map<String, String> metadata = null;
        @jakarta.ws.rs.QueryParam("organizations")
        private List<String> organizations = null;
        @jakarta.ws.rs.QueryParam("owner")
        private String owner;
        @jakarta.ws.rs.QueryParam("repositories")
        private List<OwnedRepositories> repositories = null;
        @jakarta.ws.rs.QueryParam("repository")
        private String repository;
        @jakarta.ws.rs.QueryParam("webhook")
        private WebhookContext webhook;
        @jakarta.ws.rs.QueryParam("webhookSecret")
        private SecretKeySelector webhookSecret;

        /**
        * Get active
        * @return active
        **/
        @JsonProperty("active")
        public Boolean getActive() {
            return active;
        }

        /**
         * Set active
         **/
        public void setActive(Boolean active) {
            this.active = active;
        }

        public GithubEventSourceQueryParam active(Boolean active) {
            this.active = active;
            return this;
        }

        /**
        * Get apiToken
        * @return apiToken
        **/
        @JsonProperty("apiToken")
        public SecretKeySelector getApiToken() {
            return apiToken;
        }

        /**
         * Set apiToken
         **/
        public void setApiToken(SecretKeySelector apiToken) {
            this.apiToken = apiToken;
        }

        public GithubEventSourceQueryParam apiToken(SecretKeySelector apiToken) {
            this.apiToken = apiToken;
            return this;
        }

        /**
        * Get contentType
        * @return contentType
        **/
        @JsonProperty("contentType")
        public String getContentType() {
            return contentType;
        }

        /**
         * Set contentType
         **/
        public void setContentType(String contentType) {
            this.contentType = contentType;
        }

        public GithubEventSourceQueryParam contentType(String contentType) {
            this.contentType = contentType;
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

        public GithubEventSourceQueryParam deleteHookOnFinish(Boolean deleteHookOnFinish) {
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

        public GithubEventSourceQueryParam events(List<String> events) {
            this.events = events;
            return this;
        }
        public GithubEventSourceQueryParam addEventsItem(String eventsItem) {
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

        public GithubEventSourceQueryParam filter(EventSourceFilter filter) {
            this.filter = filter;
            return this;
        }

        /**
        * Get githubApp
        * @return githubApp
        **/
        @JsonProperty("githubApp")
        public GithubAppCreds getGithubApp() {
            return githubApp;
        }

        /**
         * Set githubApp
         **/
        public void setGithubApp(GithubAppCreds githubApp) {
            this.githubApp = githubApp;
        }

        public GithubEventSourceQueryParam githubApp(GithubAppCreds githubApp) {
            this.githubApp = githubApp;
            return this;
        }

        /**
        * Get githubBaseURL
        * @return githubBaseURL
        **/
        @JsonProperty("githubBaseURL")
        public String getGithubBaseURL() {
            return githubBaseURL;
        }

        /**
         * Set githubBaseURL
         **/
        public void setGithubBaseURL(String githubBaseURL) {
            this.githubBaseURL = githubBaseURL;
        }

        public GithubEventSourceQueryParam githubBaseURL(String githubBaseURL) {
            this.githubBaseURL = githubBaseURL;
            return this;
        }

        /**
        * Get githubUploadURL
        * @return githubUploadURL
        **/
        @JsonProperty("githubUploadURL")
        public String getGithubUploadURL() {
            return githubUploadURL;
        }

        /**
         * Set githubUploadURL
         **/
        public void setGithubUploadURL(String githubUploadURL) {
            this.githubUploadURL = githubUploadURL;
        }

        public GithubEventSourceQueryParam githubUploadURL(String githubUploadURL) {
            this.githubUploadURL = githubUploadURL;
            return this;
        }

        /**
        * Get id
        * @return id
        **/
        @JsonProperty("id")
        public String getId() {
            return id;
        }

        /**
         * Set id
         **/
        public void setId(String id) {
            this.id = id;
        }

        public GithubEventSourceQueryParam id(String id) {
            this.id = id;
            return this;
        }

        /**
        * Get insecure
        * @return insecure
        **/
        @JsonProperty("insecure")
        public Boolean getInsecure() {
            return insecure;
        }

        /**
         * Set insecure
         **/
        public void setInsecure(Boolean insecure) {
            this.insecure = insecure;
        }

        public GithubEventSourceQueryParam insecure(Boolean insecure) {
            this.insecure = insecure;
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

        public GithubEventSourceQueryParam metadata(Map<String, String> metadata) {
            this.metadata = metadata;
            return this;
        }
        public GithubEventSourceQueryParam putMetadataItem(String key, String metadataItem) {
            this.metadata.put(key, metadataItem);
            return this;
        }

        /**
        * Organizations holds the names of organizations (used for organization level webhooks). Not required if Repositories is set.
        * @return organizations
        **/
        @JsonProperty("organizations")
        public List<String> getOrganizations() {
            return organizations;
        }

        /**
         * Set organizations
         **/
        public void setOrganizations(List<String> organizations) {
            this.organizations = organizations;
        }

        public GithubEventSourceQueryParam organizations(List<String> organizations) {
            this.organizations = organizations;
            return this;
        }
        public GithubEventSourceQueryParam addOrganizationsItem(String organizationsItem) {
            this.organizations.add(organizationsItem);
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

        public GithubEventSourceQueryParam owner(String owner) {
            this.owner = owner;
            return this;
        }

        /**
        * Repositories holds the information of repositories, which uses repo owner as the key, and list of repo names as the value. Not required if Organizations is set.
        * @return repositories
        **/
        @JsonProperty("repositories")
        public List<OwnedRepositories> getRepositories() {
            return repositories;
        }

        /**
         * Set repositories
         **/
        public void setRepositories(List<OwnedRepositories> repositories) {
            this.repositories = repositories;
        }

        public GithubEventSourceQueryParam repositories(List<OwnedRepositories> repositories) {
            this.repositories = repositories;
            return this;
        }
        public GithubEventSourceQueryParam addRepositoriesItem(OwnedRepositories repositoriesItem) {
            this.repositories.add(repositoriesItem);
            return this;
        }

        /**
        * Get repository
        * @return repository
        **/
        @JsonProperty("repository")
        public String getRepository() {
            return repository;
        }

        /**
         * Set repository
         **/
        public void setRepository(String repository) {
            this.repository = repository;
        }

        public GithubEventSourceQueryParam repository(String repository) {
            this.repository = repository;
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

        public GithubEventSourceQueryParam webhook(WebhookContext webhook) {
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

        public GithubEventSourceQueryParam webhookSecret(SecretKeySelector webhookSecret) {
            this.webhookSecret = webhookSecret;
            return this;
        }

        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class GithubEventSourceQueryParam {\n");

            sb.append("    active: ").append(toIndentedString(active)).append("\n");
            sb.append("    apiToken: ").append(toIndentedString(apiToken)).append("\n");
            sb.append("    contentType: ").append(toIndentedString(contentType)).append("\n");
            sb.append("    deleteHookOnFinish: ").append(toIndentedString(deleteHookOnFinish)).append("\n");
            sb.append("    events: ").append(toIndentedString(events)).append("\n");
            sb.append("    filter: ").append(toIndentedString(filter)).append("\n");
            sb.append("    githubApp: ").append(toIndentedString(githubApp)).append("\n");
            sb.append("    githubBaseURL: ").append(toIndentedString(githubBaseURL)).append("\n");
            sb.append("    githubUploadURL: ").append(toIndentedString(githubUploadURL)).append("\n");
            sb.append("    id: ").append(toIndentedString(id)).append("\n");
            sb.append("    insecure: ").append(toIndentedString(insecure)).append("\n");
            sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
            sb.append("    organizations: ").append(toIndentedString(organizations)).append("\n");
            sb.append("    owner: ").append(toIndentedString(owner)).append("\n");
            sb.append("    repositories: ").append(toIndentedString(repositories)).append("\n");
            sb.append("    repository: ").append(toIndentedString(repository)).append("\n");
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
