package io.quarkiverse.argocd.events.v1alpha1;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;

import io.fabric8.kubernetes.api.model.SecretKeySelector;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.Type;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class WebhookContext  {

    private SecretKeySelector authSecret;
    private String endpoint;
    private String maxPayloadSize;
    private Map<String, String> metadata;
    private String method;
    private String port;
    private SecretKeySelector serverCertSecret;
    private SecretKeySelector serverKeySecret;
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

    public WebhookContext authSecret(SecretKeySelector authSecret) {
        this.authSecret = authSecret;
        return this;
    }

    /**
    * Get endpoint
    * @return endpoint
    **/
    @JsonProperty("endpoint")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public String getEndpoint() {
        return endpoint;
    }

    /**
     * Set endpoint
     **/
    public void setEndpoint(String endpoint) {
        this.endpoint = endpoint;
    }

    public WebhookContext endpoint(String endpoint) {
        this.endpoint = endpoint;
        return this;
    }

    /**
    * Get maxPayloadSize
    * @return maxPayloadSize
    **/
    @JsonProperty("maxPayloadSize")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public String getMaxPayloadSize() {
        return maxPayloadSize;
    }

    /**
     * Set maxPayloadSize
     **/
    public void setMaxPayloadSize(String maxPayloadSize) {
        this.maxPayloadSize = maxPayloadSize;
    }

    public WebhookContext maxPayloadSize(String maxPayloadSize) {
        this.maxPayloadSize = maxPayloadSize;
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

    public WebhookContext metadata(Map<String, String> metadata) {
        this.metadata = metadata;
        return this;
    }
    public WebhookContext putMetadataItem(String key, String metadataItem) {
           if (this.metadata == null){
                metadata = new HashMap<>();
            }
        this.metadata.put(key, metadataItem);
        return this;
    }

    /**
    * Get method
    * @return method
    **/
    @JsonProperty("method")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public String getMethod() {
        return method;
    }

    /**
     * Set method
     **/
    public void setMethod(String method) {
        this.method = method;
    }

    public WebhookContext method(String method) {
        this.method = method;
        return this;
    }

    /**
    * Port on which HTTP server is listening for incoming events.
    * @return port
    **/
    @JsonProperty("port")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public String getPort() {
        return port;
    }

    /**
     * Set port
     **/
    public void setPort(String port) {
        this.port = port;
    }

    public WebhookContext port(String port) {
        this.port = port;
        return this;
    }

    /**
    * Get serverCertSecret
    * @return serverCertSecret
    **/
    @JsonProperty("serverCertSecret")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public SecretKeySelector getServerCertSecret() {
        return serverCertSecret;
    }

    /**
     * Set serverCertSecret
     **/
    public void setServerCertSecret(SecretKeySelector serverCertSecret) {
        this.serverCertSecret = serverCertSecret;
    }

    public WebhookContext serverCertSecret(SecretKeySelector serverCertSecret) {
        this.serverCertSecret = serverCertSecret;
        return this;
    }

    /**
    * Get serverKeySecret
    * @return serverKeySecret
    **/
    @JsonProperty("serverKeySecret")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public SecretKeySelector getServerKeySecret() {
        return serverKeySecret;
    }

    /**
     * Set serverKeySecret
     **/
    public void setServerKeySecret(SecretKeySelector serverKeySecret) {
        this.serverKeySecret = serverKeySecret;
    }

    public WebhookContext serverKeySecret(SecretKeySelector serverKeySecret) {
        this.serverKeySecret = serverKeySecret;
        return this;
    }

    /**
    * URL is the url of the server.
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

    public WebhookContext url(String url) {
        this.url = url;
        return this;
    }

    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class WebhookContext {\n");

        sb.append("    authSecret: ").append(toIndentedString(authSecret)).append("\n");
        sb.append("    endpoint: ").append(toIndentedString(endpoint)).append("\n");
        sb.append("    maxPayloadSize: ").append(toIndentedString(maxPayloadSize)).append("\n");
        sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
        sb.append("    method: ").append(toIndentedString(method)).append("\n");
        sb.append("    port: ").append(toIndentedString(port)).append("\n");
        sb.append("    serverCertSecret: ").append(toIndentedString(serverCertSecret)).append("\n");
        sb.append("    serverKeySecret: ").append(toIndentedString(serverKeySecret)).append("\n");
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
    public static class WebhookContextQueryParam  {

        @jakarta.ws.rs.QueryParam("authSecret")
        private SecretKeySelector authSecret;
        @jakarta.ws.rs.QueryParam("endpoint")
        private String endpoint;
        @jakarta.ws.rs.QueryParam("maxPayloadSize")
        private String maxPayloadSize;
        @jakarta.ws.rs.QueryParam("metadata")
        private Map<String, String> metadata = null;
        @jakarta.ws.rs.QueryParam("method")
        private String method;
        @jakarta.ws.rs.QueryParam("port")
        private String port;
        @jakarta.ws.rs.QueryParam("serverCertSecret")
        private SecretKeySelector serverCertSecret;
        @jakarta.ws.rs.QueryParam("serverKeySecret")
        private SecretKeySelector serverKeySecret;
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

        public WebhookContextQueryParam authSecret(SecretKeySelector authSecret) {
            this.authSecret = authSecret;
            return this;
        }

        /**
        * Get endpoint
        * @return endpoint
        **/
        @JsonProperty("endpoint")
        public String getEndpoint() {
            return endpoint;
        }

        /**
         * Set endpoint
         **/
        public void setEndpoint(String endpoint) {
            this.endpoint = endpoint;
        }

        public WebhookContextQueryParam endpoint(String endpoint) {
            this.endpoint = endpoint;
            return this;
        }

        /**
        * Get maxPayloadSize
        * @return maxPayloadSize
        **/
        @JsonProperty("maxPayloadSize")
        public String getMaxPayloadSize() {
            return maxPayloadSize;
        }

        /**
         * Set maxPayloadSize
         **/
        public void setMaxPayloadSize(String maxPayloadSize) {
            this.maxPayloadSize = maxPayloadSize;
        }

        public WebhookContextQueryParam maxPayloadSize(String maxPayloadSize) {
            this.maxPayloadSize = maxPayloadSize;
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

        public WebhookContextQueryParam metadata(Map<String, String> metadata) {
            this.metadata = metadata;
            return this;
        }
        public WebhookContextQueryParam putMetadataItem(String key, String metadataItem) {
            this.metadata.put(key, metadataItem);
            return this;
        }

        /**
        * Get method
        * @return method
        **/
        @JsonProperty("method")
        public String getMethod() {
            return method;
        }

        /**
         * Set method
         **/
        public void setMethod(String method) {
            this.method = method;
        }

        public WebhookContextQueryParam method(String method) {
            this.method = method;
            return this;
        }

        /**
        * Port on which HTTP server is listening for incoming events.
        * @return port
        **/
        @JsonProperty("port")
        public String getPort() {
            return port;
        }

        /**
         * Set port
         **/
        public void setPort(String port) {
            this.port = port;
        }

        public WebhookContextQueryParam port(String port) {
            this.port = port;
            return this;
        }

        /**
        * Get serverCertSecret
        * @return serverCertSecret
        **/
        @JsonProperty("serverCertSecret")
        public SecretKeySelector getServerCertSecret() {
            return serverCertSecret;
        }

        /**
         * Set serverCertSecret
         **/
        public void setServerCertSecret(SecretKeySelector serverCertSecret) {
            this.serverCertSecret = serverCertSecret;
        }

        public WebhookContextQueryParam serverCertSecret(SecretKeySelector serverCertSecret) {
            this.serverCertSecret = serverCertSecret;
            return this;
        }

        /**
        * Get serverKeySecret
        * @return serverKeySecret
        **/
        @JsonProperty("serverKeySecret")
        public SecretKeySelector getServerKeySecret() {
            return serverKeySecret;
        }

        /**
         * Set serverKeySecret
         **/
        public void setServerKeySecret(SecretKeySelector serverKeySecret) {
            this.serverKeySecret = serverKeySecret;
        }

        public WebhookContextQueryParam serverKeySecret(SecretKeySelector serverKeySecret) {
            this.serverKeySecret = serverKeySecret;
            return this;
        }

        /**
        * URL is the url of the server.
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

        public WebhookContextQueryParam url(String url) {
            this.url = url;
            return this;
        }

        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class WebhookContextQueryParam {\n");

            sb.append("    authSecret: ").append(toIndentedString(authSecret)).append("\n");
            sb.append("    endpoint: ").append(toIndentedString(endpoint)).append("\n");
            sb.append("    maxPayloadSize: ").append(toIndentedString(maxPayloadSize)).append("\n");
            sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
            sb.append("    method: ").append(toIndentedString(method)).append("\n");
            sb.append("    port: ").append(toIndentedString(port)).append("\n");
            sb.append("    serverCertSecret: ").append(toIndentedString(serverCertSecret)).append("\n");
            sb.append("    serverKeySecret: ").append(toIndentedString(serverKeySecret)).append("\n");
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
