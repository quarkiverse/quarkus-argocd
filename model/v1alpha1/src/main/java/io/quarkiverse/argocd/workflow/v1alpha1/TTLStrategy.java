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
  * TTLStrategy is the strategy for the time to live depending on if the workflow succeeded or failed
 **/
public class TTLStrategy  {

    /**
      * TTLStrategy is the strategy for the time to live depending on if the workflow succeeded or failed
     **/
    private Integer secondsAfterCompletion;
    /**
      * TTLStrategy is the strategy for the time to live depending on if the workflow succeeded or failed
     **/
    private Integer secondsAfterFailure;
    /**
      * TTLStrategy is the strategy for the time to live depending on if the workflow succeeded or failed
     **/
    private Integer secondsAfterSuccess;

    /**
    * SecondsAfterCompletion is the number of seconds to live after completion
    * @return secondsAfterCompletion
    **/
    @JsonProperty("secondsAfterCompletion")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public Integer getSecondsAfterCompletion() {
        return secondsAfterCompletion;
    }

    /**
     * Set secondsAfterCompletion
     **/
    public void setSecondsAfterCompletion(Integer secondsAfterCompletion) {
        this.secondsAfterCompletion = secondsAfterCompletion;
    }

    public TTLStrategy secondsAfterCompletion(Integer secondsAfterCompletion) {
        this.secondsAfterCompletion = secondsAfterCompletion;
        return this;
    }

    /**
    * SecondsAfterFailure is the number of seconds to live after failure
    * @return secondsAfterFailure
    **/
    @JsonProperty("secondsAfterFailure")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public Integer getSecondsAfterFailure() {
        return secondsAfterFailure;
    }

    /**
     * Set secondsAfterFailure
     **/
    public void setSecondsAfterFailure(Integer secondsAfterFailure) {
        this.secondsAfterFailure = secondsAfterFailure;
    }

    public TTLStrategy secondsAfterFailure(Integer secondsAfterFailure) {
        this.secondsAfterFailure = secondsAfterFailure;
        return this;
    }

    /**
    * SecondsAfterSuccess is the number of seconds to live after success
    * @return secondsAfterSuccess
    **/
    @JsonProperty("secondsAfterSuccess")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public Integer getSecondsAfterSuccess() {
        return secondsAfterSuccess;
    }

    /**
     * Set secondsAfterSuccess
     **/
    public void setSecondsAfterSuccess(Integer secondsAfterSuccess) {
        this.secondsAfterSuccess = secondsAfterSuccess;
    }

    public TTLStrategy secondsAfterSuccess(Integer secondsAfterSuccess) {
        this.secondsAfterSuccess = secondsAfterSuccess;
        return this;
    }

    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TTLStrategy {\n");

        sb.append("    secondsAfterCompletion: ").append(toIndentedString(secondsAfterCompletion)).append("\n");
        sb.append("    secondsAfterFailure: ").append(toIndentedString(secondsAfterFailure)).append("\n");
        sb.append("    secondsAfterSuccess: ").append(toIndentedString(secondsAfterSuccess)).append("\n");
        
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
      * TTLStrategy is the strategy for the time to live depending on if the workflow succeeded or failed
     **/
    public static class TTLStrategyQueryParam  {

        /**
          * TTLStrategy is the strategy for the time to live depending on if the workflow succeeded or failed
         **/
        @jakarta.ws.rs.QueryParam("secondsAfterCompletion")
        private Integer secondsAfterCompletion;
        /**
          * TTLStrategy is the strategy for the time to live depending on if the workflow succeeded or failed
         **/
        @jakarta.ws.rs.QueryParam("secondsAfterFailure")
        private Integer secondsAfterFailure;
        /**
          * TTLStrategy is the strategy for the time to live depending on if the workflow succeeded or failed
         **/
        @jakarta.ws.rs.QueryParam("secondsAfterSuccess")
        private Integer secondsAfterSuccess;

        /**
        * SecondsAfterCompletion is the number of seconds to live after completion
        * @return secondsAfterCompletion
        **/
        @JsonProperty("secondsAfterCompletion")
        public Integer getSecondsAfterCompletion() {
            return secondsAfterCompletion;
        }

        /**
         * Set secondsAfterCompletion
         **/
        public void setSecondsAfterCompletion(Integer secondsAfterCompletion) {
            this.secondsAfterCompletion = secondsAfterCompletion;
        }

        public TTLStrategyQueryParam secondsAfterCompletion(Integer secondsAfterCompletion) {
            this.secondsAfterCompletion = secondsAfterCompletion;
            return this;
        }

        /**
        * SecondsAfterFailure is the number of seconds to live after failure
        * @return secondsAfterFailure
        **/
        @JsonProperty("secondsAfterFailure")
        public Integer getSecondsAfterFailure() {
            return secondsAfterFailure;
        }

        /**
         * Set secondsAfterFailure
         **/
        public void setSecondsAfterFailure(Integer secondsAfterFailure) {
            this.secondsAfterFailure = secondsAfterFailure;
        }

        public TTLStrategyQueryParam secondsAfterFailure(Integer secondsAfterFailure) {
            this.secondsAfterFailure = secondsAfterFailure;
            return this;
        }

        /**
        * SecondsAfterSuccess is the number of seconds to live after success
        * @return secondsAfterSuccess
        **/
        @JsonProperty("secondsAfterSuccess")
        public Integer getSecondsAfterSuccess() {
            return secondsAfterSuccess;
        }

        /**
         * Set secondsAfterSuccess
         **/
        public void setSecondsAfterSuccess(Integer secondsAfterSuccess) {
            this.secondsAfterSuccess = secondsAfterSuccess;
        }

        public TTLStrategyQueryParam secondsAfterSuccess(Integer secondsAfterSuccess) {
            this.secondsAfterSuccess = secondsAfterSuccess;
            return this;
        }

        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class TTLStrategyQueryParam {\n");

            sb.append("    secondsAfterCompletion: ").append(toIndentedString(secondsAfterCompletion)).append("\n");
            sb.append("    secondsAfterFailure: ").append(toIndentedString(secondsAfterFailure)).append("\n");
            sb.append("    secondsAfterSuccess: ").append(toIndentedString(secondsAfterSuccess)).append("\n");
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