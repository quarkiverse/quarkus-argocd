package io.quarkiverse.argocd.events.v1alpha1;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.Type;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class AMQPExchangeDeclareConfig  {

    private Boolean autoDelete;
    private Boolean durable;
    private Boolean internal;
    private Boolean noWait;

    /**
    * Get autoDelete
    * @return autoDelete
    **/
    @JsonProperty("autoDelete")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public Boolean getAutoDelete() {
        return autoDelete;
    }

    /**
     * Set autoDelete
     **/
    public void setAutoDelete(Boolean autoDelete) {
        this.autoDelete = autoDelete;
    }

    public AMQPExchangeDeclareConfig autoDelete(Boolean autoDelete) {
        this.autoDelete = autoDelete;
        return this;
    }

    /**
    * Get durable
    * @return durable
    **/
    @JsonProperty("durable")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public Boolean getDurable() {
        return durable;
    }

    /**
     * Set durable
     **/
    public void setDurable(Boolean durable) {
        this.durable = durable;
    }

    public AMQPExchangeDeclareConfig durable(Boolean durable) {
        this.durable = durable;
        return this;
    }

    /**
    * Get internal
    * @return internal
    **/
    @JsonProperty("internal")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public Boolean getInternal() {
        return internal;
    }

    /**
     * Set internal
     **/
    public void setInternal(Boolean internal) {
        this.internal = internal;
    }

    public AMQPExchangeDeclareConfig internal(Boolean internal) {
        this.internal = internal;
        return this;
    }

    /**
    * Get noWait
    * @return noWait
    **/
    @JsonProperty("noWait")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public Boolean getNoWait() {
        return noWait;
    }

    /**
     * Set noWait
     **/
    public void setNoWait(Boolean noWait) {
        this.noWait = noWait;
    }

    public AMQPExchangeDeclareConfig noWait(Boolean noWait) {
        this.noWait = noWait;
        return this;
    }

    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AMQPExchangeDeclareConfig {\n");

        sb.append("    autoDelete: ").append(toIndentedString(autoDelete)).append("\n");
        sb.append("    durable: ").append(toIndentedString(durable)).append("\n");
        sb.append("    internal: ").append(toIndentedString(internal)).append("\n");
        sb.append("    noWait: ").append(toIndentedString(noWait)).append("\n");
        
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
    public static class AMQPExchangeDeclareConfigQueryParam  {

        @jakarta.ws.rs.QueryParam("autoDelete")
        private Boolean autoDelete;
        @jakarta.ws.rs.QueryParam("durable")
        private Boolean durable;
        @jakarta.ws.rs.QueryParam("internal")
        private Boolean internal;
        @jakarta.ws.rs.QueryParam("noWait")
        private Boolean noWait;

        /**
        * Get autoDelete
        * @return autoDelete
        **/
        @JsonProperty("autoDelete")
        public Boolean getAutoDelete() {
            return autoDelete;
        }

        /**
         * Set autoDelete
         **/
        public void setAutoDelete(Boolean autoDelete) {
            this.autoDelete = autoDelete;
        }

        public AMQPExchangeDeclareConfigQueryParam autoDelete(Boolean autoDelete) {
            this.autoDelete = autoDelete;
            return this;
        }

        /**
        * Get durable
        * @return durable
        **/
        @JsonProperty("durable")
        public Boolean getDurable() {
            return durable;
        }

        /**
         * Set durable
         **/
        public void setDurable(Boolean durable) {
            this.durable = durable;
        }

        public AMQPExchangeDeclareConfigQueryParam durable(Boolean durable) {
            this.durable = durable;
            return this;
        }

        /**
        * Get internal
        * @return internal
        **/
        @JsonProperty("internal")
        public Boolean getInternal() {
            return internal;
        }

        /**
         * Set internal
         **/
        public void setInternal(Boolean internal) {
            this.internal = internal;
        }

        public AMQPExchangeDeclareConfigQueryParam internal(Boolean internal) {
            this.internal = internal;
            return this;
        }

        /**
        * Get noWait
        * @return noWait
        **/
        @JsonProperty("noWait")
        public Boolean getNoWait() {
            return noWait;
        }

        /**
         * Set noWait
         **/
        public void setNoWait(Boolean noWait) {
            this.noWait = noWait;
        }

        public AMQPExchangeDeclareConfigQueryParam noWait(Boolean noWait) {
            this.noWait = noWait;
            return this;
        }

        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class AMQPExchangeDeclareConfigQueryParam {\n");

            sb.append("    autoDelete: ").append(toIndentedString(autoDelete)).append("\n");
            sb.append("    durable: ").append(toIndentedString(durable)).append("\n");
            sb.append("    internal: ").append(toIndentedString(internal)).append("\n");
            sb.append("    noWait: ").append(toIndentedString(noWait)).append("\n");
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
