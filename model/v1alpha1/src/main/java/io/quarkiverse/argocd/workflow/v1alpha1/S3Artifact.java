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
  * S3Artifact is the location of an S3 artifact
 **/
public class S3Artifact  {

    /**
      * S3Artifact is the location of an S3 artifact
     **/
    private SecretKeySelector accessKeySecret;
    /**
      * S3Artifact is the location of an S3 artifact
     **/
    private String bucket;
    /**
      * S3Artifact is the location of an S3 artifact
     **/
    private SecretKeySelector caSecret;
    /**
      * S3Artifact is the location of an S3 artifact
     **/
    private CreateS3BucketOptions createBucketIfNotPresent;
    /**
      * S3Artifact is the location of an S3 artifact
     **/
    private S3EncryptionOptions encryptionOptions;
    /**
      * S3Artifact is the location of an S3 artifact
     **/
    private String endpoint;
    /**
      * S3Artifact is the location of an S3 artifact
     **/
    private Boolean insecure;
    /**
      * S3Artifact is the location of an S3 artifact
     **/
    private String key;
    /**
      * S3Artifact is the location of an S3 artifact
     **/
    private String region;
    /**
      * S3Artifact is the location of an S3 artifact
     **/
    private String roleARN;
    /**
      * S3Artifact is the location of an S3 artifact
     **/
    private SecretKeySelector secretKeySecret;
    /**
      * S3Artifact is the location of an S3 artifact
     **/
    private Boolean useSDKCreds;

    /**
    * Get accessKeySecret
    * @return accessKeySecret
    **/
    @JsonProperty("accessKeySecret")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public SecretKeySelector getAccessKeySecret() {
        return accessKeySecret;
    }

    /**
     * Set accessKeySecret
     **/
    public void setAccessKeySecret(SecretKeySelector accessKeySecret) {
        this.accessKeySecret = accessKeySecret;
    }

    public S3Artifact accessKeySecret(SecretKeySelector accessKeySecret) {
        this.accessKeySecret = accessKeySecret;
        return this;
    }

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

    public S3Artifact bucket(String bucket) {
        this.bucket = bucket;
        return this;
    }

    /**
    * Get caSecret
    * @return caSecret
    **/
    @JsonProperty("caSecret")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public SecretKeySelector getCaSecret() {
        return caSecret;
    }

    /**
     * Set caSecret
     **/
    public void setCaSecret(SecretKeySelector caSecret) {
        this.caSecret = caSecret;
    }

    public S3Artifact caSecret(SecretKeySelector caSecret) {
        this.caSecret = caSecret;
        return this;
    }

    /**
    * Get createBucketIfNotPresent
    * @return createBucketIfNotPresent
    **/
    @JsonProperty("createBucketIfNotPresent")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public CreateS3BucketOptions getCreateBucketIfNotPresent() {
        return createBucketIfNotPresent;
    }

    /**
     * Set createBucketIfNotPresent
     **/
    public void setCreateBucketIfNotPresent(CreateS3BucketOptions createBucketIfNotPresent) {
        this.createBucketIfNotPresent = createBucketIfNotPresent;
    }

    public S3Artifact createBucketIfNotPresent(CreateS3BucketOptions createBucketIfNotPresent) {
        this.createBucketIfNotPresent = createBucketIfNotPresent;
        return this;
    }

    /**
    * Get encryptionOptions
    * @return encryptionOptions
    **/
    @JsonProperty("encryptionOptions")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public S3EncryptionOptions getEncryptionOptions() {
        return encryptionOptions;
    }

    /**
     * Set encryptionOptions
     **/
    public void setEncryptionOptions(S3EncryptionOptions encryptionOptions) {
        this.encryptionOptions = encryptionOptions;
    }

    public S3Artifact encryptionOptions(S3EncryptionOptions encryptionOptions) {
        this.encryptionOptions = encryptionOptions;
        return this;
    }

    /**
    * Endpoint is the hostname of the bucket endpoint
    * @return endpoint
    **/
    @JsonProperty("endpoint")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public String getEndpoint() {
        return endpoint;
    }

    /**
     * Set endpoint
     **/
    public void setEndpoint(String endpoint) {
        this.endpoint = endpoint;
    }

