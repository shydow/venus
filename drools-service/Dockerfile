FROM java:8-jre
MAINTAINER Shydow Lee

ADD ./target/drools-service.jar /app/
CMD ["java", "-Xmx200m", "-jar", "/app/drools-service.jar"]

EXPOSE 8000