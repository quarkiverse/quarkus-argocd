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
  * WorkflowLevelArtifactGC describes how to delete artifacts from completed Workflows - this spec is used on the Workflow level
 **/
public class WorkflowLevelArtifactGC  {

    /**
      * WorkflowLevelArtifactGC describes how to delete artifacts from completed Workflows - this spec is used on the Workflow level
     **/
    private Boolean forceFinalizerRemoval;
    /**
      * WorkflowLevelArtifactGC describes how to delete artifacts from completed Workflows - this spec is used on the Workflow level
     **/
    private Metadata podMetadata;
    /**
      * WorkflowLevelArtifactGC describes how to delete artifacts from completed Workflows - this spec is used on the Workflow level
     **/
    private String podSpecPatch;
    /**
      * WorkflowLevelArtifactGC describes how to delete artifacts from completed Workflows - this spec is used on the Workflow level
     **/
    private String serviceAccountName;
    /**
      * WorkflowLevelArtifactGC describes how to delete artifacts from completed Workflows - this spec is used on the Workflow level
     **/
    private String strategy;

    /**
    * ForceFinalizerRemoval: if set to true, the finalizer will be removed in the case that Artifact GC fails
    * @return forceFinalizerRemoval
    **/
    @JsonProperty("forceFinalizerRemoval")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public Boolean getForceFinalizerRemoval() {
        return forceFinalizerRemoval;
    }

    /**
     * Set forceFinalizerRemoval
     **/
    public void setForceFinalizerRemoval(Boolean forceFinalizerRemoval) {
        this.forceFinalizerRemoval = forceFinalizerRemoval;
    }

    public WorkflowLevelArtifactGC forceFinalizerRemoval(Boolean forceFinalizerRemoval) {
        this.forceFinalizerRemoval = forceFinalizerRemoval;
        return this;
    }

    /**
    * Get podMetadata
    * @return podMetadata
    **/
    @JsonProperty("podMetadata")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public Metadata getPodMetadata() {
        return podMetadata;
    }

    /**
     * Set podMetadata
     **/
    public void setPodMetadata(Metadata podMetadata) {
        this.podMetadata = podMetadata;
    }

    public WorkflowLevelArtifactGC podMetadata(Metadata podMetadata) {
        this.podMetadata = podMetadata;
        return this;
    }

    /**
    * PodSpecPatch holds strategic merge patch to apply against the artgc pod spec.
    * @return podSpecPatch
    **/
    @JsonProperty("podSpecPatch")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public String getPodSpecPatch() {
        return podSpecPatch;
    }

    /**
     * Set podSpecPatch
     **/
    public void setPodSpecPatch(String podSpecPatch) {
        this.podSpecPatch = podSpecPatch;
    }

    public WorkflowLevelArtifactGC podSpecPatch(String podSpecPatch) {
        this.podSpecPatch = podSpecPatch;
        return this;
    }

    /**
    * ServiceAccountName is an optional field for specifying the Service Account that should be assigned to the Pod doing the deletion
    * @return serviceAccountName
    **/
    @JsonProperty("serviceAccountName")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public String getServiceAccountName() {
        return serviceAccountName;
    }

    /**
     * Set serviceAccountName
     **/
    public void setServiceAccountName(String serviceAccountName) {
        this.serviceAccountName = serviceAccountName;
    }

    public WorkflowLevelArtifactGC serviceAccountName(String serviceAccountName) {
        this.serviceAccountName = serviceAccountName;
        return this;
    }

    /**
    * Strategy is the strategy to use.
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

    public WorkflowLevelArtifactGC strategy(String strategy) {
        this.strategy = strategy;
        return this;
    }

    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class WorkflowLevelArtifactGC {\n");

        sb.append("    forceFinalizerRemoval: ").append(toIndentedString(forceFinalizerRemoval)).append("\n");
        sb.append("    podMetadata: ").append(toIndentedString(podMetadata)).append("\n");
        sb.append("    podSpecPatch: ").append(toIndentedString(podSpecPatch)).append("\n");
        sb.append("    serviceAccountName: ").append(toIndentedString(serviceAccountName)).append("\n");
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
      * WorkflowLevelArtifactGC describes how to delete artifacts from completed Workflows - this spec is used on the Workflow level
     **/
    public static class WorkflowLevelArtifactGCQueryParam  {

