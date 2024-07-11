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
public class GitArtifact  {

    private String branch;
    private String cloneDirectory;
    private GitCreds creds;
    private String filePath;
    private Boolean insecureIgnoreHostKey;
    private String ref;
    private GitRemoteConfig remote;
    private SecretKeySelector sshKeySecret;
    private String tag;
    private String url;

    /**
    * Get branch
    * @return branch
    **/
    @JsonProperty("branch")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public String getBranch() {
        return branch;
    }

    /**
     * Set branch
     **/
    public void setBranch(String branch) {
        this.branch = branch;
    }

    public GitArtifact branch(String branch) {
        this.branch = branch;
        return this;
    }

    /**
    * Directory to clone the repository. We clone complete directory because GitArtifact is not limited to any specific Git service providers. Hence we don't use any specific git provider client.
    * @return cloneDirectory
    **/
    @JsonProperty("cloneDirectory")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public String getCloneDirectory() {
        return cloneDirectory;
    }

    /**
     * Set cloneDirectory
     **/
    public void setCloneDirectory(String cloneDirectory) {
        this.cloneDirectory = cloneDirectory;
    }

    public GitArtifact cloneDirectory(String cloneDirectory) {
        this.cloneDirectory = cloneDirectory;
        return this;
    }

    /**
    * Get creds
    * @return creds
    **/
    @JsonProperty("creds")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public GitCreds getCreds() {
        return creds;
    }

    /**
     * Set creds
     **/
    public void setCreds(GitCreds creds) {
        this.creds = creds;
    }

    public GitArtifact creds(GitCreds creds) {
        this.creds = creds;
        return this;
    }

    /**
    * Get filePath
    * @return filePath
    **/
    @JsonProperty("filePath")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public String getFilePath() {
        return filePath;
    }

    /**
     * Set filePath
     **/
    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    public GitArtifact filePath(String filePath) {
        this.filePath = filePath;
        return this;
    }

    /**
    * Get insecureIgnoreHostKey
    * @return insecureIgnoreHostKey
    **/
    @JsonProperty("insecureIgnoreHostKey")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public Boolean getInsecureIgnoreHostKey() {
        return insecureIgnoreHostKey;
    }

    /**
     * Set insecureIgnoreHostKey
     **/
    public void setInsecureIgnoreHostKey(Boolean insecureIgnoreHostKey) {
        this.insecureIgnoreHostKey = insecureIgnoreHostKey;
    }

    public GitArtifact insecureIgnoreHostKey(Boolean insecureIgnoreHostKey) {
        this.insecureIgnoreHostKey = insecureIgnoreHostKey;
        return this;
    }

    /**
    * Get ref
    * @return ref
    **/
    @JsonProperty("ref")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public String getRef() {
        return ref;
    }

    /**
     * Set ref
     **/
    public void setRef(String ref) {
        this.ref = ref;
    }

    public GitArtifact ref(String ref) {
        this.ref = ref;
        return this;
    }

    /**
    * Get remote
    * @return remote
    **/
    @JsonProperty("remote")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public GitRemoteConfig getRemote() {
        return remote;
    }

    /**
     * Set remote
     **/
    public void setRemote(GitRemoteConfig remote) {
        this.remote = remote;
    }

    public GitArtifact remote(GitRemoteConfig remote) {
        this.remote = remote;
        return this;
    }

    /**
    * Get sshKeySecret
    * @return sshKeySecret
    **/
    @JsonProperty("sshKeySecret")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public SecretKeySelector getSshKeySecret() {
        return sshKeySecret;
    }

    /**
     * Set sshKeySecret
     **/
    public void setSshKeySecret(SecretKeySelector sshKeySecret) {
        this.sshKeySecret = sshKeySecret;
    }

    public GitArtifact sshKeySecret(SecretKeySelector sshKeySecret) {
        this.sshKeySecret = sshKeySecret;
        return this;
    }

    /**
    * Get tag
    * @return tag
    **/
    @JsonProperty("tag")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public String getTag() {
        return tag;
    }

    /**
     * Set tag
     **/
    public void setTag(String tag) {
        this.tag = tag;
    }

    public GitArtifact tag(String tag) {
        this.tag = tag;
        return this;
    }

    /**
    * Get url
    * @return url
    **/
    @JsonProperty("url")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public String getUrl() {
        return url;
    }

    /**
     * Set url
     **/
    public void setUrl(String url) {
        this.url = url;
    }

