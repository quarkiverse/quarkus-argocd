package io.quarkiverse.argocd.workflow.v1alpha1;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;

import io.fabric8.kubernetes.api.model.ContainerPort;
import io.fabric8.kubernetes.api.model.EnvFromSource;
import io.fabric8.kubernetes.api.model.EnvVar;
import io.fabric8.kubernetes.api.model.Lifecycle;
import io.fabric8.kubernetes.api.model.Probe;
import io.fabric8.kubernetes.api.model.ResourceRequirements;
import io.fabric8.kubernetes.api.model.SecurityContext;
import io.fabric8.kubernetes.api.model.VolumeDevice;
import io.fabric8.kubernetes.api.model.VolumeMount;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.Type;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
/**
  * UserContainer is a container specified by a user.
 **/
public class UserContainer  {

    /**
      * UserContainer is a container specified by a user.
     **/
    private List<String> args;
    /**
      * UserContainer is a container specified by a user.
     **/
    private List<String> command;
    /**
      * UserContainer is a container specified by a user.
     **/
    private List<EnvVar> env;
    /**
      * UserContainer is a container specified by a user.
     **/
    private List<EnvFromSource> envFrom;
    /**
      * UserContainer is a container specified by a user.
     **/
    private String image;
    /**
      * UserContainer is a container specified by a user.
     **/
    private String imagePullPolicy;
    /**
      * UserContainer is a container specified by a user.
     **/
    private Lifecycle lifecycle;
    /**
      * UserContainer is a container specified by a user.
     **/
    private Probe livenessProbe;
    /**
      * UserContainer is a container specified by a user.
     **/
    private Boolean mirrorVolumeMounts;
    /**
      * UserContainer is a container specified by a user.
     **/
    private String name;
    /**
      * UserContainer is a container specified by a user.
     **/
    private List<ContainerPort> ports;
    /**
      * UserContainer is a container specified by a user.
     **/
    private Probe readinessProbe;
    /**
      * UserContainer is a container specified by a user.
     **/
    private ResourceRequirements resources;
    /**
      * UserContainer is a container specified by a user.
     **/
    private SecurityContext securityContext;
    /**
      * UserContainer is a container specified by a user.
     **/
    private Probe startupProbe;
    /**
      * UserContainer is a container specified by a user.
     **/
    private Boolean stdin;
    /**
      * UserContainer is a container specified by a user.
     **/
    private Boolean stdinOnce;
    /**
      * UserContainer is a container specified by a user.
     **/
    private String terminationMessagePath;
    /**
      * UserContainer is a container specified by a user.
     **/
    private String terminationMessagePolicy;
    /**
      * UserContainer is a container specified by a user.
     **/
    private Boolean tty;
    /**
      * UserContainer is a container specified by a user.
     **/
    private List<VolumeDevice> volumeDevices;
    /**
      * UserContainer is a container specified by a user.
     **/
    private List<VolumeMount> volumeMounts;
    /**
      * UserContainer is a container specified by a user.
     **/
    private String workingDir;

    /**
    * Arguments to the entrypoint. The container image's CMD is used if this is not provided. Variable references $(VAR_NAME) are expanded using the container's environment. If a variable cannot be resolved, the reference in the input string will be unchanged. Double $$ are reduced to a single $, which allows for escaping the $(VAR_NAME) syntax: i.e. \"$$(VAR_NAME)\" will produce the string literal \"$(VAR_NAME)\". Escaped references will never be expanded, regardless of whether the variable exists or not. Cannot be updated. More info: https://kubernetes.io/docs/tasks/inject-data-application/define-command-argument-container/#running-a-command-in-a-shell
    * @return args
    **/
    @JsonProperty("args")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public List<String> getArgs() {
        return args;
    }

    /**
     * Set args
     **/
    public void setArgs(List<String> args) {
        this.args = args;
    }

    public UserContainer args(List<String> args) {
        this.args = args;
        return this;
    }
    public UserContainer addArgsItem(String argsItem) {
        if (this.args == null){
            args = new ArrayList<>();
        }
        this.args.add(argsItem);
        return this;
    }

    /**
    * Entrypoint array. Not executed within a shell. The container image's ENTRYPOINT is used if this is not provided. Variable references $(VAR_NAME) are expanded using the container's environment. If a variable cannot be resolved, the reference in the input string will be unchanged. Double $$ are reduced to a single $, which allows for escaping the $(VAR_NAME) syntax: i.e. \"$$(VAR_NAME)\" will produce the string literal \"$(VAR_NAME)\". Escaped references will never be expanded, regardless of whether the variable exists or not. Cannot be updated. More info: https://kubernetes.io/docs/tasks/inject-data-application/define-command-argument-container/#running-a-command-in-a-shell
    * @return command
    **/
    @JsonProperty("command")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public List<String> getCommand() {
        return command;
    }

    /**
     * Set command
     **/
    public void setCommand(List<String> command) {
        this.command = command;
    }

    public UserContainer command(List<String> command) {
        this.command = command;
        return this;
    }
    public UserContainer addCommandItem(String commandItem) {
        if (this.command == null){
            command = new ArrayList<>();
        }
        this.command.add(commandItem);
        return this;
    }

