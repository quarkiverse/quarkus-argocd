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
  * SynchronizationStatus stores the status of semaphore and mutex.
 **/
public class SynchronizationStatus  {

    /**
      * SynchronizationStatus stores the status of semaphore and mutex.
     **/
    private MutexStatus mutex;
    /**
      * SynchronizationStatus stores the status of semaphore and mutex.
     **/
    private SemaphoreStatus semaphore;

    /**
    * Get mutex
    * @return mutex
    **/
    @JsonProperty("mutex")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public MutexStatus getMutex() {
        return mutex;
    }

    /**
     * Set mutex
     **/
    public void setMutex(MutexStatus mutex) {
        this.mutex = mutex;
    }

    public SynchronizationStatus mutex(MutexStatus mutex) {
        this.mutex = mutex;
        return this;
    }

    /**
    * Get semaphore
    * @return semaphore
    **/
    @JsonProperty("semaphore")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public SemaphoreStatus getSemaphore() {
        return semaphore;
    }

    /**
     * Set semaphore
     **/
    public void setSemaphore(SemaphoreStatus semaphore) {
        this.semaphore = semaphore;
    }

    public SynchronizationStatus semaphore(SemaphoreStatus semaphore) {
        this.semaphore = semaphore;
        return this;
    }

    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SynchronizationStatus {\n");

        sb.append("    mutex: ").append(toIndentedString(mutex)).append("\n");
        sb.append("    semaphore: ").append(toIndentedString(semaphore)).append("\n");
        
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
      * SynchronizationStatus stores the status of semaphore and mutex.
     **/
    public static class SynchronizationStatusQueryParam  {

        /**
          * SynchronizationStatus stores the status of semaphore and mutex.
         **/
        @jakarta.ws.rs.QueryParam("mutex")
        private MutexStatus mutex;
        /**
          * SynchronizationStatus stores the status of semaphore and mutex.
         **/
        @jakarta.ws.rs.QueryParam("semaphore")
        private SemaphoreStatus semaphore;

        /**
        * Get mutex
        * @return mutex
        **/
        @JsonProperty("mutex")
        public MutexStatus getMutex() {
            return mutex;
        }

        /**
         * Set mutex
         **/
        public void setMutex(MutexStatus mutex) {
            this.mutex = mutex;
        }

        public SynchronizationStatusQueryParam mutex(MutexStatus mutex) {
            this.mutex = mutex;
            return this;
        }

        /**
        * Get semaphore
        * @return semaphore
        **/
        @JsonProperty("semaphore")
        public SemaphoreStatus getSemaphore() {
            return semaphore;
        }

        /**
         * Set semaphore
         **/
        public void setSemaphore(SemaphoreStatus semaphore) {
            this.semaphore = semaphore;
        }

        public SynchronizationStatusQueryParam semaphore(SemaphoreStatus semaphore) {
            this.semaphore = semaphore;
            return this;
        }

        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class SynchronizationStatusQueryParam {\n");

            sb.append("    mutex: ").append(toIndentedString(mutex)).append("\n");
            sb.append("    semaphore: ").append(toIndentedString(semaphore)).append("\n");
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
