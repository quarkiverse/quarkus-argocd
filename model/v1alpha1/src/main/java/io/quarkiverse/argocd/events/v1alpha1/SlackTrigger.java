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
  * SlackTrigger refers to the specification of the slack notification trigger.
 **/
public class SlackTrigger  {

    /**
      * SlackTrigger refers to the specification of the slack notification trigger.
     **/
    private String attachments;
    /**
      * SlackTrigger refers to the specification of the slack notification trigger.
     **/
    private String blocks;
    /**
      * SlackTrigger refers to the specification of the slack notification trigger.
     **/
    private String channel;
    /**
      * SlackTrigger refers to the specification of the slack notification trigger.
     **/
    private String message;
    /**
      * SlackTrigger refers to the specification of the slack notification trigger.
     **/
    private List<TriggerParameter> parameters;
    /**
      * SlackTrigger refers to the specification of the slack notification trigger.
     **/
    private SlackSender sender;
    /**
      * SlackTrigger refers to the specification of the slack notification trigger.
     **/
    private SecretKeySelector slackToken;
    /**
      * SlackTrigger refers to the specification of the slack notification trigger.
     **/
    private SlackThread thread;

    /**
    * Get attachments
    * @return attachments
    **/
    @JsonProperty("attachments")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public String getAttachments() {
        return attachments;
    }

    /**
     * Set attachments
     **/
    public void setAttachments(String attachments) {
        this.attachments = attachments;
    }

    public SlackTrigger attachments(String attachments) {
        this.attachments = attachments;
        return this;
    }

    /**
    * Get blocks
    * @return blocks
    **/
    @JsonProperty("blocks")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public String getBlocks() {
        return blocks;
    }

    /**
     * Set blocks
     **/
    public void setBlocks(String blocks) {
        this.blocks = blocks;
    }

    public SlackTrigger blocks(String blocks) {
        this.blocks = blocks;
        return this;
    }

    /**
    * Get channel
    * @return channel
    **/
    @JsonProperty("channel")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public String getChannel() {
        return channel;
    }

    /**
     * Set channel
     **/
    public void setChannel(String channel) {
        this.channel = channel;
    }

    public SlackTrigger channel(String channel) {
        this.channel = channel;
        return this;
    }

    /**
    * Get message
    * @return message
    **/
    @JsonProperty("message")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public String getMessage() {
        return message;
    }

    /**
     * Set message
     **/
    public void setMessage(String message) {
        this.message = message;
    }

