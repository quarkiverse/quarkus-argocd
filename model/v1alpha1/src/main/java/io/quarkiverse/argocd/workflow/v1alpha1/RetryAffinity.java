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
  * RetryAffinity prevents running steps on the same host.
 **/
public class RetryAffinity  {

    /**
      * RetryAffinity prevents running steps on the same host.
     **/
    private Object nodeAntiAffinity;

    /**
    * RetryNodeAntiAffinity is a placeholder for future expansion, only empty nodeAntiAffinity is allowed. In order to prevent running steps on the same host, it uses \"kubernetes.io/hostname\".
    * @return nodeAntiAffinity
    **/
    @JsonProperty("nodeAntiAffinity")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public Object getNodeAntiAffinity() {
        return nodeAntiAffinity;
    }

    /**
     * Set nodeAntiAffinity
     **/
    public void setNodeAntiAffinity(Object nodeAntiAffinity) {
        this.nodeAntiAffinity = nodeAntiAffinity;
    }

    public RetryAffinity nodeAntiAffinity(Object nodeAntiAffinity) {
        this.nodeAntiAffinity = nodeAntiAffinity;
        return this;
    }

    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RetryAffinity {\n");

        sb.append("    nodeAntiAffinity: ").append(toIndentedString(nodeAntiAffinity)).append("\n");
        
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
      * RetryAffinity prevents running steps on the same host.
     **/
    public static class RetryAffinityQueryParam  {

        /**
          * RetryAffinity prevents running steps on the same host.
         **/
        @jakarta.ws.rs.QueryParam("nodeAntiAffinity")
        private Object nodeAntiAffinity;

        /**
        * RetryNodeAntiAffinity is a placeholder for future expansion, only empty nodeAntiAffinity is allowed. In order to prevent running steps on the same host, it uses \"kubernetes.io/hostname\".
        * @return nodeAntiAffinity
        **/
        @JsonProperty("nodeAntiAffinity")
        public Object getNodeAntiAffinity() {
            return nodeAntiAffinity;
        }

        /**
         * Set nodeAntiAffinity
         **/
        public void setNodeAntiAffinity(Object nodeAntiAffinity) {
            this.nodeAntiAffinity = nodeAntiAffinity;
        }

        public RetryAffinityQueryParam nodeAntiAffinity(Object nodeAntiAffinity) {
            this.nodeAntiAffinity = nodeAntiAffinity;
            return this;
        }

        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class RetryAffinityQueryParam {\n");

            sb.append("    nodeAntiAffinity: ").append(toIndentedString(nodeAntiAffinity)).append("\n");
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