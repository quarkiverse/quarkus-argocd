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
  * RawArtifact allows raw string content to be placed as an artifact in a container
 **/
public class RawArtifact  {

    /**
      * RawArtifact allows raw string content to be placed as an artifact in a container
     **/
    private String data;

    /**
    * Data is the string contents of the artifact
    * @return data
    **/
    @JsonProperty("data")
    public String getData() {
        return data;
    }

    /**
     * Set data
     **/
    public void setData(String data) {
        this.data = data;
    }

    public RawArtifact data(String data) {
        this.data = data;
        return this;
    }

    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RawArtifact {\n");

        sb.append("    data: ").append(toIndentedString(data)).append("\n");
        
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
      * RawArtifact allows raw string content to be placed as an artifact in a container
     **/
    public static class RawArtifactQueryParam  {

        /**
          * RawArtifact allows raw string content to be placed as an artifact in a container
         **/
        @jakarta.ws.rs.QueryParam("data")
        private String data;

        /**
        * Data is the string contents of the artifact
        * @return data
        **/
        @JsonProperty("data")
        public String getData() {
            return data;
        }

        /**
         * Set data
         **/
        public void setData(String data) {
            this.data = data;
        }

        public RawArtifactQueryParam data(String data) {
            this.data = data;
            return this;
        }

        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class RawArtifactQueryParam {\n");

            sb.append("    data: ").append(toIndentedString(data)).append("\n");
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