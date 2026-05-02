# My First Spring Boot Project

A simple Spring Boot application to get started with Java web development.

## What is Spring Boot?

Spring Boot is a framework that makes it easy to create stand-alone, production-grade Spring-based applications. It takes care of most of the configuration for you, so you can focus on writing your application code.

## Prerequisites

Before you can run this project, make sure you have:

- **Java JDK 17** or higher installed ([Download here](https://www.oracle.com/java/technologies/downloads/))
- **Maven** (build tool)
- An IDE like **IntelliJ IDEA**, **Eclipse**, or **VS Code**

## Getting Started

### 1. Clone or Download This Project

```bash
git clone <your-repository-url>
cd <project-folder>
```

### 2. Build the Project

If using Maven:
```bash
./mvnw clean install
```

### 3. Run the Application

If using Maven:
```bash
./mvnw spring-boot:run
```

Or simply run the main application class from your IDE.

### 4. Access the Application

Once the application starts, you should see output like:
```
Started Application in X.XXX seconds
```

Open your browser and go to:
```
http://localhost:8080
```

## Project Structure

```
src/
├── main/
│   ├── java/
│   │   └── com/dominio/projeto/
│   │       └── ProjetoApplication.java    # Main application 
            └── Controller.java            # Main controller 
    |   └── com/dominio/projeto2/
│   │       └── ControllerComponent.java    # Controller class to study component scanning, IOC and Dependency injection
    |       └── CustomComponent.java        # Custom component class
│   └── resources/
│       ├── application.properties      # Configuration file
│       ├── static/                     # Static files (CSS, JS, images)
│       └── templates/                  # HTML templates
└── test/
    └── java/                           # Test files
```

## Common Tasks

### Adding a REST Controller

Create a new class in your package:

```java
@RestController
@RequestMapping("/api")
public class HelloController {
    
    @GetMapping("/hello")
    public String sayHello() {
        return "Hello, Spring Boot!";
    }
}
```

### Changing the Server Port

Edit `src/main/resources/application.properties`:
```properties
server.port=8081
```

### Adding Dependencies

Add to your `pom.xml` (Maven).

## Troubleshooting

**Port already in use?**
- Change the port in `application.properties`
- Or stop the application using that port

**Application won't start?**
- Check the console for error messages
- Make sure your main class has `@SpringBootApplication` annotation

## Learning Resources

- [Spring Boot Official Docs](https://spring.io/projects/spring-boot)
- [Spring Boot Guides](https://spring.io/guides)
- [Baeldung Spring Boot Tutorials](https://www.baeldung.com/spring-boot)

## License

This project is for learning purposes.

---

**Happy coding!** 🚀