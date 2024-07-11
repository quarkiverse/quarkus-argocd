package io.quarkiverse.argocd.workflow.v1alpha1;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.quarkiverse.argocd.v1alpha1.model.Workflow;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.Type;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class WorkflowWatchEvent  {

    private Workflow _object;
    private String type;

    /**
    * Get _object
    * @return _object
    **/
    @JsonProperty("object")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public Workflow getObject() {
        return _object;
    }

    /**
     * Set _object
     **/
    public void setObject(Workflow _object) {
        this._object = _object;
    }

    public WorkflowWatchEvent _object(Workflow _object) {
        this._object = _object;
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

    public WorkflowWatchEvent type(String type) {
        this.type = type;
        return this;
    }

    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class WorkflowWatchEvent {\n");

        sb.append("    _object: ").append(toIndentedString(_object)).append("\n");
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
    public static class WorkflowWatchEventQueryParam  {

        @jakarta.ws.rs.QueryParam("_object")
        private Workflow _object;
        @jakarta.ws.rs.QueryParam("type")
        private String type;

        /**
        * Get _object
        * @return _object
        **/
        @JsonProperty("object")
        public Workflow getObject() {
            return _object;
        }

        /**
         * Set _object
         **/
        public void setObject(Workflow _object) {
            this._object = _object;
        }

        public WorkflowWatchEventQueryParam _object(Workflow _object) {
            this._object = _object;
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

        public WorkflowWatchEventQueryParam type(String type) {
            this.type = type;
            return this;
        }

        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class WorkflowWatchEventQueryParam {\n");

            sb.append("    _object: ").append(toIndentedString(_object)).append("\n");
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