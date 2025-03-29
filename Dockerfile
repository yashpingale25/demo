FROM openjdk:25-slim-bullseye
ADD target/rest-demo2.jar /app/rest-demo2.jar
ENTRYPOINT ["java", "-jar","/app/rest-demo2.jar"]