package Semeter2_OOP_With_Jav_a.BaiTapTrenLop.Ngay2.BanThan;

public class Person {
    public String name;
    public int id;
    public String subjectCode;
    public String Group;
    public double averageMark;

    public Person(String name, int id, String subjectCode, String group, double averageMark) {
        this.name = name;
        this.id = id;
        this.subjectCode = subjectCode;
        Group = group;
        this.averageMark = averageMark;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", subjectCode='" + subjectCode + '\'' +
                ", Group='" + Group + '\'' +
                ", averageMark=" + averageMark +
                '}';
    }
}
