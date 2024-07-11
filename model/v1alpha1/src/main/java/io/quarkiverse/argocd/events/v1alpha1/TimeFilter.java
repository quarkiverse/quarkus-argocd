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
/**
  * TimeFilter describes a window in time. It filters out events that occur outside the time limits. In other words, only events that occur after Start and before Stop will pass this filter.
 **/
public class TimeFilter  {

    /**
      * TimeFilter describes a window in time. It filters out events that occur outside the time limits. In other words, only events that occur after Start and before Stop will pass this filter.
     **/
    private String start;
    /**
      * TimeFilter describes a window in time. It filters out events that occur outside the time limits. In other words, only events that occur after Start and before Stop will pass this filter.
     **/
    private String stop;

    /**
    * Start is the beginning of a time window in UTC. Before this time, events for this dependency are ignored. Format is hh:mm:ss.
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

    public TimeFilter start(String start) {
        this.start = start;
        return this;
    }

    /**
    * Stop is the end of a time window in UTC. After or equal to this time, events for this dependency are ignored and Format is hh:mm:ss. If it is smaller than Start, it is treated as next day of Start (e.g.: 22:00:00-01:00:00 means 22:00:00-25:00:00).
    * @return stop
    **/
    @JsonProperty("stop")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public String getStop() {
        return stop;
    }

    /**
     * Set stop
     **/
    public void setStop(String stop) {
        this.stop = stop;
    }

    public TimeFilter stop(String stop) {
        this.stop = stop;
        return this;
    }

    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TimeFilter {\n");

        sb.append("    start: ").append(toIndentedString(start)).append("\n");
        sb.append("    stop: ").append(toIndentedString(stop)).append("\n");
        
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
      * TimeFilter describes a window in time. It filters out events that occur outside the time limits. In other words, only events that occur after Start and before Stop will pass this filter.
     **/
    public static class TimeFilterQueryParam  {

        /**
          * TimeFilter describes a window in time. It filters out events that occur outside the time limits. In other words, only events that occur after Start and before Stop will pass this filter.
         **/
        @jakarta.ws.rs.QueryParam("start")
        private String start;
        /**
          * TimeFilter describes a window in time. It filters out events that occur outside the time limits. In other words, only events that occur after Start and before Stop will pass this filter.
         **/
        @jakarta.ws.rs.QueryParam("stop")
        private String stop;

        /**
        * Start is the beginning of a time window in UTC. Before this time, events for this dependency are ignored. Format is hh:mm:ss.
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

        public TimeFilterQueryParam start(String start) {
            this.start = start;
            return this;
        }

        /**
        * Stop is the end of a time window in UTC. After or equal to this time, events for this dependency are ignored and Format is hh:mm:ss. If it is smaller than Start, it is treated as next day of Start (e.g.: 22:00:00-01:00:00 means 22:00:00-25:00:00).
        * @return stop
        **/
        @JsonProperty("stop")
        public String getStop() {
            return stop;
        }

        /**
         * Set stop
         **/
        public void setStop(String stop) {
            this.stop = stop;
        }

        public TimeFilterQueryParam stop(String stop) {
            this.stop = stop;
            return this;
        }

        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class TimeFilterQueryParam {\n");

            sb.append("    start: ").append(toIndentedString(start)).append("\n");
            sb.append("    stop: ").append(toIndentedString(stop)).append("\n");
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
