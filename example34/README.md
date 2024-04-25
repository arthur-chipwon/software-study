# ChirpWow Toturials \ Example 34

## Overview
This example will demonstrate how to use Maven and Tycho workflow to bulid a stand Eclipse project.
This example can be used for a Eclipse project preliminary template.

## Requirements
* **Eclipse IDE for Eclipse Committers** [link](https://www.eclipse.org/downloads/)
* **OpenJDK 17** [link](https://adoptium.net/)
* **Apache Maven** [link](https://maven.apache.org/)

## Structure of The Project
<p>[${project_root}]<br />
&emsp;|-> [${group_id}]<br />
&emsp;|-> [${group_id}.feature]<br />
&emsp;|-> [${group_id}.repository]<br />
&emsp;|-> [${group_id}.target]</p>

## Command-line Build Instructions with Maven

This example uses the standard Maven and Tycho workflow for building CWIDE using Maven 3.9.4 and Java 17.
Therefore to package CWIDE do:
```
mvn package
```
and the resulting p2 repository will be in `${group_id}.repository/target/repository`.
