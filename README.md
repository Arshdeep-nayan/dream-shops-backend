# Dream Shops – Spring Boot E-Commerce Backend

A RESTful backend application for an e-commerce system built using Spring Boot, MySQL, and JPA/Hibernate. This project demonstrates core backend engineering concepts such as API design, layered architecture, and relational database relationships.

---

## Project Overview

This application provides backend services for managing products and categories in an e-commerce system. It follows a layered architecture and uses JPA/Hibernate for database interaction.

---

## Tech Stack

- Java 17  
- Spring Boot  
- Spring Data JPA (Hibernate)  
- MySQL  
- Maven  

---

## Project Structure

```
Project Structure

src/main/java/com/dailycodework/dreamshops
│
├── controller     # Handles HTTP requests (API layer)
├── service        # Business logic
├── repository     # Database access (JPA)
├── model/entity   # Database entities
└── DreamShopsApplication.java  # Entry point
```

---

## Setup & Installation

### 1. Clone the Repository

git clone https://github.com/dailycodework/dream-shops.git  
cd dream-shops  

---

### 2. Configure Database

Create a MySQL database:

CREATE DATABASE dream_shops;

Update application.properties:

spring.datasource.url=jdbc:mysql://localhost:3306/dream_shops  
spring.datasource.username=root  
spring.datasource.password=YOUR_PASSWORD  

spring.jpa.hibernate.ddl-auto=update  
spring.jpa.show-sql=true  

---

### 3. Run the Application

mvn spring-boot:run  

Application will start at:

http://localhost:9191  

---

## API Endpoints

### Products

| Method | Endpoint             |
|--------|----------------------|
| GET    | /api/v1/products/all |
| POST   | /api/v1/products/add |

---

### Categories

| Method | Endpoint                  |
|--------|---------------------------|
| POST   | /api/v1/categories/add   |

---

## Key Concepts Demonstrated

- REST API design  
- Layered architecture (Controller → Service → Repository)  
- Entity relationships (Product ↔ Category)  
- Database integration using JPA/Hibernate  
- JSON request and response handling  

---

## Features

- Product and Category management  
- Relational database mapping  
- Clean and modular backend structure  
- Automatic table creation using Hibernate  

---

## API Demo

### Create Product (POST)

Adds a new product linked to an existing category.

![Create Product](Screenshots/POST1.png)

### Create Product (POST - Example 2)

![Create Product 2](Screenshots/POST2.png)

### Get All Products (GET)

Fetches all stored products from the database.

![Get Products](Screenshots/GET.png)

---

## Notes

- APIs tested using Postman  
- Backend connected with MySQL database  
- Designed as a practical backend project for learning real-world system design  

---

## Author

**Arshdeep nayan**

Developed as a backend project to demonstrate scalable API design, database relationships, and clean architecture using Spring Boot.
