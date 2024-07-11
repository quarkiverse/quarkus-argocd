package io.quarkiverse.argocd.workflow.v1alpha1;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;

import io.fabric8.kubernetes.api.model.ObjectReference;

import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.Type;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
/**
  * CronWorkflowStatus is the status of a CronWorkflow
 **/
public class CronWorkflowStatus  {

    /**
      * CronWorkflowStatus is the status of a CronWorkflow
     **/
    private List<ObjectReference> active = new ArrayList<>();
    /**
      * CronWorkflowStatus is the status of a CronWorkflow
     **/
    private List<Condition> conditions = new ArrayList<>();
    /**
      * CronWorkflowStatus is the status of a CronWorkflow
     **/
    private Integer failed;
    /**
      * CronWorkflowStatus is the status of a CronWorkflow
     **/
    private OffsetDateTime lastScheduledTime;
    /**
      * CronWorkflowStatus is the status of a CronWorkflow
     **/
    private String phase;
    /**
      * CronWorkflowStatus is the status of a CronWorkflow
     **/
    private Integer succeeded;

    /**
    * Active is a list of active workflows stemming from this CronWorkflow
    * @return active
    **/
    @JsonProperty("active")
    public List<ObjectReference> getActive() {
        return active;
    }

    /**
     * Set active
     **/
    public void setActive(List<ObjectReference> active) {
        this.active = active;
    }

    public CronWorkflowStatus active(List<ObjectReference> active) {
        this.active = active;
        return this;
    }
    public CronWorkflowStatus addActiveItem(ObjectReference activeItem) {
        if (this.active == null){
            active = new ArrayList<>();
        }
        this.active.add(activeItem);
        return this;
    }

    /**
    * Conditions is a list of conditions the CronWorkflow may have
    * @return conditions
    **/
    @JsonProperty("conditions")
    public List<Condition> getConditions() {
        return conditions;
    }

    /**
     * Set conditions
     **/
    public void setConditions(List<Condition> conditions) {
        this.conditions = conditions;
    }

    public CronWorkflowStatus conditions(List<Condition> conditions) {
        this.conditions = conditions;
        return this;
    }
    public CronWorkflowStatus addConditionsItem(Condition conditionsItem) {
        if (this.conditions == null){
            conditions = new ArrayList<>();
        }
        this.conditions.add(conditionsItem);
        return this;
    }

    /**
    * v3.6 and after: Failed counts how many times child workflows failed
    * @return failed
    **/
    @JsonProperty("failed")
    public Integer getFailed() {
        return failed;
    }

    /**
     * Set failed
     **/
    public void setFailed(Integer failed) {
        this.failed = failed;
    }

    public CronWorkflowStatus failed(Integer failed) {
        this.failed = failed;
        return this;
    }

    /**
    * Time is a wrapper around time.Time which supports correct marshaling to YAML and JSON.  Wrappers are provided for many of the factory methods that the time package offers.
    * @return lastScheduledTime
    **/
    @JsonProperty("lastScheduledTime")
    public OffsetDateTime getLastScheduledTime() {
        return lastScheduledTime;
    }

    /**
     * Set lastScheduledTime
     **/
    public void setLastScheduledTime(OffsetDateTime lastScheduledTime) {
        this.lastScheduledTime = lastScheduledTime;
    }

    public CronWorkflowStatus lastScheduledTime(OffsetDateTime lastScheduledTime) {
        this.lastScheduledTime = lastScheduledTime;
        return this;
    }

    /**
    * v3.6 and after: Phase is an enum of Active or Stopped. It changes to Stopped when stopStrategy.condition is true
    * @return phase
    **/
    @JsonProperty("phase")
    public String getPhase() {
        return phase;
    }

    /**
     * Set phase
     **/
    public void setPhase(String phase) {
        this.phase = phase;
    }

    public CronWorkflowStatus phase(String phase) {
        this.phase = phase;
        return this;
    }

    /**
    * v3.6 and after: Succeeded counts how many times child workflows succeeded
    * @return succeeded
    **/
    @JsonProperty("succeeded")
    public Integer getSucceeded() {
        return succeeded;
    }

    /**
     * Set succeeded
     **/
    public void setSucceeded(Integer succeeded) {
        this.succeeded = succeeded;
    }

