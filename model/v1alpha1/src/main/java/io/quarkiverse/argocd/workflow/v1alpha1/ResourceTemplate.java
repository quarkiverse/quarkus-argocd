package io.quarkiverse.argocd.workflow.v1alpha1;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.Type;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
/**
  * ResourceTemplate is a template subtype to manipulate kubernetes resources
 **/
public class ResourceTemplate  {

    /**
      * ResourceTemplate is a template subtype to manipulate kubernetes resources
     **/
    private String action;
    /**
      * ResourceTemplate is a template subtype to manipulate kubernetes resources
     **/
    private String failureCondition;
    /**
      * ResourceTemplate is a template subtype to manipulate kubernetes resources
     **/
    private List<String> flags;
    /**
      * ResourceTemplate is a template subtype to manipulate kubernetes resources
     **/
    private String manifest;
    /**
      * ResourceTemplate is a template subtype to manipulate kubernetes resources
     **/
    private ManifestFrom manifestFrom;
    /**
      * ResourceTemplate is a template subtype to manipulate kubernetes resources
     **/
    private String mergeStrategy;
    /**
      * ResourceTemplate is a template subtype to manipulate kubernetes resources
     **/
    private Boolean setOwnerReference;
    /**
      * ResourceTemplate is a template subtype to manipulate kubernetes resources
     **/
    private String successCondition;

    /**
    * Action is the action to perform to the resource. Must be one of: get, create, apply, delete, replace, patch
    * @return action
    **/
    @JsonProperty("action")
    public String getAction() {
        return action;
    }

    /**
     * Set action
     **/
    public void setAction(String action) {
        this.action = action;
    }

    public ResourceTemplate action(String action) {
        this.action = action;
        return this;
    }

    /**
    * FailureCondition is a label selector expression which describes the conditions of the k8s resource in which the step was considered failed
    * @return failureCondition
    **/
    @JsonProperty("failureCondition")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public String getFailureCondition() {
        return failureCondition;
    }

    /**
     * Set failureCondition
     **/
    public void setFailureCondition(String failureCondition) {
        this.failureCondition = failureCondition;
    }

    public ResourceTemplate failureCondition(String failureCondition) {
        this.failureCondition = failureCondition;
        return this;
    }

    /**
    * Flags is a set of additional options passed to kubectl before submitting a resource I.e. to disable resource validation: flags: [  \"--validate=false\"  # disable resource validation ]
    * @return flags
    **/
    @JsonProperty("flags")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public List<String> getFlags() {
        return flags;
    }

    /**
     * Set flags
     **/
    public void setFlags(List<String> flags) {
        this.flags = flags;
    }

    public ResourceTemplate flags(List<String> flags) {
        this.flags = flags;
        return this;
    }
    public ResourceTemplate addFlagsItem(String flagsItem) {
        if (this.flags == null){
            flags = new ArrayList<>();
        }
        this.flags.add(flagsItem);
        return this;
    }

    /**
    * Manifest contains the kubernetes manifest
    * @return manifest
    **/
    @JsonProperty("manifest")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public String getManifest() {
        return manifest;
    }

    /**
     * Set manifest
     **/
    public void setManifest(String manifest) {
        this.manifest = manifest;
    }

    public ResourceTemplate manifest(String manifest) {
        this.manifest = manifest;
        return this;
    }

    /**
    * Get manifestFrom
    * @return manifestFrom
    **/
    @JsonProperty("manifestFrom")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public ManifestFrom getManifestFrom() {
        return manifestFrom;
    }

    /**
     * Set manifestFrom
     **/
    public void setManifestFrom(ManifestFrom manifestFrom) {
        this.manifestFrom = manifestFrom;
    }

    public ResourceTemplate manifestFrom(ManifestFrom manifestFrom) {
        this.manifestFrom = manifestFrom;
        return this;
    }

    /**
    * MergeStrategy is the strategy used to merge a patch. It defaults to \"strategic\" Must be one of: strategic, merge, json
    * @return mergeStrategy
    **/
    @JsonProperty("mergeStrategy")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public String getMergeStrategy() {
        return mergeStrategy;
    }

    /**
     * Set mergeStrategy
     **/
    public void setMergeStrategy(String mergeStrategy) {
        this.mergeStrategy = mergeStrategy;
    }

