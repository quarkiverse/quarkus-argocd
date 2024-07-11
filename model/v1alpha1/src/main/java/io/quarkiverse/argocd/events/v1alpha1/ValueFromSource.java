package io.quarkiverse.argocd.events.v1alpha1;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.fabric8.kubernetes.api.model.ConfigMapKeySelector;
import io.fabric8.kubernetes.api.model.SecretKeySelector;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.Type;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ValueFromSource  {

    private ConfigMapKeySelector configMapKeyRef;
    private SecretKeySelector secretKeyRef;

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

    public ValueFromSource configMapKeyRef(ConfigMapKeySelector configMapKeyRef) {
        this.configMapKeyRef = configMapKeyRef;
        return this;
    }

    /**
    * Get secretKeyRef
    * @return secretKeyRef
    **/
    @JsonProperty("secretKeyRef")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public SecretKeySelector getSecretKeyRef() {
        return secretKeyRef;
    }

    /**
     * Set secretKeyRef
     **/
    public void setSecretKeyRef(SecretKeySelector secretKeyRef) {
        this.secretKeyRef = secretKeyRef;
    }

    public ValueFromSource secretKeyRef(SecretKeySelector secretKeyRef) {
        this.secretKeyRef = secretKeyRef;
        return this;
    }

    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ValueFromSource {\n");

        sb.append("    configMapKeyRef: ").append(toIndentedString(configMapKeyRef)).append("\n");
        sb.append("    secretKeyRef: ").append(toIndentedString(secretKeyRef)).append("\n");
        
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
    public static class ValueFromSourceQueryParam  {

        @jakarta.ws.rs.QueryParam("configMapKeyRef")
        private ConfigMapKeySelector configMapKeyRef;
        @jakarta.ws.rs.QueryParam("secretKeyRef")
        private SecretKeySelector secretKeyRef;

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

        public ValueFromSourceQueryParam configMapKeyRef(ConfigMapKeySelector configMapKeyRef) {
            this.configMapKeyRef = configMapKeyRef;
            return this;
        }

        /**
        * Get secretKeyRef
        * @return secretKeyRef
        **/
        @JsonProperty("secretKeyRef")
        public SecretKeySelector getSecretKeyRef() {
            return secretKeyRef;
        }

        /**
         * Set secretKeyRef
         **/
        public void setSecretKeyRef(SecretKeySelector secretKeyRef) {
            this.secretKeyRef = secretKeyRef;
        }

        public ValueFromSourceQueryParam secretKeyRef(SecretKeySelector secretKeyRef) {
            this.secretKeyRef = secretKeyRef;
            return this;
        }

        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class ValueFromSourceQueryParam {\n");

            sb.append("    configMapKeyRef: ").append(toIndentedString(configMapKeyRef)).append("\n");
            sb.append("    secretKeyRef: ").append(toIndentedString(secretKeyRef)).append("\n");
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
