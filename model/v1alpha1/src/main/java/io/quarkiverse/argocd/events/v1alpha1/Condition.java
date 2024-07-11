package io.quarkiverse.argocd.events.v1alpha1;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.time.OffsetDateTime;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.Type;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Condition  {

    private OffsetDateTime lastTransitionTime;
    private String message;
    private String reason;
    private String status;
    private String type;

    /**
    * Time is a wrapper around time.Time which supports correct marshaling to YAML and JSON.  Wrappers are provided for many of the factory methods that the time package offers.
    * @return lastTransitionTime
    **/
    @JsonProperty("lastTransitionTime")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public OffsetDateTime getLastTransitionTime() {
        return lastTransitionTime;
    }

    /**
     * Set lastTransitionTime
     **/
    public void setLastTransitionTime(OffsetDateTime lastTransitionTime) {
        this.lastTransitionTime = lastTransitionTime;
    }

    public Condition lastTransitionTime(OffsetDateTime lastTransitionTime) {
        this.lastTransitionTime = lastTransitionTime;
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

    public Condition message(String message) {
        this.message = message;
        return this;
    }

    /**
    * Get reason
    * @return reason
    **/
    @JsonProperty("reason")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public String getReason() {
        return reason;
    }

    /**
     * Set reason
     **/
    public void setReason(String reason) {
        this.reason = reason;
    }

    public Condition reason(String reason) {
        this.reason = reason;
        return this;
    }

    /**
    * Get status
    * @return status
    **/
    @JsonProperty("status")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public String getStatus() {
        return status;
    }

    /**
     * Set status
     **/
    public void setStatus(String status) {
        this.status = status;
    }

    public Condition status(String status) {
        this.status = status;
        return this;
    }

    /**
    * Get type
    * @return type
    **/
    @JsonProperty("type")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public String getType() {
        return type;
    }

    /**
     * Set type
     **/
    public void setType(String type) {
        this.type = type;
    }

    public Condition type(String type) {
        this.type = type;
        return this;
    }

    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Condition {\n");

        sb.append("    lastTransitionTime: ").append(toIndentedString(lastTransitionTime)).append("\n");
        sb.append("    message: ").append(toIndentedString(message)).append("\n");
        sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        
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
    public static class ConditionQueryParam  {

        @jakarta.ws.rs.QueryParam("lastTransitionTime")
        private OffsetDateTime lastTransitionTime;
        @jakarta.ws.rs.QueryParam("message")
        private String message;
        @jakarta.ws.rs.QueryParam("reason")
        private String reason;
        @jakarta.ws.rs.QueryParam("status")
        private String status;
        @jakarta.ws.rs.QueryParam("type")
        private String type;

        /**
        * Time is a wrapper around time.Time which supports correct marshaling to YAML and JSON.  Wrappers are provided for many of the factory methods that the time package offers.
        * @return lastTransitionTime
        **/
        @JsonProperty("lastTransitionTime")
        public OffsetDateTime getLastTransitionTime() {
            return lastTransitionTime;
        }

        /**
         * Set lastTransitionTime
         **/
        public void setLastTransitionTime(OffsetDateTime lastTransitionTime) {
            this.lastTransitionTime = lastTransitionTime;
        }

        public ConditionQueryParam lastTransitionTime(OffsetDateTime lastTransitionTime) {
            this.lastTransitionTime = lastTransitionTime;
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

        public ConditionQueryParam message(String message) {
            this.message = message;
            return this;
        }

        /**
        * Get reason
        * @return reason
        **/
        @JsonProperty("reason")
        public String getReason() {
            return reason;
        }

        /**
         * Set reason
         **/
        public void setReason(String reason) {
            this.reason = reason;
        }

        public ConditionQueryParam reason(String reason) {
            this.reason = reason;
            return this;
        }

        /**
        * Get status
        * @return status
        **/
        @JsonProperty("status")
        public String getStatus() {
            return status;
        }

        /**
         * Set status
         **/
        public void setStatus(String status) {
            this.status = status;
        }

        public ConditionQueryParam status(String status) {
            this.status = status;
            return this;
        }

        /**
        * Get type
        * @return type
        **/
        @JsonProperty("type")
        public String getType() {
            return type;
        }

        /**
         * Set type
         **/
        public void setType(String type) {
            this.type = type;
        }

        public ConditionQueryParam type(String type) {
            this.type = type;
            return this;
        }

        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class ConditionQueryParam {\n");

            sb.append("    lastTransitionTime: ").append(toIndentedString(lastTransitionTime)).append("\n");
            sb.append("    message: ").append(toIndentedString(message)).append("\n");
            sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
            sb.append("    status: ").append(toIndentedString(status)).append("\n");
            sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
