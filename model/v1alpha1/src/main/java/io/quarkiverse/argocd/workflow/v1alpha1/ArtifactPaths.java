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
/**
  * ArtifactPaths expands a step from a collection of artifacts
 **/
public class ArtifactPaths  {

    /**
      * ArtifactPaths expands a step from a collection of artifacts
     **/
    private ArchiveStrategy archive;
    /**
      * ArtifactPaths expands a step from a collection of artifacts
     **/
    private Boolean archiveLogs;
    /**
      * ArtifactPaths expands a step from a collection of artifacts
     **/
    private ArtifactGC artifactGC;
    /**
      * ArtifactPaths expands a step from a collection of artifacts
     **/
    private ArtifactoryArtifact artifactory;
    /**
      * ArtifactPaths expands a step from a collection of artifacts
     **/
    private AzureArtifact azure;
    /**
      * ArtifactPaths expands a step from a collection of artifacts
     **/
    private Boolean deleted;
    /**
      * ArtifactPaths expands a step from a collection of artifacts
     **/
    private String from;
    /**
      * ArtifactPaths expands a step from a collection of artifacts
     **/
    private String fromExpression;
    /**
      * ArtifactPaths expands a step from a collection of artifacts
     **/
    private GCSArtifact gcs;
    /**
      * ArtifactPaths expands a step from a collection of artifacts
     **/
    private GitArtifact git;
    /**
      * ArtifactPaths expands a step from a collection of artifacts
     **/
    private String globalName;
    /**
      * ArtifactPaths expands a step from a collection of artifacts
     **/
    private HDFSArtifact hdfs;
    /**
      * ArtifactPaths expands a step from a collection of artifacts
     **/
    private HTTPArtifact http;
    /**
      * ArtifactPaths expands a step from a collection of artifacts
     **/
    private Integer mode;
    /**
      * ArtifactPaths expands a step from a collection of artifacts
     **/
    private String name;
    /**
      * ArtifactPaths expands a step from a collection of artifacts
     **/
    private Boolean optional;
    /**
      * ArtifactPaths expands a step from a collection of artifacts
     **/
    private OSSArtifact oss;
    /**
      * ArtifactPaths expands a step from a collection of artifacts
     **/
    private String path;
    /**
      * ArtifactPaths expands a step from a collection of artifacts
     **/
    private RawArtifact raw;
    /**
      * ArtifactPaths expands a step from a collection of artifacts
     **/
    private Boolean recurseMode;
    /**
      * ArtifactPaths expands a step from a collection of artifacts
     **/
    private S3Artifact s3;
    /**
      * ArtifactPaths expands a step from a collection of artifacts
     **/
    private String subPath;

    /**
    * Get archive
    * @return archive
    **/
    @JsonProperty("archive")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public ArchiveStrategy getArchive() {
        return archive;
    }

    /**
     * Set archive
     **/
    public void setArchive(ArchiveStrategy archive) {
        this.archive = archive;
    }

    public ArtifactPaths archive(ArchiveStrategy archive) {
        this.archive = archive;
        return this;
    }

    /**
    * ArchiveLogs indicates if the container logs should be archived
    * @return archiveLogs
    **/
    @JsonProperty("archiveLogs")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public Boolean getArchiveLogs() {
        return archiveLogs;
    }

    /**
     * Set archiveLogs
     **/
    public void setArchiveLogs(Boolean archiveLogs) {
        this.archiveLogs = archiveLogs;
    }

    public ArtifactPaths archiveLogs(Boolean archiveLogs) {
        this.archiveLogs = archiveLogs;
        return this;
    }

    /**
    * Get artifactGC
    * @return artifactGC
    **/
    @JsonProperty("artifactGC")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public ArtifactGC getArtifactGC() {
        return artifactGC;
    }

    /**
     * Set artifactGC
     **/
    public void setArtifactGC(ArtifactGC artifactGC) {
        this.artifactGC = artifactGC;
    }

