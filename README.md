
## About terrain calculator

This code has the intention to calculate the volume of liquids that can be stored in a surface defined by an array of integers, it was designed as a Rest API.

### Prerequisites:

* [Docker](https://www.docker.com/)
* [Maven](https://maven.apache.org/)
* [jdk 11](https://docs.aws.amazon.com/corretto/latest/corretto-11-ug/downloads-list.html)

### Recommended
* [Postman](https://www.postman.com/)

### Installation:
1. Run tests:
   ```sh
   mvn test
   ```
  
2. Build the docker image:
   ```sh
   docker build -t volume-calculator .
   ```

3. Run the docker image for tests purposes:
   ```sh
   docker run --rm -it -p 127.0.0.1:8080:8080 volume-calculator:latest
   ```
   
* Run the docker image in production:
   ```sh
   docker run --rm -it volume-calculator:latest
   ```
   
### Rest API

To try out the terrain volume calculator, send a post request to:

   ```sh
   http://localhost:8080//terrain
   ```

send a body of type application/json with an array of integers, for example:

   ```sh
       {
        "data":[4,1,1,0,2,3]
       }
   ```

now you can expect the volume of the terrain being sent back

   ```sh
      {
        "data": [4,1,1,0,2,3],
        "waterVolume": 8
      }
   ```

### Swagger

To access the swagger UI:

   ```sh
   http://localhost:8080/swagger-ui.html
   ```

Swagger API:

   ```sh
   http://localhost:8080/v2/api-docs
   ```
