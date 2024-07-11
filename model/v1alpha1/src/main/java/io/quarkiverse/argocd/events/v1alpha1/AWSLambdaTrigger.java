package io.quarkiverse.argocd.events.v1alpha1;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.fabric8.kubernetes.api.model.SecretKeySelector;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.Type;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class AWSLambdaTrigger  {

    private SecretKeySelector accessKey;
    private String functionName;
    private String invocationType;
    private List<TriggerParameter> parameters;
    private List<TriggerParameter> payload;
    private String region;
    private String roleARN;
    private SecretKeySelector secretKey;

    /**
    * Get accessKey
    * @return accessKey
    **/
    @JsonProperty("accessKey")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public SecretKeySelector getAccessKey() {
        return accessKey;
    }

    /**
     * Set accessKey
     **/
    public void setAccessKey(SecretKeySelector accessKey) {
        this.accessKey = accessKey;
    }

    public AWSLambdaTrigger accessKey(SecretKeySelector accessKey) {
        this.accessKey = accessKey;
        return this;
    }

    /**
    * FunctionName refers to the name of the function to invoke.
    * @return functionName
    **/
    @JsonProperty("functionName")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public String getFunctionName() {
        return functionName;
    }

    /**
     * Set functionName
     **/
    public void setFunctionName(String functionName) {
        this.functionName = functionName;
    }

    public AWSLambdaTrigger functionName(String functionName) {
        this.functionName = functionName;
        return this;
    }

    /**
    * Choose from the following options.     * RequestResponse (default) - Invoke the function synchronously. Keep    the connection open until the function returns a response or times out.    The API response includes the function response and additional data.     * Event - Invoke the function asynchronously. Send events that fail multiple    times to the function's dead-letter queue (if it's configured). The API    response only includes a status code.     * DryRun - Validate parameter values and verify that the user or role    has permission to invoke the function. +optional
    * @return invocationType
    **/
    @JsonProperty("invocationType")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public String getInvocationType() {
        return invocationType;
    }

    /**
     * Set invocationType
     **/
    public void setInvocationType(String invocationType) {
        this.invocationType = invocationType;
    }

    public AWSLambdaTrigger invocationType(String invocationType) {
        this.invocationType = invocationType;
        return this;
    }

    /**
    * Get parameters
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

    public AWSLambdaTrigger parameters(List<TriggerParameter> parameters) {
        this.parameters = parameters;
        return this;
    }
    public AWSLambdaTrigger addParametersItem(TriggerParameter parametersItem) {
        if (this.parameters == null){
            parameters = new ArrayList<>();
        }
        this.parameters.add(parametersItem);
        return this;
    }

    /**
    * Payload is the list of key-value extracted from an event payload to construct the request payload.
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

    public AWSLambdaTrigger payload(List<TriggerParameter> payload) {
        this.payload = payload;
        return this;
    }
    public AWSLambdaTrigger addPayloadItem(TriggerParameter payloadItem) {
        if (this.payload == null){
            payload = new ArrayList<>();
        }
        this.payload.add(payloadItem);
        return this;
    }

    /**
    * Get region
    * @return region
    **/
    @JsonProperty("region")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public String getRegion() {
        return region;
    }

    /**
     * Set region
     **/
    public void setRegion(String region) {
        this.region = region;
    }

    public AWSLambdaTrigger region(String region) {
        this.region = region;
        return this;
    }

    /**
    * Get roleARN
    * @return roleARN
    **/
    @JsonProperty("roleARN")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public String getRoleARN() {
        return roleARN;
    }

    /**
     * Set roleARN
     **/
    public void setRoleARN(String roleARN) {
        this.roleARN = roleARN;
    }

    public AWSLambdaTrigger roleARN(String roleARN) {
        this.roleARN = roleARN;
        return this;
    }

    /**
    * Get secretKey
    * @return secretKey
    **/
    @JsonProperty("secretKey")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public SecretKeySelector getSecretKey() {
        return secretKey;
    }

    /**
     * Set secretKey
     **/
    public void setSecretKey(SecretKeySelector secretKey) {
        this.secretKey = secretKey;
    }

    public AWSLambdaTrigger secretKey(SecretKeySelector secretKey) {
        this.secretKey = secretKey;
        return this;
    }

    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AWSLambdaTrigger {\n");

        sb.append("    accessKey: ").append(toIndentedString(accessKey)).append("\n");
        sb.append("    functionName: ").append(toIndentedString(functionName)).append("\n");
        sb.append("    invocationType: ").append(toIndentedString(invocationType)).append("\n");
        sb.append("    parameters: ").append(toIndentedString(parameters)).append("\n");
        sb.append("    payload: ").append(toIndentedString(payload)).append("\n");
        sb.append("    region: ").append(toIndentedString(region)).append("\n");
        sb.append("    roleARN: ").append(toIndentedString(roleARN)).append("\n");
        sb.append("    secretKey: ").append(toIndentedString(secretKey)).append("\n");
        
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
    public static class AWSLambdaTriggerQueryParam  {

        @jakarta.ws.rs.QueryParam("accessKey")
        private SecretKeySelector accessKey;
        @jakarta.ws.rs.QueryParam("functionName")
        private String functionName;
        @jakarta.ws.rs.QueryParam("invocationType")
        private String invocationType;
        @jakarta.ws.rs.QueryParam("parameters")
        private List<TriggerParameter> parameters = null;
        @jakarta.ws.rs.QueryParam("payload")
        private List<TriggerParameter> payload = null;
        @jakarta.ws.rs.QueryParam("region")
        private String region;
        @jakarta.ws.rs.QueryParam("roleARN")
        private String roleARN;
        @jakarta.ws.rs.QueryParam("secretKey")
        private SecretKeySelector secretKey;

        /**
        * Get accessKey
        * @return accessKey
        **/
        @JsonProperty("accessKey")
        public SecretKeySelector getAccessKey() {
            return accessKey;
        }

        /**
         * Set accessKey
         **/
        public void setAccessKey(SecretKeySelector accessKey) {
            this.accessKey = accessKey;
        }

        public AWSLambdaTriggerQueryParam accessKey(SecretKeySelector accessKey) {
            this.accessKey = accessKey;
            return this;
        }

        /**
        * FunctionName refers to the name of the function to invoke.
        * @return functionName
        **/
        @JsonProperty("functionName")
        public String getFunctionName() {
            return functionName;
        }

        /**
         * Set functionName
         **/
        public void setFunctionName(String functionName) {
            this.functionName = functionName;
        }

        public AWSLambdaTriggerQueryParam functionName(String functionName) {
            this.functionName = functionName;
            return this;
        }

        /**
        * Choose from the following options.     * RequestResponse (default) - Invoke the function synchronously. Keep    the connection open until the function returns a response or times out.    The API response includes the function response and additional data.     * Event - Invoke the function asynchronously. Send events that fail multiple    times to the function's dead-letter queue (if it's configured). The API    response only includes a status code.     * DryRun - Validate parameter values and verify that the user or role    has permission to invoke the function. +optional
        * @return invocationType
        **/
        @JsonProperty("invocationType")
        public String getInvocationType() {
            return invocationType;
        }

        /**
         * Set invocationType
         **/
        public void setInvocationType(String invocationType) {
            this.invocationType = invocationType;
        }

        public AWSLambdaTriggerQueryParam invocationType(String invocationType) {
            this.invocationType = invocationType;
            return this;
        }

        /**
        * Get parameters
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

        public AWSLambdaTriggerQueryParam parameters(List<TriggerParameter> parameters) {
            this.parameters = parameters;
            return this;
        }
        public AWSLambdaTriggerQueryParam addParametersItem(TriggerParameter parametersItem) {
            this.parameters.add(parametersItem);
            return this;
        }

        /**
        * Payload is the list of key-value extracted from an event payload to construct the request payload.
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

        public AWSLambdaTriggerQueryParam payload(List<TriggerParameter> payload) {
            this.payload = payload;
            return this;
        }
        public AWSLambdaTriggerQueryParam addPayloadItem(TriggerParameter payloadItem) {
            this.payload.add(payloadItem);
            return this;
        }

        /**
        * Get region
        * @return region
        **/
        @JsonProperty("region")
        public String getRegion() {
            return region;
        }

        /**
         * Set region
         **/
        public void setRegion(String region) {
            this.region = region;
        }

        public AWSLambdaTriggerQueryParam region(String region) {
            this.region = region;
            return this;
        }

        /**
        * Get roleARN
        * @return roleARN
        **/
        @JsonProperty("roleARN")
        public String getRoleARN() {
            return roleARN;
        }

        /**
         * Set roleARN
         **/
        public void setRoleARN(String roleARN) {
            this.roleARN = roleARN;
        }

        public AWSLambdaTriggerQueryParam roleARN(String roleARN) {
            this.roleARN = roleARN;
            return this;
        }

        /**
        * Get secretKey
        * @return secretKey
        **/
        @JsonProperty("secretKey")
        public SecretKeySelector getSecretKey() {
            return secretKey;
        }

        /**
         * Set secretKey
         **/
        public void setSecretKey(SecretKeySelector secretKey) {
            this.secretKey = secretKey;
        }

        public AWSLambdaTriggerQueryParam secretKey(SecretKeySelector secretKey) {
            this.secretKey = secretKey;
            return this;
        }

        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class AWSLambdaTriggerQueryParam {\n");

            sb.append("    accessKey: ").append(toIndentedString(accessKey)).append("\n");
            sb.append("    functionName: ").append(toIndentedString(functionName)).append("\n");
            sb.append("    invocationType: ").append(toIndentedString(invocationType)).append("\n");
            sb.append("    parameters: ").append(toIndentedString(parameters)).append("\n");
            sb.append("    payload: ").append(toIndentedString(payload)).append("\n");
            sb.append("    region: ").append(toIndentedString(region)).append("\n");
            sb.append("    roleARN: ").append(toIndentedString(roleARN)).append("\n");
            sb.append("    secretKey: ").append(toIndentedString(secretKey)).append("\n");
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
