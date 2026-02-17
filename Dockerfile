FROM eclipse-temurin:8-jre-alpine
#FROM openjdk:8
EXPOSE 9000
ADD target/aws-spring-boot-cicd.jar aws-spring-boot-cicd.jar
ENTRYPOINT ["java", "-jar","/aws-spring-boot-cicd.jar"]