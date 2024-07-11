package io.quarkiverse.argocd.workflow.v1alpha1;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.quarkiverse.argocd.v1alpha1.model.StopStrategy;
import io.fabric8.kubernetes.api.model.ObjectMeta;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.Type;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
/**
  * CronWorkflowSpec is the specification of a CronWorkflow
 **/
public class CronWorkflowSpec  {

    /**
      * CronWorkflowSpec is the specification of a CronWorkflow
     **/
    private String concurrencyPolicy;
    /**
      * CronWorkflowSpec is the specification of a CronWorkflow
     **/
    private Integer failedJobsHistoryLimit;
    /**
      * CronWorkflowSpec is the specification of a CronWorkflow
     **/
    private String schedule;
    /**
      * CronWorkflowSpec is the specification of a CronWorkflow
     **/
    private List<String> schedules;
    /**
      * CronWorkflowSpec is the specification of a CronWorkflow
     **/
    private Integer startingDeadlineSeconds;
    /**
      * CronWorkflowSpec is the specification of a CronWorkflow
     **/
    private StopStrategy stopStrategy;
    /**
      * CronWorkflowSpec is the specification of a CronWorkflow
     **/
    private Integer successfulJobsHistoryLimit;
    /**
      * CronWorkflowSpec is the specification of a CronWorkflow
     **/
    private Boolean suspend;
    /**
      * CronWorkflowSpec is the specification of a CronWorkflow
     **/
    private String timezone;
    /**
      * CronWorkflowSpec is the specification of a CronWorkflow
     **/
    private ObjectMeta workflowMetadata;
    /**
      * CronWorkflowSpec is the specification of a CronWorkflow
     **/
    private WorkflowSpec workflowSpec;

    /**
    * ConcurrencyPolicy is the K8s-style concurrency policy that will be used
    * @return concurrencyPolicy
    **/
    @JsonProperty("concurrencyPolicy")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public String getConcurrencyPolicy() {
        return concurrencyPolicy;
    }

    /**
     * Set concurrencyPolicy
     **/
    public void setConcurrencyPolicy(String concurrencyPolicy) {
        this.concurrencyPolicy = concurrencyPolicy;
    }

    public CronWorkflowSpec concurrencyPolicy(String concurrencyPolicy) {
        this.concurrencyPolicy = concurrencyPolicy;
        return this;
    }

    /**
    * FailedJobsHistoryLimit is the number of failed jobs to be kept at a time
    * @return failedJobsHistoryLimit
    **/
    @JsonProperty("failedJobsHistoryLimit")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public Integer getFailedJobsHistoryLimit() {
        return failedJobsHistoryLimit;
    }

    /**
     * Set failedJobsHistoryLimit
     **/
    public void setFailedJobsHistoryLimit(Integer failedJobsHistoryLimit) {
        this.failedJobsHistoryLimit = failedJobsHistoryLimit;
    }

    public CronWorkflowSpec failedJobsHistoryLimit(Integer failedJobsHistoryLimit) {
        this.failedJobsHistoryLimit = failedJobsHistoryLimit;
        return this;
    }

    /**
    * Schedule is a schedule to run the Workflow in Cron format
    * @return schedule
    **/
    @JsonProperty("schedule")
    public String getSchedule() {
        return schedule;
    }

    /**
     * Set schedule
     **/
    public void setSchedule(String schedule) {
        this.schedule = schedule;
    }

    public CronWorkflowSpec schedule(String schedule) {
        this.schedule = schedule;
        return this;
    }

    /**
    * Schedules is a list of schedules to run the Workflow in Cron format
    * @return schedules
    **/
    @JsonProperty("schedules")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public List<String> getSchedules() {
        return schedules;
    }

    /**
     * Set schedules
     **/
    public void setSchedules(List<String> schedules) {
        this.schedules = schedules;
    }

