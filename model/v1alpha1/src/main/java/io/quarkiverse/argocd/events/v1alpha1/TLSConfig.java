package io.quarkiverse.argocd.events.v1alpha1;

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
  * TLSConfig refers to TLS configuration for a client.
 **/
public class TLSConfig  {

    /**
      * TLSConfig refers to TLS configuration for a client.
     **/
    private SecretKeySelector caCertSecret;
    /**
      * TLSConfig refers to TLS configuration for a client.
     **/
    private SecretKeySelector clientCertSecret;
    /**
      * TLSConfig refers to TLS configuration for a client.
     **/
    private SecretKeySelector clientKeySecret;
    /**
      * TLSConfig refers to TLS configuration for a client.
     **/
    private Boolean insecureSkipVerify;

    /**
    * Get caCertSecret
    * @return caCertSecret
    **/
    @JsonProperty("caCertSecret")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public SecretKeySelector getCaCertSecret() {
        return caCertSecret;
    }

    /**
     * Set caCertSecret
     **/
    public void setCaCertSecret(SecretKeySelector caCertSecret) {
        this.caCertSecret = caCertSecret;
    }

    public TLSConfig caCertSecret(SecretKeySelector caCertSecret) {
        this.caCertSecret = caCertSecret;
        return this;
    }

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

    public TLSConfig clientCertSecret(SecretKeySelector clientCertSecret) {
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

    public TLSConfig clientKeySecret(SecretKeySelector clientKeySecret) {
        this.clientKeySecret = clientKeySecret;
        return this;
    }

    /**
    * Get insecureSkipVerify
    * @return insecureSkipVerify
    **/
    @JsonProperty("insecureSkipVerify")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public Boolean getInsecureSkipVerify() {
        return insecureSkipVerify;
    }

    /**
     * Set insecureSkipVerify
     **/
    public void setInsecureSkipVerify(Boolean insecureSkipVerify) {
        this.insecureSkipVerify = insecureSkipVerify;
    }

    public TLSConfig insecureSkipVerify(Boolean insecureSkipVerify) {
        this.insecureSkipVerify = insecureSkipVerify;
        return this;
    }

    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TLSConfig {\n");

        sb.append("    caCertSecret: ").append(toIndentedString(caCertSecret)).append("\n");
        sb.append("    clientCertSecret: ").append(toIndentedString(clientCertSecret)).append("\n");
        sb.append("    clientKeySecret: ").append(toIndentedString(clientKeySecret)).append("\n");
        sb.append("    insecureSkipVerify: ").append(toIndentedString(insecureSkipVerify)).append("\n");
        
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
      * TLSConfig refers to TLS configuration for a client.
     **/
    public static class TLSConfigQueryParam  {

        /**
          * TLSConfig refers to TLS configuration for a client.
         **/
        @jakarta.ws.rs.QueryParam("caCertSecret")
        private SecretKeySelector caCertSecret;
        /**
          * TLSConfig refers to TLS configuration for a client.
         **/
        @jakarta.ws.rs.QueryParam("clientCertSecret")
        private SecretKeySelector clientCertSecret;
        /**
          * TLSConfig refers to TLS configuration for a client.
         **/
        @jakarta.ws.rs.QueryParam("clientKeySecret")
        private SecretKeySelector clientKeySecret;
        /**
          * TLSConfig refers to TLS configuration for a client.
         **/
        @jakarta.ws.rs.QueryParam("insecureSkipVerify")
        private Boolean insecureSkipVerify;

        /**
        * Get caCertSecret
        * @return caCertSecret
        **/
        @JsonProperty("caCertSecret")
        public SecretKeySelector getCaCertSecret() {
            return caCertSecret;
        }

        /**
         * Set caCertSecret
         **/
        public void setCaCertSecret(SecretKeySelector caCertSecret) {
            this.caCertSecret = caCertSecret;
        }

        public TLSConfigQueryParam caCertSecret(SecretKeySelector caCertSecret) {
            this.caCertSecret = caCertSecret;
            return this;
        }

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

        public TLSConfigQueryParam clientCertSecret(SecretKeySelector clientCertSecret) {
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

        public TLSConfigQueryParam clientKeySecret(SecretKeySelector clientKeySecret) {
            this.clientKeySecret = clientKeySecret;
            return this;
        }

        /**
        * Get insecureSkipVerify
        * @return insecureSkipVerify
        **/
        @JsonProperty("insecureSkipVerify")
        public Boolean getInsecureSkipVerify() {
            return insecureSkipVerify;
        }

        /**
         * Set insecureSkipVerify
         **/
        public void setInsecureSkipVerify(Boolean insecureSkipVerify) {
            this.insecureSkipVerify = insecureSkipVerify;
        }

        public TLSConfigQueryParam insecureSkipVerify(Boolean insecureSkipVerify) {
            this.insecureSkipVerify = insecureSkipVerify;
            return this;
        }

        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class TLSConfigQueryParam {\n");

            sb.append("    caCertSecret: ").append(toIndentedString(caCertSecret)).append("\n");
            sb.append("    clientCertSecret: ").append(toIndentedString(clientCertSecret)).append("\n");
            sb.append("    clientKeySecret: ").append(toIndentedString(clientKeySecret)).append("\n");
            sb.append("    insecureSkipVerify: ").append(toIndentedString(insecureSkipVerify)).append("\n");
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
