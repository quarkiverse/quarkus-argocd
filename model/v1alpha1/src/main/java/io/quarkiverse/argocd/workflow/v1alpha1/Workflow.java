package io.quarkiverse.argocd.workflow.v1alpha1;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.fabric8.kubernetes.api.model.ObjectMeta;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.Type;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
/**
  * Workflow is the definition of a workflow resource
 **/
public class Workflow  {

    /**
      * Workflow is the definition of a workflow resource
     **/
    private String apiVersion;
    /**
      * Workflow is the definition of a workflow resource
     **/
    private String kind;
    /**
      * Workflow is the definition of a workflow resource
     **/
    private ObjectMeta metadata;
    /**
      * Workflow is the definition of a workflow resource
     **/
    private WorkflowSpec spec;
    /**
      * Workflow is the definition of a workflow resource
     **/
    private WorkflowStatus status;

    /**
    * APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.io.k8s.community/contributors/devel/sig-architecture/api-conventions.md#resources
    * @return apiVersion
    **/
    @JsonProperty("apiVersion")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public String getApiVersion() {
        return apiVersion;
    }

    /**
     * Set apiVersion
     **/
    public void setApiVersion(String apiVersion) {
        this.apiVersion = apiVersion;
    }

    public Workflow apiVersion(String apiVersion) {
        this.apiVersion = apiVersion;
        return this;
    }

    /**
    * Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.io.k8s.community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
    * @return kind
    **/
    @JsonProperty("kind")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public String getKind() {
        return kind;
    }

    /**
     * Set kind
     **/
    public void setKind(String kind) {
        this.kind = kind;
    }

    public Workflow kind(String kind) {
        this.kind = kind;
        return this;
    }

    /**
    * Get metadata
    * @return metadata
    **/
    @JsonProperty("metadata")
    public ObjectMeta getMetadata() {
        return metadata;
    }

    /**
     * Set metadata
     **/
    public void setMetadata(ObjectMeta metadata) {
        this.metadata = metadata;
    }

    public Workflow metadata(ObjectMeta metadata) {
        this.metadata = metadata;
        return this;
    }

    /**
    * Get spec
    * @return spec
    **/
    @JsonProperty("spec")
    public WorkflowSpec getSpec() {
        return spec;
    }

    /**
     * Set spec
     **/
    public void setSpec(WorkflowSpec spec) {
        this.spec = spec;
    }

    public Workflow spec(WorkflowSpec spec) {
        this.spec = spec;
        return this;
    }

    /**
    * Get status
    * @return status
    **/
    @JsonProperty("status")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public WorkflowStatus getStatus() {
        return status;
    }

    /**
     * Set status
     **/
    public void setStatus(WorkflowStatus status) {
        this.status = status;
    }

    public Workflow status(WorkflowStatus status) {
        this.status = status;
        return this;
    }

    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Workflow {\n");

        sb.append("    apiVersion: ").append(toIndentedString(apiVersion)).append("\n");
        sb.append("    kind: ").append(toIndentedString(kind)).append("\n");
        sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
        sb.append("    spec: ").append(toIndentedString(spec)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        
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
      * Workflow is the definition of a workflow resource
     **/
    public static class WorkflowQueryParam  {

        /**
          * Workflow is the definition of a workflow resource
         **/
        @jakarta.ws.rs.QueryParam("apiVersion")
        private String apiVersion;
        /**
          * Workflow is the definition of a workflow resource
         **/
        @jakarta.ws.rs.QueryParam("kind")
        private String kind;
        /**
          * Workflow is the definition of a workflow resource
         **/
        @jakarta.ws.rs.QueryParam("metadata")
        private ObjectMeta metadata;
        /**
          * Workflow is the definition of a workflow resource
         **/
        @jakarta.ws.rs.QueryParam("spec")
        private WorkflowSpec spec;
        /**
          * Workflow is the definition of a workflow resource
         **/
        @jakarta.ws.rs.QueryParam("status")
        private WorkflowStatus status;

        /**
        * APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.io.k8s.community/contributors/devel/sig-architecture/api-conventions.md#resources
        * @return apiVersion
        **/
        @JsonProperty("apiVersion")
        public String getApiVersion() {
            return apiVersion;
        }

        /**
         * Set apiVersion
         **/
        public void setApiVersion(String apiVersion) {
            this.apiVersion = apiVersion;
        }

        public WorkflowQueryParam apiVersion(String apiVersion) {
            this.apiVersion = apiVersion;
            return this;
        }

        /**
        * Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.io.k8s.community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
        * @return kind
        **/
        @JsonProperty("kind")
        public String getKind() {
            return kind;
        }

        /**
         * Set kind
         **/
        public void setKind(String kind) {
            this.kind = kind;
        }

        public WorkflowQueryParam kind(String kind) {
            this.kind = kind;
            return this;
        }

        /**
        * Get metadata
        * @return metadata
        **/
        @JsonProperty("metadata")
        public ObjectMeta getMetadata() {
            return metadata;
        }

        /**
         * Set metadata
         **/
        public void setMetadata(ObjectMeta metadata) {
            this.metadata = metadata;
        }

        public WorkflowQueryParam metadata(ObjectMeta metadata) {
            this.metadata = metadata;
            return this;
        }

        /**
        * Get spec
        * @return spec
        **/
        @JsonProperty("spec")
        public WorkflowSpec getSpec() {
            return spec;
        }

        /**
         * Set spec
         **/
        public void setSpec(WorkflowSpec spec) {
            this.spec = spec;
        }

        public WorkflowQueryParam spec(WorkflowSpec spec) {
            this.spec = spec;
            return this;
        }

        /**
        * Get status
        * @return status
        **/
        @JsonProperty("status")
        public WorkflowStatus getStatus() {
            return status;
        }

        /**
         * Set status
         **/
        public void setStatus(WorkflowStatus status) {
            this.status = status;
        }

        public WorkflowQueryParam status(WorkflowStatus status) {
            this.status = status;
            return this;
        }

        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class WorkflowQueryParam {\n");

            sb.append("    apiVersion: ").append(toIndentedString(apiVersion)).append("\n");
            sb.append("    kind: ").append(toIndentedString(kind)).append("\n");
            sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
            sb.append("    spec: ").append(toIndentedString(spec)).append("\n");
            sb.append("    status: ").append(toIndentedString(status)).append("\n");
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
