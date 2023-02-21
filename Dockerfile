FROM openjdk:17
EXPOSE 8080
ADD target/springelastictesting-0.0.1-SNAPSHOT.jar spring-0.0.1.jar
ENTRYPOINT ["java","-jar","/spring-0.0.1.jar"]