package io.quarkiverse.argocd.events.v1alpha1;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.Type;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class SensorSpec  {

    private List<EventDependency> dependencies;
    private Boolean errorOnFailedRound;
    private String eventBusName;
    private Map<String, String> loggingFields;
    private Integer replicas;
    private Integer revisionHistoryLimit;
    private Template template;
    private List<Trigger> triggers;

    /**
    * Dependencies is a list of the events that this sensor is dependent on.
    * @return dependencies
    **/
    @JsonProperty("dependencies")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public List<EventDependency> getDependencies() {
        return dependencies;
    }

    /**
     * Set dependencies
     **/
    public void setDependencies(List<EventDependency> dependencies) {
        this.dependencies = dependencies;
    }

    public SensorSpec dependencies(List<EventDependency> dependencies) {
        this.dependencies = dependencies;
        return this;
    }
    public SensorSpec addDependenciesItem(EventDependency dependenciesItem) {
        if (this.dependencies == null){
            dependencies = new ArrayList<>();
        }
        this.dependencies.add(dependenciesItem);
        return this;
    }

    /**
    * ErrorOnFailedRound if set to true, marks sensor state as `error` if the previous trigger round fails. Once sensor state is set to `error`, no further triggers will be processed.
    * @return errorOnFailedRound
    **/
    @JsonProperty("errorOnFailedRound")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public Boolean getErrorOnFailedRound() {
        return errorOnFailedRound;
    }

    /**
     * Set errorOnFailedRound
     **/
    public void setErrorOnFailedRound(Boolean errorOnFailedRound) {
        this.errorOnFailedRound = errorOnFailedRound;
    }

    public SensorSpec errorOnFailedRound(Boolean errorOnFailedRound) {
        this.errorOnFailedRound = errorOnFailedRound;
        return this;
    }

    /**
    * Get eventBusName
    * @return eventBusName
    **/
    @JsonProperty("eventBusName")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public String getEventBusName() {
        return eventBusName;
    }

    /**
     * Set eventBusName
     **/
    public void setEventBusName(String eventBusName) {
        this.eventBusName = eventBusName;
    }

    public SensorSpec eventBusName(String eventBusName) {
        this.eventBusName = eventBusName;
        return this;
    }

    /**
    * Get loggingFields
    * @return loggingFields
    **/
    @JsonProperty("loggingFields")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public Map<String, String> getLoggingFields() {
        return loggingFields;
    }

    /**
     * Set loggingFields
     **/
    public void setLoggingFields(Map<String, String> loggingFields) {
        this.loggingFields = loggingFields;
    }

    public SensorSpec loggingFields(Map<String, String> loggingFields) {
        this.loggingFields = loggingFields;
        return this;
    }
    public SensorSpec putLoggingFieldsItem(String key, String loggingFieldsItem) {
           if (this.loggingFields == null){
                loggingFields = new HashMap<>();
            }
        this.loggingFields.put(key, loggingFieldsItem);
        return this;
    }

    /**
    * Get replicas
    * @return replicas
    **/
    @JsonProperty("replicas")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public Integer getReplicas() {
        return replicas;
    }

    /**
     * Set replicas
     **/
    public void setReplicas(Integer replicas) {
        this.replicas = replicas;
    }

    public SensorSpec replicas(Integer replicas) {
        this.replicas = replicas;
        return this;
    }

    /**
    * Get revisionHistoryLimit
    * @return revisionHistoryLimit
    **/
    @JsonProperty("revisionHistoryLimit")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public Integer getRevisionHistoryLimit() {
        return revisionHistoryLimit;
    }

    /**
     * Set revisionHistoryLimit
     **/
    public void setRevisionHistoryLimit(Integer revisionHistoryLimit) {
        this.revisionHistoryLimit = revisionHistoryLimit;
    }

    public SensorSpec revisionHistoryLimit(Integer revisionHistoryLimit) {
        this.revisionHistoryLimit = revisionHistoryLimit;
        return this;
    }

    /**
    * Get template
    * @return template
    **/
    @JsonProperty("template")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public Template getTemplate() {
        return template;
    }

    /**
     * Set template
     **/
    public void setTemplate(Template template) {
        this.template = template;
    }

    public SensorSpec template(Template template) {
        this.template = template;
        return this;
    }

    /**
    * Triggers is a list of the things that this sensor evokes. These are the outputs from this sensor.
    * @return triggers
    **/
    @JsonProperty("triggers")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public List<Trigger> getTriggers() {
        return triggers;
    }

    /**
     * Set triggers
     **/
    public void setTriggers(List<Trigger> triggers) {
        this.triggers = triggers;
    }

    public SensorSpec triggers(List<Trigger> triggers) {
        this.triggers = triggers;
        return this;
    }
    public SensorSpec addTriggersItem(Trigger triggersItem) {
        if (this.triggers == null){
            triggers = new ArrayList<>();
        }
        this.triggers.add(triggersItem);
        return this;
    }

    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SensorSpec {\n");

        sb.append("    dependencies: ").append(toIndentedString(dependencies)).append("\n");
        sb.append("    errorOnFailedRound: ").append(toIndentedString(errorOnFailedRound)).append("\n");
        sb.append("    eventBusName: ").append(toIndentedString(eventBusName)).append("\n");
        sb.append("    loggingFields: ").append(toIndentedString(loggingFields)).append("\n");
        sb.append("    replicas: ").append(toIndentedString(replicas)).append("\n");
        sb.append("    revisionHistoryLimit: ").append(toIndentedString(revisionHistoryLimit)).append("\n");
        sb.append("    template: ").append(toIndentedString(template)).append("\n");
        sb.append("    triggers: ").append(toIndentedString(triggers)).append("\n");
        
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
    public static class SensorSpecQueryParam  {

        @jakarta.ws.rs.QueryParam("dependencies")
        private List<EventDependency> dependencies = null;
        @jakarta.ws.rs.QueryParam("errorOnFailedRound")
        private Boolean errorOnFailedRound;
        @jakarta.ws.rs.QueryParam("eventBusName")
        private String eventBusName;
        @jakarta.ws.rs.QueryParam("loggingFields")
        private Map<String, String> loggingFields = null;
        @jakarta.ws.rs.QueryParam("replicas")
        private Integer replicas;
        @jakarta.ws.rs.QueryParam("revisionHistoryLimit")
        private Integer revisionHistoryLimit;
        @jakarta.ws.rs.QueryParam("template")
        private Template template;
        @jakarta.ws.rs.QueryParam("triggers")
        private List<Trigger> triggers = null;

        /**
        * Dependencies is a list of the events that this sensor is dependent on.
        * @return dependencies
        **/
        @JsonProperty("dependencies")
        public List<EventDependency> getDependencies() {
            return dependencies;
        }

        /**
         * Set dependencies
         **/
        public void setDependencies(List<EventDependency> dependencies) {
            this.dependencies = dependencies;
        }

        public SensorSpecQueryParam dependencies(List<EventDependency> dependencies) {
            this.dependencies = dependencies;
            return this;
        }
        public SensorSpecQueryParam addDependenciesItem(EventDependency dependenciesItem) {
            this.dependencies.add(dependenciesItem);
            return this;
        }

        /**
        * ErrorOnFailedRound if set to true, marks sensor state as `error` if the previous trigger round fails. Once sensor state is set to `error`, no further triggers will be processed.
        * @return errorOnFailedRound
        **/
        @JsonProperty("errorOnFailedRound")
        public Boolean getErrorOnFailedRound() {
            return errorOnFailedRound;
        }

        /**
         * Set errorOnFailedRound
         **/
        public void setErrorOnFailedRound(Boolean errorOnFailedRound) {
            this.errorOnFailedRound = errorOnFailedRound;
        }

        public SensorSpecQueryParam errorOnFailedRound(Boolean errorOnFailedRound) {
            this.errorOnFailedRound = errorOnFailedRound;
            return this;
        }

        /**
        * Get eventBusName
        * @return eventBusName
        **/
        @JsonProperty("eventBusName")
        public String getEventBusName() {
            return eventBusName;
        }

        /**
         * Set eventBusName
         **/
        public void setEventBusName(String eventBusName) {
            this.eventBusName = eventBusName;
        }

        public SensorSpecQueryParam eventBusName(String eventBusName) {
            this.eventBusName = eventBusName;
            return this;
        }

        /**
        * Get loggingFields
        * @return loggingFields
        **/
        @JsonProperty("loggingFields")
        public Map<String, String> getLoggingFields() {
            return loggingFields;
        }

        /**
         * Set loggingFields
         **/
        public void setLoggingFields(Map<String, String> loggingFields) {
            this.loggingFields = loggingFields;
        }

        public SensorSpecQueryParam loggingFields(Map<String, String> loggingFields) {
            this.loggingFields = loggingFields;
            return this;
        }
        public SensorSpecQueryParam putLoggingFieldsItem(String key, String loggingFieldsItem) {
            this.loggingFields.put(key, loggingFieldsItem);
            return this;
        }

        /**
        * Get replicas
        * @return replicas
        **/
        @JsonProperty("replicas")
        public Integer getReplicas() {
            return replicas;
        }

        /**
         * Set replicas
         **/
        public void setReplicas(Integer replicas) {
            this.replicas = replicas;
        }

        public SensorSpecQueryParam replicas(Integer replicas) {
            this.replicas = replicas;
            return this;
        }

        /**
        * Get revisionHistoryLimit
        * @return revisionHistoryLimit
        **/
        @JsonProperty("revisionHistoryLimit")
        public Integer getRevisionHistoryLimit() {
            return revisionHistoryLimit;
        }

        /**
         * Set revisionHistoryLimit
         **/
        public void setRevisionHistoryLimit(Integer revisionHistoryLimit) {
            this.revisionHistoryLimit = revisionHistoryLimit;
        }

        public SensorSpecQueryParam revisionHistoryLimit(Integer revisionHistoryLimit) {
            this.revisionHistoryLimit = revisionHistoryLimit;
            return this;
        }

        /**
        * Get template
        * @return template
        **/
        @JsonProperty("template")
        public Template getTemplate() {
            return template;
        }

        /**
         * Set template
         **/
        public void setTemplate(Template template) {
            this.template = template;
        }

        public SensorSpecQueryParam template(Template template) {
            this.template = template;
            return this;
        }

        /**
        * Triggers is a list of the things that this sensor evokes. These are the outputs from this sensor.
        * @return triggers
        **/
        @JsonProperty("triggers")
        public List<Trigger> getTriggers() {
            return triggers;
        }

        /**
         * Set triggers
         **/
        public void setTriggers(List<Trigger> triggers) {
            this.triggers = triggers;
        }

        public SensorSpecQueryParam triggers(List<Trigger> triggers) {
            this.triggers = triggers;
            return this;
        }
        public SensorSpecQueryParam addTriggersItem(Trigger triggersItem) {
            this.triggers.add(triggersItem);
            return this;
        }

        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class SensorSpecQueryParam {\n");

            sb.append("    dependencies: ").append(toIndentedString(dependencies)).append("\n");
            sb.append("    errorOnFailedRound: ").append(toIndentedString(errorOnFailedRound)).append("\n");
            sb.append("    eventBusName: ").append(toIndentedString(eventBusName)).append("\n");
            sb.append("    loggingFields: ").append(toIndentedString(loggingFields)).append("\n");
            sb.append("    replicas: ").append(toIndentedString(replicas)).append("\n");
            sb.append("    revisionHistoryLimit: ").append(toIndentedString(revisionHistoryLimit)).append("\n");
            sb.append("    template: ").append(toIndentedString(template)).append("\n");
            sb.append("    triggers: ").append(toIndentedString(triggers)).append("\n");
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
