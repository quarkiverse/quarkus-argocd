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
public class NodeFlag  {

    private Boolean hooked;
    private Boolean retried;

    /**
    * Hooked tracks whether or not this node was triggered by hook or onExit
    * @return hooked
    **/
    @JsonProperty("hooked")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public Boolean getHooked() {
        return hooked;
    }

    /**
     * Set hooked
     **/
    public void setHooked(Boolean hooked) {
        this.hooked = hooked;
    }

    public NodeFlag hooked(Boolean hooked) {
        this.hooked = hooked;
        return this;
    }

    /**
    * Retried tracks whether or not this node was retried by retryStrategy
    * @return retried
    **/
    @JsonProperty("retried")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public Boolean getRetried() {
        return retried;
    }

    /**
     * Set retried
     **/
    public void setRetried(Boolean retried) {
        this.retried = retried;
    }

    public NodeFlag retried(Boolean retried) {
        this.retried = retried;
        return this;
    }

    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class NodeFlag {\n");

        sb.append("    hooked: ").append(toIndentedString(hooked)).append("\n");
        sb.append("    retried: ").append(toIndentedString(retried)).append("\n");
        
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
    public static class NodeFlagQueryParam  {

        @jakarta.ws.rs.QueryParam("hooked")
        private Boolean hooked;
        @jakarta.ws.rs.QueryParam("retried")
        private Boolean retried;

        /**
        * Hooked tracks whether or not this node was triggered by hook or onExit
        * @return hooked
        **/
        @JsonProperty("hooked")
        public Boolean getHooked() {
            return hooked;
        }

        /**
         * Set hooked
         **/
        public void setHooked(Boolean hooked) {
            this.hooked = hooked;
        }

        public NodeFlagQueryParam hooked(Boolean hooked) {
            this.hooked = hooked;
            return this;
        }

        /**
        * Retried tracks whether or not this node was retried by retryStrategy
        * @return retried
        **/
        @JsonProperty("retried")
        public Boolean getRetried() {
            return retried;
        }

        /**
         * Set retried
         **/
        public void setRetried(Boolean retried) {
            this.retried = retried;
        }

        public NodeFlagQueryParam retried(Boolean retried) {
            this.retried = retried;
            return this;
        }

        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class NodeFlagQueryParam {\n");

            sb.append("    hooked: ").append(toIndentedString(hooked)).append("\n");
            sb.append("    retried: ").append(toIndentedString(retried)).append("\n");
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