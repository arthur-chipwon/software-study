# ChirpWow Toturials \ Example 33

## Overview
This example will demonstrate how to create and modify a plug-in with Maven,
Eclipse-Tycho architecture type, next to make branding to a eclipse-based product.

## Requirements
* **Eclipse IDE for Eclipse Committers** [link](https://www.eclipse.org/downloads/)
* **OpenJDK 17** [link](https://adoptium.net/)
* **Apache Maven** [link](https://maven.apache.org/)

## Structure of The Project
* [${group_id}]
* [${group_id}.feature]
* [${group_id}.repository]
* [${group_id}.product]
* [${group_id}.target]
* [${group_id}.test]

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
