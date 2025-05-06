#Dockerfile for boot INSTRUCTIONS argument
FROM eclipse-temurin:21

LABEL mantainer="ganin.joy"
#create the directory in container
WORKDIR /app
# copy source and place in the targetted folde
COPY target/*.jar  /app/messageDocker.jar

#run the jar
ENTRYPOINT ["java", "-jar", "messageDocker.jar"]
