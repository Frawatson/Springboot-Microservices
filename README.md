# Springboot-Microservices

# Employee and Departments Microservices Application

## Overview

This repository contains the source code for a microservices application built with Java and Spring Boot. The application consists of two microservices - one for managing employees and the other for managing departments. Service registration and discovery are handled by Eureka, and distributed tracing is implemented using Zipkin.

## Technologies Used

- **Java:** The programming language for the microservices.
- **Spring Boot:** The framework for building microservices.
- **Eureka:** Service registration and discovery.
- **Zipkin:** Distributed tracing for microservices.

## Microservices

### 1. Employee Service

- Manages employee information.

### 2. Department Service

- Manages department information.

### 3. Api Gateway

- Manages the api.

### 4. Service Registry
- Manages all the register service on eureka.

### 2. Config Server

## Prerequisites

Ensure you have the following tools installed before running the microservices locally:

- Java Development Kit (JDK)
- Maven
- Docker
- Eureka Server
- Zipkin Server

## Getting Started

1. Clone this repository to your local machine:

    ```bash
    git clone https://github.com/Frawatson/Springboot-Microservices.git
    ```

2. Navigate to the projects directory and run the microservices:

    ```bash
    cd employee-service/employee-service/src/main/java/com/watson/employeeservice/EmployeeServiceApplication.java
    ```
    
   ```bash
    cd department-service/department-service/src/main/java/com/watson/departmentservice/DepartmentServiceApplication.java
    ```
     
   ```bash
    cd service-registry/service-registry/src/main/java/com/watson/serviceregistry/ServiceRegistryApplication.java
    ```
      
   ```bash
    cd config-server/config-server/src/main/java/com/watson/configserver/ConfigServerApplication.java
    ```
    
   ```bash
    cd api-gateway/api-gateway/src/main/java/com/watson/apigateway/ApiGatewayApplication.java
    ```

3. Build the microservices using Maven:

    ```bash
    mvn clean install
    ```

