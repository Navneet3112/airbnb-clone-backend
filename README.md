# 🏨 Airbnb Clone Backend

<p align="center">

![Java](https://img.shields.io/badge/Java-21-orange)
![Spring Boot](https://img.shields.io/badge/Spring_Boot-3.4-6DB33F)
![PostgreSQL](https://img.shields.io/badge/PostgreSQL-4169E1)
![Spring Security](https://img.shields.io/badge/Spring_Security-6DB33F)
![JWT](https://img.shields.io/badge/JWT-Authentication-black)
![Docker](https://img.shields.io/badge/Docker-2496ED)
![Stripe](https://img.shields.io/badge/Stripe-Payments-635BFF)
![Swagger](https://img.shields.io/badge/Swagger-API_Docs-85EA2D)

</p>

A **production-inspired backend** for an Airbnb-style booking platform built with **Java 21** and **Spring Boot**.

It features secure **JWT-based authentication**, **role-based authorization**, hotel and room management, booking workflows, a **Strategy Pattern-based dynamic pricing engine**, **Stripe payment integration**, PostgreSQL persistence, and a fully **Dockerized** development environment.

The project follows a clean layered architecture, emphasizes maintainability through design patterns and environment-based configuration, and provides interactive API documentation with Swagger.

## 📚 Table of Contents

- [Key Features](#key-features)
- [Tech Stack](#tech-stack)
- [Architecture](#architecture)
- [Design Decisions](#design-decisions)
- [Security](#security)
- [Docker & Deployment](#docker--deployment)
- [Getting Started](#getting-started)
- [API Documentation](#api-documentation)
- [Roadmap](#roadmap)
- [Author](#author)
- [License](#license)


## ✨ Key Features

### 🔐 Authentication & Security
- JWT-based authentication using Spring Security
- Role-based authorization for protected resources
- BCrypt password encryption
- Stateless authentication using JWT tokens
- Global exception handling with standardized API responses

### 🏨 Hotel & Room Management
- Create, update, and manage hotels
- Room management with availability tracking
- Hotel search functionality
- Inventory management for room availability

### 📅 Booking Management
- Secure room booking workflow
- Booking status management
- Booking history retrieval
- Inventory updates after successful bookings

### 💰 Dynamic Pricing Engine
- Strategy Pattern-based pricing engine
- Holiday pricing strategy
- Occupancy-based pricing
- Urgency-based pricing
- Surge pricing strategy

### 💳 Payment Integration
- Secure Stripe Checkout integration
- Stripe webhook handling
- Payment status tracking

### 📖 API & Developer Experience
- Interactive Swagger (OpenAPI) documentation
- Request validation using Jakarta Validation
- Consistent API response wrapper
- Dockerized development environment
- Spring Profiles for environment-specific configuration

## 🛠 Tech Stack

| Category | Technologies |
|----------|--------------|
| **Language** | Java 21 |
| **Framework** | Spring Boot 3.4 |
| **Security** | Spring Security, JWT Authentication, BCrypt |
| **Persistence** | Spring Data JPA (Hibernate), PostgreSQL |
| **Payments** | Stripe API, Stripe Webhooks |
| **API Documentation** | SpringDoc OpenAPI (Swagger UI) |
| **Containerization** | Docker, Docker Compose |
| **Build Tool** | Maven |
| **Object Mapping** | ModelMapper |
| **Validation** | Jakarta Validation |
| **Utilities** | Lombok |
| **Configuration** | Spring Profiles, Environment Variables |

## 🏗️ Architecture

The application follows a **layered architecture** that promotes separation of concerns, maintainability, and scalability. Each layer has a well-defined responsibility, making the codebase easier to extend and test.

```text
                        +----------------------+
                        |   Client / Swagger   |
                        +----------+-----------+
                                   |
                                   v
                    +-----------------------------+
                    | Spring Security (JWT Filter)|
                    +-------------+---------------+
                                  |
                                  v
                    +-----------------------------+
                    |      REST Controllers       |
                    +-------------+---------------+
                                  |
                                  v
                    +-----------------------------+
                    |       Service Layer         |
                    |  Business Logic & Pricing   |
                    +-------------+---------------+
                                  |
                                  v
                    +-----------------------------+
                    | Repository Layer (JPA)      |
                    +-------------+---------------+
                                  |
                                  v
                    +-----------------------------+
                    |     PostgreSQL Database      |
                    +-----------------------------+
```

### Layer Responsibilities

| Layer | Responsibility |
|--------|----------------|
| **Controller** | Exposes REST APIs, validates requests, and returns HTTP responses. |
| **Security** | Authenticates requests using JWT and authorizes protected resources. |
| **Service** | Implements business logic, booking workflow, pricing strategies, and payment orchestration. |
| **Repository** | Performs CRUD operations using Spring Data JPA. |
| **Database** | Stores users, hotels, rooms, bookings, payments, and related domain data. |


## 📂 Project Structure

```text
src
├── config
├── controller
├── dto
├── entity
├── exception
├── repository
├── security
├── service
├── strategy
├── util
└── AirBnbApplication.java

## 🧠 Design Decisions

This project incorporates several backend design principles to improve maintainability and extensibility.

### Strategy Pattern

The pricing engine is implemented using the **Strategy Pattern**, allowing different pricing algorithms to be selected dynamically based on business rules.

Implemented pricing strategies include:

- Holiday Pricing
- Occupancy-based Pricing
- Surge Pricing
- Urgency-based Pricing

This design makes it easy to introduce new pricing strategies without modifying existing business logic, adhering to the **Open/Closed Principle (SOLID)**.

### Layered Architecture

Business logic, persistence, and request handling are separated into dedicated layers to improve code organization and maintainability.

### Externalized Configuration

Sensitive information such as database credentials, JWT secrets, and Stripe API keys are managed through environment variables and Spring Profiles instead of being hardcoded.


## 🔐 Security

Security is a core aspect of the application and follows modern backend development practices to ensure secure authentication, authorization, and configuration management.

### Authentication

- JWT-based authentication
- Stateless session management
- Custom JWT authentication filter
- BCrypt password hashing

### Authorization

- Role-based access control using Spring Security
- Protected endpoints accessible only to authenticated users

### Secure Configuration

Sensitive information is never committed to version control and is externalized using **environment variables**.

The following values are securely managed outside the source code:

- Database credentials
- JWT Secret Key
- Stripe Secret Key
- Stripe Webhook Secret

### API Validation & Error Handling

- Request validation using Jakarta Bean Validation
- Global exception handling
- Standardized API response format for consistent error reporting

## 🐳 Docker & Deployment

The application is fully containerized using **Docker** and **Docker Compose**, providing a consistent, reproducible, and platform-independent development environment.

### Dockerized Services

| Service | Description |
|----------|-------------|
| Spring Boot Application | Hosts the REST API and business logic |
| PostgreSQL Database | Stores application data with persistent storage |

### Key Highlights

- Multi-container setup using Docker Compose
- Persistent PostgreSQL data using Docker Volumes
- Environment-specific configuration with Spring Profiles
- Environment variables for secure configuration
- One-command application startup
- Isolated and reproducible development environment

### Run with Docker

```bash
docker compose up --build
```

### Available Services

| Service | URL |
|----------|-----|
| REST API | http://localhost:8082/api/v1 |
| Swagger UI | http://localhost:8082/api/v1/swagger-ui/index.html |
| PostgreSQL | localhost:5433 |


## 🚀 Getting Started

Follow the steps below to set up and run the project locally.

### Prerequisites

Make sure you have the following installed:

- Java 21
- Docker & Docker Compose
- Git

---

### 1. Clone the Repository

```bash
git clone https://github.com/Navneet3112/airbnb-clone-backend.git
cd airbnb-clone-backend
```

---

### 2. Configure Environment Variables

Create a `.env` file in the project root by copying the provided example file.

```bash
cp .env.example .env
```

Update the environment variables with your own credentials.

```env
DB_PASSWORD=your_database_password
JWT_SECRET=your_jwt_secret
STRIPE_SECRET=your_stripe_secret
STRIPE_WEBHOOK_SECRET=your_stripe_webhook_secret
```
Note: The application requires valid Stripe API keys for payment-related features. You can obtain test credentials from the Stripe Dashboard.

---

### 3. Build and Start the Application

Run the following command:

```bash
docker compose up --build
```

This command will:

- Build the Spring Boot application image
- Start the PostgreSQL database
- Create the required Docker network
- Configure environment variables
- Connect the application with the database

---

### 4. Verify the Application

Once the containers are running, access the following services:

| Service | URL |
|----------|-----|
| REST API | http://localhost:8082/api/v1 |
| Swagger UI | http://localhost:8082/api/v1/swagger-ui/index.html |
| PostgreSQL | localhost:5433 |

---

### Running Without Docker (Optional)

For local development without Docker:

```bash
mvn clean install
mvn spring-boot:run
```

Ensure PostgreSQL is running locally and the appropriate Spring profile is configured.

## 📖 API Documentation

Interactive API documentation is available through **Swagger UI**, allowing developers to explore and test REST endpoints directly from the browser.

### Features

- Interactive API testing
- Detailed request and response models
- Endpoint categorization
- Authentication support using JWT Bearer Token

### Access Swagger UI

After starting the application, open:

```
http://localhost:8082/api/v1/swagger-ui/index.html
```

### Authenticating Requests

1. Register a new user or log in to obtain a JWT token.
2. Click the **Authorize** button in Swagger UI.
3. Enter the token in the following format:

```text
Bearer <your_jwt_token>
```

4. You can now access all protected endpoints directly from the Swagger interface.

## 🗺️ Roadmap

Future improvements planned for the project include:
- [ ] Redis caching for frequently accessed data
- [ ] CI/CD pipeline using GitHub Actions
- [ ] Unit and integration testing
- [ ] Production deployment on AWS

## 👨‍💻 Author

**Navneet Singh**

- GitHub: https://github.com/Navneet3112
- LinkedIn: https://www.linkedin.com/in/<https://www.linkedin.com/in/navneet-singh-63a62531a/>

## 📄 License

This project is licensed under the MIT License. See the `LICENSE` file for details.
