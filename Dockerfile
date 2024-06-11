FROM openjdk:17
WORKDIR /app
COPY target/jenkins-deploy-ec2.jar /app
ENTRYPOINT ["java","-jar","jenkins-deploy-ec2.jar"]