    public CronWorkflowSpec schedules(List<String> schedules) {
        this.schedules = schedules;
        return this;
    }
    public CronWorkflowSpec addSchedulesItem(String schedulesItem) {
        if (this.schedules == null){
            schedules = new ArrayList<>();
        }
        this.schedules.add(schedulesItem);
        return this;
    }

    /**
    * StartingDeadlineSeconds is the K8s-style deadline that will limit the time a CronWorkflow will be run after its original scheduled time if it is missed.
    * @return startingDeadlineSeconds
    **/
    @JsonProperty("startingDeadlineSeconds")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public Integer getStartingDeadlineSeconds() {
        return startingDeadlineSeconds;
    }

    /**
     * Set startingDeadlineSeconds
     **/
    public void setStartingDeadlineSeconds(Integer startingDeadlineSeconds) {
        this.startingDeadlineSeconds = startingDeadlineSeconds;
    }

    public CronWorkflowSpec startingDeadlineSeconds(Integer startingDeadlineSeconds) {
        this.startingDeadlineSeconds = startingDeadlineSeconds;
        return this;
    }

    /**
    * Get stopStrategy
    * @return stopStrategy
    **/
    @JsonProperty("stopStrategy")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public StopStrategy getStopStrategy() {
        return stopStrategy;
    }

    /**
     * Set stopStrategy
     **/
    public void setStopStrategy(StopStrategy stopStrategy) {
        this.stopStrategy = stopStrategy;
    }

    public CronWorkflowSpec stopStrategy(StopStrategy stopStrategy) {
        this.stopStrategy = stopStrategy;
        return this;
    }

    /**
    * SuccessfulJobsHistoryLimit is the number of successful jobs to be kept at a time
    * @return successfulJobsHistoryLimit
    **/
    @JsonProperty("successfulJobsHistoryLimit")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public Integer getSuccessfulJobsHistoryLimit() {
        return successfulJobsHistoryLimit;
    }

    /**
     * Set successfulJobsHistoryLimit
     **/
    public void setSuccessfulJobsHistoryLimit(Integer successfulJobsHistoryLimit) {
        this.successfulJobsHistoryLimit = successfulJobsHistoryLimit;
    }

    public CronWorkflowSpec successfulJobsHistoryLimit(Integer successfulJobsHistoryLimit) {
        this.successfulJobsHistoryLimit = successfulJobsHistoryLimit;
        return this;
    }

    /**
    * Suspend is a flag that will stop new CronWorkflows from running if set to true
    * @return suspend
    **/
    @JsonProperty("suspend")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public Boolean getSuspend() {
        return suspend;
    }

    /**
     * Set suspend
     **/
    public void setSuspend(Boolean suspend) {
        this.suspend = suspend;
    }

    public CronWorkflowSpec suspend(Boolean suspend) {
        this.suspend = suspend;
        return this;
    }

    /**
    * Timezone is the timezone against which the cron schedule will be calculated, e.g. \"Asia/Tokyo\". Default is machine's local time.
    * @return timezone
    **/
    @JsonProperty("timezone")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public String getTimezone() {
        return timezone;
    }

    /**
     * Set timezone
     **/
    public void setTimezone(String timezone) {
        this.timezone = timezone;
    }

    public CronWorkflowSpec timezone(String timezone) {
        this.timezone = timezone;
        return this;
    }

    /**
    * Get workflowMetadata
    * @return workflowMetadata
    **/
    @JsonProperty("workflowMetadata")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public ObjectMeta getWorkflowMetadata() {
        return workflowMetadata;
    }

    /**
     * Set workflowMetadata
     **/
    public void setWorkflowMetadata(ObjectMeta workflowMetadata) {
        this.workflowMetadata = workflowMetadata;
    }

    public CronWorkflowSpec workflowMetadata(ObjectMeta workflowMetadata) {
        this.workflowMetadata = workflowMetadata;
        return this;
    }

