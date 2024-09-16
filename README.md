# Student Management Systeme Using SpringBoot


A Simple Student Managemet System REST-API for CRUD Operations which allows the user to performe registering,updating ,deleting and serching.
MeanWhile for datastoring it is using mysql with hibernate 

## Table of Contents

- [Features](#features)
- [Installation](#installation)
- [API Documentation](#api-documentation) *(if applicable)*
- [Contributing](#contributing)
- [License](#license)
- [Contact](#contact)

## Features

- Basic CRUD Operations.
- System Automatically apply a unique id for each student.
- Abilitity to store one image(less than 1MB) in the database and update it

## Installation

1. **Clone the repository:**
    ```bash
    https://github.com/dasunmihiranga/student-management-system-crud-Back-End.git
    ```
2. **Additional setup instructions:**
    - Create a Database Manually on mysql called 'studentdb1'.
    - change the username and password in application.yml file accoring to details.
    - for basic testing clone
      ```bash
       
      ```


## API Documentation

If your project includes an API, detail its usage here.

### Get All Students GET Request
```bash
GET /studnet/
```
### Get Student By ID GET Request
```bash
GET /studnet/{PASS-STUDENT-ID}
```

### Add a Student POST Request
```bash
POST /student/
```

### Update a Student PATCH Request
- Make sure to pass the student id (Refer the student management system fromend for example)
```bash
PATCH /student/image
```

### Delete Student By ID DELETE Request
```bash
DELETE /studnet/{PASS-STUDENT-ID}
```