        /**
          * WorkflowLevelArtifactGC describes how to delete artifacts from completed Workflows - this spec is used on the Workflow level
         **/
        @jakarta.ws.rs.QueryParam("forceFinalizerRemoval")
        private Boolean forceFinalizerRemoval;
        /**
          * WorkflowLevelArtifactGC describes how to delete artifacts from completed Workflows - this spec is used on the Workflow level
         **/
        @jakarta.ws.rs.QueryParam("podMetadata")
        private Metadata podMetadata;
        /**
          * WorkflowLevelArtifactGC describes how to delete artifacts from completed Workflows - this spec is used on the Workflow level
         **/
        @jakarta.ws.rs.QueryParam("podSpecPatch")
        private String podSpecPatch;
        /**
          * WorkflowLevelArtifactGC describes how to delete artifacts from completed Workflows - this spec is used on the Workflow level
         **/
        @jakarta.ws.rs.QueryParam("serviceAccountName")
        private String serviceAccountName;
        /**
          * WorkflowLevelArtifactGC describes how to delete artifacts from completed Workflows - this spec is used on the Workflow level
         **/
        @jakarta.ws.rs.QueryParam("strategy")
        private String strategy;

        /**
        * ForceFinalizerRemoval: if set to true, the finalizer will be removed in the case that Artifact GC fails
        * @return forceFinalizerRemoval
        **/
        @JsonProperty("forceFinalizerRemoval")
        public Boolean getForceFinalizerRemoval() {
            return forceFinalizerRemoval;
        }

        /**
         * Set forceFinalizerRemoval
         **/
        public void setForceFinalizerRemoval(Boolean forceFinalizerRemoval) {
            this.forceFinalizerRemoval = forceFinalizerRemoval;
        }

        public WorkflowLevelArtifactGCQueryParam forceFinalizerRemoval(Boolean forceFinalizerRemoval) {
            this.forceFinalizerRemoval = forceFinalizerRemoval;
            return this;
        }

        /**
        * Get podMetadata
        * @return podMetadata
        **/
        @JsonProperty("podMetadata")
        public Metadata getPodMetadata() {
            return podMetadata;
        }

        /**
         * Set podMetadata
         **/
        public void setPodMetadata(Metadata podMetadata) {
            this.podMetadata = podMetadata;
        }

        public WorkflowLevelArtifactGCQueryParam podMetadata(Metadata podMetadata) {
            this.podMetadata = podMetadata;
            return this;
        }

        /**
        * PodSpecPatch holds strategic merge patch to apply against the artgc pod spec.
        * @return podSpecPatch
        **/
        @JsonProperty("podSpecPatch")
        public String getPodSpecPatch() {
            return podSpecPatch;
        }

        /**
         * Set podSpecPatch
         **/
        public void setPodSpecPatch(String podSpecPatch) {
            this.podSpecPatch = podSpecPatch;
        }

        public WorkflowLevelArtifactGCQueryParam podSpecPatch(String podSpecPatch) {
            this.podSpecPatch = podSpecPatch;
            return this;
        }

        /**
        * ServiceAccountName is an optional field for specifying the Service Account that should be assigned to the Pod doing the deletion
        * @return serviceAccountName
        **/
        @JsonProperty("serviceAccountName")
        public String getServiceAccountName() {
            return serviceAccountName;
        }

        /**
         * Set serviceAccountName
         **/
        public void setServiceAccountName(String serviceAccountName) {
            this.serviceAccountName = serviceAccountName;
        }

        public WorkflowLevelArtifactGCQueryParam serviceAccountName(String serviceAccountName) {
            this.serviceAccountName = serviceAccountName;
            return this;
        }

        /**
        * Strategy is the strategy to use.
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

        public WorkflowLevelArtifactGCQueryParam strategy(String strategy) {
            this.strategy = strategy;
            return this;
        }

        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class WorkflowLevelArtifactGCQueryParam {\n");

            sb.append("    forceFinalizerRemoval: ").append(toIndentedString(forceFinalizerRemoval)).append("\n");
            sb.append("    podMetadata: ").append(toIndentedString(podMetadata)).append("\n");
            sb.append("    podSpecPatch: ").append(toIndentedString(podSpecPatch)).append("\n");
            sb.append("    serviceAccountName: ").append(toIndentedString(serviceAccountName)).append("\n");
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
