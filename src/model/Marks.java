package model;

public class Marks {

    private int studentId;
    private String subject;
    private double score;

    public Marks(int studentId, String subject, double score) {

        this.studentId = studentId;
        this.subject = subject;
        this.score = score;
    }

    public int getStudentId() {
        return studentId;
    }

    public String getSubject() {
        return subject;
    }

    public double getScore() {
        return score;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public void setScore(double score) {
        this.score = score;
    }

    @Override
    public String toString() {

        return "Marks{" +
                "studentId=" + studentId +
                ", subject='" + subject + '\'' +
                ", score=" + score +
                '}';
    }
}