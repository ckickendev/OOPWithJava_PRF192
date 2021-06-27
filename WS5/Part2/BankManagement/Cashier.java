package Semeter2_OOP_With_Jav_a.WS5.Part2.BankManagement;

public class Cashier implements Employee {

    private int id;
    private String name;
    private double salary;

    public Cashier(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
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
    public int getId() {
        return this.id;
    }

    @Override
    public String getName() {
        return this.name;

    }

    @Override
    public double getSalary() {
        return this.salary;
    }

    @Override
    public void display() {
        System.out.println("============================");
        System.out.println("Cashier");
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
        return "Cashier{" + "id=" + id + ", name=" + name + ", salary=" + salary + '}';
    }

}
