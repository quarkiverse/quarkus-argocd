package io.quarkiverse.argocd.events.v1alpha1;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.Type;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class CalendarEventSource  {

    private List<String> exclusionDates;
    private EventSourceFilter filter;
    private String interval;
    private Map<String, String> metadata;
    private EventPersistence persistence;
    private String schedule;
    private String timezone;

    /**
    * ExclusionDates defines the list of DATE-TIME exceptions for recurring events.
    * @return exclusionDates
    **/
    @JsonProperty("exclusionDates")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public List<String> getExclusionDates() {
        return exclusionDates;
    }

    /**
     * Set exclusionDates
     **/
    public void setExclusionDates(List<String> exclusionDates) {
        this.exclusionDates = exclusionDates;
    }

    public CalendarEventSource exclusionDates(List<String> exclusionDates) {
        this.exclusionDates = exclusionDates;
        return this;
    }
    public CalendarEventSource addExclusionDatesItem(String exclusionDatesItem) {
        if (this.exclusionDates == null){
            exclusionDates = new ArrayList<>();
        }
        this.exclusionDates.add(exclusionDatesItem);
        return this;
    }

    /**
    * Get filter
    * @return filter
    **/
    @JsonProperty("filter")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public EventSourceFilter getFilter() {
        return filter;
    }

    /**
     * Set filter
     **/
    public void setFilter(EventSourceFilter filter) {
        this.filter = filter;
    }

    public CalendarEventSource filter(EventSourceFilter filter) {
        this.filter = filter;
        return this;
    }

    /**
    * Get interval
    * @return interval
    **/
    @JsonProperty("interval")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public String getInterval() {
        return interval;
    }

    /**
     * Set interval
     **/
    public void setInterval(String interval) {
        this.interval = interval;
    }

    public CalendarEventSource interval(String interval) {
        this.interval = interval;
        return this;
    }

    /**
    * Get metadata
    * @return metadata
    **/
    @JsonProperty("metadata")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public Map<String, String> getMetadata() {
        return metadata;
    }

    /**
     * Set metadata
     **/
    public void setMetadata(Map<String, String> metadata) {
        this.metadata = metadata;
    }

    public CalendarEventSource metadata(Map<String, String> metadata) {
        this.metadata = metadata;
        return this;
    }
    public CalendarEventSource putMetadataItem(String key, String metadataItem) {
           if (this.metadata == null){
                metadata = new HashMap<>();
            }
        this.metadata.put(key, metadataItem);
        return this;
    }

    /**
    * Get persistence
    * @return persistence
    **/
    @JsonProperty("persistence")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public EventPersistence getPersistence() {
        return persistence;
    }

    /**
     * Set persistence
     **/
    public void setPersistence(EventPersistence persistence) {
        this.persistence = persistence;
    }

    public CalendarEventSource persistence(EventPersistence persistence) {
        this.persistence = persistence;
        return this;
    }

    /**
    * Get schedule
    * @return schedule
    **/
    @JsonProperty("schedule")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public String getSchedule() {
        return schedule;
    }

    /**
     * Set schedule
     **/
    public void setSchedule(String schedule) {
        this.schedule = schedule;
    }

    public CalendarEventSource schedule(String schedule) {
        this.schedule = schedule;
        return this;
    }

    /**
    * Get timezone
    * @return timezone
    **/
    @JsonProperty("timezone")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public String getTimezone() {
        return timezone;
    }

    /**
     * Set timezone
     **/
    public void setTimezone(String timezone) {
        this.timezone = timezone;
    }

    public CalendarEventSource timezone(String timezone) {
        this.timezone = timezone;
        return this;
    }

    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CalendarEventSource {\n");

        sb.append("    exclusionDates: ").append(toIndentedString(exclusionDates)).append("\n");
        sb.append("    filter: ").append(toIndentedString(filter)).append("\n");
        sb.append("    interval: ").append(toIndentedString(interval)).append("\n");
        sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
        sb.append("    persistence: ").append(toIndentedString(persistence)).append("\n");
        sb.append("    schedule: ").append(toIndentedString(schedule)).append("\n");
        sb.append("    timezone: ").append(toIndentedString(timezone)).append("\n");
        
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
    public static class CalendarEventSourceQueryParam  {

        @jakarta.ws.rs.QueryParam("exclusionDates")
        private List<String> exclusionDates = null;
        @jakarta.ws.rs.QueryParam("filter")
        private EventSourceFilter filter;
        @jakarta.ws.rs.QueryParam("interval")
        private String interval;
        @jakarta.ws.rs.QueryParam("metadata")
        private Map<String, String> metadata = null;
        @jakarta.ws.rs.QueryParam("persistence")
        private EventPersistence persistence;
        @jakarta.ws.rs.QueryParam("schedule")
        private String schedule;
        @jakarta.ws.rs.QueryParam("timezone")
        private String timezone;

        /**
        * ExclusionDates defines the list of DATE-TIME exceptions for recurring events.
        * @return exclusionDates
        **/
        @JsonProperty("exclusionDates")
        public List<String> getExclusionDates() {
            return exclusionDates;
        }

        /**
         * Set exclusionDates
         **/
        public void setExclusionDates(List<String> exclusionDates) {
            this.exclusionDates = exclusionDates;
        }

        public CalendarEventSourceQueryParam exclusionDates(List<String> exclusionDates) {
            this.exclusionDates = exclusionDates;
            return this;
        }
        public CalendarEventSourceQueryParam addExclusionDatesItem(String exclusionDatesItem) {
            this.exclusionDates.add(exclusionDatesItem);
            return this;
        }

        /**
        * Get filter
        * @return filter
        **/
        @JsonProperty("filter")
        public EventSourceFilter getFilter() {
            return filter;
        }

        /**
         * Set filter
         **/
        public void setFilter(EventSourceFilter filter) {
            this.filter = filter;
        }

        public CalendarEventSourceQueryParam filter(EventSourceFilter filter) {
            this.filter = filter;
            return this;
        }

        /**
        * Get interval
        * @return interval
        **/
        @JsonProperty("interval")
        public String getInterval() {
            return interval;
        }

        /**
         * Set interval
         **/
        public void setInterval(String interval) {
            this.interval = interval;
        }

        public CalendarEventSourceQueryParam interval(String interval) {
            this.interval = interval;
            return this;
        }

        /**
        * Get metadata
        * @return metadata
        **/
        @JsonProperty("metadata")
        public Map<String, String> getMetadata() {
            return metadata;
        }

        /**
         * Set metadata
         **/
        public void setMetadata(Map<String, String> metadata) {
            this.metadata = metadata;
        }

        public CalendarEventSourceQueryParam metadata(Map<String, String> metadata) {
            this.metadata = metadata;
            return this;
        }
        public CalendarEventSourceQueryParam putMetadataItem(String key, String metadataItem) {
            this.metadata.put(key, metadataItem);
            return this;
        }

        /**
        * Get persistence
        * @return persistence
        **/
        @JsonProperty("persistence")
        public EventPersistence getPersistence() {
            return persistence;
        }

        /**
         * Set persistence
         **/
        public void setPersistence(EventPersistence persistence) {
            this.persistence = persistence;
        }

        public CalendarEventSourceQueryParam persistence(EventPersistence persistence) {
            this.persistence = persistence;
            return this;
        }

        /**
        * Get schedule
        * @return schedule
        **/
        @JsonProperty("schedule")
        public String getSchedule() {
            return schedule;
        }

        /**
         * Set schedule
         **/
        public void setSchedule(String schedule) {
            this.schedule = schedule;
        }

        public CalendarEventSourceQueryParam schedule(String schedule) {
            this.schedule = schedule;
            return this;
        }

        /**
        * Get timezone
        * @return timezone
        **/
        @JsonProperty("timezone")
        public String getTimezone() {
            return timezone;
        }

        /**
         * Set timezone
         **/
        public void setTimezone(String timezone) {
            this.timezone = timezone;
        }

        public CalendarEventSourceQueryParam timezone(String timezone) {
            this.timezone = timezone;
            return this;
        }

        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class CalendarEventSourceQueryParam {\n");

            sb.append("    exclusionDates: ").append(toIndentedString(exclusionDates)).append("\n");
            sb.append("    filter: ").append(toIndentedString(filter)).append("\n");
            sb.append("    interval: ").append(toIndentedString(interval)).append("\n");
            sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
            sb.append("    persistence: ").append(toIndentedString(persistence)).append("\n");
            sb.append("    schedule: ").append(toIndentedString(schedule)).append("\n");
            sb.append("    timezone: ").append(toIndentedString(timezone)).append("\n");
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
