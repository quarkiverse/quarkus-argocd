package io.quarkiverse.argocd.events.v1alpha1;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.quarkiverse.argocd.v1alpha1.model.EventSourceFilter;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.Type;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class WebhookEventSource  {

    private EventSourceFilter filter;
    private WebhookContext webhookContext;

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

    public WebhookEventSource filter(EventSourceFilter filter) {
        this.filter = filter;
        return this;
    }

    /**
    * Get webhookContext
    * @return webhookContext
    **/
    @JsonProperty("webhookContext")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public WebhookContext getWebhookContext() {
        return webhookContext;
    }

    /**
     * Set webhookContext
     **/
    public void setWebhookContext(WebhookContext webhookContext) {
        this.webhookContext = webhookContext;
    }

    public WebhookEventSource webhookContext(WebhookContext webhookContext) {
        this.webhookContext = webhookContext;
        return this;
    }

    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class WebhookEventSource {\n");

        sb.append("    filter: ").append(toIndentedString(filter)).append("\n");
        sb.append("    webhookContext: ").append(toIndentedString(webhookContext)).append("\n");
        
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
    public static class WebhookEventSourceQueryParam  {

        @jakarta.ws.rs.QueryParam("filter")
        private EventSourceFilter filter;
        @jakarta.ws.rs.QueryParam("webhookContext")
        private WebhookContext webhookContext;

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

        public WebhookEventSourceQueryParam filter(EventSourceFilter filter) {
            this.filter = filter;
            return this;
        }

        /**
        * Get webhookContext
        * @return webhookContext
        **/
        @JsonProperty("webhookContext")
        public WebhookContext getWebhookContext() {
            return webhookContext;
        }

        /**
         * Set webhookContext
         **/
        public void setWebhookContext(WebhookContext webhookContext) {
            this.webhookContext = webhookContext;
        }

        public WebhookEventSourceQueryParam webhookContext(WebhookContext webhookContext) {
            this.webhookContext = webhookContext;
            return this;
        }

        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class WebhookEventSourceQueryParam {\n");

            sb.append("    filter: ").append(toIndentedString(filter)).append("\n");
            sb.append("    webhookContext: ").append(toIndentedString(webhookContext)).append("\n");
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
