FROM openjdk:17
FROM maven:alpine
ENV APP_HOME=/usr/app/
WORKDIR $APP_HOME
COPY ./build/libs/Localibbackend-0.0.1-SNAPSHOT.jar .

EXPOSE 8080
CMD ["java","-jar","Localibbackend-0.0.1-SNAPSHOT.jar"]