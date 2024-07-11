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
  * KafkaTrigger refers to the specification of the Kafka trigger.
 **/
public class KafkaTrigger  {

    /**
      * KafkaTrigger refers to the specification of the Kafka trigger.
     **/
    private Boolean compress;
    /**
      * KafkaTrigger refers to the specification of the Kafka trigger.
     **/
    private Integer flushFrequency;
    /**
      * KafkaTrigger refers to the specification of the Kafka trigger.
     **/
    private List<TriggerParameter> parameters;
    /**
      * KafkaTrigger refers to the specification of the Kafka trigger.
     **/
    private Integer partition;
    /**
      * KafkaTrigger refers to the specification of the Kafka trigger.
     **/
    private String partitioningKey;
    /**
      * KafkaTrigger refers to the specification of the Kafka trigger.
     **/
    private List<TriggerParameter> payload;
    /**
      * KafkaTrigger refers to the specification of the Kafka trigger.
     **/
    private Integer requiredAcks;
    /**
      * KafkaTrigger refers to the specification of the Kafka trigger.
     **/
    private SASLConfig sasl;
    /**
      * KafkaTrigger refers to the specification of the Kafka trigger.
     **/
    private SchemaRegistryConfig schemaRegistry;
    /**
      * KafkaTrigger refers to the specification of the Kafka trigger.
     **/
    private TLSConfig tls;
    /**
      * KafkaTrigger refers to the specification of the Kafka trigger.
     **/
    private String topic;
    /**
      * KafkaTrigger refers to the specification of the Kafka trigger.
     **/
    private String url;
    /**
      * KafkaTrigger refers to the specification of the Kafka trigger.
     **/
    private String version;

    /**
    * Get compress
    * @return compress
    **/
    @JsonProperty("compress")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public Boolean getCompress() {
        return compress;
    }

    /**
     * Set compress
     **/
    public void setCompress(Boolean compress) {
        this.compress = compress;
    }

    public KafkaTrigger compress(Boolean compress) {
        this.compress = compress;
        return this;
    }

    /**
    * Get flushFrequency
    * @return flushFrequency
    **/
    @JsonProperty("flushFrequency")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public Integer getFlushFrequency() {
        return flushFrequency;
    }

    /**
     * Set flushFrequency
     **/
    public void setFlushFrequency(Integer flushFrequency) {
        this.flushFrequency = flushFrequency;
    }

    public KafkaTrigger flushFrequency(Integer flushFrequency) {
        this.flushFrequency = flushFrequency;
        return this;
    }

    /**
    * Parameters is the list of parameters that is applied to resolved Kafka trigger object.
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

    public KafkaTrigger parameters(List<TriggerParameter> parameters) {
        this.parameters = parameters;
        return this;
    }
    public KafkaTrigger addParametersItem(TriggerParameter parametersItem) {
        if (this.parameters == null){
            parameters = new ArrayList<>();
        }
        this.parameters.add(parametersItem);
        return this;
    }

    /**
    * Get partition
    * @return partition
    **/
    @JsonProperty("partition")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public Integer getPartition() {
        return partition;
    }

    /**
     * Set partition
     **/
    public void setPartition(Integer partition) {
        this.partition = partition;
    }

    public KafkaTrigger partition(Integer partition) {
        this.partition = partition;
        return this;
    }

    /**
    * The partitioning key for the messages put on the Kafka topic. +optional.
    * @return partitioningKey
    **/
    @JsonProperty("partitioningKey")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public String getPartitioningKey() {
        return partitioningKey;
    }

    /**
     * Set partitioningKey
     **/
    public void setPartitioningKey(String partitioningKey) {
        this.partitioningKey = partitioningKey;
    }

