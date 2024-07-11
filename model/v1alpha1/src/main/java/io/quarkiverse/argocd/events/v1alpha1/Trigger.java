package io.quarkiverse.argocd.events.v1alpha1;

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
public class Trigger  {

    private Boolean atLeastOnce;
    private List<TriggerParameter> parameters;
    private TriggerPolicy policy;
    private RateLimit rateLimit;
    private Backoff retryStrategy;
    private TriggerTemplate template;

    /**
    * Get atLeastOnce
    * @return atLeastOnce
    **/
    @JsonProperty("atLeastOnce")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public Boolean getAtLeastOnce() {
        return atLeastOnce;
    }

    /**
     * Set atLeastOnce
     **/
    public void setAtLeastOnce(Boolean atLeastOnce) {
        this.atLeastOnce = atLeastOnce;
    }

    public Trigger atLeastOnce(Boolean atLeastOnce) {
        this.atLeastOnce = atLeastOnce;
        return this;
    }

    /**
    * Get parameters
    * @return parameters
    **/
    @JsonProperty("parameters")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public List<TriggerParameter> getParameters() {
        return parameters;
    }

    /**
     * Set parameters
     **/
    public void setParameters(List<TriggerParameter> parameters) {
        this.parameters = parameters;
    }

    public Trigger parameters(List<TriggerParameter> parameters) {
        this.parameters = parameters;
        return this;
    }
    public Trigger addParametersItem(TriggerParameter parametersItem) {
        if (this.parameters == null){
            parameters = new ArrayList<>();
        }
        this.parameters.add(parametersItem);
        return this;
    }

    /**
    * Get policy
    * @return policy
    **/
    @JsonProperty("policy")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public TriggerPolicy getPolicy() {
        return policy;
    }

    /**
     * Set policy
     **/
    public void setPolicy(TriggerPolicy policy) {
        this.policy = policy;
    }

    public Trigger policy(TriggerPolicy policy) {
        this.policy = policy;
        return this;
    }

    /**
    * Get rateLimit
    * @return rateLimit
    **/
    @JsonProperty("rateLimit")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public RateLimit getRateLimit() {
        return rateLimit;
    }

    /**
     * Set rateLimit
     **/
    public void setRateLimit(RateLimit rateLimit) {
        this.rateLimit = rateLimit;
    }

    public Trigger rateLimit(RateLimit rateLimit) {
        this.rateLimit = rateLimit;
        return this;
    }

    /**
    * Get retryStrategy
    * @return retryStrategy
    **/
    @JsonProperty("retryStrategy")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public Backoff getRetryStrategy() {
        return retryStrategy;
    }

    /**
     * Set retryStrategy
     **/
    public void setRetryStrategy(Backoff retryStrategy) {
        this.retryStrategy = retryStrategy;
    }

    public Trigger retryStrategy(Backoff retryStrategy) {
        this.retryStrategy = retryStrategy;
        return this;
    }

    /**
    * Get template
    * @return template
    **/
    @JsonProperty("template")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public TriggerTemplate getTemplate() {
        return template;
    }

    /**
     * Set template
     **/
    public void setTemplate(TriggerTemplate template) {
        this.template = template;
    }

