package Semeter2_OOP_With_Jav_a.BaiTapTrenLop.Ngay4.Bai2;

public class Student extends Person{
    private double grade;

    public Student() {
    }

    public Student(double grade) {
        this.grade = grade;
    }

    public Student(double grade, String id, String name) {
        super(id, name);
        this.grade = grade;
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Student{"+super.toString() + "grade=" + grade + '}';
    }



}
