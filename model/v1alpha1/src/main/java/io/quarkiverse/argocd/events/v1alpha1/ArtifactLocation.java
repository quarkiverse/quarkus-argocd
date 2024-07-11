package io.quarkiverse.argocd.events.v1alpha1;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.quarkiverse.argocd.v1alpha1.model.FileArtifact;
import io.quarkiverse.argocd.v1alpha1.model.Resource;
import io.fabric8.kubernetes.api.model.ConfigMapKeySelector;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.Type;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ArtifactLocation  {

    private ConfigMapKeySelector configmap;
    private FileArtifact _file;
    private GitArtifact git;
    private String inline;
    private Resource resource;
    private S3Artifact s3;
    private URLArtifact url;

    /**
    * Get configmap
    * @return configmap
    **/
    @JsonProperty("configmap")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public ConfigMapKeySelector getConfigmap() {
        return configmap;
    }

    /**
     * Set configmap
     **/
    public void setConfigmap(ConfigMapKeySelector configmap) {
        this.configmap = configmap;
    }

    public ArtifactLocation configmap(ConfigMapKeySelector configmap) {
        this.configmap = configmap;
        return this;
    }

    /**
    * Get _file
    * @return _file
    **/
    @JsonProperty("file")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public FileArtifact getFile() {
        return _file;
    }

    /**
     * Set _file
     **/
    public void setFile(FileArtifact _file) {
        this._file = _file;
    }

    public ArtifactLocation _file(FileArtifact _file) {
        this._file = _file;
        return this;
    }

    /**
    * Get git
    * @return git
    **/
    @JsonProperty("git")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public GitArtifact getGit() {
        return git;
    }

    /**
     * Set git
     **/
    public void setGit(GitArtifact git) {
        this.git = git;
    }

    public ArtifactLocation git(GitArtifact git) {
        this.git = git;
        return this;
    }

    /**
    * Get inline
    * @return inline
    **/
    @JsonProperty("inline")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public String getInline() {
        return inline;
    }

    /**
     * Set inline
     **/
    public void setInline(String inline) {
        this.inline = inline;
    }

    public ArtifactLocation inline(String inline) {
        this.inline = inline;
        return this;
    }

    /**
    * Get resource
    * @return resource
    **/
    @JsonProperty("resource")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public Resource getResource() {
        return resource;
    }

    /**
     * Set resource
     **/
    public void setResource(Resource resource) {
        this.resource = resource;
    }

    public ArtifactLocation resource(Resource resource) {
        this.resource = resource;
        return this;
    }

    /**
    * Get s3
    * @return s3
    **/
    @JsonProperty("s3")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public S3Artifact getS3() {
        return s3;
    }

    /**
     * Set s3
     **/
    public void setS3(S3Artifact s3) {
        this.s3 = s3;
    }

    public ArtifactLocation s3(S3Artifact s3) {
        this.s3 = s3;
        return this;
    }

    /**
    * Get url
    * @return url
    **/
    @JsonProperty("url")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public URLArtifact getUrl() {
        return url;
    }

    /**
     * Set url
     **/
    public void setUrl(URLArtifact url) {
        this.url = url;
    }

    public ArtifactLocation url(URLArtifact url) {
        this.url = url;
        return this;
    }

    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ArtifactLocation {\n");

        sb.append("    configmap: ").append(toIndentedString(configmap)).append("\n");
        sb.append("    _file: ").append(toIndentedString(_file)).append("\n");
        sb.append("    git: ").append(toIndentedString(git)).append("\n");
        sb.append("    inline: ").append(toIndentedString(inline)).append("\n");
        sb.append("    resource: ").append(toIndentedString(resource)).append("\n");
        sb.append("    s3: ").append(toIndentedString(s3)).append("\n");
        sb.append("    url: ").append(toIndentedString(url)).append("\n");
        
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
    public static class ArtifactLocationQueryParam  {

        @jakarta.ws.rs.QueryParam("configmap")
        private ConfigMapKeySelector configmap;
        @jakarta.ws.rs.QueryParam("_file")
        private FileArtifact _file;
        @jakarta.ws.rs.QueryParam("git")
        private GitArtifact git;
        @jakarta.ws.rs.QueryParam("inline")
        private String inline;
        @jakarta.ws.rs.QueryParam("resource")
        private Resource resource;
        @jakarta.ws.rs.QueryParam("s3")
        private S3Artifact s3;
        @jakarta.ws.rs.QueryParam("url")
        private URLArtifact url;

        /**
        * Get configmap
        * @return configmap
        **/
        @JsonProperty("configmap")
        public ConfigMapKeySelector getConfigmap() {
            return configmap;
        }

        /**
         * Set configmap
         **/
        public void setConfigmap(ConfigMapKeySelector configmap) {
            this.configmap = configmap;
        }

        public ArtifactLocationQueryParam configmap(ConfigMapKeySelector configmap) {
            this.configmap = configmap;
            return this;
        }

        /**
        * Get _file
        * @return _file
        **/
        @JsonProperty("file")
        public FileArtifact getFile() {
            return _file;
        }

        /**
         * Set _file
         **/
        public void setFile(FileArtifact _file) {
            this._file = _file;
        }

        public ArtifactLocationQueryParam _file(FileArtifact _file) {
            this._file = _file;
            return this;
        }

        /**
        * Get git
        * @return git
        **/
        @JsonProperty("git")
        public GitArtifact getGit() {
            return git;
        }

        /**
         * Set git
         **/
        public void setGit(GitArtifact git) {
            this.git = git;
        }

        public ArtifactLocationQueryParam git(GitArtifact git) {
            this.git = git;
            return this;
        }

        /**
        * Get inline
        * @return inline
        **/
        @JsonProperty("inline")
        public String getInline() {
            return inline;
        }

        /**
         * Set inline
         **/
        public void setInline(String inline) {
            this.inline = inline;
        }

        public ArtifactLocationQueryParam inline(String inline) {
            this.inline = inline;
            return this;
        }

        /**
        * Get resource
        * @return resource
        **/
        @JsonProperty("resource")
        public Resource getResource() {
            return resource;
        }

        /**
         * Set resource
         **/
        public void setResource(Resource resource) {
            this.resource = resource;
        }

        public ArtifactLocationQueryParam resource(Resource resource) {
            this.resource = resource;
            return this;
        }

        /**
        * Get s3
        * @return s3
        **/
        @JsonProperty("s3")
        public S3Artifact getS3() {
            return s3;
        }

        /**
         * Set s3
         **/
        public void setS3(S3Artifact s3) {
            this.s3 = s3;
        }

        public ArtifactLocationQueryParam s3(S3Artifact s3) {
            this.s3 = s3;
            return this;
        }

        /**
        * Get url
        * @return url
        **/
        @JsonProperty("url")
        public URLArtifact getUrl() {
            return url;
        }

        /**
         * Set url
         **/
        public void setUrl(URLArtifact url) {
            this.url = url;
        }

        public ArtifactLocationQueryParam url(URLArtifact url) {
            this.url = url;
            return this;
        }

        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class ArtifactLocationQueryParam {\n");

            sb.append("    configmap: ").append(toIndentedString(configmap)).append("\n");
            sb.append("    _file: ").append(toIndentedString(_file)).append("\n");
            sb.append("    git: ").append(toIndentedString(git)).append("\n");
            sb.append("    inline: ").append(toIndentedString(inline)).append("\n");
            sb.append("    resource: ").append(toIndentedString(resource)).append("\n");
            sb.append("    s3: ").append(toIndentedString(s3)).append("\n");
            sb.append("    url: ").append(toIndentedString(url)).append("\n");
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
