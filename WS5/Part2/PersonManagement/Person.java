package Semeter2_OOP_With_Jav_a.WS5.Part2.PersonManagement;

public class Person {
    String name;
    String address;

    public Person() {
    }

    public Person(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Person[" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ']';
    }
}
