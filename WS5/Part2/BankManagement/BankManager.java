package Semeter2_OOP_With_Jav_a.WS5.Part2.BankManagement;

import java.util.ArrayList;
import java.util.List;

public class BankManager implements Employee {
    private int id;
    private String name;
    private double salary;
    private List<Employee> list;

    // Constructor
    public BankManager(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.list = new ArrayList<Employee>();
    }

    // Getter - Setter
    @Override
    public int getId() {
        return id;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getSalary() {
        return salary;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public void add(Employee e) {
        this.list.add(e);
    }

    @Override
    public void remove(Employee e) {
        this.list.remove(e);
    }

    @Override
    public Employee getChild(int id) {
        return this.list.get(id);
    }

    public void display() {
        System.out.println("============================");
        System.out.println("BankManager");
        System.out.println("ID: " + this.getId());
        System.out.println("Name: " + this.getName());
        System.out.println("Salary: " + this.getSalary());

        list.forEach(Employee::display);
    }

    @Override
    public String toString() {
        return "BankManager{" + "id=" + id + ", name=" + name + ", salary=" + salary + ", list=" + list + '}';
    }

}
