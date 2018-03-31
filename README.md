# Authentication service
Authentication service for Cloud Computing Project following instruction shows you how to run or use this service:
 1. [Running Serivice as a docker container](#running)
 2. [Using serivce](#using)

## Running

First of all you need to run this service:
 
### pulling from docker hub:

```terminal
docker pull makbn/cc-authentication-service 
```

### create your own image :

1. download `jar` file from [here](https://github.com/makbn/authentication-service/releases/tag/1.0-SNAPSHOT) or you can [build your own jar from source code](#building-jar-from-spring-project)
2. create a new empty directory
3. move downloaded `jar` file to the directory
4. create `Dockerfile`:
  
```dockerfile
FROM java:openjdk-8-jdk-alpine
ADD /CC-Authentication-Micro-Service-1.0-SNAPSHOT.jar //
ENTRYPOINT ["java","-jar","/CC-Authentication-Micro-Service-1.0-SNAPSHOT.jar"]
EXPOSE 8080
```
5. open terminal change direction to the directory of Dockerfile
6. run `docker build` command:

```terminal
docker build -t cc-authentication-service -f /Users/makbn/IdeaProjects/CCAuthenticationMicroService/docker/Dockerfile .
```
7.done.

## Building `jar` from java Spring project:

for spring project with `pom` file it easy to generate a `jar` file just by adding Spring boot maven plugin:

```xml
<build>
        <plugins>
            <plugin>
                <groupId>org.springframework.boot</groupId>
                <artifactId>spring-boot-maven-plugin</artifactId>
            </plugin>
        </plugins>
    </build>

```

after adding this line use `mvn` command:

```terminal
mvn package
```

## Using

* Student login:
  * Request : `GET`
  * Parameters : `studentNumber`,`password`
  * Example:
  ```
  http://localhost:8080/student/login?studentNumber=9312430000&password=123456
  ```
