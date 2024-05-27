# To-Do App

This project creates user and user's to-do.

## Requirements

For building and running the application you need:

Java 17

Maven

## Build and Running 

mvn clean package

docker build --tag=todo:v1.1 .

docker run -p8080:8080 todo:v1.1
