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
public class WatchPathConfig  {

    private String directory;
    private String path;
    private String pathRegexp;

    /**
    * Get directory
    * @return directory
    **/
    @JsonProperty("directory")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public String getDirectory() {
        return directory;
    }

    /**
     * Set directory
     **/
    public void setDirectory(String directory) {
        this.directory = directory;
    }

    public WatchPathConfig directory(String directory) {
        this.directory = directory;
        return this;
    }

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

    public WatchPathConfig path(String path) {
        this.path = path;
        return this;
    }

    /**
    * Get pathRegexp
    * @return pathRegexp
    **/
    @JsonProperty("pathRegexp")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public String getPathRegexp() {
        return pathRegexp;
    }

    /**
     * Set pathRegexp
     **/
    public void setPathRegexp(String pathRegexp) {
        this.pathRegexp = pathRegexp;
    }

    public WatchPathConfig pathRegexp(String pathRegexp) {
        this.pathRegexp = pathRegexp;
        return this;
    }

    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class WatchPathConfig {\n");

        sb.append("    directory: ").append(toIndentedString(directory)).append("\n");
        sb.append("    path: ").append(toIndentedString(path)).append("\n");
        sb.append("    pathRegexp: ").append(toIndentedString(pathRegexp)).append("\n");
        
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
    public static class WatchPathConfigQueryParam  {

        @jakarta.ws.rs.QueryParam("directory")
        private String directory;
        @jakarta.ws.rs.QueryParam("path")
        private String path;
        @jakarta.ws.rs.QueryParam("pathRegexp")
        private String pathRegexp;

        /**
        * Get directory
        * @return directory
        **/
        @JsonProperty("directory")
        public String getDirectory() {
            return directory;
        }

        /**
         * Set directory
         **/
        public void setDirectory(String directory) {
            this.directory = directory;
        }

        public WatchPathConfigQueryParam directory(String directory) {
            this.directory = directory;
            return this;
        }

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

        public WatchPathConfigQueryParam path(String path) {
            this.path = path;
            return this;
        }

        /**
        * Get pathRegexp
        * @return pathRegexp
        **/
        @JsonProperty("pathRegexp")
        public String getPathRegexp() {
            return pathRegexp;
        }

        /**
         * Set pathRegexp
         **/
        public void setPathRegexp(String pathRegexp) {
            this.pathRegexp = pathRegexp;
        }

        public WatchPathConfigQueryParam pathRegexp(String pathRegexp) {
            this.pathRegexp = pathRegexp;
            return this;
        }

        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class WatchPathConfigQueryParam {\n");

            sb.append("    directory: ").append(toIndentedString(directory)).append("\n");
            sb.append("    path: ").append(toIndentedString(path)).append("\n");
            sb.append("    pathRegexp: ").append(toIndentedString(pathRegexp)).append("\n");
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
