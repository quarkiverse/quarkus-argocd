package io.quarkiverse.argocd.events.v1alpha1;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.Type;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class HTTPTrigger  {

    private BasicAuth basicAuth;
    private Map<String, String> headers;
    private String method;
    private List<TriggerParameter> parameters;
    private List<TriggerParameter> payload;
    private List<SecureHeader> secureHeaders;
    private String timeout;
    private TLSConfig tls;
    private String url;

    /**
    * Get basicAuth
    * @return basicAuth
    **/
    @JsonProperty("basicAuth")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public BasicAuth getBasicAuth() {
        return basicAuth;
    }

    /**
     * Set basicAuth
     **/
    public void setBasicAuth(BasicAuth basicAuth) {
        this.basicAuth = basicAuth;
    }

    public HTTPTrigger basicAuth(BasicAuth basicAuth) {
        this.basicAuth = basicAuth;
        return this;
    }

    /**
    * Get headers
    * @return headers
    **/
    @JsonProperty("headers")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public Map<String, String> getHeaders() {
        return headers;
    }

    /**
     * Set headers
     **/
    public void setHeaders(Map<String, String> headers) {
        this.headers = headers;
    }

    public HTTPTrigger headers(Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public HTTPTrigger putHeadersItem(String key, String headersItem) {
           if (this.headers == null){
                headers = new HashMap<>();
            }
        this.headers.put(key, headersItem);
        return this;
    }

    /**
    * Get method
    * @return method
    **/
    @JsonProperty("method")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public String getMethod() {
        return method;
    }

    /**
     * Set method
     **/
    public void setMethod(String method) {
        this.method = method;
    }

    public HTTPTrigger method(String method) {
        this.method = method;
        return this;
    }

    /**
    * Parameters is the list of key-value extracted from event's payload that are applied to the HTTP trigger resource.
    * @return parameters
    **/
    @JsonProperty("parameters")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public List<TriggerParameter> getParameters() {
        return parameters;
    }

    /**
     * Set parameters
     **/
    public void setParameters(List<TriggerParameter> parameters) {
        this.parameters = parameters;
    }

    public HTTPTrigger parameters(List<TriggerParameter> parameters) {
        this.parameters = parameters;
        return this;
    }
    public HTTPTrigger addParametersItem(TriggerParameter parametersItem) {
        if (this.parameters == null){
            parameters = new ArrayList<>();
        }
        this.parameters.add(parametersItem);
        return this;
    }

    /**
    * Get payload
    * @return payload
    **/
    @JsonProperty("payload")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public List<TriggerParameter> getPayload() {
        return payload;
    }

    /**
     * Set payload
     **/
    public void setPayload(List<TriggerParameter> payload) {
        this.payload = payload;
    }

    public HTTPTrigger payload(List<TriggerParameter> payload) {
        this.payload = payload;
        return this;
    }
    public HTTPTrigger addPayloadItem(TriggerParameter payloadItem) {
        if (this.payload == null){
            payload = new ArrayList<>();
        }
        this.payload.add(payloadItem);
        return this;
    }

    /**
    * Get secureHeaders
    * @return secureHeaders
    **/
    @JsonProperty("secureHeaders")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public List<SecureHeader> getSecureHeaders() {
        return secureHeaders;
    }

    /**
     * Set secureHeaders
     **/
    public void setSecureHeaders(List<SecureHeader> secureHeaders) {
        this.secureHeaders = secureHeaders;
    }

    public HTTPTrigger secureHeaders(List<SecureHeader> secureHeaders) {
        this.secureHeaders = secureHeaders;
        return this;
    }
    public HTTPTrigger addSecureHeadersItem(SecureHeader secureHeadersItem) {
        if (this.secureHeaders == null){
            secureHeaders = new ArrayList<>();
        }
        this.secureHeaders.add(secureHeadersItem);
        return this;
    }

    /**
    * Get timeout
    * @return timeout
    **/
    @JsonProperty("timeout")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public String getTimeout() {
        return timeout;
    }

    /**
     * Set timeout
     **/
    public void setTimeout(String timeout) {
        this.timeout = timeout;
    }

    public HTTPTrigger timeout(String timeout) {
        this.timeout = timeout;
        return this;
    }

    /**
    * Get tls
    * @return tls
    **/
    @JsonProperty("tls")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public TLSConfig getTls() {
        return tls;
    }

    /**
     * Set tls
     **/
    public void setTls(TLSConfig tls) {
        this.tls = tls;
    }

    public HTTPTrigger tls(TLSConfig tls) {
        this.tls = tls;
        return this;
    }

    /**
    * URL refers to the URL to send HTTP request to.
    * @return url
    **/
    @JsonProperty("url")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public String getUrl() {
        return url;
    }

    /**
     * Set url
     **/
    public void setUrl(String url) {
        this.url = url;
    }

    public HTTPTrigger url(String url) {
        this.url = url;
        return this;
    }

    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class HTTPTrigger {\n");

        sb.append("    basicAuth: ").append(toIndentedString(basicAuth)).append("\n");
        sb.append("    headers: ").append(toIndentedString(headers)).append("\n");
        sb.append("    method: ").append(toIndentedString(method)).append("\n");
        sb.append("    parameters: ").append(toIndentedString(parameters)).append("\n");
        sb.append("    payload: ").append(toIndentedString(payload)).append("\n");
        sb.append("    secureHeaders: ").append(toIndentedString(secureHeaders)).append("\n");
        sb.append("    timeout: ").append(toIndentedString(timeout)).append("\n");
        sb.append("    tls: ").append(toIndentedString(tls)).append("\n");
        sb.append("    url: ").append(toIndentedString(url)).append("\n");
        
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
    public static class HTTPTriggerQueryParam  {

        @jakarta.ws.rs.QueryParam("basicAuth")
        private BasicAuth basicAuth;
        @jakarta.ws.rs.QueryParam("headers")
        private Map<String, String> headers = null;
        @jakarta.ws.rs.QueryParam("method")
        private String method;
        @jakarta.ws.rs.QueryParam("parameters")
        private List<TriggerParameter> parameters = null;
        @jakarta.ws.rs.QueryParam("payload")
        private List<TriggerParameter> payload = null;
        @jakarta.ws.rs.QueryParam("secureHeaders")
        private List<SecureHeader> secureHeaders = null;
        @jakarta.ws.rs.QueryParam("timeout")
        private String timeout;
        @jakarta.ws.rs.QueryParam("tls")
        private TLSConfig tls;
        @jakarta.ws.rs.QueryParam("url")
        private String url;

        /**
        * Get basicAuth
        * @return basicAuth
        **/
        @JsonProperty("basicAuth")
        public BasicAuth getBasicAuth() {
            return basicAuth;
        }

        /**
         * Set basicAuth
         **/
        public void setBasicAuth(BasicAuth basicAuth) {
            this.basicAuth = basicAuth;
        }

        public HTTPTriggerQueryParam basicAuth(BasicAuth basicAuth) {
            this.basicAuth = basicAuth;
            return this;
        }

        /**
        * Get headers
        * @return headers
        **/
        @JsonProperty("headers")
        public Map<String, String> getHeaders() {
            return headers;
        }

        /**
         * Set headers
         **/
        public void setHeaders(Map<String, String> headers) {
            this.headers = headers;
        }

        public HTTPTriggerQueryParam headers(Map<String, String> headers) {
            this.headers = headers;
            return this;
        }
        public HTTPTriggerQueryParam putHeadersItem(String key, String headersItem) {
            this.headers.put(key, headersItem);
            return this;
        }

        /**
        * Get method
        * @return method
        **/
        @JsonProperty("method")
        public String getMethod() {
            return method;
        }

        /**
         * Set method
         **/
        public void setMethod(String method) {
            this.method = method;
        }

        public HTTPTriggerQueryParam method(String method) {
            this.method = method;
            return this;
        }

        /**
        * Parameters is the list of key-value extracted from event's payload that are applied to the HTTP trigger resource.
        * @return parameters
        **/
        @JsonProperty("parameters")
        public List<TriggerParameter> getParameters() {
            return parameters;
        }

        /**
         * Set parameters
         **/
        public void setParameters(List<TriggerParameter> parameters) {
            this.parameters = parameters;
        }

        public HTTPTriggerQueryParam parameters(List<TriggerParameter> parameters) {
            this.parameters = parameters;
            return this;
        }
        public HTTPTriggerQueryParam addParametersItem(TriggerParameter parametersItem) {
            this.parameters.add(parametersItem);
            return this;
        }

        /**
        * Get payload
        * @return payload
        **/
        @JsonProperty("payload")
        public List<TriggerParameter> getPayload() {
            return payload;
        }

        /**
         * Set payload
         **/
        public void setPayload(List<TriggerParameter> payload) {
            this.payload = payload;
        }

        public HTTPTriggerQueryParam payload(List<TriggerParameter> payload) {
            this.payload = payload;
            return this;
        }
        public HTTPTriggerQueryParam addPayloadItem(TriggerParameter payloadItem) {
            this.payload.add(payloadItem);
            return this;
        }

        /**
        * Get secureHeaders
        * @return secureHeaders
        **/
        @JsonProperty("secureHeaders")
        public List<SecureHeader> getSecureHeaders() {
            return secureHeaders;
        }

        /**
         * Set secureHeaders
         **/
        public void setSecureHeaders(List<SecureHeader> secureHeaders) {
            this.secureHeaders = secureHeaders;
        }

        public HTTPTriggerQueryParam secureHeaders(List<SecureHeader> secureHeaders) {
            this.secureHeaders = secureHeaders;
            return this;
        }
        public HTTPTriggerQueryParam addSecureHeadersItem(SecureHeader secureHeadersItem) {
            this.secureHeaders.add(secureHeadersItem);
            return this;
        }

        /**
        * Get timeout
        * @return timeout
        **/
        @JsonProperty("timeout")
        public String getTimeout() {
            return timeout;
        }

        /**
         * Set timeout
         **/
        public void setTimeout(String timeout) {
            this.timeout = timeout;
        }

        public HTTPTriggerQueryParam timeout(String timeout) {
            this.timeout = timeout;
            return this;
        }

        /**
        * Get tls
        * @return tls
        **/
        @JsonProperty("tls")
        public TLSConfig getTls() {
            return tls;
        }

        /**
         * Set tls
         **/
        public void setTls(TLSConfig tls) {
            this.tls = tls;
        }

        public HTTPTriggerQueryParam tls(TLSConfig tls) {
            this.tls = tls;
            return this;
        }

        /**
        * URL refers to the URL to send HTTP request to.
        * @return url
        **/
        @JsonProperty("url")
        public String getUrl() {
            return url;
        }

        /**
         * Set url
         **/
        public void setUrl(String url) {
            this.url = url;
        }

        public HTTPTriggerQueryParam url(String url) {
            this.url = url;
            return this;
        }

        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class HTTPTriggerQueryParam {\n");

            sb.append("    basicAuth: ").append(toIndentedString(basicAuth)).append("\n");
            sb.append("    headers: ").append(toIndentedString(headers)).append("\n");
            sb.append("    method: ").append(toIndentedString(method)).append("\n");
            sb.append("    parameters: ").append(toIndentedString(parameters)).append("\n");
            sb.append("    payload: ").append(toIndentedString(payload)).append("\n");
            sb.append("    secureHeaders: ").append(toIndentedString(secureHeaders)).append("\n");
            sb.append("    timeout: ").append(toIndentedString(timeout)).append("\n");
            sb.append("    tls: ").append(toIndentedString(tls)).append("\n");
            sb.append("    url: ").append(toIndentedString(url)).append("\n");
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
