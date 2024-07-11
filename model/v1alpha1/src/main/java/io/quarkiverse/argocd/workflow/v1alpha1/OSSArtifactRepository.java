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
  * OSSArtifactRepository defines the controller configuration for an OSS artifact repository
 **/
public class OSSArtifactRepository  {

    /**
      * OSSArtifactRepository defines the controller configuration for an OSS artifact repository
     **/
    private SecretKeySelector accessKeySecret;
    /**
      * OSSArtifactRepository defines the controller configuration for an OSS artifact repository
     **/
    private String bucket;
    /**
      * OSSArtifactRepository defines the controller configuration for an OSS artifact repository
     **/
    private Boolean createBucketIfNotPresent;
    /**
      * OSSArtifactRepository defines the controller configuration for an OSS artifact repository
     **/
    private String endpoint;
    /**
      * OSSArtifactRepository defines the controller configuration for an OSS artifact repository
     **/
    private String keyFormat;
    /**
      * OSSArtifactRepository defines the controller configuration for an OSS artifact repository
     **/
    private OSSLifecycleRule lifecycleRule;
    /**
      * OSSArtifactRepository defines the controller configuration for an OSS artifact repository
     **/
    private SecretKeySelector secretKeySecret;
    /**
      * OSSArtifactRepository defines the controller configuration for an OSS artifact repository
     **/
    private String securityToken;
    /**
      * OSSArtifactRepository defines the controller configuration for an OSS artifact repository
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

    public OSSArtifactRepository accessKeySecret(SecretKeySelector accessKeySecret) {
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

    public OSSArtifactRepository bucket(String bucket) {
        this.bucket = bucket;
        return this;
    }

    /**
    * CreateBucketIfNotPresent tells the driver to attempt to create the OSS bucket for output artifacts, if it doesn't exist
    * @return createBucketIfNotPresent
    **/
    @JsonProperty("createBucketIfNotPresent")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public Boolean getCreateBucketIfNotPresent() {
        return createBucketIfNotPresent;
    }

    /**
     * Set createBucketIfNotPresent
     **/
    public void setCreateBucketIfNotPresent(Boolean createBucketIfNotPresent) {
        this.createBucketIfNotPresent = createBucketIfNotPresent;
    }

