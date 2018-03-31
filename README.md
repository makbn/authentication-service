# Authentication service
Authentication service for Cloud Computing Project 

## Using

First of all you need to run this service?:
 
1. pulling from docker hub:
``` docker pull makbn/cc-authentication-service ```
2. create your own image :

  1. download `jar` file from [here](https://github.com/makbn/authentication-service/releases/tag/1.0-SNAPSHOT)
  2. create a new empty directory
  3. move downloaded `jar` file to the directory
  4. create `Dockerfile`:
  
  ```
  FROM java:openjdk-8-jdk-alpine
ADD /CC-Authentication-Micro-Service-1.0-SNAPSHOT.jar //
ENTRYPOINT ["java","-jar","/CC-Authentication-Micro-Service-1.0-SNAPSHOT.jar"]
EXPOSE 8080
```
  5. open terminal change direction to the directory of Dockerfile
  6. run `docker build` command:
  
  ```
  docker build -t cc-authentication-service -f /Users/makbn/IdeaProjects/CCAuthenticationMicroService/docker/Dockerfile .
  ```
  7.done.
