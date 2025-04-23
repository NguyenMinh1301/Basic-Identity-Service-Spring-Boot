# Identity Service

**Identity Service** is a small learning project built with **Java 21** and **Spring Boot 3.2.2**. It provides basic functionalities for user authentication and authorization using a RESTful API structure. This project is designed as part of my journey as a student exploring the Spring Boot framework.

## Features
- User registration and login
- Role-based access control (RBAC)
- Token-based authentication with JWT
- Basic user management endpoints

## Technologies Used
- Java 21
- Spring Boot 3.2.2
- Spring Security
- Spring Data JPA
- MapStruct (for object mapping)
- Lombok (to reduce boilerplate code)
- Maven (build and dependency management)

## API Response Format
All API responses follow a consistent structure:

### Example - User Registration
```bash
Request:
{
    "username": "Nguyen Minh",
    "password": "12345678",
    "firstName": "Nguyen",
    "lastName": "Minh",
    "dob": "2000-01-01"
}

Response:
{
    "code": 1000,
    "result": {
        "id": "cd269a37-445f-42e6-9642-ec7ee04f1cea",
        "username": "Nguyen Minh",
        "password": "$2a$10$XQQU9pim2mBkNLCYIo6isONv9Nhr8N4kW1vhryQwpsNPOYb5J0lBq",
        "firstName": "Nguyen",
        "lastName": "Minh",
        "dob": "2000-01-01",
        "roles": [
            "USER"
        ]
    }
}
```

### Example - User Login
```bash
Request:
{
    "username": "Nguyen Minh",
    "password": "12345678"
}

Response:
{
    "code": 0,
    "result": {
        "token": "eyJhbGciOiJIUzUxMiJ9.eyJpc3MiOiJkZW1vLmNvbSIsInN1YiI6Ik5ndXllbiBNaW5oIiwiZXhwIjoxNzQ1NDI2MjMyLCJpYXQiOjE3NDU0MjI2MzIsInNjb3BlIjoiVVNFUiJ9.KEvUZqyw1R7ZZOmO_mmlNieczER_ykbQw-S4ByIhdgsj7wwDxxqyMMXSce6y59dIt41HQlHF7ify5x2jLhlIgQ",
        "authenticated": true
    }
}
```

## Getting Started

### Clone the repository
```bash
git clone https://github.com/your-username/identity-service.git
```
### Run the application
```bash
./mvnw spring-boot:run
```
The application will start by default at: http://localhost:8080


## Contact
- **Email**: nguyenminh1301.dev@gmail.com
- **GitHub**: [NguyenMinh1301](https://github.com/NguyenMinh1301)

---

This project is part of my self-study and learning path in mastering Spring Boot. Any feedback or suggestions are warmly welcome!

