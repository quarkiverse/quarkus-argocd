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
  * AzureArtifact is the location of a an Azure Storage artifact
 **/
public class AzureArtifact  {

    /**
      * AzureArtifact is the location of a an Azure Storage artifact
     **/
    private SecretKeySelector accountKeySecret;
    /**
      * AzureArtifact is the location of a an Azure Storage artifact
     **/
    private String blob;
    /**
      * AzureArtifact is the location of a an Azure Storage artifact
     **/
    private String container;
    /**
      * AzureArtifact is the location of a an Azure Storage artifact
     **/
    private String endpoint;
    /**
      * AzureArtifact is the location of a an Azure Storage artifact
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

    public AzureArtifact accountKeySecret(SecretKeySelector accountKeySecret) {
        this.accountKeySecret = accountKeySecret;
        return this;
    }

    /**
    * Blob is the blob name (i.e., path) in the container where the artifact resides
    * @return blob
    **/
    @JsonProperty("blob")
    public String getBlob() {
        return blob;
    }

    /**
     * Set blob
     **/
    public void setBlob(String blob) {
        this.blob = blob;
    }

    public AzureArtifact blob(String blob) {
        this.blob = blob;
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

    public AzureArtifact container(String container) {
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

    public AzureArtifact endpoint(String endpoint) {
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

    public AzureArtifact useSDKCreds(Boolean useSDKCreds) {
        this.useSDKCreds = useSDKCreds;
        return this;
    }

    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AzureArtifact {\n");

        sb.append("    accountKeySecret: ").append(toIndentedString(accountKeySecret)).append("\n");
        sb.append("    blob: ").append(toIndentedString(blob)).append("\n");
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
      * AzureArtifact is the location of a an Azure Storage artifact
     **/
    public static class AzureArtifactQueryParam  {

        /**
          * AzureArtifact is the location of a an Azure Storage artifact
         **/
        @jakarta.ws.rs.QueryParam("accountKeySecret")
        private SecretKeySelector accountKeySecret;
        /**
          * AzureArtifact is the location of a an Azure Storage artifact
         **/
        @jakarta.ws.rs.QueryParam("blob")
        private String blob;
        /**
          * AzureArtifact is the location of a an Azure Storage artifact
         **/
        @jakarta.ws.rs.QueryParam("container")
        private String container;
        /**
          * AzureArtifact is the location of a an Azure Storage artifact
         **/
        @jakarta.ws.rs.QueryParam("endpoint")
        private String endpoint;
        /**
          * AzureArtifact is the location of a an Azure Storage artifact
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

        public AzureArtifactQueryParam accountKeySecret(SecretKeySelector accountKeySecret) {
            this.accountKeySecret = accountKeySecret;
            return this;
        }

        /**
        * Blob is the blob name (i.e., path) in the container where the artifact resides
        * @return blob
        **/
        @JsonProperty("blob")
        public String getBlob() {
            return blob;
        }

        /**
         * Set blob
         **/
        public void setBlob(String blob) {
            this.blob = blob;
        }

        public AzureArtifactQueryParam blob(String blob) {
            this.blob = blob;
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

        public AzureArtifactQueryParam container(String container) {
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

        public AzureArtifactQueryParam endpoint(String endpoint) {
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

        public AzureArtifactQueryParam useSDKCreds(Boolean useSDKCreds) {
            this.useSDKCreds = useSDKCreds;
            return this;
        }

        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class AzureArtifactQueryParam {\n");

            sb.append("    accountKeySecret: ").append(toIndentedString(accountKeySecret)).append("\n");
            sb.append("    blob: ").append(toIndentedString(blob)).append("\n");
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