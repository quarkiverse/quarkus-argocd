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
public class BasicAuth  {

    private SecretKeySelector password;
    private SecretKeySelector username;

    /**
    * Get password
    * @return password
    **/
    @JsonProperty("password")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public SecretKeySelector getPassword() {
        return password;
    }

    /**
     * Set password
     **/
    public void setPassword(SecretKeySelector password) {
        this.password = password;
    }

    public BasicAuth password(SecretKeySelector password) {
        this.password = password;
        return this;
    }

    /**
    * Get username
    * @return username
    **/
    @JsonProperty("username")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public SecretKeySelector getUsername() {
        return username;
    }

    /**
     * Set username
     **/
    public void setUsername(SecretKeySelector username) {
        this.username = username;
    }

    public BasicAuth username(SecretKeySelector username) {
        this.username = username;
        return this;
    }

    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BasicAuth {\n");

        sb.append("    password: ").append(toIndentedString(password)).append("\n");
        sb.append("    username: ").append(toIndentedString(username)).append("\n");
        
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
    public static class BasicAuthQueryParam  {

        @jakarta.ws.rs.QueryParam("password")
        private SecretKeySelector password;
        @jakarta.ws.rs.QueryParam("username")
        private SecretKeySelector username;

        /**
        * Get password
        * @return password
        **/
        @JsonProperty("password")
        public SecretKeySelector getPassword() {
            return password;
        }

        /**
         * Set password
         **/
        public void setPassword(SecretKeySelector password) {
            this.password = password;
        }

        public BasicAuthQueryParam password(SecretKeySelector password) {
            this.password = password;
            return this;
        }

        /**
        * Get username
        * @return username
        **/
        @JsonProperty("username")
        public SecretKeySelector getUsername() {
            return username;
        }

        /**
         * Set username
         **/
        public void setUsername(SecretKeySelector username) {
            this.username = username;
        }

        public BasicAuthQueryParam username(SecretKeySelector username) {
            this.username = username;
            return this;
        }

        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class BasicAuthQueryParam {\n");

            sb.append("    password: ").append(toIndentedString(password)).append("\n");
            sb.append("    username: ").append(toIndentedString(username)).append("\n");
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
