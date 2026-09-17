package service;

import java.util.List;

import model.Attendance;
import model.Marks;
import model.Student;

public class ReportService {

    public void generateReport(int studentId,
                               StudentService studentService,
                               MarksService marksService,
                               AttendanceService attendanceService) {

        Student student = studentService.findStudentById(studentId);

        if (student == null) {
            System.out.println("Student not found.");
            return;
        }

        List<Marks> studentMarks = marksService.getMarksForStudent(studentId);
        List<Attendance> studentAttendance =
                attendanceService.getAttendanceForStudent(studentId);

        System.out.println("\n========================================");
        System.out.println("       STUDENT PERFORMANCE REPORT");
        System.out.println("========================================");

        System.out.println("Student ID: " + student.getStudentId());
        System.out.println("Name: " + student.getName());
        System.out.println("Email: " + student.getEmail());
        System.out.println("Course: " + student.getCourse());

        // Marks section
        System.out.println("\n--- Academic Performance ---");

        if (studentMarks.isEmpty()) {

            System.out.println("No marks records found.");

        } else {

            double totalMarks = 0;

            for (Marks marks : studentMarks) {
                System.out.println(
                        marks.getSubject() + ": " + marks.getScore()
                );

                totalMarks += marks.getScore();
            }

            double averageMarks = totalMarks / studentMarks.size();

            System.out.printf("Average Marks: %.2f%n", averageMarks);
        }

        // Attendance section
        System.out.println("\n--- Attendance ---");

        if (studentAttendance.isEmpty()) {

            System.out.println("No attendance records found.");

        } else {

            double totalAttendance = 0;

            for (Attendance attendance : studentAttendance) {
                System.out.printf(
                        "%s: %.2f%%%n",
                        attendance.getSubject(),
                        attendance.getPercentage()
                );

                totalAttendance += attendance.getPercentage();
            }

            double averageAttendance =
                    totalAttendance / studentAttendance.size();

            System.out.printf(
                    "Average Attendance: %.2f%%%n",
                    averageAttendance
            );
        }

        System.out.println("========================================");
    }
}