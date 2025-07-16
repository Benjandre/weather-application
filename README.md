# Weather Application

A Spring Boot web application for weather information.

## Getting Started

### Prerequisites

- Java 17 or higher
- Maven 3.6 or higher

### Running the Application

1. Clone the repository
2. Navigate to the project directory
3. Run the application using Maven:

```bash
mvn spring-boot:run
```

Or use the provided script:

```bash
./run.sh
```

The application will start on `http://localhost:8080`

### Project Structure

```
src/
├── main/
│   ├── java/
│   │   └── com/example/weatherapp/
│   │       ├── WeatherApplication.java
│   │       ├── controller/
│   │       │   ├── HomeController.java
│   │       │   └── AboutController.java
│   │       └── service/
│   │           └── WeatherService.java
│   └── resources/
│       ├── static/
│       │   └── css/
│       │       ├── common_colors.css
│       │       ├── fonts.css
│       │       ├── footer.css
│       │       └── navigation_bar.css
│       ├── templates/
│       │   ├── Home.html
│       │   └── About.html
│       └── application.properties
└── test/
    └── java/
```

### Features

- Home page with weather data form
- About page with application information
- Responsive navigation bar
- Modern CSS styling

### Technology Stack

- Java 17
- Spring Boot 3.2.0
- Thymeleaf (templating engine)
- Maven (build tool)
- CSS3 for styling

### Development

To run in development mode with hot reload:

```bash
mvn spring-boot:run
```

The application will automatically restart when you make changes to the code.

## License

© 2025 Benjamin Andreas Vraspillai. All rights reserved.
