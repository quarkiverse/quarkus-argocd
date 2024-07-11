package io.quarkiverse.argocd.workflow.v1alpha1;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.quarkiverse.argocd.v1alpha1.model.Cache;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.Type;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
/**
  * Memoization enables caching for the Outputs of the template
 **/
public class Memoize  {

    /**
      * Memoization enables caching for the Outputs of the template
     **/
    private Cache cache;
    /**
      * Memoization enables caching for the Outputs of the template
     **/
    private String key;
    /**
      * Memoization enables caching for the Outputs of the template
     **/
    private String maxAge;

    /**
    * Get cache
    * @return cache
    **/
    @JsonProperty("cache")
    public Cache getCache() {
        return cache;
    }

    /**
     * Set cache
     **/
    public void setCache(Cache cache) {
        this.cache = cache;
    }

    public Memoize cache(Cache cache) {
        this.cache = cache;
        return this;
    }

    /**
    * Key is the key to use as the caching key
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

    public Memoize key(String key) {
        this.key = key;
        return this;
    }

    /**
    * MaxAge is the maximum age (e.g. \"180s\", \"24h\") of an entry that is still considered valid. If an entry is older than the MaxAge, it will be ignored.
    * @return maxAge
    **/
    @JsonProperty("maxAge")
    public String getMaxAge() {
        return maxAge;
    }

    /**
     * Set maxAge
     **/
    public void setMaxAge(String maxAge) {
        this.maxAge = maxAge;
    }

    public Memoize maxAge(String maxAge) {
        this.maxAge = maxAge;
        return this;
    }

    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Memoize {\n");

        sb.append("    cache: ").append(toIndentedString(cache)).append("\n");
        sb.append("    key: ").append(toIndentedString(key)).append("\n");
        sb.append("    maxAge: ").append(toIndentedString(maxAge)).append("\n");
        
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
      * Memoization enables caching for the Outputs of the template
     **/
    public static class MemoizeQueryParam  {

        /**
          * Memoization enables caching for the Outputs of the template
         **/
        @jakarta.ws.rs.QueryParam("cache")
        private Cache cache;
        /**
          * Memoization enables caching for the Outputs of the template
         **/
        @jakarta.ws.rs.QueryParam("key")
        private String key;
        /**
          * Memoization enables caching for the Outputs of the template
         **/
        @jakarta.ws.rs.QueryParam("maxAge")
        private String maxAge;

        /**
        * Get cache
        * @return cache
        **/
        @JsonProperty("cache")
        public Cache getCache() {
            return cache;
        }

        /**
         * Set cache
         **/
        public void setCache(Cache cache) {
            this.cache = cache;
        }

        public MemoizeQueryParam cache(Cache cache) {
            this.cache = cache;
            return this;
        }

        /**
        * Key is the key to use as the caching key
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

        public MemoizeQueryParam key(String key) {
            this.key = key;
            return this;
        }

        /**
        * MaxAge is the maximum age (e.g. \"180s\", \"24h\") of an entry that is still considered valid. If an entry is older than the MaxAge, it will be ignored.
        * @return maxAge
        **/
        @JsonProperty("maxAge")
        public String getMaxAge() {
            return maxAge;
        }

        /**
         * Set maxAge
         **/
        public void setMaxAge(String maxAge) {
            this.maxAge = maxAge;
        }

        public MemoizeQueryParam maxAge(String maxAge) {
            this.maxAge = maxAge;
            return this;
        }

        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class MemoizeQueryParam {\n");

            sb.append("    cache: ").append(toIndentedString(cache)).append("\n");
            sb.append("    key: ").append(toIndentedString(key)).append("\n");
            sb.append("    maxAge: ").append(toIndentedString(maxAge)).append("\n");
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