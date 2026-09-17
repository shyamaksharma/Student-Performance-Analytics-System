# Student-Performance-Analytics-System
A Java-based Student Performance and Academic Analytics System using OOP, Collections, Exception Handling, File I/O, Concurrency, and JDBC.
# Student Performance Analytics System

## Overview

- Java-based console application
- Used for managing basic student academic information
- Stores:
  - Student details
  - Marks
  - Attendance
- Generates a basic performance report
- Uses text files for storing data
- Includes sample data for demonstration

## Main Features

### Student Management

- Add student
- View students
- Search student by ID
- Update student details
- Delete student
- Prevent duplicate student IDs

### Marks Management

- Add marks
- View marks
- Store marks for different subjects
- Calculate average marks
- Accept marks from 0 to 100

### Attendance Management

- Add attendance
- View attendance records
- Store attendance for different subjects
- Calculate average attendance
- Accept attendance from 0% to 100%

### Performance Report

- Generate report for a student
- Show student information
- Show subject-wise marks
- Show average marks
- Show subject-wise attendance
- Show average attendance

### File Storage

- Student data stored in `students.txt`
- Marks stored in `marks.txt`
- Attendance stored in `attendance.txt`
- Data can be saved from the application
- Saved data is loaded when the application starts
- Sample data is included

## Technologies Used

- Java
- Object-Oriented Programming
- `ArrayList`
- Java Collections
- Exception Handling
- File I/O
- Java NIO
- `Path`
- `Files`
- VS Code
- Git
- GitHub

## Project Structure

```text
Student-Performance-Analytics-System
│
├── data
│   ├── students.txt
│   ├── marks.txt
│   └── attendance.txt
│
├── src
│   ├── app
│   │   └── Main.java
│   │
│   ├── model
│   │   ├── Student.java
│   │   ├── Marks.java
│   │   └── Attendance.java
│   │
│   ├── service
│   │   ├── StudentService.java
│   │   ├── MarksService.java
│   │   ├── AttendanceService.java
│   │   └── ReportService.java
│   │
│   └── util
│       ├── FileUtility.java
│       └── InputValidator.java
│
├── README.md
├── statement.md
└── .gitignore
