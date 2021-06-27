package Semeter2_OOP_With_Jav_a.WS2.Part2;

import java.util.Scanner;

public class Question1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input the first number");double fn = scanner.nextDouble();
        System.out.println("Input the second number");double sn = scanner.nextDouble();
        System.out.println("Input the third number");double tn = scanner.nextDouble();
        double ave = (fn+sn+tn)/3;
        System.out.println("Average = " + ave);
    }
}
