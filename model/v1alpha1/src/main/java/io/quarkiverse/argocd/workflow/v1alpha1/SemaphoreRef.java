package io.quarkiverse.argocd.workflow.v1alpha1;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.fabric8.kubernetes.api.model.ConfigMapKeySelector;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.Type;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
/**
  * SemaphoreRef is a reference of Semaphore
 **/
public class SemaphoreRef  {

    /**
      * SemaphoreRef is a reference of Semaphore
     **/
    private ConfigMapKeySelector configMapKeyRef;
    /**
      * SemaphoreRef is a reference of Semaphore
     **/
    private String namespace;

    /**
    * Get configMapKeyRef
    * @return configMapKeyRef
    **/
    @JsonProperty("configMapKeyRef")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public ConfigMapKeySelector getConfigMapKeyRef() {
        return configMapKeyRef;
    }

    /**
     * Set configMapKeyRef
     **/
    public void setConfigMapKeyRef(ConfigMapKeySelector configMapKeyRef) {
        this.configMapKeyRef = configMapKeyRef;
    }

    public SemaphoreRef configMapKeyRef(ConfigMapKeySelector configMapKeyRef) {
        this.configMapKeyRef = configMapKeyRef;
        return this;
    }

    /**
    * Namespace is the namespace of the configmap, default: [namespace of workflow]
    * @return namespace
    **/
    @JsonProperty("namespace")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public String getNamespace() {
        return namespace;
    }

    /**
     * Set namespace
     **/
    public void setNamespace(String namespace) {
        this.namespace = namespace;
    }

    public SemaphoreRef namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SemaphoreRef {\n");

        sb.append("    configMapKeyRef: ").append(toIndentedString(configMapKeyRef)).append("\n");
        sb.append("    namespace: ").append(toIndentedString(namespace)).append("\n");
        
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
      * SemaphoreRef is a reference of Semaphore
     **/
    public static class SemaphoreRefQueryParam  {

        /**
          * SemaphoreRef is a reference of Semaphore
         **/
        @jakarta.ws.rs.QueryParam("configMapKeyRef")
        private ConfigMapKeySelector configMapKeyRef;
        /**
          * SemaphoreRef is a reference of Semaphore
         **/
        @jakarta.ws.rs.QueryParam("namespace")
        private String namespace;

        /**
        * Get configMapKeyRef
        * @return configMapKeyRef
        **/
        @JsonProperty("configMapKeyRef")
        public ConfigMapKeySelector getConfigMapKeyRef() {
            return configMapKeyRef;
        }

        /**
         * Set configMapKeyRef
         **/
        public void setConfigMapKeyRef(ConfigMapKeySelector configMapKeyRef) {
            this.configMapKeyRef = configMapKeyRef;
        }

        public SemaphoreRefQueryParam configMapKeyRef(ConfigMapKeySelector configMapKeyRef) {
            this.configMapKeyRef = configMapKeyRef;
            return this;
        }

        /**
        * Namespace is the namespace of the configmap, default: [namespace of workflow]
        * @return namespace
        **/
        @JsonProperty("namespace")
        public String getNamespace() {
            return namespace;
        }

        /**
         * Set namespace
         **/
        public void setNamespace(String namespace) {
            this.namespace = namespace;
        }

        public SemaphoreRefQueryParam namespace(String namespace) {
            this.namespace = namespace;
            return this;
        }

        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class SemaphoreRefQueryParam {\n");

            sb.append("    configMapKeyRef: ").append(toIndentedString(configMapKeyRef)).append("\n");
            sb.append("    namespace: ").append(toIndentedString(namespace)).append("\n");
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