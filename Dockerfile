FROM openjdk

WORKDIR /apps

COPY App.java /apps

RUN javac App.java

CMD ["java", "App"]

