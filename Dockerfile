FROM builder-base:latest

ADD target/IgniteService-1.jar /service.jar
ADD config.yml /opt/config.yml

EXPOSE 8080

CMD [ "/bin/sh", "-c", "java -jar /service.jar server /opt/config.yml" ]