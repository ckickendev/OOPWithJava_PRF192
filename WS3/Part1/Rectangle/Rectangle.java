package Semeter2_OOP_With_Jav_a.WS3.Part1.Rectangle;

import java.util.Scanner;

public class Rectangle {
    private static Scanner sc = new Scanner(System.in);
    private double width;
    private double height;

    public double caculateArea(){
        return width*height;
    }

    public double caculatePerimeter(){
        return (width+height)*2;
    }

    public void display(){
        System.out.println("Area: "+ caculateArea());
        System.out.println("Perimeter: "+ caculatePerimeter());
    }

    public void input(){
        System.out.println("Enter width: ");
        width = sc.nextDouble();
        System.out.println("Enter height: ");
        height = sc.nextDouble();
    }


}
