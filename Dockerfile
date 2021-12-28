FROM openjdk:8-jdk-alpine
WORKDIR /app
ADD . /app
CMD ["java", "-jar", "target/schoolapp_backend-0.0.1-SNAPSHOT.jar"]