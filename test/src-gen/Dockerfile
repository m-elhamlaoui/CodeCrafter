FROM openjdk:11-jre-slim
RUN apt-get update && apt-get install -y curl
COPY target/myapp.jar /app/myapp.jar
EXPOSE 8080
ENV JAVA_OPTS -Xms512m -Xmx1024m
WORKDIR /app
CMD java -jar myapp.jar
