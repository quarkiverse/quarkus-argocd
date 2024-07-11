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
  * GCSArtifact is the location of a GCS artifact
 **/
public class GCSArtifact  {

    /**
      * GCSArtifact is the location of a GCS artifact
     **/
    private String bucket;
    /**
      * GCSArtifact is the location of a GCS artifact
     **/
    private String key;
    /**
      * GCSArtifact is the location of a GCS artifact
     **/
    private SecretKeySelector serviceAccountKeySecret;

    /**
    * Bucket is the name of the bucket
    * @return bucket
    **/
    @JsonProperty("bucket")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public String getBucket() {
        return bucket;
    }

    /**
     * Set bucket
     **/
    public void setBucket(String bucket) {
        this.bucket = bucket;
    }

    public GCSArtifact bucket(String bucket) {
        this.bucket = bucket;
        return this;
    }

    /**
    * Key is the path in the bucket where the artifact resides
    * @return key
    **/
    @JsonProperty("key")
    public String getKey() {
        return key;
    }

    /**
     * Set key
     **/
    public void setKey(String key) {
        this.key = key;
    }

    public GCSArtifact key(String key) {
        this.key = key;
        return this;
    }

    /**
    * Get serviceAccountKeySecret
    * @return serviceAccountKeySecret
    **/
    @JsonProperty("serviceAccountKeySecret")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public SecretKeySelector getServiceAccountKeySecret() {
        return serviceAccountKeySecret;
    }

    /**
     * Set serviceAccountKeySecret
     **/
    public void setServiceAccountKeySecret(SecretKeySelector serviceAccountKeySecret) {
        this.serviceAccountKeySecret = serviceAccountKeySecret;
    }

    public GCSArtifact serviceAccountKeySecret(SecretKeySelector serviceAccountKeySecret) {
        this.serviceAccountKeySecret = serviceAccountKeySecret;
        return this;
    }

    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GCSArtifact {\n");

        sb.append("    bucket: ").append(toIndentedString(bucket)).append("\n");
        sb.append("    key: ").append(toIndentedString(key)).append("\n");
        sb.append("    serviceAccountKeySecret: ").append(toIndentedString(serviceAccountKeySecret)).append("\n");
        
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
      * GCSArtifact is the location of a GCS artifact
     **/
    public static class GCSArtifactQueryParam  {

        /**
          * GCSArtifact is the location of a GCS artifact
         **/
        @jakarta.ws.rs.QueryParam("bucket")
        private String bucket;
        /**
          * GCSArtifact is the location of a GCS artifact
         **/
        @jakarta.ws.rs.QueryParam("key")
        private String key;
        /**
          * GCSArtifact is the location of a GCS artifact
         **/
        @jakarta.ws.rs.QueryParam("serviceAccountKeySecret")
        private SecretKeySelector serviceAccountKeySecret;

        /**
        * Bucket is the name of the bucket
        * @return bucket
        **/
        @JsonProperty("bucket")
        public String getBucket() {
            return bucket;
        }

        /**
         * Set bucket
         **/
        public void setBucket(String bucket) {
            this.bucket = bucket;
        }

        public GCSArtifactQueryParam bucket(String bucket) {
            this.bucket = bucket;
            return this;
        }

        /**
        * Key is the path in the bucket where the artifact resides
        * @return key
        **/
        @JsonProperty("key")
        public String getKey() {
            return key;
        }

        /**
         * Set key
         **/
        public void setKey(String key) {
            this.key = key;
        }

        public GCSArtifactQueryParam key(String key) {
            this.key = key;
            return this;
        }

        /**
        * Get serviceAccountKeySecret
        * @return serviceAccountKeySecret
        **/
        @JsonProperty("serviceAccountKeySecret")
        public SecretKeySelector getServiceAccountKeySecret() {
            return serviceAccountKeySecret;
        }

        /**
         * Set serviceAccountKeySecret
         **/
        public void setServiceAccountKeySecret(SecretKeySelector serviceAccountKeySecret) {
            this.serviceAccountKeySecret = serviceAccountKeySecret;
        }

        public GCSArtifactQueryParam serviceAccountKeySecret(SecretKeySelector serviceAccountKeySecret) {
            this.serviceAccountKeySecret = serviceAccountKeySecret;
            return this;
        }

        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class GCSArtifactQueryParam {\n");

            sb.append("    bucket: ").append(toIndentedString(bucket)).append("\n");
            sb.append("    key: ").append(toIndentedString(key)).append("\n");
            sb.append("    serviceAccountKeySecret: ").append(toIndentedString(serviceAccountKeySecret)).append("\n");
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