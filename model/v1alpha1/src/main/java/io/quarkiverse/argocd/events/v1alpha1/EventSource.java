package io.quarkiverse.argocd.events.v1alpha1;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;

import io.fabric8.kubernetes.api.model.ObjectMeta;
import io.quarkiverse.argocd.v1alpha1.model.EventSourceStatus;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.Type;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class EventSource  {

    private ObjectMeta metadata;
    private EventSourceSpec spec;
    private EventSourceStatus status;

    /**
    * Get metadata
    * @return metadata
    **/
    @JsonProperty("metadata")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public ObjectMeta getMetadata() {
        return metadata;
    }

    /**
     * Set metadata
     **/
    public void setMetadata(ObjectMeta metadata) {
        this.metadata = metadata;
    }

    public EventSource metadata(ObjectMeta metadata) {
        this.metadata = metadata;
        return this;
    }

    /**
    * Get spec
    * @return spec
    **/
    @JsonProperty("spec")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public EventSourceSpec getSpec() {
        return spec;
    }

    /**
     * Set spec
     **/
    public void setSpec(EventSourceSpec spec) {
        this.spec = spec;
    }

    public EventSource spec(EventSourceSpec spec) {
        this.spec = spec;
        return this;
    }

    /**
    * Get status
    * @return status
    **/
    @JsonProperty("status")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public EventSourceStatus getStatus() {
        return status;
    }

    /**
     * Set status
     **/
    public void setStatus(EventSourceStatus status) {
        this.status = status;
    }

    public EventSource status(EventSourceStatus status) {
        this.status = status;
        return this;
    }

    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class EventSource {\n");

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
    public static class EventSourceQueryParam  {

        @jakarta.ws.rs.QueryParam("metadata")
        private ObjectMeta metadata;
        @jakarta.ws.rs.QueryParam("spec")
        private EventSourceSpec spec;
        @jakarta.ws.rs.QueryParam("status")
        private EventSourceStatus status;

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

        public EventSourceQueryParam metadata(ObjectMeta metadata) {
            this.metadata = metadata;
            return this;
        }

        /**
        * Get spec
        * @return spec
        **/
        @JsonProperty("spec")
        public EventSourceSpec getSpec() {
            return spec;
        }

        /**
         * Set spec
         **/
        public void setSpec(EventSourceSpec spec) {
            this.spec = spec;
        }

        public EventSourceQueryParam spec(EventSourceSpec spec) {
            this.spec = spec;
            return this;
        }

        /**
        * Get status
        * @return status
        **/
        @JsonProperty("status")
        public EventSourceStatus getStatus() {
            return status;
        }

        /**
         * Set status
         **/
        public void setStatus(EventSourceStatus status) {
            this.status = status;
        }

        public EventSourceQueryParam status(EventSourceStatus status) {
            this.status = status;
            return this;
        }

        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class EventSourceQueryParam {\n");

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
