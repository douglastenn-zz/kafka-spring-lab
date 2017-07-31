FROM maven:3.5-jdk-8-alpine

WORKDIR /app

ADD . /app

CMD ["mvn", “clean”]