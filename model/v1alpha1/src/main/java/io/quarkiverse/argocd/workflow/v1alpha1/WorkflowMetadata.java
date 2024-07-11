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
public class WorkflowMetadata  {

    private Map<String, String> annotations;
    private Map<String, String> labels;
    private Map<String, LabelValueFrom> labelsFrom;

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

    public WorkflowMetadata annotations(Map<String, String> annotations) {
        this.annotations = annotations;
        return this;
    }
    public WorkflowMetadata putAnnotationsItem(String key, String annotationsItem) {
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

    public WorkflowMetadata labels(Map<String, String> labels) {
        this.labels = labels;
        return this;
    }
    public WorkflowMetadata putLabelsItem(String key, String labelsItem) {
           if (this.labels == null){
                labels = new HashMap<>();
            }
        this.labels.put(key, labelsItem);
        return this;
    }

    /**
    * Get labelsFrom
    * @return labelsFrom
    **/
    @JsonProperty("labelsFrom")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public Map<String, LabelValueFrom> getLabelsFrom() {
        return labelsFrom;
    }

    /**
     * Set labelsFrom
     **/
    public void setLabelsFrom(Map<String, LabelValueFrom> labelsFrom) {
        this.labelsFrom = labelsFrom;
    }

    public WorkflowMetadata labelsFrom(Map<String, LabelValueFrom> labelsFrom) {
        this.labelsFrom = labelsFrom;
        return this;
    }
    public WorkflowMetadata putLabelsFromItem(String key, LabelValueFrom labelsFromItem) {
           if (this.labelsFrom == null){
                labelsFrom = new HashMap<>();
            }
        this.labelsFrom.put(key, labelsFromItem);
        return this;
    }

    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class WorkflowMetadata {\n");

        sb.append("    annotations: ").append(toIndentedString(annotations)).append("\n");
        sb.append("    labels: ").append(toIndentedString(labels)).append("\n");
        sb.append("    labelsFrom: ").append(toIndentedString(labelsFrom)).append("\n");
        
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
    public static class WorkflowMetadataQueryParam  {

        @jakarta.ws.rs.QueryParam("annotations")
        private Map<String, String> annotations = null;
        @jakarta.ws.rs.QueryParam("labels")
        private Map<String, String> labels = null;
        @jakarta.ws.rs.QueryParam("labelsFrom")
        private Map<String, LabelValueFrom> labelsFrom = null;

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

        public WorkflowMetadataQueryParam annotations(Map<String, String> annotations) {
            this.annotations = annotations;
            return this;
        }
        public WorkflowMetadataQueryParam putAnnotationsItem(String key, String annotationsItem) {
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

        public WorkflowMetadataQueryParam labels(Map<String, String> labels) {
            this.labels = labels;
            return this;
        }
        public WorkflowMetadataQueryParam putLabelsItem(String key, String labelsItem) {
            this.labels.put(key, labelsItem);
            return this;
        }

        /**
        * Get labelsFrom
        * @return labelsFrom
        **/
        @JsonProperty("labelsFrom")
        public Map<String, LabelValueFrom> getLabelsFrom() {
            return labelsFrom;
        }

        /**
         * Set labelsFrom
         **/
        public void setLabelsFrom(Map<String, LabelValueFrom> labelsFrom) {
            this.labelsFrom = labelsFrom;
        }

        public WorkflowMetadataQueryParam labelsFrom(Map<String, LabelValueFrom> labelsFrom) {
            this.labelsFrom = labelsFrom;
            return this;
        }
        public WorkflowMetadataQueryParam putLabelsFromItem(String key, LabelValueFrom labelsFromItem) {
            this.labelsFrom.put(key, labelsFromItem);
            return this;
        }

        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class WorkflowMetadataQueryParam {\n");

            sb.append("    annotations: ").append(toIndentedString(annotations)).append("\n");
            sb.append("    labels: ").append(toIndentedString(labels)).append("\n");
            sb.append("    labelsFrom: ").append(toIndentedString(labelsFrom)).append("\n");
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
