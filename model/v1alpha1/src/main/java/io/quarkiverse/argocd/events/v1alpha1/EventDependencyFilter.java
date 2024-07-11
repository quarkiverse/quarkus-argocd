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
/**
  * EventDependencyFilter defines filters and constraints for a io.argoproj.workflow.v1alpha1.
 **/
public class EventDependencyFilter  {

    /**
      * EventDependencyFilter defines filters and constraints for a io.argoproj.workflow.v1alpha1.
     **/
    private EventContext context;
    /**
      * EventDependencyFilter defines filters and constraints for a io.argoproj.workflow.v1alpha1.
     **/
    private List<DataFilter> data;
    /**
      * EventDependencyFilter defines filters and constraints for a io.argoproj.workflow.v1alpha1.
     **/
    private String dataLogicalOperator;
    /**
      * EventDependencyFilter defines filters and constraints for a io.argoproj.workflow.v1alpha1.
     **/
    private String exprLogicalOperator;
    /**
      * EventDependencyFilter defines filters and constraints for a io.argoproj.workflow.v1alpha1.
     **/
    private List<ExprFilter> exprs;
    /**
      * EventDependencyFilter defines filters and constraints for a io.argoproj.workflow.v1alpha1.
     **/
    private String script;
    /**
      * EventDependencyFilter defines filters and constraints for a io.argoproj.workflow.v1alpha1.
     **/
    private TimeFilter time;

    /**
    * Get context
    * @return context
    **/
    @JsonProperty("context")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public EventContext getContext() {
        return context;
    }

    /**
     * Set context
     **/
    public void setContext(EventContext context) {
        this.context = context;
    }

    public EventDependencyFilter context(EventContext context) {
        this.context = context;
        return this;
    }

    /**
    * Get data
    * @return data
    **/
    @JsonProperty("data")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public List<DataFilter> getData() {
        return data;
    }

    /**
     * Set data
     **/
    public void setData(List<DataFilter> data) {
        this.data = data;
    }

    public EventDependencyFilter data(List<DataFilter> data) {
        this.data = data;
        return this;
    }
    public EventDependencyFilter addDataItem(DataFilter dataItem) {
        if (this.data == null){
            data = new ArrayList<>();
        }
        this.data.add(dataItem);
        return this;
    }

    /**
    * DataLogicalOperator defines how multiple Data filters (if defined) are evaluated together. Available values: and (&&), or (||) Is optional and if left blank treated as and (&&).
    * @return dataLogicalOperator
    **/
    @JsonProperty("dataLogicalOperator")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public String getDataLogicalOperator() {
        return dataLogicalOperator;
    }

    /**
     * Set dataLogicalOperator
     **/
    public void setDataLogicalOperator(String dataLogicalOperator) {
        this.dataLogicalOperator = dataLogicalOperator;
    }

    public EventDependencyFilter dataLogicalOperator(String dataLogicalOperator) {
        this.dataLogicalOperator = dataLogicalOperator;
        return this;
    }

    /**
    * ExprLogicalOperator defines how multiple Exprs filters (if defined) are evaluated together. Available values: and (&&), or (||) Is optional and if left blank treated as and (&&).
    * @return exprLogicalOperator
    **/
    @JsonProperty("exprLogicalOperator")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public String getExprLogicalOperator() {
        return exprLogicalOperator;
    }

    /**
     * Set exprLogicalOperator
     **/
    public void setExprLogicalOperator(String exprLogicalOperator) {
        this.exprLogicalOperator = exprLogicalOperator;
    }

    public EventDependencyFilter exprLogicalOperator(String exprLogicalOperator) {
        this.exprLogicalOperator = exprLogicalOperator;
        return this;
    }

    /**
    * Exprs contains the list of expressions evaluated against the event payload.
    * @return exprs
    **/
    @JsonProperty("exprs")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public List<ExprFilter> getExprs() {
        return exprs;
    }

