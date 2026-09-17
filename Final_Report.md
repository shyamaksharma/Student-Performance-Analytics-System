# Student Performance Analytics System

## 1. Introduction

The Student Performance Analytics System is a console-based Java application developed to manage student academic records.

The system provides features for:

- Managing student information
- Adding and viewing marks
- Adding and viewing attendance
- Searching, updating, and deleting student records
- Generating individual student performance reports
- Calculating average marks and attendance
- Saving and loading data using text files

The project was developed using basic and intermediate Java concepts such as classes and objects, encapsulation, packages, ArrayList, exception handling, file I/O, CRUD operations, and input validation.

The main purpose of the project is to provide a simple application for managing student performance while applying the Java concepts learned during the course.

## 2. Problem Statement

Managing student academic records manually can make it difficult to keep student information, marks, and attendance organized.

Some common problems include:

- Student details, marks, and attendance being stored separately.
- Difficulty finding or updating a student's information.
- Calculating performance averages manually.
- Maintaining records without a simple organized system.
- Difficulty generating a quick summary of a student's performance.

To address these problems, this project provides a simple Java-based system where student details, marks, and attendance can be managed in one application.

The system also generates individual performance reports containing the student's details, marks, attendance, and calculated averages.

## 3. Project Objectives

The main objectives of the project are:

- To develop a simple Java application for managing student academic records.
- To apply Java programming concepts such as classes, objects, encapsulation, packages, and collections.
- To implement CRUD operations for student records.
- To manage student marks and attendance.
- To generate basic performance reports using stored data.
- To use file handling for saving and loading student information.
- To practice input validation and exception handling.
- To understand how different Java classes can work together to solve a practical problem.

## 4. Functional Requirements

The system should provide the following functions:

### 4.1 Student Management
- Add a new student.
- View all students.
- Search for a student using student ID.
- Update student information.
- Delete a student.
- Prevent duplicate student IDs.

### 4.2 Marks Management
- Add marks for a student.
- View stored marks.
- Store marks for different subjects.
- Calculate average marks for a student.

### 4.3 Attendance Management
- Add attendance records.
- View stored attendance records.
- Store attendance for different subjects.
- Calculate average attendance for a student.

### 4.4 Performance Reports
- Generate an individual student report.
- Display student details.
- Display subject-wise marks.
- Display subject-wise attendance.
- Display average marks and attendance.

### 4.5 Data Management
- Save student, marks, and attendance data.
- Load existing data when the application starts.
- Store data using local text files.

  ## 5. Non-Functional Requirements

The system should also meet the following requirements:

### 5.1 Usability
- The application should have a simple console-based menu.
- Menu options should be easy to understand.
- The system should provide clear messages after operations.

### 5.2 Reliability
- Existing data should be loaded correctly when the application starts.
- The application should handle invalid input without crashing.
- Data should be saved in an organized format.

### 5.3 Maintainability
- The program should be divided into different classes based on their responsibilities.
- Packages should be used to organize the source code.
- Methods should perform specific tasks instead of putting all logic in one class.

### 5.4 Error Handling
- Invalid numeric input should be handled.
- Duplicate student IDs should be prevented.
- Marks and attendance values should be checked before storing them.
- File-related errors should be handled properly.

  ## 6. System Architecture

The project follows a simple layered structure. The main classes are divided into different packages according to their responsibilities.

### Main Components

- **Main**
  - Provides the console menu.
  - Takes input from the user.
  - Calls the required service methods.

- **Model Classes**
  - `Student`
  - `Marks`
  - `Attendance`
  - Store the main data of the application.

- **Service Classes**
  - `StudentService`
  - `MarksService`
  - `AttendanceService`
  - `ReportService`
  - Handle the main operations and processing.

- **Utility Classes**
  - `FileUtility`
  - `InputValidator`
  - Handle file operations and input validation.

- **Data Files**
  - `students.txt`
  - `marks.txt`
  - `attendance.txt`
  - Store the application data locally.
  - <img width="1628" height="1272" alt="mermaid-diagram" src="https://github.com/user-attachments/assets/f20865b8-bbd0-46f0-bb46-745665443d77" />

  ## 7. System Workflow

The basic workflow of the application is:

1. The application starts.
2. Existing student, marks, and attendance data is loaded from the text files.
3. The main menu is displayed.
4. The user selects an operation.
5. The system validates the required input.
6. The appropriate service class performs the operation.
7. The result is displayed on the console.
8. The user can perform another operation.
9. The user can save the data.
10. The application exits when the user selects the exit option.

### Performance Report Workflow

