package io.quarkiverse.argocd.events.v1alpha1;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.Type;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class EventDependency  {

    private String eventName;
    private String eventSourceName;
    private EventDependencyFilter filters;
    private String filtersLogicalOperator;
    private String name;
    private EventDependencyTransformer transform;

    /**
    * Get eventName
    * @return eventName
    **/
    @JsonProperty("eventName")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public String getEventName() {
        return eventName;
    }

    /**
     * Set eventName
     **/
    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public EventDependency eventName(String eventName) {
        this.eventName = eventName;
        return this;
    }

    /**
    * Get eventSourceName
    * @return eventSourceName
    **/
    @JsonProperty("eventSourceName")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public String getEventSourceName() {
        return eventSourceName;
    }

    /**
     * Set eventSourceName
     **/
    public void setEventSourceName(String eventSourceName) {
        this.eventSourceName = eventSourceName;
    }

    public EventDependency eventSourceName(String eventSourceName) {
        this.eventSourceName = eventSourceName;
        return this;
    }

    /**
    * Get filters
    * @return filters
    **/
    @JsonProperty("filters")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public EventDependencyFilter getFilters() {
        return filters;
    }

    /**
     * Set filters
     **/
    public void setFilters(EventDependencyFilter filters) {
        this.filters = filters;
    }

    public EventDependency filters(EventDependencyFilter filters) {
        this.filters = filters;
        return this;
    }

    /**
    * FiltersLogicalOperator defines how different filters are evaluated together. Available values: and (&&), or (||) Is optional and if left blank treated as and (&&).
    * @return filtersLogicalOperator
    **/
    @JsonProperty("filtersLogicalOperator")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public String getFiltersLogicalOperator() {
        return filtersLogicalOperator;
    }

    /**
     * Set filtersLogicalOperator
     **/
    public void setFiltersLogicalOperator(String filtersLogicalOperator) {
        this.filtersLogicalOperator = filtersLogicalOperator;
    }

    public EventDependency filtersLogicalOperator(String filtersLogicalOperator) {
        this.filtersLogicalOperator = filtersLogicalOperator;
        return this;
    }

    /**
    * Get name
    * @return name
    **/
    @JsonProperty("name")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public String getName() {
        return name;
    }

    /**
     * Set name
     **/
    public void setName(String name) {
        this.name = name;
    }

    public EventDependency name(String name) {
        this.name = name;
        return this;
    }

    /**
    * Get transform
    * @return transform
    **/
    @JsonProperty("transform")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public EventDependencyTransformer getTransform() {
        return transform;
    }

    /**
     * Set transform
     **/
    public void setTransform(EventDependencyTransformer transform) {
        this.transform = transform;
    }

    public EventDependency transform(EventDependencyTransformer transform) {
        this.transform = transform;
        return this;
    }

    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class EventDependency {\n");

        sb.append("    eventName: ").append(toIndentedString(eventName)).append("\n");
        sb.append("    eventSourceName: ").append(toIndentedString(eventSourceName)).append("\n");
        sb.append("    filters: ").append(toIndentedString(filters)).append("\n");
        sb.append("    filtersLogicalOperator: ").append(toIndentedString(filtersLogicalOperator)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    transform: ").append(toIndentedString(transform)).append("\n");
        
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
    public static class EventDependencyQueryParam  {

        @jakarta.ws.rs.QueryParam("eventName")
        private String eventName;
        @jakarta.ws.rs.QueryParam("eventSourceName")
        private String eventSourceName;
        @jakarta.ws.rs.QueryParam("filters")
        private EventDependencyFilter filters;
        @jakarta.ws.rs.QueryParam("filtersLogicalOperator")
        private String filtersLogicalOperator;
        @jakarta.ws.rs.QueryParam("name")
        private String name;
        @jakarta.ws.rs.QueryParam("transform")
        private EventDependencyTransformer transform;

        /**
        * Get eventName
        * @return eventName
        **/
        @JsonProperty("eventName")
        public String getEventName() {
            return eventName;
        }

        /**
         * Set eventName
         **/
        public void setEventName(String eventName) {
            this.eventName = eventName;
        }

        public EventDependencyQueryParam eventName(String eventName) {
            this.eventName = eventName;
            return this;
        }

        /**
        * Get eventSourceName
        * @return eventSourceName
        **/
        @JsonProperty("eventSourceName")
        public String getEventSourceName() {
            return eventSourceName;
        }

        /**
         * Set eventSourceName
         **/
        public void setEventSourceName(String eventSourceName) {
            this.eventSourceName = eventSourceName;
        }

        public EventDependencyQueryParam eventSourceName(String eventSourceName) {
            this.eventSourceName = eventSourceName;
            return this;
        }

        /**
        * Get filters
        * @return filters
        **/
        @JsonProperty("filters")
        public EventDependencyFilter getFilters() {
            return filters;
        }

        /**
         * Set filters
         **/
        public void setFilters(EventDependencyFilter filters) {
            this.filters = filters;
        }

        public EventDependencyQueryParam filters(EventDependencyFilter filters) {
            this.filters = filters;
            return this;
        }

        /**
        * FiltersLogicalOperator defines how different filters are evaluated together. Available values: and (&&), or (||) Is optional and if left blank treated as and (&&).
        * @return filtersLogicalOperator
        **/
        @JsonProperty("filtersLogicalOperator")
        public String getFiltersLogicalOperator() {
            return filtersLogicalOperator;
        }

        /**
         * Set filtersLogicalOperator
         **/
        public void setFiltersLogicalOperator(String filtersLogicalOperator) {
            this.filtersLogicalOperator = filtersLogicalOperator;
        }

        public EventDependencyQueryParam filtersLogicalOperator(String filtersLogicalOperator) {
            this.filtersLogicalOperator = filtersLogicalOperator;
            return this;
        }

        /**
        * Get name
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

        public EventDependencyQueryParam name(String name) {
            this.name = name;
            return this;
        }

        /**
        * Get transform
        * @return transform
        **/
        @JsonProperty("transform")
        public EventDependencyTransformer getTransform() {
            return transform;
        }

        /**
         * Set transform
         **/
        public void setTransform(EventDependencyTransformer transform) {
            this.transform = transform;
        }

        public EventDependencyQueryParam transform(EventDependencyTransformer transform) {
            this.transform = transform;
            return this;
        }

        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class EventDependencyQueryParam {\n");

            sb.append("    eventName: ").append(toIndentedString(eventName)).append("\n");
            sb.append("    eventSourceName: ").append(toIndentedString(eventSourceName)).append("\n");
            sb.append("    filters: ").append(toIndentedString(filters)).append("\n");
            sb.append("    filtersLogicalOperator: ").append(toIndentedString(filtersLogicalOperator)).append("\n");
            sb.append("    name: ").append(toIndentedString(name)).append("\n");
            sb.append("    transform: ").append(toIndentedString(transform)).append("\n");
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
