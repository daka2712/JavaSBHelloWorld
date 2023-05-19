# HelloWorld REST API

This is a simple REST API implemented in Spring Boot. The API provides a `HelloWorldController` that handles various HTTP methods.

## Getting Started

To get started, you will need to clone this repository to your local machine.

git clone https://github.com/yourusername/yourrepository.git


## Prerequisites

You need to have the following installed:

- Java 11 or newer
- Maven

## Running the Application

You can run the application using the Spring Boot Maven plugin:

mvn spring-boot:run


The application will start and listen on port 8080.

## Endpoints

The `HelloWorldController` provides the following endpoints:

- `GET /hello`: Returns a simple string "Hola mundo!!!!!!!!!"
- `GET /echo?name={name}`: Returns a personalized greeting with the provided `name` as a query parameter
- `POST /post`: Accepts a string payload in the request body and returns "Received payload: " followed by the received payload
- `PUT /put`: Accepts a string payload in the request body and returns "Updated resource with payload: " followed by the received payload
- `DELETE /delete`: Returns a string "Resource deleted"
- `PATCH /patch`: Accepts a string payload in the request body and returns "Patched resource with payload: " followed by the received payload

## Testing the Endpoints

You can use any HTTP client to test the endpoints. For example, you can use `curl` or Postman.

curl http://localhost:8080/hello
curl "http://localhost:8080/echo?name=JohnSpartan"
curl -X POST -H "Content-Type: text/plain" -d "Hello" http://localhost:8080/post
curl -X PUT -H "Content-Type: text/plain" -d "Hello" http://localhost:8080/put
curl -X DELETE http://localhost:8080/delete
curl -X PATCH -H "Content-Type: text/plain" -d "Hello" http://localhost:8080/patch


## Contributing

We welcome contributions! Please see our [Contributing Guide](CONTRIBUTING.md) for more details.

## License

This project is licensed under the MIT License. See the [LICENSE](LICENSE) file for details.