    /**
    * List of environment variables to set in the container. Cannot be updated.
    * @return env
    **/
    @JsonProperty("env")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public List<EnvVar> getEnv() {
        return env;
    }

    /**
     * Set env
     **/
    public void setEnv(List<EnvVar> env) {
        this.env = env;
    }

    public UserContainer env(List<EnvVar> env) {
        this.env = env;
        return this;
    }
    public UserContainer addEnvItem(EnvVar envItem) {
        if (this.env == null){
            env = new ArrayList<>();
        }
        this.env.add(envItem);
        return this;
    }

    /**
    * List of sources to populate environment variables in the container. The keys defined within a source must be a C_IDENTIFIER. All invalid keys will be reported as an event when the container is starting. When a key exists in multiple sources, the value associated with the last source will take precedence. Values defined by an Env with a duplicate key will take precedence. Cannot be updated.
    * @return envFrom
    **/
    @JsonProperty("envFrom")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public List<EnvFromSource> getEnvFrom() {
        return envFrom;
    }

    /**
     * Set envFrom
     **/
    public void setEnvFrom(List<EnvFromSource> envFrom) {
        this.envFrom = envFrom;
    }

    public UserContainer envFrom(List<EnvFromSource> envFrom) {
        this.envFrom = envFrom;
        return this;
    }
    public UserContainer addEnvFromItem(EnvFromSource envFromItem) {
        if (this.envFrom == null){
            envFrom = new ArrayList<>();
        }
        this.envFrom.add(envFromItem);
        return this;
    }

    /**
    * Container image name. More info: https://kubernetes.io/docs/concepts/containers/images This field is optional to allow higher level config management to default or override container images in workload controllers like Deployments and StatefulSets.
    * @return image
    **/
    @JsonProperty("image")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public String getImage() {
        return image;
    }

    /**
     * Set image
     **/
    public void setImage(String image) {
        this.image = image;
    }

    public UserContainer image(String image) {
        this.image = image;
        return this;
    }

    /**
    * Image pull policy. One of Always, Never, IfNotPresent. Defaults to Always if :latest tag is specified, or IfNotPresent otherwise. Cannot be updated. More info: https://kubernetes.io/docs/concepts/containers/images#updating-images
    * @return imagePullPolicy
    **/
    @JsonProperty("imagePullPolicy")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public String getImagePullPolicy() {
        return imagePullPolicy;
    }

    /**
     * Set imagePullPolicy
     **/
    public void setImagePullPolicy(String imagePullPolicy) {
        this.imagePullPolicy = imagePullPolicy;
    }

    public UserContainer imagePullPolicy(String imagePullPolicy) {
        this.imagePullPolicy = imagePullPolicy;
        return this;
    }

    /**
    * Get lifecycle
    * @return lifecycle
    **/
    @JsonProperty("lifecycle")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public Lifecycle getLifecycle() {
        return lifecycle;
    }

    /**
     * Set lifecycle
     **/
    public void setLifecycle(Lifecycle lifecycle) {
        this.lifecycle = lifecycle;
    }

    public UserContainer lifecycle(Lifecycle lifecycle) {
        this.lifecycle = lifecycle;
        return this;
    }

    /**
    * Get livenessProbe
    * @return livenessProbe
    **/
    @JsonProperty("livenessProbe")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public Probe getLivenessProbe() {
        return livenessProbe;
    }

    /**
     * Set livenessProbe
     **/
    public void setLivenessProbe(Probe livenessProbe) {
        this.livenessProbe = livenessProbe;
    }

    public UserContainer livenessProbe(Probe livenessProbe) {
        this.livenessProbe = livenessProbe;
        return this;
    }

    /**
    * MirrorVolumeMounts will mount the same volumes specified in the main container to the container (including artifacts), at the same mountPaths. This enables dind daemon to partially see the same filesystem as the main container in order to use features such as docker volume binding
    * @return mirrorVolumeMounts
    **/
    @JsonProperty("mirrorVolumeMounts")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public Boolean getMirrorVolumeMounts() {
        return mirrorVolumeMounts;
    }

    /**
     * Set mirrorVolumeMounts
     **/
    public void setMirrorVolumeMounts(Boolean mirrorVolumeMounts) {
        this.mirrorVolumeMounts = mirrorVolumeMounts;
    }

    public UserContainer mirrorVolumeMounts(Boolean mirrorVolumeMounts) {
        this.mirrorVolumeMounts = mirrorVolumeMounts;
        return this;
    }

    /**
    * Name of the container specified as a DNS_LABEL. Each container in a pod must have a unique name (DNS_LABEL). Cannot be updated.
    * @return name
    **/
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    /**
     * Set name
     **/
    public void setName(String name) {
        this.name = name;
    }

    public UserContainer name(String name) {
        this.name = name;
        return this;
    }

    /**
    * List of ports to expose from the container. Not specifying a port here DOES NOT prevent that port from being exposed. Any port which is listening on the default \"0.0.0.0\" address inside a container will be accessible from the network. Modifying this array with strategic merge patch may corrupt the data. For more information See https://github.com/kubernetes/kubernetes/issues/108255. Cannot be updated.
    * @return ports
    **/
    @JsonProperty("ports")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public List<ContainerPort> getPorts() {
        return ports;
    }

