package io.quarkiverse.argocd.workflow.v1alpha1;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.Type;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class WorkflowTaskSetSpec  {

    private Map<String, Template> tasks;

    /**
    * Get tasks
    * @return tasks
    **/
    @JsonProperty("tasks")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public Map<String, Template> getTasks() {
        return tasks;
    }

    /**
     * Set tasks
     **/
    public void setTasks(Map<String, Template> tasks) {
        this.tasks = tasks;
    }

    public WorkflowTaskSetSpec tasks(Map<String, Template> tasks) {
        this.tasks = tasks;
        return this;
    }
    public WorkflowTaskSetSpec putTasksItem(String key, Template tasksItem) {
           if (this.tasks == null){
                tasks = new HashMap<>();
            }
        this.tasks.put(key, tasksItem);
        return this;
    }

    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class WorkflowTaskSetSpec {\n");

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
    public static class WorkflowTaskSetSpecQueryParam  {

        @jakarta.ws.rs.QueryParam("tasks")
        private Map<String, Template> tasks = null;

        /**
        * Get tasks
        * @return tasks
        **/
        @JsonProperty("tasks")
        public Map<String, Template> getTasks() {
            return tasks;
        }

        /**
         * Set tasks
         **/
        public void setTasks(Map<String, Template> tasks) {
            this.tasks = tasks;
        }

        public WorkflowTaskSetSpecQueryParam tasks(Map<String, Template> tasks) {
            this.tasks = tasks;
            return this;
        }
        public WorkflowTaskSetSpecQueryParam putTasksItem(String key, Template tasksItem) {
            this.tasks.put(key, tasksItem);
            return this;
        }

        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class WorkflowTaskSetSpecQueryParam {\n");

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
