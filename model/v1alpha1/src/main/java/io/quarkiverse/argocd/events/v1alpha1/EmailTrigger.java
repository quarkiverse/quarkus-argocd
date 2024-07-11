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
/**
  * EmailTrigger refers to the specification of the email notification trigger.
 **/
public class EmailTrigger  {

    /**
      * EmailTrigger refers to the specification of the email notification trigger.
     **/
    private String body;
    /**
      * EmailTrigger refers to the specification of the email notification trigger.
     **/
    private String from;
    /**
      * EmailTrigger refers to the specification of the email notification trigger.
     **/
    private String host;
    /**
      * EmailTrigger refers to the specification of the email notification trigger.
     **/
    private List<TriggerParameter> parameters;
    /**
      * EmailTrigger refers to the specification of the email notification trigger.
     **/
    private Integer port;
    /**
      * EmailTrigger refers to the specification of the email notification trigger.
     **/
    private SecretKeySelector smtpPassword;
    /**
      * EmailTrigger refers to the specification of the email notification trigger.
     **/
    private String subject;
    /**
      * EmailTrigger refers to the specification of the email notification trigger.
     **/
    private List<String> to;
    /**
      * EmailTrigger refers to the specification of the email notification trigger.
     **/
    private String username;

    /**
    * Get body
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

    public EmailTrigger body(String body) {
        this.body = body;
        return this;
    }

    /**
    * Get from
    * @return from
    **/
    @JsonProperty("from")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public String getFrom() {
        return from;
    }

    /**
     * Set from
     **/
    public void setFrom(String from) {
        this.from = from;
    }

    public EmailTrigger from(String from) {
        this.from = from;
        return this;
    }

    /**
    * Host refers to the smtp host url to which email is send.
    * @return host
    **/
    @JsonProperty("host")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public String getHost() {
        return host;
    }

    /**
     * Set host
     **/
    public void setHost(String host) {
        this.host = host;
    }

