## **User and Role Management Documentation**

---

### **Prerequisites**

- Ensure you have a REST client like Postman or CURL to interact with the API.
- Have the API server running.

---

### **1. Obtain a JWT Token**

**Endpoint:** `api/login`  
**Method:** `POST`  
**Body:** JSON object containing your credentials.

**Request Format:**

```json
{
  "username": "your_username",
  "password": "your_password"
}
```

**Steps:**

1. Send a POST request to `api/login` with your credentials in the JSON format.
2. On successful authentication, you will receive a JWT token in the response. Save this token for subsequent requests.

---

### **2. Use the JWT Token**

For all subsequent API requests, you need to include the JWT token in the `Authorization` header:

```
Authorization: Bearer YOUR_JWT_TOKEN_HERE
```

---

### **3. Creating a New User**

**Endpoint:** `/api/users`  
**Method:** `POST`  
**Headers:**

- `Content-Type`: `application/json`
- `Authorization`: `Bearer YOUR_JWT_TOKEN_HERE`

**Body:**

```json
{
  "name": "John Doe",
  "username": "johndoe",
  "password": "password123"
}
```

**Steps:**

1. Send a POST request to `/api/users` with the provided JSON body.

---

### **4. Create a New Role**

**Endpoint:** `/api/roles`  
**Method:** `POST`  
**Headers:**

- `Content-Type`: `application/json`
- `Authorization`: `Bearer YOUR_JWT_TOKEN_HERE`

**Body:**

```json
{
  "name": "ADMIN"
}
```

**Steps:**

1. Send a POST request to `/api/roles` with the above JSON body.

---

### **5. Add Role to a User**

**Endpoint:** `/api/roles/addtouser`  
**Method:** `POST`  
**Headers:**

- `Content-Type`: `application/json`
- `Authorization`: `Bearer YOUR_JWT_TOKEN_HERE`

**Body:**

```json
{
  "username": "johndoe",
  "roleName": "ADMIN"
}
```

**Steps:**

1. Send a POST request to `/api/roles/addtouser` with the above JSON body.

---