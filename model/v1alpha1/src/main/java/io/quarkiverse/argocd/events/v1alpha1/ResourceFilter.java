package io.quarkiverse.argocd.events.v1alpha1;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.Type;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ResourceFilter  {

    private Boolean afterStart;
    private OffsetDateTime createdBy;
    private List<Selector> fields;
    private List<Selector> labels;
    private String prefix;

    /**
    * Get afterStart
    * @return afterStart
    **/
    @JsonProperty("afterStart")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public Boolean getAfterStart() {
        return afterStart;
    }

    /**
     * Set afterStart
     **/
    public void setAfterStart(Boolean afterStart) {
        this.afterStart = afterStart;
    }

    public ResourceFilter afterStart(Boolean afterStart) {
        this.afterStart = afterStart;
        return this;
    }

    /**
    * Time is a wrapper around time.Time which supports correct marshaling to YAML and JSON.  Wrappers are provided for many of the factory methods that the time package offers.
    * @return createdBy
    **/
    @JsonProperty("createdBy")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public OffsetDateTime getCreatedBy() {
        return createdBy;
    }

    /**
     * Set createdBy
     **/
    public void setCreatedBy(OffsetDateTime createdBy) {
        this.createdBy = createdBy;
    }

    public ResourceFilter createdBy(OffsetDateTime createdBy) {
        this.createdBy = createdBy;
        return this;
    }

    /**
    * Get fields
    * @return fields
    **/
    @JsonProperty("fields")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public List<Selector> getFields() {
        return fields;
    }

    /**
     * Set fields
     **/
    public void setFields(List<Selector> fields) {
        this.fields = fields;
    }

    public ResourceFilter fields(List<Selector> fields) {
        this.fields = fields;
        return this;
    }
    public ResourceFilter addFieldsItem(Selector fieldsItem) {
        if (this.fields == null){
            fields = new ArrayList<>();
        }
        this.fields.add(fieldsItem);
        return this;
    }

    /**
    * Get labels
    * @return labels
    **/
    @JsonProperty("labels")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public List<Selector> getLabels() {
        return labels;
    }

    /**
     * Set labels
     **/
    public void setLabels(List<Selector> labels) {
        this.labels = labels;
    }

    public ResourceFilter labels(List<Selector> labels) {
        this.labels = labels;
        return this;
    }
    public ResourceFilter addLabelsItem(Selector labelsItem) {
        if (this.labels == null){
            labels = new ArrayList<>();
        }
        this.labels.add(labelsItem);
        return this;
    }

    /**
    * Get prefix
    * @return prefix
    **/
    @JsonProperty("prefix")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public String getPrefix() {
        return prefix;
    }

    /**
     * Set prefix
     **/
    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }

    public ResourceFilter prefix(String prefix) {
        this.prefix = prefix;
        return this;
    }

    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ResourceFilter {\n");

        sb.append("    afterStart: ").append(toIndentedString(afterStart)).append("\n");
        sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
        sb.append("    fields: ").append(toIndentedString(fields)).append("\n");
        sb.append("    labels: ").append(toIndentedString(labels)).append("\n");
        sb.append("    prefix: ").append(toIndentedString(prefix)).append("\n");
        
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
    public static class ResourceFilterQueryParam  {

        @jakarta.ws.rs.QueryParam("afterStart")
        private Boolean afterStart;
        @jakarta.ws.rs.QueryParam("createdBy")
        private OffsetDateTime createdBy;
        @jakarta.ws.rs.QueryParam("fields")
        private List<Selector> fields = null;
        @jakarta.ws.rs.QueryParam("labels")
        private List<Selector> labels = null;
        @jakarta.ws.rs.QueryParam("prefix")
        private String prefix;

        /**
        * Get afterStart
        * @return afterStart
        **/
        @JsonProperty("afterStart")
        public Boolean getAfterStart() {
            return afterStart;
        }

        /**
         * Set afterStart
         **/
        public void setAfterStart(Boolean afterStart) {
            this.afterStart = afterStart;
        }

        public ResourceFilterQueryParam afterStart(Boolean afterStart) {
            this.afterStart = afterStart;
            return this;
        }

        /**
        * Time is a wrapper around time.Time which supports correct marshaling to YAML and JSON.  Wrappers are provided for many of the factory methods that the time package offers.
        * @return createdBy
        **/
        @JsonProperty("createdBy")
        public OffsetDateTime getCreatedBy() {
            return createdBy;
        }

        /**
         * Set createdBy
         **/
        public void setCreatedBy(OffsetDateTime createdBy) {
            this.createdBy = createdBy;
        }

        public ResourceFilterQueryParam createdBy(OffsetDateTime createdBy) {
            this.createdBy = createdBy;
            return this;
        }

        /**
        * Get fields
        * @return fields
        **/
        @JsonProperty("fields")
        public List<Selector> getFields() {
            return fields;
        }

        /**
         * Set fields
         **/
        public void setFields(List<Selector> fields) {
            this.fields = fields;
        }

        public ResourceFilterQueryParam fields(List<Selector> fields) {
            this.fields = fields;
            return this;
        }
        public ResourceFilterQueryParam addFieldsItem(Selector fieldsItem) {
            this.fields.add(fieldsItem);
            return this;
        }

        /**
        * Get labels
        * @return labels
        **/
        @JsonProperty("labels")
        public List<Selector> getLabels() {
            return labels;
        }

        /**
         * Set labels
         **/
        public void setLabels(List<Selector> labels) {
            this.labels = labels;
        }

        public ResourceFilterQueryParam labels(List<Selector> labels) {
            this.labels = labels;
            return this;
        }
        public ResourceFilterQueryParam addLabelsItem(Selector labelsItem) {
            this.labels.add(labelsItem);
            return this;
        }

        /**
        * Get prefix
        * @return prefix
        **/
        @JsonProperty("prefix")
        public String getPrefix() {
            return prefix;
        }

        /**
         * Set prefix
         **/
        public void setPrefix(String prefix) {
            this.prefix = prefix;
        }

        public ResourceFilterQueryParam prefix(String prefix) {
            this.prefix = prefix;
            return this;
        }

        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class ResourceFilterQueryParam {\n");

            sb.append("    afterStart: ").append(toIndentedString(afterStart)).append("\n");
            sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
            sb.append("    fields: ").append(toIndentedString(fields)).append("\n");
            sb.append("    labels: ").append(toIndentedString(labels)).append("\n");
            sb.append("    prefix: ").append(toIndentedString(prefix)).append("\n");
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
