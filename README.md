# microservice-quiz-app
# Microservice Project 2

This is a simple **Spring Boot microservices application** that consists of multiple services working together. The project follows a **microservices architecture** and includes the following services:

## 📁 Project Structure
```
microservice-project2/
│── api-gateway/         # API Gateway for routing requests
│── question-service/    # Manages questions in the system
│── quiz-service/        # Handles quiz functionality
│── service-registry/    # Eureka service registry for service discovery
│── .idea/               # IDE settings (can be ignored)
│── microservice-project2.iml # Project metadata
│── README.md            # Project documentation
```

## 🛠 Tech Stack
- **Java 17+**
- **Spring Boot** (Microservices, Web, JPA, Cloud)
- **Spring Cloud Netflix Eureka** (Service Discovery)
- **Spring Cloud Gateway** (API Gateway)
- **Spring Boot Data JPA** (Database Access)
- **PostgreSQL** (Database, configurable)
- **Lombok** (Boilerplate Code Reduction)
- **Maven** (Build Tool)

---

## 📌 Microservices Overview
### 1️⃣ API Gateway (`api-gateway`)
- Routes API requests to the respective microservices.
- Uses **Spring Cloud Gateway** for dynamic routing.

### 2️⃣ Service Registry (`service-registry`)
- **Eureka Server** for registering and discovering services.
- Helps microservices locate each other dynamically.

### 3️⃣ Question Service (`question-service`)
- Manages **questions** in the quiz system.
- Exposes REST endpoints for CRUD operations on questions.
- Uses **Spring Boot Data JPA** for persistence.

### 4️⃣ Quiz Service (`quiz-service`)
- Handles **quiz creation and management**.
- Fetches questions from the **Question Service**.
- Implements **REST communication** between microservices.

---

## 🚀 How to Run the Project

### 🔹 Prerequisites:
- Java 17+
- Maven installed (`mvn -v` to check)
- IDE (IntelliJ IDEA, VS Code, Eclipse)
- Postman (Optional for API testing)

### 🔹 Steps:
1. **Clone the Repository**
   ```sh
   git clone https://github.com/abraham-tech/microservice-project2.git
   cd microservice-project2
   ```

2. **Run Eureka Service Registry**
   ```sh
   cd service-registry
   mvn spring-boot:run
   ```

3. **Run Question Service**
   ```sh
   cd ../question-service
   mvn spring-boot:run
   ```

4. **Run Quiz Service**
   ```sh
   cd ../quiz-service
   mvn spring-boot:run
   ```

5. **Run API Gateway**
   ```sh
   cd ../api-gateway
   mvn spring-boot:run
   ```

6. **Access Services:**
   - **Eureka Dashboard**: `http://localhost:8761`
   - **Question API**: `http://localhost:8081/questions`
   - **Quiz API**: `http://localhost:8082/quizzes`
   - **Gateway API**: `http://localhost:8080`

---

## 🔗 API Endpoints

### 📌 Question Service (`question-service`)
| Method | Endpoint | Description |
|--------|---------|-------------|
| `GET` | `/questions` | Fetch all questions |
| `POST` | `/questions` | Add a new question |
| `GET` | `/questions/{id}` | Get question by ID |
| `DELETE` | `/questions/{id}` | Delete question |

### 📌 Quiz Service (`quiz-service`)
| Method | Endpoint | Description |
|--------|---------|-------------|
| `POST` | `/quizzes` | Create a new quiz |
| `GET` | `/quizzes/{id}` | Get quiz details |
| `DELETE` | `/quizzes/{id}` | Delete a quiz |

---

## 🛠 Configuration
- Modify `application.yml` files in each service to customize **ports, database settings, and service names**.
- Add authentication if required using **Spring Security**.

---

## 🤝 Contributing
- Fork the repository
- Create a new branch (`feature-branch`)
- Make your changes and commit (`git commit -m "New feature added"`)
- Push your branch and create a PR

---

## 📜 License
This project is licensed under the MIT License.

---

## 📧 Contact
For any queries, reach out to **abrahammeja3@example.com**.

Happy coding! 🚀

