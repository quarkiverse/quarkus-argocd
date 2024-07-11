package io.quarkiverse.argocd.events.v1alpha1;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.Type;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
/**
  * TriggerTemplate is the template that describes trigger specification.
 **/
public class TriggerTemplate  {

    /**
      * TriggerTemplate is the template that describes trigger specification.
     **/
    private ArgoWorkflowTrigger argoWorkflow;
    /**
      * TriggerTemplate is the template that describes trigger specification.
     **/
    private AWSLambdaTrigger awsLambda;
    /**
      * TriggerTemplate is the template that describes trigger specification.
     **/
    private AzureEventHubsTrigger azureEventHubs;
    /**
      * TriggerTemplate is the template that describes trigger specification.
     **/
    private AzureServiceBusTrigger azureServiceBus;
    /**
      * TriggerTemplate is the template that describes trigger specification.
     **/
    private String conditions;
    /**
      * TriggerTemplate is the template that describes trigger specification.
     **/
    private List<ConditionsResetCriteria> conditionsReset;
    /**
      * TriggerTemplate is the template that describes trigger specification.
     **/
    private CustomTrigger custom;
    /**
      * TriggerTemplate is the template that describes trigger specification.
     **/
    private EmailTrigger email;
    /**
      * TriggerTemplate is the template that describes trigger specification.
     **/
    private HTTPTrigger http;
    /**
      * TriggerTemplate is the template that describes trigger specification.
     **/
    private StandardK8STrigger k8s;
    /**
      * TriggerTemplate is the template that describes trigger specification.
     **/
    private KafkaTrigger kafka;
    /**
      * TriggerTemplate is the template that describes trigger specification.
     **/
    private LogTrigger log;
    /**
      * TriggerTemplate is the template that describes trigger specification.
     **/
    private String name;
    /**
      * TriggerTemplate is the template that describes trigger specification.
     **/
    private NATSTrigger nats;
    /**
      * TriggerTemplate is the template that describes trigger specification.
     **/
    private OpenWhiskTrigger openWhisk;
    /**
      * TriggerTemplate is the template that describes trigger specification.
     **/
    private PulsarTrigger pulsar;
    /**
      * TriggerTemplate is the template that describes trigger specification.
     **/
    private SlackTrigger slack;

    /**
    * Get argoWorkflow
    * @return argoWorkflow
    **/
    @JsonProperty("argoWorkflow")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public ArgoWorkflowTrigger getArgoWorkflow() {
        return argoWorkflow;
    }

    /**
     * Set argoWorkflow
     **/
    public void setArgoWorkflow(ArgoWorkflowTrigger argoWorkflow) {
        this.argoWorkflow = argoWorkflow;
    }

    public TriggerTemplate argoWorkflow(ArgoWorkflowTrigger argoWorkflow) {
        this.argoWorkflow = argoWorkflow;
        return this;
    }

    /**
    * Get awsLambda
    * @return awsLambda
    **/
    @JsonProperty("awsLambda")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public AWSLambdaTrigger getAwsLambda() {
        return awsLambda;
    }

    /**
     * Set awsLambda
     **/
    public void setAwsLambda(AWSLambdaTrigger awsLambda) {
        this.awsLambda = awsLambda;
    }

    public TriggerTemplate awsLambda(AWSLambdaTrigger awsLambda) {
        this.awsLambda = awsLambda;
        return this;
    }

    /**
    * Get azureEventHubs
    * @return azureEventHubs
    **/
    @JsonProperty("azureEventHubs")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public AzureEventHubsTrigger getAzureEventHubs() {
        return azureEventHubs;
    }

    /**
     * Set azureEventHubs
     **/
    public void setAzureEventHubs(AzureEventHubsTrigger azureEventHubs) {
        this.azureEventHubs = azureEventHubs;
    }

    public TriggerTemplate azureEventHubs(AzureEventHubsTrigger azureEventHubs) {
        this.azureEventHubs = azureEventHubs;
        return this;
    }

