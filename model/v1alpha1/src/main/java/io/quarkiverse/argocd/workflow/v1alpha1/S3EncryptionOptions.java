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
  * S3EncryptionOptions used to determine encryption options during s3 operations
 **/
public class S3EncryptionOptions  {

    /**
      * S3EncryptionOptions used to determine encryption options during s3 operations
     **/
    private Boolean enableEncryption;
    /**
      * S3EncryptionOptions used to determine encryption options during s3 operations
     **/
    private String kmsEncryptionContext;
    /**
      * S3EncryptionOptions used to determine encryption options during s3 operations
     **/
    private String kmsKeyId;
    /**
      * S3EncryptionOptions used to determine encryption options during s3 operations
     **/
    private SecretKeySelector serverSideCustomerKeySecret;

    /**
    * EnableEncryption tells the driver to encrypt objects if set to true. If kmsKeyId and serverSideCustomerKeySecret are not set, SSE-S3 will be used
    * @return enableEncryption
    **/
    @JsonProperty("enableEncryption")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public Boolean getEnableEncryption() {
        return enableEncryption;
    }

    /**
     * Set enableEncryption
     **/
    public void setEnableEncryption(Boolean enableEncryption) {
        this.enableEncryption = enableEncryption;
    }

    public S3EncryptionOptions enableEncryption(Boolean enableEncryption) {
        this.enableEncryption = enableEncryption;
        return this;
    }

    /**
    * KmsEncryptionContext is a json blob that contains an encryption context. See https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#encrypt_context for more information
    * @return kmsEncryptionContext
    **/
    @JsonProperty("kmsEncryptionContext")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public String getKmsEncryptionContext() {
        return kmsEncryptionContext;
    }

    /**
     * Set kmsEncryptionContext
     **/
    public void setKmsEncryptionContext(String kmsEncryptionContext) {
        this.kmsEncryptionContext = kmsEncryptionContext;
    }

    public S3EncryptionOptions kmsEncryptionContext(String kmsEncryptionContext) {
        this.kmsEncryptionContext = kmsEncryptionContext;
        return this;
    }

    /**
    * KMSKeyId tells the driver to encrypt the object using the specified KMS Key.
    * @return kmsKeyId
    **/
    @JsonProperty("kmsKeyId")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public String getKmsKeyId() {
        return kmsKeyId;
    }

    /**
     * Set kmsKeyId
     **/
    public void setKmsKeyId(String kmsKeyId) {
        this.kmsKeyId = kmsKeyId;
    }

    public S3EncryptionOptions kmsKeyId(String kmsKeyId) {
        this.kmsKeyId = kmsKeyId;
        return this;
    }

    /**
    * Get serverSideCustomerKeySecret
    * @return serverSideCustomerKeySecret
    **/
    @JsonProperty("serverSideCustomerKeySecret")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public SecretKeySelector getServerSideCustomerKeySecret() {
        return serverSideCustomerKeySecret;
    }

    /**
     * Set serverSideCustomerKeySecret
     **/
    public void setServerSideCustomerKeySecret(SecretKeySelector serverSideCustomerKeySecret) {
        this.serverSideCustomerKeySecret = serverSideCustomerKeySecret;
    }

