package service;

import java.util.ArrayList;
import java.util.List;
import util.FileUtility;

import model.Marks;

public class MarksService {

    private final List<Marks> marksList = new ArrayList<>();

    public void addMarks(Marks marks) {
        marksList.add(marks);
        System.out.println("Marks added successfully.");
    }

    public void viewMarks() {

        if (marksList.isEmpty()) {
            System.out.println("No marks records found.");
            return;
        }

        System.out.println("\n--- Marks Records ---");

        for (Marks marks : marksList) {
            System.out.println(marks);
        }
    }

    public List<Marks> getMarksForStudent(int studentId) {

        List<Marks> studentMarks = new ArrayList<>();

        for (Marks marks : marksList) {

            if (marks.getStudentId() == studentId) {
                studentMarks.add(marks);
            }
        }

        return studentMarks;
    }
    public void saveMarks() {

        StringBuilder data = new StringBuilder();

        for (Marks marks : marksList) {

            data.append(marks.getStudentId())
                    .append("|")
                    .append(marks.getSubject())
                    .append("|")
                    .append(marks.getScore())
                    .append("\n");
        }

        FileUtility.saveData("marks.txt", data.toString());
    }
    public void loadMarks() {

        String data = FileUtility.loadData("marks.txt");

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
                double score = Double.parseDouble(parts[2]);

                marksList.add(
                        new Marks(studentId, subject, score)
                );
            }
        }
    }
}