package io.quarkiverse.argocd.workflow.v1alpha1;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.Type;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class SemaphoreHolding  {

    private List<String> holders;
    private String semaphore;

    /**
    * Holders stores the list of current holder names in the io.argoproj.workflow.v1alpha1.
    * @return holders
    **/
    @JsonProperty("holders")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public List<String> getHolders() {
        return holders;
    }

    /**
     * Set holders
     **/
    public void setHolders(List<String> holders) {
        this.holders = holders;
    }

    public SemaphoreHolding holders(List<String> holders) {
        this.holders = holders;
        return this;
    }
    public SemaphoreHolding addHoldersItem(String holdersItem) {
        if (this.holders == null){
            holders = new ArrayList<>();
        }
        this.holders.add(holdersItem);
        return this;
    }

    /**
    * Semaphore stores the semaphore name.
    * @return semaphore
    **/
    @JsonProperty("semaphore")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public String getSemaphore() {
        return semaphore;
    }

    /**
     * Set semaphore
     **/
    public void setSemaphore(String semaphore) {
        this.semaphore = semaphore;
    }

    public SemaphoreHolding semaphore(String semaphore) {
        this.semaphore = semaphore;
        return this;
    }

    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SemaphoreHolding {\n");

        sb.append("    holders: ").append(toIndentedString(holders)).append("\n");
        sb.append("    semaphore: ").append(toIndentedString(semaphore)).append("\n");
        
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
    public static class SemaphoreHoldingQueryParam  {

        @jakarta.ws.rs.QueryParam("holders")
        private List<String> holders = null;
        @jakarta.ws.rs.QueryParam("semaphore")
        private String semaphore;

        /**
        * Holders stores the list of current holder names in the io.argoproj.workflow.v1alpha1.
        * @return holders
        **/
        @JsonProperty("holders")
        public List<String> getHolders() {
            return holders;
        }

        /**
         * Set holders
         **/
        public void setHolders(List<String> holders) {
            this.holders = holders;
        }

        public SemaphoreHoldingQueryParam holders(List<String> holders) {
            this.holders = holders;
            return this;
        }
        public SemaphoreHoldingQueryParam addHoldersItem(String holdersItem) {
            this.holders.add(holdersItem);
            return this;
        }

        /**
        * Semaphore stores the semaphore name.
        * @return semaphore
        **/
        @JsonProperty("semaphore")
        public String getSemaphore() {
            return semaphore;
        }

        /**
         * Set semaphore
         **/
        public void setSemaphore(String semaphore) {
            this.semaphore = semaphore;
        }

        public SemaphoreHoldingQueryParam semaphore(String semaphore) {
            this.semaphore = semaphore;
            return this;
        }

        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class SemaphoreHoldingQueryParam {\n");

            sb.append("    holders: ").append(toIndentedString(holders)).append("\n");
            sb.append("    semaphore: ").append(toIndentedString(semaphore)).append("\n");
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