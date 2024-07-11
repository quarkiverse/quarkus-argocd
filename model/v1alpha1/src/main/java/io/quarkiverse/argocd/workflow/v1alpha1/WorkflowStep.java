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
  * WorkflowStep is a reference to a template to execute in a series of step
 **/
public class WorkflowStep  {

    /**
      * WorkflowStep is a reference to a template to execute in a series of step
     **/
    private Arguments arguments;
    /**
      * WorkflowStep is a reference to a template to execute in a series of step
     **/
    private ContinueOn continueOn;
    /**
      * WorkflowStep is a reference to a template to execute in a series of step
     **/
    private Map<String, LifecycleHook> hooks;
    /**
      * WorkflowStep is a reference to a template to execute in a series of step
     **/
    private Template inline;
    /**
      * WorkflowStep is a reference to a template to execute in a series of step
     **/
    private String name;
    /**
      * WorkflowStep is a reference to a template to execute in a series of step
     **/
    private String onExit;
    /**
      * WorkflowStep is a reference to a template to execute in a series of step
     **/
    private String template;
    /**
      * WorkflowStep is a reference to a template to execute in a series of step
     **/
    private TemplateRef templateRef;
    /**
      * WorkflowStep is a reference to a template to execute in a series of step
     **/
    private String when;
    /**
      * WorkflowStep is a reference to a template to execute in a series of step
     **/
    private List<Object> withItems;
    /**
      * WorkflowStep is a reference to a template to execute in a series of step
     **/
    private String withParam;
    /**
      * WorkflowStep is a reference to a template to execute in a series of step
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

    public WorkflowStep arguments(Arguments arguments) {
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

    public WorkflowStep continueOn(ContinueOn continueOn) {
        this.continueOn = continueOn;
        return this;
    }

    /**
    * Hooks holds the lifecycle hook which is invoked at lifecycle of step, irrespective of the success, failure, or error status of the primary step
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

    public WorkflowStep hooks(Map<String, LifecycleHook> hooks) {
        this.hooks = hooks;
        return this;
    }
    public WorkflowStep putHooksItem(String key, LifecycleHook hooksItem) {
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

    public WorkflowStep inline(Template inline) {
        this.inline = inline;
        return this;
    }

    /**
    * Name of the step
    * @return name
    **/
    @JsonProperty("name")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public String getName() {
        return name;
    }

    /**
     * Set name
     **/
    public void setName(String name) {
        this.name = name;
    }

