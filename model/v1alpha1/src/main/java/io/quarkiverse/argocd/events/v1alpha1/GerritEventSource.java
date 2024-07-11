package io.quarkiverse.argocd.events.v1alpha1;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.quarkiverse.argocd.v1alpha1.model.EventSourceFilter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.Type;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class GerritEventSource  {

    private BasicAuth auth;
    private Boolean deleteHookOnFinish;
    private List<String> events;
    private EventSourceFilter filter;
    private String gerritBaseURL;
    private String hookName;
    private Map<String, String> metadata;
    private List<String> projects;
    private Boolean sslVerify;
    private WebhookContext webhook;

    /**
    * Get auth
    * @return auth
    **/
    @JsonProperty("auth")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public BasicAuth getAuth() {
        return auth;
    }

    /**
     * Set auth
     **/
    public void setAuth(BasicAuth auth) {
        this.auth = auth;
    }

    public GerritEventSource auth(BasicAuth auth) {
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

    public GerritEventSource deleteHookOnFinish(Boolean deleteHookOnFinish) {
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

    public GerritEventSource events(List<String> events) {
        this.events = events;
        return this;
    }
    public GerritEventSource addEventsItem(String eventsItem) {
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

    public GerritEventSource filter(EventSourceFilter filter) {
        this.filter = filter;
        return this;
    }

    /**
    * Get gerritBaseURL
    * @return gerritBaseURL
    **/
    @JsonProperty("gerritBaseURL")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public String getGerritBaseURL() {
        return gerritBaseURL;
    }

    /**
     * Set gerritBaseURL
     **/
    public void setGerritBaseURL(String gerritBaseURL) {
        this.gerritBaseURL = gerritBaseURL;
    }

    public GerritEventSource gerritBaseURL(String gerritBaseURL) {
        this.gerritBaseURL = gerritBaseURL;
        return this;
    }

    /**
    * Get hookName
    * @return hookName
    **/
    @JsonProperty("hookName")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public String getHookName() {
        return hookName;
    }

    /**
     * Set hookName
     **/
    public void setHookName(String hookName) {
        this.hookName = hookName;
    }

    public GerritEventSource hookName(String hookName) {
        this.hookName = hookName;
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

    public GerritEventSource metadata(Map<String, String> metadata) {
        this.metadata = metadata;
        return this;
    }
    public GerritEventSource putMetadataItem(String key, String metadataItem) {
           if (this.metadata == null){
                metadata = new HashMap<>();
            }
        this.metadata.put(key, metadataItem);
        return this;
    }

    /**
    * List of project namespace paths like \"whynowy/test\".
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

    public GerritEventSource projects(List<String> projects) {
        this.projects = projects;
        return this;
    }
    public GerritEventSource addProjectsItem(String projectsItem) {
        if (this.projects == null){
            projects = new ArrayList<>();
        }
        this.projects.add(projectsItem);
        return this;
    }

    /**
    * Get sslVerify
    * @return sslVerify
    **/
    @JsonProperty("sslVerify")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public Boolean getSslVerify() {
        return sslVerify;
    }

    /**
     * Set sslVerify
     **/
    public void setSslVerify(Boolean sslVerify) {
        this.sslVerify = sslVerify;
    }

    public GerritEventSource sslVerify(Boolean sslVerify) {
        this.sslVerify = sslVerify;
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

    public GerritEventSource webhook(WebhookContext webhook) {
        this.webhook = webhook;
        return this;
    }

    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GerritEventSource {\n");

        sb.append("    auth: ").append(toIndentedString(auth)).append("\n");
        sb.append("    deleteHookOnFinish: ").append(toIndentedString(deleteHookOnFinish)).append("\n");
        sb.append("    events: ").append(toIndentedString(events)).append("\n");
        sb.append("    filter: ").append(toIndentedString(filter)).append("\n");
        sb.append("    gerritBaseURL: ").append(toIndentedString(gerritBaseURL)).append("\n");
        sb.append("    hookName: ").append(toIndentedString(hookName)).append("\n");
        sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
        sb.append("    projects: ").append(toIndentedString(projects)).append("\n");
        sb.append("    sslVerify: ").append(toIndentedString(sslVerify)).append("\n");
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
    public static class GerritEventSourceQueryParam  {

        @jakarta.ws.rs.QueryParam("auth")
        private BasicAuth auth;
        @jakarta.ws.rs.QueryParam("deleteHookOnFinish")
        private Boolean deleteHookOnFinish;
        @jakarta.ws.rs.QueryParam("events")
        private List<String> events = null;
        @jakarta.ws.rs.QueryParam("filter")
        private EventSourceFilter filter;
        @jakarta.ws.rs.QueryParam("gerritBaseURL")
        private String gerritBaseURL;
        @jakarta.ws.rs.QueryParam("hookName")
        private String hookName;
        @jakarta.ws.rs.QueryParam("metadata")
        private Map<String, String> metadata = null;
        @jakarta.ws.rs.QueryParam("projects")
        private List<String> projects = null;
        @jakarta.ws.rs.QueryParam("sslVerify")
        private Boolean sslVerify;
        @jakarta.ws.rs.QueryParam("webhook")
        private WebhookContext webhook;

        /**
        * Get auth
        * @return auth
        **/
        @JsonProperty("auth")
        public BasicAuth getAuth() {
            return auth;
        }

        /**
         * Set auth
         **/
        public void setAuth(BasicAuth auth) {
            this.auth = auth;
        }

        public GerritEventSourceQueryParam auth(BasicAuth auth) {
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

        public GerritEventSourceQueryParam deleteHookOnFinish(Boolean deleteHookOnFinish) {
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

        public GerritEventSourceQueryParam events(List<String> events) {
            this.events = events;
            return this;
        }
        public GerritEventSourceQueryParam addEventsItem(String eventsItem) {
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

        public GerritEventSourceQueryParam filter(EventSourceFilter filter) {
            this.filter = filter;
            return this;
        }

        /**
        * Get gerritBaseURL
        * @return gerritBaseURL
        **/
        @JsonProperty("gerritBaseURL")
        public String getGerritBaseURL() {
            return gerritBaseURL;
        }

        /**
         * Set gerritBaseURL
         **/
        public void setGerritBaseURL(String gerritBaseURL) {
            this.gerritBaseURL = gerritBaseURL;
        }

        public GerritEventSourceQueryParam gerritBaseURL(String gerritBaseURL) {
            this.gerritBaseURL = gerritBaseURL;
            return this;
        }

        /**
        * Get hookName
        * @return hookName
        **/
        @JsonProperty("hookName")
        public String getHookName() {
            return hookName;
        }

        /**
         * Set hookName
         **/
        public void setHookName(String hookName) {
            this.hookName = hookName;
        }

        public GerritEventSourceQueryParam hookName(String hookName) {
            this.hookName = hookName;
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

        public GerritEventSourceQueryParam metadata(Map<String, String> metadata) {
            this.metadata = metadata;
            return this;
        }
        public GerritEventSourceQueryParam putMetadataItem(String key, String metadataItem) {
            this.metadata.put(key, metadataItem);
            return this;
        }

        /**
        * List of project namespace paths like \"whynowy/test\".
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

        public GerritEventSourceQueryParam projects(List<String> projects) {
            this.projects = projects;
            return this;
        }
        public GerritEventSourceQueryParam addProjectsItem(String projectsItem) {
            this.projects.add(projectsItem);
            return this;
        }

        /**
        * Get sslVerify
        * @return sslVerify
        **/
        @JsonProperty("sslVerify")
        public Boolean getSslVerify() {
            return sslVerify;
        }

        /**
         * Set sslVerify
         **/
        public void setSslVerify(Boolean sslVerify) {
            this.sslVerify = sslVerify;
        }

        public GerritEventSourceQueryParam sslVerify(Boolean sslVerify) {
            this.sslVerify = sslVerify;
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

        public GerritEventSourceQueryParam webhook(WebhookContext webhook) {
            this.webhook = webhook;
            return this;
        }

        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class GerritEventSourceQueryParam {\n");

            sb.append("    auth: ").append(toIndentedString(auth)).append("\n");
            sb.append("    deleteHookOnFinish: ").append(toIndentedString(deleteHookOnFinish)).append("\n");
            sb.append("    events: ").append(toIndentedString(events)).append("\n");
            sb.append("    filter: ").append(toIndentedString(filter)).append("\n");
            sb.append("    gerritBaseURL: ").append(toIndentedString(gerritBaseURL)).append("\n");
            sb.append("    hookName: ").append(toIndentedString(hookName)).append("\n");
            sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
            sb.append("    projects: ").append(toIndentedString(projects)).append("\n");
            sb.append("    sslVerify: ").append(toIndentedString(sslVerify)).append("\n");
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
