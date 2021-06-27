package Semeter2_OOP_With_Jav_a.BaiTapTrenLop.Ngay4.Bai2;

public class Person {
    String id;
    String name;

    public Person() {
    }

    public Person(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void hobbies(String h)
    {
        System.out.println(name+ " like "+h);
    }
    @Override
    public String toString() {
        return "id=" + id + ", name=" + name + '}';
    }
}
