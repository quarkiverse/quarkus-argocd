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
public class SlackThread  {

    private Boolean broadcastMessageToChannel;
    private String messageAggregationKey;

    /**
    * Get broadcastMessageToChannel
    * @return broadcastMessageToChannel
    **/
    @JsonProperty("broadcastMessageToChannel")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public Boolean getBroadcastMessageToChannel() {
        return broadcastMessageToChannel;
    }

    /**
     * Set broadcastMessageToChannel
     **/
    public void setBroadcastMessageToChannel(Boolean broadcastMessageToChannel) {
        this.broadcastMessageToChannel = broadcastMessageToChannel;
    }

    public SlackThread broadcastMessageToChannel(Boolean broadcastMessageToChannel) {
        this.broadcastMessageToChannel = broadcastMessageToChannel;
        return this;
    }

    /**
    * Get messageAggregationKey
    * @return messageAggregationKey
    **/
    @JsonProperty("messageAggregationKey")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public String getMessageAggregationKey() {
        return messageAggregationKey;
    }

    /**
     * Set messageAggregationKey
     **/
    public void setMessageAggregationKey(String messageAggregationKey) {
        this.messageAggregationKey = messageAggregationKey;
    }

    public SlackThread messageAggregationKey(String messageAggregationKey) {
        this.messageAggregationKey = messageAggregationKey;
        return this;
    }

    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SlackThread {\n");

        sb.append("    broadcastMessageToChannel: ").append(toIndentedString(broadcastMessageToChannel)).append("\n");
        sb.append("    messageAggregationKey: ").append(toIndentedString(messageAggregationKey)).append("\n");
        
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
    public static class SlackThreadQueryParam  {

        @jakarta.ws.rs.QueryParam("broadcastMessageToChannel")
        private Boolean broadcastMessageToChannel;
        @jakarta.ws.rs.QueryParam("messageAggregationKey")
        private String messageAggregationKey;

        /**
        * Get broadcastMessageToChannel
        * @return broadcastMessageToChannel
        **/
        @JsonProperty("broadcastMessageToChannel")
        public Boolean getBroadcastMessageToChannel() {
            return broadcastMessageToChannel;
        }

        /**
         * Set broadcastMessageToChannel
         **/
        public void setBroadcastMessageToChannel(Boolean broadcastMessageToChannel) {
            this.broadcastMessageToChannel = broadcastMessageToChannel;
        }

        public SlackThreadQueryParam broadcastMessageToChannel(Boolean broadcastMessageToChannel) {
            this.broadcastMessageToChannel = broadcastMessageToChannel;
            return this;
        }

        /**
        * Get messageAggregationKey
        * @return messageAggregationKey
        **/
        @JsonProperty("messageAggregationKey")
        public String getMessageAggregationKey() {
            return messageAggregationKey;
        }

        /**
         * Set messageAggregationKey
         **/
        public void setMessageAggregationKey(String messageAggregationKey) {
            this.messageAggregationKey = messageAggregationKey;
        }

        public SlackThreadQueryParam messageAggregationKey(String messageAggregationKey) {
            this.messageAggregationKey = messageAggregationKey;
            return this;
        }

        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class SlackThreadQueryParam {\n");

            sb.append("    broadcastMessageToChannel: ").append(toIndentedString(broadcastMessageToChannel)).append("\n");
            sb.append("    messageAggregationKey: ").append(toIndentedString(messageAggregationKey)).append("\n");
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
