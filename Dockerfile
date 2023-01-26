FROM openjdk:19
RUN adduser --system  spring 
USER spring:spring
ARG JAR_FILE=target/springboot-web-0.0.1-SNAPSHOT.jar
COPY ${JAR_FILE} app.jar
ENTRYPOINT ["java","-jar","/app.jar"]