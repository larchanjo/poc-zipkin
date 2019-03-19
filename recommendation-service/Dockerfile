FROM openjdk:8u171-alpine3.7
RUN apk --no-cache add curl
COPY target/recommendation-service*.jar recommendation-service.jar
CMD java ${JAVA_OPTS} -jar recommendation-service.jar