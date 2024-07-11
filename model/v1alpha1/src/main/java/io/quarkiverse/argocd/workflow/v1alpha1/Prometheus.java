package io.quarkiverse.argocd.workflow.v1alpha1;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.quarkiverse.argocd.v1alpha1.model.Counter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.Type;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
/**
  * Prometheus is a prometheus metric to be emitted
 **/
public class Prometheus  {

    /**
      * Prometheus is a prometheus metric to be emitted
     **/
    private Counter counter;
    /**
      * Prometheus is a prometheus metric to be emitted
     **/
    private Gauge gauge;
    /**
      * Prometheus is a prometheus metric to be emitted
     **/
    private String help;
    /**
      * Prometheus is a prometheus metric to be emitted
     **/
    private Histogram histogram;
    /**
      * Prometheus is a prometheus metric to be emitted
     **/
    private List<MetricLabel> labels;
    /**
      * Prometheus is a prometheus metric to be emitted
     **/
    private String name;
    /**
      * Prometheus is a prometheus metric to be emitted
     **/
    private String when;

    /**
    * Get counter
    * @return counter
    **/
    @JsonProperty("counter")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public Counter getCounter() {
        return counter;
    }

    /**
     * Set counter
     **/
    public void setCounter(Counter counter) {
        this.counter = counter;
    }

    public Prometheus counter(Counter counter) {
        this.counter = counter;
        return this;
    }

    /**
    * Get gauge
    * @return gauge
    **/
    @JsonProperty("gauge")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public Gauge getGauge() {
        return gauge;
    }

    /**
     * Set gauge
     **/
    public void setGauge(Gauge gauge) {
        this.gauge = gauge;
    }

    public Prometheus gauge(Gauge gauge) {
        this.gauge = gauge;
        return this;
    }

    /**
    * Help is a string that describes the metric
    * @return help
    **/
    @JsonProperty("help")
    public String getHelp() {
        return help;
    }

    /**
     * Set help
     **/
    public void setHelp(String help) {
        this.help = help;
    }

    public Prometheus help(String help) {
        this.help = help;
        return this;
    }

    /**
    * Get histogram
    * @return histogram
    **/
    @JsonProperty("histogram")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public Histogram getHistogram() {
        return histogram;
    }

    /**
     * Set histogram
     **/
    public void setHistogram(Histogram histogram) {
        this.histogram = histogram;
    }

    public Prometheus histogram(Histogram histogram) {
        this.histogram = histogram;
        return this;
    }

    /**
    * Labels is a list of metric labels
    * @return labels
    **/
    @JsonProperty("labels")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public List<MetricLabel> getLabels() {
        return labels;
    }

    /**
     * Set labels
     **/
    public void setLabels(List<MetricLabel> labels) {
        this.labels = labels;
    }

    public Prometheus labels(List<MetricLabel> labels) {
        this.labels = labels;
        return this;
    }
    public Prometheus addLabelsItem(MetricLabel labelsItem) {
        if (this.labels == null){
            labels = new ArrayList<>();
        }
        this.labels.add(labelsItem);
        return this;
    }

    /**
    * Name is the name of the metric
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

    public Prometheus name(String name) {
        this.name = name;
        return this;
    }

    /**
    * When is a conditional statement that decides when to emit the metric
    * @return when
    **/
    @JsonProperty("when")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public String getWhen() {
        return when;
    }

    /**
     * Set when
     **/
    public void setWhen(String when) {
        this.when = when;
    }

