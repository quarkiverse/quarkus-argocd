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
  * OSSLifecycleRule specifies how to manage bucket's lifecycle
 **/
public class OSSLifecycleRule  {

    /**
      * OSSLifecycleRule specifies how to manage bucket's lifecycle
     **/
    private Integer markDeletionAfterDays;
    /**
      * OSSLifecycleRule specifies how to manage bucket's lifecycle
     **/
    private Integer markInfrequentAccessAfterDays;

    /**
    * MarkDeletionAfterDays is the number of days before we delete objects in the bucket
    * @return markDeletionAfterDays
    **/
    @JsonProperty("markDeletionAfterDays")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public Integer getMarkDeletionAfterDays() {
        return markDeletionAfterDays;
    }

    /**
     * Set markDeletionAfterDays
     **/
    public void setMarkDeletionAfterDays(Integer markDeletionAfterDays) {
        this.markDeletionAfterDays = markDeletionAfterDays;
    }

    public OSSLifecycleRule markDeletionAfterDays(Integer markDeletionAfterDays) {
        this.markDeletionAfterDays = markDeletionAfterDays;
        return this;
    }

    /**
    * MarkInfrequentAccessAfterDays is the number of days before we convert the objects in the bucket to Infrequent Access (IA) storage type
    * @return markInfrequentAccessAfterDays
    **/
    @JsonProperty("markInfrequentAccessAfterDays")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public Integer getMarkInfrequentAccessAfterDays() {
        return markInfrequentAccessAfterDays;
    }

    /**
     * Set markInfrequentAccessAfterDays
     **/
    public void setMarkInfrequentAccessAfterDays(Integer markInfrequentAccessAfterDays) {
        this.markInfrequentAccessAfterDays = markInfrequentAccessAfterDays;
    }

    public OSSLifecycleRule markInfrequentAccessAfterDays(Integer markInfrequentAccessAfterDays) {
        this.markInfrequentAccessAfterDays = markInfrequentAccessAfterDays;
        return this;
    }

    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OSSLifecycleRule {\n");

        sb.append("    markDeletionAfterDays: ").append(toIndentedString(markDeletionAfterDays)).append("\n");
        sb.append("    markInfrequentAccessAfterDays: ").append(toIndentedString(markInfrequentAccessAfterDays)).append("\n");
        
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
      * OSSLifecycleRule specifies how to manage bucket's lifecycle
     **/
    public static class OSSLifecycleRuleQueryParam  {

        /**
          * OSSLifecycleRule specifies how to manage bucket's lifecycle
         **/
        @jakarta.ws.rs.QueryParam("markDeletionAfterDays")
        private Integer markDeletionAfterDays;
        /**
          * OSSLifecycleRule specifies how to manage bucket's lifecycle
         **/
        @jakarta.ws.rs.QueryParam("markInfrequentAccessAfterDays")
        private Integer markInfrequentAccessAfterDays;

        /**
        * MarkDeletionAfterDays is the number of days before we delete objects in the bucket
        * @return markDeletionAfterDays
        **/
        @JsonProperty("markDeletionAfterDays")
        public Integer getMarkDeletionAfterDays() {
            return markDeletionAfterDays;
        }

        /**
         * Set markDeletionAfterDays
         **/
        public void setMarkDeletionAfterDays(Integer markDeletionAfterDays) {
            this.markDeletionAfterDays = markDeletionAfterDays;
        }

        public OSSLifecycleRuleQueryParam markDeletionAfterDays(Integer markDeletionAfterDays) {
            this.markDeletionAfterDays = markDeletionAfterDays;
            return this;
        }

        /**
        * MarkInfrequentAccessAfterDays is the number of days before we convert the objects in the bucket to Infrequent Access (IA) storage type
        * @return markInfrequentAccessAfterDays
        **/
        @JsonProperty("markInfrequentAccessAfterDays")
        public Integer getMarkInfrequentAccessAfterDays() {
            return markInfrequentAccessAfterDays;
        }

        /**
         * Set markInfrequentAccessAfterDays
         **/
        public void setMarkInfrequentAccessAfterDays(Integer markInfrequentAccessAfterDays) {
            this.markInfrequentAccessAfterDays = markInfrequentAccessAfterDays;
        }

        public OSSLifecycleRuleQueryParam markInfrequentAccessAfterDays(Integer markInfrequentAccessAfterDays) {
            this.markInfrequentAccessAfterDays = markInfrequentAccessAfterDays;
            return this;
        }

        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class OSSLifecycleRuleQueryParam {\n");

            sb.append("    markDeletionAfterDays: ").append(toIndentedString(markDeletionAfterDays)).append("\n");
            sb.append("    markInfrequentAccessAfterDays: ").append(toIndentedString(markInfrequentAccessAfterDays)).append("\n");
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