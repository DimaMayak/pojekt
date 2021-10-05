FROM adoptopenjdk/openjdk14:jdk-14.0.2_12
LABEL maintainer=dima

WORKDIR /poject
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} app.jar

CMD ["sh", "-c", "java --enable-preview -Xmx450m -jar app.jar" ]
EXPOSE 8080 8080