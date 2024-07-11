package io.quarkiverse.argocd.workflow.v1alpha1;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.quarkiverse.argocd.v1alpha1.model.HTTPBodySource;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.Type;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class HTTP  {

    private String body;
    private HTTPBodySource bodyFrom;
    private List<HTTPHeader> headers;
    private Boolean insecureSkipVerify;
    private String method;
    private String successCondition;
    private Integer timeoutSeconds;
    private String url;

    /**
    * Body is content of the HTTP Request
    * @return body
    **/
    @JsonProperty("body")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public String getBody() {
        return body;
    }

    /**
     * Set body
     **/
    public void setBody(String body) {
        this.body = body;
    }

    public HTTP body(String body) {
        this.body = body;
        return this;
    }

    /**
    * Get bodyFrom
    * @return bodyFrom
    **/
    @JsonProperty("bodyFrom")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public HTTPBodySource getBodyFrom() {
        return bodyFrom;
    }

    /**
     * Set bodyFrom
     **/
    public void setBodyFrom(HTTPBodySource bodyFrom) {
        this.bodyFrom = bodyFrom;
    }

    public HTTP bodyFrom(HTTPBodySource bodyFrom) {
        this.bodyFrom = bodyFrom;
        return this;
    }

    /**
    * Headers are an optional list of headers to send with HTTP requests
    * @return headers
    **/
    @JsonProperty("headers")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public List<HTTPHeader> getHeaders() {
        return headers;
    }

    /**
     * Set headers
     **/
    public void setHeaders(List<HTTPHeader> headers) {
        this.headers = headers;
    }

    public HTTP headers(List<HTTPHeader> headers) {
        this.headers = headers;
        return this;
    }
    public HTTP addHeadersItem(HTTPHeader headersItem) {
        if (this.headers == null){
            headers = new ArrayList<>();
        }
        this.headers.add(headersItem);
        return this;
    }

    /**
    * InsecureSkipVerify is a bool when if set to true will skip TLS verification for the HTTP client
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

    public HTTP insecureSkipVerify(Boolean insecureSkipVerify) {
        this.insecureSkipVerify = insecureSkipVerify;
        return this;
    }

    /**
    * Method is HTTP methods for HTTP Request
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

    public HTTP method(String method) {
        this.method = method;
        return this;
    }

    /**
    * SuccessCondition is an expression if evaluated to true is considered successful
    * @return successCondition
    **/
    @JsonProperty("successCondition")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public String getSuccessCondition() {
        return successCondition;
    }

    /**
     * Set successCondition
     **/
    public void setSuccessCondition(String successCondition) {
        this.successCondition = successCondition;
    }

    public HTTP successCondition(String successCondition) {
        this.successCondition = successCondition;
        return this;
    }

    /**
    * TimeoutSeconds is request timeout for HTTP Request. Default is 30 seconds
    * @return timeoutSeconds
    **/
    @JsonProperty("timeoutSeconds")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public Integer getTimeoutSeconds() {
        return timeoutSeconds;
    }

    /**
     * Set timeoutSeconds
     **/
    public void setTimeoutSeconds(Integer timeoutSeconds) {
        this.timeoutSeconds = timeoutSeconds;
    }

    public HTTP timeoutSeconds(Integer timeoutSeconds) {
        this.timeoutSeconds = timeoutSeconds;
        return this;
    }

    /**
    * URL of the HTTP Request
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

    public HTTP url(String url) {
        this.url = url;
        return this;
    }

    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class HTTP {\n");

        sb.append("    body: ").append(toIndentedString(body)).append("\n");
        sb.append("    bodyFrom: ").append(toIndentedString(bodyFrom)).append("\n");
        sb.append("    headers: ").append(toIndentedString(headers)).append("\n");
        sb.append("    insecureSkipVerify: ").append(toIndentedString(insecureSkipVerify)).append("\n");
        sb.append("    method: ").append(toIndentedString(method)).append("\n");
        sb.append("    successCondition: ").append(toIndentedString(successCondition)).append("\n");
        sb.append("    timeoutSeconds: ").append(toIndentedString(timeoutSeconds)).append("\n");
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
    public static class HTTPQueryParam  {

        @jakarta.ws.rs.QueryParam("body")
        private String body;
        @jakarta.ws.rs.QueryParam("bodyFrom")
        private HTTPBodySource bodyFrom;
        @jakarta.ws.rs.QueryParam("headers")
        private List<HTTPHeader> headers = null;
        @jakarta.ws.rs.QueryParam("insecureSkipVerify")
        private Boolean insecureSkipVerify;
        @jakarta.ws.rs.QueryParam("method")
        private String method;
        @jakarta.ws.rs.QueryParam("successCondition")
        private String successCondition;
        @jakarta.ws.rs.QueryParam("timeoutSeconds")
        private Integer timeoutSeconds;
        @jakarta.ws.rs.QueryParam("url")
        private String url;

        /**
        * Body is content of the HTTP Request
        * @return body
        **/
        @JsonProperty("body")
        public String getBody() {
            return body;
        }

        /**
         * Set body
         **/
        public void setBody(String body) {
            this.body = body;
        }

        public HTTPQueryParam body(String body) {
            this.body = body;
            return this;
        }

        /**
        * Get bodyFrom
        * @return bodyFrom
        **/
        @JsonProperty("bodyFrom")
        public HTTPBodySource getBodyFrom() {
            return bodyFrom;
        }

        /**
         * Set bodyFrom
         **/
        public void setBodyFrom(HTTPBodySource bodyFrom) {
            this.bodyFrom = bodyFrom;
        }

        public HTTPQueryParam bodyFrom(HTTPBodySource bodyFrom) {
            this.bodyFrom = bodyFrom;
            return this;
        }

        /**
        * Headers are an optional list of headers to send with HTTP requests
        * @return headers
        **/
        @JsonProperty("headers")
        public List<HTTPHeader> getHeaders() {
            return headers;
        }

        /**
         * Set headers
         **/
        public void setHeaders(List<HTTPHeader> headers) {
            this.headers = headers;
        }

        public HTTPQueryParam headers(List<HTTPHeader> headers) {
            this.headers = headers;
            return this;
        }
        public HTTPQueryParam addHeadersItem(HTTPHeader headersItem) {
            this.headers.add(headersItem);
            return this;
        }

        /**
        * InsecureSkipVerify is a bool when if set to true will skip TLS verification for the HTTP client
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

        public HTTPQueryParam insecureSkipVerify(Boolean insecureSkipVerify) {
            this.insecureSkipVerify = insecureSkipVerify;
            return this;
        }

        /**
        * Method is HTTP methods for HTTP Request
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

        public HTTPQueryParam method(String method) {
            this.method = method;
            return this;
        }

        /**
        * SuccessCondition is an expression if evaluated to true is considered successful
        * @return successCondition
        **/
        @JsonProperty("successCondition")
        public String getSuccessCondition() {
            return successCondition;
        }

        /**
         * Set successCondition
         **/
        public void setSuccessCondition(String successCondition) {
            this.successCondition = successCondition;
        }

        public HTTPQueryParam successCondition(String successCondition) {
            this.successCondition = successCondition;
            return this;
        }

        /**
        * TimeoutSeconds is request timeout for HTTP Request. Default is 30 seconds
        * @return timeoutSeconds
        **/
        @JsonProperty("timeoutSeconds")
        public Integer getTimeoutSeconds() {
            return timeoutSeconds;
        }

        /**
         * Set timeoutSeconds
         **/
        public void setTimeoutSeconds(Integer timeoutSeconds) {
            this.timeoutSeconds = timeoutSeconds;
        }

        public HTTPQueryParam timeoutSeconds(Integer timeoutSeconds) {
            this.timeoutSeconds = timeoutSeconds;
            return this;
        }

        /**
        * URL of the HTTP Request
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

        public HTTPQueryParam url(String url) {
            this.url = url;
            return this;
        }

        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class HTTPQueryParam {\n");

            sb.append("    body: ").append(toIndentedString(body)).append("\n");
            sb.append("    bodyFrom: ").append(toIndentedString(bodyFrom)).append("\n");
            sb.append("    headers: ").append(toIndentedString(headers)).append("\n");
            sb.append("    insecureSkipVerify: ").append(toIndentedString(insecureSkipVerify)).append("\n");
            sb.append("    method: ").append(toIndentedString(method)).append("\n");
            sb.append("    successCondition: ").append(toIndentedString(successCondition)).append("\n");
            sb.append("    timeoutSeconds: ").append(toIndentedString(timeoutSeconds)).append("\n");
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
