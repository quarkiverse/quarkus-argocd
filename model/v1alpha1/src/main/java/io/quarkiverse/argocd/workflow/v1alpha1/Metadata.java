package io.quarkiverse.argocd.workflow.v1alpha1;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.Type;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
/**
  * Pod metdata
 **/
public class Metadata  {

    /**
      * Pod metdata
     **/
    private Map<String, String> annotations;
    /**
      * Pod metdata
     **/
    private Map<String, String> labels;

    /**
    * Get annotations
    * @return annotations
    **/
    @JsonProperty("annotations")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public Map<String, String> getAnnotations() {
        return annotations;
    }

    /**
     * Set annotations
     **/
    public void setAnnotations(Map<String, String> annotations) {
        this.annotations = annotations;
    }

    public Metadata annotations(Map<String, String> annotations) {
        this.annotations = annotations;
        return this;
    }
    public Metadata putAnnotationsItem(String key, String annotationsItem) {
           if (this.annotations == null){
                annotations = new HashMap<>();
            }
        this.annotations.put(key, annotationsItem);
        return this;
    }

    /**
    * Get labels
    * @return labels
    **/
    @JsonProperty("labels")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public Map<String, String> getLabels() {
        return labels;
    }

    /**
     * Set labels
     **/
    public void setLabels(Map<String, String> labels) {
        this.labels = labels;
    }

    public Metadata labels(Map<String, String> labels) {
        this.labels = labels;
        return this;
    }
    public Metadata putLabelsItem(String key, String labelsItem) {
           if (this.labels == null){
                labels = new HashMap<>();
            }
        this.labels.put(key, labelsItem);
        return this;
    }

    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Metadata {\n");

        sb.append("    annotations: ").append(toIndentedString(annotations)).append("\n");
        sb.append("    labels: ").append(toIndentedString(labels)).append("\n");
        
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
      * Pod metdata
     **/
    public static class MetadataQueryParam  {

        /**
          * Pod metdata
         **/
        @jakarta.ws.rs.QueryParam("annotations")
        private Map<String, String> annotations = null;
        /**
          * Pod metdata
         **/
        @jakarta.ws.rs.QueryParam("labels")
        private Map<String, String> labels = null;

        /**
        * Get annotations
        * @return annotations
        **/
        @JsonProperty("annotations")
        public Map<String, String> getAnnotations() {
            return annotations;
        }

        /**
         * Set annotations
         **/
        public void setAnnotations(Map<String, String> annotations) {
            this.annotations = annotations;
        }

        public MetadataQueryParam annotations(Map<String, String> annotations) {
            this.annotations = annotations;
            return this;
        }
        public MetadataQueryParam putAnnotationsItem(String key, String annotationsItem) {
            this.annotations.put(key, annotationsItem);
            return this;
        }

        /**
        * Get labels
        * @return labels
        **/
        @JsonProperty("labels")
        public Map<String, String> getLabels() {
            return labels;
        }

        /**
         * Set labels
         **/
        public void setLabels(Map<String, String> labels) {
            this.labels = labels;
        }

        public MetadataQueryParam labels(Map<String, String> labels) {
            this.labels = labels;
            return this;
        }
        public MetadataQueryParam putLabelsItem(String key, String labelsItem) {
            this.labels.put(key, labelsItem);
            return this;
        }

        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class MetadataQueryParam {\n");

            sb.append("    annotations: ").append(toIndentedString(annotations)).append("\n");
            sb.append("    labels: ").append(toIndentedString(labels)).append("\n");
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