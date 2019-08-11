FROM adoptopenjdk/openjdk12

EXPOSE 8080

### Add microservice artifact
COPY ./build/libs/spring-boot-admin-docker.jar /opt/spring-boot-admin-docker.jar

WORKDIR /opt
ENTRYPOINT ["java", "-jar", "spring-boot-admin-docker.jar"]