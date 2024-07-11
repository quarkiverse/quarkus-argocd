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
  * Synchronization holds synchronization lock configuration
 **/
public class Synchronization  {

    /**
      * Synchronization holds synchronization lock configuration
     **/
    private Mutex mutex;
    /**
      * Synchronization holds synchronization lock configuration
     **/
    private SemaphoreRef semaphore;

    /**
    * Get mutex
    * @return mutex
    **/
    @JsonProperty("mutex")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public Mutex getMutex() {
        return mutex;
    }

    /**
     * Set mutex
     **/
    public void setMutex(Mutex mutex) {
        this.mutex = mutex;
    }

    public Synchronization mutex(Mutex mutex) {
        this.mutex = mutex;
        return this;
    }

    /**
    * Get semaphore
    * @return semaphore
    **/
    @JsonProperty("semaphore")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public SemaphoreRef getSemaphore() {
        return semaphore;
    }

    /**
     * Set semaphore
     **/
    public void setSemaphore(SemaphoreRef semaphore) {
        this.semaphore = semaphore;
    }

    public Synchronization semaphore(SemaphoreRef semaphore) {
        this.semaphore = semaphore;
        return this;
    }

    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Synchronization {\n");

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
      * Synchronization holds synchronization lock configuration
     **/
    public static class SynchronizationQueryParam  {

        /**
          * Synchronization holds synchronization lock configuration
         **/
        @jakarta.ws.rs.QueryParam("mutex")
        private Mutex mutex;
        /**
          * Synchronization holds synchronization lock configuration
         **/
        @jakarta.ws.rs.QueryParam("semaphore")
        private SemaphoreRef semaphore;

        /**
        * Get mutex
        * @return mutex
        **/
        @JsonProperty("mutex")
        public Mutex getMutex() {
            return mutex;
        }

        /**
         * Set mutex
         **/
        public void setMutex(Mutex mutex) {
            this.mutex = mutex;
        }

        public SynchronizationQueryParam mutex(Mutex mutex) {
            this.mutex = mutex;
            return this;
        }

        /**
        * Get semaphore
        * @return semaphore
        **/
        @JsonProperty("semaphore")
        public SemaphoreRef getSemaphore() {
            return semaphore;
        }

        /**
         * Set semaphore
         **/
        public void setSemaphore(SemaphoreRef semaphore) {
            this.semaphore = semaphore;
        }

        public SynchronizationQueryParam semaphore(SemaphoreRef semaphore) {
            this.semaphore = semaphore;
            return this;
        }

        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class SynchronizationQueryParam {\n");

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
