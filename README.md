# MSA Spring Boot Project

This is a sample Microservices Architecture (MSA) project built with Spring Boot, using Eureka, Spring Cloud Gateway, and H2 Database.

## 🔧 Tech Stack

- ☕ Spring Boot 3.4.4
- ⚙️ Spring Cloud (Eureka, Gateway)
- 🐳 Docker (To be added later)
- ☸️ Kubernetes (To be added later)
- 🐘 H2 In-memory DB (for dev)
- 🔐 Spring Security (if added)

## 📦 Modules

| Module               | Description                    |
|----------------------|--------------------------------|
| `apigateway-service` | API Gateway using Spring Cloud |
| `user-service`       | User microservice              |
| `discoveryservice`   | Eureka Service Discovery       |
| `first-service`      | Sample Test business service   |
| `second-service`     | Sample Test business service   |

## 🚀 Run Locally

```bash
./gradlew clean build
./gradlew bootRun --parallel
