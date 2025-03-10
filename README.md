# Spring Boot Blog API

A REST API for a blog application built with Spring Boot and PostgreSQL.

## Features

- **Authentication System**: Secure user authentication
- **Content Management**: Create, read, update and delete blog posts
- **Categorization**: Organize posts with categories
- **Tagging System**: Add multiple tags to posts
- **Filtering**: Filter posts by category and/or tag
- **Draft Support**: Save posts as drafts before publishing

## Technologies

- Java 23
- Spring Boot
- Spring Security
- Spring Data JPA
- PostgreSQL
- Docker & Docker Compose

## API Endpoints

### Authentication
- `POST /api/v1/auth` - Authenticate user and get token

### Categories
- `GET /api/v1/categories` - Get all categories
- `POST /api/v1/categories` - Create a new category
- `DELETE /api/v1/categories` - Delete a category

### Tags
- `GET /api/v1/tags` - Get all tags
- `POST /api/v1/tags` - Create a new tag
- `DELETE /api/v1/tags` - Delete a tag

### Posts
- `GET /api/v1/posts` - Get all published posts
- `POST /api/v1/posts` - Create a new post
- `PUT /api/v1/posts` - Update an existing post
- `DELETE /api/v1/posts` - Delete a post
- `GET /api/v1/posts?categoryId=&tagId=` - Filter posts by category and/or tag
- `GET /api/v1/posts/drafts` - Get all draft posts

## Getting Started

### Prerequisites
- Docker and Docker Compose
- Java Development Kit (JDK) 17 or higher
- Maven

### Installation

1. Clone the repository
   ```bash
   git clone https://github.com/newton-duarte/java-blog-api.git
   cd java-blog-api
   ```

2. Start the PostgreSQL database using Docker Compose
   ```bash
   docker-compose up -d
   ```

3. Build the application
   ```bash
   mvn clean package
   ```

4. Run the application
   ```bash
   java -jar target/blog-api-0.0.1-SNAPSHOT.jar
   ```

Alternatively, you can run the application directly with Maven:
```bash
mvn spring-boot:run
```

The API will be available at `http://localhost:8080`

## Database Schema

The application uses the following main entities:
- User
- Post
- Category
- Tag

## Running Tests

```bash
mvn test
```

## Contributing

1. Fork the repository
2. Create your feature branch (`git checkout -b feature/amazing-feature`)
3. Commit your changes (`git commit -m 'Add some amazing feature'`)
4. Push to the branch (`git push origin feature/amazing-feature`)
5. Open a Pull Request

## License

This project is licensed under the MIT License - see the LICENSE file for details.