    public GitArtifact url(String url) {
        this.url = url;
        return this;
    }

    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GitArtifact {\n");

        sb.append("    branch: ").append(toIndentedString(branch)).append("\n");
        sb.append("    cloneDirectory: ").append(toIndentedString(cloneDirectory)).append("\n");
        sb.append("    creds: ").append(toIndentedString(creds)).append("\n");
        sb.append("    filePath: ").append(toIndentedString(filePath)).append("\n");
        sb.append("    insecureIgnoreHostKey: ").append(toIndentedString(insecureIgnoreHostKey)).append("\n");
        sb.append("    ref: ").append(toIndentedString(ref)).append("\n");
        sb.append("    remote: ").append(toIndentedString(remote)).append("\n");
        sb.append("    sshKeySecret: ").append(toIndentedString(sshKeySecret)).append("\n");
        sb.append("    tag: ").append(toIndentedString(tag)).append("\n");
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
    public static class GitArtifactQueryParam  {

        @jakarta.ws.rs.QueryParam("branch")
        private String branch;
        @jakarta.ws.rs.QueryParam("cloneDirectory")
        private String cloneDirectory;
        @jakarta.ws.rs.QueryParam("creds")
        private GitCreds creds;
        @jakarta.ws.rs.QueryParam("filePath")
        private String filePath;
        @jakarta.ws.rs.QueryParam("insecureIgnoreHostKey")
        private Boolean insecureIgnoreHostKey;
        @jakarta.ws.rs.QueryParam("ref")
        private String ref;
        @jakarta.ws.rs.QueryParam("remote")
        private GitRemoteConfig remote;
        @jakarta.ws.rs.QueryParam("sshKeySecret")
        private SecretKeySelector sshKeySecret;
        @jakarta.ws.rs.QueryParam("tag")
        private String tag;
        @jakarta.ws.rs.QueryParam("url")
        private String url;

        /**
        * Get branch
        * @return branch
        **/
        @JsonProperty("branch")
        public String getBranch() {
            return branch;
        }

        /**
         * Set branch
         **/
        public void setBranch(String branch) {
            this.branch = branch;
        }

        public GitArtifactQueryParam branch(String branch) {
            this.branch = branch;
            return this;
        }

        /**
        * Directory to clone the repository. We clone complete directory because GitArtifact is not limited to any specific Git service providers. Hence we don't use any specific git provider client.
        * @return cloneDirectory
        **/
        @JsonProperty("cloneDirectory")
        public String getCloneDirectory() {
            return cloneDirectory;
        }

        /**
         * Set cloneDirectory
         **/
        public void setCloneDirectory(String cloneDirectory) {
            this.cloneDirectory = cloneDirectory;
        }

        public GitArtifactQueryParam cloneDirectory(String cloneDirectory) {
            this.cloneDirectory = cloneDirectory;
            return this;
        }

        /**
        * Get creds
        * @return creds
        **/
        @JsonProperty("creds")
        public GitCreds getCreds() {
            return creds;
        }

        /**
         * Set creds
         **/
        public void setCreds(GitCreds creds) {
            this.creds = creds;
        }

        public GitArtifactQueryParam creds(GitCreds creds) {
            this.creds = creds;
            return this;
        }

        /**
        * Get filePath
        * @return filePath
        **/
        @JsonProperty("filePath")
        public String getFilePath() {
            return filePath;
        }

        /**
         * Set filePath
         **/
        public void setFilePath(String filePath) {
            this.filePath = filePath;
        }

        public GitArtifactQueryParam filePath(String filePath) {
            this.filePath = filePath;
            return this;
        }

        /**
        * Get insecureIgnoreHostKey
        * @return insecureIgnoreHostKey
        **/
        @JsonProperty("insecureIgnoreHostKey")
        public Boolean getInsecureIgnoreHostKey() {
            return insecureIgnoreHostKey;
        }

        /**
         * Set insecureIgnoreHostKey
         **/
        public void setInsecureIgnoreHostKey(Boolean insecureIgnoreHostKey) {
            this.insecureIgnoreHostKey = insecureIgnoreHostKey;
        }

        public GitArtifactQueryParam insecureIgnoreHostKey(Boolean insecureIgnoreHostKey) {
            this.insecureIgnoreHostKey = insecureIgnoreHostKey;
            return this;
        }

        /**
        * Get ref
        * @return ref
        **/
        @JsonProperty("ref")
        public String getRef() {
            return ref;
        }

        /**
         * Set ref
         **/
        public void setRef(String ref) {
            this.ref = ref;
        }

        public GitArtifactQueryParam ref(String ref) {
            this.ref = ref;
            return this;
        }

        /**
        * Get remote
        * @return remote
        **/
        @JsonProperty("remote")
        public GitRemoteConfig getRemote() {
            return remote;
        }

        /**
         * Set remote
         **/
        public void setRemote(GitRemoteConfig remote) {
            this.remote = remote;
        }

        public GitArtifactQueryParam remote(GitRemoteConfig remote) {
            this.remote = remote;
            return this;
        }

        /**
        * Get sshKeySecret
        * @return sshKeySecret
        **/
        @JsonProperty("sshKeySecret")
        public SecretKeySelector getSshKeySecret() {
            return sshKeySecret;
        }

        /**
         * Set sshKeySecret
         **/
        public void setSshKeySecret(SecretKeySelector sshKeySecret) {
            this.sshKeySecret = sshKeySecret;
        }

        public GitArtifactQueryParam sshKeySecret(SecretKeySelector sshKeySecret) {
            this.sshKeySecret = sshKeySecret;
            return this;
        }

        /**
        * Get tag
        * @return tag
        **/
        @JsonProperty("tag")
        public String getTag() {
            return tag;
        }

        /**
         * Set tag
         **/
        public void setTag(String tag) {
            this.tag = tag;
        }

        public GitArtifactQueryParam tag(String tag) {
            this.tag = tag;
            return this;
        }

        /**
        * Get url
        * @return url
        **/
        @JsonProperty("url")
        public String getUrl() {
            return url;
        }

        /**
         * Set url
         **/
        public void setUrl(String url) {
            this.url = url;
        }

        public GitArtifactQueryParam url(String url) {
            this.url = url;
            return this;
        }

        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class GitArtifactQueryParam {\n");

            sb.append("    branch: ").append(toIndentedString(branch)).append("\n");
            sb.append("    cloneDirectory: ").append(toIndentedString(cloneDirectory)).append("\n");
            sb.append("    creds: ").append(toIndentedString(creds)).append("\n");
            sb.append("    filePath: ").append(toIndentedString(filePath)).append("\n");
            sb.append("    insecureIgnoreHostKey: ").append(toIndentedString(insecureIgnoreHostKey)).append("\n");
            sb.append("    ref: ").append(toIndentedString(ref)).append("\n");
            sb.append("    remote: ").append(toIndentedString(remote)).append("\n");
            sb.append("    sshKeySecret: ").append(toIndentedString(sshKeySecret)).append("\n");
            sb.append("    tag: ").append(toIndentedString(tag)).append("\n");
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
