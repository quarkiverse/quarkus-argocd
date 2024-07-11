package io.quarkiverse.argocd.workflow.v1alpha1;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.fabric8.kubernetes.api.model.SecretKeySelector;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.Type;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
/**
  * GitArtifact is the location of an git artifact
 **/
public class GitArtifact  {

    /**
      * GitArtifact is the location of an git artifact
     **/
    private String branch;
    /**
      * GitArtifact is the location of an git artifact
     **/
    private Integer depth;
    /**
      * GitArtifact is the location of an git artifact
     **/
    private Boolean disableSubmodules;
    /**
      * GitArtifact is the location of an git artifact
     **/
    private List<String> fetch;
    /**
      * GitArtifact is the location of an git artifact
     **/
    private Boolean insecureIgnoreHostKey;
    /**
      * GitArtifact is the location of an git artifact
     **/
    private SecretKeySelector passwordSecret;
    /**
      * GitArtifact is the location of an git artifact
     **/
    private String repo;
    /**
      * GitArtifact is the location of an git artifact
     **/
    private String revision;
    /**
      * GitArtifact is the location of an git artifact
     **/
    private Boolean singleBranch;
    /**
      * GitArtifact is the location of an git artifact
     **/
    private SecretKeySelector sshPrivateKeySecret;
    /**
      * GitArtifact is the location of an git artifact
     **/
    private SecretKeySelector usernameSecret;

    /**
    * Branch is the branch to fetch when `SingleBranch` is enabled
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
    * Depth specifies clones/fetches should be shallow and include the given number of commits from the branch tip
    * @return depth
    **/
    @JsonProperty("depth")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public Integer getDepth() {
        return depth;
    }

    /**
     * Set depth
     **/
    public void setDepth(Integer depth) {
        this.depth = depth;
    }

    public GitArtifact depth(Integer depth) {
        this.depth = depth;
        return this;
    }

    /**
    * DisableSubmodules disables submodules during git clone
    * @return disableSubmodules
    **/
    @JsonProperty("disableSubmodules")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public Boolean getDisableSubmodules() {
        return disableSubmodules;
    }

    /**
     * Set disableSubmodules
     **/
    public void setDisableSubmodules(Boolean disableSubmodules) {
        this.disableSubmodules = disableSubmodules;
    }

    public GitArtifact disableSubmodules(Boolean disableSubmodules) {
        this.disableSubmodules = disableSubmodules;
        return this;
    }

    /**
    * Fetch specifies a number of refs that should be fetched before checkout
    * @return fetch
    **/
    @JsonProperty("fetch")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public List<String> getFetch() {
        return fetch;
    }

    /**
     * Set fetch
     **/
    public void setFetch(List<String> fetch) {
        this.fetch = fetch;
    }

    public GitArtifact fetch(List<String> fetch) {
        this.fetch = fetch;
        return this;
    }
    public GitArtifact addFetchItem(String fetchItem) {
        if (this.fetch == null){
            fetch = new ArrayList<>();
        }
        this.fetch.add(fetchItem);
        return this;
    }

    /**
    * InsecureIgnoreHostKey disables SSH strict host key checking during git clone
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

    public GitArtifact passwordSecret(SecretKeySelector passwordSecret) {
        this.passwordSecret = passwordSecret;
        return this;
    }

    /**
    * Repo is the git repository
    * @return repo
    **/
    @JsonProperty("repo")
    public String getRepo() {
        return repo;
    }

    /**
     * Set repo
     **/
    public void setRepo(String repo) {
        this.repo = repo;
    }

    public GitArtifact repo(String repo) {
        this.repo = repo;
        return this;
    }

    /**
    * Revision is the git commit, tag, branch to checkout
    * @return revision
    **/
    @JsonProperty("revision")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public String getRevision() {
        return revision;
    }

    /**
     * Set revision
     **/
    public void setRevision(String revision) {
        this.revision = revision;
    }

    public GitArtifact revision(String revision) {
        this.revision = revision;
        return this;
    }

    /**
    * SingleBranch enables single branch clone, using the `branch` parameter
    * @return singleBranch
    **/
    @JsonProperty("singleBranch")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public Boolean getSingleBranch() {
        return singleBranch;
    }

    /**
     * Set singleBranch
     **/
    public void setSingleBranch(Boolean singleBranch) {
        this.singleBranch = singleBranch;
    }