    public ArtifactPaths artifactGC(ArtifactGC artifactGC) {
        this.artifactGC = artifactGC;
        return this;
    }

    /**
    * Get artifactory
    * @return artifactory
    **/
    @JsonProperty("artifactory")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public ArtifactoryArtifact getArtifactory() {
        return artifactory;
    }

    /**
     * Set artifactory
     **/
    public void setArtifactory(ArtifactoryArtifact artifactory) {
        this.artifactory = artifactory;
    }

    public ArtifactPaths artifactory(ArtifactoryArtifact artifactory) {
        this.artifactory = artifactory;
        return this;
    }

    /**
    * Get azure
    * @return azure
    **/
    @JsonProperty("azure")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public AzureArtifact getAzure() {
        return azure;
    }

    /**
     * Set azure
     **/
    public void setAzure(AzureArtifact azure) {
        this.azure = azure;
    }

    public ArtifactPaths azure(AzureArtifact azure) {
        this.azure = azure;
        return this;
    }

    /**
    * Has this been deleted?
    * @return deleted
    **/
    @JsonProperty("deleted")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public Boolean getDeleted() {
        return deleted;
    }

    /**
     * Set deleted
     **/
    public void setDeleted(Boolean deleted) {
        this.deleted = deleted;
    }

    public ArtifactPaths deleted(Boolean deleted) {
        this.deleted = deleted;
        return this;
    }

    /**
    * From allows an artifact to reference an artifact from a previous step
    * @return from
    **/
    @JsonProperty("from")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public String getFrom() {
        return from;
    }

    /**
     * Set from
     **/
    public void setFrom(String from) {
        this.from = from;
    }

    public ArtifactPaths from(String from) {
        this.from = from;
        return this;
    }

    /**
    * FromExpression, if defined, is evaluated to specify the value for the artifact
    * @return fromExpression
    **/
    @JsonProperty("fromExpression")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public String getFromExpression() {
        return fromExpression;
    }

    /**
     * Set fromExpression
     **/
    public void setFromExpression(String fromExpression) {
        this.fromExpression = fromExpression;
    }

    public ArtifactPaths fromExpression(String fromExpression) {
        this.fromExpression = fromExpression;
        return this;
    }

    /**
    * Get gcs
    * @return gcs
    **/
    @JsonProperty("gcs")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public GCSArtifact getGcs() {
        return gcs;
    }

    /**
     * Set gcs
     **/
    public void setGcs(GCSArtifact gcs) {
        this.gcs = gcs;
    }

