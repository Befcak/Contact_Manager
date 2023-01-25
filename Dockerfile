FROM openjdk:11
RUN addgroup --system spring && adduser --system spring --group spring
USER spring:spring
ARG JAR_FILE=springboot-web.jar
COPY ${JAR_FILE} app.jar
ENTRYPOINT ["java","-jar","/app.jar"]