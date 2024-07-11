package io.quarkiverse.argocd.events.v1alpha1;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;

import io.fabric8.kubernetes.api.model.GroupVersionResource;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.Type;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
/**
  * ResourceEventSource refers to a event-source for K8s resource related events.
 **/
public class ResourceEventSource  {

    /**
      * ResourceEventSource refers to a event-source for K8s resource related events.
     **/
    private List<String> eventTypes;
    /**
      * ResourceEventSource refers to a event-source for K8s resource related events.
     **/
    private ResourceFilter filter;
    /**
      * ResourceEventSource refers to a event-source for K8s resource related events.
     **/
    private GroupVersionResource groupVersionResource;
    /**
      * ResourceEventSource refers to a event-source for K8s resource related events.
     **/
    private Map<String, String> metadata;
    /**
      * ResourceEventSource refers to a event-source for K8s resource related events.
     **/
    private String namespace;

    /**
    * EventTypes is the list of event type to watch. Possible values are - ADD, UPDATE and DELETE.
    * @return eventTypes
    **/
    @JsonProperty("eventTypes")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public List<String> getEventTypes() {
        return eventTypes;
    }

    /**
     * Set eventTypes
     **/
    public void setEventTypes(List<String> eventTypes) {
        this.eventTypes = eventTypes;
    }

    public ResourceEventSource eventTypes(List<String> eventTypes) {
        this.eventTypes = eventTypes;
        return this;
    }
    public ResourceEventSource addEventTypesItem(String eventTypesItem) {
        if (this.eventTypes == null){
            eventTypes = new ArrayList<>();
        }
        this.eventTypes.add(eventTypesItem);
        return this;
    }

    /**
    * Get filter
    * @return filter
    **/
    @JsonProperty("filter")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public ResourceFilter getFilter() {
        return filter;
    }

    /**
     * Set filter
     **/
    public void setFilter(ResourceFilter filter) {
        this.filter = filter;
    }

    public ResourceEventSource filter(ResourceFilter filter) {
        this.filter = filter;
        return this;
    }

    /**
    * Get groupVersionResource
    * @return groupVersionResource
    **/
    @JsonProperty("groupVersionResource")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public GroupVersionResource getGroupVersionResource() {
        return groupVersionResource;
    }

    /**
     * Set groupVersionResource
     **/
    public void setGroupVersionResource(GroupVersionResource groupVersionResource) {
        this.groupVersionResource = groupVersionResource;
    }

    public ResourceEventSource groupVersionResource(GroupVersionResource groupVersionResource) {
        this.groupVersionResource = groupVersionResource;
        return this;
    }

    /**
    * Get metadata
    * @return metadata
    **/
    @JsonProperty("metadata")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public Map<String, String> getMetadata() {
        return metadata;
    }

    /**
     * Set metadata
     **/
    public void setMetadata(Map<String, String> metadata) {
        this.metadata = metadata;
    }

    public ResourceEventSource metadata(Map<String, String> metadata) {
        this.metadata = metadata;
        return this;
    }
    public ResourceEventSource putMetadataItem(String key, String metadataItem) {
           if (this.metadata == null){
                metadata = new HashMap<>();
            }
        this.metadata.put(key, metadataItem);
        return this;
    }

    /**
    * Get namespace
    * @return namespace
    **/
    @JsonProperty("namespace")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public String getNamespace() {
        return namespace;
    }

    /**
     * Set namespace
     **/
    public void setNamespace(String namespace) {
        this.namespace = namespace;
    }

