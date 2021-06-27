package Semeter2_OOP_With_Jav_a.BaiTapTrenLop.Ngay2;

public class Person {
    public String name;
    public String subject;
    public int age;
    public String department;
    public double salary;

    public Person(String name, String subject, int age, String department, double salary) {
        this.name = name;
        this.subject = subject;
        this.age = age;
        this.department = department;
        this.salary = salary;
    }



    public Person() {

    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", subject='" + subject + '\'' +
                ", age=" + age +
                ", department=" + department +
                ", salary=" + salary +
                '}';
    }
}
