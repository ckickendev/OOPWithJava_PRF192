package Semeter2_OOP_With_Jav_a.WS5.Part2.BankManagement;

public class Accountant implements Employee {
    private int id;
    private String name;
    private double salary;

    public Accountant(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

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

    public void display() {
        System.out.println("============================");
        System.out.println("Accountant");
        System.out.println("ID: " + this.getId());
        System.out.println("Name: " + this.getName());
        System.out.println("Salary: " + this.getSalary());

    }

    @Override
    public void add(Employee e) {

    }

    @Override
    public void remove(Employee e) {

    }

    @Override
    public Employee getChild(int id) {
        return null;

    }

    @Override
    public String toString() {
        return "Accountant{" + "id=" + id + ", name=" + name + ", salary=" + salary + '}';
    }

}
