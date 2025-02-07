FROM openjdk:17-alpine
EXPOSE 8080
ADD target/kube.jar kube.jar
ENTRYPOINT ["java","-jar","/kube.jar"]