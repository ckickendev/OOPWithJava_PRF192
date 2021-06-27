package Semeter2_OOP_With_Jav_a.WS2.Part1;

import java.util.Scanner;

public class question1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input the investment amount");
        double invest = scanner.nextDouble();
        System.out.println("Input the rate of interest");
        double rate = scanner.nextDouble();
        System.out.println("Input number of years");
        int year = scanner.nextInt();
        for(int i=0; i<year; i++){
            invest = invest*(1+rate/100);
        }
        System.out.println(invest);

    }
}
