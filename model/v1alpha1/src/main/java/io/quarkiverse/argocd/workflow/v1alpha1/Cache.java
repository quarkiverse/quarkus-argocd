package io.quarkiverse.argocd.workflow.v1alpha1;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.fabric8.kubernetes.api.model.ConfigMapKeySelector;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.Type;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
/**
  * Cache is the configuration for the type of cache to be used
 **/
public class Cache  {

    /**
      * Cache is the configuration for the type of cache to be used
     **/
    private ConfigMapKeySelector configMap;

    /**
    * Get configMap
    * @return configMap
    **/
    @JsonProperty("configMap")
    public ConfigMapKeySelector getConfigMap() {
        return configMap;
    }

    /**
     * Set configMap
     **/
    public void setConfigMap(ConfigMapKeySelector configMap) {
        this.configMap = configMap;
    }

    public Cache configMap(ConfigMapKeySelector configMap) {
        this.configMap = configMap;
        return this;
    }

    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Cache {\n");

        sb.append("    configMap: ").append(toIndentedString(configMap)).append("\n");
        
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
      * Cache is the configuration for the type of cache to be used
     **/
    public static class CacheQueryParam  {

        /**
          * Cache is the configuration for the type of cache to be used
         **/
        @jakarta.ws.rs.QueryParam("configMap")
        private ConfigMapKeySelector configMap;

        /**
        * Get configMap
        * @return configMap
        **/
        @JsonProperty("configMap")
        public ConfigMapKeySelector getConfigMap() {
            return configMap;
        }

        /**
         * Set configMap
         **/
        public void setConfigMap(ConfigMapKeySelector configMap) {
            this.configMap = configMap;
        }

        public CacheQueryParam configMap(ConfigMapKeySelector configMap) {
            this.configMap = configMap;
            return this;
        }

        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class CacheQueryParam {\n");

            sb.append("    configMap: ").append(toIndentedString(configMap)).append("\n");
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