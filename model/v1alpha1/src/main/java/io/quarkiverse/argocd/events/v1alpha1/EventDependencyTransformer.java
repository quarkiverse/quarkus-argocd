package io.quarkiverse.argocd.events.v1alpha1;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.Type;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class EventDependencyTransformer  {

    private String jq;
    private String script;

    /**
    * Get jq
    * @return jq
    **/
    @JsonProperty("jq")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public String getJq() {
        return jq;
    }

    /**
     * Set jq
     **/
    public void setJq(String jq) {
        this.jq = jq;
    }

    public EventDependencyTransformer jq(String jq) {
        this.jq = jq;
        return this;
    }

    /**
    * Get script
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

    public EventDependencyTransformer script(String script) {
        this.script = script;
        return this;
    }

    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class EventDependencyTransformer {\n");

        sb.append("    jq: ").append(toIndentedString(jq)).append("\n");
        sb.append("    script: ").append(toIndentedString(script)).append("\n");
        
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
    public static class EventDependencyTransformerQueryParam  {

        @jakarta.ws.rs.QueryParam("jq")
        private String jq;
        @jakarta.ws.rs.QueryParam("script")
        private String script;

        /**
        * Get jq
        * @return jq
        **/
        @JsonProperty("jq")
        public String getJq() {
            return jq;
        }

        /**
         * Set jq
         **/
        public void setJq(String jq) {
            this.jq = jq;
        }

        public EventDependencyTransformerQueryParam jq(String jq) {
            this.jq = jq;
            return this;
        }

        /**
        * Get script
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

        public EventDependencyTransformerQueryParam script(String script) {
            this.script = script;
            return this;
        }

        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class EventDependencyTransformerQueryParam {\n");

            sb.append("    jq: ").append(toIndentedString(jq)).append("\n");
            sb.append("    script: ").append(toIndentedString(script)).append("\n");
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
