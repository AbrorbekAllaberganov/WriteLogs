# Spring Boot Project with File Logging

This project is a simple Spring Boot application that demonstrates logging into a file using SLF4J and Logback.

## Prerequisites

Before running this application, make sure you have the following installed:

- Java Development Kit (JDK) 17 or later
- Maven (if you're using Maven for dependency management)

## Getting Started

1. Clone this repository to your local machine:

   ```bash
   https://github.com/AbrorbekAllaberganov/WriteLogs.git
   ```
2. Navigate to the project directory:
   
   ```bash
    cd your-spring-boot-project
   ```
3. Build the project using Maven:
   ```bash
     mvn clean package
   ```
4. Run the Spring Boot application:
  ```bash
    java -jar target/your-application.jar
  ```

## Logging Configuration

This project uses SLF4J for logging abstraction and Logback as the logging implementation. Log messages are written to a file named application.log located in the logs directory.

The logging configuration is defined in src/main/resources/log4j2-spring.xml. You can customize the logging configuration according to your requirements.

## Usage
Once the application is running, it will start logging messages to the application.log file. You can monitor the log file to view the logged messages.

## Contributing
If you'd like to contribute to this project, please write in the comment section. It makes me happy. Thank you, HAPPY CODING :)
