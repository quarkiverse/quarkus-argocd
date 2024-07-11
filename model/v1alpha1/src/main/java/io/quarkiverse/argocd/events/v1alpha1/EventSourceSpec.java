package io.quarkiverse.argocd.events.v1alpha1;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.Type;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class EventSourceSpec  {

    private Map<String, AMQPEventSource> amqp;
    private Map<String, AzureEventsHubEventSource> azureEventsHub;
    private Map<String, AzureQueueStorageEventSource> azureQueueStorage;
    private Map<String, AzureServiceBusEventSource> azureServiceBus;
    private Map<String, BitbucketEventSource> bitbucket;
    private Map<String, BitbucketServerEventSource> bitbucketserver;
    private Map<String, CalendarEventSource> calendar;
    private Map<String, EmitterEventSource> emitter;
    private String eventBusName;
    private Map<String, FileEventSource> _file;
    private Map<String, GenericEventSource> generic;
    private Map<String, GerritEventSource> gerrit;
    private Map<String, GithubEventSource> github;
    private Map<String, GitlabEventSource> gitlab;
    private Map<String, HDFSEventSource> hdfs;
    private Map<String, KafkaEventSource> kafka;
    private Map<String, S3Artifact> minio;
    private Map<String, MQTTEventSource> mqtt;
    private Map<String, NATSEventsSource> nats;
    private Map<String, NSQEventSource> nsq;
    private Map<String, PubSubEventSource> pubSub;
    private Map<String, PulsarEventSource> pulsar;
    private Map<String, RedisEventSource> redis;
    private Map<String, RedisStreamEventSource> redisStream;
    private Integer replicas;
    private Map<String, ResourceEventSource> resource;
    private Service service;
    private Map<String, SFTPEventSource> sftp;
    private Map<String, SlackEventSource> slack;
    private Map<String, SNSEventSource> sns;
    private Map<String, SQSEventSource> sqs;
    private Map<String, StorageGridEventSource> storageGrid;
    private Map<String, StripeEventSource> stripe;
    private Template template;
    private Map<String, WebhookEventSource> webhook;

    /**
    * Get amqp
    * @return amqp
    **/
    @JsonProperty("amqp")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public Map<String, AMQPEventSource> getAmqp() {
        return amqp;
    }

    /**
     * Set amqp
     **/
    public void setAmqp(Map<String, AMQPEventSource> amqp) {
        this.amqp = amqp;
    }

    public EventSourceSpec amqp(Map<String, AMQPEventSource> amqp) {
        this.amqp = amqp;
        return this;
    }
    public EventSourceSpec putAmqpItem(String key, AMQPEventSource amqpItem) {
           if (this.amqp == null){
                amqp = new HashMap<>();
            }
        this.amqp.put(key, amqpItem);
        return this;
    }

    /**
    * Get azureEventsHub
    * @return azureEventsHub
    **/
    @JsonProperty("azureEventsHub")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public Map<String, AzureEventsHubEventSource> getAzureEventsHub() {
        return azureEventsHub;
    }

    /**
     * Set azureEventsHub
     **/
    public void setAzureEventsHub(Map<String, AzureEventsHubEventSource> azureEventsHub) {
        this.azureEventsHub = azureEventsHub;
    }

    public EventSourceSpec azureEventsHub(Map<String, AzureEventsHubEventSource> azureEventsHub) {
        this.azureEventsHub = azureEventsHub;
        return this;
    }
    public EventSourceSpec putAzureEventsHubItem(String key, AzureEventsHubEventSource azureEventsHubItem) {
           if (this.azureEventsHub == null){
                azureEventsHub = new HashMap<>();
            }
        this.azureEventsHub.put(key, azureEventsHubItem);
        return this;
    }

    /**
    * Get azureQueueStorage
    * @return azureQueueStorage
    **/
    @JsonProperty("azureQueueStorage")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public Map<String, AzureQueueStorageEventSource> getAzureQueueStorage() {
        return azureQueueStorage;
    }

    /**
     * Set azureQueueStorage
     **/
    public void setAzureQueueStorage(Map<String, AzureQueueStorageEventSource> azureQueueStorage) {
        this.azureQueueStorage = azureQueueStorage;
    }

    public EventSourceSpec azureQueueStorage(Map<String, AzureQueueStorageEventSource> azureQueueStorage) {
        this.azureQueueStorage = azureQueueStorage;
        return this;
    }
    public EventSourceSpec putAzureQueueStorageItem(String key, AzureQueueStorageEventSource azureQueueStorageItem) {
           if (this.azureQueueStorage == null){
                azureQueueStorage = new HashMap<>();
            }
        this.azureQueueStorage.put(key, azureQueueStorageItem);
        return this;
    }

    /**
    * Get azureServiceBus
    * @return azureServiceBus
    **/
    @JsonProperty("azureServiceBus")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public Map<String, AzureServiceBusEventSource> getAzureServiceBus() {
        return azureServiceBus;
    }

    /**
     * Set azureServiceBus
     **/
    public void setAzureServiceBus(Map<String, AzureServiceBusEventSource> azureServiceBus) {
        this.azureServiceBus = azureServiceBus;
    }

    public EventSourceSpec azureServiceBus(Map<String, AzureServiceBusEventSource> azureServiceBus) {
        this.azureServiceBus = azureServiceBus;
        return this;
    }
    public EventSourceSpec putAzureServiceBusItem(String key, AzureServiceBusEventSource azureServiceBusItem) {
           if (this.azureServiceBus == null){
                azureServiceBus = new HashMap<>();
            }
        this.azureServiceBus.put(key, azureServiceBusItem);
        return this;
    }

    /**
    * Get bitbucket
    * @return bitbucket
    **/
    @JsonProperty("bitbucket")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public Map<String, BitbucketEventSource> getBitbucket() {
        return bitbucket;
    }

    /**
     * Set bitbucket
     **/
    public void setBitbucket(Map<String, BitbucketEventSource> bitbucket) {
        this.bitbucket = bitbucket;
    }

    public EventSourceSpec bitbucket(Map<String, BitbucketEventSource> bitbucket) {
        this.bitbucket = bitbucket;
        return this;
    }
    public EventSourceSpec putBitbucketItem(String key, BitbucketEventSource bitbucketItem) {
           if (this.bitbucket == null){
                bitbucket = new HashMap<>();
            }
        this.bitbucket.put(key, bitbucketItem);
        return this;
    }

    /**
    * Get bitbucketserver
    * @return bitbucketserver
    **/
    @JsonProperty("bitbucketserver")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public Map<String, BitbucketServerEventSource> getBitbucketserver() {
        return bitbucketserver;
    }

    /**
     * Set bitbucketserver
     **/
    public void setBitbucketserver(Map<String, BitbucketServerEventSource> bitbucketserver) {
        this.bitbucketserver = bitbucketserver;
    }

    public EventSourceSpec bitbucketserver(Map<String, BitbucketServerEventSource> bitbucketserver) {
        this.bitbucketserver = bitbucketserver;
        return this;
    }
    public EventSourceSpec putBitbucketserverItem(String key, BitbucketServerEventSource bitbucketserverItem) {
           if (this.bitbucketserver == null){
                bitbucketserver = new HashMap<>();
            }
        this.bitbucketserver.put(key, bitbucketserverItem);
        return this;
    }

    /**
    * Get calendar
    * @return calendar
    **/
    @JsonProperty("calendar")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public Map<String, CalendarEventSource> getCalendar() {
        return calendar;
    }

    /**
     * Set calendar
     **/
    public void setCalendar(Map<String, CalendarEventSource> calendar) {
        this.calendar = calendar;
    }

    public EventSourceSpec calendar(Map<String, CalendarEventSource> calendar) {
        this.calendar = calendar;
        return this;
    }
    public EventSourceSpec putCalendarItem(String key, CalendarEventSource calendarItem) {
           if (this.calendar == null){
                calendar = new HashMap<>();
            }
        this.calendar.put(key, calendarItem);
        return this;
    }

    /**
    * Get emitter
    * @return emitter
    **/
    @JsonProperty("emitter")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public Map<String, EmitterEventSource> getEmitter() {
        return emitter;
    }

    /**
     * Set emitter
     **/
    public void setEmitter(Map<String, EmitterEventSource> emitter) {
        this.emitter = emitter;
    }

    public EventSourceSpec emitter(Map<String, EmitterEventSource> emitter) {
        this.emitter = emitter;
        return this;
    }
    public EventSourceSpec putEmitterItem(String key, EmitterEventSource emitterItem) {
           if (this.emitter == null){
                emitter = new HashMap<>();
            }
        this.emitter.put(key, emitterItem);
        return this;
    }

    /**
    * Get eventBusName
    * @return eventBusName
    **/
    @JsonProperty("eventBusName")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public String getEventBusName() {
        return eventBusName;
    }

    /**
     * Set eventBusName
     **/
    public void setEventBusName(String eventBusName) {
        this.eventBusName = eventBusName;
    }

    public EventSourceSpec eventBusName(String eventBusName) {
        this.eventBusName = eventBusName;
        return this;
    }

    /**
    * Get _file
    * @return _file
    **/
    @JsonProperty("file")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public Map<String, FileEventSource> getFile() {
        return _file;
    }

    /**
     * Set _file
     **/
    public void setFile(Map<String, FileEventSource> _file) {
        this._file = _file;
    }

    public EventSourceSpec _file(Map<String, FileEventSource> _file) {
        this._file = _file;
        return this;
    }
    public EventSourceSpec putFileItem(String key, FileEventSource _fileItem) {
           if (this._file == null){
                _file = new HashMap<>();
            }
        this._file.put(key, _fileItem);
        return this;
    }

    /**
    * Get generic
    * @return generic
    **/
    @JsonProperty("generic")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public Map<String, GenericEventSource> getGeneric() {
        return generic;
    }

    /**
     * Set generic
     **/
    public void setGeneric(Map<String, GenericEventSource> generic) {
        this.generic = generic;
    }

    public EventSourceSpec generic(Map<String, GenericEventSource> generic) {
        this.generic = generic;
        return this;
    }
    public EventSourceSpec putGenericItem(String key, GenericEventSource genericItem) {
           if (this.generic == null){
                generic = new HashMap<>();
            }
        this.generic.put(key, genericItem);
        return this;
    }

    /**
    * Get gerrit
    * @return gerrit
    **/
    @JsonProperty("gerrit")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public Map<String, GerritEventSource> getGerrit() {
        return gerrit;
    }

    /**
     * Set gerrit
     **/
    public void setGerrit(Map<String, GerritEventSource> gerrit) {
        this.gerrit = gerrit;
    }

    public EventSourceSpec gerrit(Map<String, GerritEventSource> gerrit) {
        this.gerrit = gerrit;
        return this;
    }
    public EventSourceSpec putGerritItem(String key, GerritEventSource gerritItem) {
           if (this.gerrit == null){
                gerrit = new HashMap<>();
            }
        this.gerrit.put(key, gerritItem);
        return this;
    }

    /**
    * Get github
    * @return github
    **/
    @JsonProperty("github")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public Map<String, GithubEventSource> getGithub() {
        return github;
    }

    /**
     * Set github
     **/
    public void setGithub(Map<String, GithubEventSource> github) {
        this.github = github;
    }

    public EventSourceSpec github(Map<String, GithubEventSource> github) {
        this.github = github;
        return this;
    }
    public EventSourceSpec putGithubItem(String key, GithubEventSource githubItem) {
           if (this.github == null){
                github = new HashMap<>();
            }
        this.github.put(key, githubItem);
        return this;
    }

    /**
    * Get gitlab
    * @return gitlab
    **/
    @JsonProperty("gitlab")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public Map<String, GitlabEventSource> getGitlab() {
        return gitlab;
    }

    /**
     * Set gitlab
     **/
    public void setGitlab(Map<String, GitlabEventSource> gitlab) {
        this.gitlab = gitlab;
    }

    public EventSourceSpec gitlab(Map<String, GitlabEventSource> gitlab) {
        this.gitlab = gitlab;
        return this;
    }
    public EventSourceSpec putGitlabItem(String key, GitlabEventSource gitlabItem) {
           if (this.gitlab == null){
                gitlab = new HashMap<>();
            }
        this.gitlab.put(key, gitlabItem);
        return this;
    }

    /**
    * Get hdfs
    * @return hdfs
    **/
    @JsonProperty("hdfs")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public Map<String, HDFSEventSource> getHdfs() {
        return hdfs;
    }

    /**
     * Set hdfs
     **/
    public void setHdfs(Map<String, HDFSEventSource> hdfs) {
        this.hdfs = hdfs;
    }

    public EventSourceSpec hdfs(Map<String, HDFSEventSource> hdfs) {
        this.hdfs = hdfs;
        return this;
    }
    public EventSourceSpec putHdfsItem(String key, HDFSEventSource hdfsItem) {
           if (this.hdfs == null){
                hdfs = new HashMap<>();
            }
        this.hdfs.put(key, hdfsItem);
        return this;
    }

    /**
    * Get kafka
    * @return kafka
    **/
    @JsonProperty("kafka")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public Map<String, KafkaEventSource> getKafka() {
        return kafka;
    }

    /**
     * Set kafka
     **/
    public void setKafka(Map<String, KafkaEventSource> kafka) {
        this.kafka = kafka;
    }

    public EventSourceSpec kafka(Map<String, KafkaEventSource> kafka) {
        this.kafka = kafka;
        return this;
    }
    public EventSourceSpec putKafkaItem(String key, KafkaEventSource kafkaItem) {
           if (this.kafka == null){
                kafka = new HashMap<>();
            }
        this.kafka.put(key, kafkaItem);
        return this;
    }

    /**
    * Get minio
    * @return minio
    **/
    @JsonProperty("minio")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public Map<String, S3Artifact> getMinio() {
        return minio;
    }

    /**
     * Set minio
     **/
    public void setMinio(Map<String, S3Artifact> minio) {
        this.minio = minio;
    }

    public EventSourceSpec minio(Map<String, S3Artifact> minio) {
        this.minio = minio;
        return this;
    }
    public EventSourceSpec putMinioItem(String key, S3Artifact minioItem) {
           if (this.minio == null){
                minio = new HashMap<>();
            }
        this.minio.put(key, minioItem);
        return this;
    }

    /**
    * Get mqtt
    * @return mqtt
    **/
    @JsonProperty("mqtt")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public Map<String, MQTTEventSource> getMqtt() {
        return mqtt;
    }

    /**
     * Set mqtt
     **/
    public void setMqtt(Map<String, MQTTEventSource> mqtt) {
        this.mqtt = mqtt;
    }

    public EventSourceSpec mqtt(Map<String, MQTTEventSource> mqtt) {
        this.mqtt = mqtt;
        return this;
    }
    public EventSourceSpec putMqttItem(String key, MQTTEventSource mqttItem) {
           if (this.mqtt == null){
                mqtt = new HashMap<>();
            }
        this.mqtt.put(key, mqttItem);
        return this;
    }

    /**
    * Get nats
    * @return nats
    **/
    @JsonProperty("nats")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public Map<String, NATSEventsSource> getNats() {
        return nats;
    }

    /**
     * Set nats
     **/
    public void setNats(Map<String, NATSEventsSource> nats) {
        this.nats = nats;
    }

    public EventSourceSpec nats(Map<String, NATSEventsSource> nats) {
        this.nats = nats;
        return this;
    }
    public EventSourceSpec putNatsItem(String key, NATSEventsSource natsItem) {
           if (this.nats == null){
                nats = new HashMap<>();
            }
        this.nats.put(key, natsItem);
        return this;
    }

    /**
    * Get nsq
    * @return nsq
    **/
    @JsonProperty("nsq")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public Map<String, NSQEventSource> getNsq() {
        return nsq;
    }

    /**
     * Set nsq
     **/
    public void setNsq(Map<String, NSQEventSource> nsq) {
        this.nsq = nsq;
    }

    public EventSourceSpec nsq(Map<String, NSQEventSource> nsq) {
        this.nsq = nsq;
        return this;
    }
    public EventSourceSpec putNsqItem(String key, NSQEventSource nsqItem) {
           if (this.nsq == null){
                nsq = new HashMap<>();
            }
        this.nsq.put(key, nsqItem);
        return this;
    }

    /**
    * Get pubSub
    * @return pubSub
    **/
    @JsonProperty("pubSub")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public Map<String, PubSubEventSource> getPubSub() {
        return pubSub;
    }

    /**
     * Set pubSub
     **/
    public void setPubSub(Map<String, PubSubEventSource> pubSub) {
        this.pubSub = pubSub;
    }

    public EventSourceSpec pubSub(Map<String, PubSubEventSource> pubSub) {
        this.pubSub = pubSub;
        return this;
    }
    public EventSourceSpec putPubSubItem(String key, PubSubEventSource pubSubItem) {
           if (this.pubSub == null){
                pubSub = new HashMap<>();
            }
        this.pubSub.put(key, pubSubItem);
        return this;
    }

    /**
    * Get pulsar
    * @return pulsar
    **/
    @JsonProperty("pulsar")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public Map<String, PulsarEventSource> getPulsar() {
        return pulsar;
    }

    /**
     * Set pulsar
     **/
    public void setPulsar(Map<String, PulsarEventSource> pulsar) {
        this.pulsar = pulsar;
    }

    public EventSourceSpec pulsar(Map<String, PulsarEventSource> pulsar) {
        this.pulsar = pulsar;
        return this;
    }
    public EventSourceSpec putPulsarItem(String key, PulsarEventSource pulsarItem) {
           if (this.pulsar == null){
                pulsar = new HashMap<>();
            }
        this.pulsar.put(key, pulsarItem);
        return this;
    }

    /**
    * Get redis
    * @return redis
    **/
    @JsonProperty("redis")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public Map<String, RedisEventSource> getRedis() {
        return redis;
    }

    /**
     * Set redis
     **/
    public void setRedis(Map<String, RedisEventSource> redis) {
        this.redis = redis;
    }

    public EventSourceSpec redis(Map<String, RedisEventSource> redis) {
        this.redis = redis;
        return this;
    }
    public EventSourceSpec putRedisItem(String key, RedisEventSource redisItem) {
           if (this.redis == null){
                redis = new HashMap<>();
            }
        this.redis.put(key, redisItem);
        return this;
    }

    /**
    * Get redisStream
    * @return redisStream
    **/
    @JsonProperty("redisStream")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public Map<String, RedisStreamEventSource> getRedisStream() {
        return redisStream;
    }

    /**
     * Set redisStream
     **/
    public void setRedisStream(Map<String, RedisStreamEventSource> redisStream) {
        this.redisStream = redisStream;
    }

    public EventSourceSpec redisStream(Map<String, RedisStreamEventSource> redisStream) {
        this.redisStream = redisStream;
        return this;
    }
    public EventSourceSpec putRedisStreamItem(String key, RedisStreamEventSource redisStreamItem) {
           if (this.redisStream == null){
                redisStream = new HashMap<>();
            }
        this.redisStream.put(key, redisStreamItem);
        return this;
    }

    /**
    * Get replicas
    * @return replicas
    **/
    @JsonProperty("replicas")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public Integer getReplicas() {
        return replicas;
    }

    /**
     * Set replicas
     **/
    public void setReplicas(Integer replicas) {
        this.replicas = replicas;
    }

    public EventSourceSpec replicas(Integer replicas) {
        this.replicas = replicas;
        return this;
    }

    /**
    * Get resource
    * @return resource
    **/
    @JsonProperty("resource")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public Map<String, ResourceEventSource> getResource() {
        return resource;
    }

    /**
     * Set resource
     **/
    public void setResource(Map<String, ResourceEventSource> resource) {
        this.resource = resource;
    }

    public EventSourceSpec resource(Map<String, ResourceEventSource> resource) {
        this.resource = resource;
        return this;
    }
    public EventSourceSpec putResourceItem(String key, ResourceEventSource resourceItem) {
           if (this.resource == null){
                resource = new HashMap<>();
            }
        this.resource.put(key, resourceItem);
        return this;
    }

    /**
    * Get service
    * @return service
    **/
    @JsonProperty("service")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public Service getService() {
        return service;
    }

    /**
     * Set service
     **/
    public void setService(Service service) {
        this.service = service;
    }

    public EventSourceSpec service(Service service) {
        this.service = service;
        return this;
    }

    /**
    * Get sftp
    * @return sftp
    **/
    @JsonProperty("sftp")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public Map<String, SFTPEventSource> getSftp() {
        return sftp;
    }

    /**
     * Set sftp
     **/
    public void setSftp(Map<String, SFTPEventSource> sftp) {
        this.sftp = sftp;
    }

    public EventSourceSpec sftp(Map<String, SFTPEventSource> sftp) {
        this.sftp = sftp;
        return this;
    }
    public EventSourceSpec putSftpItem(String key, SFTPEventSource sftpItem) {
           if (this.sftp == null){
                sftp = new HashMap<>();
            }
        this.sftp.put(key, sftpItem);
        return this;
    }

    /**
    * Get slack
    * @return slack
    **/
    @JsonProperty("slack")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public Map<String, SlackEventSource> getSlack() {
        return slack;
    }

    /**
     * Set slack
     **/
    public void setSlack(Map<String, SlackEventSource> slack) {
        this.slack = slack;
    }

    public EventSourceSpec slack(Map<String, SlackEventSource> slack) {
        this.slack = slack;
        return this;
    }
    public EventSourceSpec putSlackItem(String key, SlackEventSource slackItem) {
           if (this.slack == null){
                slack = new HashMap<>();
            }
        this.slack.put(key, slackItem);
        return this;
    }

    /**
    * Get sns
    * @return sns
    **/
    @JsonProperty("sns")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public Map<String, SNSEventSource> getSns() {
        return sns;
    }

    /**
     * Set sns
     **/
    public void setSns(Map<String, SNSEventSource> sns) {
        this.sns = sns;
    }

    public EventSourceSpec sns(Map<String, SNSEventSource> sns) {
        this.sns = sns;
        return this;
    }
    public EventSourceSpec putSnsItem(String key, SNSEventSource snsItem) {
           if (this.sns == null){
                sns = new HashMap<>();
            }
        this.sns.put(key, snsItem);
        return this;
    }

    /**
    * Get sqs
    * @return sqs
    **/
    @JsonProperty("sqs")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public Map<String, SQSEventSource> getSqs() {
        return sqs;
    }

    /**
     * Set sqs
     **/
    public void setSqs(Map<String, SQSEventSource> sqs) {
        this.sqs = sqs;
    }

    public EventSourceSpec sqs(Map<String, SQSEventSource> sqs) {
        this.sqs = sqs;
        return this;
    }
    public EventSourceSpec putSqsItem(String key, SQSEventSource sqsItem) {
           if (this.sqs == null){
                sqs = new HashMap<>();
            }
        this.sqs.put(key, sqsItem);
        return this;
    }

    /**
    * Get storageGrid
    * @return storageGrid
    **/
    @JsonProperty("storageGrid")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public Map<String, StorageGridEventSource> getStorageGrid() {
        return storageGrid;
    }

    /**
     * Set storageGrid
     **/
    public void setStorageGrid(Map<String, StorageGridEventSource> storageGrid) {
        this.storageGrid = storageGrid;
    }

    public EventSourceSpec storageGrid(Map<String, StorageGridEventSource> storageGrid) {
        this.storageGrid = storageGrid;
        return this;
    }
    public EventSourceSpec putStorageGridItem(String key, StorageGridEventSource storageGridItem) {
           if (this.storageGrid == null){
                storageGrid = new HashMap<>();
            }
        this.storageGrid.put(key, storageGridItem);
        return this;
    }

    /**
    * Get stripe
    * @return stripe
    **/
    @JsonProperty("stripe")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public Map<String, StripeEventSource> getStripe() {
        return stripe;
    }

    /**
     * Set stripe
     **/
    public void setStripe(Map<String, StripeEventSource> stripe) {
        this.stripe = stripe;
    }

    public EventSourceSpec stripe(Map<String, StripeEventSource> stripe) {
        this.stripe = stripe;
        return this;
    }
    public EventSourceSpec putStripeItem(String key, StripeEventSource stripeItem) {
           if (this.stripe == null){
                stripe = new HashMap<>();
            }
        this.stripe.put(key, stripeItem);
        return this;
    }

    /**
    * Get template
    * @return template
    **/
    @JsonProperty("template")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public Template getTemplate() {
        return template;
    }

    /**
     * Set template
     **/
    public void setTemplate(Template template) {
        this.template = template;
    }

    public EventSourceSpec template(Template template) {
        this.template = template;
        return this;
    }

    /**
    * Get webhook
    * @return webhook
    **/
    @JsonProperty("webhook")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public Map<String, WebhookEventSource> getWebhook() {
        return webhook;
    }

    /**
     * Set webhook
     **/
    public void setWebhook(Map<String, WebhookEventSource> webhook) {
        this.webhook = webhook;
    }

    public EventSourceSpec webhook(Map<String, WebhookEventSource> webhook) {
        this.webhook = webhook;
        return this;
    }
    public EventSourceSpec putWebhookItem(String key, WebhookEventSource webhookItem) {
           if (this.webhook == null){
                webhook = new HashMap<>();
            }
        this.webhook.put(key, webhookItem);
        return this;
    }

    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class EventSourceSpec {\n");

        sb.append("    amqp: ").append(toIndentedString(amqp)).append("\n");
        sb.append("    azureEventsHub: ").append(toIndentedString(azureEventsHub)).append("\n");
        sb.append("    azureQueueStorage: ").append(toIndentedString(azureQueueStorage)).append("\n");
        sb.append("    azureServiceBus: ").append(toIndentedString(azureServiceBus)).append("\n");
        sb.append("    bitbucket: ").append(toIndentedString(bitbucket)).append("\n");
        sb.append("    bitbucketserver: ").append(toIndentedString(bitbucketserver)).append("\n");
        sb.append("    calendar: ").append(toIndentedString(calendar)).append("\n");
        sb.append("    emitter: ").append(toIndentedString(emitter)).append("\n");
        sb.append("    eventBusName: ").append(toIndentedString(eventBusName)).append("\n");
        sb.append("    _file: ").append(toIndentedString(_file)).append("\n");
        sb.append("    generic: ").append(toIndentedString(generic)).append("\n");
        sb.append("    gerrit: ").append(toIndentedString(gerrit)).append("\n");
        sb.append("    github: ").append(toIndentedString(github)).append("\n");
        sb.append("    gitlab: ").append(toIndentedString(gitlab)).append("\n");
        sb.append("    hdfs: ").append(toIndentedString(hdfs)).append("\n");
        sb.append("    kafka: ").append(toIndentedString(kafka)).append("\n");
        sb.append("    minio: ").append(toIndentedString(minio)).append("\n");
        sb.append("    mqtt: ").append(toIndentedString(mqtt)).append("\n");
        sb.append("    nats: ").append(toIndentedString(nats)).append("\n");
        sb.append("    nsq: ").append(toIndentedString(nsq)).append("\n");
        sb.append("    pubSub: ").append(toIndentedString(pubSub)).append("\n");
        sb.append("    pulsar: ").append(toIndentedString(pulsar)).append("\n");
        sb.append("    redis: ").append(toIndentedString(redis)).append("\n");
        sb.append("    redisStream: ").append(toIndentedString(redisStream)).append("\n");
        sb.append("    replicas: ").append(toIndentedString(replicas)).append("\n");
        sb.append("    resource: ").append(toIndentedString(resource)).append("\n");
        sb.append("    service: ").append(toIndentedString(service)).append("\n");
        sb.append("    sftp: ").append(toIndentedString(sftp)).append("\n");
        sb.append("    slack: ").append(toIndentedString(slack)).append("\n");
        sb.append("    sns: ").append(toIndentedString(sns)).append("\n");
        sb.append("    sqs: ").append(toIndentedString(sqs)).append("\n");
        sb.append("    storageGrid: ").append(toIndentedString(storageGrid)).append("\n");
        sb.append("    stripe: ").append(toIndentedString(stripe)).append("\n");
        sb.append("    template: ").append(toIndentedString(template)).append("\n");
        sb.append("    webhook: ").append(toIndentedString(webhook)).append("\n");
        
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
    public static class EventSourceSpecQueryParam  {

        @jakarta.ws.rs.QueryParam("amqp")
        private Map<String, AMQPEventSource> amqp = null;
        @jakarta.ws.rs.QueryParam("azureEventsHub")
        private Map<String, AzureEventsHubEventSource> azureEventsHub = null;
        @jakarta.ws.rs.QueryParam("azureQueueStorage")
        private Map<String, AzureQueueStorageEventSource> azureQueueStorage = null;
        @jakarta.ws.rs.QueryParam("azureServiceBus")
        private Map<String, AzureServiceBusEventSource> azureServiceBus = null;
        @jakarta.ws.rs.QueryParam("bitbucket")
        private Map<String, BitbucketEventSource> bitbucket = null;
        @jakarta.ws.rs.QueryParam("bitbucketserver")
        private Map<String, BitbucketServerEventSource> bitbucketserver = null;
        @jakarta.ws.rs.QueryParam("calendar")
        private Map<String, CalendarEventSource> calendar = null;
        @jakarta.ws.rs.QueryParam("emitter")
        private Map<String, EmitterEventSource> emitter = null;
        @jakarta.ws.rs.QueryParam("eventBusName")
        private String eventBusName;
        @jakarta.ws.rs.QueryParam("_file")
        private Map<String, FileEventSource> _file = null;
        @jakarta.ws.rs.QueryParam("generic")
        private Map<String, GenericEventSource> generic = null;
        @jakarta.ws.rs.QueryParam("gerrit")
        private Map<String, GerritEventSource> gerrit = null;
        @jakarta.ws.rs.QueryParam("github")
        private Map<String, GithubEventSource> github = null;
        @jakarta.ws.rs.QueryParam("gitlab")
        private Map<String, GitlabEventSource> gitlab = null;
        @jakarta.ws.rs.QueryParam("hdfs")
        private Map<String, HDFSEventSource> hdfs = null;
        @jakarta.ws.rs.QueryParam("kafka")
        private Map<String, KafkaEventSource> kafka = null;
        @jakarta.ws.rs.QueryParam("minio")
        private Map<String, S3Artifact> minio = null;
        @jakarta.ws.rs.QueryParam("mqtt")
        private Map<String, MQTTEventSource> mqtt = null;
        @jakarta.ws.rs.QueryParam("nats")
        private Map<String, NATSEventsSource> nats = null;
        @jakarta.ws.rs.QueryParam("nsq")
        private Map<String, NSQEventSource> nsq = null;
        @jakarta.ws.rs.QueryParam("pubSub")
        private Map<String, PubSubEventSource> pubSub = null;
        @jakarta.ws.rs.QueryParam("pulsar")
        private Map<String, PulsarEventSource> pulsar = null;
        @jakarta.ws.rs.QueryParam("redis")
        private Map<String, RedisEventSource> redis = null;
        @jakarta.ws.rs.QueryParam("redisStream")
        private Map<String, RedisStreamEventSource> redisStream = null;
        @jakarta.ws.rs.QueryParam("replicas")
        private Integer replicas;
        @jakarta.ws.rs.QueryParam("resource")
        private Map<String, ResourceEventSource> resource = null;
        @jakarta.ws.rs.QueryParam("service")
        private Service service;
        @jakarta.ws.rs.QueryParam("sftp")
        private Map<String, SFTPEventSource> sftp = null;
        @jakarta.ws.rs.QueryParam("slack")
        private Map<String, SlackEventSource> slack = null;
        @jakarta.ws.rs.QueryParam("sns")
        private Map<String, SNSEventSource> sns = null;
        @jakarta.ws.rs.QueryParam("sqs")
        private Map<String, SQSEventSource> sqs = null;
        @jakarta.ws.rs.QueryParam("storageGrid")
        private Map<String, StorageGridEventSource> storageGrid = null;
        @jakarta.ws.rs.QueryParam("stripe")
        private Map<String, StripeEventSource> stripe = null;
        @jakarta.ws.rs.QueryParam("template")
        private Template template;
        @jakarta.ws.rs.QueryParam("webhook")
        private Map<String, WebhookEventSource> webhook = null;

        /**
        * Get amqp
        * @return amqp
        **/
        @JsonProperty("amqp")
        public Map<String, AMQPEventSource> getAmqp() {
            return amqp;
        }

        /**
         * Set amqp
         **/
        public void setAmqp(Map<String, AMQPEventSource> amqp) {
            this.amqp = amqp;
        }

        public EventSourceSpecQueryParam amqp(Map<String, AMQPEventSource> amqp) {
            this.amqp = amqp;
            return this;
        }
        public EventSourceSpecQueryParam putAmqpItem(String key, AMQPEventSource amqpItem) {
            this.amqp.put(key, amqpItem);
            return this;
        }

        /**
        * Get azureEventsHub
        * @return azureEventsHub
        **/
        @JsonProperty("azureEventsHub")
        public Map<String, AzureEventsHubEventSource> getAzureEventsHub() {
            return azureEventsHub;
        }

        /**
         * Set azureEventsHub
         **/
        public void setAzureEventsHub(Map<String, AzureEventsHubEventSource> azureEventsHub) {
            this.azureEventsHub = azureEventsHub;
        }

        public EventSourceSpecQueryParam azureEventsHub(Map<String, AzureEventsHubEventSource> azureEventsHub) {
            this.azureEventsHub = azureEventsHub;
            return this;
        }
        public EventSourceSpecQueryParam putAzureEventsHubItem(String key, AzureEventsHubEventSource azureEventsHubItem) {
            this.azureEventsHub.put(key, azureEventsHubItem);
            return this;
        }

        /**
        * Get azureQueueStorage
        * @return azureQueueStorage
        **/
        @JsonProperty("azureQueueStorage")
        public Map<String, AzureQueueStorageEventSource> getAzureQueueStorage() {
            return azureQueueStorage;
        }

        /**
         * Set azureQueueStorage
         **/
        public void setAzureQueueStorage(Map<String, AzureQueueStorageEventSource> azureQueueStorage) {
            this.azureQueueStorage = azureQueueStorage;
        }

        public EventSourceSpecQueryParam azureQueueStorage(Map<String, AzureQueueStorageEventSource> azureQueueStorage) {
            this.azureQueueStorage = azureQueueStorage;
            return this;
        }
        public EventSourceSpecQueryParam putAzureQueueStorageItem(String key, AzureQueueStorageEventSource azureQueueStorageItem) {
            this.azureQueueStorage.put(key, azureQueueStorageItem);
            return this;
        }

        /**
        * Get azureServiceBus
        * @return azureServiceBus
        **/
        @JsonProperty("azureServiceBus")
        public Map<String, AzureServiceBusEventSource> getAzureServiceBus() {
            return azureServiceBus;
        }

        /**
         * Set azureServiceBus
         **/
        public void setAzureServiceBus(Map<String, AzureServiceBusEventSource> azureServiceBus) {
            this.azureServiceBus = azureServiceBus;
        }

        public EventSourceSpecQueryParam azureServiceBus(Map<String, AzureServiceBusEventSource> azureServiceBus) {
            this.azureServiceBus = azureServiceBus;
            return this;
        }
        public EventSourceSpecQueryParam putAzureServiceBusItem(String key, AzureServiceBusEventSource azureServiceBusItem) {
            this.azureServiceBus.put(key, azureServiceBusItem);
            return this;
        }

        /**
        * Get bitbucket
        * @return bitbucket
        **/
        @JsonProperty("bitbucket")
        public Map<String, BitbucketEventSource> getBitbucket() {
            return bitbucket;
        }

        /**
         * Set bitbucket
         **/
        public void setBitbucket(Map<String, BitbucketEventSource> bitbucket) {
            this.bitbucket = bitbucket;
        }

        public EventSourceSpecQueryParam bitbucket(Map<String, BitbucketEventSource> bitbucket) {
            this.bitbucket = bitbucket;
            return this;
        }
        public EventSourceSpecQueryParam putBitbucketItem(String key, BitbucketEventSource bitbucketItem) {
            this.bitbucket.put(key, bitbucketItem);
            return this;
        }

        /**
        * Get bitbucketserver
        * @return bitbucketserver
        **/
        @JsonProperty("bitbucketserver")
        public Map<String, BitbucketServerEventSource> getBitbucketserver() {
            return bitbucketserver;
        }

        /**
         * Set bitbucketserver
         **/
        public void setBitbucketserver(Map<String, BitbucketServerEventSource> bitbucketserver) {
            this.bitbucketserver = bitbucketserver;
        }

        public EventSourceSpecQueryParam bitbucketserver(Map<String, BitbucketServerEventSource> bitbucketserver) {
            this.bitbucketserver = bitbucketserver;
            return this;
        }
        public EventSourceSpecQueryParam putBitbucketserverItem(String key, BitbucketServerEventSource bitbucketserverItem) {
            this.bitbucketserver.put(key, bitbucketserverItem);
            return this;
        }

        /**
        * Get calendar
        * @return calendar
        **/
        @JsonProperty("calendar")
        public Map<String, CalendarEventSource> getCalendar() {
            return calendar;
        }

        /**
         * Set calendar
         **/
        public void setCalendar(Map<String, CalendarEventSource> calendar) {
            this.calendar = calendar;
        }

        public EventSourceSpecQueryParam calendar(Map<String, CalendarEventSource> calendar) {
            this.calendar = calendar;
            return this;
        }
        public EventSourceSpecQueryParam putCalendarItem(String key, CalendarEventSource calendarItem) {
            this.calendar.put(key, calendarItem);
            return this;
        }

        /**
        * Get emitter
        * @return emitter
        **/
        @JsonProperty("emitter")
        public Map<String, EmitterEventSource> getEmitter() {
            return emitter;
        }

        /**
         * Set emitter
         **/
        public void setEmitter(Map<String, EmitterEventSource> emitter) {
            this.emitter = emitter;
        }

        public EventSourceSpecQueryParam emitter(Map<String, EmitterEventSource> emitter) {
            this.emitter = emitter;
            return this;
        }
        public EventSourceSpecQueryParam putEmitterItem(String key, EmitterEventSource emitterItem) {
            this.emitter.put(key, emitterItem);
            return this;
        }

        /**
        * Get eventBusName
        * @return eventBusName
        **/
        @JsonProperty("eventBusName")
        public String getEventBusName() {
            return eventBusName;
        }

        /**
         * Set eventBusName
         **/
        public void setEventBusName(String eventBusName) {
            this.eventBusName = eventBusName;
        }

        public EventSourceSpecQueryParam eventBusName(String eventBusName) {
            this.eventBusName = eventBusName;
            return this;
        }

        /**
        * Get _file
        * @return _file
        **/
        @JsonProperty("file")
        public Map<String, FileEventSource> getFile() {
            return _file;
        }

        /**
         * Set _file
         **/
        public void setFile(Map<String, FileEventSource> _file) {
            this._file = _file;
        }

        public EventSourceSpecQueryParam _file(Map<String, FileEventSource> _file) {
            this._file = _file;
            return this;
        }
        public EventSourceSpecQueryParam putFileItem(String key, FileEventSource _fileItem) {
            this._file.put(key, _fileItem);
            return this;
        }

        /**
        * Get generic
        * @return generic
        **/
        @JsonProperty("generic")
        public Map<String, GenericEventSource> getGeneric() {
            return generic;
        }

        /**
         * Set generic
         **/
        public void setGeneric(Map<String, GenericEventSource> generic) {
            this.generic = generic;
        }

        public EventSourceSpecQueryParam generic(Map<String, GenericEventSource> generic) {
            this.generic = generic;
            return this;
        }
        public EventSourceSpecQueryParam putGenericItem(String key, GenericEventSource genericItem) {
            this.generic.put(key, genericItem);
            return this;
        }

        /**
        * Get gerrit
        * @return gerrit
        **/
        @JsonProperty("gerrit")
        public Map<String, GerritEventSource> getGerrit() {
            return gerrit;
        }

        /**
         * Set gerrit
         **/
        public void setGerrit(Map<String, GerritEventSource> gerrit) {
            this.gerrit = gerrit;
        }

        public EventSourceSpecQueryParam gerrit(Map<String, GerritEventSource> gerrit) {
            this.gerrit = gerrit;
            return this;
        }
        public EventSourceSpecQueryParam putGerritItem(String key, GerritEventSource gerritItem) {
            this.gerrit.put(key, gerritItem);
            return this;
        }

        /**
        * Get github
        * @return github
        **/
        @JsonProperty("github")
        public Map<String, GithubEventSource> getGithub() {
            return github;
        }

        /**
         * Set github
         **/
        public void setGithub(Map<String, GithubEventSource> github) {
            this.github = github;
        }

        public EventSourceSpecQueryParam github(Map<String, GithubEventSource> github) {
            this.github = github;
            return this;
        }
        public EventSourceSpecQueryParam putGithubItem(String key, GithubEventSource githubItem) {
            this.github.put(key, githubItem);
            return this;
        }

        /**
        * Get gitlab
        * @return gitlab
        **/
        @JsonProperty("gitlab")
        public Map<String, GitlabEventSource> getGitlab() {
            return gitlab;
        }

        /**
         * Set gitlab
         **/
        public void setGitlab(Map<String, GitlabEventSource> gitlab) {
            this.gitlab = gitlab;
        }

        public EventSourceSpecQueryParam gitlab(Map<String, GitlabEventSource> gitlab) {
            this.gitlab = gitlab;
            return this;
        }
        public EventSourceSpecQueryParam putGitlabItem(String key, GitlabEventSource gitlabItem) {
            this.gitlab.put(key, gitlabItem);
            return this;
        }

        /**
        * Get hdfs
        * @return hdfs
        **/
        @JsonProperty("hdfs")
        public Map<String, HDFSEventSource> getHdfs() {
            return hdfs;
        }

        /**
         * Set hdfs
         **/
        public void setHdfs(Map<String, HDFSEventSource> hdfs) {
            this.hdfs = hdfs;
        }

        public EventSourceSpecQueryParam hdfs(Map<String, HDFSEventSource> hdfs) {
            this.hdfs = hdfs;
            return this;
        }
        public EventSourceSpecQueryParam putHdfsItem(String key, HDFSEventSource hdfsItem) {
            this.hdfs.put(key, hdfsItem);
            return this;
        }

        /**
        * Get kafka
        * @return kafka
        **/
        @JsonProperty("kafka")
        public Map<String, KafkaEventSource> getKafka() {
            return kafka;
        }

        /**
         * Set kafka
         **/
        public void setKafka(Map<String, KafkaEventSource> kafka) {
            this.kafka = kafka;
        }

        public EventSourceSpecQueryParam kafka(Map<String, KafkaEventSource> kafka) {
            this.kafka = kafka;
            return this;
        }
        public EventSourceSpecQueryParam putKafkaItem(String key, KafkaEventSource kafkaItem) {
            this.kafka.put(key, kafkaItem);
            return this;
        }

        /**
        * Get minio
        * @return minio
        **/
        @JsonProperty("minio")
        public Map<String, S3Artifact> getMinio() {
            return minio;
        }

        /**
         * Set minio
         **/
        public void setMinio(Map<String, S3Artifact> minio) {
            this.minio = minio;
        }

        public EventSourceSpecQueryParam minio(Map<String, S3Artifact> minio) {
            this.minio = minio;
            return this;
        }
        public EventSourceSpecQueryParam putMinioItem(String key, S3Artifact minioItem) {
            this.minio.put(key, minioItem);
            return this;
        }

        /**
        * Get mqtt
        * @return mqtt
        **/
        @JsonProperty("mqtt")
        public Map<String, MQTTEventSource> getMqtt() {
            return mqtt;
        }

        /**
         * Set mqtt
         **/
        public void setMqtt(Map<String, MQTTEventSource> mqtt) {
            this.mqtt = mqtt;
        }

        public EventSourceSpecQueryParam mqtt(Map<String, MQTTEventSource> mqtt) {
            this.mqtt = mqtt;
            return this;
        }
        public EventSourceSpecQueryParam putMqttItem(String key, MQTTEventSource mqttItem) {
            this.mqtt.put(key, mqttItem);
            return this;
        }

        /**
        * Get nats
        * @return nats
        **/
        @JsonProperty("nats")
        public Map<String, NATSEventsSource> getNats() {
            return nats;
        }

        /**
         * Set nats
         **/
        public void setNats(Map<String, NATSEventsSource> nats) {
            this.nats = nats;
        }

        public EventSourceSpecQueryParam nats(Map<String, NATSEventsSource> nats) {
            this.nats = nats;
            return this;
        }
        public EventSourceSpecQueryParam putNatsItem(String key, NATSEventsSource natsItem) {
            this.nats.put(key, natsItem);
            return this;
        }

        /**
        * Get nsq
        * @return nsq
        **/
        @JsonProperty("nsq")
        public Map<String, NSQEventSource> getNsq() {
            return nsq;
        }

        /**
         * Set nsq
         **/
        public void setNsq(Map<String, NSQEventSource> nsq) {
            this.nsq = nsq;
        }

        public EventSourceSpecQueryParam nsq(Map<String, NSQEventSource> nsq) {
            this.nsq = nsq;
            return this;
        }
        public EventSourceSpecQueryParam putNsqItem(String key, NSQEventSource nsqItem) {
            this.nsq.put(key, nsqItem);
            return this;
        }

        /**
        * Get pubSub
        * @return pubSub
        **/
        @JsonProperty("pubSub")
        public Map<String, PubSubEventSource> getPubSub() {
            return pubSub;
        }

        /**
         * Set pubSub
         **/
        public void setPubSub(Map<String, PubSubEventSource> pubSub) {
            this.pubSub = pubSub;
        }

        public EventSourceSpecQueryParam pubSub(Map<String, PubSubEventSource> pubSub) {
            this.pubSub = pubSub;
            return this;
        }
        public EventSourceSpecQueryParam putPubSubItem(String key, PubSubEventSource pubSubItem) {
            this.pubSub.put(key, pubSubItem);
            return this;
        }

        /**
        * Get pulsar
        * @return pulsar
        **/
        @JsonProperty("pulsar")
        public Map<String, PulsarEventSource> getPulsar() {
            return pulsar;
        }

        /**
         * Set pulsar
         **/
        public void setPulsar(Map<String, PulsarEventSource> pulsar) {
            this.pulsar = pulsar;
        }

        public EventSourceSpecQueryParam pulsar(Map<String, PulsarEventSource> pulsar) {
            this.pulsar = pulsar;
            return this;
        }
        public EventSourceSpecQueryParam putPulsarItem(String key, PulsarEventSource pulsarItem) {
            this.pulsar.put(key, pulsarItem);
            return this;
        }

        /**
        * Get redis
        * @return redis
        **/
        @JsonProperty("redis")
        public Map<String, RedisEventSource> getRedis() {
            return redis;
        }

        /**
         * Set redis
         **/
        public void setRedis(Map<String, RedisEventSource> redis) {
            this.redis = redis;
        }

        public EventSourceSpecQueryParam redis(Map<String, RedisEventSource> redis) {
            this.redis = redis;
            return this;
        }
        public EventSourceSpecQueryParam putRedisItem(String key, RedisEventSource redisItem) {
            this.redis.put(key, redisItem);
            return this;
        }

        /**
        * Get redisStream
        * @return redisStream
        **/
        @JsonProperty("redisStream")
        public Map<String, RedisStreamEventSource> getRedisStream() {
            return redisStream;
        }

        /**
         * Set redisStream
         **/
        public void setRedisStream(Map<String, RedisStreamEventSource> redisStream) {
            this.redisStream = redisStream;
        }

        public EventSourceSpecQueryParam redisStream(Map<String, RedisStreamEventSource> redisStream) {
            this.redisStream = redisStream;
            return this;
        }
        public EventSourceSpecQueryParam putRedisStreamItem(String key, RedisStreamEventSource redisStreamItem) {
            this.redisStream.put(key, redisStreamItem);
            return this;
        }

        /**
        * Get replicas
        * @return replicas
        **/
        @JsonProperty("replicas")
        public Integer getReplicas() {
            return replicas;
        }

        /**
         * Set replicas
         **/
        public void setReplicas(Integer replicas) {
            this.replicas = replicas;
        }

        public EventSourceSpecQueryParam replicas(Integer replicas) {
            this.replicas = replicas;
            return this;
        }

        /**
        * Get resource
        * @return resource
        **/
        @JsonProperty("resource")
        public Map<String, ResourceEventSource> getResource() {
            return resource;
        }

        /**
         * Set resource
         **/
        public void setResource(Map<String, ResourceEventSource> resource) {
            this.resource = resource;
        }

        public EventSourceSpecQueryParam resource(Map<String, ResourceEventSource> resource) {
            this.resource = resource;
            return this;
        }
        public EventSourceSpecQueryParam putResourceItem(String key, ResourceEventSource resourceItem) {
            this.resource.put(key, resourceItem);
            return this;
        }

        /**
        * Get service
        * @return service
        **/
        @JsonProperty("service")
        public Service getService() {
            return service;
        }

        /**
         * Set service
         **/
        public void setService(Service service) {
            this.service = service;
        }

        public EventSourceSpecQueryParam service(Service service) {
            this.service = service;
            return this;
        }

        /**
        * Get sftp
        * @return sftp
        **/
        @JsonProperty("sftp")
        public Map<String, SFTPEventSource> getSftp() {
            return sftp;
        }

        /**
         * Set sftp
         **/
        public void setSftp(Map<String, SFTPEventSource> sftp) {
            this.sftp = sftp;
        }

        public EventSourceSpecQueryParam sftp(Map<String, SFTPEventSource> sftp) {
            this.sftp = sftp;
            return this;
        }
        public EventSourceSpecQueryParam putSftpItem(String key, SFTPEventSource sftpItem) {
            this.sftp.put(key, sftpItem);
            return this;
        }

        /**
        * Get slack
        * @return slack
        **/
        @JsonProperty("slack")
        public Map<String, SlackEventSource> getSlack() {
            return slack;
        }

        /**
         * Set slack
         **/
        public void setSlack(Map<String, SlackEventSource> slack) {
            this.slack = slack;
        }

        public EventSourceSpecQueryParam slack(Map<String, SlackEventSource> slack) {
            this.slack = slack;
            return this;
        }
        public EventSourceSpecQueryParam putSlackItem(String key, SlackEventSource slackItem) {
            this.slack.put(key, slackItem);
            return this;
        }

        /**
        * Get sns
        * @return sns
        **/
        @JsonProperty("sns")
        public Map<String, SNSEventSource> getSns() {
            return sns;
        }

        /**
         * Set sns
         **/
        public void setSns(Map<String, SNSEventSource> sns) {
            this.sns = sns;
        }

        public EventSourceSpecQueryParam sns(Map<String, SNSEventSource> sns) {
            this.sns = sns;
            return this;
        }
        public EventSourceSpecQueryParam putSnsItem(String key, SNSEventSource snsItem) {
            this.sns.put(key, snsItem);
            return this;
        }

        /**
        * Get sqs
        * @return sqs
        **/
        @JsonProperty("sqs")
        public Map<String, SQSEventSource> getSqs() {
            return sqs;
        }

        /**
         * Set sqs
         **/
        public void setSqs(Map<String, SQSEventSource> sqs) {
            this.sqs = sqs;
        }

        public EventSourceSpecQueryParam sqs(Map<String, SQSEventSource> sqs) {
            this.sqs = sqs;
            return this;
        }
        public EventSourceSpecQueryParam putSqsItem(String key, SQSEventSource sqsItem) {
            this.sqs.put(key, sqsItem);
            return this;
        }

        /**
        * Get storageGrid
        * @return storageGrid
        **/
        @JsonProperty("storageGrid")
        public Map<String, StorageGridEventSource> getStorageGrid() {
            return storageGrid;
        }

        /**
         * Set storageGrid
         **/
        public void setStorageGrid(Map<String, StorageGridEventSource> storageGrid) {
            this.storageGrid = storageGrid;
        }

        public EventSourceSpecQueryParam storageGrid(Map<String, StorageGridEventSource> storageGrid) {
            this.storageGrid = storageGrid;
            return this;
        }
        public EventSourceSpecQueryParam putStorageGridItem(String key, StorageGridEventSource storageGridItem) {
            this.storageGrid.put(key, storageGridItem);
            return this;
        }

        /**
        * Get stripe
        * @return stripe
        **/
        @JsonProperty("stripe")
        public Map<String, StripeEventSource> getStripe() {
            return stripe;
        }

        /**
         * Set stripe
         **/
        public void setStripe(Map<String, StripeEventSource> stripe) {
            this.stripe = stripe;
        }

        public EventSourceSpecQueryParam stripe(Map<String, StripeEventSource> stripe) {
            this.stripe = stripe;
            return this;
        }
        public EventSourceSpecQueryParam putStripeItem(String key, StripeEventSource stripeItem) {
            this.stripe.put(key, stripeItem);
            return this;
        }

        /**
        * Get template
        * @return template
        **/
        @JsonProperty("template")
        public Template getTemplate() {
            return template;
        }

        /**
         * Set template
         **/
        public void setTemplate(Template template) {
            this.template = template;
        }

        public EventSourceSpecQueryParam template(Template template) {
            this.template = template;
            return this;
        }

        /**
        * Get webhook
        * @return webhook
        **/
        @JsonProperty("webhook")
        public Map<String, WebhookEventSource> getWebhook() {
            return webhook;
        }

        /**
         * Set webhook
         **/
        public void setWebhook(Map<String, WebhookEventSource> webhook) {
            this.webhook = webhook;
        }

        public EventSourceSpecQueryParam webhook(Map<String, WebhookEventSource> webhook) {
            this.webhook = webhook;
            return this;
        }
        public EventSourceSpecQueryParam putWebhookItem(String key, WebhookEventSource webhookItem) {
            this.webhook.put(key, webhookItem);
            return this;
        }

        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class EventSourceSpecQueryParam {\n");

            sb.append("    amqp: ").append(toIndentedString(amqp)).append("\n");
            sb.append("    azureEventsHub: ").append(toIndentedString(azureEventsHub)).append("\n");
            sb.append("    azureQueueStorage: ").append(toIndentedString(azureQueueStorage)).append("\n");
            sb.append("    azureServiceBus: ").append(toIndentedString(azureServiceBus)).append("\n");
            sb.append("    bitbucket: ").append(toIndentedString(bitbucket)).append("\n");
            sb.append("    bitbucketserver: ").append(toIndentedString(bitbucketserver)).append("\n");
            sb.append("    calendar: ").append(toIndentedString(calendar)).append("\n");
            sb.append("    emitter: ").append(toIndentedString(emitter)).append("\n");
            sb.append("    eventBusName: ").append(toIndentedString(eventBusName)).append("\n");
            sb.append("    _file: ").append(toIndentedString(_file)).append("\n");
            sb.append("    generic: ").append(toIndentedString(generic)).append("\n");
            sb.append("    gerrit: ").append(toIndentedString(gerrit)).append("\n");
            sb.append("    github: ").append(toIndentedString(github)).append("\n");
            sb.append("    gitlab: ").append(toIndentedString(gitlab)).append("\n");
            sb.append("    hdfs: ").append(toIndentedString(hdfs)).append("\n");
            sb.append("    kafka: ").append(toIndentedString(kafka)).append("\n");
            sb.append("    minio: ").append(toIndentedString(minio)).append("\n");
            sb.append("    mqtt: ").append(toIndentedString(mqtt)).append("\n");
            sb.append("    nats: ").append(toIndentedString(nats)).append("\n");
            sb.append("    nsq: ").append(toIndentedString(nsq)).append("\n");
            sb.append("    pubSub: ").append(toIndentedString(pubSub)).append("\n");
            sb.append("    pulsar: ").append(toIndentedString(pulsar)).append("\n");
            sb.append("    redis: ").append(toIndentedString(redis)).append("\n");
            sb.append("    redisStream: ").append(toIndentedString(redisStream)).append("\n");
            sb.append("    replicas: ").append(toIndentedString(replicas)).append("\n");
            sb.append("    resource: ").append(toIndentedString(resource)).append("\n");
            sb.append("    service: ").append(toIndentedString(service)).append("\n");
            sb.append("    sftp: ").append(toIndentedString(sftp)).append("\n");
            sb.append("    slack: ").append(toIndentedString(slack)).append("\n");
            sb.append("    sns: ").append(toIndentedString(sns)).append("\n");
            sb.append("    sqs: ").append(toIndentedString(sqs)).append("\n");
            sb.append("    storageGrid: ").append(toIndentedString(storageGrid)).append("\n");
            sb.append("    stripe: ").append(toIndentedString(stripe)).append("\n");
            sb.append("    template: ").append(toIndentedString(template)).append("\n");
            sb.append("    webhook: ").append(toIndentedString(webhook)).append("\n");
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
