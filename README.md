# SpringSecurity
# Spring Boot JWT Authentication Project

A secure REST API built with Spring Boot that demonstrates how to implement **JWT (JSON Web Token)** based authentication and authorization. This project includes user login, token generation, validation, and role-based access to APIs.

## 🔐 Features

- 🔑 Secure user authentication with JWT tokens
- 🧾 JWT token generation and validation
- 👤 Role-based access control (Admin/User/etc.)
- 🔄 Token refresh endpoint (optional)
- 🚫 Secured endpoints using Spring Security
- 🛡️ Password encryption using BCrypt

## 📦 Tech Stack

- Java 11 / 17
- Spring Boot
- Spring Security
- JWT (jjwt or java-jwt)
- Maven or Gradle

## 📁 Project Structure

spring-jwt-auth/
├── controller/ # API endpoints (e.g. login, secured APIs)
├── config/ # Spring Security config
├── service/ # Business logic
├── model/ # DTOs and Entities
├── util/ # JWT utility class for token handling
├── repository/ # UserRepository for DB operations
├── Application.java # Main Spring Boot application
├── README.md



## 🛠 Setup Instructions

### Prerequisites

- Java 11 or higher
- Maven or Gradle
- IDE (e.g., IntelliJ, Eclipse)
