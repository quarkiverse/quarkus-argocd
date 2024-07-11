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
  * Sequence expands a workflow step into numeric range
 **/
public class Sequence  {

    /**
      * Sequence expands a workflow step into numeric range
     **/
    private String count;
    /**
      * Sequence expands a workflow step into numeric range
     **/
    private String end;
    /**
      * Sequence expands a workflow step into numeric range
     **/
    private String format;
    /**
      * Sequence expands a workflow step into numeric range
     **/
    private String start;

    /**
    * Get count
    * @return count
    **/
    @JsonProperty("count")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public String getCount() {
        return count;
    }

    /**
     * Set count
     **/
    public void setCount(String count) {
        this.count = count;
    }

    public Sequence count(String count) {
        this.count = count;
        return this;
    }

    /**
    * Get end
    * @return end
    **/
    @JsonProperty("end")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public String getEnd() {
        return end;
    }

    /**
     * Set end
     **/
    public void setEnd(String end) {
        this.end = end;
    }

    public Sequence end(String end) {
        this.end = end;
        return this;
    }

    /**
    * Format is a printf format string to format the value in the sequence
    * @return format
    **/
    @JsonProperty("format")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public String getFormat() {
        return format;
    }

    /**
     * Set format
     **/
    public void setFormat(String format) {
        this.format = format;
    }

    public Sequence format(String format) {
        this.format = format;
        return this;
    }

    /**
    * Get start
    * @return start
    **/
    @JsonProperty("start")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public String getStart() {
        return start;
    }

    /**
     * Set start
     **/
    public void setStart(String start) {
        this.start = start;
    }

    public Sequence start(String start) {
        this.start = start;
        return this;
    }

    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Sequence {\n");

        sb.append("    count: ").append(toIndentedString(count)).append("\n");
        sb.append("    end: ").append(toIndentedString(end)).append("\n");
        sb.append("    format: ").append(toIndentedString(format)).append("\n");
        sb.append("    start: ").append(toIndentedString(start)).append("\n");
        
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
      * Sequence expands a workflow step into numeric range
     **/
    public static class SequenceQueryParam  {

        /**
          * Sequence expands a workflow step into numeric range
         **/
        @jakarta.ws.rs.QueryParam("count")
        private String count;
        /**
          * Sequence expands a workflow step into numeric range
         **/
        @jakarta.ws.rs.QueryParam("end")
        private String end;
        /**
          * Sequence expands a workflow step into numeric range
         **/
        @jakarta.ws.rs.QueryParam("format")
        private String format;
        /**
          * Sequence expands a workflow step into numeric range
         **/
        @jakarta.ws.rs.QueryParam("start")
        private String start;

        /**
        * Get count
        * @return count
        **/
        @JsonProperty("count")
        public String getCount() {
            return count;
        }

        /**
         * Set count
         **/
        public void setCount(String count) {
            this.count = count;
        }

        public SequenceQueryParam count(String count) {
            this.count = count;
            return this;
        }

        /**
        * Get end
        * @return end
        **/
        @JsonProperty("end")
        public String getEnd() {
            return end;
        }

        /**
         * Set end
         **/
        public void setEnd(String end) {
            this.end = end;
        }

        public SequenceQueryParam end(String end) {
            this.end = end;
            return this;
        }

        /**
        * Format is a printf format string to format the value in the sequence
        * @return format
        **/
        @JsonProperty("format")
        public String getFormat() {
            return format;
        }

        /**
         * Set format
         **/
        public void setFormat(String format) {
            this.format = format;
        }

        public SequenceQueryParam format(String format) {
            this.format = format;
            return this;
        }

        /**
        * Get start
        * @return start
        **/
        @JsonProperty("start")
        public String getStart() {
            return start;
        }

        /**
         * Set start
         **/
        public void setStart(String start) {
            this.start = start;
        }

        public SequenceQueryParam start(String start) {
            this.start = start;
            return this;
        }

        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class SequenceQueryParam {\n");

            sb.append("    count: ").append(toIndentedString(count)).append("\n");
            sb.append("    end: ").append(toIndentedString(end)).append("\n");
            sb.append("    format: ").append(toIndentedString(format)).append("\n");
            sb.append("    start: ").append(toIndentedString(start)).append("\n");
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