    /**
    * Get azureServiceBus
    * @return azureServiceBus
    **/
    @JsonProperty("azureServiceBus")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public AzureServiceBusTrigger getAzureServiceBus() {
        return azureServiceBus;
    }

    /**
     * Set azureServiceBus
     **/
    public void setAzureServiceBus(AzureServiceBusTrigger azureServiceBus) {
        this.azureServiceBus = azureServiceBus;
    }

    public TriggerTemplate azureServiceBus(AzureServiceBusTrigger azureServiceBus) {
        this.azureServiceBus = azureServiceBus;
        return this;
    }

    /**
    * Get conditions
    * @return conditions
    **/
    @JsonProperty("conditions")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public String getConditions() {
        return conditions;
    }

    /**
     * Set conditions
     **/
    public void setConditions(String conditions) {
        this.conditions = conditions;
    }

    public TriggerTemplate conditions(String conditions) {
        this.conditions = conditions;
        return this;
    }

    /**
    * Get conditionsReset
    * @return conditionsReset
    **/
    @JsonProperty("conditionsReset")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public List<ConditionsResetCriteria> getConditionsReset() {
        return conditionsReset;
    }

    /**
     * Set conditionsReset
     **/
    public void setConditionsReset(List<ConditionsResetCriteria> conditionsReset) {
        this.conditionsReset = conditionsReset;
    }

    public TriggerTemplate conditionsReset(List<ConditionsResetCriteria> conditionsReset) {
        this.conditionsReset = conditionsReset;
        return this;
    }
    public TriggerTemplate addConditionsResetItem(ConditionsResetCriteria conditionsResetItem) {
        if (this.conditionsReset == null){
            conditionsReset = new ArrayList<>();
        }
        this.conditionsReset.add(conditionsResetItem);
        return this;
    }

    /**
    * Get custom
    * @return custom
    **/
    @JsonProperty("custom")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public CustomTrigger getCustom() {
        return custom;
    }

    /**
     * Set custom
     **/
    public void setCustom(CustomTrigger custom) {
        this.custom = custom;
    }

    public TriggerTemplate custom(CustomTrigger custom) {
        this.custom = custom;
        return this;
    }

    /**
    * Get email
    * @return email
    **/
    @JsonProperty("email")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public EmailTrigger getEmail() {
        return email;
    }

    /**
     * Set email
     **/
    public void setEmail(EmailTrigger email) {
        this.email = email;
    }

    public TriggerTemplate email(EmailTrigger email) {
        this.email = email;
        return this;
    }

    /**
    * Get http
    * @return http
    **/
    @JsonProperty("http")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public HTTPTrigger getHttp() {
        return http;
    }

    /**
     * Set http
     **/
    public void setHttp(HTTPTrigger http) {
        this.http = http;
    }

    public TriggerTemplate http(HTTPTrigger http) {
        this.http = http;
        return this;
    }

    /**
    * Get k8s
    * @return k8s
    **/
    @JsonProperty("k8s")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public StandardK8STrigger getK8s() {
        return k8s;
    }

    /**
     * Set k8s
     **/
    public void setK8s(StandardK8STrigger k8s) {
        this.k8s = k8s;
    }

    public TriggerTemplate k8s(StandardK8STrigger k8s) {
        this.k8s = k8s;
        return this;
    }

    /**
    * Get kafka
    * @return kafka
    **/
    @JsonProperty("kafka")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public KafkaTrigger getKafka() {
        return kafka;
    }

    /**
     * Set kafka
     **/
    public void setKafka(KafkaTrigger kafka) {
        this.kafka = kafka;
    }

    public TriggerTemplate kafka(KafkaTrigger kafka) {
        this.kafka = kafka;
        return this;
    }

    /**
    * Get log
    * @return log
    **/
    @JsonProperty("log")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public LogTrigger getLog() {
        return log;
    }

    /**
     * Set log
     **/
    public void setLog(LogTrigger log) {
        this.log = log;
    }

    public TriggerTemplate log(LogTrigger log) {
        this.log = log;
        return this;
    }

