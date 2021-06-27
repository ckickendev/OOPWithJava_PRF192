package Semeter2_OOP_With_Jav_a.BaiTapTrenLop.Ngay3.Diem10;

public class Student {
    private int ID;
    private String name;
    private int semeter;
    private String courseName;

    public Student(int ID, String name, int semeter, String courseName) {
        this.ID = ID;
        this.name = name;
        this.semeter = semeter;
        this.courseName = courseName;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSemeter() {
        return semeter;
    }

    public void setSemeter(int semeter) {
        this.semeter = semeter;
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
                "ID=" + ID +
                ", name='" + name + '\'' +
                ", semeter='" + semeter + '\'' +
                ", courseName='" + courseName + '\'' +
                '}';
    }
}
