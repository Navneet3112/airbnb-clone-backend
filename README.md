# 🏨 Airbnb Clone Backend
![Java](https://img.shields.io/badge/Java-21-orange)
![Spring Boot](https://img.shields.io/badge/Spring_Boot-3.4.0-6DB33F)
![PostgreSQL](https://img.shields.io/badge/PostgreSQL-4169E1)
![JWT](https://img.shields.io/badge/JWT-Authentication-black)
![Maven](https://img.shields.io/badge/Maven-Build-red)

A production-inspired backend application built with **Java 21** and **Spring Boot 3.4.0** that replicates the core functionalities of Airbnb. The project provides secure authentication, hotel and room management, booking management, a **Strategy Pattern-based dynamic pricing engine**, and secure payment processing using **Stripe**.

The application follows a layered architecture (**Controller → Service → Repository**), implements **JWT-based authentication** with **Spring Security**, persists data in **PostgreSQL** using **Spring Data JPA (Hibernate)**, and follows backend development best practices such as global exception handling, request validation, and externalized configuration.

---

## ✨ Features

* 🔐 JWT-based Authentication & Role-Based Authorization
* 👤 User Registration & Login
* 🏨 Hotel Management
* 🛏️ Room Management
* 📅 Booking Management
* 🔍 Hotel Search
* 💰 Strategy Pattern-based Dynamic Pricing
* 💳 Stripe Payment Integration
* 🔔 Stripe Webhook Handling
* 📖 REST API Documentation using SpringDoc OpenAPI (Swagger UI)
* ✅ Global Exception Handling
* ✔️ Request Validation using Jakarta Validation

---

## 🛠️ Tech Stack

| Category                  | Technology                    |
| ------------------------- | ----------------------------- |
| Language                  | Java 21                       |
| Framework                 | Spring Boot 3.4.0             |
| Authentication & Security | Spring Security, JWT          |
| Database                  | PostgreSQL                    |
| ORM                       | Spring Data JPA (Hibernate)   |
| API Documentation         | SpringDoc OpenAPI, Swagger UI |
| Payment Gateway           | Stripe                        |
| Object Mapping            | ModelMapper                   |
| Build Tool                | Maven                         |
| Validation                | Jakarta Validation            |
| Boilerplate Reduction     | Lombok                        |

---

## 🏗️ Architecture

The application follows a layered architecture to ensure separation of concerns, maintainability, and scalability.

```text
                Client
                   │
                   ▼
          REST Controllers
                   │
                   ▼
            Service Layer
                   │
                   ▼
          Repository Layer
                   │
                   ▼
         PostgreSQL Database
```

### Architecture Overview

* **Controller Layer** – Exposes REST APIs and handles HTTP requests and responses.
* **Service Layer** – Contains business logic, validations, and application workflows.
* **Repository Layer** – Interacts with PostgreSQL using Spring Data JPA.
* **Database Layer** – Stores application data including users, hotels, rooms, bookings, and payments.

---

## 🔐 Security

The application follows modern backend security practices:

* JWT-based Authentication
* Role-Based Authorization
* Password Encryption using BCrypt
* Stateless Session Management
* JWT Authentication Filter
* Request Validation using Jakarta Validation
* Global Exception Handling
* Externalized configuration for sensitive credentials

> **Note:** Sensitive configuration such as database passwords, JWT secrets, and Stripe API keys are stored outside version control using `application-secret.properties`.

---

## 📁 Project Structure

```text
src
├── config          # Application and third-party configurations
├── controller      # REST API endpoints
├── dto             # Request and Response DTOs
├── entity          # JPA Entities
├── exception       # Global Exception Handling
├── repository      # Spring Data JPA Repositories
├── security        # JWT Authentication & Security Configuration
├── service         # Business Logic
├── strategy        # Dynamic Pricing Strategy
├── util            # Utility Classes
└── AirBnbAppApplication.java
```

---

## 🚀 Getting Started

### Prerequisites

Before running the application, ensure you have the following installed:

* Java 21
* Maven
* PostgreSQL
* Git

### Clone the Repository

```bash
git clone https://github.com/Navneet3112/airbnb-clone-backend.git
cd airbnb-clone-backend
```

### Configure Environment

Create a file named:

```text
src/main/resources/application-secret.properties
```

and add the required configuration values.

### Run the Application

```bash
mvn clean install
mvn spring-boot:run
```

The application will start on:

```text
http://localhost:8080
```

---

## ⚙️ Configuration

The application uses an external configuration file to keep sensitive information out of version control.

Example configuration:

```properties
spring.datasource.password=<your_database_password>

jwt.secretKey=<your_jwt_secret>

stripe.secret.key=<your_stripe_secret>

stripe.webhook.secret=<your_webhook_secret>
```

> **Note:** `application-secret.properties` is intentionally excluded from Git using `.gitignore`.

---

## 📖 API Documentation

Interactive API documentation is available through **SpringDoc OpenAPI (Swagger UI)**.

Once the application is running, visit:

```text
http://localhost:8080/swagger-ui/index.html
```

Swagger UI allows you to:

* Explore all available REST APIs
* Execute API requests directly from the browser
* View request and response schemas
* Test secured endpoints after authentication

---

## 🚀 Future Improvements

The following enhancements are planned for this project:

* 🐳 Docker & Docker Compose support
* ☁️ Cloud Deployment (Render/Railway)
* 🧪 Unit & Integration Testing using JUnit & Mockito
* 📚 Enhanced API Documentation

---

## 👨‍💻 Author

**Navneet Singh**

* 🎓 B.Tech, Electronics & Communication Engineering
* 🏫 Malaviya National Institute of Technology (MNIT), Jaipur
* 💻 Backend Developer | Java | Spring Boot | PostgreSQL

---

## 📖 About the Project

This project was developed as part of my backend development journey to gain hands-on experience in designing and building production-inspired RESTful applications using Spring Boot, Spring Security, PostgreSQL, and modern backend development practices.


