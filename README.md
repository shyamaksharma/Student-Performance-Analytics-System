# Student-Performance-Analytics-System
A Java-based Student Performance Analytics System using Object-Oriented Programming, Collections, Exception Handling, File I/O, and Java NIO.

## 1. Project Overview

- The Student Performance Analytics System is a console-based Java application.
- The project is designed to manage basic student academic information.
- The system manages:
  - Student details
  - Subject-wise marks
  - Subject-wise attendance
  - Student performance reports
- Users can add, view, search, update, and delete student records.
- Marks and attendance records can be added and viewed through the application.
- The system calculates:
  - Average marks
  - Average attendance
- Student records are stored using local text files.
- Saved data can be loaded when the application starts.
- Sample data is included for demonstration and testing.

## 2. Features

### Student Management

- Add a new student
- View all students
- Search for a student using student ID
- Update student information
- Delete a student
- Prevent duplicate student IDs
- Store student name, email, and course

### Marks Management

- Add marks for a student
- View marks records
- Store marks for different subjects
- Calculate average marks for a student
- Validate marks between 0 and 100

### Attendance Management

- Add attendance records
- View attendance records
- Store attendance for different subjects
- Calculate average attendance for a student
- Validate attendance between 0% and 100%

### Reports and Analytics

- Generate an individual student performance report
- Display student information
- Display subject-wise marks
- Display average marks
- Display subject-wise attendance
- Display average attendance

### Data Management

- Save student records to a local text file
- Save marks records separately
- Save attendance records separately
- Load saved records when the application starts
- Include sample data for demonstration
- Handle invalid input without terminating the application

## 3. Technologies Used

- Java
- Object-Oriented Programming
- Java Collections Framework
- ArrayList
- File I/O
- Java NIO
- Path
- Files
- Exception Handling
- Visual Studio Code
- Git
- GitHub

## 4. Project Structure

```text
Student-Performance-Analytics-System/
│
├── .vscode/
│   └── settings.json
│
├── data/
│   ├── students.txt
│   ├── marks.txt
│   └── attendance.txt
│
├── src/
│   ├── app/
│   │   └── Main.java
│   │
│   ├── model/
│   │   ├── Student.java
│   │   ├── Marks.java
│   │   └── Attendance.java
│   │
│   ├── service/
│   │   ├── StudentService.java
│   │   ├── MarksService.java
│   │   ├── AttendanceService.java
│   │   └── ReportService.java
│   │
│   ├── database/
│   │
│   ├── exceptions/
│   │
│   └── util/
│       ├── FileUtility.java
│       └── InputValidator.java
│
├── reports/
│
├── README.md
└── .gitignore
```

## 5. Requirements

To run this project, you need:

- Java Development Kit (JDK)
- Java compiler (`javac`)
- Java runtime (`java`)
- A terminal or command prompt
- A Java-supported IDE such as:
  - Visual Studio Code
  - Eclipse
  - IntelliJ IDEA

### External Libraries

- No external libraries are required.
- The project uses standard Java classes and APIs.

## 6. How to Run

### Step 1: Open the Project

- Download or clone the project repository.
- Open the project folder in a Java-supported IDE.

### Step 2: Check Java Installation

- Make sure Java is installed.
- Open a terminal inside the project folder.
- Check the installed Java version:

`java -version`

- Check the Java compiler:

`javac -version`

### Step 3: Open the Main File

- Navigate to:

`src/app/Main.java`

- Open `Main.java` in the IDE.

### Step 4: Run the Application

- Run `Main.java`.
- The application starts in the terminal.
- Sample student, marks, and attendance data is loaded automatically.

### Step 5: Use the Menu

The application provides the following options:

1. Add Student
2. View Students
3. Search Student
4. Update Student
5. Delete Student
6. Add Marks
7. View Marks
8. Add Attendance
9. View Attendance
10. Generate Student Report
11. Save Data
12. Exit

## 7. Data Storage

- The project uses local text files for data storage.
- Data is stored inside the `data` folder.

### Student Data

`data/students.txt`

- Stores:
  - Student ID
  - Student name
  - Email
  - Course

### Marks Data

`data/marks.txt`

- Stores:
  - Student ID
  - Subject
  - Marks

### Attendance Data

`data/attendance.txt`

- Stores:
  - Student ID
  - Subject
  - Attendance percentage

### Data Handling

- Data is loaded when the application starts.
- Users can save the current records using the **Save Data** option.
- The files use a simple text-based format.
- Sample records are included for demonstration.
- Separate files are used for students, marks, and attendance.

## 8. Testing

- The application was tested using normal and invalid inputs.

### Student Management Testing

- Add student
- View students
- Search for an existing student
- Search for a non-existing student
- Update student details
- Delete an existing student
- Attempt to delete a non-existing student
- Attempt to add a duplicate student ID

### Marks Testing

- Add marks for a student
- View marks
- Generate a report containing marks
- Enter valid marks
- Enter marks below 0
- Enter marks above 100
- Enter non-numeric marks

### Attendance Testing

- Add attendance record
- View attendance records
- Generate a report containing attendance
- Enter valid attendance percentage
- Enter attendance below 0%
- Enter attendance above 100%
- Enter non-numeric attendance

### Input and Data Testing

- Enter valid menu choices
- Enter invalid numeric input
- Enter non-numeric input where a number is required
- Load sample data when the program starts
- Save student, marks, and attendance data
- Verify saved data can be loaded again

## 9. Error Handling

- The application includes basic input validation and exception handling.

### Input Validation

- Student IDs must be positive numbers.
- Duplicate student IDs are rejected.
- Marks must be between 0 and 100.
- Attendance percentages must be between 0 and 100.
- Invalid menu input is handled without crashing the application.

### Exception Handling

- `NumberFormatException` is handled when numeric input is invalid.
- `IOException` is handled when reading or writing files fails.
- Missing data files are handled by the file utility.
- Invalid values display an appropriate message.
- The user can continue using the application after invalid input.

## 10. Future Enhancements

Possible improvements for future versions include:

- Database integration using JDBC
- Graphical user interface
- More detailed performance analytics
- Grade calculation
- Class-level performance reports
- Report export to PDF
- Additional student information
- More advanced search and filtering
- Improved data validation
- More detailed attendance tracking

## 11. Author

- **Project:** Student Performance Analytics System
- Developed as an academic Java project.
- The project was created to practice Java programming concepts including:
  - Object-Oriented Programming
  - Classes and objects
  - Packages
  - Collections
  - Exception handling
  - File handling
  - Input validation
