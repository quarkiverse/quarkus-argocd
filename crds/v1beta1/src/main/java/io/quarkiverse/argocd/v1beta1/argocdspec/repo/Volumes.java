package io.quarkiverse.argocd.v1beta1.argocdspec.repo;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({ "awsElasticBlockStore", "azureDisk", "azureFile", "cephfs", "cinder",
        "configMap", "csi", "downwardAPI", "emptyDir", "ephemeral", "fc", "flexVolume", "flocker", "gcePersistentDisk",
        "gitRepo", "glusterfs", "hostPath", "iscsi", "name", "nfs", "persistentVolumeClaim", "photonPersistentDisk",
        "portworxVolume", "projected", "quobyte", "rbd", "scaleIO", "secret", "storageos", "vsphereVolume" })
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@lombok.ToString()
@lombok.EqualsAndHashCode()
@io.sundr.builder.annotations.Buildable(editableEnabled = false, validationEnabled = false, generateBuilderPackage = false, builderPackage = "io.fabric8.kubernetes.api.builder", refs = {
        @io.sundr.builder.annotations.BuildableReference(io.fabric8.kubernetes.api.model.ObjectMeta.class),
        @io.sundr.builder.annotations.BuildableReference(io.fabric8.kubernetes.api.model.ObjectReference.class),
        @io.sundr.builder.annotations.BuildableReference(io.fabric8.kubernetes.api.model.LabelSelector.class),
        @io.sundr.builder.annotations.BuildableReference(io.fabric8.kubernetes.api.model.Container.class),
        @io.sundr.builder.annotations.BuildableReference(io.fabric8.kubernetes.api.model.EnvVar.class),
        @io.sundr.builder.annotations.BuildableReference(io.fabric8.kubernetes.api.model.ContainerPort.class),
        @io.sundr.builder.annotations.BuildableReference(io.fabric8.kubernetes.api.model.Volume.class),
        @io.sundr.builder.annotations.BuildableReference(io.fabric8.kubernetes.api.model.VolumeMount.class)
})
public class Volumes implements io.fabric8.kubernetes.api.builder.Editable<VolumesBuilder>,
        io.fabric8.kubernetes.api.model.KubernetesResource {

    @java.lang.Override
    public VolumesBuilder edit() {
        return new VolumesBuilder(this);
    }

    /**
     * awsElasticBlockStore represents an AWS Disk resource that is attached to a kubelet's host machine and then exposed to the
     * pod. More info: https://kubernetes.io/docs/concepts/storage/volumes#awselasticblockstore
     */
    @com.fasterxml.jackson.annotation.JsonProperty("awsElasticBlockStore")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("awsElasticBlockStore represents an AWS Disk resource that is attached to a kubelet's host machine and then exposed to the pod. More info: https://kubernetes.io/docs/concepts/storage/volumes#awselasticblockstore")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.quarkiverse.argocd.v1beta1.argocdspec.repo.volumes.AwsElasticBlockStore awsElasticBlockStore;

    public io.quarkiverse.argocd.v1beta1.argocdspec.repo.volumes.AwsElasticBlockStore getAwsElasticBlockStore() {
        return awsElasticBlockStore;
    }

    public void setAwsElasticBlockStore(
            io.quarkiverse.argocd.v1beta1.argocdspec.repo.volumes.AwsElasticBlockStore awsElasticBlockStore) {
        this.awsElasticBlockStore = awsElasticBlockStore;
    }

    /**
     * azureDisk represents an Azure Data Disk mount on the host and bind mount to the pod.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("azureDisk")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("azureDisk represents an Azure Data Disk mount on the host and bind mount to the pod.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.quarkiverse.argocd.v1beta1.argocdspec.repo.volumes.AzureDisk azureDisk;

    public io.quarkiverse.argocd.v1beta1.argocdspec.repo.volumes.AzureDisk getAzureDisk() {
        return azureDisk;
    }

    public void setAzureDisk(io.quarkiverse.argocd.v1beta1.argocdspec.repo.volumes.AzureDisk azureDisk) {
        this.azureDisk = azureDisk;
    }

    /**
     * azureFile represents an Azure File Service mount on the host and bind mount to the pod.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("azureFile")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("azureFile represents an Azure File Service mount on the host and bind mount to the pod.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.quarkiverse.argocd.v1beta1.argocdspec.repo.volumes.AzureFile azureFile;

    public io.quarkiverse.argocd.v1beta1.argocdspec.repo.volumes.AzureFile getAzureFile() {
        return azureFile;
    }

    public void setAzureFile(io.quarkiverse.argocd.v1beta1.argocdspec.repo.volumes.AzureFile azureFile) {
        this.azureFile = azureFile;
    }

    /**
     * cephFS represents a Ceph FS mount on the host that shares a pod's lifetime
     */
    @com.fasterxml.jackson.annotation.JsonProperty("cephfs")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("cephFS represents a Ceph FS mount on the host that shares a pod's lifetime")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.quarkiverse.argocd.v1beta1.argocdspec.repo.volumes.Cephfs cephfs;

    public io.quarkiverse.argocd.v1beta1.argocdspec.repo.volumes.Cephfs getCephfs() {
        return cephfs;
    }

    public void setCephfs(io.quarkiverse.argocd.v1beta1.argocdspec.repo.volumes.Cephfs cephfs) {
        this.cephfs = cephfs;
    }

    /**
     * cinder represents a cinder volume attached and mounted on kubelets host machine. More info:
     * https://examples.k8s.io/mysql-cinder-pd/README.md
     */
    @com.fasterxml.jackson.annotation.JsonProperty("cinder")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("cinder represents a cinder volume attached and mounted on kubelets host machine. More info: https://examples.k8s.io/mysql-cinder-pd/README.md")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.quarkiverse.argocd.v1beta1.argocdspec.repo.volumes.Cinder cinder;

    public io.quarkiverse.argocd.v1beta1.argocdspec.repo.volumes.Cinder getCinder() {
        return cinder;
    }

    public void setCinder(io.quarkiverse.argocd.v1beta1.argocdspec.repo.volumes.Cinder cinder) {
        this.cinder = cinder;
    }

    /**
     * configMap represents a configMap that should populate this volume
     */
    @com.fasterxml.jackson.annotation.JsonProperty("configMap")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("configMap represents a configMap that should populate this volume")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.quarkiverse.argocd.v1beta1.argocdspec.repo.volumes.ConfigMap configMap;

    public io.quarkiverse.argocd.v1beta1.argocdspec.repo.volumes.ConfigMap getConfigMap() {
        return configMap;
    }

    public void setConfigMap(io.quarkiverse.argocd.v1beta1.argocdspec.repo.volumes.ConfigMap configMap) {
        this.configMap = configMap;
    }

    /**
     * csi (Container Storage Interface) represents ephemeral storage that is handled by certain external CSI drivers (Beta
     * feature).
     */
    @com.fasterxml.jackson.annotation.JsonProperty("csi")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("csi (Container Storage Interface) represents ephemeral storage that is handled by certain external CSI drivers (Beta feature).")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.quarkiverse.argocd.v1beta1.argocdspec.repo.volumes.Csi csi;

    public io.quarkiverse.argocd.v1beta1.argocdspec.repo.volumes.Csi getCsi() {
        return csi;
    }

    public void setCsi(io.quarkiverse.argocd.v1beta1.argocdspec.repo.volumes.Csi csi) {
        this.csi = csi;
    }

    /**
     * downwardAPI represents downward API about the pod that should populate this volume
     */
    @com.fasterxml.jackson.annotation.JsonProperty("downwardAPI")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("downwardAPI represents downward API about the pod that should populate this volume")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.quarkiverse.argocd.v1beta1.argocdspec.repo.volumes.DownwardAPI downwardAPI;

    public io.quarkiverse.argocd.v1beta1.argocdspec.repo.volumes.DownwardAPI getDownwardAPI() {
        return downwardAPI;
    }

    public void setDownwardAPI(io.quarkiverse.argocd.v1beta1.argocdspec.repo.volumes.DownwardAPI downwardAPI) {
        this.downwardAPI = downwardAPI;
    }

    /**
     * emptyDir represents a temporary directory that shares a pod's lifetime. More info:
     * https://kubernetes.io/docs/concepts/storage/volumes#emptydir
     */
    @com.fasterxml.jackson.annotation.JsonProperty("emptyDir")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("emptyDir represents a temporary directory that shares a pod's lifetime. More info: https://kubernetes.io/docs/concepts/storage/volumes#emptydir")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.quarkiverse.argocd.v1beta1.argocdspec.repo.volumes.EmptyDir emptyDir;

    public io.quarkiverse.argocd.v1beta1.argocdspec.repo.volumes.EmptyDir getEmptyDir() {
        return emptyDir;
    }

    public void setEmptyDir(io.quarkiverse.argocd.v1beta1.argocdspec.repo.volumes.EmptyDir emptyDir) {
        this.emptyDir = emptyDir;
    }

    /**
     * ephemeral represents a volume that is handled by a cluster storage driver. The volume's lifecycle is tied to the pod that
     * defines it - it will be created before the pod starts, and deleted when the pod is removed.
     * Use this if: a) the volume is only needed while the pod runs, b) features of normal volumes like restoring from snapshot
     * or capacity tracking are needed, c) the storage driver is specified through a storage class, and d) the storage driver
     * supports dynamic volume provisioning through a PersistentVolumeClaim (see EphemeralVolumeSource for more information on
     * the connection between this volume type and PersistentVolumeClaim).
     * Use PersistentVolumeClaim or one of the vendor-specific APIs for volumes that persist for longer than the lifecycle of an
     * individual pod.
     * Use CSI for light-weight local ephemeral volumes if the CSI driver is meant to be used that way - see the documentation
     * of the driver for more information.
     * A pod can use both types of ephemeral volumes and persistent volumes at the same time.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("ephemeral")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("ephemeral represents a volume that is handled by a cluster storage driver. The volume's lifecycle is tied to the pod that defines it - it will be created before the pod starts, and deleted when the pod is removed. \n Use this if: a) the volume is only needed while the pod runs, b) features of normal volumes like restoring from snapshot or capacity    tracking are needed, c) the storage driver is specified through a storage class, and d) the storage driver supports dynamic volume provisioning through    a PersistentVolumeClaim (see EphemeralVolumeSource for more    information on the connection between this volume type    and PersistentVolumeClaim). \n Use PersistentVolumeClaim or one of the vendor-specific APIs for volumes that persist for longer than the lifecycle of an individual pod. \n Use CSI for light-weight local ephemeral volumes if the CSI driver is meant to be used that way - see the documentation of the driver for more information. \n A pod can use both types of ephemeral volumes and persistent volumes at the same time.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.quarkiverse.argocd.v1beta1.argocdspec.repo.volumes.Ephemeral ephemeral;

    public io.quarkiverse.argocd.v1beta1.argocdspec.repo.volumes.Ephemeral getEphemeral() {
        return ephemeral;
    }

    public void setEphemeral(io.quarkiverse.argocd.v1beta1.argocdspec.repo.volumes.Ephemeral ephemeral) {
        this.ephemeral = ephemeral;
    }

    /**
     * fc represents a Fibre Channel resource that is attached to a kubelet's host machine and then exposed to the pod.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("fc")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("fc represents a Fibre Channel resource that is attached to a kubelet's host machine and then exposed to the pod.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.quarkiverse.argocd.v1beta1.argocdspec.repo.volumes.Fc fc;

    public io.quarkiverse.argocd.v1beta1.argocdspec.repo.volumes.Fc getFc() {
        return fc;
    }

    public void setFc(io.quarkiverse.argocd.v1beta1.argocdspec.repo.volumes.Fc fc) {
        this.fc = fc;
    }

    /**
     * flexVolume represents a generic volume resource that is provisioned/attached using an exec based plugin.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("flexVolume")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("flexVolume represents a generic volume resource that is provisioned/attached using an exec based plugin.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.quarkiverse.argocd.v1beta1.argocdspec.repo.volumes.FlexVolume flexVolume;

    public io.quarkiverse.argocd.v1beta1.argocdspec.repo.volumes.FlexVolume getFlexVolume() {
        return flexVolume;
    }

    public void setFlexVolume(io.quarkiverse.argocd.v1beta1.argocdspec.repo.volumes.FlexVolume flexVolume) {
        this.flexVolume = flexVolume;
    }

    /**
     * flocker represents a Flocker volume attached to a kubelet's host machine. This depends on the Flocker control service
     * being running
     */
    @com.fasterxml.jackson.annotation.JsonProperty("flocker")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("flocker represents a Flocker volume attached to a kubelet's host machine. This depends on the Flocker control service being running")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.quarkiverse.argocd.v1beta1.argocdspec.repo.volumes.Flocker flocker;

    public io.quarkiverse.argocd.v1beta1.argocdspec.repo.volumes.Flocker getFlocker() {
        return flocker;
    }

    public void setFlocker(io.quarkiverse.argocd.v1beta1.argocdspec.repo.volumes.Flocker flocker) {
        this.flocker = flocker;
    }

    /**
     * gcePersistentDisk represents a GCE Disk resource that is attached to a kubelet's host machine and then exposed to the
     * pod. More info: https://kubernetes.io/docs/concepts/storage/volumes#gcepersistentdisk
     */
    @com.fasterxml.jackson.annotation.JsonProperty("gcePersistentDisk")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("gcePersistentDisk represents a GCE Disk resource that is attached to a kubelet's host machine and then exposed to the pod. More info: https://kubernetes.io/docs/concepts/storage/volumes#gcepersistentdisk")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.quarkiverse.argocd.v1beta1.argocdspec.repo.volumes.GcePersistentDisk gcePersistentDisk;

    public io.quarkiverse.argocd.v1beta1.argocdspec.repo.volumes.GcePersistentDisk getGcePersistentDisk() {
        return gcePersistentDisk;
    }

    public void setGcePersistentDisk(
            io.quarkiverse.argocd.v1beta1.argocdspec.repo.volumes.GcePersistentDisk gcePersistentDisk) {
        this.gcePersistentDisk = gcePersistentDisk;
    }

    /**
     * gitRepo represents a git repository at a particular revision. DEPRECATED: GitRepo is deprecated. To provision a container
     * with a git repo, mount an EmptyDir into an InitContainer that clones the repo using git, then mount the EmptyDir into the
     * Pod's container.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("gitRepo")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("gitRepo represents a git repository at a particular revision. DEPRECATED: GitRepo is deprecated. To provision a container with a git repo, mount an EmptyDir into an InitContainer that clones the repo using git, then mount the EmptyDir into the Pod's container.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.quarkiverse.argocd.v1beta1.argocdspec.repo.volumes.GitRepo gitRepo;

    public io.quarkiverse.argocd.v1beta1.argocdspec.repo.volumes.GitRepo getGitRepo() {
        return gitRepo;
    }

    public void setGitRepo(io.quarkiverse.argocd.v1beta1.argocdspec.repo.volumes.GitRepo gitRepo) {
        this.gitRepo = gitRepo;
    }

    /**
     * glusterfs represents a Glusterfs mount on the host that shares a pod's lifetime. More info:
     * https://examples.k8s.io/volumes/glusterfs/README.md
     */
    @com.fasterxml.jackson.annotation.JsonProperty("glusterfs")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("glusterfs represents a Glusterfs mount on the host that shares a pod's lifetime. More info: https://examples.k8s.io/volumes/glusterfs/README.md")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.quarkiverse.argocd.v1beta1.argocdspec.repo.volumes.Glusterfs glusterfs;

    public io.quarkiverse.argocd.v1beta1.argocdspec.repo.volumes.Glusterfs getGlusterfs() {
        return glusterfs;
    }

    public void setGlusterfs(io.quarkiverse.argocd.v1beta1.argocdspec.repo.volumes.Glusterfs glusterfs) {
        this.glusterfs = glusterfs;
    }

    /**
     * hostPath represents a pre-existing file or directory on the host machine that is directly exposed to the container. This
     * is generally used for system agents or other privileged things that are allowed to see the host machine. Most containers
     * will NOT need this. More info: https://kubernetes.io/docs/concepts/storage/volumes#hostpath --- TODO(jonesdl) We need to
     * restrict who can use host directory mounts and who can/can not mount host directories as read/write.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("hostPath")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("hostPath represents a pre-existing file or directory on the host machine that is directly exposed to the container. This is generally used for system agents or other privileged things that are allowed to see the host machine. Most containers will NOT need this. More info: https://kubernetes.io/docs/concepts/storage/volumes#hostpath --- TODO(jonesdl) We need to restrict who can use host directory mounts and who can/can not mount host directories as read/write.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.quarkiverse.argocd.v1beta1.argocdspec.repo.volumes.HostPath hostPath;

    public io.quarkiverse.argocd.v1beta1.argocdspec.repo.volumes.HostPath getHostPath() {
        return hostPath;
    }

    public void setHostPath(io.quarkiverse.argocd.v1beta1.argocdspec.repo.volumes.HostPath hostPath) {
        this.hostPath = hostPath;
    }

    /**
     * iscsi represents an ISCSI Disk resource that is attached to a kubelet's host machine and then exposed to the pod. More
     * info: https://examples.k8s.io/volumes/iscsi/README.md
     */
    @com.fasterxml.jackson.annotation.JsonProperty("iscsi")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("iscsi represents an ISCSI Disk resource that is attached to a kubelet's host machine and then exposed to the pod. More info: https://examples.k8s.io/volumes/iscsi/README.md")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.quarkiverse.argocd.v1beta1.argocdspec.repo.volumes.Iscsi iscsi;

    public io.quarkiverse.argocd.v1beta1.argocdspec.repo.volumes.Iscsi getIscsi() {
        return iscsi;
    }

    public void setIscsi(io.quarkiverse.argocd.v1beta1.argocdspec.repo.volumes.Iscsi iscsi) {
        this.iscsi = iscsi;
    }

    /**
     * name of the volume. Must be a DNS_LABEL and unique within the pod. More info:
     * https://kubernetes.io/docs/concepts/overview/working-with-objects/names/#names
     */
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    @io.fabric8.generator.annotation.Required()
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("name of the volume. Must be a DNS_LABEL and unique within the pod. More info: https://kubernetes.io/docs/concepts/overview/working-with-objects/names/#names")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    /**
     * nfs represents an NFS mount on the host that shares a pod's lifetime More info:
     * https://kubernetes.io/docs/concepts/storage/volumes#nfs
     */
    @com.fasterxml.jackson.annotation.JsonProperty("nfs")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("nfs represents an NFS mount on the host that shares a pod's lifetime More info: https://kubernetes.io/docs/concepts/storage/volumes#nfs")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.quarkiverse.argocd.v1beta1.argocdspec.repo.volumes.Nfs nfs;

    public io.quarkiverse.argocd.v1beta1.argocdspec.repo.volumes.Nfs getNfs() {
        return nfs;
    }

    public void setNfs(io.quarkiverse.argocd.v1beta1.argocdspec.repo.volumes.Nfs nfs) {
        this.nfs = nfs;
    }

    /**
     * persistentVolumeClaimVolumeSource represents a reference to a PersistentVolumeClaim in the same namespace. More info:
     * https://kubernetes.io/docs/concepts/storage/persistent-volumes#persistentvolumeclaims
     */
    @com.fasterxml.jackson.annotation.JsonProperty("persistentVolumeClaim")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("persistentVolumeClaimVolumeSource represents a reference to a PersistentVolumeClaim in the same namespace. More info: https://kubernetes.io/docs/concepts/storage/persistent-volumes#persistentvolumeclaims")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.quarkiverse.argocd.v1beta1.argocdspec.repo.volumes.PersistentVolumeClaim persistentVolumeClaim;

    public io.quarkiverse.argocd.v1beta1.argocdspec.repo.volumes.PersistentVolumeClaim getPersistentVolumeClaim() {
        return persistentVolumeClaim;
    }

    public void setPersistentVolumeClaim(
            io.quarkiverse.argocd.v1beta1.argocdspec.repo.volumes.PersistentVolumeClaim persistentVolumeClaim) {
        this.persistentVolumeClaim = persistentVolumeClaim;
    }

    /**
     * photonPersistentDisk represents a PhotonController persistent disk attached and mounted on kubelets host machine
     */
    @com.fasterxml.jackson.annotation.JsonProperty("photonPersistentDisk")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("photonPersistentDisk represents a PhotonController persistent disk attached and mounted on kubelets host machine")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.quarkiverse.argocd.v1beta1.argocdspec.repo.volumes.PhotonPersistentDisk photonPersistentDisk;

    public io.quarkiverse.argocd.v1beta1.argocdspec.repo.volumes.PhotonPersistentDisk getPhotonPersistentDisk() {
        return photonPersistentDisk;
    }

    public void setPhotonPersistentDisk(
            io.quarkiverse.argocd.v1beta1.argocdspec.repo.volumes.PhotonPersistentDisk photonPersistentDisk) {
        this.photonPersistentDisk = photonPersistentDisk;
    }

    /**
     * portworxVolume represents a portworx volume attached and mounted on kubelets host machine
     */
    @com.fasterxml.jackson.annotation.JsonProperty("portworxVolume")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("portworxVolume represents a portworx volume attached and mounted on kubelets host machine")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.quarkiverse.argocd.v1beta1.argocdspec.repo.volumes.PortworxVolume portworxVolume;

    public io.quarkiverse.argocd.v1beta1.argocdspec.repo.volumes.PortworxVolume getPortworxVolume() {
        return portworxVolume;
    }

    public void setPortworxVolume(io.quarkiverse.argocd.v1beta1.argocdspec.repo.volumes.PortworxVolume portworxVolume) {
        this.portworxVolume = portworxVolume;
    }

    /**
     * projected items for all in one resources secrets, configmaps, and downward API
     */
    @com.fasterxml.jackson.annotation.JsonProperty("projected")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("projected items for all in one resources secrets, configmaps, and downward API")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.quarkiverse.argocd.v1beta1.argocdspec.repo.volumes.Projected projected;

    public io.quarkiverse.argocd.v1beta1.argocdspec.repo.volumes.Projected getProjected() {
        return projected;
    }

    public void setProjected(io.quarkiverse.argocd.v1beta1.argocdspec.repo.volumes.Projected projected) {
        this.projected = projected;
    }

    /**
     * quobyte represents a Quobyte mount on the host that shares a pod's lifetime
     */
    @com.fasterxml.jackson.annotation.JsonProperty("quobyte")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("quobyte represents a Quobyte mount on the host that shares a pod's lifetime")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.quarkiverse.argocd.v1beta1.argocdspec.repo.volumes.Quobyte quobyte;

    public io.quarkiverse.argocd.v1beta1.argocdspec.repo.volumes.Quobyte getQuobyte() {
        return quobyte;
    }

    public void setQuobyte(io.quarkiverse.argocd.v1beta1.argocdspec.repo.volumes.Quobyte quobyte) {
        this.quobyte = quobyte;
    }

    /**
     * rbd represents a Rados Block Device mount on the host that shares a pod's lifetime. More info:
     * https://examples.k8s.io/volumes/rbd/README.md
     */
    @com.fasterxml.jackson.annotation.JsonProperty("rbd")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("rbd represents a Rados Block Device mount on the host that shares a pod's lifetime. More info: https://examples.k8s.io/volumes/rbd/README.md")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.quarkiverse.argocd.v1beta1.argocdspec.repo.volumes.Rbd rbd;

    public io.quarkiverse.argocd.v1beta1.argocdspec.repo.volumes.Rbd getRbd() {
        return rbd;
    }

    public void setRbd(io.quarkiverse.argocd.v1beta1.argocdspec.repo.volumes.Rbd rbd) {
        this.rbd = rbd;
    }

    /**
     * scaleIO represents a ScaleIO persistent volume attached and mounted on Kubernetes nodes.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("scaleIO")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("scaleIO represents a ScaleIO persistent volume attached and mounted on Kubernetes nodes.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.quarkiverse.argocd.v1beta1.argocdspec.repo.volumes.ScaleIO scaleIO;

    public io.quarkiverse.argocd.v1beta1.argocdspec.repo.volumes.ScaleIO getScaleIO() {
        return scaleIO;
    }

    public void setScaleIO(io.quarkiverse.argocd.v1beta1.argocdspec.repo.volumes.ScaleIO scaleIO) {
        this.scaleIO = scaleIO;
    }

    /**
     * secret represents a secret that should populate this volume. More info:
     * https://kubernetes.io/docs/concepts/storage/volumes#secret
     */
    @com.fasterxml.jackson.annotation.JsonProperty("secret")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("secret represents a secret that should populate this volume. More info: https://kubernetes.io/docs/concepts/storage/volumes#secret")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.quarkiverse.argocd.v1beta1.argocdspec.repo.volumes.Secret secret;

    public io.quarkiverse.argocd.v1beta1.argocdspec.repo.volumes.Secret getSecret() {
        return secret;
    }

    public void setSecret(io.quarkiverse.argocd.v1beta1.argocdspec.repo.volumes.Secret secret) {
        this.secret = secret;
    }

    /**
     * storageOS represents a StorageOS volume attached and mounted on Kubernetes nodes.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("storageos")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("storageOS represents a StorageOS volume attached and mounted on Kubernetes nodes.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.quarkiverse.argocd.v1beta1.argocdspec.repo.volumes.Storageos storageos;

    public io.quarkiverse.argocd.v1beta1.argocdspec.repo.volumes.Storageos getStorageos() {
        return storageos;
    }

    public void setStorageos(io.quarkiverse.argocd.v1beta1.argocdspec.repo.volumes.Storageos storageos) {
        this.storageos = storageos;
    }

    /**
     * vsphereVolume represents a vSphere volume attached and mounted on kubelets host machine
     */
    @com.fasterxml.jackson.annotation.JsonProperty("vsphereVolume")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("vsphereVolume represents a vSphere volume attached and mounted on kubelets host machine")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.quarkiverse.argocd.v1beta1.argocdspec.repo.volumes.VsphereVolume vsphereVolume;

    public io.quarkiverse.argocd.v1beta1.argocdspec.repo.volumes.VsphereVolume getVsphereVolume() {
        return vsphereVolume;
    }

    public void setVsphereVolume(io.quarkiverse.argocd.v1beta1.argocdspec.repo.volumes.VsphereVolume vsphereVolume) {
        this.vsphereVolume = vsphereVolume;
    }
}
