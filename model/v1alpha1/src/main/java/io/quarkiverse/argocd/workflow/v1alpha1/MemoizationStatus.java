package io.quarkiverse.argocd.workflow.v1alpha1;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.Type;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
/**
  * MemoizationStatus is the status of this memoized node
 **/
public class MemoizationStatus  {

    /**
      * MemoizationStatus is the status of this memoized node
     **/
    private String cacheName;
    /**
      * MemoizationStatus is the status of this memoized node
     **/
    private Boolean hit;
    /**
      * MemoizationStatus is the status of this memoized node
     **/
    private String key;

    /**
    * Cache is the name of the cache that was used
    * @return cacheName
    **/
    @JsonProperty("cacheName")
    public String getCacheName() {
        return cacheName;
    }

    /**
     * Set cacheName
     **/
    public void setCacheName(String cacheName) {
        this.cacheName = cacheName;
    }

    public MemoizationStatus cacheName(String cacheName) {
        this.cacheName = cacheName;
        return this;
    }

    /**
    * Hit indicates whether this node was created from a cache entry
    * @return hit
    **/
    @JsonProperty("hit")
    public Boolean getHit() {
        return hit;
    }

    /**
     * Set hit
     **/
    public void setHit(Boolean hit) {
        this.hit = hit;
    }

    public MemoizationStatus hit(Boolean hit) {
        this.hit = hit;
        return this;
    }

    /**
    * Key is the name of the key used for this node's cache
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

    public MemoizationStatus key(String key) {
        this.key = key;
        return this;
    }

    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class MemoizationStatus {\n");

        sb.append("    cacheName: ").append(toIndentedString(cacheName)).append("\n");
        sb.append("    hit: ").append(toIndentedString(hit)).append("\n");
        sb.append("    key: ").append(toIndentedString(key)).append("\n");
        
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
      * MemoizationStatus is the status of this memoized node
     **/
    public static class MemoizationStatusQueryParam  {

        /**
          * MemoizationStatus is the status of this memoized node
         **/
        @jakarta.ws.rs.QueryParam("cacheName")
        private String cacheName;
        /**
          * MemoizationStatus is the status of this memoized node
         **/
        @jakarta.ws.rs.QueryParam("hit")
        private Boolean hit;
        /**
          * MemoizationStatus is the status of this memoized node
         **/
        @jakarta.ws.rs.QueryParam("key")
        private String key;

        /**
        * Cache is the name of the cache that was used
        * @return cacheName
        **/
        @JsonProperty("cacheName")
        public String getCacheName() {
            return cacheName;
        }

        /**
         * Set cacheName
         **/
        public void setCacheName(String cacheName) {
            this.cacheName = cacheName;
        }

        public MemoizationStatusQueryParam cacheName(String cacheName) {
            this.cacheName = cacheName;
            return this;
        }

        /**
        * Hit indicates whether this node was created from a cache entry
        * @return hit
        **/
        @JsonProperty("hit")
        public Boolean getHit() {
            return hit;
        }

        /**
         * Set hit
         **/
        public void setHit(Boolean hit) {
            this.hit = hit;
        }

        public MemoizationStatusQueryParam hit(Boolean hit) {
            this.hit = hit;
            return this;
        }

        /**
        * Key is the name of the key used for this node's cache
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

        public MemoizationStatusQueryParam key(String key) {
            this.key = key;
            return this;
        }

        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class MemoizationStatusQueryParam {\n");

            sb.append("    cacheName: ").append(toIndentedString(cacheName)).append("\n");
            sb.append("    hit: ").append(toIndentedString(hit)).append("\n");
            sb.append("    key: ").append(toIndentedString(key)).append("\n");
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