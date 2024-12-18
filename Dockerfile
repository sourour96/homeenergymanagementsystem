FROM openjdk:11.0.11
EXPOSE 8080
COPY ./ServiceAccount.json ./ServiceAccount.json
ADD target/homeenergymanagementsystem-docker.jar homeenergymanagementsystem-docker.jar
COPY . .
CMD ["java","-jar","/homeenergymanagementsystem-docker.jar"]