package io.quarkiverse.argocd.workflow.v1alpha1;

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
/**
  * DAGTask represents a node in the graph during DAG execution
 **/
public class DAGTask  {

    /**
      * DAGTask represents a node in the graph during DAG execution
     **/
    private Arguments arguments;
    /**
      * DAGTask represents a node in the graph during DAG execution
     **/
    private ContinueOn continueOn;
    /**
      * DAGTask represents a node in the graph during DAG execution
     **/
    private List<String> dependencies;
    /**
      * DAGTask represents a node in the graph during DAG execution
     **/
    private String depends;
    /**
      * DAGTask represents a node in the graph during DAG execution
     **/
    private Map<String, LifecycleHook> hooks;
    /**
      * DAGTask represents a node in the graph during DAG execution
     **/
    private Template inline;
    /**
      * DAGTask represents a node in the graph during DAG execution
     **/
    private String name;
    /**
      * DAGTask represents a node in the graph during DAG execution
     **/
    private String onExit;
    /**
      * DAGTask represents a node in the graph during DAG execution
     **/
    private String template;
    /**
      * DAGTask represents a node in the graph during DAG execution
     **/
    private TemplateRef templateRef;
    /**
      * DAGTask represents a node in the graph during DAG execution
     **/
    private String when;
    /**
      * DAGTask represents a node in the graph during DAG execution
     **/
    private List<Object> withItems;
    /**
      * DAGTask represents a node in the graph during DAG execution
     **/
    private String withParam;
    /**
      * DAGTask represents a node in the graph during DAG execution
     **/
    private Sequence withSequence;

    /**
    * Get arguments
    * @return arguments
    **/
    @JsonProperty("arguments")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public Arguments getArguments() {
        return arguments;
    }

    /**
     * Set arguments
     **/
    public void setArguments(Arguments arguments) {
        this.arguments = arguments;
    }

    public DAGTask arguments(Arguments arguments) {
        this.arguments = arguments;
        return this;
    }

    /**
    * Get continueOn
    * @return continueOn
    **/
    @JsonProperty("continueOn")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public ContinueOn getContinueOn() {
        return continueOn;
    }

    /**
     * Set continueOn
     **/
    public void setContinueOn(ContinueOn continueOn) {
        this.continueOn = continueOn;
    }

    public DAGTask continueOn(ContinueOn continueOn) {
        this.continueOn = continueOn;
        return this;
    }

    /**
    * Dependencies are name of other targets which this depends on
    * @return dependencies
    **/
    @JsonProperty("dependencies")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public List<String> getDependencies() {
        return dependencies;
    }

    /**
     * Set dependencies
     **/
    public void setDependencies(List<String> dependencies) {
        this.dependencies = dependencies;
    }

    public DAGTask dependencies(List<String> dependencies) {
        this.dependencies = dependencies;
        return this;
    }
    public DAGTask addDependenciesItem(String dependenciesItem) {
        if (this.dependencies == null){
            dependencies = new ArrayList<>();
        }
        this.dependencies.add(dependenciesItem);
        return this;
    }

    /**
    * Depends are name of other targets which this depends on
    * @return depends
    **/
    @JsonProperty("depends")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public String getDepends() {
        return depends;
    }

    /**
     * Set depends
     **/
    public void setDepends(String depends) {
        this.depends = depends;
    }

    public DAGTask depends(String depends) {
        this.depends = depends;
        return this;
    }

    /**
    * Hooks hold the lifecycle hook which is invoked at lifecycle of task, irrespective of the success, failure, or error status of the primary task
    * @return hooks
    **/
    @JsonProperty("hooks")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public Map<String, LifecycleHook> getHooks() {
        return hooks;
    }

    /**
     * Set hooks
     **/
    public void setHooks(Map<String, LifecycleHook> hooks) {
        this.hooks = hooks;
    }

    public DAGTask hooks(Map<String, LifecycleHook> hooks) {
        this.hooks = hooks;
        return this;
    }
    public DAGTask putHooksItem(String key, LifecycleHook hooksItem) {
           if (this.hooks == null){
                hooks = new HashMap<>();
            }
        this.hooks.put(key, hooksItem);
        return this;
    }

    /**
    * Get inline
    * @return inline
    **/
    @JsonProperty("inline")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public Template getInline() {
        return inline;
    }

    /**
     * Set inline
     **/
    public void setInline(Template inline) {
        this.inline = inline;
    }

    public DAGTask inline(Template inline) {
        this.inline = inline;
        return this;
    }

    /**
    * Name is the name of the target
    * @return name
    **/
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    /**
     * Set name
     **/
    public void setName(String name) {
        this.name = name;
    }

    public DAGTask name(String name) {
        this.name = name;
        return this;
    }

