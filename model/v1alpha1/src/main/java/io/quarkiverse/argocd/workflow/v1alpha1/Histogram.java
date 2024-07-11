package io.quarkiverse.argocd.workflow.v1alpha1;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.Type;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
/**
  * Histogram is a Histogram prometheus metric
 **/
public class Histogram  {

    /**
      * Histogram is a Histogram prometheus metric
     **/
    private List<BigDecimal> buckets = new ArrayList<>();
    /**
      * Histogram is a Histogram prometheus metric
     **/
    private String value;

    /**
    * Buckets is a list of bucket divisors for the histogram
    * @return buckets
    **/
    @JsonProperty("buckets")
    public List<BigDecimal> getBuckets() {
        return buckets;
    }

    /**
     * Set buckets
     **/
    public void setBuckets(List<BigDecimal> buckets) {
        this.buckets = buckets;
    }

    public Histogram buckets(List<BigDecimal> buckets) {
        this.buckets = buckets;
        return this;
    }
    public Histogram addBucketsItem(BigDecimal bucketsItem) {
        if (this.buckets == null){
            buckets = new ArrayList<>();
        }
        this.buckets.add(bucketsItem);
        return this;
    }

    /**
    * Value is the value of the metric
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

    public Histogram value(String value) {
        this.value = value;
        return this;
    }

    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Histogram {\n");

        sb.append("    buckets: ").append(toIndentedString(buckets)).append("\n");
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
      * Histogram is a Histogram prometheus metric
     **/
    public static class HistogramQueryParam  {

        /**
          * Histogram is a Histogram prometheus metric
         **/
        @jakarta.ws.rs.QueryParam("buckets")
        private List<BigDecimal> buckets = null;
        /**
          * Histogram is a Histogram prometheus metric
         **/
        @jakarta.ws.rs.QueryParam("value")
        private String value;

        /**
        * Buckets is a list of bucket divisors for the histogram
        * @return buckets
        **/
        @JsonProperty("buckets")
        public List<BigDecimal> getBuckets() {
            return buckets;
        }

        /**
         * Set buckets
         **/
        public void setBuckets(List<BigDecimal> buckets) {
            this.buckets = buckets;
        }

        public HistogramQueryParam buckets(List<BigDecimal> buckets) {
            this.buckets = buckets;
            return this;
        }
        public HistogramQueryParam addBucketsItem(BigDecimal bucketsItem) {
            this.buckets.add(bucketsItem);
            return this;
        }

        /**
        * Value is the value of the metric
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

        public HistogramQueryParam value(String value) {
            this.value = value;
            return this;
        }

        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class HistogramQueryParam {\n");

            sb.append("    buckets: ").append(toIndentedString(buckets)).append("\n");
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