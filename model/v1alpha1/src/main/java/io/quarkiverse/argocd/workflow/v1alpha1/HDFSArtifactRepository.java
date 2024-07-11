package io.quarkiverse.argocd.workflow.v1alpha1;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.fabric8.kubernetes.api.model.ConfigMapKeySelector;
import io.fabric8.kubernetes.api.model.SecretKeySelector;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.Type;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
/**
  * HDFSArtifactRepository defines the controller configuration for an HDFS artifact repository
 **/
public class HDFSArtifactRepository  {

    /**
      * HDFSArtifactRepository defines the controller configuration for an HDFS artifact repository
     **/
    private List<String> addresses;
    /**
      * HDFSArtifactRepository defines the controller configuration for an HDFS artifact repository
     **/
    private Boolean force;
    /**
      * HDFSArtifactRepository defines the controller configuration for an HDFS artifact repository
     **/
    private String hdfsUser;
    /**
      * HDFSArtifactRepository defines the controller configuration for an HDFS artifact repository
     **/
    private SecretKeySelector krbCCacheSecret;
    /**
      * HDFSArtifactRepository defines the controller configuration for an HDFS artifact repository
     **/
    private ConfigMapKeySelector krbConfigConfigMap;
    /**
      * HDFSArtifactRepository defines the controller configuration for an HDFS artifact repository
     **/
    private SecretKeySelector krbKeytabSecret;
    /**
      * HDFSArtifactRepository defines the controller configuration for an HDFS artifact repository
     **/
    private String krbRealm;
    /**
      * HDFSArtifactRepository defines the controller configuration for an HDFS artifact repository
     **/
    private String krbServicePrincipalName;
    /**
      * HDFSArtifactRepository defines the controller configuration for an HDFS artifact repository
     **/
    private String krbUsername;
    /**
      * HDFSArtifactRepository defines the controller configuration for an HDFS artifact repository
     **/
    private String pathFormat;

    /**
    * Addresses is accessible addresses of HDFS name nodes
    * @return addresses
    **/
    @JsonProperty("addresses")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public List<String> getAddresses() {
        return addresses;
    }

    /**
     * Set addresses
     **/
    public void setAddresses(List<String> addresses) {
        this.addresses = addresses;
    }

    public HDFSArtifactRepository addresses(List<String> addresses) {
        this.addresses = addresses;
        return this;
    }
    public HDFSArtifactRepository addAddressesItem(String addressesItem) {
        if (this.addresses == null){
            addresses = new ArrayList<>();
        }
        this.addresses.add(addressesItem);
        return this;
    }

    /**
    * Force copies a file forcibly even if it exists
    * @return force
    **/
    @JsonProperty("force")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public Boolean getForce() {
        return force;
    }

    /**
     * Set force
     **/
    public void setForce(Boolean force) {
        this.force = force;
    }

    public HDFSArtifactRepository force(Boolean force) {
        this.force = force;
        return this;
    }

    /**
    * HDFSUser is the user to access HDFS file system. It is ignored if either ccache or keytab is used.
    * @return hdfsUser
    **/
    @JsonProperty("hdfsUser")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public String getHdfsUser() {
        return hdfsUser;
    }

    /**
     * Set hdfsUser
     **/
    public void setHdfsUser(String hdfsUser) {
        this.hdfsUser = hdfsUser;
    }

    public HDFSArtifactRepository hdfsUser(String hdfsUser) {
        this.hdfsUser = hdfsUser;
        return this;
    }

    /**
    * Get krbCCacheSecret
    * @return krbCCacheSecret
    **/
    @JsonProperty("krbCCacheSecret")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public SecretKeySelector getKrbCCacheSecret() {
        return krbCCacheSecret;
    }

    /**
     * Set krbCCacheSecret
     **/
    public void setKrbCCacheSecret(SecretKeySelector krbCCacheSecret) {
        this.krbCCacheSecret = krbCCacheSecret;
    }

    public HDFSArtifactRepository krbCCacheSecret(SecretKeySelector krbCCacheSecret) {
        this.krbCCacheSecret = krbCCacheSecret;
        return this;
    }

    /**
    * Get krbConfigConfigMap
    * @return krbConfigConfigMap
    **/
    @JsonProperty("krbConfigConfigMap")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public ConfigMapKeySelector getKrbConfigConfigMap() {
        return krbConfigConfigMap;
    }

