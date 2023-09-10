# Use the official OpenJDK base image
FROM openjdk:17-jdk-slim

# Set the working directory
WORKDIR /app

# Copy the JAR file into the container
COPY build/libs/application-0.0.1-SNAPSHOT.jar /app/application.jar
# COPY build/libs/application-0.0.1-SNAPSHOT-plain.jar /app/application.jar

# Expose the port
EXPOSE 8080

# Run the application
CMD ["java", "-jar", "application.jar"]
