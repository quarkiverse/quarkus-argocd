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
  * Metrics are a list of metrics emitted from a Workflow/Template
 **/
public class Metrics  {

    /**
      * Metrics are a list of metrics emitted from a Workflow/Template
     **/
    private List<Prometheus> prometheus = new ArrayList<>();

    /**
    * Prometheus is a list of prometheus metrics to be emitted
    * @return prometheus
    **/
    @JsonProperty("prometheus")
    public List<Prometheus> getPrometheus() {
        return prometheus;
    }

    /**
     * Set prometheus
     **/
    public void setPrometheus(List<Prometheus> prometheus) {
        this.prometheus = prometheus;
    }

    public Metrics prometheus(List<Prometheus> prometheus) {
        this.prometheus = prometheus;
        return this;
    }
    public Metrics addPrometheusItem(Prometheus prometheusItem) {
        if (this.prometheus == null){
            prometheus = new ArrayList<>();
        }
        this.prometheus.add(prometheusItem);
        return this;
    }

    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Metrics {\n");

        sb.append("    prometheus: ").append(toIndentedString(prometheus)).append("\n");
        
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
      * Metrics are a list of metrics emitted from a Workflow/Template
     **/
    public static class MetricsQueryParam  {

        /**
          * Metrics are a list of metrics emitted from a Workflow/Template
         **/
        @jakarta.ws.rs.QueryParam("prometheus")
        private List<Prometheus> prometheus = null;

        /**
        * Prometheus is a list of prometheus metrics to be emitted
        * @return prometheus
        **/
        @JsonProperty("prometheus")
        public List<Prometheus> getPrometheus() {
            return prometheus;
        }

        /**
         * Set prometheus
         **/
        public void setPrometheus(List<Prometheus> prometheus) {
            this.prometheus = prometheus;
        }

        public MetricsQueryParam prometheus(List<Prometheus> prometheus) {
            this.prometheus = prometheus;
            return this;
        }
        public MetricsQueryParam addPrometheusItem(Prometheus prometheusItem) {
            this.prometheus.add(prometheusItem);
            return this;
        }

        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class MetricsQueryParam {\n");

            sb.append("    prometheus: ").append(toIndentedString(prometheus)).append("\n");
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
