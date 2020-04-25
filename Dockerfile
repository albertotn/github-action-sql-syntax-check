FROM gradle:jdk11 as builder

COPY --chown=gradle:gradle . /home/gradle/src
WORKDIR /home/gradle/src
RUN gradle build

FROM openjdk:11-jre-slim

ARG JAR_FILE=build/libs/github-action-sql-syntax-check.jar

# cd /usr/local/runme
# WORKDIR /usr/local/runme

# copy jar /usr/local/runme/app.jar
COPY ${JAR_FILE} app.jar

# java -jar /usr/local/runme/app.jar
ENTRYPOINT ["java","-jar","app.jar"]
