package io.quarkiverse.argocd.events.v1alpha1;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import io.fabric8.kubernetes.api.model.ListMeta;

@JsonIgnoreProperties(ignoreUnknown = true)
public class SensorList  {

    private List<Sensor> items;
    private ListMeta metadata;

    /**
    * Get items
    * @return items
    **/
    @JsonProperty("items")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public List<Sensor> getItems() {
        return items;
    }

    /**
     * Set items
     **/
    public void setItems(List<Sensor> items) {
        this.items = items;
    }

    public SensorList items(List<Sensor> items) {
        this.items = items;
        return this;
    }
    public SensorList addItemsItem(Sensor itemsItem) {
        if (this.items == null){
            items = new ArrayList<>();
        }
        this.items.add(itemsItem);
        return this;
    }

    /**
    * Get metadata
    * @return metadata
    **/
    @JsonProperty("metadata")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public ListMeta getMetadata() {
        return metadata;
    }

    /**
     * Set metadata
     **/
    public void setMetadata(ListMeta metadata) {
        this.metadata = metadata;
    }

    public SensorList metadata(ListMeta metadata) {
        this.metadata = metadata;
        return this;
    }

    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SensorList {\n");

        sb.append("    items: ").append(toIndentedString(items)).append("\n");
        sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
        
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
    public static class SensorListQueryParam  {

        @jakarta.ws.rs.QueryParam("items")
        private List<Sensor> items = null;
        @jakarta.ws.rs.QueryParam("metadata")
        private ListMeta metadata;

        /**
        * Get items
        * @return items
        **/
        @JsonProperty("items")
        public List<Sensor> getItems() {
            return items;
        }

        /**
         * Set items
         **/
        public void setItems(List<Sensor> items) {
            this.items = items;
        }

        public SensorListQueryParam items(List<Sensor> items) {
            this.items = items;
            return this;
        }
        public SensorListQueryParam addItemsItem(Sensor itemsItem) {
            this.items.add(itemsItem);
            return this;
        }

        /**
        * Get metadata
        * @return metadata
        **/
        @JsonProperty("metadata")
        public ListMeta getMetadata() {
            return metadata;
        }

        /**
         * Set metadata
         **/
        public void setMetadata(ListMeta metadata) {
            this.metadata = metadata;
        }

        public SensorListQueryParam metadata(ListMeta metadata) {
            this.metadata = metadata;
            return this;
        }

        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class SensorListQueryParam {\n");

            sb.append("    items: ").append(toIndentedString(items)).append("\n");
            sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
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
