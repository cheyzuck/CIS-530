#
#
#
FROM openjdk:8-jdk-alpine
ENV SPRING_PROFILES_ACTIVE docker
VOLUME /tmp
ARG JAR_FILE
COPY ${JAR_FILE} bookclub.jar
ENTRYPOINT ["java",\
            "-Djava.security.egd=file:/dev/./urandom",\
            "-jar",\
            "/bookclub.jar"]
