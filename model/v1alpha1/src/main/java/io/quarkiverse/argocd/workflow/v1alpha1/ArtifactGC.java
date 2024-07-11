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
  * ArtifactGC describes how to delete artifacts from completed Workflows - this is embedded into the WorkflowLevelArtifactGC, and also used for individual Artifacts to override that as needed
 **/
public class ArtifactGC  {

    /**
      * ArtifactGC describes how to delete artifacts from completed Workflows - this is embedded into the WorkflowLevelArtifactGC, and also used for individual Artifacts to override that as needed
     **/
    private Metadata podMetadata;
    /**
      * ArtifactGC describes how to delete artifacts from completed Workflows - this is embedded into the WorkflowLevelArtifactGC, and also used for individual Artifacts to override that as needed
     **/
    private String serviceAccountName;
    /**
      * ArtifactGC describes how to delete artifacts from completed Workflows - this is embedded into the WorkflowLevelArtifactGC, and also used for individual Artifacts to override that as needed
     **/
    private String strategy;

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

    public ArtifactGC podMetadata(Metadata podMetadata) {
        this.podMetadata = podMetadata;
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

    public ArtifactGC serviceAccountName(String serviceAccountName) {
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

    public ArtifactGC strategy(String strategy) {
        this.strategy = strategy;
        return this;
    }

    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ArtifactGC {\n");

        sb.append("    podMetadata: ").append(toIndentedString(podMetadata)).append("\n");
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
      * ArtifactGC describes how to delete artifacts from completed Workflows - this is embedded into the WorkflowLevelArtifactGC, and also used for individual Artifacts to override that as needed
     **/
    public static class ArtifactGCQueryParam  {

        /**
          * ArtifactGC describes how to delete artifacts from completed Workflows - this is embedded into the WorkflowLevelArtifactGC, and also used for individual Artifacts to override that as needed
         **/
        @jakarta.ws.rs.QueryParam("podMetadata")
        private Metadata podMetadata;
        /**
          * ArtifactGC describes how to delete artifacts from completed Workflows - this is embedded into the WorkflowLevelArtifactGC, and also used for individual Artifacts to override that as needed
         **/
        @jakarta.ws.rs.QueryParam("serviceAccountName")
        private String serviceAccountName;
        /**
          * ArtifactGC describes how to delete artifacts from completed Workflows - this is embedded into the WorkflowLevelArtifactGC, and also used for individual Artifacts to override that as needed
         **/
        @jakarta.ws.rs.QueryParam("strategy")
        private String strategy;

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

        public ArtifactGCQueryParam podMetadata(Metadata podMetadata) {
            this.podMetadata = podMetadata;
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

        public ArtifactGCQueryParam serviceAccountName(String serviceAccountName) {
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

        public ArtifactGCQueryParam strategy(String strategy) {
            this.strategy = strategy;
            return this;
        }

        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class ArtifactGCQueryParam {\n");

            sb.append("    podMetadata: ").append(toIndentedString(podMetadata)).append("\n");
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
