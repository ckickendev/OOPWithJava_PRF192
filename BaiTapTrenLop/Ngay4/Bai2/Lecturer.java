package Semeter2_OOP_With_Jav_a.BaiTapTrenLop.Ngay4.Bai2;

public class Lecturer extends Person {
    private double salary;
    private String department;

    public Lecturer() {
    }

    public Lecturer(double salary, String department) {
        this.salary = salary;
        this.department = department;
    }

    public Lecturer(double salary, String department, String id, String name) {
        super(id, name);
        this.salary = salary;
        this.department = department;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "Lecturer{" +super.toString()+ "salary=" + salary + ", department=" + department + '}';
    }




}
