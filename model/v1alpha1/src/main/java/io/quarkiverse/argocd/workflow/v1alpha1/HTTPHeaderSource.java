package io.quarkiverse.argocd.workflow.v1alpha1;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.fabric8.kubernetes.api.model.SecretKeySelector;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.Type;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class HTTPHeaderSource  {

    private SecretKeySelector secretKeyRef;

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

    public HTTPHeaderSource secretKeyRef(SecretKeySelector secretKeyRef) {
        this.secretKeyRef = secretKeyRef;
        return this;
    }

    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class HTTPHeaderSource {\n");

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
    public static class HTTPHeaderSourceQueryParam  {

        @jakarta.ws.rs.QueryParam("secretKeyRef")
        private SecretKeySelector secretKeyRef;

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

        public HTTPHeaderSourceQueryParam secretKeyRef(SecretKeySelector secretKeyRef) {
            this.secretKeyRef = secretKeyRef;
            return this;
        }

        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class HTTPHeaderSourceQueryParam {\n");

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