    public ResourceTemplate mergeStrategy(String mergeStrategy) {
        this.mergeStrategy = mergeStrategy;
        return this;
    }

    /**
    * SetOwnerReference sets the reference to the workflow on the OwnerReference of generated resource.
    * @return setOwnerReference
    **/
    @JsonProperty("setOwnerReference")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public Boolean getSetOwnerReference() {
        return setOwnerReference;
    }

    /**
     * Set setOwnerReference
     **/
    public void setSetOwnerReference(Boolean setOwnerReference) {
        this.setOwnerReference = setOwnerReference;
    }

    public ResourceTemplate setOwnerReference(Boolean setOwnerReference) {
        this.setOwnerReference = setOwnerReference;
        return this;
    }

    /**
    * SuccessCondition is a label selector expression which describes the conditions of the k8s resource in which it is acceptable to proceed to the following step
    * @return successCondition
    **/
    @JsonProperty("successCondition")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public String getSuccessCondition() {
        return successCondition;
    }

    /**
     * Set successCondition
     **/
    public void setSuccessCondition(String successCondition) {
        this.successCondition = successCondition;
    }

    public ResourceTemplate successCondition(String successCondition) {
        this.successCondition = successCondition;
        return this;
    }

    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ResourceTemplate {\n");

        sb.append("    action: ").append(toIndentedString(action)).append("\n");
        sb.append("    failureCondition: ").append(toIndentedString(failureCondition)).append("\n");
        sb.append("    flags: ").append(toIndentedString(flags)).append("\n");
        sb.append("    manifest: ").append(toIndentedString(manifest)).append("\n");
        sb.append("    manifestFrom: ").append(toIndentedString(manifestFrom)).append("\n");
        sb.append("    mergeStrategy: ").append(toIndentedString(mergeStrategy)).append("\n");
        sb.append("    setOwnerReference: ").append(toIndentedString(setOwnerReference)).append("\n");
        sb.append("    successCondition: ").append(toIndentedString(successCondition)).append("\n");
        
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
      * ResourceTemplate is a template subtype to manipulate kubernetes resources
     **/
    public static class ResourceTemplateQueryParam  {

        /**
          * ResourceTemplate is a template subtype to manipulate kubernetes resources
         **/
        @jakarta.ws.rs.QueryParam("action")
        private String action;
        /**
          * ResourceTemplate is a template subtype to manipulate kubernetes resources
         **/
        @jakarta.ws.rs.QueryParam("failureCondition")
        private String failureCondition;
        /**
          * ResourceTemplate is a template subtype to manipulate kubernetes resources
         **/
        @jakarta.ws.rs.QueryParam("flags")
        private List<String> flags = null;
        /**
          * ResourceTemplate is a template subtype to manipulate kubernetes resources
         **/
        @jakarta.ws.rs.QueryParam("manifest")
        private String manifest;
        /**
          * ResourceTemplate is a template subtype to manipulate kubernetes resources
         **/
        @jakarta.ws.rs.QueryParam("manifestFrom")
        private ManifestFrom manifestFrom;
        /**
          * ResourceTemplate is a template subtype to manipulate kubernetes resources
         **/
        @jakarta.ws.rs.QueryParam("mergeStrategy")
        private String mergeStrategy;
        /**
          * ResourceTemplate is a template subtype to manipulate kubernetes resources
         **/
        @jakarta.ws.rs.QueryParam("setOwnerReference")
        private Boolean setOwnerReference;
        /**
          * ResourceTemplate is a template subtype to manipulate kubernetes resources
         **/
        @jakarta.ws.rs.QueryParam("successCondition")
        private String successCondition;

        /**
        * Action is the action to perform to the resource. Must be one of: get, create, apply, delete, replace, patch
        * @return action
        **/
        @JsonProperty("action")
        public String getAction() {
            return action;
        }

        /**
         * Set action
         **/
        public void setAction(String action) {
            this.action = action;
        }

        public ResourceTemplateQueryParam action(String action) {
            this.action = action;
            return this;
        }

        /**
        * FailureCondition is a label selector expression which describes the conditions of the k8s resource in which the step was considered failed
        * @return failureCondition
        **/
        @JsonProperty("failureCondition")
        public String getFailureCondition() {
            return failureCondition;
        }

        /**
         * Set failureCondition
         **/
        public void setFailureCondition(String failureCondition) {
            this.failureCondition = failureCondition;
        }

        public ResourceTemplateQueryParam failureCondition(String failureCondition) {
            this.failureCondition = failureCondition;
            return this;
        }

        /**
        * Flags is a set of additional options passed to kubectl before submitting a resource I.e. to disable resource validation: flags: [  \"--validate=false\"  # disable resource validation ]
        * @return flags
        **/
        @JsonProperty("flags")
        public List<String> getFlags() {
            return flags;
        }

        /**
         * Set flags
         **/
        public void setFlags(List<String> flags) {
            this.flags = flags;
        }

        public ResourceTemplateQueryParam flags(List<String> flags) {
            this.flags = flags;
            return this;
        }
        public ResourceTemplateQueryParam addFlagsItem(String flagsItem) {
            this.flags.add(flagsItem);
            return this;
        }

        /**
        * Manifest contains the kubernetes manifest
        * @return manifest
        **/
        @JsonProperty("manifest")
        public String getManifest() {
            return manifest;
        }

        /**
         * Set manifest
         **/
        public void setManifest(String manifest) {
            this.manifest = manifest;
        }

        public ResourceTemplateQueryParam manifest(String manifest) {
            this.manifest = manifest;
            return this;
        }

        /**
        * Get manifestFrom
        * @return manifestFrom
        **/
        @JsonProperty("manifestFrom")
        public ManifestFrom getManifestFrom() {
            return manifestFrom;
        }

        /**
         * Set manifestFrom
         **/
        public void setManifestFrom(ManifestFrom manifestFrom) {
            this.manifestFrom = manifestFrom;
        }

        public ResourceTemplateQueryParam manifestFrom(ManifestFrom manifestFrom) {
            this.manifestFrom = manifestFrom;
            return this;
        }

        /**
        * MergeStrategy is the strategy used to merge a patch. It defaults to \"strategic\" Must be one of: strategic, merge, json
        * @return mergeStrategy
        **/
        @JsonProperty("mergeStrategy")
        public String getMergeStrategy() {
            return mergeStrategy;
        }

        /**
         * Set mergeStrategy
         **/
        public void setMergeStrategy(String mergeStrategy) {
            this.mergeStrategy = mergeStrategy;
        }

        public ResourceTemplateQueryParam mergeStrategy(String mergeStrategy) {
            this.mergeStrategy = mergeStrategy;
            return this;
        }

        /**
        * SetOwnerReference sets the reference to the workflow on the OwnerReference of generated resource.
        * @return setOwnerReference
        **/
        @JsonProperty("setOwnerReference")
        public Boolean getSetOwnerReference() {
            return setOwnerReference;
        }

        /**
         * Set setOwnerReference
         **/
        public void setSetOwnerReference(Boolean setOwnerReference) {
            this.setOwnerReference = setOwnerReference;
        }

        public ResourceTemplateQueryParam setOwnerReference(Boolean setOwnerReference) {
            this.setOwnerReference = setOwnerReference;
            return this;
        }

        /**
        * SuccessCondition is a label selector expression which describes the conditions of the k8s resource in which it is acceptable to proceed to the following step
        * @return successCondition
        **/
        @JsonProperty("successCondition")
        public String getSuccessCondition() {
            return successCondition;
        }

        /**
         * Set successCondition
         **/
        public void setSuccessCondition(String successCondition) {
            this.successCondition = successCondition;
        }

        public ResourceTemplateQueryParam successCondition(String successCondition) {
            this.successCondition = successCondition;
            return this;
        }

        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class ResourceTemplateQueryParam {\n");

            sb.append("    action: ").append(toIndentedString(action)).append("\n");
            sb.append("    failureCondition: ").append(toIndentedString(failureCondition)).append("\n");
            sb.append("    flags: ").append(toIndentedString(flags)).append("\n");
            sb.append("    manifest: ").append(toIndentedString(manifest)).append("\n");
            sb.append("    manifestFrom: ").append(toIndentedString(manifestFrom)).append("\n");
            sb.append("    mergeStrategy: ").append(toIndentedString(mergeStrategy)).append("\n");
            sb.append("    setOwnerReference: ").append(toIndentedString(setOwnerReference)).append("\n");
            sb.append("    successCondition: ").append(toIndentedString(successCondition)).append("\n");
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
