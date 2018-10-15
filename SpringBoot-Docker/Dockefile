# Start with a base image containing Java runtime
FROM openjdk:8

# Add a volume pointing to /tmp
#VOLUME /tmp

# The application's jar file
ARG JAR_FILE=/target/docker-spring-boot.jar

ADD ${JAR_FILE} docker-spring-boot.jar

# Make port 8080 available to the world outside this container
EXPOSE 8585

# Run the jar file 
ENTRYPOINT ["java","-jar","docker-spring-boot.jar"]