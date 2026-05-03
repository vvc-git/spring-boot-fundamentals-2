<h1 align="left">
  Studying Java Spring
  <img src="https://github.com/user-attachments/assets/9705bdff-b786-4a16-bd2c-498ea325cc12" alt="Spring_Boot svg" width="30"/>
</h1>

Examples and notes on **Spring Framework** and **Spring Boot**.

## Prerequisites

- **Java JDK 17+** ([Download](https://www.oracle.com/java/technologies/downloads/))
- **Maven**
- IDE: IntelliJ IDEA, Eclipse, or VS Code

## Quick Start

```bash
# Build
./mvn clean install

# Run
./mvn spring-boot:run
```

Access at `http://localhost:8080`

## Project Structure

```
src/main/java/com/dominio/projeto/
├── ProjetoApplication.java       # Main entry point (@SpringBootApplication)
├── HelloController.java          # REST endpoints
└── CustomComponent.java          # Component bean example

src/main/resources/
├── application.properties        # Configuration (port, database, etc.)
├── static/                       # CSS, JS, images
└── templates/                    # HTML templates
```
