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
public class ConfigMapPersistence  {

    private Boolean createIfNotExist;
    private String name;

    /**
    * Get createIfNotExist
    * @return createIfNotExist
    **/
    @JsonProperty("createIfNotExist")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public Boolean getCreateIfNotExist() {
        return createIfNotExist;
    }

    /**
     * Set createIfNotExist
     **/
    public void setCreateIfNotExist(Boolean createIfNotExist) {
        this.createIfNotExist = createIfNotExist;
    }

    public ConfigMapPersistence createIfNotExist(Boolean createIfNotExist) {
        this.createIfNotExist = createIfNotExist;
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

    public ConfigMapPersistence name(String name) {
        this.name = name;
        return this;
    }

    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ConfigMapPersistence {\n");

        sb.append("    createIfNotExist: ").append(toIndentedString(createIfNotExist)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        
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
    public static class ConfigMapPersistenceQueryParam  {

        @jakarta.ws.rs.QueryParam("createIfNotExist")
        private Boolean createIfNotExist;
        @jakarta.ws.rs.QueryParam("name")
        private String name;

        /**
        * Get createIfNotExist
        * @return createIfNotExist
        **/
        @JsonProperty("createIfNotExist")
        public Boolean getCreateIfNotExist() {
            return createIfNotExist;
        }

        /**
         * Set createIfNotExist
         **/
        public void setCreateIfNotExist(Boolean createIfNotExist) {
            this.createIfNotExist = createIfNotExist;
        }

        public ConfigMapPersistenceQueryParam createIfNotExist(Boolean createIfNotExist) {
            this.createIfNotExist = createIfNotExist;
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

        public ConfigMapPersistenceQueryParam name(String name) {
            this.name = name;
            return this;
        }

        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class ConfigMapPersistenceQueryParam {\n");

            sb.append("    createIfNotExist: ").append(toIndentedString(createIfNotExist)).append("\n");
            sb.append("    name: ").append(toIndentedString(name)).append("\n");
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
