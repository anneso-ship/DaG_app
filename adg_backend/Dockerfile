# Using a Java 17 image
FROM openjdk:17-jdk-alpine

# Creating the application directory
RUN mkdir -p /app

# Changed the working directory to /opt/app
WORKDIR /opt/app

# Installation of MySQL client
RUN apk add --no-cache mysql-client

# Copy adg-0.0.1-SNAPSHOT.jar to /opt/app/app.jar
COPY target/adg-0.0.1-SNAPSHOT.jar app.jar

# Application configuration for MySQL
ENV SPRING_DATASOURCE_URL=jdbc:mysql://localhost:3306/adg_db?zeroDateTimeBehavior=CONVERT_TO_NULL&serverTimezone=UTC
ENV SPRING_DATASOURCE_USERNAME=root
ENV SPRING_DATASOURCE_PASSWORD=admin

# Run the jar file with ENTRYPOINT
ENTRYPOINT ["java","-agentlib:jdwp=transport=dt_socket,server=y,suspend=n,address=*:30303","-jar","app.jar"]
