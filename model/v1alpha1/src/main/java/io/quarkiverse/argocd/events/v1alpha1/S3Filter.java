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
public class S3Filter  {

    private String prefix;
    private String suffix;

    /**
    * Get prefix
    * @return prefix
    **/
    @JsonProperty("prefix")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public String getPrefix() {
        return prefix;
    }

    /**
     * Set prefix
     **/
    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }

    public S3Filter prefix(String prefix) {
        this.prefix = prefix;
        return this;
    }

    /**
    * Get suffix
    * @return suffix
    **/
    @JsonProperty("suffix")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public String getSuffix() {
        return suffix;
    }

    /**
     * Set suffix
     **/
    public void setSuffix(String suffix) {
        this.suffix = suffix;
    }

    public S3Filter suffix(String suffix) {
        this.suffix = suffix;
        return this;
    }

    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class S3Filter {\n");

        sb.append("    prefix: ").append(toIndentedString(prefix)).append("\n");
        sb.append("    suffix: ").append(toIndentedString(suffix)).append("\n");
        
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
    public static class S3FilterQueryParam  {

        @jakarta.ws.rs.QueryParam("prefix")
        private String prefix;
        @jakarta.ws.rs.QueryParam("suffix")
        private String suffix;

        /**
        * Get prefix
        * @return prefix
        **/
        @JsonProperty("prefix")
        public String getPrefix() {
            return prefix;
        }

        /**
         * Set prefix
         **/
        public void setPrefix(String prefix) {
            this.prefix = prefix;
        }

        public S3FilterQueryParam prefix(String prefix) {
            this.prefix = prefix;
            return this;
        }

        /**
        * Get suffix
        * @return suffix
        **/
        @JsonProperty("suffix")
        public String getSuffix() {
            return suffix;
        }

        /**
         * Set suffix
         **/
        public void setSuffix(String suffix) {
            this.suffix = suffix;
        }

        public S3FilterQueryParam suffix(String suffix) {
            this.suffix = suffix;
            return this;
        }

        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class S3FilterQueryParam {\n");

            sb.append("    prefix: ").append(toIndentedString(prefix)).append("\n");
            sb.append("    suffix: ").append(toIndentedString(suffix)).append("\n");
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
