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
  * AzureArtifactRepository defines the controller configuration for an Azure Blob Storage artifact repository
 **/
public class AzureArtifactRepository  {

    /**
      * AzureArtifactRepository defines the controller configuration for an Azure Blob Storage artifact repository
     **/
    private SecretKeySelector accountKeySecret;
    /**
      * AzureArtifactRepository defines the controller configuration for an Azure Blob Storage artifact repository
     **/
    private String blobNameFormat;
    /**
      * AzureArtifactRepository defines the controller configuration for an Azure Blob Storage artifact repository
     **/
    private String container;
    /**
      * AzureArtifactRepository defines the controller configuration for an Azure Blob Storage artifact repository
     **/
    private String endpoint;
    /**
      * AzureArtifactRepository defines the controller configuration for an Azure Blob Storage artifact repository
     **/
    private Boolean useSDKCreds;

    /**
    * Get accountKeySecret
    * @return accountKeySecret
    **/
    @JsonProperty("accountKeySecret")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public SecretKeySelector getAccountKeySecret() {
        return accountKeySecret;
    }

    /**
     * Set accountKeySecret
     **/
    public void setAccountKeySecret(SecretKeySelector accountKeySecret) {
        this.accountKeySecret = accountKeySecret;
    }

    public AzureArtifactRepository accountKeySecret(SecretKeySelector accountKeySecret) {
        this.accountKeySecret = accountKeySecret;
        return this;
    }

    /**
    * BlobNameFormat is defines the format of how to store blob names. Can reference workflow variables
    * @return blobNameFormat
    **/
    @JsonProperty("blobNameFormat")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public String getBlobNameFormat() {
        return blobNameFormat;
    }

    /**
     * Set blobNameFormat
     **/
    public void setBlobNameFormat(String blobNameFormat) {
        this.blobNameFormat = blobNameFormat;
    }

    public AzureArtifactRepository blobNameFormat(String blobNameFormat) {
        this.blobNameFormat = blobNameFormat;
        return this;
    }

    /**
    * Container is the container where resources will be stored
    * @return container
    **/
    @JsonProperty("container")
    public String getContainer() {
        return container;
    }

    /**
     * Set container
     **/
    public void setContainer(String container) {
        this.container = container;
    }

    public AzureArtifactRepository container(String container) {
        this.container = container;
        return this;
    }

    /**
    * Endpoint is the service url associated with an account. It is most likely \"https://<ACCOUNT_NAME>.blob.core.windows.net\"
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

    public AzureArtifactRepository endpoint(String endpoint) {
        this.endpoint = endpoint;
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

    public AzureArtifactRepository useSDKCreds(Boolean useSDKCreds) {
        this.useSDKCreds = useSDKCreds;
        return this;
    }

    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AzureArtifactRepository {\n");

        sb.append("    accountKeySecret: ").append(toIndentedString(accountKeySecret)).append("\n");
        sb.append("    blobNameFormat: ").append(toIndentedString(blobNameFormat)).append("\n");
        sb.append("    container: ").append(toIndentedString(container)).append("\n");
        sb.append("    endpoint: ").append(toIndentedString(endpoint)).append("\n");
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
      * AzureArtifactRepository defines the controller configuration for an Azure Blob Storage artifact repository
     **/
    public static class AzureArtifactRepositoryQueryParam  {

        /**
          * AzureArtifactRepository defines the controller configuration for an Azure Blob Storage artifact repository
         **/
        @jakarta.ws.rs.QueryParam("accountKeySecret")
        private SecretKeySelector accountKeySecret;
        /**
          * AzureArtifactRepository defines the controller configuration for an Azure Blob Storage artifact repository
         **/
        @jakarta.ws.rs.QueryParam("blobNameFormat")
        private String blobNameFormat;
        /**
          * AzureArtifactRepository defines the controller configuration for an Azure Blob Storage artifact repository
         **/
        @jakarta.ws.rs.QueryParam("container")
        private String container;
        /**
          * AzureArtifactRepository defines the controller configuration for an Azure Blob Storage artifact repository
         **/
        @jakarta.ws.rs.QueryParam("endpoint")
        private String endpoint;
        /**
          * AzureArtifactRepository defines the controller configuration for an Azure Blob Storage artifact repository
         **/
        @jakarta.ws.rs.QueryParam("useSDKCreds")
        private Boolean useSDKCreds;

        /**
        * Get accountKeySecret
        * @return accountKeySecret
        **/
        @JsonProperty("accountKeySecret")
        public SecretKeySelector getAccountKeySecret() {
            return accountKeySecret;
        }

        /**
         * Set accountKeySecret
         **/
        public void setAccountKeySecret(SecretKeySelector accountKeySecret) {
            this.accountKeySecret = accountKeySecret;
        }

        public AzureArtifactRepositoryQueryParam accountKeySecret(SecretKeySelector accountKeySecret) {
            this.accountKeySecret = accountKeySecret;
            return this;
        }

        /**
        * BlobNameFormat is defines the format of how to store blob names. Can reference workflow variables
        * @return blobNameFormat
        **/
        @JsonProperty("blobNameFormat")
        public String getBlobNameFormat() {
            return blobNameFormat;
        }

        /**
         * Set blobNameFormat
         **/
        public void setBlobNameFormat(String blobNameFormat) {
            this.blobNameFormat = blobNameFormat;
        }

        public AzureArtifactRepositoryQueryParam blobNameFormat(String blobNameFormat) {
            this.blobNameFormat = blobNameFormat;
            return this;
        }

        /**
        * Container is the container where resources will be stored
        * @return container
        **/
        @JsonProperty("container")
        public String getContainer() {
            return container;
        }

        /**
         * Set container
         **/
        public void setContainer(String container) {
            this.container = container;
        }

        public AzureArtifactRepositoryQueryParam container(String container) {
            this.container = container;
            return this;
        }

        /**
        * Endpoint is the service url associated with an account. It is most likely \"https://<ACCOUNT_NAME>.blob.core.windows.net\"
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

        public AzureArtifactRepositoryQueryParam endpoint(String endpoint) {
            this.endpoint = endpoint;
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

        public AzureArtifactRepositoryQueryParam useSDKCreds(Boolean useSDKCreds) {
            this.useSDKCreds = useSDKCreds;
            return this;
        }

        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class AzureArtifactRepositoryQueryParam {\n");

            sb.append("    accountKeySecret: ").append(toIndentedString(accountKeySecret)).append("\n");
            sb.append("    blobNameFormat: ").append(toIndentedString(blobNameFormat)).append("\n");
            sb.append("    container: ").append(toIndentedString(container)).append("\n");
            sb.append("    endpoint: ").append(toIndentedString(endpoint)).append("\n");
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