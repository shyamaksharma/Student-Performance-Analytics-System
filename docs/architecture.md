# System Architecture

The Student Performance Analytics System uses a simple layered structure.

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
