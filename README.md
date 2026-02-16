# WakePay Alarm App

## Overview
WakePay is an innovative alarm application designed to ensure users wake up on time while also considering their privacy. The app is built with RGPD and CCPA compliance in mind, emphasizing user control over their data.

## Architecture
The WakePay application is designed using the following technologies:
- **Backend**: Java Spring Boot
- **Database**: PostgreSQL
- **Mobile Platform**: Android

## Features
- User-friendly alarm settings
- Integration with third-party services while maintaining compliance with data protection regulations
- Rich notifications and reminders

## Setup Instructions
Follow these steps to set up the WakePay alarm app:
1. Clone the repository:
   ```bash
   git clone https://github.com/8v7vx2286j-prog/WakePay.git
   ```
2. Navigate to the project directory:
   ```bash
   cd WakePay
   ```
3. Set up the PostgreSQL database:
   - Create a new database for WakePay.
   - Update the database configuration in the `application.properties` file in the Spring Boot application.
4. Build the application:
   ```bash
   ./mvnw clean install
   ```
5. Run the application:
   ```bash
   ./mvnw spring-boot:run
   ```
6. Install the Android mobile application via Android Studio.

## Compliance
WakePay adheres to the guidelines set by RGPD and CCPA, ensuring:
- User data protection
- Clear consent mechanisms
- Transparency in data usage

## Conclusion
With WakePay, users can enjoy a reliable alarm experience while being assured of their data safety and compliance with leading privacy regulations.