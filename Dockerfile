FROM openjdk:17-oracle
ADD build/libs/cicd-1.jar cicd-1.jar
EXPOSE 8000
CMD ["java", "-jar", "/cicd-1.jar"]
