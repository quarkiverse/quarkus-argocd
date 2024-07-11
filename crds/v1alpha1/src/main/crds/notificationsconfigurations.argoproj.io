apiVersion: apiextensions.k8s.io/v1
kind: CustomResourceDefinition
metadata:
  annotations:
    controller-gen.kubebuilder.io/version: v0.6.1
    operatorframework.io/installed-alongside-916b5c41539597da: openshift-gitops-operator/openshift-gitops-operator.v1.12.4
    operatorframework.io/installed-alongside-9ae07b41592a6095: openshift-gitops-operator/openshift-gitops-operator.v1.13.0
  creationTimestamp: "2024-06-25T14:20:10Z"
  generation: 1
  labels:
    olm.managed: "true"
    operators.coreos.com/openshift-gitops-operator.openshift-gitops-operator: ""
  name: notificationsconfigurations.argoproj.io
  resourceVersion: "18541677"
  uid: ee449189-49c0-4de1-9362-1e27da827283
spec:
  conversion:
    strategy: None
  group: argoproj.io
  names:
    kind: NotificationsConfiguration
    listKind: NotificationsConfigurationList
    plural: notificationsconfigurations
    singular: notificationsconfiguration
  scope: Namespaced
  versions:
  - name: v1alpha1
    schema:
      openAPIV3Schema:
        description: NotificationsConfiguration is the Schema for the NotificationsConfiguration
          API
        properties:
          apiVersion:
            description: 'APIVersion defines the versioned schema of this representation
              of an object. Servers should convert recognized schemas to the latest
              internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources'
            type: string
          kind:
            description: 'Kind is a string value representing the REST resource this
              object represents. Servers may infer this from the endpoint the client
              submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds'
            type: string
          metadata:
            type: object
          spec:
            description: NotificationsConfigurationSpec allows users to define the
              triggers, templates, services, context and subscriptions for the notifications
            properties:
              context:
                additionalProperties:
                  type: string
                description: Context is used to define some shared context between
                  all notification templates
                type: object
              services:
                additionalProperties:
                  type: string
                description: Services are used to deliver message
                type: object
              subscriptions:
                additionalProperties:
                  type: string
                description: Subscriptions contain centrally managed global application
                  subscriptions
                type: object
              templates:
                additionalProperties:
                  type: string
                description: Templates are used to generate the notification template
                  message
                type: object
              triggers:
                additionalProperties:
                  type: string
                description: Triggers define the condition when the notification should
                  be sent and list of templates required to generate the message Recipients
                  can subscribe to the trigger and specify the required message template
                  and destination notification service.
                type: object
            type: object
        type: object
    served: true
    storage: true
    subresources:
      status: {}
status:
  acceptedNames:
    kind: NotificationsConfiguration
    listKind: NotificationsConfigurationList
    plural: notificationsconfigurations
    singular: notificationsconfiguration
  conditions:
  - lastTransitionTime: "2024-06-25T14:20:11Z"
    message: no conflicts found
    reason: NoConflicts
    status: "True"
    type: NamesAccepted
  - lastTransitionTime: "2024-06-25T14:20:11Z"
    message: the initial names have been accepted
    reason: InitialNamesAccepted
    status: "True"
    type: Established
  storedVersions:
  - v1alpha1
