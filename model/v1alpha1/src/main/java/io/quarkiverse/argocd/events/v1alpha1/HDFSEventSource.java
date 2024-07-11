package io.quarkiverse.argocd.events.v1alpha1;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.quarkiverse.argocd.v1alpha1.model.EventSourceFilter;
import io.fabric8.kubernetes.api.model.ConfigMapKeySelector;
import io.fabric8.kubernetes.api.model.SecretKeySelector;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.Type;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class HDFSEventSource  {

    private List<String> addresses;
    private String checkInterval;
    private EventSourceFilter filter;
    private String hdfsUser;
    private SecretKeySelector krbCCacheSecret;
    private ConfigMapKeySelector krbConfigConfigMap;
    private SecretKeySelector krbKeytabSecret;
    private String krbRealm;
    private String krbServicePrincipalName;
    private String krbUsername;
    private Map<String, String> metadata;
    private String type;
    private WatchPathConfig watchPathConfig;

    /**
    * Get addresses
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

    public HDFSEventSource addresses(List<String> addresses) {
        this.addresses = addresses;
        return this;
    }
    public HDFSEventSource addAddressesItem(String addressesItem) {
        if (this.addresses == null){
            addresses = new ArrayList<>();
        }
        this.addresses.add(addressesItem);
        return this;
    }

    /**
    * Get checkInterval
    * @return checkInterval
    **/
    @JsonProperty("checkInterval")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public String getCheckInterval() {
        return checkInterval;
    }

    /**
     * Set checkInterval
     **/
    public void setCheckInterval(String checkInterval) {
        this.checkInterval = checkInterval;
    }

    public HDFSEventSource checkInterval(String checkInterval) {
        this.checkInterval = checkInterval;
        return this;
    }

    /**
    * Get filter
    * @return filter
    **/
    @JsonProperty("filter")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public EventSourceFilter getFilter() {
        return filter;
    }

    /**
     * Set filter
     **/
    public void setFilter(EventSourceFilter filter) {
        this.filter = filter;
    }

    public HDFSEventSource filter(EventSourceFilter filter) {
        this.filter = filter;
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

    public HDFSEventSource hdfsUser(String hdfsUser) {
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

    public HDFSEventSource krbCCacheSecret(SecretKeySelector krbCCacheSecret) {
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

    public HDFSEventSource krbConfigConfigMap(ConfigMapKeySelector krbConfigConfigMap) {
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

    public HDFSEventSource krbKeytabSecret(SecretKeySelector krbKeytabSecret) {
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

    public HDFSEventSource krbRealm(String krbRealm) {
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

    public HDFSEventSource krbServicePrincipalName(String krbServicePrincipalName) {
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

    public HDFSEventSource krbUsername(String krbUsername) {
        this.krbUsername = krbUsername;
        return this;
    }

    /**
    * Get metadata
    * @return metadata
    **/
    @JsonProperty("metadata")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public Map<String, String> getMetadata() {
        return metadata;
    }

    /**
     * Set metadata
     **/
    public void setMetadata(Map<String, String> metadata) {
        this.metadata = metadata;
    }

    public HDFSEventSource metadata(Map<String, String> metadata) {
        this.metadata = metadata;
        return this;
    }
    public HDFSEventSource putMetadataItem(String key, String metadataItem) {
           if (this.metadata == null){
                metadata = new HashMap<>();
            }
        this.metadata.put(key, metadataItem);
        return this;
    }

    /**
    * Get type
    * @return type
    **/
    @JsonProperty("type")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public String getType() {
        return type;
    }

    /**
     * Set type
     **/
    public void setType(String type) {
        this.type = type;
    }

    public HDFSEventSource type(String type) {
        this.type = type;
        return this;
    }

    /**
    * Get watchPathConfig
    * @return watchPathConfig
    **/
    @JsonProperty("watchPathConfig")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public WatchPathConfig getWatchPathConfig() {
        return watchPathConfig;
    }

    /**
     * Set watchPathConfig
     **/
    public void setWatchPathConfig(WatchPathConfig watchPathConfig) {
        this.watchPathConfig = watchPathConfig;
    }

    public HDFSEventSource watchPathConfig(WatchPathConfig watchPathConfig) {
        this.watchPathConfig = watchPathConfig;
        return this;
    }

    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class HDFSEventSource {\n");

        sb.append("    addresses: ").append(toIndentedString(addresses)).append("\n");
        sb.append("    checkInterval: ").append(toIndentedString(checkInterval)).append("\n");
        sb.append("    filter: ").append(toIndentedString(filter)).append("\n");
        sb.append("    hdfsUser: ").append(toIndentedString(hdfsUser)).append("\n");
        sb.append("    krbCCacheSecret: ").append(toIndentedString(krbCCacheSecret)).append("\n");
        sb.append("    krbConfigConfigMap: ").append(toIndentedString(krbConfigConfigMap)).append("\n");
        sb.append("    krbKeytabSecret: ").append(toIndentedString(krbKeytabSecret)).append("\n");
        sb.append("    krbRealm: ").append(toIndentedString(krbRealm)).append("\n");
        sb.append("    krbServicePrincipalName: ").append(toIndentedString(krbServicePrincipalName)).append("\n");
        sb.append("    krbUsername: ").append(toIndentedString(krbUsername)).append("\n");
        sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    watchPathConfig: ").append(toIndentedString(watchPathConfig)).append("\n");
        
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
    public static class HDFSEventSourceQueryParam  {

        @jakarta.ws.rs.QueryParam("addresses")
        private List<String> addresses = null;
        @jakarta.ws.rs.QueryParam("checkInterval")
        private String checkInterval;
        @jakarta.ws.rs.QueryParam("filter")
        private EventSourceFilter filter;
        @jakarta.ws.rs.QueryParam("hdfsUser")
        private String hdfsUser;
        @jakarta.ws.rs.QueryParam("krbCCacheSecret")
        private SecretKeySelector krbCCacheSecret;
        @jakarta.ws.rs.QueryParam("krbConfigConfigMap")
        private ConfigMapKeySelector krbConfigConfigMap;
        @jakarta.ws.rs.QueryParam("krbKeytabSecret")
        private SecretKeySelector krbKeytabSecret;
        @jakarta.ws.rs.QueryParam("krbRealm")
        private String krbRealm;
        @jakarta.ws.rs.QueryParam("krbServicePrincipalName")
        private String krbServicePrincipalName;
        @jakarta.ws.rs.QueryParam("krbUsername")
        private String krbUsername;
        @jakarta.ws.rs.QueryParam("metadata")
        private Map<String, String> metadata = null;
        @jakarta.ws.rs.QueryParam("type")
        private String type;
        @jakarta.ws.rs.QueryParam("watchPathConfig")
        private WatchPathConfig watchPathConfig;

        /**
        * Get addresses
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

        public HDFSEventSourceQueryParam addresses(List<String> addresses) {
            this.addresses = addresses;
            return this;
        }
        public HDFSEventSourceQueryParam addAddressesItem(String addressesItem) {
            this.addresses.add(addressesItem);
            return this;
        }

        /**
        * Get checkInterval
        * @return checkInterval
        **/
        @JsonProperty("checkInterval")
        public String getCheckInterval() {
            return checkInterval;
        }

        /**
         * Set checkInterval
         **/
        public void setCheckInterval(String checkInterval) {
            this.checkInterval = checkInterval;
        }

        public HDFSEventSourceQueryParam checkInterval(String checkInterval) {
            this.checkInterval = checkInterval;
            return this;
        }

        /**
        * Get filter
        * @return filter
        **/
        @JsonProperty("filter")
        public EventSourceFilter getFilter() {
            return filter;
        }

        /**
         * Set filter
         **/
        public void setFilter(EventSourceFilter filter) {
            this.filter = filter;
        }

        public HDFSEventSourceQueryParam filter(EventSourceFilter filter) {
            this.filter = filter;
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

        public HDFSEventSourceQueryParam hdfsUser(String hdfsUser) {
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

        public HDFSEventSourceQueryParam krbCCacheSecret(SecretKeySelector krbCCacheSecret) {
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

        public HDFSEventSourceQueryParam krbConfigConfigMap(ConfigMapKeySelector krbConfigConfigMap) {
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

        public HDFSEventSourceQueryParam krbKeytabSecret(SecretKeySelector krbKeytabSecret) {
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

        public HDFSEventSourceQueryParam krbRealm(String krbRealm) {
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

        public HDFSEventSourceQueryParam krbServicePrincipalName(String krbServicePrincipalName) {
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

        public HDFSEventSourceQueryParam krbUsername(String krbUsername) {
            this.krbUsername = krbUsername;
            return this;
        }

        /**
        * Get metadata
        * @return metadata
        **/
        @JsonProperty("metadata")
        public Map<String, String> getMetadata() {
            return metadata;
        }

        /**
         * Set metadata
         **/
        public void setMetadata(Map<String, String> metadata) {
            this.metadata = metadata;
        }

        public HDFSEventSourceQueryParam metadata(Map<String, String> metadata) {
            this.metadata = metadata;
            return this;
        }
        public HDFSEventSourceQueryParam putMetadataItem(String key, String metadataItem) {
            this.metadata.put(key, metadataItem);
            return this;
        }

        /**
        * Get type
        * @return type
        **/
        @JsonProperty("type")
        public String getType() {
            return type;
        }

        /**
         * Set type
         **/
        public void setType(String type) {
            this.type = type;
        }

        public HDFSEventSourceQueryParam type(String type) {
            this.type = type;
            return this;
        }

        /**
        * Get watchPathConfig
        * @return watchPathConfig
        **/
        @JsonProperty("watchPathConfig")
        public WatchPathConfig getWatchPathConfig() {
            return watchPathConfig;
        }

        /**
         * Set watchPathConfig
         **/
        public void setWatchPathConfig(WatchPathConfig watchPathConfig) {
            this.watchPathConfig = watchPathConfig;
        }

        public HDFSEventSourceQueryParam watchPathConfig(WatchPathConfig watchPathConfig) {
            this.watchPathConfig = watchPathConfig;
            return this;
        }

        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class HDFSEventSourceQueryParam {\n");

            sb.append("    addresses: ").append(toIndentedString(addresses)).append("\n");
            sb.append("    checkInterval: ").append(toIndentedString(checkInterval)).append("\n");
            sb.append("    filter: ").append(toIndentedString(filter)).append("\n");
            sb.append("    hdfsUser: ").append(toIndentedString(hdfsUser)).append("\n");
            sb.append("    krbCCacheSecret: ").append(toIndentedString(krbCCacheSecret)).append("\n");
            sb.append("    krbConfigConfigMap: ").append(toIndentedString(krbConfigConfigMap)).append("\n");
            sb.append("    krbKeytabSecret: ").append(toIndentedString(krbKeytabSecret)).append("\n");
            sb.append("    krbRealm: ").append(toIndentedString(krbRealm)).append("\n");
            sb.append("    krbServicePrincipalName: ").append(toIndentedString(krbServicePrincipalName)).append("\n");
            sb.append("    krbUsername: ").append(toIndentedString(krbUsername)).append("\n");
            sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
            sb.append("    type: ").append(toIndentedString(type)).append("\n");
            sb.append("    watchPathConfig: ").append(toIndentedString(watchPathConfig)).append("\n");
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
