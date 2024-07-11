package io.quarkiverse.argocd.events.v1alpha1;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.quarkiverse.argocd.v1alpha1.model.Amount;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.Type;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Backoff  {

    private Int64OrString duration;
    private Amount factor;
    private Amount jitter;
    private Integer steps;

    /**
    * Get duration
    * @return duration
    **/
    @JsonProperty("duration")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public Int64OrString getDuration() {
        return duration;
    }

    /**
     * Set duration
     **/
    public void setDuration(Int64OrString duration) {
        this.duration = duration;
    }

    public Backoff duration(Int64OrString duration) {
        this.duration = duration;
        return this;
    }

    /**
    * Get factor
    * @return factor
    **/
    @JsonProperty("factor")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public Amount getFactor() {
        return factor;
    }

    /**
     * Set factor
     **/
    public void setFactor(Amount factor) {
        this.factor = factor;
    }

    public Backoff factor(Amount factor) {
        this.factor = factor;
        return this;
    }

    /**
    * Get jitter
    * @return jitter
    **/
    @JsonProperty("jitter")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public Amount getJitter() {
        return jitter;
    }

    /**
     * Set jitter
     **/
    public void setJitter(Amount jitter) {
        this.jitter = jitter;
    }

    public Backoff jitter(Amount jitter) {
        this.jitter = jitter;
        return this;
    }

    /**
    * Get steps
    * @return steps
    **/
    @JsonProperty("steps")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public Integer getSteps() {
        return steps;
    }

    /**
     * Set steps
     **/
    public void setSteps(Integer steps) {
        this.steps = steps;
    }

    public Backoff steps(Integer steps) {
        this.steps = steps;
        return this;
    }

    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Backoff {\n");

        sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
        sb.append("    factor: ").append(toIndentedString(factor)).append("\n");
        sb.append("    jitter: ").append(toIndentedString(jitter)).append("\n");
        sb.append("    steps: ").append(toIndentedString(steps)).append("\n");
        
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
    public static class BackoffQueryParam  {

        @jakarta.ws.rs.QueryParam("duration")
        private Int64OrString duration;
        @jakarta.ws.rs.QueryParam("factor")
        private Amount factor;
        @jakarta.ws.rs.QueryParam("jitter")
        private Amount jitter;
        @jakarta.ws.rs.QueryParam("steps")
        private Integer steps;

        /**
        * Get duration
        * @return duration
        **/
        @JsonProperty("duration")
        public Int64OrString getDuration() {
            return duration;
        }

        /**
         * Set duration
         **/
        public void setDuration(Int64OrString duration) {
            this.duration = duration;
        }

        public BackoffQueryParam duration(Int64OrString duration) {
            this.duration = duration;
            return this;
        }

        /**
        * Get factor
        * @return factor
        **/
        @JsonProperty("factor")
        public Amount getFactor() {
            return factor;
        }

        /**
         * Set factor
         **/
        public void setFactor(Amount factor) {
            this.factor = factor;
        }

        public BackoffQueryParam factor(Amount factor) {
            this.factor = factor;
            return this;
        }

        /**
        * Get jitter
        * @return jitter
        **/
        @JsonProperty("jitter")
        public Amount getJitter() {
            return jitter;
        }

        /**
         * Set jitter
         **/
        public void setJitter(Amount jitter) {
            this.jitter = jitter;
        }

        public BackoffQueryParam jitter(Amount jitter) {
            this.jitter = jitter;
            return this;
        }

        /**
        * Get steps
        * @return steps
        **/
        @JsonProperty("steps")
        public Integer getSteps() {
            return steps;
        }

        /**
         * Set steps
         **/
        public void setSteps(Integer steps) {
            this.steps = steps;
        }

        public BackoffQueryParam steps(Integer steps) {
            this.steps = steps;
            return this;
        }

        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class BackoffQueryParam {\n");

            sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
            sb.append("    factor: ").append(toIndentedString(factor)).append("\n");
            sb.append("    jitter: ").append(toIndentedString(jitter)).append("\n");
            sb.append("    steps: ").append(toIndentedString(steps)).append("\n");
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
