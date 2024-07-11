package io.quarkiverse.argocd.events.v1alpha1;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.quarkiverse.argocd.v1alpha1.model.Status;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.Type;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
/**
  * SensorStatus contains information about the status of a sensor.
 **/
public class SensorStatus  {

    /**
      * SensorStatus contains information about the status of a sensor.
     **/
    private Status status;

    /**
    * Get status
    * @return status
    **/
    @JsonProperty("status")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public Status getStatus() {
        return status;
    }

    /**
     * Set status
     **/
    public void setStatus(Status status) {
        this.status = status;
    }

    public SensorStatus status(Status status) {
        this.status = status;
        return this;
    }

    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SensorStatus {\n");

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
      * SensorStatus contains information about the status of a sensor.
     **/
    public static class SensorStatusQueryParam  {

        /**
          * SensorStatus contains information about the status of a sensor.
         **/
        @jakarta.ws.rs.QueryParam("status")
        private Status status;

        /**
        * Get status
        * @return status
        **/
        @JsonProperty("status")
        public Status getStatus() {
            return status;
        }

        /**
         * Set status
         **/
        public void setStatus(Status status) {
            this.status = status;
        }

        public SensorStatusQueryParam status(Status status) {
            this.status = status;
            return this;
        }

        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class SensorStatusQueryParam {\n");

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
