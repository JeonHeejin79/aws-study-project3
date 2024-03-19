FROM openjdk:17-jdk-slim-buster

WORKDIR /app

ARG JAR_FILE=target/*.war
COPY ${JAR_FILE} app.war

# JAR_FILE_PATH에 저장된 값을 app.jar로 복사
#COPY target/ROOT.jar app.jar

#CMD ["java", "-jar", "app.jar"]
CMD ["java", "-jar", "app.war"]