    /**
    * Get workflowSpec
    * @return workflowSpec
    **/
    @JsonProperty("workflowSpec")
    public WorkflowSpec getWorkflowSpec() {
        return workflowSpec;
    }

    /**
     * Set workflowSpec
     **/
    public void setWorkflowSpec(WorkflowSpec workflowSpec) {
        this.workflowSpec = workflowSpec;
    }

    public CronWorkflowSpec workflowSpec(WorkflowSpec workflowSpec) {
        this.workflowSpec = workflowSpec;
        return this;
    }

    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CronWorkflowSpec {\n");

        sb.append("    concurrencyPolicy: ").append(toIndentedString(concurrencyPolicy)).append("\n");
        sb.append("    failedJobsHistoryLimit: ").append(toIndentedString(failedJobsHistoryLimit)).append("\n");
        sb.append("    schedule: ").append(toIndentedString(schedule)).append("\n");
        sb.append("    schedules: ").append(toIndentedString(schedules)).append("\n");
        sb.append("    startingDeadlineSeconds: ").append(toIndentedString(startingDeadlineSeconds)).append("\n");
        sb.append("    stopStrategy: ").append(toIndentedString(stopStrategy)).append("\n");
        sb.append("    successfulJobsHistoryLimit: ").append(toIndentedString(successfulJobsHistoryLimit)).append("\n");
        sb.append("    suspend: ").append(toIndentedString(suspend)).append("\n");
        sb.append("    timezone: ").append(toIndentedString(timezone)).append("\n");
        sb.append("    workflowMetadata: ").append(toIndentedString(workflowMetadata)).append("\n");
        sb.append("    workflowSpec: ").append(toIndentedString(workflowSpec)).append("\n");
        
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
      * CronWorkflowSpec is the specification of a CronWorkflow
     **/
    public static class CronWorkflowSpecQueryParam  {

        /**
          * CronWorkflowSpec is the specification of a CronWorkflow
         **/
        @jakarta.ws.rs.QueryParam("concurrencyPolicy")
        private String concurrencyPolicy;
        /**
          * CronWorkflowSpec is the specification of a CronWorkflow
         **/
        @jakarta.ws.rs.QueryParam("failedJobsHistoryLimit")
        private Integer failedJobsHistoryLimit;
        /**
          * CronWorkflowSpec is the specification of a CronWorkflow
         **/
        @jakarta.ws.rs.QueryParam("schedule")
        private String schedule;
        /**
          * CronWorkflowSpec is the specification of a CronWorkflow
         **/
        @jakarta.ws.rs.QueryParam("schedules")
        private List<String> schedules = null;
        /**
          * CronWorkflowSpec is the specification of a CronWorkflow
         **/
        @jakarta.ws.rs.QueryParam("startingDeadlineSeconds")
        private Integer startingDeadlineSeconds;
        /**
          * CronWorkflowSpec is the specification of a CronWorkflow
         **/
        @jakarta.ws.rs.QueryParam("stopStrategy")
        private StopStrategy stopStrategy;
        /**
          * CronWorkflowSpec is the specification of a CronWorkflow
         **/
        @jakarta.ws.rs.QueryParam("successfulJobsHistoryLimit")
        private Integer successfulJobsHistoryLimit;
        /**
          * CronWorkflowSpec is the specification of a CronWorkflow
         **/
        @jakarta.ws.rs.QueryParam("suspend")
        private Boolean suspend;
        /**
          * CronWorkflowSpec is the specification of a CronWorkflow
         **/
        @jakarta.ws.rs.QueryParam("timezone")
        private String timezone;
        /**
          * CronWorkflowSpec is the specification of a CronWorkflow
         **/
        @jakarta.ws.rs.QueryParam("workflowMetadata")
        private ObjectMeta workflowMetadata;
        /**
          * CronWorkflowSpec is the specification of a CronWorkflow
         **/
        @jakarta.ws.rs.QueryParam("workflowSpec")
        private WorkflowSpec workflowSpec;

        /**
        * ConcurrencyPolicy is the K8s-style concurrency policy that will be used
        * @return concurrencyPolicy
        **/
        @JsonProperty("concurrencyPolicy")
        public String getConcurrencyPolicy() {
            return concurrencyPolicy;
        }

        /**
         * Set concurrencyPolicy
         **/
        public void setConcurrencyPolicy(String concurrencyPolicy) {
            this.concurrencyPolicy = concurrencyPolicy;
        }

        public CronWorkflowSpecQueryParam concurrencyPolicy(String concurrencyPolicy) {
            this.concurrencyPolicy = concurrencyPolicy;
            return this;
        }

        /**
        * FailedJobsHistoryLimit is the number of failed jobs to be kept at a time
        * @return failedJobsHistoryLimit
        **/
        @JsonProperty("failedJobsHistoryLimit")
        public Integer getFailedJobsHistoryLimit() {
            return failedJobsHistoryLimit;
        }

        /**
         * Set failedJobsHistoryLimit
         **/
        public void setFailedJobsHistoryLimit(Integer failedJobsHistoryLimit) {
            this.failedJobsHistoryLimit = failedJobsHistoryLimit;
        }

        public CronWorkflowSpecQueryParam failedJobsHistoryLimit(Integer failedJobsHistoryLimit) {
            this.failedJobsHistoryLimit = failedJobsHistoryLimit;
            return this;
        }

        /**
        * Schedule is a schedule to run the Workflow in Cron format
        * @return schedule
        **/
        @JsonProperty("schedule")
        public String getSchedule() {
            return schedule;
        }

        /**
         * Set schedule
         **/
        public void setSchedule(String schedule) {
            this.schedule = schedule;
        }

        public CronWorkflowSpecQueryParam schedule(String schedule) {
            this.schedule = schedule;
            return this;
        }

        /**
        * Schedules is a list of schedules to run the Workflow in Cron format
        * @return schedules
        **/
        @JsonProperty("schedules")
        public List<String> getSchedules() {
            return schedules;
        }

        /**
         * Set schedules
         **/
        public void setSchedules(List<String> schedules) {
            this.schedules = schedules;
        }

        public CronWorkflowSpecQueryParam schedules(List<String> schedules) {
            this.schedules = schedules;
            return this;
        }
        public CronWorkflowSpecQueryParam addSchedulesItem(String schedulesItem) {
            this.schedules.add(schedulesItem);
            return this;
        }

        /**
        * StartingDeadlineSeconds is the K8s-style deadline that will limit the time a CronWorkflow will be run after its original scheduled time if it is missed.
        * @return startingDeadlineSeconds
        **/
        @JsonProperty("startingDeadlineSeconds")
        public Integer getStartingDeadlineSeconds() {
            return startingDeadlineSeconds;
        }

        /**
         * Set startingDeadlineSeconds
         **/
        public void setStartingDeadlineSeconds(Integer startingDeadlineSeconds) {
            this.startingDeadlineSeconds = startingDeadlineSeconds;
        }

        public CronWorkflowSpecQueryParam startingDeadlineSeconds(Integer startingDeadlineSeconds) {
            this.startingDeadlineSeconds = startingDeadlineSeconds;
            return this;
        }

        /**
        * Get stopStrategy
        * @return stopStrategy
        **/
        @JsonProperty("stopStrategy")
        public StopStrategy getStopStrategy() {
            return stopStrategy;
        }

        /**
         * Set stopStrategy
         **/
        public void setStopStrategy(StopStrategy stopStrategy) {
            this.stopStrategy = stopStrategy;
        }

        public CronWorkflowSpecQueryParam stopStrategy(StopStrategy stopStrategy) {
            this.stopStrategy = stopStrategy;
            return this;
        }

        /**
        * SuccessfulJobsHistoryLimit is the number of successful jobs to be kept at a time
        * @return successfulJobsHistoryLimit
        **/
        @JsonProperty("successfulJobsHistoryLimit")
        public Integer getSuccessfulJobsHistoryLimit() {
            return successfulJobsHistoryLimit;
        }

        /**
         * Set successfulJobsHistoryLimit
         **/
        public void setSuccessfulJobsHistoryLimit(Integer successfulJobsHistoryLimit) {
            this.successfulJobsHistoryLimit = successfulJobsHistoryLimit;
        }

        public CronWorkflowSpecQueryParam successfulJobsHistoryLimit(Integer successfulJobsHistoryLimit) {
            this.successfulJobsHistoryLimit = successfulJobsHistoryLimit;
            return this;
        }

        /**
        * Suspend is a flag that will stop new CronWorkflows from running if set to true
        * @return suspend
        **/
        @JsonProperty("suspend")
        public Boolean getSuspend() {
            return suspend;
        }

        /**
         * Set suspend
         **/
        public void setSuspend(Boolean suspend) {
            this.suspend = suspend;
        }

        public CronWorkflowSpecQueryParam suspend(Boolean suspend) {
            this.suspend = suspend;
            return this;
        }

        /**
        * Timezone is the timezone against which the cron schedule will be calculated, e.g. \"Asia/Tokyo\". Default is machine's local time.
        * @return timezone
        **/
        @JsonProperty("timezone")
        public String getTimezone() {
            return timezone;
        }

        /**
         * Set timezone
         **/
        public void setTimezone(String timezone) {
            this.timezone = timezone;
        }

        public CronWorkflowSpecQueryParam timezone(String timezone) {
            this.timezone = timezone;
            return this;
        }

        /**
        * Get workflowMetadata
        * @return workflowMetadata
        **/
        @JsonProperty("workflowMetadata")
        public ObjectMeta getWorkflowMetadata() {
            return workflowMetadata;
        }

        /**
         * Set workflowMetadata
         **/
        public void setWorkflowMetadata(ObjectMeta workflowMetadata) {
            this.workflowMetadata = workflowMetadata;
        }

        public CronWorkflowSpecQueryParam workflowMetadata(ObjectMeta workflowMetadata) {
            this.workflowMetadata = workflowMetadata;
            return this;
        }

        /**
        * Get workflowSpec
        * @return workflowSpec
        **/
        @JsonProperty("workflowSpec")
        public WorkflowSpec getWorkflowSpec() {
            return workflowSpec;
        }

        /**
         * Set workflowSpec
         **/
        public void setWorkflowSpec(WorkflowSpec workflowSpec) {
            this.workflowSpec = workflowSpec;
        }

        public CronWorkflowSpecQueryParam workflowSpec(WorkflowSpec workflowSpec) {
            this.workflowSpec = workflowSpec;
            return this;
        }

        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class CronWorkflowSpecQueryParam {\n");

            sb.append("    concurrencyPolicy: ").append(toIndentedString(concurrencyPolicy)).append("\n");
            sb.append("    failedJobsHistoryLimit: ").append(toIndentedString(failedJobsHistoryLimit)).append("\n");
            sb.append("    schedule: ").append(toIndentedString(schedule)).append("\n");
            sb.append("    schedules: ").append(toIndentedString(schedules)).append("\n");
            sb.append("    startingDeadlineSeconds: ").append(toIndentedString(startingDeadlineSeconds)).append("\n");
            sb.append("    stopStrategy: ").append(toIndentedString(stopStrategy)).append("\n");
            sb.append("    successfulJobsHistoryLimit: ").append(toIndentedString(successfulJobsHistoryLimit)).append("\n");
            sb.append("    suspend: ").append(toIndentedString(suspend)).append("\n");
            sb.append("    timezone: ").append(toIndentedString(timezone)).append("\n");
            sb.append("    workflowMetadata: ").append(toIndentedString(workflowMetadata)).append("\n");
            sb.append("    workflowSpec: ").append(toIndentedString(workflowSpec)).append("\n");
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