    /**
     * Set ports
     **/
    public void setPorts(List<ContainerPort> ports) {
        this.ports = ports;
    }

    public UserContainer ports(List<ContainerPort> ports) {
        this.ports = ports;
        return this;
    }
    public UserContainer addPortsItem(ContainerPort portsItem) {
        if (this.ports == null){
            ports = new ArrayList<>();
        }
        this.ports.add(portsItem);
        return this;
    }

    /**
    * Get readinessProbe
    * @return readinessProbe
    **/
    @JsonProperty("readinessProbe")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public Probe getReadinessProbe() {
        return readinessProbe;
    }

    /**
     * Set readinessProbe
     **/
    public void setReadinessProbe(Probe readinessProbe) {
        this.readinessProbe = readinessProbe;
    }

    public UserContainer readinessProbe(Probe readinessProbe) {
        this.readinessProbe = readinessProbe;
        return this;
    }

    /**
    * Get resources
    * @return resources
    **/
    @JsonProperty("resources")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public ResourceRequirements getResources() {
        return resources;
    }

    /**
     * Set resources
     **/
    public void setResources(ResourceRequirements resources) {
        this.resources = resources;
    }

    public UserContainer resources(ResourceRequirements resources) {
        this.resources = resources;
        return this;
    }

    /**
    * Get securityContext
    * @return securityContext
    **/
    @JsonProperty("securityContext")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public SecurityContext getSecurityContext() {
        return securityContext;
    }

    /**
     * Set securityContext
     **/
    public void setSecurityContext(SecurityContext securityContext) {
        this.securityContext = securityContext;
    }

    public UserContainer securityContext(SecurityContext securityContext) {
        this.securityContext = securityContext;
        return this;
    }

    /**
    * Get startupProbe
    * @return startupProbe
    **/
    @JsonProperty("startupProbe")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public Probe getStartupProbe() {
        return startupProbe;
    }

    /**
     * Set startupProbe
     **/
    public void setStartupProbe(Probe startupProbe) {
        this.startupProbe = startupProbe;
    }

    public UserContainer startupProbe(Probe startupProbe) {
        this.startupProbe = startupProbe;
        return this;
    }

    /**
    * Whether this container should allocate a buffer for stdin in the container runtime. If this is not set, reads from stdin in the container will always result in EOF. Default is false.
    * @return stdin
    **/
    @JsonProperty("stdin")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public Boolean getStdin() {
        return stdin;
    }

    /**
     * Set stdin
     **/
    public void setStdin(Boolean stdin) {
        this.stdin = stdin;
    }

    public UserContainer stdin(Boolean stdin) {
        this.stdin = stdin;
        return this;
    }

    /**
    * Whether the container runtime should close the stdin channel after it has been opened by a single attach. When stdin is true the stdin stream will remain open across multiple attach sessions. If stdinOnce is set to true, stdin is opened on container start, is empty until the first client attaches to stdin, and then remains open and accepts data until the client disconnects, at which time stdin is closed and remains closed until the container is restarted. If this flag is false, a container processes that reads from stdin will never receive an EOF. Default is false
    * @return stdinOnce
    **/
    @JsonProperty("stdinOnce")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public Boolean getStdinOnce() {
        return stdinOnce;
    }

    /**
     * Set stdinOnce
     **/
    public void setStdinOnce(Boolean stdinOnce) {
        this.stdinOnce = stdinOnce;
    }

    public UserContainer stdinOnce(Boolean stdinOnce) {
        this.stdinOnce = stdinOnce;
        return this;
    }

    /**
    * Optional: Path at which the file to which the container's termination message will be written is mounted into the container's filesystem. Message written is intended to be brief final status, such as an assertion failure message. Will be truncated by the node if greater than 4096 bytes. The total message length across all containers will be limited to 12kb. Defaults to /dev/termination-log. Cannot be updated.
    * @return terminationMessagePath
    **/
    @JsonProperty("terminationMessagePath")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public String getTerminationMessagePath() {
        return terminationMessagePath;
    }

    /**
     * Set terminationMessagePath
     **/
    public void setTerminationMessagePath(String terminationMessagePath) {
        this.terminationMessagePath = terminationMessagePath;
    }

    public UserContainer terminationMessagePath(String terminationMessagePath) {
        this.terminationMessagePath = terminationMessagePath;
        return this;
    }

    /**
    * Indicate how the termination message should be populated. File will use the contents of terminationMessagePath to populate the container status message on both success and failure. FallbackToLogsOnError will use the last chunk of container log output if the termination message file is empty and the container exited with an error. The log output is limited to 2048 bytes or 80 lines, whichever is smaller. Defaults to File. Cannot be updated.
    * @return terminationMessagePolicy
    **/
    @JsonProperty("terminationMessagePolicy")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public String getTerminationMessagePolicy() {
        return terminationMessagePolicy;
    }

    /**
     * Set terminationMessagePolicy
     **/
    public void setTerminationMessagePolicy(String terminationMessagePolicy) {
        this.terminationMessagePolicy = terminationMessagePolicy;
    }

