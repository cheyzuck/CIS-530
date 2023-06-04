#
#
#
FROM openjdk:8-jdk-alpine
ENV SPRING_PROFILES_ACTIVE docker
VOLUME /tmp
ARG JAR_FILE 
ADD ${JAR_FILE} target/bookclub.jar
EXPOSE 8080
ENTRYPOINT ["java",\
            "-Djava.security.egd=file:/dev/./urandom",\
            "-jar",\
            "target/bookclub.jar"]
