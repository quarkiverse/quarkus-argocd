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
public class AMQPQueueDeclareConfig  {

    private String arguments;
    private Boolean autoDelete;
    private Boolean durable;
    private Boolean exclusive;
    private String name;
    private Boolean noWait;

    /**
    * Get arguments
    * @return arguments
    **/
    @JsonProperty("arguments")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public String getArguments() {
        return arguments;
    }

    /**
     * Set arguments
     **/
    public void setArguments(String arguments) {
        this.arguments = arguments;
    }

    public AMQPQueueDeclareConfig arguments(String arguments) {
        this.arguments = arguments;
        return this;
    }

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

    public AMQPQueueDeclareConfig autoDelete(Boolean autoDelete) {
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

    public AMQPQueueDeclareConfig durable(Boolean durable) {
        this.durable = durable;
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

    public AMQPQueueDeclareConfig exclusive(Boolean exclusive) {
        this.exclusive = exclusive;
        return this;
    }

    /**
    * Get name
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

    public AMQPQueueDeclareConfig name(String name) {
        this.name = name;
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

    public AMQPQueueDeclareConfig noWait(Boolean noWait) {
        this.noWait = noWait;
        return this;
    }

    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AMQPQueueDeclareConfig {\n");

        sb.append("    arguments: ").append(toIndentedString(arguments)).append("\n");
        sb.append("    autoDelete: ").append(toIndentedString(autoDelete)).append("\n");
        sb.append("    durable: ").append(toIndentedString(durable)).append("\n");
        sb.append("    exclusive: ").append(toIndentedString(exclusive)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
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
    public static class AMQPQueueDeclareConfigQueryParam  {

        @jakarta.ws.rs.QueryParam("arguments")
        private String arguments;
        @jakarta.ws.rs.QueryParam("autoDelete")
        private Boolean autoDelete;
        @jakarta.ws.rs.QueryParam("durable")
        private Boolean durable;
        @jakarta.ws.rs.QueryParam("exclusive")
        private Boolean exclusive;
        @jakarta.ws.rs.QueryParam("name")
        private String name;
        @jakarta.ws.rs.QueryParam("noWait")
        private Boolean noWait;

        /**
        * Get arguments
        * @return arguments
        **/
        @JsonProperty("arguments")
        public String getArguments() {
            return arguments;
        }

        /**
         * Set arguments
         **/
        public void setArguments(String arguments) {
            this.arguments = arguments;
        }

        public AMQPQueueDeclareConfigQueryParam arguments(String arguments) {
            this.arguments = arguments;
            return this;
        }

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

        public AMQPQueueDeclareConfigQueryParam autoDelete(Boolean autoDelete) {
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

        public AMQPQueueDeclareConfigQueryParam durable(Boolean durable) {
            this.durable = durable;
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

        public AMQPQueueDeclareConfigQueryParam exclusive(Boolean exclusive) {
            this.exclusive = exclusive;
            return this;
        }

        /**
        * Get name
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

        public AMQPQueueDeclareConfigQueryParam name(String name) {
            this.name = name;
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

        public AMQPQueueDeclareConfigQueryParam noWait(Boolean noWait) {
            this.noWait = noWait;
            return this;
        }

        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class AMQPQueueDeclareConfigQueryParam {\n");

            sb.append("    arguments: ").append(toIndentedString(arguments)).append("\n");
            sb.append("    autoDelete: ").append(toIndentedString(autoDelete)).append("\n");
            sb.append("    durable: ").append(toIndentedString(durable)).append("\n");
            sb.append("    exclusive: ").append(toIndentedString(exclusive)).append("\n");
            sb.append("    name: ").append(toIndentedString(name)).append("\n");
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
