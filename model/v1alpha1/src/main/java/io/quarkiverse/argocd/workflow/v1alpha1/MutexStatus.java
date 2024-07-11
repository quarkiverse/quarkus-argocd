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
/**
  * MutexStatus contains which objects hold  mutex locks, and which objects this workflow is waiting on to release locks.
 **/
public class MutexStatus  {

    /**
      * MutexStatus contains which objects hold  mutex locks, and which objects this workflow is waiting on to release locks.
     **/
    private List<MutexHolding> holding;
    /**
      * MutexStatus contains which objects hold  mutex locks, and which objects this workflow is waiting on to release locks.
     **/
    private List<MutexHolding> waiting;

    /**
    * Holding is a list of mutexes and their respective objects that are held by mutex lock for this io.argoproj.workflow.v1alpha1.
    * @return holding
    **/
    @JsonProperty("holding")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public List<MutexHolding> getHolding() {
        return holding;
    }

    /**
     * Set holding
     **/
    public void setHolding(List<MutexHolding> holding) {
        this.holding = holding;
    }

    public MutexStatus holding(List<MutexHolding> holding) {
        this.holding = holding;
        return this;
    }
    public MutexStatus addHoldingItem(MutexHolding holdingItem) {
        if (this.holding == null){
            holding = new ArrayList<>();
        }
        this.holding.add(holdingItem);
        return this;
    }

    /**
    * Waiting is a list of mutexes and their respective objects this workflow is waiting for.
    * @return waiting
    **/
    @JsonProperty("waiting")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public List<MutexHolding> getWaiting() {
        return waiting;
    }

    /**
     * Set waiting
     **/
    public void setWaiting(List<MutexHolding> waiting) {
        this.waiting = waiting;
    }

    public MutexStatus waiting(List<MutexHolding> waiting) {
        this.waiting = waiting;
        return this;
    }
    public MutexStatus addWaitingItem(MutexHolding waitingItem) {
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
        sb.append("class MutexStatus {\n");

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
    /**
      * MutexStatus contains which objects hold  mutex locks, and which objects this workflow is waiting on to release locks.
     **/
    public static class MutexStatusQueryParam  {

        /**
          * MutexStatus contains which objects hold  mutex locks, and which objects this workflow is waiting on to release locks.
         **/
        @jakarta.ws.rs.QueryParam("holding")
        private List<MutexHolding> holding = null;
        /**
          * MutexStatus contains which objects hold  mutex locks, and which objects this workflow is waiting on to release locks.
         **/
        @jakarta.ws.rs.QueryParam("waiting")
        private List<MutexHolding> waiting = null;

        /**
        * Holding is a list of mutexes and their respective objects that are held by mutex lock for this io.argoproj.workflow.v1alpha1.
        * @return holding
        **/
        @JsonProperty("holding")
        public List<MutexHolding> getHolding() {
            return holding;
        }

        /**
         * Set holding
         **/
        public void setHolding(List<MutexHolding> holding) {
            this.holding = holding;
        }

        public MutexStatusQueryParam holding(List<MutexHolding> holding) {
            this.holding = holding;
            return this;
        }
        public MutexStatusQueryParam addHoldingItem(MutexHolding holdingItem) {
            this.holding.add(holdingItem);
            return this;
        }

        /**
        * Waiting is a list of mutexes and their respective objects this workflow is waiting for.
        * @return waiting
        **/
        @JsonProperty("waiting")
        public List<MutexHolding> getWaiting() {
            return waiting;
        }

        /**
         * Set waiting
         **/
        public void setWaiting(List<MutexHolding> waiting) {
            this.waiting = waiting;
        }

        public MutexStatusQueryParam waiting(List<MutexHolding> waiting) {
            this.waiting = waiting;
            return this;
        }
        public MutexStatusQueryParam addWaitingItem(MutexHolding waitingItem) {
            this.waiting.add(waitingItem);
            return this;
        }

        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class MutexStatusQueryParam {\n");

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
