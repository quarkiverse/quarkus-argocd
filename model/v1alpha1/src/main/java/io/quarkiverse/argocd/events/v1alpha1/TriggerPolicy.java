package io.quarkiverse.argocd.events.v1alpha1;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.quarkiverse.argocd.v1alpha1.model.StatusPolicy;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.Type;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class TriggerPolicy  {

    private K8SResourcePolicy k8s;
    private StatusPolicy status;

    /**
    * Get k8s
    * @return k8s
    **/
    @JsonProperty("k8s")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public K8SResourcePolicy getK8s() {
        return k8s;
    }

    /**
     * Set k8s
     **/
    public void setK8s(K8SResourcePolicy k8s) {
        this.k8s = k8s;
    }

    public TriggerPolicy k8s(K8SResourcePolicy k8s) {
        this.k8s = k8s;
        return this;
    }

    /**
    * Get status
    * @return status
    **/
    @JsonProperty("status")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public StatusPolicy getStatus() {
        return status;
    }

    /**
     * Set status
     **/
    public void setStatus(StatusPolicy status) {
        this.status = status;
    }

    public TriggerPolicy status(StatusPolicy status) {
        this.status = status;
        return this;
    }

    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TriggerPolicy {\n");

        sb.append("    k8s: ").append(toIndentedString(k8s)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        
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
    public static class TriggerPolicyQueryParam  {

        @jakarta.ws.rs.QueryParam("k8s")
        private K8SResourcePolicy k8s;
        @jakarta.ws.rs.QueryParam("status")
        private StatusPolicy status;

        /**
        * Get k8s
        * @return k8s
        **/
        @JsonProperty("k8s")
        public K8SResourcePolicy getK8s() {
            return k8s;
        }

        /**
         * Set k8s
         **/
        public void setK8s(K8SResourcePolicy k8s) {
            this.k8s = k8s;
        }

        public TriggerPolicyQueryParam k8s(K8SResourcePolicy k8s) {
            this.k8s = k8s;
            return this;
        }

        /**
        * Get status
        * @return status
        **/
        @JsonProperty("status")
        public StatusPolicy getStatus() {
            return status;
        }

        /**
         * Set status
         **/
        public void setStatus(StatusPolicy status) {
            this.status = status;
        }

        public TriggerPolicyQueryParam status(StatusPolicy status) {
            this.status = status;
            return this;
        }

        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class TriggerPolicyQueryParam {\n");

            sb.append("    k8s: ").append(toIndentedString(k8s)).append("\n");
            sb.append("    status: ").append(toIndentedString(status)).append("\n");
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
