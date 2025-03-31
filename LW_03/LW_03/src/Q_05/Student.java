package Q_05;

public class Student {
    private String studentName;
    private String degreeName;
    private String courseFollowing;

    public Student() {
        this.studentName = "Unknown";
        this.degreeName = "Unknown";
        this.courseFollowing = "None";
    }

    public Student(String studentName, String degreeName, String courseFollowing) {
        this.studentName = studentName;
        this.degreeName = degreeName;
        this.courseFollowing = courseFollowing;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getDegreeName() {
        return degreeName;
    }

    public void setDegreeName(String degreeName) {
        this.degreeName = degreeName;
    }

    public String getCourseFollowing() {
        return courseFollowing;
    }

    public void setCourseFollowing(String courseFollowing) {
        this.courseFollowing = courseFollowing;
    }

    public void displayStudentInfo() {
        System.out.println("Student Name: " + studentName);
        System.out.println("Degree Program: " + degreeName);
        System.out.println("Enrolled Course: " + courseFollowing);
    }
}