    public UserContainer terminationMessagePolicy(String terminationMessagePolicy) {
        this.terminationMessagePolicy = terminationMessagePolicy;
        return this;
    }

    /**
    * Whether this container should allocate a TTY for itself, also requires 'stdin' to be true. Default is false.
    * @return tty
    **/
    @JsonProperty("tty")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public Boolean getTty() {
        return tty;
    }

    /**
     * Set tty
     **/
    public void setTty(Boolean tty) {
        this.tty = tty;
    }

    public UserContainer tty(Boolean tty) {
        this.tty = tty;
        return this;
    }

    /**
    * volumeDevices is the list of block devices to be used by the container.
    * @return volumeDevices
    **/
    @JsonProperty("volumeDevices")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public List<VolumeDevice> getVolumeDevices() {
        return volumeDevices;
    }

    /**
     * Set volumeDevices
     **/
    public void setVolumeDevices(List<VolumeDevice> volumeDevices) {
        this.volumeDevices = volumeDevices;
    }

    public UserContainer volumeDevices(List<VolumeDevice> volumeDevices) {
        this.volumeDevices = volumeDevices;
        return this;
    }
    public UserContainer addVolumeDevicesItem(VolumeDevice volumeDevicesItem) {
        if (this.volumeDevices == null){
            volumeDevices = new ArrayList<>();
        }
        this.volumeDevices.add(volumeDevicesItem);
        return this;
    }

    /**
    * Pod volumes to mount into the container's filesystem. Cannot be updated.
    * @return volumeMounts
    **/
    @JsonProperty("volumeMounts")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public List<VolumeMount> getVolumeMounts() {
        return volumeMounts;
    }

    /**
     * Set volumeMounts
     **/
    public void setVolumeMounts(List<VolumeMount> volumeMounts) {
        this.volumeMounts = volumeMounts;
    }

    public UserContainer volumeMounts(List<VolumeMount> volumeMounts) {
        this.volumeMounts = volumeMounts;
        return this;
    }
    public UserContainer addVolumeMountsItem(VolumeMount volumeMountsItem) {
        if (this.volumeMounts == null){
            volumeMounts = new ArrayList<>();
        }
        this.volumeMounts.add(volumeMountsItem);
        return this;
    }

    /**
    * Container's working directory. If not specified, the container runtime's default will be used, which might be configured in the container image. Cannot be updated.
    * @return workingDir
    **/
    @JsonProperty("workingDir")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public String getWorkingDir() {
        return workingDir;
    }

    /**
     * Set workingDir
     **/
    public void setWorkingDir(String workingDir) {
        this.workingDir = workingDir;
    }

