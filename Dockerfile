FROM openjdk:11
ARG JAR_FILE=springboot-web.jar
COPY ${JAR_FILE} app.jar
ENTRYPOINT ["java","-jar","/app.jar"]