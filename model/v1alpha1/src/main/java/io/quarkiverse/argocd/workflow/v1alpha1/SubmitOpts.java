package io.quarkiverse.argocd.workflow.v1alpha1;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;

import io.fabric8.kubernetes.api.model.OwnerReference;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.Type;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
/**
  * SubmitOpts are workflow submission options
 **/
public class SubmitOpts  {

    /**
      * SubmitOpts are workflow submission options
     **/
    private String annotations;
    /**
      * SubmitOpts are workflow submission options
     **/
    private Boolean dryRun;
    /**
      * SubmitOpts are workflow submission options
     **/
    private String entryPoint;
    /**
      * SubmitOpts are workflow submission options
     **/
    private String generateName;
    /**
      * SubmitOpts are workflow submission options
     **/
    private String labels;
    /**
      * SubmitOpts are workflow submission options
     **/
    private String name;
    /**
      * SubmitOpts are workflow submission options
     **/
    private OwnerReference ownerReference;
    /**
      * SubmitOpts are workflow submission options
     **/
    private List<String> parameters;
    /**
      * SubmitOpts are workflow submission options
     **/
    private String podPriorityClassName;
    /**
      * SubmitOpts are workflow submission options
     **/
    private Integer priority;
    /**
      * SubmitOpts are workflow submission options
     **/
    private Boolean serverDryRun;
    /**
      * SubmitOpts are workflow submission options
     **/
    private String serviceAccount;

    /**
    * Annotations adds to metadata.labels
    * @return annotations
    **/
    @JsonProperty("annotations")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public String getAnnotations() {
        return annotations;
    }

    /**
     * Set annotations
     **/
    public void setAnnotations(String annotations) {
        this.annotations = annotations;
    }

    public SubmitOpts annotations(String annotations) {
        this.annotations = annotations;
        return this;
    }

    /**
    * DryRun validates the workflow on the client-side without creating it. This option is not supported in API
    * @return dryRun
    **/
    @JsonProperty("dryRun")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public Boolean getDryRun() {
        return dryRun;
    }