    public S3Artifact endpoint(String endpoint) {
        this.endpoint = endpoint;
        return this;
    }

    /**
    * Insecure will connect to the service with TLS
    * @return insecure
    **/
    @JsonProperty("insecure")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public Boolean getInsecure() {
        return insecure;
    }

    /**
     * Set insecure
     **/
    public void setInsecure(Boolean insecure) {
        this.insecure = insecure;
    }

    public S3Artifact insecure(Boolean insecure) {
        this.insecure = insecure;
        return this;
    }

    /**
    * Key is the key in the bucket where the artifact resides
    * @return key
    **/
    @JsonProperty("key")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public String getKey() {
        return key;
    }

    /**
     * Set key
     **/
    public void setKey(String key) {
        this.key = key;
    }

    public S3Artifact key(String key) {
        this.key = key;
        return this;
    }

    /**
    * Region contains the optional bucket region
    * @return region
    **/
    @JsonProperty("region")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public String getRegion() {
        return region;
    }

    /**
     * Set region
     **/
    public void setRegion(String region) {
        this.region = region;
    }

    public S3Artifact region(String region) {
        this.region = region;
        return this;
    }

    /**
    * RoleARN is the Amazon Resource Name (ARN) of the role to assume.
    * @return roleARN
    **/
    @JsonProperty("roleARN")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public String getRoleARN() {
        return roleARN;
    }

    /**
     * Set roleARN
     **/
    public void setRoleARN(String roleARN) {
        this.roleARN = roleARN;
    }

    public S3Artifact roleARN(String roleARN) {
        this.roleARN = roleARN;
        return this;
    }

    /**
    * Get secretKeySecret
    * @return secretKeySecret
    **/
    @JsonProperty("secretKeySecret")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public SecretKeySelector getSecretKeySecret() {
        return secretKeySecret;
    }

    /**
     * Set secretKeySecret
     **/
    public void setSecretKeySecret(SecretKeySelector secretKeySecret) {
        this.secretKeySecret = secretKeySecret;
    }

    public S3Artifact secretKeySecret(SecretKeySelector secretKeySecret) {
        this.secretKeySecret = secretKeySecret;
        return this;
    }

    /**
    * UseSDKCreds tells the driver to figure out credentials based on sdk defaults.
    * @return useSDKCreds
    **/
    @JsonProperty("useSDKCreds")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public Boolean getUseSDKCreds() {
        return useSDKCreds;
    }

    /**
     * Set useSDKCreds
     **/
    public void setUseSDKCreds(Boolean useSDKCreds) {
        this.useSDKCreds = useSDKCreds;
    }

