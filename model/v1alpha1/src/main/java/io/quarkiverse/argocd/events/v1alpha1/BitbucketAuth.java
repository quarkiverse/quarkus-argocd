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
public class BitbucketAuth  {

    private BitbucketBasicAuth basic;
    private SecretKeySelector oauthToken;

    /**
    * Get basic
    * @return basic
    **/
    @JsonProperty("basic")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public BitbucketBasicAuth getBasic() {
        return basic;
    }

    /**
     * Set basic
     **/
    public void setBasic(BitbucketBasicAuth basic) {
        this.basic = basic;
    }

    public BitbucketAuth basic(BitbucketBasicAuth basic) {
        this.basic = basic;
        return this;
    }

    /**
    * Get oauthToken
    * @return oauthToken
    **/
    @JsonProperty("oauthToken")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public SecretKeySelector getOauthToken() {
        return oauthToken;
    }

    /**
     * Set oauthToken
     **/
    public void setOauthToken(SecretKeySelector oauthToken) {
        this.oauthToken = oauthToken;
    }

    public BitbucketAuth oauthToken(SecretKeySelector oauthToken) {
        this.oauthToken = oauthToken;
        return this;
    }

    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BitbucketAuth {\n");

        sb.append("    basic: ").append(toIndentedString(basic)).append("\n");
        sb.append("    oauthToken: ").append(toIndentedString(oauthToken)).append("\n");
        
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
    public static class BitbucketAuthQueryParam  {

        @jakarta.ws.rs.QueryParam("basic")
        private BitbucketBasicAuth basic;
        @jakarta.ws.rs.QueryParam("oauthToken")
        private SecretKeySelector oauthToken;

        /**
        * Get basic
        * @return basic
        **/
        @JsonProperty("basic")
        public BitbucketBasicAuth getBasic() {
            return basic;
        }

        /**
         * Set basic
         **/
        public void setBasic(BitbucketBasicAuth basic) {
            this.basic = basic;
        }

        public BitbucketAuthQueryParam basic(BitbucketBasicAuth basic) {
            this.basic = basic;
            return this;
        }

        /**
        * Get oauthToken
        * @return oauthToken
        **/
        @JsonProperty("oauthToken")
        public SecretKeySelector getOauthToken() {
            return oauthToken;
        }

        /**
         * Set oauthToken
         **/
        public void setOauthToken(SecretKeySelector oauthToken) {
            this.oauthToken = oauthToken;
        }

        public BitbucketAuthQueryParam oauthToken(SecretKeySelector oauthToken) {
            this.oauthToken = oauthToken;
            return this;
        }

        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class BitbucketAuthQueryParam {\n");

            sb.append("    basic: ").append(toIndentedString(basic)).append("\n");
            sb.append("    oauthToken: ").append(toIndentedString(oauthToken)).append("\n");
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
