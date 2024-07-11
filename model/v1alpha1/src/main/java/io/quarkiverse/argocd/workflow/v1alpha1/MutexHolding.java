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
  * MutexHolding describes the mutex and the object which is holding it.
 **/
public class MutexHolding  {

    /**
      * MutexHolding describes the mutex and the object which is holding it.
     **/
    private String holder;
    /**
      * MutexHolding describes the mutex and the object which is holding it.
     **/
    private String mutex;

    /**
    * Holder is a reference to the object which holds the Mutex. Holding Scenario:   1. Current workflow's NodeID which is holding the lock.      e.g: ${NodeID} Waiting Scenario:   1. Current workflow or other workflow NodeID which is holding the lock.      e.g: ${WorkflowName}/${NodeID}
    * @return holder
    **/
    @JsonProperty("holder")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public String getHolder() {
        return holder;
    }

    /**
     * Set holder
     **/
    public void setHolder(String holder) {
        this.holder = holder;
    }

    public MutexHolding holder(String holder) {
        this.holder = holder;
        return this;
    }

    /**
    * Reference for the mutex e.g: ${namespace}/mutex/${mutexName}
    * @return mutex
    **/
    @JsonProperty("mutex")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public String getMutex() {
        return mutex;
    }

    /**
     * Set mutex
     **/
    public void setMutex(String mutex) {
        this.mutex = mutex;
    }

    public MutexHolding mutex(String mutex) {
        this.mutex = mutex;
        return this;
    }

    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class MutexHolding {\n");

        sb.append("    holder: ").append(toIndentedString(holder)).append("\n");
        sb.append("    mutex: ").append(toIndentedString(mutex)).append("\n");
        
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
      * MutexHolding describes the mutex and the object which is holding it.
     **/
    public static class MutexHoldingQueryParam  {

        /**
          * MutexHolding describes the mutex and the object which is holding it.
         **/
        @jakarta.ws.rs.QueryParam("holder")
        private String holder;
        /**
          * MutexHolding describes the mutex and the object which is holding it.
         **/
        @jakarta.ws.rs.QueryParam("mutex")
        private String mutex;

        /**
        * Holder is a reference to the object which holds the Mutex. Holding Scenario:   1. Current workflow's NodeID which is holding the lock.      e.g: ${NodeID} Waiting Scenario:   1. Current workflow or other workflow NodeID which is holding the lock.      e.g: ${WorkflowName}/${NodeID}
        * @return holder
        **/
        @JsonProperty("holder")
        public String getHolder() {
            return holder;
        }

        /**
         * Set holder
         **/
        public void setHolder(String holder) {
            this.holder = holder;
        }

        public MutexHoldingQueryParam holder(String holder) {
            this.holder = holder;
            return this;
        }

        /**
        * Reference for the mutex e.g: ${namespace}/mutex/${mutexName}
        * @return mutex
        **/
        @JsonProperty("mutex")
        public String getMutex() {
            return mutex;
        }

        /**
         * Set mutex
         **/
        public void setMutex(String mutex) {
            this.mutex = mutex;
        }

        public MutexHoldingQueryParam mutex(String mutex) {
            this.mutex = mutex;
            return this;
        }

        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class MutexHoldingQueryParam {\n");

            sb.append("    holder: ").append(toIndentedString(holder)).append("\n");
            sb.append("    mutex: ").append(toIndentedString(mutex)).append("\n");
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