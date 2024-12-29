# user openjdk 17
FROM openjdk:17-jdk-alpine

# set working directory
WORKDIR /app

# jar file location
ARG JAR_FILE=target/demo-0.0.1-SNAPSHOT.jar
# ARG JAR_FILE=target/*.jar

# copy and rename jar file
COPY ${JAR_FILE} demo.jar

# expose port that app runs on
EXPOSE 16550

# set entry point to run app
ENTRYPOINT ["java", "-jar", "demo.jar"]