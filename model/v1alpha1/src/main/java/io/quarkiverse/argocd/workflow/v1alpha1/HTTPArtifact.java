package io.quarkiverse.argocd.workflow.v1alpha1;

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
/**
  * HTTPArtifact allows a file served on HTTP to be placed as an input artifact in a container
 **/
public class HTTPArtifact  {

    /**
      * HTTPArtifact allows a file served on HTTP to be placed as an input artifact in a container
     **/
    private HTTPAuth auth;
    /**
      * HTTPArtifact allows a file served on HTTP to be placed as an input artifact in a container
     **/
    private List<Header> headers;
    /**
      * HTTPArtifact allows a file served on HTTP to be placed as an input artifact in a container
     **/
    private String url;

    /**
    * Get auth
    * @return auth
    **/
    @JsonProperty("auth")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public HTTPAuth getAuth() {
        return auth;
    }

    /**
     * Set auth
     **/
    public void setAuth(HTTPAuth auth) {
        this.auth = auth;
    }

    public HTTPArtifact auth(HTTPAuth auth) {
        this.auth = auth;
        return this;
    }

    /**
    * Headers are an optional list of headers to send with HTTP requests for artifacts
    * @return headers
    **/
    @JsonProperty("headers")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public List<Header> getHeaders() {
        return headers;
    }

    /**
     * Set headers
     **/
    public void setHeaders(List<Header> headers) {
        this.headers = headers;
    }

    public HTTPArtifact headers(List<Header> headers) {
        this.headers = headers;
        return this;
    }
    public HTTPArtifact addHeadersItem(Header headersItem) {
        if (this.headers == null){
            headers = new ArrayList<>();
        }
        this.headers.add(headersItem);
        return this;
    }

    /**
    * URL of the artifact
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

    public HTTPArtifact url(String url) {
        this.url = url;
        return this;
    }

    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class HTTPArtifact {\n");

        sb.append("    auth: ").append(toIndentedString(auth)).append("\n");
        sb.append("    headers: ").append(toIndentedString(headers)).append("\n");
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
      * HTTPArtifact allows a file served on HTTP to be placed as an input artifact in a container
     **/
    public static class HTTPArtifactQueryParam  {

        /**
          * HTTPArtifact allows a file served on HTTP to be placed as an input artifact in a container
         **/
        @jakarta.ws.rs.QueryParam("auth")
        private HTTPAuth auth;
        /**
          * HTTPArtifact allows a file served on HTTP to be placed as an input artifact in a container
         **/
        @jakarta.ws.rs.QueryParam("headers")
        private List<Header> headers = null;
        /**
          * HTTPArtifact allows a file served on HTTP to be placed as an input artifact in a container
         **/
        @jakarta.ws.rs.QueryParam("url")
        private String url;

        /**
        * Get auth
        * @return auth
        **/
        @JsonProperty("auth")
        public HTTPAuth getAuth() {
            return auth;
        }

        /**
         * Set auth
         **/
        public void setAuth(HTTPAuth auth) {
            this.auth = auth;
        }

        public HTTPArtifactQueryParam auth(HTTPAuth auth) {
            this.auth = auth;
            return this;
        }

        /**
        * Headers are an optional list of headers to send with HTTP requests for artifacts
        * @return headers
        **/
        @JsonProperty("headers")
        public List<Header> getHeaders() {
            return headers;
        }

        /**
         * Set headers
         **/
        public void setHeaders(List<Header> headers) {
            this.headers = headers;
        }

        public HTTPArtifactQueryParam headers(List<Header> headers) {
            this.headers = headers;
            return this;
        }
        public HTTPArtifactQueryParam addHeadersItem(Header headersItem) {
            this.headers.add(headersItem);
            return this;
        }

        /**
        * URL of the artifact
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

        public HTTPArtifactQueryParam url(String url) {
            this.url = url;
            return this;
        }

        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class HTTPArtifactQueryParam {\n");

            sb.append("    auth: ").append(toIndentedString(auth)).append("\n");
            sb.append("    headers: ").append(toIndentedString(headers)).append("\n");
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
