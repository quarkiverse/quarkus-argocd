package io.quarkiverse.argocd.events.v1alpha1;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.quarkiverse.argocd.v1alpha1.model.EventSourceFilter;
import io.fabric8.kubernetes.api.model.SecretKeySelector;
import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.Type;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class AMQPEventSource  {

    private BasicAuth auth;
    private Backoff connectionBackoff;
    private AMQPConsumeConfig consume;
    private AMQPExchangeDeclareConfig exchangeDeclare;
    private String exchangeName;
    private String exchangeType;
    private EventSourceFilter filter;
    private Boolean jsonBody;
    private Map<String, String> metadata;
    private AMQPQueueBindConfig queueBind;
    private AMQPQueueDeclareConfig queueDeclare;
    private String routingKey;
    private TLSConfig tls;
    private String url;
    private SecretKeySelector urlSecret;

    /**
    * Get auth
    * @return auth
    **/
    @JsonProperty("auth")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public BasicAuth getAuth() {
        return auth;
    }

    /**
     * Set auth
     **/
    public void setAuth(BasicAuth auth) {
        this.auth = auth;
    }

    public AMQPEventSource auth(BasicAuth auth) {
        this.auth = auth;
        return this;
    }

    /**
    * Get connectionBackoff
    * @return connectionBackoff
    **/
    @JsonProperty("connectionBackoff")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public Backoff getConnectionBackoff() {
        return connectionBackoff;
    }

    /**
     * Set connectionBackoff
     **/
    public void setConnectionBackoff(Backoff connectionBackoff) {
        this.connectionBackoff = connectionBackoff;
    }

    public AMQPEventSource connectionBackoff(Backoff connectionBackoff) {
        this.connectionBackoff = connectionBackoff;
        return this;
    }

    /**
    * Get consume
    * @return consume
    **/
    @JsonProperty("consume")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public AMQPConsumeConfig getConsume() {
        return consume;
    }

    /**
     * Set consume
     **/
    public void setConsume(AMQPConsumeConfig consume) {
        this.consume = consume;
    }

    public AMQPEventSource consume(AMQPConsumeConfig consume) {
        this.consume = consume;
        return this;
    }

    /**
    * Get exchangeDeclare
    * @return exchangeDeclare
    **/
    @JsonProperty("exchangeDeclare")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public AMQPExchangeDeclareConfig getExchangeDeclare() {
        return exchangeDeclare;
    }

    /**
     * Set exchangeDeclare
     **/
    public void setExchangeDeclare(AMQPExchangeDeclareConfig exchangeDeclare) {
        this.exchangeDeclare = exchangeDeclare;
    }

    public AMQPEventSource exchangeDeclare(AMQPExchangeDeclareConfig exchangeDeclare) {
        this.exchangeDeclare = exchangeDeclare;
        return this;
    }

    /**
    * Get exchangeName
    * @return exchangeName
    **/
    @JsonProperty("exchangeName")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public String getExchangeName() {
        return exchangeName;
    }

    /**
     * Set exchangeName
     **/
    public void setExchangeName(String exchangeName) {
        this.exchangeName = exchangeName;
    }

    public AMQPEventSource exchangeName(String exchangeName) {
        this.exchangeName = exchangeName;
        return this;
    }

    /**
    * Get exchangeType
    * @return exchangeType
    **/
    @JsonProperty("exchangeType")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public String getExchangeType() {
        return exchangeType;
    }

    /**
     * Set exchangeType
     **/
    public void setExchangeType(String exchangeType) {
        this.exchangeType = exchangeType;
    }

    public AMQPEventSource exchangeType(String exchangeType) {
        this.exchangeType = exchangeType;
        return this;
    }

    /**
    * Get filter
    * @return filter
    **/
    @JsonProperty("filter")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public EventSourceFilter getFilter() {
        return filter;
    }

    /**
     * Set filter
     **/
    public void setFilter(EventSourceFilter filter) {
        this.filter = filter;
    }

    public AMQPEventSource filter(EventSourceFilter filter) {
        this.filter = filter;
        return this;
    }

    /**
    * Get jsonBody
    * @return jsonBody
    **/
    @JsonProperty("jsonBody")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public Boolean getJsonBody() {
        return jsonBody;
    }

    /**
     * Set jsonBody
     **/
    public void setJsonBody(Boolean jsonBody) {
        this.jsonBody = jsonBody;
    }

    public AMQPEventSource jsonBody(Boolean jsonBody) {
        this.jsonBody = jsonBody;
        return this;
    }

    /**
    * Get metadata
    * @return metadata
    **/
    @JsonProperty("metadata")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public Map<String, String> getMetadata() {
        return metadata;
    }

    /**
     * Set metadata
     **/
    public void setMetadata(Map<String, String> metadata) {
        this.metadata = metadata;
    }

    public AMQPEventSource metadata(Map<String, String> metadata) {
        this.metadata = metadata;
        return this;
    }
    public AMQPEventSource putMetadataItem(String key, String metadataItem) {
           if (this.metadata == null){
                metadata = new HashMap<>();
            }
        this.metadata.put(key, metadataItem);
        return this;
    }

    /**
    * Get queueBind
    * @return queueBind
    **/
    @JsonProperty("queueBind")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public AMQPQueueBindConfig getQueueBind() {
        return queueBind;
    }

    /**
     * Set queueBind
     **/
    public void setQueueBind(AMQPQueueBindConfig queueBind) {
        this.queueBind = queueBind;
    }

    public AMQPEventSource queueBind(AMQPQueueBindConfig queueBind) {
        this.queueBind = queueBind;
        return this;
    }

    /**
    * Get queueDeclare
    * @return queueDeclare
    **/
    @JsonProperty("queueDeclare")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public AMQPQueueDeclareConfig getQueueDeclare() {
        return queueDeclare;
    }

    /**
     * Set queueDeclare
     **/
    public void setQueueDeclare(AMQPQueueDeclareConfig queueDeclare) {
        this.queueDeclare = queueDeclare;
    }

    public AMQPEventSource queueDeclare(AMQPQueueDeclareConfig queueDeclare) {
        this.queueDeclare = queueDeclare;
        return this;
    }

    /**
    * Get routingKey
    * @return routingKey
    **/
    @JsonProperty("routingKey")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public String getRoutingKey() {
        return routingKey;
    }

    /**
     * Set routingKey
     **/
    public void setRoutingKey(String routingKey) {
        this.routingKey = routingKey;
    }

    public AMQPEventSource routingKey(String routingKey) {
        this.routingKey = routingKey;
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

    public AMQPEventSource tls(TLSConfig tls) {
        this.tls = tls;
        return this;
    }

    /**
    * Get url
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

    public AMQPEventSource url(String url) {
        this.url = url;
        return this;
    }

    /**
    * Get urlSecret
    * @return urlSecret
    **/
    @JsonProperty("urlSecret")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public SecretKeySelector getUrlSecret() {
        return urlSecret;
    }

    /**
     * Set urlSecret
     **/
    public void setUrlSecret(SecretKeySelector urlSecret) {
        this.urlSecret = urlSecret;
    }

    public AMQPEventSource urlSecret(SecretKeySelector urlSecret) {
        this.urlSecret = urlSecret;
        return this;
    }

    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AMQPEventSource {\n");

        sb.append("    auth: ").append(toIndentedString(auth)).append("\n");
        sb.append("    connectionBackoff: ").append(toIndentedString(connectionBackoff)).append("\n");
        sb.append("    consume: ").append(toIndentedString(consume)).append("\n");
        sb.append("    exchangeDeclare: ").append(toIndentedString(exchangeDeclare)).append("\n");
        sb.append("    exchangeName: ").append(toIndentedString(exchangeName)).append("\n");
        sb.append("    exchangeType: ").append(toIndentedString(exchangeType)).append("\n");
        sb.append("    filter: ").append(toIndentedString(filter)).append("\n");
        sb.append("    jsonBody: ").append(toIndentedString(jsonBody)).append("\n");
        sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
        sb.append("    queueBind: ").append(toIndentedString(queueBind)).append("\n");
        sb.append("    queueDeclare: ").append(toIndentedString(queueDeclare)).append("\n");
        sb.append("    routingKey: ").append(toIndentedString(routingKey)).append("\n");
        sb.append("    tls: ").append(toIndentedString(tls)).append("\n");
        sb.append("    url: ").append(toIndentedString(url)).append("\n");
        sb.append("    urlSecret: ").append(toIndentedString(urlSecret)).append("\n");
        
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
    public static class AMQPEventSourceQueryParam  {

        @jakarta.ws.rs.QueryParam("auth")
        private BasicAuth auth;
        @jakarta.ws.rs.QueryParam("connectionBackoff")
        private Backoff connectionBackoff;
        @jakarta.ws.rs.QueryParam("consume")
        private AMQPConsumeConfig consume;
        @jakarta.ws.rs.QueryParam("exchangeDeclare")
        private AMQPExchangeDeclareConfig exchangeDeclare;
        @jakarta.ws.rs.QueryParam("exchangeName")
        private String exchangeName;
        @jakarta.ws.rs.QueryParam("exchangeType")
        private String exchangeType;
        @jakarta.ws.rs.QueryParam("filter")
        private EventSourceFilter filter;
        @jakarta.ws.rs.QueryParam("jsonBody")
        private Boolean jsonBody;
        @jakarta.ws.rs.QueryParam("metadata")
        private Map<String, String> metadata = null;
        @jakarta.ws.rs.QueryParam("queueBind")
        private AMQPQueueBindConfig queueBind;
        @jakarta.ws.rs.QueryParam("queueDeclare")
        private AMQPQueueDeclareConfig queueDeclare;
        @jakarta.ws.rs.QueryParam("routingKey")
        private String routingKey;
        @jakarta.ws.rs.QueryParam("tls")
        private TLSConfig tls;
        @jakarta.ws.rs.QueryParam("url")
        private String url;
        @jakarta.ws.rs.QueryParam("urlSecret")
        private SecretKeySelector urlSecret;

        /**
        * Get auth
        * @return auth
        **/
        @JsonProperty("auth")
        public BasicAuth getAuth() {
            return auth;
        }

        /**
         * Set auth
         **/
        public void setAuth(BasicAuth auth) {
            this.auth = auth;
        }

        public AMQPEventSourceQueryParam auth(BasicAuth auth) {
            this.auth = auth;
            return this;
        }

        /**
        * Get connectionBackoff
        * @return connectionBackoff
        **/
        @JsonProperty("connectionBackoff")
        public Backoff getConnectionBackoff() {
            return connectionBackoff;
        }

        /**
         * Set connectionBackoff
         **/
        public void setConnectionBackoff(Backoff connectionBackoff) {
            this.connectionBackoff = connectionBackoff;
        }

        public AMQPEventSourceQueryParam connectionBackoff(Backoff connectionBackoff) {
            this.connectionBackoff = connectionBackoff;
            return this;
        }

        /**
        * Get consume
        * @return consume
        **/
        @JsonProperty("consume")
        public AMQPConsumeConfig getConsume() {
            return consume;
        }

        /**
         * Set consume
         **/
        public void setConsume(AMQPConsumeConfig consume) {
            this.consume = consume;
        }

        public AMQPEventSourceQueryParam consume(AMQPConsumeConfig consume) {
            this.consume = consume;
            return this;
        }

        /**
        * Get exchangeDeclare
        * @return exchangeDeclare
        **/
        @JsonProperty("exchangeDeclare")
        public AMQPExchangeDeclareConfig getExchangeDeclare() {
            return exchangeDeclare;
        }

        /**
         * Set exchangeDeclare
         **/
        public void setExchangeDeclare(AMQPExchangeDeclareConfig exchangeDeclare) {
            this.exchangeDeclare = exchangeDeclare;
        }

        public AMQPEventSourceQueryParam exchangeDeclare(AMQPExchangeDeclareConfig exchangeDeclare) {
            this.exchangeDeclare = exchangeDeclare;
            return this;
        }

        /**
        * Get exchangeName
        * @return exchangeName
        **/
        @JsonProperty("exchangeName")
        public String getExchangeName() {
            return exchangeName;
        }

        /**
         * Set exchangeName
         **/
        public void setExchangeName(String exchangeName) {
            this.exchangeName = exchangeName;
        }

        public AMQPEventSourceQueryParam exchangeName(String exchangeName) {
            this.exchangeName = exchangeName;
            return this;
        }

        /**
        * Get exchangeType
        * @return exchangeType
        **/
        @JsonProperty("exchangeType")
        public String getExchangeType() {
            return exchangeType;
        }

        /**
         * Set exchangeType
         **/
        public void setExchangeType(String exchangeType) {
            this.exchangeType = exchangeType;
        }

        public AMQPEventSourceQueryParam exchangeType(String exchangeType) {
            this.exchangeType = exchangeType;
            return this;
        }

        /**
        * Get filter
        * @return filter
        **/
        @JsonProperty("filter")
        public EventSourceFilter getFilter() {
            return filter;
        }

        /**
         * Set filter
         **/
        public void setFilter(EventSourceFilter filter) {
            this.filter = filter;
        }

        public AMQPEventSourceQueryParam filter(EventSourceFilter filter) {
            this.filter = filter;
            return this;
        }

        /**
        * Get jsonBody
        * @return jsonBody
        **/
        @JsonProperty("jsonBody")
        public Boolean getJsonBody() {
            return jsonBody;
        }

        /**
         * Set jsonBody
         **/
        public void setJsonBody(Boolean jsonBody) {
            this.jsonBody = jsonBody;
        }

        public AMQPEventSourceQueryParam jsonBody(Boolean jsonBody) {
            this.jsonBody = jsonBody;
            return this;
        }

        /**
        * Get metadata
        * @return metadata
        **/
        @JsonProperty("metadata")
        public Map<String, String> getMetadata() {
            return metadata;
        }

        /**
         * Set metadata
         **/
        public void setMetadata(Map<String, String> metadata) {
            this.metadata = metadata;
        }

        public AMQPEventSourceQueryParam metadata(Map<String, String> metadata) {
            this.metadata = metadata;
            return this;
        }
        public AMQPEventSourceQueryParam putMetadataItem(String key, String metadataItem) {
            this.metadata.put(key, metadataItem);
            return this;
        }

        /**
        * Get queueBind
        * @return queueBind
        **/
        @JsonProperty("queueBind")
        public AMQPQueueBindConfig getQueueBind() {
            return queueBind;
        }

        /**
         * Set queueBind
         **/
        public void setQueueBind(AMQPQueueBindConfig queueBind) {
            this.queueBind = queueBind;
        }

        public AMQPEventSourceQueryParam queueBind(AMQPQueueBindConfig queueBind) {
            this.queueBind = queueBind;
            return this;
        }

        /**
        * Get queueDeclare
        * @return queueDeclare
        **/
        @JsonProperty("queueDeclare")
        public AMQPQueueDeclareConfig getQueueDeclare() {
            return queueDeclare;
        }

        /**
         * Set queueDeclare
         **/
        public void setQueueDeclare(AMQPQueueDeclareConfig queueDeclare) {
            this.queueDeclare = queueDeclare;
        }

        public AMQPEventSourceQueryParam queueDeclare(AMQPQueueDeclareConfig queueDeclare) {
            this.queueDeclare = queueDeclare;
            return this;
        }

        /**
        * Get routingKey
        * @return routingKey
        **/
        @JsonProperty("routingKey")
        public String getRoutingKey() {
            return routingKey;
        }

        /**
         * Set routingKey
         **/
        public void setRoutingKey(String routingKey) {
            this.routingKey = routingKey;
        }

        public AMQPEventSourceQueryParam routingKey(String routingKey) {
            this.routingKey = routingKey;
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

        public AMQPEventSourceQueryParam tls(TLSConfig tls) {
            this.tls = tls;
            return this;
        }

        /**
        * Get url
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

        public AMQPEventSourceQueryParam url(String url) {
            this.url = url;
            return this;
        }

        /**
        * Get urlSecret
        * @return urlSecret
        **/
        @JsonProperty("urlSecret")
        public SecretKeySelector getUrlSecret() {
            return urlSecret;
        }

        /**
         * Set urlSecret
         **/
        public void setUrlSecret(SecretKeySelector urlSecret) {
            this.urlSecret = urlSecret;
        }

        public AMQPEventSourceQueryParam urlSecret(SecretKeySelector urlSecret) {
            this.urlSecret = urlSecret;
            return this;
        }

        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class AMQPEventSourceQueryParam {\n");

            sb.append("    auth: ").append(toIndentedString(auth)).append("\n");
            sb.append("    connectionBackoff: ").append(toIndentedString(connectionBackoff)).append("\n");
            sb.append("    consume: ").append(toIndentedString(consume)).append("\n");
            sb.append("    exchangeDeclare: ").append(toIndentedString(exchangeDeclare)).append("\n");
            sb.append("    exchangeName: ").append(toIndentedString(exchangeName)).append("\n");
            sb.append("    exchangeType: ").append(toIndentedString(exchangeType)).append("\n");
            sb.append("    filter: ").append(toIndentedString(filter)).append("\n");
            sb.append("    jsonBody: ").append(toIndentedString(jsonBody)).append("\n");
            sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
            sb.append("    queueBind: ").append(toIndentedString(queueBind)).append("\n");
            sb.append("    queueDeclare: ").append(toIndentedString(queueDeclare)).append("\n");
            sb.append("    routingKey: ").append(toIndentedString(routingKey)).append("\n");
            sb.append("    tls: ").append(toIndentedString(tls)).append("\n");
            sb.append("    url: ").append(toIndentedString(url)).append("\n");
            sb.append("    urlSecret: ").append(toIndentedString(urlSecret)).append("\n");
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
