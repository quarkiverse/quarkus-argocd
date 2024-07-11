package io.quarkiverse.argocd.workflow.v1alpha1;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.fabric8.kubernetes.api.model.SecretKeySelector;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.Type;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
/**
  * OAuth2Auth holds all information for client authentication via OAuth2 tokens
 **/
public class OAuth2Auth  {

    /**
      * OAuth2Auth holds all information for client authentication via OAuth2 tokens
     **/
    private SecretKeySelector clientIDSecret;
    /**
      * OAuth2Auth holds all information for client authentication via OAuth2 tokens
     **/
    private SecretKeySelector clientSecretSecret;
    /**
      * OAuth2Auth holds all information for client authentication via OAuth2 tokens
     **/
    private List<OAuth2EndpointParam> endpointParams;
    /**
      * OAuth2Auth holds all information for client authentication via OAuth2 tokens
     **/
    private List<String> scopes;
    /**
      * OAuth2Auth holds all information for client authentication via OAuth2 tokens
     **/
    private SecretKeySelector tokenURLSecret;

    /**
    * Get clientIDSecret
    * @return clientIDSecret
    **/
    @JsonProperty("clientIDSecret")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public SecretKeySelector getClientIDSecret() {
        return clientIDSecret;
    }

    /**
     * Set clientIDSecret
     **/
    public void setClientIDSecret(SecretKeySelector clientIDSecret) {
        this.clientIDSecret = clientIDSecret;
    }

    public OAuth2Auth clientIDSecret(SecretKeySelector clientIDSecret) {
        this.clientIDSecret = clientIDSecret;
        return this;
    }

    /**
    * Get clientSecretSecret
    * @return clientSecretSecret
    **/
    @JsonProperty("clientSecretSecret")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public SecretKeySelector getClientSecretSecret() {
        return clientSecretSecret;
    }

    /**
     * Set clientSecretSecret
     **/
    public void setClientSecretSecret(SecretKeySelector clientSecretSecret) {
        this.clientSecretSecret = clientSecretSecret;
    }

    public OAuth2Auth clientSecretSecret(SecretKeySelector clientSecretSecret) {
        this.clientSecretSecret = clientSecretSecret;
        return this;
    }

    /**
    * Get endpointParams
    * @return endpointParams
    **/
    @JsonProperty("endpointParams")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public List<OAuth2EndpointParam> getEndpointParams() {
        return endpointParams;
    }

    /**
     * Set endpointParams
     **/
    public void setEndpointParams(List<OAuth2EndpointParam> endpointParams) {
        this.endpointParams = endpointParams;
    }

    public OAuth2Auth endpointParams(List<OAuth2EndpointParam> endpointParams) {
        this.endpointParams = endpointParams;
        return this;
    }
    public OAuth2Auth addEndpointParamsItem(OAuth2EndpointParam endpointParamsItem) {
        if (this.endpointParams == null){
            endpointParams = new ArrayList<>();
        }
        this.endpointParams.add(endpointParamsItem);
        return this;
    }

    /**
    * Get scopes
    * @return scopes
    **/
    @JsonProperty("scopes")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public List<String> getScopes() {
        return scopes;
    }

    /**
     * Set scopes
     **/
    public void setScopes(List<String> scopes) {
        this.scopes = scopes;
    }

    public OAuth2Auth scopes(List<String> scopes) {
        this.scopes = scopes;
        return this;
    }
    public OAuth2Auth addScopesItem(String scopesItem) {
        if (this.scopes == null){
            scopes = new ArrayList<>();
        }
        this.scopes.add(scopesItem);
        return this;
    }

    /**
    * Get tokenURLSecret
    * @return tokenURLSecret
    **/
    @JsonProperty("tokenURLSecret")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public SecretKeySelector getTokenURLSecret() {
        return tokenURLSecret;
    }

    /**
     * Set tokenURLSecret
     **/
    public void setTokenURLSecret(SecretKeySelector tokenURLSecret) {
        this.tokenURLSecret = tokenURLSecret;
    }

