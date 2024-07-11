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
  * DAGTemplate is a template subtype for directed acyclic graph templates
 **/
public class DAGTemplate  {

    /**
      * DAGTemplate is a template subtype for directed acyclic graph templates
     **/
    private Boolean failFast;
    /**
      * DAGTemplate is a template subtype for directed acyclic graph templates
     **/
    private String target;
    /**
      * DAGTemplate is a template subtype for directed acyclic graph templates
     **/
    private List<DAGTask> tasks = new ArrayList<>();

    /**
    * This flag is for DAG logic. The DAG logic has a built-in \"fail fast\" feature to stop scheduling new steps, as soon as it detects that one of the DAG nodes is failed. Then it waits until all DAG nodes are completed before failing the DAG itself. The FailFast flag default is true,  if set to false, it will allow a DAG to run all branches of the DAG to completion (either success or failure), regardless of the failed outcomes of branches in the DAG. More info and example about this feature at https://github.com/argoproj/argo-workflows/issues/1442
    * @return failFast
    **/
    @JsonProperty("failFast")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public Boolean getFailFast() {
        return failFast;
    }

    /**
     * Set failFast
     **/
    public void setFailFast(Boolean failFast) {
        this.failFast = failFast;
    }

    public DAGTemplate failFast(Boolean failFast) {
        this.failFast = failFast;
        return this;
    }

    /**
    * Target are one or more names of targets to execute in a DAG
    * @return target
    **/
    @JsonProperty("target")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public String getTarget() {
        return target;
    }

    /**
     * Set target
     **/
    public void setTarget(String target) {
        this.target = target;
    }

    public DAGTemplate target(String target) {
        this.target = target;
        return this;
    }

    /**
    * Tasks are a list of DAG tasks
    * @return tasks
    **/
    @JsonProperty("tasks")
    public List<DAGTask> getTasks() {
        return tasks;
    }

    /**
     * Set tasks
     **/
    public void setTasks(List<DAGTask> tasks) {
        this.tasks = tasks;
    }

    public DAGTemplate tasks(List<DAGTask> tasks) {
        this.tasks = tasks;
        return this;
    }
    public DAGTemplate addTasksItem(DAGTask tasksItem) {
        if (this.tasks == null){
            tasks = new ArrayList<>();
        }
        this.tasks.add(tasksItem);
        return this;
    }

    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DAGTemplate {\n");

        sb.append("    failFast: ").append(toIndentedString(failFast)).append("\n");
        sb.append("    target: ").append(toIndentedString(target)).append("\n");
        sb.append("    tasks: ").append(toIndentedString(tasks)).append("\n");
        
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
      * DAGTemplate is a template subtype for directed acyclic graph templates
     **/
    public static class DAGTemplateQueryParam  {

        /**
          * DAGTemplate is a template subtype for directed acyclic graph templates
         **/
        @jakarta.ws.rs.QueryParam("failFast")
        private Boolean failFast;
        /**
          * DAGTemplate is a template subtype for directed acyclic graph templates
         **/
        @jakarta.ws.rs.QueryParam("target")
        private String target;
        /**
          * DAGTemplate is a template subtype for directed acyclic graph templates
         **/
        @jakarta.ws.rs.QueryParam("tasks")
        private List<DAGTask> tasks = null;

        /**
        * This flag is for DAG logic. The DAG logic has a built-in \"fail fast\" feature to stop scheduling new steps, as soon as it detects that one of the DAG nodes is failed. Then it waits until all DAG nodes are completed before failing the DAG itself. The FailFast flag default is true,  if set to false, it will allow a DAG to run all branches of the DAG to completion (either success or failure), regardless of the failed outcomes of branches in the DAG. More info and example about this feature at https://github.com/argoproj/argo-workflows/issues/1442
        * @return failFast
        **/
        @JsonProperty("failFast")
        public Boolean getFailFast() {
            return failFast;
        }

        /**
         * Set failFast
         **/
        public void setFailFast(Boolean failFast) {
            this.failFast = failFast;
        }

        public DAGTemplateQueryParam failFast(Boolean failFast) {
            this.failFast = failFast;
            return this;
        }

        /**
        * Target are one or more names of targets to execute in a DAG
        * @return target
        **/
        @JsonProperty("target")
        public String getTarget() {
            return target;
        }

        /**
         * Set target
         **/
        public void setTarget(String target) {
            this.target = target;
        }

        public DAGTemplateQueryParam target(String target) {
            this.target = target;
            return this;
        }

        /**
        * Tasks are a list of DAG tasks
        * @return tasks
        **/
        @JsonProperty("tasks")
        public List<DAGTask> getTasks() {
            return tasks;
        }

        /**
         * Set tasks
         **/
        public void setTasks(List<DAGTask> tasks) {
            this.tasks = tasks;
        }

        public DAGTemplateQueryParam tasks(List<DAGTask> tasks) {
            this.tasks = tasks;
            return this;
        }
        public DAGTemplateQueryParam addTasksItem(DAGTask tasksItem) {
            this.tasks.add(tasksItem);
            return this;
        }

        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class DAGTemplateQueryParam {\n");

            sb.append("    failFast: ").append(toIndentedString(failFast)).append("\n");
            sb.append("    target: ").append(toIndentedString(target)).append("\n");
            sb.append("    tasks: ").append(toIndentedString(tasks)).append("\n");
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
