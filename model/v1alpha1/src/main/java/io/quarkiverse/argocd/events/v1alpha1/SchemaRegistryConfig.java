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
public class SchemaRegistryConfig  {

    private BasicAuth auth;
    private Integer schemaId;
    private String url;

    /**
    * Get auth
    * @return auth
    **/
    @JsonProperty("auth")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public BasicAuth getAuth() {
        return auth;
    }

    /**
     * Set auth
     **/
    public void setAuth(BasicAuth auth) {
        this.auth = auth;
    }

    public SchemaRegistryConfig auth(BasicAuth auth) {
        this.auth = auth;
        return this;
    }

    /**
    * Get schemaId
    * @return schemaId
    **/
    @JsonProperty("schemaId")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public Integer getSchemaId() {
        return schemaId;
    }

    /**
     * Set schemaId
     **/
    public void setSchemaId(Integer schemaId) {
        this.schemaId = schemaId;
    }

    public SchemaRegistryConfig schemaId(Integer schemaId) {
        this.schemaId = schemaId;
        return this;
    }

    /**
    * Schema Registry URL.
    * @return url
    **/
    @JsonProperty("url")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public String getUrl() {
        return url;
    }

    /**
     * Set url
     **/
    public void setUrl(String url) {
        this.url = url;
    }

    public SchemaRegistryConfig url(String url) {
        this.url = url;
        return this;
    }

    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SchemaRegistryConfig {\n");

        sb.append("    auth: ").append(toIndentedString(auth)).append("\n");
        sb.append("    schemaId: ").append(toIndentedString(schemaId)).append("\n");
        sb.append("    url: ").append(toIndentedString(url)).append("\n");
        
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
    public static class SchemaRegistryConfigQueryParam  {

        @jakarta.ws.rs.QueryParam("auth")
        private BasicAuth auth;
        @jakarta.ws.rs.QueryParam("schemaId")
        private Integer schemaId;
        @jakarta.ws.rs.QueryParam("url")
        private String url;

        /**
        * Get auth
        * @return auth
        **/
        @JsonProperty("auth")
        public BasicAuth getAuth() {
            return auth;
        }

        /**
         * Set auth
         **/
        public void setAuth(BasicAuth auth) {
            this.auth = auth;
        }

        public SchemaRegistryConfigQueryParam auth(BasicAuth auth) {
            this.auth = auth;
            return this;
        }

        /**
        * Get schemaId
        * @return schemaId
        **/
        @JsonProperty("schemaId")
        public Integer getSchemaId() {
            return schemaId;
        }

        /**
         * Set schemaId
         **/
        public void setSchemaId(Integer schemaId) {
            this.schemaId = schemaId;
        }

        public SchemaRegistryConfigQueryParam schemaId(Integer schemaId) {
            this.schemaId = schemaId;
            return this;
        }

        /**
        * Schema Registry URL.
        * @return url
        **/
        @JsonProperty("url")
        public String getUrl() {
            return url;
        }

        /**
         * Set url
         **/
        public void setUrl(String url) {
            this.url = url;
        }

        public SchemaRegistryConfigQueryParam url(String url) {
            this.url = url;
            return this;
        }

        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class SchemaRegistryConfigQueryParam {\n");

            sb.append("    auth: ").append(toIndentedString(auth)).append("\n");
            sb.append("    schemaId: ").append(toIndentedString(schemaId)).append("\n");
            sb.append("    url: ").append(toIndentedString(url)).append("\n");
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