    public GitArtifact singleBranch(Boolean singleBranch) {
        this.singleBranch = singleBranch;
        return this;
    }

    /**
    * Get sshPrivateKeySecret
    * @return sshPrivateKeySecret
    **/
    @JsonProperty("sshPrivateKeySecret")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public SecretKeySelector getSshPrivateKeySecret() {
        return sshPrivateKeySecret;
    }

    /**
     * Set sshPrivateKeySecret
     **/
    public void setSshPrivateKeySecret(SecretKeySelector sshPrivateKeySecret) {
        this.sshPrivateKeySecret = sshPrivateKeySecret;
    }

    public GitArtifact sshPrivateKeySecret(SecretKeySelector sshPrivateKeySecret) {
        this.sshPrivateKeySecret = sshPrivateKeySecret;
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

    public GitArtifact usernameSecret(SecretKeySelector usernameSecret) {
        this.usernameSecret = usernameSecret;
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
        sb.append("    depth: ").append(toIndentedString(depth)).append("\n");
        sb.append("    disableSubmodules: ").append(toIndentedString(disableSubmodules)).append("\n");
        sb.append("    fetch: ").append(toIndentedString(fetch)).append("\n");
        sb.append("    insecureIgnoreHostKey: ").append(toIndentedString(insecureIgnoreHostKey)).append("\n");
        sb.append("    passwordSecret: ").append(toIndentedString(passwordSecret)).append("\n");
        sb.append("    repo: ").append(toIndentedString(repo)).append("\n");
        sb.append("    revision: ").append(toIndentedString(revision)).append("\n");
        sb.append("    singleBranch: ").append(toIndentedString(singleBranch)).append("\n");
        sb.append("    sshPrivateKeySecret: ").append(toIndentedString(sshPrivateKeySecret)).append("\n");
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
      * GitArtifact is the location of an git artifact
     **/
    public static class GitArtifactQueryParam  {

        /**
          * GitArtifact is the location of an git artifact
         **/
        @jakarta.ws.rs.QueryParam("branch")
        private String branch;
        /**
          * GitArtifact is the location of an git artifact
         **/
        @jakarta.ws.rs.QueryParam("depth")
        private Integer depth;
        /**
          * GitArtifact is the location of an git artifact
         **/
        @jakarta.ws.rs.QueryParam("disableSubmodules")
        private Boolean disableSubmodules;
        /**
          * GitArtifact is the location of an git artifact
         **/
        @jakarta.ws.rs.QueryParam("fetch")
        private List<String> fetch = null;
        /**
          * GitArtifact is the location of an git artifact
         **/
        @jakarta.ws.rs.QueryParam("insecureIgnoreHostKey")
        private Boolean insecureIgnoreHostKey;
        /**
          * GitArtifact is the location of an git artifact
         **/
        @jakarta.ws.rs.QueryParam("passwordSecret")
        private SecretKeySelector passwordSecret;
        /**
          * GitArtifact is the location of an git artifact
         **/
        @jakarta.ws.rs.QueryParam("repo")
        private String repo;
        /**
          * GitArtifact is the location of an git artifact
         **/
        @jakarta.ws.rs.QueryParam("revision")
        private String revision;
        /**
          * GitArtifact is the location of an git artifact
         **/
        @jakarta.ws.rs.QueryParam("singleBranch")
        private Boolean singleBranch;
        /**
          * GitArtifact is the location of an git artifact
         **/
        @jakarta.ws.rs.QueryParam("sshPrivateKeySecret")
        private SecretKeySelector sshPrivateKeySecret;
        /**
          * GitArtifact is the location of an git artifact
         **/
        @jakarta.ws.rs.QueryParam("usernameSecret")
        private SecretKeySelector usernameSecret;

        /**
        * Branch is the branch to fetch when `SingleBranch` is enabled
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
        * Depth specifies clones/fetches should be shallow and include the given number of commits from the branch tip
        * @return depth
        **/
        @JsonProperty("depth")
        public Integer getDepth() {
            return depth;
        }

        /**
         * Set depth
         **/
        public void setDepth(Integer depth) {
            this.depth = depth;
        }

        public GitArtifactQueryParam depth(Integer depth) {
            this.depth = depth;
            return this;
        }

        /**
        * DisableSubmodules disables submodules during git clone
        * @return disableSubmodules
        **/
        @JsonProperty("disableSubmodules")
        public Boolean getDisableSubmodules() {
            return disableSubmodules;
        }

        /**
         * Set disableSubmodules
         **/
        public void setDisableSubmodules(Boolean disableSubmodules) {
            this.disableSubmodules = disableSubmodules;
        }

        public GitArtifactQueryParam disableSubmodules(Boolean disableSubmodules) {
            this.disableSubmodules = disableSubmodules;
            return this;
        }

        /**
        * Fetch specifies a number of refs that should be fetched before checkout
        * @return fetch
        **/
        @JsonProperty("fetch")
        public List<String> getFetch() {
            return fetch;
        }

        /**
         * Set fetch
         **/
        public void setFetch(List<String> fetch) {
            this.fetch = fetch;
        }

        public GitArtifactQueryParam fetch(List<String> fetch) {
            this.fetch = fetch;
            return this;
        }
        public GitArtifactQueryParam addFetchItem(String fetchItem) {
            this.fetch.add(fetchItem);
            return this;
        }

        /**
        * InsecureIgnoreHostKey disables SSH strict host key checking during git clone
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

        public GitArtifactQueryParam passwordSecret(SecretKeySelector passwordSecret) {
            this.passwordSecret = passwordSecret;
            return this;
        }

        /**
        * Repo is the git repository
        * @return repo
        **/
        @JsonProperty("repo")
        public String getRepo() {
            return repo;
        }

        /**
         * Set repo
         **/
        public void setRepo(String repo) {
            this.repo = repo;
        }

        public GitArtifactQueryParam repo(String repo) {
            this.repo = repo;
            return this;
        }

        /**
        * Revision is the git commit, tag, branch to checkout
        * @return revision
        **/
        @JsonProperty("revision")
        public String getRevision() {
            return revision;
        }

        /**
         * Set revision
         **/
        public void setRevision(String revision) {
            this.revision = revision;
        }

        public GitArtifactQueryParam revision(String revision) {
            this.revision = revision;
            return this;
        }

        /**
        * SingleBranch enables single branch clone, using the `branch` parameter
        * @return singleBranch
        **/
        @JsonProperty("singleBranch")
        public Boolean getSingleBranch() {
            return singleBranch;
        }

        /**
         * Set singleBranch
         **/
        public void setSingleBranch(Boolean singleBranch) {
            this.singleBranch = singleBranch;
        }

        public GitArtifactQueryParam singleBranch(Boolean singleBranch) {
            this.singleBranch = singleBranch;
            return this;
        }

        /**
        * Get sshPrivateKeySecret
        * @return sshPrivateKeySecret
        **/
        @JsonProperty("sshPrivateKeySecret")
        public SecretKeySelector getSshPrivateKeySecret() {
            return sshPrivateKeySecret;
        }

        /**
         * Set sshPrivateKeySecret
         **/
        public void setSshPrivateKeySecret(SecretKeySelector sshPrivateKeySecret) {
            this.sshPrivateKeySecret = sshPrivateKeySecret;
        }

        public GitArtifactQueryParam sshPrivateKeySecret(SecretKeySelector sshPrivateKeySecret) {
            this.sshPrivateKeySecret = sshPrivateKeySecret;
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

        public GitArtifactQueryParam usernameSecret(SecretKeySelector usernameSecret) {
            this.usernameSecret = usernameSecret;
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
            sb.append("    depth: ").append(toIndentedString(depth)).append("\n");
            sb.append("    disableSubmodules: ").append(toIndentedString(disableSubmodules)).append("\n");
            sb.append("    fetch: ").append(toIndentedString(fetch)).append("\n");
            sb.append("    insecureIgnoreHostKey: ").append(toIndentedString(insecureIgnoreHostKey)).append("\n");
            sb.append("    passwordSecret: ").append(toIndentedString(passwordSecret)).append("\n");
            sb.append("    repo: ").append(toIndentedString(repo)).append("\n");
            sb.append("    revision: ").append(toIndentedString(revision)).append("\n");
            sb.append("    singleBranch: ").append(toIndentedString(singleBranch)).append("\n");
            sb.append("    sshPrivateKeySecret: ").append(toIndentedString(sshPrivateKeySecret)).append("\n");
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