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
  * HDFSArtifact is the location of an HDFS artifact
 **/
public class HDFSArtifact  {

    /**
      * HDFSArtifact is the location of an HDFS artifact
     **/
    private List<String> addresses;
    /**
      * HDFSArtifact is the location of an HDFS artifact
     **/
    private Boolean force;
    /**
      * HDFSArtifact is the location of an HDFS artifact
     **/
    private String hdfsUser;
    /**
      * HDFSArtifact is the location of an HDFS artifact
     **/
    private SecretKeySelector krbCCacheSecret;
    /**
      * HDFSArtifact is the location of an HDFS artifact
     **/
    private ConfigMapKeySelector krbConfigConfigMap;
    /**
      * HDFSArtifact is the location of an HDFS artifact
     **/
    private SecretKeySelector krbKeytabSecret;
    /**
      * HDFSArtifact is the location of an HDFS artifact
     **/
    private String krbRealm;
    /**
      * HDFSArtifact is the location of an HDFS artifact
     **/
    private String krbServicePrincipalName;
    /**
      * HDFSArtifact is the location of an HDFS artifact
     **/
    private String krbUsername;
    /**
      * HDFSArtifact is the location of an HDFS artifact
     **/
    private String path;

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

    public HDFSArtifact addresses(List<String> addresses) {
        this.addresses = addresses;
        return this;
    }
    public HDFSArtifact addAddressesItem(String addressesItem) {
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

    public HDFSArtifact force(Boolean force) {
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

    public HDFSArtifact hdfsUser(String hdfsUser) {
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

    public HDFSArtifact krbCCacheSecret(SecretKeySelector krbCCacheSecret) {
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

    public HDFSArtifact krbConfigConfigMap(ConfigMapKeySelector krbConfigConfigMap) {
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

    public HDFSArtifact krbKeytabSecret(SecretKeySelector krbKeytabSecret) {
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

    public HDFSArtifact krbRealm(String krbRealm) {
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

    public HDFSArtifact krbServicePrincipalName(String krbServicePrincipalName) {
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

    public HDFSArtifact krbUsername(String krbUsername) {
        this.krbUsername = krbUsername;
        return this;
    }

    /**
    * Path is a file path in HDFS
    * @return path
    **/
    @JsonProperty("path")
    public String getPath() {
        return path;
    }

    /**
     * Set path
     **/
    public void setPath(String path) {
        this.path = path;
    }

    public HDFSArtifact path(String path) {
        this.path = path;
        return this;
    }

    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class HDFSArtifact {\n");

        sb.append("    addresses: ").append(toIndentedString(addresses)).append("\n");
        sb.append("    force: ").append(toIndentedString(force)).append("\n");
        sb.append("    hdfsUser: ").append(toIndentedString(hdfsUser)).append("\n");
        sb.append("    krbCCacheSecret: ").append(toIndentedString(krbCCacheSecret)).append("\n");
        sb.append("    krbConfigConfigMap: ").append(toIndentedString(krbConfigConfigMap)).append("\n");
        sb.append("    krbKeytabSecret: ").append(toIndentedString(krbKeytabSecret)).append("\n");
        sb.append("    krbRealm: ").append(toIndentedString(krbRealm)).append("\n");
        sb.append("    krbServicePrincipalName: ").append(toIndentedString(krbServicePrincipalName)).append("\n");
        sb.append("    krbUsername: ").append(toIndentedString(krbUsername)).append("\n");
        sb.append("    path: ").append(toIndentedString(path)).append("\n");
        
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
      * HDFSArtifact is the location of an HDFS artifact
     **/
    public static class HDFSArtifactQueryParam  {

        /**
          * HDFSArtifact is the location of an HDFS artifact
         **/
        @jakarta.ws.rs.QueryParam("addresses")
        private List<String> addresses = null;
        /**
          * HDFSArtifact is the location of an HDFS artifact
         **/
        @jakarta.ws.rs.QueryParam("force")
        private Boolean force;
        /**
          * HDFSArtifact is the location of an HDFS artifact
         **/
        @jakarta.ws.rs.QueryParam("hdfsUser")
        private String hdfsUser;
        /**
          * HDFSArtifact is the location of an HDFS artifact
         **/
        @jakarta.ws.rs.QueryParam("krbCCacheSecret")
        private SecretKeySelector krbCCacheSecret;
        /**
          * HDFSArtifact is the location of an HDFS artifact
         **/
        @jakarta.ws.rs.QueryParam("krbConfigConfigMap")
        private ConfigMapKeySelector krbConfigConfigMap;
        /**
          * HDFSArtifact is the location of an HDFS artifact
         **/
        @jakarta.ws.rs.QueryParam("krbKeytabSecret")
        private SecretKeySelector krbKeytabSecret;
        /**
          * HDFSArtifact is the location of an HDFS artifact
         **/
        @jakarta.ws.rs.QueryParam("krbRealm")
        private String krbRealm;
        /**
          * HDFSArtifact is the location of an HDFS artifact
         **/
        @jakarta.ws.rs.QueryParam("krbServicePrincipalName")
        private String krbServicePrincipalName;
        /**
          * HDFSArtifact is the location of an HDFS artifact
         **/
        @jakarta.ws.rs.QueryParam("krbUsername")
        private String krbUsername;
        /**
          * HDFSArtifact is the location of an HDFS artifact
         **/
        @jakarta.ws.rs.QueryParam("path")
        private String path;

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

        public HDFSArtifactQueryParam addresses(List<String> addresses) {
            this.addresses = addresses;
            return this;
        }
        public HDFSArtifactQueryParam addAddressesItem(String addressesItem) {
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

        public HDFSArtifactQueryParam force(Boolean force) {
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

        public HDFSArtifactQueryParam hdfsUser(String hdfsUser) {
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

        public HDFSArtifactQueryParam krbCCacheSecret(SecretKeySelector krbCCacheSecret) {
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

        public HDFSArtifactQueryParam krbConfigConfigMap(ConfigMapKeySelector krbConfigConfigMap) {
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

        public HDFSArtifactQueryParam krbKeytabSecret(SecretKeySelector krbKeytabSecret) {
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

        public HDFSArtifactQueryParam krbRealm(String krbRealm) {
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

        public HDFSArtifactQueryParam krbServicePrincipalName(String krbServicePrincipalName) {
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

        public HDFSArtifactQueryParam krbUsername(String krbUsername) {
            this.krbUsername = krbUsername;
            return this;
        }

        /**
        * Path is a file path in HDFS
        * @return path
        **/
        @JsonProperty("path")
        public String getPath() {
            return path;
        }

        /**
         * Set path
         **/
        public void setPath(String path) {
            this.path = path;
        }

        public HDFSArtifactQueryParam path(String path) {
            this.path = path;
            return this;
        }

        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class HDFSArtifactQueryParam {\n");

            sb.append("    addresses: ").append(toIndentedString(addresses)).append("\n");
            sb.append("    force: ").append(toIndentedString(force)).append("\n");
            sb.append("    hdfsUser: ").append(toIndentedString(hdfsUser)).append("\n");
            sb.append("    krbCCacheSecret: ").append(toIndentedString(krbCCacheSecret)).append("\n");
            sb.append("    krbConfigConfigMap: ").append(toIndentedString(krbConfigConfigMap)).append("\n");
            sb.append("    krbKeytabSecret: ").append(toIndentedString(krbKeytabSecret)).append("\n");
            sb.append("    krbRealm: ").append(toIndentedString(krbRealm)).append("\n");
            sb.append("    krbServicePrincipalName: ").append(toIndentedString(krbServicePrincipalName)).append("\n");
            sb.append("    krbUsername: ").append(toIndentedString(krbUsername)).append("\n");
            sb.append("    path: ").append(toIndentedString(path)).append("\n");
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