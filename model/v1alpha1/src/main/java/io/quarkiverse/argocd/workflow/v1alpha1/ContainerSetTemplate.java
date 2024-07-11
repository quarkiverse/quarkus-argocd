package io.quarkiverse.argocd.workflow.v1alpha1;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;

import io.fabric8.kubernetes.api.model.VolumeMount;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.Type;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ContainerSetTemplate  {

    private List<ContainerNode> containers = new ArrayList<>();
    private ContainerSetRetryStrategy retryStrategy;
    private List<VolumeMount> volumeMounts;

    /**
    * Get containers
    * @return containers
    **/
    @JsonProperty("containers")
    public List<ContainerNode> getContainers() {
        return containers;
    }

    /**
     * Set containers
     **/
    public void setContainers(List<ContainerNode> containers) {
        this.containers = containers;
    }

    public ContainerSetTemplate containers(List<ContainerNode> containers) {
        this.containers = containers;
        return this;
    }
    public ContainerSetTemplate addContainersItem(ContainerNode containersItem) {
        if (this.containers == null){
            containers = new ArrayList<>();
        }
        this.containers.add(containersItem);
        return this;
    }

    /**
    * Get retryStrategy
    * @return retryStrategy
    **/
    @JsonProperty("retryStrategy")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public ContainerSetRetryStrategy getRetryStrategy() {
        return retryStrategy;
    }

    /**
     * Set retryStrategy
     **/
    public void setRetryStrategy(ContainerSetRetryStrategy retryStrategy) {
        this.retryStrategy = retryStrategy;
    }

    public ContainerSetTemplate retryStrategy(ContainerSetRetryStrategy retryStrategy) {
        this.retryStrategy = retryStrategy;
        return this;
    }

    /**
    * Get volumeMounts
    * @return volumeMounts
    **/
    @JsonProperty("volumeMounts")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public List<VolumeMount> getVolumeMounts() {
        return volumeMounts;
    }

    /**
     * Set volumeMounts
     **/
    public void setVolumeMounts(List<VolumeMount> volumeMounts) {
        this.volumeMounts = volumeMounts;
    }

    public ContainerSetTemplate volumeMounts(List<VolumeMount> volumeMounts) {
        this.volumeMounts = volumeMounts;
        return this;
    }
    public ContainerSetTemplate addVolumeMountsItem(VolumeMount volumeMountsItem) {
        if (this.volumeMounts == null){
            volumeMounts = new ArrayList<>();
        }
        this.volumeMounts.add(volumeMountsItem);
        return this;
    }

    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ContainerSetTemplate {\n");

        sb.append("    containers: ").append(toIndentedString(containers)).append("\n");
        sb.append("    retryStrategy: ").append(toIndentedString(retryStrategy)).append("\n");
        sb.append("    volumeMounts: ").append(toIndentedString(volumeMounts)).append("\n");
        
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
    public static class ContainerSetTemplateQueryParam  {

        @jakarta.ws.rs.QueryParam("containers")
        private List<ContainerNode> containers = null;
        @jakarta.ws.rs.QueryParam("retryStrategy")
        private ContainerSetRetryStrategy retryStrategy;
        @jakarta.ws.rs.QueryParam("volumeMounts")
        private List<VolumeMount> volumeMounts = null;

        /**
        * Get containers
        * @return containers
        **/
        @JsonProperty("containers")
        public List<ContainerNode> getContainers() {
            return containers;
        }

        /**
         * Set containers
         **/
        public void setContainers(List<ContainerNode> containers) {
            this.containers = containers;
        }

        public ContainerSetTemplateQueryParam containers(List<ContainerNode> containers) {
            this.containers = containers;
            return this;
        }
        public ContainerSetTemplateQueryParam addContainersItem(ContainerNode containersItem) {
            this.containers.add(containersItem);
            return this;
        }

        /**
        * Get retryStrategy
        * @return retryStrategy
        **/
        @JsonProperty("retryStrategy")
        public ContainerSetRetryStrategy getRetryStrategy() {
            return retryStrategy;
        }

        /**
         * Set retryStrategy
         **/
        public void setRetryStrategy(ContainerSetRetryStrategy retryStrategy) {
            this.retryStrategy = retryStrategy;
        }

        public ContainerSetTemplateQueryParam retryStrategy(ContainerSetRetryStrategy retryStrategy) {
            this.retryStrategy = retryStrategy;
            return this;
        }

        /**
        * Get volumeMounts
        * @return volumeMounts
        **/
        @JsonProperty("volumeMounts")
        public List<VolumeMount> getVolumeMounts() {
            return volumeMounts;
        }

        /**
         * Set volumeMounts
         **/
        public void setVolumeMounts(List<VolumeMount> volumeMounts) {
            this.volumeMounts = volumeMounts;
        }

        public ContainerSetTemplateQueryParam volumeMounts(List<VolumeMount> volumeMounts) {
            this.volumeMounts = volumeMounts;
            return this;
        }
        public ContainerSetTemplateQueryParam addVolumeMountsItem(VolumeMount volumeMountsItem) {
            this.volumeMounts.add(volumeMountsItem);
            return this;
        }

        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class ContainerSetTemplateQueryParam {\n");

            sb.append("    containers: ").append(toIndentedString(containers)).append("\n");
            sb.append("    retryStrategy: ").append(toIndentedString(retryStrategy)).append("\n");
            sb.append("    volumeMounts: ").append(toIndentedString(volumeMounts)).append("\n");
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