    public ResourceEventSource namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ResourceEventSource {\n");

        sb.append("    eventTypes: ").append(toIndentedString(eventTypes)).append("\n");
        sb.append("    filter: ").append(toIndentedString(filter)).append("\n");
        sb.append("    groupVersionResource: ").append(toIndentedString(groupVersionResource)).append("\n");
        sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
        sb.append("    namespace: ").append(toIndentedString(namespace)).append("\n");
        
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
      * ResourceEventSource refers to a event-source for K8s resource related events.
     **/
    public static class ResourceEventSourceQueryParam  {

        /**
          * ResourceEventSource refers to a event-source for K8s resource related events.
         **/
        @jakarta.ws.rs.QueryParam("eventTypes")
        private List<String> eventTypes = null;
        /**
          * ResourceEventSource refers to a event-source for K8s resource related events.
         **/
        @jakarta.ws.rs.QueryParam("filter")
        private ResourceFilter filter;
        /**
          * ResourceEventSource refers to a event-source for K8s resource related events.
         **/
        @jakarta.ws.rs.QueryParam("groupVersionResource")
        private GroupVersionResource groupVersionResource;
        /**
          * ResourceEventSource refers to a event-source for K8s resource related events.
         **/
        @jakarta.ws.rs.QueryParam("metadata")
        private Map<String, String> metadata = null;
        /**
          * ResourceEventSource refers to a event-source for K8s resource related events.
         **/
        @jakarta.ws.rs.QueryParam("namespace")
        private String namespace;

        /**
        * EventTypes is the list of event type to watch. Possible values are - ADD, UPDATE and DELETE.
        * @return eventTypes
        **/
        @JsonProperty("eventTypes")
        public List<String> getEventTypes() {
            return eventTypes;
        }

        /**
         * Set eventTypes
         **/
        public void setEventTypes(List<String> eventTypes) {
            this.eventTypes = eventTypes;
        }

        public ResourceEventSourceQueryParam eventTypes(List<String> eventTypes) {
            this.eventTypes = eventTypes;
            return this;
        }
        public ResourceEventSourceQueryParam addEventTypesItem(String eventTypesItem) {
            this.eventTypes.add(eventTypesItem);
            return this;
        }

        /**
        * Get filter
        * @return filter
        **/
        @JsonProperty("filter")
        public ResourceFilter getFilter() {
            return filter;
        }

        /**
         * Set filter
         **/
        public void setFilter(ResourceFilter filter) {
            this.filter = filter;
        }

        public ResourceEventSourceQueryParam filter(ResourceFilter filter) {
            this.filter = filter;
            return this;
        }

        /**
        * Get groupVersionResource
        * @return groupVersionResource
        **/
        @JsonProperty("groupVersionResource")
        public GroupVersionResource getGroupVersionResource() {
            return groupVersionResource;
        }

        /**
         * Set groupVersionResource
         **/
        public void setGroupVersionResource(GroupVersionResource groupVersionResource) {
            this.groupVersionResource = groupVersionResource;
        }

        public ResourceEventSourceQueryParam groupVersionResource(GroupVersionResource groupVersionResource) {
            this.groupVersionResource = groupVersionResource;
            return this;
        }

        /**
        * Get metadata
        * @return metadata
        **/
        @JsonProperty("metadata")
        public Map<String, String> getMetadata() {
            return metadata;
        }

        /**
         * Set metadata
         **/
        public void setMetadata(Map<String, String> metadata) {
            this.metadata = metadata;
        }

        public ResourceEventSourceQueryParam metadata(Map<String, String> metadata) {
            this.metadata = metadata;
            return this;
        }
        public ResourceEventSourceQueryParam putMetadataItem(String key, String metadataItem) {
            this.metadata.put(key, metadataItem);
            return this;
        }

        /**
        * Get namespace
        * @return namespace
        **/
        @JsonProperty("namespace")
        public String getNamespace() {
            return namespace;
        }

        /**
         * Set namespace
         **/
        public void setNamespace(String namespace) {
            this.namespace = namespace;
        }

        public ResourceEventSourceQueryParam namespace(String namespace) {
            this.namespace = namespace;
            return this;
        }

        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class ResourceEventSourceQueryParam {\n");

            sb.append("    eventTypes: ").append(toIndentedString(eventTypes)).append("\n");
            sb.append("    filter: ").append(toIndentedString(filter)).append("\n");
            sb.append("    groupVersionResource: ").append(toIndentedString(groupVersionResource)).append("\n");
            sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
            sb.append("    namespace: ").append(toIndentedString(namespace)).append("\n");
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
