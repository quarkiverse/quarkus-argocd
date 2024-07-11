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
public class AMQPConsumeConfig  {

    private Boolean autoAck;
    private String consumerTag;
    private Boolean exclusive;
    private Boolean noLocal;
    private Boolean noWait;

    /**
    * Get autoAck
    * @return autoAck
    **/
    @JsonProperty("autoAck")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public Boolean getAutoAck() {
        return autoAck;
    }

    /**
     * Set autoAck
     **/
    public void setAutoAck(Boolean autoAck) {
        this.autoAck = autoAck;
    }

    public AMQPConsumeConfig autoAck(Boolean autoAck) {
        this.autoAck = autoAck;
        return this;
    }

    /**
    * Get consumerTag
    * @return consumerTag
    **/
    @JsonProperty("consumerTag")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public String getConsumerTag() {
        return consumerTag;
    }

    /**
     * Set consumerTag
     **/
    public void setConsumerTag(String consumerTag) {
        this.consumerTag = consumerTag;
    }

    public AMQPConsumeConfig consumerTag(String consumerTag) {
        this.consumerTag = consumerTag;
        return this;
    }

    /**
    * Get exclusive
    * @return exclusive
    **/
    @JsonProperty("exclusive")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public Boolean getExclusive() {
        return exclusive;
    }

    /**
     * Set exclusive
     **/
    public void setExclusive(Boolean exclusive) {
        this.exclusive = exclusive;
    }

    public AMQPConsumeConfig exclusive(Boolean exclusive) {
        this.exclusive = exclusive;
        return this;
    }

    /**
    * Get noLocal
    * @return noLocal
    **/
    @JsonProperty("noLocal")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public Boolean getNoLocal() {
        return noLocal;
    }

    /**
     * Set noLocal
     **/
    public void setNoLocal(Boolean noLocal) {
        this.noLocal = noLocal;
    }

    public AMQPConsumeConfig noLocal(Boolean noLocal) {
        this.noLocal = noLocal;
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

    public AMQPConsumeConfig noWait(Boolean noWait) {
        this.noWait = noWait;
        return this;
    }

    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AMQPConsumeConfig {\n");

        sb.append("    autoAck: ").append(toIndentedString(autoAck)).append("\n");
        sb.append("    consumerTag: ").append(toIndentedString(consumerTag)).append("\n");
        sb.append("    exclusive: ").append(toIndentedString(exclusive)).append("\n");
        sb.append("    noLocal: ").append(toIndentedString(noLocal)).append("\n");
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
    public static class AMQPConsumeConfigQueryParam  {

        @jakarta.ws.rs.QueryParam("autoAck")
        private Boolean autoAck;
        @jakarta.ws.rs.QueryParam("consumerTag")
        private String consumerTag;
        @jakarta.ws.rs.QueryParam("exclusive")
        private Boolean exclusive;
        @jakarta.ws.rs.QueryParam("noLocal")
        private Boolean noLocal;
        @jakarta.ws.rs.QueryParam("noWait")
        private Boolean noWait;

        /**
        * Get autoAck
        * @return autoAck
        **/
        @JsonProperty("autoAck")
        public Boolean getAutoAck() {
            return autoAck;
        }

        /**
         * Set autoAck
         **/
        public void setAutoAck(Boolean autoAck) {
            this.autoAck = autoAck;
        }

        public AMQPConsumeConfigQueryParam autoAck(Boolean autoAck) {
            this.autoAck = autoAck;
            return this;
        }

        /**
        * Get consumerTag
        * @return consumerTag
        **/
        @JsonProperty("consumerTag")
        public String getConsumerTag() {
            return consumerTag;
        }

        /**
         * Set consumerTag
         **/
        public void setConsumerTag(String consumerTag) {
            this.consumerTag = consumerTag;
        }

        public AMQPConsumeConfigQueryParam consumerTag(String consumerTag) {
            this.consumerTag = consumerTag;
            return this;
        }

        /**
        * Get exclusive
        * @return exclusive
        **/
        @JsonProperty("exclusive")
        public Boolean getExclusive() {
            return exclusive;
        }

        /**
         * Set exclusive
         **/
        public void setExclusive(Boolean exclusive) {
            this.exclusive = exclusive;
        }

        public AMQPConsumeConfigQueryParam exclusive(Boolean exclusive) {
            this.exclusive = exclusive;
            return this;
        }

        /**
        * Get noLocal
        * @return noLocal
        **/
        @JsonProperty("noLocal")
        public Boolean getNoLocal() {
            return noLocal;
        }

        /**
         * Set noLocal
         **/
        public void setNoLocal(Boolean noLocal) {
            this.noLocal = noLocal;
        }

        public AMQPConsumeConfigQueryParam noLocal(Boolean noLocal) {
            this.noLocal = noLocal;
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

        public AMQPConsumeConfigQueryParam noWait(Boolean noWait) {
            this.noWait = noWait;
            return this;
        }

        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class AMQPConsumeConfigQueryParam {\n");

            sb.append("    autoAck: ").append(toIndentedString(autoAck)).append("\n");
            sb.append("    consumerTag: ").append(toIndentedString(consumerTag)).append("\n");
            sb.append("    exclusive: ").append(toIndentedString(exclusive)).append("\n");
            sb.append("    noLocal: ").append(toIndentedString(noLocal)).append("\n");
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