    /**
     * Set krbConfigConfigMap
     **/
    public void setKrbConfigConfigMap(ConfigMapKeySelector krbConfigConfigMap) {
        this.krbConfigConfigMap = krbConfigConfigMap;
    }

    public HDFSArtifactRepository krbConfigConfigMap(ConfigMapKeySelector krbConfigConfigMap) {
        this.krbConfigConfigMap = krbConfigConfigMap;
        return this;
    }

    /**
    * Get krbKeytabSecret
    * @return krbKeytabSecret
    **/
    @JsonProperty("krbKeytabSecret")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public SecretKeySelector getKrbKeytabSecret() {
        return krbKeytabSecret;
    }

    /**
     * Set krbKeytabSecret
     **/
    public void setKrbKeytabSecret(SecretKeySelector krbKeytabSecret) {
        this.krbKeytabSecret = krbKeytabSecret;
    }

    public HDFSArtifactRepository krbKeytabSecret(SecretKeySelector krbKeytabSecret) {
        this.krbKeytabSecret = krbKeytabSecret;
        return this;
    }

    /**
    * KrbRealm is the Kerberos realm used with Kerberos keytab It must be set if keytab is used.
    * @return krbRealm
    **/
    @JsonProperty("krbRealm")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public String getKrbRealm() {
        return krbRealm;
    }

    /**
     * Set krbRealm
     **/
    public void setKrbRealm(String krbRealm) {
        this.krbRealm = krbRealm;
    }

    public HDFSArtifactRepository krbRealm(String krbRealm) {
        this.krbRealm = krbRealm;
        return this;
    }

    /**
    * KrbServicePrincipalName is the principal name of Kerberos service It must be set if either ccache or keytab is used.
    * @return krbServicePrincipalName
    **/
    @JsonProperty("krbServicePrincipalName")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public String getKrbServicePrincipalName() {
        return krbServicePrincipalName;
    }

    /**
     * Set krbServicePrincipalName
     **/
    public void setKrbServicePrincipalName(String krbServicePrincipalName) {
        this.krbServicePrincipalName = krbServicePrincipalName;
    }

    public HDFSArtifactRepository krbServicePrincipalName(String krbServicePrincipalName) {
        this.krbServicePrincipalName = krbServicePrincipalName;
        return this;
    }

    /**
    * KrbUsername is the Kerberos username used with Kerberos keytab It must be set if keytab is used.
    * @return krbUsername
    **/
    @JsonProperty("krbUsername")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public String getKrbUsername() {
        return krbUsername;
    }

    /**
     * Set krbUsername
     **/
    public void setKrbUsername(String krbUsername) {
        this.krbUsername = krbUsername;
    }

    public HDFSArtifactRepository krbUsername(String krbUsername) {
        this.krbUsername = krbUsername;
        return this;
    }

    /**
    * PathFormat is defines the format of path to store a file. Can reference workflow variables
    * @return pathFormat
    **/
    @JsonProperty("pathFormat")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public String getPathFormat() {
        return pathFormat;
    }

    /**
     * Set pathFormat
     **/
    public void setPathFormat(String pathFormat) {
        this.pathFormat = pathFormat;
    }

