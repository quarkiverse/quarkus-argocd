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
public class Event  {

    private String selector;

    /**
    * Selector (https://github.com/expr-lang/expr) that we must must match the io.argoproj.workflow.v1alpha1. E.g. `payload.message == \"test\"`
    * @return selector
    **/
    @JsonProperty("selector")
    public String getSelector() {
        return selector;
    }

    /**
     * Set selector
     **/
    public void setSelector(String selector) {
        this.selector = selector;
    }

    public Event selector(String selector) {
        this.selector = selector;
        return this;
    }

    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Event {\n");

        sb.append("    selector: ").append(toIndentedString(selector)).append("\n");
        
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
    public static class EventQueryParam  {

        @jakarta.ws.rs.QueryParam("selector")
        private String selector;

        /**
        * Selector (https://github.com/expr-lang/expr) that we must must match the io.argoproj.workflow.v1alpha1. E.g. `payload.message == \"test\"`
        * @return selector
        **/
        @JsonProperty("selector")
        public String getSelector() {
            return selector;
        }

        /**
         * Set selector
         **/
        public void setSelector(String selector) {
            this.selector = selector;
        }

        public EventQueryParam selector(String selector) {
            this.selector = selector;
            return this;
        }

        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class EventQueryParam {\n");

            sb.append("    selector: ").append(toIndentedString(selector)).append("\n");
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