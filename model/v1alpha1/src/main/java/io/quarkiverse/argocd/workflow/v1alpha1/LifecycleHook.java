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
public class LifecycleHook  {

    private Arguments arguments;
    private String expression;
    private String template;
    private TemplateRef templateRef;

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

    public LifecycleHook arguments(Arguments arguments) {
        this.arguments = arguments;
        return this;
    }

    /**
    * Expression is a condition expression for when a node will be retried. If it evaluates to false, the node will not be retried and the retry strategy will be ignored
    * @return expression
    **/
    @JsonProperty("expression")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public String getExpression() {
        return expression;
    }

    /**
     * Set expression
     **/
    public void setExpression(String expression) {
        this.expression = expression;
    }

    public LifecycleHook expression(String expression) {
        this.expression = expression;
        return this;
    }

    /**
    * Template is the name of the template to execute by the hook
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

    public LifecycleHook template(String template) {
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

    public LifecycleHook templateRef(TemplateRef templateRef) {
        this.templateRef = templateRef;
        return this;
    }

    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class LifecycleHook {\n");

        sb.append("    arguments: ").append(toIndentedString(arguments)).append("\n");
        sb.append("    expression: ").append(toIndentedString(expression)).append("\n");
        sb.append("    template: ").append(toIndentedString(template)).append("\n");
        sb.append("    templateRef: ").append(toIndentedString(templateRef)).append("\n");
        
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
    public static class LifecycleHookQueryParam  {

        @jakarta.ws.rs.QueryParam("arguments")
        private Arguments arguments;
        @jakarta.ws.rs.QueryParam("expression")
        private String expression;
        @jakarta.ws.rs.QueryParam("template")
        private String template;
        @jakarta.ws.rs.QueryParam("templateRef")
        private TemplateRef templateRef;

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

        public LifecycleHookQueryParam arguments(Arguments arguments) {
            this.arguments = arguments;
            return this;
        }

        /**
        * Expression is a condition expression for when a node will be retried. If it evaluates to false, the node will not be retried and the retry strategy will be ignored
        * @return expression
        **/
        @JsonProperty("expression")
        public String getExpression() {
            return expression;
        }

        /**
         * Set expression
         **/
        public void setExpression(String expression) {
            this.expression = expression;
        }

        public LifecycleHookQueryParam expression(String expression) {
            this.expression = expression;
            return this;
        }

        /**
        * Template is the name of the template to execute by the hook
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

        public LifecycleHookQueryParam template(String template) {
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

        public LifecycleHookQueryParam templateRef(TemplateRef templateRef) {
            this.templateRef = templateRef;
            return this;
        }

        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class LifecycleHookQueryParam {\n");

            sb.append("    arguments: ").append(toIndentedString(arguments)).append("\n");
            sb.append("    expression: ").append(toIndentedString(expression)).append("\n");
            sb.append("    template: ").append(toIndentedString(template)).append("\n");
            sb.append("    templateRef: ").append(toIndentedString(templateRef)).append("\n");
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
