# BlogSphere 

![BLOGSPHERE](home.png)
![](about.png)
![](create.png)
![](viewblog.png)
![](edit.png)
![](viewpost.png)
![](editpost.png)

This project is a comprehensive blogging platform built using Spring Boot, Thymeleaf, and PostgreSQL. It offers features such as post creation, viewing, updating, and deletion, along with a robust commenting system supporting nested comments.

## Table of Contents

- [Features](#features)
- [Demo](#demo)
- [Technologies Used](#technologies-used)
- [Installation](#installation)
- [API Endpoints](#api-endpoints)
- [Contributing](#contributing)

## Features

- Search for the current weather in any city.
- Display weather details such as temperature, humidity, and wind speed.
- Show a 5-day weather forecast.
- Responsive design for mobile and desktop use.

## Demo

You can try out the BlogSphere live [here](https://blogsphere-s-vyjr.onrender.com).

## Technologies Used

- JAVA17
- Spring Boot
- Spring Web
- Spring Data JPA
- Spring Security
- PostgreSQL
- Lombok
- Thymeleaf
- Maven

## Installation

To run this project locally, follow these steps:

1. Clone the repository:

    ```bash
    git clone https://github.com/omgupta7352/Blogsphere.git
    ```

2. Navigate to the project directory:

    ```bash
    cd Blogsphere
    ```


3. Build and run the application:

    ```bash
    mvn clean install
    ```

    ```bash
    mvn spring-boot:run
    ```
    

4. Open your web browser and go to `http://localhost:8080`.

## API Endpoints

1. Posts
   - `GET /api/posts`: Get all posts
   - `GET /api/posts/{id}`: Get a single post by ID
   - `POST /api/posts`: Create a new post
   - `PUT /api/posts/{id}`: Update an existing post
   - `DELETE /api/posts/{id}`: Delete a post

2. Comments
   - `GET /api/posts/{postId}/comments`: Get all comments for a post
   - `POST /api/posts/{postId}/comments`: Add a comment to a post
   - `PUT /api/comments/{id}`: Update a comment
   - `DELETE /api/comments/{id}`: Delete a comment


## Contributing

Contributions are welcome! If you would like to contribute to this project, please follow these steps:

1. Fork the repository.
2. Create a new branch for your feature or bugfix:

    ```bash
    git checkout -b feature/your-feature-name
    ```

3. Commit your changes:

    ```bash
    git commit -m 'Add some feature'
    ```

4. Push to the branch:

    ```bash
    git push origin feature/your-feature-name
    ```

5. Open a pull request on GitHub.
  

