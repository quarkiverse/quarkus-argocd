package io.quarkiverse.argocd.events.v1alpha1;

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
public class OwnedRepositories  {

    private List<String> names;
    private String owner;

    /**
    * Get names
    * @return names
    **/
    @JsonProperty("names")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public List<String> getNames() {
        return names;
    }

    /**
     * Set names
     **/
    public void setNames(List<String> names) {
        this.names = names;
    }

    public OwnedRepositories names(List<String> names) {
        this.names = names;
        return this;
    }
    public OwnedRepositories addNamesItem(String namesItem) {
        if (this.names == null){
            names = new ArrayList<>();
        }
        this.names.add(namesItem);
        return this;
    }

    /**
    * Get owner
    * @return owner
    **/
    @JsonProperty("owner")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public String getOwner() {
        return owner;
    }

    /**
     * Set owner
     **/
    public void setOwner(String owner) {
        this.owner = owner;
    }

    public OwnedRepositories owner(String owner) {
        this.owner = owner;
        return this;
    }

    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OwnedRepositories {\n");

        sb.append("    names: ").append(toIndentedString(names)).append("\n");
        sb.append("    owner: ").append(toIndentedString(owner)).append("\n");
        
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
    public static class OwnedRepositoriesQueryParam  {

        @jakarta.ws.rs.QueryParam("names")
        private List<String> names = null;
        @jakarta.ws.rs.QueryParam("owner")
        private String owner;

        /**
        * Get names
        * @return names
        **/
        @JsonProperty("names")
        public List<String> getNames() {
            return names;
        }

        /**
         * Set names
         **/
        public void setNames(List<String> names) {
            this.names = names;
        }

        public OwnedRepositoriesQueryParam names(List<String> names) {
            this.names = names;
            return this;
        }
        public OwnedRepositoriesQueryParam addNamesItem(String namesItem) {
            this.names.add(namesItem);
            return this;
        }

        /**
        * Get owner
        * @return owner
        **/
        @JsonProperty("owner")
        public String getOwner() {
            return owner;
        }

        /**
         * Set owner
         **/
        public void setOwner(String owner) {
            this.owner = owner;
        }

        public OwnedRepositoriesQueryParam owner(String owner) {
            this.owner = owner;
            return this;
        }

        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class OwnedRepositoriesQueryParam {\n");

            sb.append("    names: ").append(toIndentedString(names)).append("\n");
            sb.append("    owner: ").append(toIndentedString(owner)).append("\n");
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
