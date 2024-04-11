# ChirpWow Toturials \ Example 32

## Overview
This example will demonstrate how to create, modify and test a plug-in with Maven,
Eclipse-Tycho architecture type.

## Requirements
* **OpenJDK 17** [link](https://adoptium.net/)
* **Apache Maven** [link](https://maven.apache.org/)

## Structure of The Project
* [${group_id}]
* [${group_id}.feature]
* [${group_id}.repository]
* [${group_id}.product]
* [${group_id}.target]
* [${group_id}.test]

## Command Line Instructions for Project Creation

This example is created by refered to a template of the archetype `eclipse-tycho-archetype`.
Therefore to create a project do:
```
mvn archetype:generate -DarchetypeGroupId=com.github.bmaggi -DarchetypeArtifactId=eclipse-tycho-archetype
```

## Command Line Build Instructions with Maven

This example uses the standard Maven and Tycho workflow for building CWIDE using Maven 3.9.4 and Java 17.
Therefore to package CWIDE do:
```
mvn package
```
