package io.quarkiverse.argocd.events.v1alpha1;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import io.fabric8.kubernetes.api.model.ObjectMeta;
import io.quarkiverse.argocd.v1alpha1.model.SensorStatus;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Sensor  {

    private ObjectMeta metadata;
    private SensorSpec spec;
    private SensorStatus status;

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

    public Sensor metadata(ObjectMeta metadata) {
        this.metadata = metadata;
        return this;
    }

    /**
    * Get spec
    * @return spec
    **/
    @JsonProperty("spec")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public SensorSpec getSpec() {
        return spec;
    }

    /**
     * Set spec
     **/
    public void setSpec(SensorSpec spec) {
        this.spec = spec;
    }

    public Sensor spec(SensorSpec spec) {
        this.spec = spec;
        return this;
    }

    /**
    * Get status
    * @return status
    **/
    @JsonProperty("status")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public SensorStatus getStatus() {
        return status;
    }

    /**
     * Set status
     **/
    public void setStatus(SensorStatus status) {
        this.status = status;
    }

    public Sensor status(SensorStatus status) {
        this.status = status;
        return this;
    }

    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Sensor {\n");

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
    public static class SensorQueryParam  {

        @jakarta.ws.rs.QueryParam("metadata")
        private ObjectMeta metadata;
        @jakarta.ws.rs.QueryParam("spec")
        private SensorSpec spec;
        @jakarta.ws.rs.QueryParam("status")
        private SensorStatus status;

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

        public SensorQueryParam metadata(ObjectMeta metadata) {
            this.metadata = metadata;
            return this;
        }

        /**
        * Get spec
        * @return spec
        **/
        @JsonProperty("spec")
        public SensorSpec getSpec() {
            return spec;
        }

        /**
         * Set spec
         **/
        public void setSpec(SensorSpec spec) {
            this.spec = spec;
        }

        public SensorQueryParam spec(SensorSpec spec) {
            this.spec = spec;
            return this;
        }

        /**
        * Get status
        * @return status
        **/
        @JsonProperty("status")
        public SensorStatus getStatus() {
            return status;
        }

        /**
         * Set status
         **/
        public void setStatus(SensorStatus status) {
            this.status = status;
        }

        public SensorQueryParam status(SensorStatus status) {
            this.status = status;
            return this;
        }

        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class SensorQueryParam {\n");

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