    public S3Artifact useSDKCreds(Boolean useSDKCreds) {
        this.useSDKCreds = useSDKCreds;
        return this;
    }

    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class S3Artifact {\n");

        sb.append("    accessKeySecret: ").append(toIndentedString(accessKeySecret)).append("\n");
        sb.append("    bucket: ").append(toIndentedString(bucket)).append("\n");
        sb.append("    caSecret: ").append(toIndentedString(caSecret)).append("\n");
        sb.append("    createBucketIfNotPresent: ").append(toIndentedString(createBucketIfNotPresent)).append("\n");
        sb.append("    encryptionOptions: ").append(toIndentedString(encryptionOptions)).append("\n");
        sb.append("    endpoint: ").append(toIndentedString(endpoint)).append("\n");
        sb.append("    insecure: ").append(toIndentedString(insecure)).append("\n");
        sb.append("    key: ").append(toIndentedString(key)).append("\n");
        sb.append("    region: ").append(toIndentedString(region)).append("\n");
        sb.append("    roleARN: ").append(toIndentedString(roleARN)).append("\n");
        sb.append("    secretKeySecret: ").append(toIndentedString(secretKeySecret)).append("\n");
        sb.append("    useSDKCreds: ").append(toIndentedString(useSDKCreds)).append("\n");
        
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
      * S3Artifact is the location of an S3 artifact
     **/
    public static class S3ArtifactQueryParam  {

        /**
          * S3Artifact is the location of an S3 artifact
         **/
        @jakarta.ws.rs.QueryParam("accessKeySecret")
        private SecretKeySelector accessKeySecret;
        /**
          * S3Artifact is the location of an S3 artifact
         **/
        @jakarta.ws.rs.QueryParam("bucket")
        private String bucket;
        /**
          * S3Artifact is the location of an S3 artifact
         **/
        @jakarta.ws.rs.QueryParam("caSecret")
        private SecretKeySelector caSecret;
        /**
          * S3Artifact is the location of an S3 artifact
         **/
        @jakarta.ws.rs.QueryParam("createBucketIfNotPresent")
        private CreateS3BucketOptions createBucketIfNotPresent;
        /**
          * S3Artifact is the location of an S3 artifact
         **/
        @jakarta.ws.rs.QueryParam("encryptionOptions")
        private S3EncryptionOptions encryptionOptions;
        /**
          * S3Artifact is the location of an S3 artifact
         **/
        @jakarta.ws.rs.QueryParam("endpoint")
        private String endpoint;
        /**
          * S3Artifact is the location of an S3 artifact
         **/
        @jakarta.ws.rs.QueryParam("insecure")
        private Boolean insecure;
        /**
          * S3Artifact is the location of an S3 artifact
         **/
        @jakarta.ws.rs.QueryParam("key")
        private String key;
        /**
          * S3Artifact is the location of an S3 artifact
         **/
        @jakarta.ws.rs.QueryParam("region")
        private String region;
        /**
          * S3Artifact is the location of an S3 artifact
         **/
        @jakarta.ws.rs.QueryParam("roleARN")
        private String roleARN;
        /**
          * S3Artifact is the location of an S3 artifact
         **/
        @jakarta.ws.rs.QueryParam("secretKeySecret")
        private SecretKeySelector secretKeySecret;
        /**
          * S3Artifact is the location of an S3 artifact
         **/
        @jakarta.ws.rs.QueryParam("useSDKCreds")
        private Boolean useSDKCreds;

        /**
        * Get accessKeySecret
        * @return accessKeySecret
        **/
        @JsonProperty("accessKeySecret")
        public SecretKeySelector getAccessKeySecret() {
            return accessKeySecret;
        }

        /**
         * Set accessKeySecret
         **/
        public void setAccessKeySecret(SecretKeySelector accessKeySecret) {
            this.accessKeySecret = accessKeySecret;
        }

        public S3ArtifactQueryParam accessKeySecret(SecretKeySelector accessKeySecret) {
            this.accessKeySecret = accessKeySecret;
            return this;
        }

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

        public S3ArtifactQueryParam bucket(String bucket) {
            this.bucket = bucket;
            return this;
        }

        /**
        * Get caSecret
        * @return caSecret
        **/
        @JsonProperty("caSecret")
        public SecretKeySelector getCaSecret() {
            return caSecret;
        }

        /**
         * Set caSecret
         **/
        public void setCaSecret(SecretKeySelector caSecret) {
            this.caSecret = caSecret;
        }

        public S3ArtifactQueryParam caSecret(SecretKeySelector caSecret) {
            this.caSecret = caSecret;
            return this;
        }

        /**
        * Get createBucketIfNotPresent
        * @return createBucketIfNotPresent
        **/
        @JsonProperty("createBucketIfNotPresent")
        public CreateS3BucketOptions getCreateBucketIfNotPresent() {
            return createBucketIfNotPresent;
        }

        /**
         * Set createBucketIfNotPresent
         **/
        public void setCreateBucketIfNotPresent(CreateS3BucketOptions createBucketIfNotPresent) {
            this.createBucketIfNotPresent = createBucketIfNotPresent;
        }

        public S3ArtifactQueryParam createBucketIfNotPresent(CreateS3BucketOptions createBucketIfNotPresent) {
            this.createBucketIfNotPresent = createBucketIfNotPresent;
            return this;
        }

        /**
        * Get encryptionOptions
        * @return encryptionOptions
        **/
        @JsonProperty("encryptionOptions")
        public S3EncryptionOptions getEncryptionOptions() {
            return encryptionOptions;
        }

        /**
         * Set encryptionOptions
         **/
        public void setEncryptionOptions(S3EncryptionOptions encryptionOptions) {
            this.encryptionOptions = encryptionOptions;
        }

        public S3ArtifactQueryParam encryptionOptions(S3EncryptionOptions encryptionOptions) {
            this.encryptionOptions = encryptionOptions;
            return this;
        }

        /**
        * Endpoint is the hostname of the bucket endpoint
        * @return endpoint
        **/
        @JsonProperty("endpoint")
        public String getEndpoint() {
            return endpoint;
        }

        /**
         * Set endpoint
         **/
        public void setEndpoint(String endpoint) {
            this.endpoint = endpoint;
        }

        public S3ArtifactQueryParam endpoint(String endpoint) {
            this.endpoint = endpoint;
            return this;
        }

        /**
        * Insecure will connect to the service with TLS
        * @return insecure
        **/
        @JsonProperty("insecure")
        public Boolean getInsecure() {
            return insecure;
        }

        /**
         * Set insecure
         **/
        public void setInsecure(Boolean insecure) {
            this.insecure = insecure;
        }

        public S3ArtifactQueryParam insecure(Boolean insecure) {
            this.insecure = insecure;
            return this;
        }

        /**
        * Key is the key in the bucket where the artifact resides
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

        public S3ArtifactQueryParam key(String key) {
            this.key = key;
            return this;
        }

        /**
        * Region contains the optional bucket region
        * @return region
        **/
        @JsonProperty("region")
        public String getRegion() {
            return region;
        }

        /**
         * Set region
         **/
        public void setRegion(String region) {
            this.region = region;
        }

        public S3ArtifactQueryParam region(String region) {
            this.region = region;
            return this;
        }

        /**
        * RoleARN is the Amazon Resource Name (ARN) of the role to assume.
        * @return roleARN
        **/
        @JsonProperty("roleARN")
        public String getRoleARN() {
            return roleARN;
        }

        /**
         * Set roleARN
         **/
        public void setRoleARN(String roleARN) {
            this.roleARN = roleARN;
        }

        public S3ArtifactQueryParam roleARN(String roleARN) {
            this.roleARN = roleARN;
            return this;
        }

        /**
        * Get secretKeySecret
        * @return secretKeySecret
        **/
        @JsonProperty("secretKeySecret")
        public SecretKeySelector getSecretKeySecret() {
            return secretKeySecret;
        }

        /**
         * Set secretKeySecret
         **/
        public void setSecretKeySecret(SecretKeySelector secretKeySecret) {
            this.secretKeySecret = secretKeySecret;
        }

        public S3ArtifactQueryParam secretKeySecret(SecretKeySelector secretKeySecret) {
            this.secretKeySecret = secretKeySecret;
            return this;
        }

        /**
        * UseSDKCreds tells the driver to figure out credentials based on sdk defaults.
        * @return useSDKCreds
        **/
        @JsonProperty("useSDKCreds")
        public Boolean getUseSDKCreds() {
            return useSDKCreds;
        }

        /**
         * Set useSDKCreds
         **/
        public void setUseSDKCreds(Boolean useSDKCreds) {
            this.useSDKCreds = useSDKCreds;
        }

        public S3ArtifactQueryParam useSDKCreds(Boolean useSDKCreds) {
            this.useSDKCreds = useSDKCreds;
            return this;
        }

        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class S3ArtifactQueryParam {\n");

            sb.append("    accessKeySecret: ").append(toIndentedString(accessKeySecret)).append("\n");
            sb.append("    bucket: ").append(toIndentedString(bucket)).append("\n");
            sb.append("    caSecret: ").append(toIndentedString(caSecret)).append("\n");
            sb.append("    createBucketIfNotPresent: ").append(toIndentedString(createBucketIfNotPresent)).append("\n");
            sb.append("    encryptionOptions: ").append(toIndentedString(encryptionOptions)).append("\n");
            sb.append("    endpoint: ").append(toIndentedString(endpoint)).append("\n");
            sb.append("    insecure: ").append(toIndentedString(insecure)).append("\n");
            sb.append("    key: ").append(toIndentedString(key)).append("\n");
            sb.append("    region: ").append(toIndentedString(region)).append("\n");
            sb.append("    roleARN: ").append(toIndentedString(roleARN)).append("\n");
            sb.append("    secretKeySecret: ").append(toIndentedString(secretKeySecret)).append("\n");
            sb.append("    useSDKCreds: ").append(toIndentedString(useSDKCreds)).append("\n");
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