    public SlackTrigger message(String message) {
        this.message = message;
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

    public SlackTrigger parameters(List<TriggerParameter> parameters) {
        this.parameters = parameters;
        return this;
    }
    public SlackTrigger addParametersItem(TriggerParameter parametersItem) {
        if (this.parameters == null){
            parameters = new ArrayList<>();
        }
        this.parameters.add(parametersItem);
        return this;
    }

    /**
    * Get sender
    * @return sender
    **/
    @JsonProperty("sender")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public SlackSender getSender() {
        return sender;
    }

    /**
     * Set sender
     **/
    public void setSender(SlackSender sender) {
        this.sender = sender;
    }

    public SlackTrigger sender(SlackSender sender) {
        this.sender = sender;
        return this;
    }

    /**
    * Get slackToken
    * @return slackToken
    **/
    @JsonProperty("slackToken")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public SecretKeySelector getSlackToken() {
        return slackToken;
    }

    /**
     * Set slackToken
     **/
    public void setSlackToken(SecretKeySelector slackToken) {
        this.slackToken = slackToken;
    }

    public SlackTrigger slackToken(SecretKeySelector slackToken) {
        this.slackToken = slackToken;
        return this;
    }

    /**
    * Get thread
    * @return thread
    **/
    @JsonProperty("thread")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public SlackThread getThread() {
        return thread;
    }

    /**
     * Set thread
     **/
    public void setThread(SlackThread thread) {
        this.thread = thread;
    }

    public SlackTrigger thread(SlackThread thread) {
        this.thread = thread;
        return this;
    }

    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SlackTrigger {\n");

        sb.append("    attachments: ").append(toIndentedString(attachments)).append("\n");
        sb.append("    blocks: ").append(toIndentedString(blocks)).append("\n");
        sb.append("    channel: ").append(toIndentedString(channel)).append("\n");
        sb.append("    message: ").append(toIndentedString(message)).append("\n");
        sb.append("    parameters: ").append(toIndentedString(parameters)).append("\n");
        sb.append("    sender: ").append(toIndentedString(sender)).append("\n");
        sb.append("    slackToken: ").append(toIndentedString(slackToken)).append("\n");
        sb.append("    thread: ").append(toIndentedString(thread)).append("\n");
        
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
      * SlackTrigger refers to the specification of the slack notification trigger.
     **/
    public static class SlackTriggerQueryParam  {

        /**
          * SlackTrigger refers to the specification of the slack notification trigger.
         **/
        @jakarta.ws.rs.QueryParam("attachments")
        private String attachments;
        /**
          * SlackTrigger refers to the specification of the slack notification trigger.
         **/
        @jakarta.ws.rs.QueryParam("blocks")
        private String blocks;
        /**
          * SlackTrigger refers to the specification of the slack notification trigger.
         **/
        @jakarta.ws.rs.QueryParam("channel")
        private String channel;
        /**
          * SlackTrigger refers to the specification of the slack notification trigger.
         **/
        @jakarta.ws.rs.QueryParam("message")
        private String message;
        /**
          * SlackTrigger refers to the specification of the slack notification trigger.
         **/
        @jakarta.ws.rs.QueryParam("parameters")
        private List<TriggerParameter> parameters = null;
        /**
          * SlackTrigger refers to the specification of the slack notification trigger.
         **/
        @jakarta.ws.rs.QueryParam("sender")
        private SlackSender sender;
        /**
          * SlackTrigger refers to the specification of the slack notification trigger.
         **/
        @jakarta.ws.rs.QueryParam("slackToken")
        private SecretKeySelector slackToken;
        /**
          * SlackTrigger refers to the specification of the slack notification trigger.
         **/
        @jakarta.ws.rs.QueryParam("thread")
        private SlackThread thread;

        /**
        * Get attachments
        * @return attachments
        **/
        @JsonProperty("attachments")
        public String getAttachments() {
            return attachments;
        }

        /**
         * Set attachments
         **/
        public void setAttachments(String attachments) {
            this.attachments = attachments;
        }

        public SlackTriggerQueryParam attachments(String attachments) {
            this.attachments = attachments;
            return this;
        }

        /**
        * Get blocks
        * @return blocks
        **/
        @JsonProperty("blocks")
        public String getBlocks() {
            return blocks;
        }

        /**
         * Set blocks
         **/
        public void setBlocks(String blocks) {
            this.blocks = blocks;
        }

        public SlackTriggerQueryParam blocks(String blocks) {
            this.blocks = blocks;
            return this;
        }

        /**
        * Get channel
        * @return channel
        **/
        @JsonProperty("channel")
        public String getChannel() {
            return channel;
        }

        /**
         * Set channel
         **/
        public void setChannel(String channel) {
            this.channel = channel;
        }

        public SlackTriggerQueryParam channel(String channel) {
            this.channel = channel;
            return this;
        }

        /**
        * Get message
        * @return message
        **/
        @JsonProperty("message")
        public String getMessage() {
            return message;
        }

        /**
         * Set message
         **/
        public void setMessage(String message) {
            this.message = message;
        }

        public SlackTriggerQueryParam message(String message) {
            this.message = message;
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

        public SlackTriggerQueryParam parameters(List<TriggerParameter> parameters) {
            this.parameters = parameters;
            return this;
        }
        public SlackTriggerQueryParam addParametersItem(TriggerParameter parametersItem) {
            this.parameters.add(parametersItem);
            return this;
        }

        /**
        * Get sender
        * @return sender
        **/
        @JsonProperty("sender")
        public SlackSender getSender() {
            return sender;
        }

        /**
         * Set sender
         **/
        public void setSender(SlackSender sender) {
            this.sender = sender;
        }

        public SlackTriggerQueryParam sender(SlackSender sender) {
            this.sender = sender;
            return this;
        }

        /**
        * Get slackToken
        * @return slackToken
        **/
        @JsonProperty("slackToken")
        public SecretKeySelector getSlackToken() {
            return slackToken;
        }

        /**
         * Set slackToken
         **/
        public void setSlackToken(SecretKeySelector slackToken) {
            this.slackToken = slackToken;
        }

        public SlackTriggerQueryParam slackToken(SecretKeySelector slackToken) {
            this.slackToken = slackToken;
            return this;
        }

        /**
        * Get thread
        * @return thread
        **/
        @JsonProperty("thread")
        public SlackThread getThread() {
            return thread;
        }

        /**
         * Set thread
         **/
        public void setThread(SlackThread thread) {
            this.thread = thread;
        }

        public SlackTriggerQueryParam thread(SlackThread thread) {
            this.thread = thread;
            return this;
        }

        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class SlackTriggerQueryParam {\n");

            sb.append("    attachments: ").append(toIndentedString(attachments)).append("\n");
            sb.append("    blocks: ").append(toIndentedString(blocks)).append("\n");
            sb.append("    channel: ").append(toIndentedString(channel)).append("\n");
            sb.append("    message: ").append(toIndentedString(message)).append("\n");
            sb.append("    parameters: ").append(toIndentedString(parameters)).append("\n");
            sb.append("    sender: ").append(toIndentedString(sender)).append("\n");
            sb.append("    slackToken: ").append(toIndentedString(slackToken)).append("\n");
            sb.append("    thread: ").append(toIndentedString(thread)).append("\n");
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
