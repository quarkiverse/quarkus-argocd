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
/**
  * RetryStrategy provides controls on how to retry a workflow step
 **/
public class RetryStrategy  {

    /**
      * RetryStrategy provides controls on how to retry a workflow step
     **/
    private RetryAffinity affinity;
    /**
      * RetryStrategy provides controls on how to retry a workflow step
     **/
    private Backoff backoff;
    /**
      * RetryStrategy provides controls on how to retry a workflow step
     **/
    private String expression;
    /**
      * RetryStrategy provides controls on how to retry a workflow step
     **/
    private String limit;
    /**
      * RetryStrategy provides controls on how to retry a workflow step
     **/
    private String retryPolicy;

    /**
    * Get affinity
    * @return affinity
    **/
    @JsonProperty("affinity")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public RetryAffinity getAffinity() {
        return affinity;
    }

    /**
     * Set affinity
     **/
    public void setAffinity(RetryAffinity affinity) {
        this.affinity = affinity;
    }

    public RetryStrategy affinity(RetryAffinity affinity) {
        this.affinity = affinity;
        return this;
    }

    /**
    * Get backoff
    * @return backoff
    **/
    @JsonProperty("backoff")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public Backoff getBackoff() {
        return backoff;
    }

    /**
     * Set backoff
     **/
    public void setBackoff(Backoff backoff) {
        this.backoff = backoff;
    }

    public RetryStrategy backoff(Backoff backoff) {
        this.backoff = backoff;
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

    public RetryStrategy expression(String expression) {
        this.expression = expression;
        return this;
    }

    /**
    * Get limit
    * @return limit
    **/
    @JsonProperty("limit")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public String getLimit() {
        return limit;
    }

    /**
     * Set limit
     **/
    public void setLimit(String limit) {
        this.limit = limit;
    }

    public RetryStrategy limit(String limit) {
        this.limit = limit;
        return this;
    }

    /**
    * RetryPolicy is a policy of NodePhase statuses that will be retried
    * @return retryPolicy
    **/
    @JsonProperty("retryPolicy")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public String getRetryPolicy() {
        return retryPolicy;
    }

    /**
     * Set retryPolicy
     **/
    public void setRetryPolicy(String retryPolicy) {
        this.retryPolicy = retryPolicy;
    }

    public RetryStrategy retryPolicy(String retryPolicy) {
        this.retryPolicy = retryPolicy;
        return this;
    }

    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RetryStrategy {\n");

        sb.append("    affinity: ").append(toIndentedString(affinity)).append("\n");
        sb.append("    backoff: ").append(toIndentedString(backoff)).append("\n");
        sb.append("    expression: ").append(toIndentedString(expression)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    retryPolicy: ").append(toIndentedString(retryPolicy)).append("\n");
        
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
      * RetryStrategy provides controls on how to retry a workflow step
     **/
    public static class RetryStrategyQueryParam  {

        /**
          * RetryStrategy provides controls on how to retry a workflow step
         **/
        @jakarta.ws.rs.QueryParam("affinity")
        private RetryAffinity affinity;
        /**
          * RetryStrategy provides controls on how to retry a workflow step
         **/
        @jakarta.ws.rs.QueryParam("backoff")
        private Backoff backoff;
        /**
          * RetryStrategy provides controls on how to retry a workflow step
         **/
        @jakarta.ws.rs.QueryParam("expression")
        private String expression;
        /**
          * RetryStrategy provides controls on how to retry a workflow step
         **/
        @jakarta.ws.rs.QueryParam("limit")
        private String limit;
        /**
          * RetryStrategy provides controls on how to retry a workflow step
         **/
        @jakarta.ws.rs.QueryParam("retryPolicy")
        private String retryPolicy;

        /**
        * Get affinity
        * @return affinity
        **/
        @JsonProperty("affinity")
        public RetryAffinity getAffinity() {
            return affinity;
        }

        /**
         * Set affinity
         **/
        public void setAffinity(RetryAffinity affinity) {
            this.affinity = affinity;
        }

        public RetryStrategyQueryParam affinity(RetryAffinity affinity) {
            this.affinity = affinity;
            return this;
        }

        /**
        * Get backoff
        * @return backoff
        **/
        @JsonProperty("backoff")
        public Backoff getBackoff() {
            return backoff;
        }

        /**
         * Set backoff
         **/
        public void setBackoff(Backoff backoff) {
            this.backoff = backoff;
        }

        public RetryStrategyQueryParam backoff(Backoff backoff) {
            this.backoff = backoff;
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

        public RetryStrategyQueryParam expression(String expression) {
            this.expression = expression;
            return this;
        }

        /**
        * Get limit
        * @return limit
        **/
        @JsonProperty("limit")
        public String getLimit() {
            return limit;
        }

        /**
         * Set limit
         **/
        public void setLimit(String limit) {
            this.limit = limit;
        }

        public RetryStrategyQueryParam limit(String limit) {
            this.limit = limit;
            return this;
        }

        /**
        * RetryPolicy is a policy of NodePhase statuses that will be retried
        * @return retryPolicy
        **/
        @JsonProperty("retryPolicy")
        public String getRetryPolicy() {
            return retryPolicy;
        }

        /**
         * Set retryPolicy
         **/
        public void setRetryPolicy(String retryPolicy) {
            this.retryPolicy = retryPolicy;
        }

        public RetryStrategyQueryParam retryPolicy(String retryPolicy) {
            this.retryPolicy = retryPolicy;
            return this;
        }

        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class RetryStrategyQueryParam {\n");

            sb.append("    affinity: ").append(toIndentedString(affinity)).append("\n");
            sb.append("    backoff: ").append(toIndentedString(backoff)).append("\n");
            sb.append("    expression: ").append(toIndentedString(expression)).append("\n");
            sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
            sb.append("    retryPolicy: ").append(toIndentedString(retryPolicy)).append("\n");
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
