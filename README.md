# Quarkus ArgoCD

[![Version](https://img.shields.io/maven-central/v/io.quarkiverse.argocd/quarkus-argocd?logo=apache-maven&style=flat-square)](https://central.sonatype.com/artifact/io.quarkiverse.argocd/quarkus-argocd-parent)

Generate Argo CD Application as part of the Quarkus build or the Quarkus CLI.

## Features

- Generate the Argo CD Application Kubernetes CR for the Quarkus application
- Command Line interface to install / uninstall and list Argo CD Application(s)
- Integration with Quarkus Helm

## Requirements
- Project added under version control and pushed on a repository (e.g. GitHub, etc.)
- A Kubernetes cluster with Argo CD [installed](https://argo-cd.readthedocs.io/en/stable/getting_started/#1-install-argo-cd) and [supporting](https://argo-cd.readthedocs.io/en/stable/user-guide/application-specification/) `argoproj.io/v1alpha1`.

## Building

To build the extension use the following command:

```shell
mvn clean install
```

## Usage

To get the Argo CD custom resources generated, it is needed to add the `quarkus-argocd` extension to the project.

### Add extension to your project 

To add the extension to the project, manually edit the `pom.xml` or `build.gradle` file.

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

After this step the Argo CD will be generated under the `.argocd` directory within the project root as part of the build.

### Using the CLI

The project provides a companion CLI that can be used to install / uninstall and list the Argo CD Applications.
The CLI can be added with the following command:

```shell
quarkus plug add io.quarkiverse.argocd:quarkus-argocd-cli:999-SNAPSHOT
```

#### Regenerating the files:

To re-trigger the file generation:

```shell
quarkus argocd project generate
```

#### Installing the application

To install generated `Application` CR to the currently connected Kubernetes cluster:

```shell
quarkus argocd project install
```
**Note**: In case of un-committed or un-pushed changes the command will prompt users to decide if they want to proceed with the installation.

The `currently connected Kubernetes cluster` is the one that is configured in the `~/.kube/config` file.
It can be overridden by setting in `applcation.properties` a different API server URL and token. See the `quarkus-kubernetes-client` extension for more details.

To uninstall:

```shell
quarkus argocd project uninstall
```

#### Listing installed applications

To list all Applications installed

```shell
quarkus argocd project list
```
