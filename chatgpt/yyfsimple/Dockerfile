FROM maven:3.8.1-jdk-8-slim as builder

MAINTAINER yyf

# Copy local code to the container image.
WORKDIR /app
COPY pom.xml .
COPY src ./src

# Build a release artifact.
RUN mvn package -DskipTests

# Run the web service on container startup.
ENTRYPOINT ["java","-jar","/app/target/yyfsimple-1.0-SNAPSHOT.jar","--spring.profiles.active=prod"]