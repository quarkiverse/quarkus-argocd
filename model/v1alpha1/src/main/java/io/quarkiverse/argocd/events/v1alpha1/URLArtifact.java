package io.quarkiverse.argocd.events.v1alpha1;

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
  * URLArtifact contains information about an artifact at an http endpoint.
 **/
public class URLArtifact  {

    /**
      * URLArtifact contains information about an artifact at an http endpoint.
     **/
    private String path;
    /**
      * URLArtifact contains information about an artifact at an http endpoint.
     **/
    private Boolean verifyCert;

    /**
    * Get path
    * @return path
    **/
    @JsonProperty("path")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public String getPath() {
        return path;
    }

    /**
     * Set path
     **/
    public void setPath(String path) {
        this.path = path;
    }

    public URLArtifact path(String path) {
        this.path = path;
        return this;
    }

    /**
    * Get verifyCert
    * @return verifyCert
    **/
    @JsonProperty("verifyCert")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public Boolean getVerifyCert() {
        return verifyCert;
    }

    /**
     * Set verifyCert
     **/
    public void setVerifyCert(Boolean verifyCert) {
        this.verifyCert = verifyCert;
    }

    public URLArtifact verifyCert(Boolean verifyCert) {
        this.verifyCert = verifyCert;
        return this;
    }

    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class URLArtifact {\n");

        sb.append("    path: ").append(toIndentedString(path)).append("\n");
        sb.append("    verifyCert: ").append(toIndentedString(verifyCert)).append("\n");
        
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
      * URLArtifact contains information about an artifact at an http endpoint.
     **/
    public static class URLArtifactQueryParam  {

        /**
          * URLArtifact contains information about an artifact at an http endpoint.
         **/
        @jakarta.ws.rs.QueryParam("path")
        private String path;
        /**
          * URLArtifact contains information about an artifact at an http endpoint.
         **/
        @jakarta.ws.rs.QueryParam("verifyCert")
        private Boolean verifyCert;

        /**
        * Get path
        * @return path
        **/
        @JsonProperty("path")
        public String getPath() {
            return path;
        }

        /**
         * Set path
         **/
        public void setPath(String path) {
            this.path = path;
        }

        public URLArtifactQueryParam path(String path) {
            this.path = path;
            return this;
        }

        /**
        * Get verifyCert
        * @return verifyCert
        **/
        @JsonProperty("verifyCert")
        public Boolean getVerifyCert() {
            return verifyCert;
        }

        /**
         * Set verifyCert
         **/
        public void setVerifyCert(Boolean verifyCert) {
            this.verifyCert = verifyCert;
        }

        public URLArtifactQueryParam verifyCert(Boolean verifyCert) {
            this.verifyCert = verifyCert;
            return this;
        }

        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class URLArtifactQueryParam {\n");

            sb.append("    path: ").append(toIndentedString(path)).append("\n");
            sb.append("    verifyCert: ").append(toIndentedString(verifyCert)).append("\n");
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
