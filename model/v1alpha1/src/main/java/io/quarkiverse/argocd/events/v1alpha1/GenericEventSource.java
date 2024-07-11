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
  * GenericEventSource refers to a generic event source. It can be used to implement a custom event source.
 **/
public class GenericEventSource  {

    /**
      * GenericEventSource refers to a generic event source. It can be used to implement a custom event source.
     **/
    private SecretKeySelector authSecret;
    /**
      * GenericEventSource refers to a generic event source. It can be used to implement a custom event source.
     **/
    private String config;
    /**
      * GenericEventSource refers to a generic event source. It can be used to implement a custom event source.
     **/
    private EventSourceFilter filter;
    /**
      * GenericEventSource refers to a generic event source. It can be used to implement a custom event source.
     **/
    private Boolean insecure;
    /**
      * GenericEventSource refers to a generic event source. It can be used to implement a custom event source.
     **/
    private Boolean jsonBody;
    /**
      * GenericEventSource refers to a generic event source. It can be used to implement a custom event source.
     **/
    private Map<String, String> metadata;
    /**
      * GenericEventSource refers to a generic event source. It can be used to implement a custom event source.
     **/
    private String url;

    /**
    * Get authSecret
    * @return authSecret
    **/
    @JsonProperty("authSecret")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public SecretKeySelector getAuthSecret() {
        return authSecret;
    }

    /**
     * Set authSecret
     **/
    public void setAuthSecret(SecretKeySelector authSecret) {
        this.authSecret = authSecret;
    }

    public GenericEventSource authSecret(SecretKeySelector authSecret) {
        this.authSecret = authSecret;
        return this;
    }

    /**
    * Get config
    * @return config
    **/
    @JsonProperty("config")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public String getConfig() {
        return config;
    }

    /**
     * Set config
     **/
    public void setConfig(String config) {
        this.config = config;
    }

    public GenericEventSource config(String config) {
        this.config = config;
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

    public GenericEventSource filter(EventSourceFilter filter) {
        this.filter = filter;
        return this;
    }

    /**
    * Insecure determines the type of connection.
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

    public GenericEventSource insecure(Boolean insecure) {
        this.insecure = insecure;
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

    public GenericEventSource jsonBody(Boolean jsonBody) {
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

    public GenericEventSource metadata(Map<String, String> metadata) {
        this.metadata = metadata;
        return this;
    }
    public GenericEventSource putMetadataItem(String key, String metadataItem) {
           if (this.metadata == null){
                metadata = new HashMap<>();
            }
        this.metadata.put(key, metadataItem);
        return this;
    }

    /**
    * URL of the gRPC server that implements the event source.
    * @return url
    **/
    @JsonProperty("url")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public String getUrl() {
        return url;
    }

    /**
     * Set url
     **/
    public void setUrl(String url) {
        this.url = url;
    }

    public GenericEventSource url(String url) {
        this.url = url;
        return this;
    }

    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GenericEventSource {\n");

        sb.append("    authSecret: ").append(toIndentedString(authSecret)).append("\n");
        sb.append("    config: ").append(toIndentedString(config)).append("\n");
        sb.append("    filter: ").append(toIndentedString(filter)).append("\n");
        sb.append("    insecure: ").append(toIndentedString(insecure)).append("\n");
        sb.append("    jsonBody: ").append(toIndentedString(jsonBody)).append("\n");
        sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
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
      * GenericEventSource refers to a generic event source. It can be used to implement a custom event source.
     **/
    public static class GenericEventSourceQueryParam  {

        /**
          * GenericEventSource refers to a generic event source. It can be used to implement a custom event source.
         **/
        @jakarta.ws.rs.QueryParam("authSecret")
        private SecretKeySelector authSecret;
        /**
          * GenericEventSource refers to a generic event source. It can be used to implement a custom event source.
         **/
        @jakarta.ws.rs.QueryParam("config")
        private String config;
        /**
          * GenericEventSource refers to a generic event source. It can be used to implement a custom event source.
         **/
        @jakarta.ws.rs.QueryParam("filter")
        private EventSourceFilter filter;
        /**
          * GenericEventSource refers to a generic event source. It can be used to implement a custom event source.
         **/
        @jakarta.ws.rs.QueryParam("insecure")
        private Boolean insecure;
        /**
          * GenericEventSource refers to a generic event source. It can be used to implement a custom event source.
         **/
        @jakarta.ws.rs.QueryParam("jsonBody")
        private Boolean jsonBody;
        /**
          * GenericEventSource refers to a generic event source. It can be used to implement a custom event source.
         **/
        @jakarta.ws.rs.QueryParam("metadata")
        private Map<String, String> metadata = null;
        /**
          * GenericEventSource refers to a generic event source. It can be used to implement a custom event source.
         **/
        @jakarta.ws.rs.QueryParam("url")
        private String url;

        /**
        * Get authSecret
        * @return authSecret
        **/
        @JsonProperty("authSecret")
        public SecretKeySelector getAuthSecret() {
            return authSecret;
        }

        /**
         * Set authSecret
         **/
        public void setAuthSecret(SecretKeySelector authSecret) {
            this.authSecret = authSecret;
        }

        public GenericEventSourceQueryParam authSecret(SecretKeySelector authSecret) {
            this.authSecret = authSecret;
            return this;
        }

        /**
        * Get config
        * @return config
        **/
        @JsonProperty("config")
        public String getConfig() {
            return config;
        }

        /**
         * Set config
         **/
        public void setConfig(String config) {
            this.config = config;
        }

        public GenericEventSourceQueryParam config(String config) {
            this.config = config;
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

        public GenericEventSourceQueryParam filter(EventSourceFilter filter) {
            this.filter = filter;
            return this;
        }

        /**
        * Insecure determines the type of connection.
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

        public GenericEventSourceQueryParam insecure(Boolean insecure) {
            this.insecure = insecure;
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

        public GenericEventSourceQueryParam jsonBody(Boolean jsonBody) {
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

        public GenericEventSourceQueryParam metadata(Map<String, String> metadata) {
            this.metadata = metadata;
            return this;
        }
        public GenericEventSourceQueryParam putMetadataItem(String key, String metadataItem) {
            this.metadata.put(key, metadataItem);
            return this;
        }

        /**
        * URL of the gRPC server that implements the event source.
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

        public GenericEventSourceQueryParam url(String url) {
            this.url = url;
            return this;
        }

        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class GenericEventSourceQueryParam {\n");

            sb.append("    authSecret: ").append(toIndentedString(authSecret)).append("\n");
            sb.append("    config: ").append(toIndentedString(config)).append("\n");
            sb.append("    filter: ").append(toIndentedString(filter)).append("\n");
            sb.append("    insecure: ").append(toIndentedString(insecure)).append("\n");
            sb.append("    jsonBody: ").append(toIndentedString(jsonBody)).append("\n");
            sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
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
