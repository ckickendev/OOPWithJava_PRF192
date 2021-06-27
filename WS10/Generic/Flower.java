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
public class Flower {
   private String name;
    private double price;
    private String color;

   
    public Flower(String name, double price, String color) {
        this.name = name;
        this.price = price;
        this.color = color;
    }

    public Flower() {
        this.name = "unset";
        this.price = -1;
        this.color = "unset";
    }
    
   
    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public String getColor() {
        return color;
    }
    
    
   
   
    public void setColor(String color) {
        this.color = color;
    }
    
    public void setName(String name){
        this.name = name;
                
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public generic.Flower Enter(){
        System.out.println("Enter name of flower");
        String name=Validation.checkInputString();
        System.out.println("Enter price of flower");
        double price= Validation.checkInputDouble();
        System.out.println("Enter color");
        String color=Validation.checkInputString();
        generic.Flower fl= new generic.Flower(name, price, color);
        return fl;
    }
    @Override
    public String toString() {
        return "Flower{" + "name=" + name + ", price=" + price + ", color=" + color + '}';
    }



}
