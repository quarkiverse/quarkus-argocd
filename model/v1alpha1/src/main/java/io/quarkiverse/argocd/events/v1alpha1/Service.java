package io.quarkiverse.argocd.events.v1alpha1;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;

import io.fabric8.kubernetes.api.model.ServicePort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.Type;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Service  {

    private String clusterIP;
    private List<ServicePort> ports;

    /**
    * Get clusterIP
    * @return clusterIP
    **/
    @JsonProperty("clusterIP")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public String getClusterIP() {
        return clusterIP;
    }

    /**
     * Set clusterIP
     **/
    public void setClusterIP(String clusterIP) {
        this.clusterIP = clusterIP;
    }

    public Service clusterIP(String clusterIP) {
        this.clusterIP = clusterIP;
        return this;
    }

    /**
    * Get ports
    * @return ports
    **/
    @JsonProperty("ports")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public List<ServicePort> getPorts() {
        return ports;
    }

    /**
     * Set ports
     **/
    public void setPorts(List<ServicePort> ports) {
        this.ports = ports;
    }

    public Service ports(List<ServicePort> ports) {
        this.ports = ports;
        return this;
    }
    public Service addPortsItem(ServicePort portsItem) {
        if (this.ports == null){
            ports = new ArrayList<>();
        }
        this.ports.add(portsItem);
        return this;
    }

    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Service {\n");

        sb.append("    clusterIP: ").append(toIndentedString(clusterIP)).append("\n");
        sb.append("    ports: ").append(toIndentedString(ports)).append("\n");
        
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
    public static class ServiceQueryParam  {

        @jakarta.ws.rs.QueryParam("clusterIP")
        private String clusterIP;
        @jakarta.ws.rs.QueryParam("ports")
        private List<ServicePort> ports = null;

        /**
        * Get clusterIP
        * @return clusterIP
        **/
        @JsonProperty("clusterIP")
        public String getClusterIP() {
            return clusterIP;
        }

        /**
         * Set clusterIP
         **/
        public void setClusterIP(String clusterIP) {
            this.clusterIP = clusterIP;
        }

        public ServiceQueryParam clusterIP(String clusterIP) {
            this.clusterIP = clusterIP;
            return this;
        }

        /**
        * Get ports
        * @return ports
        **/
        @JsonProperty("ports")
        public List<ServicePort> getPorts() {
            return ports;
        }

        /**
         * Set ports
         **/
        public void setPorts(List<ServicePort> ports) {
            this.ports = ports;
        }

        public ServiceQueryParam ports(List<ServicePort> ports) {
            this.ports = ports;
            return this;
        }
        public ServiceQueryParam addPortsItem(ServicePort portsItem) {
            this.ports.add(portsItem);
            return this;
        }

        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class ServiceQueryParam {\n");

            sb.append("    clusterIP: ").append(toIndentedString(clusterIP)).append("\n");
            sb.append("    ports: ").append(toIndentedString(ports)).append("\n");
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
