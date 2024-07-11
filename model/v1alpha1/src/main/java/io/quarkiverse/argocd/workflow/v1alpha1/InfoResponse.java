package io.quarkiverse.argocd.workflow.v1alpha1;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.Type;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class InfoResponse  {

    private List<Column> columns;
    private List<Link> links;
    private String managedNamespace;
    private Map<String, Boolean> modals;
    private String navColor;

    /**
    * Get columns
    * @return columns
    **/
    @JsonProperty("columns")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public List<Column> getColumns() {
        return columns;
    }

    /**
     * Set columns
     **/
    public void setColumns(List<Column> columns) {
        this.columns = columns;
    }

    public InfoResponse columns(List<Column> columns) {
        this.columns = columns;
        return this;
    }
    public InfoResponse addColumnsItem(Column columnsItem) {
        if (this.columns == null){
            columns = new ArrayList<>();
        }
        this.columns.add(columnsItem);
        return this;
    }

    /**
    * Get links
    * @return links
    **/
    @JsonProperty("links")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public List<Link> getLinks() {
        return links;
    }

    /**
     * Set links
     **/
    public void setLinks(List<Link> links) {
        this.links = links;
    }

    public InfoResponse links(List<Link> links) {
        this.links = links;
        return this;
    }
    public InfoResponse addLinksItem(Link linksItem) {
        if (this.links == null){
            links = new ArrayList<>();
        }
        this.links.add(linksItem);
        return this;
    }

    /**
    * Get managedNamespace
    * @return managedNamespace
    **/
    @JsonProperty("managedNamespace")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public String getManagedNamespace() {
        return managedNamespace;
    }

    /**
     * Set managedNamespace
     **/
    public void setManagedNamespace(String managedNamespace) {
        this.managedNamespace = managedNamespace;
    }

    public InfoResponse managedNamespace(String managedNamespace) {
        this.managedNamespace = managedNamespace;
        return this;
    }

    /**
    * Get modals
    * @return modals
    **/
    @JsonProperty("modals")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public Map<String, Boolean> getModals() {
        return modals;
    }

    /**
     * Set modals
     **/
    public void setModals(Map<String, Boolean> modals) {
        this.modals = modals;
    }

    public InfoResponse modals(Map<String, Boolean> modals) {
        this.modals = modals;
        return this;
    }
    public InfoResponse putModalsItem(String key, Boolean modalsItem) {
           if (this.modals == null){
                modals = new HashMap<>();
            }
        this.modals.put(key, modalsItem);
        return this;
    }

    /**
    * Get navColor
    * @return navColor
    **/
    @JsonProperty("navColor")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public String getNavColor() {
        return navColor;
    }

    /**
     * Set navColor
     **/
    public void setNavColor(String navColor) {
        this.navColor = navColor;
    }

    public InfoResponse navColor(String navColor) {
        this.navColor = navColor;
        return this;
    }

    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class InfoResponse {\n");

        sb.append("    columns: ").append(toIndentedString(columns)).append("\n");
        sb.append("    links: ").append(toIndentedString(links)).append("\n");
        sb.append("    managedNamespace: ").append(toIndentedString(managedNamespace)).append("\n");
        sb.append("    modals: ").append(toIndentedString(modals)).append("\n");
        sb.append("    navColor: ").append(toIndentedString(navColor)).append("\n");
        
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
    public static class InfoResponseQueryParam  {

        @jakarta.ws.rs.QueryParam("columns")
        private List<Column> columns = null;
        @jakarta.ws.rs.QueryParam("links")
        private List<Link> links = null;
        @jakarta.ws.rs.QueryParam("managedNamespace")
        private String managedNamespace;
        @jakarta.ws.rs.QueryParam("modals")
        private Map<String, Boolean> modals = null;
        @jakarta.ws.rs.QueryParam("navColor")
        private String navColor;

        /**
        * Get columns
        * @return columns
        **/
        @JsonProperty("columns")
        public List<Column> getColumns() {
            return columns;
        }

        /**
         * Set columns
         **/
        public void setColumns(List<Column> columns) {
            this.columns = columns;
        }

        public InfoResponseQueryParam columns(List<Column> columns) {
            this.columns = columns;
            return this;
        }
        public InfoResponseQueryParam addColumnsItem(Column columnsItem) {
            this.columns.add(columnsItem);
            return this;
        }

        /**
        * Get links
        * @return links
        **/
        @JsonProperty("links")
        public List<Link> getLinks() {
            return links;
        }

        /**
         * Set links
         **/
        public void setLinks(List<Link> links) {
            this.links = links;
        }

        public InfoResponseQueryParam links(List<Link> links) {
            this.links = links;
            return this;
        }
        public InfoResponseQueryParam addLinksItem(Link linksItem) {
            this.links.add(linksItem);
            return this;
        }

        /**
        * Get managedNamespace
        * @return managedNamespace
        **/
        @JsonProperty("managedNamespace")
        public String getManagedNamespace() {
            return managedNamespace;
        }

        /**
         * Set managedNamespace
         **/
        public void setManagedNamespace(String managedNamespace) {
            this.managedNamespace = managedNamespace;
        }

        public InfoResponseQueryParam managedNamespace(String managedNamespace) {
            this.managedNamespace = managedNamespace;
            return this;
        }

        /**
        * Get modals
        * @return modals
        **/
        @JsonProperty("modals")
        public Map<String, Boolean> getModals() {
            return modals;
        }

        /**
         * Set modals
         **/
        public void setModals(Map<String, Boolean> modals) {
            this.modals = modals;
        }

        public InfoResponseQueryParam modals(Map<String, Boolean> modals) {
            this.modals = modals;
            return this;
        }
        public InfoResponseQueryParam putModalsItem(String key, Boolean modalsItem) {
            this.modals.put(key, modalsItem);
            return this;
        }

        /**
        * Get navColor
        * @return navColor
        **/
        @JsonProperty("navColor")
        public String getNavColor() {
            return navColor;
        }

        /**
         * Set navColor
         **/
        public void setNavColor(String navColor) {
            this.navColor = navColor;
        }

        public InfoResponseQueryParam navColor(String navColor) {
            this.navColor = navColor;
            return this;
        }

        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class InfoResponseQueryParam {\n");

            sb.append("    columns: ").append(toIndentedString(columns)).append("\n");
            sb.append("    links: ").append(toIndentedString(links)).append("\n");
            sb.append("    managedNamespace: ").append(toIndentedString(managedNamespace)).append("\n");
            sb.append("    modals: ").append(toIndentedString(modals)).append("\n");
            sb.append("    navColor: ").append(toIndentedString(navColor)).append("\n");
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
