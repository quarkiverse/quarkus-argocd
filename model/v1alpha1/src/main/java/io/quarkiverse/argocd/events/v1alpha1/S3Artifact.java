package io.quarkiverse.argocd.events.v1alpha1;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.fabric8.kubernetes.api.model.SecretKeySelector;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.Type;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class S3Artifact  {

    private SecretKeySelector accessKey;
    private S3Bucket bucket;
    private SecretKeySelector caCertificate;
    private String endpoint;
    private List<String> events;
    private S3Filter filter;
    private Boolean insecure;
    private Map<String, String> metadata;
    private String region;
    private SecretKeySelector secretKey;

    /**
    * Get accessKey
    * @return accessKey
    **/
    @JsonProperty("accessKey")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public SecretKeySelector getAccessKey() {
        return accessKey;
    }

    /**
     * Set accessKey
     **/
    public void setAccessKey(SecretKeySelector accessKey) {
        this.accessKey = accessKey;
    }

    public S3Artifact accessKey(SecretKeySelector accessKey) {
        this.accessKey = accessKey;
        return this;
    }

    /**
    * Get bucket
    * @return bucket
    **/
    @JsonProperty("bucket")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public S3Bucket getBucket() {
        return bucket;
    }

    /**
     * Set bucket
     **/
    public void setBucket(S3Bucket bucket) {
        this.bucket = bucket;
    }

    public S3Artifact bucket(S3Bucket bucket) {
        this.bucket = bucket;
        return this;
    }

    /**
    * Get caCertificate
    * @return caCertificate
    **/
    @JsonProperty("caCertificate")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public SecretKeySelector getCaCertificate() {
        return caCertificate;
    }

    /**
     * Set caCertificate
     **/
    public void setCaCertificate(SecretKeySelector caCertificate) {
        this.caCertificate = caCertificate;
    }

    public S3Artifact caCertificate(SecretKeySelector caCertificate) {
        this.caCertificate = caCertificate;
        return this;
    }

    /**
    * Get endpoint
    * @return endpoint
    **/
    @JsonProperty("endpoint")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public String getEndpoint() {
        return endpoint;
    }

    /**
     * Set endpoint
     **/
    public void setEndpoint(String endpoint) {
        this.endpoint = endpoint;
    }

    public S3Artifact endpoint(String endpoint) {
        this.endpoint = endpoint;
        return this;
    }

    /**
    * Get events
    * @return events
    **/
    @JsonProperty("events")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public List<String> getEvents() {
        return events;
    }

    /**
     * Set events
     **/
    public void setEvents(List<String> events) {
        this.events = events;
    }

    public S3Artifact events(List<String> events) {
        this.events = events;
        return this;
    }
    public S3Artifact addEventsItem(String eventsItem) {
        if (this.events == null){
            events = new ArrayList<>();
        }
        this.events.add(eventsItem);
        return this;
    }

    /**
    * Get filter
    * @return filter
    **/
    @JsonProperty("filter")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public S3Filter getFilter() {
        return filter;
    }

    /**
     * Set filter
     **/
    public void setFilter(S3Filter filter) {
        this.filter = filter;
    }

    public S3Artifact filter(S3Filter filter) {
        this.filter = filter;
        return this;
    }

    /**
    * Get insecure
    * @return insecure
    **/
    @JsonProperty("insecure")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public Boolean getInsecure() {
        return insecure;
    }

    /**
     * Set insecure
     **/
    public void setInsecure(Boolean insecure) {
        this.insecure = insecure;
    }

    public S3Artifact insecure(Boolean insecure) {
        this.insecure = insecure;
        return this;
    }

    /**
    * Get metadata
    * @return metadata
    **/
    @JsonProperty("metadata")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public Map<String, String> getMetadata() {
        return metadata;
    }

    /**
     * Set metadata
     **/
    public void setMetadata(Map<String, String> metadata) {
        this.metadata = metadata;
    }

    public S3Artifact metadata(Map<String, String> metadata) {
        this.metadata = metadata;
        return this;
    }
    public S3Artifact putMetadataItem(String key, String metadataItem) {
           if (this.metadata == null){
                metadata = new HashMap<>();
            }
        this.metadata.put(key, metadataItem);
        return this;
    }

    /**
    * Get region
    * @return region
    **/
    @JsonProperty("region")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public String getRegion() {
        return region;
    }

    /**
     * Set region
     **/
    public void setRegion(String region) {
        this.region = region;
    }

    public S3Artifact region(String region) {
        this.region = region;
        return this;
    }

    /**
    * Get secretKey
    * @return secretKey
    **/
    @JsonProperty("secretKey")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public SecretKeySelector getSecretKey() {
        return secretKey;
    }

    /**
     * Set secretKey
     **/
    public void setSecretKey(SecretKeySelector secretKey) {
        this.secretKey = secretKey;
    }

    public S3Artifact secretKey(SecretKeySelector secretKey) {
        this.secretKey = secretKey;
        return this;
    }

    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class S3Artifact {\n");

        sb.append("    accessKey: ").append(toIndentedString(accessKey)).append("\n");
        sb.append("    bucket: ").append(toIndentedString(bucket)).append("\n");
        sb.append("    caCertificate: ").append(toIndentedString(caCertificate)).append("\n");
        sb.append("    endpoint: ").append(toIndentedString(endpoint)).append("\n");
        sb.append("    events: ").append(toIndentedString(events)).append("\n");
        sb.append("    filter: ").append(toIndentedString(filter)).append("\n");
        sb.append("    insecure: ").append(toIndentedString(insecure)).append("\n");
        sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
        sb.append("    region: ").append(toIndentedString(region)).append("\n");
        sb.append("    secretKey: ").append(toIndentedString(secretKey)).append("\n");
        
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
    public static class S3ArtifactQueryParam  {

        @jakarta.ws.rs.QueryParam("accessKey")
        private SecretKeySelector accessKey;
        @jakarta.ws.rs.QueryParam("bucket")
        private S3Bucket bucket;
        @jakarta.ws.rs.QueryParam("caCertificate")
        private SecretKeySelector caCertificate;
        @jakarta.ws.rs.QueryParam("endpoint")
        private String endpoint;
        @jakarta.ws.rs.QueryParam("events")
        private List<String> events = null;
        @jakarta.ws.rs.QueryParam("filter")
        private S3Filter filter;
        @jakarta.ws.rs.QueryParam("insecure")
        private Boolean insecure;
        @jakarta.ws.rs.QueryParam("metadata")
        private Map<String, String> metadata = null;
        @jakarta.ws.rs.QueryParam("region")
        private String region;
        @jakarta.ws.rs.QueryParam("secretKey")
        private SecretKeySelector secretKey;

        /**
        * Get accessKey
        * @return accessKey
        **/
        @JsonProperty("accessKey")
        public SecretKeySelector getAccessKey() {
            return accessKey;
        }

        /**
         * Set accessKey
         **/
        public void setAccessKey(SecretKeySelector accessKey) {
            this.accessKey = accessKey;
        }

        public S3ArtifactQueryParam accessKey(SecretKeySelector accessKey) {
            this.accessKey = accessKey;
            return this;
        }

        /**
        * Get bucket
        * @return bucket
        **/
        @JsonProperty("bucket")
        public S3Bucket getBucket() {
            return bucket;
        }

        /**
         * Set bucket
         **/
        public void setBucket(S3Bucket bucket) {
            this.bucket = bucket;
        }

        public S3ArtifactQueryParam bucket(S3Bucket bucket) {
            this.bucket = bucket;
            return this;
        }

        /**
        * Get caCertificate
        * @return caCertificate
        **/
        @JsonProperty("caCertificate")
        public SecretKeySelector getCaCertificate() {
            return caCertificate;
        }

        /**
         * Set caCertificate
         **/
        public void setCaCertificate(SecretKeySelector caCertificate) {
            this.caCertificate = caCertificate;
        }

        public S3ArtifactQueryParam caCertificate(SecretKeySelector caCertificate) {
            this.caCertificate = caCertificate;
            return this;
        }

        /**
        * Get endpoint
        * @return endpoint
        **/
        @JsonProperty("endpoint")
        public String getEndpoint() {
            return endpoint;
        }

        /**
         * Set endpoint
         **/
        public void setEndpoint(String endpoint) {
            this.endpoint = endpoint;
        }

        public S3ArtifactQueryParam endpoint(String endpoint) {
            this.endpoint = endpoint;
            return this;
        }

        /**
        * Get events
        * @return events
        **/
        @JsonProperty("events")
        public List<String> getEvents() {
            return events;
        }

        /**
         * Set events
         **/
        public void setEvents(List<String> events) {
            this.events = events;
        }

        public S3ArtifactQueryParam events(List<String> events) {
            this.events = events;
            return this;
        }
        public S3ArtifactQueryParam addEventsItem(String eventsItem) {
            this.events.add(eventsItem);
            return this;
        }

        /**
        * Get filter
        * @return filter
        **/
        @JsonProperty("filter")
        public S3Filter getFilter() {
            return filter;
        }

        /**
         * Set filter
         **/
        public void setFilter(S3Filter filter) {
            this.filter = filter;
        }

        public S3ArtifactQueryParam filter(S3Filter filter) {
            this.filter = filter;
            return this;
        }

        /**
        * Get insecure
        * @return insecure
        **/
        @JsonProperty("insecure")
        public Boolean getInsecure() {
            return insecure;
        }

        /**
         * Set insecure
         **/
        public void setInsecure(Boolean insecure) {
            this.insecure = insecure;
        }

        public S3ArtifactQueryParam insecure(Boolean insecure) {
            this.insecure = insecure;
            return this;
        }

        /**
        * Get metadata
        * @return metadata
        **/
        @JsonProperty("metadata")
        public Map<String, String> getMetadata() {
            return metadata;
        }

        /**
         * Set metadata
         **/
        public void setMetadata(Map<String, String> metadata) {
            this.metadata = metadata;
        }

        public S3ArtifactQueryParam metadata(Map<String, String> metadata) {
            this.metadata = metadata;
            return this;
        }
        public S3ArtifactQueryParam putMetadataItem(String key, String metadataItem) {
            this.metadata.put(key, metadataItem);
            return this;
        }

        /**
        * Get region
        * @return region
        **/
        @JsonProperty("region")
        public String getRegion() {
            return region;
        }

        /**
         * Set region
         **/
        public void setRegion(String region) {
            this.region = region;
        }

        public S3ArtifactQueryParam region(String region) {
            this.region = region;
            return this;
        }

        /**
        * Get secretKey
        * @return secretKey
        **/
        @JsonProperty("secretKey")
        public SecretKeySelector getSecretKey() {
            return secretKey;
        }

        /**
         * Set secretKey
         **/
        public void setSecretKey(SecretKeySelector secretKey) {
            this.secretKey = secretKey;
        }

        public S3ArtifactQueryParam secretKey(SecretKeySelector secretKey) {
            this.secretKey = secretKey;
            return this;
        }

        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class S3ArtifactQueryParam {\n");

            sb.append("    accessKey: ").append(toIndentedString(accessKey)).append("\n");
            sb.append("    bucket: ").append(toIndentedString(bucket)).append("\n");
            sb.append("    caCertificate: ").append(toIndentedString(caCertificate)).append("\n");
            sb.append("    endpoint: ").append(toIndentedString(endpoint)).append("\n");
            sb.append("    events: ").append(toIndentedString(events)).append("\n");
            sb.append("    filter: ").append(toIndentedString(filter)).append("\n");
            sb.append("    insecure: ").append(toIndentedString(insecure)).append("\n");
            sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
            sb.append("    region: ").append(toIndentedString(region)).append("\n");
            sb.append("    secretKey: ").append(toIndentedString(secretKey)).append("\n");
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
