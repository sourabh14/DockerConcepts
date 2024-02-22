# FROM: As the base for our image, we’ll take the Java-enabled Alpine Linux
FROM openjdk:17

# Copy jar file into the image
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} app.jar

# ENTRYPOINT: This will be the executable to start when the container is booting. We must define them as
# JSON-Array because we’ll use an ENTRYPOINT in combination with a CMD for some application arguments.
ENTRYPOINT ["java","-jar","/app.jar"]
