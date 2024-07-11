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
  * ArtifactLocation describes a location for a single or multiple artifacts. It is used as single artifact in the context of inputs/outputs (e.g. outputs.artifacts.artname). It is also used to describe the location of multiple artifacts such as the archive location of a single workflow step, which the executor will use as a default location to store its files.
 **/
public class ArtifactLocation  {

    /**
      * ArtifactLocation describes a location for a single or multiple artifacts. It is used as single artifact in the context of inputs/outputs (e.g. outputs.artifacts.artname). It is also used to describe the location of multiple artifacts such as the archive location of a single workflow step, which the executor will use as a default location to store its files.
     **/
    private Boolean archiveLogs;
    /**
      * ArtifactLocation describes a location for a single or multiple artifacts. It is used as single artifact in the context of inputs/outputs (e.g. outputs.artifacts.artname). It is also used to describe the location of multiple artifacts such as the archive location of a single workflow step, which the executor will use as a default location to store its files.
     **/
    private ArtifactoryArtifact artifactory;
    /**
      * ArtifactLocation describes a location for a single or multiple artifacts. It is used as single artifact in the context of inputs/outputs (e.g. outputs.artifacts.artname). It is also used to describe the location of multiple artifacts such as the archive location of a single workflow step, which the executor will use as a default location to store its files.
     **/
    private AzureArtifact azure;
    /**
      * ArtifactLocation describes a location for a single or multiple artifacts. It is used as single artifact in the context of inputs/outputs (e.g. outputs.artifacts.artname). It is also used to describe the location of multiple artifacts such as the archive location of a single workflow step, which the executor will use as a default location to store its files.
     **/
    private GCSArtifact gcs;
    /**
      * ArtifactLocation describes a location for a single or multiple artifacts. It is used as single artifact in the context of inputs/outputs (e.g. outputs.artifacts.artname). It is also used to describe the location of multiple artifacts such as the archive location of a single workflow step, which the executor will use as a default location to store its files.
     **/
    private GitArtifact git;
    /**
      * ArtifactLocation describes a location for a single or multiple artifacts. It is used as single artifact in the context of inputs/outputs (e.g. outputs.artifacts.artname). It is also used to describe the location of multiple artifacts such as the archive location of a single workflow step, which the executor will use as a default location to store its files.
     **/
    private HDFSArtifact hdfs;
    /**
      * ArtifactLocation describes a location for a single or multiple artifacts. It is used as single artifact in the context of inputs/outputs (e.g. outputs.artifacts.artname). It is also used to describe the location of multiple artifacts such as the archive location of a single workflow step, which the executor will use as a default location to store its files.
     **/
    private HTTPArtifact http;
    /**
      * ArtifactLocation describes a location for a single or multiple artifacts. It is used as single artifact in the context of inputs/outputs (e.g. outputs.artifacts.artname). It is also used to describe the location of multiple artifacts such as the archive location of a single workflow step, which the executor will use as a default location to store its files.
     **/
    private OSSArtifact oss;
    /**
      * ArtifactLocation describes a location for a single or multiple artifacts. It is used as single artifact in the context of inputs/outputs (e.g. outputs.artifacts.artname). It is also used to describe the location of multiple artifacts such as the archive location of a single workflow step, which the executor will use as a default location to store its files.
     **/
    private RawArtifact raw;
    /**
      * ArtifactLocation describes a location for a single or multiple artifacts. It is used as single artifact in the context of inputs/outputs (e.g. outputs.artifacts.artname). It is also used to describe the location of multiple artifacts such as the archive location of a single workflow step, which the executor will use as a default location to store its files.
     **/
    private S3Artifact s3;

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