    public KafkaTrigger partitioningKey(String partitioningKey) {
        this.partitioningKey = partitioningKey;
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

    public KafkaTrigger payload(List<TriggerParameter> payload) {
        this.payload = payload;
        return this;
    }
    public KafkaTrigger addPayloadItem(TriggerParameter payloadItem) {
        if (this.payload == null){
            payload = new ArrayList<>();
        }
        this.payload.add(payloadItem);
        return this;
    }

    /**
    * RequiredAcks used in producer to tell the broker how many replica acknowledgements Defaults to 1 (Only wait for the leader to ack). +optional.
    * @return requiredAcks
    **/
    @JsonProperty("requiredAcks")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public Integer getRequiredAcks() {
        return requiredAcks;
    }

    /**
     * Set requiredAcks
     **/
    public void setRequiredAcks(Integer requiredAcks) {
        this.requiredAcks = requiredAcks;
    }

    public KafkaTrigger requiredAcks(Integer requiredAcks) {
        this.requiredAcks = requiredAcks;
        return this;
    }

    /**
    * Get sasl
    * @return sasl
    **/
    @JsonProperty("sasl")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public SASLConfig getSasl() {
        return sasl;
    }

    /**
     * Set sasl
     **/
    public void setSasl(SASLConfig sasl) {
        this.sasl = sasl;
    }

    public KafkaTrigger sasl(SASLConfig sasl) {
        this.sasl = sasl;
        return this;
    }

    /**
    * Get schemaRegistry
    * @return schemaRegistry
    **/
    @JsonProperty("schemaRegistry")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public SchemaRegistryConfig getSchemaRegistry() {
        return schemaRegistry;
    }

    /**
     * Set schemaRegistry
     **/
    public void setSchemaRegistry(SchemaRegistryConfig schemaRegistry) {
        this.schemaRegistry = schemaRegistry;
    }

    public KafkaTrigger schemaRegistry(SchemaRegistryConfig schemaRegistry) {
        this.schemaRegistry = schemaRegistry;
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

    public KafkaTrigger tls(TLSConfig tls) {
        this.tls = tls;
        return this;
    }

    /**
    * Get topic
    * @return topic
    **/
    @JsonProperty("topic")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public String getTopic() {
        return topic;
    }

    /**
     * Set topic
     **/
    public void setTopic(String topic) {
        this.topic = topic;
    }

    public KafkaTrigger topic(String topic) {
        this.topic = topic;
        return this;
    }

    /**
    * URL of the Kafka broker, multiple URLs separated by comma.
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

    public KafkaTrigger url(String url) {
        this.url = url;
        return this;
    }

    /**
    * Get version
    * @return version
    **/
    @JsonProperty("version")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public String getVersion() {
        return version;
    }

    /**
     * Set version
     **/
    public void setVersion(String version) {
        this.version = version;
    }

    public KafkaTrigger version(String version) {
        this.version = version;
        return this;
    }

    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class KafkaTrigger {\n");

        sb.append("    compress: ").append(toIndentedString(compress)).append("\n");
        sb.append("    flushFrequency: ").append(toIndentedString(flushFrequency)).append("\n");
        sb.append("    parameters: ").append(toIndentedString(parameters)).append("\n");
        sb.append("    partition: ").append(toIndentedString(partition)).append("\n");
        sb.append("    partitioningKey: ").append(toIndentedString(partitioningKey)).append("\n");
        sb.append("    payload: ").append(toIndentedString(payload)).append("\n");
        sb.append("    requiredAcks: ").append(toIndentedString(requiredAcks)).append("\n");
        sb.append("    sasl: ").append(toIndentedString(sasl)).append("\n");
        sb.append("    schemaRegistry: ").append(toIndentedString(schemaRegistry)).append("\n");
        sb.append("    tls: ").append(toIndentedString(tls)).append("\n");
        sb.append("    topic: ").append(toIndentedString(topic)).append("\n");
        sb.append("    url: ").append(toIndentedString(url)).append("\n");
        sb.append("    version: ").append(toIndentedString(version)).append("\n");
        
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
      * KafkaTrigger refers to the specification of the Kafka trigger.
     **/
    public static class KafkaTriggerQueryParam  {

        /**
          * KafkaTrigger refers to the specification of the Kafka trigger.
         **/
        @jakarta.ws.rs.QueryParam("compress")
        private Boolean compress;
        /**
          * KafkaTrigger refers to the specification of the Kafka trigger.
         **/
        @jakarta.ws.rs.QueryParam("flushFrequency")
        private Integer flushFrequency;
        /**
          * KafkaTrigger refers to the specification of the Kafka trigger.
         **/
        @jakarta.ws.rs.QueryParam("parameters")
        private List<TriggerParameter> parameters = null;
        /**
          * KafkaTrigger refers to the specification of the Kafka trigger.
         **/
        @jakarta.ws.rs.QueryParam("partition")
        private Integer partition;
        /**
          * KafkaTrigger refers to the specification of the Kafka trigger.
         **/
        @jakarta.ws.rs.QueryParam("partitioningKey")
        private String partitioningKey;
        /**
          * KafkaTrigger refers to the specification of the Kafka trigger.
         **/
        @jakarta.ws.rs.QueryParam("payload")
        private List<TriggerParameter> payload = null;
        /**
          * KafkaTrigger refers to the specification of the Kafka trigger.
         **/
        @jakarta.ws.rs.QueryParam("requiredAcks")
        private Integer requiredAcks;
        /**
          * KafkaTrigger refers to the specification of the Kafka trigger.
         **/
        @jakarta.ws.rs.QueryParam("sasl")
        private SASLConfig sasl;
        /**
          * KafkaTrigger refers to the specification of the Kafka trigger.
         **/
        @jakarta.ws.rs.QueryParam("schemaRegistry")
        private SchemaRegistryConfig schemaRegistry;
        /**
          * KafkaTrigger refers to the specification of the Kafka trigger.
         **/
        @jakarta.ws.rs.QueryParam("tls")
        private TLSConfig tls;
        /**
          * KafkaTrigger refers to the specification of the Kafka trigger.
         **/
        @jakarta.ws.rs.QueryParam("topic")
        private String topic;
        /**
          * KafkaTrigger refers to the specification of the Kafka trigger.
         **/
        @jakarta.ws.rs.QueryParam("url")
        private String url;
        /**
          * KafkaTrigger refers to the specification of the Kafka trigger.
         **/
        @jakarta.ws.rs.QueryParam("version")
        private String version;

        /**
        * Get compress
        * @return compress
        **/
        @JsonProperty("compress")
        public Boolean getCompress() {
            return compress;
        }

        /**
         * Set compress
         **/
        public void setCompress(Boolean compress) {
            this.compress = compress;
        }

        public KafkaTriggerQueryParam compress(Boolean compress) {
            this.compress = compress;
            return this;
        }

        /**
        * Get flushFrequency
        * @return flushFrequency
        **/
        @JsonProperty("flushFrequency")
        public Integer getFlushFrequency() {
            return flushFrequency;
        }

        /**
         * Set flushFrequency
         **/
        public void setFlushFrequency(Integer flushFrequency) {
            this.flushFrequency = flushFrequency;
        }

        public KafkaTriggerQueryParam flushFrequency(Integer flushFrequency) {
            this.flushFrequency = flushFrequency;
            return this;
        }

        /**
        * Parameters is the list of parameters that is applied to resolved Kafka trigger object.
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

        public KafkaTriggerQueryParam parameters(List<TriggerParameter> parameters) {
            this.parameters = parameters;
            return this;
        }
        public KafkaTriggerQueryParam addParametersItem(TriggerParameter parametersItem) {
            this.parameters.add(parametersItem);
            return this;
        }

        /**
        * Get partition
        * @return partition
        **/
        @JsonProperty("partition")
        public Integer getPartition() {
            return partition;
        }

        /**
         * Set partition
         **/
        public void setPartition(Integer partition) {
            this.partition = partition;
        }

        public KafkaTriggerQueryParam partition(Integer partition) {
            this.partition = partition;
            return this;
        }

        /**
        * The partitioning key for the messages put on the Kafka topic. +optional.
        * @return partitioningKey
        **/
        @JsonProperty("partitioningKey")
        public String getPartitioningKey() {
            return partitioningKey;
        }

        /**
         * Set partitioningKey
         **/
        public void setPartitioningKey(String partitioningKey) {
            this.partitioningKey = partitioningKey;
        }

        public KafkaTriggerQueryParam partitioningKey(String partitioningKey) {
            this.partitioningKey = partitioningKey;
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

        public KafkaTriggerQueryParam payload(List<TriggerParameter> payload) {
            this.payload = payload;
            return this;
        }
        public KafkaTriggerQueryParam addPayloadItem(TriggerParameter payloadItem) {
            this.payload.add(payloadItem);
            return this;
        }

        /**
        * RequiredAcks used in producer to tell the broker how many replica acknowledgements Defaults to 1 (Only wait for the leader to ack). +optional.
        * @return requiredAcks
        **/
        @JsonProperty("requiredAcks")
        public Integer getRequiredAcks() {
            return requiredAcks;
        }

        /**
         * Set requiredAcks
         **/
        public void setRequiredAcks(Integer requiredAcks) {
            this.requiredAcks = requiredAcks;
        }

        public KafkaTriggerQueryParam requiredAcks(Integer requiredAcks) {
            this.requiredAcks = requiredAcks;
            return this;
        }

        /**
        * Get sasl
        * @return sasl
        **/
        @JsonProperty("sasl")
        public SASLConfig getSasl() {
            return sasl;
        }

        /**
         * Set sasl
         **/
        public void setSasl(SASLConfig sasl) {
            this.sasl = sasl;
        }

        public KafkaTriggerQueryParam sasl(SASLConfig sasl) {
            this.sasl = sasl;
            return this;
        }

        /**
        * Get schemaRegistry
        * @return schemaRegistry
        **/
        @JsonProperty("schemaRegistry")
        public SchemaRegistryConfig getSchemaRegistry() {
            return schemaRegistry;
        }

        /**
         * Set schemaRegistry
         **/
        public void setSchemaRegistry(SchemaRegistryConfig schemaRegistry) {
            this.schemaRegistry = schemaRegistry;
        }

        public KafkaTriggerQueryParam schemaRegistry(SchemaRegistryConfig schemaRegistry) {
            this.schemaRegistry = schemaRegistry;
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

        public KafkaTriggerQueryParam tls(TLSConfig tls) {
            this.tls = tls;
            return this;
        }

        /**
        * Get topic
        * @return topic
        **/
        @JsonProperty("topic")
        public String getTopic() {
            return topic;
        }

        /**
         * Set topic
         **/
        public void setTopic(String topic) {
            this.topic = topic;
        }

        public KafkaTriggerQueryParam topic(String topic) {
            this.topic = topic;
            return this;
        }

        /**
        * URL of the Kafka broker, multiple URLs separated by comma.
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

        public KafkaTriggerQueryParam url(String url) {
            this.url = url;
            return this;
        }

        /**
        * Get version
        * @return version
        **/
        @JsonProperty("version")
        public String getVersion() {
            return version;
        }

        /**
         * Set version
         **/
        public void setVersion(String version) {
            this.version = version;
        }

        public KafkaTriggerQueryParam version(String version) {
            this.version = version;
            return this;
        }

        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class KafkaTriggerQueryParam {\n");

            sb.append("    compress: ").append(toIndentedString(compress)).append("\n");
            sb.append("    flushFrequency: ").append(toIndentedString(flushFrequency)).append("\n");
            sb.append("    parameters: ").append(toIndentedString(parameters)).append("\n");
            sb.append("    partition: ").append(toIndentedString(partition)).append("\n");
            sb.append("    partitioningKey: ").append(toIndentedString(partitioningKey)).append("\n");
            sb.append("    payload: ").append(toIndentedString(payload)).append("\n");
            sb.append("    requiredAcks: ").append(toIndentedString(requiredAcks)).append("\n");
            sb.append("    sasl: ").append(toIndentedString(sasl)).append("\n");
            sb.append("    schemaRegistry: ").append(toIndentedString(schemaRegistry)).append("\n");
            sb.append("    tls: ").append(toIndentedString(tls)).append("\n");
            sb.append("    topic: ").append(toIndentedString(topic)).append("\n");
            sb.append("    url: ").append(toIndentedString(url)).append("\n");
            sb.append("    version: ").append(toIndentedString(version)).append("\n");
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
