package io.quarkiverse.argocd.workflow.v1alpha1;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.fabric8.kubernetes.api.model.SecretKeySelector;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.Type;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
/**
  * BasicAuth describes the secret selectors required for basic authentication
 **/
public class BasicAuth  {

    /**
      * BasicAuth describes the secret selectors required for basic authentication
     **/
    private SecretKeySelector passwordSecret;
    /**
      * BasicAuth describes the secret selectors required for basic authentication
     **/
    private SecretKeySelector usernameSecret;

    /**
    * Get passwordSecret
    * @return passwordSecret
    **/
    @JsonProperty("passwordSecret")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public SecretKeySelector getPasswordSecret() {
        return passwordSecret;
    }

    /**
     * Set passwordSecret
     **/
    public void setPasswordSecret(SecretKeySelector passwordSecret) {
        this.passwordSecret = passwordSecret;
    }

    public BasicAuth passwordSecret(SecretKeySelector passwordSecret) {
        this.passwordSecret = passwordSecret;
        return this;
    }

    /**
    * Get usernameSecret
    * @return usernameSecret
    **/
    @JsonProperty("usernameSecret")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public SecretKeySelector getUsernameSecret() {
        return usernameSecret;
    }

    /**
     * Set usernameSecret
     **/
    public void setUsernameSecret(SecretKeySelector usernameSecret) {
        this.usernameSecret = usernameSecret;
    }

    public BasicAuth usernameSecret(SecretKeySelector usernameSecret) {
        this.usernameSecret = usernameSecret;
        return this;
    }

    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BasicAuth {\n");

        sb.append("    passwordSecret: ").append(toIndentedString(passwordSecret)).append("\n");
        sb.append("    usernameSecret: ").append(toIndentedString(usernameSecret)).append("\n");
        
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
      * BasicAuth describes the secret selectors required for basic authentication
     **/
    public static class BasicAuthQueryParam  {

        /**
          * BasicAuth describes the secret selectors required for basic authentication
         **/
        @jakarta.ws.rs.QueryParam("passwordSecret")
        private SecretKeySelector passwordSecret;
        /**
          * BasicAuth describes the secret selectors required for basic authentication
         **/
        @jakarta.ws.rs.QueryParam("usernameSecret")
        private SecretKeySelector usernameSecret;

        /**
        * Get passwordSecret
        * @return passwordSecret
        **/
        @JsonProperty("passwordSecret")
        public SecretKeySelector getPasswordSecret() {
            return passwordSecret;
        }

        /**
         * Set passwordSecret
         **/
        public void setPasswordSecret(SecretKeySelector passwordSecret) {
            this.passwordSecret = passwordSecret;
        }

        public BasicAuthQueryParam passwordSecret(SecretKeySelector passwordSecret) {
            this.passwordSecret = passwordSecret;
            return this;
        }

        /**
        * Get usernameSecret
        * @return usernameSecret
        **/
        @JsonProperty("usernameSecret")
        public SecretKeySelector getUsernameSecret() {
            return usernameSecret;
        }

        /**
         * Set usernameSecret
         **/
        public void setUsernameSecret(SecretKeySelector usernameSecret) {
            this.usernameSecret = usernameSecret;
        }

        public BasicAuthQueryParam usernameSecret(SecretKeySelector usernameSecret) {
            this.usernameSecret = usernameSecret;
            return this;
        }

        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class BasicAuthQueryParam {\n");

            sb.append("    passwordSecret: ").append(toIndentedString(passwordSecret)).append("\n");
            sb.append("    usernameSecret: ").append(toIndentedString(usernameSecret)).append("\n");
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