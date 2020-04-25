FROM gradle:jdk11 as builder

WORKDIR /app
COPY . /app
RUN gradle clean build

ARG JAR_FILE=build/libs/github-action-sql-syntax-check.jar

# copy jar /usr/local/runme/app.jar
COPY ${JAR_FILE} app.jar

# java -jar /usr/local/runme/app.jar
ENTRYPOINT ["java","-jar","app.jar"]
