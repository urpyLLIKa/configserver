#!/bin/bash

export JAVA_HOME=/usr/lib/jvm/java-1.17.0-openjdk-amd64
./mvnw clean package -DskipTests

/usr/lib/jvm/java-17-openjdk-amd64/bin/java -jar target/configserver-0.0.1-SNAPSHOT.jar