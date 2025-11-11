# Spring Boot REST Application

This is a simple Spring Boot RESTful application created with Maven.

## Features
- Spring Boot 3.2.0
- Spring Web (REST API)
- Spring DevTools (for development)
- One REST endpoint: `/welcome`

## Requirements
- Java 17 or higher
- Maven 3.6 or higher

## How to Build
```bash
cd spring-boot-app
mvn clean install
```

## How to Run
```bash
cd spring-boot-app
mvn spring-boot:run
```

The application will start on port 8080.

## Testing the Endpoint
Once the application is running, you can test the `/welcome` endpoint:

```bash
curl http://localhost:8080/welcome
```

Or open your browser and navigate to: `http://localhost:8080/welcome`

## Running Tests
```bash
cd spring-boot-app
mvn test
```
