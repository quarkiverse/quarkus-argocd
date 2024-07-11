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
public class GithubAppCreds  {

    private String appID;
    private String installationID;
    private SecretKeySelector privateKey;

    /**
    * Get appID
    * @return appID
    **/
    @JsonProperty("appID")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public String getAppID() {
        return appID;
    }

    /**
     * Set appID
     **/
    public void setAppID(String appID) {
        this.appID = appID;
    }

    public GithubAppCreds appID(String appID) {
        this.appID = appID;
        return this;
    }

    /**
    * Get installationID
    * @return installationID
    **/
    @JsonProperty("installationID")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public String getInstallationID() {
        return installationID;
    }

    /**
     * Set installationID
     **/
    public void setInstallationID(String installationID) {
        this.installationID = installationID;
    }

    public GithubAppCreds installationID(String installationID) {
        this.installationID = installationID;
        return this;
    }

    /**
    * Get privateKey
    * @return privateKey
    **/
    @JsonProperty("privateKey")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public SecretKeySelector getPrivateKey() {
        return privateKey;
    }

    /**
     * Set privateKey
     **/
    public void setPrivateKey(SecretKeySelector privateKey) {
        this.privateKey = privateKey;
    }

    public GithubAppCreds privateKey(SecretKeySelector privateKey) {
        this.privateKey = privateKey;
        return this;
    }

    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GithubAppCreds {\n");

        sb.append("    appID: ").append(toIndentedString(appID)).append("\n");
        sb.append("    installationID: ").append(toIndentedString(installationID)).append("\n");
        sb.append("    privateKey: ").append(toIndentedString(privateKey)).append("\n");
        
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
    public static class GithubAppCredsQueryParam  {

        @jakarta.ws.rs.QueryParam("appID")
        private String appID;
        @jakarta.ws.rs.QueryParam("installationID")
        private String installationID;
        @jakarta.ws.rs.QueryParam("privateKey")
        private SecretKeySelector privateKey;

        /**
        * Get appID
        * @return appID
        **/
        @JsonProperty("appID")
        public String getAppID() {
            return appID;
        }

        /**
         * Set appID
         **/
        public void setAppID(String appID) {
            this.appID = appID;
        }

        public GithubAppCredsQueryParam appID(String appID) {
            this.appID = appID;
            return this;
        }

        /**
        * Get installationID
        * @return installationID
        **/
        @JsonProperty("installationID")
        public String getInstallationID() {
            return installationID;
        }

        /**
         * Set installationID
         **/
        public void setInstallationID(String installationID) {
            this.installationID = installationID;
        }

        public GithubAppCredsQueryParam installationID(String installationID) {
            this.installationID = installationID;
            return this;
        }

        /**
        * Get privateKey
        * @return privateKey
        **/
        @JsonProperty("privateKey")
        public SecretKeySelector getPrivateKey() {
            return privateKey;
        }

        /**
         * Set privateKey
         **/
        public void setPrivateKey(SecretKeySelector privateKey) {
            this.privateKey = privateKey;
        }

        public GithubAppCredsQueryParam privateKey(SecretKeySelector privateKey) {
            this.privateKey = privateKey;
            return this;
        }

        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class GithubAppCredsQueryParam {\n");

            sb.append("    appID: ").append(toIndentedString(appID)).append("\n");
            sb.append("    installationID: ").append(toIndentedString(installationID)).append("\n");
            sb.append("    privateKey: ").append(toIndentedString(privateKey)).append("\n");
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
