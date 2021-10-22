FROM openjdk:8-jdk-alpine
COPY build/libs/*.jar rewardCentral-1.0.0.jar
ENTRYPOINT ["java","-jar","/rewardCentral-1.0.0.jar"]