FROM openjdk:18-alpine
EXPOSE 8080
ADD target/kube.jar kube.jar
RUN apk add --no-cache curl
ENTRYPOINT ["java","-jar","/kube.jar"]