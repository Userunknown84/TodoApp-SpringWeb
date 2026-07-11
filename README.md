# 📝 Todo Application

A modern **Todo Application** built with **Spring Boot, Thymeleaf, Bootstrap 5, and MySQL**.  
The application allows users to create, manage, complete, and delete tasks with a clean **Liquid Glass UI** inspired by modern design trends.

---

## ✨ Features

- ➕ Add new tasks
- ✅ Mark tasks as completed/incomplete
- 🗑️ Delete tasks
- 💾 Store tasks permanently in MySQL
- 🎨 Modern Liquid Glass UI
- 📱 Responsive design using Bootstrap 5
- ⚡ Fast server-side rendering with Thymeleaf

---

## 🛠️ Tech Stack

- Java 17+
- Spring Boot
- Spring MVC
- Spring Data JPA
- Thymeleaf
- MySQL
- Bootstrap 5
- HTML5
- CSS3


---

## ⚙️ Setup

### 1. Clone the repository

```bash
git clone https://github.com/your-username/todo-app.git
```

### 2. Open the project

Import the project into **IntelliJ IDEA**.

### 3. Configure MySQL

Create a database.

```sql
CREATE DATABASE todo_db;
```

Update `application.properties`.

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/db_name
spring.datasource.username=root
spring.datasource.password=your_password

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
```

### 4. Run the application

```
http://localhost:8080/
```

---

## 🚀 Available Features

| Feature | Description |
|----------|-------------|
| Add Task | Create a new task |
| Toggle Task | Mark task as completed/incomplete |
| Delete Task | Remove a task |
| MySQL Storage | Tasks are stored permanently |

---

## 📸 UI

- Liquid Glass Design
- Gradient Background
- Glassmorphism Cards
- Responsive Layout
- Bootstrap Components

---

## 👨‍💻 Author

**Aditya Sharma**
