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
public class SlackSender  {

    private String icon;
    private String username;

    /**
    * Get icon
    * @return icon
    **/
    @JsonProperty("icon")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public String getIcon() {
        return icon;
    }

    /**
     * Set icon
     **/
    public void setIcon(String icon) {
        this.icon = icon;
    }

    public SlackSender icon(String icon) {
        this.icon = icon;
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

    public SlackSender username(String username) {
        this.username = username;
        return this;
    }

    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SlackSender {\n");

        sb.append("    icon: ").append(toIndentedString(icon)).append("\n");
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
    public static class SlackSenderQueryParam  {

        @jakarta.ws.rs.QueryParam("icon")
        private String icon;
        @jakarta.ws.rs.QueryParam("username")
        private String username;

        /**
        * Get icon
        * @return icon
        **/
        @JsonProperty("icon")
        public String getIcon() {
            return icon;
        }

        /**
         * Set icon
         **/
        public void setIcon(String icon) {
            this.icon = icon;
        }

        public SlackSenderQueryParam icon(String icon) {
            this.icon = icon;
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

        public SlackSenderQueryParam username(String username) {
            this.username = username;
            return this;
        }

        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class SlackSenderQueryParam {\n");

            sb.append("    icon: ").append(toIndentedString(icon)).append("\n");
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
