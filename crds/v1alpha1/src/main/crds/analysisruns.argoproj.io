apiVersion: apiextensions.k8s.io/v1
kind: CustomResourceDefinition
metadata:
  annotations:
    controller-gen.kubebuilder.io/version: v0.12.1
    operatorframework.io/installed-alongside-916b5c41539597da: openshift-gitops-operator/openshift-gitops-operator.v1.12.4
    operatorframework.io/installed-alongside-9ae07b41592a6095: openshift-gitops-operator/openshift-gitops-operator.v1.13.0
  creationTimestamp: "2024-06-25T14:20:07Z"
  generation: 1
  labels:
    olm.managed: "true"
    operators.coreos.com/openshift-gitops-operator.openshift-gitops-operator: ""
  name: analysisruns.argoproj.io
  resourceVersion: "18541715"
  uid: 4510a64d-dd27-4a2c-952b-66cb098d9684
spec:
  conversion:
    strategy: None
  group: argoproj.io
  names:
    kind: AnalysisRun
    listKind: AnalysisRunList
    plural: analysisruns
    shortNames:
    - ar
    singular: analysisrun
  scope: Namespaced
  versions:
  - additionalPrinterColumns:
    - description: AnalysisRun status
      jsonPath: .status.phase
      name: Status
      type: string
    - description: Time since resource was created
      jsonPath: .metadata.creationTimestamp
      name: Age
      type: date
    name: v1alpha1
    schema:
      openAPIV3Schema:
        properties:
          apiVersion:
            type: string
          kind:
            type: string
          metadata:
            type: object
          spec:
            properties:
              args:
                items:
                  properties:
                    name:
                      type: string
                    value:
                      type: string
                    valueFrom:
                      properties:
                        fieldRef:
                          properties:
                            fieldPath:
                              type: string
                          required:
                          - fieldPath
                          type: object
                        secretKeyRef:
                          properties:
                            key:
                              type: string
                            name:
                              type: string
                          required:
                          - key
                          - name
                          type: object
                      type: object
                  required:
                  - name
                  type: object
                type: array
              dryRun:
                items:
                  properties:
                    metricName:
                      type: string
                  required:
                  - metricName
                  type: object
                type: array
              measurementRetention:
                items:
                  properties:
                    limit:
                      format: int32
                      type: integer
                    metricName:
                      type: string
                  required:
                  - limit
                  - metricName
                  type: object
                type: array
              metrics:
                items:
                  properties:
                    consecutiveErrorLimit:
                      anyOf:
                      - type: integer
                      - type: string
                      x-kubernetes-int-or-string: true
                    count:
                      anyOf:
                      - type: integer
                      - type: string
                      x-kubernetes-int-or-string: true
                    failureCondition:
                      type: string
                    failureLimit:
                      anyOf:
                      - type: integer
                      - type: string
                      x-kubernetes-int-or-string: true
                    inconclusiveLimit:
                      anyOf:
                      - type: integer
                      - type: string
                      x-kubernetes-int-or-string: true
                    initialDelay:
                      type: string
                    interval:
                      type: string
                    name:
                      type: string
                    provider:
                      properties:
                        cloudWatch:
                          properties:
                            interval:
                              type: string
                            metricDataQueries:
                              items:
                                properties:
                                  expression:
                                    type: string
                                  id:
                                    type: string
                                  label:
                                    type: string
                                  metricStat:
                                    properties:
                                      metric:
                                        properties:
                                          dimensions:
                                            items:
                                              properties:
                                                name:
                                                  type: string
                                                value:
                                                  type: string
                                              type: object
                                            type: array
                                          metricName:
                                            type: string
                                          namespace:
                                            type: string
                                        type: object
                                      period:
                                        anyOf:
                                        - type: integer
                                        - type: string
                                        x-kubernetes-int-or-string: true
                                      stat:
                                        type: string
                                      unit:
                                        type: string
                                    type: object
                                  period:
                                    anyOf:
                                    - type: integer
                                    - type: string
                                    x-kubernetes-int-or-string: true
                                  returnData:
                                    type: boolean
                                type: object
                              type: array
                          required:
                          - metricDataQueries
                          type: object
                        datadog:
                          properties:
                            apiVersion:
                              type: string
                            interval:
                              type: string
                            query:
                              type: string
                          required:
                          - query
                          type: object
                        graphite:
                          properties:
                            address:
                              type: string
                            query:
                              type: string
                          type: object
                        influxdb:
                          properties:
                            profile:
                              type: string
                            query:
                              type: string
                          type: object
                        job:
                          properties:
                            metadata:
                              properties:
                                annotations:
                                  additionalProperties:
                                    type: string
                                  type: object
                                labels:
                                  additionalProperties:
                                    type: string
                                  type: object
                              type: object
                            spec:
                              properties:
                                activeDeadlineSeconds:
                                  format: int64
                                  type: integer
                                backoffLimit:
                                  format: int32
                                  type: integer
                                completionMode:
                                  type: string
                                completions:
                                  format: int32
                                  type: integer
                                manualSelector:
                                  type: boolean
                                parallelism:
                                  format: int32
                                  type: integer
                                podFailurePolicy:
                                  properties:
                                    rules:
                                      items:
                                        properties:
                                          action:
                                            type: string
                                          onExitCodes:
                                            properties:
                                              containerName:
                                                type: string
                                              operator:
                                                type: string
                                              values:
                                                items:
                                                  format: int32
                                                  type: integer
                                                type: array
                                                x-kubernetes-list-type: set
                                            required:
                                            - operator
                                            - values
                                            type: object
                                          onPodConditions:
                                            items:
                                              properties:
                                                status:
                                                  type: string
                                                type:
                                                  type: string
                                              required:
                                              - status
                                              - type
                                              type: object
                                            type: array
                                            x-kubernetes-list-type: atomic
                                        required:
                                        - action
                                        - onPodConditions
                                        type: object
                                      type: array
                                      x-kubernetes-list-type: atomic
                                  required:
                                  - rules
                                  type: object
                                selector:
                                  properties:
                                    matchExpressions:
                                      items:
                                        properties:
                                          key:
                                            type: string
                                          operator:
                                            type: string
                                          values:
                                            items:
                                              type: string
                                            type: array
                                        required:
                                        - key
                                        - operator
                                        type: object
                                      type: array
                                    matchLabels:
                                      additionalProperties:
                                        type: string
                                      type: object
                                  type: object
                                  x-kubernetes-map-type: atomic
                                suspend:
                                  type: boolean
                                template:
                                  properties:
                                    metadata:
                                      properties:
                                        annotations:
                                          additionalProperties:
                                            type: string
                                          type: object
                                        labels:
                                          additionalProperties:
                                            type: string
                                          type: object
                                      type: object
                                    spec:
                                      properties:
                                        activeDeadlineSeconds:
                                          format: int64
                                          type: integer
                                        affinity:
                                          properties:
                                            nodeAffinity:
                                              properties:
                                                preferredDuringSchedulingIgnoredDuringExecution:
                                                  items:
                                                    properties:
                                                      preference:
                                                        properties:
                                                          matchExpressions:
                                                            items:
                                                              properties:
                                                                key:
                                                                  type: string
                                                                operator:
                                                                  type: string
                                                                values:
                                                                  items:
                                                                    type: string
                                                                  type: array
                                                              required:
                                                              - key
                                                              - operator
                                                              type: object
                                                            type: array
                                                          matchFields:
                                                            items:
                                                              properties:
                                                                key:
                                                                  type: string
                                                                operator:
                                                                  type: string
                                                                values:
                                                                  items:
                                                                    type: string
                                                                  type: array
                                                              required:
                                                              - key
                                                              - operator
                                                              type: object
                                                            type: array
                                                        type: object
                                                        x-kubernetes-map-type: atomic
                                                      weight:
                                                        format: int32
                                                        type: integer
                                                    required:
                                                    - preference
                                                    - weight
                                                    type: object
                                                  type: array
                                                requiredDuringSchedulingIgnoredDuringExecution:
                                                  properties:
                                                    nodeSelectorTerms:
                                                      items:
                                                        properties:
                                                          matchExpressions:
                                                            items:
                                                              properties:
                                                                key:
                                                                  type: string
                                                                operator:
                                                                  type: string
                                                                values:
                                                                  items:
                                                                    type: string
                                                                  type: array
                                                              required:
                                                              - key
                                                              - operator
                                                              type: object
                                                            type: array
                                                          matchFields:
                                                            items:
                                                              properties:
                                                                key:
                                                                  type: string
                                                                operator:
                                                                  type: string
                                                                values:
                                                                  items:
                                                                    type: string
                                                                  type: array
                                                              required:
                                                              - key
                                                              - operator
                                                              type: object
                                                            type: array
                                                        type: object
                                                        x-kubernetes-map-type: atomic
                                                      type: array
                                                  required:
                                                  - nodeSelectorTerms
                                                  type: object
                                                  x-kubernetes-map-type: atomic
                                              type: object
                                            podAffinity:
                                              properties:
                                                preferredDuringSchedulingIgnoredDuringExecution:
                                                  items:
                                                    properties:
                                                      podAffinityTerm:
                                                        properties:
                                                          labelSelector:
                                                            properties:
                                                              matchExpressions:
                                                                items:
                                                                  properties:
                                                                    key:
                                                                      type: string
                                                                    operator:
                                                                      type: string
                                                                    values:
                                                                      items:
                                                                        type: string
                                                                      type: array
                                                                  required:
                                                                  - key
                                                                  - operator
                                                                  type: object
                                                                type: array
                                                              matchLabels:
                                                                additionalProperties:
                                                                  type: string
                                                                type: object
                                                            type: object
                                                            x-kubernetes-map-type: atomic
                                                          namespaceSelector:
                                                            properties:
                                                              matchExpressions:
                                                                items:
                                                                  properties:
                                                                    key:
                                                                      type: string
                                                                    operator:
                                                                      type: string
                                                                    values:
                                                                      items:
                                                                        type: string
                                                                      type: array
                                                                  required:
                                                                  - key
                                                                  - operator
                                                                  type: object
                                                                type: array
                                                              matchLabels:
                                                                additionalProperties:
                                                                  type: string
                                                                type: object
                                                            type: object
                                                            x-kubernetes-map-type: atomic
                                                          namespaces:
                                                            items:
                                                              type: string
                                                            type: array
                                                          topologyKey:
                                                            type: string
                                                        required:
                                                        - topologyKey
                                                        type: object
                                                      weight:
                                                        format: int32
                                                        type: integer
                                                    required:
                                                    - podAffinityTerm
                                                    - weight
                                                    type: object
                                                  type: array
                                                requiredDuringSchedulingIgnoredDuringExecution:
                                                  items:
                                                    properties:
                                                      labelSelector:
                                                        properties:
                                                          matchExpressions:
                                                            items:
                                                              properties:
                                                                key:
                                                                  type: string
                                                                operator:
                                                                  type: string
                                                                values:
                                                                  items:
                                                                    type: string
                                                                  type: array
                                                              required:
                                                              - key
                                                              - operator
                                                              type: object
                                                            type: array
                                                          matchLabels:
                                                            additionalProperties:
                                                              type: string
                                                            type: object
                                                        type: object
                                                        x-kubernetes-map-type: atomic
                                                      namespaceSelector:
                                                        properties:
                                                          matchExpressions:
                                                            items:
                                                              properties:
                                                                key:
                                                                  type: string
                                                                operator:
                                                                  type: string
                                                                values:
                                                                  items:
                                                                    type: string
                                                                  type: array
                                                              required:
                                                              - key
                                                              - operator
                                                              type: object
                                                            type: array
                                                          matchLabels:
                                                            additionalProperties:
                                                              type: string
                                                            type: object
                                                        type: object
                                                        x-kubernetes-map-type: atomic
                                                      namespaces:
                                                        items:
                                                          type: string
                                                        type: array
                                                      topologyKey:
                                                        type: string
                                                    required:
                                                    - topologyKey
                                                    type: object
                                                  type: array
                                              type: object
                                            podAntiAffinity:
                                              properties:
                                                preferredDuringSchedulingIgnoredDuringExecution:
                                                  items:
                                                    properties:
                                                      podAffinityTerm:
                                                        properties:
                                                          labelSelector:
                                                            properties:
                                                              matchExpressions:
                                                                items:
                                                                  properties:
                                                                    key:
                                                                      type: string
                                                                    operator:
                                                                      type: string
                                                                    values:
                                                                      items:
                                                                        type: string
                                                                      type: array
                                                                  required:
                                                                  - key
                                                                  - operator
                                                                  type: object
                                                                type: array
                                                              matchLabels:
                                                                additionalProperties:
                                                                  type: string
                                                                type: object
                                                            type: object
                                                            x-kubernetes-map-type: atomic
                                                          namespaceSelector:
                                                            properties:
                                                              matchExpressions:
                                                                items:
                                                                  properties:
                                                                    key:
                                                                      type: string
                                                                    operator:
                                                                      type: string
                                                                    values:
                                                                      items:
                                                                        type: string
                                                                      type: array
                                                                  required:
                                                                  - key
                                                                  - operator
                                                                  type: object
                                                                type: array
                                                              matchLabels:
                                                                additionalProperties:
                                                                  type: string
                                                                type: object
                                                            type: object
                                                            x-kubernetes-map-type: atomic
                                                          namespaces:
                                                            items:
                                                              type: string
                                                            type: array
                                                          topologyKey:
                                                            type: string
                                                        required:
                                                        - topologyKey
                                                        type: object
                                                      weight:
                                                        format: int32
                                                        type: integer
                                                    required:
                                                    - podAffinityTerm
                                                    - weight
                                                    type: object
                                                  type: array
                                                requiredDuringSchedulingIgnoredDuringExecution:
                                                  items:
                                                    properties:
                                                      labelSelector:
                                                        properties:
                                                          matchExpressions:
                                                            items:
                                                              properties:
                                                                key:
                                                                  type: string
                                                                operator:
                                                                  type: string
                                                                values:
                                                                  items:
                                                                    type: string
                                                                  type: array
                                                              required:
                                                              - key
                                                              - operator
                                                              type: object
                                                            type: array
                                                          matchLabels:
                                                            additionalProperties:
                                                              type: string
                                                            type: object
                                                        type: object
                                                        x-kubernetes-map-type: atomic
                                                      namespaceSelector:
                                                        properties:
                                                          matchExpressions:
                                                            items:
                                                              properties:
                                                                key:
                                                                  type: string
                                                                operator:
                                                                  type: string
                                                                values:
                                                                  items:
                                                                    type: string
                                                                  type: array
                                                              required:
                                                              - key
                                                              - operator
                                                              type: object
                                                            type: array
                                                          matchLabels:
                                                            additionalProperties:
                                                              type: string
                                                            type: object
                                                        type: object
                                                        x-kubernetes-map-type: atomic
                                                      namespaces:
                                                        items:
                                                          type: string
                                                        type: array
                                                      topologyKey:
                                                        type: string
                                                    required:
                                                    - topologyKey
                                                    type: object
                                                  type: array
                                              type: object
                                          type: object
                                        automountServiceAccountToken:
                                          type: boolean
                                        containers:
                                          items:
                                            properties:
                                              args:
                                                items:
                                                  type: string
                                                type: array
                                              command:
                                                items:
                                                  type: string
                                                type: array
                                              env:
                                                items:
                                                  properties:
                                                    name:
                                                      type: string
                                                    value:
                                                      type: string
                                                    valueFrom:
                                                      properties:
                                                        configMapKeyRef:
                                                          properties:
                                                            key:
                                                              type: string
                                                            name:
                                                              type: string
                                                            optional:
                                                              type: boolean
                                                          required:
                                                          - key
                                                          type: object
                                                          x-kubernetes-map-type: atomic
                                                        fieldRef:
                                                          properties:
                                                            apiVersion:
                                                              type: string
                                                            fieldPath:
                                                              type: string
                                                          required:
                                                          - fieldPath
                                                          type: object
                                                          x-kubernetes-map-type: atomic
                                                        resourceFieldRef:
                                                          properties:
                                                            containerName:
                                                              type: string
                                                            divisor:
                                                              anyOf:
                                                              - type: integer
                                                              - type: string
                                                              pattern: ^(\+|-)?(([0-9]+(\.[0-9]*)?)|(\.[0-9]+))(([KMGTPE]i)|[numkMGTPE]|([eE](\+|-)?(([0-9]+(\.[0-9]*)?)|(\.[0-9]+))))?$
                                                              x-kubernetes-int-or-string: true
                                                            resource:
                                                              type: string
                                                          required:
                                                          - resource
                                                          type: object
                                                          x-kubernetes-map-type: atomic
                                                        secretKeyRef:
                                                          properties:
                                                            key:
                                                              type: string
                                                            name:
                                                              type: string
                                                            optional:
                                                              type: boolean
                                                          required:
                                                          - key
                                                          type: object
                                                          x-kubernetes-map-type: atomic
                                                      type: object
                                                  required:
                                                  - name
                                                  type: object
                                                type: array
                                              envFrom:
                                                items:
                                                  properties:
                                                    configMapRef:
                                                      properties:
                                                        name:
                                                          type: string
                                                        optional:
                                                          type: boolean
                                                      type: object
                                                      x-kubernetes-map-type: atomic
                                                    prefix:
                                                      type: string
                                                    secretRef:
                                                      properties:
                                                        name:
                                                          type: string
                                                        optional:
                                                          type: boolean
                                                      type: object
                                                      x-kubernetes-map-type: atomic
                                                  type: object
                                                type: array
                                              image:
                                                type: string
                                              imagePullPolicy:
                                                type: string
                                              lifecycle:
                                                properties:
                                                  postStart:
                                                    properties:
                                                      exec:
                                                        properties:
                                                          command:
                                                            items:
                                                              type: string
                                                            type: array
                                                        type: object
                                                      httpGet:
                                                        properties:
                                                          host:
                                                            type: string
                                                          httpHeaders:
                                                            items:
                                                              properties:
                                                                name:
                                                                  type: string
                                                                value:
                                                                  type: string
                                                              required:
                                                              - name
                                                              - value
                                                              type: object
                                                            type: array
                                                          path:
                                                            type: string
                                                          port:
                                                            anyOf:
                                                            - type: integer
                                                            - type: string
                                                            x-kubernetes-int-or-string: true
                                                          scheme:
                                                            type: string
                                                        required:
                                                        - port
                                                        type: object
                                                      tcpSocket:
                                                        properties:
                                                          host:
                                                            type: string
                                                          port:
                                                            anyOf:
                                                            - type: integer
                                                            - type: string
                                                            x-kubernetes-int-or-string: true
                                                        required:
                                                        - port
                                                        type: object
                                                    type: object
                                                  preStop:
                                                    properties:
                                                      exec:
                                                        properties:
                                                          command:
                                                            items:
                                                              type: string
                                                            type: array
                                                        type: object
                                                      httpGet:
                                                        properties:
                                                          host:
                                                            type: string
                                                          httpHeaders:
                                                            items:
                                                              properties:
                                                                name:
                                                                  type: string
                                                                value:
                                                                  type: string
                                                              required:
                                                              - name
                                                              - value
                                                              type: object
                                                            type: array
                                                          path:
                                                            type: string
                                                          port:
                                                            anyOf:
                                                            - type: integer
                                                            - type: string
                                                            x-kubernetes-int-or-string: true
                                                          scheme:
                                                            type: string
                                                        required:
                                                        - port
                                                        type: object
                                                      tcpSocket:
                                                        properties:
                                                          host:
                                                            type: string
                                                          port:
                                                            anyOf:
                                                            - type: integer
                                                            - type: string
                                                            x-kubernetes-int-or-string: true
                                                        required:
                                                        - port
                                                        type: object
                                                    type: object
                                                type: object
                                              livenessProbe:
                                                properties:
                                                  exec:
                                                    properties:
                                                      command:
                                                        items:
                                                          type: string
                                                        type: array
                                                    type: object
                                                  failureThreshold:
                                                    format: int32
                                                    type: integer
                                                  grpc:
                                                    properties:
                                                      port:
                                                        format: int32
                                                        type: integer
                                                      service:
                                                        type: string
                                                    required:
                                                    - port
                                                    type: object
                                                  httpGet:
                                                    properties:
                                                      host:
                                                        type: string
                                                      httpHeaders:
                                                        items:
                                                          properties:
                                                            name:
                                                              type: string
                                                            value:
                                                              type: string
                                                          required:
                                                          - name
                                                          - value
                                                          type: object
                                                        type: array
                                                      path:
                                                        type: string
                                                      port:
                                                        anyOf:
                                                        - type: integer
                                                        - type: string
                                                        x-kubernetes-int-or-string: true
                                                      scheme:
                                                        type: string
                                                    required:
                                                    - port
                                                    type: object
                                                  initialDelaySeconds:
                                                    format: int32
                                                    type: integer
                                                  periodSeconds:
                                                    format: int32
                                                    type: integer
                                                  successThreshold:
                                                    format: int32
                                                    type: integer
                                                  tcpSocket:
                                                    properties:
                                                      host:
                                                        type: string
                                                      port:
                                                        anyOf:
                                                        - type: integer
                                                        - type: string
                                                        x-kubernetes-int-or-string: true
                                                    required:
                                                    - port
                                                    type: object
                                                  terminationGracePeriodSeconds:
                                                    format: int64
                                                    type: integer
                                                  timeoutSeconds:
                                                    format: int32
                                                    type: integer
                                                type: object
                                              name:
                                                type: string
                                              ports:
                                                items:
                                                  properties:
                                                    containerPort:
                                                      format: int32
                                                      type: integer
                                                    hostIP:
                                                      type: string
                                                    hostPort:
                                                      format: int32
                                                      type: integer
                                                    name:
                                                      type: string
                                                    protocol:
                                                      default: TCP
                                                      type: string
                                                  required:
                                                  - containerPort
                                                  type: object
                                                type: array
                                                x-kubernetes-list-map-keys:
                                                - containerPort
                                                - protocol
                                                x-kubernetes-list-type: map
                                              readinessProbe:
                                                properties:
                                                  exec:
                                                    properties:
                                                      command:
                                                        items:
                                                          type: string
                                                        type: array
                                                    type: object
                                                  failureThreshold:
                                                    format: int32
                                                    type: integer
                                                  grpc:
                                                    properties:
                                                      port:
                                                        format: int32
                                                        type: integer
                                                      service:
                                                        type: string
                                                    required:
                                                    - port
                                                    type: object
                                                  httpGet:
                                                    properties:
                                                      host:
                                                        type: string
                                                      httpHeaders:
                                                        items:
                                                          properties:
                                                            name:
                                                              type: string
                                                            value:
                                                              type: string
                                                          required:
                                                          - name
                                                          - value
                                                          type: object
                                                        type: array
                                                      path:
                                                        type: string
                                                      port:
                                                        anyOf:
                                                        - type: integer
                                                        - type: string
                                                        x-kubernetes-int-or-string: true
                                                      scheme:
                                                        type: string
                                                    required:
                                                    - port
                                                    type: object
                                                  initialDelaySeconds:
                                                    format: int32
                                                    type: integer
                                                  periodSeconds:
                                                    format: int32
                                                    type: integer
                                                  successThreshold:
                                                    format: int32
                                                    type: integer
                                                  tcpSocket:
                                                    properties:
                                                      host:
                                                        type: string
                                                      port:
                                                        anyOf:
                                                        - type: integer
                                                        - type: string
                                                        x-kubernetes-int-or-string: true
                                                    required:
                                                    - port
                                                    type: object
                                                  terminationGracePeriodSeconds:
                                                    format: int64
                                                    type: integer
                                                  timeoutSeconds:
                                                    format: int32
                                                    type: integer
                                                type: object
                                              resources:
                                                properties:
                                                  limits:
                                                    x-kubernetes-preserve-unknown-fields: true
                                                  requests:
                                                    x-kubernetes-preserve-unknown-fields: true
                                                type: object
                                              securityContext:
                                                properties:
                                                  allowPrivilegeEscalation:
                                                    type: boolean
                                                  capabilities:
                                                    properties:
                                                      add:
                                                        items:
                                                          type: string
                                                        type: array
                                                      drop:
                                                        items:
                                                          type: string
                                                        type: array
                                                    type: object
                                                  privileged:
                                                    type: boolean
                                                  procMount:
                                                    type: string
                                                  readOnlyRootFilesystem:
                                                    type: boolean
                                                  runAsGroup:
                                                    format: int64
                                                    type: integer
                                                  runAsNonRoot:
                                                    type: boolean
                                                  runAsUser:
                                                    format: int64
                                                    type: integer
                                                  seLinuxOptions:
                                                    properties:
                                                      level:
                                                        type: string
                                                      role:
                                                        type: string
                                                      type:
                                                        type: string
                                                      user:
                                                        type: string
                                                    type: object
                                                  seccompProfile:
                                                    properties:
                                                      localhostProfile:
                                                        type: string
                                                      type:
                                                        type: string
                                                    required:
                                                    - type
                                                    type: object
                                                  windowsOptions:
                                                    properties:
                                                      gmsaCredentialSpec:
                                                        type: string
                                                      gmsaCredentialSpecName:
                                                        type: string
                                                      hostProcess:
                                                        type: boolean
                                                      runAsUserName:
                                                        type: string
                                                    type: object
                                                type: object
                                              startupProbe:
                                                properties:
                                                  exec:
                                                    properties:
                                                      command:
                                                        items:
                                                          type: string
                                                        type: array
                                                    type: object
                                                  failureThreshold:
                                                    format: int32
                                                    type: integer
                                                  grpc:
                                                    properties:
                                                      port:
                                                        format: int32
                                                        type: integer
                                                      service:
                                                        type: string
                                                    required:
                                                    - port
                                                    type: object
                                                  httpGet:
                                                    properties:
                                                      host:
                                                        type: string
                                                      httpHeaders:
                                                        items:
                                                          properties:
                                                            name:
                                                              type: string
                                                            value:
                                                              type: string
                                                          required:
                                                          - name
                                                          - value
                                                          type: object
                                                        type: array
                                                      path:
                                                        type: string
                                                      port:
                                                        anyOf:
                                                        - type: integer
                                                        - type: string
                                                        x-kubernetes-int-or-string: true
                                                      scheme:
                                                        type: string
                                                    required:
                                                    - port
                                                    type: object
                                                  initialDelaySeconds:
                                                    format: int32
                                                    type: integer
                                                  periodSeconds:
                                                    format: int32
                                                    type: integer
                                                  successThreshold:
                                                    format: int32
                                                    type: integer
                                                  tcpSocket:
                                                    properties:
                                                      host:
                                                        type: string
                                                      port:
                                                        anyOf:
                                                        - type: integer
                                                        - type: string
                                                        x-kubernetes-int-or-string: true
                                                    required:
                                                    - port
                                                    type: object
                                                  terminationGracePeriodSeconds:
                                                    format: int64
                                                    type: integer
                                                  timeoutSeconds:
                                                    format: int32
                                                    type: integer
                                                type: object
                                              stdin:
                                                type: boolean
                                              stdinOnce:
                                                type: boolean
                                              terminationMessagePath:
                                                type: string
                                              terminationMessagePolicy:
                                                type: string
                                              tty:
                                                type: boolean
                                              volumeDevices:
                                                items:
                                                  properties:
                                                    devicePath:
                                                      type: string
                                                    name:
                                                      type: string
                                                  required:
                                                  - devicePath
                                                  - name
                                                  type: object
                                                type: array
                                              volumeMounts:
                                                items:
                                                  properties:
                                                    mountPath:
                                                      type: string
                                                    mountPropagation:
                                                      type: string
                                                    name:
                                                      type: string
                                                    readOnly:
                                                      type: boolean
                                                    subPath:
                                                      type: string
                                                    subPathExpr:
                                                      type: string
                                                  required:
                                                  - mountPath
                                                  - name
                                                  type: object
                                                type: array
                                              workingDir:
                                                type: string
                                            required:
                                            - name
                                            type: object
                                          type: array
                                        dnsConfig:
                                          properties:
                                            nameservers:
                                              items:
                                                type: string
                                              type: array
                                            options:
                                              items:
                                                properties:
                                                  name:
                                                    type: string
                                                  value:
                                                    type: string
                                                type: object
                                              type: array
                                            searches:
                                              items:
                                                type: string
                                              type: array
                                          type: object
                                        dnsPolicy:
                                          type: string
                                        enableServiceLinks:
                                          type: boolean
                                        ephemeralContainers:
                                          items:
                                            properties:
                                              args:
                                                items:
                                                  type: string
                                                type: array
                                              command:
                                                items:
                                                  type: string
                                                type: array
                                              env:
                                                items:
                                                  properties:
                                                    name:
                                                      type: string
                                                    value:
                                                      type: string
                                                    valueFrom:
                                                      properties:
                                                        configMapKeyRef:
                                                          properties:
                                                            key:
                                                              type: string
                                                            name:
                                                              type: string
                                                            optional:
                                                              type: boolean
                                                          required:
                                                          - key
                                                          type: object
                                                          x-kubernetes-map-type: atomic
                                                        fieldRef:
                                                          properties:
                                                            apiVersion:
                                                              type: string
                                                            fieldPath:
                                                              type: string
                                                          required:
                                                          - fieldPath
                                                          type: object
                                                          x-kubernetes-map-type: atomic
                                                        resourceFieldRef:
                                                          properties:
                                                            containerName:
                                                              type: string
                                                            divisor:
                                                              anyOf:
                                                              - type: integer
                                                              - type: string
                                                              pattern: ^(\+|-)?(([0-9]+(\.[0-9]*)?)|(\.[0-9]+))(([KMGTPE]i)|[numkMGTPE]|([eE](\+|-)?(([0-9]+(\.[0-9]*)?)|(\.[0-9]+))))?$
                                                              x-kubernetes-int-or-string: true
                                                            resource:
                                                              type: string
                                                          required:
                                                          - resource
                                                          type: object
                                                          x-kubernetes-map-type: atomic
                                                        secretKeyRef:
                                                          properties:
                                                            key:
                                                              type: string
                                                            name:
                                                              type: string
                                                            optional:
                                                              type: boolean
                                                          required:
                                                          - key
                                                          type: object
                                                          x-kubernetes-map-type: atomic
                                                      type: object
                                                  required:
                                                  - name
                                                  type: object
                                                type: array
                                              envFrom:
                                                items:
                                                  properties:
                                                    configMapRef:
                                                      properties:
                                                        name:
                                                          type: string
                                                        optional:
                                                          type: boolean
                                                      type: object
                                                      x-kubernetes-map-type: atomic
                                                    prefix:
                                                      type: string
                                                    secretRef:
                                                      properties:
                                                        name:
                                                          type: string
                                                        optional:
                                                          type: boolean
                                                      type: object
                                                      x-kubernetes-map-type: atomic
                                                  type: object
                                                type: array
                                              image:
                                                type: string
                                              imagePullPolicy:
                                                type: string
                                              lifecycle:
                                                properties:
                                                  postStart:
                                                    properties:
                                                      exec:
                                                        properties:
                                                          command:
                                                            items:
                                                              type: string
                                                            type: array
                                                        type: object
                                                      httpGet:
                                                        properties:
                                                          host:
                                                            type: string
                                                          httpHeaders:
                                                            items:
                                                              properties:
                                                                name:
                                                                  type: string
                                                                value:
                                                                  type: string
                                                              required:
                                                              - name
                                                              - value
                                                              type: object
                                                            type: array
                                                          path:
                                                            type: string
                                                          port:
                                                            anyOf:
                                                            - type: integer
                                                            - type: string
                                                            x-kubernetes-int-or-string: true
                                                          scheme:
                                                            type: string
                                                        required:
                                                        - port
                                                        type: object
                                                      tcpSocket:
                                                        properties:
                                                          host:
                                                            type: string
                                                          port:
                                                            anyOf:
                                                            - type: integer
                                                            - type: string
                                                            x-kubernetes-int-or-string: true
                                                        required:
                                                        - port
                                                        type: object
                                                    type: object
                                                  preStop:
                                                    properties:
                                                      exec:
                                                        properties:
                                                          command:
                                                            items:
                                                              type: string
                                                            type: array
                                                        type: object
                                                      httpGet:
                                                        properties:
                                                          host:
                                                            type: string
                                                          httpHeaders:
                                                            items:
                                                              properties:
                                                                name:
                                                                  type: string
                                                                value:
                                                                  type: string
                                                              required:
                                                              - name
                                                              - value
                                                              type: object
                                                            type: array
                                                          path:
                                                            type: string
                                                          port:
                                                            anyOf:
                                                            - type: integer
                                                            - type: string
                                                            x-kubernetes-int-or-string: true
                                                          scheme:
                                                            type: string
                                                        required:
                                                        - port
                                                        type: object
                                                      tcpSocket:
                                                        properties:
                                                          host:
                                                            type: string
                                                          port:
                                                            anyOf:
                                                            - type: integer
                                                            - type: string
                                                            x-kubernetes-int-or-string: true
                                                        required:
                                                        - port
                                                        type: object
                                                    type: object
                                                type: object
                                              livenessProbe:
                                                properties:
                                                  exec:
                                                    properties:
                                                      command:
                                                        items:
                                                          type: string
                                                        type: array
                                                    type: object
                                                  failureThreshold:
                                                    format: int32
                                                    type: integer
                                                  grpc:
                                                    properties:
                                                      port:
                                                        format: int32
                                                        type: integer
                                                      service:
                                                        type: string
                                                    required:
                                                    - port
                                                    type: object
                                                  httpGet:
                                                    properties:
                                                      host:
                                                        type: string
                                                      httpHeaders:
                                                        items:
                                                          properties:
                                                            name:
                                                              type: string
                                                            value:
                                                              type: string
                                                          required:
                                                          - name
                                                          - value
                                                          type: object
                                                        type: array
                                                      path:
                                                        type: string
                                                      port:
                                                        anyOf:
                                                        - type: integer
                                                        - type: string
                                                        x-kubernetes-int-or-string: true
                                                      scheme:
                                                        type: string
                                                    required:
                                                    - port
                                                    type: object
                                                  initialDelaySeconds:
                                                    format: int32
                                                    type: integer
                                                  periodSeconds:
                                                    format: int32
                                                    type: integer
                                                  successThreshold:
                                                    format: int32
                                                    type: integer
                                                  tcpSocket:
                                                    properties:
                                                      host:
                                                        type: string
                                                      port:
                                                        anyOf:
                                                        - type: integer
                                                        - type: string
                                                        x-kubernetes-int-or-string: true
                                                    required:
                                                    - port
                                                    type: object
                                                  terminationGracePeriodSeconds:
                                                    format: int64
                                                    type: integer
                                                  timeoutSeconds:
                                                    format: int32
                                                    type: integer
                                                type: object
                                              name:
                                                type: string
                                              ports:
                                                items:
                                                  properties:
                                                    containerPort:
                                                      format: int32
                                                      type: integer
                                                    hostIP:
                                                      type: string
                                                    hostPort:
                                                      format: int32
                                                      type: integer
                                                    name:
                                                      type: string
                                                    protocol:
                                                      default: TCP
                                                      type: string
                                                  required:
                                                  - containerPort
                                                  type: object
                                                type: array
                                                x-kubernetes-list-map-keys:
                                                - containerPort
                                                - protocol
                                                x-kubernetes-list-type: map
                                              readinessProbe:
                                                properties:
                                                  exec:
                                                    properties:
                                                      command:
                                                        items:
                                                          type: string
                                                        type: array
                                                    type: object
                                                  failureThreshold:
                                                    format: int32
                                                    type: integer
                                                  grpc:
                                                    properties:
                                                      port:
                                                        format: int32
                                                        type: integer
                                                      service:
                                                        type: string
                                                    required:
                                                    - port
                                                    type: object
                                                  httpGet:
                                                    properties:
                                                      host:
                                                        type: string
                                                      httpHeaders:
                                                        items:
                                                          properties:
                                                            name:
                                                              type: string
                                                            value:
                                                              type: string
                                                          required:
                                                          - name
                                                          - value
                                                          type: object
                                                        type: array
                                                      path:
                                                        type: string
                                                      port:
                                                        anyOf:
                                                        - type: integer
                                                        - type: string
                                                        x-kubernetes-int-or-string: true
                                                      scheme:
                                                        type: string
                                                    required:
                                                    - port
                                                    type: object
                                                  initialDelaySeconds:
                                                    format: int32
                                                    type: integer
                                                  periodSeconds:
                                                    format: int32
                                                    type: integer
                                                  successThreshold:
                                                    format: int32
                                                    type: integer
                                                  tcpSocket:
                                                    properties:
                                                      host:
                                                        type: string
                                                      port:
                                                        anyOf:
                                                        - type: integer
                                                        - type: string
                                                        x-kubernetes-int-or-string: true
                                                    required:
                                                    - port
                                                    type: object
                                                  terminationGracePeriodSeconds:
                                                    format: int64
                                                    type: integer
                                                  timeoutSeconds:
                                                    format: int32
                                                    type: integer
                                                type: object
                                              resources:
                                                properties:
                                                  limits:
                                                    x-kubernetes-preserve-unknown-fields: true
                                                  requests:
                                                    x-kubernetes-preserve-unknown-fields: true
                                                type: object
                                              securityContext:
                                                properties:
                                                  allowPrivilegeEscalation:
                                                    type: boolean
                                                  capabilities:
                                                    properties:
                                                      add:
                                                        items:
                                                          type: string
                                                        type: array
                                                      drop:
                                                        items:
                                                          type: string
                                                        type: array
                                                    type: object
                                                  privileged:
                                                    type: boolean
                                                  procMount:
                                                    type: string
                                                  readOnlyRootFilesystem:
                                                    type: boolean
                                                  runAsGroup:
                                                    format: int64
                                                    type: integer
                                                  runAsNonRoot:
                                                    type: boolean
                                                  runAsUser:
                                                    format: int64
                                                    type: integer
                                                  seLinuxOptions:
                                                    properties:
                                                      level:
                                                        type: string
                                                      role:
                                                        type: string
                                                      type:
                                                        type: string
                                                      user:
                                                        type: string
                                                    type: object
                                                  seccompProfile:
                                                    properties:
                                                      localhostProfile:
                                                        type: string
                                                      type:
                                                        type: string
                                                    required:
                                                    - type
                                                    type: object
                                                  windowsOptions:
                                                    properties:
                                                      gmsaCredentialSpec:
                                                        type: string
                                                      gmsaCredentialSpecName:
                                                        type: string
                                                      hostProcess:
                                                        type: boolean
                                                      runAsUserName:
                                                        type: string
                                                    type: object
                                                type: object
                                              startupProbe:
                                                properties:
                                                  exec:
                                                    properties:
                                                      command:
                                                        items:
                                                          type: string
                                                        type: array
                                                    type: object
                                                  failureThreshold:
                                                    format: int32
                                                    type: integer
                                                  grpc:
                                                    properties:
                                                      port:
                                                        format: int32
                                                        type: integer
                                                      service:
                                                        type: string
                                                    required:
                                                    - port
                                                    type: object
                                                  httpGet:
                                                    properties:
                                                      host:
                                                        type: string
                                                      httpHeaders:
                                                        items:
                                                          properties:
                                                            name:
                                                              type: string
                                                            value:
                                                              type: string
                                                          required:
                                                          - name
                                                          - value
                                                          type: object
                                                        type: array
                                                      path:
                                                        type: string
                                                      port:
                                                        anyOf:
                                                        - type: integer
                                                        - type: string
                                                        x-kubernetes-int-or-string: true
                                                      scheme:
                                                        type: string
                                                    required:
                                                    - port
                                                    type: object
                                                  initialDelaySeconds:
                                                    format: int32
                                                    type: integer
                                                  periodSeconds:
                                                    format: int32
                                                    type: integer
                                                  successThreshold:
                                                    format: int32
                                                    type: integer
                                                  tcpSocket:
                                                    properties:
                                                      host:
                                                        type: string
                                                      port:
                                                        anyOf:
                                                        - type: integer
                                                        - type: string
                                                        x-kubernetes-int-or-string: true
                                                    required:
                                                    - port
                                                    type: object
                                                  terminationGracePeriodSeconds:
                                                    format: int64
                                                    type: integer
                                                  timeoutSeconds:
                                                    format: int32
                                                    type: integer
                                                type: object
                                              stdin:
                                                type: boolean
                                              stdinOnce:
                                                type: boolean
                                              targetContainerName:
                                                type: string
                                              terminationMessagePath:
                                                type: string
                                              terminationMessagePolicy:
                                                type: string
                                              tty:
                                                type: boolean
                                              volumeDevices:
                                                items:
                                                  properties:
                                                    devicePath:
                                                      type: string
                                                    name:
                                                      type: string
                                                  required:
                                                  - devicePath
                                                  - name
                                                  type: object
                                                type: array
                                              volumeMounts:
                                                items:
                                                  properties:
                                                    mountPath:
                                                      type: string
                                                    mountPropagation:
                                                      type: string
                                                    name:
                                                      type: string
                                                    readOnly:
                                                      type: boolean
                                                    subPath:
                                                      type: string
                                                    subPathExpr:
                                                      type: string
                                                  required:
                                                  - mountPath
                                                  - name
                                                  type: object
                                                type: array
                                              workingDir:
                                                type: string
                                            required:
                                            - name
                                            type: object
                                          type: array
                                        hostAliases:
                                          items:
                                            properties:
                                              hostnames:
                                                items:
                                                  type: string
                                                type: array
                                              ip:
                                                type: string
                                            type: object
                                          type: array
                                        hostIPC:
                                          type: boolean
                                        hostNetwork:
                                          type: boolean
                                        hostPID:
                                          type: boolean
                                        hostUsers:
                                          type: boolean
                                        hostname:
                                          type: string
                                        imagePullSecrets:
                                          items:
                                            properties:
                                              name:
                                                type: string
                                            type: object
                                            x-kubernetes-map-type: atomic
                                          type: array
                                        initContainers:
                                          items:
                                            properties:
                                              args:
                                                items:
                                                  type: string
                                                type: array
                                              command:
                                                items:
                                                  type: string
                                                type: array
                                              env:
                                                items:
                                                  properties:
                                                    name:
                                                      type: string
                                                    value:
                                                      type: string
                                                    valueFrom:
                                                      properties:
                                                        configMapKeyRef:
                                                          properties:
                                                            key:
                                                              type: string
                                                            name:
                                                              type: string
                                                            optional:
                                                              type: boolean
                                                          required:
                                                          - key
                                                          type: object
                                                          x-kubernetes-map-type: atomic
                                                        fieldRef:
                                                          properties:
                                                            apiVersion:
                                                              type: string
                                                            fieldPath:
                                                              type: string
                                                          required:
                                                          - fieldPath
                                                          type: object
                                                          x-kubernetes-map-type: atomic
                                                        resourceFieldRef:
                                                          properties:
                                                            containerName:
                                                              type: string
                                                            divisor:
                                                              anyOf:
                                                              - type: integer
                                                              - type: string
                                                              pattern: ^(\+|-)?(([0-9]+(\.[0-9]*)?)|(\.[0-9]+))(([KMGTPE]i)|[numkMGTPE]|([eE](\+|-)?(([0-9]+(\.[0-9]*)?)|(\.[0-9]+))))?$
                                                              x-kubernetes-int-or-string: true
                                                            resource:
                                                              type: string
                                                          required:
                                                          - resource
                                                          type: object
                                                          x-kubernetes-map-type: atomic
                                                        secretKeyRef:
                                                          properties:
                                                            key:
                                                              type: string
                                                            name:
                                                              type: string
                                                            optional:
                                                              type: boolean
                                                          required:
                                                          - key
                                                          type: object
                                                          x-kubernetes-map-type: atomic
                                                      type: object
                                                  required:
                                                  - name
                                                  type: object
                                                type: array
                                              envFrom:
                                                items:
                                                  properties:
                                                    configMapRef:
                                                      properties:
                                                        name:
                                                          type: string
                                                        optional:
                                                          type: boolean
                                                      type: object
                                                      x-kubernetes-map-type: atomic
                                                    prefix:
                                                      type: string
                                                    secretRef:
                                                      properties:
                                                        name:
                                                          type: string
                                                        optional:
                                                          type: boolean
                                                      type: object
                                                      x-kubernetes-map-type: atomic
                                                  type: object
                                                type: array
                                              image:
                                                type: string
                                              imagePullPolicy:
                                                type: string
                                              lifecycle:
                                                properties:
                                                  postStart:
                                                    properties:
                                                      exec:
                                                        properties:
                                                          command:
                                                            items:
                                                              type: string
                                                            type: array
                                                        type: object
                                                      httpGet:
                                                        properties:
                                                          host:
                                                            type: string
                                                          httpHeaders:
                                                            items:
                                                              properties:
                                                                name:
                                                                  type: string
                                                                value:
                                                                  type: string
                                                              required:
                                                              - name
                                                              - value
                                                              type: object
                                                            type: array
                                                          path:
                                                            type: string
                                                          port:
                                                            anyOf:
                                                            - type: integer
                                                            - type: string
                                                            x-kubernetes-int-or-string: true
                                                          scheme:
                                                            type: string
                                                        required:
                                                        - port
                                                        type: object
                                                      tcpSocket:
                                                        properties:
                                                          host:
                                                            type: string
                                                          port:
                                                            anyOf:
                                                            - type: integer
                                                            - type: string
                                                            x-kubernetes-int-or-string: true
                                                        required:
                                                        - port
                                                        type: object
                                                    type: object
                                                  preStop:
                                                    properties:
                                                      exec:
                                                        properties:
                                                          command:
                                                            items:
                                                              type: string
                                                            type: array
                                                        type: object
                                                      httpGet:
                                                        properties:
                                                          host:
                                                            type: string
                                                          httpHeaders:
                                                            items:
                                                              properties:
                                                                name:
                                                                  type: string
                                                                value:
                                                                  type: string
                                                              required:
                                                              - name
                                                              - value
                                                              type: object
                                                            type: array
                                                          path:
                                                            type: string
                                                          port:
                                                            anyOf:
                                                            - type: integer
                                                            - type: string
                                                            x-kubernetes-int-or-string: true
                                                          scheme:
                                                            type: string
                                                        required:
                                                        - port
                                                        type: object
                                                      tcpSocket:
                                                        properties:
                                                          host:
                                                            type: string
                                                          port:
                                                            anyOf:
                                                            - type: integer
                                                            - type: string
                                                            x-kubernetes-int-or-string: true
                                                        required:
                                                        - port
                                                        type: object
                                                    type: object
                                                type: object
                                              livenessProbe:
                                                properties:
                                                  exec:
                                                    properties:
                                                      command:
                                                        items:
                                                          type: string
                                                        type: array
                                                    type: object
                                                  failureThreshold:
                                                    format: int32
                                                    type: integer
                                                  grpc:
                                                    properties:
                                                      port:
                                                        format: int32
                                                        type: integer
                                                      service:
                                                        type: string
                                                    required:
                                                    - port
                                                    type: object
                                                  httpGet:
                                                    properties:
                                                      host:
                                                        type: string
                                                      httpHeaders:
                                                        items:
                                                          properties:
                                                            name:
                                                              type: string
                                                            value:
                                                              type: string
                                                          required:
                                                          - name
                                                          - value
                                                          type: object
                                                        type: array
                                                      path:
                                                        type: string
                                                      port:
                                                        anyOf:
                                                        - type: integer
                                                        - type: string
                                                        x-kubernetes-int-or-string: true
                                                      scheme:
                                                        type: string
                                                    required:
                                                    - port
                                                    type: object
                                                  initialDelaySeconds:
                                                    format: int32
                                                    type: integer
                                                  periodSeconds:
                                                    format: int32
                                                    type: integer
                                                  successThreshold:
                                                    format: int32
                                                    type: integer
                                                  tcpSocket:
                                                    properties:
                                                      host:
                                                        type: string
                                                      port:
                                                        anyOf:
                                                        - type: integer
                                                        - type: string
                                                        x-kubernetes-int-or-string: true
                                                    required:
                                                    - port
                                                    type: object
                                                  terminationGracePeriodSeconds:
                                                    format: int64
                                                    type: integer
                                                  timeoutSeconds:
                                                    format: int32
                                                    type: integer
                                                type: object
                                              name:
                                                type: string
                                              ports:
                                                items:
                                                  properties:
                                                    containerPort:
                                                      format: int32
                                                      type: integer
                                                    hostIP:
                                                      type: string
                                                    hostPort:
                                                      format: int32
                                                      type: integer
                                                    name:
                                                      type: string
                                                    protocol:
                                                      default: TCP
                                                      type: string
                                                  required:
                                                  - containerPort
                                                  type: object
                                                type: array
                                                x-kubernetes-list-map-keys:
                                                - containerPort
                                                - protocol
                                                x-kubernetes-list-type: map
                                              readinessProbe:
                                                properties:
                                                  exec:
                                                    properties:
                                                      command:
                                                        items:
                                                          type: string
                                                        type: array
                                                    type: object
                                                  failureThreshold:
                                                    format: int32
                                                    type: integer
                                                  grpc:
                                                    properties:
                                                      port:
                                                        format: int32
                                                        type: integer
                                                      service:
                                                        type: string
                                                    required:
                                                    - port
                                                    type: object
                                                  httpGet:
                                                    properties:
                                                      host:
                                                        type: string
                                                      httpHeaders:
                                                        items:
                                                          properties:
                                                            name:
                                                              type: string
                                                            value:
                                                              type: string
                                                          required:
                                                          - name
                                                          - value
                                                          type: object
                                                        type: array
                                                      path:
                                                        type: string
                                                      port:
                                                        anyOf:
                                                        - type: integer
                                                        - type: string
                                                        x-kubernetes-int-or-string: true
                                                      scheme:
                                                        type: string
                                                    required:
                                                    - port
                                                    type: object
                                                  initialDelaySeconds:
                                                    format: int32
                                                    type: integer
                                                  periodSeconds:
                                                    format: int32
                                                    type: integer
                                                  successThreshold:
                                                    format: int32
                                                    type: integer
                                                  tcpSocket:
                                                    properties:
                                                      host:
                                                        type: string
                                                      port:
                                                        anyOf:
                                                        - type: integer
                                                        - type: string
                                                        x-kubernetes-int-or-string: true
                                                    required:
                                                    - port
                                                    type: object
                                                  terminationGracePeriodSeconds:
                                                    format: int64
                                                    type: integer
                                                  timeoutSeconds:
                                                    format: int32
                                                    type: integer
                                                type: object
                                              resources:
                                                properties:
                                                  limits:
                                                    x-kubernetes-preserve-unknown-fields: true
                                                  requests:
                                                    x-kubernetes-preserve-unknown-fields: true
                                                type: object
                                              securityContext:
                                                properties:
                                                  allowPrivilegeEscalation:
                                                    type: boolean
                                                  capabilities:
                                                    properties:
                                                      add:
                                                        items:
                                                          type: string
                                                        type: array
                                                      drop:
                                                        items:
                                                          type: string
                                                        type: array
                                                    type: object
                                                  privileged:
                                                    type: boolean
                                                  procMount:
                                                    type: string
                                                  readOnlyRootFilesystem:
                                                    type: boolean
                                                  runAsGroup:
                                                    format: int64
                                                    type: integer
                                                  runAsNonRoot:
                                                    type: boolean
                                                  runAsUser:
                                                    format: int64
                                                    type: integer
                                                  seLinuxOptions:
                                                    properties:
                                                      level:
                                                        type: string
                                                      role:
                                                        type: string
                                                      type:
                                                        type: string
                                                      user:
                                                        type: string
                                                    type: object
                                                  seccompProfile:
                                                    properties:
                                                      localhostProfile:
                                                        type: string
                                                      type:
                                                        type: string
                                                    required:
                                                    - type
                                                    type: object
                                                  windowsOptions:
                                                    properties:
                                                      gmsaCredentialSpec:
                                                        type: string
                                                      gmsaCredentialSpecName:
                                                        type: string
                                                      hostProcess:
                                                        type: boolean
                                                      runAsUserName:
                                                        type: string
                                                    type: object
                                                type: object
                                              startupProbe:
                                                properties:
                                                  exec:
                                                    properties:
                                                      command:
                                                        items:
                                                          type: string
                                                        type: array
                                                    type: object
                                                  failureThreshold:
                                                    format: int32
                                                    type: integer
                                                  grpc:
                                                    properties:
                                                      port:
                                                        format: int32
                                                        type: integer
                                                      service:
                                                        type: string
                                                    required:
                                                    - port
                                                    type: object
                                                  httpGet:
                                                    properties:
                                                      host:
                                                        type: string
                                                      httpHeaders:
                                                        items:
                                                          properties:
                                                            name:
                                                              type: string
                                                            value:
                                                              type: string
                                                          required:
                                                          - name
                                                          - value
                                                          type: object
                                                        type: array
                                                      path:
                                                        type: string
                                                      port:
                                                        anyOf:
                                                        - type: integer
                                                        - type: string
                                                        x-kubernetes-int-or-string: true
                                                      scheme:
                                                        type: string
                                                    required:
                                                    - port
                                                    type: object
                                                  initialDelaySeconds:
                                                    format: int32
                                                    type: integer
                                                  periodSeconds:
                                                    format: int32
                                                    type: integer
                                                  successThreshold:
                                                    format: int32
                                                    type: integer
                                                  tcpSocket:
                                                    properties:
                                                      host:
                                                        type: string
                                                      port:
                                                        anyOf:
                                                        - type: integer
                                                        - type: string
                                                        x-kubernetes-int-or-string: true
                                                    required:
                                                    - port
                                                    type: object
                                                  terminationGracePeriodSeconds:
                                                    format: int64
                                                    type: integer
                                                  timeoutSeconds:
                                                    format: int32
                                                    type: integer
                                                type: object
                                              stdin:
                                                type: boolean
                                              stdinOnce:
                                                type: boolean
                                              terminationMessagePath:
                                                type: string
                                              terminationMessagePolicy:
                                                type: string
                                              tty:
                                                type: boolean
                                              volumeDevices:
                                                items:
                                                  properties:
                                                    devicePath:
                                                      type: string
                                                    name:
                                                      type: string
                                                  required:
                                                  - devicePath
                                                  - name
                                                  type: object
                                                type: array
                                              volumeMounts:
                                                items:
                                                  properties:
                                                    mountPath:
                                                      type: string
                                                    mountPropagation:
                                                      type: string
                                                    name:
                                                      type: string
                                                    readOnly:
                                                      type: boolean
                                                    subPath:
                                                      type: string
                                                    subPathExpr:
                                                      type: string
                                                  required:
                                                  - mountPath
                                                  - name
                                                  type: object
                                                type: array
                                              workingDir:
                                                type: string
                                            required:
                                            - name
                                            type: object
                                          type: array
                                        nodeName:
                                          type: string
                                        nodeSelector:
                                          additionalProperties:
                                            type: string
                                          type: object
                                          x-kubernetes-map-type: atomic
                                        os:
                                          properties:
                                            name:
                                              type: string
                                          required:
                                          - name
                                          type: object
                                        overhead:
                                          additionalProperties:
                                            anyOf:
                                            - type: integer
                                            - type: string
                                            pattern: ^(\+|-)?(([0-9]+(\.[0-9]*)?)|(\.[0-9]+))(([KMGTPE]i)|[numkMGTPE]|([eE](\+|-)?(([0-9]+(\.[0-9]*)?)|(\.[0-9]+))))?$
                                            x-kubernetes-int-or-string: true
                                          type: object
                                        preemptionPolicy:
                                          type: string
                                        priority:
                                          format: int32
                                          type: integer
                                        priorityClassName:
                                          type: string
                                        readinessGates:
                                          items:
                                            properties:
                                              conditionType:
                                                type: string
                                            required:
                                            - conditionType
                                            type: object
                                          type: array
                                        restartPolicy:
                                          type: string
                                        runtimeClassName:
                                          type: string
                                        schedulerName:
                                          type: string
                                        securityContext:
                                          properties:
                                            fsGroup:
                                              format: int64
                                              type: integer
                                            fsGroupChangePolicy:
                                              type: string
                                            runAsGroup:
                                              format: int64
                                              type: integer
                                            runAsNonRoot:
                                              type: boolean
                                            runAsUser:
                                              format: int64
                                              type: integer
                                            seLinuxOptions:
                                              properties:
                                                level:
                                                  type: string
                                                role:
                                                  type: string
                                                type:
                                                  type: string
                                                user:
                                                  type: string
                                              type: object
                                            seccompProfile:
                                              properties:
                                                localhostProfile:
                                                  type: string
                                                type:
                                                  type: string
                                              required:
                                              - type
                                              type: object
                                            supplementalGroups:
                                              items:
                                                format: int64
                                                type: integer
                                              type: array
                                            sysctls:
                                              items:
                                                properties:
                                                  name:
                                                    type: string
                                                  value:
                                                    type: string
                                                required:
                                                - name
                                                - value
                                                type: object
                                              type: array
                                            windowsOptions:
                                              properties:
                                                gmsaCredentialSpec:
                                                  type: string
                                                gmsaCredentialSpecName:
                                                  type: string
                                                hostProcess:
                                                  type: boolean
                                                runAsUserName:
                                                  type: string
                                              type: object
                                          type: object
                                        serviceAccount:
                                          type: string
                                        serviceAccountName:
                                          type: string
                                        setHostnameAsFQDN:
                                          type: boolean
                                        shareProcessNamespace:
                                          type: boolean
                                        subdomain:
                                          type: string
                                        terminationGracePeriodSeconds:
                                          format: int64
                                          type: integer
                                        tolerations:
                                          items:
                                            properties:
                                              effect:
                                                type: string
                                              key:
                                                type: string
                                              operator:
                                                type: string
                                              tolerationSeconds:
                                                format: int64
                                                type: integer
                                              value:
                                                type: string
                                            type: object
                                          type: array
                                        topologySpreadConstraints:
                                          items:
                                            properties:
                                              labelSelector:
                                                properties:
                                                  matchExpressions:
                                                    items:
                                                      properties:
                                                        key:
                                                          type: string
                                                        operator:
                                                          type: string
                                                        values:
                                                          items:
                                                            type: string
                                                          type: array
                                                      required:
                                                      - key
                                                      - operator
                                                      type: object
                                                    type: array
                                                  matchLabels:
                                                    additionalProperties:
                                                      type: string
                                                    type: object
                                                type: object
                                                x-kubernetes-map-type: atomic
                                              matchLabelKeys:
                                                items:
                                                  type: string
                                                type: array
                                                x-kubernetes-list-type: atomic
                                              maxSkew:
                                                format: int32
                                                type: integer
                                              minDomains:
                                                format: int32
                                                type: integer
                                              nodeAffinityPolicy:
                                                type: string
                                              nodeTaintsPolicy:
                                                type: string
                                              topologyKey:
                                                type: string
                                              whenUnsatisfiable:
                                                type: string
                                            required:
                                            - maxSkew
                                            - topologyKey
                                            - whenUnsatisfiable
                                            type: object
                                          type: array
                                          x-kubernetes-list-map-keys:
                                          - topologyKey
                                          - whenUnsatisfiable
                                          x-kubernetes-list-type: map
                                        volumes:
                                          x-kubernetes-preserve-unknown-fields: true
                                      required:
                                      - containers
                                      type: object
                                  type: object
                                ttlSecondsAfterFinished:
                                  format: int32
                                  type: integer
                              required:
                              - template
                              type: object
                          required:
                          - spec
                          type: object
                        kayenta:
                          properties:
                            address:
                              type: string
                            application:
                              type: string
                            canaryConfigName:
                              type: string
                            configurationAccountName:
                              type: string
                            metricsAccountName:
                              type: string
                            scopes:
                              items:
                                properties:
                                  controlScope:
                                    properties:
                                      end:
                                        type: string
                                      region:
                                        type: string
                                      scope:
                                        type: string
                                      start:
                                        type: string
                                      step:
                                        format: int64
                                        type: integer
                                    required:
                                    - end
                                    - region
                                    - scope
                                    - start
                                    - step
                                    type: object
                                  experimentScope:
                                    properties:
                                      end:
                                        type: string
                                      region:
                                        type: string
                                      scope:
                                        type: string
                                      start:
                                        type: string
                                      step:
                                        format: int64
                                        type: integer
                                    required:
                                    - end
                                    - region
                                    - scope
                                    - start
                                    - step
                                    type: object
                                  name:
                                    type: string
                                required:
                                - controlScope
                                - experimentScope
                                - name
                                type: object
                              type: array
                            storageAccountName:
                              type: string
                            threshold:
                              properties:
                                marginal:
                                  format: int64
                                  type: integer
                                pass:
                                  format: int64
                                  type: integer
                              required:
                              - marginal
                              - pass
                              type: object
                          required:
                          - address
                          - application
                          - canaryConfigName
                          - configurationAccountName
                          - metricsAccountName
                          - scopes
                          - storageAccountName
                          - threshold
                          type: object
                        newRelic:
                          properties:
                            profile:
                              type: string
                            query:
                              type: string
                          required:
                          - query
                          type: object
                        plugin:
                          type: object
                          x-kubernetes-preserve-unknown-fields: true
                        prometheus:
                          properties:
                            address:
                              type: string
                            authentication:
                              properties:
                                sigv4:
                                  properties:
                                    profile:
                                      type: string
                                    region:
                                      type: string
                                    roleArn:
                                      type: string
                                  type: object
                              type: object
                            headers:
                              items:
                                properties:
                                  key:
                                    type: string
                                  value:
                                    type: string
                                required:
                                - key
                                - value
                                type: object
                              type: array
                            insecure:
                              type: boolean
                            query:
                              type: string
                            timeout:
                              format: int64
                              type: integer
                          type: object
                        skywalking:
                          properties:
                            address:
                              type: string
                            interval:
                              type: string
                            query:
                              type: string
                          type: object
                        wavefront:
                          properties:
                            address:
                              type: string
                            query:
                              type: string
                          type: object
                        web:
                          properties:
                            body:
                              type: string
                            headers:
                              items:
                                properties:
                                  key:
                                    type: string
                                  value:
                                    type: string
                                required:
                                - key
                                - value
                                type: object
                              type: array
                            insecure:
                              type: boolean
                            jsonBody:
                              type: object
                              x-kubernetes-preserve-unknown-fields: true
                            jsonPath:
                              type: string
                            method:
                              type: string
                            timeoutSeconds:
                              format: int64
                              type: integer
                            url:
                              type: string
                          required:
                          - url
                          type: object
                      type: object
                    successCondition:
                      type: string
                  required:
                  - name
                  - provider
                  type: object
                type: array
              terminate:
                type: boolean
            required:
            - metrics
            type: object
          status:
            properties:
              dryRunSummary:
                properties:
                  count:
                    format: int32
                    type: integer
                  error:
                    format: int32
                    type: integer
                  failed:
                    format: int32
                    type: integer
                  inconclusive:
                    format: int32
                    type: integer
                  successful:
                    format: int32
                    type: integer
                type: object
              message:
                type: string
              metricResults:
                items:
                  properties:
                    consecutiveError:
                      format: int32
                      type: integer
                    count:
                      format: int32
                      type: integer
                    dryRun:
                      type: boolean
                    error:
                      format: int32
                      type: integer
                    failed:
                      format: int32
                      type: integer
                    inconclusive:
                      format: int32
                      type: integer
                    measurements:
                      items:
                        properties:
                          finishedAt:
                            format: date-time
                            type: string
                          message:
                            type: string
                          metadata:
                            additionalProperties:
                              type: string
                            type: object
                          phase:
                            type: string
                          resumeAt:
                            format: date-time
                            type: string
                          startedAt:
                            format: date-time
                            type: string
                          value:
                            type: string
                        required:
                        - phase
                        type: object
                      type: array
                    message:
                      type: string
                    metadata:
                      additionalProperties:
                        type: string
                      type: object
                    name:
                      type: string
                    phase:
                      type: string
                    successful:
                      format: int32
                      type: integer
                  required:
                  - name
                  - phase
                  type: object
                type: array
              phase:
                type: string
              runSummary:
                properties:
                  count:
                    format: int32
                    type: integer
                  error:
                    format: int32
                    type: integer
                  failed:
                    format: int32
                    type: integer
                  inconclusive:
                    format: int32
                    type: integer
                  successful:
                    format: int32
                    type: integer
                type: object
              startedAt:
                format: date-time
                type: string
            required:
            - phase
            type: object
        required:
        - spec
        type: object
    served: true
    storage: true
    subresources: {}
status:
  acceptedNames:
    kind: AnalysisRun
    listKind: AnalysisRunList
    plural: analysisruns
    shortNames:
    - ar
    singular: analysisrun
  conditions:
  - lastTransitionTime: "2024-06-25T14:20:08Z"
    message: no conflicts found
    reason: NoConflicts
    status: "True"
    type: NamesAccepted
  - lastTransitionTime: "2024-06-25T14:20:08Z"
    message: the initial names have been accepted
    reason: InitialNamesAccepted
    status: "True"
    type: Established
  storedVersions:
  - v1alpha1