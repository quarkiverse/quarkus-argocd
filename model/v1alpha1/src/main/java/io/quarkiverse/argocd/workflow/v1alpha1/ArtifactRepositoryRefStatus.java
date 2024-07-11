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
public class ArtifactRepositoryRefStatus  {

    private ArtifactRepository artifactRepository;
    private String configMap;
    private Boolean _default;
    private String key;
    private String namespace;

    /**
    * Get artifactRepository
    * @return artifactRepository
    **/
    @JsonProperty("artifactRepository")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public ArtifactRepository getArtifactRepository() {
        return artifactRepository;
    }

    /**
     * Set artifactRepository
     **/
    public void setArtifactRepository(ArtifactRepository artifactRepository) {
        this.artifactRepository = artifactRepository;
    }

    public ArtifactRepositoryRefStatus artifactRepository(ArtifactRepository artifactRepository) {
        this.artifactRepository = artifactRepository;
        return this;
    }

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

    public ArtifactRepositoryRefStatus configMap(String configMap) {
        this.configMap = configMap;
        return this;
    }

    /**
    * If this ref represents the default artifact repository, rather than a config map.
    * @return _default
    **/
    @JsonProperty("default")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public Boolean getDefault() {
        return _default;
    }

    /**
     * Set _default
     **/
    public void setDefault(Boolean _default) {
        this._default = _default;
    }

    public ArtifactRepositoryRefStatus _default(Boolean _default) {
        this._default = _default;
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

    public ArtifactRepositoryRefStatus key(String key) {
        this.key = key;
        return this;
    }

    /**
    * The namespace of the config map. Defaults to the workflow's namespace, or the controller's namespace (if found).
    * @return namespace
    **/
    @JsonProperty("namespace")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public String getNamespace() {
        return namespace;
    }

    /**
     * Set namespace
     **/
    public void setNamespace(String namespace) {
        this.namespace = namespace;
    }

    public ArtifactRepositoryRefStatus namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ArtifactRepositoryRefStatus {\n");

        sb.append("    artifactRepository: ").append(toIndentedString(artifactRepository)).append("\n");
        sb.append("    configMap: ").append(toIndentedString(configMap)).append("\n");
        sb.append("    _default: ").append(toIndentedString(_default)).append("\n");
        sb.append("    key: ").append(toIndentedString(key)).append("\n");
        sb.append("    namespace: ").append(toIndentedString(namespace)).append("\n");
        
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
    public static class ArtifactRepositoryRefStatusQueryParam  {

        @jakarta.ws.rs.QueryParam("artifactRepository")
        private ArtifactRepository artifactRepository;
        @jakarta.ws.rs.QueryParam("configMap")
        private String configMap;
        @jakarta.ws.rs.QueryParam("_default")
        private Boolean _default;
        @jakarta.ws.rs.QueryParam("key")
        private String key;
        @jakarta.ws.rs.QueryParam("namespace")
        private String namespace;

        /**
        * Get artifactRepository
        * @return artifactRepository
        **/
        @JsonProperty("artifactRepository")
        public ArtifactRepository getArtifactRepository() {
            return artifactRepository;
        }

        /**
         * Set artifactRepository
         **/
        public void setArtifactRepository(ArtifactRepository artifactRepository) {
            this.artifactRepository = artifactRepository;
        }

        public ArtifactRepositoryRefStatusQueryParam artifactRepository(ArtifactRepository artifactRepository) {
            this.artifactRepository = artifactRepository;
            return this;
        }

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

        public ArtifactRepositoryRefStatusQueryParam configMap(String configMap) {
            this.configMap = configMap;
            return this;
        }

        /**
        * If this ref represents the default artifact repository, rather than a config map.
        * @return _default
        **/
        @JsonProperty("default")
        public Boolean getDefault() {
            return _default;
        }

        /**
         * Set _default
         **/
        public void setDefault(Boolean _default) {
            this._default = _default;
        }

        public ArtifactRepositoryRefStatusQueryParam _default(Boolean _default) {
            this._default = _default;
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

        public ArtifactRepositoryRefStatusQueryParam key(String key) {
            this.key = key;
            return this;
        }

        /**
        * The namespace of the config map. Defaults to the workflow's namespace, or the controller's namespace (if found).
        * @return namespace
        **/
        @JsonProperty("namespace")
        public String getNamespace() {
            return namespace;
        }

        /**
         * Set namespace
         **/
        public void setNamespace(String namespace) {
            this.namespace = namespace;
        }

        public ArtifactRepositoryRefStatusQueryParam namespace(String namespace) {
            this.namespace = namespace;
            return this;
        }

        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class ArtifactRepositoryRefStatusQueryParam {\n");

            sb.append("    artifactRepository: ").append(toIndentedString(artifactRepository)).append("\n");
            sb.append("    configMap: ").append(toIndentedString(configMap)).append("\n");
            sb.append("    _default: ").append(toIndentedString(_default)).append("\n");
            sb.append("    key: ").append(toIndentedString(key)).append("\n");
            sb.append("    namespace: ").append(toIndentedString(namespace)).append("\n");
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
