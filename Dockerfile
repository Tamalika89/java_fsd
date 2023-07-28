From openjdk:17
EXPOSE 8088
ADD target/SpringbootRest-0.0.1-SNAPSHOT.jar SpringbootRest-0.0.1-SNAPSHOT.jar
ENTRYPOINT [ "java","-jar","/SpringbootRest-0.0.1-SNAPSHOT.jar"]