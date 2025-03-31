package Q_05;

public class Course {
    private String courseName;
    private String courseCode;
    private Lecturer lecturer;  // Has-a relationship with Lecturer

    public Course() {
        this.courseName = "Unknown";
        this.courseCode = "None";
        this.lecturer = new Lecturer();
    }

    public Course(String courseName, String courseCode, Lecturer lecturer) {
        this.courseName = courseName;
        this.courseCode = courseCode;
        this.lecturer = lecturer;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseCode() {
        return courseCode;
    }

    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }

    public Lecturer getLecturer() {
        return lecturer;
    }

    public void setLecturer(Lecturer lecturer) {
        this.lecturer = lecturer;
    }

    public void displayCourseInfo() {
        System.out.println("Course Name: " + courseName);
        System.out.println("Course Code: " + courseCode);
        lecturer.displayLecturerInfo();
    }
}