    public ArtifactLocation archiveLogs(Boolean archiveLogs) {
        this.archiveLogs = archiveLogs;
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

    public ArtifactLocation artifactory(ArtifactoryArtifact artifactory) {
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

    public ArtifactLocation azure(AzureArtifact azure) {
        this.azure = azure;
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

    public ArtifactLocation gcs(GCSArtifact gcs) {
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

    public ArtifactLocation git(GitArtifact git) {
        this.git = git;
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

    public ArtifactLocation hdfs(HDFSArtifact hdfs) {
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

    public ArtifactLocation http(HTTPArtifact http) {
        this.http = http;
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

    public ArtifactLocation oss(OSSArtifact oss) {
        this.oss = oss;
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

    public ArtifactLocation raw(RawArtifact raw) {
        this.raw = raw;
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
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ArtifactLocation {\n");

        sb.append("    archiveLogs: ").append(toIndentedString(archiveLogs)).append("\n");
        sb.append("    artifactory: ").append(toIndentedString(artifactory)).append("\n");
        sb.append("    azure: ").append(toIndentedString(azure)).append("\n");
        sb.append("    gcs: ").append(toIndentedString(gcs)).append("\n");
        sb.append("    git: ").append(toIndentedString(git)).append("\n");
        sb.append("    hdfs: ").append(toIndentedString(hdfs)).append("\n");
        sb.append("    http: ").append(toIndentedString(http)).append("\n");
        sb.append("    oss: ").append(toIndentedString(oss)).append("\n");
        sb.append("    raw: ").append(toIndentedString(raw)).append("\n");
        sb.append("    s3: ").append(toIndentedString(s3)).append("\n");
        
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
      * ArtifactLocation describes a location for a single or multiple artifacts. It is used as single artifact in the context of inputs/outputs (e.g. outputs.artifacts.artname). It is also used to describe the location of multiple artifacts such as the archive location of a single workflow step, which the executor will use as a default location to store its files.
     **/
    public static class ArtifactLocationQueryParam  {

        /**
          * ArtifactLocation describes a location for a single or multiple artifacts. It is used as single artifact in the context of inputs/outputs (e.g. outputs.artifacts.artname). It is also used to describe the location of multiple artifacts such as the archive location of a single workflow step, which the executor will use as a default location to store its files.
         **/
        @jakarta.ws.rs.QueryParam("archiveLogs")
        private Boolean archiveLogs;
        /**
          * ArtifactLocation describes a location for a single or multiple artifacts. It is used as single artifact in the context of inputs/outputs (e.g. outputs.artifacts.artname). It is also used to describe the location of multiple artifacts such as the archive location of a single workflow step, which the executor will use as a default location to store its files.
         **/
        @jakarta.ws.rs.QueryParam("artifactory")
        private ArtifactoryArtifact artifactory;
        /**
          * ArtifactLocation describes a location for a single or multiple artifacts. It is used as single artifact in the context of inputs/outputs (e.g. outputs.artifacts.artname). It is also used to describe the location of multiple artifacts such as the archive location of a single workflow step, which the executor will use as a default location to store its files.
         **/
        @jakarta.ws.rs.QueryParam("azure")
        private AzureArtifact azure;
        /**
          * ArtifactLocation describes a location for a single or multiple artifacts. It is used as single artifact in the context of inputs/outputs (e.g. outputs.artifacts.artname). It is also used to describe the location of multiple artifacts such as the archive location of a single workflow step, which the executor will use as a default location to store its files.
         **/
        @jakarta.ws.rs.QueryParam("gcs")
        private GCSArtifact gcs;
        /**
          * ArtifactLocation describes a location for a single or multiple artifacts. It is used as single artifact in the context of inputs/outputs (e.g. outputs.artifacts.artname). It is also used to describe the location of multiple artifacts such as the archive location of a single workflow step, which the executor will use as a default location to store its files.
         **/
        @jakarta.ws.rs.QueryParam("git")
        private GitArtifact git;
        /**
          * ArtifactLocation describes a location for a single or multiple artifacts. It is used as single artifact in the context of inputs/outputs (e.g. outputs.artifacts.artname). It is also used to describe the location of multiple artifacts such as the archive location of a single workflow step, which the executor will use as a default location to store its files.
         **/
        @jakarta.ws.rs.QueryParam("hdfs")
        private HDFSArtifact hdfs;
        /**
          * ArtifactLocation describes a location for a single or multiple artifacts. It is used as single artifact in the context of inputs/outputs (e.g. outputs.artifacts.artname). It is also used to describe the location of multiple artifacts such as the archive location of a single workflow step, which the executor will use as a default location to store its files.
         **/
        @jakarta.ws.rs.QueryParam("http")
        private HTTPArtifact http;
        /**
          * ArtifactLocation describes a location for a single or multiple artifacts. It is used as single artifact in the context of inputs/outputs (e.g. outputs.artifacts.artname). It is also used to describe the location of multiple artifacts such as the archive location of a single workflow step, which the executor will use as a default location to store its files.
         **/
        @jakarta.ws.rs.QueryParam("oss")
        private OSSArtifact oss;
        /**
          * ArtifactLocation describes a location for a single or multiple artifacts. It is used as single artifact in the context of inputs/outputs (e.g. outputs.artifacts.artname). It is also used to describe the location of multiple artifacts such as the archive location of a single workflow step, which the executor will use as a default location to store its files.
         **/
        @jakarta.ws.rs.QueryParam("raw")
        private RawArtifact raw;
        /**
          * ArtifactLocation describes a location for a single or multiple artifacts. It is used as single artifact in the context of inputs/outputs (e.g. outputs.artifacts.artname). It is also used to describe the location of multiple artifacts such as the archive location of a single workflow step, which the executor will use as a default location to store its files.
         **/
        @jakarta.ws.rs.QueryParam("s3")
        private S3Artifact s3;

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

        public ArtifactLocationQueryParam archiveLogs(Boolean archiveLogs) {
            this.archiveLogs = archiveLogs;
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

        public ArtifactLocationQueryParam artifactory(ArtifactoryArtifact artifactory) {
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

        public ArtifactLocationQueryParam azure(AzureArtifact azure) {
            this.azure = azure;
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

        public ArtifactLocationQueryParam gcs(GCSArtifact gcs) {
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

        public ArtifactLocationQueryParam git(GitArtifact git) {
            this.git = git;
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

        public ArtifactLocationQueryParam hdfs(HDFSArtifact hdfs) {
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

        public ArtifactLocationQueryParam http(HTTPArtifact http) {
            this.http = http;
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

        public ArtifactLocationQueryParam oss(OSSArtifact oss) {
            this.oss = oss;
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

        public ArtifactLocationQueryParam raw(RawArtifact raw) {
            this.raw = raw;
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
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class ArtifactLocationQueryParam {\n");

            sb.append("    archiveLogs: ").append(toIndentedString(archiveLogs)).append("\n");
            sb.append("    artifactory: ").append(toIndentedString(artifactory)).append("\n");
            sb.append("    azure: ").append(toIndentedString(azure)).append("\n");
            sb.append("    gcs: ").append(toIndentedString(gcs)).append("\n");
            sb.append("    git: ").append(toIndentedString(git)).append("\n");
            sb.append("    hdfs: ").append(toIndentedString(hdfs)).append("\n");
            sb.append("    http: ").append(toIndentedString(http)).append("\n");
            sb.append("    oss: ").append(toIndentedString(oss)).append("\n");
            sb.append("    raw: ").append(toIndentedString(raw)).append("\n");
            sb.append("    s3: ").append(toIndentedString(s3)).append("\n");
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