    public OSSArtifactRepository createBucketIfNotPresent(Boolean createBucketIfNotPresent) {
        this.createBucketIfNotPresent = createBucketIfNotPresent;
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

    public OSSArtifactRepository endpoint(String endpoint) {
        this.endpoint = endpoint;
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

    public OSSArtifactRepository keyFormat(String keyFormat) {
        this.keyFormat = keyFormat;
        return this;
    }

    /**
    * Get lifecycleRule
    * @return lifecycleRule
    **/
    @JsonProperty("lifecycleRule")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public OSSLifecycleRule getLifecycleRule() {
        return lifecycleRule;
    }

    /**
     * Set lifecycleRule
     **/
    public void setLifecycleRule(OSSLifecycleRule lifecycleRule) {
        this.lifecycleRule = lifecycleRule;
    }

    public OSSArtifactRepository lifecycleRule(OSSLifecycleRule lifecycleRule) {
        this.lifecycleRule = lifecycleRule;
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

    public OSSArtifactRepository secretKeySecret(SecretKeySelector secretKeySecret) {
        this.secretKeySecret = secretKeySecret;
        return this;
    }

    /**
    * SecurityToken is the user's temporary security token. For more details, check out: https://www.alibabacloud.com/help/doc-detail/100624.htm
    * @return securityToken
    **/
    @JsonProperty("securityToken")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public String getSecurityToken() {
        return securityToken;
    }

    /**
     * Set securityToken
     **/
    public void setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
    }

    public OSSArtifactRepository securityToken(String securityToken) {
        this.securityToken = securityToken;
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

    public OSSArtifactRepository useSDKCreds(Boolean useSDKCreds) {
        this.useSDKCreds = useSDKCreds;
        return this;
    }

    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OSSArtifactRepository {\n");

        sb.append("    accessKeySecret: ").append(toIndentedString(accessKeySecret)).append("\n");
        sb.append("    bucket: ").append(toIndentedString(bucket)).append("\n");
        sb.append("    createBucketIfNotPresent: ").append(toIndentedString(createBucketIfNotPresent)).append("\n");
        sb.append("    endpoint: ").append(toIndentedString(endpoint)).append("\n");
        sb.append("    keyFormat: ").append(toIndentedString(keyFormat)).append("\n");
        sb.append("    lifecycleRule: ").append(toIndentedString(lifecycleRule)).append("\n");
        sb.append("    secretKeySecret: ").append(toIndentedString(secretKeySecret)).append("\n");
        sb.append("    securityToken: ").append(toIndentedString(securityToken)).append("\n");
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
      * OSSArtifactRepository defines the controller configuration for an OSS artifact repository
     **/
    public static class OSSArtifactRepositoryQueryParam  {

        /**
          * OSSArtifactRepository defines the controller configuration for an OSS artifact repository
         **/
        @jakarta.ws.rs.QueryParam("accessKeySecret")
        private SecretKeySelector accessKeySecret;
        /**
          * OSSArtifactRepository defines the controller configuration for an OSS artifact repository
         **/
        @jakarta.ws.rs.QueryParam("bucket")
        private String bucket;
        /**
          * OSSArtifactRepository defines the controller configuration for an OSS artifact repository
         **/
        @jakarta.ws.rs.QueryParam("createBucketIfNotPresent")
        private Boolean createBucketIfNotPresent;
        /**
          * OSSArtifactRepository defines the controller configuration for an OSS artifact repository
         **/
        @jakarta.ws.rs.QueryParam("endpoint")
        private String endpoint;
        /**
          * OSSArtifactRepository defines the controller configuration for an OSS artifact repository
         **/
        @jakarta.ws.rs.QueryParam("keyFormat")
        private String keyFormat;
        /**
          * OSSArtifactRepository defines the controller configuration for an OSS artifact repository
         **/
        @jakarta.ws.rs.QueryParam("lifecycleRule")
        private OSSLifecycleRule lifecycleRule;
        /**
          * OSSArtifactRepository defines the controller configuration for an OSS artifact repository
         **/
        @jakarta.ws.rs.QueryParam("secretKeySecret")
        private SecretKeySelector secretKeySecret;
        /**
          * OSSArtifactRepository defines the controller configuration for an OSS artifact repository
         **/
        @jakarta.ws.rs.QueryParam("securityToken")
        private String securityToken;
        /**
          * OSSArtifactRepository defines the controller configuration for an OSS artifact repository
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

        public OSSArtifactRepositoryQueryParam accessKeySecret(SecretKeySelector accessKeySecret) {
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

        public OSSArtifactRepositoryQueryParam bucket(String bucket) {
            this.bucket = bucket;
            return this;
        }

        /**
        * CreateBucketIfNotPresent tells the driver to attempt to create the OSS bucket for output artifacts, if it doesn't exist
        * @return createBucketIfNotPresent
        **/
        @JsonProperty("createBucketIfNotPresent")
        public Boolean getCreateBucketIfNotPresent() {
            return createBucketIfNotPresent;
        }

        /**
         * Set createBucketIfNotPresent
         **/
        public void setCreateBucketIfNotPresent(Boolean createBucketIfNotPresent) {
            this.createBucketIfNotPresent = createBucketIfNotPresent;
        }

        public OSSArtifactRepositoryQueryParam createBucketIfNotPresent(Boolean createBucketIfNotPresent) {
            this.createBucketIfNotPresent = createBucketIfNotPresent;
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

        public OSSArtifactRepositoryQueryParam endpoint(String endpoint) {
            this.endpoint = endpoint;
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

        public OSSArtifactRepositoryQueryParam keyFormat(String keyFormat) {
            this.keyFormat = keyFormat;
            return this;
        }

        /**
        * Get lifecycleRule
        * @return lifecycleRule
        **/
        @JsonProperty("lifecycleRule")
        public OSSLifecycleRule getLifecycleRule() {
            return lifecycleRule;
        }

        /**
         * Set lifecycleRule
         **/
        public void setLifecycleRule(OSSLifecycleRule lifecycleRule) {
            this.lifecycleRule = lifecycleRule;
        }

        public OSSArtifactRepositoryQueryParam lifecycleRule(OSSLifecycleRule lifecycleRule) {
            this.lifecycleRule = lifecycleRule;
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

        public OSSArtifactRepositoryQueryParam secretKeySecret(SecretKeySelector secretKeySecret) {
            this.secretKeySecret = secretKeySecret;
            return this;
        }

        /**
        * SecurityToken is the user's temporary security token. For more details, check out: https://www.alibabacloud.com/help/doc-detail/100624.htm
        * @return securityToken
        **/
        @JsonProperty("securityToken")
        public String getSecurityToken() {
            return securityToken;
        }

        /**
         * Set securityToken
         **/
        public void setSecurityToken(String securityToken) {
            this.securityToken = securityToken;
        }

        public OSSArtifactRepositoryQueryParam securityToken(String securityToken) {
            this.securityToken = securityToken;
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

        public OSSArtifactRepositoryQueryParam useSDKCreds(Boolean useSDKCreds) {
            this.useSDKCreds = useSDKCreds;
            return this;
        }

        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class OSSArtifactRepositoryQueryParam {\n");

            sb.append("    accessKeySecret: ").append(toIndentedString(accessKeySecret)).append("\n");
            sb.append("    bucket: ").append(toIndentedString(bucket)).append("\n");
            sb.append("    createBucketIfNotPresent: ").append(toIndentedString(createBucketIfNotPresent)).append("\n");
            sb.append("    endpoint: ").append(toIndentedString(endpoint)).append("\n");
            sb.append("    keyFormat: ").append(toIndentedString(keyFormat)).append("\n");
            sb.append("    lifecycleRule: ").append(toIndentedString(lifecycleRule)).append("\n");
            sb.append("    secretKeySecret: ").append(toIndentedString(secretKeySecret)).append("\n");
            sb.append("    securityToken: ").append(toIndentedString(securityToken)).append("\n");
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
