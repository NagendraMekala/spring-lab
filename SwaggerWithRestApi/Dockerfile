# Start with a base image containing Java runtime
FROM openjdk:8

# Add a volume pointing to /tmp
#VOLUME /tmp

# The application's jar file
ARG JAR_FILE=/target/SwaggerWithRestApi-0.0.1-SNAPSHOT.jar

ADD ${JAR_FILE} SwaggerWithRestApi-0.0.1-SNAPSHOT.jar

# Make port 8080 available to the world outside this container
EXPOSE 8585

# Run the jar file 
ENTRYPOINT ["java","-jar","SwaggerWithRestApi-0.0.1-SNAPSHOT.jar"]