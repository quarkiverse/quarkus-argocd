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
public class ManifestFrom  {

    private Artifact artifact;

    /**
    * Get artifact
    * @return artifact
    **/
    @JsonProperty("artifact")
    public Artifact getArtifact() {
        return artifact;
    }

    /**
     * Set artifact
     **/
    public void setArtifact(Artifact artifact) {
        this.artifact = artifact;
    }

    public ManifestFrom artifact(Artifact artifact) {
        this.artifact = artifact;
        return this;
    }

    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ManifestFrom {\n");

        sb.append("    artifact: ").append(toIndentedString(artifact)).append("\n");
        
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
    public static class ManifestFromQueryParam  {

        @jakarta.ws.rs.QueryParam("artifact")
        private Artifact artifact;

        /**
        * Get artifact
        * @return artifact
        **/
        @JsonProperty("artifact")
        public Artifact getArtifact() {
            return artifact;
        }

        /**
         * Set artifact
         **/
        public void setArtifact(Artifact artifact) {
            this.artifact = artifact;
        }

        public ManifestFromQueryParam artifact(Artifact artifact) {
            this.artifact = artifact;
            return this;
        }

        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class ManifestFromQueryParam {\n");

            sb.append("    artifact: ").append(toIndentedString(artifact)).append("\n");
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
