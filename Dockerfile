FROM openjdk:11
EXPOSE 8080
ADD target/springboot.jar springbootn.jar
ENTRYPOINT ["java","-jar","/springboot.jar"]
