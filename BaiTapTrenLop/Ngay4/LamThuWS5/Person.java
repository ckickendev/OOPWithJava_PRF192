package Semeter2_OOP_With_Jav_a.BaiTapTrenLop.Ngay4.LamThuWS5;

public class Person {
    private String name;

    public Person() {
    }

    public Person(String name) {
        this.name = name;
    }

    public double getSalary(){
        return 0;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                '}';
    }
}
