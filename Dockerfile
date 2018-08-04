FROM hub.c.163.com/library/java:8-alpine

MAINTAINER LayJustDoIt lsw1074870173@163.com

ADD target/*.jar app.jar

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "/app.jar"]