1. User selects **Generate Student Report**.
2. User enters the student ID.
3. The system searches for the student.
4. Student details are retrieved.
5. Marks and attendance records are retrieved.
6. Average marks and attendance are calculated.
7. The complete student report is displayed.

## 8. Project Design

The project is divided into multiple classes so that each class has a specific responsibility.

### Model Package

- `Student` stores student information.
- `Marks` stores marks for a subject.
- `Attendance` stores attendance information.

### Service Package

- `StudentService` manages student CRUD operations.
- `MarksService` manages marks records.
- `AttendanceService` manages attendance records.
- `ReportService` generates student performance reports.

### Utility Package

- `FileUtility` handles saving and loading data.
- `InputValidator` validates user input.

### Application Package

- `Main` controls the application flow and console menu.

This structure makes the project easier to understand and maintain because different parts of the application are handled by separate classes.

## 9. Implementation Details

The project was implemented using Java and is divided into different packages and classes.

### 9.1 Java Classes

- `Student.java`
  - Stores student ID, name, email, and course.
  - Uses constructors, getters, setters, and `toString()`.

- `Marks.java`
  - Stores student ID, subject, and marks.

- `Attendance.java`
  - Stores student ID, subject, and attendance percentage.

- `StudentService.java`
  - Handles student CRUD operations.
  - Uses `ArrayList` to store student objects.

- `MarksService.java`
  - Handles adding, viewing, saving, and loading marks.

- `AttendanceService.java`
  - Handles adding, viewing, saving, and loading attendance.

- `ReportService.java`
  - Collects student, marks, and attendance information.
  - Calculates average marks and attendance.
  - Generates an individual performance report.

- `FileUtility.java`
  - Handles reading and writing data using Java file handling.

- `InputValidator.java`
  - Validates user input such as IDs, marks, attendance, and menu input.

- `Main.java`
  - Controls the application.
  - Displays the menu and connects the different services.


## 10. Technologies and Java Concepts Used

### Technologies

- Java
- Visual Studio Code
- Git
- GitHub

### Java Concepts

- Classes and objects
- Encapsulation
- Constructors
- Getters and setters
- Packages
- ArrayList
- CRUD operations
- Exception handling
- File I/O
- Java NIO
- Input validation
- Methods and conditional statements

## 11. Testing

The application was tested by performing different operations through the console.

| Test Case | Expected Result | Result |
|---|---|---|
| Add a new student | Student should be added | Passed |
| Add duplicate student ID | Duplicate ID should be rejected | Passed |
| View students | Stored students should be displayed | Passed |
| Search student | Matching student should be displayed | Passed |
| Update student | Student details should be updated | Passed |
| Delete student | Selected student should be removed | Passed |
| Add marks | Marks should be stored | Passed |
| Add attendance | Attendance should be stored | Passed |
| Generate report | Student performance report should be displayed | Passed |
| Enter invalid numeric input | Error message should be displayed | Passed |
| Save data | Data should be written to files | Passed |
| Load existing data | Previously stored data should be available | Passed |

## 12. Challenges Faced

During development, some challenges were encountered:

- Organizing the project into multiple packages and classes.
- Understanding how objects are passed between different service classes.
- Handling file reading and writing correctly.
- Making sure invalid input does not crash the program.
- Implementing CRUD operations correctly.
- Connecting student, marks, and attendance data while generating reports.
- Setting up and managing the project using Git and GitHub.

## 13. Learning Outcomes

Through this project, I learned:

- How to create and use Java classes and objects.
- How encapsulation works using private fields, getters, and setters.
- How to organize Java code using packages.
- How to use `ArrayList` for storing objects.
- How to implement CRUD operations.
- How to handle exceptions and invalid input.
- How to read and write data using files.
- How different classes can work together in one application.
- How to use Git and GitHub to manage a project.
- How Java concepts can be applied to solve a practical problem.

## 14. Future Enhancements

The project can be improved in the future by adding:

- A graphical user interface.
- Database support using JDBC.
- More detailed class-level performance analytics.
- Exporting reports to PDF or other formats.
- User login and role-based access.
- Charts and graphs for performance visualization.

## 15. Conclusion

The Student Performance Analytics System provides a simple way to manage student details, marks, attendance, and performance reports.

The project helped in applying Java concepts such as OOP, collections, exception handling, file handling, CRUD operations, and packages in a practical application.

The final system meets the main requirements of the project and provides a foundation that can be extended with additional features in the future.

## 17. References

- Java documentation and learning materials provided during the course.
- Java SE documentation.
- Git and GitHub documentation.

  