    public OAuth2Auth tokenURLSecret(SecretKeySelector tokenURLSecret) {
        this.tokenURLSecret = tokenURLSecret;
        return this;
    }

    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OAuth2Auth {\n");

        sb.append("    clientIDSecret: ").append(toIndentedString(clientIDSecret)).append("\n");
        sb.append("    clientSecretSecret: ").append(toIndentedString(clientSecretSecret)).append("\n");
        sb.append("    endpointParams: ").append(toIndentedString(endpointParams)).append("\n");
        sb.append("    scopes: ").append(toIndentedString(scopes)).append("\n");
        sb.append("    tokenURLSecret: ").append(toIndentedString(tokenURLSecret)).append("\n");
        
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
      * OAuth2Auth holds all information for client authentication via OAuth2 tokens
     **/
    public static class OAuth2AuthQueryParam  {

        /**
          * OAuth2Auth holds all information for client authentication via OAuth2 tokens
         **/
        @jakarta.ws.rs.QueryParam("clientIDSecret")
        private SecretKeySelector clientIDSecret;
        /**
          * OAuth2Auth holds all information for client authentication via OAuth2 tokens
         **/
        @jakarta.ws.rs.QueryParam("clientSecretSecret")
        private SecretKeySelector clientSecretSecret;
        /**
          * OAuth2Auth holds all information for client authentication via OAuth2 tokens
         **/
        @jakarta.ws.rs.QueryParam("endpointParams")
        private List<OAuth2EndpointParam> endpointParams = null;
        /**
          * OAuth2Auth holds all information for client authentication via OAuth2 tokens
         **/
        @jakarta.ws.rs.QueryParam("scopes")
        private List<String> scopes = null;
        /**
          * OAuth2Auth holds all information for client authentication via OAuth2 tokens
         **/
        @jakarta.ws.rs.QueryParam("tokenURLSecret")
        private SecretKeySelector tokenURLSecret;

        /**
        * Get clientIDSecret
        * @return clientIDSecret
        **/
        @JsonProperty("clientIDSecret")
        public SecretKeySelector getClientIDSecret() {
            return clientIDSecret;
        }

        /**
         * Set clientIDSecret
         **/
        public void setClientIDSecret(SecretKeySelector clientIDSecret) {
            this.clientIDSecret = clientIDSecret;
        }

        public OAuth2AuthQueryParam clientIDSecret(SecretKeySelector clientIDSecret) {
            this.clientIDSecret = clientIDSecret;
            return this;
        }

        /**
        * Get clientSecretSecret
        * @return clientSecretSecret
        **/
        @JsonProperty("clientSecretSecret")
        public SecretKeySelector getClientSecretSecret() {
            return clientSecretSecret;
        }

        /**
         * Set clientSecretSecret
         **/
        public void setClientSecretSecret(SecretKeySelector clientSecretSecret) {
            this.clientSecretSecret = clientSecretSecret;
        }

        public OAuth2AuthQueryParam clientSecretSecret(SecretKeySelector clientSecretSecret) {
            this.clientSecretSecret = clientSecretSecret;
            return this;
        }

        /**
        * Get endpointParams
        * @return endpointParams
        **/
        @JsonProperty("endpointParams")
        public List<OAuth2EndpointParam> getEndpointParams() {
            return endpointParams;
        }

        /**
         * Set endpointParams
         **/
        public void setEndpointParams(List<OAuth2EndpointParam> endpointParams) {
            this.endpointParams = endpointParams;
        }

        public OAuth2AuthQueryParam endpointParams(List<OAuth2EndpointParam> endpointParams) {
            this.endpointParams = endpointParams;
            return this;
        }
        public OAuth2AuthQueryParam addEndpointParamsItem(OAuth2EndpointParam endpointParamsItem) {
            this.endpointParams.add(endpointParamsItem);
            return this;
        }

        /**
        * Get scopes
        * @return scopes
        **/
        @JsonProperty("scopes")
        public List<String> getScopes() {
            return scopes;
        }

        /**
         * Set scopes
         **/
        public void setScopes(List<String> scopes) {
            this.scopes = scopes;
        }

        public OAuth2AuthQueryParam scopes(List<String> scopes) {
            this.scopes = scopes;
            return this;
        }
        public OAuth2AuthQueryParam addScopesItem(String scopesItem) {
            this.scopes.add(scopesItem);
            return this;
        }

        /**
        * Get tokenURLSecret
        * @return tokenURLSecret
        **/
        @JsonProperty("tokenURLSecret")
        public SecretKeySelector getTokenURLSecret() {
            return tokenURLSecret;
        }

        /**
         * Set tokenURLSecret
         **/
        public void setTokenURLSecret(SecretKeySelector tokenURLSecret) {
            this.tokenURLSecret = tokenURLSecret;
        }

        public OAuth2AuthQueryParam tokenURLSecret(SecretKeySelector tokenURLSecret) {
            this.tokenURLSecret = tokenURLSecret;
            return this;
        }

        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class OAuth2AuthQueryParam {\n");

            sb.append("    clientIDSecret: ").append(toIndentedString(clientIDSecret)).append("\n");
            sb.append("    clientSecretSecret: ").append(toIndentedString(clientSecretSecret)).append("\n");
            sb.append("    endpointParams: ").append(toIndentedString(endpointParams)).append("\n");
            sb.append("    scopes: ").append(toIndentedString(scopes)).append("\n");
            sb.append("    tokenURLSecret: ").append(toIndentedString(tokenURLSecret)).append("\n");
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
