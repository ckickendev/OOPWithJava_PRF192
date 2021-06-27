/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Semeter2_OOP_With_Jav_a.WS10.Generic;

/**
 *
 * @author 84337
 */
public class Car {
     private String name;
    private double price;
    private String Production;

    public Car() {
    }

    public Car(String name, double price, String Production) {
        this.name = name;
        this.price = price;
        this.Production = Production;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getProduction() {
        return Production;
    }

    public void setProduction(String Production) {
        this.Production = Production;
    }
    
    public Car Enter(){
        System.out.println("Enter name of car");
        String name=Validation.checkInputString();
        System.out.println("Enter price of car");
        double price= Validation.checkInputDouble();
        System.out.println("Enter production");
        String product=Validation.checkInputString();
        Car car= new Car(name, price, product);
        return car;
    }

    @Override
    public String toString() {
        return "Car{" + "name=" + name + ", price=" + price + ", Production=" + Production + '}';
    }
    

}
