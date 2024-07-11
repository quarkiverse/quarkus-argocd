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
  * CreateS3BucketOptions options used to determine automatic automatic bucket-creation process
 **/
public class CreateS3BucketOptions  {

    /**
      * CreateS3BucketOptions options used to determine automatic automatic bucket-creation process
     **/
    private Boolean objectLocking;

    /**
    * ObjectLocking Enable object locking
    * @return objectLocking
    **/
    @JsonProperty("objectLocking")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public Boolean getObjectLocking() {
        return objectLocking;
    }

    /**
     * Set objectLocking
     **/
    public void setObjectLocking(Boolean objectLocking) {
        this.objectLocking = objectLocking;
    }

    public CreateS3BucketOptions objectLocking(Boolean objectLocking) {
        this.objectLocking = objectLocking;
        return this;
    }

    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateS3BucketOptions {\n");

        sb.append("    objectLocking: ").append(toIndentedString(objectLocking)).append("\n");
        
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
      * CreateS3BucketOptions options used to determine automatic automatic bucket-creation process
     **/
    public static class CreateS3BucketOptionsQueryParam  {

        /**
          * CreateS3BucketOptions options used to determine automatic automatic bucket-creation process
         **/
        @jakarta.ws.rs.QueryParam("objectLocking")
        private Boolean objectLocking;

        /**
        * ObjectLocking Enable object locking
        * @return objectLocking
        **/
        @JsonProperty("objectLocking")
        public Boolean getObjectLocking() {
            return objectLocking;
        }

        /**
         * Set objectLocking
         **/
        public void setObjectLocking(Boolean objectLocking) {
            this.objectLocking = objectLocking;
        }

        public CreateS3BucketOptionsQueryParam objectLocking(Boolean objectLocking) {
            this.objectLocking = objectLocking;
            return this;
        }

        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class CreateS3BucketOptionsQueryParam {\n");

            sb.append("    objectLocking: ").append(toIndentedString(objectLocking)).append("\n");
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