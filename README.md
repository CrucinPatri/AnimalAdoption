PET ADOPTION CENTER - Application

A web application designed to facilitate the adoption of pets from shelters. The application allows users to browse available pets, view their profiles, and submit adoption requests.

Used Technologies:
 - Frontend: HTML5, CSS3, JavaScript (Fetch API, Asincron/Promises).
 - Backend: Java, Spring Boot, Maven.
 - Stocare Date: MySQL Database or JSON.

Project Structure:

├── src/
│   ├── main/
│   │   ├── java/com/adoption/backend/
│   │   │   ├── controllers/    # Controllere REST (AnimalController.java)
│   │   │   ├── models/         # Modele de date (Animal.java)
│   │   │   ├── services/       # Logica de business (AnimalService.java)
│   │   │   └── storage/        # Salvare/Citire date (JsonStorage.java)
│   │   └── resources/
│   │       ├── static/         # Fișiere statice Frontend
│   │       │   ├── css/        # Stiluri (style.css)
│   │       │   ├── js/         # Logica de frontend (animals.js, app.js)
│   │       │   └── *.html      # Pagini HTML (index.html, admin.html)
│   │       └── application.properties
│   └── test/
├── pom.xml
└── README.md

API Requests:
GET /api/animals - Retrieve a list of all available animals for adoption.
GET /api/animals/{id} - Retrieve details of a specific animal by its ID.
POST /api/animals - Add a new animal to the adoption list (Admin only).
PUT /api/animals/{id} - Update details of a specific animal (Admin only).
DELETE /api/animals/{id} - Remove an animal from the adoption list (Admin only

