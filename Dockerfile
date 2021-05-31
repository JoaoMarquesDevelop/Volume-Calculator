#
# Build the jar
#
FROM maven:3.8.1-amazoncorretto-11 AS build
COPY src /home/app/src
COPY pom.xml /home/app
RUN mvn -f /home/app/pom.xml clean install

#
# package the jar
#
FROM openjdk:11-jre-slim
COPY --from=build /home/app/target/*.jar /usr/local/lib/volume-calculator.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","/usr/local/lib/volume-calculator.jar"]