 Project Features
1. Utilizes mainstream technologies and architectural patterns (Controller, Service, Data layers).
2. Clear code structure, adhering to modularity, componentization, and interface principles; key code sections are well-documented and beginner-friendly for learning or further development.
3. A comprehensive property management system with both frontend and backend features.
4. Frontend built using the Layui framework, offering complete components and ease of use.
5. Integrated with Python sentiment analysis service, which analyzes subjective user feedback, assigning scores and labels (Good, Average, Poor).
Technology Stack
- Java backend providing RESTful API and Thymeleaf template rendering; frontend built using Layui, with frontend-backend communication via AJAX in JSON format.
- Backend: SpringBoot + Thymeleaf + MyBatis + Python
- Build tool: Maven
- JVM version: JDK8
- Frontend: Layui
Access URLs
Homepage
(http://localhost:2281/housing/)
Portal Website
(http://localhost:2281/housing/index)
Admin Dashboard
(http://localhost:2281/housing/main.html)
Admin Login Page
(http://localhost:2281/housing/system/toLoginPage)

Python Service Default Address and Port
- 127.0.0.1:8089

Account Credentials
Admin
Username: admin
Password: 123456

Resident
Username: Smith
Password: 1234

> All resident passwords default to 1234.

Backend Features

1. Basic functions: login, logout.
2. Resident management: add, delete, update, and view resident information.
3. Building management: manage basic building information.
4. Housing management: add housing details (building, type, unit number, area), mark for sale (bind to owner), or for rent (bind to resident).
5. Parking management: add, delete, update, and view parking information.
6. Staff management: manage staff (responsible for handling complaints, repair requests, etc.).
7. Property fee management -> Fee project management: manage fee items (name, price, description).
8. Property fee management -> Meter reading: generate invoices based on fee items for each house; residents can view and pay pending fees on the frontend.
9. Property fee management -> Payment record query: view payment history.
10. Parking fee management: generate parking fee invoices for residents based on assigned parking spaces; residents can view and pay parking fees on the frontend.
11. Statistics and analysis: monthly parking fee and property fee statistics.
12. Announcement management: admin posts announcements, residents can view on the frontend.
13. Announcement comment management: residents can comment on announcements; Python sentiment analysis is supported to generate sentiment scores, emotion levels, and statistical charts.
14. Complaint management: residents can submit complaints, and staff can handle and respond; Python sentiment analysis is supported for complaint content.
15. Repair request management: residents can submit repair requests, and staff can handle and respond; Python sentiment analysis is supported for repair request content.

Frontend Features
1. Login and logout functions.
2. Property fee inquiry: residents can view and pay their property fee details.
3. Parking fee inquiry: residents can view and pay their parking fee details.
4. Announcement notifications: residents can view, post, and comment on announcements.
5. Complaint service: residents can submit complaints and view feedback.
6. Repair service: residents can submit repair requests and view feedback.
