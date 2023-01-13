FROM alpine:latest

CMD ["/bin/sh"]

FROM amazoncorretto:11-alpine-jdk

copy target/portfolio-0.0.1-SNAPSHOT.jar app.jar

ENTRYPOINT ["java", "-jar","/app.jar"]