    /**
     * Set exprs
     **/
    public void setExprs(List<ExprFilter> exprs) {
        this.exprs = exprs;
    }

    public EventDependencyFilter exprs(List<ExprFilter> exprs) {
        this.exprs = exprs;
        return this;
    }
    public EventDependencyFilter addExprsItem(ExprFilter exprsItem) {
        if (this.exprs == null){
            exprs = new ArrayList<>();
        }
        this.exprs.add(exprsItem);
        return this;
    }

    /**
    * Script refers to a Lua script evaluated to determine the validity of an io.argoproj.workflow.v1alpha1.
    * @return script
    **/
    @JsonProperty("script")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public String getScript() {
        return script;
    }

    /**
     * Set script
     **/
    public void setScript(String script) {
        this.script = script;
    }

    public EventDependencyFilter script(String script) {
        this.script = script;
        return this;
    }

    /**
    * Get time
    * @return time
    **/
    @JsonProperty("time")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public TimeFilter getTime() {
        return time;
    }

    /**
     * Set time
     **/
    public void setTime(TimeFilter time) {
        this.time = time;
    }

    public EventDependencyFilter time(TimeFilter time) {
        this.time = time;
        return this;
    }

    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class EventDependencyFilter {\n");

        sb.append("    context: ").append(toIndentedString(context)).append("\n");
        sb.append("    data: ").append(toIndentedString(data)).append("\n");
        sb.append("    dataLogicalOperator: ").append(toIndentedString(dataLogicalOperator)).append("\n");
        sb.append("    exprLogicalOperator: ").append(toIndentedString(exprLogicalOperator)).append("\n");
        sb.append("    exprs: ").append(toIndentedString(exprs)).append("\n");
        sb.append("    script: ").append(toIndentedString(script)).append("\n");
        sb.append("    time: ").append(toIndentedString(time)).append("\n");
        
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
      * EventDependencyFilter defines filters and constraints for a io.argoproj.workflow.v1alpha1.
     **/
    public static class EventDependencyFilterQueryParam  {

        /**
          * EventDependencyFilter defines filters and constraints for a io.argoproj.workflow.v1alpha1.
         **/
        @jakarta.ws.rs.QueryParam("context")
        private EventContext context;
        /**
          * EventDependencyFilter defines filters and constraints for a io.argoproj.workflow.v1alpha1.
         **/
        @jakarta.ws.rs.QueryParam("data")
        private List<DataFilter> data = null;
        /**
          * EventDependencyFilter defines filters and constraints for a io.argoproj.workflow.v1alpha1.
         **/
        @jakarta.ws.rs.QueryParam("dataLogicalOperator")
        private String dataLogicalOperator;
        /**
          * EventDependencyFilter defines filters and constraints for a io.argoproj.workflow.v1alpha1.
         **/
        @jakarta.ws.rs.QueryParam("exprLogicalOperator")
        private String exprLogicalOperator;
        /**
          * EventDependencyFilter defines filters and constraints for a io.argoproj.workflow.v1alpha1.
         **/
        @jakarta.ws.rs.QueryParam("exprs")
        private List<ExprFilter> exprs = null;
        /**
          * EventDependencyFilter defines filters and constraints for a io.argoproj.workflow.v1alpha1.
         **/
        @jakarta.ws.rs.QueryParam("script")
        private String script;
        /**
          * EventDependencyFilter defines filters and constraints for a io.argoproj.workflow.v1alpha1.
         **/
        @jakarta.ws.rs.QueryParam("time")
        private TimeFilter time;

        /**
        * Get context
        * @return context
        **/
        @JsonProperty("context")
        public EventContext getContext() {
            return context;
        }

        /**
         * Set context
         **/
        public void setContext(EventContext context) {
            this.context = context;
        }

        public EventDependencyFilterQueryParam context(EventContext context) {
            this.context = context;
            return this;
        }

        /**
        * Get data
        * @return data
        **/
        @JsonProperty("data")
        public List<DataFilter> getData() {
            return data;
        }

        /**
         * Set data
         **/
        public void setData(List<DataFilter> data) {
            this.data = data;
        }

        public EventDependencyFilterQueryParam data(List<DataFilter> data) {
            this.data = data;
            return this;
        }
        public EventDependencyFilterQueryParam addDataItem(DataFilter dataItem) {
            this.data.add(dataItem);
            return this;
        }

        /**
        * DataLogicalOperator defines how multiple Data filters (if defined) are evaluated together. Available values: and (&&), or (||) Is optional and if left blank treated as and (&&).
        * @return dataLogicalOperator
        **/
        @JsonProperty("dataLogicalOperator")
        public String getDataLogicalOperator() {
            return dataLogicalOperator;
        }

        /**
         * Set dataLogicalOperator
         **/
        public void setDataLogicalOperator(String dataLogicalOperator) {
            this.dataLogicalOperator = dataLogicalOperator;
        }

        public EventDependencyFilterQueryParam dataLogicalOperator(String dataLogicalOperator) {
            this.dataLogicalOperator = dataLogicalOperator;
            return this;
        }

        /**
        * ExprLogicalOperator defines how multiple Exprs filters (if defined) are evaluated together. Available values: and (&&), or (||) Is optional and if left blank treated as and (&&).
        * @return exprLogicalOperator
        **/
        @JsonProperty("exprLogicalOperator")
        public String getExprLogicalOperator() {
            return exprLogicalOperator;
        }

        /**
         * Set exprLogicalOperator
         **/
        public void setExprLogicalOperator(String exprLogicalOperator) {
            this.exprLogicalOperator = exprLogicalOperator;
        }

        public EventDependencyFilterQueryParam exprLogicalOperator(String exprLogicalOperator) {
            this.exprLogicalOperator = exprLogicalOperator;
            return this;
        }

        /**
        * Exprs contains the list of expressions evaluated against the event payload.
        * @return exprs
        **/
        @JsonProperty("exprs")
        public List<ExprFilter> getExprs() {
            return exprs;
        }

        /**
         * Set exprs
         **/
        public void setExprs(List<ExprFilter> exprs) {
            this.exprs = exprs;
        }

        public EventDependencyFilterQueryParam exprs(List<ExprFilter> exprs) {
            this.exprs = exprs;
            return this;
        }
        public EventDependencyFilterQueryParam addExprsItem(ExprFilter exprsItem) {
            this.exprs.add(exprsItem);
            return this;
        }

        /**
        * Script refers to a Lua script evaluated to determine the validity of an io.argoproj.workflow.v1alpha1.
        * @return script
        **/
        @JsonProperty("script")
        public String getScript() {
            return script;
        }

        /**
         * Set script
         **/
        public void setScript(String script) {
            this.script = script;
        }

        public EventDependencyFilterQueryParam script(String script) {
            this.script = script;
            return this;
        }

        /**
        * Get time
        * @return time
        **/
        @JsonProperty("time")
        public TimeFilter getTime() {
            return time;
        }

        /**
         * Set time
         **/
        public void setTime(TimeFilter time) {
            this.time = time;
        }

        public EventDependencyFilterQueryParam time(TimeFilter time) {
            this.time = time;
            return this;
        }

        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class EventDependencyFilterQueryParam {\n");

            sb.append("    context: ").append(toIndentedString(context)).append("\n");
            sb.append("    data: ").append(toIndentedString(data)).append("\n");
            sb.append("    dataLogicalOperator: ").append(toIndentedString(dataLogicalOperator)).append("\n");
            sb.append("    exprLogicalOperator: ").append(toIndentedString(exprLogicalOperator)).append("\n");
            sb.append("    exprs: ").append(toIndentedString(exprs)).append("\n");
            sb.append("    script: ").append(toIndentedString(script)).append("\n");
            sb.append("    time: ").append(toIndentedString(time)).append("\n");
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
