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
  * ArtifactGCSpec specifies the Artifacts that need to be deleted
 **/
public class ArtifactGCSpec  {

    /**
      * ArtifactGCSpec specifies the Artifacts that need to be deleted
     **/
    private Map<String, ArtifactNodeSpec> artifactsByNode;

    /**
    * ArtifactsByNode maps Node name to information pertaining to Artifacts on that Node
    * @return artifactsByNode
    **/
    @JsonProperty("artifactsByNode")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public Map<String, ArtifactNodeSpec> getArtifactsByNode() {
        return artifactsByNode;
    }

    /**
     * Set artifactsByNode
     **/
    public void setArtifactsByNode(Map<String, ArtifactNodeSpec> artifactsByNode) {
        this.artifactsByNode = artifactsByNode;
    }

    public ArtifactGCSpec artifactsByNode(Map<String, ArtifactNodeSpec> artifactsByNode) {
        this.artifactsByNode = artifactsByNode;
        return this;
    }
    public ArtifactGCSpec putArtifactsByNodeItem(String key, ArtifactNodeSpec artifactsByNodeItem) {
           if (this.artifactsByNode == null){
                artifactsByNode = new HashMap<>();
            }
        this.artifactsByNode.put(key, artifactsByNodeItem);
        return this;
    }

    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ArtifactGCSpec {\n");

        sb.append("    artifactsByNode: ").append(toIndentedString(artifactsByNode)).append("\n");
        
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
      * ArtifactGCSpec specifies the Artifacts that need to be deleted
     **/
    public static class ArtifactGCSpecQueryParam  {

        /**
          * ArtifactGCSpec specifies the Artifacts that need to be deleted
         **/
        @jakarta.ws.rs.QueryParam("artifactsByNode")
        private Map<String, ArtifactNodeSpec> artifactsByNode = null;

        /**
        * ArtifactsByNode maps Node name to information pertaining to Artifacts on that Node
        * @return artifactsByNode
        **/
        @JsonProperty("artifactsByNode")
        public Map<String, ArtifactNodeSpec> getArtifactsByNode() {
            return artifactsByNode;
        }

        /**
         * Set artifactsByNode
         **/
        public void setArtifactsByNode(Map<String, ArtifactNodeSpec> artifactsByNode) {
            this.artifactsByNode = artifactsByNode;
        }

        public ArtifactGCSpecQueryParam artifactsByNode(Map<String, ArtifactNodeSpec> artifactsByNode) {
            this.artifactsByNode = artifactsByNode;
            return this;
        }
        public ArtifactGCSpecQueryParam putArtifactsByNodeItem(String key, ArtifactNodeSpec artifactsByNodeItem) {
            this.artifactsByNode.put(key, artifactsByNodeItem);
            return this;
        }

        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class ArtifactGCSpecQueryParam {\n");

            sb.append("    artifactsByNode: ").append(toIndentedString(artifactsByNode)).append("\n");
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
