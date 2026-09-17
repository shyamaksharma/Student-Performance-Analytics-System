package model;

public class Attendance {

    private int studentId;
    private String subject;
    private double percentage;

    public Attendance(int studentId, String subject, double percentage) {

        this.studentId = studentId;
        this.subject = subject;
        this.percentage = percentage;
    }

    public int getStudentId() {
        return studentId;
    }

    public String getSubject() {
        return subject;
    }

    public double getPercentage() {
        return percentage;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public void setPercentage(double percentage) {
        this.percentage = percentage;
    }

    @Override
    public String toString() {

        return "Attendance{" +
                "studentId=" + studentId +
                ", subject='" + subject + '\'' +
                ", percentage=" + percentage +
                '}';
    }
}