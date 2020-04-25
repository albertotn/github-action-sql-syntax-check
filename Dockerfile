FROM gradle:jdk11 as builder

WORKDIR /app
COPY . /app/
RUN gradle build

ENTRYPOINT ["java", "-jar", "/app/build/libs/github-action-sql-syntax-check.jar"]