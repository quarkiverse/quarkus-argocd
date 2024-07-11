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
public class WorkflowEventBindingSpec  {

    private Event event;
    private Submit submit;

    /**
    * Get event
    * @return event
    **/
    @JsonProperty("event")
    public Event getEvent() {
        return event;
    }

    /**
     * Set event
     **/
    public void setEvent(Event event) {
        this.event = event;
    }

    public WorkflowEventBindingSpec event(Event event) {
        this.event = event;
        return this;
    }

    /**
    * Get submit
    * @return submit
    **/
    @JsonProperty("submit")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public Submit getSubmit() {
        return submit;
    }

    /**
     * Set submit
     **/
    public void setSubmit(Submit submit) {
        this.submit = submit;
    }

    public WorkflowEventBindingSpec submit(Submit submit) {
        this.submit = submit;
        return this;
    }

    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class WorkflowEventBindingSpec {\n");

        sb.append("    event: ").append(toIndentedString(event)).append("\n");
        sb.append("    submit: ").append(toIndentedString(submit)).append("\n");
        
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
    public static class WorkflowEventBindingSpecQueryParam  {

        @jakarta.ws.rs.QueryParam("event")
        private Event event;
        @jakarta.ws.rs.QueryParam("submit")
        private Submit submit;

        /**
        * Get event
        * @return event
        **/
        @JsonProperty("event")
        public Event getEvent() {
            return event;
        }

        /**
         * Set event
         **/
        public void setEvent(Event event) {
            this.event = event;
        }

        public WorkflowEventBindingSpecQueryParam event(Event event) {
            this.event = event;
            return this;
        }

        /**
        * Get submit
        * @return submit
        **/
        @JsonProperty("submit")
        public Submit getSubmit() {
            return submit;
        }

        /**
         * Set submit
         **/
        public void setSubmit(Submit submit) {
            this.submit = submit;
        }

        public WorkflowEventBindingSpecQueryParam submit(Submit submit) {
            this.submit = submit;
            return this;
        }

        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class WorkflowEventBindingSpecQueryParam {\n");

            sb.append("    event: ").append(toIndentedString(event)).append("\n");
            sb.append("    submit: ").append(toIndentedString(submit)).append("\n");
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
