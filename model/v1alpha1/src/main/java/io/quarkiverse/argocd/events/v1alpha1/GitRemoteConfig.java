package io.quarkiverse.argocd.events.v1alpha1;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.Type;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class GitRemoteConfig  {

    private String name;
    private List<String> urls;

    /**
    * Name of the remote to fetch from.
    * @return name
    **/
    @JsonProperty("name")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public String getName() {
        return name;
    }

    /**
     * Set name
     **/
    public void setName(String name) {
        this.name = name;
    }

    public GitRemoteConfig name(String name) {
        this.name = name;
        return this;
    }

    /**
    * URLs the URLs of a remote repository. It must be non-empty. Fetch will always use the first URL, while push will use all of them.
    * @return urls
    **/
    @JsonProperty("urls")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public List<String> getUrls() {
        return urls;
    }

    /**
     * Set urls
     **/
    public void setUrls(List<String> urls) {
        this.urls = urls;
    }

    public GitRemoteConfig urls(List<String> urls) {
        this.urls = urls;
        return this;
    }
    public GitRemoteConfig addUrlsItem(String urlsItem) {
        if (this.urls == null){
            urls = new ArrayList<>();
        }
        this.urls.add(urlsItem);
        return this;
    }

    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GitRemoteConfig {\n");

        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    urls: ").append(toIndentedString(urls)).append("\n");
        
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
    public static class GitRemoteConfigQueryParam  {

        @jakarta.ws.rs.QueryParam("name")
        private String name;
        @jakarta.ws.rs.QueryParam("urls")
        private List<String> urls = null;

        /**
        * Name of the remote to fetch from.
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

        public GitRemoteConfigQueryParam name(String name) {
            this.name = name;
            return this;
        }

        /**
        * URLs the URLs of a remote repository. It must be non-empty. Fetch will always use the first URL, while push will use all of them.
        * @return urls
        **/
        @JsonProperty("urls")
        public List<String> getUrls() {
            return urls;
        }

        /**
         * Set urls
         **/
        public void setUrls(List<String> urls) {
            this.urls = urls;
        }

        public GitRemoteConfigQueryParam urls(List<String> urls) {
            this.urls = urls;
            return this;
        }
        public GitRemoteConfigQueryParam addUrlsItem(String urlsItem) {
            this.urls.add(urlsItem);
            return this;
        }

        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class GitRemoteConfigQueryParam {\n");

            sb.append("    name: ").append(toIndentedString(name)).append("\n");
            sb.append("    urls: ").append(toIndentedString(urls)).append("\n");
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