    public Prometheus when(String when) {
        this.when = when;
        return this;
    }

    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Prometheus {\n");

        sb.append("    counter: ").append(toIndentedString(counter)).append("\n");
        sb.append("    gauge: ").append(toIndentedString(gauge)).append("\n");
        sb.append("    help: ").append(toIndentedString(help)).append("\n");
        sb.append("    histogram: ").append(toIndentedString(histogram)).append("\n");
        sb.append("    labels: ").append(toIndentedString(labels)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    when: ").append(toIndentedString(when)).append("\n");
        
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
      * Prometheus is a prometheus metric to be emitted
     **/
    public static class PrometheusQueryParam  {

        /**
          * Prometheus is a prometheus metric to be emitted
         **/
        @jakarta.ws.rs.QueryParam("counter")
        private Counter counter;
        /**
          * Prometheus is a prometheus metric to be emitted
         **/
        @jakarta.ws.rs.QueryParam("gauge")
        private Gauge gauge;
        /**
          * Prometheus is a prometheus metric to be emitted
         **/
        @jakarta.ws.rs.QueryParam("help")
        private String help;
        /**
          * Prometheus is a prometheus metric to be emitted
         **/
        @jakarta.ws.rs.QueryParam("histogram")
        private Histogram histogram;
        /**
          * Prometheus is a prometheus metric to be emitted
         **/
        @jakarta.ws.rs.QueryParam("labels")
        private List<MetricLabel> labels = null;
        /**
          * Prometheus is a prometheus metric to be emitted
         **/
        @jakarta.ws.rs.QueryParam("name")
        private String name;
        /**
          * Prometheus is a prometheus metric to be emitted
         **/
        @jakarta.ws.rs.QueryParam("when")
        private String when;

        /**
        * Get counter
        * @return counter
        **/
        @JsonProperty("counter")
        public Counter getCounter() {
            return counter;
        }

        /**
         * Set counter
         **/
        public void setCounter(Counter counter) {
            this.counter = counter;
        }

        public PrometheusQueryParam counter(Counter counter) {
            this.counter = counter;
            return this;
        }

        /**
        * Get gauge
        * @return gauge
        **/
        @JsonProperty("gauge")
        public Gauge getGauge() {
            return gauge;
        }

        /**
         * Set gauge
         **/
        public void setGauge(Gauge gauge) {
            this.gauge = gauge;
        }

        public PrometheusQueryParam gauge(Gauge gauge) {
            this.gauge = gauge;
            return this;
        }

        /**
        * Help is a string that describes the metric
        * @return help
        **/
        @JsonProperty("help")
        public String getHelp() {
            return help;
        }

        /**
         * Set help
         **/
        public void setHelp(String help) {
            this.help = help;
        }

        public PrometheusQueryParam help(String help) {
            this.help = help;
            return this;
        }

        /**
        * Get histogram
        * @return histogram
        **/
        @JsonProperty("histogram")
        public Histogram getHistogram() {
            return histogram;
        }

        /**
         * Set histogram
         **/
        public void setHistogram(Histogram histogram) {
            this.histogram = histogram;
        }

        public PrometheusQueryParam histogram(Histogram histogram) {
            this.histogram = histogram;
            return this;
        }

        /**
        * Labels is a list of metric labels
        * @return labels
        **/
        @JsonProperty("labels")
        public List<MetricLabel> getLabels() {
            return labels;
        }

        /**
         * Set labels
         **/
        public void setLabels(List<MetricLabel> labels) {
            this.labels = labels;
        }

        public PrometheusQueryParam labels(List<MetricLabel> labels) {
            this.labels = labels;
            return this;
        }
        public PrometheusQueryParam addLabelsItem(MetricLabel labelsItem) {
            this.labels.add(labelsItem);
            return this;
        }

        /**
        * Name is the name of the metric
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

        public PrometheusQueryParam name(String name) {
            this.name = name;
            return this;
        }

        /**
        * When is a conditional statement that decides when to emit the metric
        * @return when
        **/
        @JsonProperty("when")
        public String getWhen() {
            return when;
        }

        /**
         * Set when
         **/
        public void setWhen(String when) {
            this.when = when;
        }

        public PrometheusQueryParam when(String when) {
            this.when = when;
            return this;
        }

        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class PrometheusQueryParam {\n");

            sb.append("    counter: ").append(toIndentedString(counter)).append("\n");
            sb.append("    gauge: ").append(toIndentedString(gauge)).append("\n");
            sb.append("    help: ").append(toIndentedString(help)).append("\n");
            sb.append("    histogram: ").append(toIndentedString(histogram)).append("\n");
            sb.append("    labels: ").append(toIndentedString(labels)).append("\n");
            sb.append("    name: ").append(toIndentedString(name)).append("\n");
            sb.append("    when: ").append(toIndentedString(when)).append("\n");
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
