package Semeter2_OOP_With_Jav_a.WS2.Part2;

import java.util.Scanner;

public class Question3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap a");double a = scanner.nextDouble();
        System.out.println("Nhap b");double b = scanner.nextDouble();
        System.out.println("Nhap c");double c = scanner.nextDouble();
        double denta = Math.sqrt(b*b - 4*a*c);
        if(denta<0){
            System.out.println("The equation has no real roots.");
        }
        else if( denta==0){
            double r1 = (-b + denta)/ 2*a;
            System.out.println("The root is: " + r1 );
        }
        else {
            double r1 = (-b + denta)/ 2*a;
            double r2 = (-b - denta)/ 2*a;
            System.out.println("Root 1: " + r1);
            System.out.println("Root 2: " + r2);
        }
    }
}