    /**
    * Name is a unique name of the action to take.
    * @return name
    **/
    @JsonProperty("name")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public String getName() {
        return name;
    }

    /**
     * Set name
     **/
    public void setName(String name) {
        this.name = name;
    }

    public TriggerTemplate name(String name) {
        this.name = name;
        return this;
    }

    /**
    * Get nats
    * @return nats
    **/
    @JsonProperty("nats")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public NATSTrigger getNats() {
        return nats;
    }

    /**
     * Set nats
     **/
    public void setNats(NATSTrigger nats) {
        this.nats = nats;
    }

    public TriggerTemplate nats(NATSTrigger nats) {
        this.nats = nats;
        return this;
    }

    /**
    * Get openWhisk
    * @return openWhisk
    **/
    @JsonProperty("openWhisk")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public OpenWhiskTrigger getOpenWhisk() {
        return openWhisk;
    }

    /**
     * Set openWhisk
     **/
    public void setOpenWhisk(OpenWhiskTrigger openWhisk) {
        this.openWhisk = openWhisk;
    }

    public TriggerTemplate openWhisk(OpenWhiskTrigger openWhisk) {
        this.openWhisk = openWhisk;
        return this;
    }

    /**
    * Get pulsar
    * @return pulsar
    **/
    @JsonProperty("pulsar")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public PulsarTrigger getPulsar() {
        return pulsar;
    }

    /**
     * Set pulsar
     **/
    public void setPulsar(PulsarTrigger pulsar) {
        this.pulsar = pulsar;
    }

    public TriggerTemplate pulsar(PulsarTrigger pulsar) {
        this.pulsar = pulsar;
        return this;
    }

    /**
    * Get slack
    * @return slack
    **/
    @JsonProperty("slack")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public SlackTrigger getSlack() {
        return slack;
    }

    /**
     * Set slack
     **/
    public void setSlack(SlackTrigger slack) {
        this.slack = slack;
    }

