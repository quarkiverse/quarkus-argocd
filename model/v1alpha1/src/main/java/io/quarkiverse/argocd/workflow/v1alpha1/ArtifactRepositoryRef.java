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
public class ArtifactRepositoryRef  {

    private String configMap;
    private String key;

    /**
    * The name of the config map. Defaults to \"artifact-repositories\".
    * @return configMap
    **/
    @JsonProperty("configMap")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public String getConfigMap() {
        return configMap;
    }

    /**
     * Set configMap
     **/
    public void setConfigMap(String configMap) {
        this.configMap = configMap;
    }

    public ArtifactRepositoryRef configMap(String configMap) {
        this.configMap = configMap;
        return this;
    }

    /**
    * The config map key. Defaults to the value of the \"workflows.argoproj.io/default-artifact-repository\" annotation.
    * @return key
    **/
    @JsonProperty("key")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public String getKey() {
        return key;
    }

    /**
     * Set key
     **/
    public void setKey(String key) {
        this.key = key;
    }

    public ArtifactRepositoryRef key(String key) {
        this.key = key;
        return this;
    }

    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ArtifactRepositoryRef {\n");

        sb.append("    configMap: ").append(toIndentedString(configMap)).append("\n");
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
    public static class ArtifactRepositoryRefQueryParam  {

        @jakarta.ws.rs.QueryParam("configMap")
        private String configMap;
        @jakarta.ws.rs.QueryParam("key")
        private String key;

        /**
        * The name of the config map. Defaults to \"artifact-repositories\".
        * @return configMap
        **/
        @JsonProperty("configMap")
        public String getConfigMap() {
            return configMap;
        }

        /**
         * Set configMap
         **/
        public void setConfigMap(String configMap) {
            this.configMap = configMap;
        }

        public ArtifactRepositoryRefQueryParam configMap(String configMap) {
            this.configMap = configMap;
            return this;
        }

        /**
        * The config map key. Defaults to the value of the \"workflows.argoproj.io/default-artifact-repository\" annotation.
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

        public ArtifactRepositoryRefQueryParam key(String key) {
            this.key = key;
            return this;
        }

        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class ArtifactRepositoryRefQueryParam {\n");

            sb.append("    configMap: ").append(toIndentedString(configMap)).append("\n");
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
