package io.quarkiverse.argocd.workflow.v1alpha1;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.Type;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
/**
  * ArtifactNodeSpec specifies the Artifacts that need to be deleted for a given Node
 **/
public class ArtifactNodeSpec  {

    /**
      * ArtifactNodeSpec specifies the Artifacts that need to be deleted for a given Node
     **/
    private ArtifactLocation archiveLocation;
    /**
      * ArtifactNodeSpec specifies the Artifacts that need to be deleted for a given Node
     **/
    private Map<String, Artifact> artifacts;

    /**
    * Get archiveLocation
    * @return archiveLocation
    **/
    @JsonProperty("archiveLocation")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public ArtifactLocation getArchiveLocation() {
        return archiveLocation;
    }

    /**
     * Set archiveLocation
     **/
    public void setArchiveLocation(ArtifactLocation archiveLocation) {
        this.archiveLocation = archiveLocation;
    }

    public ArtifactNodeSpec archiveLocation(ArtifactLocation archiveLocation) {
        this.archiveLocation = archiveLocation;
        return this;
    }

    /**
    * Artifacts maps artifact name to Artifact description
    * @return artifacts
    **/
    @JsonProperty("artifacts")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public Map<String, Artifact> getArtifacts() {
        return artifacts;
    }

    /**
     * Set artifacts
     **/
    public void setArtifacts(Map<String, Artifact> artifacts) {
        this.artifacts = artifacts;
    }

    public ArtifactNodeSpec artifacts(Map<String, Artifact> artifacts) {
        this.artifacts = artifacts;
        return this;
    }
    public ArtifactNodeSpec putArtifactsItem(String key, Artifact artifactsItem) {
           if (this.artifacts == null){
                artifacts = new HashMap<>();
            }
        this.artifacts.put(key, artifactsItem);
        return this;
    }

    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ArtifactNodeSpec {\n");

        sb.append("    archiveLocation: ").append(toIndentedString(archiveLocation)).append("\n");
        sb.append("    artifacts: ").append(toIndentedString(artifacts)).append("\n");
        
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
      * ArtifactNodeSpec specifies the Artifacts that need to be deleted for a given Node
     **/
    public static class ArtifactNodeSpecQueryParam  {

        /**
          * ArtifactNodeSpec specifies the Artifacts that need to be deleted for a given Node
         **/
        @jakarta.ws.rs.QueryParam("archiveLocation")
        private ArtifactLocation archiveLocation;
        /**
          * ArtifactNodeSpec specifies the Artifacts that need to be deleted for a given Node
         **/
        @jakarta.ws.rs.QueryParam("artifacts")
        private Map<String, Artifact> artifacts = null;

        /**
        * Get archiveLocation
        * @return archiveLocation
        **/
        @JsonProperty("archiveLocation")
        public ArtifactLocation getArchiveLocation() {
            return archiveLocation;
        }

        /**
         * Set archiveLocation
         **/
        public void setArchiveLocation(ArtifactLocation archiveLocation) {
            this.archiveLocation = archiveLocation;
        }

        public ArtifactNodeSpecQueryParam archiveLocation(ArtifactLocation archiveLocation) {
            this.archiveLocation = archiveLocation;
            return this;
        }

        /**
        * Artifacts maps artifact name to Artifact description
        * @return artifacts
        **/
        @JsonProperty("artifacts")
        public Map<String, Artifact> getArtifacts() {
            return artifacts;
        }

        /**
         * Set artifacts
         **/
        public void setArtifacts(Map<String, Artifact> artifacts) {
            this.artifacts = artifacts;
        }

        public ArtifactNodeSpecQueryParam artifacts(Map<String, Artifact> artifacts) {
            this.artifacts = artifacts;
            return this;
        }
        public ArtifactNodeSpecQueryParam putArtifactsItem(String key, Artifact artifactsItem) {
            this.artifacts.put(key, artifactsItem);
            return this;
        }

        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class ArtifactNodeSpecQueryParam {\n");

            sb.append("    archiveLocation: ").append(toIndentedString(archiveLocation)).append("\n");
            sb.append("    artifacts: ").append(toIndentedString(artifacts)).append("\n");
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
