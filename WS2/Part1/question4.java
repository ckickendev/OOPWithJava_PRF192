package Semeter2_OOP_With_Jav_a.WS2.Part1;

import java.util.Scanner;

public class question4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;
        do{
            System.out.println("Menuuuu:");
            System.out.println("----------***----------");
            System.out.println("1: Option 1");
            System.out.println("2: Option 2");
            System.out.println("3: Option 3");
            System.out.println("4: Exit");
            System.out.println("Please choose option: ");
            choice = scanner.nextInt();
            switch (choice){
                case 1: {
                    System.out.println("Option 1 chosen");
                    break;
                }
                case 2: {
                    System.out.println("Option 2 chosen");
                    break;
                }
                case 3: {
                    System.out.println("Option 3 chosen");
                    break;
                }
                case 4: {
                    break;
                }
                default:{
                    System.out.println("Invalid");
                }
            }
        }while(choice!=4);
    }
}
