package Semeter2_OOP_With_Jav_a.WS4.Part2.StudentManagement;

public class Student {
    private String ID;
    private String studentName;
    private int semester;
    private String courseName;

    public Student() {
    }

    public Student(String ID, String studentName, int semester, String courseName) {
        this.ID = ID;
        this.studentName = studentName;
        this.semester = semester;
        this.courseName = courseName;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public int getSemester() {
        return semester;
    }

    public void setSemester(int semester) {
        this.semester = semester;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    @Override
    public String toString() {
        return "Student{" +
                "ID='" + ID + '\'' +
                ", studentName='" + studentName + '\'' +
                ", semester=" + semester +
                ", courseName='" + courseName + '\'' +
                '}';
    }
}
