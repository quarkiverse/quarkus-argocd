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
/**
  * Labels is list of workflow labels
 **/
public class LabelValues  {

    /**
      * Labels is list of workflow labels
     **/
    private List<String> items;

    /**
    * Get items
    * @return items
    **/
    @JsonProperty("items")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public List<String> getItems() {
        return items;
    }

    /**
     * Set items
     **/
    public void setItems(List<String> items) {
        this.items = items;
    }

    public LabelValues items(List<String> items) {
        this.items = items;
        return this;
    }
    public LabelValues addItemsItem(String itemsItem) {
        if (this.items == null){
            items = new ArrayList<>();
        }
        this.items.add(itemsItem);
        return this;
    }

    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class LabelValues {\n");

        sb.append("    items: ").append(toIndentedString(items)).append("\n");
        
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
      * Labels is list of workflow labels
     **/
    public static class LabelValuesQueryParam  {

        /**
          * Labels is list of workflow labels
         **/
        @jakarta.ws.rs.QueryParam("items")
        private List<String> items = null;

        /**
        * Get items
        * @return items
        **/
        @JsonProperty("items")
        public List<String> getItems() {
            return items;
        }

        /**
         * Set items
         **/
        public void setItems(List<String> items) {
            this.items = items;
        }

        public LabelValuesQueryParam items(List<String> items) {
            this.items = items;
            return this;
        }
        public LabelValuesQueryParam addItemsItem(String itemsItem) {
            this.items.add(itemsItem);
            return this;
        }

        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class LabelValuesQueryParam {\n");

            sb.append("    items: ").append(toIndentedString(items)).append("\n");
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