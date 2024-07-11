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
  * VolumeClaimGC describes how to delete volumes from completed Workflows
 **/
public class VolumeClaimGC  {

    /**
      * VolumeClaimGC describes how to delete volumes from completed Workflows
     **/
    private String strategy;

    /**
    * Strategy is the strategy to use. One of \"OnWorkflowCompletion\", \"OnWorkflowSuccess\". Defaults to \"OnWorkflowSuccess\"
    * @return strategy
    **/
    @JsonProperty("strategy")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public String getStrategy() {
        return strategy;
    }

    /**
     * Set strategy
     **/
    public void setStrategy(String strategy) {
        this.strategy = strategy;
    }

    public VolumeClaimGC strategy(String strategy) {
        this.strategy = strategy;
        return this;
    }

    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class VolumeClaimGC {\n");

        sb.append("    strategy: ").append(toIndentedString(strategy)).append("\n");
        
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
      * VolumeClaimGC describes how to delete volumes from completed Workflows
     **/
    public static class VolumeClaimGCQueryParam  {

        /**
          * VolumeClaimGC describes how to delete volumes from completed Workflows
         **/
        @jakarta.ws.rs.QueryParam("strategy")
        private String strategy;

        /**
        * Strategy is the strategy to use. One of \"OnWorkflowCompletion\", \"OnWorkflowSuccess\". Defaults to \"OnWorkflowSuccess\"
        * @return strategy
        **/
        @JsonProperty("strategy")
        public String getStrategy() {
            return strategy;
        }

        /**
         * Set strategy
         **/
        public void setStrategy(String strategy) {
            this.strategy = strategy;
        }

        public VolumeClaimGCQueryParam strategy(String strategy) {
            this.strategy = strategy;
            return this;
        }

        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class VolumeClaimGCQueryParam {\n");

            sb.append("    strategy: ").append(toIndentedString(strategy)).append("\n");
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