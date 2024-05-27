FROM openjdk:17-jdk-slim
COPY target/todo-0.0.1-SNAPSHOT.jar app.jar
ENTRYPOINT ["java","-jar","/app.jar"]