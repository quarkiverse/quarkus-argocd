package io.quarkiverse.argocd.workflow.v1alpha1;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;

import io.fabric8.kubernetes.api.model.ListMeta;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.Type;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
/**
  * WorkflowEventBindingList is list of event resources
 **/
public class WorkflowEventBindingList  {

    /**
      * WorkflowEventBindingList is list of event resources
     **/
    private String apiVersion;
    /**
      * WorkflowEventBindingList is list of event resources
     **/
    private List<WorkflowEventBinding> items = new ArrayList<>();
    /**
      * WorkflowEventBindingList is list of event resources
     **/
    private String kind;
    /**
      * WorkflowEventBindingList is list of event resources
     **/
    private ListMeta metadata;

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

    public WorkflowEventBindingList apiVersion(String apiVersion) {
        this.apiVersion = apiVersion;
        return this;
    }

    /**
    * Get items
    * @return items
    **/
    @JsonProperty("items")
    public List<WorkflowEventBinding> getItems() {
        return items;
    }

    /**
     * Set items
     **/
    public void setItems(List<WorkflowEventBinding> items) {
        this.items = items;
    }

    public WorkflowEventBindingList items(List<WorkflowEventBinding> items) {
        this.items = items;
        return this;
    }
    public WorkflowEventBindingList addItemsItem(WorkflowEventBinding itemsItem) {
        if (this.items == null){
            items = new ArrayList<>();
        }
        this.items.add(itemsItem);
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

    public WorkflowEventBindingList kind(String kind) {
        this.kind = kind;
        return this;
    }

    /**
    * Get metadata
    * @return metadata
    **/
    @JsonProperty("metadata")
    public ListMeta getMetadata() {
        return metadata;
    }

    /**
     * Set metadata
     **/
    public void setMetadata(ListMeta metadata) {
        this.metadata = metadata;
    }

    public WorkflowEventBindingList metadata(ListMeta metadata) {
        this.metadata = metadata;
        return this;
    }

    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class WorkflowEventBindingList {\n");

        sb.append("    apiVersion: ").append(toIndentedString(apiVersion)).append("\n");
        sb.append("    items: ").append(toIndentedString(items)).append("\n");
        sb.append("    kind: ").append(toIndentedString(kind)).append("\n");
        sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
        
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
      * WorkflowEventBindingList is list of event resources
     **/
    public static class WorkflowEventBindingListQueryParam  {

        /**
          * WorkflowEventBindingList is list of event resources
         **/
        @jakarta.ws.rs.QueryParam("apiVersion")
        private String apiVersion;
        /**
          * WorkflowEventBindingList is list of event resources
         **/
        @jakarta.ws.rs.QueryParam("items")
        private List<WorkflowEventBinding> items = null;
        /**
          * WorkflowEventBindingList is list of event resources
         **/
        @jakarta.ws.rs.QueryParam("kind")
        private String kind;
        /**
          * WorkflowEventBindingList is list of event resources
         **/
        @jakarta.ws.rs.QueryParam("metadata")
        private ListMeta metadata;

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

        public WorkflowEventBindingListQueryParam apiVersion(String apiVersion) {
            this.apiVersion = apiVersion;
            return this;
        }

        /**
        * Get items
        * @return items
        **/
        @JsonProperty("items")
        public List<WorkflowEventBinding> getItems() {
            return items;
        }

        /**
         * Set items
         **/
        public void setItems(List<WorkflowEventBinding> items) {
            this.items = items;
        }

        public WorkflowEventBindingListQueryParam items(List<WorkflowEventBinding> items) {
            this.items = items;
            return this;
        }
        public WorkflowEventBindingListQueryParam addItemsItem(WorkflowEventBinding itemsItem) {
            this.items.add(itemsItem);
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

        public WorkflowEventBindingListQueryParam kind(String kind) {
            this.kind = kind;
            return this;
        }

        /**
        * Get metadata
        * @return metadata
        **/
        @JsonProperty("metadata")
        public ListMeta getMetadata() {
            return metadata;
        }

        /**
         * Set metadata
         **/
        public void setMetadata(ListMeta metadata) {
            this.metadata = metadata;
        }

        public WorkflowEventBindingListQueryParam metadata(ListMeta metadata) {
            this.metadata = metadata;
            return this;
        }

        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class WorkflowEventBindingListQueryParam {\n");

            sb.append("    apiVersion: ").append(toIndentedString(apiVersion)).append("\n");
            sb.append("    items: ").append(toIndentedString(items)).append("\n");
            sb.append("    kind: ").append(toIndentedString(kind)).append("\n");
            sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
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
