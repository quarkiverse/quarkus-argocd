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
public class NATSAuth  {

    private BasicAuth basic;
    private SecretKeySelector credential;
    private SecretKeySelector nkey;
    private SecretKeySelector token;

    /**
    * Get basic
    * @return basic
    **/
    @JsonProperty("basic")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public BasicAuth getBasic() {
        return basic;
    }

    /**
     * Set basic
     **/
    public void setBasic(BasicAuth basic) {
        this.basic = basic;
    }

    public NATSAuth basic(BasicAuth basic) {
        this.basic = basic;
        return this;
    }

    /**
    * Get credential
    * @return credential
    **/
    @JsonProperty("credential")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public SecretKeySelector getCredential() {
        return credential;
    }

    /**
     * Set credential
     **/
    public void setCredential(SecretKeySelector credential) {
        this.credential = credential;
    }

    public NATSAuth credential(SecretKeySelector credential) {
        this.credential = credential;
        return this;
    }

    /**
    * Get nkey
    * @return nkey
    **/
    @JsonProperty("nkey")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public SecretKeySelector getNkey() {
        return nkey;
    }

    /**
     * Set nkey
     **/
    public void setNkey(SecretKeySelector nkey) {
        this.nkey = nkey;
    }

    public NATSAuth nkey(SecretKeySelector nkey) {
        this.nkey = nkey;
        return this;
    }

    /**
    * Get token
    * @return token
    **/
    @JsonProperty("token")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public SecretKeySelector getToken() {
        return token;
    }

    /**
     * Set token
     **/
    public void setToken(SecretKeySelector token) {
        this.token = token;
    }

    public NATSAuth token(SecretKeySelector token) {
        this.token = token;
        return this;
    }

    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class NATSAuth {\n");

        sb.append("    basic: ").append(toIndentedString(basic)).append("\n");
        sb.append("    credential: ").append(toIndentedString(credential)).append("\n");
        sb.append("    nkey: ").append(toIndentedString(nkey)).append("\n");
        sb.append("    token: ").append(toIndentedString(token)).append("\n");
        
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
    public static class NATSAuthQueryParam  {

        @jakarta.ws.rs.QueryParam("basic")
        private BasicAuth basic;
        @jakarta.ws.rs.QueryParam("credential")
        private SecretKeySelector credential;
        @jakarta.ws.rs.QueryParam("nkey")
        private SecretKeySelector nkey;
        @jakarta.ws.rs.QueryParam("token")
        private SecretKeySelector token;

        /**
        * Get basic
        * @return basic
        **/
        @JsonProperty("basic")
        public BasicAuth getBasic() {
            return basic;
        }

        /**
         * Set basic
         **/
        public void setBasic(BasicAuth basic) {
            this.basic = basic;
        }

        public NATSAuthQueryParam basic(BasicAuth basic) {
            this.basic = basic;
            return this;
        }

        /**
        * Get credential
        * @return credential
        **/
        @JsonProperty("credential")
        public SecretKeySelector getCredential() {
            return credential;
        }

        /**
         * Set credential
         **/
        public void setCredential(SecretKeySelector credential) {
            this.credential = credential;
        }

        public NATSAuthQueryParam credential(SecretKeySelector credential) {
            this.credential = credential;
            return this;
        }

        /**
        * Get nkey
        * @return nkey
        **/
        @JsonProperty("nkey")
        public SecretKeySelector getNkey() {
            return nkey;
        }

        /**
         * Set nkey
         **/
        public void setNkey(SecretKeySelector nkey) {
            this.nkey = nkey;
        }

        public NATSAuthQueryParam nkey(SecretKeySelector nkey) {
            this.nkey = nkey;
            return this;
        }

        /**
        * Get token
        * @return token
        **/
        @JsonProperty("token")
        public SecretKeySelector getToken() {
            return token;
        }

        /**
         * Set token
         **/
        public void setToken(SecretKeySelector token) {
            this.token = token;
        }

        public NATSAuthQueryParam token(SecretKeySelector token) {
            this.token = token;
            return this;
        }

        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class NATSAuthQueryParam {\n");

            sb.append("    basic: ").append(toIndentedString(basic)).append("\n");
            sb.append("    credential: ").append(toIndentedString(credential)).append("\n");
            sb.append("    nkey: ").append(toIndentedString(nkey)).append("\n");
            sb.append("    token: ").append(toIndentedString(token)).append("\n");
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
