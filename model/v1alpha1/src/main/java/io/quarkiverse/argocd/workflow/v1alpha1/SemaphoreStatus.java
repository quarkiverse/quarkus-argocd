package io.quarkiverse.argocd.workflow.v1alpha1;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.Type;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class SemaphoreStatus  {

    private List<SemaphoreHolding> holding;
    private List<SemaphoreHolding> waiting;

    /**
    * Holding stores the list of resource acquired synchronization lock for workflows.
    * @return holding
    **/
    @JsonProperty("holding")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public List<SemaphoreHolding> getHolding() {
        return holding;
    }

    /**
     * Set holding
     **/
    public void setHolding(List<SemaphoreHolding> holding) {
        this.holding = holding;
    }

    public SemaphoreStatus holding(List<SemaphoreHolding> holding) {
        this.holding = holding;
        return this;
    }
    public SemaphoreStatus addHoldingItem(SemaphoreHolding holdingItem) {
        if (this.holding == null){
            holding = new ArrayList<>();
        }
        this.holding.add(holdingItem);
        return this;
    }

    /**
    * Waiting indicates the list of current synchronization lock holders.
    * @return waiting
    **/
    @JsonProperty("waiting")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public List<SemaphoreHolding> getWaiting() {
        return waiting;
    }

    /**
     * Set waiting
     **/
    public void setWaiting(List<SemaphoreHolding> waiting) {
        this.waiting = waiting;
    }

    public SemaphoreStatus waiting(List<SemaphoreHolding> waiting) {
        this.waiting = waiting;
        return this;
    }
    public SemaphoreStatus addWaitingItem(SemaphoreHolding waitingItem) {
        if (this.waiting == null){
            waiting = new ArrayList<>();
        }
        this.waiting.add(waitingItem);
        return this;
    }

    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SemaphoreStatus {\n");

        sb.append("    holding: ").append(toIndentedString(holding)).append("\n");
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
    public static class SemaphoreStatusQueryParam  {

        @jakarta.ws.rs.QueryParam("holding")
        private List<SemaphoreHolding> holding = null;
        @jakarta.ws.rs.QueryParam("waiting")
        private List<SemaphoreHolding> waiting = null;

        /**
        * Holding stores the list of resource acquired synchronization lock for workflows.
        * @return holding
        **/
        @JsonProperty("holding")
        public List<SemaphoreHolding> getHolding() {
            return holding;
        }

        /**
         * Set holding
         **/
        public void setHolding(List<SemaphoreHolding> holding) {
            this.holding = holding;
        }

        public SemaphoreStatusQueryParam holding(List<SemaphoreHolding> holding) {
            this.holding = holding;
            return this;
        }
        public SemaphoreStatusQueryParam addHoldingItem(SemaphoreHolding holdingItem) {
            this.holding.add(holdingItem);
            return this;
        }

        /**
        * Waiting indicates the list of current synchronization lock holders.
        * @return waiting
        **/
        @JsonProperty("waiting")
        public List<SemaphoreHolding> getWaiting() {
            return waiting;
        }

        /**
         * Set waiting
         **/
        public void setWaiting(List<SemaphoreHolding> waiting) {
            this.waiting = waiting;
        }

        public SemaphoreStatusQueryParam waiting(List<SemaphoreHolding> waiting) {
            this.waiting = waiting;
            return this;
        }
        public SemaphoreStatusQueryParam addWaitingItem(SemaphoreHolding waitingItem) {
            this.waiting.add(waitingItem);
            return this;
        }

        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class SemaphoreStatusQueryParam {\n");

            sb.append("    holding: ").append(toIndentedString(holding)).append("\n");
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