    public HDFSArtifactRepository pathFormat(String pathFormat) {
        this.pathFormat = pathFormat;
        return this;
    }

    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class HDFSArtifactRepository {\n");

        sb.append("    addresses: ").append(toIndentedString(addresses)).append("\n");
        sb.append("    force: ").append(toIndentedString(force)).append("\n");
        sb.append("    hdfsUser: ").append(toIndentedString(hdfsUser)).append("\n");
        sb.append("    krbCCacheSecret: ").append(toIndentedString(krbCCacheSecret)).append("\n");
        sb.append("    krbConfigConfigMap: ").append(toIndentedString(krbConfigConfigMap)).append("\n");
        sb.append("    krbKeytabSecret: ").append(toIndentedString(krbKeytabSecret)).append("\n");
        sb.append("    krbRealm: ").append(toIndentedString(krbRealm)).append("\n");
        sb.append("    krbServicePrincipalName: ").append(toIndentedString(krbServicePrincipalName)).append("\n");
        sb.append("    krbUsername: ").append(toIndentedString(krbUsername)).append("\n");
        sb.append("    pathFormat: ").append(toIndentedString(pathFormat)).append("\n");
        
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
      * HDFSArtifactRepository defines the controller configuration for an HDFS artifact repository
     **/
    public static class HDFSArtifactRepositoryQueryParam  {

        /**
          * HDFSArtifactRepository defines the controller configuration for an HDFS artifact repository
         **/
        @jakarta.ws.rs.QueryParam("addresses")
        private List<String> addresses = null;
        /**
          * HDFSArtifactRepository defines the controller configuration for an HDFS artifact repository
         **/
        @jakarta.ws.rs.QueryParam("force")
        private Boolean force;
        /**
          * HDFSArtifactRepository defines the controller configuration for an HDFS artifact repository
         **/
        @jakarta.ws.rs.QueryParam("hdfsUser")
        private String hdfsUser;
        /**
          * HDFSArtifactRepository defines the controller configuration for an HDFS artifact repository
         **/
        @jakarta.ws.rs.QueryParam("krbCCacheSecret")
        private SecretKeySelector krbCCacheSecret;
        /**
          * HDFSArtifactRepository defines the controller configuration for an HDFS artifact repository
         **/
        @jakarta.ws.rs.QueryParam("krbConfigConfigMap")
        private ConfigMapKeySelector krbConfigConfigMap;
        /**
          * HDFSArtifactRepository defines the controller configuration for an HDFS artifact repository
         **/
        @jakarta.ws.rs.QueryParam("krbKeytabSecret")
        private SecretKeySelector krbKeytabSecret;
        /**
          * HDFSArtifactRepository defines the controller configuration for an HDFS artifact repository
         **/
        @jakarta.ws.rs.QueryParam("krbRealm")
        private String krbRealm;
        /**
          * HDFSArtifactRepository defines the controller configuration for an HDFS artifact repository
         **/
        @jakarta.ws.rs.QueryParam("krbServicePrincipalName")
        private String krbServicePrincipalName;
        /**
          * HDFSArtifactRepository defines the controller configuration for an HDFS artifact repository
         **/
        @jakarta.ws.rs.QueryParam("krbUsername")
        private String krbUsername;
        /**
          * HDFSArtifactRepository defines the controller configuration for an HDFS artifact repository
         **/
        @jakarta.ws.rs.QueryParam("pathFormat")
        private String pathFormat;

        /**
        * Addresses is accessible addresses of HDFS name nodes
        * @return addresses
        **/
        @JsonProperty("addresses")
        public List<String> getAddresses() {
            return addresses;
        }

        /**
         * Set addresses
         **/
        public void setAddresses(List<String> addresses) {
            this.addresses = addresses;
        }

        public HDFSArtifactRepositoryQueryParam addresses(List<String> addresses) {
            this.addresses = addresses;
            return this;
        }
        public HDFSArtifactRepositoryQueryParam addAddressesItem(String addressesItem) {
            this.addresses.add(addressesItem);
            return this;
        }

        /**
        * Force copies a file forcibly even if it exists
        * @return force
        **/
        @JsonProperty("force")
        public Boolean getForce() {
            return force;
        }

        /**
         * Set force
         **/
        public void setForce(Boolean force) {
            this.force = force;
        }

        public HDFSArtifactRepositoryQueryParam force(Boolean force) {
            this.force = force;
            return this;
        }

        /**
        * HDFSUser is the user to access HDFS file system. It is ignored if either ccache or keytab is used.
        * @return hdfsUser
        **/
        @JsonProperty("hdfsUser")
        public String getHdfsUser() {
            return hdfsUser;
        }

        /**
         * Set hdfsUser
         **/
        public void setHdfsUser(String hdfsUser) {
            this.hdfsUser = hdfsUser;
        }

        public HDFSArtifactRepositoryQueryParam hdfsUser(String hdfsUser) {
            this.hdfsUser = hdfsUser;
            return this;
        }

        /**
        * Get krbCCacheSecret
        * @return krbCCacheSecret
        **/
        @JsonProperty("krbCCacheSecret")
        public SecretKeySelector getKrbCCacheSecret() {
            return krbCCacheSecret;
        }

        /**
         * Set krbCCacheSecret
         **/
        public void setKrbCCacheSecret(SecretKeySelector krbCCacheSecret) {
            this.krbCCacheSecret = krbCCacheSecret;
        }

        public HDFSArtifactRepositoryQueryParam krbCCacheSecret(SecretKeySelector krbCCacheSecret) {
            this.krbCCacheSecret = krbCCacheSecret;
            return this;
        }

        /**
        * Get krbConfigConfigMap
        * @return krbConfigConfigMap
        **/
        @JsonProperty("krbConfigConfigMap")
        public ConfigMapKeySelector getKrbConfigConfigMap() {
            return krbConfigConfigMap;
        }

        /**
         * Set krbConfigConfigMap
         **/
        public void setKrbConfigConfigMap(ConfigMapKeySelector krbConfigConfigMap) {
            this.krbConfigConfigMap = krbConfigConfigMap;
        }

        public HDFSArtifactRepositoryQueryParam krbConfigConfigMap(ConfigMapKeySelector krbConfigConfigMap) {
            this.krbConfigConfigMap = krbConfigConfigMap;
            return this;
        }

        /**
        * Get krbKeytabSecret
        * @return krbKeytabSecret
        **/
        @JsonProperty("krbKeytabSecret")
        public SecretKeySelector getKrbKeytabSecret() {
            return krbKeytabSecret;
        }

        /**
         * Set krbKeytabSecret
         **/
        public void setKrbKeytabSecret(SecretKeySelector krbKeytabSecret) {
            this.krbKeytabSecret = krbKeytabSecret;
        }

        public HDFSArtifactRepositoryQueryParam krbKeytabSecret(SecretKeySelector krbKeytabSecret) {
            this.krbKeytabSecret = krbKeytabSecret;
            return this;
        }

        /**
        * KrbRealm is the Kerberos realm used with Kerberos keytab It must be set if keytab is used.
        * @return krbRealm
        **/
        @JsonProperty("krbRealm")
        public String getKrbRealm() {
            return krbRealm;
        }

        /**
         * Set krbRealm
         **/
        public void setKrbRealm(String krbRealm) {
            this.krbRealm = krbRealm;
        }

        public HDFSArtifactRepositoryQueryParam krbRealm(String krbRealm) {
            this.krbRealm = krbRealm;
            return this;
        }

        /**
        * KrbServicePrincipalName is the principal name of Kerberos service It must be set if either ccache or keytab is used.
        * @return krbServicePrincipalName
        **/
        @JsonProperty("krbServicePrincipalName")
        public String getKrbServicePrincipalName() {
            return krbServicePrincipalName;
        }

        /**
         * Set krbServicePrincipalName
         **/
        public void setKrbServicePrincipalName(String krbServicePrincipalName) {
            this.krbServicePrincipalName = krbServicePrincipalName;
        }

        public HDFSArtifactRepositoryQueryParam krbServicePrincipalName(String krbServicePrincipalName) {
            this.krbServicePrincipalName = krbServicePrincipalName;
            return this;
        }

        /**
        * KrbUsername is the Kerberos username used with Kerberos keytab It must be set if keytab is used.
        * @return krbUsername
        **/
        @JsonProperty("krbUsername")
        public String getKrbUsername() {
            return krbUsername;
        }

        /**
         * Set krbUsername
         **/
        public void setKrbUsername(String krbUsername) {
            this.krbUsername = krbUsername;
        }

        public HDFSArtifactRepositoryQueryParam krbUsername(String krbUsername) {
            this.krbUsername = krbUsername;
            return this;
        }

        /**
        * PathFormat is defines the format of path to store a file. Can reference workflow variables
        * @return pathFormat
        **/
        @JsonProperty("pathFormat")
        public String getPathFormat() {
            return pathFormat;
        }

        /**
         * Set pathFormat
         **/
        public void setPathFormat(String pathFormat) {
            this.pathFormat = pathFormat;
        }

        public HDFSArtifactRepositoryQueryParam pathFormat(String pathFormat) {
            this.pathFormat = pathFormat;
            return this;
        }

        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class HDFSArtifactRepositoryQueryParam {\n");

            sb.append("    addresses: ").append(toIndentedString(addresses)).append("\n");
            sb.append("    force: ").append(toIndentedString(force)).append("\n");
            sb.append("    hdfsUser: ").append(toIndentedString(hdfsUser)).append("\n");
            sb.append("    krbCCacheSecret: ").append(toIndentedString(krbCCacheSecret)).append("\n");
            sb.append("    krbConfigConfigMap: ").append(toIndentedString(krbConfigConfigMap)).append("\n");
            sb.append("    krbKeytabSecret: ").append(toIndentedString(krbKeytabSecret)).append("\n");
            sb.append("    krbRealm: ").append(toIndentedString(krbRealm)).append("\n");
            sb.append("    krbServicePrincipalName: ").append(toIndentedString(krbServicePrincipalName)).append("\n");
            sb.append("    krbUsername: ").append(toIndentedString(krbUsername)).append("\n");
            sb.append("    pathFormat: ").append(toIndentedString(pathFormat)).append("\n");
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