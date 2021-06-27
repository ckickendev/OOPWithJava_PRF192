package Semeter2_OOP_With_Jav_a.BaiTapTrenLop.Ngay9.Bai1;

import java.util.Scanner;

public class Controler {
    Scanner scanner = new Scanner(System.in);
    public double add(){
        System.out.print("Please input 1st number: ");double num1 = Double.parseDouble(scanner.nextLine());
        System.out.print("Please input 2st number: ");double num2 = Double.parseDouble(scanner.nextLine());
        return num1 + num2;
    }

    public double sub(){
        System.out.print("Please input 1st number: ");double num1 = Double.parseDouble(scanner.nextLine());
        System.out.print("Please input 2st number: ");double num2 = Double.parseDouble(scanner.nextLine());
        return num1 - num2;
    }

    public double multi(){
        System.out.print("Please input 1st number: ");double num1 = Double.parseDouble(scanner.nextLine());
        System.out.print("Please input 2st number: ");double num2 = Double.parseDouble(scanner.nextLine());
        return num1*num2;
    }

    public double devide(){
        while (true){
            System.out.print("Please input 1st number: ");int num1 = Integer.parseInt(scanner.nextLine());
            System.out.print("Please input 2st number: ");int num2 = Integer.parseInt(scanner.nextLine());
            try{
                return num1/num2;
            }catch (ArithmeticException e){
                System.err.println("Cannot divide because number 2 is zero !");
                System.err.print("Please check again : ");
            }
        }
    }
}
