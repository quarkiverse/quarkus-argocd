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
public class AMQPQueueBindConfig  {

    private Boolean noWait;

    /**
    * Get noWait
    * @return noWait
    **/
    @JsonProperty("noWait")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public Boolean getNoWait() {
        return noWait;
    }

    /**
     * Set noWait
     **/
    public void setNoWait(Boolean noWait) {
        this.noWait = noWait;
    }

    public AMQPQueueBindConfig noWait(Boolean noWait) {
        this.noWait = noWait;
        return this;
    }

    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AMQPQueueBindConfig {\n");

        sb.append("    noWait: ").append(toIndentedString(noWait)).append("\n");
        
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
    public static class AMQPQueueBindConfigQueryParam  {

        @jakarta.ws.rs.QueryParam("noWait")
        private Boolean noWait;

        /**
        * Get noWait
        * @return noWait
        **/
        @JsonProperty("noWait")
        public Boolean getNoWait() {
            return noWait;
        }

        /**
         * Set noWait
         **/
        public void setNoWait(Boolean noWait) {
            this.noWait = noWait;
        }

        public AMQPQueueBindConfigQueryParam noWait(Boolean noWait) {
            this.noWait = noWait;
            return this;
        }

        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class AMQPQueueBindConfigQueryParam {\n");

            sb.append("    noWait: ").append(toIndentedString(noWait)).append("\n");
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
