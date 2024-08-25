 Project Features

1. Modern Technologies and Architecture: The project employs a mainstream layered architecture (controller, service, data layers) to ensure maintainability and scalability.
2. Clean Code Structure: The code is well-organized, strictly adhering to modular, component-based, and interface-oriented principles. Key sections of the code are well-commented, making it suitable for beginners to learn from or for further development.
3. Feature-Rich Community Property Management System: The system includes both front-end and back-end functionalities, covering resident management, property fee management, parking management, announcements, complaints, and repairs.
4. Front-End Framework: The front end is built using the Layui framework, offering a simple and easy-to-use interface with a wide range of components.
5. Sentiment Analysis: Integrated with a Python service to analyze subjective information like user feedback, generating corresponding scores and tagging it with labels such as "Good," "Neutral," or "Poor."

 Technical Framework

- Back-End Technology: Java using the SpringBoot framework provides Restful APIs, combined with Thymeleaf for page rendering. MyBatis is used for database operations.
- Front-End Technology: Built using the Layui framework, with data exchanged between the front end and back end via Ajax in JSON format.
- Other Technologies:
  - Build Tool: Maven
  - JVM Version: JDK 8
  - Database: MySQL 5.7 (compatible with 8.x)
  - Python Version: Python 3.x and above

 Environment Setup

- Java Environment Setup: Refer to the JDK8 installation guide.
- Python Environment Setup: Configure Python environment variables and install necessary dependencies.
- Maven Configuration: It is recommended to configure a domestic mirror (e.g., Alibaba Cloud) to speed up dependency downloads.
- Database Installation: Supports MySQL 5.x or 8.x versions, following standard installation procedures.

 Project Deployment and Launch

1. Database Initialization: Execute the database script to initialize system data.
2. Back-End Launch: Import the Maven project and start the main class `PropertyAdminApplication`. The project is successfully launched when you see "Started PropertyAdminApplication..." in the logs.
3. Python Service Launch: After installing the necessary Python dependencies, run `socket_server.py`. The service is successfully launched when the console outputs "Waiting connection...".

 Access URLs

- Home Page: [http://localhost:2281/housing/](http://localhost:2281/housing/)
- Portal: [http://localhost:2281/housing/index](http://localhost:2281/housing/index)
- Admin Dashboard: [http://localhost:2281/housing/main.html](http://localhost:2281/housing/main.html)
- Admin Login Page: [http://localhost:2281/housing/system/toLoginPage](http://localhost:2281/housing/system/toLoginPage)
- Python Service Default Address: 127.0.0.1:8089

 Account Information

- Admin
  - Username: `admin`
  - Password: `123456`
- Resident
  - Username: `Li Si`
  - Password: `1234` (default password for all residents)

 Functionality Overview

Back-End Features

- Resident management, building management, house management, parking management, employee management.
- Property fee management (fee item management, meter reading management, payment record inquiry).
- Parking fee management, statistical analysis (monthly statistics of parking fees, property fees).
- Announcement management and comment management, with support for Python sentiment analysis.
- Complaint and repair management, with support for Python sentiment analysis.

Front-End Features

- Property fee and parking fee inquiry and payment.
- Announcement viewing and commenting.
- Complaint and repair services.


