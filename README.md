# spring-boot-admin-docker
Easy to do Docker Container setup for Spring Boot Admin

# Building
`docker build -t spring-boot-admin-docker .`

# Deploying
- Run build step
- Tag with 
```
docker tag spring-boot-admin-docker <organization>/spring-boot-admin-docker:<spring_admin_version>
```
- Push with 
```
docker push <organization>/spring-boot-admin-docker:<spring_admin_version>
```

# Running

With Docker Compose
```yaml
version: '3'
services:
    spring-admin:
        container_name: local-spring-admin
        image: rustedshark/spring-boot-admin-docker:2.1.6
        ports:
            - "8090:8080"
```

With Docker Daemon
```shell script
docker run -d -p 8090:8080 --name local-spring-admin rustedshark/spring-boot-admin-docker:2.1.6
```