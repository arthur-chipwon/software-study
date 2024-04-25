# ChirpWow Toturials \ Example 33

## Overview
This example will demonstrate how to create and modify a plug-in with Maven,
Eclipse-Tycho architecture type, next to make branding to a eclipse-based product.

## Requirements
* **Eclipse IDE for Eclipse Committers** [link](https://www.eclipse.org/downloads/)
* **OpenJDK 17** [link](https://adoptium.net/)
* **Apache Maven** [link](https://maven.apache.org/)

## Structure of The Project
<p>[${project_root}]<br />
&emsp;|-> [${group_id}]<br />
&emsp;|-> [${group_id}.feature]<br />
&emsp;|-> [${group_id}.repository]<br />
&emsp;|-> [${group_id}.product]<br />
&emsp;|-> [${group_id}.target]<br />
&emsp;|-> [${group_id}.test]</p>

## Command-line Instructions for Project Creation

This example is created by refered to a template of the archetype `eclipse-tycho-archetype`.
Therefore to create a project do:
```
mvn archetype:generate -DarchetypeGroupId=com.github.bmaggi -DarchetypeArtifactId=eclipse-tycho-archetype
```

## Command-line Build Instructions with Maven

This example uses the standard Maven and Tycho workflow for building CWIDE using Maven 3.9.4 and Java 17.
Therefore to package CWIDE do:
```
mvn package
```
and the resulting p2 repository will be in `${group_id}.repository/target/repository`.
