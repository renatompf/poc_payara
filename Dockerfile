FROM maven:3.8.3-openjdk-17 AS build
WORKDIR /
COPY . /home/app
RUN mvn -f /home/app/pom.xml clean package

FROM payara/server-full
COPY --from=build /home/app/target/*.war $DEPLOY_DIR