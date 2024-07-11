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
  * SuspendTemplate is a template subtype to suspend a workflow at a predetermined point in time
 **/
public class SuspendTemplate  {

    /**
      * SuspendTemplate is a template subtype to suspend a workflow at a predetermined point in time
     **/
    private String duration;

    /**
    * Duration is the seconds to wait before automatically resuming a template. Must be a string. Default unit is seconds. Could also be a Duration, e.g.: \"2m\", \"6h\"
    * @return duration
    **/
    @JsonProperty("duration")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public String getDuration() {
        return duration;
    }

    /**
     * Set duration
     **/
    public void setDuration(String duration) {
        this.duration = duration;
    }

    public SuspendTemplate duration(String duration) {
        this.duration = duration;
        return this;
    }

    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SuspendTemplate {\n");

        sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
        
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
      * SuspendTemplate is a template subtype to suspend a workflow at a predetermined point in time
     **/
    public static class SuspendTemplateQueryParam  {

        /**
          * SuspendTemplate is a template subtype to suspend a workflow at a predetermined point in time
         **/
        @jakarta.ws.rs.QueryParam("duration")
        private String duration;

        /**
        * Duration is the seconds to wait before automatically resuming a template. Must be a string. Default unit is seconds. Could also be a Duration, e.g.: \"2m\", \"6h\"
        * @return duration
        **/
        @JsonProperty("duration")
        public String getDuration() {
            return duration;
        }

        /**
         * Set duration
         **/
        public void setDuration(String duration) {
            this.duration = duration;
        }

        public SuspendTemplateQueryParam duration(String duration) {
            this.duration = duration;
            return this;
        }

        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class SuspendTemplateQueryParam {\n");

            sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
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