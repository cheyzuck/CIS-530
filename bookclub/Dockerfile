FROM eclipse-temurin:17-jdk-alpine
VOLUME /tmp
COPY target/*.jar bookclub.jar
ENTRYPOINT ["java","-jar","/bookclub.jar"]
EXPOSE 8080
