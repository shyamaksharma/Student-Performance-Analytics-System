package service;

import java.util.ArrayList;
import java.util.List;
import util.FileUtility;

import model.Attendance;

public class AttendanceService {

    private final List<Attendance> attendanceList = new ArrayList<>();

    public void addAttendance(Attendance attendance) {
        attendanceList.add(attendance);
        System.out.println("Attendance record added successfully.");
    }

    public void viewAttendance() {

        if (attendanceList.isEmpty()) {
            System.out.println("No attendance records found.");
            return;
        }

        System.out.println("\n--- Attendance Records ---");

        for (Attendance attendance : attendanceList) {
            System.out.println(attendance);
        }
    }

    public List<Attendance> getAttendanceForStudent(int studentId) {

        List<Attendance> studentAttendance = new ArrayList<>();

        for (Attendance attendance : attendanceList) {

            if (attendance.getStudentId() == studentId) {
                studentAttendance.add(attendance);
            }
        }

        return studentAttendance;
    }public void saveAttendance() {

        StringBuilder data = new StringBuilder();

        for (Attendance attendance : attendanceList) {

            data.append(attendance.getStudentId())
                    .append("|")
                    .append(attendance.getSubject())
                    .append("|")
                    .append(attendance.getPercentage())
                    .append("\n");
        }

        FileUtility.saveData("attendance.txt", data.toString());
    }
    public void loadAttendance() {

        String data = FileUtility.loadData("attendance.txt");

        if (data.isEmpty()) {
            return;
        }

        String[] lines = data.split("\n");

        for (String line : lines) {

            if (line.trim().isEmpty()) {
                continue;
            }

            String[] parts = line.split("\\|");

            if (parts.length == 3) {

                int studentId = Integer.parseInt(parts[0]);
                String subject = parts[1];
                double percentage = Double.parseDouble(parts[2]);

                attendanceList.add(
                        new Attendance(
                                studentId,
                                subject,
                                percentage
                        )
                );
            }
        }
    }
}
