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
  * ArtifactResultNodeStatus describes the result of the deletion on a given node
 **/
public class ArtifactResultNodeStatus  {

    /**
      * ArtifactResultNodeStatus describes the result of the deletion on a given node
     **/
    private Map<String, ArtifactResult> artifactResults;

    /**
    * ArtifactResults maps Artifact name to result of the deletion
    * @return artifactResults
    **/
    @JsonProperty("artifactResults")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public Map<String, ArtifactResult> getArtifactResults() {
        return artifactResults;
    }

    /**
     * Set artifactResults
     **/
    public void setArtifactResults(Map<String, ArtifactResult> artifactResults) {
        this.artifactResults = artifactResults;
    }

    public ArtifactResultNodeStatus artifactResults(Map<String, ArtifactResult> artifactResults) {
        this.artifactResults = artifactResults;
        return this;
    }
    public ArtifactResultNodeStatus putArtifactResultsItem(String key, ArtifactResult artifactResultsItem) {
           if (this.artifactResults == null){
                artifactResults = new HashMap<>();
            }
        this.artifactResults.put(key, artifactResultsItem);
        return this;
    }

    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ArtifactResultNodeStatus {\n");

        sb.append("    artifactResults: ").append(toIndentedString(artifactResults)).append("\n");
        
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
      * ArtifactResultNodeStatus describes the result of the deletion on a given node
     **/
    public static class ArtifactResultNodeStatusQueryParam  {

        /**
          * ArtifactResultNodeStatus describes the result of the deletion on a given node
         **/
        @jakarta.ws.rs.QueryParam("artifactResults")
        private Map<String, ArtifactResult> artifactResults = null;

        /**
        * ArtifactResults maps Artifact name to result of the deletion
        * @return artifactResults
        **/
        @JsonProperty("artifactResults")
        public Map<String, ArtifactResult> getArtifactResults() {
            return artifactResults;
        }

        /**
         * Set artifactResults
         **/
        public void setArtifactResults(Map<String, ArtifactResult> artifactResults) {
            this.artifactResults = artifactResults;
        }

        public ArtifactResultNodeStatusQueryParam artifactResults(Map<String, ArtifactResult> artifactResults) {
            this.artifactResults = artifactResults;
            return this;
        }
        public ArtifactResultNodeStatusQueryParam putArtifactResultsItem(String key, ArtifactResult artifactResultsItem) {
            this.artifactResults.put(key, artifactResultsItem);
            return this;
        }

        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class ArtifactResultNodeStatusQueryParam {\n");

            sb.append("    artifactResults: ").append(toIndentedString(artifactResults)).append("\n");
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
