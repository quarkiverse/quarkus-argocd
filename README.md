# Quarkus ArgoCD

[![Version](https://img.shields.io/maven-central/v/io.quarkiverse.argocd/quarkus-argocd?logo=apache-maven&style=flat-square)](https://central.sonatype.com/artifact/io.quarkiverse.argocd/quarkus-argocd-parent)

Generate ArgoCD Application as part of the Quarkus build or the Quarkus CLI.

## Features

- Generate the ArgoCD Application Kubernetes CR for the Quarkus application
- Command Line interface to install / uninstall and list Application(s)
- Integration with Quarkus Helm

## Requirements
- Project added under version control
- A Kubernetes cluster with the ArgoCD Operator installed (supporting `argoproj.io/v1alpha1`).

## Building

To build the extension use the following command:

```shell
mvn clean install
```

## Usage

To get the the argocd custom resources generated one needs to add the `quarkus-argocd` extension to the project.

### Add extension to your project 

To add the extension to the project you to manually edit the `pom.xml` / `build.gradle` file.

#### Manually editing the `pom.xml` file

```xml
<dependency>
    <groupId>io.quarkiverse.argocd</groupId>
    <artifactId>quarkus-argocd</artifactId>
    <version>999-SNAPSHOT</version>
</dependency>
```

#### Manually editing the `build.gradle` file

```groovy
dependencies {
    implementation 'io.quarkiverse.argocd:quarkus-argocd:999-SNAPSHOT'
}
```

After this step the ArgoCD CR will be generated under `.argocd` directory in the project root as part of the build.

### Using the CLI

The project provides a companion CLI that can be used to install / uninstall and list the ArgoCD Applications.
The CLI can be added with the following command:

```shell
quarkus plug add io.quarkiverse.argocd:quarkus-argocd-cli:999-SNAPSHOT
```

#### Regenerating the files:

To re-triggger the file generation:

```shell
quarkus argocd application generate
```

#### Installing the application

To install generated `Application` CR to the currently connected Kubernetes cluster:

```shell
quarkus argocd application install
```
**Note**: In case of uncommited or unpushed changes the command will prompt users to decide if they want to proceed with the installation.

The `currently connected Kubernetes cluster` is the one that is configured in the `~/.kube/config` file.
It can be overriden by setting in `applcation.properties` a different API server url and token. See the `quarkus-kubernetes-client` extension for more details.

To uninstall:

```shell
quarkus argocd application uninstall
```

#### Listing installed applications

To list all Applications installed

```shell
quarkus argocd application list
```