    public WorkflowStep name(String name) {
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

    public WorkflowStep onExit(String onExit) {
        this.onExit = onExit;
        return this;
    }

    /**
    * Template is the name of the template to execute as the step
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

    public WorkflowStep template(String template) {
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

    public WorkflowStep templateRef(TemplateRef templateRef) {
        this.templateRef = templateRef;
        return this;
    }

    /**
    * When is an expression in which the step should conditionally execute
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

    public WorkflowStep when(String when) {
        this.when = when;
        return this;
    }

    /**
    * WithItems expands a step into multiple parallel steps from the items in the list
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

    public WorkflowStep withItems(List<Object> withItems) {
        this.withItems = withItems;
        return this;
    }
    public WorkflowStep addWithItemsItem(Object withItemsItem) {
        if (this.withItems == null){
            withItems = new ArrayList<>();
        }
        this.withItems.add(withItemsItem);
        return this;
    }

    /**
    * WithParam expands a step into multiple parallel steps from the value in the parameter, which is expected to be a JSON list.
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

    public WorkflowStep withParam(String withParam) {
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

    public WorkflowStep withSequence(Sequence withSequence) {
        this.withSequence = withSequence;
        return this;
    }

    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class WorkflowStep {\n");

        sb.append("    arguments: ").append(toIndentedString(arguments)).append("\n");
        sb.append("    continueOn: ").append(toIndentedString(continueOn)).append("\n");
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
      * WorkflowStep is a reference to a template to execute in a series of step
     **/
    public static class WorkflowStepQueryParam  {

        /**
          * WorkflowStep is a reference to a template to execute in a series of step
         **/
        @jakarta.ws.rs.QueryParam("arguments")
        private Arguments arguments;
        /**
          * WorkflowStep is a reference to a template to execute in a series of step
         **/
        @jakarta.ws.rs.QueryParam("continueOn")
        private ContinueOn continueOn;
        /**
          * WorkflowStep is a reference to a template to execute in a series of step
         **/
        @jakarta.ws.rs.QueryParam("hooks")
        private Map<String, LifecycleHook> hooks = null;
        /**
          * WorkflowStep is a reference to a template to execute in a series of step
         **/
        @jakarta.ws.rs.QueryParam("inline")
        private Template inline;
        /**
          * WorkflowStep is a reference to a template to execute in a series of step
         **/
        @jakarta.ws.rs.QueryParam("name")
        private String name;
        /**
          * WorkflowStep is a reference to a template to execute in a series of step
         **/
        @jakarta.ws.rs.QueryParam("onExit")
        private String onExit;
        /**
          * WorkflowStep is a reference to a template to execute in a series of step
         **/
        @jakarta.ws.rs.QueryParam("template")
        private String template;
        /**
          * WorkflowStep is a reference to a template to execute in a series of step
         **/
        @jakarta.ws.rs.QueryParam("templateRef")
        private TemplateRef templateRef;
        /**
          * WorkflowStep is a reference to a template to execute in a series of step
         **/
        @jakarta.ws.rs.QueryParam("when")
        private String when;
        /**
          * WorkflowStep is a reference to a template to execute in a series of step
         **/
        @jakarta.ws.rs.QueryParam("withItems")
        private List<Object> withItems = null;
        /**
          * WorkflowStep is a reference to a template to execute in a series of step
         **/
        @jakarta.ws.rs.QueryParam("withParam")
        private String withParam;
        /**
          * WorkflowStep is a reference to a template to execute in a series of step
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

        public WorkflowStepQueryParam arguments(Arguments arguments) {
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

        public WorkflowStepQueryParam continueOn(ContinueOn continueOn) {
            this.continueOn = continueOn;
            return this;
        }

        /**
        * Hooks holds the lifecycle hook which is invoked at lifecycle of step, irrespective of the success, failure, or error status of the primary step
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

        public WorkflowStepQueryParam hooks(Map<String, LifecycleHook> hooks) {
            this.hooks = hooks;
            return this;
        }
        public WorkflowStepQueryParam putHooksItem(String key, LifecycleHook hooksItem) {
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

        public WorkflowStepQueryParam inline(Template inline) {
            this.inline = inline;
            return this;
        }

        /**
        * Name of the step
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

        public WorkflowStepQueryParam name(String name) {
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

        public WorkflowStepQueryParam onExit(String onExit) {
            this.onExit = onExit;
            return this;
        }

        /**
        * Template is the name of the template to execute as the step
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

        public WorkflowStepQueryParam template(String template) {
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

        public WorkflowStepQueryParam templateRef(TemplateRef templateRef) {
            this.templateRef = templateRef;
            return this;
        }

        /**
        * When is an expression in which the step should conditionally execute
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

        public WorkflowStepQueryParam when(String when) {
            this.when = when;
            return this;
        }

        /**
        * WithItems expands a step into multiple parallel steps from the items in the list
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

        public WorkflowStepQueryParam withItems(List<Object> withItems) {
            this.withItems = withItems;
            return this;
        }
        public WorkflowStepQueryParam addWithItemsItem(Object withItemsItem) {
            this.withItems.add(withItemsItem);
            return this;
        }

        /**
        * WithParam expands a step into multiple parallel steps from the value in the parameter, which is expected to be a JSON list.
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

        public WorkflowStepQueryParam withParam(String withParam) {
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

        public WorkflowStepQueryParam withSequence(Sequence withSequence) {
            this.withSequence = withSequence;
            return this;
        }

        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class WorkflowStepQueryParam {\n");

            sb.append("    arguments: ").append(toIndentedString(arguments)).append("\n");
            sb.append("    continueOn: ").append(toIndentedString(continueOn)).append("\n");
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
