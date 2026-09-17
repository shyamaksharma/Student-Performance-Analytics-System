# Class Diagram

The project is divided into different classes based on their responsibilities.

## Main Classes

- **Student**
  - Stores student ID, name, email, and course.

- **Marks**
  - Stores student ID, subject, and marks.

- **Attendance**
  - Stores student ID, subject, and attendance percentage.

- **StudentService**
  - Manages student records and CRUD operations.

- **MarksService**
  - Manages marks records.

- **AttendanceService**
  - Manages attendance records.

- **ReportService**
  - Generates student performance reports.

- **FileUtility**
  - Handles saving and loading data.

- **InputValidator**
  - Validates user input.

## Class Relationships

- `StudentService` works with `Student` objects.
- `MarksService` works with `Marks` objects.
- `AttendanceService` works with `Attendance` objects.
- The service classes use `FileUtility` for file operations.
- `ReportService` uses the student, marks, and attendance services to generate reports.

## Class Diagram

```mermaid
classDiagram

    class Student {
        -int studentId
        -String name
        -String email
        -String course
        +Student()
        +getStudentId()
        +getName()
        +getEmail()
        +getCourse()
        +setName()
        +setEmail()
        +setCourse()
        +toString()
    }

    class Marks {
        -int studentId
        -String subject
        -double score
        +Marks()
        +getStudentId()
        +getSubject()
        +getScore()
        +setScore()
        +toString()
    }

    class Attendance {
        -int studentId
        -String subject
        -double percentage
        +Attendance()
        +getStudentId()
        +getSubject()
        +getPercentage()
        +setPercentage()
        +toString()
    }

    class StudentService {
        -ArrayList~Student~ students
        +addStudent()
        +viewStudents()
        +findStudent()
        +updateStudent()
        +deleteStudent()
        +saveData()
        +loadData()
    }

    class MarksService {
        -ArrayList~Marks~ marksList
        +addMarks()
        +viewMarks()
        +getMarksForStudent()
        +saveData()
        +loadData()
    }

    class AttendanceService {
        -ArrayList~Attendance~ attendanceList
        +addAttendance()
        +viewAttendance()
        +getAttendanceForStudent()
        +saveData()
        +loadData()
    }

    class ReportService {
        +generateReport()
    }

    class FileUtility {
        +saveData()
        +loadData()
    }

    class InputValidator {
        +getPositiveInt()
        +getPercentage()
        +getMenuChoice()
    }

    StudentService --> Student
    MarksService --> Marks
    AttendanceService --> Attendance

    StudentService --> FileUtility
    MarksService --> FileUtility
    AttendanceService --> FileUtility

    ReportService --> StudentService
    ReportService --> MarksService
    ReportService --> AttendanceService
