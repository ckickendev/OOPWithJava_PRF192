package Semeter2_OOP_With_Jav_a.WS5.Part2.BankManagement;

public interface Employee {
    public int getId();

    public String getName();

    public double getSalary();

    public void display();

    public void add(Employee e);

    public void remove(Employee e);

    public Employee getChild(int id);
}