    public S3EncryptionOptions serverSideCustomerKeySecret(SecretKeySelector serverSideCustomerKeySecret) {
        this.serverSideCustomerKeySecret = serverSideCustomerKeySecret;
        return this;
    }

    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class S3EncryptionOptions {\n");

        sb.append("    enableEncryption: ").append(toIndentedString(enableEncryption)).append("\n");
        sb.append("    kmsEncryptionContext: ").append(toIndentedString(kmsEncryptionContext)).append("\n");
        sb.append("    kmsKeyId: ").append(toIndentedString(kmsKeyId)).append("\n");
        sb.append("    serverSideCustomerKeySecret: ").append(toIndentedString(serverSideCustomerKeySecret)).append("\n");
        
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
      * S3EncryptionOptions used to determine encryption options during s3 operations
     **/
    public static class S3EncryptionOptionsQueryParam  {

        /**
          * S3EncryptionOptions used to determine encryption options during s3 operations
         **/
        @jakarta.ws.rs.QueryParam("enableEncryption")
        private Boolean enableEncryption;
        /**
          * S3EncryptionOptions used to determine encryption options during s3 operations
         **/
        @jakarta.ws.rs.QueryParam("kmsEncryptionContext")
        private String kmsEncryptionContext;
        /**
          * S3EncryptionOptions used to determine encryption options during s3 operations
         **/
        @jakarta.ws.rs.QueryParam("kmsKeyId")
        private String kmsKeyId;
        /**
          * S3EncryptionOptions used to determine encryption options during s3 operations
         **/
        @jakarta.ws.rs.QueryParam("serverSideCustomerKeySecret")
        private SecretKeySelector serverSideCustomerKeySecret;

        /**
        * EnableEncryption tells the driver to encrypt objects if set to true. If kmsKeyId and serverSideCustomerKeySecret are not set, SSE-S3 will be used
        * @return enableEncryption
        **/
        @JsonProperty("enableEncryption")
        public Boolean getEnableEncryption() {
            return enableEncryption;
        }

        /**
         * Set enableEncryption
         **/
        public void setEnableEncryption(Boolean enableEncryption) {
            this.enableEncryption = enableEncryption;
        }

        public S3EncryptionOptionsQueryParam enableEncryption(Boolean enableEncryption) {
            this.enableEncryption = enableEncryption;
            return this;
        }

        /**
        * KmsEncryptionContext is a json blob that contains an encryption context. See https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#encrypt_context for more information
        * @return kmsEncryptionContext
        **/
        @JsonProperty("kmsEncryptionContext")
        public String getKmsEncryptionContext() {
            return kmsEncryptionContext;
        }

        /**
         * Set kmsEncryptionContext
         **/
        public void setKmsEncryptionContext(String kmsEncryptionContext) {
            this.kmsEncryptionContext = kmsEncryptionContext;
        }

        public S3EncryptionOptionsQueryParam kmsEncryptionContext(String kmsEncryptionContext) {
            this.kmsEncryptionContext = kmsEncryptionContext;
            return this;
        }

        /**
        * KMSKeyId tells the driver to encrypt the object using the specified KMS Key.
        * @return kmsKeyId
        **/
        @JsonProperty("kmsKeyId")
        public String getKmsKeyId() {
            return kmsKeyId;
        }

        /**
         * Set kmsKeyId
         **/
        public void setKmsKeyId(String kmsKeyId) {
            this.kmsKeyId = kmsKeyId;
        }

        public S3EncryptionOptionsQueryParam kmsKeyId(String kmsKeyId) {
            this.kmsKeyId = kmsKeyId;
            return this;
        }

        /**
        * Get serverSideCustomerKeySecret
        * @return serverSideCustomerKeySecret
        **/
        @JsonProperty("serverSideCustomerKeySecret")
        public SecretKeySelector getServerSideCustomerKeySecret() {
            return serverSideCustomerKeySecret;
        }

        /**
         * Set serverSideCustomerKeySecret
         **/
        public void setServerSideCustomerKeySecret(SecretKeySelector serverSideCustomerKeySecret) {
            this.serverSideCustomerKeySecret = serverSideCustomerKeySecret;
        }

        public S3EncryptionOptionsQueryParam serverSideCustomerKeySecret(SecretKeySelector serverSideCustomerKeySecret) {
            this.serverSideCustomerKeySecret = serverSideCustomerKeySecret;
            return this;
        }

        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class S3EncryptionOptionsQueryParam {\n");

            sb.append("    enableEncryption: ").append(toIndentedString(enableEncryption)).append("\n");
            sb.append("    kmsEncryptionContext: ").append(toIndentedString(kmsEncryptionContext)).append("\n");
            sb.append("    kmsKeyId: ").append(toIndentedString(kmsKeyId)).append("\n");
            sb.append("    serverSideCustomerKeySecret: ").append(toIndentedString(serverSideCustomerKeySecret)).append("\n");
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