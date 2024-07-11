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
  * ArtifactResult describes the result of attempting to delete a given Artifact
 **/
public class ArtifactResult  {

    /**
      * ArtifactResult describes the result of attempting to delete a given Artifact
     **/
    private String error;
    /**
      * ArtifactResult describes the result of attempting to delete a given Artifact
     **/
    private String name;
    /**
      * ArtifactResult describes the result of attempting to delete a given Artifact
     **/
    private Boolean success;

    /**
    * Error is an optional error message which should be set if Success==false
    * @return error
    **/
    @JsonProperty("error")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public String getError() {
        return error;
    }

    /**
     * Set error
     **/
    public void setError(String error) {
        this.error = error;
    }

    public ArtifactResult error(String error) {
        this.error = error;
        return this;
    }

    /**
    * Name is the name of the Artifact
    * @return name
    **/
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    /**
     * Set name
     **/
    public void setName(String name) {
        this.name = name;
    }

    public ArtifactResult name(String name) {
        this.name = name;
        return this;
    }

    /**
    * Success describes whether the deletion succeeded
    * @return success
    **/
    @JsonProperty("success")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public Boolean getSuccess() {
        return success;
    }

    /**
     * Set success
     **/
    public void setSuccess(Boolean success) {
        this.success = success;
    }

    public ArtifactResult success(Boolean success) {
        this.success = success;
        return this;
    }

    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ArtifactResult {\n");

        sb.append("    error: ").append(toIndentedString(error)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    success: ").append(toIndentedString(success)).append("\n");
        
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
      * ArtifactResult describes the result of attempting to delete a given Artifact
     **/
    public static class ArtifactResultQueryParam  {

        /**
          * ArtifactResult describes the result of attempting to delete a given Artifact
         **/
        @jakarta.ws.rs.QueryParam("error")
        private String error;
        /**
          * ArtifactResult describes the result of attempting to delete a given Artifact
         **/
        @jakarta.ws.rs.QueryParam("name")
        private String name;
        /**
          * ArtifactResult describes the result of attempting to delete a given Artifact
         **/
        @jakarta.ws.rs.QueryParam("success")
        private Boolean success;

        /**
        * Error is an optional error message which should be set if Success==false
        * @return error
        **/
        @JsonProperty("error")
        public String getError() {
            return error;
        }

        /**
         * Set error
         **/
        public void setError(String error) {
            this.error = error;
        }

        public ArtifactResultQueryParam error(String error) {
            this.error = error;
            return this;
        }

        /**
        * Name is the name of the Artifact
        * @return name
        **/
        @JsonProperty("name")
        public String getName() {
            return name;
        }

        /**
         * Set name
         **/
        public void setName(String name) {
            this.name = name;
        }

        public ArtifactResultQueryParam name(String name) {
            this.name = name;
            return this;
        }

        /**
        * Success describes whether the deletion succeeded
        * @return success
        **/
        @JsonProperty("success")
        public Boolean getSuccess() {
            return success;
        }

        /**
         * Set success
         **/
        public void setSuccess(Boolean success) {
            this.success = success;
        }

        public ArtifactResultQueryParam success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class ArtifactResultQueryParam {\n");

            sb.append("    error: ").append(toIndentedString(error)).append("\n");
            sb.append("    name: ").append(toIndentedString(name)).append("\n");
            sb.append("    success: ").append(toIndentedString(success)).append("\n");
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
