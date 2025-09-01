FROM eclipse-temurin:17.0.15_6-jdk-ubi9-minimal

COPY /build/libs/Diplomado2025-0.0.1-SNAPSHOT.jar ./eljar.jar

ENV HOST="localhost"
ENV USER="user"
ENV PASS="pass"
EXPOSE 8080

ENTRYPOINT ["java","-jar","eljar.jar"]
