package io.quarkiverse.argocd.workflow.v1alpha1;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.Type;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
/**
  * ArtGCStatus maintains state related to ArtifactGC
 **/
public class ArtGCStatus  {

    /**
      * ArtGCStatus maintains state related to ArtifactGC
     **/
    private Boolean notSpecified;
    /**
      * ArtGCStatus maintains state related to ArtifactGC
     **/
    private Map<String, Boolean> podsRecouped;
    /**
      * ArtGCStatus maintains state related to ArtifactGC
     **/
    private Map<String, Boolean> strategiesProcessed;

    /**
    * if this is true, we already checked to see if we need to do it and we don't
    * @return notSpecified
    **/
    @JsonProperty("notSpecified")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public Boolean getNotSpecified() {
        return notSpecified;
    }

    /**
     * Set notSpecified
     **/
    public void setNotSpecified(Boolean notSpecified) {
        this.notSpecified = notSpecified;
    }

    public ArtGCStatus notSpecified(Boolean notSpecified) {
        this.notSpecified = notSpecified;
        return this;
    }

    /**
    * have completed Pods been processed? (mapped by Pod name) used to prevent re-processing the Status of a Pod more than once
    * @return podsRecouped
    **/
    @JsonProperty("podsRecouped")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public Map<String, Boolean> getPodsRecouped() {
        return podsRecouped;
    }

    /**
     * Set podsRecouped
     **/
    public void setPodsRecouped(Map<String, Boolean> podsRecouped) {
        this.podsRecouped = podsRecouped;
    }

    public ArtGCStatus podsRecouped(Map<String, Boolean> podsRecouped) {
        this.podsRecouped = podsRecouped;
        return this;
    }
    public ArtGCStatus putPodsRecoupedItem(String key, Boolean podsRecoupedItem) {
           if (this.podsRecouped == null){
                podsRecouped = new HashMap<>();
            }
        this.podsRecouped.put(key, podsRecoupedItem);
        return this;
    }

    /**
    * have Pods been started to perform this strategy? (enables us not to re-process what we've already done)
    * @return strategiesProcessed
    **/
    @JsonProperty("strategiesProcessed")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public Map<String, Boolean> getStrategiesProcessed() {
        return strategiesProcessed;
    }

    /**
     * Set strategiesProcessed
     **/
    public void setStrategiesProcessed(Map<String, Boolean> strategiesProcessed) {
        this.strategiesProcessed = strategiesProcessed;
    }

    public ArtGCStatus strategiesProcessed(Map<String, Boolean> strategiesProcessed) {
        this.strategiesProcessed = strategiesProcessed;
        return this;
    }
    public ArtGCStatus putStrategiesProcessedItem(String key, Boolean strategiesProcessedItem) {
           if (this.strategiesProcessed == null){
                strategiesProcessed = new HashMap<>();
            }
        this.strategiesProcessed.put(key, strategiesProcessedItem);
        return this;
    }

    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ArtGCStatus {\n");

        sb.append("    notSpecified: ").append(toIndentedString(notSpecified)).append("\n");
        sb.append("    podsRecouped: ").append(toIndentedString(podsRecouped)).append("\n");
        sb.append("    strategiesProcessed: ").append(toIndentedString(strategiesProcessed)).append("\n");
        
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
      * ArtGCStatus maintains state related to ArtifactGC
     **/
    public static class ArtGCStatusQueryParam  {

        /**
          * ArtGCStatus maintains state related to ArtifactGC
         **/
        @jakarta.ws.rs.QueryParam("notSpecified")
        private Boolean notSpecified;
        /**
          * ArtGCStatus maintains state related to ArtifactGC
         **/
        @jakarta.ws.rs.QueryParam("podsRecouped")
        private Map<String, Boolean> podsRecouped = null;
        /**
          * ArtGCStatus maintains state related to ArtifactGC
         **/
        @jakarta.ws.rs.QueryParam("strategiesProcessed")
        private Map<String, Boolean> strategiesProcessed = null;

        /**
        * if this is true, we already checked to see if we need to do it and we don't
        * @return notSpecified
        **/
        @JsonProperty("notSpecified")
        public Boolean getNotSpecified() {
            return notSpecified;
        }

        /**
         * Set notSpecified
         **/
        public void setNotSpecified(Boolean notSpecified) {
            this.notSpecified = notSpecified;
        }

        public ArtGCStatusQueryParam notSpecified(Boolean notSpecified) {
            this.notSpecified = notSpecified;
            return this;
        }

        /**
        * have completed Pods been processed? (mapped by Pod name) used to prevent re-processing the Status of a Pod more than once
        * @return podsRecouped
        **/
        @JsonProperty("podsRecouped")
        public Map<String, Boolean> getPodsRecouped() {
            return podsRecouped;
        }

        /**
         * Set podsRecouped
         **/
        public void setPodsRecouped(Map<String, Boolean> podsRecouped) {
            this.podsRecouped = podsRecouped;
        }

        public ArtGCStatusQueryParam podsRecouped(Map<String, Boolean> podsRecouped) {
            this.podsRecouped = podsRecouped;
            return this;
        }
        public ArtGCStatusQueryParam putPodsRecoupedItem(String key, Boolean podsRecoupedItem) {
            this.podsRecouped.put(key, podsRecoupedItem);
            return this;
        }

        /**
        * have Pods been started to perform this strategy? (enables us not to re-process what we've already done)
        * @return strategiesProcessed
        **/
        @JsonProperty("strategiesProcessed")
        public Map<String, Boolean> getStrategiesProcessed() {
            return strategiesProcessed;
        }

        /**
         * Set strategiesProcessed
         **/
        public void setStrategiesProcessed(Map<String, Boolean> strategiesProcessed) {
            this.strategiesProcessed = strategiesProcessed;
        }

        public ArtGCStatusQueryParam strategiesProcessed(Map<String, Boolean> strategiesProcessed) {
            this.strategiesProcessed = strategiesProcessed;
            return this;
        }
        public ArtGCStatusQueryParam putStrategiesProcessedItem(String key, Boolean strategiesProcessedItem) {
            this.strategiesProcessed.put(key, strategiesProcessedItem);
            return this;
        }

        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class ArtGCStatusQueryParam {\n");

            sb.append("    notSpecified: ").append(toIndentedString(notSpecified)).append("\n");
            sb.append("    podsRecouped: ").append(toIndentedString(podsRecouped)).append("\n");
            sb.append("    strategiesProcessed: ").append(toIndentedString(strategiesProcessed)).append("\n");
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
