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
public class KafkaConsumerGroup  {

    private String groupName;
    private Boolean oldest;
    private String rebalanceStrategy;

    /**
    * Get groupName
    * @return groupName
    **/
    @JsonProperty("groupName")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public String getGroupName() {
        return groupName;
    }

    /**
     * Set groupName
     **/
    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public KafkaConsumerGroup groupName(String groupName) {
        this.groupName = groupName;
        return this;
    }

    /**
    * Get oldest
    * @return oldest
    **/
    @JsonProperty("oldest")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public Boolean getOldest() {
        return oldest;
    }

    /**
     * Set oldest
     **/
    public void setOldest(Boolean oldest) {
        this.oldest = oldest;
    }

    public KafkaConsumerGroup oldest(Boolean oldest) {
        this.oldest = oldest;
        return this;
    }

    /**
    * Get rebalanceStrategy
    * @return rebalanceStrategy
    **/
    @JsonProperty("rebalanceStrategy")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public String getRebalanceStrategy() {
        return rebalanceStrategy;
    }

    /**
     * Set rebalanceStrategy
     **/
    public void setRebalanceStrategy(String rebalanceStrategy) {
        this.rebalanceStrategy = rebalanceStrategy;
    }

    public KafkaConsumerGroup rebalanceStrategy(String rebalanceStrategy) {
        this.rebalanceStrategy = rebalanceStrategy;
        return this;
    }

    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class KafkaConsumerGroup {\n");

        sb.append("    groupName: ").append(toIndentedString(groupName)).append("\n");
        sb.append("    oldest: ").append(toIndentedString(oldest)).append("\n");
        sb.append("    rebalanceStrategy: ").append(toIndentedString(rebalanceStrategy)).append("\n");
        
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
    public static class KafkaConsumerGroupQueryParam  {

        @jakarta.ws.rs.QueryParam("groupName")
        private String groupName;
        @jakarta.ws.rs.QueryParam("oldest")
        private Boolean oldest;
        @jakarta.ws.rs.QueryParam("rebalanceStrategy")
        private String rebalanceStrategy;

        /**
        * Get groupName
        * @return groupName
        **/
        @JsonProperty("groupName")
        public String getGroupName() {
            return groupName;
        }

        /**
         * Set groupName
         **/
        public void setGroupName(String groupName) {
            this.groupName = groupName;
        }

        public KafkaConsumerGroupQueryParam groupName(String groupName) {
            this.groupName = groupName;
            return this;
        }

        /**
        * Get oldest
        * @return oldest
        **/
        @JsonProperty("oldest")
        public Boolean getOldest() {
            return oldest;
        }

        /**
         * Set oldest
         **/
        public void setOldest(Boolean oldest) {
            this.oldest = oldest;
        }

        public KafkaConsumerGroupQueryParam oldest(Boolean oldest) {
            this.oldest = oldest;
            return this;
        }

        /**
        * Get rebalanceStrategy
        * @return rebalanceStrategy
        **/
        @JsonProperty("rebalanceStrategy")
        public String getRebalanceStrategy() {
            return rebalanceStrategy;
        }

        /**
         * Set rebalanceStrategy
         **/
        public void setRebalanceStrategy(String rebalanceStrategy) {
            this.rebalanceStrategy = rebalanceStrategy;
        }

        public KafkaConsumerGroupQueryParam rebalanceStrategy(String rebalanceStrategy) {
            this.rebalanceStrategy = rebalanceStrategy;
            return this;
        }

        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class KafkaConsumerGroupQueryParam {\n");

            sb.append("    groupName: ").append(toIndentedString(groupName)).append("\n");
            sb.append("    oldest: ").append(toIndentedString(oldest)).append("\n");
            sb.append("    rebalanceStrategy: ").append(toIndentedString(rebalanceStrategy)).append("\n");
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
