
# Spring Boot Microservices - Products and Achat

This project consists of two Spring Boot microservices: `Products` and `Achat`. The system is designed to store products in EUR (Euro) currency and enables shopping for one or multiple products in different currencies. The `Achat` microservice calculates real-time exchange rates using the [Exchange Rate API](https://exchangeratesapi.io/). The services communicate with each other using `WebClient`.

## Microservices Overview

### 1. Products Microservice
- **Port**: `8080`
- **Description**: This microservice handles CRUD (Create, Read, Update, Delete) operations on products.
- **Entity**: `Product`
- **Endpoints**:
    - `POST api/products` : Create a new product
    - `GET api/products` : Retrieve all products
    - `GET api/products/{id}` : Retrieve a product by ID
    - `PUT api/products/{id}` : Update an existing product
    - `DELETE api/products/{id}` : Delete a product by ID

### 2. Achat Microservice
- **Port**: `8081`
- **Description**: This microservice manages shopping operations. It allows users to purchase one or more products, with support for different currencies. The total amount is calculated in real-time using the exchange rate data from the Exchange Rate API.
- **Endpoints**:
    - `POST api/achat` : Make a purchase by providing product IDs and the desired currency. The service fetches the product details from the `Products` microservice and uses the Exchange Rate API to convert prices as needed.

## Features
- **Currency Support**: Products are stored with prices in EUR by default. The `Achat` microservice can convert the total price to different currencies based on real-time exchange rates.
- **Microservice Communication**: The `Achat` microservice communicates with the `Products` microservice to retrieve product information and with the Exchange Rate API to get real-time exchange rates. This is implemented using `WebClient`.
- **WebClient**: A non-blocking reactive client used for inter-microservice communication and third-party API integration.

## Technologies
- **Spring Boot**: For building microservices.
- **Spring WebFlux**: For non-blocking, reactive WebClient integration.
- **Spring Data JPA**: For database interaction in the Products microservice.
- **H2 Database**: In-memory database for development and testing purposes.
- **Exchange Rate API**: A third-party service for real-time currency conversion.

## How to Run

### Prerequisites
- JDK 11 or later
- Maven

### Steps
1. Clone the repository:
    ```bash
    git clone https://github.com/MamouniScript/MsTuto.git
    ```

2. Navigate to the project directory.

3. Build the project:
    ```bash
    mvn clean install
    ```

4. Run the Products microservice:
    ```bash
    cd products
    mvn spring-boot:run
    ```

5. Run the Achat microservice:
    ```bash
    cd achat
    mvn spring-boot:run
    ```

### API Endpoints

#### Products Microservice (Port 8080)
| Method | Endpoint                | Description                  |
|--------|-------------------------|------------------------------|
| POST   | `api/products`              | Create a new product          |
| GET    | `api/products`              | Get all products              |
| GET    | `api/products/{id}`         | Get a product by ID           |
| PUT    | `api/products/{id}`         | Update a product              |
| DELETE | `api/products/{id}`         | Delete a product by ID        |

### Achat Microservice (Port 8081)

| Method | Endpoint                     | Description                      |
|--------|------------------------------|----------------------------------|
| POST   | `/api/achats`                | Create a new Achat               |
| GET    | `/api/achats/{id}`           | Get Achat by ID                  |
| PUT    | `/api/achats/{id}`           | Update an existing Achat         |
| GET    | `/api/achats`                | Get all Achats                   |
| DELETE | `/api/achats/{id}`           | Delete an Achat by ID            |

