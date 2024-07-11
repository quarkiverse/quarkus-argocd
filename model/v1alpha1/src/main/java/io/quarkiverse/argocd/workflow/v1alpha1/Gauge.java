package io.quarkiverse.argocd.workflow.v1alpha1;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.Type;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
/**
  * Gauge is a Gauge prometheus metric
 **/
public class Gauge  {

    /**
      * Gauge is a Gauge prometheus metric
     **/
    private String operation;
    /**
      * Gauge is a Gauge prometheus metric
     **/
    private Boolean realtime;
    /**
      * Gauge is a Gauge prometheus metric
     **/
    private String value;

    /**
    * Operation defines the operation to apply with value and the metrics' current value
    * @return operation
    **/
    @JsonProperty("operation")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public String getOperation() {
        return operation;
    }

    /**
     * Set operation
     **/
    public void setOperation(String operation) {
        this.operation = operation;
    }

    public Gauge operation(String operation) {
        this.operation = operation;
        return this;
    }

    /**
    * Realtime emits this metric in real time if applicable
    * @return realtime
    **/
    @JsonProperty("realtime")
    public Boolean getRealtime() {
        return realtime;
    }

    /**
     * Set realtime
     **/
    public void setRealtime(Boolean realtime) {
        this.realtime = realtime;
    }

    public Gauge realtime(Boolean realtime) {
        this.realtime = realtime;
        return this;
    }

    /**
    * Value is the value to be used in the operation with the metric's current value. If no operation is set, value is the value of the metric
    * @return value
    **/
    @JsonProperty("value")
    public String getValue() {
        return value;
    }

    /**
     * Set value
     **/
    public void setValue(String value) {
        this.value = value;
    }

    public Gauge value(String value) {
        this.value = value;
        return this;
    }

    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Gauge {\n");

        sb.append("    operation: ").append(toIndentedString(operation)).append("\n");
        sb.append("    realtime: ").append(toIndentedString(realtime)).append("\n");
        sb.append("    value: ").append(toIndentedString(value)).append("\n");
        
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
      * Gauge is a Gauge prometheus metric
     **/
    public static class GaugeQueryParam  {

        /**
          * Gauge is a Gauge prometheus metric
         **/
        @jakarta.ws.rs.QueryParam("operation")
        private String operation;
        /**
          * Gauge is a Gauge prometheus metric
         **/
        @jakarta.ws.rs.QueryParam("realtime")
        private Boolean realtime;
        /**
          * Gauge is a Gauge prometheus metric
         **/
        @jakarta.ws.rs.QueryParam("value")
        private String value;

        /**
        * Operation defines the operation to apply with value and the metrics' current value
        * @return operation
        **/
        @JsonProperty("operation")
        public String getOperation() {
            return operation;
        }

        /**
         * Set operation
         **/
        public void setOperation(String operation) {
            this.operation = operation;
        }

        public GaugeQueryParam operation(String operation) {
            this.operation = operation;
            return this;
        }

        /**
        * Realtime emits this metric in real time if applicable
        * @return realtime
        **/
        @JsonProperty("realtime")
        public Boolean getRealtime() {
            return realtime;
        }

        /**
         * Set realtime
         **/
        public void setRealtime(Boolean realtime) {
            this.realtime = realtime;
        }

        public GaugeQueryParam realtime(Boolean realtime) {
            this.realtime = realtime;
            return this;
        }

        /**
        * Value is the value to be used in the operation with the metric's current value. If no operation is set, value is the value of the metric
        * @return value
        **/
        @JsonProperty("value")
        public String getValue() {
            return value;
        }

        /**
         * Set value
         **/
        public void setValue(String value) {
            this.value = value;
        }

        public GaugeQueryParam value(String value) {
            this.value = value;
            return this;
        }

        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class GaugeQueryParam {\n");

            sb.append("    operation: ").append(toIndentedString(operation)).append("\n");
            sb.append("    realtime: ").append(toIndentedString(realtime)).append("\n");
            sb.append("    value: ").append(toIndentedString(value)).append("\n");
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