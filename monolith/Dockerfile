FROM node:12.18.0-alpine3.11 AS front

WORKDIR /usr/src/server 
COPY client .
RUN ["npm", "install"]
RUN [ "npm", "run", "build", "--prod"]


FROM maven:3.6.3-ibmjava-8-alpine AS appServer

WORKDIR /usr/src/server
COPY server .
COPY --from=front /usr/src/server/dist/testAngular ./src/main/resources/static
RUN ["mvn", "package", "-DskipTests"]


FROM openjdk:8-jdk-alpine
WORKDIR /app
COPY --from=appServer /usr/src/server/target/monolith-0.0.1-SNAPSHOT.jar ./

EXPOSE 8080

CMD ["java", "-jar", "monolith-0.0.1-SNAPSHOT.jar"]
