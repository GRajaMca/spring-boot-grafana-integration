FROM openjdk:11-jre-slim-buster
VOLUME /tmp
ADD target/app.jar /home/app.jar
WORKDIR "/home"
EXPOSE 8888
CMD ["java", "-Dspring.application.name=spring-boot-grafana-integration", "-Xmx512m", "-jar", "./app.jar"]