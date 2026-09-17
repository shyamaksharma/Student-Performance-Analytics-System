package service;

import java.util.ArrayList;
import java.util.List;
import util.FileUtility;

import model.Student;

public class StudentService {

    private final List<Student> students = new ArrayList<>();

    public void addStudent(Student student) {

        System.out.println("DEBUG: Number of students = " + students.size());
        System.out.println("DEBUG: Trying to add ID = " + student.getStudentId());  

        for (Student existingStudent : students) {

            if (existingStudent.getStudentId() == student.getStudentId()) {
                System.out.println("Student ID already exists.");
                return;
            }
        }

        students.add(student);
        System.out.println("Student added successfully.");
    }
    public void viewStudents() {

        if (students.isEmpty()) {
            System.out.println("No students found.");
            return;
        }

        System.out.println("\n--- Student List ---");

        for (Student student : students) {
            System.out.println(student);
        }
    }

    public Student findStudentById(int studentId) {

        for (Student student : students) {

            if (student.getStudentId() == studentId) {
                return student;
            }
        }

        return null;
    }

    public boolean updateStudent(int studentId, String name,
                                 String email, String course) {

        Student student = findStudentById(studentId);

        if (student == null) {
            return false;
        }

        student.setName(name);
        student.setEmail(email);
        student.setCourse(course);

        return true;
    }

    public boolean deleteStudent(int studentId) {

        Student student = findStudentById(studentId);

        if (student == null) {
            return false;
        }

        students.remove(student);
        return true;
    }
    public void saveStudents() {

        StringBuilder data = new StringBuilder();

        for (Student student : students) {

            data.append(student.getStudentId())
                    .append("|")
                    .append(student.getName())
                    .append("|")
                    .append(student.getEmail())
                    .append("|")
                    .append(student.getCourse())
                    .append("\n");
        }

        FileUtility.saveData("students.txt", data.toString());
    }
    public void loadStudents() {

        String data = FileUtility.loadData("students.txt");

        if (data.isEmpty()) {
            return;
        }

        String[] lines = data.split("\n");

        for (String line : lines) {

            if (line.trim().isEmpty()) {
                continue;
            }

            String[] parts = line.split("\\|");

            if (parts.length == 4) {

                int id = Integer.parseInt(parts[0]);
                String name = parts[1];
                String email = parts[2];
                String course = parts[3];

                students.add(
                        new Student(id, name, email, course)
                );
            }
        }
    }
}