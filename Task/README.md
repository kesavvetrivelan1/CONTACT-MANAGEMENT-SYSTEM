                                CONTACT MANAGEMENT SYSTEM
PROJECT OVERVIEW
      A full-stack web application built using spring Boot, MySQL, HTML, CSS nad Javascript that allows users to:
      - Submit contact details
      - Store records in MySQL database
      - View submitted records
      - Sort by latest date

TECH STACK USED:
 BACKEND:
   - Java
   - Spring Boot
   - Spring Data JPA
   - Maven

 FRONTEND:
   - HTML
   - CSS
   - JavaScript

 Database:
   - MySQL

SETUP INSTRUCTIONS:
   1.Clone repository
   2.Open project in vs code
   3.Configure MySQL in
    "application.properties"
   4.Create database:
     "MySQL"
   5.Run project:
    mvnw.cmd spring-boot:run
   6.Open:
    http://localhost:8080

APPLICATION ARCHITECTURE(HIGH-LEVEL):
      Frontend (HTML/CSS/JavaScript)
                |
      REST Controller Layer (Spring Boot)
                |
      Service Layer (Business Logic)
                |
      Repository Layer (JPA Repository)
                |
      MySQL Database

Flow:
 - User submits contact form
 - Frontend send JSON data via RESET API
 - Controller handles request
 - Service validates and processes logic
 - Repository stores/retrieves data
 - MySQL stores records permanently

Modules/Components Created:
Backend Components:
1.Entity Layer
File: UserContact.java
Purpose:
 - Represents database table structure
 - Containd validation annotations
 - Maps Java object to MySQL table
2.Repository Layer
File: UserContactRepository.java
Purpose:
 - Handes database operations
 - Users spring Data JPA
 - Supports save, fetch, search
3. Service Layer
File: UserContactService.java
Purpose:
 - Business logic implementation
 - Duplicate email prevention
 - sorting records by latest data
4. Controller Layer
File: UserContactCentroller.java
Purpose:
 - Exposes REST APIs
 - Handles GET and POST request
5. Frontend Components:
File: index.html
purpose:
 - User input form
 - Data table display
 - search functionally
 - JavaScript API interface
6. Configuration:
File: application.properties
purpose:
 - Database connectivity
 - Hibernate setting
 - Server configuration

Database Design Decisions
Table Name: users_contact
Fields:
 - id -> Primary key
 - name -> Reqired
 - email -> Unique, Required
 - phone -> Requied
 - city -> Optional
 - message -> optional
 - Created_at -> Timestamp

Design Considerations:
 - Unique email prevents duplicate users
 - Timestamp supports sorting
 - Optional fields impprove flexibility
 - Structures scheme ensures scalability

Validating Approach
Frontend validation:
 - Required fields
 - Email type validation
 - Front input restrictions

Backend Validation:
Implemented using:
 - @NotBlank
 - @Email
 - Duplicate email format
 - Empty input values

Edge Cases Handled:
 - Duplicate email submission
 - Missing required format
 - Invalid email format
 - Empty input values

Assumptions Made
 - Mysql is installed locally
 - Application runs on localhost:8080
 - Root MySQL credentials available
 - Single-user local deployment
 - UI kept simple for assignment requirements
 - Search in client-side
 - Sorting is backend-controlled

Summary
This poject demonstrations:
 - Full-stack development fundamentals
 - Layered backend architecture
 - REST API integration
 - MySQL database design
 - Validation and error handling
 - Functional frontend UI