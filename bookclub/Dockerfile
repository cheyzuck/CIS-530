#
#
#
FROM eclipse-temurin:17-jdk-jammy
ENV SPRING_PROFILES_ACTIVE docker
VOLUME /tmp
ARG JAR_FILE = target/bookclub.jar
COPY ${JAR_FILE} /bookclub.jar
EXPOSE 8080
ENTRYPOINT ["java",\
            "-Djava.security.egd=file:/dev/./urandom",\
            "-jar",\
            "bookclub.jar"]
