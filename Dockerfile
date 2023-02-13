#
# Build stage
#
FROM maven:3.8.6-jdk-8 AS build
COPY . .
RUN mvn clean package -Pprod -DskipTests

#
# Package stage
#
FROM openjdk:8-jdk-slim
COPY --from=build /target/portfolio-website-0.0.1-SNAPSHOT.jar portfoliowebsite.jar
# ENV PORT=8080
EXPOSE 8080
ENTRYPOINT ["java","-jar","portfoliowebsite.jar"]