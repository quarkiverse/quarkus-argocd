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
  * DataSource sources external data into a data template
 **/
public class DataSource  {

    /**
      * DataSource sources external data into a data template
     **/
    private ArtifactPaths artifactPaths;

    /**
    * Get artifactPaths
    * @return artifactPaths
    **/
    @JsonProperty("artifactPaths")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public ArtifactPaths getArtifactPaths() {
        return artifactPaths;
    }

    /**
     * Set artifactPaths
     **/
    public void setArtifactPaths(ArtifactPaths artifactPaths) {
        this.artifactPaths = artifactPaths;
    }

    public DataSource artifactPaths(ArtifactPaths artifactPaths) {
        this.artifactPaths = artifactPaths;
        return this;
    }

    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DataSource {\n");

        sb.append("    artifactPaths: ").append(toIndentedString(artifactPaths)).append("\n");
        
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
      * DataSource sources external data into a data template
     **/
    public static class DataSourceQueryParam  {

        /**
          * DataSource sources external data into a data template
         **/
        @jakarta.ws.rs.QueryParam("artifactPaths")
        private ArtifactPaths artifactPaths;

        /**
        * Get artifactPaths
        * @return artifactPaths
        **/
        @JsonProperty("artifactPaths")
        public ArtifactPaths getArtifactPaths() {
            return artifactPaths;
        }

        /**
         * Set artifactPaths
         **/
        public void setArtifactPaths(ArtifactPaths artifactPaths) {
            this.artifactPaths = artifactPaths;
        }

        public DataSourceQueryParam artifactPaths(ArtifactPaths artifactPaths) {
            this.artifactPaths = artifactPaths;
            return this;
        }

        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class DataSourceQueryParam {\n");

            sb.append("    artifactPaths: ").append(toIndentedString(artifactPaths)).append("\n");
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
