# System Architecture

The Student Performance Analytics System uses a simple layered structure.

## Main Layers

- **Application Layer**
  - `Main.java`
  - Handles the console menu and user interaction.

- **Service Layer**
  - `StudentService`
  - `MarksService`
  - `AttendanceService`
  - `ReportService`
  - Handles the main application operations.

- **Model Layer**
  - `Student`
  - `Marks`
  - `Attendance`
  - Represents the application data.

- **Utility Layer**
  - `FileUtility`
  - `InputValidator`
  - Handles file operations and input validation.

- **Storage**
  - Text files are used to store student, marks, and attendance data.

## Architecture Diagram

```mermaid
flowchart TD
    A[User] --> B[Main / Console Menu]

    B --> C[StudentService]
    B --> D[MarksService]
    B --> E[AttendanceService]
    B --> F[ReportService]
    B --> G[InputValidator]

    C --> H[Student]
    D --> I[Marks]
    E --> J[Attendance]

    C --> K[FileUtility]
    D --> K
    E --> K

    K --> L[students.txt]
    K --> M[marks.txt]
    K --> N[attendance.txt]

    F --> C
    F --> D
    F --> E
