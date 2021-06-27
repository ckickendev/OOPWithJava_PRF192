package Semeter2_OOP_With_Jav_a.WS10.Doctor10;/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author 84337
 */
public class Validation {
    private static final Scanner sc = new Scanner(System.in);

    public static String checkInputString() {
        while (true) {
            String result = sc.nextLine().trim();
            if (result.isEmpty()) {
                System.err.println("No empty input");
                System.out.print("Enter again: ");
            } else {
                return result;
            }
        }
    }

    public static int checkInputIntLimit(int min, int max) {
        while (true) {
            try {
                int choice = Integer.parseInt(checkInputString());
                if (choice < min || choice > max) {
                    throw new NumberFormatException();
                }
                return choice;
            } catch (NumberFormatException e) {
                System.out.println("Please enter number in range [" + min + "," + max + "]");
                System.out.print("Enter again: ");
            }
        }
    }

    public static boolean checkInputYN() {
        while (true) {
            String result = checkInputString();
            if (result.equalsIgnoreCase("Y")) {
                return true;
            }
            if (result.equalsIgnoreCase("N")) {
                return false;
            }
            System.out.println("Please enter y/Y or n/N");
            System.out.print("Enter again: ");
        }
    }

    public static double checkInputDouble() {
        while (true) {
            try {
                double result = Double.parseDouble(checkInputString());
                if (result < 0) {
                    throw new NumberFormatException();
                }
                return result;
            } catch (NumberFormatException e) {
                System.out.println("Please enter number >= 0");
                System.out.print("Enter again: ");
            }

        }
    }

    public static int checkInputInt() {
        while (true) {
            try {
                int result = Integer.parseInt(checkInputString());
                if (result <= 0) {
                    throw new NumberFormatException();
                }
                return result;
            } catch (NumberFormatException e) {
                System.out.println("Please enter number > 0");
                System.out.print("Enter again: ");
            }
        }
    }
    public static int checkIdExist(ArrayList<Doctor> ls, String code){
        for (int i = 0; i < ls.size(); i++) {
            if (code.equals(ls.get(i).getCode())){
              return i;  
            }
        }
        return -1;
    }
}
