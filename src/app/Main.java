package app;

import java.util.Scanner;

import model.Student;
import model.Marks;
import model.Attendance;

import service.StudentService;
import service.MarksService;
import service.AttendanceService;
import service.ReportService;

import util.InputValidator;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        StudentService studentService = new StudentService();
        MarksService marksService = new MarksService();
        AttendanceService attendanceService = new AttendanceService();
        ReportService reportService = new ReportService();

        studentService.loadStudents();
        marksService.loadMarks();
        attendanceService.loadAttendance();

        boolean running = true;

        while (running) {

            System.out.println("1. Add Student");
            System.out.println("2. View Students");
            System.out.println("3. Search Student");
            System.out.println("4. Update Student");
            System.out.println("5. Delete Student");
            System.out.println("6. Add Marks");
            System.out.println("7. View Marks");
            System.out.println("8. Add Attendance");
            System.out.println("9. View Attendance");
            System.out.println("10. Generate Student Report");
            System.out.println("11. Save Data");
            System.out.println("12. Exit");
            int choice = InputValidator.getPositiveInt(
                scanner,
                "Enter your choice: "
            );

            switch (choice) {

                case 1:
                    addStudent(scanner, studentService);
                    break;

                case 2:
                    studentService.viewStudents();
                    break;

                case 3:
                    searchStudent(scanner, studentService);
                    break;

                case 4:
                    updateStudent(scanner, studentService);
                    break;

                case 5:
                    deleteStudent(scanner, studentService);
                    break;

                case 6:
                    addMarks(scanner, marksService);
                    break;

                case 7:
                    marksService.viewMarks();
                    break;

                case 8:
                    addAttendance(scanner, attendanceService);
                    break;

                case 9:
                    attendanceService.viewAttendance();
                    break;

                case 10:

                    generateReport(
                        scanner,
                        reportService,
                        studentService,
                        marksService,
                        attendanceService
                    );

                    break;

                case 11:

                    studentService.saveStudents();
                    marksService.saveMarks();
                    attendanceService.saveAttendance();

                    break;

                case 12:

                    running = false;

                    System.out.println("Exiting application...");

                    break;
            }
        }

        scanner.close();
    }

    private static void addStudent(Scanner scanner,
        StudentService studentService) {

        int studentId = InputValidator.getPositiveInt(
                scanner,
                "Enter student ID: "
        );

        if (studentService.findStudentById(studentId) != null) {
            System.out.println("Student ID already exists.");
            return;
        }

        System.out.print("Enter student name: ");
        String name = scanner.nextLine();

        System.out.print("Enter email: ");
        String email = scanner.nextLine();

        System.out.print("Enter course: ");
        String course = scanner.nextLine();

        Student student = new Student(
                studentId,
                name,
                email,
                course
        );

        studentService.addStudent(student);
    }

    private static void searchStudent(Scanner scanner,
        StudentService studentService) {

        int id = InputValidator.getPositiveInt(
                scanner,
                "Enter student ID to search: "
        );

        Student student = studentService.findStudentById(id);

        if (student != null) {
            System.out.println("Student found:");
            System.out.println(student);
        } else {
            System.out.println("Student not found.");
        }
    }

    private static void updateStudent(Scanner scanner,
        StudentService studentService) {

        int id = InputValidator.getPositiveInt(
                scanner,
            "Enter student ID to update: "
        );
        Student existingStudent = studentService.findStudentById(id);

        if (existingStudent == null) {
            System.out.println("Student not found.");
            return;
        }

        System.out.print("Enter new name: ");
        String name = scanner.nextLine();

        System.out.print("Enter new email: ");
        String email = scanner.nextLine();

        System.out.print("Enter new course: ");
        String course = scanner.nextLine();

        boolean updated = studentService.updateStudent(
                id,
                name,
                email,
                course
        );

        if (updated) {
            System.out.println("Student updated successfully.");
        }
    }

    private static void deleteStudent(Scanner scanner,
        StudentService studentService) {

        int id = InputValidator.getPositiveInt(
            scanner,
            "Enter student ID to delete: "
        );

        boolean deleted = studentService.deleteStudent(id);

        if (deleted) {
            System.out.println("Student deleted successfully.");
        } else {
            System.out.println("Student not found.");
        }
    }
    private static void addMarks(Scanner scanner,
            MarksService marksService) {

        int studentId = InputValidator.getPositiveInt(
                scanner,
                "Enter student ID: "
        );

        System.out.print("Enter subject: ");
        String subject = scanner.nextLine();

        double score = InputValidator.getPercentage(
                scanner,
                "Enter marks (0-100): "
        );

        Marks marks = new Marks(
                studentId,
                subject,
                score
        );

        marksService.addMarks(marks);
    }
    private static void addAttendance(Scanner scanner,
            AttendanceService attendanceService) {

        int studentId = InputValidator.getPositiveInt(
                scanner,
                "Enter student ID: "
        );

        System.out.print("Enter subject: ");
        String subject = scanner.nextLine();

        double percentage = InputValidator.getPercentage(
                scanner,
                "Enter attendance percentage (0-100): "
        );

        Attendance attendance = new Attendance(
                studentId,
                subject,
                percentage
        );

        attendanceService.addAttendance(attendance);
    }
    private static void generateReport(
        Scanner scanner,
        ReportService reportService,
        StudentService studentService,
        MarksService marksService,
        AttendanceService attendanceService) {

        int studentId = InputValidator.getPositiveInt(
            scanner,
            "Enter student ID: "
        );

        reportService.generateReport(
                studentId,
                studentService,
                marksService,
                attendanceService
        );
    }
}