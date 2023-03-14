FROM openjdk:11
COPY ./target/Calc-Using-Devops-1.0-SNAPSHOT-jar-with-dependencies.jar ./
WORKDIR ./
CMD ["java", "-jar", "Calc-Using-Devops-1.0-SNAPSHOT-jar-with-dependencies.jar"]