    /**
    * OnExit is a template reference which is invoked at the end of the template, irrespective of the success, failure, or error of the primary template. DEPRECATED: Use Hooks[exit].Template instead.
    * @return onExit
    **/
    @JsonProperty("onExit")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public String getOnExit() {
        return onExit;
    }

    /**
     * Set onExit
     **/
    public void setOnExit(String onExit) {
        this.onExit = onExit;
    }

    public DAGTask onExit(String onExit) {
        this.onExit = onExit;
        return this;
    }

    /**
    * Name of template to execute
    * @return template
    **/
    @JsonProperty("template")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public String getTemplate() {
        return template;
    }

    /**
     * Set template
     **/
    public void setTemplate(String template) {
        this.template = template;
    }

    public DAGTask template(String template) {
        this.template = template;
        return this;
    }

    /**
    * Get templateRef
    * @return templateRef
    **/
    @JsonProperty("templateRef")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public TemplateRef getTemplateRef() {
        return templateRef;
    }

    /**
     * Set templateRef
     **/
    public void setTemplateRef(TemplateRef templateRef) {
        this.templateRef = templateRef;
    }

    public DAGTask templateRef(TemplateRef templateRef) {
        this.templateRef = templateRef;
        return this;
    }

    /**
    * When is an expression in which the task should conditionally execute
    * @return when
    **/
    @JsonProperty("when")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public String getWhen() {
        return when;
    }

    /**
     * Set when
     **/
    public void setWhen(String when) {
        this.when = when;
    }

    public DAGTask when(String when) {
        this.when = when;
        return this;
    }

    /**
    * WithItems expands a task into multiple parallel tasks from the items in the list
    * @return withItems
    **/
    @JsonProperty("withItems")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public List<Object> getWithItems() {
        return withItems;
    }

    /**
     * Set withItems
     **/
    public void setWithItems(List<Object> withItems) {
        this.withItems = withItems;
    }

    public DAGTask withItems(List<Object> withItems) {
        this.withItems = withItems;
        return this;
    }
    public DAGTask addWithItemsItem(Object withItemsItem) {
        if (this.withItems == null){
            withItems = new ArrayList<>();
        }
        this.withItems.add(withItemsItem);
        return this;
    }

    /**
    * WithParam expands a task into multiple parallel tasks from the value in the parameter, which is expected to be a JSON list.
    * @return withParam
    **/
    @JsonProperty("withParam")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public String getWithParam() {
        return withParam;
    }

    /**
     * Set withParam
     **/
    public void setWithParam(String withParam) {
        this.withParam = withParam;
    }

    public DAGTask withParam(String withParam) {
        this.withParam = withParam;
        return this;
    }

    /**
    * Get withSequence
    * @return withSequence
    **/
    @JsonProperty("withSequence")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public Sequence getWithSequence() {
        return withSequence;
    }

    /**
     * Set withSequence
     **/
    public void setWithSequence(Sequence withSequence) {
        this.withSequence = withSequence;
    }

