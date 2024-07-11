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
  * GCSArtifactRepository defines the controller configuration for a GCS artifact repository
 **/
public class GCSArtifactRepository  {

    /**
      * GCSArtifactRepository defines the controller configuration for a GCS artifact repository
     **/
    private String bucket;
    /**
      * GCSArtifactRepository defines the controller configuration for a GCS artifact repository
     **/
    private String keyFormat;
    /**
      * GCSArtifactRepository defines the controller configuration for a GCS artifact repository
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

    public GCSArtifactRepository bucket(String bucket) {
        this.bucket = bucket;
        return this;
    }

    /**
    * KeyFormat defines the format of how to store keys and can reference workflow variables.
    * @return keyFormat
    **/
    @JsonProperty("keyFormat")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public String getKeyFormat() {
        return keyFormat;
    }

    /**
     * Set keyFormat
     **/
    public void setKeyFormat(String keyFormat) {
        this.keyFormat = keyFormat;
    }

    public GCSArtifactRepository keyFormat(String keyFormat) {
        this.keyFormat = keyFormat;
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

    public GCSArtifactRepository serviceAccountKeySecret(SecretKeySelector serviceAccountKeySecret) {
        this.serviceAccountKeySecret = serviceAccountKeySecret;
        return this;
    }

    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GCSArtifactRepository {\n");

        sb.append("    bucket: ").append(toIndentedString(bucket)).append("\n");
        sb.append("    keyFormat: ").append(toIndentedString(keyFormat)).append("\n");
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
      * GCSArtifactRepository defines the controller configuration for a GCS artifact repository
     **/
    public static class GCSArtifactRepositoryQueryParam  {

        /**
          * GCSArtifactRepository defines the controller configuration for a GCS artifact repository
         **/
        @jakarta.ws.rs.QueryParam("bucket")
        private String bucket;
        /**
          * GCSArtifactRepository defines the controller configuration for a GCS artifact repository
         **/
        @jakarta.ws.rs.QueryParam("keyFormat")
        private String keyFormat;
        /**
          * GCSArtifactRepository defines the controller configuration for a GCS artifact repository
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

        public GCSArtifactRepositoryQueryParam bucket(String bucket) {
            this.bucket = bucket;
            return this;
        }

        /**
        * KeyFormat defines the format of how to store keys and can reference workflow variables.
        * @return keyFormat
        **/
        @JsonProperty("keyFormat")
        public String getKeyFormat() {
            return keyFormat;
        }

        /**
         * Set keyFormat
         **/
        public void setKeyFormat(String keyFormat) {
            this.keyFormat = keyFormat;
        }

        public GCSArtifactRepositoryQueryParam keyFormat(String keyFormat) {
            this.keyFormat = keyFormat;
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

        public GCSArtifactRepositoryQueryParam serviceAccountKeySecret(SecretKeySelector serviceAccountKeySecret) {
            this.serviceAccountKeySecret = serviceAccountKeySecret;
            return this;
        }

        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class GCSArtifactRepositoryQueryParam {\n");

            sb.append("    bucket: ").append(toIndentedString(bucket)).append("\n");
            sb.append("    keyFormat: ").append(toIndentedString(keyFormat)).append("\n");
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