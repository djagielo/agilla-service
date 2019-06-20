FROM maven:3-jdk-12 as build
WORKDIR '/app'
COPY . .
RUN mvn clean package

FROM openjdk:12-jdk
WORKDIR '/app'
EXPOSE 8080
COPY --from=build /app/target/agilla-service-0.0.1-SNAPSHOT.jar /app
CMD ["java", "-jar", "agilla-service-0.0.1-SNAPSHOT.jar"]