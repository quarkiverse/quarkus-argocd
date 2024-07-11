package io.quarkiverse.argocd.events.v1alpha1;

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
public class K8SResourcePolicy  {

    private Backoff backoff;
    private Boolean errorOnBackoffTimeout;
    private Map<String, String> labels;

    /**
    * Get backoff
    * @return backoff
    **/
    @JsonProperty("backoff")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public Backoff getBackoff() {
        return backoff;
    }

    /**
     * Set backoff
     **/
    public void setBackoff(Backoff backoff) {
        this.backoff = backoff;
    }

    public K8SResourcePolicy backoff(Backoff backoff) {
        this.backoff = backoff;
        return this;
    }

    /**
    * Get errorOnBackoffTimeout
    * @return errorOnBackoffTimeout
    **/
    @JsonProperty("errorOnBackoffTimeout")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public Boolean getErrorOnBackoffTimeout() {
        return errorOnBackoffTimeout;
    }

    /**
     * Set errorOnBackoffTimeout
     **/
    public void setErrorOnBackoffTimeout(Boolean errorOnBackoffTimeout) {
        this.errorOnBackoffTimeout = errorOnBackoffTimeout;
    }

    public K8SResourcePolicy errorOnBackoffTimeout(Boolean errorOnBackoffTimeout) {
        this.errorOnBackoffTimeout = errorOnBackoffTimeout;
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

    public K8SResourcePolicy labels(Map<String, String> labels) {
        this.labels = labels;
        return this;
    }
    public K8SResourcePolicy putLabelsItem(String key, String labelsItem) {
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
        sb.append("class K8SResourcePolicy {\n");

        sb.append("    backoff: ").append(toIndentedString(backoff)).append("\n");
        sb.append("    errorOnBackoffTimeout: ").append(toIndentedString(errorOnBackoffTimeout)).append("\n");
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
    public static class K8SResourcePolicyQueryParam  {

        @jakarta.ws.rs.QueryParam("backoff")
        private Backoff backoff;
        @jakarta.ws.rs.QueryParam("errorOnBackoffTimeout")
        private Boolean errorOnBackoffTimeout;
        @jakarta.ws.rs.QueryParam("labels")
        private Map<String, String> labels = null;

        /**
        * Get backoff
        * @return backoff
        **/
        @JsonProperty("backoff")
        public Backoff getBackoff() {
            return backoff;
        }

        /**
         * Set backoff
         **/
        public void setBackoff(Backoff backoff) {
            this.backoff = backoff;
        }

        public K8SResourcePolicyQueryParam backoff(Backoff backoff) {
            this.backoff = backoff;
            return this;
        }

        /**
        * Get errorOnBackoffTimeout
        * @return errorOnBackoffTimeout
        **/
        @JsonProperty("errorOnBackoffTimeout")
        public Boolean getErrorOnBackoffTimeout() {
            return errorOnBackoffTimeout;
        }

        /**
         * Set errorOnBackoffTimeout
         **/
        public void setErrorOnBackoffTimeout(Boolean errorOnBackoffTimeout) {
            this.errorOnBackoffTimeout = errorOnBackoffTimeout;
        }

        public K8SResourcePolicyQueryParam errorOnBackoffTimeout(Boolean errorOnBackoffTimeout) {
            this.errorOnBackoffTimeout = errorOnBackoffTimeout;
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

        public K8SResourcePolicyQueryParam labels(Map<String, String> labels) {
            this.labels = labels;
            return this;
        }
        public K8SResourcePolicyQueryParam putLabelsItem(String key, String labelsItem) {
            this.labels.put(key, labelsItem);
            return this;
        }

        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class K8SResourcePolicyQueryParam {\n");

            sb.append("    backoff: ").append(toIndentedString(backoff)).append("\n");
            sb.append("    errorOnBackoffTimeout: ").append(toIndentedString(errorOnBackoffTimeout)).append("\n");
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
