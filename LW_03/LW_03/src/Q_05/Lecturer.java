package Q_05;

public class Lecturer {
    private String lecturerName;
    private String courseTeaching;

    public Lecturer() {
        this.lecturerName = "Unknown";
        this.courseTeaching = "None";
    }

    public Lecturer(String lecturerName, String courseTeaching) {
        this.lecturerName = lecturerName;
        this.courseTeaching = courseTeaching;
    }

    public String getLecturerName() {
        return lecturerName;
    }

    public void setLecturerName(String lecturerName) {
        this.lecturerName = lecturerName;
    }

    public String getCourseTeaching() {
        return courseTeaching;
    }

    public void setCourseTeaching(String courseTeaching) {
        this.courseTeaching = courseTeaching;
    }

    public void displayLecturerInfo() {
        System.out.println("Lecturer Name: " + lecturerName);
        System.out.println("Course Teaching: " + courseTeaching);
    }
}

