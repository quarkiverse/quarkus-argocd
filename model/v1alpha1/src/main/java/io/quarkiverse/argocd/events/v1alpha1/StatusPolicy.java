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
public class StatusPolicy  {

    private List<Integer> allow;

    /**
    * Get allow
    * @return allow
    **/
    @JsonProperty("allow")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public List<Integer> getAllow() {
        return allow;
    }

    /**
     * Set allow
     **/
    public void setAllow(List<Integer> allow) {
        this.allow = allow;
    }

    public StatusPolicy allow(List<Integer> allow) {
        this.allow = allow;
        return this;
    }
    public StatusPolicy addAllowItem(Integer allowItem) {
        if (this.allow == null){
            allow = new ArrayList<>();
        }
        this.allow.add(allowItem);
        return this;
    }

    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class StatusPolicy {\n");

        sb.append("    allow: ").append(toIndentedString(allow)).append("\n");
        
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
    public static class StatusPolicyQueryParam  {

        @jakarta.ws.rs.QueryParam("allow")
        private List<Integer> allow = null;

        /**
        * Get allow
        * @return allow
        **/
        @JsonProperty("allow")
        public List<Integer> getAllow() {
            return allow;
        }

        /**
         * Set allow
         **/
        public void setAllow(List<Integer> allow) {
            this.allow = allow;
        }

        public StatusPolicyQueryParam allow(List<Integer> allow) {
            this.allow = allow;
            return this;
        }
        public StatusPolicyQueryParam addAllowItem(Integer allowItem) {
            this.allow.add(allowItem);
            return this;
        }

        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class StatusPolicyQueryParam {\n");

            sb.append("    allow: ").append(toIndentedString(allow)).append("\n");
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
