FROM openjdk:21-jdk
VOLUME /tmp
ADD target/spannerdemo-0.0.1-SNAPSHOT.jar app.jar
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]