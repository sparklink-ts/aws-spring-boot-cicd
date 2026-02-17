FROM openjdk:17
EXPOSE 5000
ADD target/aws-spring-boot-cicd.jar aws-spring-boot-cicd.jar
ENTRYPOINT ["java", "-jar","/aws-spring-boot-cicd.jar"]