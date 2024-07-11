package io.quarkiverse.argocd.events.v1alpha1;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;

import io.fabric8.kubernetes.api.model.Affinity;
import io.fabric8.kubernetes.api.model.Container;
import io.fabric8.kubernetes.api.model.LocalObjectReference;
import io.fabric8.kubernetes.api.model.PodSecurityContext;
import io.fabric8.kubernetes.api.model.Toleration;
import io.fabric8.kubernetes.api.model.Volume;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.Type;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Template  {

    private Affinity affinity;
    private Container container;
    private List<LocalObjectReference> imagePullSecrets;
    private Metadata metadata;
    private Map<String, String> nodeSelector;
    private Integer priority;
    private String priorityClassName;
    private PodSecurityContext securityContext;
    private String serviceAccountName;
    private List<Toleration> tolerations;
    private List<Volume> volumes;

    /**
    * Get affinity
    * @return affinity
    **/
    @JsonProperty("affinity")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public Affinity getAffinity() {
        return affinity;
    }

    /**
     * Set affinity
     **/
    public void setAffinity(Affinity affinity) {
        this.affinity = affinity;
    }

    public Template affinity(Affinity affinity) {
        this.affinity = affinity;
        return this;
    }

    /**
    * Get container
    * @return container
    **/
    @JsonProperty("container")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public Container getContainer() {
        return container;
    }

    /**
     * Set container
     **/
    public void setContainer(Container container) {
        this.container = container;
    }

    public Template container(Container container) {
        this.container = container;
        return this;
    }

    /**
    * Get imagePullSecrets
    * @return imagePullSecrets
    **/
    @JsonProperty("imagePullSecrets")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public List<LocalObjectReference> getImagePullSecrets() {
        return imagePullSecrets;
    }

    /**
     * Set imagePullSecrets
     **/
    public void setImagePullSecrets(List<LocalObjectReference> imagePullSecrets) {
        this.imagePullSecrets = imagePullSecrets;
    }

    public Template imagePullSecrets(List<LocalObjectReference> imagePullSecrets) {
        this.imagePullSecrets = imagePullSecrets;
        return this;
    }
    public Template addImagePullSecretsItem(LocalObjectReference imagePullSecretsItem) {
        if (this.imagePullSecrets == null){
            imagePullSecrets = new ArrayList<>();
        }
        this.imagePullSecrets.add(imagePullSecretsItem);
        return this;
    }

    /**
    * Get metadata
    * @return metadata
    **/
    @JsonProperty("metadata")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public Metadata getMetadata() {
        return metadata;
    }

    /**
     * Set metadata
     **/
    public void setMetadata(Metadata metadata) {
        this.metadata = metadata;
    }

    public Template metadata(Metadata metadata) {
        this.metadata = metadata;
        return this;
    }

    /**
    * Get nodeSelector
    * @return nodeSelector
    **/
    @JsonProperty("nodeSelector")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public Map<String, String> getNodeSelector() {
        return nodeSelector;
    }

    /**
     * Set nodeSelector
     **/
    public void setNodeSelector(Map<String, String> nodeSelector) {
        this.nodeSelector = nodeSelector;
    }

    public Template nodeSelector(Map<String, String> nodeSelector) {
        this.nodeSelector = nodeSelector;
        return this;
    }
    public Template putNodeSelectorItem(String key, String nodeSelectorItem) {
           if (this.nodeSelector == null){
                nodeSelector = new HashMap<>();
            }
        this.nodeSelector.put(key, nodeSelectorItem);
        return this;
    }

    /**
    * Get priority
    * @return priority
    **/
    @JsonProperty("priority")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public Integer getPriority() {
        return priority;
    }

    /**
     * Set priority
     **/
    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    public Template priority(Integer priority) {
        this.priority = priority;
        return this;
    }

    /**
    * Get priorityClassName
    * @return priorityClassName
    **/
    @JsonProperty("priorityClassName")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public String getPriorityClassName() {
        return priorityClassName;
    }

    /**
     * Set priorityClassName
     **/
    public void setPriorityClassName(String priorityClassName) {
        this.priorityClassName = priorityClassName;
    }

    public Template priorityClassName(String priorityClassName) {
        this.priorityClassName = priorityClassName;
        return this;
    }

    /**
    * Get securityContext
    * @return securityContext
    **/
    @JsonProperty("securityContext")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public PodSecurityContext getSecurityContext() {
        return securityContext;
    }

    /**
     * Set securityContext
     **/
    public void setSecurityContext(PodSecurityContext securityContext) {
        this.securityContext = securityContext;
    }

    public Template securityContext(PodSecurityContext securityContext) {
        this.securityContext = securityContext;
        return this;
    }

    /**
    * Get serviceAccountName
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

    public Template serviceAccountName(String serviceAccountName) {
        this.serviceAccountName = serviceAccountName;
        return this;
    }

    /**
    * Get tolerations
    * @return tolerations
    **/
    @JsonProperty("tolerations")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public List<Toleration> getTolerations() {
        return tolerations;
    }

    /**
     * Set tolerations
     **/
    public void setTolerations(List<Toleration> tolerations) {
        this.tolerations = tolerations;
    }

    public Template tolerations(List<Toleration> tolerations) {
        this.tolerations = tolerations;
        return this;
    }
    public Template addTolerationsItem(Toleration tolerationsItem) {
        if (this.tolerations == null){
            tolerations = new ArrayList<>();
        }
        this.tolerations.add(tolerationsItem);
        return this;
    }

    /**
    * Get volumes
    * @return volumes
    **/
    @JsonProperty("volumes")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public List<Volume> getVolumes() {
        return volumes;
    }

    /**
     * Set volumes
     **/
    public void setVolumes(List<Volume> volumes) {
        this.volumes = volumes;
    }

    public Template volumes(List<Volume> volumes) {
        this.volumes = volumes;
        return this;
    }
    public Template addVolumesItem(Volume volumesItem) {
        if (this.volumes == null){
            volumes = new ArrayList<>();
        }
        this.volumes.add(volumesItem);
        return this;
    }

    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Template {\n");

        sb.append("    affinity: ").append(toIndentedString(affinity)).append("\n");
        sb.append("    container: ").append(toIndentedString(container)).append("\n");
        sb.append("    imagePullSecrets: ").append(toIndentedString(imagePullSecrets)).append("\n");
        sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
        sb.append("    nodeSelector: ").append(toIndentedString(nodeSelector)).append("\n");
        sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
        sb.append("    priorityClassName: ").append(toIndentedString(priorityClassName)).append("\n");
        sb.append("    securityContext: ").append(toIndentedString(securityContext)).append("\n");
        sb.append("    serviceAccountName: ").append(toIndentedString(serviceAccountName)).append("\n");
        sb.append("    tolerations: ").append(toIndentedString(tolerations)).append("\n");
        sb.append("    volumes: ").append(toIndentedString(volumes)).append("\n");
        
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
    public static class TemplateQueryParam  {

        @jakarta.ws.rs.QueryParam("affinity")
        private Affinity affinity;
        @jakarta.ws.rs.QueryParam("container")
        private Container container;
        @jakarta.ws.rs.QueryParam("imagePullSecrets")
        private List<LocalObjectReference> imagePullSecrets = null;
        @jakarta.ws.rs.QueryParam("metadata")
        private Metadata metadata;
        @jakarta.ws.rs.QueryParam("nodeSelector")
        private Map<String, String> nodeSelector = null;
        @jakarta.ws.rs.QueryParam("priority")
        private Integer priority;
        @jakarta.ws.rs.QueryParam("priorityClassName")
        private String priorityClassName;
        @jakarta.ws.rs.QueryParam("securityContext")
        private PodSecurityContext securityContext;
        @jakarta.ws.rs.QueryParam("serviceAccountName")
        private String serviceAccountName;
        @jakarta.ws.rs.QueryParam("tolerations")
        private List<Toleration> tolerations = null;
        @jakarta.ws.rs.QueryParam("volumes")
        private List<Volume> volumes = null;

        /**
        * Get affinity
        * @return affinity
        **/
        @JsonProperty("affinity")
        public Affinity getAffinity() {
            return affinity;
        }

        /**
         * Set affinity
         **/
        public void setAffinity(Affinity affinity) {
            this.affinity = affinity;
        }

        public TemplateQueryParam affinity(Affinity affinity) {
            this.affinity = affinity;
            return this;
        }

        /**
        * Get container
        * @return container
        **/
        @JsonProperty("container")
        public Container getContainer() {
            return container;
        }

        /**
         * Set container
         **/
        public void setContainer(Container container) {
            this.container = container;
        }

        public TemplateQueryParam container(Container container) {
            this.container = container;
            return this;
        }

        /**
        * Get imagePullSecrets
        * @return imagePullSecrets
        **/
        @JsonProperty("imagePullSecrets")
        public List<LocalObjectReference> getImagePullSecrets() {
            return imagePullSecrets;
        }

        /**
         * Set imagePullSecrets
         **/
        public void setImagePullSecrets(List<LocalObjectReference> imagePullSecrets) {
            this.imagePullSecrets = imagePullSecrets;
        }

        public TemplateQueryParam imagePullSecrets(List<LocalObjectReference> imagePullSecrets) {
            this.imagePullSecrets = imagePullSecrets;
            return this;
        }
        public TemplateQueryParam addImagePullSecretsItem(LocalObjectReference imagePullSecretsItem) {
            this.imagePullSecrets.add(imagePullSecretsItem);
            return this;
        }

        /**
        * Get metadata
        * @return metadata
        **/
        @JsonProperty("metadata")
        public Metadata getMetadata() {
            return metadata;
        }

        /**
         * Set metadata
         **/
        public void setMetadata(Metadata metadata) {
            this.metadata = metadata;
        }

        public TemplateQueryParam metadata(Metadata metadata) {
            this.metadata = metadata;
            return this;
        }

        /**
        * Get nodeSelector
        * @return nodeSelector
        **/
        @JsonProperty("nodeSelector")
        public Map<String, String> getNodeSelector() {
            return nodeSelector;
        }

        /**
         * Set nodeSelector
         **/
        public void setNodeSelector(Map<String, String> nodeSelector) {
            this.nodeSelector = nodeSelector;
        }

        public TemplateQueryParam nodeSelector(Map<String, String> nodeSelector) {
            this.nodeSelector = nodeSelector;
            return this;
        }
        public TemplateQueryParam putNodeSelectorItem(String key, String nodeSelectorItem) {
            this.nodeSelector.put(key, nodeSelectorItem);
            return this;
        }

        /**
        * Get priority
        * @return priority
        **/
        @JsonProperty("priority")
        public Integer getPriority() {
            return priority;
        }

        /**
         * Set priority
         **/
        public void setPriority(Integer priority) {
            this.priority = priority;
        }

        public TemplateQueryParam priority(Integer priority) {
            this.priority = priority;
            return this;
        }

        /**
        * Get priorityClassName
        * @return priorityClassName
        **/
        @JsonProperty("priorityClassName")
        public String getPriorityClassName() {
            return priorityClassName;
        }

        /**
         * Set priorityClassName
         **/
        public void setPriorityClassName(String priorityClassName) {
            this.priorityClassName = priorityClassName;
        }

        public TemplateQueryParam priorityClassName(String priorityClassName) {
            this.priorityClassName = priorityClassName;
            return this;
        }

        /**
        * Get securityContext
        * @return securityContext
        **/
        @JsonProperty("securityContext")
        public PodSecurityContext getSecurityContext() {
            return securityContext;
        }

        /**
         * Set securityContext
         **/
        public void setSecurityContext(PodSecurityContext securityContext) {
            this.securityContext = securityContext;
        }

        public TemplateQueryParam securityContext(PodSecurityContext securityContext) {
            this.securityContext = securityContext;
            return this;
        }

        /**
        * Get serviceAccountName
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

        public TemplateQueryParam serviceAccountName(String serviceAccountName) {
            this.serviceAccountName = serviceAccountName;
            return this;
        }

        /**
        * Get tolerations
        * @return tolerations
        **/
        @JsonProperty("tolerations")
        public List<Toleration> getTolerations() {
            return tolerations;
        }

        /**
         * Set tolerations
         **/
        public void setTolerations(List<Toleration> tolerations) {
            this.tolerations = tolerations;
        }

        public TemplateQueryParam tolerations(List<Toleration> tolerations) {
            this.tolerations = tolerations;
            return this;
        }
        public TemplateQueryParam addTolerationsItem(Toleration tolerationsItem) {
            this.tolerations.add(tolerationsItem);
            return this;
        }

        /**
        * Get volumes
        * @return volumes
        **/
        @JsonProperty("volumes")
        public List<Volume> getVolumes() {
            return volumes;
        }

        /**
         * Set volumes
         **/
        public void setVolumes(List<Volume> volumes) {
            this.volumes = volumes;
        }

        public TemplateQueryParam volumes(List<Volume> volumes) {
            this.volumes = volumes;
            return this;
        }
        public TemplateQueryParam addVolumesItem(Volume volumesItem) {
            this.volumes.add(volumesItem);
            return this;
        }

        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class TemplateQueryParam {\n");

            sb.append("    affinity: ").append(toIndentedString(affinity)).append("\n");
            sb.append("    container: ").append(toIndentedString(container)).append("\n");
            sb.append("    imagePullSecrets: ").append(toIndentedString(imagePullSecrets)).append("\n");
            sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
            sb.append("    nodeSelector: ").append(toIndentedString(nodeSelector)).append("\n");
            sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
            sb.append("    priorityClassName: ").append(toIndentedString(priorityClassName)).append("\n");
            sb.append("    securityContext: ").append(toIndentedString(securityContext)).append("\n");
            sb.append("    serviceAccountName: ").append(toIndentedString(serviceAccountName)).append("\n");
            sb.append("    tolerations: ").append(toIndentedString(tolerations)).append("\n");
            sb.append("    volumes: ").append(toIndentedString(volumes)).append("\n");
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
