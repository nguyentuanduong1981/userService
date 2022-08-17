FROM openjdk:11
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} user-test-service.jar
ENTRYPOINT ["java", "-jar", "/user-test-service.jar"]
EXPOSE 8200