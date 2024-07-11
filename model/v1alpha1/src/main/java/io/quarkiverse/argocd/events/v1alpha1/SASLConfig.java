package io.quarkiverse.argocd.events.v1alpha1;

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
public class SASLConfig  {

    private String mechanism;
    private SecretKeySelector passwordSecret;
    private SecretKeySelector userSecret;

    /**
    * Get mechanism
    * @return mechanism
    **/
    @JsonProperty("mechanism")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public String getMechanism() {
        return mechanism;
    }

    /**
     * Set mechanism
     **/
    public void setMechanism(String mechanism) {
        this.mechanism = mechanism;
    }

    public SASLConfig mechanism(String mechanism) {
        this.mechanism = mechanism;
        return this;
    }

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

    public SASLConfig passwordSecret(SecretKeySelector passwordSecret) {
        this.passwordSecret = passwordSecret;
        return this;
    }

    /**
    * Get userSecret
    * @return userSecret
    **/
    @JsonProperty("userSecret")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public SecretKeySelector getUserSecret() {
        return userSecret;
    }

    /**
     * Set userSecret
     **/
    public void setUserSecret(SecretKeySelector userSecret) {
        this.userSecret = userSecret;
    }

    public SASLConfig userSecret(SecretKeySelector userSecret) {
        this.userSecret = userSecret;
        return this;
    }

    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SASLConfig {\n");

        sb.append("    mechanism: ").append(toIndentedString(mechanism)).append("\n");
        sb.append("    passwordSecret: ").append(toIndentedString(passwordSecret)).append("\n");
        sb.append("    userSecret: ").append(toIndentedString(userSecret)).append("\n");
        
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
    public static class SASLConfigQueryParam  {

        @jakarta.ws.rs.QueryParam("mechanism")
        private String mechanism;
        @jakarta.ws.rs.QueryParam("passwordSecret")
        private SecretKeySelector passwordSecret;
        @jakarta.ws.rs.QueryParam("userSecret")
        private SecretKeySelector userSecret;

        /**
        * Get mechanism
        * @return mechanism
        **/
        @JsonProperty("mechanism")
        public String getMechanism() {
            return mechanism;
        }

        /**
         * Set mechanism
         **/
        public void setMechanism(String mechanism) {
            this.mechanism = mechanism;
        }

        public SASLConfigQueryParam mechanism(String mechanism) {
            this.mechanism = mechanism;
            return this;
        }

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

        public SASLConfigQueryParam passwordSecret(SecretKeySelector passwordSecret) {
            this.passwordSecret = passwordSecret;
            return this;
        }

        /**
        * Get userSecret
        * @return userSecret
        **/
        @JsonProperty("userSecret")
        public SecretKeySelector getUserSecret() {
            return userSecret;
        }

        /**
         * Set userSecret
         **/
        public void setUserSecret(SecretKeySelector userSecret) {
            this.userSecret = userSecret;
        }

        public SASLConfigQueryParam userSecret(SecretKeySelector userSecret) {
            this.userSecret = userSecret;
            return this;
        }

        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class SASLConfigQueryParam {\n");

            sb.append("    mechanism: ").append(toIndentedString(mechanism)).append("\n");
            sb.append("    passwordSecret: ").append(toIndentedString(passwordSecret)).append("\n");
            sb.append("    userSecret: ").append(toIndentedString(userSecret)).append("\n");
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
