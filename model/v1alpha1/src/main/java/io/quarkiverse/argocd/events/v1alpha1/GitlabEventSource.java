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
public class GitlabEventSource  {

    private SecretKeySelector accessToken;
    private Boolean deleteHookOnFinish;
    private Boolean enableSSLVerification;
    private List<String> events;
    private EventSourceFilter filter;
    private String gitlabBaseURL;
    private List<String> groups;
    private Map<String, String> metadata;
    private String projectID;
    private List<String> projects;
    private SecretKeySelector secretToken;
    private WebhookContext webhook;

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

    public GitlabEventSource accessToken(SecretKeySelector accessToken) {
        this.accessToken = accessToken;
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

    public GitlabEventSource deleteHookOnFinish(Boolean deleteHookOnFinish) {
        this.deleteHookOnFinish = deleteHookOnFinish;
        return this;
    }

    /**
    * Get enableSSLVerification
    * @return enableSSLVerification
    **/
    @JsonProperty("enableSSLVerification")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public Boolean getEnableSSLVerification() {
        return enableSSLVerification;
    }

    /**
     * Set enableSSLVerification
     **/
    public void setEnableSSLVerification(Boolean enableSSLVerification) {
        this.enableSSLVerification = enableSSLVerification;
    }

    public GitlabEventSource enableSSLVerification(Boolean enableSSLVerification) {
        this.enableSSLVerification = enableSSLVerification;
        return this;
    }

    /**
    * Events are gitlab event to listen to. Refer https://github.com/xanzy/go-gitlab/blob/bf34eca5d13a9f4c3f501d8a97b8ac226d55e4d9/projects.go#L794.
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

    public GitlabEventSource events(List<String> events) {
        this.events = events;
        return this;
    }
    public GitlabEventSource addEventsItem(String eventsItem) {
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

    public GitlabEventSource filter(EventSourceFilter filter) {
        this.filter = filter;
        return this;
    }

    /**
    * Get gitlabBaseURL
    * @return gitlabBaseURL
    **/
    @JsonProperty("gitlabBaseURL")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public String getGitlabBaseURL() {
        return gitlabBaseURL;
    }

    /**
     * Set gitlabBaseURL
     **/
    public void setGitlabBaseURL(String gitlabBaseURL) {
        this.gitlabBaseURL = gitlabBaseURL;
    }

    public GitlabEventSource gitlabBaseURL(String gitlabBaseURL) {
        this.gitlabBaseURL = gitlabBaseURL;
        return this;
    }

    /**
    * Get groups
    * @return groups
    **/
    @JsonProperty("groups")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public List<String> getGroups() {
        return groups;
    }

    /**
     * Set groups
     **/
    public void setGroups(List<String> groups) {
        this.groups = groups;
    }

    public GitlabEventSource groups(List<String> groups) {
        this.groups = groups;
        return this;
    }
    public GitlabEventSource addGroupsItem(String groupsItem) {
        if (this.groups == null){
            groups = new ArrayList<>();
        }
        this.groups.add(groupsItem);
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

    public GitlabEventSource metadata(Map<String, String> metadata) {
        this.metadata = metadata;
        return this;
    }
    public GitlabEventSource putMetadataItem(String key, String metadataItem) {
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

    public GitlabEventSource projectID(String projectID) {
        this.projectID = projectID;
        return this;
    }

    /**
    * Get projects
    * @return projects
    **/
    @JsonProperty("projects")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public List<String> getProjects() {
        return projects;
    }

    /**
     * Set projects
     **/
    public void setProjects(List<String> projects) {
        this.projects = projects;
    }

    public GitlabEventSource projects(List<String> projects) {
        this.projects = projects;
        return this;
    }
    public GitlabEventSource addProjectsItem(String projectsItem) {
        if (this.projects == null){
            projects = new ArrayList<>();
        }
        this.projects.add(projectsItem);
        return this;
    }

    /**
    * Get secretToken
    * @return secretToken
    **/
    @JsonProperty("secretToken")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public SecretKeySelector getSecretToken() {
        return secretToken;
    }

    /**
     * Set secretToken
     **/
    public void setSecretToken(SecretKeySelector secretToken) {
        this.secretToken = secretToken;
    }

    public GitlabEventSource secretToken(SecretKeySelector secretToken) {
        this.secretToken = secretToken;
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

    public GitlabEventSource webhook(WebhookContext webhook) {
        this.webhook = webhook;
        return this;
    }

    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GitlabEventSource {\n");

        sb.append("    accessToken: ").append(toIndentedString(accessToken)).append("\n");
        sb.append("    deleteHookOnFinish: ").append(toIndentedString(deleteHookOnFinish)).append("\n");
        sb.append("    enableSSLVerification: ").append(toIndentedString(enableSSLVerification)).append("\n");
        sb.append("    events: ").append(toIndentedString(events)).append("\n");
        sb.append("    filter: ").append(toIndentedString(filter)).append("\n");
        sb.append("    gitlabBaseURL: ").append(toIndentedString(gitlabBaseURL)).append("\n");
        sb.append("    groups: ").append(toIndentedString(groups)).append("\n");
        sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
        sb.append("    projectID: ").append(toIndentedString(projectID)).append("\n");
        sb.append("    projects: ").append(toIndentedString(projects)).append("\n");
        sb.append("    secretToken: ").append(toIndentedString(secretToken)).append("\n");
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
    public static class GitlabEventSourceQueryParam  {

        @jakarta.ws.rs.QueryParam("accessToken")
        private SecretKeySelector accessToken;
        @jakarta.ws.rs.QueryParam("deleteHookOnFinish")
        private Boolean deleteHookOnFinish;
        @jakarta.ws.rs.QueryParam("enableSSLVerification")
        private Boolean enableSSLVerification;
        @jakarta.ws.rs.QueryParam("events")
        private List<String> events = null;
        @jakarta.ws.rs.QueryParam("filter")
        private EventSourceFilter filter;
        @jakarta.ws.rs.QueryParam("gitlabBaseURL")
        private String gitlabBaseURL;
        @jakarta.ws.rs.QueryParam("groups")
        private List<String> groups = null;
        @jakarta.ws.rs.QueryParam("metadata")
        private Map<String, String> metadata = null;
        @jakarta.ws.rs.QueryParam("projectID")
        private String projectID;
        @jakarta.ws.rs.QueryParam("projects")
        private List<String> projects = null;
        @jakarta.ws.rs.QueryParam("secretToken")
        private SecretKeySelector secretToken;
        @jakarta.ws.rs.QueryParam("webhook")
        private WebhookContext webhook;

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

        public GitlabEventSourceQueryParam accessToken(SecretKeySelector accessToken) {
            this.accessToken = accessToken;
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

        public GitlabEventSourceQueryParam deleteHookOnFinish(Boolean deleteHookOnFinish) {
            this.deleteHookOnFinish = deleteHookOnFinish;
            return this;
        }

        /**
        * Get enableSSLVerification
        * @return enableSSLVerification
        **/
        @JsonProperty("enableSSLVerification")
        public Boolean getEnableSSLVerification() {
            return enableSSLVerification;
        }

        /**
         * Set enableSSLVerification
         **/
        public void setEnableSSLVerification(Boolean enableSSLVerification) {
            this.enableSSLVerification = enableSSLVerification;
        }

        public GitlabEventSourceQueryParam enableSSLVerification(Boolean enableSSLVerification) {
            this.enableSSLVerification = enableSSLVerification;
            return this;
        }

        /**
        * Events are gitlab event to listen to. Refer https://github.com/xanzy/go-gitlab/blob/bf34eca5d13a9f4c3f501d8a97b8ac226d55e4d9/projects.go#L794.
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

        public GitlabEventSourceQueryParam events(List<String> events) {
            this.events = events;
            return this;
        }
        public GitlabEventSourceQueryParam addEventsItem(String eventsItem) {
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

        public GitlabEventSourceQueryParam filter(EventSourceFilter filter) {
            this.filter = filter;
            return this;
        }

        /**
        * Get gitlabBaseURL
        * @return gitlabBaseURL
        **/
        @JsonProperty("gitlabBaseURL")
        public String getGitlabBaseURL() {
            return gitlabBaseURL;
        }

        /**
         * Set gitlabBaseURL
         **/
        public void setGitlabBaseURL(String gitlabBaseURL) {
            this.gitlabBaseURL = gitlabBaseURL;
        }

        public GitlabEventSourceQueryParam gitlabBaseURL(String gitlabBaseURL) {
            this.gitlabBaseURL = gitlabBaseURL;
            return this;
        }

        /**
        * Get groups
        * @return groups
        **/
        @JsonProperty("groups")
        public List<String> getGroups() {
            return groups;
        }

        /**
         * Set groups
         **/
        public void setGroups(List<String> groups) {
            this.groups = groups;
        }

        public GitlabEventSourceQueryParam groups(List<String> groups) {
            this.groups = groups;
            return this;
        }
        public GitlabEventSourceQueryParam addGroupsItem(String groupsItem) {
            this.groups.add(groupsItem);
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

        public GitlabEventSourceQueryParam metadata(Map<String, String> metadata) {
            this.metadata = metadata;
            return this;
        }
        public GitlabEventSourceQueryParam putMetadataItem(String key, String metadataItem) {
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

        public GitlabEventSourceQueryParam projectID(String projectID) {
            this.projectID = projectID;
            return this;
        }

        /**
        * Get projects
        * @return projects
        **/
        @JsonProperty("projects")
        public List<String> getProjects() {
            return projects;
        }

        /**
         * Set projects
         **/
        public void setProjects(List<String> projects) {
            this.projects = projects;
        }

        public GitlabEventSourceQueryParam projects(List<String> projects) {
            this.projects = projects;
            return this;
        }
        public GitlabEventSourceQueryParam addProjectsItem(String projectsItem) {
            this.projects.add(projectsItem);
            return this;
        }

        /**
        * Get secretToken
        * @return secretToken
        **/
        @JsonProperty("secretToken")
        public SecretKeySelector getSecretToken() {
            return secretToken;
        }

        /**
         * Set secretToken
         **/
        public void setSecretToken(SecretKeySelector secretToken) {
            this.secretToken = secretToken;
        }

        public GitlabEventSourceQueryParam secretToken(SecretKeySelector secretToken) {
            this.secretToken = secretToken;
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

        public GitlabEventSourceQueryParam webhook(WebhookContext webhook) {
            this.webhook = webhook;
            return this;
        }

        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class GitlabEventSourceQueryParam {\n");

            sb.append("    accessToken: ").append(toIndentedString(accessToken)).append("\n");
            sb.append("    deleteHookOnFinish: ").append(toIndentedString(deleteHookOnFinish)).append("\n");
            sb.append("    enableSSLVerification: ").append(toIndentedString(enableSSLVerification)).append("\n");
            sb.append("    events: ").append(toIndentedString(events)).append("\n");
            sb.append("    filter: ").append(toIndentedString(filter)).append("\n");
            sb.append("    gitlabBaseURL: ").append(toIndentedString(gitlabBaseURL)).append("\n");
            sb.append("    groups: ").append(toIndentedString(groups)).append("\n");
            sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
            sb.append("    projectID: ").append(toIndentedString(projectID)).append("\n");
            sb.append("    projects: ").append(toIndentedString(projects)).append("\n");
            sb.append("    secretToken: ").append(toIndentedString(secretToken)).append("\n");
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
