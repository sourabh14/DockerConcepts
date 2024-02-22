package com.example.DockerConcepts;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DockerConceptsApplication {

	public static void main(String[] args) {
		SpringApplication.run(DockerConceptsApplication.class, args);
		/*
			Application build and run without docker:
				export JAVA_HOME="$(/usr/libexec/java_home -v 17)"
				mvn clean install
				java -jar target/DockerConcepts-0.0.1-SNAPSHOT.jar

				By default will start app on port 8081 as specified in application.properties

			Docker commands:
				# Build image
				docker build -t docker-concepts:0.0.1 .

				# View images
				docker images

				# Run container
				docker run -p 9000:8081 -t docker-concepts:0.0.1
				This will start app at port 9000

				# Run container in background
				docker run -dp 9000:8081 -t docker-concepts:0.0.1

				# Note that we can use same image to run on multiple ports,
				# so we can run multiple instances of app

				# See processes
				docker ps
				docker ps -a

				# Kill processes
				docker kill <container-id>

				# Delete image
				docker rmi <image-id>

				# Docker with mysql
				https://apisero.com/dockerizing-a-spring-boot-application-with-mysql-database/

		 */
	}

}