    public TriggerTemplate slack(SlackTrigger slack) {
        this.slack = slack;
        return this;
    }

    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TriggerTemplate {\n");

        sb.append("    argoWorkflow: ").append(toIndentedString(argoWorkflow)).append("\n");
        sb.append("    awsLambda: ").append(toIndentedString(awsLambda)).append("\n");
        sb.append("    azureEventHubs: ").append(toIndentedString(azureEventHubs)).append("\n");
        sb.append("    azureServiceBus: ").append(toIndentedString(azureServiceBus)).append("\n");
        sb.append("    conditions: ").append(toIndentedString(conditions)).append("\n");
        sb.append("    conditionsReset: ").append(toIndentedString(conditionsReset)).append("\n");
        sb.append("    custom: ").append(toIndentedString(custom)).append("\n");
        sb.append("    email: ").append(toIndentedString(email)).append("\n");
        sb.append("    http: ").append(toIndentedString(http)).append("\n");
        sb.append("    k8s: ").append(toIndentedString(k8s)).append("\n");
        sb.append("    kafka: ").append(toIndentedString(kafka)).append("\n");
        sb.append("    log: ").append(toIndentedString(log)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    nats: ").append(toIndentedString(nats)).append("\n");
        sb.append("    openWhisk: ").append(toIndentedString(openWhisk)).append("\n");
        sb.append("    pulsar: ").append(toIndentedString(pulsar)).append("\n");
        sb.append("    slack: ").append(toIndentedString(slack)).append("\n");
        
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
      * TriggerTemplate is the template that describes trigger specification.
     **/
    public static class TriggerTemplateQueryParam  {

        /**
          * TriggerTemplate is the template that describes trigger specification.
         **/
        @jakarta.ws.rs.QueryParam("argoWorkflow")
        private ArgoWorkflowTrigger argoWorkflow;
        /**
          * TriggerTemplate is the template that describes trigger specification.
         **/
        @jakarta.ws.rs.QueryParam("awsLambda")
        private AWSLambdaTrigger awsLambda;
        /**
          * TriggerTemplate is the template that describes trigger specification.
         **/
        @jakarta.ws.rs.QueryParam("azureEventHubs")
        private AzureEventHubsTrigger azureEventHubs;
        /**
          * TriggerTemplate is the template that describes trigger specification.
         **/
        @jakarta.ws.rs.QueryParam("azureServiceBus")
        private AzureServiceBusTrigger azureServiceBus;
        /**
          * TriggerTemplate is the template that describes trigger specification.
         **/
        @jakarta.ws.rs.QueryParam("conditions")
        private String conditions;
        /**
          * TriggerTemplate is the template that describes trigger specification.
         **/
        @jakarta.ws.rs.QueryParam("conditionsReset")
        private List<ConditionsResetCriteria> conditionsReset = null;
        /**
          * TriggerTemplate is the template that describes trigger specification.
         **/
        @jakarta.ws.rs.QueryParam("custom")
        private CustomTrigger custom;
        /**
          * TriggerTemplate is the template that describes trigger specification.
         **/
        @jakarta.ws.rs.QueryParam("email")
        private EmailTrigger email;
        /**
          * TriggerTemplate is the template that describes trigger specification.
         **/
        @jakarta.ws.rs.QueryParam("http")
        private HTTPTrigger http;
        /**
          * TriggerTemplate is the template that describes trigger specification.
         **/
        @jakarta.ws.rs.QueryParam("k8s")
        private StandardK8STrigger k8s;
        /**
          * TriggerTemplate is the template that describes trigger specification.
         **/
        @jakarta.ws.rs.QueryParam("kafka")
        private KafkaTrigger kafka;
        /**
          * TriggerTemplate is the template that describes trigger specification.
         **/
        @jakarta.ws.rs.QueryParam("log")
        private LogTrigger log;
        /**
          * TriggerTemplate is the template that describes trigger specification.
         **/
        @jakarta.ws.rs.QueryParam("name")
        private String name;
        /**
          * TriggerTemplate is the template that describes trigger specification.
         **/
        @jakarta.ws.rs.QueryParam("nats")
        private NATSTrigger nats;
        /**
          * TriggerTemplate is the template that describes trigger specification.
         **/
        @jakarta.ws.rs.QueryParam("openWhisk")
        private OpenWhiskTrigger openWhisk;
        /**
          * TriggerTemplate is the template that describes trigger specification.
         **/
        @jakarta.ws.rs.QueryParam("pulsar")
        private PulsarTrigger pulsar;
        /**
          * TriggerTemplate is the template that describes trigger specification.
         **/
        @jakarta.ws.rs.QueryParam("slack")
        private SlackTrigger slack;

        /**
        * Get argoWorkflow
        * @return argoWorkflow
        **/
        @JsonProperty("argoWorkflow")
        public ArgoWorkflowTrigger getArgoWorkflow() {
            return argoWorkflow;
        }

        /**
         * Set argoWorkflow
         **/
        public void setArgoWorkflow(ArgoWorkflowTrigger argoWorkflow) {
            this.argoWorkflow = argoWorkflow;
        }

        public TriggerTemplateQueryParam argoWorkflow(ArgoWorkflowTrigger argoWorkflow) {
            this.argoWorkflow = argoWorkflow;
            return this;
        }

        /**
        * Get awsLambda
        * @return awsLambda
        **/
        @JsonProperty("awsLambda")
        public AWSLambdaTrigger getAwsLambda() {
            return awsLambda;
        }

        /**
         * Set awsLambda
         **/
        public void setAwsLambda(AWSLambdaTrigger awsLambda) {
            this.awsLambda = awsLambda;
        }

        public TriggerTemplateQueryParam awsLambda(AWSLambdaTrigger awsLambda) {
            this.awsLambda = awsLambda;
            return this;
        }

        /**
        * Get azureEventHubs
        * @return azureEventHubs
        **/
        @JsonProperty("azureEventHubs")
        public AzureEventHubsTrigger getAzureEventHubs() {
            return azureEventHubs;
        }

        /**
         * Set azureEventHubs
         **/
        public void setAzureEventHubs(AzureEventHubsTrigger azureEventHubs) {
            this.azureEventHubs = azureEventHubs;
        }

        public TriggerTemplateQueryParam azureEventHubs(AzureEventHubsTrigger azureEventHubs) {
            this.azureEventHubs = azureEventHubs;
            return this;
        }

        /**
        * Get azureServiceBus
        * @return azureServiceBus
        **/
        @JsonProperty("azureServiceBus")
        public AzureServiceBusTrigger getAzureServiceBus() {
            return azureServiceBus;
        }

        /**
         * Set azureServiceBus
         **/
        public void setAzureServiceBus(AzureServiceBusTrigger azureServiceBus) {
            this.azureServiceBus = azureServiceBus;
        }

        public TriggerTemplateQueryParam azureServiceBus(AzureServiceBusTrigger azureServiceBus) {
            this.azureServiceBus = azureServiceBus;
            return this;
        }

        /**
        * Get conditions
        * @return conditions
        **/
        @JsonProperty("conditions")
        public String getConditions() {
            return conditions;
        }

        /**
         * Set conditions
         **/
        public void setConditions(String conditions) {
            this.conditions = conditions;
        }

        public TriggerTemplateQueryParam conditions(String conditions) {
            this.conditions = conditions;
            return this;
        }

        /**
        * Get conditionsReset
        * @return conditionsReset
        **/
        @JsonProperty("conditionsReset")
        public List<ConditionsResetCriteria> getConditionsReset() {
            return conditionsReset;
        }

        /**
         * Set conditionsReset
         **/
        public void setConditionsReset(List<ConditionsResetCriteria> conditionsReset) {
            this.conditionsReset = conditionsReset;
        }

        public TriggerTemplateQueryParam conditionsReset(List<ConditionsResetCriteria> conditionsReset) {
            this.conditionsReset = conditionsReset;
            return this;
        }
        public TriggerTemplateQueryParam addConditionsResetItem(ConditionsResetCriteria conditionsResetItem) {
            this.conditionsReset.add(conditionsResetItem);
            return this;
        }

        /**
        * Get custom
        * @return custom
        **/
        @JsonProperty("custom")
        public CustomTrigger getCustom() {
            return custom;
        }

        /**
         * Set custom
         **/
        public void setCustom(CustomTrigger custom) {
            this.custom = custom;
        }

        public TriggerTemplateQueryParam custom(CustomTrigger custom) {
            this.custom = custom;
            return this;
        }

        /**
        * Get email
        * @return email
        **/
        @JsonProperty("email")
        public EmailTrigger getEmail() {
            return email;
        }

        /**
         * Set email
         **/
        public void setEmail(EmailTrigger email) {
            this.email = email;
        }

        public TriggerTemplateQueryParam email(EmailTrigger email) {
            this.email = email;
            return this;
        }

        /**
        * Get http
        * @return http
        **/
        @JsonProperty("http")
        public HTTPTrigger getHttp() {
            return http;
        }

        /**
         * Set http
         **/
        public void setHttp(HTTPTrigger http) {
            this.http = http;
        }

        public TriggerTemplateQueryParam http(HTTPTrigger http) {
            this.http = http;
            return this;
        }

        /**
        * Get k8s
        * @return k8s
        **/
        @JsonProperty("k8s")
        public StandardK8STrigger getK8s() {
            return k8s;
        }

        /**
         * Set k8s
         **/
        public void setK8s(StandardK8STrigger k8s) {
            this.k8s = k8s;
        }

        public TriggerTemplateQueryParam k8s(StandardK8STrigger k8s) {
            this.k8s = k8s;
            return this;
        }

        /**
        * Get kafka
        * @return kafka
        **/
        @JsonProperty("kafka")
        public KafkaTrigger getKafka() {
            return kafka;
        }

        /**
         * Set kafka
         **/
        public void setKafka(KafkaTrigger kafka) {
            this.kafka = kafka;
        }

        public TriggerTemplateQueryParam kafka(KafkaTrigger kafka) {
            this.kafka = kafka;
            return this;
        }

        /**
        * Get log
        * @return log
        **/
        @JsonProperty("log")
        public LogTrigger getLog() {
            return log;
        }

        /**
         * Set log
         **/
        public void setLog(LogTrigger log) {
            this.log = log;
        }

        public TriggerTemplateQueryParam log(LogTrigger log) {
            this.log = log;
            return this;
        }

        /**
        * Name is a unique name of the action to take.
        * @return name
        **/
        @JsonProperty("name")
        public String getName() {
            return name;
        }

        /**
         * Set name
         **/
        public void setName(String name) {
            this.name = name;
        }

        public TriggerTemplateQueryParam name(String name) {
            this.name = name;
            return this;
        }

        /**
        * Get nats
        * @return nats
        **/
        @JsonProperty("nats")
        public NATSTrigger getNats() {
            return nats;
        }

        /**
         * Set nats
         **/
        public void setNats(NATSTrigger nats) {
            this.nats = nats;
        }

        public TriggerTemplateQueryParam nats(NATSTrigger nats) {
            this.nats = nats;
            return this;
        }

        /**
        * Get openWhisk
        * @return openWhisk
        **/
        @JsonProperty("openWhisk")
        public OpenWhiskTrigger getOpenWhisk() {
            return openWhisk;
        }

        /**
         * Set openWhisk
         **/
        public void setOpenWhisk(OpenWhiskTrigger openWhisk) {
            this.openWhisk = openWhisk;
        }

        public TriggerTemplateQueryParam openWhisk(OpenWhiskTrigger openWhisk) {
            this.openWhisk = openWhisk;
            return this;
        }

        /**
        * Get pulsar
        * @return pulsar
        **/
        @JsonProperty("pulsar")
        public PulsarTrigger getPulsar() {
            return pulsar;
        }

        /**
         * Set pulsar
         **/
        public void setPulsar(PulsarTrigger pulsar) {
            this.pulsar = pulsar;
        }

        public TriggerTemplateQueryParam pulsar(PulsarTrigger pulsar) {
            this.pulsar = pulsar;
            return this;
        }

        /**
        * Get slack
        * @return slack
        **/
        @JsonProperty("slack")
        public SlackTrigger getSlack() {
            return slack;
        }

        /**
         * Set slack
         **/
        public void setSlack(SlackTrigger slack) {
            this.slack = slack;
        }

        public TriggerTemplateQueryParam slack(SlackTrigger slack) {
            this.slack = slack;
            return this;
        }

        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class TriggerTemplateQueryParam {\n");

            sb.append("    argoWorkflow: ").append(toIndentedString(argoWorkflow)).append("\n");
            sb.append("    awsLambda: ").append(toIndentedString(awsLambda)).append("\n");
            sb.append("    azureEventHubs: ").append(toIndentedString(azureEventHubs)).append("\n");
            sb.append("    azureServiceBus: ").append(toIndentedString(azureServiceBus)).append("\n");
            sb.append("    conditions: ").append(toIndentedString(conditions)).append("\n");
            sb.append("    conditionsReset: ").append(toIndentedString(conditionsReset)).append("\n");
            sb.append("    custom: ").append(toIndentedString(custom)).append("\n");
            sb.append("    email: ").append(toIndentedString(email)).append("\n");
            sb.append("    http: ").append(toIndentedString(http)).append("\n");
            sb.append("    k8s: ").append(toIndentedString(k8s)).append("\n");
            sb.append("    kafka: ").append(toIndentedString(kafka)).append("\n");
            sb.append("    log: ").append(toIndentedString(log)).append("\n");
            sb.append("    name: ").append(toIndentedString(name)).append("\n");
            sb.append("    nats: ").append(toIndentedString(nats)).append("\n");
            sb.append("    openWhisk: ").append(toIndentedString(openWhisk)).append("\n");
            sb.append("    pulsar: ").append(toIndentedString(pulsar)).append("\n");
            sb.append("    slack: ").append(toIndentedString(slack)).append("\n");
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
