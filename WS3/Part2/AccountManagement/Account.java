package Semeter2_OOP_With_Jav_a.WS3.Part2.AccountManagement;

import java.text.DecimalFormat;

public class Account {
    private int id;
    private Customer customer;
    private double balance =0;

    public Account() {
    }

    public Account(int id, Customer customer) {
        this.id = id;
        this.customer = customer;
    }

    public Account(int id, Customer customer, double balance) {
        this.id = id;
        this.customer = customer;
        this.balance = balance;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public int getId() {
        return id;
    }

    public Customer getCustomer() {
        return customer;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        DecimalFormat f = new DecimalFormat("##.00");
        return "Account{" +
                "id=" + id +
                ", customer: Name: " + customer.getName()+" Id : "+customer.getID()+" Gender: "+customer.getGender()+
                ", balance= " + f.format(balance) +
                '}';
    }

    public String getCustomerName(){
        return customer.getName();
    }

    public double deposit(double amount){
        balance += amount;
        return balance;
    }

    public double withdraw(double amount){
        if(balance>=amount){
            balance -= amount;
        }
        else{
            System.out.println("Not enough money");
        }

        return balance;
    }
}
