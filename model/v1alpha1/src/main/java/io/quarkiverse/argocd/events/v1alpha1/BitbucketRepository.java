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
public class BitbucketRepository  {

    private String owner;
    private String repositorySlug;

    /**
    * Get owner
    * @return owner
    **/
    @JsonProperty("owner")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public String getOwner() {
        return owner;
    }

    /**
     * Set owner
     **/
    public void setOwner(String owner) {
        this.owner = owner;
    }

    public BitbucketRepository owner(String owner) {
        this.owner = owner;
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

    public BitbucketRepository repositorySlug(String repositorySlug) {
        this.repositorySlug = repositorySlug;
        return this;
    }

    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BitbucketRepository {\n");

        sb.append("    owner: ").append(toIndentedString(owner)).append("\n");
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
    public static class BitbucketRepositoryQueryParam  {

        @jakarta.ws.rs.QueryParam("owner")
        private String owner;
        @jakarta.ws.rs.QueryParam("repositorySlug")
        private String repositorySlug;

        /**
        * Get owner
        * @return owner
        **/
        @JsonProperty("owner")
        public String getOwner() {
            return owner;
        }

        /**
         * Set owner
         **/
        public void setOwner(String owner) {
            this.owner = owner;
        }

        public BitbucketRepositoryQueryParam owner(String owner) {
            this.owner = owner;
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

        public BitbucketRepositoryQueryParam repositorySlug(String repositorySlug) {
            this.repositorySlug = repositorySlug;
            return this;
        }

        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class BitbucketRepositoryQueryParam {\n");

            sb.append("    owner: ").append(toIndentedString(owner)).append("\n");
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
