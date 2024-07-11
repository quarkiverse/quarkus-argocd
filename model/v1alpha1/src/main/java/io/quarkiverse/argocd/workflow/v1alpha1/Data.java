package io.quarkiverse.argocd.workflow.v1alpha1;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.quarkiverse.argocd.v1alpha1.model.DataSource;
import io.quarkiverse.argocd.v1alpha1.model.TransformationStep;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.Type;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
/**
  * Data is a data template
 **/
public class Data  {

    /**
      * Data is a data template
     **/
    private DataSource source;
    /**
      * Data is a data template
     **/
    private List<TransformationStep> transformation = new ArrayList<>();

    /**
    * Get source
    * @return source
    **/
    @JsonProperty("source")
    public DataSource getSource() {
        return source;
    }

    /**
     * Set source
     **/
    public void setSource(DataSource source) {
        this.source = source;
    }

    public Data source(DataSource source) {
        this.source = source;
        return this;
    }

    /**
    * Transformation applies a set of transformations
    * @return transformation
    **/
    @JsonProperty("transformation")
    public List<TransformationStep> getTransformation() {
        return transformation;
    }

    /**
     * Set transformation
     **/
    public void setTransformation(List<TransformationStep> transformation) {
        this.transformation = transformation;
    }

    public Data transformation(List<TransformationStep> transformation) {
        this.transformation = transformation;
        return this;
    }
    public Data addTransformationItem(TransformationStep transformationItem) {
        if (this.transformation == null){
            transformation = new ArrayList<>();
        }
        this.transformation.add(transformationItem);
        return this;
    }

    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Data {\n");

        sb.append("    source: ").append(toIndentedString(source)).append("\n");
        sb.append("    transformation: ").append(toIndentedString(transformation)).append("\n");
        
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
      * Data is a data template
     **/
    public static class DataQueryParam  {

        /**
          * Data is a data template
         **/
        @jakarta.ws.rs.QueryParam("source")
        private DataSource source;
        /**
          * Data is a data template
         **/
        @jakarta.ws.rs.QueryParam("transformation")
        private List<TransformationStep> transformation = null;

        /**
        * Get source
        * @return source
        **/
        @JsonProperty("source")
        public DataSource getSource() {
            return source;
        }

        /**
         * Set source
         **/
        public void setSource(DataSource source) {
            this.source = source;
        }

        public DataQueryParam source(DataSource source) {
            this.source = source;
            return this;
        }

        /**
        * Transformation applies a set of transformations
        * @return transformation
        **/
        @JsonProperty("transformation")
        public List<TransformationStep> getTransformation() {
            return transformation;
        }

        /**
         * Set transformation
         **/
        public void setTransformation(List<TransformationStep> transformation) {
            this.transformation = transformation;
        }

        public DataQueryParam transformation(List<TransformationStep> transformation) {
            this.transformation = transformation;
            return this;
        }
        public DataQueryParam addTransformationItem(TransformationStep transformationItem) {
            this.transformation.add(transformationItem);
            return this;
        }

        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class DataQueryParam {\n");

            sb.append("    source: ").append(toIndentedString(source)).append("\n");
            sb.append("    transformation: ").append(toIndentedString(transformation)).append("\n");
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