    public DAGTask withSequence(Sequence withSequence) {
        this.withSequence = withSequence;
        return this;
    }

    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DAGTask {\n");

        sb.append("    arguments: ").append(toIndentedString(arguments)).append("\n");
        sb.append("    continueOn: ").append(toIndentedString(continueOn)).append("\n");
        sb.append("    dependencies: ").append(toIndentedString(dependencies)).append("\n");
        sb.append("    depends: ").append(toIndentedString(depends)).append("\n");
        sb.append("    hooks: ").append(toIndentedString(hooks)).append("\n");
        sb.append("    inline: ").append(toIndentedString(inline)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    onExit: ").append(toIndentedString(onExit)).append("\n");
        sb.append("    template: ").append(toIndentedString(template)).append("\n");
        sb.append("    templateRef: ").append(toIndentedString(templateRef)).append("\n");
        sb.append("    when: ").append(toIndentedString(when)).append("\n");
        sb.append("    withItems: ").append(toIndentedString(withItems)).append("\n");
        sb.append("    withParam: ").append(toIndentedString(withParam)).append("\n");
        sb.append("    withSequence: ").append(toIndentedString(withSequence)).append("\n");
        
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
      * DAGTask represents a node in the graph during DAG execution
     **/
    public static class DAGTaskQueryParam  {

        /**
          * DAGTask represents a node in the graph during DAG execution
         **/
        @jakarta.ws.rs.QueryParam("arguments")
        private Arguments arguments;
        /**
          * DAGTask represents a node in the graph during DAG execution
         **/
        @jakarta.ws.rs.QueryParam("continueOn")
        private ContinueOn continueOn;
        /**
          * DAGTask represents a node in the graph during DAG execution
         **/
        @jakarta.ws.rs.QueryParam("dependencies")
        private List<String> dependencies = null;
        /**
          * DAGTask represents a node in the graph during DAG execution
         **/
        @jakarta.ws.rs.QueryParam("depends")
        private String depends;
        /**
          * DAGTask represents a node in the graph during DAG execution
         **/
        @jakarta.ws.rs.QueryParam("hooks")
        private Map<String, LifecycleHook> hooks = null;
        /**
          * DAGTask represents a node in the graph during DAG execution
         **/
        @jakarta.ws.rs.QueryParam("inline")
        private Template inline;
        /**
          * DAGTask represents a node in the graph during DAG execution
         **/
        @jakarta.ws.rs.QueryParam("name")
        private String name;
        /**
          * DAGTask represents a node in the graph during DAG execution
         **/
        @jakarta.ws.rs.QueryParam("onExit")
        private String onExit;
        /**
          * DAGTask represents a node in the graph during DAG execution
         **/
        @jakarta.ws.rs.QueryParam("template")
        private String template;
        /**
          * DAGTask represents a node in the graph during DAG execution
         **/
        @jakarta.ws.rs.QueryParam("templateRef")
        private TemplateRef templateRef;
        /**
          * DAGTask represents a node in the graph during DAG execution
         **/
        @jakarta.ws.rs.QueryParam("when")
        private String when;
        /**
          * DAGTask represents a node in the graph during DAG execution
         **/
        @jakarta.ws.rs.QueryParam("withItems")
        private List<Object> withItems = null;
        /**
          * DAGTask represents a node in the graph during DAG execution
         **/
        @jakarta.ws.rs.QueryParam("withParam")
        private String withParam;
        /**
          * DAGTask represents a node in the graph during DAG execution
         **/
        @jakarta.ws.rs.QueryParam("withSequence")
        private Sequence withSequence;

        /**
        * Get arguments
        * @return arguments
        **/
        @JsonProperty("arguments")
        public Arguments getArguments() {
            return arguments;
        }

        /**
         * Set arguments
         **/
        public void setArguments(Arguments arguments) {
            this.arguments = arguments;
        }

        public DAGTaskQueryParam arguments(Arguments arguments) {
            this.arguments = arguments;
            return this;
        }

        /**
        * Get continueOn
        * @return continueOn
        **/
        @JsonProperty("continueOn")
        public ContinueOn getContinueOn() {
            return continueOn;
        }

        /**
         * Set continueOn
         **/
        public void setContinueOn(ContinueOn continueOn) {
            this.continueOn = continueOn;
        }

        public DAGTaskQueryParam continueOn(ContinueOn continueOn) {
            this.continueOn = continueOn;
            return this;
        }

        /**
        * Dependencies are name of other targets which this depends on
        * @return dependencies
        **/
        @JsonProperty("dependencies")
        public List<String> getDependencies() {
            return dependencies;
        }

        /**
         * Set dependencies
         **/
        public void setDependencies(List<String> dependencies) {
            this.dependencies = dependencies;
        }

        public DAGTaskQueryParam dependencies(List<String> dependencies) {
            this.dependencies = dependencies;
            return this;
        }
        public DAGTaskQueryParam addDependenciesItem(String dependenciesItem) {
            this.dependencies.add(dependenciesItem);
            return this;
        }

        /**
        * Depends are name of other targets which this depends on
        * @return depends
        **/
        @JsonProperty("depends")
        public String getDepends() {
            return depends;
        }

        /**
         * Set depends
         **/
        public void setDepends(String depends) {
            this.depends = depends;
        }

        public DAGTaskQueryParam depends(String depends) {
            this.depends = depends;
            return this;
        }

        /**
        * Hooks hold the lifecycle hook which is invoked at lifecycle of task, irrespective of the success, failure, or error status of the primary task
        * @return hooks
        **/
        @JsonProperty("hooks")
        public Map<String, LifecycleHook> getHooks() {
            return hooks;
        }

        /**
         * Set hooks
         **/
        public void setHooks(Map<String, LifecycleHook> hooks) {
            this.hooks = hooks;
        }

        public DAGTaskQueryParam hooks(Map<String, LifecycleHook> hooks) {
            this.hooks = hooks;
            return this;
        }
        public DAGTaskQueryParam putHooksItem(String key, LifecycleHook hooksItem) {
            this.hooks.put(key, hooksItem);
            return this;
        }

        /**
        * Get inline
        * @return inline
        **/
        @JsonProperty("inline")
        public Template getInline() {
            return inline;
        }

        /**
         * Set inline
         **/
        public void setInline(Template inline) {
            this.inline = inline;
        }

        public DAGTaskQueryParam inline(Template inline) {
            this.inline = inline;
            return this;
        }

        /**
        * Name is the name of the target
        * @return name
        **/
        @JsonProperty("name")
        public String getName() {
            return name;
        }

        /**
         * Set name
         **/
        public void setName(String name) {
            this.name = name;
        }

        public DAGTaskQueryParam name(String name) {
            this.name = name;
            return this;
        }

        /**
        * OnExit is a template reference which is invoked at the end of the template, irrespective of the success, failure, or error of the primary template. DEPRECATED: Use Hooks[exit].Template instead.
        * @return onExit
        **/
        @JsonProperty("onExit")
        public String getOnExit() {
            return onExit;
        }

        /**
         * Set onExit
         **/
        public void setOnExit(String onExit) {
            this.onExit = onExit;
        }

        public DAGTaskQueryParam onExit(String onExit) {
            this.onExit = onExit;
            return this;
        }

        /**
        * Name of template to execute
        * @return template
        **/
        @JsonProperty("template")
        public String getTemplate() {
            return template;
        }

        /**
         * Set template
         **/
        public void setTemplate(String template) {
            this.template = template;
        }

        public DAGTaskQueryParam template(String template) {
            this.template = template;
            return this;
        }

        /**
        * Get templateRef
        * @return templateRef
        **/
        @JsonProperty("templateRef")
        public TemplateRef getTemplateRef() {
            return templateRef;
        }

        /**
         * Set templateRef
         **/
        public void setTemplateRef(TemplateRef templateRef) {
            this.templateRef = templateRef;
        }

        public DAGTaskQueryParam templateRef(TemplateRef templateRef) {
            this.templateRef = templateRef;
            return this;
        }

        /**
        * When is an expression in which the task should conditionally execute
        * @return when
        **/
        @JsonProperty("when")
        public String getWhen() {
            return when;
        }

        /**
         * Set when
         **/
        public void setWhen(String when) {
            this.when = when;
        }

        public DAGTaskQueryParam when(String when) {
            this.when = when;
            return this;
        }

        /**
        * WithItems expands a task into multiple parallel tasks from the items in the list
        * @return withItems
        **/
        @JsonProperty("withItems")
        public List<Object> getWithItems() {
            return withItems;
        }

        /**
         * Set withItems
         **/
        public void setWithItems(List<Object> withItems) {
            this.withItems = withItems;
        }

        public DAGTaskQueryParam withItems(List<Object> withItems) {
            this.withItems = withItems;
            return this;
        }
        public DAGTaskQueryParam addWithItemsItem(Object withItemsItem) {
            this.withItems.add(withItemsItem);
            return this;
        }

        /**
        * WithParam expands a task into multiple parallel tasks from the value in the parameter, which is expected to be a JSON list.
        * @return withParam
        **/
        @JsonProperty("withParam")
        public String getWithParam() {
            return withParam;
        }

        /**
         * Set withParam
         **/
        public void setWithParam(String withParam) {
            this.withParam = withParam;
        }

        public DAGTaskQueryParam withParam(String withParam) {
            this.withParam = withParam;
            return this;
        }

        /**
        * Get withSequence
        * @return withSequence
        **/
        @JsonProperty("withSequence")
        public Sequence getWithSequence() {
            return withSequence;
        }

        /**
         * Set withSequence
         **/
        public void setWithSequence(Sequence withSequence) {
            this.withSequence = withSequence;
        }

        public DAGTaskQueryParam withSequence(Sequence withSequence) {
            this.withSequence = withSequence;
            return this;
        }

        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class DAGTaskQueryParam {\n");

            sb.append("    arguments: ").append(toIndentedString(arguments)).append("\n");
            sb.append("    continueOn: ").append(toIndentedString(continueOn)).append("\n");
            sb.append("    dependencies: ").append(toIndentedString(dependencies)).append("\n");
            sb.append("    depends: ").append(toIndentedString(depends)).append("\n");
            sb.append("    hooks: ").append(toIndentedString(hooks)).append("\n");
            sb.append("    inline: ").append(toIndentedString(inline)).append("\n");
            sb.append("    name: ").append(toIndentedString(name)).append("\n");
            sb.append("    onExit: ").append(toIndentedString(onExit)).append("\n");
            sb.append("    template: ").append(toIndentedString(template)).append("\n");
            sb.append("    templateRef: ").append(toIndentedString(templateRef)).append("\n");
            sb.append("    when: ").append(toIndentedString(when)).append("\n");
            sb.append("    withItems: ").append(toIndentedString(withItems)).append("\n");
            sb.append("    withParam: ").append(toIndentedString(withParam)).append("\n");
            sb.append("    withSequence: ").append(toIndentedString(withSequence)).append("\n");
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
