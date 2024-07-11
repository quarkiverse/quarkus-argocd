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
public class EventContext  {

    private String datacontenttype;
    private String id;
    private String source;
    private String specversion;
    private String subject;
    private OffsetDateTime time;
    private String type;

    /**
    * DataContentType - A MIME (RFC2046) string describing the media type of `data`.
    * @return datacontenttype
    **/
    @JsonProperty("datacontenttype")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public String getDatacontenttype() {
        return datacontenttype;
    }

    /**
     * Set datacontenttype
     **/
    public void setDatacontenttype(String datacontenttype) {
        this.datacontenttype = datacontenttype;
    }

    public EventContext datacontenttype(String datacontenttype) {
        this.datacontenttype = datacontenttype;
        return this;
    }

    /**
    * ID of the event; must be non-empty and unique within the scope of the producer.
    * @return id
    **/
    @JsonProperty("id")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public String getId() {
        return id;
    }

    /**
     * Set id
     **/
    public void setId(String id) {
        this.id = id;
    }

    public EventContext id(String id) {
        this.id = id;
        return this;
    }

    /**
    * Source - A URI describing the event producer.
    * @return source
    **/
    @JsonProperty("source")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public String getSource() {
        return source;
    }

    /**
     * Set source
     **/
    public void setSource(String source) {
        this.source = source;
    }

    public EventContext source(String source) {
        this.source = source;
        return this;
    }

    /**
    * SpecVersion - The version of the CloudEvents specification used by the io.argoproj.workflow.v1alpha1.
    * @return specversion
    **/
    @JsonProperty("specversion")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public String getSpecversion() {
        return specversion;
    }

    /**
     * Set specversion
     **/
    public void setSpecversion(String specversion) {
        this.specversion = specversion;
    }

    public EventContext specversion(String specversion) {
        this.specversion = specversion;
        return this;
    }

    /**
    * Get subject
    * @return subject
    **/
    @JsonProperty("subject")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public String getSubject() {
        return subject;
    }

    /**
     * Set subject
     **/
    public void setSubject(String subject) {
        this.subject = subject;
    }

    public EventContext subject(String subject) {
        this.subject = subject;
        return this;
    }

    /**
    * Time is a wrapper around time.Time which supports correct marshaling to YAML and JSON.  Wrappers are provided for many of the factory methods that the time package offers.
    * @return time
    **/
    @JsonProperty("time")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public OffsetDateTime getTime() {
        return time;
    }

    /**
     * Set time
     **/
    public void setTime(OffsetDateTime time) {
        this.time = time;
    }

    public EventContext time(OffsetDateTime time) {
        this.time = time;
        return this;
    }

    /**
    * Type - The type of the occurrence which has happened.
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

    public EventContext type(String type) {
        this.type = type;
        return this;
    }

    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class EventContext {\n");

        sb.append("    datacontenttype: ").append(toIndentedString(datacontenttype)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    source: ").append(toIndentedString(source)).append("\n");
        sb.append("    specversion: ").append(toIndentedString(specversion)).append("\n");
        sb.append("    subject: ").append(toIndentedString(subject)).append("\n");
        sb.append("    time: ").append(toIndentedString(time)).append("\n");
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
    public static class EventContextQueryParam  {

        @jakarta.ws.rs.QueryParam("datacontenttype")
        private String datacontenttype;
        @jakarta.ws.rs.QueryParam("id")
        private String id;
        @jakarta.ws.rs.QueryParam("source")
        private String source;
        @jakarta.ws.rs.QueryParam("specversion")
        private String specversion;
        @jakarta.ws.rs.QueryParam("subject")
        private String subject;
        @jakarta.ws.rs.QueryParam("time")
        private OffsetDateTime time;
        @jakarta.ws.rs.QueryParam("type")
        private String type;

        /**
        * DataContentType - A MIME (RFC2046) string describing the media type of `data`.
        * @return datacontenttype
        **/
        @JsonProperty("datacontenttype")
        public String getDatacontenttype() {
            return datacontenttype;
        }

        /**
         * Set datacontenttype
         **/
        public void setDatacontenttype(String datacontenttype) {
            this.datacontenttype = datacontenttype;
        }

        public EventContextQueryParam datacontenttype(String datacontenttype) {
            this.datacontenttype = datacontenttype;
            return this;
        }

        /**
        * ID of the event; must be non-empty and unique within the scope of the producer.
        * @return id
        **/
        @JsonProperty("id")
        public String getId() {
            return id;
        }

        /**
         * Set id
         **/
        public void setId(String id) {
            this.id = id;
        }

        public EventContextQueryParam id(String id) {
            this.id = id;
            return this;
        }

        /**
        * Source - A URI describing the event producer.
        * @return source
        **/
        @JsonProperty("source")
        public String getSource() {
            return source;
        }

        /**
         * Set source
         **/
        public void setSource(String source) {
            this.source = source;
        }

        public EventContextQueryParam source(String source) {
            this.source = source;
            return this;
        }

        /**
        * SpecVersion - The version of the CloudEvents specification used by the io.argoproj.workflow.v1alpha1.
        * @return specversion
        **/
        @JsonProperty("specversion")
        public String getSpecversion() {
            return specversion;
        }

        /**
         * Set specversion
         **/
        public void setSpecversion(String specversion) {
            this.specversion = specversion;
        }

        public EventContextQueryParam specversion(String specversion) {
            this.specversion = specversion;
            return this;
        }

        /**
        * Get subject
        * @return subject
        **/
        @JsonProperty("subject")
        public String getSubject() {
            return subject;
        }

        /**
         * Set subject
         **/
        public void setSubject(String subject) {
            this.subject = subject;
        }

        public EventContextQueryParam subject(String subject) {
            this.subject = subject;
            return this;
        }

        /**
        * Time is a wrapper around time.Time which supports correct marshaling to YAML and JSON.  Wrappers are provided for many of the factory methods that the time package offers.
        * @return time
        **/
        @JsonProperty("time")
        public OffsetDateTime getTime() {
            return time;
        }

        /**
         * Set time
         **/
        public void setTime(OffsetDateTime time) {
            this.time = time;
        }

        public EventContextQueryParam time(OffsetDateTime time) {
            this.time = time;
            return this;
        }

        /**
        * Type - The type of the occurrence which has happened.
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

        public EventContextQueryParam type(String type) {
            this.type = type;
            return this;
        }

        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class EventContextQueryParam {\n");

            sb.append("    datacontenttype: ").append(toIndentedString(datacontenttype)).append("\n");
            sb.append("    id: ").append(toIndentedString(id)).append("\n");
            sb.append("    source: ").append(toIndentedString(source)).append("\n");
            sb.append("    specversion: ").append(toIndentedString(specversion)).append("\n");
            sb.append("    subject: ").append(toIndentedString(subject)).append("\n");
            sb.append("    time: ").append(toIndentedString(time)).append("\n");
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
