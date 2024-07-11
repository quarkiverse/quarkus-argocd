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
  * OSSArtifact is the location of an Alibaba Cloud OSS artifact
 **/
public class OSSArtifact  {

    /**
      * OSSArtifact is the location of an Alibaba Cloud OSS artifact
     **/
    private SecretKeySelector accessKeySecret;
    /**
      * OSSArtifact is the location of an Alibaba Cloud OSS artifact
     **/
    private String bucket;
    /**
      * OSSArtifact is the location of an Alibaba Cloud OSS artifact
     **/
    private Boolean createBucketIfNotPresent;
    /**
      * OSSArtifact is the location of an Alibaba Cloud OSS artifact
     **/
    private String endpoint;
    /**
      * OSSArtifact is the location of an Alibaba Cloud OSS artifact
     **/
    private String key;
    /**
      * OSSArtifact is the location of an Alibaba Cloud OSS artifact
     **/
    private OSSLifecycleRule lifecycleRule;
    /**
      * OSSArtifact is the location of an Alibaba Cloud OSS artifact
     **/
    private SecretKeySelector secretKeySecret;
    /**
      * OSSArtifact is the location of an Alibaba Cloud OSS artifact
     **/
    private String securityToken;
    /**
      * OSSArtifact is the location of an Alibaba Cloud OSS artifact
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

    public OSSArtifact accessKeySecret(SecretKeySelector accessKeySecret) {
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

    public OSSArtifact bucket(String bucket) {
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

    public OSSArtifact createBucketIfNotPresent(Boolean createBucketIfNotPresent) {
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

    public OSSArtifact endpoint(String endpoint) {
        this.endpoint = endpoint;
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

    public OSSArtifact key(String key) {
        this.key = key;
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

    public OSSArtifact lifecycleRule(OSSLifecycleRule lifecycleRule) {
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

    public OSSArtifact secretKeySecret(SecretKeySelector secretKeySecret) {
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

    public OSSArtifact securityToken(String securityToken) {
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

    public OSSArtifact useSDKCreds(Boolean useSDKCreds) {
        this.useSDKCreds = useSDKCreds;
        return this;
    }

    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OSSArtifact {\n");

        sb.append("    accessKeySecret: ").append(toIndentedString(accessKeySecret)).append("\n");
        sb.append("    bucket: ").append(toIndentedString(bucket)).append("\n");
        sb.append("    createBucketIfNotPresent: ").append(toIndentedString(createBucketIfNotPresent)).append("\n");
        sb.append("    endpoint: ").append(toIndentedString(endpoint)).append("\n");
        sb.append("    key: ").append(toIndentedString(key)).append("\n");
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
      * OSSArtifact is the location of an Alibaba Cloud OSS artifact
     **/
    public static class OSSArtifactQueryParam  {

        /**
          * OSSArtifact is the location of an Alibaba Cloud OSS artifact
         **/
        @jakarta.ws.rs.QueryParam("accessKeySecret")
        private SecretKeySelector accessKeySecret;
        /**
          * OSSArtifact is the location of an Alibaba Cloud OSS artifact
         **/
        @jakarta.ws.rs.QueryParam("bucket")
        private String bucket;
        /**
          * OSSArtifact is the location of an Alibaba Cloud OSS artifact
         **/
        @jakarta.ws.rs.QueryParam("createBucketIfNotPresent")
        private Boolean createBucketIfNotPresent;
        /**
          * OSSArtifact is the location of an Alibaba Cloud OSS artifact
         **/
        @jakarta.ws.rs.QueryParam("endpoint")
        private String endpoint;
        /**
          * OSSArtifact is the location of an Alibaba Cloud OSS artifact
         **/
        @jakarta.ws.rs.QueryParam("key")
        private String key;
        /**
          * OSSArtifact is the location of an Alibaba Cloud OSS artifact
         **/
        @jakarta.ws.rs.QueryParam("lifecycleRule")
        private OSSLifecycleRule lifecycleRule;
        /**
          * OSSArtifact is the location of an Alibaba Cloud OSS artifact
         **/
        @jakarta.ws.rs.QueryParam("secretKeySecret")
        private SecretKeySelector secretKeySecret;
        /**
          * OSSArtifact is the location of an Alibaba Cloud OSS artifact
         **/
        @jakarta.ws.rs.QueryParam("securityToken")
        private String securityToken;
        /**
          * OSSArtifact is the location of an Alibaba Cloud OSS artifact
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

        public OSSArtifactQueryParam accessKeySecret(SecretKeySelector accessKeySecret) {
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

        public OSSArtifactQueryParam bucket(String bucket) {
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

        public OSSArtifactQueryParam createBucketIfNotPresent(Boolean createBucketIfNotPresent) {
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

        public OSSArtifactQueryParam endpoint(String endpoint) {
            this.endpoint = endpoint;
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

        public OSSArtifactQueryParam key(String key) {
            this.key = key;
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

        public OSSArtifactQueryParam lifecycleRule(OSSLifecycleRule lifecycleRule) {
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

        public OSSArtifactQueryParam secretKeySecret(SecretKeySelector secretKeySecret) {
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

        public OSSArtifactQueryParam securityToken(String securityToken) {
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

        public OSSArtifactQueryParam useSDKCreds(Boolean useSDKCreds) {
            this.useSDKCreds = useSDKCreds;
            return this;
        }

        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class OSSArtifactQueryParam {\n");

            sb.append("    accessKeySecret: ").append(toIndentedString(accessKeySecret)).append("\n");
            sb.append("    bucket: ").append(toIndentedString(bucket)).append("\n");
            sb.append("    createBucketIfNotPresent: ").append(toIndentedString(createBucketIfNotPresent)).append("\n");
            sb.append("    endpoint: ").append(toIndentedString(endpoint)).append("\n");
            sb.append("    key: ").append(toIndentedString(key)).append("\n");
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
