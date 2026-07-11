//write it java version and jakarata version used also how to create and run this app
# Project Name
Servlet CRUD Application

## Technologies Used
- Java 11
- Jakarta Servlet API 5.0
- Maven

## How to Create and Run the App
1. Clone the repository.
2. Navigate to the project directory.
3. Build the project using Maven: `mvn clean install`
4. Deploy the generated WAR file to a servlet container (e.g., Apache Tomcat).
5. Start the servlet container.
6. Access the application at `http://localhost:8080/your-app-name/users`
7. You can perform CRUD operations (Create, Read, Update, Delete) on the user data through the web interface.
8. Make sure to configure your database connection in the `web.xml` or a configuration file as needed for your application.
9. Note: Ensure that you have the necessary database setup and credentials before running the application.

## API Endpoints

### 1. Get All Users
- **URL:** `/api/users`
- **Method:** `GET`
- **Parameters:** None
- **Response (200 OK):**
```json
[
  {
    "id": 1,
    "name": "John Doe",
    "email": "john.doe@example.com",
    "phone": "1234567890"
  },
  {
    "id": 2,
    "name": "Jane Smith",
    "email": "jane.smith@example.com",
    "phone": "0987654321"
  }
]
```

### 2. Get User by ID
- **URL:** `/api/users/{id}`
- **Method:** `GET`
- **Parameters:** 
  - `id` (path parameter): User ID
- **Example URL:** `/api/users/1`
- **Response (200 OK):**
```json
{
  "id": 1,
  "name": "John Doe",
  "email": "john.doe@example.com",
  "phone": "1234567890"
}
```
- **Response (404 Not Found):**
```json
{
  "error": "User not found"
}
```

### 3. Create New User
- **URL:** `/api/users`
- **Method:** `POST`
- **Content-Type:** `application/json`
- **Request Body:**
```json
{
  "name": "Alice Johnson",
  "email": "alice.johnson@example.com",
  "phone": "5555555555"
}
```
- **Response (201 Created):**
```json
{
  "id": 3,
  "name": "Alice Johnson",
  "email": "alice.johnson@example.com",
  "phone": "5555555555"
}
```

### 4. Update User
- **URL:** `/api/users/{id}`
- **Method:** `PUT`
- **Content-Type:** `application/json`
- **Parameters:**
  - `id` (path parameter): User ID
- **Example URL:** `/api/users/1`
- **Request Body:**
```json
{
  "name": "John Updated",
  "email": "john.updated@example.com",
  "phone": "1111111111"
}
```
- **Response (200 OK):**
```json
{
  "id": 1,
  "name": "John Updated",
  "email": "john.updated@example.com",
  "phone": "1111111111"
}
```

### 5. Delete User
- **URL:** `/api/users/{id}`
- **Method:** `DELETE`
- **Parameters:**
  - `id` (path parameter): User ID
- **Example URL:** `/api/users/1`
- **Response (204 No Content):**
```
No content returned
```
- **Response (404 Not Found):**
```json
{
  "error": "User not found"
}
```


