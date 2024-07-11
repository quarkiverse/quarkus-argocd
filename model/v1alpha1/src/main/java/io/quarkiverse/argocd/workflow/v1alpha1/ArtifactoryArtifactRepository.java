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
  * ArtifactoryArtifactRepository defines the controller configuration for an artifactory artifact repository
 **/
public class ArtifactoryArtifactRepository  {

    /**
      * ArtifactoryArtifactRepository defines the controller configuration for an artifactory artifact repository
     **/
    private String keyFormat;
    /**
      * ArtifactoryArtifactRepository defines the controller configuration for an artifactory artifact repository
     **/
    private SecretKeySelector passwordSecret;
    /**
      * ArtifactoryArtifactRepository defines the controller configuration for an artifactory artifact repository
     **/
    private String repoURL;
    /**
      * ArtifactoryArtifactRepository defines the controller configuration for an artifactory artifact repository
     **/
    private SecretKeySelector usernameSecret;

    /**
    * KeyFormat defines the format of how to store keys and can reference workflow variables.
    * @return keyFormat
    **/
    @JsonProperty("keyFormat")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public String getKeyFormat() {
        return keyFormat;
    }

    /**
     * Set keyFormat
     **/
    public void setKeyFormat(String keyFormat) {
        this.keyFormat = keyFormat;
    }

    public ArtifactoryArtifactRepository keyFormat(String keyFormat) {
        this.keyFormat = keyFormat;
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

    public ArtifactoryArtifactRepository passwordSecret(SecretKeySelector passwordSecret) {
        this.passwordSecret = passwordSecret;
        return this;
    }

    /**
    * RepoURL is the url for artifactory repo.
    * @return repoURL
    **/
    @JsonProperty("repoURL")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public String getRepoURL() {
        return repoURL;
    }

    /**
     * Set repoURL
     **/
    public void setRepoURL(String repoURL) {
        this.repoURL = repoURL;
    }

    public ArtifactoryArtifactRepository repoURL(String repoURL) {
        this.repoURL = repoURL;
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

    public ArtifactoryArtifactRepository usernameSecret(SecretKeySelector usernameSecret) {
        this.usernameSecret = usernameSecret;
        return this;
    }

    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ArtifactoryArtifactRepository {\n");

        sb.append("    keyFormat: ").append(toIndentedString(keyFormat)).append("\n");
        sb.append("    passwordSecret: ").append(toIndentedString(passwordSecret)).append("\n");
        sb.append("    repoURL: ").append(toIndentedString(repoURL)).append("\n");
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
      * ArtifactoryArtifactRepository defines the controller configuration for an artifactory artifact repository
     **/
    public static class ArtifactoryArtifactRepositoryQueryParam  {

        /**
          * ArtifactoryArtifactRepository defines the controller configuration for an artifactory artifact repository
         **/
        @jakarta.ws.rs.QueryParam("keyFormat")
        private String keyFormat;
        /**
          * ArtifactoryArtifactRepository defines the controller configuration for an artifactory artifact repository
         **/
        @jakarta.ws.rs.QueryParam("passwordSecret")
        private SecretKeySelector passwordSecret;
        /**
          * ArtifactoryArtifactRepository defines the controller configuration for an artifactory artifact repository
         **/
        @jakarta.ws.rs.QueryParam("repoURL")
        private String repoURL;
        /**
          * ArtifactoryArtifactRepository defines the controller configuration for an artifactory artifact repository
         **/
        @jakarta.ws.rs.QueryParam("usernameSecret")
        private SecretKeySelector usernameSecret;

        /**
        * KeyFormat defines the format of how to store keys and can reference workflow variables.
        * @return keyFormat
        **/
        @JsonProperty("keyFormat")
        public String getKeyFormat() {
            return keyFormat;
        }

        /**
         * Set keyFormat
         **/
        public void setKeyFormat(String keyFormat) {
            this.keyFormat = keyFormat;
        }

        public ArtifactoryArtifactRepositoryQueryParam keyFormat(String keyFormat) {
            this.keyFormat = keyFormat;
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

        public ArtifactoryArtifactRepositoryQueryParam passwordSecret(SecretKeySelector passwordSecret) {
            this.passwordSecret = passwordSecret;
            return this;
        }

        /**
        * RepoURL is the url for artifactory repo.
        * @return repoURL
        **/
        @JsonProperty("repoURL")
        public String getRepoURL() {
            return repoURL;
        }

        /**
         * Set repoURL
         **/
        public void setRepoURL(String repoURL) {
            this.repoURL = repoURL;
        }

        public ArtifactoryArtifactRepositoryQueryParam repoURL(String repoURL) {
            this.repoURL = repoURL;
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

        public ArtifactoryArtifactRepositoryQueryParam usernameSecret(SecretKeySelector usernameSecret) {
            this.usernameSecret = usernameSecret;
            return this;
        }

        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class ArtifactoryArtifactRepositoryQueryParam {\n");

            sb.append("    keyFormat: ").append(toIndentedString(keyFormat)).append("\n");
            sb.append("    passwordSecret: ").append(toIndentedString(passwordSecret)).append("\n");
            sb.append("    repoURL: ").append(toIndentedString(repoURL)).append("\n");
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