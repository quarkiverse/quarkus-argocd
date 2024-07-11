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
  * NodeSynchronizationStatus stores the status of a node
 **/
public class NodeSynchronizationStatus  {

    /**
      * NodeSynchronizationStatus stores the status of a node
     **/
    private String waiting;

    /**
    * Waiting is the name of the lock that this node is waiting for
    * @return waiting
    **/
    @JsonProperty("waiting")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public String getWaiting() {
        return waiting;
    }

    /**
     * Set waiting
     **/
    public void setWaiting(String waiting) {
        this.waiting = waiting;
    }

    public NodeSynchronizationStatus waiting(String waiting) {
        this.waiting = waiting;
        return this;
    }

    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class NodeSynchronizationStatus {\n");

        sb.append("    waiting: ").append(toIndentedString(waiting)).append("\n");
        
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
      * NodeSynchronizationStatus stores the status of a node
     **/
    public static class NodeSynchronizationStatusQueryParam  {

        /**
          * NodeSynchronizationStatus stores the status of a node
         **/
        @jakarta.ws.rs.QueryParam("waiting")
        private String waiting;

        /**
        * Waiting is the name of the lock that this node is waiting for
        * @return waiting
        **/
        @JsonProperty("waiting")
        public String getWaiting() {
            return waiting;
        }

        /**
         * Set waiting
         **/
        public void setWaiting(String waiting) {
            this.waiting = waiting;
        }

        public NodeSynchronizationStatusQueryParam waiting(String waiting) {
            this.waiting = waiting;
            return this;
        }

        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class NodeSynchronizationStatusQueryParam {\n");

            sb.append("    waiting: ").append(toIndentedString(waiting)).append("\n");
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