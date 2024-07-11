package io.quarkiverse.argocd.workflow.v1alpha1;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.quarkiverse.argocd.v1alpha1.model.ArtifactResultNodeStatus;
import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.Type;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
/**
  * ArtifactGCStatus describes the result of the deletion
 **/
public class ArtifactGCStatus  {

    /**
      * ArtifactGCStatus describes the result of the deletion
     **/
    private Map<String, ArtifactResultNodeStatus> artifactResultsByNode;

    /**
    * ArtifactResultsByNode maps Node name to result
    * @return artifactResultsByNode
    **/
    @JsonProperty("artifactResultsByNode")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public Map<String, ArtifactResultNodeStatus> getArtifactResultsByNode() {
        return artifactResultsByNode;
    }

    /**
     * Set artifactResultsByNode
     **/
    public void setArtifactResultsByNode(Map<String, ArtifactResultNodeStatus> artifactResultsByNode) {
        this.artifactResultsByNode = artifactResultsByNode;
    }

    public ArtifactGCStatus artifactResultsByNode(Map<String, ArtifactResultNodeStatus> artifactResultsByNode) {
        this.artifactResultsByNode = artifactResultsByNode;
        return this;
    }
    public ArtifactGCStatus putArtifactResultsByNodeItem(String key, ArtifactResultNodeStatus artifactResultsByNodeItem) {
           if (this.artifactResultsByNode == null){
                artifactResultsByNode = new HashMap<>();
            }
        this.artifactResultsByNode.put(key, artifactResultsByNodeItem);
        return this;
    }

    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ArtifactGCStatus {\n");

        sb.append("    artifactResultsByNode: ").append(toIndentedString(artifactResultsByNode)).append("\n");
        
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
      * ArtifactGCStatus describes the result of the deletion
     **/
    public static class ArtifactGCStatusQueryParam  {

        /**
          * ArtifactGCStatus describes the result of the deletion
         **/
        @jakarta.ws.rs.QueryParam("artifactResultsByNode")
        private Map<String, ArtifactResultNodeStatus> artifactResultsByNode = null;

        /**
        * ArtifactResultsByNode maps Node name to result
        * @return artifactResultsByNode
        **/
        @JsonProperty("artifactResultsByNode")
        public Map<String, ArtifactResultNodeStatus> getArtifactResultsByNode() {
            return artifactResultsByNode;
        }

        /**
         * Set artifactResultsByNode
         **/
        public void setArtifactResultsByNode(Map<String, ArtifactResultNodeStatus> artifactResultsByNode) {
            this.artifactResultsByNode = artifactResultsByNode;
        }

        public ArtifactGCStatusQueryParam artifactResultsByNode(Map<String, ArtifactResultNodeStatus> artifactResultsByNode) {
            this.artifactResultsByNode = artifactResultsByNode;
            return this;
        }
        public ArtifactGCStatusQueryParam putArtifactResultsByNodeItem(String key, ArtifactResultNodeStatus artifactResultsByNodeItem) {
            this.artifactResultsByNode.put(key, artifactResultsByNodeItem);
            return this;
        }

        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class ArtifactGCStatusQueryParam {\n");

            sb.append("    artifactResultsByNode: ").append(toIndentedString(artifactResultsByNode)).append("\n");
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
