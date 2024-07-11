package io.quarkiverse.argocd.workflow.v1alpha1;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.Type;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Version  {

    private String buildDate;
    private String compiler;
    private String gitCommit;
    private String gitTag;
    private String gitTreeState;
    private String goVersion;
    private String platform;
    private String version;

    /**
    * Get buildDate
    * @return buildDate
    **/
    @JsonProperty("buildDate")
    public String getBuildDate() {
        return buildDate;
    }

    /**
     * Set buildDate
     **/
    public void setBuildDate(String buildDate) {
        this.buildDate = buildDate;
    }

    public Version buildDate(String buildDate) {
        this.buildDate = buildDate;
        return this;
    }

    /**
    * Get compiler
    * @return compiler
    **/
    @JsonProperty("compiler")
    public String getCompiler() {
        return compiler;
    }

    /**
     * Set compiler
     **/
    public void setCompiler(String compiler) {
        this.compiler = compiler;
    }

    public Version compiler(String compiler) {
        this.compiler = compiler;
        return this;
    }

    /**
    * Get gitCommit
    * @return gitCommit
    **/
    @JsonProperty("gitCommit")
    public String getGitCommit() {
        return gitCommit;
    }

    /**
     * Set gitCommit
     **/
    public void setGitCommit(String gitCommit) {
        this.gitCommit = gitCommit;
    }

    public Version gitCommit(String gitCommit) {
        this.gitCommit = gitCommit;
        return this;
    }

    /**
    * Get gitTag
    * @return gitTag
    **/
    @JsonProperty("gitTag")
    public String getGitTag() {
        return gitTag;
    }

    /**
     * Set gitTag
     **/
    public void setGitTag(String gitTag) {
        this.gitTag = gitTag;
    }

    public Version gitTag(String gitTag) {
        this.gitTag = gitTag;
        return this;
    }

    /**
    * Get gitTreeState
    * @return gitTreeState
    **/
    @JsonProperty("gitTreeState")
    public String getGitTreeState() {
        return gitTreeState;
    }

    /**
     * Set gitTreeState
     **/
    public void setGitTreeState(String gitTreeState) {
        this.gitTreeState = gitTreeState;
    }

    public Version gitTreeState(String gitTreeState) {
        this.gitTreeState = gitTreeState;
        return this;
    }

    /**
    * Get goVersion
    * @return goVersion
    **/
    @JsonProperty("goVersion")
    public String getGoVersion() {
        return goVersion;
    }

    /**
     * Set goVersion
     **/
    public void setGoVersion(String goVersion) {
        this.goVersion = goVersion;
    }

    public Version goVersion(String goVersion) {
        this.goVersion = goVersion;
        return this;
    }

    /**
    * Get platform
    * @return platform
    **/
    @JsonProperty("platform")
    public String getPlatform() {
        return platform;
    }

    /**
     * Set platform
     **/
    public void setPlatform(String platform) {
        this.platform = platform;
    }

    public Version platform(String platform) {
        this.platform = platform;
        return this;
    }

    /**
    * Get version
    * @return version
    **/
    @JsonProperty("version")
    public String getVersion() {
        return version;
    }

    /**
     * Set version
     **/
    public void setVersion(String version) {
        this.version = version;
    }

    public Version version(String version) {
        this.version = version;
        return this;
    }

    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Version {\n");

        sb.append("    buildDate: ").append(toIndentedString(buildDate)).append("\n");
        sb.append("    compiler: ").append(toIndentedString(compiler)).append("\n");
        sb.append("    gitCommit: ").append(toIndentedString(gitCommit)).append("\n");
        sb.append("    gitTag: ").append(toIndentedString(gitTag)).append("\n");
        sb.append("    gitTreeState: ").append(toIndentedString(gitTreeState)).append("\n");
        sb.append("    goVersion: ").append(toIndentedString(goVersion)).append("\n");
        sb.append("    platform: ").append(toIndentedString(platform)).append("\n");
        sb.append("    version: ").append(toIndentedString(version)).append("\n");
        
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
    public static class VersionQueryParam  {

        @jakarta.ws.rs.QueryParam("buildDate")
        private String buildDate;
        @jakarta.ws.rs.QueryParam("compiler")
        private String compiler;
        @jakarta.ws.rs.QueryParam("gitCommit")
        private String gitCommit;
        @jakarta.ws.rs.QueryParam("gitTag")
        private String gitTag;
        @jakarta.ws.rs.QueryParam("gitTreeState")
        private String gitTreeState;
        @jakarta.ws.rs.QueryParam("goVersion")
        private String goVersion;
        @jakarta.ws.rs.QueryParam("platform")
        private String platform;
        @jakarta.ws.rs.QueryParam("version")
        private String version;

        /**
        * Get buildDate
        * @return buildDate
        **/
        @JsonProperty("buildDate")
        public String getBuildDate() {
            return buildDate;
        }

        /**
         * Set buildDate
         **/
        public void setBuildDate(String buildDate) {
            this.buildDate = buildDate;
        }

        public VersionQueryParam buildDate(String buildDate) {
            this.buildDate = buildDate;
            return this;
        }

        /**
        * Get compiler
        * @return compiler
        **/
        @JsonProperty("compiler")
        public String getCompiler() {
            return compiler;
        }

        /**
         * Set compiler
         **/
        public void setCompiler(String compiler) {
            this.compiler = compiler;
        }

        public VersionQueryParam compiler(String compiler) {
            this.compiler = compiler;
            return this;
        }

        /**
        * Get gitCommit
        * @return gitCommit
        **/
        @JsonProperty("gitCommit")
        public String getGitCommit() {
            return gitCommit;
        }

        /**
         * Set gitCommit
         **/
        public void setGitCommit(String gitCommit) {
            this.gitCommit = gitCommit;
        }

        public VersionQueryParam gitCommit(String gitCommit) {
            this.gitCommit = gitCommit;
            return this;
        }

        /**
        * Get gitTag
        * @return gitTag
        **/
        @JsonProperty("gitTag")
        public String getGitTag() {
            return gitTag;
        }

        /**
         * Set gitTag
         **/
        public void setGitTag(String gitTag) {
            this.gitTag = gitTag;
        }

        public VersionQueryParam gitTag(String gitTag) {
            this.gitTag = gitTag;
            return this;
        }

        /**
        * Get gitTreeState
        * @return gitTreeState
        **/
        @JsonProperty("gitTreeState")
        public String getGitTreeState() {
            return gitTreeState;
        }

        /**
         * Set gitTreeState
         **/
        public void setGitTreeState(String gitTreeState) {
            this.gitTreeState = gitTreeState;
        }

        public VersionQueryParam gitTreeState(String gitTreeState) {
            this.gitTreeState = gitTreeState;
            return this;
        }

        /**
        * Get goVersion
        * @return goVersion
        **/
        @JsonProperty("goVersion")
        public String getGoVersion() {
            return goVersion;
        }

        /**
         * Set goVersion
         **/
        public void setGoVersion(String goVersion) {
            this.goVersion = goVersion;
        }

        public VersionQueryParam goVersion(String goVersion) {
            this.goVersion = goVersion;
            return this;
        }

        /**
        * Get platform
        * @return platform
        **/
        @JsonProperty("platform")
        public String getPlatform() {
            return platform;
        }

        /**
         * Set platform
         **/
        public void setPlatform(String platform) {
            this.platform = platform;
        }

        public VersionQueryParam platform(String platform) {
            this.platform = platform;
            return this;
        }

        /**
        * Get version
        * @return version
        **/
        @JsonProperty("version")
        public String getVersion() {
            return version;
        }

        /**
         * Set version
         **/
        public void setVersion(String version) {
            this.version = version;
        }

        public VersionQueryParam version(String version) {
            this.version = version;
            return this;
        }

        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class VersionQueryParam {\n");

            sb.append("    buildDate: ").append(toIndentedString(buildDate)).append("\n");
            sb.append("    compiler: ").append(toIndentedString(compiler)).append("\n");
            sb.append("    gitCommit: ").append(toIndentedString(gitCommit)).append("\n");
            sb.append("    gitTag: ").append(toIndentedString(gitTag)).append("\n");
            sb.append("    gitTreeState: ").append(toIndentedString(gitTreeState)).append("\n");
            sb.append("    goVersion: ").append(toIndentedString(goVersion)).append("\n");
            sb.append("    platform: ").append(toIndentedString(platform)).append("\n");
            sb.append("    version: ").append(toIndentedString(version)).append("\n");
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