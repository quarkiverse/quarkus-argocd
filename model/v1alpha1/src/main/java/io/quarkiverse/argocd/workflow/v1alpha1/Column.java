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
/**
  * Column is a custom column that will be exposed in the Workflow List View.
 **/
public class Column  {

    /**
      * Column is a custom column that will be exposed in the Workflow List View.
     **/
    private String key;
    /**
      * Column is a custom column that will be exposed in the Workflow List View.
     **/
    private String name;
    /**
      * Column is a custom column that will be exposed in the Workflow List View.
     **/
    private String type;

    /**
    * The key of the label or annotation, e.g., \"workflows.argoproj.io/completed\".
    * @return key
    **/
    @JsonProperty("key")
    public String getKey() {
        return key;
    }

    /**
     * Set key
     **/
    public void setKey(String key) {
        this.key = key;
    }

    public Column key(String key) {
        this.key = key;
        return this;
    }

    /**
    * The name of this column, e.g., \"Workflow Completed\".
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

    public Column name(String name) {
        this.name = name;
        return this;
    }

    /**
    * The type of this column, \"label\" or \"annotation\".
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

    public Column type(String type) {
        this.type = type;
        return this;
    }

    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Column {\n");

        sb.append("    key: ").append(toIndentedString(key)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
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
    /**
      * Column is a custom column that will be exposed in the Workflow List View.
     **/
    public static class ColumnQueryParam  {

        /**
          * Column is a custom column that will be exposed in the Workflow List View.
         **/
        @jakarta.ws.rs.QueryParam("key")
        private String key;
        /**
          * Column is a custom column that will be exposed in the Workflow List View.
         **/
        @jakarta.ws.rs.QueryParam("name")
        private String name;
        /**
          * Column is a custom column that will be exposed in the Workflow List View.
         **/
        @jakarta.ws.rs.QueryParam("type")
        private String type;

        /**
        * The key of the label or annotation, e.g., \"workflows.argoproj.io/completed\".
        * @return key
        **/
        @JsonProperty("key")
        public String getKey() {
            return key;
        }

        /**
         * Set key
         **/
        public void setKey(String key) {
            this.key = key;
        }

        public ColumnQueryParam key(String key) {
            this.key = key;
            return this;
        }

        /**
        * The name of this column, e.g., \"Workflow Completed\".
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

        public ColumnQueryParam name(String name) {
            this.name = name;
            return this;
        }

        /**
        * The type of this column, \"label\" or \"annotation\".
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

        public ColumnQueryParam type(String type) {
            this.type = type;
            return this;
        }

        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class ColumnQueryParam {\n");

            sb.append("    key: ").append(toIndentedString(key)).append("\n");
            sb.append("    name: ").append(toIndentedString(name)).append("\n");
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