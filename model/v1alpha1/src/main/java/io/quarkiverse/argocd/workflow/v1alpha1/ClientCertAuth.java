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
/**
  * ClientCertAuth holds necessary information for client authentication via certificates
 **/
public class ClientCertAuth  {

    /**
      * ClientCertAuth holds necessary information for client authentication via certificates
     **/
    private SecretKeySelector clientCertSecret;
    /**
      * ClientCertAuth holds necessary information for client authentication via certificates
     **/
    private SecretKeySelector clientKeySecret;

    /**
    * Get clientCertSecret
    * @return clientCertSecret
    **/
    @JsonProperty("clientCertSecret")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public SecretKeySelector getClientCertSecret() {
        return clientCertSecret;
    }

    /**
     * Set clientCertSecret
     **/
    public void setClientCertSecret(SecretKeySelector clientCertSecret) {
        this.clientCertSecret = clientCertSecret;
    }

    public ClientCertAuth clientCertSecret(SecretKeySelector clientCertSecret) {
        this.clientCertSecret = clientCertSecret;
        return this;
    }

    /**
    * Get clientKeySecret
    * @return clientKeySecret
    **/
    @JsonProperty("clientKeySecret")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public SecretKeySelector getClientKeySecret() {
        return clientKeySecret;
    }

    /**
     * Set clientKeySecret
     **/
    public void setClientKeySecret(SecretKeySelector clientKeySecret) {
        this.clientKeySecret = clientKeySecret;
    }

    public ClientCertAuth clientKeySecret(SecretKeySelector clientKeySecret) {
        this.clientKeySecret = clientKeySecret;
        return this;
    }

    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ClientCertAuth {\n");

        sb.append("    clientCertSecret: ").append(toIndentedString(clientCertSecret)).append("\n");
        sb.append("    clientKeySecret: ").append(toIndentedString(clientKeySecret)).append("\n");
        
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
      * ClientCertAuth holds necessary information for client authentication via certificates
     **/
    public static class ClientCertAuthQueryParam  {

        /**
          * ClientCertAuth holds necessary information for client authentication via certificates
         **/
        @jakarta.ws.rs.QueryParam("clientCertSecret")
        private SecretKeySelector clientCertSecret;
        /**
          * ClientCertAuth holds necessary information for client authentication via certificates
         **/
        @jakarta.ws.rs.QueryParam("clientKeySecret")
        private SecretKeySelector clientKeySecret;

        /**
        * Get clientCertSecret
        * @return clientCertSecret
        **/
        @JsonProperty("clientCertSecret")
        public SecretKeySelector getClientCertSecret() {
            return clientCertSecret;
        }

        /**
         * Set clientCertSecret
         **/
        public void setClientCertSecret(SecretKeySelector clientCertSecret) {
            this.clientCertSecret = clientCertSecret;
        }

        public ClientCertAuthQueryParam clientCertSecret(SecretKeySelector clientCertSecret) {
            this.clientCertSecret = clientCertSecret;
            return this;
        }

        /**
        * Get clientKeySecret
        * @return clientKeySecret
        **/
        @JsonProperty("clientKeySecret")
        public SecretKeySelector getClientKeySecret() {
            return clientKeySecret;
        }

        /**
         * Set clientKeySecret
         **/
        public void setClientKeySecret(SecretKeySelector clientKeySecret) {
            this.clientKeySecret = clientKeySecret;
        }

        public ClientCertAuthQueryParam clientKeySecret(SecretKeySelector clientKeySecret) {
            this.clientKeySecret = clientKeySecret;
            return this;
        }

        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class ClientCertAuthQueryParam {\n");

            sb.append("    clientCertSecret: ").append(toIndentedString(clientCertSecret)).append("\n");
            sb.append("    clientKeySecret: ").append(toIndentedString(clientKeySecret)).append("\n");
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