# University Event Management System

## Language and Framework
![Java](https://img.shields.io/badge/Language-Java-green)
![Spring Boot](https://img.shields.io/badge/Framework-Spring%20Boot-brightgreen)

## Description
The University Event Management System is a Java-based application built using the Spring Boot framework. This system allows universities to efficiently manage and schedule events and keep track of student information.

## Models
### Event Entity
- **Attributes:**
  - `id (Integer)`: Unique identifier for each event.
  - `name (String)`: Name of the event.
  - `location (String)`: Location of the event.
  - `date (Date)`: Date of the event.
  - `startTime (Time)`: Start time of the event.
  - `endTime (Time)`: End time of the event (optional).

### Student Entity
- **Attributes:**
  - `id (Integer)`: Unique identifier for each student.
  - `firstName (String)`: First name of the student (matches pattern: First letter capitalized).
  - `lastName (String)`: Last name of the student (matches pattern: First letter capitalized).
  - `age (Integer)`: Age of the student (between 18 and 25).
  - `department (Departments)`: Department to which the student belongs.

## Controllers
### EventCurdController
- **Endpoints:**
  - `POST /addEvent`: Add a new event by providing event details in the request body.
  - `GET /getAllEvents/date`: Retrieve a list of all events, by date
  - `GET /events/date/{date}`: Retrieve events on or after a specified date.
  - `PUT /updateEvent`: Update event details by providing the event ID and optional parameters for name, location, date, startTime, and endTime.
  - `DELETE /deleteEvent/id/{id}`: Delete an event by its ID.

### StudentCurdController
- **Endpoints:**
  - `POST /addStudent`: Add new students by providing a list of student details in the request body.
  - `GET /getAllStudents`: Retrieve a list of all students.
  - `GET /getStudent/id/`: Retrieve a student by their ID.
  - `PUT /student/id/data`: Update student details by providing the student ID and optional parameters for firstName, lastName, age, and department.
  - `DELETE /deleteStudent/{studentId}`: Delete a student by their ID.

## Repositories
### IStudentRepo
- Interface extending `JpaRepository` for the Student entity.

### IEventRepo
- Interface extending `JpaRepository` for the Event entity.
- Custom query methods include:
- `findAllByDate()`: Retrieve events ordered by date

## Services
### StudentServices
- Manages student-related operations.
- `addStudent`: Add a list of students, avoiding duplicates.
- `getAllStudents`: Retrieve all students.
- `getStudentById`: Retrieve a student by ID.
- `updateStudentData`: Update student details based on the provided parameters.
- `deleteStudent`: Delete a student by ID.

### EventServices
- Manages event-related operations.
- `addEvent`: Add an event if it doesn't already exist.
- `getAllEvents`: Retrieve all events, ordered by date.
- `getAllByDate`: Retrieve events on or after a specified date, ordered by date.
- `updateEvent`: Update event details based on provided parameters.
- `deleteEvent`: Delete an event by ID.

## Database Schema
Here I have used H2 Database
The database schema for the "Event" entity is as follows:

- **Event (Table):**
  - id (integer, primary key)
  - name (string)
  - location (string)
  - date (date)
  - startTime (time)
  - endTime (time)

The database schema for the "Student" entity is as follows:

- **Student (Table):**
  - id (integer, primary key)
  - firstName (string)
  - lastName (string)
  - age (integer)
  - department (enum)
 
  ## Prerequisites
Make sure you have the following prerequisites installed on your system:

- Java Development Kit (JDK)
- Maven
- all the dependencies from poem.xml or active internet connection

## Installation
1. Clone this repository to your local machine:

   ```bash
   git clone https://github.com/Abdul12527/University-Event-Management-System.git
   
2. Navigate to the project directory

    ```bash
    cd University-Event-Management-System
  
## Usage
You can use the NewMonster Jobs application by making HTTP requests to the provided API endpoints using your preferred API testing tool or framework.