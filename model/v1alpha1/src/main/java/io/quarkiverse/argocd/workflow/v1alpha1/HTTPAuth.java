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
public class HTTPAuth  {

    private BasicAuth basicAuth;
    private ClientCertAuth clientCert;
    private OAuth2Auth oauth2;

    /**
    * Get basicAuth
    * @return basicAuth
    **/
    @JsonProperty("basicAuth")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public BasicAuth getBasicAuth() {
        return basicAuth;
    }

    /**
     * Set basicAuth
     **/
    public void setBasicAuth(BasicAuth basicAuth) {
        this.basicAuth = basicAuth;
    }

    public HTTPAuth basicAuth(BasicAuth basicAuth) {
        this.basicAuth = basicAuth;
        return this;
    }

    /**
    * Get clientCert
    * @return clientCert
    **/
    @JsonProperty("clientCert")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public ClientCertAuth getClientCert() {
        return clientCert;
    }

    /**
     * Set clientCert
     **/
    public void setClientCert(ClientCertAuth clientCert) {
        this.clientCert = clientCert;
    }

    public HTTPAuth clientCert(ClientCertAuth clientCert) {
        this.clientCert = clientCert;
        return this;
    }

    /**
    * Get oauth2
    * @return oauth2
    **/
    @JsonProperty("oauth2")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public OAuth2Auth getOauth2() {
        return oauth2;
    }

    /**
     * Set oauth2
     **/
    public void setOauth2(OAuth2Auth oauth2) {
        this.oauth2 = oauth2;
    }

    public HTTPAuth oauth2(OAuth2Auth oauth2) {
        this.oauth2 = oauth2;
        return this;
    }

    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class HTTPAuth {\n");

        sb.append("    basicAuth: ").append(toIndentedString(basicAuth)).append("\n");
        sb.append("    clientCert: ").append(toIndentedString(clientCert)).append("\n");
        sb.append("    oauth2: ").append(toIndentedString(oauth2)).append("\n");
        
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
    public static class HTTPAuthQueryParam  {

        @jakarta.ws.rs.QueryParam("basicAuth")
        private BasicAuth basicAuth;
        @jakarta.ws.rs.QueryParam("clientCert")
        private ClientCertAuth clientCert;
        @jakarta.ws.rs.QueryParam("oauth2")
        private OAuth2Auth oauth2;

        /**
        * Get basicAuth
        * @return basicAuth
        **/
        @JsonProperty("basicAuth")
        public BasicAuth getBasicAuth() {
            return basicAuth;
        }

        /**
         * Set basicAuth
         **/
        public void setBasicAuth(BasicAuth basicAuth) {
            this.basicAuth = basicAuth;
        }

        public HTTPAuthQueryParam basicAuth(BasicAuth basicAuth) {
            this.basicAuth = basicAuth;
            return this;
        }

        /**
        * Get clientCert
        * @return clientCert
        **/
        @JsonProperty("clientCert")
        public ClientCertAuth getClientCert() {
            return clientCert;
        }

        /**
         * Set clientCert
         **/
        public void setClientCert(ClientCertAuth clientCert) {
            this.clientCert = clientCert;
        }

        public HTTPAuthQueryParam clientCert(ClientCertAuth clientCert) {
            this.clientCert = clientCert;
            return this;
        }

        /**
        * Get oauth2
        * @return oauth2
        **/
        @JsonProperty("oauth2")
        public OAuth2Auth getOauth2() {
            return oauth2;
        }

        /**
         * Set oauth2
         **/
        public void setOauth2(OAuth2Auth oauth2) {
            this.oauth2 = oauth2;
        }

        public HTTPAuthQueryParam oauth2(OAuth2Auth oauth2) {
            this.oauth2 = oauth2;
            return this;
        }

        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class HTTPAuthQueryParam {\n");

            sb.append("    basicAuth: ").append(toIndentedString(basicAuth)).append("\n");
            sb.append("    clientCert: ").append(toIndentedString(clientCert)).append("\n");
            sb.append("    oauth2: ").append(toIndentedString(oauth2)).append("\n");
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
