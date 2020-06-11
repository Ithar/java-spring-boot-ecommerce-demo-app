FROM openjdk:8-alpine

MAINTAINER Ithar Malik

RUN mkdir -p /opt/security_app/lib

COPY target/security-actuator-demo-0.0.1-SNAPSHOT.jar /opt/security_app/lib

EXPOSE 8080

CMD ["java", "-jar" ,"/opt/security_app/lib/security-actuator-demo-0.0.1-SNAPSHOT.jar"]


