package io.quarkiverse.argocd.workflow.v1alpha1;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;

import io.fabric8.kubernetes.api.model.Duration;
import io.fabric8.kubernetes.api.model.LabelSelector;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.Type;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
/**
  * PodGC describes how to delete completed pods as they complete
 **/
public class PodGC  {

    /**
      * PodGC describes how to delete completed pods as they complete
     **/
    private Duration deleteDelayDuration;
    /**
      * PodGC describes how to delete completed pods as they complete
     **/
    private LabelSelector labelSelector;
    /**
      * PodGC describes how to delete completed pods as they complete
     **/
    private String strategy;

    /**
    * Get deleteDelayDuration
    * @return deleteDelayDuration
    **/
    @JsonProperty("deleteDelayDuration")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public Duration getDeleteDelayDuration() {
        return deleteDelayDuration;
    }

    /**
     * Set deleteDelayDuration
     **/
    public void setDeleteDelayDuration(Duration deleteDelayDuration) {
        this.deleteDelayDuration = deleteDelayDuration;
    }

    public PodGC deleteDelayDuration(Duration deleteDelayDuration) {
        this.deleteDelayDuration = deleteDelayDuration;
        return this;
    }

    /**
    * Get labelSelector
    * @return labelSelector
    **/
    @JsonProperty("labelSelector")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public LabelSelector getLabelSelector() {
        return labelSelector;
    }

    /**
     * Set labelSelector
     **/
    public void setLabelSelector(LabelSelector labelSelector) {
        this.labelSelector = labelSelector;
    }

    public PodGC labelSelector(LabelSelector labelSelector) {
        this.labelSelector = labelSelector;
        return this;
    }

    /**
    * Strategy is the strategy to use. One of \"OnPodCompletion\", \"OnPodSuccess\", \"OnWorkflowCompletion\", \"OnWorkflowSuccess\". If unset, does not delete Pods
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

    public PodGC strategy(String strategy) {
        this.strategy = strategy;
        return this;
    }

    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PodGC {\n");

        sb.append("    deleteDelayDuration: ").append(toIndentedString(deleteDelayDuration)).append("\n");
        sb.append("    labelSelector: ").append(toIndentedString(labelSelector)).append("\n");
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
      * PodGC describes how to delete completed pods as they complete
     **/
    public static class PodGCQueryParam  {

        /**
          * PodGC describes how to delete completed pods as they complete
         **/
        @jakarta.ws.rs.QueryParam("deleteDelayDuration")
        private Duration deleteDelayDuration;
        /**
          * PodGC describes how to delete completed pods as they complete
         **/
        @jakarta.ws.rs.QueryParam("labelSelector")
        private LabelSelector labelSelector;
        /**
          * PodGC describes how to delete completed pods as they complete
         **/
        @jakarta.ws.rs.QueryParam("strategy")
        private String strategy;

        /**
        * Get deleteDelayDuration
        * @return deleteDelayDuration
        **/
        @JsonProperty("deleteDelayDuration")
        public Duration getDeleteDelayDuration() {
            return deleteDelayDuration;
        }

        /**
         * Set deleteDelayDuration
         **/
        public void setDeleteDelayDuration(Duration deleteDelayDuration) {
            this.deleteDelayDuration = deleteDelayDuration;
        }

        public PodGCQueryParam deleteDelayDuration(Duration deleteDelayDuration) {
            this.deleteDelayDuration = deleteDelayDuration;
            return this;
        }

        /**
        * Get labelSelector
        * @return labelSelector
        **/
        @JsonProperty("labelSelector")
        public LabelSelector getLabelSelector() {
            return labelSelector;
        }

        /**
         * Set labelSelector
         **/
        public void setLabelSelector(LabelSelector labelSelector) {
            this.labelSelector = labelSelector;
        }

        public PodGCQueryParam labelSelector(LabelSelector labelSelector) {
            this.labelSelector = labelSelector;
            return this;
        }

        /**
        * Strategy is the strategy to use. One of \"OnPodCompletion\", \"OnPodSuccess\", \"OnWorkflowCompletion\", \"OnWorkflowSuccess\". If unset, does not delete Pods
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

        public PodGCQueryParam strategy(String strategy) {
            this.strategy = strategy;
            return this;
        }

        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class PodGCQueryParam {\n");

            sb.append("    deleteDelayDuration: ").append(toIndentedString(deleteDelayDuration)).append("\n");
            sb.append("    labelSelector: ").append(toIndentedString(labelSelector)).append("\n");
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