    public Trigger template(TriggerTemplate template) {
        this.template = template;
        return this;
    }

    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Trigger {\n");

        sb.append("    atLeastOnce: ").append(toIndentedString(atLeastOnce)).append("\n");
        sb.append("    parameters: ").append(toIndentedString(parameters)).append("\n");
        sb.append("    policy: ").append(toIndentedString(policy)).append("\n");
        sb.append("    rateLimit: ").append(toIndentedString(rateLimit)).append("\n");
        sb.append("    retryStrategy: ").append(toIndentedString(retryStrategy)).append("\n");
        sb.append("    template: ").append(toIndentedString(template)).append("\n");
        
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
    public static class TriggerQueryParam  {

        @jakarta.ws.rs.QueryParam("atLeastOnce")
        private Boolean atLeastOnce;
        @jakarta.ws.rs.QueryParam("parameters")
        private List<TriggerParameter> parameters = null;
        @jakarta.ws.rs.QueryParam("policy")
        private TriggerPolicy policy;
        @jakarta.ws.rs.QueryParam("rateLimit")
        private RateLimit rateLimit;
        @jakarta.ws.rs.QueryParam("retryStrategy")
        private Backoff retryStrategy;
        @jakarta.ws.rs.QueryParam("template")
        private TriggerTemplate template;

        /**
        * Get atLeastOnce
        * @return atLeastOnce
        **/
        @JsonProperty("atLeastOnce")
        public Boolean getAtLeastOnce() {
            return atLeastOnce;
        }

        /**
         * Set atLeastOnce
         **/
        public void setAtLeastOnce(Boolean atLeastOnce) {
            this.atLeastOnce = atLeastOnce;
        }

        public TriggerQueryParam atLeastOnce(Boolean atLeastOnce) {
            this.atLeastOnce = atLeastOnce;
            return this;
        }

        /**
        * Get parameters
        * @return parameters
        **/
        @JsonProperty("parameters")
        public List<TriggerParameter> getParameters() {
            return parameters;
        }

        /**
         * Set parameters
         **/
        public void setParameters(List<TriggerParameter> parameters) {
            this.parameters = parameters;
        }

        public TriggerQueryParam parameters(List<TriggerParameter> parameters) {
            this.parameters = parameters;
            return this;
        }
        public TriggerQueryParam addParametersItem(TriggerParameter parametersItem) {
            this.parameters.add(parametersItem);
            return this;
        }

        /**
        * Get policy
        * @return policy
        **/
        @JsonProperty("policy")
        public TriggerPolicy getPolicy() {
            return policy;
        }

        /**
         * Set policy
         **/
        public void setPolicy(TriggerPolicy policy) {
            this.policy = policy;
        }

        public TriggerQueryParam policy(TriggerPolicy policy) {
            this.policy = policy;
            return this;
        }

        /**
        * Get rateLimit
        * @return rateLimit
        **/
        @JsonProperty("rateLimit")
        public RateLimit getRateLimit() {
            return rateLimit;
        }

        /**
         * Set rateLimit
         **/
        public void setRateLimit(RateLimit rateLimit) {
            this.rateLimit = rateLimit;
        }

        public TriggerQueryParam rateLimit(RateLimit rateLimit) {
            this.rateLimit = rateLimit;
            return this;
        }

        /**
        * Get retryStrategy
        * @return retryStrategy
        **/
        @JsonProperty("retryStrategy")
        public Backoff getRetryStrategy() {
            return retryStrategy;
        }

        /**
         * Set retryStrategy
         **/
        public void setRetryStrategy(Backoff retryStrategy) {
            this.retryStrategy = retryStrategy;
        }

        public TriggerQueryParam retryStrategy(Backoff retryStrategy) {
            this.retryStrategy = retryStrategy;
            return this;
        }

        /**
        * Get template
        * @return template
        **/
        @JsonProperty("template")
        public TriggerTemplate getTemplate() {
            return template;
        }

        /**
         * Set template
         **/
        public void setTemplate(TriggerTemplate template) {
            this.template = template;
        }

        public TriggerQueryParam template(TriggerTemplate template) {
            this.template = template;
            return this;
        }

        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class TriggerQueryParam {\n");

            sb.append("    atLeastOnce: ").append(toIndentedString(atLeastOnce)).append("\n");
            sb.append("    parameters: ").append(toIndentedString(parameters)).append("\n");
            sb.append("    policy: ").append(toIndentedString(policy)).append("\n");
            sb.append("    rateLimit: ").append(toIndentedString(rateLimit)).append("\n");
            sb.append("    retryStrategy: ").append(toIndentedString(retryStrategy)).append("\n");
            sb.append("    template: ").append(toIndentedString(template)).append("\n");
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
