package Semeter2_OOP_With_Jav_a.WS4.Part1.Atom;

import java.util.Scanner;

public class Validation {
    private static final Scanner in = new Scanner(System.in);

    public static String checkinputString(){
        while(true){
            String result = in.nextLine();
            if (!result.isEmpty()){
                return result;
            }
            else{
                System.out.println("Can not empty");
                System.out.println("Please enter again");
            }
        }
    }
    public static int checkinputInt(){
        while (true) {
            int result = in.nextInt();
            in.nextLine();
            if (result >= 0) {
                return result;
            } else {
                System.err.println("a positive value ");
                System.out.print("Please Enter again: ");
            }
        }
    }

    public static float checkInputFloat() {
        while (true) {
            float result = in.nextFloat();
            in.nextLine();
            if (result > 0){
                return result;
            }
            else {
                System.err.println("a positive value ");
            }
        }
    }

    public static boolean accept() {
        while (true) {
            String result = Validation.checkinputString();
            if (result.equalsIgnoreCase("Y")) {
                return true;
            } else if (result.equalsIgnoreCase("N")) {
                return false;
            }
            else {
                System.out.println("Please input y/Y or n/N.");
                System.out.print("Enter again: ");
            }
        }
    }
}
