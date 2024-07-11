package io.quarkiverse.argocd.events.v1alpha1;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.Type;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class BitbucketServerRepository  {

    private String projectKey;
    private String repositorySlug;

    /**
    * Get projectKey
    * @return projectKey
    **/
    @JsonProperty("projectKey")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public String getProjectKey() {
        return projectKey;
    }

    /**
     * Set projectKey
     **/
    public void setProjectKey(String projectKey) {
        this.projectKey = projectKey;
    }

    public BitbucketServerRepository projectKey(String projectKey) {
        this.projectKey = projectKey;
        return this;
    }

    /**
    * Get repositorySlug
    * @return repositorySlug
    **/
    @JsonProperty("repositorySlug")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public String getRepositorySlug() {
        return repositorySlug;
    }

    /**
     * Set repositorySlug
     **/
    public void setRepositorySlug(String repositorySlug) {
        this.repositorySlug = repositorySlug;
    }

    public BitbucketServerRepository repositorySlug(String repositorySlug) {
        this.repositorySlug = repositorySlug;
        return this;
    }

    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BitbucketServerRepository {\n");

        sb.append("    projectKey: ").append(toIndentedString(projectKey)).append("\n");
        sb.append("    repositorySlug: ").append(toIndentedString(repositorySlug)).append("\n");
        
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
    public static class BitbucketServerRepositoryQueryParam  {

        @jakarta.ws.rs.QueryParam("projectKey")
        private String projectKey;
        @jakarta.ws.rs.QueryParam("repositorySlug")
        private String repositorySlug;

        /**
        * Get projectKey
        * @return projectKey
        **/
        @JsonProperty("projectKey")
        public String getProjectKey() {
            return projectKey;
        }

        /**
         * Set projectKey
         **/
        public void setProjectKey(String projectKey) {
            this.projectKey = projectKey;
        }

        public BitbucketServerRepositoryQueryParam projectKey(String projectKey) {
            this.projectKey = projectKey;
            return this;
        }

        /**
        * Get repositorySlug
        * @return repositorySlug
        **/
        @JsonProperty("repositorySlug")
        public String getRepositorySlug() {
            return repositorySlug;
        }

        /**
         * Set repositorySlug
         **/
        public void setRepositorySlug(String repositorySlug) {
            this.repositorySlug = repositorySlug;
        }

        public BitbucketServerRepositoryQueryParam repositorySlug(String repositorySlug) {
            this.repositorySlug = repositorySlug;
            return this;
        }

        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class BitbucketServerRepositoryQueryParam {\n");

            sb.append("    projectKey: ").append(toIndentedString(projectKey)).append("\n");
            sb.append("    repositorySlug: ").append(toIndentedString(repositorySlug)).append("\n");
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
