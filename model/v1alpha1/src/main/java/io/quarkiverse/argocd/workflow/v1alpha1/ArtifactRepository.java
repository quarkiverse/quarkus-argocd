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
  * ArtifactRepository represents an artifact repository in which a controller will store its artifacts
 **/
public class ArtifactRepository  {

    /**
      * ArtifactRepository represents an artifact repository in which a controller will store its artifacts
     **/
    private Boolean archiveLogs;
    /**
      * ArtifactRepository represents an artifact repository in which a controller will store its artifacts
     **/
    private ArtifactoryArtifactRepository artifactory;
    /**
      * ArtifactRepository represents an artifact repository in which a controller will store its artifacts
     **/
    private AzureArtifactRepository azure;
    /**
      * ArtifactRepository represents an artifact repository in which a controller will store its artifacts
     **/
    private GCSArtifactRepository gcs;
    /**
      * ArtifactRepository represents an artifact repository in which a controller will store its artifacts
     **/
    private HDFSArtifactRepository hdfs;
    /**
      * ArtifactRepository represents an artifact repository in which a controller will store its artifacts
     **/
    private OSSArtifactRepository oss;
    /**
      * ArtifactRepository represents an artifact repository in which a controller will store its artifacts
     **/
    private S3ArtifactRepository s3;

    /**
    * ArchiveLogs enables log archiving
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

    public ArtifactRepository archiveLogs(Boolean archiveLogs) {
        this.archiveLogs = archiveLogs;
        return this;
    }

    /**
    * Get artifactory
    * @return artifactory
    **/
    @JsonProperty("artifactory")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public ArtifactoryArtifactRepository getArtifactory() {
        return artifactory;
    }

    /**
     * Set artifactory
     **/
    public void setArtifactory(ArtifactoryArtifactRepository artifactory) {
        this.artifactory = artifactory;
    }

    public ArtifactRepository artifactory(ArtifactoryArtifactRepository artifactory) {
        this.artifactory = artifactory;
        return this;
    }

    /**
    * Get azure
    * @return azure
    **/
    @JsonProperty("azure")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public AzureArtifactRepository getAzure() {
        return azure;
    }

    /**
     * Set azure
     **/
    public void setAzure(AzureArtifactRepository azure) {
        this.azure = azure;
    }

    public ArtifactRepository azure(AzureArtifactRepository azure) {
        this.azure = azure;
        return this;
    }

    /**
    * Get gcs
    * @return gcs
    **/
    @JsonProperty("gcs")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public GCSArtifactRepository getGcs() {
        return gcs;
    }

    /**
     * Set gcs
     **/
    public void setGcs(GCSArtifactRepository gcs) {
        this.gcs = gcs;
    }

    public ArtifactRepository gcs(GCSArtifactRepository gcs) {
        this.gcs = gcs;
        return this;
    }

    /**
    * Get hdfs
    * @return hdfs
    **/
    @JsonProperty("hdfs")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public HDFSArtifactRepository getHdfs() {
        return hdfs;
    }

    /**
     * Set hdfs
     **/
    public void setHdfs(HDFSArtifactRepository hdfs) {
        this.hdfs = hdfs;
    }

    public ArtifactRepository hdfs(HDFSArtifactRepository hdfs) {
        this.hdfs = hdfs;
        return this;
    }

    /**
    * Get oss
    * @return oss
    **/
    @JsonProperty("oss")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public OSSArtifactRepository getOss() {
        return oss;
    }

    /**
     * Set oss
     **/
    public void setOss(OSSArtifactRepository oss) {
        this.oss = oss;
    }

    public ArtifactRepository oss(OSSArtifactRepository oss) {
        this.oss = oss;
        return this;
    }

    /**
    * Get s3
    * @return s3
    **/
    @JsonProperty("s3")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public S3ArtifactRepository getS3() {
        return s3;
    }

    /**
     * Set s3
     **/
    public void setS3(S3ArtifactRepository s3) {
        this.s3 = s3;
    }

