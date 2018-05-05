FROM java:8-jre
MAINTAINER Shydow Lee

ADD ./target/demo-service.jar /app/
CMD ["java", "-Xmx200m", "-jar", "/app/demo-service.jar"]

EXPOSE 8000