FROM openjdk:19
RUN adduser --system --group spring
USER spring:spring
ARG JAR_FILE=springboot-web.jar
COPY ${JAR_FILE} app.jar
ENTRYPOINT ["java","-jar","/app.jar"]