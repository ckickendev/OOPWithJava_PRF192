package Semeter2_OOP_With_Jav_a.WS5.Part1.WorkerManagement;

public class Person {
    String name;

    public Person() {
    }

    public Person(String name) {
        this.name = name;
    }

    public void display(){
        System.out.println("Name: "+ name);
    }

    public double getSalary() {
        return 0;
    }
}
