package Semeter2_OOP_With_Jav_a.WS5.Part1.WorkerManagement;

import java.text.DecimalFormat;

public class Worker extends Person {
    double bSalary;
    double rate;

    public Worker() {
    }

    public Worker(double bSalary, double rate) {
        this.bSalary = bSalary;
        this.rate = rate;
    }

    public Worker(String name, double bSalary, double rate) {
        super(name);
        this.bSalary = bSalary;
        this.rate = rate;
    }

    public double getbSalary() {
        return bSalary;
    }

    public void setbSalary(double bSalary) {
        this.bSalary = bSalary;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public void display(){
        System.out.println("-------------------------------------");
        System.out.println("Name = " + name);
        DecimalFormat df = new DecimalFormat("#.000");
        System.out.println("Salary = " + df.format(getSalary()));
    }

    public double getSalary(){
        return bSalary * rate;
    }

    public Worker input(){
        System.out.print("Enter name: ");
        String name = Validation.checkString();
        System.out.print("Enter Salary: ");
        Double salary = Validation.checkDouble();
        System.out.print("Enter rate: ");
        Double rate = Validation.checkDouble();
        Worker worker = new Worker(name, salary, rate);
        return worker;
    }
}