    public ArtifactPaths gcs(GCSArtifact gcs) {
        this.gcs = gcs;
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

    public ArtifactPaths git(GitArtifact git) {
        this.git = git;
        return this;
    }

    /**
    * GlobalName exports an output artifact to the global scope, making it available as '{{io.argoproj.workflow.v1alpha1.outputs.artifacts.XXXX}} and in workflow.status.outputs.artifacts
    * @return globalName
    **/
    @JsonProperty("globalName")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public String getGlobalName() {
        return globalName;
    }

    /**
     * Set globalName
     **/
    public void setGlobalName(String globalName) {
        this.globalName = globalName;
    }

    public ArtifactPaths globalName(String globalName) {
        this.globalName = globalName;
        return this;
    }

    /**
    * Get hdfs
    * @return hdfs
    **/
    @JsonProperty("hdfs")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public HDFSArtifact getHdfs() {
        return hdfs;
    }

    /**
     * Set hdfs
     **/
    public void setHdfs(HDFSArtifact hdfs) {
        this.hdfs = hdfs;
    }

    public ArtifactPaths hdfs(HDFSArtifact hdfs) {
        this.hdfs = hdfs;
        return this;
    }

    /**
    * Get http
    * @return http
    **/
    @JsonProperty("http")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public HTTPArtifact getHttp() {
        return http;
    }

    /**
     * Set http
     **/
    public void setHttp(HTTPArtifact http) {
        this.http = http;
    }

    public ArtifactPaths http(HTTPArtifact http) {
        this.http = http;
        return this;
    }

    /**
    * mode bits to use on this file, must be a value between 0 and 0777 set when loading input artifacts.
    * @return mode
    **/
    @JsonProperty("mode")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public Integer getMode() {
        return mode;
    }

    /**
     * Set mode
     **/
    public void setMode(Integer mode) {
        this.mode = mode;
    }

    public ArtifactPaths mode(Integer mode) {
        this.mode = mode;
        return this;
    }

    /**
    * name of the artifact. must be unique within a template's inputs/outputs.
    * @return name
    **/
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    /**
     * Set name
     **/
    public void setName(String name) {
        this.name = name;
    }

    public ArtifactPaths name(String name) {
        this.name = name;
        return this;
    }

    /**
    * Make Artifacts optional, if Artifacts doesn't generate or exist
    * @return optional
    **/
    @JsonProperty("optional")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public Boolean getOptional() {
        return optional;
    }

    /**
     * Set optional
     **/
    public void setOptional(Boolean optional) {
        this.optional = optional;
    }

    public ArtifactPaths optional(Boolean optional) {
        this.optional = optional;
        return this;
    }

    /**
    * Get oss
    * @return oss
    **/
    @JsonProperty("oss")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public OSSArtifact getOss() {
        return oss;
    }

    /**
     * Set oss
     **/
    public void setOss(OSSArtifact oss) {
        this.oss = oss;
    }

    public ArtifactPaths oss(OSSArtifact oss) {
        this.oss = oss;
        return this;
    }

    /**
    * Path is the container path to the artifact
    * @return path
    **/
    @JsonProperty("path")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public String getPath() {
        return path;
    }

    /**
     * Set path
     **/
    public void setPath(String path) {
        this.path = path;
    }

    public ArtifactPaths path(String path) {
        this.path = path;
        return this;
    }

    /**
    * Get raw
    * @return raw
    **/
    @JsonProperty("raw")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public RawArtifact getRaw() {
        return raw;
    }

    /**
     * Set raw
     **/
    public void setRaw(RawArtifact raw) {
        this.raw = raw;
    }

    public ArtifactPaths raw(RawArtifact raw) {
        this.raw = raw;
        return this;
    }

    /**
    * If mode is set, apply the permission recursively into the artifact if it is a folder
    * @return recurseMode
    **/
    @JsonProperty("recurseMode")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public Boolean getRecurseMode() {
        return recurseMode;
    }

    /**
     * Set recurseMode
     **/
    public void setRecurseMode(Boolean recurseMode) {
        this.recurseMode = recurseMode;
    }

    public ArtifactPaths recurseMode(Boolean recurseMode) {
        this.recurseMode = recurseMode;
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

    public ArtifactPaths s3(S3Artifact s3) {
        this.s3 = s3;
        return this;
    }

    /**
    * SubPath allows an artifact to be sourced from a subpath within the specified source
    * @return subPath
    **/
    @JsonProperty("subPath")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public String getSubPath() {
        return subPath;
    }

    /**
     * Set subPath
     **/
    public void setSubPath(String subPath) {
        this.subPath = subPath;
    }

    public ArtifactPaths subPath(String subPath) {
        this.subPath = subPath;
        return this;
    }

    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ArtifactPaths {\n");

        sb.append("    archive: ").append(toIndentedString(archive)).append("\n");
        sb.append("    archiveLogs: ").append(toIndentedString(archiveLogs)).append("\n");
        sb.append("    artifactGC: ").append(toIndentedString(artifactGC)).append("\n");
        sb.append("    artifactory: ").append(toIndentedString(artifactory)).append("\n");
        sb.append("    azure: ").append(toIndentedString(azure)).append("\n");
        sb.append("    deleted: ").append(toIndentedString(deleted)).append("\n");
        sb.append("    from: ").append(toIndentedString(from)).append("\n");
        sb.append("    fromExpression: ").append(toIndentedString(fromExpression)).append("\n");
        sb.append("    gcs: ").append(toIndentedString(gcs)).append("\n");
        sb.append("    git: ").append(toIndentedString(git)).append("\n");
        sb.append("    globalName: ").append(toIndentedString(globalName)).append("\n");
        sb.append("    hdfs: ").append(toIndentedString(hdfs)).append("\n");
        sb.append("    http: ").append(toIndentedString(http)).append("\n");
        sb.append("    mode: ").append(toIndentedString(mode)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    optional: ").append(toIndentedString(optional)).append("\n");
        sb.append("    oss: ").append(toIndentedString(oss)).append("\n");
        sb.append("    path: ").append(toIndentedString(path)).append("\n");
        sb.append("    raw: ").append(toIndentedString(raw)).append("\n");
        sb.append("    recurseMode: ").append(toIndentedString(recurseMode)).append("\n");
        sb.append("    s3: ").append(toIndentedString(s3)).append("\n");
        sb.append("    subPath: ").append(toIndentedString(subPath)).append("\n");
        
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
      * ArtifactPaths expands a step from a collection of artifacts
     **/
    public static class ArtifactPathsQueryParam  {

        /**
          * ArtifactPaths expands a step from a collection of artifacts
         **/
        @jakarta.ws.rs.QueryParam("archive")
        private ArchiveStrategy archive;
        /**
          * ArtifactPaths expands a step from a collection of artifacts
         **/
        @jakarta.ws.rs.QueryParam("archiveLogs")
        private Boolean archiveLogs;
        /**
          * ArtifactPaths expands a step from a collection of artifacts
         **/
        @jakarta.ws.rs.QueryParam("artifactGC")
        private ArtifactGC artifactGC;
        /**
          * ArtifactPaths expands a step from a collection of artifacts
         **/
        @jakarta.ws.rs.QueryParam("artifactory")
        private ArtifactoryArtifact artifactory;
        /**
          * ArtifactPaths expands a step from a collection of artifacts
         **/
        @jakarta.ws.rs.QueryParam("azure")
        private AzureArtifact azure;
        /**
          * ArtifactPaths expands a step from a collection of artifacts
         **/
        @jakarta.ws.rs.QueryParam("deleted")
        private Boolean deleted;
        /**
          * ArtifactPaths expands a step from a collection of artifacts
         **/
        @jakarta.ws.rs.QueryParam("from")
        private String from;
        /**
          * ArtifactPaths expands a step from a collection of artifacts
         **/
        @jakarta.ws.rs.QueryParam("fromExpression")
        private String fromExpression;
        /**
          * ArtifactPaths expands a step from a collection of artifacts
         **/
        @jakarta.ws.rs.QueryParam("gcs")
        private GCSArtifact gcs;
        /**
          * ArtifactPaths expands a step from a collection of artifacts
         **/
        @jakarta.ws.rs.QueryParam("git")
        private GitArtifact git;
        /**
          * ArtifactPaths expands a step from a collection of artifacts
         **/
        @jakarta.ws.rs.QueryParam("globalName")
        private String globalName;
        /**
          * ArtifactPaths expands a step from a collection of artifacts
         **/
        @jakarta.ws.rs.QueryParam("hdfs")
        private HDFSArtifact hdfs;
        /**
          * ArtifactPaths expands a step from a collection of artifacts
         **/
        @jakarta.ws.rs.QueryParam("http")
        private HTTPArtifact http;
        /**
          * ArtifactPaths expands a step from a collection of artifacts
         **/
        @jakarta.ws.rs.QueryParam("mode")
        private Integer mode;
        /**
          * ArtifactPaths expands a step from a collection of artifacts
         **/
        @jakarta.ws.rs.QueryParam("name")
        private String name;
        /**
          * ArtifactPaths expands a step from a collection of artifacts
         **/
        @jakarta.ws.rs.QueryParam("optional")
        private Boolean optional;
        /**
          * ArtifactPaths expands a step from a collection of artifacts
         **/
        @jakarta.ws.rs.QueryParam("oss")
        private OSSArtifact oss;
        /**
          * ArtifactPaths expands a step from a collection of artifacts
         **/
        @jakarta.ws.rs.QueryParam("path")
        private String path;
        /**
          * ArtifactPaths expands a step from a collection of artifacts
         **/
        @jakarta.ws.rs.QueryParam("raw")
        private RawArtifact raw;
        /**
          * ArtifactPaths expands a step from a collection of artifacts
         **/
        @jakarta.ws.rs.QueryParam("recurseMode")
        private Boolean recurseMode;
        /**
          * ArtifactPaths expands a step from a collection of artifacts
         **/
        @jakarta.ws.rs.QueryParam("s3")
        private S3Artifact s3;
        /**
          * ArtifactPaths expands a step from a collection of artifacts
         **/
        @jakarta.ws.rs.QueryParam("subPath")
        private String subPath;

        /**
        * Get archive
        * @return archive
        **/
        @JsonProperty("archive")
        public ArchiveStrategy getArchive() {
            return archive;
        }

        /**
         * Set archive
         **/
        public void setArchive(ArchiveStrategy archive) {
            this.archive = archive;
        }

        public ArtifactPathsQueryParam archive(ArchiveStrategy archive) {
            this.archive = archive;
            return this;
        }

        /**
        * ArchiveLogs indicates if the container logs should be archived
        * @return archiveLogs
        **/
        @JsonProperty("archiveLogs")
        public Boolean getArchiveLogs() {
            return archiveLogs;
        }

        /**
         * Set archiveLogs
         **/
        public void setArchiveLogs(Boolean archiveLogs) {
            this.archiveLogs = archiveLogs;
        }

        public ArtifactPathsQueryParam archiveLogs(Boolean archiveLogs) {
            this.archiveLogs = archiveLogs;
            return this;
        }

        /**
        * Get artifactGC
        * @return artifactGC
        **/
        @JsonProperty("artifactGC")
        public ArtifactGC getArtifactGC() {
            return artifactGC;
        }

        /**
         * Set artifactGC
         **/
        public void setArtifactGC(ArtifactGC artifactGC) {
            this.artifactGC = artifactGC;
        }

        public ArtifactPathsQueryParam artifactGC(ArtifactGC artifactGC) {
            this.artifactGC = artifactGC;
            return this;
        }

        /**
        * Get artifactory
        * @return artifactory
        **/
        @JsonProperty("artifactory")
        public ArtifactoryArtifact getArtifactory() {
            return artifactory;
        }

        /**
         * Set artifactory
         **/
        public void setArtifactory(ArtifactoryArtifact artifactory) {
            this.artifactory = artifactory;
        }

        public ArtifactPathsQueryParam artifactory(ArtifactoryArtifact artifactory) {
            this.artifactory = artifactory;
            return this;
        }

        /**
        * Get azure
        * @return azure
        **/
        @JsonProperty("azure")
        public AzureArtifact getAzure() {
            return azure;
        }

        /**
         * Set azure
         **/
        public void setAzure(AzureArtifact azure) {
            this.azure = azure;
        }

        public ArtifactPathsQueryParam azure(AzureArtifact azure) {
            this.azure = azure;
            return this;
        }

        /**
        * Has this been deleted?
        * @return deleted
        **/
        @JsonProperty("deleted")
        public Boolean getDeleted() {
            return deleted;
        }

        /**
         * Set deleted
         **/
        public void setDeleted(Boolean deleted) {
            this.deleted = deleted;
        }

        public ArtifactPathsQueryParam deleted(Boolean deleted) {
            this.deleted = deleted;
            return this;
        }

        /**
        * From allows an artifact to reference an artifact from a previous step
        * @return from
        **/
        @JsonProperty("from")
        public String getFrom() {
            return from;
        }

        /**
         * Set from
         **/
        public void setFrom(String from) {
            this.from = from;
        }

        public ArtifactPathsQueryParam from(String from) {
            this.from = from;
            return this;
        }

        /**
        * FromExpression, if defined, is evaluated to specify the value for the artifact
        * @return fromExpression
        **/
        @JsonProperty("fromExpression")
        public String getFromExpression() {
            return fromExpression;
        }

        /**
         * Set fromExpression
         **/
        public void setFromExpression(String fromExpression) {
            this.fromExpression = fromExpression;
        }

        public ArtifactPathsQueryParam fromExpression(String fromExpression) {
            this.fromExpression = fromExpression;
            return this;
        }

        /**
        * Get gcs
        * @return gcs
        **/
        @JsonProperty("gcs")
        public GCSArtifact getGcs() {
            return gcs;
        }

        /**
         * Set gcs
         **/
        public void setGcs(GCSArtifact gcs) {
            this.gcs = gcs;
        }

        public ArtifactPathsQueryParam gcs(GCSArtifact gcs) {
            this.gcs = gcs;
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

        public ArtifactPathsQueryParam git(GitArtifact git) {
            this.git = git;
            return this;
        }

        /**
        * GlobalName exports an output artifact to the global scope, making it available as '{{io.argoproj.workflow.v1alpha1.outputs.artifacts.XXXX}} and in workflow.status.outputs.artifacts
        * @return globalName
        **/
        @JsonProperty("globalName")
        public String getGlobalName() {
            return globalName;
        }

        /**
         * Set globalName
         **/
        public void setGlobalName(String globalName) {
            this.globalName = globalName;
        }

        public ArtifactPathsQueryParam globalName(String globalName) {
            this.globalName = globalName;
            return this;
        }

        /**
        * Get hdfs
        * @return hdfs
        **/
        @JsonProperty("hdfs")
        public HDFSArtifact getHdfs() {
            return hdfs;
        }

        /**
         * Set hdfs
         **/
        public void setHdfs(HDFSArtifact hdfs) {
            this.hdfs = hdfs;
        }

        public ArtifactPathsQueryParam hdfs(HDFSArtifact hdfs) {
            this.hdfs = hdfs;
            return this;
        }

        /**
        * Get http
        * @return http
        **/
        @JsonProperty("http")
        public HTTPArtifact getHttp() {
            return http;
        }

        /**
         * Set http
         **/
        public void setHttp(HTTPArtifact http) {
            this.http = http;
        }

        public ArtifactPathsQueryParam http(HTTPArtifact http) {
            this.http = http;
            return this;
        }

        /**
        * mode bits to use on this file, must be a value between 0 and 0777 set when loading input artifacts.
        * @return mode
        **/
        @JsonProperty("mode")
        public Integer getMode() {
            return mode;
        }

        /**
         * Set mode
         **/
        public void setMode(Integer mode) {
            this.mode = mode;
        }

        public ArtifactPathsQueryParam mode(Integer mode) {
            this.mode = mode;
            return this;
        }

        /**
        * name of the artifact. must be unique within a template's inputs/outputs.
        * @return name
        **/
        @JsonProperty("name")
        public String getName() {
            return name;
        }

        /**
         * Set name
         **/
        public void setName(String name) {
            this.name = name;
        }

        public ArtifactPathsQueryParam name(String name) {
            this.name = name;
            return this;
        }

        /**
        * Make Artifacts optional, if Artifacts doesn't generate or exist
        * @return optional
        **/
        @JsonProperty("optional")
        public Boolean getOptional() {
            return optional;
        }

        /**
         * Set optional
         **/
        public void setOptional(Boolean optional) {
            this.optional = optional;
        }

        public ArtifactPathsQueryParam optional(Boolean optional) {
            this.optional = optional;
            return this;
        }

        /**
        * Get oss
        * @return oss
        **/
        @JsonProperty("oss")
        public OSSArtifact getOss() {
            return oss;
        }

        /**
         * Set oss
         **/
        public void setOss(OSSArtifact oss) {
            this.oss = oss;
        }

        public ArtifactPathsQueryParam oss(OSSArtifact oss) {
            this.oss = oss;
            return this;
        }

        /**
        * Path is the container path to the artifact
        * @return path
        **/
        @JsonProperty("path")
        public String getPath() {
            return path;
        }

        /**
         * Set path
         **/
        public void setPath(String path) {
            this.path = path;
        }

        public ArtifactPathsQueryParam path(String path) {
            this.path = path;
            return this;
        }

        /**
        * Get raw
        * @return raw
        **/
        @JsonProperty("raw")
        public RawArtifact getRaw() {
            return raw;
        }

        /**
         * Set raw
         **/
        public void setRaw(RawArtifact raw) {
            this.raw = raw;
        }

        public ArtifactPathsQueryParam raw(RawArtifact raw) {
            this.raw = raw;
            return this;
        }

        /**
        * If mode is set, apply the permission recursively into the artifact if it is a folder
        * @return recurseMode
        **/
        @JsonProperty("recurseMode")
        public Boolean getRecurseMode() {
            return recurseMode;
        }

        /**
         * Set recurseMode
         **/
        public void setRecurseMode(Boolean recurseMode) {
            this.recurseMode = recurseMode;
        }

        public ArtifactPathsQueryParam recurseMode(Boolean recurseMode) {
            this.recurseMode = recurseMode;
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

        public ArtifactPathsQueryParam s3(S3Artifact s3) {
            this.s3 = s3;
            return this;
        }

        /**
        * SubPath allows an artifact to be sourced from a subpath within the specified source
        * @return subPath
        **/
        @JsonProperty("subPath")
        public String getSubPath() {
            return subPath;
        }

        /**
         * Set subPath
         **/
        public void setSubPath(String subPath) {
            this.subPath = subPath;
        }

        public ArtifactPathsQueryParam subPath(String subPath) {
            this.subPath = subPath;
            return this;
        }

        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class ArtifactPathsQueryParam {\n");

            sb.append("    archive: ").append(toIndentedString(archive)).append("\n");
            sb.append("    archiveLogs: ").append(toIndentedString(archiveLogs)).append("\n");
            sb.append("    artifactGC: ").append(toIndentedString(artifactGC)).append("\n");
            sb.append("    artifactory: ").append(toIndentedString(artifactory)).append("\n");
            sb.append("    azure: ").append(toIndentedString(azure)).append("\n");
            sb.append("    deleted: ").append(toIndentedString(deleted)).append("\n");
            sb.append("    from: ").append(toIndentedString(from)).append("\n");
            sb.append("    fromExpression: ").append(toIndentedString(fromExpression)).append("\n");
            sb.append("    gcs: ").append(toIndentedString(gcs)).append("\n");
            sb.append("    git: ").append(toIndentedString(git)).append("\n");
            sb.append("    globalName: ").append(toIndentedString(globalName)).append("\n");
            sb.append("    hdfs: ").append(toIndentedString(hdfs)).append("\n");
            sb.append("    http: ").append(toIndentedString(http)).append("\n");
            sb.append("    mode: ").append(toIndentedString(mode)).append("\n");
            sb.append("    name: ").append(toIndentedString(name)).append("\n");
            sb.append("    optional: ").append(toIndentedString(optional)).append("\n");
            sb.append("    oss: ").append(toIndentedString(oss)).append("\n");
            sb.append("    path: ").append(toIndentedString(path)).append("\n");
            sb.append("    raw: ").append(toIndentedString(raw)).append("\n");
            sb.append("    recurseMode: ").append(toIndentedString(recurseMode)).append("\n");
            sb.append("    s3: ").append(toIndentedString(s3)).append("\n");
            sb.append("    subPath: ").append(toIndentedString(subPath)).append("\n");
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
