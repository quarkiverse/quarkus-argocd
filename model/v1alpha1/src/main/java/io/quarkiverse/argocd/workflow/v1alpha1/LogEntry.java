package io.quarkiverse.argocd.workflow.v1alpha1;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.Type;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class LogEntry  {

    private String content;
    private String podName;

    /**
    * Get content
    * @return content
    **/
    @JsonProperty("content")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public String getContent() {
        return content;
    }

    /**
     * Set content
     **/
    public void setContent(String content) {
        this.content = content;
    }

    public LogEntry content(String content) {
        this.content = content;
        return this;
    }

    /**
    * Get podName
    * @return podName
    **/
    @JsonProperty("podName")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public String getPodName() {
        return podName;
    }

    /**
     * Set podName
     **/
    public void setPodName(String podName) {
        this.podName = podName;
    }

    public LogEntry podName(String podName) {
        this.podName = podName;
        return this;
    }

    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class LogEntry {\n");

        sb.append("    content: ").append(toIndentedString(content)).append("\n");
        sb.append("    podName: ").append(toIndentedString(podName)).append("\n");
        
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
    public static class LogEntryQueryParam  {

        @jakarta.ws.rs.QueryParam("content")
        private String content;
        @jakarta.ws.rs.QueryParam("podName")
        private String podName;

        /**
        * Get content
        * @return content
        **/
        @JsonProperty("content")
        public String getContent() {
            return content;
        }

        /**
         * Set content
         **/
        public void setContent(String content) {
            this.content = content;
        }

        public LogEntryQueryParam content(String content) {
            this.content = content;
            return this;
        }

        /**
        * Get podName
        * @return podName
        **/
        @JsonProperty("podName")
        public String getPodName() {
            return podName;
        }

        /**
         * Set podName
         **/
        public void setPodName(String podName) {
            this.podName = podName;
        }

        public LogEntryQueryParam podName(String podName) {
            this.podName = podName;
            return this;
        }

        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class LogEntryQueryParam {\n");

            sb.append("    content: ").append(toIndentedString(content)).append("\n");
            sb.append("    podName: ").append(toIndentedString(podName)).append("\n");
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