    public ArtifactRepository s3(S3ArtifactRepository s3) {
        this.s3 = s3;
        return this;
    }

    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ArtifactRepository {\n");

        sb.append("    archiveLogs: ").append(toIndentedString(archiveLogs)).append("\n");
        sb.append("    artifactory: ").append(toIndentedString(artifactory)).append("\n");
        sb.append("    azure: ").append(toIndentedString(azure)).append("\n");
        sb.append("    gcs: ").append(toIndentedString(gcs)).append("\n");
        sb.append("    hdfs: ").append(toIndentedString(hdfs)).append("\n");
        sb.append("    oss: ").append(toIndentedString(oss)).append("\n");
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
      * ArtifactRepository represents an artifact repository in which a controller will store its artifacts
     **/
    public static class ArtifactRepositoryQueryParam  {

        /**
          * ArtifactRepository represents an artifact repository in which a controller will store its artifacts
         **/
        @jakarta.ws.rs.QueryParam("archiveLogs")
        private Boolean archiveLogs;
        /**
          * ArtifactRepository represents an artifact repository in which a controller will store its artifacts
         **/
        @jakarta.ws.rs.QueryParam("artifactory")
        private ArtifactoryArtifactRepository artifactory;
        /**
          * ArtifactRepository represents an artifact repository in which a controller will store its artifacts
         **/
        @jakarta.ws.rs.QueryParam("azure")
        private AzureArtifactRepository azure;
        /**
          * ArtifactRepository represents an artifact repository in which a controller will store its artifacts
         **/
        @jakarta.ws.rs.QueryParam("gcs")
        private GCSArtifactRepository gcs;
        /**
          * ArtifactRepository represents an artifact repository in which a controller will store its artifacts
         **/
        @jakarta.ws.rs.QueryParam("hdfs")
        private HDFSArtifactRepository hdfs;
        /**
          * ArtifactRepository represents an artifact repository in which a controller will store its artifacts
         **/
        @jakarta.ws.rs.QueryParam("oss")
        private OSSArtifactRepository oss;
        /**
          * ArtifactRepository represents an artifact repository in which a controller will store its artifacts
         **/
        @jakarta.ws.rs.QueryParam("s3")
        private S3ArtifactRepository s3;

        /**
        * ArchiveLogs enables log archiving
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

        public ArtifactRepositoryQueryParam archiveLogs(Boolean archiveLogs) {
            this.archiveLogs = archiveLogs;
            return this;
        }

        /**
        * Get artifactory
        * @return artifactory
        **/
        @JsonProperty("artifactory")
        public ArtifactoryArtifactRepository getArtifactory() {
            return artifactory;
        }

        /**
         * Set artifactory
         **/
        public void setArtifactory(ArtifactoryArtifactRepository artifactory) {
            this.artifactory = artifactory;
        }

        public ArtifactRepositoryQueryParam artifactory(ArtifactoryArtifactRepository artifactory) {
            this.artifactory = artifactory;
            return this;
        }

        /**
        * Get azure
        * @return azure
        **/
        @JsonProperty("azure")
        public AzureArtifactRepository getAzure() {
            return azure;
        }

        /**
         * Set azure
         **/
        public void setAzure(AzureArtifactRepository azure) {
            this.azure = azure;
        }

        public ArtifactRepositoryQueryParam azure(AzureArtifactRepository azure) {
            this.azure = azure;
            return this;
        }

        /**
        * Get gcs
        * @return gcs
        **/
        @JsonProperty("gcs")
        public GCSArtifactRepository getGcs() {
            return gcs;
        }

        /**
         * Set gcs
         **/
        public void setGcs(GCSArtifactRepository gcs) {
            this.gcs = gcs;
        }

        public ArtifactRepositoryQueryParam gcs(GCSArtifactRepository gcs) {
            this.gcs = gcs;
            return this;
        }

        /**
        * Get hdfs
        * @return hdfs
        **/
        @JsonProperty("hdfs")
        public HDFSArtifactRepository getHdfs() {
            return hdfs;
        }

        /**
         * Set hdfs
         **/
        public void setHdfs(HDFSArtifactRepository hdfs) {
            this.hdfs = hdfs;
        }

        public ArtifactRepositoryQueryParam hdfs(HDFSArtifactRepository hdfs) {
            this.hdfs = hdfs;
            return this;
        }

        /**
        * Get oss
        * @return oss
        **/
        @JsonProperty("oss")
        public OSSArtifactRepository getOss() {
            return oss;
        }

        /**
         * Set oss
         **/
        public void setOss(OSSArtifactRepository oss) {
            this.oss = oss;
        }

        public ArtifactRepositoryQueryParam oss(OSSArtifactRepository oss) {
            this.oss = oss;
            return this;
        }

        /**
        * Get s3
        * @return s3
        **/
        @JsonProperty("s3")
        public S3ArtifactRepository getS3() {
            return s3;
        }

        /**
         * Set s3
         **/
        public void setS3(S3ArtifactRepository s3) {
            this.s3 = s3;
        }

        public ArtifactRepositoryQueryParam s3(S3ArtifactRepository s3) {
            this.s3 = s3;
            return this;
        }

        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class ArtifactRepositoryQueryParam {\n");

            sb.append("    archiveLogs: ").append(toIndentedString(archiveLogs)).append("\n");
            sb.append("    artifactory: ").append(toIndentedString(artifactory)).append("\n");
            sb.append("    azure: ").append(toIndentedString(azure)).append("\n");
            sb.append("    gcs: ").append(toIndentedString(gcs)).append("\n");
            sb.append("    hdfs: ").append(toIndentedString(hdfs)).append("\n");
            sb.append("    oss: ").append(toIndentedString(oss)).append("\n");
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
