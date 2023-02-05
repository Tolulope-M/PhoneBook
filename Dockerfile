FROM eclipse-temurin:17-jdk-alpine
MAINTAINER Morenike.com
COPY target/PhoneBook-0.0.1-SNAPSHOT.jar PhoneBook-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/PhoneBook-0.0.1-SNAPSHOT.jar"]