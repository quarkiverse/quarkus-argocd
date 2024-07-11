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
public class EventPersistence  {

    private CatchupConfiguration catchup;
    private ConfigMapPersistence configMap;

    /**
    * Get catchup
    * @return catchup
    **/
    @JsonProperty("catchup")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public CatchupConfiguration getCatchup() {
        return catchup;
    }

    /**
     * Set catchup
     **/
    public void setCatchup(CatchupConfiguration catchup) {
        this.catchup = catchup;
    }

    public EventPersistence catchup(CatchupConfiguration catchup) {
        this.catchup = catchup;
        return this;
    }

    /**
    * Get configMap
    * @return configMap
    **/
    @JsonProperty("configMap")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public ConfigMapPersistence getConfigMap() {
        return configMap;
    }

    /**
     * Set configMap
     **/
    public void setConfigMap(ConfigMapPersistence configMap) {
        this.configMap = configMap;
    }

    public EventPersistence configMap(ConfigMapPersistence configMap) {
        this.configMap = configMap;
        return this;
    }

    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class EventPersistence {\n");

        sb.append("    catchup: ").append(toIndentedString(catchup)).append("\n");
        sb.append("    configMap: ").append(toIndentedString(configMap)).append("\n");
        
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
    public static class EventPersistenceQueryParam  {

        @jakarta.ws.rs.QueryParam("catchup")
        private CatchupConfiguration catchup;
        @jakarta.ws.rs.QueryParam("configMap")
        private ConfigMapPersistence configMap;

        /**
        * Get catchup
        * @return catchup
        **/
        @JsonProperty("catchup")
        public CatchupConfiguration getCatchup() {
            return catchup;
        }

        /**
         * Set catchup
         **/
        public void setCatchup(CatchupConfiguration catchup) {
            this.catchup = catchup;
        }

        public EventPersistenceQueryParam catchup(CatchupConfiguration catchup) {
            this.catchup = catchup;
            return this;
        }

        /**
        * Get configMap
        * @return configMap
        **/
        @JsonProperty("configMap")
        public ConfigMapPersistence getConfigMap() {
            return configMap;
        }

        /**
         * Set configMap
         **/
        public void setConfigMap(ConfigMapPersistence configMap) {
            this.configMap = configMap;
        }

        public EventPersistenceQueryParam configMap(ConfigMapPersistence configMap) {
            this.configMap = configMap;
            return this;
        }

        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class EventPersistenceQueryParam {\n");

            sb.append("    catchup: ").append(toIndentedString(catchup)).append("\n");
            sb.append("    configMap: ").append(toIndentedString(configMap)).append("\n");
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
