
# Use Cases

The system provides different operations that can be performed by the user through the console menu.

## Main Use Cases

- Add a student.
- View all students.
- Search for a student.
- Update student information.
- Delete a student.
- Add marks.
- View marks.
- Add attendance.
- View attendance.
- Generate a student performance report.
- Save data.
- Exit the application.

## Actor

- **User**
  - Interacts with the console application.
  - Performs student management operations.
  - Manages marks and attendance.
  - Generates performance reports.
  - Saves application data.

## Use Case Diagram

```mermaid
flowchart LR
    U((User))

    A[Add Student]
    B[View Students]
    C[Search Student]
    D[Update Student]
    E[Delete Student]
    F[Add Marks]
    G[View Marks]
    H[Add Attendance]
    I[View Attendance]
    J[Generate Student Report]
    K[Save Data]
    L[Exit]

    U --> A
    U --> B
    U --> C
    U --> D
    U --> E
    U --> F
    U --> G
    U --> H
    U --> I
    U --> J
    U --> K
    U --> L