    public CronWorkflowStatus succeeded(Integer succeeded) {
        this.succeeded = succeeded;
        return this;
    }

    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CronWorkflowStatus {\n");

        sb.append("    active: ").append(toIndentedString(active)).append("\n");
        sb.append("    conditions: ").append(toIndentedString(conditions)).append("\n");
        sb.append("    failed: ").append(toIndentedString(failed)).append("\n");
        sb.append("    lastScheduledTime: ").append(toIndentedString(lastScheduledTime)).append("\n");
        sb.append("    phase: ").append(toIndentedString(phase)).append("\n");
        sb.append("    succeeded: ").append(toIndentedString(succeeded)).append("\n");
        
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
      * CronWorkflowStatus is the status of a CronWorkflow
     **/
    public static class CronWorkflowStatusQueryParam  {

        /**
          * CronWorkflowStatus is the status of a CronWorkflow
         **/
        @jakarta.ws.rs.QueryParam("active")
        private List<ObjectReference> active = null;
        /**
          * CronWorkflowStatus is the status of a CronWorkflow
         **/
        @jakarta.ws.rs.QueryParam("conditions")
        private List<Condition> conditions = null;
        /**
          * CronWorkflowStatus is the status of a CronWorkflow
         **/
        @jakarta.ws.rs.QueryParam("failed")
        private Integer failed;
        /**
          * CronWorkflowStatus is the status of a CronWorkflow
         **/
        @jakarta.ws.rs.QueryParam("lastScheduledTime")
        private OffsetDateTime lastScheduledTime;
        /**
          * CronWorkflowStatus is the status of a CronWorkflow
         **/
        @jakarta.ws.rs.QueryParam("phase")
        private String phase;
        /**
          * CronWorkflowStatus is the status of a CronWorkflow
         **/
        @jakarta.ws.rs.QueryParam("succeeded")
        private Integer succeeded;

        /**
        * Active is a list of active workflows stemming from this CronWorkflow
        * @return active
        **/
        @JsonProperty("active")
        public List<ObjectReference> getActive() {
            return active;
        }

        /**
         * Set active
         **/
        public void setActive(List<ObjectReference> active) {
            this.active = active;
        }

        public CronWorkflowStatusQueryParam active(List<ObjectReference> active) {
            this.active = active;
            return this;
        }
        public CronWorkflowStatusQueryParam addActiveItem(ObjectReference activeItem) {
            this.active.add(activeItem);
            return this;
        }

        /**
        * Conditions is a list of conditions the CronWorkflow may have
        * @return conditions
        **/
        @JsonProperty("conditions")
        public List<Condition> getConditions() {
            return conditions;
        }

        /**
         * Set conditions
         **/
        public void setConditions(List<Condition> conditions) {
            this.conditions = conditions;
        }

        public CronWorkflowStatusQueryParam conditions(List<Condition> conditions) {
            this.conditions = conditions;
            return this;
        }
        public CronWorkflowStatusQueryParam addConditionsItem(Condition conditionsItem) {
            this.conditions.add(conditionsItem);
            return this;
        }

        /**
        * v3.6 and after: Failed counts how many times child workflows failed
        * @return failed
        **/
        @JsonProperty("failed")
        public Integer getFailed() {
            return failed;
        }

        /**
         * Set failed
         **/
        public void setFailed(Integer failed) {
            this.failed = failed;
        }

        public CronWorkflowStatusQueryParam failed(Integer failed) {
            this.failed = failed;
            return this;
        }

        /**
        * Time is a wrapper around time.Time which supports correct marshaling to YAML and JSON.  Wrappers are provided for many of the factory methods that the time package offers.
        * @return lastScheduledTime
        **/
        @JsonProperty("lastScheduledTime")
        public OffsetDateTime getLastScheduledTime() {
            return lastScheduledTime;
        }

        /**
         * Set lastScheduledTime
         **/
        public void setLastScheduledTime(OffsetDateTime lastScheduledTime) {
            this.lastScheduledTime = lastScheduledTime;
        }

        public CronWorkflowStatusQueryParam lastScheduledTime(OffsetDateTime lastScheduledTime) {
            this.lastScheduledTime = lastScheduledTime;
            return this;
        }

        /**
        * v3.6 and after: Phase is an enum of Active or Stopped. It changes to Stopped when stopStrategy.condition is true
        * @return phase
        **/
        @JsonProperty("phase")
        public String getPhase() {
            return phase;
        }

        /**
         * Set phase
         **/
        public void setPhase(String phase) {
            this.phase = phase;
        }

        public CronWorkflowStatusQueryParam phase(String phase) {
            this.phase = phase;
            return this;
        }

        /**
        * v3.6 and after: Succeeded counts how many times child workflows succeeded
        * @return succeeded
        **/
        @JsonProperty("succeeded")
        public Integer getSucceeded() {
            return succeeded;
        }

        /**
         * Set succeeded
         **/
        public void setSucceeded(Integer succeeded) {
            this.succeeded = succeeded;
        }

        public CronWorkflowStatusQueryParam succeeded(Integer succeeded) {
            this.succeeded = succeeded;
            return this;
        }

        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class CronWorkflowStatusQueryParam {\n");

            sb.append("    active: ").append(toIndentedString(active)).append("\n");
            sb.append("    conditions: ").append(toIndentedString(conditions)).append("\n");
            sb.append("    failed: ").append(toIndentedString(failed)).append("\n");
            sb.append("    lastScheduledTime: ").append(toIndentedString(lastScheduledTime)).append("\n");
            sb.append("    phase: ").append(toIndentedString(phase)).append("\n");
            sb.append("    succeeded: ").append(toIndentedString(succeeded)).append("\n");
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
