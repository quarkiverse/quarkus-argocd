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
  * TarStrategy will tar and gzip the file or directory when saving
 **/
public class TarStrategy  {

    /**
      * TarStrategy will tar and gzip the file or directory when saving
     **/
    private Integer compressionLevel;

    /**
    * CompressionLevel specifies the gzip compression level to use for the artifact. Defaults to gzip.DefaultCompression.
    * @return compressionLevel
    **/
    @JsonProperty("compressionLevel")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public Integer getCompressionLevel() {
        return compressionLevel;
    }

    /**
     * Set compressionLevel
     **/
    public void setCompressionLevel(Integer compressionLevel) {
        this.compressionLevel = compressionLevel;
    }

    public TarStrategy compressionLevel(Integer compressionLevel) {
        this.compressionLevel = compressionLevel;
        return this;
    }

    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TarStrategy {\n");

        sb.append("    compressionLevel: ").append(toIndentedString(compressionLevel)).append("\n");
        
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
      * TarStrategy will tar and gzip the file or directory when saving
     **/
    public static class TarStrategyQueryParam  {

        /**
          * TarStrategy will tar and gzip the file or directory when saving
         **/
        @jakarta.ws.rs.QueryParam("compressionLevel")
        private Integer compressionLevel;

        /**
        * CompressionLevel specifies the gzip compression level to use for the artifact. Defaults to gzip.DefaultCompression.
        * @return compressionLevel
        **/
        @JsonProperty("compressionLevel")
        public Integer getCompressionLevel() {
            return compressionLevel;
        }

        /**
         * Set compressionLevel
         **/
        public void setCompressionLevel(Integer compressionLevel) {
            this.compressionLevel = compressionLevel;
        }

        public TarStrategyQueryParam compressionLevel(Integer compressionLevel) {
            this.compressionLevel = compressionLevel;
            return this;
        }

        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class TarStrategyQueryParam {\n");

            sb.append("    compressionLevel: ").append(toIndentedString(compressionLevel)).append("\n");
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