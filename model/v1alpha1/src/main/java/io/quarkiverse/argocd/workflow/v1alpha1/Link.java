package io.quarkiverse.argocd.workflow.v1alpha1;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.Type;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
/**
  * A link to another app.
 **/
public class Link  {

    /**
      * A link to another app.
     **/
    private String name;
    /**
      * A link to another app.
     **/
    private String scope;
    /**
      * A link to another app.
     **/
    private String url;

    /**
    * The name of the link, E.g. \"Workflow Logs\" or \"Pod Logs\"
    * @return name
    **/
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    /**
     * Set name
     **/
    public void setName(String name) {
        this.name = name;
    }

    public Link name(String name) {
        this.name = name;
        return this;
    }

    /**
    * \"workflow\", \"pod\", \"pod-logs\", \"event-source-logs\", \"sensor-logs\", \"workflow-list\" or \"chat\"
    * @return scope
    **/
    @JsonProperty("scope")
    public String getScope() {
        return scope;
    }

    /**
     * Set scope
     **/
    public void setScope(String scope) {
        this.scope = scope;
    }

    public Link scope(String scope) {
        this.scope = scope;
        return this;
    }

    /**
    * The URL. Can contain \"${metadata.namespace}\", \"${metadata.name}\", \"${status.startedAt}\", \"${status.finishedAt}\" or any other element in workflow yaml, e.g. \"${io.argoproj.workflow.v1alpha1.metadata.annotations.userDefinedKey}\"
    * @return url
    **/
    @JsonProperty("url")
    public String getUrl() {
        return url;
    }

    /**
     * Set url
     **/
    public void setUrl(String url) {
        this.url = url;
    }

    public Link url(String url) {
        this.url = url;
        return this;
    }

    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Link {\n");

        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    scope: ").append(toIndentedString(scope)).append("\n");
        sb.append("    url: ").append(toIndentedString(url)).append("\n");
        
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
      * A link to another app.
     **/
    public static class LinkQueryParam  {

        /**
          * A link to another app.
         **/
        @jakarta.ws.rs.QueryParam("name")
        private String name;
        /**
          * A link to another app.
         **/
        @jakarta.ws.rs.QueryParam("scope")
        private String scope;
        /**
          * A link to another app.
         **/
        @jakarta.ws.rs.QueryParam("url")
        private String url;

        /**
        * The name of the link, E.g. \"Workflow Logs\" or \"Pod Logs\"
        * @return name
        **/
        @JsonProperty("name")
        public String getName() {
            return name;
        }

        /**
         * Set name
         **/
        public void setName(String name) {
            this.name = name;
        }

        public LinkQueryParam name(String name) {
            this.name = name;
            return this;
        }

        /**
        * \"workflow\", \"pod\", \"pod-logs\", \"event-source-logs\", \"sensor-logs\", \"workflow-list\" or \"chat\"
        * @return scope
        **/
        @JsonProperty("scope")
        public String getScope() {
            return scope;
        }

        /**
         * Set scope
         **/
        public void setScope(String scope) {
            this.scope = scope;
        }

        public LinkQueryParam scope(String scope) {
            this.scope = scope;
            return this;
        }

        /**
        * The URL. Can contain \"${metadata.namespace}\", \"${metadata.name}\", \"${status.startedAt}\", \"${status.finishedAt}\" or any other element in workflow yaml, e.g. \"${io.argoproj.workflow.v1alpha1.metadata.annotations.userDefinedKey}\"
        * @return url
        **/
        @JsonProperty("url")
        public String getUrl() {
            return url;
        }

        /**
         * Set url
         **/
        public void setUrl(String url) {
            this.url = url;
        }

        public LinkQueryParam url(String url) {
            this.url = url;
            return this;
        }

        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class LinkQueryParam {\n");

            sb.append("    name: ").append(toIndentedString(name)).append("\n");
            sb.append("    scope: ").append(toIndentedString(scope)).append("\n");
            sb.append("    url: ").append(toIndentedString(url)).append("\n");
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