# Use the Eclipse Temurin JDK 17 image
#FROM eclipse-temurin:17-jdk
# Use the Amazon Corretto JDK 17 image
FROM amazoncorretto:17
EXPOSE 5000
ADD target/aws-spring-boot-cicd.jar aws-spring-boot-cicd.jar
ENTRYPOINT ["java", "-jar","/aws-spring-boot-cicd.jar"]