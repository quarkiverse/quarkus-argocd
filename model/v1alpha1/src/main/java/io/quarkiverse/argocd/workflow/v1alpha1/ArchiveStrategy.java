package io.quarkiverse.argocd.workflow.v1alpha1;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.quarkiverse.argocd.v1alpha1.model.TarStrategy;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.Type;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
/**
  * ArchiveStrategy describes how to archive files/directory when saving artifacts
 **/
public class ArchiveStrategy  {

    /**
      * ArchiveStrategy describes how to archive files/directory when saving artifacts
     **/
    private Object none;
    /**
      * ArchiveStrategy describes how to archive files/directory when saving artifacts
     **/
    private TarStrategy tar;
    /**
      * ArchiveStrategy describes how to archive files/directory when saving artifacts
     **/
    private Object zip;

    /**
    * NoneStrategy indicates to skip tar process and upload the files or directory tree as independent files. Note that if the artifact is a directory, the artifact driver must support the ability to save/load the directory appropriately.
    * @return none
    **/
    @JsonProperty("none")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public Object getNone() {
        return none;
    }

    /**
     * Set none
     **/
    public void setNone(Object none) {
        this.none = none;
    }

    public ArchiveStrategy none(Object none) {
        this.none = none;
        return this;
    }

    /**
    * Get tar
    * @return tar
    **/
    @JsonProperty("tar")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public TarStrategy getTar() {
        return tar;
    }

    /**
     * Set tar
     **/
    public void setTar(TarStrategy tar) {
        this.tar = tar;
    }

    public ArchiveStrategy tar(TarStrategy tar) {
        this.tar = tar;
        return this;
    }

    /**
    * ZipStrategy will unzip zipped input artifacts
    * @return zip
    **/
    @JsonProperty("zip")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public Object getZip() {
        return zip;
    }

    /**
     * Set zip
     **/
    public void setZip(Object zip) {
        this.zip = zip;
    }

    public ArchiveStrategy zip(Object zip) {
        this.zip = zip;
        return this;
    }

    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ArchiveStrategy {\n");

        sb.append("    none: ").append(toIndentedString(none)).append("\n");
        sb.append("    tar: ").append(toIndentedString(tar)).append("\n");
        sb.append("    zip: ").append(toIndentedString(zip)).append("\n");
        
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
      * ArchiveStrategy describes how to archive files/directory when saving artifacts
     **/
    public static class ArchiveStrategyQueryParam  {

        /**
          * ArchiveStrategy describes how to archive files/directory when saving artifacts
         **/
        @jakarta.ws.rs.QueryParam("none")
        private Object none;
        /**
          * ArchiveStrategy describes how to archive files/directory when saving artifacts
         **/
        @jakarta.ws.rs.QueryParam("tar")
        private TarStrategy tar;
        /**
          * ArchiveStrategy describes how to archive files/directory when saving artifacts
         **/
        @jakarta.ws.rs.QueryParam("zip")
        private Object zip;

        /**
        * NoneStrategy indicates to skip tar process and upload the files or directory tree as independent files. Note that if the artifact is a directory, the artifact driver must support the ability to save/load the directory appropriately.
        * @return none
        **/
        @JsonProperty("none")
        public Object getNone() {
            return none;
        }

        /**
         * Set none
         **/
        public void setNone(Object none) {
            this.none = none;
        }

        public ArchiveStrategyQueryParam none(Object none) {
            this.none = none;
            return this;
        }

        /**
        * Get tar
        * @return tar
        **/
        @JsonProperty("tar")
        public TarStrategy getTar() {
            return tar;
        }

        /**
         * Set tar
         **/
        public void setTar(TarStrategy tar) {
            this.tar = tar;
        }

        public ArchiveStrategyQueryParam tar(TarStrategy tar) {
            this.tar = tar;
            return this;
        }

        /**
        * ZipStrategy will unzip zipped input artifacts
        * @return zip
        **/
        @JsonProperty("zip")
        public Object getZip() {
            return zip;
        }

        /**
         * Set zip
         **/
        public void setZip(Object zip) {
            this.zip = zip;
        }

        public ArchiveStrategyQueryParam zip(Object zip) {
            this.zip = zip;
            return this;
        }

        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class ArchiveStrategyQueryParam {\n");

            sb.append("    none: ").append(toIndentedString(none)).append("\n");
            sb.append("    tar: ").append(toIndentedString(tar)).append("\n");
            sb.append("    zip: ").append(toIndentedString(zip)).append("\n");
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