    /**
     * Set dryRun
     **/
    public void setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
    }

    public SubmitOpts dryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }

    /**
    * Entrypoint overrides spec.entrypoint
    * @return entryPoint
    **/
    @JsonProperty("entryPoint")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public String getEntryPoint() {
        return entryPoint;
    }

    /**
     * Set entryPoint
     **/
    public void setEntryPoint(String entryPoint) {
        this.entryPoint = entryPoint;
    }

    public SubmitOpts entryPoint(String entryPoint) {
        this.entryPoint = entryPoint;
        return this;
    }

    /**
    * GenerateName overrides metadata.generateName
    * @return generateName
    **/
    @JsonProperty("generateName")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public String getGenerateName() {
        return generateName;
    }

    /**
     * Set generateName
     **/
    public void setGenerateName(String generateName) {
        this.generateName = generateName;
    }

    public SubmitOpts generateName(String generateName) {
        this.generateName = generateName;
        return this;
    }

    /**
    * Labels adds to metadata.labels
    * @return labels
    **/
    @JsonProperty("labels")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public String getLabels() {
        return labels;
    }

    /**
     * Set labels
     **/
    public void setLabels(String labels) {
        this.labels = labels;
    }

    public SubmitOpts labels(String labels) {
        this.labels = labels;
        return this;
    }

    /**
    * Name overrides metadata.name
    * @return name
    **/
    @JsonProperty("name")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public String getName() {
        return name;
    }

    /**
     * Set name
     **/
    public void setName(String name) {
        this.name = name;
    }

    public SubmitOpts name(String name) {
        this.name = name;
        return this;
    }

    /**
    * Get ownerReference
    * @return ownerReference
    **/
    @JsonProperty("ownerReference")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public OwnerReference getOwnerReference() {
        return ownerReference;
    }

    /**
     * Set ownerReference
     **/
    public void setOwnerReference(OwnerReference ownerReference) {
        this.ownerReference = ownerReference;
    }

    public SubmitOpts ownerReference(OwnerReference ownerReference) {
        this.ownerReference = ownerReference;
        return this;
    }

    /**
    * Parameters passes input parameters to workflow
    * @return parameters
    **/
    @JsonProperty("parameters")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public List<String> getParameters() {
        return parameters;
    }

    /**
     * Set parameters
     **/
    public void setParameters(List<String> parameters) {
        this.parameters = parameters;
    }

    public SubmitOpts parameters(List<String> parameters) {
        this.parameters = parameters;
        return this;
    }
    public SubmitOpts addParametersItem(String parametersItem) {
        if (this.parameters == null){
            parameters = new ArrayList<>();
        }
        this.parameters.add(parametersItem);
        return this;
    }

    /**
    * Set the podPriorityClassName of the workflow
    * @return podPriorityClassName
    **/
    @JsonProperty("podPriorityClassName")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public String getPodPriorityClassName() {
        return podPriorityClassName;
    }

    /**
     * Set podPriorityClassName
     **/
    public void setPodPriorityClassName(String podPriorityClassName) {
        this.podPriorityClassName = podPriorityClassName;
    }

    public SubmitOpts podPriorityClassName(String podPriorityClassName) {
        this.podPriorityClassName = podPriorityClassName;
        return this;
    }

    /**
    * Priority is used if controller is configured to process limited number of workflows in parallel, higher priority workflows are processed first.
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

    public SubmitOpts priority(Integer priority) {
        this.priority = priority;
        return this;
    }

    /**
    * ServerDryRun validates the workflow on the server-side without creating it
    * @return serverDryRun
    **/
    @JsonProperty("serverDryRun")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public Boolean getServerDryRun() {
        return serverDryRun;
    }

    /**
     * Set serverDryRun
     **/
    public void setServerDryRun(Boolean serverDryRun) {
        this.serverDryRun = serverDryRun;
    }

    public SubmitOpts serverDryRun(Boolean serverDryRun) {
        this.serverDryRun = serverDryRun;
        return this;
    }

    /**
    * ServiceAccount runs all pods in the workflow using specified ServiceAccount.
    * @return serviceAccount
    **/
    @JsonProperty("serviceAccount")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public String getServiceAccount() {
        return serviceAccount;
    }

    /**
     * Set serviceAccount
     **/
    public void setServiceAccount(String serviceAccount) {
        this.serviceAccount = serviceAccount;
    }

    public SubmitOpts serviceAccount(String serviceAccount) {
        this.serviceAccount = serviceAccount;
        return this;
    }

    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SubmitOpts {\n");

        sb.append("    annotations: ").append(toIndentedString(annotations)).append("\n");
        sb.append("    dryRun: ").append(toIndentedString(dryRun)).append("\n");
        sb.append("    entryPoint: ").append(toIndentedString(entryPoint)).append("\n");
        sb.append("    generateName: ").append(toIndentedString(generateName)).append("\n");
        sb.append("    labels: ").append(toIndentedString(labels)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    ownerReference: ").append(toIndentedString(ownerReference)).append("\n");
        sb.append("    parameters: ").append(toIndentedString(parameters)).append("\n");
        sb.append("    podPriorityClassName: ").append(toIndentedString(podPriorityClassName)).append("\n");
        sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
        sb.append("    serverDryRun: ").append(toIndentedString(serverDryRun)).append("\n");
        sb.append("    serviceAccount: ").append(toIndentedString(serviceAccount)).append("\n");
        
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
      * SubmitOpts are workflow submission options
     **/
    public static class SubmitOptsQueryParam  {

        /**
          * SubmitOpts are workflow submission options
         **/
        @jakarta.ws.rs.QueryParam("annotations")
        private String annotations;
        /**
          * SubmitOpts are workflow submission options
         **/
        @jakarta.ws.rs.QueryParam("dryRun")
        private Boolean dryRun;
        /**
          * SubmitOpts are workflow submission options
         **/
        @jakarta.ws.rs.QueryParam("entryPoint")
        private String entryPoint;
        /**
          * SubmitOpts are workflow submission options
         **/
        @jakarta.ws.rs.QueryParam("generateName")
        private String generateName;
        /**
          * SubmitOpts are workflow submission options
         **/
        @jakarta.ws.rs.QueryParam("labels")
        private String labels;
        /**
          * SubmitOpts are workflow submission options
         **/
        @jakarta.ws.rs.QueryParam("name")
        private String name;
        /**
          * SubmitOpts are workflow submission options
         **/
        @jakarta.ws.rs.QueryParam("ownerReference")
        private OwnerReference ownerReference;
        /**
          * SubmitOpts are workflow submission options
         **/
        @jakarta.ws.rs.QueryParam("parameters")
        private List<String> parameters = null;
        /**
          * SubmitOpts are workflow submission options
         **/
        @jakarta.ws.rs.QueryParam("podPriorityClassName")
        private String podPriorityClassName;
        /**
          * SubmitOpts are workflow submission options
         **/
        @jakarta.ws.rs.QueryParam("priority")
        private Integer priority;
        /**
          * SubmitOpts are workflow submission options
         **/
        @jakarta.ws.rs.QueryParam("serverDryRun")
        private Boolean serverDryRun;
        /**
          * SubmitOpts are workflow submission options
         **/
        @jakarta.ws.rs.QueryParam("serviceAccount")
        private String serviceAccount;

        /**
        * Annotations adds to metadata.labels
        * @return annotations
        **/
        @JsonProperty("annotations")
        public String getAnnotations() {
            return annotations;
        }

        /**
         * Set annotations
         **/
        public void setAnnotations(String annotations) {
            this.annotations = annotations;
        }

        public SubmitOptsQueryParam annotations(String annotations) {
            this.annotations = annotations;
            return this;
        }

        /**
        * DryRun validates the workflow on the client-side without creating it. This option is not supported in API
        * @return dryRun
        **/
        @JsonProperty("dryRun")
        public Boolean getDryRun() {
            return dryRun;
        }

        /**
         * Set dryRun
         **/
        public void setDryRun(Boolean dryRun) {
            this.dryRun = dryRun;
        }

        public SubmitOptsQueryParam dryRun(Boolean dryRun) {
            this.dryRun = dryRun;
            return this;
        }

        /**
        * Entrypoint overrides spec.entrypoint
        * @return entryPoint
        **/
        @JsonProperty("entryPoint")
        public String getEntryPoint() {
            return entryPoint;
        }

        /**
         * Set entryPoint
         **/
        public void setEntryPoint(String entryPoint) {
            this.entryPoint = entryPoint;
        }

        public SubmitOptsQueryParam entryPoint(String entryPoint) {
            this.entryPoint = entryPoint;
            return this;
        }

        /**
        * GenerateName overrides metadata.generateName
        * @return generateName
        **/
        @JsonProperty("generateName")
        public String getGenerateName() {
            return generateName;
        }

        /**
         * Set generateName
         **/
        public void setGenerateName(String generateName) {
            this.generateName = generateName;
        }

        public SubmitOptsQueryParam generateName(String generateName) {
            this.generateName = generateName;
            return this;
        }

        /**
        * Labels adds to metadata.labels
        * @return labels
        **/
        @JsonProperty("labels")
        public String getLabels() {
            return labels;
        }

        /**
         * Set labels
         **/
        public void setLabels(String labels) {
            this.labels = labels;
        }

        public SubmitOptsQueryParam labels(String labels) {
            this.labels = labels;
            return this;
        }

        /**
        * Name overrides metadata.name
        * @return name
        **/
        @JsonProperty("name")
        public String getName() {
            return name;
        }

        /**
         * Set name
         **/
        public void setName(String name) {
            this.name = name;
        }

        public SubmitOptsQueryParam name(String name) {
            this.name = name;
            return this;
        }

        /**
        * Get ownerReference
        * @return ownerReference
        **/
        @JsonProperty("ownerReference")
        public OwnerReference getOwnerReference() {
            return ownerReference;
        }

        /**
         * Set ownerReference
         **/
        public void setOwnerReference(OwnerReference ownerReference) {
            this.ownerReference = ownerReference;
        }

        public SubmitOptsQueryParam ownerReference(OwnerReference ownerReference) {
            this.ownerReference = ownerReference;
            return this;
        }

        /**
        * Parameters passes input parameters to workflow
        * @return parameters
        **/
        @JsonProperty("parameters")
        public List<String> getParameters() {
            return parameters;
        }

        /**
         * Set parameters
         **/
        public void setParameters(List<String> parameters) {
            this.parameters = parameters;
        }

        public SubmitOptsQueryParam parameters(List<String> parameters) {
            this.parameters = parameters;
            return this;
        }
        public SubmitOptsQueryParam addParametersItem(String parametersItem) {
            this.parameters.add(parametersItem);
            return this;
        }

        /**
        * Set the podPriorityClassName of the workflow
        * @return podPriorityClassName
        **/
        @JsonProperty("podPriorityClassName")
        public String getPodPriorityClassName() {
            return podPriorityClassName;
        }

        /**
         * Set podPriorityClassName
         **/
        public void setPodPriorityClassName(String podPriorityClassName) {
            this.podPriorityClassName = podPriorityClassName;
        }

        public SubmitOptsQueryParam podPriorityClassName(String podPriorityClassName) {
            this.podPriorityClassName = podPriorityClassName;
            return this;
        }

        /**
        * Priority is used if controller is configured to process limited number of workflows in parallel, higher priority workflows are processed first.
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

        public SubmitOptsQueryParam priority(Integer priority) {
            this.priority = priority;
            return this;
        }

        /**
        * ServerDryRun validates the workflow on the server-side without creating it
        * @return serverDryRun
        **/
        @JsonProperty("serverDryRun")
        public Boolean getServerDryRun() {
            return serverDryRun;
        }

        /**
         * Set serverDryRun
         **/
        public void setServerDryRun(Boolean serverDryRun) {
            this.serverDryRun = serverDryRun;
        }

        public SubmitOptsQueryParam serverDryRun(Boolean serverDryRun) {
            this.serverDryRun = serverDryRun;
            return this;
        }

        /**
        * ServiceAccount runs all pods in the workflow using specified ServiceAccount.
        * @return serviceAccount
        **/
        @JsonProperty("serviceAccount")
        public String getServiceAccount() {
            return serviceAccount;
        }

        /**
         * Set serviceAccount
         **/
        public void setServiceAccount(String serviceAccount) {
            this.serviceAccount = serviceAccount;
        }

        public SubmitOptsQueryParam serviceAccount(String serviceAccount) {
            this.serviceAccount = serviceAccount;
            return this;
        }

        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class SubmitOptsQueryParam {\n");

            sb.append("    annotations: ").append(toIndentedString(annotations)).append("\n");
            sb.append("    dryRun: ").append(toIndentedString(dryRun)).append("\n");
            sb.append("    entryPoint: ").append(toIndentedString(entryPoint)).append("\n");
            sb.append("    generateName: ").append(toIndentedString(generateName)).append("\n");
            sb.append("    labels: ").append(toIndentedString(labels)).append("\n");
            sb.append("    name: ").append(toIndentedString(name)).append("\n");
            sb.append("    ownerReference: ").append(toIndentedString(ownerReference)).append("\n");
            sb.append("    parameters: ").append(toIndentedString(parameters)).append("\n");
            sb.append("    podPriorityClassName: ").append(toIndentedString(podPriorityClassName)).append("\n");
            sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
            sb.append("    serverDryRun: ").append(toIndentedString(serverDryRun)).append("\n");
            sb.append("    serviceAccount: ").append(toIndentedString(serviceAccount)).append("\n");
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