    public UserContainer workingDir(String workingDir) {
        this.workingDir = workingDir;
        return this;
    }

    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UserContainer {\n");

        sb.append("    args: ").append(toIndentedString(args)).append("\n");
        sb.append("    command: ").append(toIndentedString(command)).append("\n");
        sb.append("    env: ").append(toIndentedString(env)).append("\n");
        sb.append("    envFrom: ").append(toIndentedString(envFrom)).append("\n");
        sb.append("    image: ").append(toIndentedString(image)).append("\n");
        sb.append("    imagePullPolicy: ").append(toIndentedString(imagePullPolicy)).append("\n");
        sb.append("    lifecycle: ").append(toIndentedString(lifecycle)).append("\n");
        sb.append("    livenessProbe: ").append(toIndentedString(livenessProbe)).append("\n");
        sb.append("    mirrorVolumeMounts: ").append(toIndentedString(mirrorVolumeMounts)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    ports: ").append(toIndentedString(ports)).append("\n");
        sb.append("    readinessProbe: ").append(toIndentedString(readinessProbe)).append("\n");
        sb.append("    resources: ").append(toIndentedString(resources)).append("\n");
        sb.append("    securityContext: ").append(toIndentedString(securityContext)).append("\n");
        sb.append("    startupProbe: ").append(toIndentedString(startupProbe)).append("\n");
        sb.append("    stdin: ").append(toIndentedString(stdin)).append("\n");
        sb.append("    stdinOnce: ").append(toIndentedString(stdinOnce)).append("\n");
        sb.append("    terminationMessagePath: ").append(toIndentedString(terminationMessagePath)).append("\n");
        sb.append("    terminationMessagePolicy: ").append(toIndentedString(terminationMessagePolicy)).append("\n");
        sb.append("    tty: ").append(toIndentedString(tty)).append("\n");
        sb.append("    volumeDevices: ").append(toIndentedString(volumeDevices)).append("\n");
        sb.append("    volumeMounts: ").append(toIndentedString(volumeMounts)).append("\n");
        sb.append("    workingDir: ").append(toIndentedString(workingDir)).append("\n");
        
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
      * UserContainer is a container specified by a user.
     **/
    public static class UserContainerQueryParam  {

        /**
          * UserContainer is a container specified by a user.
         **/
        @jakarta.ws.rs.QueryParam("args")
        private List<String> args = null;
        /**
          * UserContainer is a container specified by a user.
         **/
        @jakarta.ws.rs.QueryParam("command")
        private List<String> command = null;
        /**
          * UserContainer is a container specified by a user.
         **/
        @jakarta.ws.rs.QueryParam("env")
        private List<EnvVar> env = null;
        /**
          * UserContainer is a container specified by a user.
         **/
        @jakarta.ws.rs.QueryParam("envFrom")
        private List<EnvFromSource> envFrom = null;
        /**
          * UserContainer is a container specified by a user.
         **/
        @jakarta.ws.rs.QueryParam("image")
        private String image;
        /**
          * UserContainer is a container specified by a user.
         **/
        @jakarta.ws.rs.QueryParam("imagePullPolicy")
        private String imagePullPolicy;
        /**
          * UserContainer is a container specified by a user.
         **/
        @jakarta.ws.rs.QueryParam("lifecycle")
        private Lifecycle lifecycle;
        /**
          * UserContainer is a container specified by a user.
         **/
        @jakarta.ws.rs.QueryParam("livenessProbe")
        private Probe livenessProbe;
        /**
          * UserContainer is a container specified by a user.
         **/
        @jakarta.ws.rs.QueryParam("mirrorVolumeMounts")
        private Boolean mirrorVolumeMounts;
        /**
          * UserContainer is a container specified by a user.
         **/
        @jakarta.ws.rs.QueryParam("name")
        private String name;
        /**
          * UserContainer is a container specified by a user.
         **/
        @jakarta.ws.rs.QueryParam("ports")
        private List<ContainerPort> ports = null;
        /**
          * UserContainer is a container specified by a user.
         **/
        @jakarta.ws.rs.QueryParam("readinessProbe")
        private Probe readinessProbe;
        /**
          * UserContainer is a container specified by a user.
         **/
        @jakarta.ws.rs.QueryParam("resources")
        private ResourceRequirements resources;
        /**
          * UserContainer is a container specified by a user.
         **/
        @jakarta.ws.rs.QueryParam("securityContext")
        private SecurityContext securityContext;
        /**
          * UserContainer is a container specified by a user.
         **/
        @jakarta.ws.rs.QueryParam("startupProbe")
        private Probe startupProbe;
        /**
          * UserContainer is a container specified by a user.
         **/
        @jakarta.ws.rs.QueryParam("stdin")
        private Boolean stdin;
        /**
          * UserContainer is a container specified by a user.
         **/
        @jakarta.ws.rs.QueryParam("stdinOnce")
        private Boolean stdinOnce;
        /**
          * UserContainer is a container specified by a user.
         **/
        @jakarta.ws.rs.QueryParam("terminationMessagePath")
        private String terminationMessagePath;
        /**
          * UserContainer is a container specified by a user.
         **/
        @jakarta.ws.rs.QueryParam("terminationMessagePolicy")
        private String terminationMessagePolicy;
        /**
          * UserContainer is a container specified by a user.
         **/
        @jakarta.ws.rs.QueryParam("tty")
        private Boolean tty;
        /**
          * UserContainer is a container specified by a user.
         **/
        @jakarta.ws.rs.QueryParam("volumeDevices")
        private List<VolumeDevice> volumeDevices = null;
        /**
          * UserContainer is a container specified by a user.
         **/
        @jakarta.ws.rs.QueryParam("volumeMounts")
        private List<VolumeMount> volumeMounts = null;
        /**
          * UserContainer is a container specified by a user.
         **/
        @jakarta.ws.rs.QueryParam("workingDir")
        private String workingDir;

        /**
        * Arguments to the entrypoint. The container image's CMD is used if this is not provided. Variable references $(VAR_NAME) are expanded using the container's environment. If a variable cannot be resolved, the reference in the input string will be unchanged. Double $$ are reduced to a single $, which allows for escaping the $(VAR_NAME) syntax: i.e. \"$$(VAR_NAME)\" will produce the string literal \"$(VAR_NAME)\". Escaped references will never be expanded, regardless of whether the variable exists or not. Cannot be updated. More info: https://kubernetes.io/docs/tasks/inject-data-application/define-command-argument-container/#running-a-command-in-a-shell
        * @return args
        **/
        @JsonProperty("args")
        public List<String> getArgs() {
            return args;
        }

        /**
         * Set args
         **/
        public void setArgs(List<String> args) {
            this.args = args;
        }

        public UserContainerQueryParam args(List<String> args) {
            this.args = args;
            return this;
        }
        public UserContainerQueryParam addArgsItem(String argsItem) {
            this.args.add(argsItem);
            return this;
        }

        /**
        * Entrypoint array. Not executed within a shell. The container image's ENTRYPOINT is used if this is not provided. Variable references $(VAR_NAME) are expanded using the container's environment. If a variable cannot be resolved, the reference in the input string will be unchanged. Double $$ are reduced to a single $, which allows for escaping the $(VAR_NAME) syntax: i.e. \"$$(VAR_NAME)\" will produce the string literal \"$(VAR_NAME)\". Escaped references will never be expanded, regardless of whether the variable exists or not. Cannot be updated. More info: https://kubernetes.io/docs/tasks/inject-data-application/define-command-argument-container/#running-a-command-in-a-shell
        * @return command
        **/
        @JsonProperty("command")
        public List<String> getCommand() {
            return command;
        }

        /**
         * Set command
         **/
        public void setCommand(List<String> command) {
            this.command = command;
        }

        public UserContainerQueryParam command(List<String> command) {
            this.command = command;
            return this;
        }
        public UserContainerQueryParam addCommandItem(String commandItem) {
            this.command.add(commandItem);
            return this;
        }

        /**
        * List of environment variables to set in the container. Cannot be updated.
        * @return env
        **/
        @JsonProperty("env")
        public List<EnvVar> getEnv() {
            return env;
        }

        /**
         * Set env
         **/
        public void setEnv(List<EnvVar> env) {
            this.env = env;
        }

        public UserContainerQueryParam env(List<EnvVar> env) {
            this.env = env;
            return this;
        }
        public UserContainerQueryParam addEnvItem(EnvVar envItem) {
            this.env.add(envItem);
            return this;
        }

        /**
        * List of sources to populate environment variables in the container. The keys defined within a source must be a C_IDENTIFIER. All invalid keys will be reported as an event when the container is starting. When a key exists in multiple sources, the value associated with the last source will take precedence. Values defined by an Env with a duplicate key will take precedence. Cannot be updated.
        * @return envFrom
        **/
        @JsonProperty("envFrom")
        public List<EnvFromSource> getEnvFrom() {
            return envFrom;
        }

        /**
         * Set envFrom
         **/
        public void setEnvFrom(List<EnvFromSource> envFrom) {
            this.envFrom = envFrom;
        }

        public UserContainerQueryParam envFrom(List<EnvFromSource> envFrom) {
            this.envFrom = envFrom;
            return this;
        }
        public UserContainerQueryParam addEnvFromItem(EnvFromSource envFromItem) {
            this.envFrom.add(envFromItem);
            return this;
        }

        /**
        * Container image name. More info: https://kubernetes.io/docs/concepts/containers/images This field is optional to allow higher level config management to default or override container images in workload controllers like Deployments and StatefulSets.
        * @return image
        **/
        @JsonProperty("image")
        public String getImage() {
            return image;
        }

        /**
         * Set image
         **/
        public void setImage(String image) {
            this.image = image;
        }

        public UserContainerQueryParam image(String image) {
            this.image = image;
            return this;
        }

        /**
        * Image pull policy. One of Always, Never, IfNotPresent. Defaults to Always if :latest tag is specified, or IfNotPresent otherwise. Cannot be updated. More info: https://kubernetes.io/docs/concepts/containers/images#updating-images
        * @return imagePullPolicy
        **/
        @JsonProperty("imagePullPolicy")
        public String getImagePullPolicy() {
            return imagePullPolicy;
        }

        /**
         * Set imagePullPolicy
         **/
        public void setImagePullPolicy(String imagePullPolicy) {
            this.imagePullPolicy = imagePullPolicy;
        }

        public UserContainerQueryParam imagePullPolicy(String imagePullPolicy) {
            this.imagePullPolicy = imagePullPolicy;
            return this;
        }

        /**
        * Get lifecycle
        * @return lifecycle
        **/
        @JsonProperty("lifecycle")
        public Lifecycle getLifecycle() {
            return lifecycle;
        }

        /**
         * Set lifecycle
         **/
        public void setLifecycle(Lifecycle lifecycle) {
            this.lifecycle = lifecycle;
        }

        public UserContainerQueryParam lifecycle(Lifecycle lifecycle) {
            this.lifecycle = lifecycle;
            return this;
        }

        /**
        * Get livenessProbe
        * @return livenessProbe
        **/
        @JsonProperty("livenessProbe")
        public Probe getLivenessProbe() {
            return livenessProbe;
        }

        /**
         * Set livenessProbe
         **/
        public void setLivenessProbe(Probe livenessProbe) {
            this.livenessProbe = livenessProbe;
        }

        public UserContainerQueryParam livenessProbe(Probe livenessProbe) {
            this.livenessProbe = livenessProbe;
            return this;
        }

        /**
        * MirrorVolumeMounts will mount the same volumes specified in the main container to the container (including artifacts), at the same mountPaths. This enables dind daemon to partially see the same filesystem as the main container in order to use features such as docker volume binding
        * @return mirrorVolumeMounts
        **/
        @JsonProperty("mirrorVolumeMounts")
        public Boolean getMirrorVolumeMounts() {
            return mirrorVolumeMounts;
        }

        /**
         * Set mirrorVolumeMounts
         **/
        public void setMirrorVolumeMounts(Boolean mirrorVolumeMounts) {
            this.mirrorVolumeMounts = mirrorVolumeMounts;
        }

        public UserContainerQueryParam mirrorVolumeMounts(Boolean mirrorVolumeMounts) {
            this.mirrorVolumeMounts = mirrorVolumeMounts;
            return this;
        }

        /**
        * Name of the container specified as a DNS_LABEL. Each container in a pod must have a unique name (DNS_LABEL). Cannot be updated.
        * @return name
        **/
        @JsonProperty("name")
        public String getName() {
            return name;
        }

        /**
         * Set name
         **/
        public void setName(String name) {
            this.name = name;
        }

        public UserContainerQueryParam name(String name) {
            this.name = name;
            return this;
        }

        /**
        * List of ports to expose from the container. Not specifying a port here DOES NOT prevent that port from being exposed. Any port which is listening on the default \"0.0.0.0\" address inside a container will be accessible from the network. Modifying this array with strategic merge patch may corrupt the data. For more information See https://github.com/kubernetes/kubernetes/issues/108255. Cannot be updated.
        * @return ports
        **/
        @JsonProperty("ports")
        public List<ContainerPort> getPorts() {
            return ports;
        }

        /**
         * Set ports
         **/
        public void setPorts(List<ContainerPort> ports) {
            this.ports = ports;
        }

        public UserContainerQueryParam ports(List<ContainerPort> ports) {
            this.ports = ports;
            return this;
        }
        public UserContainerQueryParam addPortsItem(ContainerPort portsItem) {
            this.ports.add(portsItem);
            return this;
        }

        /**
        * Get readinessProbe
        * @return readinessProbe
        **/
        @JsonProperty("readinessProbe")
        public Probe getReadinessProbe() {
            return readinessProbe;
        }

        /**
         * Set readinessProbe
         **/
        public void setReadinessProbe(Probe readinessProbe) {
            this.readinessProbe = readinessProbe;
        }

        public UserContainerQueryParam readinessProbe(Probe readinessProbe) {
            this.readinessProbe = readinessProbe;
            return this;
        }

        /**
        * Get resources
        * @return resources
        **/
        @JsonProperty("resources")
        public ResourceRequirements getResources() {
            return resources;
        }

        /**
         * Set resources
         **/
        public void setResources(ResourceRequirements resources) {
            this.resources = resources;
        }

        public UserContainerQueryParam resources(ResourceRequirements resources) {
            this.resources = resources;
            return this;
        }

        /**
        * Get securityContext
        * @return securityContext
        **/
        @JsonProperty("securityContext")
        public SecurityContext getSecurityContext() {
            return securityContext;
        }

        /**
         * Set securityContext
         **/
        public void setSecurityContext(SecurityContext securityContext) {
            this.securityContext = securityContext;
        }

        public UserContainerQueryParam securityContext(SecurityContext securityContext) {
            this.securityContext = securityContext;
            return this;
        }

        /**
        * Get startupProbe
        * @return startupProbe
        **/
        @JsonProperty("startupProbe")
        public Probe getStartupProbe() {
            return startupProbe;
        }

        /**
         * Set startupProbe
         **/
        public void setStartupProbe(Probe startupProbe) {
            this.startupProbe = startupProbe;
        }

        public UserContainerQueryParam startupProbe(Probe startupProbe) {
            this.startupProbe = startupProbe;
            return this;
        }

        /**
        * Whether this container should allocate a buffer for stdin in the container runtime. If this is not set, reads from stdin in the container will always result in EOF. Default is false.
        * @return stdin
        **/
        @JsonProperty("stdin")
        public Boolean getStdin() {
            return stdin;
        }

        /**
         * Set stdin
         **/
        public void setStdin(Boolean stdin) {
            this.stdin = stdin;
        }

        public UserContainerQueryParam stdin(Boolean stdin) {
            this.stdin = stdin;
            return this;
        }

        /**
        * Whether the container runtime should close the stdin channel after it has been opened by a single attach. When stdin is true the stdin stream will remain open across multiple attach sessions. If stdinOnce is set to true, stdin is opened on container start, is empty until the first client attaches to stdin, and then remains open and accepts data until the client disconnects, at which time stdin is closed and remains closed until the container is restarted. If this flag is false, a container processes that reads from stdin will never receive an EOF. Default is false
        * @return stdinOnce
        **/
        @JsonProperty("stdinOnce")
        public Boolean getStdinOnce() {
            return stdinOnce;
        }

        /**
         * Set stdinOnce
         **/
        public void setStdinOnce(Boolean stdinOnce) {
            this.stdinOnce = stdinOnce;
        }

        public UserContainerQueryParam stdinOnce(Boolean stdinOnce) {
            this.stdinOnce = stdinOnce;
            return this;
        }

        /**
        * Optional: Path at which the file to which the container's termination message will be written is mounted into the container's filesystem. Message written is intended to be brief final status, such as an assertion failure message. Will be truncated by the node if greater than 4096 bytes. The total message length across all containers will be limited to 12kb. Defaults to /dev/termination-log. Cannot be updated.
        * @return terminationMessagePath
        **/
        @JsonProperty("terminationMessagePath")
        public String getTerminationMessagePath() {
            return terminationMessagePath;
        }

        /**
         * Set terminationMessagePath
         **/
        public void setTerminationMessagePath(String terminationMessagePath) {
            this.terminationMessagePath = terminationMessagePath;
        }

        public UserContainerQueryParam terminationMessagePath(String terminationMessagePath) {
            this.terminationMessagePath = terminationMessagePath;
            return this;
        }

        /**
        * Indicate how the termination message should be populated. File will use the contents of terminationMessagePath to populate the container status message on both success and failure. FallbackToLogsOnError will use the last chunk of container log output if the termination message file is empty and the container exited with an error. The log output is limited to 2048 bytes or 80 lines, whichever is smaller. Defaults to File. Cannot be updated.
        * @return terminationMessagePolicy
        **/
        @JsonProperty("terminationMessagePolicy")
        public String getTerminationMessagePolicy() {
            return terminationMessagePolicy;
        }

        /**
         * Set terminationMessagePolicy
         **/
        public void setTerminationMessagePolicy(String terminationMessagePolicy) {
            this.terminationMessagePolicy = terminationMessagePolicy;
        }

        public UserContainerQueryParam terminationMessagePolicy(String terminationMessagePolicy) {
            this.terminationMessagePolicy = terminationMessagePolicy;
            return this;
        }

        /**
        * Whether this container should allocate a TTY for itself, also requires 'stdin' to be true. Default is false.
        * @return tty
        **/
        @JsonProperty("tty")
        public Boolean getTty() {
            return tty;
        }

        /**
         * Set tty
         **/
        public void setTty(Boolean tty) {
            this.tty = tty;
        }

        public UserContainerQueryParam tty(Boolean tty) {
            this.tty = tty;
            return this;
        }

        /**
        * volumeDevices is the list of block devices to be used by the container.
        * @return volumeDevices
        **/
        @JsonProperty("volumeDevices")
        public List<VolumeDevice> getVolumeDevices() {
            return volumeDevices;
        }

        /**
         * Set volumeDevices
         **/
        public void setVolumeDevices(List<VolumeDevice> volumeDevices) {
            this.volumeDevices = volumeDevices;
        }

        public UserContainerQueryParam volumeDevices(List<VolumeDevice> volumeDevices) {
            this.volumeDevices = volumeDevices;
            return this;
        }
        public UserContainerQueryParam addVolumeDevicesItem(VolumeDevice volumeDevicesItem) {
            this.volumeDevices.add(volumeDevicesItem);
            return this;
        }

        /**
        * Pod volumes to mount into the container's filesystem. Cannot be updated.
        * @return volumeMounts
        **/
        @JsonProperty("volumeMounts")
        public List<VolumeMount> getVolumeMounts() {
            return volumeMounts;
        }

        /**
         * Set volumeMounts
         **/
        public void setVolumeMounts(List<VolumeMount> volumeMounts) {
            this.volumeMounts = volumeMounts;
        }

        public UserContainerQueryParam volumeMounts(List<VolumeMount> volumeMounts) {
            this.volumeMounts = volumeMounts;
            return this;
        }
        public UserContainerQueryParam addVolumeMountsItem(VolumeMount volumeMountsItem) {
            this.volumeMounts.add(volumeMountsItem);
            return this;
        }

        /**
        * Container's working directory. If not specified, the container runtime's default will be used, which might be configured in the container image. Cannot be updated.
        * @return workingDir
        **/
        @JsonProperty("workingDir")
        public String getWorkingDir() {
            return workingDir;
        }

        /**
         * Set workingDir
         **/
        public void setWorkingDir(String workingDir) {
            this.workingDir = workingDir;
        }

        public UserContainerQueryParam workingDir(String workingDir) {
            this.workingDir = workingDir;
            return this;
        }

        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class UserContainerQueryParam {\n");

            sb.append("    args: ").append(toIndentedString(args)).append("\n");
            sb.append("    command: ").append(toIndentedString(command)).append("\n");
            sb.append("    env: ").append(toIndentedString(env)).append("\n");
            sb.append("    envFrom: ").append(toIndentedString(envFrom)).append("\n");
            sb.append("    image: ").append(toIndentedString(image)).append("\n");
            sb.append("    imagePullPolicy: ").append(toIndentedString(imagePullPolicy)).append("\n");
            sb.append("    lifecycle: ").append(toIndentedString(lifecycle)).append("\n");
            sb.append("    livenessProbe: ").append(toIndentedString(livenessProbe)).append("\n");
            sb.append("    mirrorVolumeMounts: ").append(toIndentedString(mirrorVolumeMounts)).append("\n");
            sb.append("    name: ").append(toIndentedString(name)).append("\n");
            sb.append("    ports: ").append(toIndentedString(ports)).append("\n");
            sb.append("    readinessProbe: ").append(toIndentedString(readinessProbe)).append("\n");
            sb.append("    resources: ").append(toIndentedString(resources)).append("\n");
            sb.append("    securityContext: ").append(toIndentedString(securityContext)).append("\n");
            sb.append("    startupProbe: ").append(toIndentedString(startupProbe)).append("\n");
            sb.append("    stdin: ").append(toIndentedString(stdin)).append("\n");
            sb.append("    stdinOnce: ").append(toIndentedString(stdinOnce)).append("\n");
            sb.append("    terminationMessagePath: ").append(toIndentedString(terminationMessagePath)).append("\n");
            sb.append("    terminationMessagePolicy: ").append(toIndentedString(terminationMessagePolicy)).append("\n");
            sb.append("    tty: ").append(toIndentedString(tty)).append("\n");
            sb.append("    volumeDevices: ").append(toIndentedString(volumeDevices)).append("\n");
            sb.append("    volumeMounts: ").append(toIndentedString(volumeMounts)).append("\n");
            sb.append("    workingDir: ").append(toIndentedString(workingDir)).append("\n");
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
