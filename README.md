🗳️ Voting Survey Application – Backend
This is the backend of a Voting Survey System built with Spring Boot. It provides RESTful APIs for user registration, voting, election management, and administrative controls.

✅ Features
🔐 User & Admin Authentication
Voter and admin login with secure access handling.

🗃️ Party & Constituency Management
CRUD operations for political parties and electoral constituencies.

🗳️ Vote Casting & Status Tracking
Allows vote casting, vote count updates, and voter participation tracking.

📊 Result Viewing by Constituency
View real-time party-wise vote counts filtered by constituency.

🛠 Tech Stack
Spring Boot

Spring Data JPA

ModelMapper

MySQL / H2 Database

RESTful Web Services

📂 Project Structure
graphql
Copy
Edit
com.hrdepartment
├── controller       # API controllers for users, parties, votes, etc.
├── service          # Business logic
├── entity           # JPA entities
├── payload          # DTOs
└── repository       # JPA repositories
🚀 Running the Application
Clone the repository

bash
Copy
Edit
git clone https://github.com/your-username/voting-survey-backend.git
cd voting-survey-backend
Configure database in src/main/resources/application.properties.

Build and run the app

bash
Copy
Edit
mvn spring-boot:run
Access the API

bash
Copy
Edit
http://localhost:8080/api/
🔗 Key Endpoints (Examples)
Endpoint	Description
POST /api/user/register	Register new voter
POST /api/user/login	Voter login
POST /api/admin/login	Admin login
POST /api/party	Add new political party
PUT /api/user/voterId/{id}/vote	Cast vote
GET /api/party/constituency/{id}	Get results by constituency
PUT /api/party/{id}/reset-votes	Reset party votes

🙌 Contributions
Feel free to fork the project, submit pull requests, or open issues for suggestions and bugs.