    public EmailTrigger host(String host) {
        this.host = host;
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

    public EmailTrigger parameters(List<TriggerParameter> parameters) {
        this.parameters = parameters;
        return this;
    }
    public EmailTrigger addParametersItem(TriggerParameter parametersItem) {
        if (this.parameters == null){
            parameters = new ArrayList<>();
        }
        this.parameters.add(parametersItem);
        return this;
    }

    /**
    * Get port
    * @return port
    **/
    @JsonProperty("port")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public Integer getPort() {
        return port;
    }

    /**
     * Set port
     **/
    public void setPort(Integer port) {
        this.port = port;
    }

    public EmailTrigger port(Integer port) {
        this.port = port;
        return this;
    }

    /**
    * Get smtpPassword
    * @return smtpPassword
    **/
    @JsonProperty("smtpPassword")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public SecretKeySelector getSmtpPassword() {
        return smtpPassword;
    }

    /**
     * Set smtpPassword
     **/
    public void setSmtpPassword(SecretKeySelector smtpPassword) {
        this.smtpPassword = smtpPassword;
    }

    public EmailTrigger smtpPassword(SecretKeySelector smtpPassword) {
        this.smtpPassword = smtpPassword;
        return this;
    }

    /**
    * Get subject
    * @return subject
    **/
    @JsonProperty("subject")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public String getSubject() {
        return subject;
    }

    /**
     * Set subject
     **/
    public void setSubject(String subject) {
        this.subject = subject;
    }

    public EmailTrigger subject(String subject) {
        this.subject = subject;
        return this;
    }

    /**
    * Get to
    * @return to
    **/
    @JsonProperty("to")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public List<String> getTo() {
        return to;
    }

    /**
     * Set to
     **/
    public void setTo(List<String> to) {
        this.to = to;
    }

    public EmailTrigger to(List<String> to) {
        this.to = to;
        return this;
    }
    public EmailTrigger addToItem(String toItem) {
        if (this.to == null){
            to = new ArrayList<>();
        }
        this.to.add(toItem);
        return this;
    }

    /**
    * Get username
    * @return username
    **/
    @JsonProperty("username")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public String getUsername() {
        return username;
    }

    /**
     * Set username
     **/
    public void setUsername(String username) {
        this.username = username;
    }

    public EmailTrigger username(String username) {
        this.username = username;
        return this;
    }

    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class EmailTrigger {\n");

        sb.append("    body: ").append(toIndentedString(body)).append("\n");
        sb.append("    from: ").append(toIndentedString(from)).append("\n");
        sb.append("    host: ").append(toIndentedString(host)).append("\n");
        sb.append("    parameters: ").append(toIndentedString(parameters)).append("\n");
        sb.append("    port: ").append(toIndentedString(port)).append("\n");
        sb.append("    smtpPassword: ").append(toIndentedString(smtpPassword)).append("\n");
        sb.append("    subject: ").append(toIndentedString(subject)).append("\n");
        sb.append("    to: ").append(toIndentedString(to)).append("\n");
        sb.append("    username: ").append(toIndentedString(username)).append("\n");
        
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
      * EmailTrigger refers to the specification of the email notification trigger.
     **/
    public static class EmailTriggerQueryParam  {

        /**
          * EmailTrigger refers to the specification of the email notification trigger.
         **/
        @jakarta.ws.rs.QueryParam("body")
        private String body;
        /**
          * EmailTrigger refers to the specification of the email notification trigger.
         **/
        @jakarta.ws.rs.QueryParam("from")
        private String from;
        /**
          * EmailTrigger refers to the specification of the email notification trigger.
         **/
        @jakarta.ws.rs.QueryParam("host")
        private String host;
        /**
          * EmailTrigger refers to the specification of the email notification trigger.
         **/
        @jakarta.ws.rs.QueryParam("parameters")
        private List<TriggerParameter> parameters = null;
        /**
          * EmailTrigger refers to the specification of the email notification trigger.
         **/
        @jakarta.ws.rs.QueryParam("port")
        private Integer port;
        /**
          * EmailTrigger refers to the specification of the email notification trigger.
         **/
        @jakarta.ws.rs.QueryParam("smtpPassword")
        private SecretKeySelector smtpPassword;
        /**
          * EmailTrigger refers to the specification of the email notification trigger.
         **/
        @jakarta.ws.rs.QueryParam("subject")
        private String subject;
        /**
          * EmailTrigger refers to the specification of the email notification trigger.
         **/
        @jakarta.ws.rs.QueryParam("to")
        private List<String> to = null;
        /**
          * EmailTrigger refers to the specification of the email notification trigger.
         **/
        @jakarta.ws.rs.QueryParam("username")
        private String username;

        /**
        * Get body
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

        public EmailTriggerQueryParam body(String body) {
            this.body = body;
            return this;
        }

        /**
        * Get from
        * @return from
        **/
        @JsonProperty("from")
        public String getFrom() {
            return from;
        }

        /**
         * Set from
         **/
        public void setFrom(String from) {
            this.from = from;
        }

        public EmailTriggerQueryParam from(String from) {
            this.from = from;
            return this;
        }

        /**
        * Host refers to the smtp host url to which email is send.
        * @return host
        **/
        @JsonProperty("host")
        public String getHost() {
            return host;
        }

        /**
         * Set host
         **/
        public void setHost(String host) {
            this.host = host;
        }

        public EmailTriggerQueryParam host(String host) {
            this.host = host;
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

        public EmailTriggerQueryParam parameters(List<TriggerParameter> parameters) {
            this.parameters = parameters;
            return this;
        }
        public EmailTriggerQueryParam addParametersItem(TriggerParameter parametersItem) {
            this.parameters.add(parametersItem);
            return this;
        }

        /**
        * Get port
        * @return port
        **/
        @JsonProperty("port")
        public Integer getPort() {
            return port;
        }

        /**
         * Set port
         **/
        public void setPort(Integer port) {
            this.port = port;
        }

        public EmailTriggerQueryParam port(Integer port) {
            this.port = port;
            return this;
        }

        /**
        * Get smtpPassword
        * @return smtpPassword
        **/
        @JsonProperty("smtpPassword")
        public SecretKeySelector getSmtpPassword() {
            return smtpPassword;
        }

        /**
         * Set smtpPassword
         **/
        public void setSmtpPassword(SecretKeySelector smtpPassword) {
            this.smtpPassword = smtpPassword;
        }

        public EmailTriggerQueryParam smtpPassword(SecretKeySelector smtpPassword) {
            this.smtpPassword = smtpPassword;
            return this;
        }

        /**
        * Get subject
        * @return subject
        **/
        @JsonProperty("subject")
        public String getSubject() {
            return subject;
        }

        /**
         * Set subject
         **/
        public void setSubject(String subject) {
            this.subject = subject;
        }

        public EmailTriggerQueryParam subject(String subject) {
            this.subject = subject;
            return this;
        }

        /**
        * Get to
        * @return to
        **/
        @JsonProperty("to")
        public List<String> getTo() {
            return to;
        }

        /**
         * Set to
         **/
        public void setTo(List<String> to) {
            this.to = to;
        }

        public EmailTriggerQueryParam to(List<String> to) {
            this.to = to;
            return this;
        }
        public EmailTriggerQueryParam addToItem(String toItem) {
            this.to.add(toItem);
            return this;
        }

        /**
        * Get username
        * @return username
        **/
        @JsonProperty("username")
        public String getUsername() {
            return username;
        }

        /**
         * Set username
         **/
        public void setUsername(String username) {
            this.username = username;
        }

        public EmailTriggerQueryParam username(String username) {
            this.username = username;
            return this;
        }

        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class EmailTriggerQueryParam {\n");

            sb.append("    body: ").append(toIndentedString(body)).append("\n");
            sb.append("    from: ").append(toIndentedString(from)).append("\n");
            sb.append("    host: ").append(toIndentedString(host)).append("\n");
            sb.append("    parameters: ").append(toIndentedString(parameters)).append("\n");
            sb.append("    port: ").append(toIndentedString(port)).append("\n");
            sb.append("    smtpPassword: ").append(toIndentedString(smtpPassword)).append("\n");
            sb.append("    subject: ").append(toIndentedString(subject)).append("\n");
            sb.append("    to: ").append(toIndentedString(to)).append("\n");
            sb.append("    username: ").append(toIndentedString(username)).append("\n");
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
